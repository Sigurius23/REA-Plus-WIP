"""Source-owned static oracle; never loads or executes compiled fixture code."""

import hashlib
import json
from pathlib import Path
import re
import struct

OUT = Path(__file__).resolve().parent


def sha(data):
    return hashlib.sha256(data).hexdigest()


class Image:
    def __init__(self, name, symbol_file, listing_file=None, fixup_file=None):
        self.name = name
        self.raw = (OUT/name).read_bytes()
        assert struct.unpack_from('<II', self.raw) == (0xfeedfacf, 0x100000c)
        self.segments, self.sections = [], []
        cursor = 32
        for _ in range(struct.unpack_from('<I', self.raw, 16)[0]):
            cmd, size = struct.unpack_from('<II', self.raw, cursor)
            assert size >= 8 and cursor + size <= len(self.raw)
            if cmd == 0x19:
                vm, vs, fo, fs = struct.unpack_from('<QQQQ', self.raw, cursor+24)
                assert fs <= vs and fo + fs <= len(self.raw)
                self.segments.append((vm, fo, fs))
                nsects = struct.unpack_from('<I', self.raw, cursor+64)[0]
                for i in range(nsects):
                    p = cursor+72+80*i
                    section = self.raw[p:p+16].rstrip(b'\0').decode()
                    segment = self.raw[p+16:p+32].rstrip(b'\0').decode()
                    address, length, off = struct.unpack_from('<QQI', self.raw, p+32)
                    self.sections.append((segment, section, address, length, off))
            cursor += size
        self.symbols = {}
        self.code_entries = set()
        for line in (OUT/symbol_file).read_text().splitlines():
            match = re.match(r'^([0-9a-f]{16}) ([A-Za-z]) (.+)$', line)
            if match:
                self.symbols[match[3]] = int(match[1], 16)
                if match[2] in 'Tt':
                    self.code_entries.add(int(match[1], 16))
        self.instructions = {}
        if listing_file:
            for line in (OUT/listing_file).read_text().splitlines():
                match = re.match(r'^\s*([0-9a-f]+):\s+(?:[0-9a-f]{2}\s+){4}(.*)$', line)
                if match:
                    self.instructions[int(match[1], 16)] = match[2]
        self.fixups = {}
        if fixup_file:
            for line in (OUT/fixup_file).read_text().splitlines():
                match = re.search(r'\s(0x[0-9A-F]+)\s+(rebase|bind)\s+(.+)$', line)
                if match:
                    self.fixups[int(match[1], 16)] = (match[2], match[3].strip())

    def offset(self, address, size):
        matches = [fo+address-vm for vm, fo, fs in self.segments
                   if vm <= address and address+size <= vm+fs]
        assert len(matches) == 1, (hex(address), size)
        return matches[0]

    def bytes(self, address, size):
        p = self.offset(address, size)
        return self.raw[p:p+size]

    def u32(self, address):
        return struct.unpack('<I', self.bytes(address, 4))[0]

    def relative(self, address):
        return address + struct.unpack('<i', self.bytes(address, 4))[0]

    def string(self, address):
        p = self.offset(address, 1)
        z = self.raw.index(0, p)
        assert z-p < 1024
        return self.raw[p:z].decode()

    def symbol(self, suffix):
        matches = [(n, a) for n, a in self.symbols.items() if n.endswith(suffix)]
        assert len(matches) == 1, (suffix, matches)
        return matches[0]

    def pointer(self, address):
        role, target = self.fixups[address]
        assert role == 'rebase' and target.startswith('0x')
        actual = int(target, 16)
        word = struct.unpack('<Q', self.bytes(address, 8))[0]
        assert not word >> 63 and word & ((1 << 36)-1) == actual
        return actual

    def mangle(self, address):
        p, raw, tokens = address, bytearray(), []
        for _ in range(128):
            byte = self.bytes(p, 1)[0]
            if byte == 0:
                return {'address': hex(address), 'bytes_hex': raw.hex(), 'tokens': tokens}
            if 1 <= byte <= 0x17:
                assert byte in [1, 2], 'Unsupported symbolic kind in owned oracle'
                target = self.relative(p+1)
                token = {'kind': byte, 'tag_address': hex(p),
                         'relative_target': hex(target)}
                if byte == 2:
                    token['loaded_identity'] = self.fixups[target]
                else:
                    token['context_name'] = self.string(self.relative(target+8))
                    token['context_descriptor'] = hex(target)
                tokens.append(token)
                raw.extend(self.bytes(p, 5))
                p += 5
            else:
                tokens.append(chr(byte))
                raw.append(byte)
                p += 1
        raise AssertionError('Incomplete symbolic mangle')

    def nominal(self, address):
        parent = self.relative(address+4)
        return {'address': hex(address), 'flags': hex(self.u32(address)),
                'name': self.string(self.relative(address+8)),
                'parent_address': hex(parent),
                'parent_flags': hex(self.u32(parent)),
                'parent_name': self.string(self.relative(parent+8))}

    def enum(self, suffix):
        symbol, address = self.symbol(suffix)
        result = self.nominal(address)
        assert self.u32(address) & 31 == 18
        field = self.relative(address+16)
        payload = self.u32(address+20) & 0xffffff
        empty = self.u32(address+24)
        assert payload == 0 and empty == 297
        assert struct.unpack('<HI', self.bytes(field+10, 6)) == (12, 297)
        result.update(symbol=symbol, field_descriptor=hex(field), payload_cases=payload,
                      empty_cases=empty, reflected_records=297)
        return result

    def client(self, suffix):
        symbol, address = self.symbol(suffix+'VMn')
        result = self.nominal(address)
        assert self.u32(address) & 31 == 17
        assert self.u32(address+20) == 1 and self.u32(address+24) == 2
        field = self.relative(address+16)
        assert struct.unpack('<HI', self.bytes(field+10, 6)) == (12, 1)
        field_name = self.string(self.relative(field+24))
        assert field_name == 'boolForSetting'
        mangle = self.mangle(self.relative(field+20))
        _, metadata = self.symbol(suffix+'VN')
        field_offset = self.u32(metadata+16)
        assert field_offset == 0
        _, witness = self.symbol(suffix+'VAA10FactoryKeyAAWP')
        conformance, tagged_type, implementation = [self.pointer(witness+8*i) for i in range(3)]
        assert self.relative(conformance+4) == address
        associated = self.mangle(tagged_type-1)
        assert associated['tokens'][0]['context_descriptor'] == hex(address)
        protocol = self.relative(conformance)
        assert self.string(self.relative(protocol+8)) == 'FactoryKey'
        req_count = self.u32(protocol+16)
        assert req_count == 2
        requirement_flags = [self.u32(protocol+24+8*i) for i in range(2)]
        assert requirement_flags[0] & 15 == 7
        result.update(symbol=symbol, field_descriptor=hex(field), field_name=field_name,
                      closure_type=mangle, static_metadata=hex(metadata), field_offset=field_offset,
                      factory_witness={'table': hex(witness), 'conformance': hex(conformance),
                          'protocol': hex(protocol), 'requirement_flags': requirement_flags,
                          'associated_Value': associated, 'make_implementation': hex(implementation),
                          'signature_authority': 'Owned protocol declaration and compiler symbol oracle; requirement flags alone do not encode a full signature.'})
        return result

    def excerpt(self, entry, size):
        return [{'address': hex(a), 'text': self.instructions[a]}
                for a in range(entry, entry+size, 4)]

    def dispatch(self):
        names = [(n, a) for n, a in self.symbols.items() if '9stringKey' in n and n.endswith(('OF', 'OFTm'))]
        assert len(names) == 1
        name, entry = names[0]
        end = min(a for a in self.code_entries if a > entry)
        words = struct.unpack('<10I', self.bytes(entry, 40))
        assert words[3] == 0x92403c09  # AND X9,X0,#0xffff
        adrp, add, adr, load, scale, branch = words[4:]
        assert adrp & 0x9f00001f == 0x9000000a
        imm = ((adrp >> 5) & 0x7ffff)*4 + ((adrp >> 29) & 3)
        imm -= (1 << 21) if imm & (1 << 20) else 0
        table = ((entry+16) & ~4095) + (imm << 12) + ((add >> 10) & 4095)
        assert add & 0xffc003ff == 0x9100014a
        assert adr & 0x9f00001f == 0x1000000b
        imm = ((adr >> 5) & 0x7ffff)*4 + ((adr >> 29) & 3)
        imm -= (1 << 21) if imm & (1 << 20) else 0
        anchor = entry+24+imm
        assert (load, scale, branch) == (0x7869794c, 0x8b0c096b, 0xd61f0160)
        data = self.bytes(table, 594)
        entries = struct.unpack('<297H', data)
        targets = [anchor + 4*v for v in entries]
        assert len(set(targets)) == 297
        assert all(entry <= t < end and t in self.instructions for t in targets)
        return {'entry': hex(entry), 'symbol_oracle': name, 'next_distinct_code_symbol': hex(end),
                'table': hex(table), 'anchor': hex(anchor), 'table_bytes': 594,
                'table_sha256': sha(data), 'case_bound_authority': 'Owned declaration plus exact pure-enum descriptor, never mask/table extent.',
                'distinct_aligned_in_interval_targets': 297, 'prefix': self.excerpt(entry, 40),
                'mapping': [{'ordinal': i, 'word': w, 'target': hex(t)}
                            for i, (w, t) in enumerate(zip(entries, targets))]}

    def text(self):
        row, = [r for r in self.sections if r[:2] == ('__TEXT', '__text')]
        return self.raw[row[4]:row[4]+row[3]]


