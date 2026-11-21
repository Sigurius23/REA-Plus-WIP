"""Offline, additive seed preparation. Never imports or executes target code."""

from bisect import bisect_left
import hashlib
import json
from pathlib import Path
import struct


OUT = Path(__file__).resolve().parent
ROOT = OUT.parents[2]
OLD = ROOT / 'field-tests/arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry'
SHA = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
INDEX = ROOT / 'field-tests/arc-dispatch-2026-11-06/native/function-start-index.evidence.json'
INPUT = ROOT / 'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'
SEED = OUT / 'broader-direct-callee-seeds-2063.tsv'
RECEIPT = OUT / 'seed-boundary-receipt.json'


def digest(data):
    return hashlib.sha256(data).hexdigest()


def descriptor(path):
    data = path.read_bytes()
    return {'path': str(path.relative_to(ROOT)), 'bytes': len(data), 'sha256': digest(data)}


def write_once(path, data):
    if path.exists():
        assert path.read_bytes() == data, f'Refusing changed overwrite: {path}'
        return
    path.write_bytes(data)


raw = INPUT.read_bytes()
assert len(raw) == 80498448 and digest(raw) == SHA
magic, cpu, _, _, ncmds, sizeofcmds, _, _ = struct.unpack_from('<8I', raw)
assert magic == 0xfeedfacf and cpu == 0x100000c
assert 32 + sizeofcmds <= len(raw)
segments, sections, commands = [], [], []
cursor = 32
for ordinal in range(ncmds):
    assert cursor + 8 <= 32 + sizeofcmds
    cmd, size = struct.unpack_from('<II', raw, cursor)
    assert size >= 8 and cursor + size <= 32 + sizeofcmds
    if cmd == 0x19:
        assert size >= 72
        name = raw[cursor+8:cursor+24].rstrip(b'\0').decode('ascii')
        vm, vs, fo, fs, maxprot, initprot, nsects, _ = struct.unpack_from('<QQQQiiII', raw, cursor+24)
        assert fs <= vs and fo + fs <= len(raw) and 72 + 80*nsects <= size
        segment = {'name': name, 'vm_start': hex(vm), 'vm_end_exclusive': hex(vm+vs),
                   'file_backed_vm_end_exclusive': hex(vm+fs), 'file_start': fo,
                   'file_end_exclusive': fo+fs, 'maxprot': maxprot, 'initprot': initprot}
        segments.append(segment)
        for j in range(nsects):
            off = cursor+72+80*j
            sname = raw[off:off+16].rstrip(b'\0').decode('ascii')
            segname = raw[off+16:off+32].rstrip(b'\0').decode('ascii')
            addr, ssize, fileoff = struct.unpack_from('<QQI', raw, off+32)
            flags = struct.unpack_from('<I', raw, off+64)[0]
            sections.append({'segment': segname, 'section': sname, 'vm_start': hex(addr),
                             'vm_end_exclusive': hex(addr+ssize), 'file_start': fileoff,
                             'bytes': ssize, 'flags': hex(flags)})
    elif cmd == 0x26:
        assert size == 16
        dataoff, datasize = struct.unpack_from('<II', raw, cursor+8)
        assert dataoff + datasize <= len(raw)
        commands.append({'command_ordinal_zero_based': ordinal, 'command_file_offset': cursor,
                         'data_file_offset': dataoff, 'data_bytes': datasize})
    cursor += size
assert cursor == 32 + sizeofcmds and len(commands) == 1
command = commands[0]
texts = [s for s in segments if s['name'] == '__TEXT' and s['file_start'] == 0]
assert len(texts) == 1 and texts[0]['initprot'] & 4
base = int(texts[0]['vm_start'], 16)
assert base == 0x100000000
encoded = raw[command['data_file_offset']:command['data_file_offset']+command['data_bytes']]
index = json.loads(INDEX.read_text())
assert index['subject']['digest']['sha256'] == SHA
assert index['operation'] == 'read_bytes'
assert bytes.fromhex(index['normalized_result']['bytes_hex']) == encoded
assert bytes.fromhex(index['raw_result']['bytes_hex']) == encoded
for representation in ['raw_result', 'normalized_result']:
    value = index[representation]
    assert value['complete'] and value['returned_bytes'] == value['requested_bytes'] == len(encoded)
