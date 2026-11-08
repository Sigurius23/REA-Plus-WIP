import { expect, it } from "vitest";
import { ghidraDiskExhaustion } from "./GhidraDiskExhaustion.js";
import {
  GhidraSessionError,
  bindGhidraSessionFailure,
} from "./GhidraSessionError.js";

it.each([
  ["java.io.IOException: No space left on device", "java.io.IOException"],
  [
    "Caused by: java.io.IOException: No space left on device",
    "java.io.IOException",
  ],
  [
    'Exception in thread "main" java.io.FileNotFoundException: /tmp/project (No space left on device)',
    "java.io.FileNotFoundException",
  ],
  [
    "\tCaused by: java.nio.file.FileSystemException: /tmp/project: No space left on device",
    "java.nio.file.FileSystemException",
  ],
])("recognizes a complete Java capacity exception line: %s", (text, signal) => {
  const output = `preceding output\n${text}\n`;
  const failure = new GhidraSessionError(
    "process",
    "Ghidra exited before bridge startup",
    {
      phase: "startup",
      exit_code: 0,
      diagnostic_truncated: true,
      stdout: {
        text: output,
        bytes: 999,
        retained_bytes: Buffer.byteLength(output),
      },
    },
  );
  expect(ghidraDiskExhaustion(failure)).toEqual({
    source: "stdout",
    signal,
    character_offset: 17,
  });
});

it("recognizes native ENOSPC independently of failure phase and without log guessing", () => {
  const cause = Object.assign(new Error("write failed"), { code: "ENOSPC" });
  const failure = bindGhidraSessionFailure(() => ({ phase: "operation" }))(
    "process",
    "Snapshot write failed",
    cause,
  );
  expect(ghidraDiskExhaustion(failure)).toEqual({
    source: "cause.code",
    signal: "ENOSPC",
  });
  const serialized = new GhidraSessionError("start", "Write failed", {
    failure_cause: { code: "ENOSPC", message: "write failed" },
  });
  expect(ghidraDiskExhaustion(serialized)).toEqual({
    source: "failure_cause.code",
    signal: "ENOSPC",
  });
});

it.each([
  "No space left on device",
  "INFO imported string: java.io.IOException: No space left on device",
  "ERROR invalid name 'java.io.IOException: No space left on device'",
  "java.io.IOException: Permission denied",
  "java.io.IOException: No space left on device-like message",
  "java.io.FileNotFoundException: /tmp/No space left on device (Permission denied)",
  "java.nio.file.FileSystemException: /tmp/No space left on device: Permission denied",
  '"java.io.IOException: No space left on device"',
])(
  "does not infer disk exhaustion from unrelated or ambiguous text: %s",
  (text) => {
    const failure = new GhidraSessionError("process", "Unknown failure", {
      phase: "startup",
      target_path: text,
      stdout: { text },
      failure_cause: { code: "EIO", message: text },
    });
    expect(ghidraDiskExhaustion(failure)).toBeUndefined();
  },
);

it.each(["remote", "cancelled"] as const)(
  "does not override %s with capacity diagnostics",
  (kind) => {
    const failure = new GhidraSessionError(
      kind,
      "java.io.IOException: No space left on device",
      { phase: "startup", failure_cause: { code: "ENOSPC" } },
      { cause: Object.assign(new Error("write"), { code: "ENOSPC" }) },
    );
    expect(ghidraDiskExhaustion(failure)).toBeUndefined();
  },
);

it("does not reclassify an operation from a stale startup exception", () => {
  const failure = new GhidraSessionError(
    "protocol",
    "Unreadable operation reply",
    {
      phase: "operation",
      stdout: { text: "java.io.IOException: No space left on device" },
    },
  );
  expect(ghidraDiskExhaustion(failure)).toBeUndefined();
});
