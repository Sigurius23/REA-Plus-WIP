#!/usr/bin/env python3
"""Verify exported sources, full-frame images, links and optional ZIP integrity."""
from pathlib import Path
import argparse
import hashlib
import json
import re
import sys
import xml.etree.ElementTree as ET
import zipfile
from PIL import Image


def sha(raw): return hashlib.sha256(raw).hexdigest()


def save(path, data): path.write_text(json.dumps(data, indent=2, ensure_ascii=False) + '\n')


def verify(out, package=False):
    checks = []
    def need(value, label):
        if not value: raise ValueError(label)
        checks.append(label)
    manifest = json.loads((out / 'manifest.json').read_text())
    for a in manifest['assets']:
        code = (out / a['code_file']).read_text()
        need(sha(code.encode()) == a['code_sha256'], a['id'] + ': code SHA256')
        display = (a['display_prefix'] + code).rstrip('\n')
        need(sha(display.encode()) == a['syntax_text_sha256'], a['id'] + ': displayed text SHA256')
        rebuilt = []
        for i in range(1, len(display.split('\n')) + 1):
            rebuilt.append(''.join(r['text'] for r in a['rendered_lines'] if r['source_line'] == i))
        need('\n'.join(rebuilt) == display, a['id'] + ': all displayed code retained')
        need(a['complete_frame'] and a['highlighted_lines'] == [] and not a['line_numbers'] and a['image_titles'] == [] and not a['editorial_captions'], a['id'] + ': full frame and approved style')
        for key, mode in [('png', 'RGB'), ('transparent', 'RGBA')]:
            with Image.open(out / a[key]) as im:
                need(im.size == (a['width'], a['height']) and im.mode == mode, a['id'] + ': ' + key + ' dimensions/mode')
                if mode == 'RGBA':
                    box = im.getchannel('A').getbbox()
                    need(box is not None and box[1] > 0 and box[3] < im.height, a['id'] + ': complete glyph margins')
        for key, rect_count in [('svg', 1), ('transparent_svg', 0)]:
            tree = ET.parse(out / a[key]); ns = {'s': 'http://www.w3.org/2000/svg'}
            need(len(tree.findall('s:rect', ns)) == rect_count, a['id'] + ': no row-background rectangles')
            need([e.text or '' for e in tree.findall('s:text', ns)] == [r['text'] for line in a['rendered_lines'] for r in line['runs']], a['id'] + ': SVG editable text')
    for source in json.loads((out / 'source-index.json').read_text()):
        if source['included_path']:
            need(sha((out / source['included_path']).read_bytes()) == source['sha256'], 'Included source SHA256: ' + source['included_path'])
        else: need(not source['distribute'], 'Local-only source inclusion declaration')
    for filename in ['index.html', 'source-gallery.html']:
        html = (out / filename).read_text()
        css = '\n'.join(re.findall(r'<style\b[^>]*>(.*?)</style>', html, flags=re.S | re.I))
        need(not re.search(r'max-height\s*:', css, flags=re.I) and not re.search(r'object-fit\s*:\s*cover', css, flags=re.I), filename + ': full-height previews')
        for ref in re.findall(r'(?:href|src)="([^"]+)"', html):
            if ref.startswith(('http:', 'https:', '#', 'data:')): continue
            need((out / ref.split('#', 1)[0]).is_file(), filename + ': ' + ref)
    save(out / 'VERIFICATION.json', {'all_checks_passed': True, 'checks_passed': len(checks), 'checks': checks,
                                    'scope': 'File fidelity, complete-frame render metadata, margins, SVG text, sources and gallery links; not proof of claim truth or behavioral equivalence.'})
    if package:
        files = sorted(p for p in out.rglob('*') if p.is_file() and p.name not in ['bundle-manifest.json', '.DS_Store'] and '__pycache__' not in p.parts)
        rows = [{'path': p.relative_to(out).as_posix(), 'sha256': sha(p.read_bytes()), 'bytes': p.stat().st_size} for p in files]
        save(out / 'bundle-manifest.json', {'self_excluded': True, 'files': rows})
        archive = out.with_suffix('.zip')
        with zipfile.ZipFile(archive, 'w', compression=zipfile.ZIP_DEFLATED) as z:
            for p in files + [out / 'bundle-manifest.json']: z.write(p, out.name + '/' + p.relative_to(out).as_posix())
        with zipfile.ZipFile(archive) as z:
            need(z.testzip() is None, 'ZIP CRC')
            for row in rows: need(sha(z.read(out.name + '/' + row['path'])) == row['sha256'], 'ZIP SHA256: ' + row['path'])
        save(out.with_name(out.name + '-bundle-verification.json'), {'zip': str(archive), 'sha256': sha(archive.read_bytes()), 'crc_verified': True, 'all_entry_hashes_verified': True, 'files': len(rows) + 1})
    print(json.dumps({'all_checks_passed': True, 'checks_passed': len(checks), 'assets': len(manifest['assets'])}))


def main():
    p = argparse.ArgumentParser(description=__doc__); p.add_argument('output', type=Path); p.add_argument('--package', action='store_true')
    a = p.parse_args()
    try: verify(a.output.resolve(), a.package)
    except (ValueError, KeyError, OSError, ET.ParseError) as exc: print('Error: ' + str(exc), file=sys.stderr); return 1
    return 0


if __name__ == '__main__': sys.exit(main())