linkedit = [s for s in segments if s['name'] == '__LINKEDIT'
            and s['file_start'] <= command['data_file_offset']
            and command['data_file_offset']+len(encoded) <= s['file_end_exclusive']]
assert len(linkedit) == 1
index_vm = int(linkedit[0]['vm_start'], 16)+command['data_file_offset']-linkedit[0]['file_start']
assert int(index['parameters']['address'],16) == index_vm
assert index['parameters']['length'] == len(encoded)

starts, deltas = [], []
current, position = base, 0
while position < len(encoded):
    begin = position
    value = shift = 0
    while True:
        assert position < len(encoded) and shift < 64
        byte = encoded[position]
        position += 1
        value |= (byte & 127) << shift
        assert value <= 0xffffffffffffffff
        if not byte & 128:
            break
        shift += 7
    assert position-begin == max(1, (value.bit_length()+6)//7), 'Noncanonical ULEB128'
    if value == 0:
        assert not any(encoded[position:])
        terminator = {'offset_in_lc_data': begin, 'trailing_zero_bytes': len(encoded)-position}
        break
    current += value
    assert current <= 0xffffffffffffffff and (not starts or starts[-1] < current)
    starts.append(current)
    deltas.append({'offset_in_lc_data': begin, 'end_offset_in_lc_data_exclusive': position,
                   'original_file_start': command['data_file_offset']+begin,
                   'encoded_hex': encoded[begin:position].hex(), 'delta': value})
else:
    raise AssertionError('Missing terminator')
lookup = set(starts)


def boundary(address):
    i = bisect_left(starts, address)
    assert i < len(starts)-1 and starts[i] == address
    end = starts[i+1]
    candidates = [s for s in segments if s['initprot'] & 4
                  and int(s['vm_start'],16) <= address
                  and end <= int(s['file_backed_vm_end_exclusive'],16)]
    assert len(candidates) == 1
    segment = candidates[0]
    fileoff = segment['file_start'] + address-int(segment['vm_start'],16)
    assert fileoff+end-address <= segment['file_end_exclusive']
    matches = [s for s in sections if int(s['vm_start'],16) <= address
               and end <= int(s['vm_end_exclusive'],16)]
    assert len(matches) == 1
    section = matches[0]
    assert section['segment'] == '__TEXT' and section['section'] == '__text'
    assert section['file_start'] + address-int(section['vm_start'],16) == fileoff
    assert address % 4 == end % 4 == 0
    return {'entry': hex(address), 'exact_lc_function_start': True,
            'entry_index_zero_based': i, 'previous_lc_start': hex(starts[i-1]),
            'next_lc_start_exclusive': hex(end), 'indexed_interval_bytes': end-address,
            'file_offset': fileoff, 'interval_sha256': digest(raw[fileoff:fileoff+end-address]),
            'lc_delta': deltas[i], 'source_segment': segment, 'source_section': section,
            'complete_function_body_proved': False}


prep_path = OLD / 'broader-direct-callee-preparation.json'
prep = json.loads(prep_path.read_text())
assert prep['target_sha256'] == SHA and prep['source_lc_evidence_id'] == index['evidence_id']
old_path = OLD / 'broader-direct-callee-seeds-2062.tsv'
old = old_path.read_bytes()
assert digest(old) == prep['seed_sha256'] == 'bd5ba7d9c177c00812a1f3303a08e87e0f5f47738851fdb7850c5169add73aa0'
old_lines = old.decode().splitlines()
assert len(old_lines) == len(set(old_lines)) == 2062
old_set = {int(line.split('\t')[0],16) for line in old_lines}
assert len(old_set) == 2062 and all(line.split('\t')[1] == 'function' for line in old_lines)
prior_path = OLD / prep['prior_seed_file']
prior = prior_path.read_bytes()
assert digest(prior) == prep['prior_seed_sha256']
prior_set = {int(line.split('\t')[0],16) for line in prior.decode().splitlines()}
assert len(prior_set) == 2044 and prior_set < old_set
decoded_targets = set()
checked_source_intervals = []
for source in prep['source_intervals']:
    start, end = int(source['entry'],16), int(source['next_lc_start'],16)
    checked = boundary(start)
    assert int(checked['next_lc_start_exclusive'],16) == end
    assert checked['interval_sha256'] == source['interval_sha256']
    assert checked['file_offset'] == source['file_offset']
    checked_source_intervals.append(checked)
    for pc in range(start,end,4):
        word = struct.unpack_from('<I',raw,checked['file_offset']+pc-start)[0]
        if word & 0x7c000000 != 0x14000000:
            continue
        imm = word & 0x3ffffff
        imm -= (1<<26) if imm & (1<<25) else 0
        target = pc+imm*4
        if target not in prior_set and target in lookup and target < 0x103600000:
            decoded_targets.add(target)
assert len(decoded_targets) == 18
assert decoded_targets == old_set-prior_set == {int(row['entry'],16) for row in prep['targets']}
assert 0x1006fa470 in old_set and 0x100596e80 not in old_set
added = boundary(0x100596e80)
lines = old_lines + ['0x100596e80\tfunction']
lines.sort(key=lambda row: int(row.split('\t')[0],16))
seed = ('\n'.join(lines)+'\n').encode()
assert len(lines) == len(set(lines)) == 2063
assert set(lines)-set(old_lines) == {'0x100596e80\tfunction'}
assert not set(old_lines)-set(lines)
write_once(SEED, seed)

sources = [descriptor(p) for p in [INPUT, INDEX, old_path, prep_path, prior_path,
           OLD/'prepare-broader-direct-callees.py', Path(__file__).resolve()]]
receipt = {
    'status': 'passed',
    'authority': 'Supplemental analyst-only Mach-O and ULEB128 parsing of SHA-checked original bytes; not new REA+ recovery, body ownership, runtime reachability, or storage evidence.',
    'target_sha256': SHA, 'target_bytes': len(raw),
    'provider_calls_executed': 0, 'target_or_shipped_script_executed': False,
    'original_and_retained_lc_bytes_identical': True,
    'retained_lc_evidence_id': index['evidence_id'],
    'lc_function_starts': {**command, 'mapped_vm_address': hex(index_vm),
                           'bytes_sha256': digest(encoded), 'decoded_entries': len(starts),
                           'image_base_from_original_text_segment': hex(base),
                           'terminator': terminator, 'source_segment': linkedit[0]},
    'prior_seed': {**descriptor(old_path), 'entries': 2062},
    'prior_2062_source_derivation_rechecked': {'prior_entries': 2044, 'immediate_targets': 18,
                                             'new_targets_exact_match': True,
                                             'source_intervals': checked_source_intervals},
    'seed': {'path': str(SEED.relative_to(ROOT)), 'entries': 2063,
             'bytes': len(seed), 'sha256': digest(seed)},
    'added_lines': ['0x100596e80\tfunction'], 'removed_lines': [],
    'added_function_boundary': added,
    'existing_preferences_getter_boundary': boundary(0x1006fa470),
    'source_files': sources,
    'limits': ['Seed entries remain caller assertions for later public procedure queries.',
               'LC_FUNCTION_STARTS adjacency bounds an indexed interval; it does not establish a complete procedure body, callee role, live binding, execution, effect completion, or durable persistence.',
               'No recursive, indirect, or neighborhood seeds were admitted; no old captures or seed files were changed.']}
write_once(RECEIPT, (json.dumps(receipt,indent=2)+'\n').encode())
print(json.dumps({'status': 'passed', 'receipt': str(RECEIPT),
                  'seed': str(SEED), 'seed_sha256': digest(seed), 'seed_entries': len(lines),
                  'added_interval': [added['entry'], added['next_lc_start_exclusive']],
                  'provider_calls_executed': 0}))
