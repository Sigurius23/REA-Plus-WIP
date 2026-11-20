#!/usr/bin/env python3
"""Supplemental, offline caller-CFG inventory; never a replacement REA+ producer.
Reads immutable canonical records, writes additive semantic notes in this folder.
No target/library execution, provider, network or production-source mutation.
"""
import hashlib,json,re,pathlib,collections
BASE=pathlib.Path(__file__).resolve().parent
SRC=BASE/'evidence/arc-reducer-v9.retained.evidence.json'
record=json.loads(SRC.read_text()); result=record['normalized_result']
asm={int(line.split(':',1)[0],16):line for line in result['assembly']}
inst_file=BASE/'evidence/arc-reducer-v9-instructions.evidence.json'
inst_record=json.loads(inst_file.read_text())
assert inst_record['normalized_result']['instructions']==result['assembly']
assert len(asm)==2518
blocks={int(b['start'],16):b for b in result['basic_blocks']}
call_names={int(c['address'],16):c['name'] for c in result['callees']}
tables=[t for t in result['native_api']['jump_tables'] if any(s.get('provenance')=='rea-swift-enum-signed-word-table' for s in t['data_sources'])]
assert len(tables)==1 and len(tables[0]['mappings'])==28
pseudo=result['pseudocode'].splitlines()
case_lines=[]
for line,text in enumerate(pseudo,1):
 m=re.match(r'  case (0x[0-9a-f]+|[0-9]+):',text)
 if m:case_lines.append((int(m[1],0),line))
