#!/usr/bin/env python3
"""Render source-bound, complete video snippets. No app or network operations."""
from pathlib import Path
import argparse
import ast
import hashlib
import html
import json
import os
import re
import shutil
import subprocess
import sys

from PIL import Image, ImageDraw, ImageFont
from pygments import lex
from pygments.lexers import get_lexer_by_name
from pygments.token import Comment, Keyword, Literal, Name

WIDTH, PAD, SIZE, LEADING = 2160, 104, 54, 81
BG, FG = '#191f1c', '#d7dbd8'
PALETTE = {'comment': '#879b8e', 'keyword': '#c792ea', 'type': '#82aaff', 'string': '#c3e88d', 'number': '#f5bd77'}
KINDS = {'exact-source', 'decompiled-source', 'analyst-reconstruction', 'data-projection', 'finding-overlay'}
SKILL = Path(__file__).resolve().parents[1]


def digest(data): return hashlib.sha256(data).hexdigest()


def save_json(path, value):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(value, indent=2, ensure_ascii=False) + '\n')


def color(token):
    for parent, key in [(Comment, 'comment'), (Literal.String, 'string'), (Literal.Number, 'number'),
                        (Keyword.Type, 'type'), (Name.Tag, 'type'), (Keyword, 'keyword')]:
        if token in parent: return PALETTE[key]
    return FG


def tokens(text, language):
    return list(lex(text, get_lexer_by_name(language, stripnl=False, ensurenl=False)))


def check_closed(code, language):
    """Lexical guard, not a guarantee of compilability/behavioral equivalence."""
    if language in ('text', 'plaintext'): return
    stack, pairs = [], {')': '(', ']': '[', '}': '{'}
    for token, value in tokens(code, language):
        if token in Comment or token in Literal.String: continue
        for char in value:
            if char in '([{': stack.append(char)
            elif char in ')]}':
                if not stack or stack.pop() != pairs[char]: raise ValueError('Unclosed or mismatched code scope')
    if stack: raise ValueError('Unclosed code scope: include the closing braces or use a documented reconstruction')
    if language in ('json', 'jsonc'):
        # Filename-comment montages can contain several complete documents.
        clean = re.sub(r'^\s*//[^\n]*\n?', '', code, flags=re.M).strip()
        decoder = json.JSONDecoder()
        while clean:
            _, end = decoder.raw_decode(clean)
            clean = clean[end:].strip()
    elif language in ('python', 'py'):
        ast.parse(code)
    elif language in ('javascript', 'js') and shutil.which('node'):
        # --check parses stdin only; it does not execute the supplied code.
        p = subprocess.run([shutil.which('node'), '--check', '--input-type=module'], input=code, text=True, capture_output=True)
        if p.returncode: raise ValueError('JavaScript syntax check failed; use a complete block: ' + p.stderr.splitlines()[0])


