import { createHash } from "node:crypto";
import { constants } from "node:fs";
import { mkdir, open, realpath, writeFile } from "node:fs/promises";
import { isAbsolute, join } from "node:path";
import { z } from "zod";

import type { AnalysisOperation } from "../application/AnalysisProvider.js";
import {
  AnalysisAccessDeniedError,
  AnalysisResourceConstraintError,
} from "../domain/analysisErrorCore.js";
import { ConfigurationError } from "../domain/configurationErrors.js";
import { ProviderAdapterError } from "../domain/providerAdapterError.js";
import { err, ok, type Result } from "../domain/result.js";

/** Seed file format admitted by this adapter. */
export const GHIDRA_SEED_FORMAT = "rea-ghidra-seeds-v1";
export const GHIDRA_SEED_SCRIPT = "ReaGhidraApplySeeds.java";
export const MAX_GHIDRA_SEED_BYTES = 32 * 1024 * 1024;
export const MAX_GHIDRA_SEED_ENTRIES = 1_000_000;
const MAX_SEED_NAME_LENGTH = 2000;

const digest = z.string().regex(/^[a-f0-9]{64}$/u);
const count = z.number().int().nonnegative();

/** Caller-declared seeds committed into the analysis profile before import. */
export const ghidraSeedCommitmentSchema = z.strictObject({
  format: z.literal(GHIDRA_SEED_FORMAT),
  path: z.string().refine(isAbsolute, "Seed path must be absolute"),
  configured_path: z.string().refine(isAbsolute, "Seed path must be absolute"),
  sha256: digest,
  entries: z.strictObject({ function: count, code: count, label: count }),
});
export type GhidraSeedCommitment = z.infer<typeof ghidraSeedCommitmentSchema>;

/** What the pre-analysis script applied, as reported by the bridge handshake. */
export const ghidraSeedReportSchema = z.strictObject({
  format: z.literal(GHIDRA_SEED_FORMAT),
  sha256: digest,
  entries: count,
  function_created: count,
  function_existing: count,
  function_failed: count,
  code_decoded: count,
  code_failed: count,
  label_applied: count,
  label_failed: count,
  unmapped: count,
});
export type GhidraSeedReport = z.infer<typeof ghidraSeedReportSchema>;

type SeedKind = "function" | "code" | "label";
interface SeedEntry {
  readonly address: bigint;
  readonly kind: SeedKind;
  readonly name?: string;
}

const seedLineError = (line: number, constraint: string) =>
  new ConfigurationError("Invalid REA+ environment configuration", {
    settings: [
      {
        setting: "REA_GHIDRA_SEED_FILE",
        constraint: `line ${line}: ${constraint}`,
      },
    ],
  });

const seedFileConfigurationError = (
  configured: string,
  constraint: string,
  cause?: unknown,
) =>
  new ConfigurationError("Invalid REA+ environment configuration", {
    cause,
    settings: [
      {
        setting: "REA_GHIDRA_SEED_FILE",
        constraint: `${constraint}. Configured path: ${configured}; select an existing regular seed file or unset REA_GHIDRA_SEED_FILE`,
      },
    ],
  });

/**
 * Parse `address<TAB>kind[<TAB>name]` lines. Blank lines and `#` comments are
 * ignored. Addresses are hexadecimal offsets in the default address space.
 */
export const parseGhidraSeeds = (
  text: string,
): Result<readonly SeedEntry[], ConfigurationError> => {
  const entries: SeedEntry[] = [];
  const seen = new Set<string>();
  const lines = text.split("\n");
  for (const [index, raw] of lines.entries()) {
    const line = raw.endsWith("\r") ? raw.slice(0, -1) : raw;
    if (line.trim() === "" || line.startsWith("#")) continue;
    const number = index + 1;
    const fields = line.split("\t");
    if (fields.length < 2 || fields.length > 3)
      return err(seedLineError(number, "expected address<TAB>kind[<TAB>name]"));
    const [address, kind, name] = fields;
    if (address === undefined || !/^0x[0-9a-fA-F]{1,16}$/u.test(address))
      return err(seedLineError(number, "address must be 0x-prefixed hex"));
    if (kind !== "function" && kind !== "code" && kind !== "label")
      return err(seedLineError(number, "kind must be function, code or label"));
    if (
      name !== undefined &&
      (name.length === 0 ||
        name.length > MAX_SEED_NAME_LENGTH ||
        /[\s\0]/u.test(name))
    )
      return err(
        seedLineError(
          number,
          `name must be 1..${MAX_SEED_NAME_LENGTH} characters without whitespace`,
        ),
      );
    if (kind === "label" && name === undefined)
      return err(seedLineError(number, "a label seed requires a name"));
    if (kind === "code" && name !== undefined)
      return err(
        seedLineError(number, "a code seed takes no name; add a label seed"),
      );
    const value = BigInt(address);
    const key = `${value.toString(16)}:${kind}`;
    if (seen.has(key))
      return err(seedLineError(number, `duplicate ${kind} seed at ${address}`));
    seen.add(key);
    entries.push({
      address: value,
      kind,
      ...(name === undefined ? {} : { name }),
    });
    if (entries.length > MAX_GHIDRA_SEED_ENTRIES)
      return err(
        seedLineError(
          number,
          `more than ${MAX_GHIDRA_SEED_ENTRIES} seed entries`,
        ),
      );
  }
  return ok(entries);
};

