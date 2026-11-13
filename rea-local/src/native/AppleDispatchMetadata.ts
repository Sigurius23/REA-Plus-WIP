import { createHash } from "node:crypto";
import {
  objcSwiftMetadataSchema,
  nativeDispatchMetadataResultSchema,
  type ObjcSwiftMetadata,
  type NativeDispatchFacet,
  type NativeSwiftConformanceFilter,
  nativeDispatchFileBudgetSchema,
} from "../domain/native/objcSwiftMetadata.js";
import type { BinaryTarget } from "../domain/binaryTargetTypes.js";
import {
  AnalysisCancelledError,
  AnalysisInputError,
  AnalysisResourceConstraintError,
  AnalysisUnsupportedTargetError,
} from "../domain/analysisErrorCore.js";
import { openRegularFile } from "../filesystem/RegularFile.js";
import { readBoundedFileBytes } from "../process/BoundedFileBytes.js";
import { EvidenceIntegrityError } from "../domain/evidenceErrors.js";
import { pushDispatchCoverage } from "./AppleDispatchCoverage.js";
import { parsePointerFixups } from "./AppleMachoFixups.js";
import { parseMachoLayout } from "./AppleMachoSelection.js";
import { decodeObjcDispatchFacets } from "./AppleObjcDispatchFacets.js";
import {
  createSwiftRelativeReader,
  decodeSwiftDispatchFacets,
  type DispatchRecordBudget,
} from "./AppleSwiftDispatchFacets.js";
import { decodeSwiftClassVtables } from "./AppleSwiftVtables.js";
import { createSwiftResilientWitnessReader } from "./AppleSwiftResilientWitnesses.js";
import { createSwiftConformanceTailReader } from "./AppleSwiftConformanceTail.js";
import { createSwiftWitnessTemplateReader } from "./AppleSwiftWitnessTemplates.js";