def prepare(spec, root):
    assets, identities = [], set()
    for item in spec.get('assets', []):
        a = dict(item)
        if not re.fullmatch(r'[a-z0-9][a-z0-9-]*', a.get('id', '')) or a['id'] in identities:
            raise ValueError('Each asset needs a unique lowercase-hyphen id')
        identities.add(a['id'])
        if a.get('kind') not in KINDS: raise ValueError('Specify a supported source kind')
        if not isinstance(a.get('code'), str) or not a['code'].strip(): raise ValueError('Asset code/text is required')
        a.setdefault('role', 'video'); a.setdefault('language', 'text' if a['kind'] == 'finding-overlay' else 'javascript')
        a.setdefault('filename', a['id'] + '.txt'); a.setdefault('description', '')
        a.setdefault('accuracy_notes', []); a.setdefault('simplifications', [])
        if a['role'] not in ('video', 'reference'): raise ValueError('role must be video or reference')
        if a['kind'] in ('analyst-reconstruction', 'data-projection') and not a['simplifications']:
            raise ValueError('Reconstructions/projections require simplifications notes')
        if a['role'] == 'video' and a['kind'] != 'finding-overlay': check_closed(a['code'], a['language'])
        if a['role'] == 'reference' and not a['accuracy_notes']:
            raise ValueError('Reference excerpts require accuracy_notes explaining scope')
        refs, excerpts = [], []
        for src in a.get('sources', []):
            path = (root / src['file']).resolve()
            raw = path.read_bytes(); sha = digest(raw)
            if sha != src.get('sha256'): raise ValueError('Source SHA256 mismatch: ' + path.name)
            text = raw.decode('utf-8').replace('\r\n', '\n').replace('\r', '\n')
            lines = text.splitlines(keepends=True)
            start, end = src.get('start_line', 1), src.get('end_line', len(lines))
            if not (1 <= start <= end <= len(lines)): raise ValueError('Invalid source line bounds: ' + path.name)
            excerpt = ''.join(lines[start - 1:end]); excerpts.append(excerpt)
            refs.append({'original_path': str(path), 'sha256': sha, 'bytes': len(raw), 'start_line': start,
                         'end_line': end, 'excerpt_sha256': digest(excerpt.encode()),
                         'distribute': src.get('distribute', False), 'included_path': None,
                         'transformation': src.get('transformation', 'LF normalization for text comparison only')})
        if not refs: raise ValueError('Every asset needs at least one hashed source or data reference')
        if a['kind'] in ('exact-source', 'decompiled-source'):
            remainder = a['code'].replace('\r\n', '\n')
            for excerpt in excerpts:
                value = excerpt.rstrip('\n')
                if value not in remainder: raise ValueError('Exact source excerpt changed: ' + a['id'])
                remainder = remainder.replace(value, '', 1)
            # Added source-filename separators and blank lines are permitted.
            remainder = re.sub(r'^\s*//[^\n]*', '', remainder, flags=re.M)
            if remainder.strip(): raise ValueError('Exact asset contains text outside its source excerpts: ' + a['id'])
        a['source_refs'] = refs
        assets.append(a)
    if not assets: raise ValueError('spec.assets must contain at least one asset')
    return assets


def display_lines(code, filename, language, role, font):
    prefix = '' if code.startswith('// ') or language in ('text', 'plaintext') else '// ' + filename + '\n\n'
    text = (prefix + code).rstrip('\n')
    chunks = tokens(text, language)
    if ''.join(value for token, value in chunks) != text: raise ValueError('Lexer changed source characters')
    colors = [color(token) for token, value in chunks for _ in value]
    maximum = int((WIDTH - PAD * 2) / font.getlength('M'))
    lines, offset = [], 0
    for number, line in enumerate(text.split('\n'), 1):
        cc = colors[offset:offset + len(line)]; offset += len(line) + 1
        if len(line) > maximum and role == 'video':
            raise ValueError(f'Video line {number} exceeds {maximum} columns; reformat into complete short blocks')
        for begin in range(0, max(1, len(line)), maximum):
            piece = line[begin:begin + maximum]
            lines.append({'text': piece, 'colors': cc[begin:begin + maximum], 'source_line': number, 'source_start': begin})
    if role == 'video' and len(lines) > 27:
        raise ValueError('Video snippet exceeds 27 lines; create shorter complete helpers and retain longer context in reference view')
    return prefix, text, lines


def svg(lines, height, background, font_relative, ascent):
    result = [f'<svg xmlns="http://www.w3.org/2000/svg" width="{WIDTH}" height="{height}" viewBox="0 0 {WIDTH} {height}">',
              '<style>@font-face{font-family:CodeMono;src:url(' + font_relative + ')}text{font-family:CodeMono,DejaVu Sans Mono,monospace;font-size:54px;font-variant-ligatures:none;white-space:pre}</style>']
    if background: result.append(f'<rect width="100%" height="100%" fill="{BG}"/>')
    for line in lines:
        for run in line['runs']:
            result.append(f'<text x="{run["x"]:.3f}" y="{line["y"] + ascent}" fill="{run["color"]}" xml:space="preserve">{html.escape(run["text"])}</text>')
    return '\n'.join(result) + '\n</svg>\n'


