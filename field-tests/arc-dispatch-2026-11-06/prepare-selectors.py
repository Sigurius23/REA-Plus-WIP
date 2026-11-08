import argparse
import bisect
import json
import struct
from pathlib import Path

root = Path(__file__).resolve().parent
parser = argparse.ArgumentParser()
parser.add_argument('--scan', default='native/selector-add-patterns.evidence.json')
parser.add_argument('--targets', default='selector-pattern-input.json')
parser.add_argument('--output', default='selector-preparation.json')
args = parser.parse_args()
scope = json.loads((root / 'scope.json').read_text())
data = Path(scope['target']).read_bytes()
scan = json.loads((root / args.scan).read_text())
targets = json.loads((root / args.targets).read_text())['targets']
segments = []
starts_record = None
position = 32
for _ in range(struct.unpack_from('<I', data, 16)[0]):
    command, size = struct.unpack_from('<II', data, position)
    if command == 0x19:
        vmaddr, vmsize, offset, filesize = struct.unpack_from('<QQQQ', data, position + 24)
        segments.append((vmaddr, vmsize, offset, filesize))
    if command == 0x26:
        offset, length = struct.unpack_from('<II', data, position + 8)
        starts_record = {'command_offset': position, 'offset': offset, 'length': length}
    position += size
assert starts_record
starts = []
address = 0x100000000
value = shift = 0
for byte in data[starts_record['offset']:starts_record['offset'] + starts_record['length']]:
    value |= (byte & 127) << shift
    if byte & 128:
        shift += 7
        continue
    if value == 0:
        break
    address += value
    starts.append(address)
    value = shift = 0
for vmaddr, vmsize, offset, filesize in segments:
    if offset <= starts_record['offset'] < offset + filesize:
        starts_record['loaded_address'] = hex(vmaddr + starts_record['offset'] - offset)

candidates = []
counts = []
for result in scan['normalized_result']['results']:
    counts.append({'name': result['name'], 'total': result['total_matches'], 'returned': len(result['matches']), 'counting_complete': result['complete']})
    target = int(targets[result['name'].rsplit('-rn-', 1)[0]], 16)
    for match in result['matches']:
        pc, offset = int(match['address'], 16), match['file_offset']
        if pc % 4:
            continue
        add = struct.unpack_from('<I', data, offset)[0]
        register = (add >> 5) & 31
        for distance in range(4, 65, 4):
            adrp = struct.unpack_from('<I', data, offset - distance)[0]
            if adrp & 0x9f000000 != 0x90000000 or adrp & 31 != register:
                continue
            immediate = (((adrp >> 5) & 0x7ffff) << 2) | ((adrp >> 29) & 3)
            if immediate & (1 << 20):
                immediate -= 1 << 21
            actual = ((pc - distance) & ~4095) + (immediate << 12) + ((add >> 10) & 4095)
            if actual == target:
                index = bisect.bisect_right(starts, pc) - 1
                candidates.append({'name': result['name'], 'target': hex(target), 'adrp': hex(pc - distance), 'add': hex(pc), 'distance': distance, 'register': register, 'function_start': hex(starts[index]), 'next_start': hex(starts[index + 1]), 'source_evidence_id': scan['evidence_id']})
            break
receipt = {'authority': 'Supplemental immutable Mach-O LC_FUNCTION_STARTS and ARM64 candidate preparation; validate using public bytes and function assembly. Not automatic REA+ references or discovered functions.', 'function_starts': starts_record, 'header_bytes': position, 'indexed_starts': len(starts), 'counts': counts, 'candidates': candidates}
(root / args.output).write_text(json.dumps(receipt, indent=2) + '\n')
print(json.dumps(receipt, indent=2))
