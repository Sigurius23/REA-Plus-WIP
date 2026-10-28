import { describe, expect, it } from "vitest";

import { analyzeJavaScriptStaticSource } from "../../domain/javascript/javascriptStaticAnalysis.js";
import { analyzeJavaScriptSemantics } from "../../domain/javascript/javascriptSemanticAnalysis.js";
import { projectJavaScriptModuleSemantics } from "../../domain/javascript/javascriptModuleSemanticIr.js";
import { parseJavaScriptSource } from "../../domain/javascript/javascriptSourceParser.js";
import type { JavaScriptArtifactFile } from "../../domain/javascript/javascriptArtifactFiles.js";
import type { JavaScriptModuleArtifactAnalysis } from "./JavaScriptArtifactAnalysisTypes.js";
import { resolveElectronIpcChannelsViaImports } from "./ElectronIpcChannelResolution.js";

const sourceFile = (path: string, text: string): JavaScriptArtifactFile => {
  const parsed = parseJavaScriptSource(text, path);
  if (parsed === null) throw new Error(`test source failed to parse: ${path}`);
  return {
    path,
    kind: "javascript",
    sha256: `${path}-sha256`,
    text: { included: true, value: text },
  } as JavaScriptArtifactFile;
};

const analyzedFile = (path: string, text: string) => {
  const parsed = parseJavaScriptSource(text, path);
  if (parsed === null) throw new Error(`test source failed to parse: ${path}`);
  return {
    file: sourceFile(path, text),
    javascript: analyzeJavaScriptStaticSource(text),
    semantic: {
      ir: projectJavaScriptModuleSemantics(analyzeJavaScriptSemantics(text)),
    },
  };
};

const analysisOf = (...entries: { path: string; text: string }[]) =>
  ({
    files: entries.map(({ path, text }) => analyzedFile(path, text)),
    packages: [],
    json_modules: [],
    html_scripts: [],
    source_maps: [],
    visited_ast_nodes: 0,
    findings: 0,
    modules: 0,
    parse_failures: 0,
    limitations: [],
  }) as JavaScriptModuleArtifactAnalysis;

describe("Electron IPC channel resolution through imported constants", () => {
  it("resolves direct and composed channels from imported constants", () => {
    const analysis = analysisOf(
      {
        path: "app/src/utils/ipcMessages.js",
        text: `
          export const CLOSE_WINDOW = "closeWindow";
          export const MULT = "multiOn";
        `,
      },
      {
        path: "app/src/main/store.js",
        text: `
          import { ipcMain } from "electron";
          import * as ipcMessages from "../utils/ipcMessages";
          import { CLOSE_WINDOW } from "../utils/ipcMessages";
          ipcMain.handle(CLOSE_WINDOW, () => "closed");
          ipcMain.handle(ipcMessages.MULT, () => "multi");
          ipcMain.handle(\`pre-\${ipcMessages.MULT}-post\`, () => "m");
          ipcMain.handle("missing-" + ipcMessages.MISSING, () => "x");
        `,
      },
    );

    const { analysis: resolved, resolved_channel_operations } =
      resolveElectronIpcChannelsViaImports(analysis);

    expect(resolved_channel_operations).toBe(3);
    const findings = resolved.files.flatMap(
      ({ javascript }) => javascript?.electron.ipc ?? [],
    );
    expect(findings).toEqual([
      expect.objectContaining({
        side: "main",
        operation: "handle",
        channel: "closeWindow",
        channel_expression: null,
        channel_origin: "imported-constant",
      }),
      expect.objectContaining({ channel: "multiOn" }),
      expect.objectContaining({ channel: "pre-multiOn-post" }),
      expect.objectContaining({
        channel: null,
        channel_expression: '"missing-" + ipcMessages.MISSING',
      }),
    ]);
    // The unresolvable site keeps the absent origin marker and stays dynamic.
    expect(findings[3]).not.toHaveProperty("channel_origin");
    expect(findings[3]).toEqual(
      expect.objectContaining({
        channel: null,
        channel_expression: '"missing-" + ipcMessages.MISSING',
      }),
    );
    expect(resolved.limitations).toHaveLength(1);
  });

  it("resolves channels destructured from a namespace import", () => {
    const analysis = analysisOf(
      {
        path: "app/src/main/utils/ipcMessages.js",
        text: `export const MAXIMIZE_WINDOW = "maximizeWindow";`,
      },
      {
        path: "app/src/main/modules/windowManager.js",
        text: `
          import { ipcMain } from "electron";
          import * as ipcMessages from "../utils/ipcMessages";
          const { MAXIMIZE_WINDOW } = ipcMessages;
          ipcMain.on(MAXIMIZE_WINDOW, () => {});
        `,
      },
    );

    const { analysis: resolved, resolved_channel_operations } =
      resolveElectronIpcChannelsViaImports(analysis);

    expect(resolved_channel_operations).toBe(1);
    const finding = resolved.files.flatMap(
      ({ javascript }) => javascript?.electron.ipc ?? [],
    )[0];
    expect(finding).toEqual(
      expect.objectContaining({ channel: "maximizeWindow" }),
    );
  });

  it("keeps channels dynamic for local constants, shadows, and unresolvable imports", () => {
    const analysis = analysisOf(
      {
        path: "app/src/utils/ipcMessages.js",
        text: `export const CLOSE_WINDOW = "closeWindow";`,
      },
      {
        path: "app/src/main/store.js",
        text: `
          import { ipcMain } from "electron";
          import { CLOSE_WINDOW } from "../utils/ipcMessages";
          const LOCAL_CHANNEL = "local";
          ipcMain.handle(LOCAL_CHANNEL, () => "a");
          ipcMain.handle(UNBOUND_NAME, () => "b");
          ipcMain.handle(dynamicChannel(), () => "c");
        `,
      },
    );

    const {
      analysis: resolved,
      resolved_channel_operations,
      unresolved_channel_operations,
    } = resolveElectronIpcChannelsViaImports(analysis);

    expect(resolved_channel_operations).toBe(0);
    expect(unresolved_channel_operations).toBe(3);
    const findings = resolved.files.flatMap(
      ({ javascript }) => javascript?.electron.ipc ?? [],
    );
    for (const { channel } of findings) expect(channel).toBeNull();
    expect(resolved.limitations).toEqual(analysis.limitations);
  });
});

