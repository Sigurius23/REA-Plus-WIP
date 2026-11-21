"""Supplemental original-byte query planning for three public editor descriptors."""

import ast
import hashlib
import json
from pathlib import Path
import struct

OUT = Path(__file__).resolve().parent
ROOT = OUT.parents[1]
HELPERS = ROOT / 'field-tests/arc-persistence-2026-11-20/worker-preparation'

# Reuse the checked loader/index functions without executing its output-writing
# tail. No old producer, capture, seed or receipt is written by this script.
loader_path = HELPERS / 'prepare_2063.py'
tree = ast.parse(loader_path.read_text(), filename=str(loader_path))
cut = next(i for i, node in enumerate(tree.body)
           if isinstance(node, ast.Assign)
           and any(isinstance(t, ast.Name) and t.id == 'prep_path' for t in node.targets))
env = {'__file__': str(loader_path)}
exec(compile(ast.Module(body=tree.body[:cut], type_ignores=[]), str(loader_path), 'exec'), env)
raw, SHA, boundary, descriptor, digest, write_once = (
    env[k] for k in ['raw', 'SHA', 'boundary', 'descriptor', 'digest', 'write_once'])
assert SHA == '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'

refs_path = HELPERS / 'prepare_apply_store_overlay.py'
refs_tree = ast.parse(refs_path.read_text(), filename=str(refs_path))
refs_def = next(n for n in refs_tree.body
                if isinstance(n, ast.FunctionDef) and n.name == 'source_references')
env['base'] = env
exec(compile(ast.Module(body=[refs_def], type_ignores=[]), str(refs_path), 'exec'), env)
source_references = env['source_references']


def data_range(address, size):
    matches = [s for s in env['segments']
               if int(s['vm_start'], 16) <= address
               and address + size <= int(s['file_backed_vm_end_exclusive'], 16)]
    assert len(matches) == 1
    segment = matches[0]
    offset = segment['file_start'] + address - int(segment['vm_start'], 16)
    assert offset + size <= segment['file_end_exclusive']
    return raw[offset:offset + size], offset, segment


prior_path = OUT / 'callback-seeds-2308.tsv'
prior_bytes = prior_path.read_bytes()
prior_receipt_path = OUT / 'callback-seed-receipt.json'
prior_receipt = json.loads(prior_receipt_path.read_text())
assert digest(prior_bytes) == prior_receipt['seed']['sha256']
lines = prior_bytes.decode().splitlines()
prior = {int(line.split('\t')[0], 16) for line in lines}
assert len(lines) == len(set(lines)) == len(prior) == 2308
OLD = ROOT / 'field-tests/arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry/evidence'
roots, origins = set(), []
for address, label in [(0x103788e48, 'mutation-followup-0x1012a9b80-pseudocode'),
                       (0x103788e58, 'mutation-followup-0x1012a9b80-pseudocode'),
                       (0x103788e90, 'mutation-followup-0x1012a93b0-pseudocode')]:
    path = OLD / (label + '.evidence.json')
    record = json.loads(path.read_text())
    assert record['subject']['digest']['sha256'] == SHA
    assert hex(address)[2:] in str(record['normalized_result'])
    data, offset, segment = data_range(address, 8)
    relative, context_bytes = struct.unpack('<iI', data)
    entry = address + relative
    checked = boundary(entry)
    roots.add(entry)
    origins.append({'entry': hex(entry), 'descriptor_address': hex(address),
                    'signed_relative_word': relative, 'context_bytes': context_bytes,
                    'source': {**descriptor(path), 'evidence_id': record['evidence_id']},
                    'descriptor_bytes_authority': 'supplemental-original-bytes-planning-only',
                    'descriptor_bytes_hex': data.hex(), 'descriptor_file_offset': offset,
                    'descriptor_bytes_sha256': digest(data), 'source_segment': segment,
                    'entry_boundary': checked})

known, front = prior | roots, roots
levels, scanned, additional = [], [], {}
for depth in [1, 2]:
    found = set()
    for entry in sorted(front):
        checked, refs = source_references(entry)
        scanned.append({'depth': depth, 'boundary': checked})
        for ref in refs:
            target = int(ref['target'], 16)
            if target not in known:
                found.add(target)
                additional.setdefault(target, []).append({'depth': depth, **ref})
    levels.append({'depth': depth, 'additional_entries': len(found),
                   'entries': list(map(hex, sorted(found)))})
    known |= found
    front = found
assert len(known - prior) < 128, 'Unexpectedly broad editor frontier needs review'
new_lines = sorted(lines + [hex(a) + '\tfunction' for a in known - prior],
                   key=lambda line: int(line.split('\t')[0], 16))
assert len(new_lines) == len(set(new_lines)) == len(known)
assert not set(lines) - set(new_lines)
seed = ('\n'.join(new_lines) + '\n').encode()
seed_path = OUT / f'editor-async-seeds-{len(known)}.tsv'
write_once(seed_path, seed)
receipt = {
    'status': 'passed', 'target_sha256': SHA, 'provider_calls_executed': 0,
    'target_or_shipped_script_executed': False,
    'authority': 'Three publicly referenced descriptors, decoded from SHA-checked original bytes solely for query planning; two bounded original B/BL/ADR/adjacent ADRP+ADD reference levels.',
    'prior': {**descriptor(prior_path), 'entries': len(prior)},
    'seed': {**descriptor(seed_path), 'entries': len(known)},
    'root_origins': origins, 'reference_levels': levels, 'scanned_intervals': scanned,
    'additional_targets': [{'entry': hex(a), 'boundary': boundary(a),
                            'source_origins': additional[a]} for a in sorted(additional)],
    'added_lines': [hex(a) + '\tfunction' for a in sorted(known - prior)],
    'removed_lines': [],
    'provenance': [descriptor(env['INPUT']), descriptor(env['INDEX']),
                   descriptor(loader_path), descriptor(refs_path),
                   descriptor(prior_receipt_path), descriptor(Path(__file__).resolve())],
    'limits': [
        'Descriptor bytes/targets are supplemental planning until public read_bytes corroborates them.',
        'Every admitted target is an exact original LC_FUNCTION_STARTS entry inside executable file-backed __TEXT,__text; indexed intervals do not prove provider body ownership.',
        'Only two source-reference levels; no guessed indirect targets, neighborhood seeds or recursive call-graph claim.',
        'Old captures, helpers, seeds, receipts and production sources are unchanged.',
        'No active runtime injection, execution, completed operation, persistence or visible result is inferred.'
    ]}
receipt_path = OUT / 'editor-async-seed-receipt.json'
write_once(receipt_path, (json.dumps(receipt, indent=2) + '\n').encode())
print(json.dumps({'status': 'passed', 'seed': str(seed_path), 'sha256': digest(seed),
                  'entries': len(known), 'added': len(known - prior),
                  'roots': [hex(a) for a in sorted(roots)],
                  'levels': [(x['depth'], x['additional_entries']) for x in levels],
                  'receipt': str(receipt_path)}))
