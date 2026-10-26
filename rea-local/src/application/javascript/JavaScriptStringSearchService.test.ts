import { mkdir, writeFile } from "node:fs/promises";
import { join } from "node:path";

import { describe, expect, it } from "vitest";

import { createTestTempDirectory } from "../../../tests/fixtures/temporaryDirectory.js";
import { projectAnalysisError } from "../../domain/analysisErrorProjection.js";
import { searchJavaScriptStringsResultSchema } from "../../domain/javascript/javascriptStringSearchSchemas.js";
import { searchJavaScriptStrings } from "../../../tests/support/javascriptStringSearchScope.js";

const parsedResult = (evidence: { readonly normalized_result: unknown }) =>
  searchJavaScriptStringsResultSchema.parse(evidence.normalized_result);

const writeFixtureApplication = async (root: string): Promise<string> => {
  await mkdir(join(root, "src"), { recursive: true });
  await mkdir(join(root, "vendor"), { recursive: true });
  await writeFile(
    join(root, "package.json"),
    JSON.stringify({ name: "fixture", main: "src/main.js" }),
  );
  await writeFile(
    join(root, "src", "locations.js"),
    'export const apiHost = "https://api.fixture.test";\nexport const channel = `track:${suffix}`;\n',
  );
  await writeFile(
    join(root, "src", "not_javascript.txt"),
    "const A = 'not a JavaScript file';\n",
  );
  await writeFile(
    join(root, "vendor", "dep.js"),
    'module.exports = "vendor-string";\n',
  );
  return root;
};

describe("search_javascript_strings", () => {
  it("searches string constants and template parts across inventoried files", async () => {
    const root = await createTestTempDirectory("rea-js-string-search-");
    await writeFixtureApplication(root);
    const result = await searchJavaScriptStrings({
      input_path: root,
      query: "fixture.test",
    });
    if (!result.ok)
      throw new Error(`Expected search success: ${String(result.error)}`);
    const evidence = result.value;
    expect(evidence.operation).toBe("search_javascript_strings");
    expect(evidence.subject).toMatchObject({ local_path: root });
    expect(evidence.normalized_result).toMatchObject({
      query: "fixture.test",
      scope: "strings",
      coverage: "complete",
      parse_failures: 0,
      omitted_matches: 0,
    });
    expect(parsedResult(evidence).matches).toEqual([
      {
        path: expect.stringMatching(/locations\.js$/u),
        sha256: expect.stringMatching(/^[a-f0-9]{64}$/u),
        offset: expect.any(Number),
        value: "https://api.fixture.test",
        kind: "string",
      },
    ]);
  });

  it("matches static template quasis but not interpolated runtime results", async () => {
    const root = await createTestTempDirectory("rea-js-template-search-");
    await writeFixtureApplication(root);
    const quasi = await searchJavaScriptStrings({
      input_path: root,
      query: "track:",
    });
    if (!quasi.ok) throw new Error("Expected template quasi search success");
    expect(parsedResult(quasi.value).matches).toEqual([
      {
        path: expect.stringMatching(/locations\.js$/u),
        sha256: expect.any(String),
        offset: expect.any(Number),
        value: "track:",
        kind: "template-part",
      },
    ]);
  });

  it("identifier scope matches runtime names and skips non-JavaScript files", async () => {
    const root = await createTestTempDirectory("rea-js-identifier-search-");
    await writeFixtureApplication(root);
    const result = await searchJavaScriptStrings({
      input_path: root,
      query: "apiHost",
      scope: "identifiers",
    });
    if (!result.ok) throw new Error("Expected identifier search success");
    expect(parsedResult(result.value).matches).toEqual([
      {
        path: expect.stringMatching(/locations\.js$/u),
        sha256: expect.any(String),
        offset: expect.any(Number),
        value: "apiHost",
        kind: "identifier",
      },
    ]);
  });

  it("reports skipped files, coverage, and the file-limit knob honestly", async () => {
    const root = await createTestTempDirectory("rea-js-limit-search-");
    await writeFixtureApplication(root);
    const result = await searchJavaScriptStrings({
      input_path: root,
      query: "const",
      file_limit: 1,
    });
    if (!result.ok) throw new Error("Expected limited search success");
    const normalized = searchJavaScriptStringsResultSchema.parse(
      result.value.normalized_result,
    );
    expect(normalized.total_files).toBeGreaterThan(1);
    expect(normalized.scanned_files).toBe(1);
    expect(normalized.skipped_files).toBe(normalized.total_files - 1);
    expect(normalized.coverage).toBe("partial");
    expect(
      result.value.limitations.some((limitation) =>
        limitation.includes("file limit"),
      ),
    ).toBe(true);
  });

  it("counts an unsearchable non-UTF-8 JavaScript file explicitly", async () => {
    const root = await createTestTempDirectory("rea-js-utf8-search-");
    await writeFixtureApplication(root);
    await writeFile(join(root, "src", "binary.js"), Buffer.from([0xff, 0xfe]));
    const result = await searchJavaScriptStrings({
      input_path: root,
      query: "vendor-string",
    });
    if (!result.ok) throw new Error("Expected UTF-8 gap search success");
    expect(result.value.normalized_result).toMatchObject({
      incomplete_text_files: 1,
      coverage: "partial",
    });
  });

  it("rejects a missing selection as invalid input, not an engine failure", async () => {
    const root = await createTestTempDirectory("rea-js-string-missing-");
    const result = await searchJavaScriptStrings({
      input_path: join(root, "missing"),
      query: "anything",
    });
    if (result.ok) throw new Error("Expected missing artifact failure");
    expect(projectAnalysisError(result.error)).toMatchObject({
      code: "invalid_request",
      details: {
        operation: "search_javascript_strings",
        issues: [{ path: ["input_path"], reason: "invalid_value" }],
      },
    });
  });

  it("rejects a non-directory, non-asar selection with a format reason", async () => {
    const root = await createTestTempDirectory("rea-js-string-format-");
    const target = join(root, "plain.txt");
    await writeFile(target, "text");
    const result = await searchJavaScriptStrings({
      input_path: target,
      query: "anything",
    });
    if (result.ok) throw new Error("Expected format rejection");
    expect(projectAnalysisError(result.error)).toMatchObject({
      details: {
        operation: "search_javascript_strings",
        reason: "format",
      },
    });
  });
});