/** Decode validated little-endian 64-bit Apple Objective-C metadata without loading target code. */
export const decodeAppleDispatchMetadata = (
  bytes: Buffer,
  maxRecords: number,
  provenance: { path: string; sha256: string },
  selection: {
    readonly architecture?: string;
    readonly facet?: NativeDispatchFacet;
    readonly swiftConformanceAddress?: string;
    readonly swiftConformanceFilter?: NativeSwiftConformanceFilter;
    readonly swiftClassAddress?: string;
  } = {},
): ObjcSwiftMetadata => {
  const {
    architecture = "arm64",
    facet = "all",
    swiftConformanceAddress,
    swiftConformanceFilter,
    swiftClassAddress,
  } = selection;
  if (
    swiftClassAddress !== undefined &&
    (facet !== "swift-vtables" ||
      swiftConformanceAddress !== undefined ||
      swiftConformanceFilter !== undefined)
  )
    throw new AnalysisInputError(
      "inspect_native_dispatch_metadata",
      undefined,
      [
        {
          path: ["swift_class_address"],
          reason: "invalid_value",
          message:
            "Class selection requires facet swift-vtables and cannot combine with conformance selectors.",
        },
      ],
    );
  if (
    (swiftConformanceAddress !== undefined ||
      swiftConformanceFilter !== undefined) &&
    (facet !== "swift-conformances" ||
      (swiftConformanceAddress !== undefined &&
        swiftConformanceFilter !== undefined))
  )
    throw new AnalysisInputError(
      "inspect_native_dispatch_metadata",
      undefined,
      [
        {
          path: [
            swiftConformanceFilter === undefined
              ? "swift_conformance_address"
              : "swift_conformance_filter",
          ],
          reason: "invalid_value",
          message:
            "Conformance selection requires facet swift-conformances and either an address or a name filter, not both.",
        },
      ],
    );
  const layout = parseMachoLayout(bytes, architecture);
  const { segments, sections, offset } = layout;
  const invalidIndex = (reason: string, cause?: unknown) =>
    new AnalysisUnsupportedTargetError(
      "inspect_native_dispatch_metadata",
      provenance.path,
      reason,
      {
        cause,
        remediationAction:
          "Select an intact Mach-O artifact whose Swift index fits one file-backed mapped range. Unchanged artifact bytes reproduce this failure.",
      },
    );
  // Selection may scan an entire index before spending decode admission.
  // Validate that extent once, before either full-index reader can enumerate
  // it; per-entry catch/recovery must not amplify a bogus section size.
  for (const section of sections) {
    const requested =
      (section.name === "__swift5_types" &&
        (facet === "all" || facet === "swift-vtables")) ||
      (section.name === "__swift5_proto" &&
        (facet === "all" || facet === "swift-conformances"));
    if (!requested || section.size === 0) continue;
    if (section.address % 4n !== 0n || section.size % 4 !== 0)
      throw invalidIndex(`Misaligned Swift metadata index ${section.name}`);
    if (section.address + BigInt(section.size) > 1n << 64n)
      throw invalidIndex(
        `Swift metadata index ${section.name} wraps its address space`,
      );
    try {
      offset(section.address, section.size);
    } catch (cause) {
      throw invalidIndex(
        `Swift metadata index ${section.name} must lie wholly within one file-backed mapped range`,
        cause,
      );
    }
  }
  const fixups = parsePointerFixups(
    bytes,
    layout.fixups,
    segments,
    layout.baseAddress,
  );
  const u32 = (address: bigint) => bytes.readUInt32LE(offset(address, 4));
  const decodePointer = (address: bigint) =>
    fixups.decode(address, bytes.readBigUInt64LE(offset(address, 8)));
  /** Rebased target of a pointer; a bind to another image reads as 0. */
  const pointer = (address: bigint) => {
    const decodedPointer = decodePointer(address);
    return decodedPointer.kind === "rebase" ? decodedPointer.target : 0n;
  };
  const bound = (address: bigint) => {
    const decodedPointer = decodePointer(address);
    return decodedPointer.kind === "bind" ? decodedPointer : undefined;
  };
  const location = (address: bigint) => ({
    address: `0x${address.toString(16)}`,
    file_offset: offset(address),
  });
  const evidence = (address: bigint, description: string) => [
    {
      kind: "binary_metadata" as const,
      description,
      location: location(address),
      artifact_path: provenance.path,
      artifact_sha256: provenance.sha256,
    },
  ];
  const string = (address: bigint) => {
    const start = offset(address);
    let end = start;
    while (end < bytes.length && end - start < 4096 && bytes[end] !== 0) end++;
    if (end === bytes.length || end - start >= 4096)
      throw new RangeError("Unterminated or oversized metadata string");
    offset(address, end - start + 1);
    return new TextDecoder("utf-8", { fatal: true }).decode(
      bytes.subarray(start, end),
    );
  };
  const result = objcSwiftMetadataSchema.parse({ db_save_result: null });
  let records = 0;
  // Each family owns its exhaustion status while sharing the one record cap.
  const createBudget = (): DispatchRecordBudget => {
    const budget: DispatchRecordBudget = {
      truncated: false,
      isFull: () => records >= maxRecords,
      markTruncated: () => {
        budget.truncated = true;
      },
      admit: () => {
        if (records >= maxRecords) {
          budget.truncated = true;
          return false;
        }
        records++;
        return true;
      },
    };
    return budget;
  };
  const objcBudget = createBudget();
  const objcPropertyBudget = createBudget();
  const swiftBudget = createBudget();
  const vtableBudget = createBudget();
  const readers = {
    u32,
    i32: (address: bigint) => bytes.readInt32LE(offset(address, 4)),
    u64: (address: bigint) => bytes.readBigUInt64LE(offset(address, 8)),
    pointer,
    bound,
    string,
    location,
    evidence,
    offset,
  };
  const objc =
    facet === "all" || facet === "objc"
      ? decodeObjcDispatchFacets({
          bytes,
          sections,
          segments,
          readers,
          budget: objcBudget,
          propertyBudget: objcPropertyBudget,
          result,
        })
      : {
          failures: [],
          categoryIssues: [],
          examined: 0,
          categoriesExamined: 0,
          classTruncated: false,
          categoriesTruncated: false,
        };
  const swiftRelative = createSwiftRelativeReader({
    bytes,
    readers: { ...readers, pointer: decodePointer },
    budget: swiftBudget,
    result,
  });
  const conformanceTail = createSwiftConformanceTailReader({
    readers: { ...readers, pointer: decodePointer },
    relative: swiftRelative,
  });
  const resilient =
    facet === "all" || facet === "swift-conformances"
      ? createSwiftResilientWitnessReader({
          readers: { ...readers, pointer: decodePointer },
          relative: swiftRelative,
          segments,
          budget: swiftBudget,
          result,
          tail: conformanceTail,
        })
      : undefined;
  const templates =
    facet === "all" || facet === "swift-conformances"
      ? createSwiftWitnessTemplateReader({
          readers: { ...readers, pointer: decodePointer },
          relative: swiftRelative,
          segments,
          budget: swiftBudget,
          result,
          tail: conformanceTail,
        })
      : undefined;
  const swift =
    facet === "all" || facet === "swift-conformances"
      ? decodeSwiftDispatchFacets({
          sections,
          segments,
          readers: { ...readers, pointer: decodePointer },
          relative: swiftRelative,
          budget: swiftBudget,
          result,
          maxRecords,
          ...(resilient === undefined ? {} : { resilient }),
          ...(templates === undefined ? {} : { templates }),
          ...(swiftConformanceAddress === undefined
            ? {}
            : { conformanceAddress: BigInt(swiftConformanceAddress) }),
          ...(swiftConformanceFilter === undefined
            ? {}
            : { conformanceFilter: swiftConformanceFilter }),
        })
      : {
          facet: "swift_conformances_static_witness_slots" as const,
          examined: 0,
          decoded: 0,
          exhaustive: true,
          issues: [],
        };
  function* typeEntries(): Iterable<bigint> {
    let retained = 0;
    for (const section of sections.filter(
      ({ name }) => name === "__swift5_types",
    )) {
      if (section.size % 4 !== 0)
        throw new RangeError("Misaligned Swift type section");
      const entries =
        swiftClassAddress === undefined
          ? Math.min(section.size / 4, maxRecords - retained)
          : section.size / 4;
      for (let index = 0; index < entries; index++)
        yield section.address + BigInt(index * 4);
      retained += entries;
      if (section.size / 4 > entries) vtableBudget.markTruncated();
    }
  }
  const vtableRelative = createSwiftRelativeReader({
    bytes,
    readers: { ...readers, pointer: decodePointer },
    budget: vtableBudget,
    result,
  });
  const vtables =
    facet === "all" || facet === "swift-vtables"
      ? decodeSwiftClassVtables({
          entries: typeEntries(),
          result,
          ...(swiftClassAddress === undefined
            ? {}
            : {
                selection: {
                  address: BigInt(swiftClassAddress),
                  maxRecords,
                  inspect: vtableRelative.inspect,
                },
              }),
          readers: {
            u32,
            relative: vtableRelative.local,
            string,
            location,
            evidence,
            admit: () => vtableBudget.admit(),
            markTruncated: () => vtableBudget.markTruncated(),
            executable: (address) =>
              segments.some(
                (segment) =>
                  segment.executable &&
                  address >= segment.address &&
                  address < segment.address + segment.size,
              ),
          },
        })
      : {
          facet: "swift_class_vtable_descriptors" as const,
          examined: 0,
          decoded: 0,
          exhaustive: true,
          issues: [],
        };
  pushDispatchCoverage({
    result,
    facet,
    failures: objc.failures,
    categoryIssues: objc.categoryIssues,
    examined: objc.examined,
    categoriesExamined: objc.categoriesExamined,
    truncated: {
      objc: objc.classTruncated,
      objcCategories: objc.categoriesTruncated,
      swift: swiftBudget.truncated,
      vtables: vtableBudget.truncated,
    },
    fixups,
    vtables,
    swift,
    ...(resilient === undefined ? {} : { resilient: resilient.facts() }),
    ...(templates === undefined ? {} : { templates: templates.facts() }),
  });
  return objcSwiftMetadataSchema.parse(result);
};

