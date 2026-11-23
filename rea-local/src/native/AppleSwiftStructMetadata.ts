import type { ObjcSwiftMetadata } from "../domain/native/objcSwiftMetadata.js";
import type { Segment } from "./AppleMachoSelection.js";
import type {
  DispatchRecordBudget,
  SwiftDispatchReaders,
} from "./AppleSwiftDispatchFacets.js";

type Fields = NonNullable<ObjcSwiftMetadata["swift_type_fields"]>;
type Metadata = NonNullable<Fields["static_metadata"]>;
const decoded = { status: "decoded" as const, reason: null };
const message = (cause: unknown) =>
  cause instanceof Error ? cause.message : String(cause);

/** Bind one static struct metadata record to an already indexed nominal owner. */
export const decodeSwiftStructMetadata = (input: {
  bytes: Buffer;
  address: bigint;
  descriptor: bigint;
  fields: Fields;
  read: SwiftDispatchReaders;
  budget: DispatchRecordBudget;
  segments: readonly Segment[];
}): ObjcSwiftMetadata["coverage"][number] => {
  const { bytes, address, descriptor, fields, read, budget, segments } = input;
  const out: Metadata = {
    address: `0x${address.toString(16)}`,
    location: null,
    kind_word: null,
    owner_matched: false,
    field_offset_vector: null,
    field_offset_vector_word_offset: null,
    field_offset_entry_bytes: 4,
    field_offsets: [],
    pointers: [],
    value_witness: null,
    decode: decoded,
    limitations: [
      "File-encoded metadata snapshot only; no metadata instantiation, runtime stability or live typed-buffer identity is established.",
      "A shared value-witness function address does not bind nominal ownership. The exact metadata descriptor backpointer supplies this identity.",
      "Value-witness initializeWithCopy is an ABI role, not a proof of memcpy, purity, nonescape, closure-target origin or native argument lowering.",
    ],
  };
  fields.static_metadata = out;
  let examined = 0;
  const admit = () => {
    if (!budget.admit()) throw new RangeError("max_records_reached");
  };
  const word = (at: bigint) => bytes.readBigUInt64LE(read.offset(at, 8));
  const pointer = (
    slot: bigint,
    role: Metadata["pointers"][number]["role"],
  ) => {
    admit();
    const observation: Metadata["pointers"][number] = {
      role,
      slot: read.location(slot),
      target: { address: null, file_offset: null },
      external_reference: null,
      decode: decoded,
      evidence: read.evidence(
        slot,
        `Swift static metadata absolute pointer: ${role}`,
      ),
    };
    out.pointers.push(observation);
    try {
      const target = read.pointer(slot);
      if (target.kind === "bind") {
        observation.external_reference = {
          symbol: target.symbol,
          library: target.library,
          weak: target.weak,
          addend: target.addend.toString(),
        };
        throw new RangeError("External metadata pointer remains unresolved");
      }
      if (target.kind !== "rebase") throw new RangeError(target.reason);
      observation.target.address = `0x${target.target.toString(16)}`;
      if (target.target === 0n) throw new RangeError("Null metadata pointer");
      observation.target = read.location(target.target);
      return target.target;
    } catch (cause) {
      observation.decode = { status: "partial", reason: message(cause) };
      throw cause;
    }
  };
  try {
    admit();
    if (
      !fields.matched ||
      fields.kind !== "struct" ||
      fields.descriptor?.address !== `0x${descriptor.toString(16)}` ||
      fields.declared_field_count === null
    )
      throw new RangeError(
        "An indexed nongeneric struct declaration is required before metadata binding",
      );
    if (address % 8n !== 0n || descriptor % 4n !== 0n)
      throw new RangeError("Misaligned struct metadata or descriptor");
    read.offset(address - 8n, 24);
    read.offset(descriptor, 28);
    // Declaration inventory admits generic owners. The generic metadata
    // layout/argument area is outside this nongeneric physical-layout lane.
    if ((read.u32(descriptor) & 0x80) !== 0)
      throw new RangeError(
        "Generic struct metadata binding requires specialization evidence; only declaration fields are retained",
      );
    out.location = read.location(address);
    const kind = word(address);
    out.kind_word = `0x${kind.toString(16)}`;
    if (kind !== 0x200n)
      throw new RangeError(
        "Selected metadata is not a Swift struct record (kind 0x200)",
      );
    const owner = pointer(address + 8n, "nominal_descriptor");
    if (owner !== descriptor)
      throw new RangeError(
        "Metadata descriptor backpointer does not match the selected nominal owner",
      );
    out.owner_matched = true;
    const vwt = pointer(address - 8n, "value_witness_table");
    if (vwt % 8n !== 0n) throw new RangeError("Misaligned value-witness table");
    read.offset(vwt, 88);
    admit();
    const size = word(vwt + 64n),
      stride = word(vwt + 72n),
      flags = read.u32(vwt + 80n),
      alignment = (flags & 255) + 1;
    out.value_witness = {
      location: read.location(vwt),
      size_bytes: size.toString(),
      stride_bytes: stride.toString(),
      flags,
      alignment_bytes: alignment,
      initialize_with_copy: null,
    };
    if ((flags & 0x00400000) !== 0)
      throw new RangeError(
        "Incomplete value-witness layout cannot establish physical field offsets",
      );
    if (
      (alignment & (alignment - 1)) !== 0 ||
      stride === 0n ||
      stride < size ||
      stride % BigInt(alignment) !== 0n
    )
      throw new RangeError("Invalid value-witness size, stride or alignment");
    try {
      const copy = pointer(vwt + 16n, "initialize_with_copy");
      if (
        !segments.some(
          (s) => s.executable && copy >= s.address && copy < s.address + s.size,
        )
      )
        throw new RangeError(
          "initializeWithCopy target is not in mapped executable storage",
        );
      out.value_witness.initialize_with_copy = read.location(copy);
    } catch (cause) {
      out.decode = { status: "partial", reason: message(cause) };
    }
    const count = read.u32(descriptor + 20n),
      vectorOffset = read.u32(descriptor + 24n);
    if (count !== fields.declared_field_count)
      throw new RangeError(
        "Struct field count disagrees with the selected reflection declaration",
      );
    out.field_offset_vector_word_offset = vectorOffset;
    if (count === 0 && vectorOffset === 0) return finish(out, 0);
    if (vectorOffset < 2)
      throw new RangeError(
        "Absent or header-overlapping struct field-offset vector",
      );
    const vector = address + BigInt(vectorOffset) * 8n;
    read.offset(vector, count * 4);
    out.field_offset_vector = read.location(vector);
    const functionFields = new Set(
      fields.fields
        .filter((f) => f.function_type !== null)
        .map((f) => f.ordinal),
    );
    for (let ordinal = 0; ordinal < count; ordinal++) {
      admit();
      const source = vector + BigInt(ordinal * 4),
        offset = read.u32(source);
      examined++;
      if (BigInt(offset) > size)
        throw new RangeError(
          "Field offset exceeds the encoded value-witness size",
        );
      if (
        functionFields.has(ordinal) &&
        (offset % 8 !== 0 || BigInt(offset) + 16n > size)
      )
        throw new RangeError(
          "Native thick closure field does not fit the encoded struct layout",
        );
      out.field_offsets.push({
        ordinal,
        byte_offset: offset,
        source: read.location(source),
        evidence: read.evidence(
          source,
          "Swift struct uint32 field offset; vector base uses pointer-sized word offset",
        ),
      });
    }
  } catch (cause) {
    out.decode = {
      status: "partial",
      reason: [out.decode.reason, message(cause)].filter(Boolean).join("; "),
    };
  }
  return finish(out, examined);
};

const finish = (
  out: Metadata,
  examined: number,
): ObjcSwiftMetadata["coverage"][number] => ({
  facet: "swift_static_struct_layout",
  status: out.decode.status === "decoded" ? "complete" : "partial",
  reason:
    out.decode.reason ??
    "Coverage is limited to the selected file-encoded metadata record; runtime instance and argument ABI remain unproved",
  examined,
  decoded: out.field_offsets.length,
});
