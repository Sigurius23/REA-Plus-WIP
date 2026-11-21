"""Inventory shareable text; never stage compiled images, caches or provider projects."""
from pathlib import Path
import hashlib,json
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
paths=['ARC_HANDOFF.md','OPEN_TASKS.md','field-tests/arc-analysis-dossier-2026-11-08.md','field-tests/arc-unlisted-instructions-2026-11-21.md','rea-local/bridge/ghidra/ReaGhidraBridge.java','rea-local/docs/native-investigation.md','rea-local/package.json','rea-local/src/cli/coreNativeCommands.ts','rea-local/src/contracts/officialToolContracts.ts','rea-local/src/domain/native/nativeInstruction.ts','rea-local/src/ghidra/GhidraFunctionValues.ts','rea-local/src/ghidra/GhidraFunctionValues.test.ts','rea-local/scripts/verify/ghidra/unlisted-instructions.mjs','rea-local/tests/conformance/ghidra/unlisted-instructions.S']
files=[ROOT/p for p in paths]
fixture=json.loads((OUT/'fixture/manifest.json').read_text())
files += [OUT/'fixture'/r['path'] for r in fixture['items']]+[OUT/'fixture/manifest.json']
for p in OUT.rglob('*'):
 if not p.is_file() or p.name=='snapshot-manifest.json' or p.name.endswith('.pending.json') or '__pycache__' in p.parts or 'fixture' in p.relative_to(OUT).parts:continue
 assert not p.is_symlink(),str(p)
 if p.suffix in {'.dylib','.o','.a','.pyc'}:continue
 assert p.name=='.gitignore' or p.suffix in {'.md','.json','.py','.mjs','.tsv','.log','.txt'},str(p)
 files.append(p)
records=[]
for p in sorted(set(files)):
 b=p.read_bytes();assert b'\0' not in b,str(p);b.decode('utf8')
 records.append({'path':str(p.relative_to(ROOT)),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest()})
r={'version':1,'date':'2026-11-21','target_sha256':'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578','file_count':len(records),'text_bytes':sum(x['bytes'] for x in records),'files':records,'exclusions':['This manifest itself','Unused *.pending.json plans','Original DMG/binary slice, compiled images/objects/modules, caches and provider projects','The two existing large Rize JSONs']}
(OUT/'snapshot-manifest.json').write_text(json.dumps(r,indent=2)+'\n');print(json.dumps({'files':len(records),'text_bytes':r['text_bytes'],'largest_file_bytes':max(x['bytes'] for x in records)}))
