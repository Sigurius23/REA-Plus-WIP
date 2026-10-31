"""Bounded, explicit-memory function experiments. Never loads a target as a process."""

import hashlib
import importlib.metadata
import json
import math
import os
from pathlib import Path
import sys
import time
import ctypes

PROFILE = "unicorn@2.1.2;capstone@5.0.6;rea-function-v1"
MASK64 = (1 << 64) - 1
OUTPUT_BYTES = 64 * 1024 * 1024


class BoundaryStop(Exception):
    """A modeled execution boundary, retained as an ordinary observation."""


def identity(path):
    path = str(Path(path).resolve(strict=True))
    before = os.stat(path)
    digest = hashlib.sha256()
    with open(path, "rb") as source:
        for block in iter(lambda: source.read(65536), b""):
            digest.update(block)
    after = os.stat(path)
    if (before.st_dev, before.st_ino, before.st_size, before.st_mtime_ns, before.st_ctime_ns) != (
        after.st_dev, after.st_ino, after.st_size, after.st_mtime_ns, after.st_ctime_ns
    ):
        raise RuntimeError("Emulation dependency changed while identifying it")
    return {"path": path, "sha256": digest.hexdigest()}


def process_image():
    if sys.platform.startswith("linux"):
        return os.readlink("/proc/self/exe")
    # Framework Python's launcher can exec a different Mach-O. Identify the
    # live image, rather than treating sys.executable as the process image.
    function = ctypes.CDLL(None)._NSGetExecutablePath
    function.argtypes = [ctypes.c_void_p, ctypes.POINTER(ctypes.c_uint32)]
    function.restype = ctypes.c_int
    size = ctypes.c_uint32(4096)
    buffer = ctypes.create_string_buffer(size.value)
    if function(buffer, ctypes.byref(size)) != 0:
        if size.value > 1024 * 1024:
            raise RuntimeError("Live Python image path exceeds identity budget")
        buffer = ctypes.create_string_buffer(size.value)
        if function(buffer, ctypes.byref(size)) != 0:
            raise RuntimeError("Live Python image path could not be identified")
    return os.fsdecode(buffer.value)


def dependencies():
    for name, version in {"unicorn": "2.1.2", "capstone": "5.0.6"}.items():
        if importlib.metadata.version(name) != version:
            raise ImportError(f"Requires caller-supplied {name}=={version}")
    import unicorn
    import capstone
    import unicorn.unicorn_py3.unicorn as binding
    # uc_version/cs_version expose major/minor ABI. Library hashes below bind the
    # actual loaded core; distribution version alone is not core attestation.
    if unicorn.uc_version()[:2] != (2, 1) or capstone.cs_version()[:2] != (5, 0):
        raise ImportError("Unexpected Unicorn/Capstone native ABI")
    native = getattr(binding, "uclib", None)
    if native is None:
        native = binding._uc
    engine = {
        "profile": PROFILE,
        "python": {"selected_path": sys.executable, **identity(sys.executable)},
        "process_image": identity(process_image()),
        "libraries": [
            {"name": "unicorn", **identity(native._name)},
            {"name": "capstone", **identity(capstone._cs._name)},
        ],
    }
    return unicorn, capstone, engine


