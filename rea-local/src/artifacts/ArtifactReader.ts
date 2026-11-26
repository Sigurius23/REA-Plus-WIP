import type { Readable } from "node:stream";
import type { ArtifactCommand } from "../domain/artifactGraph.js";
import type { ZipPackageFormat } from "../domain/zipPackageFormat.js";
import canonicalize from "canonicalize";
import type { FirmwareFormatMetadata } from "../domain/firmware/firmwareMetadata.js";
import type {
  AnalysisCleanupObservation,
  AnalysisPartialObservation,
} from "../domain/analysisErrorBase.js";

export interface ArtifactReaderFailureOptions extends ErrorOptions {
  readonly cleanup?: AnalysisCleanupObservation;
  readonly partialObservation?: AnalysisPartialObservation;
}

/** Archive-neutral entry metadata. Reader adapters never choose output paths. */
export interface ArtifactEntry {
  readonly path: string;
  readonly kind: "file" | "directory" | "symlink" | "slice";
  readonly declaredSize: number | null;
  readonly compressedSize: number | null;
  readonly executable: boolean;
  readonly encrypted: boolean;
  readonly byteOffset: number | null;
  readonly declaredSha256: string | null;
  readonly unpacked: boolean;
  readonly limitations: readonly string[];
  readonly adapterKey: string;
  /** Format facts belong to this occurrence, independently of byte-content identity. */
  readonly formatMetadata?: FirmwareFormatMetadata;
  /** Filesystem identity captured during traversal, when supplied by an adapter. */
  readonly sourceIdentity?: {
    readonly device: number;
    readonly inode: number;
  };
}

/** Snapshot mutable entry metadata before the producer later validates open(). */
export const copyArtifactEntry = (entry: ArtifactEntry): ArtifactEntry => ({
  ...entry,
  limitations: [...entry.limitations],
  ...(entry.formatMetadata === undefined
    ? {}
    : { formatMetadata: structuredClone(entry.formatMetadata) }),
  ...(entry.sourceIdentity === undefined
    ? {}
    : { sourceIdentity: { ...entry.sourceIdentity } }),
});

/** Compare every portable and adapter-owned fact supplied with an entry. */
export const sameArtifactEntry = (
  entry: ArtifactEntry,
  produced: ArtifactEntry,
): boolean =>
  entry.path === produced.path &&
  entry.kind === produced.kind &&
  entry.declaredSize === produced.declaredSize &&
  entry.compressedSize === produced.compressedSize &&
  entry.executable === produced.executable &&
  entry.encrypted === produced.encrypted &&
  entry.byteOffset === produced.byteOffset &&
  entry.declaredSha256 === produced.declaredSha256 &&
  entry.unpacked === produced.unpacked &&
  entry.adapterKey === produced.adapterKey &&
  canonicalize(entry.formatMetadata) ===
    canonicalize(produced.formatMetadata) &&
  entry.limitations.length === produced.limitations.length &&
  entry.limitations.every(
    (limitation, index) => limitation === produced.limitations[index],
  ) &&
  entry.sourceIdentity?.device === produced.sourceIdentity?.device &&
  entry.sourceIdentity?.inode === produced.sourceIdentity?.inode;

/** Read-only adapter over one directory, archive, or virtual container. */
export interface ArtifactReader {
  readonly format:
    | "directory"
    | ZipPackageFormat
    | "asar"
    | "file"
    | "intel-hex"
    | "srec"
    | "uf2"
    | "dfuse"
    | "uimage"
    | "fit"
    | "esp-image"
    | "esp-flash-image";
  formatMetadata?(): FirmwareFormatMetadata | undefined;
  limitations?(): readonly string[];
  entries(signal?: AbortSignal): AsyncIterable<ArtifactEntry>;
  open(entry: ArtifactEntry, signal?: AbortSignal): Promise<Readable>;
  provenance(): readonly ArtifactCommand[];
  close(): Promise<void>;
}

/** Typed adapter failure translated at provider boundary. */
export class ArtifactReaderFailure extends Error {
  readonly cleanup: AnalysisCleanupObservation | undefined;
  readonly partialObservation: AnalysisPartialObservation | undefined;

  constructor(
    readonly reason:
      | "cancelled"
      | "format"
      | "integrity"
      | "io"
      | "limit"
      | "path"
      | "unavailable",
    message: string,
    options?: ArtifactReaderFailureOptions,
    readonly details?: Readonly<{
      logicalPath: string;
      declaredSha256: string | null;
      calculatedSha256: string | null;
      unpacked: boolean;
    }>,
  ) {
    super(message, options);
    this.name = "ArtifactReaderFailure";
    this.cleanup = options?.cleanup;
    this.partialObservation = options?.partialObservation;
  }

  /** Preserve the primary failure while attaching cleanup and any complete observation. */
  static withCleanup(
    cause: unknown,
    cleanup: AnalysisCleanupObservation,
    partialObservation?: AnalysisPartialObservation,
  ): ArtifactReaderFailure {
    const primary =
      cause instanceof ArtifactReaderFailure
        ? cause
        : new ArtifactReaderFailure("io", errorMessage(cause), { cause });
    const mergedObservation = partialObservation ?? primary.partialObservation;
    return new ArtifactReaderFailure(
      primary.reason,
      primary.message,
      {
        cause: primary,
        cleanup: combineCleanup(primary.cleanup, cleanup),
        ...(mergedObservation === undefined
          ? {}
          : { partialObservation: mergedObservation }),
      },
      primary.details,
    );
  }

  /** Give otherwise opaque cleanup failures a concrete owned resource. */
  static cleanupObservation(
    cause: unknown,
    resource: string,
  ): AnalysisCleanupObservation {
    if (cause instanceof ArtifactReaderFailure && cause.cleanup !== undefined)
      return cause.cleanup;
    return { reason: errorMessage(cause), resources: [resource] };
  }
}

const combineCleanup = (
  primary: AnalysisCleanupObservation | undefined,
  cleanup: AnalysisCleanupObservation,
): AnalysisCleanupObservation =>
  primary === undefined || primary === cleanup
    ? cleanup
    : {
        reason: `${primary.reason}; ${cleanup.reason}`,
        resources: [...new Set([...primary.resources, ...cleanup.resources])],
      };

const errorMessage = (cause: unknown): string =>
  cause instanceof Error ? cause.message : String(cause);