assert len(case_lines)==28
P={n:[start,case_lines[k+1][1]-1 if k+1<len(case_lines) else len(pseudo)] for k,(n,start) in enumerate(case_lines)}
# Manually interpreted caller facts. Field keys are offsets in the field-offset
# source M, NOT actual offsets within the state. No nominal state type is claimed.
D={
0:('Read one byte via payload access helper; no conditional branch before shared write.',
   'F(0x20) <- accessed byte.', 'Common empty-like result discriminator2.', ['0x1012a5bd4','0x1012a5bdc','0x1012a6ae8']),
1:('Read byte; compare it with3.', 'F(0x18) <- byte; F(0x1c) <- (byte==3 ? 1 : 2).',
   'Common empty-like result discriminator2.', ['0x1012a6404','0x1012a6410','0x1012a6418','0x1012a6424']),
2:('No visible value-dependent branch.', '16 accessed bytes -> F(0x28).',
   'Common empty-like result discriminator2.', ['0x1012a6330','0x1012a6334','0x1012a6338']),
3:('Replace two-word F(0x5c). Previous second word==0 takes initial branch; otherwise a nonzero new second word skips the asynchronous construction. When reached, F(0x4c).second must be nonzero.',
   'F(0x5c) <- accessed two-word value. Parent invokes typed state copy into a capture context on the asynchronous arm.',
   'Conditional task/run-style constructor0x100598344 with async descriptor candidate0x1037887d0, environment bytes0x280, selected-identity pair and a state-copy request. Other arms return discriminator2. Actual delayed work/retention unproved.',
   ['0x1012a63b0','0x1012a63bc','0x1012a63c0','0x1012a63d8','0x1012a714c','0x1012a71bc','0x1012a71c0','0x1012a72a0']),
4:('Read byte via access helper.', 'No direct parent state store identified.',
   'Constructs outer action tag0 with payload tag byte3 at+0x20 and byte value in first word; Just -> AnyPublisher -> result discriminator0. Delegate-style emission, not an observed DevTools operation.',
   ['0x1012a6154','0x1012a6c34','0x1012a6c48','0x1012a6c78','0x1012a76d8']),
5:('Classify accessed update twice with0x101165e98. Classification<=5 and mask0x2c (2/3/5) selects modality2. Classification>1 enters flag-bit/optional-value comparison path; helper0x10115cd48 participates in equality and0x1012aa084 in history handling.',
   'F(0x48) <- 0; conditional F(0x18) <- 2. Calls0x1012b2b00 with state/model buffer on one arm; destroy/tag-single-payload calls target F(0x58). State writes hidden in helpers remain unproved.',
   'Builds one-element heap container of accessed/transformed update-like bytes, then0x1012abe5c(S,container,flag-bit). Return construction/application/persistence inside that helper unproved.',
   ['0x1012a6630','0x1012a663c','0x1012a6640','0x1012a6654','0x1012a6668','0x1012a6670','0x1012a6678','0x1012a7c1c','0x1012a7c58']),
6:('Access two-word argument; obtain F(0x40), create one-element two-word container, call0x1012aeaf8 and0x1011648f8.',
   'F(0x48) <- 0. Calls0x1012b2b00 with transformed buffer, destroys F(0x58) value and invokes witness+0x38(field,1,1,type), consistent with clearing an optional but nominal type unproved.',
   'Creates one-element update-like container; calls0x1012abe5c(...,0). Actual append/persistence semantics reside in helpers.',
   ['0x1012a6844','0x1012a6880','0x1012a68a4','0x1012a68b4','0x1012a6900','0x1012a690c','0x1012a6940','0x1012a69c8']),
7:('Access one word.', 'No direct parent state store identified; delegates to0x1012a8ea4.',
   'Calls0x1012a8ea4 with state, accessed argument and output slot. Helper effects/return form unproved.', ['0x1012a63e8','0x1012a63f4']),
8:('Read byte via access helper.', 'F(0x1c) <- accessed byte.',
   'Common empty-like result discriminator2.', ['0x1012a6ad8','0x1012a6ae0','0x1012a6ae8']),
9:('Access two-word selector value; construct optional TaskPriority-like argument through Swift metadata/witness calls.',
   'No direct parent state store identified.',
   'Allocates0x2a0 capture object, copies environment0x280 bytes, stores accessed pair at+0x290/+0x298, then0x100598344 with async descriptor candidate0x1037887b0. Clipboard execution/subscription is not observed.',
   ['0x1012a61dc','0x1012a61ec','0x1012a6238','0x1012a6260','0x1012a628c']),
10:('Payload byte+0x38 branches0/1/other. Requires nonzero F(0x4c).second and identity equality (two-word fast path or Swift String comparison). Cases0/1 call0x1011648b4/0x1011648bc. Other branch chooses F(0x2c) or F(0x30), defaults absent strings to empty, calls0x100576028.',
    'Matched0/1 arms clear F(0x48) and call0x1012abe5c with transformed one-element update-like container. No explicit parent state write on the other callback arm.',
    'Some arms delegate result construction to0x1012abe5c; other arms directly invoke0x100576028 then return discriminator2. Do not classify that unknown call as deferred or persistent without its body.',
    ['0x1012a6a68','0x1012a6a94','0x1012a78c8','0x1012a790c','0x1012a7af0','0x1012a7dfc']),
11:('Environment-derived getter closure invoked with raw key0x32; use returned low bit.',
    'F(0x60) <- returned bit0.',
    'Allocates two-result container:0x1012a7ee4(state-copy) builds first;0x10059803c with code pointer0x1012b35c8 and captured environment/state builds second;0x1012ad570 combines them. Constructor/closure bodies unqueried.',
    ['0x1012a5fd4','0x1012a5fd8','0x1012a5ff4','0x1012a6088','0x1012a60fc','0x1012a6110','0x1012a6124']),
12:('Resolve environment dependency copied from D+0x50..0x9f; read optional selected pair F(0x4c), retain if present, invoke an indirect dependency closure.',
    'No direct parent state store identified.',
    'Then emits outer action tag0, inner tag byte4 with first word0 via Just/AnyPublisher; returns result tag0. Immediate dependency-call effects and later delegate handling remain separate unknowns.',
    ['0x1012a6174','0x1012a61b8','0x1012a705c','0x1012a7070','0x1012a708c','0x1012a70c8','0x1012a712c','0x1012a76c8']),
13:('No state predicate before write; environment-derived writer invoked with (1,0x31).',
    'F(0x24) <- 1.',
    'Writer returns retained publisher-like value;0x100596e80 wraps it into result slot. Whether writing happens at call or subscription, and storage backend/instance, are unproved.',
    ['0x1012a675c','0x1012a67b4','0x1012a67b8','0x1012a67bc','0x1012a6824']),
14:('No visible predicate.', 'No direct parent state store identified.',
    'Outer action tag0, inner tag byte4, first word3 -> Just/AnyPublisher/result tag0. Navigation/URL behavior requires delegated handler.', ['0x1012a5f7c','0x1012a6c24','0x1012a6c78']),
15:('History cursor at F(0x54)+8 must be >0. Decrement, bounds-check previous cursor against array count; otherwise no-op or trap.',
    'F(0x54).cursor <- cursor-1.',
    'Loads first handle from 16-byte history entry at array+0x20+16*(cursor-1), calls0x1012abe5c(...,0). No available undo returns discriminator2.',
    ['0x1012a6344','0x1012a6354','0x1012a6358','0x1012a6368','0x1012a6370','0x1012a6390']),
16:('History cursor < array count and nonnegative; otherwise no-op or trap.',
    'F(0x54).cursor <- cursor+1.',
    'Loads second handle from entry at array+0x28+16*cursor and shares apply call0x1012abe5c(...,0). No available redo returns discriminator2.',
    ['0x1012a5f54','0x1012a5f60','0x1012a5f64','0x1012a5f6c','0x1012a5f74','0x1012a6374']),
17:('Requires nonzero F(0x4c).second.', 'No direct parent state store identified.',
    'Selected pair -> outer action tag0 with inner tag byte0; Just/AnyPublisher/result tag0. No selected pair returns discriminator2. Deletion/persistence is delegated, not performed visibly here.',
    ['0x1012a6438','0x1012a643c','0x1012a6448','0x1012a6450','0x1012a6464','0x1012a6c78']),
18:('Requires selected pair F(0x4c) and present optional F(0x50); a helper produces another two-word value.',
    'No direct parent state store identified.',
    'Outer tag0, inner tag byte2 containing selected pair + derived pair -> Just/AnyPublisher/result tag0. Actual renaming/storage requires delegate consumer.',
    ['0x1012a69ec','0x1012a6a30','0x1012a75e4','0x1012a760c','0x1012a7664','0x1012a76c8']),
19:('No parent predicate.', 'Delegates to0x1012a82d4; direct/indirect writes inside helper unknown.',
    'Helper receives state/output slot; shuffle/RNG/output semantics require body.', ['0x1012a6c10','0x1012a6c18']),
20:('Requires present optional F(0x50), nonzero identifier inside it and predicate0x1012a8178 true. Otherwise logs “Attempted to report a boost that should not be reportable”.',
    'No direct parent state store identified.',
    'Accepted arm creates two Just/AnyPublisher delegate-style actions (inner tag4/value0, then inner tag1/identifier) and combines with0x1012ad570. Rejected arm returns discriminator2. No network report is established.',
    ['0x1012a64c0','0x1012a64c4','0x1012a64d8','0x1012a72d0','0x1012a730c','0x1012a7334','0x1012a7440']),
21:('Requires present optional F(0x50). Helper0x10115ad60 invoked with0 and empty Swift string, then0x10115f7f4 twice; history cursor checked for0<=cursor<=count.',
    'Calls0x1012b0288 on history cursor/paired handles; writes cursor+1 and calls0x1012b2a44 on one arm. Helper-internal state writes unknown.',
    'Passes obtained handle to0x1012abe5c(...,0). No model returns discriminator2; invalid cursor paths trap.',
    ['0x1012a66f8','0x1012a672c','0x1012a6e44','0x1012a6e74','0x1012a6ed0','0x1012a6eec','0x1012a6f0c']),
22:('Build default model via0x10115923c and0x1011648ec.',
    'F(0x20)<-0; F(0x48)<-0; F(0x18)<-2; calls model setter0x1012b2b00 and clear-style witness calls on F(0x58).',
    'Obtains static container0x104626fd0 through swift_initStaticObject; delegates to0x1012abe5c(...,0). Underlying model/persistence type unproved.',
    ['0x1012a6af8','0x1012a6b00','0x1012a6b38','0x1012a6b84','0x1012a6b90','0x1012a6b9c','0x1012a6bd0','0x1012a6c08']),
23:('No visible predicate.', 'No direct parent state store identified.',
    'Outer tag0, inner tag byte4, first word1 -> Just/AnyPublisher/result tag0. Actual presentation delegated.', ['0x1012a6c20','0x1012a6c34','0x1012a6c78']),
24:('Read first two state words; capture them with environment.', 'No direct parent state store identified.',
    'Allocate0x2a0 context, copy D+0..0x27f, store state words at+0x290/+0x298;0x10059803c receives code pointer0x1012b31d8. Page reload execution requires that closure and subscription/cancellation path.',
    ['0x1012a62b8','0x1012a62e8','0x1012a62ec','0x1012a6308','0x1012a631c']),
25:('No visible predicate.', 'F(0x1c) <- 2.', 'Common empty-like result discriminator2.', ['0x1012a62a8','0x1012a62ac','0x1012a62b0']),
26:('No parent predicate.', 'Delegates to0x1012a93b0; helper writes unknown.',
    'Helper receives state/output slot; appearance handling and result semantics require body.', ['0x1012a6cd4','0x1012a6cdc']),
27:('Environment-derived writer invoked with(1,0x32), sharing writer/AnyPublisher path with case13.',
    'F(0x60) <- 1.',
    '0x100596e80 wraps writer-returned publisher. Same raw key as initialize getter, but backend/instance/delivery/lifetime unproved.',
    ['0x1012a5edc','0x1012a5ee4','0x1012a5f3c','0x1012a5f40','0x1012a67bc','0x1012a6824']),
}

