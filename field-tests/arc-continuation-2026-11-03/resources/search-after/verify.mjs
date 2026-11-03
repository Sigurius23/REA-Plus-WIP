import assert from 'node:assert/strict';
import fs from 'node:fs/promises';
import path from 'node:path';
import { createHash } from 'node:crypto';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { gunzipSync, brotliDecompressSync } from 'node:zlib';

const root = path.dirname(fileURLToPath(import.meta.url));
const repo = path.resolve(root, '../../../..');
const pkg = path.join(repo, 'rea-local');
const req = createRequire(path.join(pkg, 'package.json'));
const { Ajv2020 } = await import(pathToFileURL(req.resolve('ajv/dist/2020.js')));
const { toolContract } = await import(pathToFileURL(path.join(pkg, 'dist/contracts/toolContracts.js')));
const { parseEvidence } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidence.js')));
const { parseEvidenceBundle } = await import(pathToFileURL(path.join(pkg, 'dist/domain/evidenceBundle.js')));
const read = async (p) => JSON.parse(await fs.readFile(p, 'utf8'));
const hash = (bytes) => createHash('sha256').update(bytes).digest('hex');
const calls = await read(path.join(root, 'invocations.json'));
const catalog = await read(path.join(root, 'catalog.json'));
const ajv = new Ajv2020({ strict: false, validateFormats: false });
const evidence = [];
for (const call of calls) {
  const tool = catalog.find(t => t.name === call.name);
  assert.ok(tool);
  assert.ok(ajv.validateSchema(tool.inputSchema));
  assert.ok(ajv.validateSchema(tool.outputSchema));
  assert.ok(ajv.validate(tool.inputSchema, call.arguments), JSON.stringify(ajv.errors));
  assert.equal(call.is_error, false);
  assert.equal(call.thrown, null);
  const reply = await read(path.join(root, call.reply));
  assert.notEqual(reply.isError, true);
  assert.ok(ajv.validate(tool.outputSchema, reply.structuredContent), JSON.stringify(ajv.errors));
  toolContract(call.name).outputSchema.parse(reply.structuredContent);
  assert.deepEqual(JSON.parse(reply.content.find(x => x.type === 'text').text), reply.structuredContent);
  if (reply.structuredContent.evidence_id) evidence.push(parseEvidence(reply.structuredContent));
}
const run = await read(path.join(root, 'summary.json'));
assert.equal(run.calls, calls.length);
assert.equal(run.errors, 0);
assert.equal(run.verifier_run.process_lineage.status, 'verified');
assert.deepEqual(run.verifier_run.process_lineage.descendants, []);
const bundles = [];
for (const name of ['search-evidence-bundle.json', 'evidence-bundle.json']) {
  const bytes = await fs.readFile(path.join(root, name));
  const bundle = parseEvidenceBundle(JSON.parse(bytes));
  bundles.push({ file: name, records: bundle.records.length, bytes: bytes.length, sha256: hash(bytes) });
  for (const e of bundle.records) parseEvidence(e);
}
const final = parseEvidenceBundle(await read(path.join(root, 'evidence-bundle.json')));
for (const e of evidence) assert.ok(final.records.some(r => r.evidence_id === e.evidence_id));

