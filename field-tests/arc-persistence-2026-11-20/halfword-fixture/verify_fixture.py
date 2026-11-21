"""Supplemental static verification only; never loads/executes either library."""

import hashlib
import json
from pathlib import Path
import re
import struct

OUT = Path(__file__).resolve().parent


def sha(data):
    return hashlib.sha256(data).hexdigest()


def write_once(path, data):
    if path.exists():
        assert path.read_bytes() == data, f'Refusing changed overwrite: {path}'
    else:
        path.write_bytes(data)


def symbols(path):
    result = {}
    for line in path.read_text().splitlines():
        match = re.match(r'([0-9a-f]{16}) .*? (_\$s\S+|___swift_\S+)$', line)
        if match:
            result[match[2]] = int(match[1], 16)
    return result


def inspect(binary_name, assembly_name, symbols_name, disassembly_name, source_name, getter_suffix):
    path = OUT/binary_name
    raw = path.read_bytes()
    assert struct.unpack_from('<I', raw)[0] == 0xfeedfacf
    segments, cursor = [], 32
    for _ in range(struct.unpack_from('<I', raw, 16)[0]):
        cmd, size = struct.unpack_from('<II', raw, cursor)
        if cmd == 0x19:
            vm, vs, fo, fs = struct.unpack_from('<QQQQ', raw, cursor+24)
            assert fo+fs <= len(raw) and fs <= vs
            segments.append((vm, fo, fs))
        cursor += size

    def offset(address, count):
        matches = [fo+address-vm for vm,fo,fs in segments if vm <= address and address+count <= vm+fs]
        assert len(matches) == 1
        return matches[0]

    syms = symbols(OUT/symbols_name)
    getters = [(name,address) for name,address in syms.items() if name.endswith(getter_suffix)]
    assert len(getters) == 1
    name, entry = getters[0]
    next_entry = min(value for value in syms.values() if value > entry)
    listing = (OUT/disassembly_name).read_text().splitlines()
    instructions = {}
    for line in listing:
        match = re.match(r'([0-9a-f]{16})\s+(.*)', line)
        if match:
            instructions[int(match[1],16)] = match[2]
    prefix = [{'address':hex(a),'text':instructions[a]} for a in range(entry,entry+40,4)]
    assert 'and\tx9, x0, #0xffff' in prefix[3]['text']
    assert 'ldrh\tw12, [x10, x9, lsl #1]' == prefix[7]['text']
    assert 'add\tx11, x11, x12, lsl #2' == prefix[8]['text']
    assert 'br\tx11' == prefix[9]['text']
    # Decode the actual linked ADRP/ADD and ADR, not neighboring-table extent.
    adrp, add, adr = struct.unpack_from('<III', raw, offset(entry+16,12))
    assert adrp & 0x9f00001f == 0x9000000a
    imm = ((adrp >> 5) & 0x7ffff)*4+((adrp >> 29)&3)
    imm -= (1 << 21) if imm & (1 << 20) else 0
    table = ((entry+16)&~0xfff)+(imm << 12)+((add >> 10)&0xfff)
    assert add & 0xffc003ff == 0x9100014a
    assert adr & 0x9f00001f == 0x1000000b
    imm = ((adr >> 5) & 0x7ffff)*4+((adr >> 29)&3)
    imm -= (1 << 21) if imm & (1 << 20) else 0
    anchor = entry+24+imm
    assembly = (OUT/assembly_name).read_text()
    table_match = re.search(r'^lJTI\d+_0:\n((?:\s*\.short[^\n]*\n)+)', assembly, re.M)
    assert table_match is not None
    # 297 comes from owned source plus exact enum descriptor, not table termination.
    assert len(table_match[1].splitlines()) == 297
    assert len(re.findall(r'^    case setting\d{3}',(OUT/source_name).read_text(),re.M)) == 297
    descriptors = [(key,value) for key,value in syms.items() if key.endswith('SettingOMn')]
    assert len(descriptors) == 1
    descriptor = descriptors[0][1]
    flags, _, _, _, field_rel, payload, empty = struct.unpack_from('<4IiII', raw, offset(descriptor,28))
    assert (flags,payload,empty) == (0x52,0,297)
    field = descriptor+16+field_rel
    record_size, field_count = struct.unpack_from('<HI',raw,offset(field+10,6))
    assert (record_size,field_count) == (12,297)
    words = struct.unpack_from('<297H',raw,offset(table,594))
    targets = [anchor+4*word for word in words]
    assert len(set(targets)) == 297
    assert all(entry <= target < next_entry and target in instructions for target in targets)
    mapping = [{'ordinal':i,'halfword':word,'target':hex(target)} for i,(word,target) in enumerate(zip(words,targets))]
    return {'binary':binary_name,'bytes':len(raw),'sha256':sha(raw),
            'getter_symbol':name,'getter_entry':hex(entry),'next_symbol':hex(next_entry),
            'prefix':prefix,'table_address':hex(table),'anchor':hex(anchor),
            'entry_count_from_owned_source_and_enum_descriptor':297,'table_bytes':594,
            'table_sha256':sha(raw[offset(table,594):offset(table,594)+594]),
            'distinct_targets':297,'all_targets_in_getter_symbol_interval':True,
            'local_bounds_guard_before_dispatch':False,'mask_range_is_not_case_count':[0,65535],
            'enum_descriptor':{'address':hex(descriptor),'flags':hex(flags),'payload_cases':payload,
                               'empty_cases':empty,'field_descriptor':hex(field),
                               'field_record_size':record_size,'field_records':field_count},
            'mapping':mapping},raw,offset,syms


