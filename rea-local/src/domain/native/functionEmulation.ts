import { z } from "zod";
import { createEvidence, providerSchema } from "../evidence.js";

/** Bounds cover mapped bytes, trace expansion and complete inline observations separately. */
export const FUNCTION_EMULATION_LIMITS = {
  fileBytes: 256 * 1024 * 1024,
  mappedBytes: 16 * 1024 * 1024,
  observedBytes: 1024 * 1024,
  regions: 256,
  instructions: 1_000_000,
  coverageEntries: 100_000,
  timeoutMs: 30_000,
  outputBytes: 64 * 1024 * 1024,
} as const;

const address = z.string().regex(/^0x(?:0|[1-9a-f][0-9a-f]{0,15})$/);
const registerValue = z.string().regex(/^0x(?:0|[1-9a-f][0-9a-f]{0,31})$/);
const bytesHex = z.string().regex(/^(?:[0-9a-f]{2})*$/);
const size = z.number().int().positive();
const codeRegion = z.strictObject({
  address,
  file_offset: z
    .number()
    .int()
    .nonnegative()
    .max(FUNCTION_EMULATION_LIMITS.fileBytes),
  size: size.max(FUNCTION_EMULATION_LIMITS.mappedBytes),
});
const memoryRegion = z.strictObject({
  address,
  bytes_hex: bytesHex.min(2).max(FUNCTION_EMULATION_LIMITS.mappedBytes * 2),
  permissions: z.enum(["r", "rw"]),
});
const observation = z.strictObject({
  address,
  size: size.max(FUNCTION_EMULATION_LIMITS.observedBytes),
});

