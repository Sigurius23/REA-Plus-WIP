import type { ObjcSwiftMetadata } from "../domain/native/objcSwiftMetadata.js";
import { issue, type FacetDecodeFacts } from "./AppleDispatchDecodeFacts.js";
import type { Segment } from "./AppleMachoSelection.js";
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
 * conformance, NumWitnesses, eight-byte requirement/witness pairs, then optional
 * 12-byte GenericWitnessTable. Only the nonconditional/nonretroactive layout is
 * admitted. On supported 64-bit Mach-O, both union alternatives are relative
 * pointers; unavailable imported requirement flags never imply a function kind.
 */
const readTail = (input: Readers & { descriptor: bigint; flags: number }) => {
  const { descriptor, flags, readers: read, relative, segments } = input;
  if ((flags & ~0x30038) !== 0)
    throw new TypeError(
      "Unsupported resilient conformance flags or preceding tail layout",
    );
  const count = read.u32(descriptor + 16n);
  const generic =
    (flags & 0x20000) === 0 ? null : descriptor + 20n + BigInt(count * 8);
  // Validate the entire declared span before emitting any record. A huge count
  // cannot allocate storage or consume an unbounded loop before admission.
  read.offset(descriptor + 16n, 4 + count * 8 + (generic === null ? 0 : 12));
  const limitations: string[] = [];
  if (generic !== null) {
    read.u32(generic); // two uint16 size/control words, not a requirement count
    const instantiator = relative.resolve(generic + 4n);
    const privateData = relative.resolve(generic + 8n);
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
  return { count, generic, limitations };
};

const readRecord = (
  input: Readers & {
    descriptor: bigint;
    conformance: Conformance;
    ordinal: number;
    generic: bigint | null;
    limitations: readonly string[];
  },
): Witness => {
  const {
    descriptor,
    conformance,
    ordinal,
    generic,
    readers: read,
    relative,
  } = input;
  const record = descriptor + 20n + BigInt(ordinal * 8);
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
        const { count, generic, limitations } = readTail({
          ...input,
          descriptor,
          flags,
        });
        for (let ordinal = 0; ordinal < count; ordinal++) {
          if (!budget.admit()) break;
          const record = readRecord({
            ...input,
            descriptor,
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
