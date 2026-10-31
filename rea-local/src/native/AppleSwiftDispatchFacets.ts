import type { ObjcSwiftMetadata } from "../domain/native/objcSwiftMetadata.js";
import type { DecodedPointer } from "./AppleMachoFixups.js";
import type { Segment, Section } from "./AppleMachoSelection.js";
import { issue, type FacetDecodeFacts } from "./AppleDispatchDecodeFacts.js";

/** Resolved file-backed metadata location from the Mach-O layout. */
export interface ResolvedMetadataLocation {
  address: string;
  file_offset: number;
}

/** Binary-metadata evidence produced by the Apple dispatch readers. */
export type BinaryMetadataEvidence = {
  kind: "binary_metadata";
  description: string;
  location: ResolvedMetadataLocation;
  artifact_path: string;
  artifact_sha256: string;
}[];

/** Shared admission budget for max_records truncation across decode facets. */
export interface DispatchRecordBudget {
  truncated: boolean;
  isFull(): boolean;
  markTruncated(): void;
  admit(): boolean;
}

/** Byte readers for Swift relative-pointer and conformance decode facets. */
export interface SwiftDispatchReaders {
  u32(address: bigint): number;
  pointer(address: bigint): DecodedPointer;
  string(address: bigint): string;
  location(address: bigint): ResolvedMetadataLocation;
  evidence(address: bigint, description: string): BinaryMetadataEvidence;
  offset(address: bigint, size?: number): number;
}

const hex = (value: bigint) => `0x${value.toString(16)}`;
const decoded = { status: "decoded" as const, reason: null };

type ExternalReference = {
  symbol: string;
  library: string | null;
  weak: boolean;
  addend: string;
};
type RelativeTarget =
  | { kind: "local"; address: bigint }
  | { kind: "external"; reference: ExternalReference }
  | { kind: "unsupported"; reason: string };
type RelativeMode = "direct" | "indirectable" | "indirect";

const requireLocal = (target: RelativeTarget): bigint => {
  if (target.kind === "local") return target.address;
  throw new RangeError(
    target.kind === "external"
      ? `External Swift metadata layout is unsupported: ${target.reference.symbol}`
      : target.reason,
  );
};

/** Preserve relative displacement, indirect slot and dyld identity separately. */
export const createSwiftRelativeReader = (input: {
  bytes: Buffer;
  readers: SwiftDispatchReaders;
  budget: DispatchRecordBudget;
  result: ObjcSwiftMetadata;
}) => {
  const { bytes, readers: read, budget, result } = input;
  const resolve = (
    field: bigint,
    mode: RelativeMode = "direct",
  ): RelativeTarget => {
    const displacement = bytes.readInt32LE(read.offset(field, 4));
    const indirectable = mode === "indirectable";
    const indirect =
      mode === "indirect" || (indirectable && (displacement & 1) !== 0);
    const relativeAddress =
      displacement === 0
        ? 0n
        : field + BigInt(indirectable ? displacement & ~1 : displacement);
    let target: RelativeTarget = { kind: "local", address: relativeAddress };
    let slot: ResolvedMetadataLocation | null = null;
    let finalAddress: bigint | null = relativeAddress;
    let fileOffset: number | null = null;
    let external: ExternalReference | null = null;
    let reason: string | null = null;
    try {
      if (indirect && relativeAddress !== 0n) {
        finalAddress = null;
        slot = read.location(relativeAddress);
        const pointer = read.pointer(relativeAddress);
        if (pointer.kind === "rebase") {
          finalAddress = pointer.target;
          target = { kind: "local", address: pointer.target };
        } else {
          finalAddress = null;
          if (pointer.kind === "bind") {
            external = {
              symbol: pointer.symbol,
              library: pointer.library,
              weak: pointer.weak,
              addend: pointer.addend.toString(),
            };
            target = { kind: "external", reference: external };
            reason = "External Swift metadata layout is unsupported";
          } else {
            reason = pointer.reason;
            target = { kind: "unsupported", reason };
          }
        }
      }
      if (finalAddress !== null && finalAddress !== 0n)
        fileOffset = read.offset(finalAddress);
    } catch (cause) {
      reason = cause instanceof Error ? cause.message : String(cause);
      target = { kind: "unsupported", reason };
    }
    if (budget.admit())
      result.relative_pointers.push({
        field: read.location(field),
        target: {
          address:
            finalAddress === null || finalAddress === 0n
              ? null
              : hex(finalAddress),
          file_offset: fileOffset,
        },
        indirect_slot: slot,
        external_reference: external,
        displacement,
        indirectable,
        indirect,
        decode:
          reason === null
            ? decoded
            : {
                status: target.kind === "external" ? "unsupported" : "partial",
                reason,
              },
        evidence: read.evidence(
          field,
          "Swift ABI signed-relative metadata pointer",
        ),
      });
    return target;
  };
  return { resolve, local: (field: bigint) => requireLocal(resolve(field)) };
};