const files = new Map();
const decodedMatches = new Map();
for (const e of evidence.filter(e => e.operation === 'search_chromium_resources')) {
  const r = e.normalized_result;
  let bytes = files.get(r.artifact.path);
  if (!bytes) { bytes = await fs.readFile(r.artifact.path); files.set(r.artifact.path, bytes); }
  assert.equal(bytes.length, r.artifact.bytes);
  assert.equal(hash(bytes), r.artifact.sha256);
  const needle = Buffer.from(r.query.literal, r.query.encoding);
  assert.equal(hash(needle), r.query.sha256);
  assert.equal(needle.length, r.query.bytes);
  for (const m of r.matches) {
    const entry = m.entry, at = entry.table_location.offset;
    assert.equal(bytes.readUInt16LE(at), entry.resource_id);
    assert.equal(bytes.readUInt32LE(at + 2), entry.payload.offset);
    assert.equal(bytes.readUInt32LE(at + 8) - entry.payload.offset, entry.payload.bytes);
    const stored = bytes.subarray(entry.payload.offset, entry.payload.offset + entry.payload.bytes);
    assert.equal(hash(stored), entry.payload.sha256);
    let body = stored;
    if (m.codec === 'gzip') body = gunzipSync(stored, { maxOutputLength: 8388608 });
    else if (m.codec === 'chromium-brotli') {
      assert.equal(stored.readUInt16LE(0), 0x9b1e);
      body = brotliDecompressSync(stored.subarray(8), { maxOutputLength: 8388608 });
      assert.equal(body.length, stored.readUIntLE(2, 6));
    }
    assert.equal(body.length, m.decoded_bytes);
    assert.equal(hash(body), m.decoded_sha256);
    assert.equal(body.indexOf(needle), m.byte_range.offset);
    assert.equal(needle.length, m.byte_range.bytes);
    for (const identity of m.identities) {
      assert.equal(bytes.readUInt16LE(identity.table_location.offset), identity.resource_id);
      if (identity.resource_id !== entry.resource_id) assert.equal(bytes.readUInt16LE(identity.table_location.offset + 2), entry.canonical_index);
    }
    if (m.text) {
      const text = new TextDecoder(m.text.encoding === 'utf8' ? 'utf-8' : 'utf-16le', { fatal: true, ignoreBOM: true }).decode(body);
      assert.deepEqual(Buffer.from(text, m.text.encoding), body);
      assert.equal(Buffer.byteLength(text.slice(0, m.text.utf16_offset), m.text.encoding), m.byte_range.offset);
      assert.equal(text.slice(m.text.utf16_offset, m.text.utf16_offset + m.text.utf16_length), r.query.literal);
    }
    decodedMatches.set(`${r.artifact.path}:${entry.resource_id}`, { bytes: body.length, sha256: hash(body) });
  }
}
const queries = [];
const expectedIds = { 'gdocs_script.js': [14548, 14865, 14866], 'content.js': [14548, 52953, 63531], 'background.js': [14558, 14867, 18398, 63531], 'app.slack.com': [14558, 14901] };
const sourcePack = '/Applications/Arc.app/Contents/Frameworks/ArcCore.framework/Versions/A/Resources/resources.pak';
for (const [query, ids] of Object.entries(expectedIds)) {
  const pages = evidence.filter(e => e.operation === 'search_chromium_resources' && e.parameters.path === sourcePack && e.parameters.query === query).sort((a, b) => a.parameters.canonical_offset - b.parameters.canonical_offset);
  assert.equal(pages.length, 6);
  let next = 0, decoded = 0, observed = 0;
  for (const e of pages) {
    const r = e.normalized_result;
    assert.equal(r.page.canonical_offset, next);
    next += r.page.examined;
    decoded += r.page.decoded;
    observed += r.budgets.observed_decoded_bytes;
    assert.equal(r.budgets.observed_decoded_bytes, r.budgets.charged_decoded_bytes);
    assert.equal(r.skipped.length, 0);
    assert.equal(r.page.next_canonical_offset, next === 5414 ? null : next);
    assert.equal(r.coverage.window, 'complete');
    assert.equal(r.coverage.pack, 'partial');
  }
  assert.equal(next, 5414);
  assert.equal(decoded, 5414);
  assert.equal(observed, 80643472);
  assert.deepEqual(pages.flatMap(e => e.normalized_result.matches.map(m => m.entry.resource_id)), ids);
  queries.push({ literal: query, pages: pages.map(e => e.evidence_id), canonical_examined: next, canonical_decoded: decoded, decoded_bytes: observed, skips: 0, candidate_ids: ids, combined_coverage: 'complete encoded-byte query across the canonical payloads of this pinned pack' });
}
const owned = evidence.find(e => e.operation === 'search_chromium_resources' && e.parameters.path.includes('helper-search.pak'));
assert.ok(owned);
assert.deepEqual(owned.normalized_result.matches.map(m => m.entry.resource_id), [7, 42, 43, 91]);
assert.deepEqual(owned.normalized_result.matches[1].identities.map(i => i.resource_id), [42, 4242]);
assert.equal(owned.normalized_result.matches[3].text, null);
assert.equal(owned.normalized_result.coverage.pack, 'complete');
const receipt = { status: 'passed', observed_at: new Date().toISOString(), authority: 'Saved public schema/Evidence authentication plus independent bounded byte/hash/range checks of returned match candidates; no producer rerun.', calls: calls.length, tools: catalog.length, canonical_evidence: evidence.length, bundles, verifier_run: run.verifier_run, owned_fixture: { evidence_id: owned.evidence_id, matches: [7, 42, 43, 91], alias: 4242, invalid_utf8_binary_candidate_retained: true }, queries, verified_unique_match_payloads: decodedMatches.size, caveats: ['A byte candidate does not recover its original filename or prove runtime loading.', 'Each page remains partial for whole-pack coverage; the receipt joins the complete contiguous pinned canonical pages explicitly.', 'This capture preceded separate match-limit/cancellation validation hardening and Unicode preview-edge correction. Its pages stop only at scan_limit/end; byte ranges/hashes are unchanged. preview-correction-receipt.json records the later focused source boundary verification.'] };
await fs.writeFile(path.join(root, 'verification-receipt.json'), JSON.stringify(receipt, null, 2) + '\n');
console.log(JSON.stringify({ status: receipt.status, calls: receipt.calls, queries: queries.length, candidate_payloads: decodedMatches.size }));
