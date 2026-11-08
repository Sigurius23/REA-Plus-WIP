import argparse
import json
import struct
from pathlib import Path

root = Path(__file__).resolve().parent
parser = argparse.ArgumentParser()
parser.add_argument('--protocol', action='append')
parser.add_argument('--output', default='conformance-selector-preparation.json')
args = parser.parse_args()
scope = json.loads((root / 'scope.json').read_text())
data = Path(scope['target']).read_bytes()
scan = json.loads((root / 'native/selector-add-patterns.evidence.json').read_text())
sections = scan['normalized_result']['file']['sections']
name_scan = json.loads((root / 'seeded/dispatch-type-name-bytes.evidence.json').read_text())
name = int(name_scan['normalized_result']['results'][0]['matches'][0]['address'], 16)

def offset(address):
    for section in sections:
        start = int(section['address'], 16)
        if start <= address < start + section['size']:
            return section['file_offset'] + address - start
    raise ValueError(hex(address))


def word(address):
    return struct.unpack_from('<i', data, offset(address))[0]


def pointer(address):
    raw = struct.unpack_from('<Q', data, offset(address))[0]
    if raw & (1 << 63):
        return None
    # This exact input advertises DYLD_CHAINED_PTR_64_OFFSET in public metadata.
    return 0x100000000 + (raw & ((1 << 36) - 1))

protocols = []
for section in sections:
    if section['name'] not in ['__TEXT,__const', '__TEXT,__constg_swiftt']:
        continue
    base = int(section['address'], 16)
    for index in range(0, section['size'] - 12, 4):
        field = base + index + 8
        if field + word(field) == name:
            descriptor = field - 8
            flags = struct.unpack_from('<I', data, offset(descriptor))[0]
            if flags & 31 == 3:
                protocols.append({'descriptor': hex(descriptor), 'flags': hex(flags), 'name_field': hex(field), 'name_address': hex(name)})
if args.protocol:
    protocols = [{'descriptor': address, 'authority': 'caller selected protocol descriptor candidate'} for address in args.protocol]
protocol_addresses = {int(p['descriptor'], 16) for p in protocols}
section = next(s for s in sections if s['name'] == '__TEXT,__swift5_proto')
base = int(section['address'], 16)
candidates = []
for index in range(section['size'] // 4):
    field = base + index * 4
    descriptor = field + word(field)
    rel = word(descriptor)
    target = descriptor + (rel & ~1)
    slot = target if rel & 1 else None
    protocol = pointer(target) if slot else target
    if protocol in protocol_addresses:
        candidates.append({'index': index, 'conformance_descriptor': hex(descriptor), 'protocol_descriptor': hex(protocol), 'indirect_slot': hex(slot) if slot else None, 'index_field': hex(field)})
receipt = {'authority': 'Supplemental candidate preparation from the immutable input and the declared chained-pointer format. Only public selected-conformance metadata and read_bytes validate the type, protocol and code; these are not automatic REA+ discoveries.', 'name_scan_evidence_id': name_scan['evidence_id'], 'protocols': protocols, 'index_address': hex(base), 'index_bytes': section['size'], 'indexed_conformances_examined': section['size'] // 4, 'candidates': candidates}
(root / args.output).write_text(json.dumps(receipt, indent=2) + '\n')
print(json.dumps(receipt, indent=2))
