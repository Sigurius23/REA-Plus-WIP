"""Freeze the rebuilt runtime without altering earlier verification runtimes."""
from pathlib import Path
import hashlib,json,os,shutil,subprocess
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1];PKG=ROOT/'rea-local'
DEST=PKG/'.cache/arc-runtime-closure-abi-2026-11-22';assert not DEST.exists()
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
for f in [PKG/p for p in ['src/native/AppleSwiftStructMetadata.ts','src/native/AppleSwiftStructMetadata.test.ts','src/native/AppleDispatchCoverage.ts', 'src/native/AppleSwiftFieldTypes.ts', 'src/native/AppleSwiftFieldTypes.test.ts', 'src/native/AppleDispatchMetadata.ts', 'src/native/AppleMachoSelection.ts', 'src/domain/native/objcSwiftMetadata.ts', 'src/contracts/enhancedInputs.ts', 'src/contracts/enhancedToolContracts.ts', 'src/application/EnhancedTools.ts', 'src/application/native/NativeDispatchMetadataInspection.ts', 'src/native/NativeMacOSProvider.ts', 'src/cli/coreNativeCommands.ts', 'src/application/native/EnhancedNativeInvestigation.test.ts']]:
 b=f.read_bytes();sources.append({'path':str(f.relative_to(ROOT)),'sha256':hashlib.sha256(b).hexdigest()})
r={'version':1,'runtime_root':str(DEST),'source_parent':subprocess.check_output(['git','rev-parse','HEAD'],cwd=ROOT,text=True).strip(),'scope':'Selected static Swift struct metadata layout and explicit reflection/argument-ABI boundary; no invocation recovery','source_files':sources,'files':files}
(OUT/'runtime-manifest.json').write_text(json.dumps(r,indent=2)+'\n');print(json.dumps({'runtime':str(DEST),'files':len(files)}))