/** Canonical script input: lowercase addresses, fixed field order, LF endings. */
const normalizedSeeds = (entries: readonly SeedEntry[]): string =>
  entries
    .map(
      (entry) =>
        `0x${entry.address.toString(16)}\t${entry.kind}${entry.name === undefined ? "" : `\t${entry.name}`}\n`,
    )
    .join("");

/** Read a bounded regular file through one handle without following links. */
const readSeedFile = async (
  path: string,
  configured = path,
): Promise<Buffer> => {
  const file = await open(
    path,
    constants.O_RDONLY | constants.O_NOFOLLOW | constants.O_NONBLOCK,
  );
  try {
    const stat = await file.stat();
    if (!stat.isFile())
      throw seedFileConfigurationError(
        configured,
        `Resolved seed path is not a regular file: ${path}`,
      );
    if (stat.size > MAX_GHIDRA_SEED_BYTES)
      throw seedFileConfigurationError(
        configured,
        `Seed file has ${stat.size} bytes; the supported maximum is ${MAX_GHIDRA_SEED_BYTES} bytes`,
      );
    const bytes = Buffer.alloc(stat.size);
    let offset = 0;
    while (offset < bytes.length) {
      const read = await file.read(
        bytes,
        offset,
        bytes.length - offset,
        offset,
      );
      if (read.bytesRead === 0)
        throw new Error(`Incomplete Ghidra seed file read: ${path}`);
      offset += read.bytesRead;
    }
    return bytes;
  } finally {
    await file.close();
  }
};

const sha256 = (bytes: Buffer | string): string =>
  createHash("sha256").update(bytes).digest("hex");

const decodeSeeds = (bytes: Buffer) => {
  const text = new TextDecoder("utf-8", { fatal: true }).decode(bytes);
  return parseGhidraSeeds(text);
};

/** Resolve the configured seed file into an immutable profile commitment. */
export const resolveGhidraAnalysisSeeds = async (
  configured: string | undefined,
): Promise<
  Result<
    GhidraSeedCommitment | undefined,
    | ConfigurationError
    | AnalysisAccessDeniedError
    | AnalysisResourceConstraintError
    | ProviderAdapterError
  >
