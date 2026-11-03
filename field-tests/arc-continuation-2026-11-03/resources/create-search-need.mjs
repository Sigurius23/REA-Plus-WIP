import fs from 'node:fs/promises';
import path from 'node:path';
import { createHash } from 'node:crypto';
import { gzipSync, brotliCompressSync } from 'node:zlib';
import { fileURLToPath } from 'node:url';

// Owned inert format fixture, not an Arc resource or recovered filename map.
const out = path.dirname(fileURLToPath(import.meta.url));
const fixtureDir = '/private/tmp/rea-chromium-search-need-2026-11-03';
await fs.mkdir(fixtureDir, { recursive: true });
const needle = 'gdocs_script.js';
const raw = [
  { id: 7, codec: 'none', bytes: Buffer.from(JSON.stringify({ manifest_version: 3, name: 'Owned Reading Helper', content_scripts: [{ matches: ['https://example.invalid/document*'], js: ['content.js'] }], web_accessible_resources: [{ resources: [needle], matches: ['https://example.invalid/*'] }] })) },
  { id: 42, codec: 'gzip', bytes: Buffer.from(`const helperSource = ${JSON.stringify(needle)}; document.createElement('script').src = helperSource;\n`) },
  { id: 43, codec: 'chromium-brotli', bytes: Buffer.from(`globalThis.ownedReadingHelper = { resource: ${JSON.stringify(needle)}, enabled: true };\n`) },
  { id: 91, codec: 'none', bytes: Buffer.concat([Buffer.from([0xff, 0]), Buffer.from(needle), Buffer.from([0xff])]) },
];
const payloads = raw.map((entry) => {
  if (entry.codec === 'gzip') return gzipSync(entry.bytes);
  if (entry.codec === 'chromium-brotli') {
    const length = Buffer.alloc(6); length.writeUIntLE(entry.bytes.length, 0, 6);
    return Buffer.concat([Buffer.from([0x1e, 0x9b]), length, brotliCompressSync(entry.bytes)]);
  }
  return entry.bytes;
});
const alias = { id: 4242, canonical_index: 1 };
const metadataEnd = 12 + 6 * (raw.length + 1) + 4;
const header = Buffer.alloc(metadataEnd);
header.writeUInt32LE(5, 0); header[4] = 1;
header.writeUInt16LE(raw.length, 8); header.writeUInt16LE(1, 10);
let offset = metadataEnd;
for (const [index, entry] of raw.entries()) {
  header.writeUInt16LE(entry.id, 12 + index * 6);
  header.writeUInt32LE(offset, 14 + index * 6);
  offset += payloads[index].length;
}
header.writeUInt32LE(offset, 14 + raw.length * 6);
header.writeUInt16LE(alias.id, 12 + (raw.length + 1) * 6);
header.writeUInt16LE(alias.canonical_index, 14 + (raw.length + 1) * 6);
const pack = Buffer.concat([header, ...payloads]);
const packPath = path.join(fixtureDir, 'helper-search.pak');
await fs.writeFile(packPath, pack);
const sha = (bytes) => createHash('sha256').update(bytes).digest('hex');
await fs.writeFile(path.join(out, 'owned-search-fixture.json'), JSON.stringify({
  purpose: 'Locate a known manifest-declared script literal across canonical decoded resources without knowing IDs or inventing a filename registry.',
  query: needle, file: { path: packPath, bytes: pack.length, sha256: sha(pack) },
  format: 'chromium-datapack-v5', encoding_hint: 'utf8',
  runtime: { node: process.versions.node, zlib: process.versions.zlib },
  canonical: raw.map((entry, index) => ({ resource_id: entry.id, codec: entry.codec, decoded_bytes: entry.bytes.length, decoded_sha256: sha(entry.bytes), stored_bytes: payloads[index].length, stored_sha256: sha(payloads[index]), fixture_role: entry.id === 7 ? 'manifest declaration' : entry.id === 91 ? 'invalid-UTF8 binary candidate' : 'implementation-like text containing the literal' })),
  aliases: [{ resource_id: alias.id, canonical_resource_id: raw[alias.canonical_index].id }],
  authority: 'owned synthetic inert fixture; it does not identify any real Arc implementation',
}, null, 2) + '\n');
console.log(JSON.stringify({ path: packPath, bytes: pack.length, sha256: sha(pack) }));