def hx(a):return f'0x{a:x}'
def block_instructions(b):
 lo=int(b['start'],16);hi=int(b['end'],16)
 return [a for a in asm if lo<=a<hi]
def reachable(start):
 seen=set();pending=[start];unknown=[]
 while pending:
  a=pending.pop()
  if a in seen:continue
  if a not in blocks:unknown.append(hx(a));continue
  seen.add(a)
  for s in blocks[a]['successors']:pending.append(int(s,16))
 return seen,unknown

rows=[]; dumpdir=BASE/'case-instructions';dumpdir.mkdir(exist_ok=True)
for mapping in tables[0]['mappings']:
 n=mapping['case_value'];target=int(mapping['target_address'],16)
 text=' '.join(e['detail'] for e in mapping['evidence']);name=re.search(r'field name ([^)]+)',text)[1]
 bs,unknown=reachable(target)
 addresses=sorted({a for b in bs for a in block_instructions(blocks[b])})
 lines=[asm[a] for a in addresses]
 direct=[];indirect=[];branches=[];stores=[]
 for a in addresses:
  line=asm[a];instruction=line.split(': ',1)[1]
  m=re.fullmatch(r'bl (0x[0-9a-f]+)',instruction)
  if m:
   callee=int(m[1],16);direct.append({'site':hx(a),'callee':hx(callee),'name':call_names.get(callee),'body_queried_here':False})
  if instruction.startswith('blr '):indirect.append({'site':hx(a),'instruction':instruction,'target_binding':'unresolved in caller-only inventory'})
  if re.match(r'(b\.|cbz |cbnz |tbz |tbnz )',instruction):branches.append({'site':hx(a),'instruction':instruction})
  if re.match(r'(stp |str\w* |stur\w* )',instruction):stores.append({'site':hx(a),'instruction':instruction,'classification':'raw memory store; may be stack/capture/state, not automatically persistent'})
 decision,writes,effect,anchors=D[n]
 # Anchor membership is separately recorded: shared-label pseudocode can place
 # a source reference outside a case. Never silently present it as executed.
 checked=[{'address':a,'instruction':asm.get(int(a,16)),'reachable_in_captured_cfg':int(a,16) in addresses} for a in anchors]
 assert all(c['instruction'] for c in checked),checked
 path=dumpdir/f'{n:02d}-{name}.txt'
 path.write_text(f'Canonical evidence: {record["evidence_id"]}\nCase {n} {name}, entry {hx(target)}\nUnion of statically reachable caller blocks; branch predicates and unknown callees are not executed.\n\n'+'\n'.join(lines)+'\n')
 rows.append({'tag':n,'reflection_name':name,'target':hx(target),'pseudocode_lines':P[n],
  'observed_decisions_interpretation':decision,'explicit_parent_state_writes_interpretation':writes,
  'return_or_effect_construction_interpretation':effect,'anchors':checked,
  'reachable_blocks':[hx(a) for a in sorted(bs)],'unknown_cfg_successors':unknown,
  'reachable_instruction_count':len(addresses),'instruction_dump':str(path.relative_to(BASE)),
  'direct_calls':direct,'indirect_calls':indirect,'conditional_branches':branches,'raw_memory_stores':stores,
  'common_empty_like_tag2_return_reachable':0x1012a7894 in addresses})

