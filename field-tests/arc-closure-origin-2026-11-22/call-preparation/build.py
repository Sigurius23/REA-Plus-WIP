from pathlib import Path
import json,subprocess,hashlib
O=Path(__file__).resolve().parent;R=O.parents[2];C=R/'rea-local/.cache/arc-closure-origin-2026-11-22';C.mkdir(exist_ok=True)
sdk=subprocess.check_output(['/usr/bin/xcrun','--sdk','macosx','--show-sdk-path'],text=True).strip()
source=O/'controls.s';binary=C/'call-preparation.dylib';args=['/usr/bin/clang','-target','arm64-apple-macos14.0','-dynamiclib','-nostdlib','-isysroot',sdk,'-lSystem',str(source),'-o',str(binary)]
r=subprocess.run(args,capture_output=True,text=True);assert r.returncode==0,r.stderr
symbols=subprocess.check_output(['/usr/bin/nm','-nm',str(binary)],text=True);(O/'symbols.txt').write_text(symbols)
(O/'build.json').write_text(json.dumps({'argv':args,'exit_code':r.returncode,'stdout':r.stdout,'stderr':r.stderr,'binary':str(binary),'sha256':hashlib.sha256(binary.read_bytes()).hexdigest(),'source_sha256':hashlib.sha256(source.read_bytes()).hexdigest(),'target_executed':False},indent=2)+'\n')