positive = Image('libTypedPositive.dylib', 'positive-symbols.txt', 'positive-disassembly.txt',
                 'positive-fixup-bindings.txt')
controls = Image('libTypedClientControls.dylib', 'symbols.txt', 'disassembly.txt', 'fixup-bindings.txt')
p_enum = positive.enum('PrimaryO10Setting297OMn')
p_client = positive.client('0A6Client')
assert p_client['closure_type']['tokens'][2]['context_descriptor'] == p_enum['address']
p_dispatch = positive.dispatch()
c_enums = [controls.enum(owner+'O10Setting297OMn') for owner in ['Primary', 'Foreign']]
c_clients = [controls.client(s) for s in ['0aB0', '010WrongInputB0', '010WrongOwnerB0']]
assert c_clients[0]['closure_type']['tokens'][2]['context_descriptor'] == c_enums[0]['address']
assert c_clients[2]['closure_type']['tokens'][2]['context_descriptor'] == c_enums[1]['address']
assert c_enums[0]['name'] == c_enums[1]['name'] == 'Setting297'
assert c_enums[0]['address'] != c_enums[1]['address']
assert c_enums[0]['parent_address'] != c_enums[1]['parent_address']
assert c_clients[1]['closure_type']['tokens'][2]['loaded_identity'][1].endswith('/_$ss6UInt16VMn')
c_dispatch = controls.dispatch()
assert p_dispatch['table_sha256'] == c_dispatch['table_sha256']
boxed = Image('libTypedBoxed.dylib', 'boxed-symbols.txt', 'boxed-disassembly.txt',
              'boxed-fixup-bindings.txt')
