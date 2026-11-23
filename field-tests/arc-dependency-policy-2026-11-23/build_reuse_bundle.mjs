import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath,pathToFileURL} from 'node:url';
import {createHash} from 'node:crypto';
const out=path.dirname(fileURLToPath(import.meta.url)),root=path.resolve(out,'../..');
const runtime=JSON.parse(await fs.readFile(path.join(root,'field-tests/arc-table-dispatch-2026-11-23/runtime-final-manifest.json'),'utf8')).runtime_root;
const {createEvidenceBundle,parseEvidenceBundle}=await import(pathToFileURL(runtime+'/dist/domain/evidenceBundle.js'));
const {parseEvidence}=await import(pathToFileURL(runtime+'/dist/domain/evidence.js'));
const selections=[
 ['arc-keypath-origin-2026-11-23/mcp-arc-qualified','instructions-0x1006fa228'],
 ['arc-closure-origin-2026-11-22/mcp-roots','instructions-0x1006fa470'],
 ...['1006fa5bc','1006fa7b4','1006faab0','1006fa77c'].map(a=>['arc-invocation-origin-2026-11-23/mcp','instructions-0x'+a]),
 ['arc-keypath-origin-2026-11-23/mcp-arc-qualified','instructions-0x1003b5454'],
 ['arc-keypath-origin-2026-11-23/mcp-arc-qualified','instructions-0x100ccc400'],
 ['arc-keypath-origin-2026-11-23/mcp-dependency','instructions-0x1006fb0c0'],
 ['arc-keypath-origin-2026-11-23/mcp-selection','instructions-0x1006fc894'],
 ...['100d929a0','100d92a28','100d90ebc','100d92ebc','100d910dc'].map(a=>['arc-dispatch-provenance-2026-11-21/mcp','function-0x'+a+'-read_function_instructions']),
 ...['100d8c154','100d8c1dc'].map(a=>['arc-keypath-origin-2026-11-23/mcp-default','instructions-0x'+a]),
 ['arc-instance-flow-2026-11-23/mcp-child-callbacks','instructions-0x1008716a4'],
 ['arc-instance-flow-2026-11-23/mcp-child-witness','instructions-0x100871440'],
];
const records=[],sources=[];
for(const [dir,label] of selections){const p=path.join(root,'field-tests',dir,label+'.evidence.json'),bytes=await fs.readFile(p),e=parseEvidence(JSON.parse(bytes.toString('utf8')));records.push(e);sources.push({path:path.relative(root,p),bytes:bytes.length,sha256:createHash('sha256').update(bytes).digest('hex'),evidence_id:e.evidence_id});}
const bundle=createEvidenceBundle(records);parseEvidenceBundle(bundle);
await fs.writeFile(path.join(out,'reused.bundle.json'),JSON.stringify(bundle)+'\n');await fs.writeFile(path.join(out,'reused-sources.json'),JSON.stringify(sources,null,2)+'\n');console.log(JSON.stringify({reused:records.length}));
