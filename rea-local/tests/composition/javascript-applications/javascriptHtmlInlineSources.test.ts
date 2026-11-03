import { createHash } from "node:crypto";
import { mkdir, writeFile } from "node:fs/promises";
import { dirname, join } from "node:path";
import { expect, it } from "vitest";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { scanCanonicalArtifactInventory } from "../../fixtures/artifactInventory.js";
import { readJavaScriptArtifactFiles } from "../../support/javascriptApplicationScope.js";
import { createJavaScriptArtifactReader } from "../../../src/artifacts/javascript/JavaScriptArtifactReader.js";
import { analyzeJavaScriptArtifactFiles } from "../../../src/application/javascript/JavaScriptArtifactAnalysis.js";
import { buildJavaScriptArtifactGraph } from "../../../src/application/javascript/JavaScriptArtifactGraphBuilder.js";
import { prepareJavaScriptArtifactSourcesSteps } from "../../../src/application/javascript/JavaScriptInlineSources.js";
import { completeJavaScriptAnalysisSteps } from "../../../src/application/javascript/JavaScriptAnalysisControl.js";

const digest = (text: string) =>
  createHash("sha256").update(text).digest("hex");
const fixture = async (contents: Record<string, string>, budget?: number) => {
  const root = await createTestTempDirectory("rea-inline-html-");
  for (const [name, value] of Object.entries(contents)) {
    const path = join(root, name);
    await mkdir(dirname(path), { recursive: true });
    await writeFile(path, value);
  }
  const snapshot = await scanCanonicalArtifactInventory(root, {});
  const reader = createJavaScriptArtifactReader(root, "directory");
  try {
    const files = await readJavaScriptArtifactFiles(reader, snapshot);
    const sources = await completeJavaScriptAnalysisSteps(
      prepareJavaScriptArtifactSourcesSteps(files, budget),
    );
    const analysis = analyzeJavaScriptArtifactFiles(sources);
    const graph = buildJavaScriptArtifactGraph(snapshot, files, analysis);
    return { files, sources, analysis, graph };
  } finally {
    await reader.close();
  }
};

