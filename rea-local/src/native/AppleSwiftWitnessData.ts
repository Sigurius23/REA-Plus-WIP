import type { SwiftWitnessData } from "../domain/native/objcSwiftMetadata.js";
import type { DecodedPointer } from "./AppleMachoFixups.js";
import type {
  BinaryMetadataEvidence,
  SwiftDispatchReaders,
  createSwiftRelativeReader,
} from "./AppleSwiftDispatchFacets.js";

const hex = (address: bigint) => `0x${address.toString(16)}`;

/** Each protocol signature is read once, independently of its conformance count. */
export const readSwiftBaseProtocolConstraints = (
  owner: bigint,
  read: SwiftDispatchReaders,
  relative: ReturnType<typeof createSwiftRelativeReader>,
): { records: Map<bigint, BinaryMetadataEvidence>; error: string | null } => {
  const records = new Map<bigint, BinaryMetadataEvidence>();
  try {
    const count = read.u32(owner + 12n);
    if (count > 20_000)
      throw new RangeError("Protocol signature count exceeds 20000");
    for (let index = 0; index < count; index++) {
      const field = owner + 24n + BigInt(index * 12);
      // Ordinary Self: Protocol constraints; other encodings are not admitted.
      if ((read.u32(field) & ~0x80) !== 0 || (read.u32(field + 8n) & 2) !== 0)
        continue;
      const parameter = relative.resolve(field + 4n);
      if (
        parameter.kind !== "local" ||
        parameter.address === 0n ||
        read.string(parameter.address) !== "x"
      )
        continue;
      const target = relative.resolve(field + 8n, "indirectable");
      if (target.kind === "local" && target.address !== 0n)
        records.set(
          target.address,
          read.evidence(
            field,
            "Protocol signature declares this exact inherited Self conformance",
          ),
        );
    }
    return { records, error: null };
  } catch (cause) {
    return {
      records,
      error: cause instanceof Error ? cause.message : String(cause),
    };
  }
};

/** Decode static witness data without treating it as executable dispatch. */
export const decodeSwiftWitnessData = (input: {
  kind: number;
  pointer: DecodedPointer;
  ownerType: bigint;
  ownerProtocol: bigint;
  associatedName: string | null;
  associatedNameError: string | null;
  baseConstraints: ReturnType<typeof readSwiftBaseProtocolConstraints> | null;
  readers: SwiftDispatchReaders;
  relative: ReturnType<typeof createSwiftRelativeReader>;
}): {
  data: SwiftWitnessData;
  decode:
    | { status: "decoded"; reason: null }
    | { status: "partial"; reason: string };
  evidence: BinaryMetadataEvidence;
} | null => {
  const { kind, pointer, readers: read, relative } = input;
  if (
    (kind !== 0 && kind !== 7) ||
    pointer.kind !== "rebase" ||
    pointer.target === 0n
  )
    return null;
  const location = (address: bigint) => {
    try {
      return read.location(address);
    } catch {
      return { address: hex(address), file_offset: null };
    }
  };
  const local = (
    field: bigint,
    mode: "direct" | "indirectable" | "indirect",
  ) => {
    const target = relative.resolve(field, mode);
    if (target.kind !== "local" || target.address === 0n)
      throw new TypeError(
        "Witness data refers to external, nil or unresolved metadata",
      );
    return target.address;
  };
  const evidence: BinaryMetadataEvidence = [];
  const data: SwiftWitnessData =
    kind === 0
      ? {
          kind: "base_protocol",
          witness_table: location(pointer.target),
          conformance: null,
          protocol_descriptor: null,
          protocol_name: null,
          type_descriptor: null,
          type_name: null,
        }
      : {
          kind: "associated_type",
          name: input.associatedName,
          representation:
            (pointer.target & 1n) === 0n ? "metadata" : "mangled_name",
          pointer_target: hex(pointer.target),
          target: location(pointer.target & ~1n),
          context_descriptor: null,
          type_name: null,
        };
  try {
    if (data.kind === "base_protocol") {
      const header = read.pointer(pointer.target);
      if (header.kind !== "rebase" || header.target === 0n)
        throw new TypeError(
          "Inherited witness-table conformance header is unresolved",
        );
      const descriptor = header.target;
      data.conformance = location(descriptor);
      const flags = read.u32(descriptor + 12n);
      const typeKind = (flags >>> 3) & 7;
      if ((flags & ~0x38) !== 0 || typeKind > 1)
        throw new TypeError(
          "Conditional, generic or unsupported inherited witness conformance",
        );
      const type = local(
        descriptor + 4n,
        typeKind === 1 ? "indirect" : "direct",
      );
      data.type_descriptor = location(type);
      if (type !== input.ownerType)
        throw new TypeError(
          "Inherited witness table belongs to a different nominal type",
        );
      const protocol = local(descriptor, "indirectable");
      data.protocol_descriptor = location(protocol);
      if ((read.u32(protocol) & 31) !== 3 || protocol === input.ownerProtocol)
        throw new TypeError("Invalid inherited protocol descriptor");
      if (input.baseConstraints?.error)
        throw new TypeError(input.baseConstraints.error);
      const declared = input.baseConstraints?.records.get(protocol);
      if (declared === undefined)
        throw new TypeError(
          "Inherited protocol is not proved by an ordinary Self constraint in the owner signature",
        );
      evidence.push(...declared);
      data.protocol_name = read.string(local(protocol + 8n, "direct"));
      data.type_name = read.string(local(type + 8n, "direct"));
      evidence.push(
        ...read.evidence(
          descriptor,
          "Inherited static witness-table conformance and exact nominal owner",
        ),
      );
    } else {
      if (input.associatedNameError !== null)
        throw new TypeError(input.associatedNameError);
      if (data.representation !== "mangled_name")
        throw new TypeError(
          "Metadata-based associated type identity is not decoded",
        );
      const name = pointer.target & ~1n;
      const tag = read.u8(name);
      // A complete single context reference is admitted. Tuples, generic
      // substitutions and protocol-context encodings remain explicit unknowns.
      if ((tag !== 1 && tag !== 2) || read.u8(name + 5n) !== 0)
        throw new TypeError(
          "Associated type mangling is not a single nominal context reference",
        );
      const context = local(name + 1n, tag === 1 ? "direct" : "indirect");
      data.context_descriptor = location(context);
      const flags = read.u32(context);
      if (![16, 17, 18].includes(flags & 31) || (flags & 0x80) !== 0)
        throw new TypeError(
          "Associated type context is unsupported or requires generic substitutions",
        );
      data.type_name = read.string(local(context + 8n, "direct"));
      evidence.push(
        ...read.evidence(
          name,
          "Tagged associated-type witness: complete symbolic nominal type reference",
        ),
      );
      evidence.push(
        ...read.evidence(
          context,
          "Associated-type nominal descriptor identity",
        ),
      );
    }
    return { data, decode: { status: "decoded", reason: null }, evidence };
  } catch (cause) {
    return {
      data,
      decode: {
        status: "partial",
        reason: cause instanceof Error ? cause.message : String(cause),
      },
      evidence,
    };
  }
};
