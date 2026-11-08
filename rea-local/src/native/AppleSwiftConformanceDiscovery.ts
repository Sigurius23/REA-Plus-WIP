import type {
  NativeSwiftConformanceFilter,
  ObjcSwiftMetadata,
} from "../domain/native/objcSwiftMetadata.js";
import type { Section } from "./AppleMachoSelection.js";
import type {
  createSwiftRelativeReader,
  DispatchRecordBudget,
  SwiftDispatchReaders,
} from "./AppleSwiftDispatchFacets.js";

/** Scan identity fields without admitting unrelated witness/relative-pointer records. */
export const discoverSwiftConformances = (input: {
  sections: readonly Section[];
  read: SwiftDispatchReaders;
  relative: ReturnType<typeof createSwiftRelativeReader>;
  filter: NativeSwiftConformanceFilter;
  maxRecords: number;
  result: ObjcSwiftMetadata;
}) => {
  const { sections, read, relative, filter, maxRecords, result } = input;
  const summary = {
    filter,
    index_entries: 0,
    examined: 0,
    matched: 0,
    admitted: 0,
    unresolved: 0,
    unresolved_records: [] as NonNullable<
      ObjcSwiftMetadata["swift_conformance_discovery"]
    >["unresolved_records"],
  };
  result.swift_conformance_discovery = summary;
  const probe = (field: bigint) => {
    const pointers: ReturnType<typeof relative.inspect>["record"][] = [];
    const reasons: string[] = [];
    const resolve: typeof relative.inspect = (address, mode) => {
      const observation = relative.inspect(address, mode);
      pointers.push(observation.record);
      return observation;
    };
    let descriptor: bigint | null = null;
    let protocolName: string | null = null;
    let typeName: string | null = null;
    const name = (
      address: bigint,
      mode: "indirectable" | "indirect" | "direct",
      kinds: readonly number[],
    ): string => {
      const { target } = resolve(address, mode);
      if (target.kind !== "local")
        throw new TypeError(
          target.kind === "external"
            ? `External metadata name is unknown: ${target.reference.symbol}`
            : target.reason,
        );
      if (target.address === 0n)
        throw new TypeError("Missing metadata descriptor");
      if (!kinds.includes(read.u32(target.address) & 31))
        throw new TypeError("Unsupported metadata descriptor kind");
      const stringTarget = resolve(target.address + 8n).target;
      if (stringTarget.kind !== "local" || stringTarget.address === 0n)
        throw new TypeError("Metadata name pointer is unresolved");
      return read.string(stringTarget.address);
    };
    const attempt = (decode: () => void) => {
      try {
        decode();
      } catch (cause) {
        reasons.push(cause instanceof Error ? cause.message : String(cause));
      }
    };
    try {
      const target = resolve(field).target;
      if (target.kind !== "local" || target.address === 0n)
        throw new TypeError("Conformance index entry is unresolved or null");
      descriptor = target.address;
    } catch (cause) {
      reasons.push(cause instanceof Error ? cause.message : String(cause));
    }
    if (descriptor !== null) {
      const address = descriptor;
      attempt(() => {
        protocolName = name(address, "indirectable", [3]);
      });
      attempt(() => {
        const typeKind = (read.u32(address + 12n) >>> 3) & 7;
        if (typeKind !== 0 && typeKind !== 1)
          throw new TypeError("Unsupported conformance type-reference kind");
        typeName = name(
          address + 4n,
          typeKind === 1 ? "indirect" : "direct",
          [16, 17, 18],
        );
      });
    }
    const names = { protocol_name: protocolName, type_name: typeName };
    const constraints = Object.entries(filter).filter(
      ([, value]) => value !== null,
    );
    const mismatch = constraints.some(([key, value]) => {
      const observed = names[key as keyof typeof names];
      return observed !== null && observed !== value;
    });
    const unresolved = constraints.some(
      ([key]) => names[key as keyof typeof names] === null,
    );
    return {
      state: mismatch ? "excluded" : unresolved ? "unresolved" : "matched",
      record: {
        index_entry: read.location(field),
        conformance_address:
          descriptor === null ? null : `0x${descriptor.toString(16)}`,
        ...names,
        relative_pointers: pointers,
        reason: reasons.join("; "),
        evidence: read.evidence(field, "Swift conformance identity index scan"),
      },
    };
  };
  // At least one admission is needed per matching descriptor or unresolved row.
  // Bound retained selectors by that existing caller budget, while still counting
  // the complete index. Never allocate one output object per unrelated entry.
  const matches = new Set<bigint>();
  const unknown: bigint[] = [];
  for (const section of sections.filter(
    ({ name }) => name === "__swift5_proto",
  )) {
    if (section.size % 4 !== 0)
      throw new RangeError("Misaligned Swift conformance section");
    summary.index_entries += section.size / 4;
    for (let index = 0; index < section.size / 4; index++) {
      const field = section.address + BigInt(index * 4);
      const { state } = probe(field);
      summary.examined++;
      if (state === "matched") {
        summary.matched++;
        if (matches.size < maxRecords) matches.add(field);
      } else if (state === "unresolved") {
        summary.unresolved++;
        if (unknown.length < maxRecords) unknown.push(field);
      }
    }
  }
  return {
    matches,
    retainUnresolved: (budget: DispatchRecordBudget) => {
      // Known matches get decode admission before uncertain identities.
      for (const field of unknown) {
        if (!budget.admit()) break;
        const { record } = probe(field);
        record.relative_pointers = record.relative_pointers.filter(() =>
          budget.admit(),
        );
        summary.unresolved_records.push(record);
      }
      if (
        summary.admitted < summary.matched ||
        summary.unresolved_records.length < summary.unresolved
      )
        budget.markTruncated();
    },
  };
};