/** Explicit byte mappings, register state and budgets; no binary loader or ABI is inferred. */
export const emulateFunctionInputSchema = z
  .strictObject({
    path: z
      .string()
      .min(1)
      .describe(
        "Absolute source artifact path; bytes are never executed as a host process",
      ),
    architecture: z.enum(["arm64", "x86_64"]),
    entry_address: address,
    code_regions: z
      .array(codeRegion)
      .min(1)
      .max(FUNCTION_EMULATION_LIMITS.regions)
      .describe(
        "Read/execute mappings of original file ranges; include only code admitted for this experiment",
      ),
    initial_registers: z.record(z.string().max(8), registerValue).default({}),
    memory_regions: z
      .array(memoryRegion)
      .max(FUNCTION_EMULATION_LIMITS.regions)
      .default([])
      .describe(
        "Fully initialized read-only or writable memory; no implicit stack, BSS or padding access",
      ),
    observe_memory: z
      .array(observation)
      .max(FUNCTION_EMULATION_LIMITS.regions)
      .default([]),
    stop_addresses: z
      .array(address)
      .max(FUNCTION_EMULATION_LIMITS.regions)
      .default([]),
    max_instructions: size
      .max(FUNCTION_EMULATION_LIMITS.instructions)
      .default(10_000),
    max_coverage_entries: size
      .max(FUNCTION_EMULATION_LIMITS.coverageEntries)
      .default(10_000),
    timeout_ms: size.max(FUNCTION_EMULATION_LIMITS.timeoutMs).default(1_000),
  })
  .superRefine((input, context) => {
    if (context.issues.length > 0) return;
    const issue = (path: (string | number)[], message: string) =>
      context.addIssue({ code: "custom", path, message });
    const registers = emulationRegisterNames(input.architecture);
    for (const [name, value] of Object.entries(input.initial_registers)) {
      if (!registers.includes(name) || name === "pc" || name === "rip")
        issue(
          ["initial_registers", name],
          "Use a canonical supported register; entry_address owns the program counter.",
        );
      const bits = /^(q|xmm)\d+$/.test(name)
        ? 128n
        : /^(nzcv|fpcr|fpsr|mxcsr)$/.test(name)
          ? 32n
          : 64n;
      if (BigInt(value) >= 1n << bits)
        issue(
          ["initial_registers", name],
          `Value exceeds the register's ${String(bits)}-bit width.`,
        );
    }
    const regions = [
      ...input.code_regions.map((r) => ({ address: r.address, size: r.size })),
      ...input.memory_regions.map((r) => ({
        address: r.address,
        size: r.bytes_hex.length / 2,
      })),
    ].sort((a, b) => (BigInt(a.address) < BigInt(b.address) ? -1 : 1));
    if (
      regions.reduce((total, region) => total + region.size, 0) >
      FUNCTION_EMULATION_LIMITS.mappedBytes
    ) {
      issue(
        ["memory_regions"],
        `Total code/data mappings exceed ${String(FUNCTION_EMULATION_LIMITS.mappedBytes)} bytes.`,
      );
      return;
    }
    // Unicorn enforces write protection per page. Do not advertise byte-level
    // immutability that a stop request inside a valid-write hook cannot enforce.
    const pageWrites = new Map<bigint, boolean>();
    for (const region of [
      ...input.code_regions.map((r) => ({
        address: r.address,
        size: r.size,
        writable: false,
      })),
      ...input.memory_regions.map((r) => ({
        address: r.address,
        size: r.bytes_hex.length / 2,
        writable: r.permissions === "rw",
      })),
    ]) {
      for (
        let page = BigInt(region.address) & ~4095n;
        page < BigInt(region.address) + BigInt(region.size);
        page += 4096n
      ) {
        const existing = pageWrites.get(page);
        if (existing !== undefined && existing !== region.writable) {
          issue(
            ["memory_regions"],
            "Writable and non-writable ranges cannot share an emulation page (4096 bytes). Choose separate pages.",
          );
          break;
        }
        pageWrites.set(page, region.writable);
      }
    }
    let end = 0n;
    for (const region of regions) {
      const start = BigInt(region.address);
      if (start < end || start + BigInt(region.size) >= 1n << 64n)
        issue(
          ["code_regions"],
          "Mapped ranges must not overlap or exceed the 64-bit address space.",
        );
      end = start + BigInt(region.size);
    }
    const entry = BigInt(input.entry_address);
    if (
      !input.code_regions.some(
        (r) =>
          entry >= BigInt(r.address) &&
          entry < BigInt(r.address) + BigInt(r.size),
      )
    )
      issue(["entry_address"], "Entry must be inside an admitted code region.");
    if (
      input.architecture === "arm64" &&
      (entry % 4n !== 0n ||
        input.code_regions.some(
          (r) => BigInt(r.address) % 4n !== 0n || r.size % 4 !== 0,
        ))
    )
      issue(
        ["code_regions"],
        "arm64 code addresses and sizes must be aligned to four bytes.",
      );
    if (
      input.observe_memory.reduce((sum, r) => sum + r.size, 0) >
      FUNCTION_EMULATION_LIMITS.observedBytes
    )
      issue(
        ["observe_memory"],
        `Selected observations exceed ${String(FUNCTION_EMULATION_LIMITS.observedBytes)} bytes.`,
      );
    for (const [index, range] of input.observe_memory.entries()) {
      let cursor = BigInt(range.address);
      const stop = cursor + BigInt(range.size);
      for (const r of regions) {
        if (
          BigInt(r.address) <= cursor &&
          BigInt(r.address) + BigInt(r.size) > cursor
        )
          cursor = BigInt(r.address) + BigInt(r.size);
        if (cursor >= stop) break;
      }
      if (cursor < stop || stop >= 1n << 64n)
        issue(
          ["observe_memory", index],
          "Observed bytes must be fully covered by explicit mappings.",
        );
    }
  });

