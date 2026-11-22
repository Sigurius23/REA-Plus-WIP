import type { ObjcSwiftMetadata } from "../domain/native/objcSwiftMetadata.js";
import type { Section, Segment } from "./AppleMachoSelection.js";
import type {
  DispatchRecordBudget,
  SwiftDispatchReaders,
  createSwiftRelativeReader,
} from "./AppleSwiftDispatchFacets.js";

type Fields = NonNullable<ObjcSwiftMetadata["swift_type_fields"]>;
type FunctionType = NonNullable<Fields["fields"][number]["function_type"]>;
type Atom = FunctionType["parameter"];
const decoded = { status: "decoded" as const, reason: null };
const reason = (cause: unknown) =>
  cause instanceof Error ? cause.message : String(cause);

/** Selected reflection declarations only; never changes code, CFGs or runtime metadata. */
export const decodeSwiftTypeFields = (input: {
  bytes: Buffer;
  address: bigint;
  sections: readonly Section[];
  segments: readonly Segment[];
  read: SwiftDispatchReaders;
  relative: ReturnType<typeof createSwiftRelativeReader>;
  budget: DispatchRecordBudget;
  result: ObjcSwiftMetadata;
}): ObjcSwiftMetadata["coverage"][number] => {
  const { bytes, address, sections, segments, read, relative, budget, result } =
    input;
  const out: Fields = {
    address: `0x${address.toString(16)}`,
    index_entries: 0,
    examined_index_entries: 0,
    matching_index_entries: 0,
    unresolved_index_entries: 0,
    matched: false,
    descriptor: null,
    name: null,
    kind: null,
    field_descriptor: null,
    declared_field_count: null,
    fields: [],
    referenced_enums: [],
    program_mutations: false,
    limitations: [
      "Reflection field ordinals are not physical instance offsets.",
      "Declared function types do not establish a typed buffer, code/context origin, an invocation, active dependency selection or a helper-global input domain.",
      "Only complete synchronous nonthrowing native thick function manglings with one supported atomic parameter and result are decoded; other encodings remain unsupported.",
    ],
    decode: decoded,
  };
  result.swift_type_fields = out;
  let firstMatch: bigint | undefined;
  for (const section of sections.filter((s) => s.name === "__swift5_types")) {
    for (let i = 0; i < section.size; i += 4) {
      const entry = section.address + BigInt(i);
      out.index_entries++;
      out.examined_index_entries++;
      try {
        const kind = read.u32(entry) & 3;
        if (kind >= 2) continue; // Objective-C references are not nominal descriptors.
        const observation = relative.inspect(
          entry,
          kind === 1 ? "indirectable" : "direct",
        );
        if (
          observation.target.kind !== "local" ||
          observation.target.address === 0n
        ) {
          out.unresolved_index_entries++;
        } else if (observation.target.address === address) {
          out.matching_index_entries++;
          firstMatch ??= entry;
        }
      } catch {
        out.unresolved_index_entries++;
      }
    }
  }
  out.matched = firstMatch !== undefined;
  const local = (
    field: bigint,
    mode: "direct" | "indirect" | "indirectable" = "direct",
  ) => {
    if (budget.isFull()) {
      budget.markTruncated();
      throw new RangeError("max_records_reached");
    }
    const target = relative.resolve(field, mode);
    if (target.kind !== "local" || target.address === 0n)
      throw new RangeError(
        "Metadata reference is null, external or unresolved",
      );
    return target.address;
  };
  const nominal = (descriptor: bigint): Atom => {
    read.offset(descriptor, 20);
    const flags = read.u32(descriptor);
    if ((flags & 0x80) !== 0 || ![17, 18].includes(flags & 31))
      throw new RangeError(
        "Only nongeneric struct/enum symbolic type identities are supported",
      );
    return {
      kind: "nominal",
      name: read.string(local(descriptor + 8n)),
      descriptor: read.location(descriptor),
    };
  };
  const enums = new Map<bigint, Fields["referenced_enums"][number]>();
  const pureEnum = (descriptor: bigint) => {
    const cached = enums.get(descriptor);
    if (cached) return cached;
    read.offset(descriptor, 28);
    const flags = read.u32(descriptor),
      packed = read.u32(descriptor + 20n),
      count = read.u32(descriptor + 24n);
    if (
      (flags & 31) !== 18 ||
      (flags & 0x80) !== 0 ||
      packed !== 0 ||
      count === 0
    )
      return null;
    const fieldDescriptor = local(descriptor + 16n);
    read.offset(fieldDescriptor, 16);
    // ReflectionRecords: enum kind 2, no superclass; exact no-payload records.
    if (
      read.u32(fieldDescriptor + 4n) !== 0 ||
      read.u32(fieldDescriptor + 8n) !== 0x000c0002 ||
      read.u32(fieldDescriptor + 12n) !== count
    )
      throw new RangeError(
        "Pure enum descriptor and reflection layout disagree",
      );
    read.offset(fieldDescriptor + 16n, count * 12);
    const observation: Fields["referenced_enums"][number] = {
      descriptor: read.location(descriptor),
      name: read.string(local(descriptor + 8n)),
      payload_cases: 0,
      empty_cases: count,
      field_descriptor: read.location(fieldDescriptor),
      cases: [],
      evidence: [
        ...read.evidence(descriptor, "Swift pure-enum case counts"),
        ...read.evidence(
          fieldDescriptor,
          "Exact no-payload enum reflection records",
        ),
      ],
    };
    for (let i = 0; i < count; i++) {
      if (!budget.admit()) throw new RangeError("max_records_reached");
      const record = fieldDescriptor + 16n + BigInt(i * 12);
      if (read.u32(record) !== 0 || read.u32(record + 4n) !== 0)
        throw new RangeError(
          "Pure enum reflection record has flags or a payload type",
        );
      observation.cases.push({
        ordinal: i,
        name: read.string(local(record + 8n)),
        record: read.location(record),
      });
    }
    enums.set(descriptor, observation);
    out.referenced_enums.push(observation);
    return observation;
  };
  // The ABI permits embedded NULs in symbolic displacements. Bound before
  // allocation and skip the whole symbolic payload, never read it as a C string.
  const mangling = (start: bigint) => {
    let length = 0;
    for (;;) {
      if (length >= 4096)
        throw new RangeError(
          "Metadata mangling exceeds 4096-byte reader limit",
        );
      const byte = read.u8(start + BigInt(length));
      const size =
        byte >= 1 && byte <= 0x17 ? 5 : byte >= 0x18 && byte <= 0x1f ? 9 : 1;
      if (length + size > 4096)
        throw new RangeError(
          "Metadata symbolic reference exceeds reader limit",
        );
      read.offset(start + BigInt(length), size);
      length += size;
      if (byte === 0) break;
    }
    if (
      !segments.some(
        (s) =>
          s.writable === false &&
          start >= s.address &&
          start + BigInt(length) <= s.address + s.size,
      )
    )
      throw new RangeError(
        "Symbolic field mangling is not wholly in a read-only mapped segment",
      );
    return bytes.subarray(
      read.offset(start, length),
      read.offset(start, length) + length,
    );
  };
  const functionType = (start: bigint, raw: Buffer): FunctionType => {
    let cursor = 0;
    const padding = () => {
      while (raw[cursor] === 0xff) cursor++;
    };
    const atom = (): Atom => {
      padding();
      const tag = raw[cursor];
      if (tag === 1 || tag === 2) {
        const field = start + BigInt(cursor + 1);
        cursor += 5;
        return nominal(local(field, tag === 2 ? "indirect" : "direct"));
      }
      for (const [token, name] of [
        ["Sb", "Bool"],
        ["Si", "Int"],
        ["Su", "UInt"],
        ["Sf", "Float"],
        ["Sd", "Double"],
        ["s5UInt8V", "UInt8"],
        ["s6UInt16V", "UInt16"],
        ["s6UInt32V", "UInt32"],
        ["s6UInt64V", "UInt64"],
        ["y", "Void"],
      ] as const) {
        if (
          raw.subarray(cursor, cursor + token.length).equals(Buffer.from(token))
        ) {
          cursor += token.length;
          return { kind: "builtin", name, descriptor: null };
        }
      }
      throw new RangeError(
        "Unsupported complete field function type: expected supported atomic type",
      );
    };
    const returned = atom(),
      parameter = atom();
    if (parameter.kind === "builtin" && parameter.name === "Void")
      throw new RangeError(
        "Zero-parameter function signatures are outside the single-argument lane",
      );
    padding();
    const sendable = raw[cursor] === 0x59 && raw[cursor + 1] === 0x62;
    if (sendable) cursor += 2;
    padding();
    if (
      raw[cursor] !== 0x63 ||
      raw[cursor + 1] !== 0 ||
      cursor + 2 !== raw.length
    )
      throw new RangeError(
        "Unsupported complete field function type: annotations, convention, tuple/generic shape or trailing operators",
      );
    const enumType =
      parameter.descriptor?.address === null || parameter.descriptor === null
        ? null
        : pureEnum(BigInt(parameter.descriptor.address));
    return {
      argument_abi: {
        status: "unresolved",
        reason:
          "Reflection does not establish layout resilience or abstraction lowering; direct value versus indirect address passing requires separate evidence",
      },
      convention: "swift-thick",
      sendable,
      result: returned,
      parameter,
      declared_argument_domain:
        enumType === null
          ? null
          : {
              enum_descriptor: enumType.descriptor,
              lower_inclusive: 0,
              upper_exclusive: enumType.empty_cases,
              premise:
                "Valid value of this declared field's exact enum parameter; no invocation or helper-global type is established",
            },
    };
  };
  try {
    if (firstMatch === undefined)
      throw new RangeError(
        out.unresolved_index_entries === 0
          ? "Selected descriptor is not indexed; no field declaration decoded"
          : "Selected indexed identity was not established; unresolved entries prevent absence claims",
      );
    local(
      firstMatch,
      (read.u32(firstMatch) & 3) === 1 ? "indirectable" : "direct",
    );
    if (!budget.admit()) throw new RangeError("max_records_reached");
    const owner = nominal(address),
      kind = read.u32(address) & 31;
    out.descriptor = owner.descriptor;
    out.name = owner.name;
    out.kind = kind === 17 ? "struct" : "enum";
    const fieldDescriptor = local(address + 16n);
    out.field_descriptor = read.location(fieldDescriptor);
    read.offset(fieldDescriptor, 16);
    const layout = read.u32(fieldDescriptor + 8n),
      count = read.u32(fieldDescriptor + 12n);
    out.declared_field_count = count;
    if (
      layout !== (kind === 17 ? 0x000c0000 : 0x000c0002) ||
      read.u32(fieldDescriptor + 4n) !== 0
    )
      throw new RangeError(
        "Unsupported field reflection kind/record stride/superclass",
      );
    if (kind === 17 && read.u32(address + 20n) !== count)
      throw new RangeError(
        "Struct descriptor and reflection field counts disagree",
      );
    read.offset(fieldDescriptor + 16n, count * 12);
    for (let i = 0; i < count; i++) {
      if (!budget.admit()) throw new RangeError("max_records_reached");
      const record = fieldDescriptor + 16n + BigInt(i * 12);
      const field: Fields["fields"][number] = {
        ordinal: i,
        record: read.location(record),
        flags: read.u32(record),
        name: null,
        type_location: null,
        mangling_hex: null,
        function_type: null,
        decode: decoded,
        evidence: read.evidence(
          record,
          "Swift reflection field declaration; ordinal is not an instance offset",
        ),
      };
      out.fields.push(field);
      try {
        field.name = read.string(local(record + 8n));
        if (kind === 17 && (field.flags & ~2) !== 0)
          throw new RangeError("Unsupported struct field flags");
        if (read.u32(record + 4n) === 0) {
          if (kind === 17)
            throw new RangeError("Struct field type reference is null");
          continue; // Enum cases may have no payload type.
        }
        const start = local(record + 4n);
        field.type_location = read.location(start);
        const raw = mangling(start);
        field.mangling_hex = raw.toString("hex");
        field.function_type = functionType(start, raw);
      } catch (cause) {
        field.decode = { status: "unsupported", reason: reason(cause) };
      }
    }
  } catch (cause) {
    out.decode = { status: "partial", reason: reason(cause) };
  }
  const incomplete = out.fields.filter(
    (f) => f.decode.status !== "decoded",
  ).length;
  if (out.unresolved_index_entries > 0 || budget.truncated || incomplete > 0)
    out.decode = {
      status: "partial",
      reason: [
        out.decode.reason,
        ...(out.unresolved_index_entries > 0
          ? ["type_index_identities_unresolved"]
          : []),
        ...(budget.truncated ? ["max_records_reached"] : []),
        ...(incomplete > 0 ? [`${incomplete} field types unsupported`] : []),
      ]
        .filter(Boolean)
        .join("; "),
    };
  return {
    facet: "swift_type_fields",
    status: out.decode.status === "decoded" ? "complete" : "partial",
    reason:
      out.decode.reason ??
      "Coverage is limited to this exact indexed nominal declaration; invocation type/origin remains unproved",
    examined: out.fields.length,
    decoded: out.fields.filter((f) => f.decode.status === "decoded").length,
  };
};
