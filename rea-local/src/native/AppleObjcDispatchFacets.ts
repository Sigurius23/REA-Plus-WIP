import type { ObjcSwiftMetadata } from "../domain/native/objcSwiftMetadata.js";
import type { Segment, Section } from "./AppleMachoSelection.js";
import { boundClassName, decodeObjcCategories } from "./AppleObjcCategories.js";
import { readObjcPropertiesOf } from "./AppleObjcProperties.js";
import { issue, type DecodeIssue } from "./AppleDispatchDecodeFacts.js";
import { createObjcProtocolReader } from "./AppleObjcProtocols.js";
import type {
  BinaryMetadataEvidence,
  DispatchRecordBudget,
  ResolvedMetadataLocation,
} from "./AppleSwiftDispatchFacets.js";

/** Byte readers shared by Objective-C class/method/ivar decode facets. */
export interface ObjcDispatchReaders {
  u32(address: bigint): number;
  /** Plain 64-bit data, never a fixup. */
  u64(address: bigint): bigint;
  i32(address: bigint): number;
  pointer(address: bigint): bigint;
  /** The symbol a pointer at `address` is bound to, when it is a bind fixup. */
  bound(
    address: bigint,
  ): { readonly symbol: string; readonly library: string | null } | undefined;
  string(address: bigint): string;
  location(address: bigint): ResolvedMetadataLocation;
  evidence(address: bigint, description: string): BinaryMetadataEvidence;
  offset(address: bigint, size?: number): number;
}

const hex = (value: bigint) => `0x${value.toString(16)}`;
const decoded = { status: "decoded" as const, reason: null };

/** Name of a class defined in this image, from its class_ro_t. */
const localClassName = (read: ObjcDispatchReaders, address: bigint): string =>
  read.string(read.pointer((read.pointer(address + 32n) & ~7n) + 24n));

/**
 * Resolve a class's superclass: a bind to `_OBJC_CLASS_$_Name` names a class
 * in another image; otherwise the pointer is a class_t in this image.
 */
const resolveSuperclass = (
  read: ObjcDispatchReaders,
  address: bigint,
  className: string,
  failures: string[],
): { name: string | null; address: string | null } => {
  const external = boundClassName(read, address + 8n);
  if (external !== undefined) return { name: external, address: null };
  const superclass = read.pointer(address + 8n);
  if (superclass === 0n) return { name: null, address: null };
  try {
    return { name: localClassName(read, superclass), address: hex(superclass) };
  } catch (cause: unknown) {
    // Superclass resolution failure is recorded; the cause adds no identity.
    void cause;
    failures.push(
      `Superclass pointer ${hex(superclass)} of ${className} requires unsupported binding/fixup resolution`,
    );
    return { name: null, address: hex(superclass) };
  }
};

