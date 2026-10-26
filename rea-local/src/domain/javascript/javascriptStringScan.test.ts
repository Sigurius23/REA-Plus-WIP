import { describe, expect, it } from "vitest";

import { collectJavaScriptStringMatches } from "./javascriptStringScan.js";
import { parseJavaScriptSource } from "./javascriptSourceParser.js";

const scan = (
  source: string,
  query: string,
  scope: "strings" | "identifiers" = "strings",
  path = "src/example.js",
) => {
  const parsed = parseJavaScriptSource(source, path);
  if (parsed === null) throw new Error(`Unparseable source: ${source}`);
  return collectJavaScriptStringMatches(parsed, { query, scope });
};

const located = (
  kind: string,
  value: string,
): { kind: string; offset: number; value: string } => ({
  kind,
  offset: expect.any(Number),
  value,
});

describe("collectJavaScriptStringMatches", () => {
  it("matches string literals exactly and case-sensitively", () => {
    const source = 'const A = "hello";\nconst B = "Hello";\n';
    expect(scan(source, "hello")).toEqual([located("string", "hello")]);
    expect(scan(source, "Hello")).toEqual([located("string", "Hello")]);
    expect(scan(source, "HELLO")).toEqual([]);
  });

  it("matches body-start string statements as directive literals", () => {
    expect(scan('"use cache";\nconst x = 1;\n', "use cache")).toEqual([
      located("directive", "use cache"),
    ]);
    // The same text after other statements is an ordinary string literal.
    expect(scan('const x = 1;\n"use cache";\n', "use cache")).toEqual([
      located("string", "use cache"),
    ]);
  });

  it("matches static template quasis without inventing interpolated results", () => {
    const source =
      'const url = `${API}/v1/graphql`;\nconst host = "example.test";\n';
    expect(scan(source, "/v1/graphql")).toEqual([
      located("template-part", "/v1/graphql"),
    ]);
    expect(scan(source, "example.test")).toEqual([
      located("string", "example.test"),
    ]);
    // Runtime interpolations are not string constants.
    expect(scan(source, "API")).toEqual([]);
  });

  it("orders matches by byte offset and reports them once per node", () => {
    const source = 'const a = "x";\nconst b = "xy";\nconst c = "x";\n';
    const matches = scan(source, "x");
    expect(matches.map((match) => match.kind)).toEqual([
      "string",
      "string",
      "string",
    ]);
    expect(matches.map((match) => match.value)).toEqual(["x", "xy", "x"]);
    for (const match of matches) {
      expect(match.offset).toBeGreaterThanOrEqual(0);
      expect(match.offset).toBeLessThan(source.length);
    }
    const offsets = matches.map((match) => match.offset ?? -1);
    expect(offsets).toEqual([...offsets].sort((left, right) => left - right));
    expect(new Set(offsets).size).toBe(offsets.length);
  });

  it("identifier scope matches runtime names and excludes type positions", () => {
    const source = [
      "import { sendIpc } from './ipc.js';",
      "function sendIpc() {}",
      "const queue = [sendIpc];",
      "type Alias = sendIpc;",
      "const local: string = sendIpc();",
    ].join("\n");
    const matches = scan(source, "sendIpc", "identifiers");
    expect(matches).toHaveLength(5);
    for (const match of matches)
      expect(match).toMatchObject({ kind: "identifier", value: "sendIpc" });
    expect(
      scan("const local: helper = null;\n", "helper", "identifiers"),
    ).toEqual([]);
  });

  it("does not run any code or recover computed values", () => {
    const source = "const v = `a${b}c`;\nconst f = () => v.repeat(2);\n";
    expect(scan(source, "b")).toEqual([]);
    expect(scan(source, "aa")).toEqual([]);
    expect(scan(source, "b", "identifiers")).toEqual([
      located("identifier", "b"),
    ]);
  });
});
