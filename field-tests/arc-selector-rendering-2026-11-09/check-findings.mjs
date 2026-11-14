import fs from 'node:fs/promises';
import path from 'node:path';
import assert from 'node:assert/strict';
import {createHash} from 'node:crypto';
import {fileURLToPath,pathToFileURL} from 'node:url';
const directory=path.dirname(fileURLToPath(import.meta.url));
const pkg=path.resolve(directory,'../../rea-local');
const {parseEvidence}=await import(pathToFileURL(pkg+'/dist/domain/evidence.js'));
const {parseEvidenceBundle}=await import(pathToFileURL(pkg+'/dist/domain/evidenceBundle.js'));
const {analysisErrorProjectionSchema}=await import(pathToFileURL(pkg+'/dist/contracts/errorSchemas.js'));
const sha=bytes=>createHash('sha256').update(bytes).digest('hex');
const records=[];
async function record(relative){const bytes=await fs.readFile(path.join(directory,relative));const evidence=parseEvidence(JSON.parse(bytes));records.push({path:relative,evidence_id:evidence.evidence_id,sha256:sha(bytes)});return evidence;}
const metadata=async label=>(await record('selection-after/'+label+'.evidence.json')).normalized_result.result;
const broad=await metadata('broad-10');assert.deepEqual([...new Set(broad.swift_dispatch_slots.map(row=>row.owner))],['BudgetFirst']);
const selected=await metadata('selected-10');assert.deepEqual([...new Set(selected.swift_dispatch_slots.map(row=>row.owner))],['BudgetTarget']);assert.equal(selected.swift_dispatch_slots.length,4);assert.equal(selected.swift_vtable_selection.examined,3);
const complete=await metadata('selected-100');assert.equal(complete.swift_dispatch_slots.length,5);assert.equal(complete.swift_dispatch_slots.filter(row=>row.implementation_address!==null).length,4);assert.deepEqual(complete.swift_vtable_selection,{address:'0x1130',index_entries:3,examined:3,matching_index_entries:1,matched:true,unresolved:0});
const tight=await metadata('selected-budget-one');assert.equal(tight.swift_vtable_selection.matched,true);assert.deepEqual(tight.swift_dispatch_slots,[]);assert.equal(tight.relative_pointers.length,1);assert.ok(tight.coverage.some(row=>row.facet==='swift_class_vtable_descriptors'&&row.status==='partial'&&row.reason.includes('max_records_reached')));
const missing=await metadata('not-indexed');assert.equal(missing.swift_vtable_selection.matched,false);assert.deepEqual(missing.swift_dispatch_slots,[]);
const arc=await metadata('arc-hover-class');assert.deepEqual(arc.swift_vtable_selection,{address:'0x103d7bcb4',index_entries:11125,examined:11125,matching_index_entries:1,matched:true,unresolved:0});assert.equal(arc.swift_dispatch_slots.length,17);assert.deepEqual(arc.swift_dispatch_slots.filter(row=>row.implementation_address!==null).map(row=>({slot:row.slot_index,address:row.implementation_address})),[{slot:21,address:'0x1012e4cec'},{slot:30,address:'0x1012e4d6c'}]);assert.ok(arc.swift_dispatch_slots.every(row=>row.owner==='HoveredElementTracker'));assert.ok(arc.coverage.some(row=>row.facet==='swift_class_vtable_descriptors'&&row.status==='partial'));
const unrequested=await metadata('unrequested-malformed-types');assert.ok(unrequested.coverage.some(row=>row.facet==='swift_class_vtable_descriptors'&&row.status==='not_requested'));
for(const label of ['wrong-facet','conflicting-selectors','malformed-types','malformed-proto']){
 const reply=JSON.parse(await fs.readFile(path.join(directory,'selection-after',label+'.reply.json'),'utf8'));
 assert.equal(reply.isError,true);const error=analysisErrorProjectionSchema.parse(JSON.parse(reply.content.find(block=>block.type==='text').text).error);
 if(label.startsWith('malformed-')){assert.equal(error.code,'unsupported_target');assert.equal(error.retryable,false);assert.ok(error.remediation.action.includes('Unchanged artifact bytes'));assert.ok(error.details.reason.includes('one file-backed mapped range'));}
 else assert.equal(error.code,'invalid_request');
}
const old=await record('bootstrap/swift-vtables.retained.evidence.json');const oldResult=old.normalized_result.result;assert.equal(oldResult.swift_dispatch_slots.length,5097);assert.equal(oldResult.relative_pointers.length,10267);assert.ok(oldResult.coverage.some(row=>row.facet==='swift_class_vtable_descriptors'&&row.status==='partial'&&row.reason.includes('max_records_reached')));
const bundle=parseEvidenceBundle(JSON.parse(await fs.readFile(path.join(directory,'bootstrap/evidence-bundle.json'),'utf8')));assert.deepEqual(bundle.records.find(row=>row.evidence_id===old.evidence_id),old);
const text=async label=>(await record('bootstrap/'+label+'.evidence.json')).normalized_result;
const entry=await text('bootstrap-prefix-0x1012e4ec4');assert.ok(entry.includes('FUN_1012e560c')&&entry.includes('FUN_1012e4f58'));
const continueAfterBootstrap=await text('bootstrap-prefix-0x1012e4f58');assert.ok(continueAfterBootstrap.includes('_swift_errorRelease')&&continueAfterBootstrap.includes('FUN_1012e5788'));
const completion=await text('bootstrap-prefix-0x1012e4fd4');assert.ok(completion.includes('FUN_1012e5088')&&completion.includes('FUN_1012e5148'));
for(const label of ['bootstrap-prefix-0x1012e5088','bootstrap-prefix-0x1012e5148']){const body=await text(label);assert.ok(body.includes('PublishedV18_enclosingInstance')&&body.includes('FUN_1012e4d6c')&&body.includes(' = 0;'));}
const cli=JSON.parse(await fs.readFile(path.join(directory,'cli-verification-final.json'),'utf8'));assert.equal(cli.status,'passed');assert.equal(cli.cases.length,9);assert.ok(cli.cases.every(row=>row.cli_mcp_equal&&row.target_unchanged));assert.equal(cli.verifier_run.process_lineage.status,'verified');assert.deepEqual(cli.verifier_run.process_lineage.descendants,[]);
const sessions=[];for(const relative of ['bootstrap','owned/capture','selection-after']){const summary=JSON.parse(await fs.readFile(path.join(directory,relative,'summary.json'),'utf8'));assert.equal(summary.verifier_run.process_lineage.status,'verified');assert.deepEqual(summary.verifier_run.process_lineage.descendants,[]);sessions.push({path:relative,status:summary.status,calls:summary.calls,successful:summary.successful,errors:summary.errors,run_id:summary.verifier_run.run_id});}
const close=JSON.parse(await fs.readFile(path.join(directory,'bootstrap/close.reply.json'),'utf8'));assert.equal(analysisErrorProjectionSchema.parse(JSON.parse(close.content.find(block=>block.type==='text').text).error).code,'cleanup_incomplete');
await fs.writeFile(path.join(directory,'findings.json'),JSON.stringify({status:'passed',checked_at:new Date().toISOString(),authority:'Read-only canonical authentication and selected retained-finding assertions; not target execution or new native analysis',records,sessions,cli_comparisons:cli.cases.length,limits:['Selected vtable identity does not instantiate a runtime class or resolve its unsupported slots.','Bootstrap and publication code do not establish the final native drawing transform.','Incomplete close and initial verifier failure remain separate failures.']},null,2)+'\n');console.log(JSON.stringify({status:'passed',records:records.length,sessions:sessions.length,cli_comparisons:cli.cases.length}));