class Experiment:
    def __init__(self, request, unicorn, capstone, engine):
        self.request = request
        self.input = request["input"]
        self.u = unicorn
        self.cs = capstone
        self.engine = engine
        self.arm = self.input["architecture"] == "arm64"
        self.uc = unicorn.Uc(unicorn.UC_ARCH_ARM64 if self.arm else unicorn.UC_ARCH_X86,
                             unicorn.UC_MODE_ARM if self.arm else unicorn.UC_MODE_64)
        self.dis = capstone.Cs(capstone.CS_ARCH_ARM64 if self.arm else capstone.CS_ARCH_X86,
                              capstone.CS_MODE_ARM if self.arm else capstone.CS_MODE_64)
        self.dis.detail = True
        self.unmodeled_groups = ()
        self.tls_segments = ()
        self.address_only_operations = ()
        if not self.arm:
            from capstone import x86_const as x86
            self.unmodeled_groups = (x86.X86_GRP_FPU, x86.X86_GRP_MMX,
                                     x86.X86_GRP_AVX, x86.X86_GRP_AVX2, x86.X86_GRP_AVX512)
            self.tls_segments = (x86.X86_REG_FS, x86.X86_REG_GS)
            self.address_only_operations = (x86.X86_INS_NOP, x86.X86_INS_LEA)
        self.regs = self.registers()
        self.pc_name = "pc" if self.arm else "rip"
        self.reg_names = list(self.regs)
        self.regs_before = None
        self.regions = []
        self.code_records = []
        self.memory_records = []
        self.coverage = {}
        self.started = 0
        self.stop = None
        self.current = int(self.input["entry_address"], 16)
        self.call_stack = []
        self.decoded = {}
        self.prepare_memory()
        for name, register in self.regs.items():
            self.uc.reg_write(register, 2 if name == "rflags" else 0)
        for name, value in self.input["initial_registers"].items():
            self.uc.reg_write(self.regs[name], int(value, 16))
        self.uc.reg_write(self.regs[self.pc_name], self.current)
        self.regs_before = self.read_registers()
        self.before = [bytes(self.uc.mem_read(int(r["address"], 16), r["size"]))
                       for r in self.input["observe_memory"]]

    def registers(self):
        if self.arm:
            from unicorn import arm64_const as c
            names = [f"x{i}" for i in range(31)] + ["sp", "pc", "nzcv", "fpcr", "fpsr"]
            names += [f"q{i}" for i in range(32)]
            return {name: getattr(c, "UC_ARM64_REG_" + name.upper()) for name in names}
        from unicorn import x86_const as c
        names = ["rax", "rbx", "rcx", "rdx", "rsi", "rdi", "rbp", "rsp"]
        names += [f"r{i}" for i in range(8, 16)] + ["rip", "rflags", "mxcsr"]
        names += [f"xmm{i}" for i in range(16)]
        return {name: getattr(c, "UC_X86_REG_" + name.upper()) for name in names}

    def read_registers(self):
        return {name: hex(self.uc.reg_read(register)) for name, register in self.regs.items()}

    def prepare_memory(self):
        code_bytes = []
        with open(self.request["snapshot_path"], "rb") as source:
            for region in self.input["code_regions"]:
                source.seek(region["file_offset"])
                data = source.read(region["size"])
                if len(data) != region["size"]:
                    raise ValueError("Code range exceeds the selected snapshot")
                code_bytes.append((int(region["address"], 16), data, "rx"))
                self.code_records.append({**region, "sha256": hashlib.sha256(data).hexdigest()})
        for region in self.input["memory_regions"]:
            data = bytes.fromhex(region["bytes_hex"])
            code_bytes.append((int(region["address"], 16), data, region["permissions"]))
            self.memory_records.append({"address": region["address"], "size": len(data),
                                        "permissions": region["permissions"],
                                        "initial_sha256": hashlib.sha256(data).hexdigest()})
        self.regions = sorted((address, address + len(data), perms) for address, data, perms in code_bytes)
        # Unicorn maps pages. Logical byte-range and permission hooks below reject
        # every access to their padding; padding is not an input to the experiment.
        pages = {}
        for address, data, permissions in code_bytes:
            protection = self.u.UC_PROT_READ
            if "w" in permissions:
                protection |= self.u.UC_PROT_WRITE
            if "x" in permissions:
                protection |= self.u.UC_PROT_EXEC
            for page in range(address & ~4095, (address + len(data) + 4095) & ~4095, 4096):
                pages[page] = pages.get(page, 0) | protection
        for page, protection in sorted(pages.items()):
            self.uc.mem_map(page, 4096, protection)
        for address, data, _ in code_bytes:
            self.uc.mem_write(address, data)

    def allowed(self, address, size, access):
        cursor = address
        end = address + size
        if size <= 0 or address < 0 or end > 1 << 64:
            return False
        for start, stop, permissions in self.regions:
            if start <= cursor < stop:
                if access not in permissions:
                    return False
                cursor = min(stop, end)
            if cursor == end:
                return True
        return False

    def halt(self, reason, detail, *, phase="before_instruction", address=None,
             target=None, access=None, size=None):
        if self.stop is None:
            self.stop = {"reason": reason, "address": hex(self.current if address is None else address),
                         "phase": phase, "target": None if target is None else hex(target & MASK64),
                         "access": access, "size": size, "detail": detail}
        self.uc.emu_stop()

    def read_memory(self, address, size):
        if not self.allowed(address, size, "r"):
            self.halt("missing_memory", "Call/return operand requires explicit readable memory.",
                      target=address, access="read", size=size)
            raise BoundaryStop()
        return bytes(self.uc.mem_read(address, size))

    def call_target(self, instruction):
        operand = instruction.operands[0]
        if operand.type == self.cs.CS_OP_IMM:
            return operand.imm & MASK64
        if operand.type == self.cs.CS_OP_REG:
            name = instruction.reg_name(operand.reg)
            if self.arm and name in ("xzr", "wzr"):
                return 0
            if self.arm:
                name = {"fp": "x29", "lr": "x30"}.get(name, name)
            return self.uc.reg_read(self.regs[name]) & MASK64
        if not self.arm and operand.type == self.cs.CS_OP_MEM:
            mem = operand.mem
            if mem.segment in self.tls_segments:
                self.halt("unsupported_instruction", "Segment-relative indirect calls require unsupported segment/TLS state.")
                raise BoundaryStop()
            def register_value(register):
                if not register:
                    return 0
                name = instruction.reg_name(register)
                return instruction.address + instruction.size if name == "rip" else self.uc.reg_read(self.regs[name])
            address = (register_value(mem.base) + register_value(mem.index) * mem.scale + mem.disp) & MASK64
            return int.from_bytes(self.read_memory(address, 8), "little")
        self.halt("unsupported_instruction", "Unsupported call operand.")
        raise BoundaryStop()

    def unsafe_instruction(self, instruction):
        mnemonic = instruction.mnemonic.split()[-1]
        forbidden = {"syscall", "sysenter", "sysexit", "sysret", "int", "int1", "int3", "into", "iret", "iretq", "lcall", "ljmp", "retf", "retfq",
                     "hlt", "in", "out", "insb", "insd", "insw", "outsb", "outsd", "outsw", "rdtsc", "rdtscp",
                     "rdrand", "rdseed", "cpuid", "xgetbv", "xsetbv", "rdpkru", "wrpkru", "svc", "hvc", "smc", "brk", "hlt", "mrs", "msr", "eret", "drps", "wfi", "wfe"}
        # Long-mode CS/DS/ES/SS overrides do not supply a segment base, and NOP
        # / LEA memory-shaped operands do not read memory or apply TLS bases.
        segment_relative = (not self.arm and instruction.id not in self.address_only_operations
                            and any(operand.type == self.cs.CS_OP_MEM and operand.mem.segment in self.tls_segments for operand in instruction.operands))
        return (mnemonic in forbidden or segment_relative or any(instruction.group(group) for group in self.unmodeled_groups)
                or mnemonic.startswith(("pac", "aut", "xpac", "braa", "brab", "blraa", "blrab", "retaa", "retab"))
                or instruction.group(self.cs.CS_GRP_PRIVILEGE) or instruction.group(self.cs.CS_GRP_INT)
                or instruction.group(self.cs.CS_GRP_IRET))

    def on_code(self, uc, address, size, _):
        self.current = address
        try:
            if address in self.stop_addresses:
                self.halt("caller_stop", "Reached an explicit caller stop address.")
                return
            if not self.allowed(address, 4 if self.arm else 1, "x"):
                self.halt("control_flow_escape", "Instruction fetch leaves explicit code ranges.", access="fetch", size=size)
                return
            if time.monotonic_ns() >= self.deadline:
                self.halt("time_limit", "Caller-selected emulation time budget exhausted.")
                return
            if self.started >= self.input["max_instructions"]:
                self.halt("instruction_limit", "Caller-selected instruction budget exhausted.")
                return
            instruction = self.decoded.get(address)
            if instruction is None:
                # Unicorn can report a sentinel size for invalid x86 opcodes.
                # Decode only actual admitted bytes before trusting that size.
                available = 0
                for candidate in range(1, (4 if self.arm else 15) + 1):
                    if not self.allowed(address, candidate, "x"):
                        break
                    available = candidate
                raw = bytes(uc.mem_read(address, available))
                instruction = next(self.dis.disasm(raw, address, count=1), None)
                if instruction is None or instruction.size != size:
                    self.halt("unsupported_instruction", "Instruction cannot be decoded consistently by the pinned engines.")
                    return
                self.decoded[address] = instruction
            if self.unsafe_instruction(instruction):
                self.halt("unsupported_instruction", "Instruction requires unsupported system, segment/TLS, x87/MMX/AVX, time/random or pointer-authentication context: " + instruction.mnemonic)
                return
            if instruction.group(self.cs.CS_GRP_RET):
                if not self.call_stack:
                    self.halt("function_return", "Reached the outer function's return instruction; caller transfer is not executed.")
                    return
                target = (self.uc.reg_read(self.regs[instruction.reg_name(instruction.operands[0].reg) if instruction.operands else "x30"])
                          if self.arm else int.from_bytes(self.read_memory(self.uc.reg_read(self.regs["rsp"]), 8), "little"))
                if target != self.call_stack[-1]:
                    self.halt("unexpected_return", "Return does not match the admitted internal call stack.", target=target)
                    return
                self.call_stack.pop()
            if instruction.group(self.cs.CS_GRP_CALL):
                target = self.call_target(instruction)
                if not self.allowed(target, 4 if self.arm else 1, "x"):
                    self.halt("external_call", "Call target is outside caller-admitted code; no callee or OS stub was invoked.", target=target)
                    return
                self.call_stack.append(address + size)
            if address not in self.coverage:
                if len(self.coverage) >= self.input["max_coverage_entries"]:
                    self.halt("coverage_limit", "Caller-selected unique instruction coverage budget exhausted.")
                    return
                self.coverage[address] = {"address": hex(address), "bytes_hex": bytes(instruction.bytes).hex(), "visits": 0}
            self.coverage[address]["visits"] += 1
            self.started += 1
        except BoundaryStop:
            return
        except (KeyError, ValueError) as error:
            self.halt("unsupported_instruction", "Unmodeled instruction operand: " + str(error))

    def on_memory(self, uc, kind, address, size, value, _):
        access = "write" if kind in (self.u.UC_MEM_WRITE, self.u.UC_MEM_WRITE_UNMAPPED, self.u.UC_MEM_WRITE_PROT) else "fetch" if kind in (self.u.UC_MEM_FETCH_UNMAPPED, self.u.UC_MEM_FETCH_PROT) else "read"
        if not self.allowed(address, size, "x" if access == "fetch" else "w" if access == "write" else "r"):
            exists = self.allowed(address, size, "r")
            self.halt("memory_permission" if exists else "missing_memory", "Access requires explicit mapped bytes and permission; pages are not implicitly initialized inputs.",
                      phase="during_instruction", target=address, access=access, size=size)
        return False  # Invalid accesses are never repaired or demand-mapped.

    def run(self):
        self.stop_addresses = {int(address, 16) for address in self.input["stop_addresses"]}
        self.deadline = time.monotonic_ns() + self.input["timeout_ms"] * 1_000_000
        self.uc.hook_add(self.u.UC_HOOK_CODE, self.on_code)
        # The pinned Python API uses different callback signatures for valid and
        # invalid access hooks; combining those families is rejected.
        self.uc.hook_add(self.u.UC_HOOK_MEM_READ | self.u.UC_HOOK_MEM_WRITE, self.on_memory)
        self.uc.hook_add(self.u.UC_HOOK_MEM_INVALID, self.on_memory)
        try:
            # Address zero is a valid explicit entry, so it cannot also be the
            # native stop sentinel. The top reserved value cannot hold code.
            self.uc.emu_start(self.current, MASK64 - 3 if self.arm else MASK64,
                              timeout=self.input["timeout_ms"] * 1000)
        except self.u.UcError as error:
            if self.stop is None:
                self.halt("unsupported_instruction" if error.errno in (self.u.UC_ERR_INSN_INVALID, self.u.UC_ERR_EXCEPTION) else "engine_error",
                          str(error), phase="during_instruction")
        if self.stop is None:
            self.halt("time_limit" if self.uc.query(self.u.UC_QUERY_TIMEOUT) else "control_flow_escape",
                      "Native emulator timeout elapsed." if self.uc.query(self.u.UC_QUERY_TIMEOUT) else "Emulator stopped without reaching an admitted return.",
                      address=self.uc.reg_read(self.regs[self.pc_name]))
        observations = []
        for region, before in zip(self.input["observe_memory"], self.before):
            after = bytes(self.uc.mem_read(int(region["address"], 16), region["size"]))
            observations.append({**region, "before_hex": before.hex(), "after_hex": after.hex(),
                                 "changed_bytes": sum(left != right for left, right in zip(before, after))})
        # Dependencies must still be the identified files after emulation.
        for library in self.engine["libraries"]:
            if identity(library["path"])["sha256"] != library["sha256"]:
                raise RuntimeError("Emulation library changed during the experiment")
        if identity(self.engine["process_image"]["path"])["sha256"] != self.engine["process_image"]["sha256"]:
            raise RuntimeError("Live Python image changed during the experiment")
        return {
            "artifact": self.request["artifact"], "architecture": self.input["architecture"],
            "entry_address": self.input["entry_address"], "engine": self.engine,
            "code_regions": self.code_records, "memory_regions": self.memory_records,
            "registers_before": self.regs_before, "registers_after": self.read_registers(),
            "memory_observations": observations,
            "coverage": {"instructions_started": self.started, "unique_instructions": len(self.coverage),
                         "instructions": list(self.coverage.values()),
                         "meaning": "Instruction entry counts; a faulting instruction may have partial effects. Boundary-stop instructions are excluded."},
            "stop": self.stop,
            "assumptions": [
                "Architecture, entry and raw linked-address code mappings are caller assertions; no loader, relocations, imports or runtime memory were reconstructed.",
                "Unspecified supported registers are explicitly zero-initialized (x86 rflags starts at 2); registers_before records effective engine values. No ABI arguments, stack, return address, objects or TLS are synthesized.",
                "Only explicit initialized byte ranges may be accessed. Read/execute code is immutable; data mappings are not executable. Mapping page padding is not admitted memory.",
                "Unicorn's default CPU model and emulated floating-point behavior are conditional model assumptions. The outer return instruction is a boundary and is not executed; admitted nested calls/returns execute inside the model.",
            ],
            "limitations": [
                "These are derived emulator results for one concrete state, not observed app behavior, source-level proof, full path coverage or hardware equivalence.",
                "No external calls, OS APIs, syscalls, Swift/Objective-C runtime, pointer authentication, TLS, host files or network operations are provided to target instructions.",
                "Stopped/faulting instructions may have partial register/memory effects; reported memory changes cover selected observations only. Other CPU state is outside the supported register interface.",
            ],
        }


