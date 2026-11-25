import { join } from "node:path";
import { z } from "zod";
import { AnalysisError } from "../../domain/analysisErrorBase.js";
import {
  AnalysisCancelledError,
  AnalysisTimeoutError,
  AnalysisOutputError,
  AnalysisResourceConstraintError,
  AnalysisCapabilityUnavailableError,
} from "../../domain/analysisErrorCore.js";
import { ProviderAdapterError } from "../../domain/providerAdapterError.js";
import { EvidenceIntegrityError } from "../../domain/evidenceErrors.js";
import { analysisErrorProjectionSchema } from "../../domain/analysisErrorProjectionSchema.js";
import { projectAnalysisError } from "../../domain/analysisErrorProjection.js";
import { analysisErrorWithCleanupFailure } from "../../domain/analysisErrorCleanup.js";
import { err, ok, type Result } from "../../domain/result.js";
import { jsonValueSchema, type JsonValue } from "../../domain/jsonValue.js";
import { nativeAddressedValueSchema } from "../../domain/native/nativeInventory.js";
import {
  decompileExportIdentitySchema,
  decompileDirectoryManifestSchema,
  selectExportProcedures,
  type DecompileDirectoryInput,
  type DecompileDirectoryManifest,
  type DecompileExportRecord,
  type DecompileExportIdentity,
} from "../../domain/native/decompileDirectory.js";
import type {
  AnalysisExecution,
  AnalysisOperationPort,
} from "../AnalysisProvider.js";
import {
  DecompileExportFiles,
  errorCode,
  exportHash,
  exportIdentityHash,
  exportKey,
} from "./DecompileExportFiles.js";

const LIMITATIONS = [
  "Selection covers the provider's analyzed procedure inventory; undiscovered code and source-level completeness remain unknown.",
  "Files contain provider pseudocode, not original source. Body ranges and debug compilation-unit paths are not supplied by this workflow.",
  "Files use SHA-256 of the canonical entry coordinate as their name; the index retains exact addresses, labels, source identity and per-attempt limitations.",
  "Committed bodies and attempt records survive interruption. An orphan body without a committed record is preserved as a conflict, never adopted or overwritten.",
  "Resume verifies recorded bytes and the committed profile, not uncommitted analysis-database edits that do not change that profile. Start a new export after such edits.",
  "Output directory identities are checked around filesystem operations; portable Node APIs cannot eliminate syscall-boundary pathname races.",
];

