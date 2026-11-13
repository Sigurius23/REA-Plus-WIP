import { EventEmitter } from "node:events";
import { PassThrough } from "node:stream";
import { afterEach, describe, expect, it, vi } from "vitest";

import {
  cleanupOwnedProcessGroup,
  type OwnedProcessCleanupOptions,
  type ProcessOwnershipHost,
  type ProcessTableEntry,
} from "./ProcessOwnership.js";
import { ownership } from "./ProcessOwnership.fixture.js";
import { ProviderProcessSupervisor } from "./ProviderProcess.js";

const producer = () =>
  Object.assign(new EventEmitter(), {
    pid: ownership.leaderPid,
    stdout: new PassThrough(),
    stderr: new PassThrough(),
    exitCode: null,
    signalCode: null,
    kill: vi.fn(() => false),
  });

const launcher: ProcessTableEntry = {
  pid: ownership.leaderPid,
  parentPid: 1,
  processGroupId: ownership.processGroupId,
  state: "S",
  command: "fixture",
};
const detached: ProcessTableEntry = {
  ...launcher,
  pid: 101,
  parentPid: launcher.pid,
  processGroupId: 101,
};

afterEach(() => vi.useRealTimers());

describe("provider stop grace funds retained ownership settlement", () => {
  it.each(["owned", "unreadable"])(
    "retains a %s detached survivor when its launcher exits after the default settlement interval",
    async (descendant) => {
      vi.useFakeTimers();
      const child = producer();
      const startedAt = Date.now();
      const signalGroup = vi.fn();
      const host: ProcessOwnershipHost = {
        listProcesses: async () =>
          Date.now() - startedAt < 240
            ? [launcher, detached]
            : [{ ...detached, parentPid: 1 }],
        environment: async (pid) => {
          if (pid === launcher.pid || descendant === "unreadable")
            throw new Error("sysctl_failed_22");
          return { REA_PROCESS_RUN_ID: ownership.runId };
        },
        signalGroup,
      };
      const cleanup = vi.fn((options?: OwnedProcessCleanupOptions) =>
        cleanupOwnedProcessGroup(ownership, host, options),
      );
      const supervisor = new ProviderProcessSupervisor({
        process: child,
        ownsProcessLifetime: true,
        ownership,
        cleanup,
      });
      setTimeout(() => child.emit("exit", 0, null), 240);
      let settled = false;
      const stopping = supervisor.stop({ killGraceMs: 500 });
      void stopping.then(() => {
        settled = true;
      });
      try {
        await vi.advanceTimersByTimeAsync(120);
        expect(settled).toBe(false);
        await vi.advanceTimersByTimeAsync(380);
        if (descendant === "owned") {
          await expect(stopping).resolves.toEqual({
            status: "verified-cleanup",
          });
          expect(signalGroup.mock.calls).toEqual([
            [detached.processGroupId, "SIGKILL"],
          ]);
        } else {
          await expect(stopping).resolves.toMatchObject({
            status: "incomplete",
            reason: expect.stringContaining("101=sysctl_errno_22"),
          });
          expect(signalGroup).not.toHaveBeenCalled();
          expect(Date.now() - startedAt).toBe(500);
        }
        expect(cleanup).toHaveBeenCalledOnce();
        expect(cleanup).toHaveBeenCalledWith({
          settlementDeadlineMs: startedAt + 500,
        });
        expect(supervisor.snapshot().exitCode).toBe(0);
        expect(child.kill).not.toHaveBeenCalled();
      } finally {
        supervisor.dispose();
      }
    },
  );
});

describe("provider stop deadline propagation", () => {
  it("shares the remaining grace with exit waits and a later cleanup attempt", async () => {
    vi.useFakeTimers();
    const child = producer();
    const startedAt = Date.now();
    let attempts = 0;
    const cleanup = vi.fn(async (_options?: OwnedProcessCleanupOptions) => {
      if (attempts++ === 0)
        await new Promise((resolve) => setTimeout(resolve, 200));
      return { cleaned: true, signaled: false } as const;
    });
    const supervisor = new ProviderProcessSupervisor({
      process: child,
      ownsProcessLifetime: true,
      cleanup,
    });
    try {
      const stopping = supervisor.stop({ killGraceMs: 500 });
      await vi.runAllTimersAsync();
      await expect(stopping).resolves.toEqual({
        status: "incomplete",
        reason: "verified process-group cleanup did not stop the launcher",
      });
      expect(Date.now() - startedAt).toBeLessThanOrEqual(501);
      expect(cleanup.mock.calls).toEqual([
        [{ settlementDeadlineMs: startedAt + 500 }],
        [{ settlementDeadlineMs: startedAt + 500 }],
      ]);
      expect(child.kill).not.toHaveBeenCalled();
    } finally {
      supervisor.dispose();
    }
  });

  it("forwards the existing default kill grace to owned cleanup", async () => {
    const child = producer();
    const cleanup = vi.fn(async (_options?: OwnedProcessCleanupOptions) => {
      child.emit("exit", 0, null);
      return { cleaned: true, signaled: false } as const;
    });
    const supervisor = new ProviderProcessSupervisor({
      process: child,
      ownsProcessLifetime: true,
      cleanup,
    });
    const startedAt = Date.now();
    try {
      await expect(supervisor.stop()).resolves.toEqual({
        status: "verified-cleanup",
      });
      const deadline = cleanup.mock.calls[0]?.[0]?.settlementDeadlineMs;
      expect(deadline).toBeGreaterThanOrEqual(startedAt + 1_000);
      expect(deadline).toBeLessThanOrEqual(Date.now() + 1_000);
    } finally {
      supervisor.dispose();
    }
  });

  it.each([Number.POSITIVE_INFINITY, -1])(
    "rejects an invalid owned stop grace before cleanup: %s",
    async (killGraceMs) => {
      const cleanup = vi.fn(
        async () => ({ cleaned: true, signaled: false }) as const,
      );
      const supervisor = new ProviderProcessSupervisor({
        process: producer(),
        ownsProcessLifetime: true,
        cleanup,
      });
      try {
        await expect(supervisor.stop({ killGraceMs })).resolves.toMatchObject({
          status: "incomplete",
        });
        expect(cleanup).not.toHaveBeenCalled();
      } finally {
        supervisor.dispose();
      }
    },
  );
});
