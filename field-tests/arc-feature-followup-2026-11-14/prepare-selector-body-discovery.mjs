import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
const directory = path.dirname(fileURLToPath(import.meta.url));
const root = path.resolve(directory, '../..');
const read = async name => JSON.parse(await fs.readFile(path.join(directory, name), 'utf8'));
const manifest = await read('frozen-runtime-manifest.json');
const req = createRequire(path.join(manifest.runtime_package, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const prepared = await read('selector-type-preparation.json');
const expected = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';
assert.equal(prepared.target_sha256, expected); assert.equal(prepared.type_index.entries_scanned, 11125);
const source = await fs.readFile(path.join(root, 'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'));
assert.equal(createHash('sha256').update(source).digest('hex'), expected);
for (const [name, descriptor, index] of [['SelectorPicker', '0x103d7c074', '0x103f7b90c'], ['BoostsEditorOverlayView', '0x103d7c470', '0x103f7b934'], ['BoostsEditorOverlayController', '0x103d7c418', '0x103f7b930']]) {
  const row = prepared.matches.find(row => row.name === name); assert.ok(row); assert.equal(row.descriptor, descriptor); assert.equal(row.index_entry, index);
  assert.equal(BigInt(index) + BigInt(row.index_displacement), BigInt(descriptor));
  // Both addresses are in the file-backed identity mapping of this retained
  // header; the source-preparation receipt retains the index/descriptor bytes.
  assert.equal(source.readInt32LE(Number(BigInt(index) - 0x100000000n)), row.index_displacement);
  assert.equal(source.subarray(Number(BigInt(descriptor) - 0x100000000n), Number(BigInt(descriptor) - 0x100000000n) + 32).toString('hex'), row.descriptor_bytes);
}
const steps = [
  { name: 'inspect_native_dispatch_metadata', arguments: { facet: 'swift-conformances', swift_conformance_filter: { type_name: 'SelectorPicker' }, max_file_bytes: 100663296, max_records: 1000 }, label: 'exact-selector-picker-conformances' },
  { name: 'inspect_native_dispatch_metadata', arguments: { facet: 'swift-conformances', swift_conformance_filter: { type_name: 'BoostsEditorOverlayView' }, max_file_bytes: 100663296, max_records: 1000 }, label: 'exact-overlay-view-conformances' },
  { name: 'inspect_native_dispatch_metadata', arguments: { facet: 'swift-vtables', swift_class_address: '0x103d7c418', max_file_bytes: 100663296, max_records: 1000 }, label: 'exact-overlay-controller-vtable' },
];
const value = await read('builder-continuation-evidence/catalog.json'); const catalog = Array.isArray(value) ? value : value.tools;
const ajv = new Ajv2020({ strict: false, validateFormats: false });
for (const step of steps) { const tool = catalog.find(tool => tool.name === step.name); assert.ok(tool); const validate = ajv.compile(tool.inputSchema); assert.ok(validate(step.arguments), JSON.stringify(validate.errors)); }
const save = (name, value) => fs.writeFile(path.join(directory, name), `${JSON.stringify(value, null, 2)}\n`);
await save('selector-body-discovery.steps.json', { authority: 'Next public metadata requests prepared from exact fixed-image type-index identities; not runtime metadata or executed requests', target_sha256: expected, execution: 'Append to the parent-owned persistent frozen076 session, revalidate actual catalog, and export/close with the owning recorder. No Ghidra code seeds are required for these metadata-only selections.', steps });
await save('selector-body-discovery-preparation.json', { status: 'passed', checked_at: new Date().toISOString(), source_preparation: 'selector-type-preparation.json', source_sha256: expected, frozen_source_commit: manifest.source_commit, exact_type_index_matches_checked: 3, proposed_requests_schema_checked: 3, proposed_requests_executed: 0 });
console.log(JSON.stringify({ status: 'passed', exact_nominal_identities: 3, schema_checked_requests: 3, executed_provider_calls: 0 }));