queries=[
 {'priority':1,'addresses':['0x1012b05e8'],'question':'Bind M to its nominal state metadata/descriptor and reflect field names/types; decode F(k) offsets without guessing object offsets.','sites':['0x1012a58d0','0x1012a58d4']},
 {'priority':1,'addresses':['0x1006fa470','0x103788790','0x100596e80'],'question':'Resolve the dependency accessor/key and publisher-to-result wrapper behind raw-key0x31/0x32 writes; identify storage backend and whether execution is immediate or deferred. 0x103788790 is a data/mangled-type reference, not a function entry.','sites':['0x1012a5fd4','0x1012a5fd8','0x1012a5f3c','0x1012a5f40','0x1012a67b4','0x1012a67b8','0x1012a67bc','0x1012a6824']},
 {'priority':1,'addresses':['0x1012abe5c','0x1012aa084','0x1012b0288','0x1012b2a44'],'question':'Separate model application, paired history/cursor updates, emitted effects and actual persistence. Common apply helper is reached by update/append/IDE/reset/undo/redo.','sites':['0x1012a6390','0x1012a69c8','0x1012a7c1c','0x1012a6c08']},
 {'priority':2,'addresses':['0x1012b2b00','0x1012aeaf8','0x101165e98','0x10115cd48'],'question':'Bind model setter/append transformation, update classification mask2/3/5 and optional-model equality/coalescing before asserting undo grouping or saved content.','sites':['0x1012a6640','0x1012a6670','0x1012a68a4','0x1012a690c']},
 {'priority':2,'addresses':['0x100598344','0x1037887b0','0x1037887d0'],'question':'Resolve task/run-style construction and async closure descriptors for clipboard and conditional preview jobs. Inspect descriptor bytes before treating data addresses as code.','sites':['0x1012a61dc','0x1012a63a0']},
 {'priority':2,'addresses':['0x10059803c','0x1012b31d8','0x1012b35c8','0x1012a7ee4','0x1012ad570'],'question':'Resolve reload/initialize closures and two-result combination. Establish subscription, cancellation, replay and actual browser/side-effect execution separately.','sites':['0x1012a631c','0x1012a6110','0x1012a6124']},
 {'priority':2,'addresses':['0x103d7b260','0x103eb5228'],'question':'Decode direct payload0 reflection of outer Action to bind delegate enum and its tag4 nested navigation values0/1/3. Outer field1 record is0x103eb5234; field0 record is12 bytes earlier. Do not infer target action names solely from caller case names.','sites':['0x1012a6c48','0x1012a6c78','0x1012a76c8']},
 {'priority':3,'addresses':['0x1012a8ea4','0x1012a82d4','0x1012a93b0','0x1012a8178'],'question':'Complete removeZap/shuffle/IDE-appeared handling and report eligibility; caller alone delegates all substantial semantics.','sites':['0x1012a63f4','0x1012a6c18','0x1012a6cdc','0x1012a730c']},
 {'priority':3,'addresses':['0x1012b28a8','0x1011648b4','0x1011648bc','0x100576028'],'question':'Prove payload projection and distinguish model editing from direct IDE synchronization callback effects, including string field identities.','sites':['0x1012a6400','0x1012a790c','0x1012a7dfc']},
]
limits=[
 'Static caller observations only; target and libraries were not executed.',
 'Decompiler param_1/param_2, inferred types and extraout variables are not original Swift signatures. Assembly supplies the register/frame anchors.',
 'F(k)=S+signext32(*(M+k)); k is a load offset in M, NOT a numeric field offset in S. Nominal state type/field names are unproved until metadata is decoded.',
 'S is entry X0 saved at [X19+0xc0]; E is entry X8 saved at+0xc8; D is entry X20 saved at+0xb0. These are value/address identities, not concrete instance/lifetime ownership proofs.',
 'Calls to helper0x1012b28a8 precede payload reads; its projection/ownership contract is not proved by this caller-only note.',
 'No visible parent state store does not mean no side effects: helper and indirect-callback bodies remain unknown.',
 'Just/AnyPublisher and result tags prove construction in this caller; subscription, cancellation, actual clipboard/reload/network/file/preferences execution are not observed.',
 'Result discriminator2 is called empty-like by convention; nominal Effect type and its complete lifecycle are not independently proved here.',
 'The complete assembly/CFG inventory is separate from truncated high p-code: native_value_flow has3000 operations/truncated=true; trace page0 also reports provider truncation and call-depth omissions.',
 'Reachable block unions are syntactic CFG coverage, not claims that every listed branch is feasible or that traps/unknown callees return.',
]
output={'kind':'supplemental-offline-case-semantics','evidence_id':record['evidence_id'],'target_sha256':record['subject']['digest']['sha256'],
 'source':{'path':str(SRC.relative_to(BASE)),'sha256':hashlib.sha256(SRC.read_bytes()).hexdigest()},
 'instruction_evidence_id':inst_record['evidence_id'],'instruction_count':len(asm),'case_count':len(rows),'limitations':limits,'cases':rows,'focused_queries':queries}