/** Decode Objective-C protocol lists, classlists, methods, and ivars into `result`. */
export const decodeObjcDispatchFacets = (input: {
  bytes: Buffer;
  sections: readonly Section[];
  segments: readonly Segment[];
  readers: ObjcDispatchReaders;
  budget: DispatchRecordBudget;
  propertyBudget: DispatchRecordBudget;
  result: ObjcSwiftMetadata;
  className?: string;
}): {
  failures: string[];
  categoryIssues: DecodeIssue[];
  examined: number;
  categoriesExamined: number;
  classTruncated: boolean;
  categoriesTruncated: boolean;
} => {
  const {
    bytes,
    sections,
    segments,
    readers: read,
    propertyBudget,
    result,
  } = input;
  let budget = input.budget;
  const failures: string[] = [];
  const categoryIssues: DecodeIssue[] = [];
  const classSections = sections.filter(
    ({ name }) => name === "__objc_classlist",
  );
  const selection =
    input.className === undefined
      ? undefined
      : {
          name: input.className,
          index_entries: 0,
          examined: 0,
          matching_index_entries: 0,
          matched: false,
          unresolved: 0,
          admitted_classes: 0,
        };
  // Identity discovery is independent of decode admission. Do not retain an
  // unbounded match list: the decode pass rereads immutable selected entries.
  const indexedClass = (field: bigint) => {
    const address = read.pointer(field);
    const ro = read.pointer(address + 32n) & ~7n;
    if (address === 0n || (read.u32(ro) & 1) !== 0)
      throw new RangeError("Class index does not name a local non-metaclass");
    return { address, name: read.string(read.pointer(ro + 24n)) };
  };
  if (selection !== undefined) {
    result.objc_class_selection = selection;
    for (const section of classSections) {
      if (section.size % 8 !== 0)
        throw new RangeError("Misaligned Objective-C class-list size");
      // Validate the entire extent before any full-index enumeration.
      if (section.size > 0) read.offset(section.address, section.size);
      for (let index = 0; index < section.size / 8; index++) {
        selection.index_entries++;
        selection.examined++;
        try {
          if (
            indexedClass(section.address + BigInt(index * 8)).name ===
            selection.name
          )
            selection.matching_index_entries++;
        } catch {
          selection.unresolved++;
        }
      }
    }
    selection.matched = selection.matching_index_entries > 0;
  }
  let examined = 0;
  const methods = (
    list: bigint,
    className: string,
    methodType: "instance" | "class",
    category?: string,
  ): string[] => {
    const selectors: string[] = [];
    if (list === 0n) return selectors;
    const flags = read.u32(list),
      count = read.u32(list + 4n),
      relative = (flags & 0x80000000) !== 0;
    const stride = flags & 0xfffc;
    if (stride !== (relative ? 12 : 24))
      throw new TypeError(`Unsupported method stride/flags at ${hex(list)}`);
    for (let index = 0; index < count; index++) {
      if (!budget.admit()) break;
      const entry = list + 8n + BigInt(index * stride);
      const rel = (field: bigint) => {
        const displacement = bytes.readInt32LE(read.offset(field, 4));
        const target = field + BigInt(displacement);
        let fileOffset: number | null = null;
        try {
          fileOffset = read.offset(target);
        } catch (cause: unknown) {
          // best-effort cleanup: serialized target remains unresolved.
          void cause;
        }
        if (budget.admit())
          result.relative_pointers.push({
            field: read.location(field),
            target: { address: hex(target), file_offset: fileOffset },
            displacement,
            indirectable: false,
            indirect: false,
            decode:
              fileOffset === null
                ? { status: "partial", reason: "relative_target_unmapped" }
                : decoded,
            evidence: read.evidence(
              field,
              "Signed-relative Objective-C method-list pointer",
            ),
          });
        return target;
      };
      let selectorAddress = relative ? rel(entry) : read.pointer(entry);
      if (relative && (flags & 0x40000000) === 0)
        selectorAddress = read.pointer(selectorAddress);
      const implementation = relative
        ? rel(entry + 8n)
        : read.pointer(entry + 16n);
      let implementationLocation: {
        address: string;
        file_offset: number;
      } | null = null;
      try {
        if (
          !segments.some(
            (segment) =>
              segment.executable &&
              implementation >= segment.address &&
              implementation < segment.address + segment.size,
          )
        )
          throw new RangeError(
            "Method implementation is not in an executable segment",
          );
        implementationLocation = read.location(implementation);
      } catch (cause: unknown) {
        // best-effort cleanup: external/chained pointers remain unresolved.
        void cause;
      }
      const selector = read.string(selectorAddress);
      selectors.push(selector);
      result.objc_dispatch_implementations.push({
        class_name: className,
        selector,
        method_type: methodType,
        ...(category === undefined ? {} : { category }),
        implementation_address: implementationLocation?.address ?? null,
        location: read.location(entry),
        decode:
          implementationLocation === null
            ? {
                status: "partial",
                reason: "implementation_pointer_unmapped_or_encoded",
              }
            : decoded,
        evidence: read.evidence(
          entry,
          relative
            ? "Encoded relative Objective-C method entry"
            : "Encoded absolute Objective-C method entry",
        ),
      });
    }
    return selectors;
  };
  const protocolReader = createObjcProtocolReader({
    readers: {
      u32: read.u32,
      pointer: read.pointer,
      string: read.string,
      location: read.location,
      evidence: read.evidence,
      admit: () => budget.admit(),
      i32: read.i32,
      u64: read.u64,
    },
    result,
    failures,
  });
  for (const section of sections.filter(
    ({ name }) => name === "__objc_protolist" && selection === undefined,
  )) {
    if (section.size % 8 !== 0)
      throw new RangeError("Misaligned Objective-C protocol list");
    for (let index = 0; index < section.size / 8; index++) {
      if (budget.isFull()) {
        budget.markTruncated();
        break;
      }
      protocolReader.record(read.pointer(section.address + BigInt(index * 8)));
    }
  }
  const visited = new Set<string>();
  const readClass = (address: bigint, meta = false) => {
    if (address === 0n || visited.has(hex(address))) return;
    if (!budget.admit()) {
      // The properties of an unexamined class/metaclass remain unknown too.
      propertyBudget.markTruncated();
      return;
    }
    visited.add(hex(address));
    const ro = read.pointer(address + 32n) & ~7n;
    const name = read.string(read.pointer(ro + 24n));
    const root = (read.u32(ro) & 2) !== 0;
    const superclass = resolveSuperclass(read, address, name, failures);
    if (superclass.name === null && superclass.address === null && !root)
      failures.push(
        `Superclass of ${name} requires external binding resolution`,
      );
    const ivarList = read.pointer(ro + 48n);
    let ivarCount: number | null = meta ? null : 0;
    if (ivarList !== 0n && !meta) {
      const stride = read.u32(ivarList),
        count = read.u32(ivarList + 4n);
      if (stride !== 32)
        throw new TypeError("Unsupported Objective-C ivar entry size");
      ivarCount = count;
      for (let index = 0; index < count; index++) {
        if (!budget.admit()) break;
        const entry = ivarList + 8n + BigInt(index * stride);
        const encodedOffset = read.pointer(entry);
        let value: number | null = null;
        try {
          value = read.u32(encodedOffset);
        } catch (cause: unknown) {
          // Unresolved offsets are recorded; the cause adds no identity.
          void cause;
          failures.push(`Unresolved ivar offset pointer ${hex(encodedOffset)}`);
        }
        result.objc_ivars.push({
          class_name: name,
          name: read.string(read.pointer(entry + 8n)),
          type_encoding: read.string(read.pointer(entry + 16n)),
          offset: value,
          size: read.u32(entry + 28n),
          alignment:
            read.u32(entry + 24n) < 31 ? 2 ** read.u32(entry + 24n) : null,
          location: read.location(entry),
          decode:
            value === null
              ? { status: "partial", reason: "ivar_offset_pointer_unresolved" }
              : decoded,
          evidence: read.evidence(
            entry,
            "Objective-C ivar entry and encoded offset storage",
          ),
        });
      }
    }
    const implementationStart = result.objc_dispatch_implementations.length;
    methods(read.pointer(ro + 32n), name, meta ? "class" : "instance");
    result.objc_classes.push({
      name,
      super_class: superclass.name,
      is_meta_class: meta,
      is_root_class: root,
      methods: result.objc_dispatch_implementations
        .slice(implementationStart)
        .map((item) => ({
          selector: item.selector,
          method_type: item.method_type,
          address:
            item.implementation_address !== null &&
            BigInt(item.implementation_address) <=
              BigInt(Number.MAX_SAFE_INTEGER)
              ? Number(BigInt(item.implementation_address))
              : null,
          is_required: null,
          is_optional: null,
        })),
      properties: readObjcPropertiesOf(read, read.pointer(ro + 64n), {
        owner: name,
        admit: () => propertyBudget.admit(),
        issues: categoryIssues,
        location: hex(read.pointer(ro + 64n)),
      }),
      protocols: protocolReader.list(read.pointer(ro + 40n)),
      ivar_count: ivarCount,
      instance_size: read.u32(ro + 8n),
      location: read.location(address),
      superclass_address: superclass.address,
      metaclass_address: meta ? null : hex(read.pointer(address)),
      decode:
        superclass.name === null && !root
          ? { status: "partial", reason: "superclass_binding_unresolved" }
          : decoded,
      evidence: read.evidence(
        address,
        "Objective-C class and class_ro_t records",
      ),
    });
    if (!meta) {
      try {
        readClass(read.pointer(address), true);
      } catch (cause) {
        failures.push(
          `Metaclass of ${name}: ${cause instanceof Error ? cause.message : String(cause)}`,
        );
      }
    }
  };
  for (const section of classSections) {
    if (section.size % 8 !== 0)
      throw new RangeError("Misaligned Objective-C class-list size");
    for (let index = 0; index < section.size / 8; index++) {
      const field = section.address + BigInt(index * 8);
      let selectedAddress: bigint | undefined;
      if (selection !== undefined) {
        try {
          const candidate = indexedClass(field);
          if (
            candidate.name !== selection.name ||
            visited.has(hex(candidate.address))
          )
            continue;
          selectedAddress = candidate.address;
        } catch {
          // Already counted as an unresolved identity by the full scan.
          continue;
        }
      }
      if (budget.isFull()) {
        budget.markTruncated();
        propertyBudget.markTruncated();
        break;
      }
      examined++;
      if (selection !== undefined) selection.admitted_classes++;
      try {
        readClass(selectedAddress ?? read.pointer(field));
      } catch (cause) {
        failures.push(
          `${hex(field)}: ${cause instanceof Error ? cause.message : String(cause)}`,
        );
      }
    }
  }
  // Later category work must not change already established class coverage.
  const classFailures = [...failures];
  const classTruncated = budget.truncated;
  budget = propertyBudget;
  const categoryFailures: string[] = [];
  const categoriesExamined =
    selection === undefined
      ? decodeObjcCategories({
          sections,
          read,
          result,
          failures: categoryFailures,
          issues: categoryIssues,
          admit: () => budget.admit(),
          methods,
          protocols: (list) => protocolReader.list(list),
          localClassName: (address) => localClassName(read, address),
        })
      : 0;
  // The shared protocol reader reports caught dependency failures through its
  // original sink. They belong to the category phase, not completed classes.
  for (const failure of failures.slice(classFailures.length))
    categoryIssues.push(
      issue(
        "objc_properties_categories",
        "category_protocol_decode_failed",
        failure,
      ),
    );
  return {
    failures: classFailures,
    categoryIssues,
    examined,
    categoriesExamined,
    classTruncated,
    categoriesTruncated: propertyBudget.truncated,
  };
};