def main():
    request_path = sys.argv[1]
    with open(request_path, encoding="utf-8") as source:
        request = json.load(source)
    try:
        # Kernel budgets backstop hooks and owned-process deadlines. They do not
        # promise an RSS cap or make a native emulator a security sandbox.
        import resource
        def cap_limit(kind, maximum):
            inherited = resource.getrlimit(kind)
            selected = tuple(maximum if value == resource.RLIM_INFINITY else min(value, maximum) for value in inherited)
            resource.setrlimit(kind, selected)
        cap_limit(resource.RLIMIT_FSIZE, OUTPUT_BYTES)
        cpu = math.ceil(request["input"]["timeout_ms"] / 1000) + 10
        cap_limit(resource.RLIMIT_CPU, cpu)
        if sys.platform.startswith("linux"):
            cap_limit(resource.RLIMIT_AS, 3 * 1024**3)
        unicorn, capstone, engine = dependencies()
        engine["python"]["selected_path"] = request["python_path"]
        value = Experiment(request, unicorn, capstone, engine).run()
        reply = {"ok": True, "value": value}
    except (ImportError, importlib.metadata.PackageNotFoundError) as error:
        reply = {"ok": False, "reason": "unavailable", "message": str(error)}
    except (ValueError, KeyError) as error:
        reply = {"ok": False, "reason": "input", "message": str(error)}
    except MemoryError:
        reply = {"ok": False, "reason": "resource", "message": "Native/Python emulation memory budget exhausted"}
    except Exception as error:
        reply = {"ok": False, "reason": "engine", "message": type(error).__name__ + ": " + str(error)}
    encoded = json.dumps(reply, separators=(",", ":"), ensure_ascii=True).encode("utf-8")
    if len(encoded) > OUTPUT_BYTES:
        encoded = b'{"ok":false,"reason":"resource","message":"Complete emulation reply exceeds output budget"}'
    with open(request["reply_path"], "xb") as output:
        output.write(encoded)


if __name__ == "__main__":
    main()