/** File-backed export; only inventory and compact metadata are retained in session memory. */
export async function decompileDirectory(
  analysis: AnalysisOperationPort,
  input: DecompileDirectoryInput,
  signal?: AbortSignal,
): Promise<Result<JsonValue, AnalysisError>> {
  const scope = analysis.resourceScope;
  if (scope === undefined)
    return err(
      new AnalysisCapabilityUnavailableError(
        "rea",
        "decompile_all",
        "Directory export requires a session-owned cleanup scope; use batch_decompile for an explicit inline batch.",
      ),
    );
  const files = new DecompileExportFiles();
  let manifest: DecompileDirectoryManifest | undefined;
  let primary: AnalysisError | undefined;
  let interrupted: AnalysisError | undefined;
  try {
    await scope.run(async () => {
      active(signal);
      const inventory = await analysis.execute(
        "list_procedures",
        {},
        signal === undefined ? {} : { signal },
      );
      if (!inventory.ok) throw inventory.error;
      active(signal);
      const identity = exportIdentity(inventory.value);
      const parsed = z
        .array(nativeAddressedValueSchema)
        .safeParse(inventory.value.result);
      if (!parsed.success || parsed.data.some((p) => p.address.length === 0))
        throw new AnalysisOutputError(
          "list_procedures",
          "Export requires an addressed procedure inventory",
        );
      const selection = selectExportProcedures(parsed.data, input);
      await files.prepare(input.output_directory, input.resume, identity);
      manifest = {
        output_directory: files.root,
        index_path: join(files.root, "decompile-index.json"),
        index_sha256: null,
        identity,
        resume: input.resume,
        counts: {
          inventory_rows: parsed.data.length,
          unique_procedures: selection.unique,
          selected: selection.procedures.length,
          skipped: 0,
          written: 0,
          unavailable: 0,
          failed: 0,
          external: 0,
          remaining: selection.procedures.length,
        },
        inventory_limitations: [...inventory.value.limitations],
        limitations: [...LIMITATIONS],
      };
      // New entries precede recorded failures, so limit/resume keeps making progress.
      const ordered = [...selection.procedures].sort(
        (a, b) =>
          Number(files.latest.has(exportKey(a.address))) -
          Number(files.latest.has(exportKey(b.address))),
      );
      try {
        let attempted = 0;
        for (const procedure of ordered) {
          active(signal);
          const previous = files.latest.get(exportKey(procedure.address));
          if (previous?.status === "external") {
            manifest.counts.skipped++;
            manifest.counts.remaining--;
            continue;
          }
          if (previous?.status === "written") {
            let matches = false;
            try {
              matches = await files.verifyFile(previous, signal);
            } catch (cause) {
              if (errorCode(cause) !== "ENOENT") throw cause;
            }
            if (!matches)
              throw new EvidenceIntegrityError(
                `Exported file changed or is missing: ${files.bodyPath(procedure.address)}. Existing output was preserved.`,
              );
            manifest.counts.skipped++;
            manifest.counts.remaining--;
            continue;
          }
          if (input.limit !== undefined && attempted >= input.limit) continue;
          attempted++;
          const record = await exportProcedure(
            { analysis, files, inventory: inventory.value, identity, signal },
            procedure,
            previous,
          );
          // Once a body is published its record is committed even if cancellation just arrived.
          await files.commit(record, () => {
            const counter =
              record.status === "error" ? "failed" : record.status;
            manifest!.counts[counter]++;
            manifest!.counts.remaining--;
          });
        }
      } catch (cause) {
        interrupted = exportFailure(cause, signal);
        throw interrupted;
      } finally {
        // Do not pass an aborted request signal: the completed prefix still needs its index.
        const index = {
          identity,
          latest_run: {
            input,
            counts: manifest.counts,
            inventory_limitations: manifest.inventory_limitations,
          },
          limitations: manifest.limitations,
          functions: [...files.latest.values()].sort((a, b) =>
            a.procedure.address < b.procedure.address
              ? -1
              : a.procedure.address > b.procedure.address
                ? 1
                : 0,
          ),
        };
        const text = JSON.stringify(index, null, 2) + "\n";
        await files.publish(text, manifest.index_path, true);
        manifest.index_sha256 = exportHash(text);
      }
      active(signal);
    });
  } catch (cause) {
    primary = exportFailure(cause, signal);
  }
  const closed = await scope.release({
    kind: "decompile-export",
    resource: files.root || input.output_directory,
    export: files,
  });
  if (closed.kind === "failed") {
    const cleanup = new ProviderAdapterError("rea", "decompile_all", {
      cause: closed.cause,
      userMessage:
        "Export cleanup remains owned by this session. Close the binary to retry cleanup before resuming the export.",
      cleanup: {
        reason:
          "Output handles, staging or exclusive directory lock could not be released",
        resources: [files.root || input.output_directory],
      },
    });
    primary =
      primary === undefined
        ? cleanup
        : analysisErrorWithCleanupFailure(primary, cleanup, "decompile_all");
  }
  if (primary !== undefined) {
    if (manifest !== undefined) {
      const interruption = {
        ...projectAnalysisError(primary),
        ...(interrupted === undefined || interrupted === primary
          ? {}
          : { previous_interruption: projectAnalysisError(interrupted) }),
      };
      primary.partialObservation = {
        kind: "native-decompile-export-partial",
        manifest,
        interruption: jsonValueSchema.parse(interruption),
      };
    }
    return err(primary);
  }
  return ok(
    jsonValueSchema.parse(decompileDirectoryManifestSchema.parse(manifest)),
  );
}

