import { z } from "zod";
import {
  nativeDispatchMetadataResultSchema,
  inspectNativeDispatchMetadata,
  type NativeDispatchFacet,
  type NativeSwiftConformanceFilter,
} from "../../domain/native/objcSwiftMetadata.js";
import {
  AnalysisInputError,
  AnalysisOutputError,
} from "../../domain/analysisErrorCore.js";
import { jsonValueSchema } from "../../domain/jsonValue.js";
import { err, ok } from "../../domain/result.js";
import type { AnalysisOperationPort } from "../AnalysisProvider.js";
import type { EnhancedResult } from "../EnhancedToolTypes.js";
/** Prefer validated binary metadata, otherwise preserve the bound provider's symbol-only coverage. */
export const inspectNativeDispatch = async (
  analysis: AnalysisOperationPort,
  maxRecords: number,
  signal?: AbortSignal,
  facet: NativeDispatchFacet = "all",
  maxFileBytes?: number,
  swiftConformanceAddress?: string,
  swiftConformanceFilter?: NativeSwiftConformanceFilter,
): EnhancedResult => {
  if (
    (swiftConformanceAddress !== undefined ||
      swiftConformanceFilter !== undefined) &&
    (facet !== "swift-conformances" ||
      (swiftConformanceAddress !== undefined &&
        swiftConformanceFilter !== undefined))
  )
    return err(
      new AnalysisInputError("inspect_native_dispatch_metadata", undefined, [
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
      ]),
    );
  const binaryMetadata = await analysis.execute(
    "inspect_native_dispatch_metadata",
    {
      max_records: maxRecords,
      facet,
      ...(swiftConformanceAddress === undefined
        ? {}
        : { swift_conformance_address: swiftConformanceAddress }),
      ...(swiftConformanceFilter === undefined
        ? {}
        : { swift_conformance_filter: swiftConformanceFilter }),
      ...(maxFileBytes === undefined ? {} : { max_file_bytes: maxFileBytes }),
    },
    signal === undefined ? {} : { signal },
  );
  if (binaryMetadata.ok)
    return ok(
      jsonValueSchema.parse(
        nativeDispatchMetadataResultSchema.parse(binaryMetadata.value.result),
      ),
    );
  if (
    swiftConformanceAddress !== undefined ||
    swiftConformanceFilter !== undefined ||
    binaryMetadata.error._tag !== "AnalysisCapabilityUnavailableError"
  )
    return err(binaryMetadata.error);
  const execution = await analysis.execute(
    "list_names",
    {},
    signal === undefined ? {} : { signal },
  );
  if (!execution.ok) return err(execution.error);
  const names = z
    .array(
      z.union([
        z.strictObject({ address: z.string(), value: z.string() }),
        z.strictObject({ address: z.string(), name: z.string() }),
      ]),
    )
    .safeParse(execution.value.result);
  if (!names.success)
    return err(
      new AnalysisOutputError(
        "list_names",
        "provider returned an invalid inventory",
      ),
    );
  return ok(
    jsonValueSchema.parse(
      nativeDispatchMetadataResultSchema.parse({
        target_sha256: execution.value.subject?.sha256 ?? null,
        provider: execution.value.provider,
        analysis_profile_digest:
          execution.value.analysisProfile?.digest ?? null,
        result: inspectNativeDispatchMetadata(
          names.data.map((entry) => ({
            address: entry.address,
            name: "value" in entry ? entry.value : entry.name,
          })),
          maxRecords,
          facet,
        ),
      }),
    ),
  );
};
