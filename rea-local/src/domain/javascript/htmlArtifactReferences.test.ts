import { expect, it } from "vitest";

import { htmlArtifactReferences } from "./htmlArtifactReferences.js";

it.each([
  ['<script data-src="decoy.js"></script>', []],
  ['<script x:src="decoy.js"></script>', []],
  [`<script title='src="decoy.js"'></script>`, []],
  ["<script src=actual.js></script>", ["actual.js"]],
  ['<script title=">" src="actual.js"></script>', ["actual.js"]],
  ['<SCRIPT SRC="actual.js"></SCRIPT>', ["actual.js"]],
  ["<script src='actual.js'></script>", ["actual.js"]],
  ['<script data-src="decoy.js" src="actual.js"></script>', ["actual.js"]],
  ['<script src="actual.js" src="decoy.js"></script>', ["actual.js"]],
  ['<script src="" src="decoy.js"></script>', []],
  ['<script src="actual&#46;js"></script>', ["actual.js"]],
  ['<!-- <script src="decoy.js"></script> -->', []],
  ['<textarea><script src="decoy.js"></script></textarea>', []],
  ['<style><script src="decoy.js"></script></style>', []],
  [`<script>const text = '<script src="decoy.js">';</script>`, []],
  [
    '<template><base href="decoy/"><script src="decoy.js"></script></template>',
    [],
  ],
  ['<svg><script src="decoy.js"></script></svg>', []],
  [
    '<svg><foreignObject><script src="actual.js"></script></foreignObject></svg>',
    ["actual.js"],
  ],
  // The existing extraction contract does not classify script MIME types.
  ['<script type="application/json" src="actual.js"></script>', ["actual.js"]],
])("extracts document references from %s", (text, expected) => {
  expect(
    htmlArtifactReferences(text).scripts.map(({ scriptPath }) => scriptPath),
  ).toEqual(expected);
});

it("retains exact opening-tag offsets rather than the script body", () => {
  const opening = '<script\n title=">" src=actual.js>';
  const prefix = "<!doctype html>\n\n";
  const text = `${prefix}${opening}ignored body</script>`;
  expect(htmlArtifactReferences(text)).toMatchObject({
    baseHref: null,
    scripts: [
      {
        scriptPath: "actual.js",
        startOffset: prefix.length,
        endOffset: prefix.length + opening.length,
      },
    ],
  });
});

it.each([
  ["", "classic"],
  [" type=module", "module"],
  [" type=MODULE", "module"],
  [" type=' text/javascript '", "classic"],
  [" language=JavaScript", "classic"],
  [" type=application/json", null],
  [" type=importmap", null],
  [" type=speculationrules", null],
  [" type='text/javascript; charset=utf-8'", null],
  [" type=' module '", null],
  [" type=' '", null],
  [" src=''", null],
  [" src=external.js", null],
  [" language=VBScript", null],
])("classifies an inline body with attributes %s", (attrs, kind) => {
  const text = `<script${attrs}>fetch('/inline')</script>`;
  const inline = htmlArtifactReferences(text).inlineScripts;
  expect(inline.map(({ scriptKind }) => scriptKind)).toEqual(
    kind === null ? [] : [kind],
  );
});

it("keeps comments, template fragments and non-HTML scripts inert", () => {
  const text = `<!-- <script>fetch('/comment')</script> -->
  <template><script>fetch('/template')</script></template>
  <svg><script>fetch('/svg')</script></svg>
  <textarea><script>fetch('/textarea')</script></textarea>
  <script>fetch('/actual')</script>`;
  const refs = htmlArtifactReferences(text);
  expect(
    refs.inlineScripts.map((s) => text.slice(s.startOffset, s.endOffset)),
  ).toEqual(["fetch('/actual')"]);
});

it.each(["\n", "\r\n", "\r"])(
  "maps raw inline ranges across %j and astral text",
  (newline) => {
    const prefix = `\ufeff<p>😀</p>${newline}<script type=module>`;
    const body = `const face = '😀';${newline}fetch('/inline');`;
    const text = `${prefix}${body}</script>`;
    expect(htmlArtifactReferences(text).inlineScripts).toEqual([
      {
        scriptKind: "module",
        startOffset: prefix.length,
        endOffset: prefix.length + body.length,
        location: {
          start: { line: 2, column: 20 },
          end: { line: 3, column: 17 },
        },
        terminated: true,
      },
    ]);
  },
);

it("counts omitted bodies without retaining their contents and preserves external links", () => {
  const refs = htmlArtifactReferences(
    `<script>first()</script><script>second()</script><script src=external.js></script>`,
    1,
  );
  expect(refs.inlineScriptCount).toBe(2);
  expect(refs.omittedInlineScripts).toBe(1);
  expect(refs.inlineScripts).toHaveLength(1);
  expect(refs.scripts).toHaveLength(1);
});

it("counts same-line BOM and astral prefix/body columns as UTF-16 units", () => {
  const text = '\ufeff😀<script>"😀";</script>';
  expect(htmlArtifactReferences(text).inlineScripts).toMatchObject([
    {
      startOffset: 11,
      endOffset: 16,
      location: {
        start: { line: 1, column: 11 },
        end: { line: 1, column: 16 },
      },
    },
  ]);
});

it("retains the unsupported unterminated boundary instead of inventing an end tag", () => {
  expect(
    htmlArtifactReferences("<script>fetch('/tail')").inlineScripts,
  ).toMatchObject([{ terminated: false, startOffset: 8, endOffset: 22 }]);
});

it.each([
  ['<base data-href="decoy/"><base href=actual/>', "actual/"],
  ['<base href="actual&#47;" href="decoy/"><base href="later/">', "actual/"],
  ['<base href=""><base href="decoy/">', ""],
  ['<template><base href="decoy/"></template><base href="actual/">', "actual/"],
  ['<!-- <base href="decoy/"> --><base title=">" href="actual/">', "actual/"],
])("selects the first real base href from %s", (text, expected) => {
  expect(htmlArtifactReferences(text).baseHref).toBe(expected);
});

it("traverses deep valid document content without recursive stack growth", () => {
  const depth = 12_000;
  const text = `${"<div>".repeat(depth)}<script src=actual.js></script>${"</div>".repeat(depth)}`;
  expect(
    htmlArtifactReferences(text).scripts.map(({ scriptPath }) => scriptPath),
  ).toEqual(["actual.js"]);
});
