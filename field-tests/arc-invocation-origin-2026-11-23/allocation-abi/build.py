from pathlib import Path
import subprocess,json,hashlib
O=Path(__file__).resolve().parent;R=O.parents[2];D=R/'rea-local/.cache/arc-invocation-origin-2026-11-23/allocation-abi';D.mkdir(parents=True,exist_ok=True)
commands=[]
def run(args):
 p=subprocess.run(args,text=True,capture_output=True);commands.append({'argv':list(map(str,args)),'exit_code':p.returncode,'stdout':p.stdout,'stderr':p.stderr});assert p.returncode==0,p.stderr
sdk=subprocess.check_output(['xcrun','--sdk','macosx','--show-sdk-path'],text=True).strip()
run(['clang','-target','arm64-apple-macos14.0','-isysroot',sdk,'-O2','-dynamiclib',str(O/'alternative.c'),'-Wl,-install_name,@rpath/libAlternative.dylib','-o',str(D/'libAlternative.dylib')])
run(['clang','-target','arm64-apple-macos14.0','-isysroot',sdk,'-O2','-c',str(O/'alternative.c'),'-o',str(D/'alternative.o')])
binaries=[]
for label,extra in [('trusted',[]),('wrong-library',['-L',str(D),'-lAlternative']),('local',[str(D/'alternative.o')])]:
 argv=['swiftc','-target','arm64-apple-macos14.0','-O','-whole-module-optimization','-parse-as-library','-module-name','AllocationABIControl','-I',str(O/'module'),'-module-cache-path',str(D/'module-cache'),str(O/'control.swift')]
 run(argv+['-emit-ir','-o',str(O/(label+'.ll'))])
 run(argv+['-emit-assembly','-o',str(O/(label+'.s'))])
 run(argv+['-emit-library',*extra,'-o',str(D/(label+'.dylib'))])
 b=(D/(label+'.dylib')).read_bytes();binaries.append({'label':label,'path':str(D/(label+'.dylib')),'sha256':hashlib.sha256(b).hexdigest(),'bytes':len(b)})
 (O/(label+'.symbols.txt')).write_text(subprocess.check_output(['nm','-nm',str(D/(label+'.dylib'))],text=True))
(O/'build.json').write_text(json.dumps({'commands':commands,'binaries':binaries,'target_executed':False},indent=2)+'\n')
print(json.dumps({'commands':len(commands),'binaries':binaries}))
