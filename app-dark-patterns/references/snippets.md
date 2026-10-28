# Portable snippet tools

Use `scripts/render_snippets.py` to render an authored JSON specification into a **new output directory**, then inspect actual images. It creates compact and reference galleries, code, dark/transparent PNGs, editable SVG text, included fonts/license, source index, explanations, handoff, verification and a ZIP. The tool does not invent findings, simplify code, infer backend behavior or prove semantic equivalence. Do that investigative/editorial work first.

Use available Python with Pillow and Pygments. If dependencies are missing, install `scripts/requirements.txt` into a task-local virtual environment. There are no hardcoded workspace/runtime paths in these tools.

```sh
python /path/to/app-dark-patterns/scripts/render_snippets.py spec.json --output /absolute/path/to/new-library
python /path/to/app-dark-patterns/scripts/verify_bundle.py /absolute/path/to/new-library
```

Repackage after adding a separately authored report/data handoff with `verify_bundle.py ... --package`. Choose a new output folder to preserve earlier artifacts. A ZIP sits beside the output folder. A separate bundle receipt verifies its CRC and every entry's hash.

## Specification

Top level: `title` and `assets` array. Each asset has:

| Field | Meaning |
|---|---|
| `id` | Unique lowercase letters/digits/hyphens |
| `filename`, `language` | Display filename/source language; Pygments names such as javascript, c, cpp, csharp, java, json, python, xml or text |
| `kind` | exact-source, decompiled-source, analyst-reconstruction, data-projection or finding-overlay |
| `code` | Complete editable code/data text, or plain finding text |
| `role` | video (default) or reference |
| `description` | Explanation outside the image |
| `simplifications` | Required nonempty transformation notes for reconstructions/projections; describe renamed helpers and omitted meaningful context |
| `accuracy_notes` | Evidence status, scope, gates, unknowns; required for reference fragments |
| `sources` | One or more source/data bindings below |

A source binding has `file` (absolute or relative to spec), original `sha256`, optional inclusive `start_line`/`end_line`, `transformation`, and `distribute` (default false). Compute SHA-256 from original bytes before editing. Only set `distribute: true` for source material verified appropriate to include. Raw RPC/account captures can remain local-only; include separately sanitized data as a separately classified source when useful. Local-only paths/hashes are retained in provenance, not the raw file.

For exact/decompiled assets, every non-separator line must match its bound source excerpt(s) after LF normalization. Added filename comments/blank separators are allowed. Reformatted code should be classified/documented as a reconstruction rather than mislabeled byte-exact. Data selections/renamed grouping keys are projections, not original server response formatting.

Author short video blocks manually to fit **59 monospace columns and 27 displayed lines** including the filename comment. Preserve key original names where readable. The renderer rejects dangling closures and overlong video blocks; split into meaningful closed helpers or use longer context in the reference role. Do not add an invented closing brace to an allegedly exact source excerpt.

The checker ignores brackets inside lexed strings/comments, parses JSON documents/montages and Python, and uses Node's syntax-only check for JavaScript if available. It does not compile C++/Java/C# app fragments or prove their meaning. Language/lexer limitations can require proper reformatting or a documented reconstruction; inspect the output rather than disabling the video completion requirement. Reference fragments can remain incomplete when their notes say so, and are shown whole in the separate reference gallery.

The default gallery renders full image height with no cropped preview/CSS height cap. There are no row highlights, title cards, line numbers or editorial captions inside code images. Keep findings explanations and evidence labels in metadata, descriptions and the handoff. SVG text references the included font relatively; PNGs are the pixel reference.

## Host the presentation

Serve the exported library directory on loopback in a persistent terminal/session. Reuse a running server when its served folder matches this gallery; otherwise let the OS choose an available port:

```sh
python -u -m http.server 0 --bind 127.0.0.1 --directory /absolute/path/to/new-library
```

Read the actual port from startup output, verify `http://127.0.0.1:PORT/index.html` and its source-gallery link in a browser, then open the finished presentation for the user. Serve the export directory rather than the whole workspace. Record the URL, served folder and process/session in the handoff; include the working URL in the final response. Leave the presentation server running so the user can browse after delivery. Preserve an existing user-facing gallery; close temporary test tabs and stop only temporary test servers.

For longer investigations, keep the full findings ledger and research provenance alongside this export. Renderer validation only establishes artifact integrity/formatting; it does not certify a dark-pattern claim, actual runtime activation, nondisclosure or the correctness of a simplified algorithm.