/** Decode `__swift5_proto` conformances and static witness slots into `result`. */
export const decodeSwiftDispatchFacets = (input: {
  sections: readonly Section[];
  segments: readonly Segment[];
  readers: SwiftDispatchReaders;
  relative: ReturnType<typeof createSwiftRelativeReader>;
  budget: DispatchRecordBudget;
  result: ObjcSwiftMetadata;
}): FacetDecodeFacts => {
  const { sections, segments, readers: read, relative, budget, result } = input;
  const swiftFailures: string[] = [];
  const issues = [] as ReturnType<typeof issue>[];
  let swiftExamined = 0;
  let decodedRecords = 0;
  for (const section of sections.filter(
    ({ name }) => name === "__swift5_proto",
  )) {
    if (section.size % 4 !== 0)
      throw new RangeError("Misaligned Swift conformance section");
    for (let index = 0; index < section.size / 4; index++) {
      if (!budget.admit()) break;
      swiftExamined++;
      const field = section.address + BigInt(index * 4);
      try {
        const descriptor = relative.local(field);
        const flags = read.u32(descriptor + 12n);
        const protocolTarget = relative.resolve(descriptor, "indirectable");
        const protocol =
          protocolTarget.kind === "external"
            ? null
            : requireLocal(protocolTarget);
        if (protocol === 0n)
          throw new TypeError("Missing Swift protocol descriptor");
        if (protocol !== null && (read.u32(protocol) & 31) !== 3)
          throw new TypeError("Unsupported Swift protocol descriptor kind");
        const protocolName =
          protocol === null ? null : read.string(relative.local(protocol + 8n));
        const typeKind = (flags >>> 3) & 7;
        if (typeKind !== 0 && typeKind !== 1)
          throw new TypeError(
            "Unsupported Swift conformance type-reference kind",
          );
        const typeTarget = relative.resolve(
          descriptor + 4n,
          typeKind === 1 ? "indirect" : "direct",
        );
        const type =
          typeTarget.kind === "external" ? null : requireLocal(typeTarget);
        if (type === 0n) throw new TypeError("Missing Swift type descriptor");
        if (type !== null && ![16, 17, 18].includes(read.u32(type) & 31))
          throw new TypeError("Unsupported Swift type descriptor kind");
        const typeName =
          type === null ? null : read.string(relative.local(type + 8n));
        const witness = relative.local(descriptor + 8n);
        const staticWitness =
          protocol !== null &&
          type !== null &&
          witness !== 0n &&
          (flags & ~0x38) === 0 &&
          (read.u32(type) & 0x80) === 0;
        let witnessReason: string | null =
          protocol === null || type === null
            ? "External Swift metadata layout is unsupported; local names and bind identities are retained separately"
            : staticWitness
              ? null
              : "Conditional, generic, resilient or missing static witness table is not decoded";
        if (staticWitness) {
          const header = read.pointer(witness);
          if (header.kind !== "rebase" || header.target !== descriptor)
            witnessReason =
              "Witness-table conformance header is unresolved or encoded";
        }
        const conformanceDecode =
          witnessReason === null
            ? { status: "decoded" as const, reason: null }
            : { status: "partial" as const, reason: witnessReason };
        result.swift_conformances.push({
          type_name: typeName,
          protocol_name: protocolName,
          type_reference:
            typeTarget.kind === "external" ? typeTarget.reference : null,
          protocol_reference:
            protocolTarget.kind === "external"
              ? protocolTarget.reference
              : null,
          module: null,
          witness_table:
            witness === 0n
              ? { address: null, file_offset: null }
              : read.location(witness),
          location: read.location(descriptor),
          decode: conformanceDecode,
          evidence: read.evidence(
            descriptor,
            "Swift protocol conformance descriptor, local names and external bind identities",
          ),
        });
        if (conformanceDecode.status === "decoded") decodedRecords++;
        if (witnessReason !== null) {
          swiftFailures.push(`${typeName}: ${witnessReason}`);
          issues.push(
            issue(
              "swift_conformances_static_witness_slots",
              "conformance_decode_partial",
              witnessReason,
              hex(descriptor),
            ),
          );
          continue;
        }
        if (protocol === null) continue;
        const count = read.u32(protocol + 16n);
        const signatureCount = read.u32(protocol + 12n);
        if (count > 20_000 || signatureCount > 20_000)
          throw new RangeError("Swift witness requirement count exceeds 20000");
        for (let slot = 0; slot < count; slot++) {
          if (!budget.admit()) break;
          const entry = witness + BigInt((slot + 1) * 8);
          const implementationPointer = read.pointer(entry);
          const implementation =
            implementationPointer.kind === "rebase"
              ? implementationPointer.target
              : null;
          const requirementFlags = read.u32(
            protocol + 24n + BigInt(signatureCount * 12 + slot * 8),
          );
          const kind = requirementFlags & 15;
          const synchronousFunction =
            kind >= 1 && kind <= 4 && (requirementFlags & 0x20) === 0;
          const executable =
            synchronousFunction &&
            implementation !== null &&
            segments.some(
              (segment) =>
                segment.executable &&
                implementation >= segment.address &&
                implementation < segment.address + segment.size,
            );
          const slotDecode = executable
            ? { status: "decoded" as const, reason: null }
            : {
                status: "partial" as const,
                reason:
                  "Witness slot is non-function, async, nil, external, authenticated or encoded; implementation target is unresolved",
              };
          result.swift_dispatch_slots.push({
            owner: `${typeName}: ${protocolName}`,
            table_kind: "witness_table",
            slot_index: slot + 1,
            requirement: null,
            implementation: null,
            implementation_address:
              executable && implementation !== null
                ? hex(implementation)
                : null,
            thunk_address: null,
            location: read.location(entry),
            decode: slotDecode,
            evidence: read.evidence(
              entry,
              "Static Swift witness slot, indexed after the conformance-descriptor header",
            ),
          });
          if (slotDecode.status !== "decoded")
            issues.push(
              issue(
                "swift_conformances_static_witness_slots",
                "witness_slot_unresolved",
                slotDecode.reason,
                hex(entry),
              ),
            );
        }
      } catch (cause) {
        const message = cause instanceof Error ? cause.message : String(cause);
        swiftFailures.push(`${hex(field)}: ${message}`);
        issues.push(
          issue(
            "swift_conformances_static_witness_slots",
            "conformance_decode_failed",
            message,
            hex(field),
          ),
        );
      }
    }
  }
  return {
    facet: "swift_conformances_static_witness_slots",
    examined: swiftExamined,
    decoded: decodedRecords,
    exhaustive: !budget.truncated && issues.length === 0,
    issues,
  };
};
