import { createHash } from "node:crypto";
import { setImmediate } from "node:timers/promises";
import type {
  InspectNativeTableDispatchInput,
  NativeTableDispatch,
} from "../../domain/native/nativeTableDispatch.js";
import { ArtifactReaderFailure } from "../../artifacts/ArtifactReader.js";
import {
  parseMachoLayout,
  selectMachoSlice,
  type MachoLayout,
} from "../AppleMachoSelection.js";
import {
  decodeDispatchInstruction,
  type DispatchValue,
} from "./Arm64DispatchDecoder.js";
import {
  checkDispatchCancellation,
  dispatchHex,
  dispatchOffset,
  dispatchSource,
} from "./DispatchSource.js";
import { inspectDispatchInvocation } from "./NativeTableDispatchInvocation.js";

/** No disassembler database, runtime state or enum declaration participates. */
export const parseNativeTableDispatch = async (
  bytes: Buffer,
  artifact: NativeTableDispatch["artifact"],
  input: InspectNativeTableDispatchInput,
  signal?: AbortSignal,
): Promise<NativeTableDispatch> => {
  checkDispatchCancellation(signal);
  let layout: MachoLayout;
  try {
    const { slice, sliceEnd } = selectMachoSlice(bytes, "arm64");
    if (
      slice + 32 > sliceEnd ||
      bytes.readUInt32LE(slice) !== 0xfeedfacf ||
      bytes.readUInt32LE(slice + 4) !== 0x0100000c ||
      ![0, 1].includes(bytes.readUInt32LE(slice + 8) & 0xffffff)
    )
      throw new TypeError(
        "Only little-endian arm64 Mach-O (without arm64e/PAC) is supported.",
      );
    layout = parseMachoLayout(bytes, "arm64");
  } catch (cause) {
    throw new ArtifactReaderFailure(
      "format",
      cause instanceof Error ? cause.message : "Invalid Mach-O layout.",
      { cause },
    );
  }
  const entry = BigInt(input.entry_address);
  const instructions: NativeTableDispatch["prefix"]["instructions"] = [];
  const registers: DispatchValue[] = Array.from(
    { length: 31 },
    (_, register) => ({ kind: "input", register }),
  );
  let table: NativeTableDispatch["table"] = null;
  let stop: NativeTableDispatch["prefix"]["stop"] = {
    kind: "instruction-budget",
    address: dispatchHex(entry),
    detail:
      "Prefix instruction budget exhausted; increase max_instructions. Unchanged limits reproduce this boundary.",
  };
  for (let n = 0; n < input.max_instructions; n++) {
    if (n % 4096 === 0) {
      await setImmediate();
      checkDispatchCancellation(signal);
    }
    const pc = entry + BigInt(n * 4);
    const offset = dispatchOffset(layout, pc, 4, true);
    if (offset === null) {
      stop = {
        kind: "unmapped-code",
        address: dispatchHex(pc),
        detail:
          "Code is unaligned, writable, ambiguous or not fully mapped executable bytes.",
      };
      break;
    }
    const decoded = decodeDispatchInstruction(
      bytes.readUInt32LE(offset),
      pc,
      registers,
    );
    instructions.push(
      dispatchSource(bytes, pc, offset, decoded?.operation ?? "unsupported"),
    );
    if (decoded === null) {
      stop = {
        kind: "unsupported-instruction",
        address: dispatchHex(pc),
        detail:
          "The restricted straight-line decoder cannot establish this instruction's effect or table branch.",
      };
      break;
    }
    if (decoded.branch !== undefined) {
      const b = decoded.branch;
      table = {
        address: dispatchHex(b.table),
        target_anchor: dispatchHex(b.anchor),
        input_register: `x${b.register}`,
        index_mask: 65535,
        entry_bytes: 2,
        index_scale: 2,
        target_scale: 4,
        entry_signed: false,
      };
      stop = {
        kind: "table-branch",
        address: dispatchHex(pc),
        detail:
          "Unsigned-halfword computed branch established for the selected prefix; input domain remains unknown.",
      };
      break;
    }
    if (pc + 4n >= 1n << 64n) {
      stop = {
        kind: "unmapped-code",
        address: dispatchHex(pc),
        detail:
          "Sequential instruction address exceeds the 64-bit address space.",
      };
      break;
    }
    stop.address = dispatchHex(pc + 4n);
  }
  const entries: NativeTableDispatch["entries"] = [];
  if (table !== null)
    for (const index of input.indices) {
      if (entries.length % 4096 === 0) {
        await setImmediate();
        checkDispatchCancellation(signal);
      }
      const offset = dispatchOffset(
        layout,
        BigInt(table.address) + BigInt(index * 2),
        2,
        false,
      );
      if (offset === null) {
        entries.push({
          index,
          status: "unmapped-entry",
          entry_file_offset: null,
          entry_bytes_hex: null,
          entry_value: null,
          target_address: null,
        });
        continue;
      }
      const value = bytes.readUInt16LE(offset);
      const target = BigInt(table.target_anchor) + BigInt(value * 4);
      const overflow = target >= 1n << 64n;
      entries.push({
        index,
        status: overflow
          ? "address-overflow"
          : dispatchOffset(layout, target, 4, true) === null
            ? "non-executable-target"
            : "mapped-target",
        entry_file_offset: offset,
        entry_bytes_hex: bytes.subarray(offset, offset + 2).toString("hex"),
        entry_value: value,
        target_address: overflow ? null : dispatchHex(target),
      });
    }
  const invocation =
    input.call_address === undefined
      ? null
      : await inspectDispatchInvocation(
          bytes,
          layout,
          input,
          table,
          entries,
          signal,
        );
  checkDispatchCancellation(signal);
  const assumptions = [
    "Derived targets are conditional on normal entry into the selected straight-line prefix with the stated input index; source code and read-only mappings retain the captured bytes.",
    "Preferred Mach-O addresses are static coordinates, not observed runtime addresses. No relocation or authenticated pointer is evaluated.",
  ];
  if (invocation?.mapping_status === "conditional")
    assumptions.push(
      "The observed preparation suffix executes through the direct call without an intervening indirect entry. The direct-branch scan covers immutable __text sections only; it does not establish dynamic reachability, all executable code, or the absence of indirect entry.",
    );
  const limitations = [
    "Requested indices are caller selections, not an exhaustive or typed input domain. The 16-bit machine mask does not prove an enum case count or valid Swift value.",
    "Executable target bytes do not establish case semantics, function ownership, actual execution or a complete CFG. No program database is modified.",
    "The decoder supports only a restricted straight-line arm64 unsigned-halfword table pattern; unsupported instructions stop the proof.",
  ];
  if (invocation !== null && invocation.mapping_status === "unresolved")
    limitations.push(
      "The selected call has no established conditional mapping to this table entry; callee identity, literal preparation or the selected table target is unresolved. Table observations remain independent.",
    );
  const proof = {
    artifact,
    entry_address: dispatchHex(entry),
    requested_indices: input.indices,
    prefix: { instructions, stop },
    table,
    entries,
    invocation,
    assumptions,
    limitations,
  };
  return {
    ...proof,
    architecture: "arm64",
    observation_id: createHash("sha256")
      .update(JSON.stringify(proof))
      .digest("hex"),
    typed_domain: null,
    all_entry_domain_proved: false,
    program_mutations: false,
  };
};
