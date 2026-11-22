"""Freeze the rebuilt runtime without altering earlier verification runtimes."""
from pathlib import Path
import hashlib,json,os,shutil,subprocess
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1];PKG=ROOT/'rea-local'
DEST=PKG/'.cache/arc-runtime-frame-escape-final-2026-11-22';assert not DEST.exists()
DEST.mkdir()
for name in ['bridge','dist','scripts']:
 shutil.copytree(PKG/name,DEST/name,ignore=shutil.ignore_patterns('__pycache__','*.pyc','*.class'))
for name in ['package.json','package-lock.json']:shutil.copy2(PKG/name,DEST/name)
os.symlink(PKG/'node_modules',DEST/'node_modules',target_is_directory=True)
files=[]
for name in ['bridge','dist','scripts','package.json','package-lock.json']:
 p=DEST/name
 for f in sorted(p.rglob('*') if p.is_dir() else [p]):
  if not f.is_file():continue
  b=f.read_bytes();files.append({'path':str(f.relative_to(DEST)),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest()})
sources=[]
for f in [PKG/p for p in ['bridge/ghidra/ReaGhidraSwiftEnumSwitches.java','src/ghidra/GhidraAnalysisProfile.ts','src/ghidra/GhidraProvider.behavior.test.ts','scripts/verify-real-ghidra-swift-enum.mjs','tests/conformance/ghidra/swift-enum-oracle.mjs','tests/conformance/ghidra/swift-frame-escape-fixtures.mjs']]:
 b=f.read_bytes();sources.append({'path':str(f.relative_to(ROOT)),'sha256':hashlib.sha256(b).hexdigest()})
r={'version':1,'runtime_root':str(DEST),'source_parent':subprocess.check_output(['git','rev-parse','HEAD'],cwd=ROOT,text=True).strip(),'scope':'Swift enum v10: unknown-call frame arguments X0-X8, Swiftself X20 and Swiftasync X22; private-frame safety repair, not item63 typed context recovery','source_files':sources,'files':files}
(OUT/'runtime-manifest.json').write_text(json.dumps(r,indent=2)+'\n');print(json.dumps({'runtime':str(DEST),'files':len(files)}))
