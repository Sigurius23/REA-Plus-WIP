import type { ObjcSwiftMetadata } from "../domain/native/objcSwiftMetadata.js";
import { issue, type FacetDecodeFacts } from "./AppleDispatchDecodeFacts.js";
import type { Segment } from "./AppleMachoSelection.js";
import type { SwiftConformanceTailReader } from "./AppleSwiftConformanceTail.js";
import type {
  createSwiftRelativeReader,
  DispatchRecordBudget,
  SwiftDispatchReaders,
} from "./AppleSwiftDispatchFacets.js";

type Conformance = ObjcSwiftMetadata["swift_conformances"][number];
type Witness = NonNullable<
  ObjcSwiftMetadata["swift_resilient_witnesses"]
>[number];
type Relative = ReturnType<typeof createSwiftRelativeReader>;
const facet = "swift_resilient_witness_records";
const absent = { address: null, file_offset: null };
const hex = (value: bigint) => `0x${value.toString(16)}`;

interface Readers {
  readers: SwiftDispatchReaders;
  relative: Relative;
  segments: readonly Segment[];
  tail: SwiftConformanceTailReader;
}

/** Tail observation is separate from static runtime witness-table slot decoding. */
export interface SwiftResilientWitnessObserver {
  decodeConformance(input: {
    descriptor: bigint;
    flags: number;
    conformance: Conformance;
  }): void;
  failedConformance(field: bigint, message: string): void;
  facts(): FacetDecodeFacts;
}

const executable = (address: bigint, segments: readonly Segment[]) =>
  address !== 0n &&
  segments.some(
    (segment) =>
      segment.executable &&
      address >= segment.address &&
      address < segment.address + segment.size,
  );

/**
 * Swift swift-5.9-RELEASE ABI/Metadata.h and MetadataValues.h: a 16-byte
 * conformance tails and eight-byte requirement/witness pairs. Shared tail
 * parsing accounts for retroactive/conditional/pack prefixes and optional
 * generic control data. On supported 64-bit Mach-O, both union alternatives are relative
 * pointers; unavailable imported requirement flags never imply a function kind.
 */
const readTail = (input: Readers & { descriptor: bigint; flags: number }) => {
  const { descriptor, flags, segments } = input;
  const layout = input.tail(descriptor, flags);
  const { control } = layout;
  const limitations: string[] = [];
  if (control !== null) {
    const { instantiator, privateData } = control;
    if (
      instantiator.kind !== "local" ||
      (instantiator.address !== 0n &&
        !executable(instantiator.address, segments))
    )
      limitations.push(
        "Generic witness instantiator target is unresolved or non-executable; runtime table is not instantiated",
      );
    if (privateData.kind !== "local")
      limitations.push(
        "Generic witness private data is not file-backed or unresolved; runtime storage is not inspected",
      );
  }
  return { ...layout, limitations };
};

const readRecord = (
  input: Readers & {
    records: bigint;
    conformance: Conformance;
    ordinal: number;
    generic: bigint | null;
    limitations: readonly string[];
  },
): Witness => {
  const {
    records,
    conformance,
    ordinal,
    generic,
    readers: read,
    relative,
  } = input;
  const record = records + BigInt(ordinal * 8);
  const problems = [...input.limitations];
  const requirement = relative.resolve(record, "indirectable");
  let requirementLocation: Witness["requirement"] = absent;
  let requirementFlags: number | null = null;
  if (requirement.kind === "local" && requirement.address !== 0n) {
    try {
      read.offset(requirement.address, 8);
      requirementLocation = read.location(requirement.address);
      requirementFlags = read.u32(requirement.address);
    } catch (cause) {
      problems.push(cause instanceof Error ? cause.message : String(cause));
    }
  } else {
    problems.push(
      requirement.kind === "external"
        ? "Imported requirement identity retained; requirement flags and function kind are unavailable"
        : requirement.kind === "unsupported"
          ? requirement.reason
          : "Missing resilient requirement descriptor",
    );
  }
  const implementation = relative.resolve(record + 4n);
  let implementationLocation: Witness["implementation_location"] = absent;
  let implementationKind: Witness["implementation_kind"] = "unresolved";
  const synchronous =
    requirementFlags !== null &&
    (requirementFlags & 15) >= 1 &&
    (requirementFlags & 15) <= 6 &&
    (requirementFlags & ~0x1f) === 0;
  if (
    implementation.kind === "local" &&
    executable(implementation.address, input.segments) &&
    (requirementFlags === null || synchronous)
  ) {
    implementationLocation = read.location(implementation.address);
    implementationKind = synchronous
      ? "synchronous_function"
      : "executable_address";
  } else {
    problems.push(
      "Witness implementation is nil, non-executable, unresolved, or has an unsupported requirement kind/flags",
    );
  }
  return {
    conformance: conformance.location,
    type_name: conformance.type_name,
    protocol_name: conformance.protocol_name,
    type_reference: conformance.type_reference ?? null,
    protocol_reference: conformance.protocol_reference ?? null,
    record_ordinal: ordinal,
    requirement: requirementLocation,
    requirement_reference:
      requirement.kind === "external" ? requirement.reference : null,
    requirement_flags: requirementFlags,
    implementation_address: implementationLocation.address,
    implementation_location: implementationLocation,
    implementation_kind: implementationKind,
    generic_witness_table: generic === null ? null : read.location(generic),
    runtime_witness_table: "not_instantiated",
    location: read.location(record),
    decode:
      problems.length === 0
        ? { status: "decoded", reason: null }
        : { status: "partial", reason: problems.join("; ") },
    evidence: read.evidence(
      record,
      "Swift ABI static resilient requirement/witness pair; ordinal is not a runtime table slot, and generic witness control data is not instantiated",
    ),
  };
};

/** Decode bounded static pairs, retaining unknown external metadata explicitly. */
export const createSwiftResilientWitnessReader = (
  input: Readers & {
    budget: DispatchRecordBudget;
    result: ObjcSwiftMetadata;
  },
): SwiftResilientWitnessObserver => {
  const { budget, result } = input;
  const records: Witness[] = [];
  result.swift_resilient_witnesses = records;
  const issues: ReturnType<typeof issue>[] = [];
  let examined = 0;
  const failedConformance = (field: bigint, message: string) => {
    issues.push(
      issue(facet, "resilient_conformance_unresolved", message, hex(field)),
    );
  };
  return {
    failedConformance,
    decodeConformance: ({ descriptor, flags, conformance }) => {
      if ((flags & 0x10000) === 0) return;
      examined++;
      try {
        const { count, generic, limitations, resilient } = readTail({
          ...input,
          descriptor,
          flags,
        });
        for (let ordinal = 0; ordinal < count; ordinal++) {
          if (!budget.admit()) break;
          const record = readRecord({
            ...input,
            records: resilient,
            conformance,
            ordinal,
            generic,
            limitations,
          });
          records.push(record);
          if (record.decode.status !== "decoded")
            issues.push(
              issue(
                facet,
                "resilient_record_partial",
                record.decode.reason ?? "Unresolved resilient record",
                record.location.address ?? undefined,
              ),
            );
        }
      } catch (cause) {
        failedConformance(
          descriptor,
          cause instanceof Error ? cause.message : String(cause),
        );
      }
    },
    facts: () => ({
      facet,
      examined,
      decoded: records.filter(({ decode }) => decode.status === "decoded")
        .length,
      exhaustive: !budget.truncated && issues.length === 0,
      issues,
    }),
  };
};