(BASE/'case-map.json').write_text(json.dumps(output,indent=2)+'\n')
md=['# Arc reducer:28 recovered child cases','',f'Canonical source: `{record["evidence_id"]}`; {len(asm)} captured instructions,10072-byte contiguous caller body. This report is supplemental static interpretation, not a new REA+ record.','',
 'Machine anchors: incoming `X0` is saved at `[X19+0xc0]` (S), incoming `X8` at+0xc8 (E), and incoming `X20` at+0xb0 (D). The value returned by `0x1012b05e8` at `0x1012a58d0` is saved at+0xb8 (M). `F(k)` means `S + signext32(*(M+k))`; these keys are offsets in M, not object-layout offsets. Ghidra’s recovered C parameter names disagree with these ABI identities and are not used as type proof.','',
 'The most concrete persistence lead is a read/write-key pair: initialize calls an environment-derived getter with key0x32, stores returned bit0 in F(0x60); dismissJSWarningBanner writes F(0x60)=1 and calls a writer with(1,0x32). completeInterstitial similarly writes F(0x24)=1 and calls writer(1,0x31). These do not by themselves identify UserDefaults, a durable file, an instance, or when the publisher executes.','',
 '|Tag / reflected case|Target|Observed decision and visible parent write|Return/effect boundary|','|---|---|---|---|']
