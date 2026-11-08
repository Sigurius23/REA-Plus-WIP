import type {
  NativeDispatchFacet,
  ObjcSwiftMetadata,
} from "../domain/native/objcSwiftMetadata.js";
import type { PointerFixups } from "./AppleMachoFixups.js";
import type { DecodeIssue } from "./AppleDispatchDecodeFacts.js";
import type { FacetDecodeFacts } from "./AppleDispatchDecodeFacts.js";

const describeFixups = (fixups: PointerFixups): string => {
  const unread =
    fixups.unreadRebaseBytes > 0
      ? `LC_DYLD_INFO rebase opcodes were not decoded (${fixups.unreadRebaseBytes} bytes)`
      : undefined;
  const kind =
    fixups.kind === "chained"
      ? `chained fixups: ${fixups.formats.join(", ") || "no fixup segments"}`
      : fixups.kind === "dyld-info"
        ? "LC_DYLD_INFO bind opcodes"
        : unread === undefined
          ? "no fixup load commands"
          : undefined;
  return [unread, kind].filter((line) => line !== undefined).join("; ");
};

/** Append the per-facet coverage of one Apple dispatch metadata decode. */
export const pushDispatchCoverage = (input: {
  readonly result: ObjcSwiftMetadata;
  readonly facet: NativeDispatchFacet;
  readonly failures: readonly string[];
  readonly categoryIssues: readonly DecodeIssue[];
  readonly examined: number;
  readonly categoriesExamined: number;
  readonly truncated: {
    readonly objc: boolean;
    readonly objcCategories: boolean;
    readonly swift: boolean;
    readonly vtables: boolean;
  };
  readonly fixups: PointerFixups;
  readonly vtables: FacetDecodeFacts;
  readonly swift: FacetDecodeFacts;
  readonly resilient?: FacetDecodeFacts;
  readonly templates?: FacetDecodeFacts;
}): void => {
  const {
    result,
    facet,
    failures,
    categoryIssues,
    examined,
    categoriesExamined,
    truncated,
    fixups,
    vtables,
    swift,
    resilient,
    templates,
  } = input;
  const objcRequested = facet === "all" || facet === "objc";
  const swiftRequested = facet === "all" || facet === "swift-conformances";
  const vtablesRequested = facet === "all" || facet === "swift-vtables";
  const conformanceSelection = result.swift_conformance_selection;
  const discovery = result.swift_conformance_discovery;
  const selectionMatched =
    conformanceSelection?.matched !== false &&
    (discovery?.unresolved ?? 0) === 0;
  const selectionScope =
    conformanceSelection === undefined
      ? []
      : [
          conformanceSelection.matched
            ? "Coverage is limited to the selected indexed conformance descriptor"
            : "Selected conformance descriptor is not indexed in __swift5_proto; no descriptor was decoded",
        ];
  if (discovery !== undefined)
    selectionScope.push(
      "Coverage is limited to conformances matching the exact local metadata name filter",
      ...(discovery.unresolved > 0
        ? ["conformance_filter_identities_unresolved"]
        : []),
    );
  const anyTruncated = Object.values(truncated).some(Boolean);
  const relativePointers = [
    ...result.relative_pointers,
    ...(discovery?.unresolved_records.flatMap(
      ({ relative_pointers }) => relative_pointers,
    ) ?? []),
  ];
  result.coverage.push(
    objcRequested
      ? {
          facet: "objc_class_method_ivar_metadata",
          status:
            failures.length > 0 || truncated.objc ? "partial" : "complete",
          reason:
            [
              ...failures,
              ...(truncated.objc ? ["max_records_reached"] : []),
            ].join("; ") || null,
          examined,
          decoded: result.objc_classes.length,
        }
      : notRequested("objc_class_method_ivar_metadata"),
  );
  result.coverage.push({
    facet: "binary_relative_pointers",
    status:
      anyTruncated ||
      relativePointers.some((item) => item.decode.status !== "decoded")
        ? "partial"
        : "complete",
    reason: anyTruncated
      ? "max_records_reached"
      : relativePointers.some((item) => item.decode.status !== "decoded")
        ? "relative_pointer_targets_unresolved"
        : null,
    examined: relativePointers.length,
    decoded: relativePointers.filter((item) => item.decode.status === "decoded")
      .length,
  });
  const categoryFailures = categoryIssues.map(
    ({ code, location, message }) =>
      `${code}${location === undefined ? "" : ` at ${location}`}: ${message}`,
  );
  result.coverage.push(
    objcRequested
      ? {
          facet: "objc_properties_categories",
          status:
            truncated.objcCategories ||
            categoryFailures.length > 0 ||
            result.objc_categories.some(
              ({ decode }) => decode.status !== "decoded",
            )
              ? "partial"
              : "complete",
          reason:
            [
              ...categoryFailures,
              ...(truncated.objcCategories ? ["max_records_reached"] : []),
            ].join("; ") || null,
          examined: categoriesExamined,
          decoded: result.objc_categories.filter(
            ({ decode }) => decode.status === "decoded",
          ).length,
        }
      : notRequested("objc_properties_categories"),
  );
  const fixupReason = [
    describeFixups(fixups),
    ...fixups.issues.map(
      ({ code, location, message }) =>
        `${code}${location === undefined ? "" : ` at ${location}`}: ${message}`,
    ),
  ]
    .filter((line) => line.length > 0)
    .join("; ");
  result.coverage.push({
    facet: "pointer_fixups",
    status:
      fixups.issues.length > 0 || fixups.unreadRebaseBytes > 0
        ? "partial"
        : fixups.examined === 0
          ? "unsupported"
          : "complete",
    reason: fixupReason.length > 0 ? fixupReason : null,
    examined: fixups.examined,
    decoded: fixups.issues.length > 0 ? 0 : fixups.examined,
  });
  result.coverage.push(
    facet !== "objc"
      ? {
          facet: "swift_generic_resilient_witnesses_overrides_async_coroutines",
          status: "unsupported",
          reason:
            "Static resilient pairs and witness templates have separate coverage; generic/resilient runtime witness-table instantiation and ordering, overrides, async/coroutine execution and other unsupported Swift layouts are not decoded",
          examined: 0,
          decoded: 0,
        }
      : notRequested(
          "swift_generic_resilient_witnesses_overrides_async_coroutines",
        ),
  );
  result.coverage.push(
    ...(discovery === undefined
      ? []
      : [
          {
            facet: "swift_conformance_index_discovery",
            status:
              discovery.unresolved === 0 &&
              discovery.examined === discovery.index_entries
                ? ("complete" as const)
                : ("partial" as const),
            reason:
              discovery.unresolved === 0
                ? null
                : `${String(discovery.unresolved)} index identities could not be classified against the filter; ${String(discovery.unresolved_records.length)} unresolved records retained within max_records`,
            examined: discovery.examined,
            decoded: discovery.examined - discovery.unresolved,
          },
        ]),
    swiftRequested
      ? {
          facet: "swift_conformances_static_witness_slots",
          status:
            swift.exhaustive &&
            selectionMatched &&
            !truncated.swift &&
            !result.swift_conformances.some(
              ({ decode }) => decode.status !== "decoded",
            ) &&
            !result.swift_dispatch_slots.some(
              ({ table_kind, decode }) =>
                table_kind === "witness_table" && decode.status !== "decoded",
            )
              ? "complete"
              : "partial",
          reason:
            [
              ...selectionScope,
              ...swift.issues.map(formatIssue),
              ...(truncated.swift ? ["max_records_reached"] : []),
              ...(result.swift_conformances.some(
                ({ decode }) => decode.status !== "decoded",
              ) ||
              result.swift_dispatch_slots.some(
                ({ table_kind, decode }) =>
                  table_kind === "witness_table" && decode.status !== "decoded",
              )
                ? ["swift_records_unresolved"]
                : []),
            ].join("; ") || null,
          examined: swift.examined,
          decoded: swift.decoded,
        }
      : notRequested("swift_conformances_static_witness_slots"),
  );
  result.coverage.push(
    swiftRequested && resilient !== undefined
      ? {
          facet: "swift_resilient_witness_records",
          status:
            resilient.exhaustive && selectionMatched && !truncated.swift
              ? "complete"
              : "partial",
          reason:
            [
              ...selectionScope,
              ...resilient.issues.map(formatIssue),
              ...(truncated.swift ? ["max_records_reached"] : []),
            ].join("; ") || null,
          examined: resilient.examined,
          decoded: resilient.decoded,
        }
      : notRequested("swift_resilient_witness_records"),
  );
  result.coverage.push(
    swiftRequested && templates !== undefined
      ? {
          facet: "swift_witness_template_records",
          status:
            templates.exhaustive && selectionMatched && !truncated.swift
              ? "complete"
              : "partial",
          reason:
            [
              ...selectionScope,
              ...templates.issues.map(formatIssue),
              ...(truncated.swift ? ["max_records_reached"] : []),
            ].join("; ") || null,
          examined: templates.examined,
          decoded: templates.decoded,
        }
      : notRequested("swift_witness_template_records"),
  );
  result.coverage.push(
    vtablesRequested
      ? {
          facet: "swift_class_vtable_descriptors",
          status:
            vtables.exhaustive &&
            !truncated.vtables &&
            !result.swift_dispatch_slots.some(
              ({ table_kind, decode }) =>
                table_kind === "class_vtable" && decode.status !== "decoded",
            )
              ? "complete"
              : "partial",
          reason:
            [
              ...vtables.issues.map(formatIssue),
              ...(truncated.vtables ? ["max_records_reached"] : []),
              ...(result.swift_dispatch_slots.some(
                ({ table_kind, decode }) =>
                  table_kind === "class_vtable" && decode.status !== "decoded",
              )
                ? ["vtable_implementations_unresolved"]
                : []),
            ].join("; ") || null,
          examined: vtables.examined,
          decoded: vtables.decoded,
        }
      : notRequested("swift_class_vtable_descriptors"),
  );
};

const formatIssue = ({ code, location, message }: DecodeIssue): string =>
  `${code}${location === undefined ? "" : ` at ${location}`}: ${message}`;

const notRequested = (facet: string) => ({
  facet,
  status: "not_requested" as const,
  reason: null,
  examined: 0,
  decoded: 0,
});