> => {
  if (configured === undefined) return ok(undefined);
  let bytes: Buffer;
  let path: string;
  try {
    path = await realpath(configured);
    bytes = await readSeedFile(path, configured);
  } catch (cause: unknown) {
    if (cause instanceof ConfigurationError) return err(cause);
    const systemCode: unknown =
      cause instanceof Error ? Reflect.get(cause, "code") : undefined;
    if (systemCode === "EACCES" || systemCode === "EPERM")
      return err(
        new AnalysisAccessDeniedError(
          "resolve_analysis_profile",
          configured,
          systemCode,
          { cause },
        ),
      );
    if (
      systemCode === "ENOENT" ||
      systemCode === "ENOTDIR" ||
      systemCode === "ELOOP" ||
      systemCode === "EISDIR"
    )
      return err(
        seedFileConfigurationError(
          configured,
          `Seed path cannot resolve to a readable regular file (${systemCode})`,
          cause,
        ),
      );
    const diagnostics = {
      setting: "REA_GHIDRA_SEED_FILE",
      path: configured,
      reason: cause instanceof Error ? cause.message : String(cause),
      ...(typeof systemCode === "string" ? { system_code: systemCode } : {}),
    };
    if (systemCode === "ENOSPC")
      return err(
        new AnalysisResourceConstraintError(
          "resolve_analysis_profile",
          "disk",
          "The host reported disk exhaustion while reading the configured Ghidra seed file.",
          null,
          {
            cause,
            context: {
              providerId: "ghidra",
              providerOperation: "resolve_analysis_profile",
              diagnostics,
              observation: { source: "cause.code", signal: "ENOSPC" },
            },
            remediationAction:
              "Restore capacity on the volume holding the configured REA_GHIDRA_SEED_FILE, then reopen the target. Unchanged capacity and configuration can reproduce this failure.",
          },
        ),
      );
    return err(
      new ProviderAdapterError("ghidra", "resolve_analysis_profile", {
        cause,
        diagnostics,
      }),
    );
  }
  let parsed: ReturnType<typeof decodeSeeds>;
  try {
    parsed = decodeSeeds(bytes);
  } catch {
    return err(seedLineError(0, "file is not valid UTF-8"));
  }
  if (!parsed.ok) return parsed;
  const normalized = normalizedSeeds(parsed.value);
  const tally = { function: 0, code: 0, label: 0 };
  for (const entry of parsed.value) tally[entry.kind] += 1;
  return ok({
    format: GHIDRA_SEED_FORMAT,
    path,
    configured_path: configured,
    sha256: sha256(normalized),
    entries: tally,
  });
};

/** Re-read the committed seeds and write the canonical copy the script applies. */
export const snapshotGhidraAnalysisSeeds = async (
  commitment: GhidraSeedCommitment,
  runtimeRoot: string,
): Promise<string> => {
  ghidraSeedCommitmentSchema.parse(commitment);
  if ((await realpath(commitment.configured_path)) !== commitment.path)
    throw new Error(
      "Ghidra seed file resolved path differs from explicit configuration",
    );
  const parsed = decodeSeeds(
    await readSeedFile(commitment.path, commitment.configured_path),
  );
  if (!parsed.ok) throw parsed.error;
  const normalized = normalizedSeeds(parsed.value);
  if (sha256(normalized) !== commitment.sha256)
    throw new Error(
      `Ghidra seed file changed after the analysis profile was committed: ${commitment.path}`,
    );
  const directory = join(runtimeRoot, "seeds");
  await mkdir(directory, { mode: 0o700 });
  const path = join(directory, "seeds.tsv");
  await writeFile(path, normalized, { flag: "wx", mode: 0o600 });
  return path;
};

const totalEntries = (commitment: GhidraSeedCommitment): number =>
  commitment.entries.function +
  commitment.entries.code +
  commitment.entries.label;

/** Fail closed when the session did not apply exactly the committed seeds. */
export const ghidraSeedFailure = (
  commitment: GhidraSeedCommitment | undefined,
  report: GhidraSeedReport | undefined,
  operation: AnalysisOperation,
): ProviderAdapterError | undefined => {
  if (commitment === undefined && report === undefined) return undefined;
  const reason =
    commitment === undefined
      ? "The Ghidra session reported analysis seeds that the profile did not commit."
      : report === undefined
        ? "The Ghidra session did not report the committed analysis seeds."
        : report.sha256 !== commitment.sha256 ||
            report.entries !== totalEntries(commitment)
          ? "The Ghidra session applied analysis seeds that differ from the committed profile."
          : undefined;
  return reason === undefined
    ? undefined
    : new ProviderAdapterError("ghidra", operation, {
        diagnostics: { reason },
      });
};

/** Session limitations that keep seeded facts distinct from Ghidra discoveries. */
export const ghidraSeedLimitations = (
  commitment: GhidraSeedCommitment | undefined,
  report?: GhidraSeedReport,
): readonly string[] =>
  commitment === undefined
    ? []
    : [
        `Ghidra analysis was seeded before auto-analysis from ${commitment.path} (sha256 ${commitment.sha256}: ${commitment.entries.function} function, ${commitment.entries.code} code, ${commitment.entries.label} label entries). Seeded functions, code and names are caller assertions, not Ghidra discoveries.`,
        ...(report === undefined
          ? []
          : [
              `Seed outcome: ${report.function_created} functions created, ${report.function_existing} already present, ${report.function_failed} failed; ${report.code_decoded} code seeds decoded, ${report.code_failed} failed; ${report.label_applied} labels applied, ${report.label_failed} failed; ${report.unmapped} seeds outside initialized memory.`,
            ]),
      ];
