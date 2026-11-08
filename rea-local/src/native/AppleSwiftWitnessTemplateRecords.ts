import type { ObjcSwiftMetadata } from "../domain/native/objcSwiftMetadata.js";
import type { Segment } from "./AppleMachoSelection.js";
import type {
  createSwiftRelativeReader,
  SwiftDispatchReaders,
} from "./AppleSwiftDispatchFacets.js";

type Template = NonNullable<
  ObjcSwiftMetadata["swift_witness_templates"]
>[number];
interface Readers {
  read: SwiftDispatchReaders;
  relative: ReturnType<typeof createSwiftRelativeReader>;
}
const absent = { address: null, file_offset: null };
const state = (reason: string | null): Template["decode"] =>
  reason === null
    ? { status: "decoded", reason: null }
    : { status: "partial", reason };

/** Preserve encoded conditional requirements without evaluating generic arguments. */
export const readSwiftConditionalRequirement = (
  { read, relative }: Readers,
  address: bigint,
): Template["conditional_requirements"][number] => {
  const flags = read.u32(address);
  const parameterEncoding = read.u32(address + 4n);
  const constraintEncoding = read.u32(address + 8n);
  const record: Template["conditional_requirements"][number] = {
    location: read.location(address),
    flags,
    parameter_encoding: parameterEncoding,
    constraint_encoding: constraintEncoding,
    parameter: absent,
    constraint: null,
    constraint_reference: null,
    decode: state(null),
    evidence: read.evidence(
      address,
      "Encoded Swift conditional requirement; generic arguments and satisfaction are not evaluated",
    ),
  };
  const kind = flags & 31;
  if ((flags & ~0xbf) !== 0 || ![0, 1, 2, 3, 4, 31].includes(kind)) {
    record.decode = state(
      "Unsupported conditional requirement flags/kind; raw encodings retained",
    );
    return record;
  }
  const parameter = relative.resolve(address + 4n);
  record.parameter = relative.inspect(address + 4n).record.target;
  const problems: string[] = [];
  if (parameter.kind !== "local" || parameter.address === 0n)
    problems.push(
      "Conditional parameter mangling address is missing or unresolved",
    );
  if (kind !== 31) {
    if (kind === 0 && (constraintEncoding & 2) !== 0)
      problems.push(
        "Objective-C protocol constraint encoding retained without pointer interpretation",
      );
    else {
      const constraint = relative.resolve(
        address + 8n,
        kind === 0 || kind === 3 ? "indirectable" : "direct",
      );
      record.constraint = relative.inspect(
        address + 8n,
        kind === 0 || kind === 3 ? "indirectable" : "direct",
      ).record.target;
      if (constraint.kind === "external")
        record.constraint_reference = constraint.reference;
      if (
        constraint.kind === "unsupported" ||
        (constraint.kind === "local" && constraint.address === 0n)
      )
        problems.push("Conditional constraint target is missing or unresolved");
    }
  } else if (constraintEncoding !== 0)
    problems.push("Unknown layout constraint value retained");
  record.decode = state(problems.join("; ") || null);
  return record;
};

export const readSwiftConditionalPack = (
  read: SwiftDispatchReaders,
  address: bigint,
): Template["conditional_packs"][number] => {
  const first = read.u32(address),
    second = read.u32(address + 4n);
  const kind = first & 0xffff,
    reserved = second >>> 16;
  return {
    location: read.location(address),
    kind,
    index: first >>> 16,
    shape_class: second & 0xffff,
    reserved,
    decode: state(
      kind <= 1 && reserved === 0
        ? null
        : "Unknown pack kind/reserved bits retained",
    ),
    evidence: read.evidence(
      address,
      "Static conditional pack shape descriptor; no generic argument pack is instantiated",
    ),
  };
};

/** Classify a shipped word only when its local nonresilient requirement is known. */
export const readSwiftWitnessTemplateEntry = (
  input: Readers & {
    address: bigint;
    word: number;
    requirement: bigint | null;
    segments: readonly Segment[];
  },
): Template["entries"][number] => {
  const { read, address, word, requirement, segments } = input;
  const raw =
    BigInt(read.u32(address)) | (BigInt(read.u32(address + 4n)) << 32n);
  const flags = requirement === null ? null : read.u32(requirement);
  const record: Template["entries"][number] = {
    word_index: word,
    location: read.location(address),
    stored_value: `0x${raw.toString(16).padStart(16, "0")}`,
    requirement: requirement === null ? null : read.location(requirement),
    requirement_flags: flags,
    kind: "unresolved",
    target: absent,
    target_reference: null,
    decode: state(null),
    evidence: read.evidence(
      address,
      "Shipped Swift witness pattern word; word index is not an observed runtime table slot",
    ),
  };
  if (raw === 0n) {
    record.kind = "hole";
    return record;
  }
  const pointer = read.pointer(address);
  if (pointer.kind !== "rebase") {
    if (pointer.kind === "bind")
      record.target_reference = {
        symbol: pointer.symbol,
        library: pointer.library,
        weak: pointer.weak,
        addend: pointer.addend.toString(),
      };
    record.decode = state(
      "Template word target is imported, authenticated or encoded; raw value/identity retained",
    );
    return record;
  }
  try {
    record.target = read.location(pointer.target);
  } catch {
    record.target = {
      address: `0x${pointer.target.toString(16)}`,
      file_offset: null,
    };
  }
  const kind = flags === null ? null : flags & 15;
  if (
    flags === null ||
    (flags & 0xffc0) !== 0 ||
    kind === null ||
    kind > 8 ||
    kind === 5 ||
    kind === 6
  )
    record.decode = state(
      "Requirement mapping/flags or coroutine dispatch interpretation is unavailable",
    );
  else if (kind === 0 || kind === 7 || kind === 8) record.kind = "non_function";
  else if ((flags & 0x20) !== 0) {
    try {
      read.offset(pointer.target, 8);
      record.kind = "async_descriptor";
    } catch {
      record.decode = state("Async function descriptor is not file-backed");
    }
  } else if (
    segments.some(
      (s) =>
        s.executable &&
        pointer.target >= s.address &&
        pointer.target < s.address + s.size,
    )
  )
    record.kind = "function";
  else
    record.decode = state(
      "Synchronous witness target is not in an executable segment",
    );
  return record;
};