for r in rows:md.append(f'|{r["tag"]} `{r["reflection_name"]}`|`{r["target"]}`|{r["observed_decisions_interpretation"]} **Writes:** {r["explicit_parent_state_writes_interpretation"]}|{r["return_or_effect_construction_interpretation"]}|')
md+=['','## Source anchors and full caller inventories','',
 '[case-map.json](case-map.json) retains every direct callsite/target, indirect callsite, conditional branch, raw store and reachable block per case. [case-instructions](case-instructions/) contains per-case unions of complete captured caller instructions, including shared paths. Anchors are checked against the canonical assembly and marked if outside the case CFG; they are not silently treated as executed. [arc-reducer-pseudocode.txt](arc-reducer-pseudocode.txt) preserves the captured decompilation with line numbers referenced in JSON.','',
 '## Focused follow-ups','']
for q in queries:md.append(f'- Priority{q["priority"]}: '+', '.join('`'+a+'`' for a in q['addresses'])+'. '+q['question'])
md+=['','## Limits','']+['- '+s for s in limits]
(BASE/'case-map.md').write_text('\n'.join(md)+'\n')
print(json.dumps({'cases':len(rows),'instructions':len(asm),'outside_cfg_anchors':[{'tag':r['tag'],'anchor':a} for r in rows for a in r['anchors'] if not a['reachable_in_captured_cfg']],'unknown_successors':[{'tag':r['tag'],'successors':r['unknown_cfg_successors']} for r in rows if r['unknown_cfg_successors']]}))