b_enum = boxed.enum('PrimaryO10Setting297OMn')
b_client = boxed.client('0A6Client')
assert b_client['closure_type']['tokens'][2]['context_descriptor'] == b_enum['address']
b_dispatch = boxed.dispatch()
assert b_dispatch['table_sha256'] == p_dispatch['table_sha256']
b_ctor_name, b_ctor = boxed.symbol('0A6ClientV8receiver4saltAcA8ReceiverC_s5UInt8VtcfCTf4nnd_n')
b_thunk_name, b_thunk = boxed.symbol('0A6ClientV8receiver4saltAcA8ReceiverC_s5UInt8VtcfcSbAA7PrimaryO10Setting297OcfU_TA')
b_reader_name, b_reader = next((n, a) for n, a in boxed.symbols.items()
                               if '11boxedReader' in n and n.endswith('tF'))
assert boxed.instructions[b_ctor+44] == 'str\tx20, [x0, #0x10]'
assert boxed.instructions[b_ctor+48] == 'strb\tw19, [x0, #0x18]'
assert boxed.instructions[b_thunk] == 'ldr\tx1, [x20, #0x10]'
assert boxed.instructions[b_thunk+4] == 'ldrb\tw2, [x20, #0x18]'
assert boxed.instructions[b_reader+20] == 'mov\tx20, x1'
assert 'bl\t' in boxed.instructions[b_reader+24]

paths = []
for label, image, prefix in [('positive', positive, '0A6Client'), ('merged_controls', controls, '0aB0')]:
    ctor_name, ctor = image.symbol(prefix+'V8receiverAcA8ReceiverC_tcfCTf4nd_n')
    thunk_name, thunk = image.symbol(prefix+'V8receiverAcA8ReceiverC_tcfcSbAA7PrimaryO10Setting297OcfU_TA')
    reader_name, reader = next((n, a) for n, a in image.symbols.items()
                               if '11typedReader' in n and n.endswith(('tF', 'tFTm')))
    witness = int((p_client if label == 'positive' else c_clients[0])['factory_witness']['make_implementation'], 16)
    paths.append({'lane': label, 'constructor': {'address': hex(ctor), 'symbol': ctor_name,
                       'instructions': image.excerpt(ctor, 16)},
                  'thick_adapter': {'address': hex(thunk), 'symbol': thunk_name,
                       'instructions': image.excerpt(thunk, 8 if label == 'positive' else 4)},
                  'reader': {'address': hex(reader), 'symbol': reader_name,
                       'prefix': image.excerpt(reader, 20)},
                  'factory_witness': {'address': hex(witness),
                       'instructions': image.excerpt(witness, 36)}})
