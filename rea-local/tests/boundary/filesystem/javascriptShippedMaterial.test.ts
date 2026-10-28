import { expect, it } from "vitest";
import { writeFixtureFiles } from "../../support/javascriptApplicationFixture.js";
import { createTestTempDirectory } from "../../fixtures/temporaryDirectory.js";
import { analyzeJavaScriptApplication } from "../../support/javascriptApplicationScope.js";
import { projectAnalysisView } from "../../../src/domain/analysisView/analysisView.js";

it("scans only on request, binds filename/literal candidates to their source, and preserves scope in Evidence", async () => {
  const root = await createTestTempDirectory("rea-material-");
  const key = "abcd".repeat(8);
  await writeFixtureFiles(root, {
    "main.js": `fetch(\`\${process.env.API}/ping\`); const id='${key}';`,
    "signing/cert.p12": "fixture certificate bytes",
    "excluded/cert.key": "excluded",
  });
  const absent = await analyzeJavaScriptApplication({ input_path: root });
  const selected = await analyzeJavaScriptApplication({
    input_path: root,
    scan_shipped_material: true,
    paths_exclude: ["excluded/**"],
  });
  if (!absent.ok) throw absent.error;
  if (!selected.ok) throw selected.error;
  const inspect = (evidence: typeof selected.value) =>
    projectAnalysisView(
      {
        evidenceId: evidence.evidence_id,
        operation: evidence.operation,
        normalizedResult: evidence.normalized_result,
        limitations: evidence.limitations,
      },
      { kind: "page", collection: "shipped_material", offset: 0, limit: 20 },
    );
  const empty = inspect(absent.value);
  const view = inspect(selected.value);
  expect(empty).toMatchObject({
    ok: true,
    value: { items: [], coverage: { total: 0 } },
  });
  expect(view).toMatchObject({ ok: true, value: { coverage: { total: 3 } } });
  expect(JSON.stringify(view)).toContain("signing/cert.p12");
  expect(JSON.stringify(view)).not.toContain(key);
  expect(JSON.stringify(view)).not.toContain('"path":"excluded/cert.key"');
  expect(selected.value.parameters).toMatchObject({
    scan_shipped_material: true,
    paths_exclude: ["excluded/**"],
  });
  const endpoint = projectAnalysisView(
    {
      evidenceId: selected.value.evidence_id,
      operation: selected.value.operation,
      normalizedResult: selected.value.normalized_result,
      limitations: selected.value.limitations,
    },
    {
      kind: "page",
      collection: "endpoints",
      offset: 0,
      limit: 20,
      bindings: { "process.env.API": "https://fixture.invalid" },
    },
  );
  expect(endpoint).toMatchObject({
    ok: true,
    value: {
      items: [
        {
          template: "{}/ping",
          materialized_value: "https://fixture.invalid/ping",
        },
      ],
    },
  });
});
