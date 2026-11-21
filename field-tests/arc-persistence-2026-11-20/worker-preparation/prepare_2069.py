"""Add six exact public targets to the retained 2063 overlay, offline only."""

import contextlib
import io
import json
from pathlib import Path
import runpy

OUT = Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):
    checked = runpy.run_path(str(OUT/'prepare_2063.py'))
ROOT, SHA = checked['ROOT'], checked['SHA']
MCP = ROOT/'field-tests/arc-persistence-2026-11-20/mcp'
digest, descriptor, write_once, boundary = (checked[name] for name in ['digest','descriptor','write_once','boundary'])
old_path = OUT/'broader-direct-callee-seeds-2063.tsv'
old = old_path.read_bytes()
assert digest(old) == '08d3709ab4832233db1c2c7db501784e0779c95d8e2d429d57c2a23511afc667'
lines = old.decode().splitlines()
assert len(lines) == len(set(lines)) == 2063
dispatch_path = MCP/'dependency-getter-pseudocode.evidence.json'
dispatch = json.loads(dispatch_path.read_text())
conformance_path = MCP/'user-defaults-conformances.evidence.json'
conformance = json.loads(conformance_path.read_text())
for record in [dispatch,conformance]:
    assert record['subject']['digest']['sha256'] == SHA
dispatch_targets = [0x1006faab0,0x1006fa7b4,0x1006fa77c]
for address in dispatch_targets:
    assert f'{address:x}' in dispatch['normalized_result']
witness_targets = [0x100d8c154,0x100d8c1dc,0x100d929a0]
slots = conformance['normalized_result']['result']['swift_dispatch_slots']
selected_slots = []
for address in witness_targets:
    matches = [slot for slot in slots if slot.get('implementation_address') == hex(address)]
    assert len(matches) == 1 and matches[0]['decode']['status'] == 'decoded'
    assert matches[0]['owner'].startswith('UserDefaultsClient: ')
    selected_slots.extend(matches)
addresses = dispatch_targets+witness_targets
additions = [hex(address)+'\tfunction' for address in addresses]
assert not set(additions)&set(lines)
newlines = sorted(lines+additions,key=lambda row:int(row.split('\t')[0],16))
assert len(newlines) == len(set(newlines)) == 2069
assert set(newlines)-set(lines) == set(additions) and not set(lines)-set(newlines)
seed = ('\n'.join(newlines)+'\n').encode()
seed_path = OUT/'broader-direct-callee-seeds-2069.tsv'
receipt_path = OUT/'seed-boundary-receipt-2069.json'
boundaries = [boundary(address) for address in addresses]
write_once(seed_path,seed)
receipt = {
    'status':'passed', 'target_sha256':SHA,
    'authority':'Six exact observed public getter/conformance targets; original-byte LC_FUNCTION_STARTS and executable section-bound checks reused from prepare_2063.py. Supplemental analyst seed preparation only.',
    'provider_calls_executed':0, 'target_or_shipped_script_executed':False,
    'prior_seed':{**descriptor(old_path),'entries':2063},
    'seed':{**descriptor(seed_path),'entries':2069},
    'added_lines':sorted(additions,key=lambda row:int(row.split('\t')[0],16)),
    'removed_lines':[], 'boundaries':boundaries,
    'dispatch_origin':{**descriptor(dispatch_path),'evidence_id':dispatch['evidence_id']},
    'witness_origin':{**descriptor(conformance_path),'evidence_id':conformance['evidence_id'],
                      'selected_static_slots':selected_slots},
    'base_boundary_receipt':descriptor(OUT/'seed-boundary-receipt.json'),
    'reproducer':descriptor(Path(__file__).resolve()),
    'limits':['LC adjacency is an indexed interval, not provider-owned complete function-body evidence.',
              'Static DependencyKey/TestDependencyKey witness identities do not prove runtime injection or a durable write.',
              'No recursive, indirect or neighborhood seeds added; 2063 and earlier overlays unchanged.']}
write_once(receipt_path,(json.dumps(receipt,indent=2)+'\n').encode())
print(json.dumps({'status':'passed','seed':str(seed_path),'seed_sha256':digest(seed),
                  'entries':2069,'receipt':str(receipt_path)}))
