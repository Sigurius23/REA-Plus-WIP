"""Compile and inspect an owned fixture; never execute it."""
from pathlib import Path
import hashlib,json,subprocess
O=Path(__file__).resolve().parent;R=O.parents[1];P=R/'rea-local'
source=P/'tests/fixtures/native/table-dispatch.s';artifact=P/'.cache/arc-table-dispatch-2026-11-23/dispatch-final'
assert not artifact.exists()
argv=['/usr/bin/clang','-target','arm64-apple-macos13','-nostdlib','-lSystem','-Wl,-e,_dispatch_entry','-Wl,-no_uuid','-o',str(artifact),str(source)]
r=subprocess.run(argv,capture_output=True,text=True);assert r.returncode==0,r.stderr
nm=subprocess.check_output(['/usr/bin/nm','-n',str(artifact)],text=True)
(O/'fixture-symbols.txt').write_text(nm)
symbols={line.split()[-1]:int(line.split()[0],16) for line in nm.splitlines() if len(line.split())==3}
assert symbols['_dispatch_entry']==0x100000310
assert symbols['direct_instruction']==0x100000348
assert symbols['indirect_instruction']==0x100000358
assert symbols['bypassed_instruction']==0x100000364
assert symbols['different_instruction']==0x100000370
sha=lambda p:hashlib.sha256(p.read_bytes()).hexdigest()
receipt={'status':'compiled-not-executed','argv':argv,'stdout':r.stdout,'stderr':r.stderr,'compiler_version':subprocess.check_output(['/usr/bin/clang','--version'],text=True),'source':str(source),'source_sha256':sha(source),'artifact':str(artifact),'artifact_sha256':sha(artifact),'artifact_bytes':artifact.stat().st_size,'symbols':{k:hex(v) for k,v in symbols.items()},'target_executed':False}
(O/'fixture-build.json').write_text(json.dumps(receipt,indent=2)+'\n');print(json.dumps({'status':receipt['status'],'sha256':receipt['artifact_sha256']}))
