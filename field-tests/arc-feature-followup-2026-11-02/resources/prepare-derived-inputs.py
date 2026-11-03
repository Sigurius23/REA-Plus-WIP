"""Supplemental inert extraction; never treated as REA+ HTML recovery."""
import hashlib
import json
from html.parser import HTMLParser
from pathlib import Path

root = Path(__file__).resolve().parent
prior = root.parents[1] / 'arc-retest-2026-11-02' / 'resources'
destination = root / 'extracted-inline-inputs'
destination.mkdir(exist_ok=True)
sources = [
    prior / 'selection-boundaries/selected-14552-decoded.evidence.json',
    prior / 'selection-boundaries/selected-14565-decoded.evidence.json',
    root / 'selected-14566.evidence.json',
]
rows = []

for source in sources:
    evidence = json.loads(source.read_text())
    result = evidence['normalized_result']
    resource = result['resource']
    raw = bytes.fromhex(resource['bytes_hex'])
    assert hashlib.sha256(raw).hexdigest() == resource['sha256']
    text = raw.decode('utf-8')
    assert text.encode('utf-8') == raw
    lines = text.splitlines(keepends=True)
    starts = [0]
    for line in lines:
        starts.append(starts[-1] + len(line))

    class Scripts(HTMLParser):
        pending = None
        ordinal = 0

        def source_offset(self):
            line, col = self.getpos()
            return starts[line - 1] + col

        def handle_starttag(self, tag, attrs):
            if tag != 'script':
                return
            attributes = dict(attrs)
            if attributes.get('src'):
                return
            kind = (attributes.get('type') or '').lower().strip()
            if kind not in ['', 'module', 'text/javascript', 'application/javascript']:
                return
            self.pending = (self.source_offset() + len(self.get_starttag_text()), attributes)

        def handle_endtag(self, tag):
            if tag != 'script' or self.pending is None:
                return
            begin, attrs = self.pending
            end = self.source_offset()
            body = text[begin:end].encode('utf-8')
            begin_byte = len(text[:begin].encode('utf-8'))
            end_byte = len(text[:end].encode('utf-8'))
            assert raw[begin_byte:end_byte] == body
            self.ordinal += 1
            name = f"resource-{resource['entry']['resource_id']}-inline-{self.ordinal}.mjs"
            output = destination / name
            output.write_bytes(body)
            rows.append({
                'source_evidence_file': str(source),
                'source_evidence_id': evidence['evidence_id'],
                'source_pack': result['artifact'],
                'entry': resource['entry'],
                'decoded_resource_sha256': resource['sha256'],
                'decoded_resource_bytes': resource['bytes'],
                'script_attributes': attrs,
                'decoded_resource_byte_range': {'start': begin_byte, 'end_exclusive': end_byte},
                'decoded_resource_character_range': {'start': begin, 'end_exclusive': end},
                'materialized_file': str(output.relative_to(root)),
                'script_bytes': len(body),
                'script_sha256': hashlib.sha256(body).hexdigest(),
                'scope': 'Supplemental HTMLParser extraction of exact inline body; analyst-chosen .mjs filename; not original filename or REA+ HTML recovery.',
            })
            self.pending = None

    parser = Scripts(convert_charrefs=False)
    parser.feed(text)
    parser.close()

(root / 'inline-extraction-provenance.json').write_text(json.dumps(rows, indent=2) + '\n')
fixture = root / 'owned-inline-reproduction'
for name in ['html', 'plain-js']:
    (fixture / name).mkdir(parents=True, exist_ok=True)
script = 'function report() { return fetch("/owned-inline-only"); }\nreport();\n'
(fixture / 'html/index.html').write_text('<!doctype html>\n<script type="module">\n' + script + '</script>\n')
(fixture / 'plain-js/app.js').write_text(script)
steps = [
    {'name': 'analyze_javascript_application', 'arguments': {'input_path': str(fixture / 'html')}, 'label': 'owned-html', 'expect_success': True},
    {'name': 'analyze_javascript_application', 'arguments': {'input_path': str(fixture / 'plain-js')}, 'label': 'owned-plain-js', 'expect_success': True},
    {'name': 'analyze_javascript_application', 'arguments': {'input_path': str(destination), 'detail': 'summary'}, 'label': 'extracted-inline-summary', 'expect_success': True},
    {'name': 'get_evidence_bundle', 'arguments': {'detail': 'summary'}, 'label': 'second-ledger-summary'},
    {'name': 'export_evidence_bundle', 'arguments': {'path': str(root / 'second-evidence-bundle.json')}, 'label': 'second-export'},
]
(root / 'continuation-1.json').write_text(json.dumps({'steps': steps}, indent=2) + '\n')
print(json.dumps({'extracted_scripts': len(rows), 'bytes': sum(r['script_bytes'] for r in rows)}))
