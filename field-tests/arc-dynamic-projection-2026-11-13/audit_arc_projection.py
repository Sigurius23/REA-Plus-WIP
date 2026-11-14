"""Supplemental retained-text audit of one straight-line Arc block, not REA+ output.

The source runtime call's type, its selected case, alias freedom, full CFG and
the call prefix are assumptions for this narrowly scoped byte check.
"""
import json
from pathlib import Path
import re

root = Path(__file__).resolve().parent
record_path = root.parent / "arc-persistence-routes-2026-11-08/native/boost-reducer-instructions.evidence.json"
record = json.loads(record_path.read_text())
lines = [line for line in record["normalized_result"]["instructions"]
         if 0x1012a5b14 <= int(line.split(":")[0], 16) < 0x1012a5ba8]


def audit(instructions):
    registers = {"x19": ("fixed", 0), "x25": ("outer", 0)}
    vectors = {}
    memory = {}

    def ptr(text):
        match = re.fullmatch(r"\[(x\d+)(?:, #(0x[0-9a-f]+|\d+))?\]", text)
        if not match or not registers.get(match[1]):
            raise ValueError("unproved pointer: " + text)
        kind, offset = registers[match[1]]
        return kind, offset + int(match[2] or "0", 0)

    try:
        for line in instructions:
            text = line.split(": ", 1)[-1]
            opcode, args = text.split(" ", 1)
            address = re.fullmatch(r"(x\d+), (x\d+), #(0x[0-9a-f]+|\d+)", args)
            if opcode in ["add", "sub"] and address:
                destination, source, immediate = address.groups()
                source = registers.get(source)
                registers[destination] = ((source[0], source[1] + int(immediate, 0) *
                                           (1 if opcode == "add" else -1)) if source else None)
                continue
            operands = re.fullmatch(r"(q\d+)(?:, (q\d+))?, (\[.*\])", args)
            if not operands or opcode not in ["ldr", "ldur", "ldp", "str", "stur", "stp"]:
                raise ValueError("unsupported instruction: " + text)
            first, second, address = operands.groups()
            pair = opcode in ["ldp", "stp"]
            if pair != bool(second):
                raise ValueError("invalid pair width")
            kind, offset = ptr(address)
            for index, vector in enumerate([first, second] if pair else [first]):
                start = offset + 16 * index
                if opcode.startswith("ld"):
                    if kind != "outer" or start < 0 or start + 16 > 156:
                        raise ValueError("unproved source bytes")
                    vectors[vector] = list(range(start, start + 16))
                else:
                    if kind != "fixed" or start < 0 or start + 16 > 0x9e0:
                        raise ValueError("write outside assumed private fixed interval")
                    value = vectors.get(vector, [None] * 16)
                    memory.update({start + byte: origin for byte, origin in enumerate(value)})
        origins = [memory.get(0x440 + index) for index in range(156)]
        bad = [index for index, origin in enumerate(origins) if index != origin]
        return {"accepted": not bad, "copied_byte_count": 156 - len(bad),
                "wrong_or_missing_bytes": bad}
    except ValueError as error:
        return {"accepted": False, "reason": str(error)}


positive = audit(lines)
assert positive["accepted"]
controls = {
    "wrong_tail_source": [line.replace("ldur q0, [x25, #0x8c]", "ldur q0, [x25, #0x88]")
                          if line.startswith("0x1012a5b30:") else line for line in lines],
    "wrong_tail_destination": [line.replace("[x26, #0x8c]", "[x26, #0x88]") for line in lines],
    "missing_tail": [line for line in lines if not line.startswith("0x1012a5b34:")],
}
for label, instruction, before in [
    ("unknown_call", "bl 0x1234", "0x1012a5b38:"),
    ("vector_clobber", "mov v0.16b, v17.16b", "0x1012a5b34:"),
    ("unknown_branch", "br x15", "0x1012a5b38:"),
    ("pointer_name_reuse", "ldr q0, [x25]", "0x1012a5b98:"),
    ("overlapping_wrong_bytes", "str q17, [x19, #0x4c8]", "0x1012a5ba0:"),
]:
    index = next(index for index, line in enumerate(lines) if line.startswith(before))
    controls[label] = lines[:index] + ["supplemental: " + instruction] + lines[index:]
results = {label: audit(lines) for label, lines in controls.items()}
assert all(not result["accepted"] for result in results.values())
output = {
    "classification": "supplemental-offline-text-audit-not-rea-evidence",
    "source_evidence_id": record["evidence_id"],
    "source_sha256": record["subject"]["digest"]["sha256"],
    "range": {"start": "0x1012a5b14", "end_exclusive": "0x1012a5ba8"},
    "assumptions": ["X19 is a live private fixed-frame base with size 0x9e0",
                    "X25 initially denotes an unchanged 156-byte outer payload snapshot",
                    "This block is entered only after exact outer tag call selected reflected case 1",
                    "No concurrent writes, pointer escapes or foreign control-flow entry"],
    "positive": positive, "negative_controls": results,
    "getter_reads": [[0, 4], [152, 156]],
    "limitations": ["Does not prove the assumptions, descriptor identity, metadata initialization, or complete CFG.",
                    "Does not analyze helpers, calls, dynamic allocations, or target execution.",
                    "No REA+ fields are modified and no provider recovery is claimed."],
}
(root / "arc-projection-byte-audit.json").write_text(json.dumps(output, indent=2) + "\n")
print(json.dumps({"positive": positive, "negative_controls_rejected": len(results)}))
