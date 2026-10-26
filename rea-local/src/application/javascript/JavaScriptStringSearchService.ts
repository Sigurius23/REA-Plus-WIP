import { constants } from "node:fs";
import { access, lstat, realpath } from "node:fs/promises";

import { z } from "zod";

import type { ArtifactResourceScope } from "../../artifacts/ArtifactResourceScope.js";
import { ArtifactReaderFailure } from "../../artifacts/ArtifactReader.js";
import { createJavaScriptArtifactReader } from "../../artifacts/javascript/JavaScriptArtifactReader.js";
import { readJavaScriptArtifactFiles } from "../../artifacts/javascript/JavaScriptArtifactFiles.js";
import { scanCanonicalArtifactInventoryInScope } from "../../artifacts/inventory/scanCanonical.js";
import { JAVASCRIPT_APPLICATION_PROVIDER } from "../InvestigationProviders.js";
import {
  assertJavaScriptAnalysisActive,
  checkpointJavaScriptAnalysis,
} from "./JavaScriptAnalysisControl.js";
import { parseJavaScriptSource } from "../../domain/javascript/javascriptSourceParser.js";
import type { JavaScriptArtifactFile } from "../../domain/javascript/javascriptArtifactFiles.js";
import {
  collectJavaScriptStringMatches,
  type JavaScriptStringSearchScope,
} from "../../domain/javascript/javascriptStringScan.js";
import {
  searchJavaScriptStringsInputSchema,
  type SearchJavaScriptStringsResult,
} from "../../domain/javascript/javascriptStringSearchSchemas.js";
import {
  AnalysisAccessDeniedError,
  AnalysisInputError,
  AnalysisOutputError,
} from "../../domain/analysisErrorCore.js";
import { ArtifactOperationError } from "../../domain/artifactOperationError.js";
import { AnalysisError } from "../../domain/analysisErrorBase.js";
import { analysisInputErrorFromIssues } from "../../domain/inputIssueProjection.js";
import { createEvidence, type Evidence } from "../../domain/evidence.js";
import { jsonObjectSchema } from "../../domain/jsonValue.js";
import { err, ok, type Result } from "../../domain/result.js";
import { ProviderAdapterError } from "../../domain/providerAdapterError.js";
import type { ExecutionOptions } from "../AnalysisProvider.js";

const OPERATION = "search_javascript_strings" as const;

const DEFAULT_FILE_LIMIT = 256;
const DEFAULT_MATCH_LIMIT = 1024;

/**
 * Statically search one local JavaScript/Electron application's string
 * constants or identifiers by substring without executing any code.
 */
export const searchJavaScriptStrings = async (
  rawInput: unknown,
  scope: ArtifactResourceScope,
  options: ExecutionOptions = {},
): Promise<Result<Evidence, AnalysisError>> => {
  const parsed = searchJavaScriptStringsInputSchema.safeParse(rawInput);
  if (!parsed.success)
    return err(
      analysisInputErrorFromIssues(OPERATION, parsed.error.issues, rawInput),
    );
  return searchJavaScriptStringsValidated(parsed.data, scope, options);
};

