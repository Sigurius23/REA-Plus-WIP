import { createHash, randomUUID } from "node:crypto";
import { access, realpath, writeFile } from "node:fs/promises";
import { constants } from "node:fs";
import { isAbsolute, join } from "node:path";
import { fileURLToPath } from "node:url";
import { z } from "zod";
import type { ExecutionOptions } from "../../application/AnalysisProvider.js";
import type { FunctionEmulationPort } from "../../application/binaryDiagnostics/FunctionEmulationPort.js";
import { readStableArtifact } from "../../artifacts/readStableArtifact.js";
import { AnalysisError } from "../../domain/analysisErrorBase.js";
import {
  AnalysisCancelledError,
  AnalysisCapabilityUnavailableError,
  AnalysisInputError,
  AnalysisOutputError,
  AnalysisResourceConstraintError,
} from "../../domain/analysisErrorCore.js";
import { ProviderCleanupError } from "../../domain/providerCleanupError.js";
import { projectAnalysisError } from "../../domain/analysisErrorProjection.js";
import {
  FUNCTION_EMULATION_LIMITS,
  functionEmulationSchema,
  functionEmulationEvidence,
  type EmulateFunctionInput,
  type FunctionEmulation,
} from "../../domain/native/functionEmulation.js";
import { err, ok, type Result } from "../../domain/result.js";
import {
  runOwnedCommand,
  OwnedCommandFailure,
} from "../../process/OwnedCommand.js";
import type { ProviderProcessSupervisor } from "../../process/ProviderProcess.js";
import { PrivateRuntimeRoot } from "../../process/PrivateRuntimeRoot.js";
import { unicornFailure } from "./UnicornFunctionFailures.js";

/** Exact engine distribution profile; loaded native libraries are separately hash-bound. */
export const UNICORN_FUNCTION_PROVIDER = {
  id: "unicorn-function",
  name: "REA+ bounded function emulator",
  version: "unicorn@2.1.2;capstone@5.0.6;rea-function-v1",
} as const;
const OPERATION = "emulate_function";
type Runtime = Pick<PrivateRuntimeRoot, "path" | "close">;
type PendingCleanup = {
  readonly processUnverified: boolean;
  readonly owner: ProviderProcessSupervisor | undefined;
};
type Launcher = NonNullable<Parameters<typeof runOwnedCommand>[2]>["launcher"];
const replySchema = z.discriminatedUnion("ok", [
  z.strictObject({ ok: z.literal(true), value: functionEmulationSchema }),
  z.strictObject({
    ok: z.literal(false),
    reason: z.enum(["unavailable", "input", "resource", "engine"]),
    message: z.string(),
  }),
]);

/** Original byte snapshots and a supervised Python engine, without loader or host syscall forwarding. */
export class UnicornFunctionProvider implements FunctionEmulationPort {
  readonly identity = UNICORN_FUNCTION_PROVIDER;
  readonly #pending = new Map<Runtime, PendingCleanup>();
  readonly #active = new Map<
    AbortController,
    Promise<Result<FunctionEmulation, AnalysisError>>
  >();
  constructor(
    readonly environment: Readonly<NodeJS.ProcessEnv>,
    readonly launcher?: Launcher,
    readonly createRuntime: () => Promise<Runtime> = () =>
      PrivateRuntimeRoot.create({ prefix: "rea-function-emulation-" }),
  ) {}