def render(spec, root, out):
    assets = prepare(spec, root)
    font_src = SKILL / 'assets/fonts/DejaVuSansMono.ttf'
    font = ImageFont.truetype(str(font_src), SIZE)
    # Preflight all source/closure/layout checks before creating output files.
    for a in assets:
        a['_display'] = display_lines(a['code'], a['filename'], a['language'], a['role'], font)
    if out.exists() and any(out.iterdir()): raise ValueError('Output must be a new/empty directory; preserve previous artifacts')
    (out / 'fonts').mkdir(parents=True, exist_ok=True); (out / 'sources').mkdir()
    shutil.copyfile(font_src, out / 'fonts/DejaVuSansMono.ttf')
    shutil.copyfile(SKILL / 'assets/fonts/LICENSE_DEJAVU.txt', out / 'fonts/LICENSE_DEJAVU.txt')
    source_index = []
    for index, a in enumerate(assets, 1):
        prefix, display, rows = a.pop('_display')
        scope = 'reference' if a['role'] == 'reference' else 'video'
        stem = f'{index:02d}-{a["id"]}'
        suffix = Path(a['filename']).suffix or '.txt'
        for folder in ['code', 'png', 'transparent', 'svg', 'descriptions']: (out / scope / folder).mkdir(parents=True, exist_ok=True)
        a['code_file'] = f'{scope}/code/{stem}{suffix}'
        (out / a['code_file']).write_text(a['code'])
        a['code_sha256'] = digest(a['code'].encode()); a['syntax_text_sha256'] = digest(display.encode())
        a['display_prefix'] = prefix
        for ref in a['source_refs']:
            if ref['distribute']:
                dest = Path('sources') / ref['sha256'][:16] / Path(ref['original_path']).name
                (out / dest).parent.mkdir(parents=True, exist_ok=True)
                shutil.copyfile(ref['original_path'], out / dest)
                ref['included_path'] = dest.as_posix()
            if ref not in source_index: source_index.append(ref)
        height = PAD * 2 + LEADING * len(rows)
        images = [Image.new('RGB', (WIDTH, height), BG), Image.new('RGBA', (WIDTH, height), (0, 0, 0, 0))]
        draws = [ImageDraw.Draw(im) for im in images]
        positions = []
        for i, row in enumerate(rows):
            y, runs, start = PAD + i * LEADING, [], 0
            while start < len(row['text']):
                end = start + 1
                while end < len(row['text']) and row['colors'][end] == row['colors'][start]: end += 1
                run = {'text': row['text'][start:end], 'x': PAD + font.getlength(row['text'][:start]), 'color': row['colors'][start]}
                runs.append(run); start = end
                for draw in draws: draw.text((run['x'], y), run['text'], fill=run['color'], font=font, anchor='la')
            positions.append({k: v for k, v in row.items() if k != 'colors'} | {'y': y, 'runs': runs})
        a['png'], a['transparent'] = f'{scope}/png/{stem}.png', f'{scope}/transparent/{stem}.png'
        images[0].save(out / a['png'], optimize=True); images[1].save(out / a['transparent'], optimize=True)
        box = images[1].getchannel('A').getbbox()
        if not box or box[1] <= 0 or box[3] >= height or box[0] < PAD - 1 or box[2] > WIDTH - PAD + 1:
            raise ValueError('Rendered text exceeds image margins: ' + a['id'])
        for im in images: im.close()
        a['svg'], a['transparent_svg'] = f'{scope}/svg/{stem}.svg', f'{scope}/svg/{stem}.transparent.svg'
        font_rel = os.path.relpath(out / 'fonts/DejaVuSansMono.ttf', (out / a['svg']).parent)
        (out / a['svg']).write_text(svg(positions, height, True, font_rel, font.getmetrics()[0]))
        (out / a['transparent_svg']).write_text(svg(positions, height, False, font_rel, font.getmetrics()[0]))
        a.update(width=WIDTH, height=height, rendered_lines=positions, complete_frame=True, highlighted_lines=[],
                 line_numbers=False, image_titles=[], editorial_captions=False, ordinal=index)
        a['description_file'] = f'{scope}/descriptions/{stem}.md'
        notes = ['# ' + a['id'], '', a['description'], '', 'Source kind: ' + a['kind'], '', '## Simplifications', '']
        notes += ['- ' + str(n) for n in a['simplifications']]
        notes += ['', '## Evidence limits', ''] + ['- ' + str(n) for n in a['accuracy_notes']]
        notes += ['', '## Sources', '']
        notes += [f'- {Path(r["original_path"]).name}, lines {r["start_line"]}–{r["end_line"]}, SHA256 {r["sha256"]}; included: {r["included_path"] or "local-only"}.' for r in a['source_refs']]
        (out / a['description_file']).write_text('\n'.join(notes) + '\n')
        a.pop('code')
    save_json(out / 'manifest.json', {'schema_version': 1, 'title': spec.get('title', 'App code library'), 'assets': assets,
                                    'rendering': {'width': WIDTH, 'font_size': SIZE, 'line_height': LEADING, 'background': BG}})
    save_json(out / 'source-index.json', source_index)
    save_json(out / 'asset-descriptions.json', [{k: a[k] for k in ['id', 'kind', 'description', 'simplifications', 'accuracy_notes', 'description_file', 'source_refs']} for a in assets])
    gallery(out, spec.get('title', 'App code library'), [a for a in assets if a['role'] == 'video'], 'index.html', 'source-gallery.html', 'Longer source references')
    gallery(out, 'Source references', [a for a in assets if a['role'] == 'reference'], 'source-gallery.html', 'index.html', 'Compact video snippets')
    handoff = ['# Editing handoff', '', 'Complete-frame code/data assets. Use PNGs as pixel references; fonts are included for editable SVG text. Explanations and source classifications stay outside images. Read each asset note before using simplified code. Local-only source references are intentionally not bundled.', '', '| Asset | Kind | Explanation |', '|---|---|---|']
    handoff += [f'| [{a["id"]}]({a["png"]}) | {a["kind"]} | [Notes]({a["description_file"]}) |' for a in assets]
    (out / 'EDITOR-HANDOFF.md').write_text('\n'.join(handoff) + '\n')
    subprocess.run([sys.executable, str(SKILL / 'scripts/verify_bundle.py'), str(out), '--package'], check=True)
    print(json.dumps({'output': str(out), 'assets': len(assets), 'zip': str(out.with_suffix('.zip'))}))


