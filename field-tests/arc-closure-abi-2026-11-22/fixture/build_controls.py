from pathlib import Path
import subprocess,json,hashlib
O=Path(__file__).resolve().parent;R=O.parents[2];C=R/'rea-local/.cache/arc-closure-abi-2026-11-22';C.mkdir(exist_ok=True)
commands=[]
def run(args):
 p=subprocess.run(args,capture_output=True,text=True);commands.append({'argv':args,'exit_code':p.returncode,'stdout':p.stdout,'stderr':p.stderr});assert p.returncode==0,p.stderr
for label,evolution,frozen in [('ordinary',False,False),('resilient',True,False),('frozen',True,True)]:
 D=C/label;D.mkdir(exist_ok=True)
 source=('// Owned static-analysis control. Never load or execute.\n'+('@frozen ' if frozen else '')+'public enum Setting {\n'+''.join(f'case value{i:03d}\n' for i in range(297))+'}\n'+'''@frozen public struct Client {
  public let read: @Sendable (Setting) -> Bool
  public init(_ read: @escaping @Sendable (Setting) -> Bool) { self.read = read }
}
@inline(never) public func invoke(_ client: Client, _ value: Setting) -> Bool {
  client.read(value)
}
''')
 src=O/(label+'.swift');src.write_text(source)
 base=['/usr/bin/swiftc','-O','-whole-module-optimization','-parse-as-library','-module-name','ClosureABIControl','-target','arm64-apple-macos14.0','-module-cache-path',str(C/'module-cache')]
 if evolution:base+=['-enable-library-evolution']
 for mode,suffix in [('-emit-ir','.ll'),('-emit-assembly','.s'),('-emit-library','.dylib')]:
  dest=D/('control'+suffix) if suffix=='.dylib' else O/(label+suffix)
  run(base+[mode,str(src),'-o',str(dest)])
 (O/(label+'-symbols.txt')).write_text(subprocess.check_output(['/usr/bin/nm','-nm',str(D/'control.dylib')],text=True))
records=[]
for p in sorted(C.glob('*/control.dylib')):
 b=p.read_bytes();records.append({'profile':p.parent.name,'path':str(p),'bytes':len(b),'sha256':hashlib.sha256(b).hexdigest()})
(O/'build.json').write_text(json.dumps({'commands':commands,'binaries':records,'compiler':subprocess.check_output(['/usr/bin/swiftc','--version'],text=True),'target_executed':False},indent=2)+'\n')
print(json.dumps({'profiles':len(records),'commands':len(commands),'target_executed':False}))
