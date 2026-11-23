from pathlib import Path
import subprocess,json,hashlib
O=Path(__file__).resolve().parent;R=O.parents[2];D=R/'rea-local/.cache/arc-keypath-origin-2026-11-23/fixture';D.mkdir(parents=True,exist_ok=True);commands=[];binaries=[]
def run(args):
 p=subprocess.run(args,text=True,capture_output=True);commands.append({'argv':list(map(str,args)),'exit_code':p.returncode,'stdout':p.stdout,'stderr':p.stderr});assert p.returncode==0,p.stderr
sdk=subprocess.check_output(['xcrun','--sdk','macosx','--show-sdk-path'],text=True).strip()
run(['clang','-target','arm64-apple-macos14.0','-isysroot',sdk,'-O2','-dynamiclib',str(O/'alternative.c'),'-Wl,-install_name,@rpath/libKeyPathAlternative.dylib','-o',str(D/'libKeyPathAlternative.dylib')])
run(['clang','-target','arm64-apple-macos14.0','-isysroot',sdk,'-O2','-c',str(O/'alternative.c'),'-o',str(D/'alternative.o')])
for label,extra in [('trusted',[]),('wrong-library',['-L',str(D),'-lKeyPathAlternative']),('local',[str(D/'alternative.o')])]:
 args=['swiftc','-target','arm64-apple-macos14.0','-O','-whole-module-optimization','-parse-as-library','-module-name','KeyPathControl','-module-cache-path',str(D/'module-cache'),str(O/'control.swift')]
 run(args+['-emit-ir','-o',str(O/(label+'.ll'))]);run(args+['-emit-assembly','-o',str(O/(label+'.s'))]);run(args+['-emit-library',*extra,'-o',str(D/(label+'.dylib'))])
 b=(D/(label+'.dylib')).read_bytes();symbols=subprocess.check_output(['nm','-nm',str(D/(label+'.dylib'))],text=True);(O/(label+'.symbols.txt')).write_text(symbols);line=next(l for l in symbols.splitlines() if ') external ' in l and 'makeWrapper' in l)
 binaries.append({'label':label,'path':str(D/(label+'.dylib')),'sha256':hashlib.sha256(b).hexdigest(),'bytes':len(b),'procedure':'0x'+line.split()[0].lstrip('0')})
(O/'build.json').write_text(json.dumps({'commands':commands,'binaries':binaries,'source_sha256':hashlib.sha256((O/'control.swift').read_bytes()).hexdigest(),'target_executed':False},indent=2)+'\n');print(json.dumps({'commands':len(commands),'binaries':binaries}))
