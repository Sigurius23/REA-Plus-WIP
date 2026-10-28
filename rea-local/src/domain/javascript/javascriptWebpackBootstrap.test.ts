import { expect, it } from "vitest";
import { analyzeJavaScriptStaticSource } from "./javascriptStaticAnalysis.js";

it("recovers standalone module factories with lexical runtime identity and keeps the unknown entrypoint explicit", () => {
  const source = `(()=>{const table={1:(module,exports,require)=>{exports.PING='ping';require(2)},2:(module)=>{module.exports={}}};const cache={};function req(id){const m=cache[id]={exports:{}};table[id](m,m.exports,req);return m.exports}req(1)})()`;
  const analysis = analyzeJavaScriptStaticSource(source);
  expect(analysis.bundler_registrations).toMatchObject([
    {
      bundler: "commonjs-bootstrap",
      runtime_require_name: "req",
      unknown_entry_module_keys: 0,
      entry_module_keys: ["1"],
      modules: [
        { module_key: "1", factory_require_name: "require" },
        { module_key: "2" },
      ],
    },
  ]);
  expect(analysis.references).toEqual(
    expect.arrayContaining([
      expect.objectContaining({ specifier: "2", module_key: "1" }),
    ]),
  );
  const shadowed = source.replace(
    "table[id](m,m.exports,req)",
    "((table)=>table[id](m,m.exports,req))({})",
  );
  expect(analyzeJavaScriptStaticSource(shadowed).bundler_registrations).toEqual(
    [],
  );
});
