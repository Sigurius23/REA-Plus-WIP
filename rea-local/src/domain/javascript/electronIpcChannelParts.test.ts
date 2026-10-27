import { describe, expect, it } from "vitest";

import { electronIpcChannelParts } from "./electronIpcChannelParts.js";

describe("Electron IPC channel expression splitting", () => {
  it("splits identifiers, template literals, and concatenation in source order", () => {
    expect(electronIpcChannelParts("CLOSE_WINDOW")).toEqual([
      { kind: "module-binding", root: "CLOSE_WINDOW", members: [] },
    ]);
    expect(electronIpcChannelParts("ipcMessages.MULT")).toEqual([
      { kind: "module-binding", root: "ipcMessages", members: ["MULT"] },
    ]);
    expect(
      electronIpcChannelParts("`pre-${MULT}-post-${ipcMessages.MULT}`"),
    ).toEqual([
      { kind: "fixed-text", text: "pre-" },
      { kind: "module-binding", root: "MULT", members: [] },
      { kind: "fixed-text", text: "-post-" },
      {
        kind: "module-binding",
        root: "ipcMessages",
        members: ["MULT"],
      },
    ]);
    expect(electronIpcChannelParts('"pre-" + CLOSE_WINDOW + "-post"')).toEqual([
      { kind: "fixed-text", text: "pre-" },
      { kind: "module-binding", root: "CLOSE_WINDOW", members: [] },
      { kind: "fixed-text", text: "-post" },
    ]);
  });

  it("cases roots with alias and object members into a proven chain", () => {
    expect(electronIpcChannelParts("renamedImport.CONST")).toEqual([
      {
        kind: "module-binding",
        root: "renamedImport",
        members: ["CONST"],
      },
    ]);
  });

  it("fails closed on dynamic or unsupported expression syntax", () => {
    for (const expression of ["next()", "ipcMessages[CHANNEL]", "a ? b : c"]) {
      expect(electronIpcChannelParts(expression), expression).toBeNull();
    }
  });

  it("rejects malformed expressions instead of guessing", () => {
    expect(electronIpcChannelParts("CLOSE_WINDOW ==")).toBeNull();
    expect(electronIpcChannelParts("")).toBeNull();
  });
});
