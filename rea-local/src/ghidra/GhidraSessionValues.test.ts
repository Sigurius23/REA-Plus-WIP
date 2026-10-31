import { describe, expect, it } from "vitest";

import {
  GHIDRA_SESSION_CAPABILITIES,
  GHIDRA_MUTATING_OPERATIONS,
  parseGhidraSessionInfo,
} from "./GhidraSessionValues.js";

const expected = {
  runId: "d6fcbb66-e829-4ff6-a535-0035aec63139",
  providerVersion: "12.1.4",
  profileDigest: "a".repeat(64),
  targetSha256: "b".repeat(64),
  expectedLanguageId: "x86:LE:16:Real Mode",
  expectedCompilerSpecId: "default",
};
const session = (
  language = expected.expectedLanguageId,
  compiler = "default",
) => ({
  name: "REA+ Ghidra bridge",
  run_id: expected.runId,
  profile_digest: expected.profileDigest,
  provider: { id: "ghidra", version: expected.providerVersion },
  read_only: false,
  analysis_complete: true,
  analysis_timed_out: false,
  capabilities: [...GHIDRA_SESSION_CAPABILITIES],
  target: {
    name: "legacy.exe",
    language_id: language,
    compiler_spec_id: compiler,
    image_base: "0x0",
    default_address_space: "ram",
    sha256: expected.targetSha256,
  },
});

describe("Ghidra DOS import commitment", () => {
  it("accepts the exact admitted real-mode language and compiler", () => {
    expect(parseGhidraSessionInfo(session(), expected).ok).toBe(true);
  });
  it("rejects a 32-bit interpretation even when artifact and profile hashes match", () => {
    expect(
      parseGhidraSessionInfo(session("x86:LE:32:default"), expected).ok,
    ).toBe(false);
  });
  it("rejects compiler drift independently of the language", () => {
    expect(
      parseGhidraSessionInfo(session(undefined, "windows"), expected).ok,
    ).toBe(false);
  });
});

describe("Ghidra mutation handshake", () => {
  it("requires the exact mutation authority and rejects duplicate capabilities", () => {
    const value = session();
    expect(
      parseGhidraSessionInfo({ ...value, read_only: true }, expected).ok,
    ).toBe(false);
    expect(
      parseGhidraSessionInfo(
        { ...value, capabilities: [...value.capabilities, "ping"] },
        expected,
      ).ok,
    ).toBe(false);
    expect(
      parseGhidraSessionInfo(
        {
          ...value,
          capabilities: value.capabilities.filter(
            (c) => c !== "annotate_native_function",
          ),
        },
        expected,
      ).ok,
    ).toBe(false);
  });
  it("excludes database mutation from the Windows transport handshake", () => {
    const value = session();
    const windows = {
      ...value,
      read_only: true,
      capabilities: value.capabilities.filter(
        (c) => !GHIDRA_MUTATING_OPERATIONS.has(c),
      ),
    };
    expect(
      parseGhidraSessionInfo(windows, { ...expected, expectedReadOnly: true })
        .ok,
    ).toBe(true);
    expect(
      parseGhidraSessionInfo(value, { ...expected, expectedReadOnly: true }).ok,
    ).toBe(false);
  });
  it("treats address naming as database mutation", () => {
    expect([...GHIDRA_MUTATING_OPERATIONS].sort()).toEqual([
      "annotate_native_function",
      "set_address_name",
      "set_addresses_names",
    ]);
    const value = session();
    for (const naming of ["set_address_name", "set_addresses_names"]) {
      expect(value.capabilities).toContain(naming);
      expect(
        parseGhidraSessionInfo(
          {
            ...value,
            capabilities: value.capabilities.filter((c) => c !== naming),
          },
          expected,
        ).ok,
      ).toBe(false);
    }
  });
});

describe("Ghidra bounded analysis commitment", () => {
  it("rejects a budget whose millisecond conversion overflows even when expected identity matches", () => {
    expect(
      parseGhidraSessionInfo(
        { ...session(), analysis_timeout_seconds: 2_147_484 },
        { ...expected, analysisTimeoutSeconds: 2_147_484 },
      ).ok,
    ).toBe(false);
  });
  it("requires exact policy metadata independently of completion or timeout", () => {
    const bounded = {
      ...session(),
      analysis_complete: false,
      analysis_timed_out: true,
      analysis_timeout_seconds: 60,
    };
    expect(
      parseGhidraSessionInfo(bounded, {
        ...expected,
        analysisTimeoutSeconds: 60,
      }).ok,
    ).toBe(true);
    expect(parseGhidraSessionInfo(bounded, expected).ok).toBe(false);
    expect(
      parseGhidraSessionInfo(bounded, {
        ...expected,
        analysisTimeoutSeconds: 61,
      }).ok,
    ).toBe(false);
    expect(
      parseGhidraSessionInfo(session(), {
        ...expected,
        analysisTimeoutSeconds: 60,
      }).ok,
    ).toBe(false);
    expect(
      parseGhidraSessionInfo(
        { ...bounded, analysis_timeout_seconds: 0 },
        { ...expected, analysisTimeoutSeconds: 0 },
      ).ok,
    ).toBe(false);
    expect(
      parseGhidraSessionInfo(
        { ...bounded, analysis_complete: true },
        { ...expected, analysisTimeoutSeconds: 60 },
      ).ok,
    ).toBe(false);
  });
});
