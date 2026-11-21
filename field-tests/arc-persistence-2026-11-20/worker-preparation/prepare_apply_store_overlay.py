"""Bounded offline overlay from ten public roots plus two source-reference levels."""

import contextlib
import io
import json
from pathlib import Path
import runpy
import struct

OUT = Path(__file__).resolve().parent
with contextlib.redirect_stdout(io.StringIO()):
    base = runpy.run_path(str(OUT/'prepare_2063.py'))
ROOT, SHA, raw = base['ROOT'], base['SHA'], base['raw']
boundary, descriptor, digest, write_once = (base[k] for k in ['boundary','descriptor','digest','write_once'])
MCP = ROOT/'field-tests/arc-persistence-2026-11-20/mcp-boosts-2026-11-21'
old_path = OUT/'boosts-implementation-seeds-2236.tsv'
old = old_path.read_bytes()
assert digest(old) == '931f49061ebba069459f758912844d2a59f63c4a8f5b47cbbdf9c2b7422a9ac1'
lines = old.decode().splitlines()
prior = {int(line.split('\t')[0],16) for line in lines}
assert len(lines) == len(set(lines)) == len(prior) == 2236
roots, origins = set(), []


def record(path):
    result = json.loads(path.read_text())
    assert result['subject']['digest']['sha256'] == SHA
    return result, {**descriptor(path),'evidence_id':result['evidence_id']}


for name,expected in [('firebase-store-set-and-get-descriptors',[0x101182f54,0x101182fbc]),
                      ('memory-store-set-and-get-descriptors',[0x1011861a8,0x101186210])]:
    result, source = record(MCP/(name+'.evidence.json'))
    value = result['normalized_result']
    data = bytes.fromhex(value['bytes_hex'])
    address = int(value['address'],16)
    assert value['complete'] and len(data) == value['returned_bytes'] == 16
    assert raw[base['offset'](address,16):base['offset'](address,16)+16] == data if 'offset' in base else raw[address-0x100000000:address-0x100000000+16] == data
    for i,target in enumerate(expected):
        cell = address+8*i
        relative,context_size = struct.unpack_from('<iI',data,8*i)
        assert cell+relative == target
        roots.add(target)
        origins.append({'entry':hex(target),'kind':'public_async_descriptor',
                        'descriptor_address':hex(cell),'signed_relative_word':relative,
                        'context_bytes':context_size,'source':source})

for target,name in [(0x1011880fc,'implementation-0x10118807c-procedure_pseudo_code.evidence.json'),
                    (0x101188c58,'implementation-0x101188c58-procedure_pseudo_code.evidence.json')]:
    result,source = record(MCP/name)
    assert hex(target)[2:] in result['normalized_result']
    roots.add(target)
    origins.append({'entry':hex(target),'kind':'public_async_resume_literal',
                    'source':source,'limitation':'A source-visible task-switch destination; no execution observed.'})

result,source = record(MCP/'implementation-0x101188c58-read_function_instructions.evidence.json')
for target in [0x101187e3c,0x101165e98,0x10116dc18,0x101166f48]:
    matches = [line for line in result['normalized_result']['instructions'] if line.endswith(': bl '+hex(target))]
    assert matches
    roots.add(target)
    origins.append({'entry':hex(target),'kind':'public_direct_bl','instructions':matches,'source':source})
assert len(roots) == 10 and not roots&prior


def source_references(entry):
    checked = boundary(entry)
    size,off = checked['indexed_interval_bytes'],checked['file_offset']
    refs = []
    for j in range(0,size,4):
        pc = entry+j
        word = struct.unpack_from('<I',raw,off+j)[0]
        target,kind,words = None,None,[word]
        if word&0x7c000000 == 0x14000000:
            imm = word&0x3ffffff
            imm -= (1<<26) if imm&(1<<25) else 0
            target,kind = pc+imm*4,'BL' if word>>31 else 'B'
        elif word&0x9f000000 == 0x10000000:
            imm = ((word>>5)&0x7ffff)*4+((word>>29)&3)
            imm -= (1<<21) if imm&(1<<20) else 0
            target,kind = pc+imm,'ADR'
        elif word&0x9f000000 == 0x90000000 and j+8 <= size:
            following = struct.unpack_from('<I',raw,off+j+4)[0]
            if following&0xff000000 == 0x91000000 and (following>>5)&31 == word&31:
                imm = ((word>>5)&0x7ffff)*4+((word>>29)&3)
                imm -= (1<<21) if imm&(1<<20) else 0
                target = (pc&~4095)+(imm<<12)+(((following>>10)&4095)<<(12 if following&(1<<22) else 0))
                kind,words = 'ADRP+ADD',[word,following]
        if target is not None and target in base['lookup'] and target < 0x103600000:
            refs.append({'source_entry':hex(entry),'pc':hex(pc),'kind':kind,
                         'instruction_words':[hex(w) for w in words],'target':hex(target)})
    return checked,refs


known = prior|roots
front = roots
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
    levels.append({'depth':depth,'additional_entries':len(found),'entries':[hex(a) for a in sorted(found)]})
    known |= found
    front = found
assert len(known-prior) <= 64 and len(known) == 2279
new_lines = sorted(lines+[hex(a)+'\tfunction' for a in known-prior],key=lambda line:int(line.split('\t')[0],16))
assert len(new_lines) == len(set(new_lines)) == len(known)
assert not set(lines)-set(new_lines)
seed = ('\n'.join(new_lines)+'\n').encode()
seed_path = OUT/f'boosts-apply-store-seeds-{len(known)}.tsv'
write_once(seed_path,seed)
receipt = {'status':'passed','target_sha256':SHA,'provider_calls_executed':0,
    'target_or_shipped_script_executed':False,
    'authority':'Ten exact public targets plus two levels of SHA-checked original B/BL/ADR/adjacent ADRP+ADD references. These are caller preparation assertions; no new body role or effect is inferred.',
    'prior':{**descriptor(old_path),'entries':2236},'seed':{**descriptor(seed_path),'entries':len(known)},
    'root_count':10,'root_origins':origins,'source_reference_levels':levels,
    'additional_source_targets':[{'entry':hex(a),'boundary':boundary(a),'source_origins':target_origins[a]}
                                 for a in sorted(target_origins)],
    'root_boundaries':[boundary(a) for a in sorted(roots)],
    'source_intervals_scanned':scanned,
    'added_lines':[hex(a)+'\tfunction' for a in sorted(known-prior)],'removed_lines':[],
    'reproducer':descriptor(Path(__file__).resolve()),
    'limits':['No recursion beyond two explicit source-reference levels. No inferred indirect targets or neighborhood seeds.',
              'ADRP+ADD addresses are exact executable LC entries, retained as code-address planning hypotheses; the consuming role is not inferred.',
              'All intervals are original LC_FUNCTION_STARTS-adjacent intervals inside executable file-backed __TEXT,__text; interval extent is not a complete-function proof.',
              'Old overlays and captures remain byte-identical; runtime injection, execution, completion and durability remain unobserved.']}
receipt_path = OUT/'apply-store-overlay-receipt-2026-11-21.json'
write_once(receipt_path,(json.dumps(receipt,indent=2)+'\n').encode())
print(json.dumps({'status':'passed','seed':str(seed_path),'sha256':digest(seed),'entries':len(known),
                  'added':len(known-prior),'source_levels':levels,'receipt':str(receipt_path)}))