/** Search input already parsed by a trusted adapter boundary. */
export const searchJavaScriptStringsValidated = async (
  input: z.output<typeof searchJavaScriptStringsInputSchema>,
  scope: ArtifactResourceScope,
  options: ExecutionOptions = {},
): Promise<Result<Evidence, AnalysisError>> => {
  try {
    assertJavaScriptAnalysisActive(options.signal);
    await reportPhase(options, "inventorying_javascript_artifact", 0, 1);
    return await scope.run(async () => {
      const path = await resolveSelectedInput(input.input_path);
      const format = await resolveArtifactFormat(path);
      const snapshot = await scanCanonicalArtifactInventoryInScope(path, {
        resourceScope: scope,
        ...(options.signal === undefined ? {} : { signal: options.signal }),
        integrity: { mode: input.integrity_policy },
      });
      await reportPhase(options, "reading_javascript_sources", 0, 1);
      const reader = createJavaScriptArtifactReader(path, format);
      const readerOwner = {
        kind: "reader" as const,
        reader,
        resource: `JavaScript string search reader for ${path}`,
      };
      const fileSet = await readJavaScriptArtifactFiles(
        reader,
        snapshot,
        scope,
        options.signal,
      );
      const earlyCleanup = await scope.release(readerOwner);
      if (earlyCleanup.kind === "failed") throw earlyCleanup.cause;
      await reportPhase(options, "searching_javascript_strings", 0, 1);
      const search = await scanFileSet(fileSet, {
        query: input.query,
        scope: input.scope ?? "strings",
        fileLimit: input.file_limit ?? DEFAULT_FILE_LIMIT,
        matchLimit: input.match_limit ?? DEFAULT_MATCH_LIMIT,
        signal: options.signal,
      });
      const evidence = createEvidence(
        {
          path,
          sha256: snapshot.manifest.root_sha256,
          format: snapshot.manifest.root_format,
        },
        JAVASCRIPT_APPLICATION_PROVIDER,
        {
          operation: OPERATION,
          parameters: jsonObjectSchema.parse(parameterInput(input)),
          result: search.result,
          limitations: search.limitations,
          confidence: "observed",
        },
      );
      await options.progress?.report({
        phase: "searching_javascript_strings",
        completed: 1,
        total: 1,
        message: "String search completed",
        terminal: true,
      });
      return ok(evidence);
    });
  } catch (cause: unknown) {
    if (cause instanceof AnalysisError) return err(cause);
    if (cause instanceof ArtifactReaderFailure)
      return err(new ArtifactOperationError(OPERATION, cause.reason));
    if (cause instanceof z.ZodError)
      return err(
        new AnalysisOutputError(
          OPERATION,
          "Result schema rejected the completed string search",
          { cause },
        ),
      );
    if (
      cause instanceof Error &&
      "code" in cause &&
      typeof cause.code === "string" &&
      FILESYSTEM_ERROR_CODES.has(cause.code)
    )
      return err(new ArtifactOperationError(OPERATION, "io"));
    return err(
      new ProviderAdapterError(JAVASCRIPT_APPLICATION_PROVIDER.id, OPERATION, {
        cause,
        diagnostics: {
          input_path: input.input_path,
          error_name: cause instanceof Error ? cause.name : "UnknownError",
          error_message:
            cause instanceof Error
              ? cause.message
              : "The JavaScript string search failed with a non-Error value",
        },
      }),
    );
  }
};

interface ScanSearch {
  readonly query: string;
  readonly scope: JavaScriptStringSearchScope;
  readonly fileLimit: number;
  readonly matchLimit: number;
  readonly signal: AbortSignal | undefined;
}

const scanFileSet = async (
  fileSet: Awaited<ReturnType<typeof readJavaScriptArtifactFiles>>,
  search: ScanSearch,
): Promise<{
  readonly result: SearchJavaScriptStringsResult;
  readonly limitations: readonly string[];
}> => {
  const matches: SearchJavaScriptStringsResult["matches"] = [];
  const javascriptFiles = fileSet.files.filter(
    (file) => file.kind === "javascript",
  );
  const scannable = javascriptFiles.filter(
    (
      file,
    ): file is JavaScriptArtifactFile & {
      readonly text: { readonly included: true; readonly value: string };
    } => file.text.included,
  );
  const incompleteText = javascriptFiles.length - scannable.length;
  const selected = Math.min(scannable.length, search.fileLimit);
  let scanned = 0;
  let failures = 0;
  let omitted = 0;
  for (const file of scannable.slice(0, selected)) {
    await checkpoint(search.signal);
    const parsed = parseJavaScriptSource(file.text.value, file.path);
    if (parsed === null) {
      failures += 1;
      continue;
    }
    scanned += 1;
    for (const match of collectJavaScriptStringMatches(parsed, search)) {
      if (matches.length >= search.matchLimit) {
        omitted += 1;
        continue;
      }
      matches.push({
        path: file.path,
        sha256: file.sha256,
        offset: match.offset,
        value: match.value,
        kind: match.kind,
      });
    }
  }
  const skipped = scannable.length - selected;
  const partial =
    skipped > 0 || omitted > 0 || incompleteText > 0 || failures > 0;
  return {
    result: {
      query: search.query,
      scope: search.scope,
      total_files: javascriptFiles.length,
      scanned_files: scanned,
      parse_failures: failures,
      skipped_files: skipped,
      incomplete_text_files: incompleteText,
      matches,
      omitted_matches: omitted,
      coverage: partial ? "partial" : "complete",
    },
    limitations: scanLimitations({
      failures,
      incompleteText,
      skipped,
      omitted,
    }),
  };
};

