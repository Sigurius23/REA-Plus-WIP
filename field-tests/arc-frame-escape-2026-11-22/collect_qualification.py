"""Copy finished textual qualification records, with exact path/hash mapping."""
from pathlib import Path
import hashlib,json,shutil
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1];CACHE=ROOT/'rea-local/.cache/frame-escape-2026-11-22'
sha=lambda b:hashlib.sha256(b).hexdigest()
records=[]
def copy(source,destination,kind):
 b=source.read_bytes();b.decode('utf8');assert b'\0' not in b
 destination.parent.mkdir(parents=True,exist_ok=True)
 if destination.exists():assert destination.read_bytes()==b,destination
 else:destination.write_bytes(b)
 records.append(dict(source_path=str(source.relative_to(ROOT)),path=str(destination.relative_to(ROOT)),bytes=len(b),sha256=sha(b),kind=kind))
for name,expected_ok,count in [('baseline',False,0),('native-full',False,7),('native-final',True,110)]:
 base=CACHE/name;summary=json.loads((base/'summary.json').read_text())
 assert summary['ok'] is expected_ok,(name,summary.get('error'))
 assert len(summary['results'])==count,(name,len(summary['results']))
 assert summary['process_lineage']['status']=='verified'
 assert summary['process_lineage']['descendants']==[]
 dest=OUT/'qualification'/name
 for filename in ['run-start.json','summary.json','invocations.json']:
  copy(base/filename,dest/filename,'run-record')
 if name!='baseline':
  runtime=json.loads((OUT/('runtime-manifest-first.json' if name=='native-full' else 'runtime-manifest.json')).read_text())['runtime_root']
  verifier=Path(runtime)/'scripts/verify-real-ghidra-swift-enum.mjs'
  assert sha(verifier.read_bytes())==json.loads((base/'run-start.json').read_text())['verifier']['sha256']
  copy(verifier,dest/'verifier-source.mjs','verifier-source')
 copy(CACHE/(name+'.log'),dest/'run.log','run-log')
 for p in sorted((base/'catalogs').glob('*.json')):copy(p,dest/'catalogs'/p.name,'canonical-catalog')
 # Per-case catalog copies are byte-identical to one canonical catalog. Bind
 # their hashes without duplicating the same large JSON for every case.
 for p in sorted(base.glob('*/catalog.json')):
  b=p.read_bytes();target=dest/'catalogs'/(sha(b)+'.json');assert target.read_bytes()==b
  records.append(dict(source_path=str(p.relative_to(ROOT)),path=str(target.relative_to(ROOT)),bytes=len(b),sha256=sha(b),kind='catalog-alias'))
 for case in sorted(p for p in base.iterdir() if p.is_dir() and p.name not in {'catalogs','module-cache'}):
  for p in sorted(case.iterdir()):
   if not p.is_file() or p.name=='catalog.json':continue
   if p.suffix not in {'.json','.txt','.s','.swift'}:continue
   copy(p,dest/case.name/p.name,'case-text')
for name in ['docs-check.log','package.log','fast-check.log']:
 copy(CACHE/name,OUT/'checks'/name,'gate-log')
result=dict(version=1,status='passed',target_executed=False,records=records,limits=['Original run directories and bytes remain unchanged.','Binary fixtures, compiled modules, module caches and provider projects are excluded; their identities remain in the original oracle/run records.','Per-case catalogs are deduplicated by exact SHA-256; source paths map to canonical retained bytes.','Compiler-only preparation was supplemental; real-provider results come from the finished native runs.'])
(OUT/'qualification-index.json').write_text(json.dumps(result,indent=2)+'\n')
print(json.dumps(dict(status='passed',source_mappings=len(records),unique_files=len({r['path'] for r in records}))))
