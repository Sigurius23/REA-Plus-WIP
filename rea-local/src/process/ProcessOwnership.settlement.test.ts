import { afterEach, describe, expect, it, vi } from "vitest";

import {
  cleanupOwnedProcessGroup,
  type ProcessOwnershipHost,
  type ProcessTableEntry,
} from "./ProcessOwnership.js";
import { ownership } from "./ProcessOwnership.fixture.js";

const launcher: ProcessTableEntry = {
  pid: 100,
  parentPid: 1,
  processGroupId: 100,
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

describe("owned process-group cleanup settlement", () => {
  it.each(["planning", "signaling"])(
    "retains a detached owned group when its launcher exits during %s",
    async (phase) => {
      vi.useFakeTimers();
      let launcherReads = 0;
      const unavailableFrom = phase === "planning" ? 1 : 2;
      const signalGroup = vi.fn();
      const adapter: ProcessOwnershipHost = {
        listProcesses: async () =>
          launcherReads > unavailableFrom
            ? [{ ...detached, parentPid: 1 }]
            : [launcher, detached],
        environment: async (pid) => {
          if (pid === launcher.pid) {
            launcherReads += 1;
            if (launcherReads >= unavailableFrom)
              throw new Error("sysctl_failed_22");
          }
          return { REA_PROCESS_RUN_ID: ownership.runId };
        },
        signalGroup,
      };

      const cleanup = cleanupOwnedProcessGroup(ownership, adapter);
      await vi.advanceTimersByTimeAsync(120);
      await expect(cleanup).resolves.toEqual({
        cleaned: true,
        signaled: true,
      });
      expect(signalGroup.mock.calls).toEqual([
        [detached.processGroupId, "SIGKILL"],
      ]);
    },
  );

  it.each(["foreign", "unreadable"])(
    "retains a surviving %s detached group after its launcher exits",
    async (descendant) => {
      vi.useFakeTimers();
      let launcherReads = 0;
      const signalGroup = vi.fn();
      const adapter: ProcessOwnershipHost = {
        listProcesses: async () =>
          launcherReads > 1
            ? [{ ...detached, parentPid: 1 }]
            : [launcher, detached],
        environment: async (pid) => {
          if (pid === launcher.pid) {
            launcherReads += 1;
            throw new Error("sysctl_failed_22");
          }
          if (descendant === "unreadable") throw new Error("sysctl_failed_22");
          return { REA_PROCESS_RUN_ID: "other-run" };
        },
        signalGroup,
      };

      const cleanup = cleanupOwnedProcessGroup(ownership, adapter);
      await vi.advanceTimersByTimeAsync(120);
      await expect(cleanup).resolves.toMatchObject({
        cleaned: false,
        failures: [
          expect.objectContaining({
            pid: detached.pid,
            reason:
              descendant === "foreign"
                ? "run-token-mismatch"
                : "environment-unreadable",
          }),
        ],
      });
      expect(signalGroup).not.toHaveBeenCalled();
    },
  );

  it.each(["planning", "signaling"])(
    "retains uncertainty when a descendant changes groups during %s settlement",
    async (phase) => {
      vi.useFakeTimers();
      let launcherReads = 0;
      const unavailableFrom = phase === "planning" ? 1 : 2;
      const child = { ...detached, processGroupId: launcher.processGroupId };
      const signalGroup = vi.fn();
      const adapter: ProcessOwnershipHost = {
        listProcesses: async () =>
          launcherReads > unavailableFrom
            ? [{ ...detached, parentPid: 1 }]
            : [launcher, child],
        environment: async (pid) => {
          if (pid === launcher.pid) {
            launcherReads += 1;
            if (launcherReads >= unavailableFrom)
              throw new Error("sysctl_failed_22");
          }
          return { REA_PROCESS_RUN_ID: ownership.runId };
        },
        signalGroup,
      };

      const cleanup = cleanupOwnedProcessGroup(ownership, adapter);
      await vi.advanceTimersByTimeAsync(120);
      await expect(cleanup).resolves.toEqual({
        cleaned: false,
        reason: "observed process changed groups during cleanup",
      });
      expect(signalGroup).not.toHaveBeenCalled();
    },
  );
});

describe("owned process-group cleanup sweep deadline", () => {
  it("does not poll an unreadable sweep candidate after the caller deadline expires", async () => {
    vi.useFakeTimers();
    const startedAt = Date.now();
    const signalGroup = vi.fn();
    const adapter: ProcessOwnershipHost = {
      listProcesses: async () => [launcher],
      environment: async () => {
        throw new Error("sysctl_failed_22");
      },
      signalGroup,
    };

    const cleanup = cleanupOwnedProcessGroup(
      { ...ownership, sweepTokenOwnedProcesses: true },
      adapter,
      { settlementDeadlineMs: startedAt },
    );
    await vi.runAllTimersAsync();
    await expect(cleanup).resolves.toMatchObject({
      cleaned: false,
      failures: expect.arrayContaining([
        expect.objectContaining({
          pid: launcher.pid,
          reason: "environment-unreadable",
        }),
      ]),
    });
    expect(Date.now()).toBe(startedAt);
    expect(vi.getTimerCount()).toBe(0);
    expect(signalGroup).not.toHaveBeenCalled();
  });

  it("shares the caller deadline between a launcher sweep and detached-group validation", async () => {
    vi.useFakeTimers();
    const startedAt = Date.now();
    let detachedReads = 0;
    const signalGroup = vi.fn();
    const adapter: ProcessOwnershipHost = {
      listProcesses: async () =>
        Date.now() - startedAt < 200
          ? [launcher, detached]
          : [{ ...detached, parentPid: 1 }],
      environment: async (pid) => {
        if (pid === detached.pid && ++detachedReads === 1)
          return { REA_PROCESS_RUN_ID: ownership.runId };
        throw new Error("sysctl_failed_22");
      },
      signalGroup,
    };

    const cleanup = cleanupOwnedProcessGroup(
      { ...ownership, sweepTokenOwnedProcesses: true },
      adapter,
      { settlementDeadlineMs: startedAt + 500 },
    );
    await vi.runAllTimersAsync();
    await expect(cleanup).resolves.toMatchObject({
      cleaned: false,
      failures: [
        {
          pid: detached.pid,
          reason: "environment-unreadable",
          diagnostic: "sysctl_failed_22",
        },
      ],
    });
    expect(Date.now() - startedAt).toBe(500);
    expect(vi.getTimerCount()).toBe(0);
    expect(signalGroup).not.toHaveBeenCalled();
  });
});

describe("owned process-group cleanup settlement validation", () => {
  it("rejects an unbounded caller deadline before inspecting processes", async () => {
    const listProcesses = vi.fn(async () => [launcher]);
    const signalGroup = vi.fn();
    const adapter: ProcessOwnershipHost = {
      listProcesses,
      environment: async () => ({ REA_PROCESS_RUN_ID: ownership.runId }),
      signalGroup,
    };
    await expect(
      cleanupOwnedProcessGroup(ownership, adapter, {
        settlementDeadlineMs: Number.POSITIVE_INFINITY,
      }),
    ).resolves.toMatchObject({ cleaned: false });
    expect(listProcesses).not.toHaveBeenCalled();
    expect(signalGroup).not.toHaveBeenCalled();
  });

  it("refreshes group membership after pre-signal exit settlement", async () => {
    vi.useFakeTimers();
    let launcherReads = 0;
    let exitObserved = false;
    const signalGroup = vi.fn();
    const adapter: ProcessOwnershipHost = {
      listProcesses: async () => {
        if (launcherReads < 3) return [launcher];
        if (!exitObserved) {
          exitObserved = true;
          return [];
        }
        return [{ ...launcher, command: "replacement-process" }];
      },
      environment: async () => {
        launcherReads += 1;
        if (launcherReads === 2 || launcherReads === 3)
          throw new Error("sysctl_failed_22");
        return {
          REA_PROCESS_RUN_ID:
            launcherReads === 1 ? ownership.runId : "other-run",
        };
      },
      signalGroup,
    };

    const cleanup = cleanupOwnedProcessGroup(ownership, adapter);
    await vi.advanceTimersByTimeAsync(120);
    await expect(cleanup).resolves.toMatchObject({
      cleaned: false,
      failures: [{ pid: launcher.pid, reason: "run-token-mismatch" }],
    });
    expect(signalGroup).not.toHaveBeenCalled();
  });

  it("shares one settlement deadline across groups and keeps persistent EINVAL fail-closed", async () => {
    vi.useFakeTimers();
    const startedAt = Date.now();
    let launcherReads = 0;
    const signalGroup = vi.fn();
    const adapter: ProcessOwnershipHost = {
      listProcesses: async () => [launcher, detached],
      environment: async (pid) => {
        if (pid === launcher.pid && ++launcherReads > 1)
          return { REA_PROCESS_RUN_ID: ownership.runId };
        throw new Error("sysctl_failed_22");
      },
      signalGroup,
    };

    const cleanup = cleanupOwnedProcessGroup(ownership, adapter);
    await vi.advanceTimersByTimeAsync(120);
    await expect(cleanup).resolves.toMatchObject({
      cleaned: false,
      failures: [
        {
          pid: detached.pid,
          reason: "environment-unreadable",
          diagnostic: "sysctl_failed_22",
        },
      ],
    });
    expect(Date.now() - startedAt).toBe(120);
    expect(vi.getTimerCount()).toBe(0);
    expect(signalGroup).not.toHaveBeenCalled();
  });

  it("does not retry a readable ownership mismatch", async () => {
    vi.useFakeTimers();
    const environment = vi
      .fn<ProcessOwnershipHost["environment"]>()
      .mockResolvedValueOnce({ REA_PROCESS_RUN_ID: "other-run" })
      .mockResolvedValue({ REA_PROCESS_RUN_ID: ownership.runId });
    const signalGroup = vi.fn();
    const adapter: ProcessOwnershipHost = {
      listProcesses: async () => [launcher],
      environment,
      signalGroup,
    };

    await expect(
      cleanupOwnedProcessGroup(ownership, adapter),
    ).resolves.toMatchObject({
      cleaned: false,
      failures: [{ pid: launcher.pid, reason: "run-token-mismatch" }],
    });
    expect(environment).toHaveBeenCalledOnce();
    expect(vi.getTimerCount()).toBe(0);
    expect(signalGroup).not.toHaveBeenCalled();
  });
});