assert positive.instructions[int(paths[0]['thick_adapter']['address'], 16)] == 'mov\tx1, x20'
assert positive.instructions[int(paths[0]['reader']['address'], 16)+12] == 'mov\tx20, x1'
assert 'bl\t' in positive.instructions[int(paths[0]['reader']['address'], 16)+16]
raw_thunk_name, raw_thunk = controls.symbol('010WrongInputB0V8receiverAcA8ReceiverC_tcfcSbs6UInt16VcfU_TA')
assert controls.instructions[raw_thunk+8] == 'mov\tx1, x20'
assert 'bl\t' in controls.instructions[raw_thunk+12]
assert controls.symbol('010WrongOwnerB0V8receiverAcA8ReceiverC_tcfcSbAA7ForeignO10Setting297OcfU_TA')[1] == int(paths[1]['thick_adapter']['address'], 16)

stripped = []
for image, binary, symbol_file in [(positive, 'libTypedPositive-stripped.dylib', 'positive-stripped-symbols.txt'),
                                    (controls, 'libTypedClientControls-stripped.dylib', 'stripped-symbols.txt')]:
    other = Image(binary, symbol_file)
    assert image.text() == other.text()
    assert not any('9stringKey' in n or '11typedReader' in n for n in other.symbols)
    stripped.append({'name': binary, 'sha256': sha(other.raw), 'bytes': len(other.raw),
                     'text_bytes_unchanged': True, 'text_sha256': sha(other.text()),
                     'private_dispatch_and_reader_names_absent': True})

report = {'status': 'passed', 'authority': 'Owned source, compiler output and static binary oracle only; no REA+ producer recovery is claimed.',
          'fixture_executed': False, 'provider_launched': False,
          'compiler': (OUT/'compiler-version.txt').read_text().strip(),
          'positive': {'binary': positive.name, 'sha256': sha(positive.raw), 'bytes': len(positive.raw),
                       'enum': p_enum, 'client': p_client, 'dispatch': p_dispatch},
          'controls': {'binary': controls.name, 'sha256': sha(controls.raw), 'bytes': len(controls.raw),
                       'enums': c_enums, 'clients': c_clients, 'shared_dispatch': c_dispatch,
                       'wrong_input_adapter': {'symbol': raw_thunk_name, 'address': hex(raw_thunk),
                                               'instructions': controls.excerpt(raw_thunk, 28)},
                       'same_name_different_nominal_owners': True,
                       'positive_and_foreign_thick_adapter_addresses_equal': True,
                       'raw_input_reaches_same_reader_and_dispatch': True},
          'boxed_positive': {'binary': boxed.name, 'sha256': sha(boxed.raw),
                  'bytes': len(boxed.raw), 'enum': b_enum, 'client': b_client,
                  'dispatch': b_dispatch,
                  'constructor': {'address': hex(b_ctor), 'symbol': b_ctor_name,
                                  'instructions': boxed.excerpt(b_ctor, 72)},
                  'thick_adapter': {'address': hex(b_thunk), 'symbol': b_thunk_name,
                                    'instructions': boxed.excerpt(b_thunk, 12)},
                  'reader': {'address': hex(b_reader), 'symbol': b_reader_name,
                             'prefix': boxed.excerpt(b_reader, 28)},
                  'input_x0_unchanged_through_adapter_and_reader_to_dispatch': True,
                  'context_receiver_store_and_load_offset': '0x10'},
          'selected_constructor_adapter_paths': paths, 'stripped_variants': stripped,
          'remaining_holes': ['No public REA+ analysis has run on these fixtures; expected positive/rejection outcomes remain to be qualified.',
                              'The compiler merged all three source readers/switches in the controls. Only a selected valid typed closure path can justify297; the shared helper also has unchecked UInt16 callers.',
                              'FactoryKey requirement flags alone do not encode its full make signature. The owned source/compiler-symbol oracle supplies that fixture signature; Arc needs its exact independently justified ABI/typed construction chain.',
                              'Direct-context and boxed-context positives have separate checked physical paths; more complex/generic capture layouts remain outside these controls.',
                              'No runtime witness instantiation, receiver, closure invocation or output is observed.']}
(OUT/'fixture-observation.json').write_text(json.dumps(report, indent=2)+'\n')
print(json.dumps({'status': 'passed', 'positive_dispatch': p_dispatch['entry'],
                  'controls_dispatch': c_dispatch['entry'], 'cases': 297,
                  'identical_tables': True, 'private_names_stripped': True,
                  'positive_sha256': sha(positive.raw), 'controls_sha256': sha(controls.raw)}))
