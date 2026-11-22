from pathlib import Path
import subprocess,json,hashlib
OUT=Path(__file__).resolve().parent; ROOT=OUT.parents[2]
CACHE=ROOT/'rea-local/.cache/arc-field-types-2026-11-22'
SOURCE=OUT/'FieldControls.swift'; BINARY=CACHE/'libFieldControls.dylib'
args=['/usr/bin/swiftc','-O','-parse-as-library','-emit-library','-module-name','FieldTypeControls','-target','arm64-apple-macos14.0','-module-cache-path',str(CACHE/'module-cache'),str(SOURCE),'-o',str(BINARY)]
r=subprocess.run(args,text=True,capture_output=True)
(OUT/'build-stderr.txt').write_text(r.stderr)
record={'argv':args,'exit_code':r.returncode,'executed_target':False,'compiler':subprocess.check_output(['/usr/bin/swiftc','--version'],text=True),'source_sha256':hashlib.sha256(SOURCE.read_bytes()).hexdigest()}
if r.returncode==0:
 record['binary']={'path':str(BINARY),'bytes':BINARY.stat().st_size,'sha256':hashlib.sha256(BINARY.read_bytes()).hexdigest()}
 (OUT/'symbols.txt').write_text(subprocess.check_output(['/usr/bin/nm','-nm',str(BINARY)],text=True))
(OUT/'build.json').write_text(json.dumps(record,indent=2)+'\n')
raise SystemExit(r.returncode)
