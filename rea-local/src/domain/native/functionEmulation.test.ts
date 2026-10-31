import { describe, expect, it } from "vitest";
import { emulateFunctionInputSchema } from "./functionEmulation.js";

const valid = () => ({
  path: "/owned/program",
  architecture: "arm64",
  entry_address: "0x1000",
  code_regions: [{ address: "0x1000", file_offset: 16, size: 32 }],
});

describe("concrete function experiments", () => {
  it("admits a leaf experiment without synthesizing memory or caller ABI", () => {
    const request = emulateFunctionInputSchema.parse(valid());
    expect(request.memory_regions).toEqual([]);
    expect(request.initial_registers).toEqual({});
    expect(request.max_instructions).toBeGreaterThan(0);
  });

  it.each([
    ["malformed address", { entry_address: "not-hex" }],
    ["address outside code", { entry_address: "0x2000" }],
    ["unaligned arm64 entry", { entry_address: "0x1001" }],
    [
      "overlapping code",
      {
        code_regions: [
          { address: "0x1000", file_offset: 16, size: 32 },
          { address: "0x1004", file_offset: 48, size: 16 },
        ],
      },
    ],
    [
      "overlapping code/data",
      {
        memory_regions: [
          { address: "0x1008", bytes_hex: "00000000", permissions: "rw" },
        ],
      },
    ],
    [
      "conflicting page write permissions",
      {
        memory_regions: [
          { address: "0x1020", bytes_hex: "00", permissions: "rw" },
        ],
      },
    ],
    [
      "implicit observation memory",
      { observe_memory: [{ address: "0x2000", size: 8 }] },
    ],
    [
      "observation into page padding",
      { observe_memory: [{ address: "0x1020", size: 1 }] },
    ],
    ["conflicting PC owner", { initial_registers: { pc: "0x1000" } }],
    ["register alias", { initial_registers: { w0: "0x1" } }],
    ["oversized scalar", { initial_registers: { x0: "0x10000000000000000" } }],
    ["malformed register hex", { initial_registers: { x0: "whoops" } }],
    [
      "odd byte encoding",
      {
        memory_regions: [
          { address: "0x2000", bytes_hex: "0", permissions: "rw" },
        ],
      },
    ],
    [
      "unsupported executable data",
      {
        memory_regions: [
          { address: "0x2000", bytes_hex: "00", permissions: "rwx" },
        ],
      },
    ],
    [
      "address-space overflow",
      {
        memory_regions: [
          {
            address: "0xffffffffffffffff",
            bytes_hex: "0000",
            permissions: "r",
          },
        ],
      },
    ],
    ["instruction allocation bound", { max_instructions: 1_000_001 }],
    ["coverage allocation bound", { max_coverage_entries: 100_001 }],
    ["time bound", { timeout_ms: 30_001 }],
    ["unknown field", { infer_abi: true }],
  ])("rejects %s without evaluating malformed values", (_label, patch) => {
    expect(
      emulateFunctionInputSchema.safeParse({ ...valid(), ...patch }).success,
    ).toBe(false);
  });

  it("retains full 128-bit SIMD input patterns", () => {
    const request = {
      ...valid(),
      initial_registers: { q0: "0xffffffffffffffffffffffffffffffff" },
    };
    expect(emulateFunctionInputSchema.parse(request).initial_registers).toEqual(
      request.initial_registers,
    );
  });

  it("admits observations across adjacent initialized ranges without admitting a gap", () => {
    const request = {
      ...valid(),
      memory_regions: [
        { address: "0x2000", bytes_hex: "00000000", permissions: "rw" },
        { address: "0x2004", bytes_hex: "ffffffff", permissions: "rw" },
      ],
      observe_memory: [{ address: "0x2002", size: 6 }],
    };
    expect(emulateFunctionInputSchema.safeParse(request).success).toBe(true);
    request.memory_regions[1]!.address = "0x2005";
    expect(emulateFunctionInputSchema.safeParse(request).success).toBe(false);
  });
});
