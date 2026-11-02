import { mkdir, writeFile } from "node:fs/promises";
import { join } from "node:path";
import { expect } from "vitest";

import { toolContract } from "../../../src/contracts/toolContracts.js";
import { javascriptApplicationAnalysisResultSchema } from "../../../src/domain/javascript/javascriptApplicationAnalysis.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { connectLocalToolsMcp } from "../../fixtures/localToolsMcp.js";
import { cliTest } from "../../support/cli/cliFixture.js";

interface ReceiverScenario {
  readonly name: string;
  readonly source: string;
  readonly unknown: readonly string[];
  readonly suppressed: readonly string[];
  readonly fetch?: string;
}

const scenarios: readonly ReceiverScenario[] = [
  {
    name: "guarded-url-and-immutable-alias",
    source: `
      function query(input, api) {
        const immutable = new URL(input);
        immutable.searchParams.get('immutable-url-key');
        const immutableParams = new URLSearchParams(input);
        immutableParams.get('immutable-params-key');
        let url;
        try { url = new URL(input); } catch { return null; }
        url.searchParams.get('guarded-url-key');
        const alias = url;
        alias.searchParams.get('guarded-alias-key');
        api.get('/custom-http');
        fetch('/known-fetch');
      }
    `,
    unknown: ["/custom-http"],
    suppressed: [
      "immutable-url-key",
      "immutable-params-key",
      "guarded-url-key",
      "guarded-alias-key",
    ],
    fetch: "/known-fetch",
  },
  {
    name: "guarded-params-with-throw",
    source: `
      function query(input) {
        let params;
        try { params = new URLSearchParams(input); } catch (error) { throw error; }
        params.get('guarded-params-key');
      }
    `,
    unknown: [],
    suppressed: ["guarded-params-key"],
  },
  {
    name: "same-binding-before-after-and-callable-boundaries",
    // Source order is the subject of this static test. The artifact is never run.
    source: `
      function query(input) {
        url.searchParams.get('before-try-key');
        let url;
        try { url = new URL(input); } catch { return null; }
        url.searchParams.get('after-try-key');
        const later = () => url.searchParams.get('closure-key');
        class Query { read() { return url.searchParams.get('class-key'); } }
        const alias = url;
        alias.searchParams.get('after-alias-key');
        const aliasLater = () => alias.searchParams.get('alias-closure-key');
        return { later, Query };
      }
    `,
    unknown: [
      "before-try-key",
      "closure-key",
      "class-key",
      "alias-closure-key",
    ],
    suppressed: ["after-try-key", "after-alias-key"],
  },
  {
    name: "catches-that-can-continue",
    source: `
      function emptyCatch(input) {
        let url;
        try { url = new URL(input); } catch {}
        url.searchParams.get('empty-catch-key');
      }
      function nonAbruptCatch(input) {
        let params;
        try { params = new URLSearchParams(input); } catch (error) { console.warn(error); }
        params.get('continuing-catch-key');
      }
    `,
    unknown: ["empty-catch-key", "continuing-catch-key"],
    suppressed: [],
  },
  {
    name: "finally-remains-unknown",
    source: `
      function query(input) {
        let url;
        try { url = new URL(input); } catch { return null; } finally { cleanup(); }
        url.searchParams.get('finally-key');
      }
    `,
    unknown: ["finally-key"],
    suppressed: [],
  },
  {
    name: "reassigned-and-preinitialized-bindings",
    source: `
      function reassigned(input, replacement) {
        let url;
        try { url = new URL(input); } catch { return null; }
        url = replacement;
        url.searchParams.get('reassigned-key');
      }
      function preinitialized(input, initial) {
        let params = initial;
        try { params = new URLSearchParams(input); } catch (error) { throw error; }
        params.get('preinitialized-key');
      }
    `,
    unknown: ["reassigned-key", "preinitialized-key"],
    suppressed: [],
  },
  {
    name: "conditional-try-does-not-dominate-use",
    source: `
      function query(input, enabled) {
        let url;
        if (enabled) {
          try { url = new URL(input); } catch { return null; }
        }
        url.searchParams.get('conditional-key');
      }
    `,
    unknown: ["conditional-key"],
    suppressed: [],
  },
  {
    name: "shadowed-constructors",
    source: `
      function customUrl(URL, input) {
        let url;
        try { url = new URL(input); } catch { return null; }
        url.searchParams.get('shadowed-url-key');
      }
      function customParams(URLSearchParams, input) {
        let params;
        try { params = new URLSearchParams(input); } catch (error) { throw error; }
        params.get('shadowed-params-key');
      }
    `,
    unknown: ["shadowed-url-key", "shadowed-params-key"],
    suppressed: [],
  },
  {
    name: "visible-prototype-write",
    source: `
      URLSearchParams.prototype.get = customGet;
      function query(input) {
        let url;
        try { url = new URL(input); } catch { return null; }
        url.searchParams.get('prototype-write-key');
      }
    `,
    unknown: ["prototype-write-key"],
    suppressed: [],
  },
  {
    name: "visible-closure-member-write",
    source: `
      function query(input, replacement) {
        let url;
        try { url = new URL(input); } catch { return null; }
        const alias = url;
        const mutate = () => { alias.searchParams = replacement; };
        mutate();
        url.searchParams.get('closure-member-write-key');
      }
    `,
    unknown: ["closure-member-write-key"],
    suppressed: [],
  },
  {
    name: "visible-instance-member-write",
    source: `
      function query(input, replacement) {
        let url;
        try { url = new URL(input); } catch { return null; }
        url.searchParams = replacement;
        url.searchParams.get('member-write-key');
      }
    `,
    unknown: ["member-write-key"],
    suppressed: [],
  },
];

