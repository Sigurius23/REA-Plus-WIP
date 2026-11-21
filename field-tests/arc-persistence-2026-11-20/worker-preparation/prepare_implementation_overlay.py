"""Supplemental, original-byte-checked analysis planning; never executes Arc."""
import contextlib
import io
import json
from pathlib import Path
import re
import runpy
import struct

OUT = Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):
    checked = runpy.run_path(str(OUT/'prepare_2069.py'))
ROOT, SHA = checked['ROOT'], checked['SHA']
base = ROOT/'field-tests/arc-persistence-2026-11-20'
original = checked['checked']['raw']
boundary, descriptor, digest, write_once = (checked[k] for k in ['boundary','descriptor','digest','write_once'])
prior = OUT/'broader-direct-callee-seeds-2069.tsv'
old = {int(line.split()[0],16) for line in prior.read_text().splitlines()}
origins = {}
rejected = []

def admit(address, origin):
    try:
        interval = boundary(address)
    except AssertionError:
        rejected.append({'address':hex(address),'origin':origin})
        return False
    origins.setdefault(address, {'interval':interval,'origins':[]})['origins'].append(origin)
    return True

selection = OUT/'implementation-overlay-inputs-2026-11-21.json'
if not selection.exists():
    files = sorted(str(file.relative_to(ROOT)) for directory in ['mcp','mcp-followup','mcp-defaults-2026-11-21'] for file in (base/directory).glob('*.evidence.json'))
    write_once(selection,(json.dumps(files,indent=2)+'\n').encode())
for selected in json.loads(selection.read_text()):
    file = ROOT/selected
    if True:
        record = json.loads(file.read_text())
        assert record['subject']['digest']['sha256'] == SHA
        value = record['normalized_result']
        if record['operation'] == 'procedure_pseudo_code' and isinstance(value,str):
            for match in re.finditer(r'(?:FUN_|DAT_|func_0x000)([0-9a-f]{9})(?![0-9a-f])',value):
                admit(int(match.group(1),16), {'kind':'public_pseudocode_literal','file':str(file.relative_to(ROOT)), 'evidence_id':record['evidence_id'],'literal':match.group(0)})
        if record['operation'] == 'inspect_native_dispatch_metadata' and isinstance(value,dict):
            for slot in value.get('result',{}).get('swift_dispatch_slots',[]):
                if slot.get('implementation_address'):
                    admit(int(slot['implementation_address'],16),{'kind':'public_static_witness_slot','file':str(file.relative_to(ROOT)), 'evidence_id':record['evidence_id'],'owner':slot['owner'],'slot_index':slot['slot_index']})

# Bounded planner: add exact function starts referenced by direct branches or
# ADR / immediately adjacent ADRP+ADD pairs, from the observed constructors.
# These are address candidates, not a claim of reachable code or a call graph.
roots = [0x100d91000,0x100d92a28,0x101173878,0x10117358c,0x101173708]
assert all(a in origins for a in roots)
visited, frontier = set(), set(roots)
for depth in range(3):
    next_frontier = set()
    for address in sorted(frontier):
        interval = boundary(address)
        off, length = interval['file_offset'],interval['indexed_interval_bytes']
        for i in range(0,length,4):
            word = struct.unpack_from('<I',original,off+i)[0]
            pc = address+i
            candidate = None
            kind = None
            if word & 0x7c000000 == 0x14000000:
                immediate = word & 0x3ffffff
                if immediate & 0x2000000: immediate -= 0x4000000
                candidate,kind = pc+immediate*4,'BL' if word&0x80000000 else 'B'
            elif word & 0x9f000000 in (0x10000000,0x90000000):
                immediate = ((word>>5)&0x7ffff)<<2 | ((word>>29)&3)
                if immediate & 0x100000: immediate -= 0x200000
                if word & 0x9f000000 == 0x10000000:
                    candidate,kind = pc+immediate,'ADR'
                elif i+8 <= length:
                    add = struct.unpack_from('<I',original,off+i+4)[0]
                    if add & 0xff800000 == 0x91000000 and ((add>>5)&31) == word&31:
                        candidate = (pc&~4095)+(immediate<<12)+(((add>>10)&4095) << (12 if add&0x400000 else 0))
                        kind = 'adjacent_ADRP_ADD'
            if candidate is not None:
                origin={'kind':'original_byte_address_candidate','encoding':kind,'source_entry':hex(address),'instruction_address':hex(pc),'instruction_word':hex(word),'depth':depth,'source_interval_sha256':interval['interval_sha256']}
                # Non-function references are expected and need not fill the receipt.
                try: boundary(candidate)
                except AssertionError: continue
                if admit(candidate,origin): next_frontier.add(candidate)
    visited |= frontier
    frontier = next_frontier-visited

all_addresses = old | origins.keys()
seed = ''.join(hex(a)+'\tfunction\n' for a in sorted(all_addresses)).encode()
seed_path = OUT/f'implementation-seeds-{len(all_addresses)}.tsv'
write_once(seed_path,seed)
receipt={'target_sha256':SHA,'prior':descriptor(prior),'seed':{'entries':len(all_addresses),**descriptor(seed_path)},'added':[{'address':hex(a),**origins[a]} for a in sorted(origins.keys()-old)],'unchanged_prior_entries':len(old),'rejected_public_literals':rejected,'planner':{'roots':list(map(hex,roots)),'examined_depths':[0,1,2],'remaining_frontier':list(map(hex,sorted(frontier)))},'reproducer':descriptor(Path(__file__).resolve()),'limits':['Source-bound supplemental seed planning, not runtime execution or completed provider analysis.','Every addition is an exact original LC_FUNCTION_STARTS entry in executable __TEXT,__text.','Address candidates do not establish code reachability, semantic role, dependency injection, or durability.','The three bounded planning depths are analyst query preparation; no complete transitive graph is claimed.']}
write_once(OUT/'implementation-overlay-receipt-2026-11-21.json',(json.dumps(receipt,indent=2)+'\n').encode())
print(json.dumps({'seed_path':str(seed_path),'entries':len(all_addresses),'sha256':digest(seed),'added':len(all_addresses-old),'remaining_frontier':len(frontier)}))