function active(signal?: AbortSignal) {
  if (signal?.aborted === true)
    throw new AnalysisCancelledError("decompile_all", { cause: signal.reason });
}
function stopsExport(error: AnalysisError) {
  return (
    error.cleanupIncomplete ||
    error instanceof AnalysisCapabilityUnavailableError ||
    error._tag === "ConfigurationError" ||
    error._tag === "AnalysisCancelledError" ||
    error._tag === "HopperCancelledError" ||
    error._tag === "HopperTimeoutError" ||
    error instanceof AnalysisResourceConstraintError ||
    (error instanceof AnalysisTimeoutError &&
      error.context?.phase === "startup")
  );
}
function exportIdentity(source: AnalysisExecution): DecompileExportIdentity {
  const identity = decompileExportIdentitySchema.safeParse({
    version: 1,
    target_sha256: source.subject?.sha256,
    analysis_profile: source.analysisProfile,
    layout: "address-sha256",
  });
  if (
    !identity.success ||
    identity.data.analysis_profile.provider.id !== source.provider.id ||
    identity.data.analysis_profile.provider.name !== source.provider.name ||
    identity.data.analysis_profile.provider.version !== source.provider.version
  )
    throw new AnalysisCapabilityUnavailableError(
      source.provider.id,
      "decompile_all",
      "Directory export requires a known target SHA-256 and matching committed provider profile; use batch_decompile when these identities are unavailable.",
    );
  return identity.data;
}
function exportFailure(cause: unknown, signal?: AbortSignal): AnalysisError {
  if (cause instanceof AnalysisError) return cause;
  if (signal?.aborted === true && cause === signal.reason)
    return new AnalysisCancelledError("decompile_all", { cause });
  if (errorCode(cause) === "ENOSPC" || errorCode(cause) === "EDQUOT")
    return new AnalysisResourceConstraintError(
      "decompile_all",
      "disk",
      "Export output exceeded available disk space or quota",
      null,
      {
        cause,
        remediationAction:
          "Free output-volume space or quota, then resume the same export. Unchanged capacity will reproduce the failure.",
      },
    );
  return new ProviderAdapterError("rea", "decompile_all", {
    cause,
    userMessage: `Export filesystem/metadata operation failed: ${cause instanceof Error ? cause.message : String(cause)}. Committed files remain. Resume requires a valid identity and released directory lock.`,
  });
}

function projectRecordError(error: AnalysisError) {
  return analysisErrorProjectionSchema.parse(projectAnalysisError(error));
}

async function exportProcedure(
  context: {
    analysis: AnalysisOperationPort;
    files: DecompileExportFiles;
    inventory: AnalysisExecution;
    identity: DecompileExportIdentity;
    signal: AbortSignal | undefined;
  },
  procedure: DecompileExportRecord["procedure"],
  previous: DecompileExportRecord | undefined,
): Promise<DecompileExportRecord> {
  const { analysis, files, inventory, identity, signal } = context;
  const record: DecompileExportRecord = {
    identity_sha256: files.identityDigest,
    attempt: (previous?.attempt ?? 0) + 1,
    procedure,
    status: "external",
    limitations: [...inventory.limitations],
    locations: [...inventory.locations],
  };
  if (procedure.procedure?.external !== true) {
    const observed = await analysis.execute(
      "procedure_pseudo_code",
      { procedure: procedure.address },
      {
        ...(signal === undefined ? {} : { signal }),
        retention: "transient",
      },
    );
    if (!observed.ok) {
      if (stopsExport(observed.error)) throw observed.error;
      record.status = "error";
      record.error = projectRecordError(observed.error);
    } else {
      active(signal);
      if (
        exportIdentityHash(exportIdentity(observed.value)) !==
        exportIdentityHash(identity)
      )
        throw new EvidenceIntegrityError(
          "Pseudocode target/provider/profile changed during export",
        );
      record.limitations = [
        ...new Set([...record.limitations, ...observed.value.limitations]),
      ];
      record.locations = [...observed.value.locations];
      const body = observed.value.result;
      if (body === null) record.status = "unavailable";
      else if (
        typeof body !== "string" ||
        body.length === 0 ||
        Buffer.from(body, "utf8").toString("utf8") !== body
      ) {
        record.status = "error";
        record.error = projectRecordError(
          new AnalysisOutputError(
            "procedure_pseudo_code",
            "Provider returned empty, invalid or non-round-trippable UTF-8 pseudocode",
          ),
        );
      } else {
        try {
          await files.publish(
            body,
            files.bodyPath(procedure.address),
            false,
            signal === undefined ? {} : { signal },
          );
        } catch (cause) {
          if (errorCode(cause) !== "EEXIST") throw cause;
          record.status = "error";
          record.error = projectRecordError(
            new EvidenceIntegrityError(
              `Unrecorded function file already exists; preserved: ${files.bodyPath(procedure.address)}`,
            ),
          );
        }
        if (record.status !== "error") {
          record.status = "written";
          record.file = {
            relative_path: `functions/${exportKey(procedure.address)}.c`,
            sha256: exportHash(body),
            bytes: Buffer.byteLength(body, "utf8"),
          };
        }
      }
    }
  }
  return record;
}