it("recovers independent inline modules with exact body identities and maps to the actual HTML", async () => {
  const body = "const repeated = '😀'; fetch('/same');";
  const text = `\ufeff<p>😀</p>\r\n<script type=module>${body}</script>\r\n<script type=module>${body}</script>`;
  const result = await fixture({ "index.html": text });
  expect(result.files.files).toHaveLength(1);
  expect(result.sources.sources).toHaveLength(3);
  const derived = result.analysis.files.filter(
    ({ file }) => file.inline_source !== undefined,
  );
  expect(derived).toHaveLength(2);
  expect(new Set(derived.map(({ file }) => file.path)).size).toBe(2);
  for (const { file, javascript, semantic } of derived) {
    const origin = file.inline_source;
    if (origin === undefined) throw new Error("Missing derived origin");
    expect(file.inventory_artifact_id).toBeNull();
    expect(file.path).toMatch(/^rea-inline-script:\/\//u);
    expect(file.sha256).toBe(digest(body));
    expect(file.bytes).toBe(Buffer.byteLength(body));
    expect(origin.html_sha256).toBe(digest(text));
    expect(origin.offset_encoding).toBe("utf16-code-units");
    expect(text.slice(origin.start_offset, origin.end_offset)).toBe(body);
    expect(javascript?.parse_status).toBe("complete");
    expect(javascript?.endpoints.map(({ value }) => value)).toContain("/same");
    expect(semantic).not.toBeNull();
  }
  const assets = result.graph.nodes.filter(
    ({ kind, observations }) =>
      kind === "javascript-asset" &&
      observations.some(
        ({ properties }) => properties.inline_source !== undefined,
      ),
  );
  expect(assets).toHaveLength(2);
  expect(new Set(assets.map(({ node_id }) => node_id)).size).toBe(2);
  expect(
    result.graph.edges.filter(
      ({ relation, properties }) =>
        relation === "maps_to" &&
        properties.offset_encoding === "utf16-code-units",
    ),
  ).toHaveLength(2);
  expect(result.analysis.limitations.join(" ")).toContain(
    "cross-script execution order",
  );
});

it("resolves inline imports against the document base, while bare and require targets stay unknown", async () => {
  const result = await fixture({
    "renderer/index.html": `<base href="/assets/"><script type=module>import { value } from './dep.mjs?x#y'; import 'bare'; const other = require('./dep.mjs'); fetch('/inline');</script>`,
    "assets/dep.mjs": "export const value = 7;",
    "renderer/dep.mjs": "export const value = 8;",
    "node_modules/bare/index.js": "export const value = 9;",
  });
  const relationships = result.graph.edges.filter(
    ({ relation }) => relation === "imports",
  );
  expect(
    relationships.some(
      ({ properties }) =>
        properties.specifier === "./dep.mjs?x#y" &&
        properties.resolved_path === "assets/dep.mjs",
    ),
  ).toBe(true);
  expect(
    relationships.some(
      ({ properties }) =>
        properties.specifier === "bare" && properties.resolved_path !== null,
    ),
  ).toBe(false);
  expect(
    relationships.some(
      ({ properties }) =>
        properties.specifier === "./dep.mjs" &&
        properties.resolved_path !== null,
    ),
  ).toBe(false);
});

it("resolves inline source maps from the original document base", async () => {
  const result = await fixture({
    "renderer/index.html": `<base href="/assets/"><script type=module>fetch('/mapped');\n//# sourceMappingURL=inline.map\n</script>`,
    "assets/inline.map": JSON.stringify({
      version: 3,
      sources: ["original.js"],
      sourcesContent: ["fetch('/mapped')"],
      names: [],
      mappings: "",
    }),
  });
  expect(
    result.graph.nodes
      .flatMap(({ observations }) => observations)
      .some(
        ({ properties }) =>
          properties.declared_url === "inline.map" &&
          properties.resolved_path === "assets/inline.map" &&
          properties.available === true,
      ),
  ).toBe(true);
});

it("keeps classic browser source identity despite Node-like syntax", async () => {
  const result = await fixture({
    "index.html": `<script>const value = require('./dep.js'); module.exports = value;</script>`,
    "dep.js": "module.exports = 7;",
  });
  const inlineModules = result.graph.nodes.filter(
    ({ kind, observations }) =>
      kind === "javascript-module" &&
      observations.some(
        ({ properties }) => properties.inline_source !== undefined,
      ),
  );
  expect(
    inlineModules
      .flatMap(({ observations }) => observations)
      .filter(({ properties }) => properties.inline_source !== undefined)
      .map(({ properties }) => properties.module_format),
  ).toEqual(["classic-script"]);
});

it("keeps data blocks, external fallback bodies and templates out of inline JavaScript analysis", async () => {
  const result = await fixture({
    "index.html": `
    <script type=application/json>{"source":"fetch('/json')"}</script>
    <script type=importmap>{"imports":{"x":"/x.js"}}</script>
    <template><script>fetch('/template')</script></template>
    <script src=external.js>fetch('/fallback')</script>
    <script>fetch('/actual')</script>`,
    "external.js": "fetch('/external');",
  });
  const all = result.analysis.files.flatMap(
    ({ javascript }) => javascript?.endpoints.map(({ value }) => value) ?? [],
  );
  expect(all.sort()).toEqual(["/actual", "/external"]);
  expect(result.analysis.html_scripts).toHaveLength(1);
  expect(
    result.analysis.files.filter(
      ({ file }) => file.inline_source !== undefined,
    ),
  ).toHaveLength(1);
});

it("reports run-wide inline admission omissions separately from the physical inventory", async () => {
  const result = await fixture(
    {
      "a.html": "<script>fetch('/a')</script>",
      "b.html": "<script>fetch('/b')</script>",
    },
    0,
  );
  expect(result.files.paths_scope.selected_files).toBe(2);
  expect(result.sources.sources).toHaveLength(2);
  expect(
    result.analysis.files.reduce(
      (n, { html }) => n + (html?.omitted_inline_scripts ?? 0),
      0,
    ),
  ).toBe(2);
  expect(result.graph.coverage.status).toBe("partial");
  expect(result.graph.coverage.limits).toContainEqual({
    name: "javascript_inline_scripts",
    value: 0,
    unit: "items",
  });
  expect(result.analysis.limitations.join(" ")).toContain(
    "max_inline_scripts (0)",
  );
});

it("shares one inline admission budget across documents", async () => {
  const result = await fixture(
    {
      "a.html": "<script>fetch('/a')</script>",
      "b.html": "<script>fetch('/b')</script>",
    },
    1,
  );
  expect(result.files.files).toHaveLength(2);
  expect(
    result.analysis.files.filter(
      ({ file }) => file.inline_source !== undefined,
    ),
  ).toHaveLength(1);
  expect(
    result.analysis.files.reduce(
      (n, { html }) => n + (html?.omitted_inline_scripts ?? 0),
      0,
    ),
  ).toBe(1);
  expect(result.graph.coverage.status).toBe("partial");
});

it("retains unsupported unterminated scripts and actual parser failures as partial coverage", async () => {
  const result = await fixture({
    "unterminated.html": "<script>fetch('/tail')",
    "bad.html": "<script>const broken = ;</script>",
  });
  expect(result.graph.coverage.status).toBe("partial");
  expect(
    result.analysis.files.find(({ file }) => file.path === "unterminated.html")
      ?.html?.inline_scripts,
  ).toMatchObject([{ terminated: false, logical_source: null }]);
  expect(
    result.analysis.files.filter(
      ({ file }) => file.inline_source !== undefined,
    ),
  ).toHaveLength(1);
  expect(result.analysis.parse_failures).toBe(1);
  expect(result.analysis.limitations.join(" ")).toContain(
    "unterminated inline JavaScript body is unsupported",
  );
});
