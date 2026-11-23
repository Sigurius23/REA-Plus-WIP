"""Authenticate unchanged captures and original historical versions of living files."""
from pathlib import Path
import hashlib,json,subprocess
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
PARENT='d647436b459d46749f852149933b45e82f7b5e2f'
TD=ROOT/'field-tests/arc-typed-dispatch-2026-11-21'
sha=lambda b:hashlib.sha256(b).hexdigest()
allowed={'rea-local/src/domain/native/nativeApiBoundary.ts','rea-local/src/ghidra/GhidraFunctionValues.ts','rea-local/package.json','rea-local/scripts/verify-packed-bridge.mjs','rea-local/bridge/ghidra/ReaGhidraBridge.java','rea-local/bridge/ghidra/ReaGhidraRuntimeCalls.java','rea-local/src/domain/native/nativeInstruction.ts','rea-local/src/ghidra/GhidraAnalysisProfile.ts','rea-local/src/ghidra/GhidraProvider.behavior.test.ts','rea-local/src/ghidra/GhidraFunctionValues.test.ts','rea-local/src/contracts/officialToolContracts.ts','rea-local/src/native/AppleSwiftFieldTypes.ts','rea-local/src/native/AppleSwiftStructMetadata.ts','rea-local/src/contracts/enhancedToolContracts.ts','rea-local/src/native/AppleSwiftFieldTypes.test.ts','rea-local/src/native/AppleSwiftStructMetadata.test.ts','rea-local/docs/ghidra-provider.md','rea-local/src/application/native/EnhancedNativeInvestigation.test.ts','rea-local/src/native/AppleSwiftVtables.test.ts','rea-local/src/domain/native/objcSwiftMetadata.ts','rea-local/src/native/AppleDispatchMetadata.ts','rea-local/src/native/AppleMachoSelection.ts','rea-local/src/application/EnhancedTools.ts','rea-local/src/application/native/NativeDispatchMetadataInspection.ts','rea-local/src/contracts/enhancedInputs.ts','rea-local/src/contracts/enhancedToolContracts.ts','rea-local/src/cli/coreNativeCommands.ts','rea-local/src/native/NativeMacOSProvider.ts','ARC_HANDOFF.md','OPEN_TASKS.md','field-tests/arc-analysis-dossier-2026-11-08.md','rea-local/docs/native-investigation.md'}
allowed.update(subprocess.check_output(['git','diff','--name-only','--','rea-local','OPEN_TASKS.md','ARC_HANDOFF.md'],cwd=ROOT,text=True).splitlines())
result=[]
for directory,commit in [('arc-persistence-2026-11-20','a8b426fedc5bd67263bdbfe45a65428a19721cc6'),('arc-callbacks-2026-11-21','4f870986e5e4318635f7bff81531bfbe91d3e64c'),('arc-dispatch-provenance-2026-11-21',PARENT),('arc-typed-dispatch-2026-11-21','c59033f73ad050052c969a995fb981822bf5b1ad'),('arc-base-url-2026-11-21','8e48a0914d6d36dcb318d3916ab65ababebeb449'),('arc-storage-features-2026-11-22','a7fd989921b1341644055efea8a48e95e60ab0df'),('arc-restore-preview-2026-11-22','305e5acb0fa1845cf47a6bfc1371ea3148410551'),('arc-frame-escape-2026-11-22','60c75d904c67ae2a22d5ece74dc80fe930075914'),('arc-field-types-2026-11-22','5090babf2514becd081fcafc9854127258e70125'),('arc-closure-abi-2026-11-22','f696d84260c9902fa8bf6cd0d3d2b148f97ae18c'),('arc-closure-origin-2026-11-22','50dde7f65fab6f2e9b81d0a486d138ffbab1fd1c'),('arc-invocation-origin-2026-11-23','a3b2505f8dae3e7d8fd5515204ee6187cbf5e34f'),('arc-keypath-origin-2026-11-23','4da794cf7676b802363f2e4f108d74b57cd4d2bb'),('arc-generic-declarations-2026-11-23','20235139dbcdc65861253f88dc51b97e29d20cc3'),('arc-generic-applications-2026-11-23','0ce5b24f5eedd22436ee460ad4c70100c3f41523'),('arc-member-templates-2026-11-23','370825a902ddcc8a621c9f64768aae1a78ea79b9'),('arc-instance-flow-2026-11-23','941979d24'),('arc-table-dispatch-2026-11-23','b3acb5f00'),('arc-dispatch-replay-2026-11-23','98bd69a11'),('arc-dependency-policy-2026-11-23','2aa6371ac')]:
 manifest=ROOT/'field-tests'/directory/'snapshot-manifest.json';m=json.loads(manifest.read_text());updated=[];unchanged=0
 for r in m['files']:
  b=(ROOT/r['path']).read_bytes()
  if len(b)==r['bytes'] and sha(b)==r['sha256']:unchanged+=1;continue
  assert r['path'] in allowed,r['path'];historic=subprocess.check_output(['git','show',commit+':'+r['path']],cwd=ROOT)
  assert len(historic)==r['bytes'];assert sha(historic)==r['sha256'];updated.append(r['path'])
 result.append({'manifest':str(manifest.relative_to(ROOT)),'sha256':sha(manifest.read_bytes()),'base_commit':commit,'total_files':len(m['files']),'unchanged_files':unchanged,'updated_living_files_authenticated_at_base':updated})
review=json.loads((TD/'typed-input-design-review.json').read_text());assert sha((TD/'typed-input-design-review.md').read_bytes())==review['markdown_sha256']
for r in review['evidence_records']:
 p=ROOT/r['path'];b=p.read_bytes();assert sha(b)==r['sha256'],r['path'];d=json.loads(b);assert d['evidence_id']==r['evidence_id'];assert d['subject']['digest']['sha256']=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
source_versions=[]
for r in review['implementation_reuse']+review['additional_source_hashes']:
 p=ROOT/r['path']
 if not p.exists():p=ROOT/'rea-local'/r['path']
 b=p.read_bytes();version='current'
 if sha(b)!=r['sha256']:
  b=subprocess.check_output(['git','show',PARENT+':'+str(p.relative_to(ROOT))],cwd=ROOT);version=PARENT
 assert sha(b)==r['sha256'],r['path']
 if 'lines' in r:
  lines=b.decode().splitlines(keepends=True);span=''.join(lines[r['lines']['start']-1:r['lines']['end']]).encode();assert sha(span)==r['range_text_sha256'],r['path']
 source_versions.append({'path':str(p.relative_to(ROOT)),'version':version,'range':r.get('lines')})
fixture=json.loads((TD/'fixture/manifest.json').read_text())
for r in fixture['items']:
 b=(TD/'fixture'/r['path']).read_bytes();assert len(b)==r['bytes'];assert sha(b)==r['sha256'],r['path']
receipt={'status':'passed','snapshots':result,'design_review_evidence_records':len(review['evidence_records']),'design_review_source_ranges':len(review['implementation_reuse']),'design_source_versions':source_versions,'fixture_text_files':len(fixture['items']),'no_target_execution':True}
(OUT/'history-verification.json').write_text(json.dumps(receipt,indent=2)+'\n');print(json.dumps(receipt))
