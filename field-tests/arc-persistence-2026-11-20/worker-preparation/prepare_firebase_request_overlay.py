"""Three observed Firebase resumes and two bounded original code-reference levels."""

import contextlib
import io
import json
from pathlib import Path
import runpy

OUT = Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):
    base = runpy.run_path(str(OUT/'prepare_apply_store_overlay.py'))
ROOT,SHA = base['ROOT'],base['SHA']
boundary,descriptor,digest,write_once,source_references = (base[k] for k in
    ['boundary','descriptor','digest','write_once','source_references'])
MCP = ROOT/'field-tests/arc-persistence-2026-11-20/mcp-apply-store-2026-11-21'
prior_path = OUT/'boosts-apply-store-seeds-2279.tsv'
prior_bytes = prior_path.read_bytes()
assert digest(prior_bytes) == '7a788927a3bbbc9d12f18def51cce223d9cc50eeca7fa58ce347c90239afc104'
lines = prior_bytes.decode().splitlines()
prior = {int(line.split('\t')[0],16) for line in lines}
assert len(lines) == len(set(lines)) == len(prior) == 2279
origins = []
roots = {0x101182ab4,0x10117cd3c,0x10117fec8}
for entry,source_entry in [(0x101182ab4,0x10117d25c),(0x10117cd3c,0x10117d25c),
                           (0x10117fec8,0x10117fd60)]:
    path = MCP/f'implementation-{hex(source_entry)}-procedure_pseudo_code.evidence.json'
    record = json.loads(path.read_text())
    assert record['subject']['digest']['sha256'] == SHA
    assert f'DAT_{entry:x}' in record['normalized_result']
    origins.append({'entry':hex(entry),'source_entry':hex(source_entry),
                    'kind':'public_task_switch_destination_literal',
                    'source':{**descriptor(path),'evidence_id':record['evidence_id']}})
assert not roots&prior
known,front = prior|roots,roots
levels,scanned,target_origins = [],[],{}
for depth in [1,2]:
    found = set()
    for entry in sorted(front):
        checked,refs = source_references(entry)
        scanned.append({'scan_depth':depth,'boundary':checked})
        for ref in refs:
            target = int(ref['target'],16)
            if target not in known:
                found.add(target)
                target_origins.setdefault(target,[]).append({'depth':depth,**ref})
    levels.append({'depth':depth,'additional_entries':len(found),
                   'entries':[hex(a) for a in sorted(found)]})
    known |= found
    front = found
assert len(known) == 2296 and len(known-prior) <= 32
new_lines = sorted(lines+[hex(a)+'\tfunction' for a in known-prior],
                   key=lambda line:int(line.split('\t')[0],16))
assert len(new_lines) == len(set(new_lines)) == len(known)
assert not set(lines)-set(new_lines)
seed = ('\n'.join(new_lines)+'\n').encode()
seed_path = OUT/f'firebase-request-seeds-{len(known)}.tsv'
write_once(seed_path,seed)
receipt = {
    'status':'passed','target_sha256':SHA,'provider_calls_executed':0,
    'target_or_shipped_script_executed':False,
    'authority':'Three public task-switch destinations, followed by two bounded levels of exact original B/BL/ADR/adjacent ADRP+ADD code-address references. Preparation only; no execution or effect role inferred.',
    'prior':{**descriptor(prior_path),'entries':2279},
    'seed':{**descriptor(seed_path),'entries':len(known)},
    'root_origins':origins,'root_boundaries':[boundary(a) for a in sorted(roots)],
    'source_reference_levels':levels,
    'additional_source_targets':[{'entry':hex(a),'boundary':boundary(a),'source_origins':target_origins[a]}
                                 for a in sorted(target_origins)],
    'source_intervals_scanned':scanned,
    'added_lines':[hex(a)+'\tfunction' for a in sorted(known-prior)],'removed_lines':[],
    'base_receipt':descriptor(OUT/'apply-store-overlay-receipt-2026-11-21.json'),
    'decoder_reproducer':descriptor(OUT/'prepare_apply_store_overlay.py'),
    'reproducer':descriptor(Path(__file__).resolve()),
    'limits':['Only two reference levels. Every admitted target is an exact retained LC_FUNCTION_STARTS entry with original file-backed executable __TEXT,__text bounds and interval hash.',
              'No inferred indirect targets or neighborhood admission. ADRP+ADD role remains an explicitly labeled code-address planning hypothesis.',
              'Indexed interval bounds are not complete provider-owned procedure bodies; original metadata/source digests remain linked through the base receipt.',
              'Prior overlays/captures unchanged. Runtime injection, request execution, error/completion behavior and durable remote/local state require their own evidence.']}
receipt_path = OUT/'firebase-request-overlay-receipt-2026-11-21.json'
write_once(receipt_path,(json.dumps(receipt,indent=2)+'\n').encode())
print(json.dumps({'status':'passed','seed':str(seed_path),'sha256':digest(seed),'entries':len(known),
                  'added':len(known-prior),'receipt':str(receipt_path)}))