raw_info,raw,offset,syms = inspect('libSetting297.dylib','Setting297-O.s','symbols.txt',
                                  'disassembly.txt','Setting297.swift','SettingO8rawValueSSvg')
manual_info,_,_,_ = inspect('libManualSetting297.dylib','ManualSetting297-O.s','manual-symbols.txt',
                             'manual-disassembly.txt','ManualSetting297.swift','SettingO14preferencesKeySSvg')
assert raw_info['table_sha256'] == manual_info['table_sha256']
mc = syms['_$s15HalfwordFixture0B7SettingOSYAAMc']
flags, count = struct.unpack_from('<II',raw,offset(mc+12,8))
assert (flags,count) == (0x30000,3)
fixups = (OUT/'fixups.txt').read_text()
requirements = []
for j in range(count):
    req_cell,impl_cell = mc+20+8*j,mc+24+8*j
    req_word = struct.unpack_from('<i',raw,offset(req_cell,4))[0]
    impl_word = struct.unpack_from('<i',raw,offset(impl_cell,4))[0]
    assert req_word&1
    import_slot = (req_cell+req_word)&~1
    rows = [line.strip() for line in fixups.splitlines() if f'0x{import_slot:08X}' in line]
    assert len(rows) == 1
    requirements.append({'requirement_cell':hex(req_cell),'requirement_import_slot':hex(import_slot),
                         'exact_import_binding':rows[0],'implementation_cell':hex(impl_cell),
                         'implementation_relative_word':impl_word,
                         'implementation_target_with_tag':hex(impl_cell+impl_word)})
getter = [r for r in requirements if r['exact_import_binding'].endswith('/_$sSY8rawValue03RawB0QzvgTq')]
assert len(getter) == 1
assert getter[0]['implementation_target_with_tag'] == '0x1808'
witness_listing = []
for line in (OUT/'disassembly.txt').read_text().splitlines():
    match = re.match(r'([0-9a-f]{16})\s+(.*)',line)
    if match and 0x1808 <= int(match[1],16) < 0x1838:
        witness_listing.append({'address':hex(int(match[1],16)),'text':match[2]})
assert any(row['text'] == 'ldrh\tw0, [x20]' for row in witness_listing)
assert any(row['text'].startswith('bl\t_$s15HalfwordFixture0B7SettingO8rawValueSSvg') for row in witness_listing)
assert not any('SY' in line and '(from libswiftCore)' in line for line in (OUT/'manual-symbols.txt').read_text().splitlines())
receipt = {'status':'passed','authority':'Owned source compilation and Apple static binary tools; supplemental analyst verification, not REA+ provider recovery.',
           'target_or_fixture_executed':False,'provider_launched':False,
           'compiler':(OUT/'compiler-version.txt').read_text().strip(),
           'flags':['-parse-as-library','-O','-whole-module-optimization','-target','arm64-apple-macosx14.0'],
           'raw_representable_fixture':raw_info,'manual_getter_control':manual_info,
           'raw_and_manual_halfword_tables_identical':True,
           'raw_representable_conformance':{'address':hex(mc),'flags':hex(flags),'resilient_witness_pairs':requirements,
               'getter_witness':witness_listing,'raw_value_typeref':{'address':'0x5acc','bytes_hex':raw[offset(0x5acc,3):offset(0x5acc,3)+3].hex(),
                 'assembly_declares_symbolic':'SS','tagged_reference_is_data_not_executable':True},
               'runtime_witness_instantiation':'not_observed'},
           'limits':['297 is established here from owned source and the selected original enum descriptor. The mask only proves a 16-bit range.',
                     'Function symbols, source provenance and resilient witness links are available in this owned fixture; equivalent input identity has not been established for the anonymous Arc dispatcher.',
                     'Manual getter has the same table without RawRepresentable conformance, showing that table shape alone cannot establish protocol/getter identity.',
                     'No Ghidra/REA+ call was made. Provider behavior on these fixtures remains to be tested by the session owner.']}
write_once(OUT/'fixture-observation.json',(json.dumps(receipt,indent=2)+'\n').encode())
print(json.dumps({'status':'passed','raw_getter':raw_info['getter_entry'],'manual_getter':manual_info['getter_entry'],
                  'raw_binary_sha256':raw_info['sha256'],'manual_binary_sha256':manual_info['sha256'],
                  'cases':297,'table_bytes':594,'identical_tables':True,'provider_launched':False}))