describe("Electron IPC channel resolution across artifact module roots", () => {
  it("resolves bare-specifier constants admitted by module roots", () => {
    const analysis = analysisOf(
      {
        path: "src/utils/ipcMessages.js",
        text: `export const CHECK_CONNECTION = "checkConnection";`,
      },
      {
        path: "src/main/modules/online.js",
        text: `
          import { ipcMain } from "electron";
          import { CHECK_CONNECTION } from "utils/ipcMessages";
          ipcMain.handle(CHECK_CONNECTION, () => true);
        `,
      },
    );

    const { analysis: resolved, resolved_channel_operations } =
      resolveElectronIpcChannelsViaImports(analysis, ["src"]);

    expect(resolved_channel_operations).toBe(1);
    const findings = resolved.files.flatMap(
      ({ javascript }) => javascript?.electron.ipc ?? [],
    );
    expect(findings[0]).toEqual(
      expect.objectContaining({
        channel: "checkConnection",
        channel_origin: "imported-constant",
      }),
    );
  });

  it("keeps bare-specifier constants dynamic without admitted module roots", () => {
    const analysis = analysisOf(
      {
        path: "src/utils/ipcMessages.js",
        text: `export const CHECK_CONNECTION = "checkConnection";`,
      },
      {
        path: "src/main/modules/online.js",
        text: `
          import { ipcMain } from "electron";
          import { CHECK_CONNECTION } from "utils/ipcMessages";
          ipcMain.handle(CHECK_CONNECTION, () => true);
        `,
      },
    );

    const {
      analysis: resolved,
      resolved_channel_operations,
      unresolved_channel_operations,
    } = resolveElectronIpcChannelsViaImports(analysis);

    expect(resolved_channel_operations).toBe(0);
    expect(unresolved_channel_operations).toBe(1);
    const findings = resolved.files.flatMap(
      ({ javascript }) => javascript?.electron.ipc ?? [],
    );
    for (const { channel } of findings) expect(channel).toBeNull();
  });

  it("fails closed when the provider constant leaves the artifact", () => {
    const analysis = analysisOf({
      path: "app/src/main/store.js",
      text: `
          import { ipcMain } from "electron";
          import { CLOSE_WINDOW } from "electron-remote-constants";
          ipcMain.handle(CLOSE_WINDOW, () => "d");
        `,
    });

    const { analysis: resolved, unresolved_channel_operations } =
      resolveElectronIpcChannelsViaImports(analysis);

    expect(unresolved_channel_operations).toBe(1);
    const findings = resolved.files.flatMap(
      ({ javascript }) => javascript?.electron.ipc ?? [],
    );
    for (const { channel } of findings) expect(channel).toBeNull();
  });
});