def gallery(out, title, assets, filename, other, other_label):
    cards = []
    for a in assets:
        cards.append(f'<article id="{a["id"]}"><p>{html.escape(a["id"])} · {a["kind"]}</p><a href="{a["png"]}"><img loading="lazy" src="{a["png"]}" width="{a["width"]}" height="{a["height"]}" alt="{a["id"]}: complete frame"></a><nav>' +
                     ' · '.join(f'<a href="{a[k]}">{label}</a>' for k, label in [('png', 'PNG'), ('transparent', 'Transparent'), ('svg', 'SVG'), ('code_file', 'Code'), ('description_file', 'Explanation')]) +
                     '</nav><details><summary>Explanation and source limits</summary><p>' + html.escape(a['description']) + '</p><ul>' + ''.join('<li>' + html.escape(str(n)) + '</li>' for n in a['simplifications'] + a['accuracy_notes']) + '</ul></details></article>')
    page = '<!doctype html><html lang="en"><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><title>' + html.escape(title) + '</title><style>body{margin:0;background:#101512;color:#d7dbd8;font:16px/1.6 system-ui}main{max-width:1240px;margin:auto;padding:36px 24px}a{color:#a7cbb7}article{margin:40px 0}img{display:block;width:100%;height:auto}nav{margin:12px 0}details{color:#aab7af}summary{cursor:pointer}</style><main><h1>' + html.escape(title) + '</h1><p><a href="' + other + '">' + other_label + '</a> · <a href="EDITOR-HANDOFF.md">Editing handoff</a> · <a href="asset-descriptions.json">Asset descriptions</a></p>' + '\n'.join(cards) + '</main></html>'
    (out / filename).write_text(page)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('spec', type=Path); parser.add_argument('--output', required=True, type=Path)
    args = parser.parse_args()
    try: render(json.loads(args.spec.read_text()), args.spec.resolve().parent, args.output.resolve())
    except (ValueError, KeyError, OSError, SyntaxError, subprocess.CalledProcessError) as exc:
        print('Error: ' + str(exc), file=sys.stderr); return 1
    return 0


if __name__ == '__main__': sys.exit(main())