  /** Cancel and await active work before retrying retained ownership. */
  async close(): Promise<void> {
    for (const controller of this.#active.keys()) controller.abort();
    await Promise.allSettled([...this.#active.values()]);
    await this.#retryCleanup();
  }

  /** Retain failed ownership and retry it before admitting another experiment. */
  async #retryCleanup(): Promise<void> {
    for (const [root, pending] of this.#pending) {
      if (pending.processUnverified) {
        if (pending.owner === undefined)
          throw new ProviderCleanupError(
            this.identity.id,
            [root.path],
            {
              reason:
                "Unverified process ownership has no retained cleanup lease; private files remain retained.",
            },
            { operation: OPERATION },
          );
        const stopped = await pending.owner.stop();
        if (stopped.status === "incomplete" || stopped.status === "not-owned")
          throw new ProviderCleanupError(
            this.identity.id,
            [root.path],
            {
              reason:
                stopped.status === "incomplete"
                  ? stopped.reason
                  : "Process cleanup lease did not establish ownership.",
            },
            { operation: OPERATION },
          );
      }
      this.#pending.set(root, { processUnverified: false, owner: undefined });
      try {
        await root.close();
      } catch (cause: unknown) {
        throw new ProviderCleanupError(
          this.identity.id,
          [root.path],
          { reason: cause instanceof Error ? cause.message : String(cause) },
          { operation: OPERATION, cause },
        );
      }
      this.#pending.delete(root);
    }
  }

  emulate(
    input: EmulateFunctionInput,
    options?: ExecutionOptions,
  ): Promise<Result<FunctionEmulation, AnalysisError>> {
    if (options?.signal?.aborted)
      return Promise.resolve(err(new AnalysisCancelledError(OPERATION)));
    if (this.#active.size > 0)
      return Promise.resolve(
        err(
          new AnalysisResourceConstraintError(
            OPERATION,
            "memory",
            "One experiment is already active; the provider admits one artifact snapshot and native engine at a time.",
            { max_concurrent_experiments: 1 },
            {
              remediationAction:
                "Wait for the active experiment to finish or cancel it, then submit this request. Concurrent requests remain refused while the one-engine capacity is occupied.",
            },
          ),
        ),
      );
    const controller = new AbortController();
    const signal =
      options?.signal === undefined
        ? controller.signal
        : AbortSignal.any([options.signal, controller.signal]);
    const pending = this.#emulate(input, { ...options, signal }).finally(() =>
      this.#active.delete(controller),
    );
    this.#active.set(controller, pending);
    return pending;
  }

  async #emulate(
    input: EmulateFunctionInput,
    options?: ExecutionOptions,
  ): Promise<Result<FunctionEmulation, AnalysisError>> {
    let root: Runtime | undefined;
    let result: Result<FunctionEmulation, AnalysisError>;
    let retainedOwner: ProviderProcessSupervisor | undefined;
    let retainRoot = false;
    let ownershipFailure: OwnedCommandFailure | undefined;
    let completed: FunctionEmulation | undefined;
    let phase = "configuration";
    try {
      if (options?.signal?.aborted) throw new AnalysisCancelledError(OPERATION);
      await this.#retryCleanup();
      const python = this.environment.REA_UNICORN_PYTHON ?? "";
      if (process.platform !== "darwin" && process.platform !== "linux")
        throw new AnalysisCapabilityUnavailableError(
          this.identity.id,
          OPERATION,
          "Initial emulation process/resource profile supports macOS and Linux; Windows is unverified.",
        );
      if (!isAbsolute(python))
        throw new AnalysisCapabilityUnavailableError(
          this.identity.id,
          OPERATION,
          "Set absolute REA_UNICORN_PYTHON to caller-supplied Python with Unicorn 2.1.2 and Capstone 5.0.6. REA+ never installs the engine.",
        );
      await access(python, constants.X_OK);
      const pythonPath = await realpath(python);
      const pythonIdentity = await readStableArtifact(
        pythonPath,
        FUNCTION_EMULATION_LIMITS.fileBytes,
        options?.signal,
      );
      phase = "artifact-read";
      const artifact = await readStableArtifact(
        input.path,
        FUNCTION_EMULATION_LIMITS.fileBytes,
        options?.signal,
      );
      if (
        input.code_regions.some(
          (region) => region.file_offset + region.size > artifact.bytes.length,
        )
      )
        throw new AnalysisInputError(OPERATION, undefined, [
          {
            path: ["code_regions"],
            reason: "out_of_range",
            message: "Code region exceeds the selected artifact's bytes.",
          },
        ]);
      root = await this.createRuntime();
      const requestPath = join(root.path, "request.json");
      const snapshotPath = join(root.path, "artifact.snapshot");
      const replyPath = join(root.path, "reply.json");
      await writeFile(snapshotPath, artifact.bytes, {
        mode: 0o400,
        flag: "wx",
        ...(options?.signal === undefined ? {} : { signal: options.signal }),
      });
      await writeFile(
        requestPath,
        JSON.stringify({
          input,
          python_path: python,
          snapshot_path: snapshotPath,
          reply_path: replyPath,
          artifact: {
            path: input.path,
            sha256: artifact.sha256,
            bytes: artifact.bytes.length,
          },
        }),
        { mode: 0o600, flag: "wx" },
      );
      phase = "emulator";
      try {
        await runOwnedCommand(
          {
            command: python,
            arguments: [
              "-I",
              fileURLToPath(
                new URL("../../../bridge/unicorn/emulate.py", import.meta.url),
              ),
              requestPath,
            ],
            cwd: root.path,
            runId: `rea-function-emulation-${randomUUID()}`,
            // BYO Python may exec a framework image. Command text is not the
            // ownership proof: the random run token, parent and process group
            // remain required. Launcher and live image hashes are separate.
            expectedCommand: null,
            hostEnvironment: this.environment,
          },
          {
            timeoutMs: input.timeout_ms + 15_000,
            diagnosticBytes: 1024 * 1024,
          },
          {
            ...(options?.signal === undefined
              ? {}
              : { signal: options.signal }),
            ...(this.launcher === undefined ? {} : { launcher: this.launcher }),
          },
        );
      } catch (cause: unknown) {
        if (
          !(cause instanceof OwnedCommandFailure) ||
          cause.cleanupFailure === null
        )
          throw cause;
        ownershipFailure = cause;
        retainRoot = true;
        retainedOwner = cause.cleanupOwner;
      }
      const outputSignal =
        ownershipFailure === undefined ? options?.signal : undefined;
      phase = "reply";
      const replyFile = await readStableArtifact(
        replyPath,
        FUNCTION_EMULATION_LIMITS.outputBytes,
        outputSignal,
      );
      const decoded: unknown = JSON.parse(replyFile.bytes.toString("utf8"));
      const parsed = replySchema.safeParse(decoded);
      if (!parsed.success)
        throw new AnalysisOutputError(
          OPERATION,
          "Emulator reply failed its exact schema.",
          { cause: parsed.error },
        );
      if (!parsed.data.ok)
        throw unicornFailure(parsed.data, phase, input, this.identity.id);
      const value = parsed.data.value;
      if (
        value.artifact.sha256 !== artifact.sha256 ||
        value.artifact.bytes !== artifact.bytes.length ||
        value.engine.profile !== this.identity.version ||
        value.engine.python.path !== pythonPath ||
        value.engine.python.selected_path !== python ||
        value.engine.python.sha256 !== pythonIdentity.sha256 ||
        value.code_regions.some(
          (r) =>
            createHash("sha256")
              .update(
                artifact.bytes.subarray(r.file_offset, r.file_offset + r.size),
              )
              .digest("hex") !== r.sha256,
        ) ||
        (
          await readStableArtifact(
            pythonPath,
            FUNCTION_EMULATION_LIMITS.fileBytes,
            outputSignal,
          )
        ).sha256 !== pythonIdentity.sha256
      )
        throw new AnalysisOutputError(
          OPERATION,
          "Emulator output changed the selected artifact, code bytes or engine identity.",
        );
      completed = value;
      result = options?.signal?.aborted
        ? err(new AnalysisCancelledError(OPERATION))
        : ok(value);
    } catch (cause: unknown) {
      if (
        cause instanceof OwnedCommandFailure &&
        cause.cleanupFailure !== null
      ) {
        retainedOwner = cause.cleanupOwner;
        retainRoot = true;
      }
      result = err(
        cause instanceof AnalysisError
          ? cause
          : unicornFailure(
              cause,
              phase,
              input,
              this.identity.id,
              options?.signal,
            ),
      );
    }
    if (ownershipFailure !== undefined) {
      result = err(
        new ProviderCleanupError(
          this.identity.id,
          ownershipFailure.resources,
          {
            reason: ownershipFailure.cleanupFailure,
            preceding_error: result.ok
              ? null
              : projectAnalysisError(result.error),
          },
          {
            operation: OPERATION,
            cause: ownershipFailure,
            ...(completed === undefined
              ? {}
              : {
                  partialObservation: functionEmulationEvidence(
                    input,
                    completed,
                    this.identity,
                  ),
                }),
          },
        ),
      );
    }
    if (root !== undefined) {
      if (retainRoot)
        this.#pending.set(root, {
          processUnverified: true,
          owner: retainedOwner,
        });
      else {
        try {
          await root.close();
        } catch (cause: unknown) {
          this.#pending.set(root, {
            processUnverified: false,
            owner: undefined,
          });
          return err(
            new ProviderCleanupError(
              this.identity.id,
              [root.path],
              {
                reason: cause instanceof Error ? cause.message : String(cause),
                previous_error: result.ok
                  ? null
                  : projectAnalysisError(result.error),
              },
              {
                operation: OPERATION,
                cause,
                ...(result.ok
                  ? {
                      partialObservation: functionEmulationEvidence(
                        input,
                        result.value,
                        this.identity,
                      ),
                    }
                  : {}),
              },
            ),
          );
        }
      }
    }
    return result;
  }
}
