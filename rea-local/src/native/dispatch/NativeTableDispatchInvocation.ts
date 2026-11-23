import { setImmediate } from "node:timers/promises";
import type {
  InspectNativeTableDispatchInput,
  NativeTableDispatch,
  DispatchInstruction,
} from "../../domain/native/nativeTableDispatch.js";
import type { MachoLayout } from "../AppleMachoSelection.js";
import {
  matches,
  directCallTarget,
  directBranchTarget,
} from "./Arm64DispatchDecoder.js";
import {
  checkDispatchCancellation,
  dispatchHex,
  dispatchOffset,
  dispatchSource,
} from "./DispatchSource.js";

/** Optional call evidence stays separate from independently selected table observations. */
export const inspectDispatchInvocation = async (
  bytes: Buffer,
  layout: MachoLayout,
  input: InspectNativeTableDispatchInput,
  table: NativeTableDispatch["table"],
  entries: NativeTableDispatch["entries"],
  signal?: AbortSignal,
): Promise<NonNullable<NativeTableDispatch["invocation"]>> => {
  const call = BigInt(input.call_address!);
  const result: NonNullable<NativeTableDispatch["invocation"]> = {
    call_address: dispatchHex(call),
    call_instruction: null,
    link: "unmapped-call",
    direct_target: null,
    preparation: [],
    input_literal: null,
    effective_index: null,
    known_bypass: null,
    branch_scan: null,
    mapping_status: "unresolved",
    mapping_index: null,
  };
  const offset = dispatchOffset(layout, call, 4, true);
  if (offset === null) return result;
  const word = bytes.readUInt32LE(offset),
    direct = directCallTarget(word, call);
  const indirect = matches(word, 0xfffffc1f, 0xd63f0000);
  result.call_instruction = dispatchSource(
    bytes,
    call,
    offset,
    direct !== null
      ? "BL direct"
      : indirect
        ? "BLR indirect"
        : "not a supported call",
  );
  result.link =
    direct !== null
      ? direct === BigInt(input.entry_address)
        ? "direct-to-entry"
        : "different-direct-target"
      : indirect
        ? "indirect-unresolved"
        : "not-call";
  result.direct_target = direct === null ? null : dispatchHex(direct);
  if ((direct === null && !indirect) || table === null) return result;
  const register = Number(table.input_register.slice(1));
  // Only ordinary argument registers are admitted; BL/BLR overwrite X30.
  if (register > 7) return result;
  let prep = call - 4n;
  let prepOffset = dispatchOffset(layout, prep, 4, true);
  if (prepOffset === null) return result;
  let prepWord = bytes.readUInt32LE(prepOffset);
  const suffix: DispatchInstruction[] = [];
  if (matches(prepWord, 0xffe0ffe0, 0xaa0003e0) && (prepWord & 31) === 20) {
    suffix.push(dispatchSource(bytes, prep, prepOffset, "MOV X20 register"));
    prep -= 4n;
    prepOffset = dispatchOffset(layout, prep, 4, true);
    if (prepOffset === null) return result;
    prepWord = bytes.readUInt32LE(prepOffset);
  }
  if (
    !matches(prepWord, 0x7f800000, 0x52800000) ||
    (prepWord & 31) !== register
  )
    return result;
  const shift = ((prepWord >>> 21) & 3) * 16;
  if (shift >= (prepWord >>> 31 ? 64 : 32)) return result;
  const value = BigInt((prepWord >>> 5) & 65535) << BigInt(shift);
  result.preparation = [
    dispatchSource(bytes, prep, prepOffset, "MOVZ input literal"),
    ...suffix,
  ];
  result.input_literal = dispatchHex(value);
  result.effective_index = Number(value & 65535n);
  // A prepared argument does not establish the indirect callee.
  if (result.link !== "direct-to-entry") return result;
  const scan = await scanBypasses(bytes, layout, prep, call, signal);
  result.branch_scan = {
    scope: "immutable-__text-only",
    instructions_examined: scan.examined,
    completed: scan.completed,
  };
  result.known_bypass = scan.bypass;
  if (
    scan.completed &&
    scan.bypass === null &&
    entries.some(
      (e) => e.index === result.effective_index && e.status === "mapped-target",
    )
  ) {
    result.mapping_status = "conditional";
    result.mapping_index = result.effective_index;
  }
  return result;
};

/** First known bypass suffices to withhold the mapping; no huge xref array. */
const scanBypasses = async (
  bytes: Buffer,
  layout: MachoLayout,
  preparation: bigint,
  call: bigint,
  signal?: AbortSignal,
): Promise<{
  examined: number;
  completed: boolean;
  bypass: DispatchInstruction | null;
}> => {
  let examined = 0,
    completed = true;
  const sections = layout.sections.filter((s) => s.name === "__text");
  if (sections.length === 0)
    return { examined, completed: false, bypass: null };
  for (const section of sections) {
    if (section.size % 4 !== 0) {
      completed = false;
      continue;
    }
    const offset = dispatchOffset(layout, section.address, section.size, true);
    if (offset === null) {
      completed = false;
      continue;
    }
    for (let n = 0; n < section.size; n += 4) {
      if (examined % 65536 === 0) {
        await setImmediate();
        checkDispatchCancellation(signal);
      }
      examined++;
      const pc = section.address + BigInt(n);
      const target = directBranchTarget(bytes.readUInt32LE(offset + n), pc);
      if (target !== null && target > preparation && target <= call)
        return {
          examined,
          completed: false,
          bypass: dispatchSource(
            bytes,
            pc,
            offset + n,
            "Direct branch bypasses input preparation",
          ),
        };
    }
  }
  return { examined, completed, bypass: null };
};