const assertReceiverEvidence = (
  document: unknown,
  scenario: ReceiverScenario,
) => {
  const evidence = toolContract(
    "analyze_javascript_application",
  ).outputSchema.parse(document);
  const result = javascriptApplicationAnalysisResultSchema.parse(
    evidence.normalized_result,
  );
  const endpoints = result.graph.nodes
    .filter(({ kind }) => kind === "endpoint")
    .flatMap(({ observations }) => observations);
  const expected = [
    ...scenario.unknown,
    ...(scenario.fetch === undefined ? [] : [scenario.fetch]),
  ];
  expect(
    endpoints.map(({ properties }) => properties.value).sort(),
    scenario.name,
  ).toEqual(expected.sort());
  for (const value of scenario.suppressed)
    expect(
      endpoints.some(({ properties }) => properties.value === value),
      `${scenario.name}: ${value}`,
    ).toBe(false);
  for (const value of scenario.unknown) {
    const observation = endpoints.find(
      ({ properties }) => properties.value === value,
    );
    expect(
      observation?.properties.network_receiver,
      `${scenario.name}: ${value}`,
    ).toEqual({ status: "unknown", identity: null });
    expect(observation?.evidence, `${scenario.name}: ${value}`).toMatchObject({
      state: "inferred",
      confidence: "low",
    });
  }
  if (scenario.fetch !== undefined)
    expect(
      endpoints.find(({ properties }) => properties.value === scenario.fetch)
        ?.properties.network_receiver,
    ).toEqual({ status: "recognized-network", identity: "fetch" });
  return evidence;
};

cliTest(
  "classifies guarded URL query receivers through public static analysis without broadening uncertain receivers",
  async ({ cli }) => {
    const root = await createTestTempDirectory("rea-guarded-url-receivers-");
    const { client, call } = await connectLocalToolsMcp();
    for (const [index, scenario] of scenarios.entries()) {
      const app = join(root, scenario.name);
      await mkdir(app);
      await writeFile(join(app, "main.js"), scenario.source);
      const response = await call("analyze_javascript_application", {
        input_path: app,
        format: "directory",
      });
      expect(
        response.isError,
        `${scenario.name}: ${JSON.stringify(response)}`,
      ).not.toBe(true);
      const evidence = assertReceiverEvidence(
        response.structuredContent,
        scenario,
      );
      const text = response.content.find(({ type }) => type === "text");
      if (text?.type !== "text") throw new Error("Missing MCP text Evidence");
      expect(JSON.parse(text.text)).toEqual(response.structuredContent);
      if (index === 0) {
        const cliResponse = await cli.run({
          arguments: [
            "analyze-javascript-application",
            app,
            "--artifact-format",
            "directory",
            "--json",
          ],
          timeoutMs: 60_000,
        });
        expect(cliResponse.exitCode, cliResponse.stderr).toBe(0);
        expect(assertReceiverEvidence(cliResponse.json, scenario)).toEqual(
          evidence,
        );
      }
    }
    await client.ping();
  },
  120_000,
);