/** Read digest-verified target bytes under the explicit whole-file snapshot budget. */
export const inspectAppleDispatchMetadata = async (
  target: BinaryTarget,
  maxRecords: number,
  signal?: AbortSignal,
  facet: NativeDispatchFacet = "all",
  maxFileBytes?: number,
  swiftConformanceAddress?: string,
  swiftConformanceFilter?: NativeSwiftConformanceFilter,
  swiftClassAddress?: string,
) => {
  if (target.kind !== "executable" || target.format !== "mach-o")
    throw new TypeError("Apple dispatch metadata requires a Mach-O target");
  const maximumBytes = nativeDispatchFileBudgetSchema.parse(maxFileBytes);
  const capacityError = (observedBytes: number) =>
    new AnalysisResourceConstraintError(
      "inspect_native_dispatch_metadata",
      "file-size",
      `Apple static metadata input exceeds max_file_bytes (${String(maximumBytes)} bytes)`,
      { max_file_bytes: maximumBytes, observed_file_bytes: observedBytes },
      {
        remediationAction:
          "Select max_file_bytes (CLI --max-file-bytes) large enough for the entire original file, up to 536870912 bytes, or select a smaller original artifact. Facet/max_records changes do not reduce snapshot bytes. This limit is a byte-snapshot policy, not an RSS guarantee; unchanged limits reproduce the refusal.",
      },
    );
  const handle = await openRegularFile(target.path, {
    symlinks: "reject",
    signal,
  });
  try {
    const before = await handle.stat();
    if (before.size > maximumBytes) throw capacityError(before.size);
    if (signal?.aborted)
      throw new AnalysisCancelledError("inspect_native_dispatch_metadata");
    const bytes = await readBoundedFileBytes(handle, maximumBytes, signal);
    if (bytes === undefined) throw capacityError((await handle.stat()).size);
    const digest = createHash("sha256").update(bytes).digest("hex");
    if (digest !== target.sha256)
      throw new EvidenceIntegrityError(
        "Apple metadata target digest changed after session binding",
      );
    return nativeDispatchMetadataResultSchema.parse({
      target_sha256: target.sha256,
      provider: {
        id: "native-macos",
        name: "macOS native inspection utilities",
        version: "apple-metadata-reader-1",
      },
      analysis_profile_digest: null,
      result: decodeAppleDispatchMetadata(
        bytes,
        maxRecords,
        { path: target.path, sha256: digest },
        {
          architecture: target.architecture,
          facet,
          ...(swiftConformanceAddress === undefined
            ? {}
            : { swiftConformanceAddress }),
          ...(swiftConformanceFilter === undefined
            ? {}
            : { swiftConformanceFilter }),
          ...(swiftClassAddress === undefined ? {} : { swiftClassAddress }),
        },
      ),
    });
  } finally {
    await handle.close();
  }
};
