import { createHash } from "node:crypto";

import { expect, it } from "vitest";

import { analyzeJavaScriptStaticSource } from "../../domain/javascript/javascriptStaticAnalysis.js";
import type { JavaScriptArtifactFile } from "../../domain/javascript/javascriptArtifactFiles.js";
import { err, ok } from "../../domain/result.js";
import { AnalysisTimeoutError } from "../../domain/analysisErrorCore.js";
import { prepareJavaScriptArtifactSourcesSteps } from "./JavaScriptInlineSources.js";
import { completeJavaScriptAnalysisSteps } from "./JavaScriptAnalysisControl.js";
import { analyzeAndAdoptJavaScriptArtifactFiles } from "./JavaScriptArtifactAnalysis.js";
import { createJavaScriptSemanticGraphProjection } from "./JavaScriptSemanticGraphBuilder.js";

const source = (path: string, value: string): JavaScriptArtifactFile => ({
  path,
  sha256: createHash("sha256").update(value).digest("hex"),
  container_sha256: "1".repeat(64),
  bytes: Buffer.byteLength(value),
  inventory_artifact_id: "fixture-source",
  kind: "javascript",
  unpacked: false,
  text: { included: true, value },
});

it("analyzes JavaScript smallest first in place and reports inventory order", async () => {
  const files = [
    source("vendor.js", `fetch("/vendor");${" ".repeat(4096)}`),
    { ...source("data.json", "{}"), kind: "json" as const },
    source("app.js", `fetch("/app");${" ".repeat(64)}`),
    source("tiny.js", `fetch("/tiny");`),
  ];
  const analyzed: string[] = [];
  const order: string[] = [];
  const { analysis, interruption } =
    await analyzeAndAdoptJavaScriptArtifactFiles(
      {
        files,
        containers: [],
        text_bytes_read: 0,
        invalid_utf8_files: 0,
        paths_scope: {
          paths_include: [],
          paths_exclude: [],
          considered_files: files.length,
          selected_files: files.length,
          excluded_files: 0,
        },
      },
      {
        analyze: async (file) => {
          analyzed.push(file.path);
          if (!file.text.included) throw new Error("Source text is missing");
          return ok({
            javascript: analyzeJavaScriptStaticSource(file.text.value),
            module: null,
            projection: null,
          });
        },
      },
      createJavaScriptSemanticGraphProjection(),
      async (file) => {
        order.push(file.path);
      },
    );
  expect(interruption).toBeNull();
  expect(analyzed).toEqual(["tiny.js", "app.js", "vendor.js"]);
  expect(order).toEqual(["tiny.js", "data.json", "app.js", "vendor.js"]);
  expect(analysis.files.map(({ file }) => file.path)).toEqual([
    "vendor.js",
    "data.json",
    "app.js",
    "tiny.js",
  ]);
});

it.each(["worker-result", "before-html"] as const)(
  "retains known HTML admission and unsupported-body facts after %s interruption",
  async (phase) => {
    const html = {
      ...source(
        "b.html",
        '<script>fetch("/one")</script><script>fetch("/tail")',
      ),
      kind: "html" as const,
    };
    const js = source("a.js", 'fetch("/earlier");');
    const files = phase === "before-html" ? [html, js] : [js, html];
    const prepared = await completeJavaScriptAnalysisSteps(
      prepareJavaScriptArtifactSourcesSteps(
        {
          files,
          containers: [],
          text_bytes_read: 0,
          invalid_utf8_files: 0,
          paths_scope: {
            paths_include: [],
            paths_exclude: [],
            considered_files: 2,
            selected_files: 2,
            excluded_files: 0,
          },
        },
        phase === "worker-result" ? 0 : 1000,
      ),
    );
    const timeout = new AnalysisTimeoutError(
      "analyze_javascript_application",
      1,
    );
    const { analysis, interruption } =
      await analyzeAndAdoptJavaScriptArtifactFiles(
        prepared,
        {
          analyze: async () =>
            err({
              error: timeout,
              javascript: null,
              module: null,
              projection: null,
            }),
        },
        createJavaScriptSemanticGraphProjection(),
        async (file) => {
          if (phase === "before-html" && file.kind === "html") throw timeout;
        },
      );
    expect(interruption).toBe(timeout);
    const retained = analysis.files.find(({ file }) => file.path === "b.html");
    expect(retained?.html).toMatchObject({
      inline_script_count: 2,
      omitted_inline_scripts: phase === "worker-result" ? 2 : 0,
    });
    if (phase === "before-html") {
      expect(
        retained?.html?.inline_scripts.some(({ terminated }) => !terminated),
      ).toBe(true);
      expect(analysis.limitations.join(" ")).toContain("unterminated");
    } else {
      expect(analysis.limitations.join(" ")).toContain(
        "max_inline_scripts (0)",
      );
    }
  },
);
