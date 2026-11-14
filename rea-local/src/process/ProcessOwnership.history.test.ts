import { EventEmitter } from "node:events";
import { PassThrough } from "node:stream";
import { describe, expect, it, vi } from "vitest";

import {
  createOwnedProcessGroupCleanup,
  type ProcessOwnershipHost,
  type ProcessTableEntry,
} from "./ProcessOwnership.js";
import { ownership } from "./ProcessOwnership.fixture.js";
import {
  ProviderProcessSupervisor,
  withOwnedProviderProcessCleanup,
} from "./ProviderProcess.js";

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

const fixture = () => {
  let processes: readonly ProcessTableEntry[] = [launcher, detached];
  let token: "unreadable" | "owned" | "foreign" = "unreadable";
  let identity = "original";
  const signalGroup = vi.fn((processGroupId: number) => {
    processes = processes.filter(
      (process) => process.processGroupId !== processGroupId,
    );
  });
  const host: ProcessOwnershipHost = {
    listProcesses: async () => processes,
    processIdentities: async (members) =>
      new Map(
        members.map(({ pid }) => [
          pid,
          {
            state: "readable" as const,
            identity: `${identity}:${String(pid)}`,
          },
        ]),
      ),
    environment: async (pid) => {
      if (pid === launcher.pid) return { REA_PROCESS_RUN_ID: ownership.runId };
      if (token === "unreadable") throw new Error("sysctl_failed_22");
      return {
        REA_PROCESS_RUN_ID: token === "owned" ? ownership.runId : "foreign",
      };
    },
    signalGroup,
  };
  const child = Object.assign(new EventEmitter(), {
    pid: launcher.pid,
    stdout: new PassThrough(),
    stderr: new PassThrough(),
    exitCode: null as number | null,
    signalCode: null,
    kill: vi.fn(() => false),
  });
  return {
    child,
    signalGroup,
    cleanup: createOwnedProcessGroupCleanup(ownership, host),
    orphan: () => {
      processes = [{ ...detached, parentPid: 1 }];
      child.exitCode = 0;
      child.emit("exit", 0, null);
    },
    readable: () => {
      token = "owned";
    },
    foreign: () => {
      token = "foreign";
    },
    reused: () => {
      token = "owned";
      identity = "replacement";
    },
    gone: () => {
      processes = [];
    },
    migrated: () => {
      processes = [{ ...detached, parentPid: 1, processGroupId: 102 }];
    },
  };
};

describe("owned cleanup history across attempts", () => {
  it.each(["stop", "launch rollback"])(
    "retains an unreadable orphan after incomplete %s and later cleans only with fresh ownership",
    async (firstAttempt) => {
      const run = fixture();
      const launch = {
        process: run.child,
        ownsProcessLifetime: true as const,
        ownership,
        cleanup: run.cleanup,
      };
      let supervisor: ProviderProcessSupervisor | undefined;
      try {
        if (firstAttempt === "stop") {
          supervisor = new ProviderProcessSupervisor(launch);
          await expect(
            supervisor.stop({ killGraceMs: 0 }),
          ).resolves.toMatchObject({ status: "incomplete" });
        } else {
          await expect(
            run.cleanup({ settlementDeadlineMs: Date.now() }),
          ).resolves.toMatchObject({ cleaned: false });
        }
        run.orphan();
        supervisor ??= new ProviderProcessSupervisor(launch);
        await expect(
          supervisor.stop({ killGraceMs: 0 }),
        ).resolves.toMatchObject({
          status: "incomplete",
          reason: expect.stringContaining("101=sysctl_errno_22"),
        });
        expect(run.signalGroup).not.toHaveBeenCalled();
        run.readable();
        await expect(supervisor.stop({ killGraceMs: 0 })).resolves.toEqual({
          status: "verified-cleanup",
        });
        expect(run.signalGroup.mock.calls).toEqual([
          [detached.processGroupId, "SIGKILL"],
        ]);
        expect(run.child.kill).not.toHaveBeenCalled();
      } finally {
        supervisor?.dispose();
      }
    },
  );

  it.each(["foreign", "reused", "migrated"] as const)(
    "does not turn retained candidates into authority for a %s process",
    async (change) => {
      const run = fixture();
      const expired = { settlementDeadlineMs: Date.now() };
      await expect(run.cleanup(expired)).resolves.toMatchObject({
        cleaned: false,
      });
      run.orphan();
      run[change]();
      await expect(run.cleanup(expired)).resolves.toMatchObject({
        cleaned: false,
      });
      expect(run.signalGroup).not.toHaveBeenCalled();
      run.gone();
      await expect(run.cleanup(expired)).resolves.toEqual({
        cleaned: true,
        signaled: false,
      });
    },
  );

  it("reuses an injected cleanup capability without replacing its retained history", () => {
    const run = fixture();
    const spawned = { process: run.child, ownership, cleanup: run.cleanup };
    expect(withOwnedProviderProcessCleanup(spawned).cleanup).toBe(run.cleanup);
    expect(
      withOwnedProviderProcessCleanup(withOwnedProviderProcessCleanup(spawned))
        .cleanup,
    ).toBe(run.cleanup);
  });

  it("retains a group first discovered during pre-signal validation for another attempt", async () => {
    let listed = 0;
    let processes: readonly ProcessTableEntry[] = [launcher];
    const signalGroup = vi.fn((groupId: number) => {
      processes = processes.filter(
        ({ processGroupId }) => processGroupId !== groupId,
      );
    });
    const cleanup = createOwnedProcessGroupCleanup(ownership, {
      listProcesses: async () => {
        if (++listed === 2) processes = [launcher, detached];
        return processes;
      },
      environment: async () => ({ REA_PROCESS_RUN_ID: ownership.runId }),
      signalGroup,
    });
    await expect(cleanup()).resolves.toMatchObject({
      cleaned: false,
      reason: "additional process groups were discovered during cleanup",
    });
    await expect(cleanup()).resolves.toEqual({ cleaned: true, signaled: true });
    expect(signalGroup.mock.calls).toEqual([
      [launcher.processGroupId, "SIGKILL"],
      [detached.processGroupId, "SIGKILL"],
    ]);
  });
});
