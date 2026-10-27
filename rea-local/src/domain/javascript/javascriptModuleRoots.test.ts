import { describe, expect, it } from "vitest";

import type { JavaScriptArtifactFile } from "./javascriptArtifactFiles.js";
import { discoverJavaScriptModuleRoots } from "./javascriptModuleRoots.js";

const jsFile = (path: string, text: string): JavaScriptArtifactFile =>
  ({
    path,
    container_sha256: "container",
    sha256: `${path}-sha256`,
    bytes: text.length,
    inventory_artifact_id: `artifact-${path}`,
    kind: "javascript",
    unpacked: false,
    text:
      text === ""
        ? { included: false, reason: "invalid-utf8" }
        : { included: true, value: text },
  }) as JavaScriptArtifactFile;

const jsonFile = (path: string): JavaScriptArtifactFile =>
  ({
    path,
    kind: "json",
    text: { included: true, value: "{}" },
  }) as JavaScriptArtifactFile;

describe("discovery of extra module directories from bundler configs", () => {
  it("admits string-literal resolve.modules entries as artifact-relative roots", () => {
    const { roots, limitations } = discoverJavaScriptModuleRoots([
      jsFile(
        "webpack.main.config.js",
        `module.exports = {
          resolve: {
            modules: ['node_modules', './src'],
          },
        };`,
      ),
    ]);
    expect(roots).toEqual(["src"]);
    expect(limitations).toHaveLength(1);
    expect(limitations[0]).toContain("lower-precedence");
  });

  it("resolves relative entries against the config file's directory", () => {
    const { roots, limitations } = discoverJavaScriptModuleRoots([
      jsFile(
        "scripts/webpack.main.config.js",
        `module.exports = { resolve: { modules: ['./src'] } };`,
      ),
    ]);
    expect(roots).toEqual(["scripts/src"]);
    expect(limitations).toHaveLength(1);
  });

  it("walks through function wrappers and helper objects to find resolve", () => {
    const { roots, limitations } = discoverJavaScriptModuleRoots([
      jsFile(
        "webpack.config.js",
        `module.exports = config => ({
          devtool: 'source-map',
          plugins: [foo()],
          resolve: {
            alias: { '#app': './src' },
            modules: ['node_modules', './src'],
          },
        });`,
      ),
    ]);
    expect(roots).toEqual(["src"]);
    expect(limitations).toHaveLength(1);
  });

  it("skips node_modules entries, deduplicates, and keeps declaration order", () => {
    const { roots, limitations } = discoverJavaScriptModuleRoots([
      jsFile(
        "webpack.main.config.js",
        `module.exports = { resolve: { modules: ['node_modules', './src', './typings'] } };`,
      ),
      jsFile(
        "webpack.renderer.config.js",
        `module.exports = { resolve: { modules: ['./typings', './src'] } };`,
      ),
    ]);
    expect(roots).toEqual(["src", "typings"]);
    expect(limitations).toHaveLength(1);
  });

  it("treats artifact-absolute entries as artifact-root-anchored", () => {
    const { roots, limitations } = discoverJavaScriptModuleRoots([
      jsFile(
        "webpack.config.js",
        `module.exports = { resolve: { modules: ['/build/typings'] } };`,
      ),
    ]);
    expect(roots).toEqual(["build/typings"]);
    expect(limitations).toHaveLength(1);
  });

  it("fails closed on non-literal entries and records why", () => {
    const { roots, limitations } = discoverJavaScriptModuleRoots([
      jsFile(
        "webpack.config.js",
        `module.exports = { resolve: { modules: ['node_modules', path.resolve(__dirname, 'src')] } };`,
      ),
    ]);
    expect(roots).toEqual([]);
    expect(limitations).toEqual([
      "The webpack/rspack configuration webpack.config.js declares a resolve.modules entry that is not a string literal; that record is not admitted.",
    ]);
  });

  it("rejects entries escaping the artifact root", () => {
    const { roots, limitations } = discoverJavaScriptModuleRoots([
      jsFile(
        "webpack.config.js",
        `module.exports = { resolve: { modules: ['./src', '../outside'] } };`,
      ),
    ]);
    expect(roots).toEqual(["src"]);
    expect(limitations).toHaveLength(2);
    expect(limitations[0]).toContain("escapes the artifact root");
  });

  it("limits the number of scanned configs and honors unparseable, oversized, and text-unavailable files", () => {
    const files: JavaScriptArtifactFile[] = [
      jsFile(
        "webpack.config.js",
        `module.exports = { resolve: { modules: ['./src'] } };`,
      ),
      jsFile("webpack.config.js", `module.exports = {{{`),
      jsFile("webpack.config.js", "x".repeat(256_001)),
      {
        ...jsFile("webpack.config.js", ""),
        text: { included: false, reason: "invalid-utf8" },
      },
    ];
    const { roots, limitations } = discoverJavaScriptModuleRoots(files);
    expect(roots).toEqual(["src"]);
    expect(limitations).toEqual([
      "The webpack/rspack configuration webpack.config.js does not parse statically; its resolve.modules records are not admitted.",
      "The webpack/rspack configuration webpack.config.js exceeds the bounded scan budget; its resolve.modules records are not admitted.",
      "The webpack/rspack configuration webpack.config.js was inventoried but its text is unavailable: invalid-utf8; its resolve.modules records are not admitted.",
      "1 extra module directory was admitted from webpack/rspack configuration resolve.modules records as lower-precedence bare-specifier candidates after node_modules.",
    ]);
  });

  it("reports nothing for non-config JavaScript, unrelated configs, or absent resolve", () => {
    const { roots, limitations } = discoverJavaScriptModuleRoots([
      jsFile("src/main/store.js", `import { ipcMain } from 'electron';`),
      jsonFile("webpack.config.json"),
      jsFile("webpack.config.js", `module.exports = { output: 'dist' };`),
    ]);
    expect(roots).toEqual([]);
    expect(limitations).toEqual([]);
  });
});
