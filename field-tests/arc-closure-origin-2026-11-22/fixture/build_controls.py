from pathlib import Path
import json,subprocess,hashlib
O=Path(__file__).resolve().parent;R=O.parents[2];C=R/'rea-local/.cache/arc-closure-origin-2026-11-22';records=[];commands=[]
for profile in ['ordinary','resilient','frozen']:
 source=(R/'field-tests/arc-closure-abi-2026-11-22/fixture'/(profile+'.swift')).read_text()+'''
@inline(never) public func callOdd(_ client: Client) -> Bool { client.read(.value049) }
@inline(never) public func callEven(_ client: Client) -> Bool { client.read(.value050) }
'''
 p=O/(profile+'.swift');assert not p.exists();p.write_text(source);D=C/profile;D.mkdir(exist_ok=True)
 args=['/usr/bin/swiftc','-O','-whole-module-optimization','-parse-as-library','-module-name','ClosureABIControl','-target','arm64-apple-macos14.0','-module-cache-path',str(C/'module-cache')]
 if profile!='ordinary':args+=['-enable-library-evolution']
 for flag,dest in [('-emit-ir',O/(profile+'.ll')),('-emit-assembly',O/(profile+'.s')),('-emit-library',D/'control.dylib')]:
  argv=args+[flag,str(p),'-o',str(dest)];r=subprocess.run(argv,capture_output=True,text=True);commands.append({'argv':argv,'exit_code':r.returncode,'stdout':r.stdout,'stderr':r.stderr});assert r.returncode==0,r.stderr
 binary=D/'control.dylib';b=binary.read_bytes();records.append({'profile':profile,'path':str(binary),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest(),'source_sha256':hashlib.sha256(p.read_bytes()).hexdigest()})
 (O/(profile+'-symbols.txt')).write_text(subprocess.check_output(['/usr/bin/nm','-nm',str(binary)],text=True))
(O/'build.json').write_text(json.dumps({'compiler':subprocess.check_output(['/usr/bin/swiftc','--version'],text=True),'commands':commands,'binaries':records,'target_executed':False},indent=2)+'\n');print(json.dumps({'profiles':len(records),'executed':False}))
