import fs from 'node:fs/promises';
import path from 'node:path';
import { fileURLToPath, pathToFileURL } from 'node:url';
import assert from 'node:assert/strict';
import {createHash} from 'node:crypto';
const directory=path.dirname(fileURLToPath(import.meta.url));
const root=path.resolve(directory,'../..');
const {parseEvidence}=await import(pathToFileURL(path.join(root,'rea-local/dist/domain/evidence.js')));
const {parseEvidenceBundle}=await import(pathToFileURL(path.join(root,'rea-local/dist/domain/evidenceBundle.js')));
async function* files(dir){for(const item of await fs.readdir(dir,{withFileTypes:true})){const p=path.join(dir,item.name);if(item.isDirectory())yield* files(p);else if(item.isFile())yield p;}}
const evidence=[],bundles=[],failures=[];
for await (const file of files(directory)) {
  if(!file.endsWith('.json'))continue;
  const relative=path.relative(directory,file);
  try {
    const value=JSON.parse(await fs.readFile(file,'utf8'));
    if(file.endsWith('.evidence.json')) {
      const record=parseEvidence(value);evidence.push({path:relative,evidence_id:record.evidence_id});
    } else if(value && typeof value==='object' && Array.isArray(value.records) && Array.isArray(value.providers) && Array.isArray(value.artifacts)){
      const bundle=parseEvidenceBundle(value);bundles.push({path:relative,records:bundle.records.length,sha256:createHash('sha256').update(await fs.readFile(file)).digest('hex')});
    }
  }catch(error){failures.push({path:relative,message:error.message});}
}
const out={status:failures.length?'failed':'passed',checked_at:new Date().toISOString(),authority:'Read-only JSON parse and canonical Evidence authentication; not a rerun of target analyses',standalone_evidence:evidence.length,unique_evidence_ids:new Set(evidence.map(x=>x.evidence_id)).size,bundles:bundles.length,failures,evidence,bundle_records:bundles};
await fs.writeFile(path.join(directory,'evidence-audit.json'),JSON.stringify(out,null,2)+'\n');
console.log(JSON.stringify({status:out.status,standalone_evidence:out.standalone_evidence,unique_evidence_ids:out.unique_evidence_ids,bundles:out.bundles,failures}));
assert.equal(failures.length,0);