/** Canonical register names avoid conflicting alias writes and retain SIMD bit patterns. */
export const emulationRegisterNames = (
  architecture: "arm64" | "x86_64",
): string[] =>
  architecture === "arm64"
    ? [
        ...Array.from({ length: 31 }, (_, n) => `x${n}`),
        "sp",
        "pc",
        "nzcv",
        "fpcr",
        "fpsr",
        ...Array.from({ length: 32 }, (_, n) => `q${n}`),
      ]
    : [
        "rax",
        "rbx",
        "rcx",
        "rdx",
        "rsi",
        "rdi",
        "rbp",
        "rsp",
        ...Array.from({ length: 8 }, (_, n) => `r${n + 8}`),
        "rip",
        "rflags",
        "mxcsr",
        ...Array.from({ length: 16 }, (_, n) => `xmm${n}`),
      ];

const digest = z.string().regex(/^[0-9a-f]{64}$/);
const registerState = z.record(z.string(), registerValue);

/** A conditional emulator observation; coverage counts started instructions, not completed paths. */
export const functionEmulationSchema = z.strictObject({
  artifact: z.strictObject({
    path: z.string().min(1),
    sha256: digest,
    bytes: z.number().int().nonnegative(),
  }),
  architecture: z.enum(["arm64", "x86_64"]),
  entry_address: address,
  engine: z.strictObject({
    profile: z.string().min(1),
    python: z.strictObject({
      selected_path: z.string(),
      path: z.string(),
      sha256: digest,
    }),
    process_image: z.strictObject({ path: z.string(), sha256: digest }),
    libraries: z.array(
      z.strictObject({ name: z.string(), path: z.string(), sha256: digest }),
    ),
  }),
  code_regions: z.array(codeRegion.extend({ sha256: digest })),
  memory_regions: z.array(
    z.strictObject({
      address,
      size,
      permissions: z.enum(["r", "rw"]),
      initial_sha256: digest,
    }),
  ),
  registers_before: registerState,
  registers_after: registerState,
  memory_observations: z.array(
    observation.extend({
      before_hex: bytesHex,
      after_hex: bytesHex,
      changed_bytes: z.number().int().nonnegative(),
    }),
  ),
  coverage: z.strictObject({
    instructions_started: z.number().int().nonnegative(),
    unique_instructions: z.number().int().nonnegative(),
    instructions: z.array(
      z.strictObject({ address, bytes_hex: bytesHex.min(2), visits: size }),
    ),
    meaning: z.literal(
      "Instruction entry counts; a faulting instruction may have partial effects. Boundary-stop instructions are excluded.",
    ),
  }),
  stop: z.strictObject({
    reason: z.enum([
      "function_return",
      "caller_stop",
      "instruction_limit",
      "time_limit",
      "coverage_limit",
      "missing_memory",
      "memory_permission",
      "external_call",
      "control_flow_escape",
      "unexpected_return",
      "unsupported_instruction",
      "engine_error",
    ]),
    address,
    phase: z.enum(["before_instruction", "during_instruction"]),
    target: address.nullable(),
    access: z.enum(["read", "write", "fetch"]).nullable(),
    size: z.number().int().nonnegative().nullable(),
    detail: z.string(),
  }),
  assumptions: z.array(z.string()),
  limitations: z.array(z.string()),
});

export type EmulateFunctionInput = z.output<typeof emulateFunctionInputSchema>;
export type FunctionEmulation = z.output<typeof functionEmulationSchema>;

/** Emulation is conditional replay evidence, separate from observed installed-app behavior. */
export const functionEmulationEvidence = (
  input: EmulateFunctionInput,
  value: FunctionEmulation,
  provider: z.output<typeof providerSchema>,
) =>
  createEvidence(
    {
      path: input.path,
      format: "file",
      architecture: input.architecture,
      sha256: value.artifact.sha256,
    },
    provider,
    {
      operation: "emulate_function",
      parameters: input,
      result: value,
      confidence: "derived",
      authority: "controlled-replay",
      environment: {
        id: value.engine.profile,
        platform: "emulator",
        architecture: input.architecture,
        isolation: "process",
      },
      limitations: value.limitations,
      locations: [
        { kind: "artifact-path", path: input.path },
        { kind: "address", address: input.entry_address },
      ],
    },
  );
