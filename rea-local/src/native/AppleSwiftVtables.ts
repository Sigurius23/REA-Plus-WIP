import type {
  ObjcSwiftMetadata,
  NativeMetadataEvidence,
  NativeMetadataLocation,
} from "../domain/native/objcSwiftMetadata.js";
import { issue, type FacetDecodeFacts } from "./AppleDispatchDecodeFacts.js";
import type { createSwiftRelativeReader } from "./AppleSwiftDispatchFacets.js";

/** Byte readers shared with the validated Mach-O metadata boundary. */
export interface SwiftMetadataReaders {
  u32(address: bigint): number;
  relative(address: bigint): bigint;
  string(address: bigint): string;
  location(address: bigint): NativeMetadataLocation;
  evidence(address: bigint, description: string): NativeMetadataEvidence[];
  executable(address: bigint): boolean;
  admit(): boolean;
  markTruncated(): void;
}

/** Decode non-generic, non-resilient Swift class vtable descriptors without instantiating metadata. */
export const decodeSwiftClassVtables = (input: {
  readers: SwiftMetadataReaders;
  entries: Iterable<bigint>;
  result: ObjcSwiftMetadata;
  selection?: {
    address: bigint;
    maxRecords: number;
    inspect: ReturnType<typeof createSwiftRelativeReader>["inspect"];
  };
}): FacetDecodeFacts => {
  const { readers: read, result } = input;
  const failures: string[] = [];
  const issues = [] as ReturnType<typeof issue>[];
  let examined = 0;
  let decoded = 0;
  let entries = input.entries;
  let selectedDescriptor: bigint | undefined;
  const retainedIndexPointers: ObjcSwiftMetadata["relative_pointers"] = [];
  if (input.selection !== undefined) {
    const { address, maxRecords, inspect } = input.selection;
    const summary = {
      address: `0x${address.toString(16)}`,
      index_entries: 0,
      examined: 0,
      matching_index_entries: 0,
      matched: false,
      unresolved: 0,
    };
    result.swift_vtable_selection = summary;
    let firstMatch: bigint | undefined;
    let firstPointer:
      | ObjcSwiftMetadata["relative_pointers"][number]
      | undefined;
    let firstIndexFailure: ReturnType<typeof issue> | undefined;
    const unknown: ObjcSwiftMetadata["relative_pointers"] = [];
    // Scan identities before admitting a class or any unrelated pointer. Keep
    // only bounded aliases/unknowns; do not allocate once per full-index entry.
    for (const field of entries) {
      summary.index_entries++;
      summary.examined++;
      try {
        const referenceKind = read.u32(field) & 3;
        // Kinds 2/3 name Objective-C class references, not nominal descriptors.
        if (referenceKind >= 2) continue;
        const observation = inspect(
          field,
          referenceKind === 1 ? "indirectable" : "direct",
        );
        if (
          observation.target.kind !== "local" ||
          observation.target.address === 0n
        ) {
          summary.unresolved++;
          if (unknown.length < maxRecords) unknown.push(observation.record);
          continue;
        }
        if (observation.target.address !== address) continue;
        if ((read.u32(address) & 31) !== 16) continue;
        summary.matching_index_entries++;
        summary.matched = true;
        if (firstMatch === undefined) {
          firstMatch = field;
          firstPointer = observation.record;
        } else if (retainedIndexPointers.length < maxRecords) {
          retainedIndexPointers.push(observation.record);
        }
      } catch (cause) {
        summary.unresolved++;
        firstIndexFailure ??= issue(
          "swift_class_vtable_descriptors",
          "selected_class_index_unresolved",
          cause instanceof Error ? cause.message : String(cause),
          `0x${field.toString(16)}`,
        );
      }
    }
    if (firstMatch === undefined) {
      entries = [];
      issues.push(
        issue(
          "swift_class_vtable_descriptors",
          "selected_class_not_indexed",
          summary.unresolved === 0
            ? "Selected address is not an indexed nominal Swift class descriptor; no class was decoded"
            : "Selected class was not established; unresolved type-index entries prevent an absence claim",
          summary.address,
        ),
      );
    } else {
      entries = [firstMatch];
      selectedDescriptor = address;
      // The exact indexed identity has a retained source pointer before any
      // class slots. If that proof cannot be admitted, preserve a partial stop.
      if (firstPointer !== undefined && read.admit())
        result.relative_pointers.push(firstPointer);
      else entries = [];
    }
    retainedIndexPointers.push(...unknown);
    if (firstIndexFailure !== undefined) issues.push(firstIndexFailure);
    if (summary.unresolved > 0)
      issues.push(
        issue(
          "swift_class_vtable_descriptors",
          "selected_class_index_unresolved",
          `${summary.unresolved} type-index identities remain unresolved`,
        ),
      );
    if (
      summary.matching_index_entries > maxRecords + 1 ||
      summary.unresolved > maxRecords
    )
      read.markTruncated();
  }
  for (const field of entries) {
    if (!read.admit()) {
      failures.push("max_records_reached");
      issues.push(
        issue(
          "swift_class_vtable_descriptors",
          "record_budget_exhausted",
          "max_records_reached",
          `0x${field.toString(16)}`,
        ),
      );
      break;
    }
    examined++;
    try {
      const descriptor = selectedDescriptor ?? read.relative(field);
      const flags = read.u32(descriptor);
      if ((flags & 31) !== 16) continue;
      const specific = flags >>> 16;
      if ((flags & 0x80) !== 0 || (specific & 0x2000) !== 0)
        throw new TypeError(
          "Generic class or resilient superclass metadata is unsupported",
        );
      if ((specific & 0x8000) === 0) continue;
      const initialization = specific & 3;
      if (initialization === 3)
        throw new TypeError("Unknown metadata initialization kind");
      const header =
        descriptor +
        44n +
        BigInt(initialization === 1 ? 12 : initialization === 2 ? 4 : 0);
      const tableOffset = read.u32(header);
      const count = read.u32(header + 4n);
      const positiveWords = read.u32(descriptor + 28n);
      if (count > 20000 || tableOffset + count > positiveWords)
        throw new RangeError(
          "Swift vtable count or offset exceeds declared metadata bounds",
        );
      const owner = read.string(read.relative(descriptor + 8n));
      for (let index = 0; index < count; index++) {
        const entry = header + 8n + BigInt(index * 8);
        if (!read.admit()) {
          failures.push("max_records_reached");
          issues.push(
            issue(
              "swift_class_vtable_descriptors",
              "record_budget_exhausted",
              "max_records_reached",
              `0x${entry.toString(16)}`,
            ),
          );
          break;
        }
        const methodFlags = read.u32(entry);
        // Async slots reference async descriptors; coroutine and future kinds need separate decoders.
        const synchronous =
          (methodFlags & 0x40) === 0 && (methodFlags & 15) <= 3;
        const implementation = read.relative(entry + 4n);
        const resolved = synchronous && read.executable(implementation);
        result.swift_dispatch_slots.push({
          owner,
          table_kind: "class_vtable",
          slot_index: tableOffset + index,
          requirement: null,
          implementation: null,
          implementation_address: resolved
            ? `0x${implementation.toString(16)}`
            : null,
          thunk_address: null,
          location: read.location(entry),
          decode: resolved
            ? { status: "decoded", reason: null }
            : {
                status: "partial",
                reason:
                  "Async, coroutine, external or unmapped vtable implementation is unresolved",
              },
          evidence: read.evidence(
            entry,
            "Swift class vtable method descriptor; slot index is a metadata word offset, not a source method ordinal",
          ),
        });
        if (resolved) decoded++;
        else
          issues.push(
            issue(
              "swift_class_vtable_descriptors",
              "vtable_implementation_unresolved",
              "Async, coroutine, external or unmapped vtable implementation is unresolved",
              `0x${entry.toString(16)}`,
            ),
          );
      }
      if ((specific & 0x4000) !== 0) {
        failures.push(
          `${owner}: inherited override descriptors are unsupported`,
        );
        issues.push(
          issue(
            "swift_class_vtable_descriptors",
            "inherited_override_descriptors_unsupported",
            "Inherited override descriptors are unsupported",
            `0x${descriptor.toString(16)}`,
          ),
        );
      }
    } catch (cause) {
      const message = cause instanceof Error ? cause.message : String(cause);
      failures.push(`0x${field.toString(16)}: ${message}`);
      issues.push(
        issue(
          "swift_class_vtable_descriptors",
          "vtable_decode_failed",
          message,
          `0x${field.toString(16)}`,
        ),
      );
    }
  }
  for (const pointer of retainedIndexPointers) {
    if (!read.admit()) break;
    result.relative_pointers.push(pointer);
  }
  return {
    facet: "swift_class_vtable_descriptors",
    examined,
    decoded,
    exhaustive: issues.length === 0,
    issues,
  };
};
