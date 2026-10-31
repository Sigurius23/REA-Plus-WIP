# Concrete function emulation

`emulate_function` / `rea emulate-function` answers what selected machine code
produces for one explicit initial state. It does not require `open_binary`, an
analysis database, a running target or application data. CLI and MCP use the same
service, contract and Evidence identity.

The initial engine profile is caller-supplied Python with **Unicorn 2.1.2** and
**Capstone 5.0.6**, selected by an absolute `REA_UNICORN_PYTHON`. REA+ does not
install or upgrade Python or dependencies. The process/resource profile supports
macOS and Linux; the real compiler-fixture lane currently verifies macOS arm64
hosts with both arm64 and x86-64 target instructions. Windows and Linux-host
real-engine coverage require separate verification.

```sh
export REA_UNICORN_PYTHON=/absolute/existing/environment/bin/python
rea emulate-function ./experiment.json --json
```

For MCP, pass the document directly as `emulate_function` arguments:

```json
{
  "path": "/artifacts/program",
  "architecture": "arm64",
  "entry_address": "0x1000",
  "code_regions": [{ "address": "0x1000", "file_offset": 4096, "size": 16 }],
  "initial_registers": { "x0": "0x2", "x1": "0x3" },
  "memory_regions": [],
  "observe_memory": [],
  "max_instructions": 10000,
  "timeout_ms": 1000
}
```

The example's addresses and range are placeholders: select the function and
original file offsets with static tools. `code_regions` maps precisely those
original file bytes read/execute at caller-selected addresses. Multiple ranges
can include intentionally admitted helpers. A direct or resolved indirect call
outside those ranges stops as `external_call` before its effects; merely mapping
an executable page does not admit its padding. Branching out of code, including
tail calls, stops at the code/memory boundary; no import-name resolution is
claimed. Including an entire executable segment also admits its internal stubs
and helpers, so a subsequent runtime dependency can stop at missing memory
instead of the initial call.

No loader, relocation, pointer rebase, import, argument convention, stack,
object, TLS, Swift/Objective-C runtime or external-call stub is synthesized.
For file-backed constants, supply the selected original bytes explicitly as a
read-only `memory_regions` entry; its content remains a caller assertion rather
than inferred loader state. A memory region has `address`, `bytes_hex` (complete
lowercase even-length hex) and `permissions` (`r` or `rw`). Initialize every byte
needed, including an explicitly selected stack when the function uses one.
Code/data mappings cannot overlap. Writable and non-writable ranges cannot
share a 4096-byte emulation page because native write protection is page-based.
Read/fetch range guards still reject access to padding and non-executable data.

Addresses and register bit patterns use canonical lowercase `0x` strings without
leading zeroes. arm64 accepts `x0`–`x30`, `sp`, `nzcv`, `fpcr`, `fpsr` and
`q0`–`q31`. x86-64 accepts its 16 general registers, `rflags`, `mxcsr` and
`xmm0`–`xmm15`. SIMD values are 128-bit patterns, not JSON floating-point values.
Aliases such as `w0`, `lr` and `eax` are rejected as initial-register names to
avoid conflicting writes. `entry_address` owns `pc`/`rip`; these cannot also be
set in `initial_registers`. Other supported registers are explicitly initialized
to zero (x86 `rflags` starts at 2). `registers_before` records the effective
engine values, including any architectural normalization of requested bits.
The native default CPU model and other CPU state remain model assumptions.
Segment/TLS operations and x86 x87, MMX and AVX state are outside this first
register interface and stop explicitly instead of receiving fabricated inputs.

The outer return instruction is a boundary: `function_return` stops **before**
its execution and transfer back to a caller. Return registers and the state
before that transfer are available, but x86's return-address pop is not
performed. Nested calls to admitted code execute normally; their returns must
match the emulated call stack. An explicit `stop_addresses` entry also stops
before execution. There is no source-level ABI return-type interpretation.

## Results, limits and ownership

Results retain original artifact SHA-256/size/path, each admitted file range's
digest, the selected Python launcher, live interpreter image and loaded native-library hashes, effective initial
and final registers, selected before/after memory bytes and changed-byte counts,
and distinct instruction addresses/bytes/visit counts. Coverage counts
**instruction entries**, not completed instructions or all possible paths.
Boundary-stop instructions are excluded; the final faulting instruction may
have partial effects. Memory differences cover only `observe_memory` ranges.

Stops distinguish outer return, caller stop, external call, unexpected return,
code escape, missing/protected memory, unsupported instruction, native engine
error, and instruction/time/coverage exhaustion. System calls, privileged
instructions, time/random queries and pointer authentication are unsupported
runtime boundaries. Stopped experiments retain their observations as successful
conditional Evidence; invalid input, missing engines, malformed engine output,
cancellation and failed process ownership are typed errors. No missing memory
is demand-mapped, and no target syscall or imported call is forwarded to the host.

Default budgets are 10,000 started instructions, 10,000 distinct instruction
entries and 1,000 ms. Caller-selected maxima are 1,000,000 instructions, 100,000
distinct entries and 30,000 ms. Static resource bounds are 256 MiB for the stable
source file snapshot, 16 MiB of admitted code/data, 1 MiB of selected observed
memory, 256 regions of each input kind and 64 MiB for a complete engine reply.
Page allocation, native translation state and parsing have additional overhead;
these bounds are not an RSS guarantee. Aggregate mapping bytes are checked
before allocating the page-permission index. Exhausting unique coverage stops
execution rather than silently dropping later entries.

The adapter admits one experiment at a time to bound artifact snapshots and
native engine state. A concurrent request receives a resource-capacity error;
it does not replace the active experiment. The owned process has an independent
deadline for initialization and shutdown beyond its emulation time budget,
bounded diagnostics and POSIX CPU/output-file backstops (plus a Linux address
space limit), preserving any tighter inherited soft/hard limits. Native
emulation is not a security sandbox. Cancellation and
provider shutdown stop/await owned work; failed cleanup retains ownership for
retry, and completed observations survive failed process or temporary-root cleanup.
Python can exec a macOS framework image, so launcher/image identity is recorded
separately. Cleanup authorization requires the unique per-run token, original
parent and process group rather than assuming that launcher command text stays
unchanged after exec.

Evidence has `confidence: "derived"` and `authority: "controlled-replay"`.
Inputs, effective initial state and assumptions identify a concrete model run;
they do not establish behavior of the installed application, missing runtime
dependencies, hardware equivalence, exhaustive paths or source-level proofs.
Large complete MCP results use the existing retained-Evidence export workflow.

## Verification

With the installed compiler and configured Python, run:

```sh
npm run verify:function-emulation -- --output-dir /absolute/new/receipt-directory
```

The source-built C/assembly fixtures are linked and read as inert artifacts,
never launched as host executables. An independent Mach-O symbol/file-range
oracle selects their bytes. Arithmetic, both branch results, selected memory
writes, floating-point bit patterns and admitted nested/indirect calls have
source-known results. Public CLI/MCP comparisons check exact Evidence identity;
the actual advertised schemas and canonical contracts are validated. Negative
fixtures cover runtime dependencies, memory boundaries/permissions and execution
limits. Original target hashes and owned-process cleanup are checked separately.

Engine references: [Unicorn 2.1.2 API](https://github.com/unicorn-engine/unicorn/blob/2.1.2/include/unicorn/unicorn.h)
and [Capstone 5.0.6](https://github.com/capstone-engine/capstone/tree/5.0.6).
