import type { JsonValue } from "../domain/jsonValue.js";
import type { GhidraSessionError } from "./GhidraSessionError.js";

const object = (value: unknown): value is Record<string, unknown> =>
  value !== null && typeof value === "object" && !Array.isArray(value);

// Accept Java exception lines, not arbitrary Ghidra records or strings,
// target paths, quoted literals, other I/O errors or general disk-space advice.
const javaDiskExceptions = [
  {
    signal: "java.io.IOException",
    pattern:
      /^[\t ]*(?:Caused by:[\t ]*|Exception in thread "[^"\r\n]+"[\t ]*)?java\.io\.IOException:[\t ]*No space left on device[\t ]*$/mu,
  },
  {
    signal: "java.io.FileNotFoundException",
    pattern:
      /^[\t ]*(?:Caused by:[\t ]*|Exception in thread "[^"\r\n]+"[\t ]*)?java\.io\.FileNotFoundException:[^\r\n]*\(No space left on device\)[\t ]*$/mu,
  },
  {
    signal: "java.nio.file.FileSystemException",
    pattern:
      /^[\t ]*(?:Caused by:[\t ]*|Exception in thread "[^"\r\n]+"[\t ]*)?java\.nio\.file\.FileSystemException:[^\r\n]*:[\t ]*No space left on device[\t ]*$/mu,
  },
];

/** Positive capacity observations only; never infer failure from current free space. */
export const ghidraDiskExhaustion = (
  failure: GhidraSessionError,
): Readonly<Record<string, JsonValue>> | undefined => {
  if (failure.kind === "cancelled" || failure.kind === "remote")
    return undefined;
  if (object(failure.cause) && failure.cause.code === "ENOSPC")
    return { source: "cause.code", signal: "ENOSPC" };
  const cause = failure.diagnostics.failure_cause;
  if (object(cause) && cause.code === "ENOSPC")
    return { source: "failure_cause.code", signal: "ENOSPC" };
  // Operation errors must not be reclassified from stale startup log text.
  if (failure.diagnostics.phase !== "startup") return undefined;
  for (const source of ["failure_message", "stdout", "stderr"] as const) {
    const value =
      source === "failure_message"
        ? failure.message
        : failure.diagnostics[source];
    const text =
      typeof value === "string"
        ? value
        : object(value) && typeof value.text === "string"
          ? value.text
          : undefined;
    if (text === undefined) continue;
    for (const { pattern, signal } of javaDiskExceptions) {
      const match = pattern.exec(text);
      if (match !== null)
        return { source, signal, character_offset: match.index };
    }
  }
  return undefined;
};