const scanLimitations = (state: {
  readonly failures: number;
  readonly incompleteText: number;
  readonly skipped: number;
  readonly omitted: number;
}): readonly string[] => {
  const limitations: string[] = [
    "Only inventoried UTF-8 JavaScript files with parseable syntax are searched; JSON, HTML, source maps and binary files are never searched, so an empty result does not prove absence.",
    "Locations are file-level artifact digests and byte offsets; bundler module attribution requires the analyze_javascript_application graph.",
  ];
  if (state.failures > 0)
    limitations.push(
      `${String(state.failures)} selected JavaScript files failed to parse; their string constants are not searched.`,
    );
  if (state.incompleteText > 0)
    limitations.push(
      `${String(state.incompleteText)} JavaScript files were not valid UTF-8 text and could not be searched.`,
    );
  if (state.skipped > 0)
    limitations.push(
      `${String(state.skipped)} JavaScript files were not reached because of the file limit; raise file_limit to scan more files.`,
    );
  if (state.omitted > 0)
    limitations.push(
      `${String(state.omitted)} further matches beyond the match limit were not returned; raise match_limit to include them.`,
    );
  return limitations;
};

type PhaseName =
  | "inventorying_javascript_artifact"
  | "reading_javascript_sources"
  | "searching_javascript_strings";

const phaseMessages: Record<PhaseName, string> = {
  inventorying_javascript_artifact:
    "Inventorying the selected JavaScript application artifact",
  reading_javascript_sources: "Reading inventoried JavaScript source text",
  searching_javascript_strings: "Scanning JavaScript string constants",
};

const reportPhase = async (
  options: ExecutionOptions,
  phase: PhaseName,
  completed: number,
  total: number,
): Promise<void> => {
  await options.progress?.report({
    phase,
    completed,
    total,
    message: phaseMessages[phase],
  });
};

const resolveSelectedInput = async (inputPath: string): Promise<string> => {
  try {
    const path = await realpath(inputPath);
    await access(path, constants.R_OK);
    return path;
  } catch (cause: unknown) {
    const code =
      cause instanceof Error && "code" in cause ? String(cause.code) : "";
    if (code === "EACCES" || code === "EPERM")
      throw new AnalysisAccessDeniedError(OPERATION, inputPath, code, {
        cause,
      });
    if (code === "ENOENT" || code === "ENOTDIR")
      throw new AnalysisInputError(OPERATION, { cause }, [
        {
          path: ["input_path"],
          reason: "invalid_value",
          message: `No file or directory exists at the selected input path (${code}): ${inputPath}`,
        },
      ]);
    throw cause;
  }
};

const resolveArtifactFormat = async (
  path: string,
): Promise<"asar" | "directory"> => {
  const metadata = await lstat(path);
  if (metadata.isDirectory()) return "directory";
  if (metadata.isFile() && path.toLowerCase().endsWith(".asar")) return "asar";
  throw new ArtifactOperationError(
    OPERATION,
    "format",
    undefined,
    "A JavaScript string search accepts only an extracted application directory or an .asar file",
  );
};

const parameterInput = (
  input: z.output<typeof searchJavaScriptStringsInputSchema>,
): Record<string, unknown> => {
  const parameters: Record<string, unknown> = {
    input_path: input.input_path,
    query: input.query,
    integrity_policy: input.integrity_policy,
  };
  if (input.scope !== undefined) parameters.scope = input.scope;
  if (input.file_limit !== undefined) parameters.file_limit = input.file_limit;
  if (input.match_limit !== undefined)
    parameters.match_limit = input.match_limit;
  return parameters;
};

const FILESYSTEM_ERROR_CODES = new Set([
  "ENOENT",
  "EACCES",
  "EPERM",
  "ENOTDIR",
  "EISDIR",
  "EIO",
  "ELOOP",
  "ENAMETOOLONG",
  "EMFILE",
  "ENFILE",
  "ENOSPC",
  "EROFS",
]);

/** Cooperative cancellation checkpoint between selected files. */
const checkpoint = async (signal: AbortSignal | undefined): Promise<void> => {
  await checkpointJavaScriptAnalysis(signal);
};
