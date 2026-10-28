import { describe, expect, it } from "vitest";

import { writeFixtureFiles } from "../../support/javascriptApplicationFixture.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { reconstructJavaScriptArtifact } from "../../support/javascriptApplicationScope.js";

const APP = "src/main/main.js";
const VENDOR = "node_modules/electron-log/src/main.js";
const MAP = "src/main/main.js.map";

describe("analyze-javascript-application path scope", () => {
  const scopedFixture = async () => {
    const root = await createTestTempDirectory("rea-path-scope-");
    await writeFixtureFiles(root, {
      "package.json": `${JSON.stringify({ name: "scoped", main: APP })}\n`,
      [APP]: `const electron = require("electron");
electron.ipcMain.handle("scoped-ping", () => "pong");
`,
      [VENDOR]: `electron.log.initialize();
`,
      [MAP]: `${JSON.stringify({ version: 3, sources: [], mappings: "" })}\n`,
    });
    return root;
  };

  it("analyzes nothing beyond the admitted patterns and reports the selection", async () => {
    const root = await scopedFixture();
    const result = await reconstructJavaScriptArtifact({
      input_path: root,
      paths_include: ["src/**", "package.json"],
      paths_exclude: ["**/*.map"],
    });
    expect(result.statistics.relevant_files).toBe(2);
    expect(result.statistics.paths_scope).toEqual({
      paths_include: ["src/**", "package.json"],
      paths_exclude: ["**/*.map"],
      considered_files: 4,
      selected_files: 2,
      excluded_files: 2,
    });
    expect(result.statistics.parsed_javascript_files).toBe(1);
    expect(JSON.stringify(result.graph)).not.toContain(VENDOR);
  });

  it("excludes without includes and reports the vendor subtree out", async () => {
    const root = await scopedFixture();
    const result = await reconstructJavaScriptArtifact({
      input_path: root,
      paths_exclude: ["node_modules/**"],
    });
    expect(result.statistics.relevant_files).toBe(3);
    expect(result.statistics.paths_scope).toEqual({
      paths_include: [],
      paths_exclude: ["node_modules/**"],
      considered_files: 4,
      selected_files: 3,
      excluded_files: 1,
    });
  });

  it("analyses everything and reports zero exclusions without options", async () => {
    const root = await scopedFixture();
    const result = await reconstructJavaScriptArtifact({ input_path: root });
    expect(result.statistics.relevant_files).toBe(4);
    expect(result.statistics.paths_scope).toEqual({
      paths_include: [],
      paths_exclude: [],
      considered_files: 4,
      selected_files: 4,
      excluded_files: 0,
    });
  });
});
