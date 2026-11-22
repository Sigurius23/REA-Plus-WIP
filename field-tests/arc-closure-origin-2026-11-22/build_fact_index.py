"""Record observations separately from conditional selected-call deductions."""
from pathlib import Path
import hashlib,json
O=Path(__file__).resolve().parent;R=O.parents[1]
records=[]
for name in [
 'mcp-arc-final/call-0x1012ab840.evidence.json',
 'mcp-arc-final/call-0x100d910f0.evidence.json',
 'mcp-arc-final/client-metadata.evidence.json',
 'mcp-arc-final/setting-helper.evidence.json',
 'mcp-arc-final/reducer-summary.evidence.json',
 'mcp-initial/enum-accessor.evidence.json',
 'mcp-initial/enum-vwt.evidence.json',
 'mcp-initial/odd-caller-instructions.evidence.json',
 'mcp-initial/odd-call-targets.evidence.json',
 'mcp-roots/instructions-0x1000078a4.evidence.json',
 'mcp-roots/instructions-0x1006fa470.evidence.json',
]:
 p=O/name;b=p.read_bytes();e=json.loads(b)
 assert e['subject']['digest']['sha256']=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
 records.append({'path':str(p.relative_to(R)),'sha256':hashlib.sha256(b).hexdigest(),'evidence_id':e['evidence_id'],'operation':e['operation'],'profile_digest':e['analysis_profile']['digest'] if e['analysis_profile'] else None})
premises=[
 'Execution reaches the selected call through the exact retained fallthrough suffix; hidden bypass entries and reachability remain unproved.',
 'The buffer supplied to the exact Client VWT destroy is valid live disjoint Client storage under the normal VWT and stable metadata contract.',
 'The selected field pair remains stable between its load and the destroy/source-type anchor; retaining a context is not assumed pure.',
 'The selected typed field obeys its valid normal one-argument synchronous native Swift closure ABI with ordinary preserved-register contracts.',
]
index={
 'version':1,'scope':'Analyst checkpoint of selected call observations and conditional ABI discrimination, not a production typed-invocation mapping carrier',
 'complete':False,'subject_sha256':records[0] and '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578',
 'evidence_records':records,
 'selected_call':{'address':'0x1012ab840','function':'0x1012ab5c8','target_register':'x23','context_register':'x20','constant_observation':{'register':'x0','value_hex':'0x31','write_bits':32,'definition_address':'0x1012ab838','scope':'observed-fallthrough-suffix'}},
 'type_anchor':{'status':'conditional','pair_load':'0x1012ab824','source_buffer':'X22+0x10','destroy_wrapper':'0x1000078a4','client_metadata':'0x1042c8ac0','field_ordinal':0,'field_byte_offset':0,'declaration':'@Sendable (ArcUserDefaultSettings) -> Bool','enum_descriptor':'0x103d41568'},
 'enum_layout':{'metadata_accessor':'0x1005ad394','metadata':'0x10426d770','value_witness_table':'0x10426d6f0','size_bytes':2,'stride_bytes':2,'alignment_bytes':2,'flags_hex':'0x00200001','supplement':'original-pointer-observations.json','supplement_is_public_mcp_evidence':False},
 'selected_abi':{'status':'conditional-discrimination','argument':'direct enum value under named premises; 49 cannot be a valid two-byte-aligned indirect enum pointer','premises':premises,'unconditional_argument_abi':'unresolved','metadata_argument_abi':'unresolved'},
 'default_code_origin':{'status':'unresolved','candidate_constructor':'0x100d92a28','candidate_field_code':'0x100d92ebc','not_bound_to_selected_call':True},
 'open_obligations':['Selected code/context origin and relevant field stability','Unchanged selected argument forwarding to the exact converter','Observation-only per-invocation mapping producer; no helper-global 297-case CFG/type override','Actual runtime dependency selection and broader Arc behavior'],
 'call_preparation_program_mutations':False,'target_executed':False,
}
(O/'fact-index.json').write_text(json.dumps(index,indent=2)+'\n')
print(json.dumps({'evidence_records':len(records),'complete':False,'selected_abi':'conditional-discrimination'}))
