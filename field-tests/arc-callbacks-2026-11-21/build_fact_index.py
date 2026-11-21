"""Bind the narrative's selected static routes to immutable public Evidence."""
from pathlib import Path
import hashlib,json
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1]
SHA='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'
groups=[
 ('editor_save_create_preview','Conditional editor mutation creates effects for createBoost, setBoostData and local preview generation.',['0x1012abe5c','0x1012a93b0','0x1012a9b80','0x1012aa9a4','0x1012a99a8','0x1012aab40']),
 ('json_getter','The selected callback passes local ID membership to the dictionary converter; missing/invalid primary data produces doesNotExist.',['0x10118374c','0x101183510','0x101180780','0x10115ae9c']),
 ('json_encoder','The remote dictionary encoder serializes InternalData as a JSON String and isActive as a true/false String.',['0x10115b98c']),
 ('javascript_activation','Stored active flag is gated by local membership or absence of nonblank JS; caught local-read error supplies empty Set.',['0x101159db4','0x10115a958','0x101159224','0x10080fc90','0x100250910','0x10117ff84','0x1011867b0']),
 ('alternate_setter','New local insertion first serializes isActive=false, then after first merge success serializes the original; both primary merge error paths forward x20.',['0x101182d1c','0x10117d424','0x101158eb0','0x10117d4fc','0x10117d570','0x10117d818','0x10117d5d8','0x10117d64c','0x10117d86c']),
 ('local_json_store','The typed StorableBoostsData factory captures a generic JSON store with synchronous queue wrappers and temporary-file replacement write code.',['0x10118c418','0x100db8d80','0x100dbb534','0x100dbb2d4','0x100db8ec0','0x100dc532c','0x100dc52cc','0x100dc00ec','0x100dbc6c4','0x100dbf0d8','0x100dbc4ac','0x100dbc858','0x100dc4860']),
 ('preview_callback_boundary','The preview callback reaches a captured object-method slot +0x2e8; concrete method identity and pixels remain unresolved.',['0x1012aade8','0x1012aaf6c','0x1012bb248'])]
facts=[]
for key,claim,addresses in groups:
 sources=[]
 for a in addresses:
  candidates=list(OUT.glob('mcp*/*'+a+'-read_function_instructions.evidence.json'));assert candidates,(key,a)
  # Prefer the latest complete session when the same physical procedure was reread.
  rank={'mcp':0,'mcp-storage':1,'mcp-finish':2,'mcp-leaf':3,'mcp-io':4};f=max(candidates,key=lambda p:rank[p.parent.name]);data=f.read_bytes();j=json.loads(data);assert j['subject']['digest']['sha256']==SHA;assert j['operation']=='read_function_instructions'
  sources.append({'procedure':a,'path':str(f.relative_to(ROOT)),'evidence_id':j['evidence_id'],'sha256':hashlib.sha256(data).hexdigest()})
 facts.append({'id':key,'classification':'derived-static-selected-path','claim':claim,'sources':sources})
result={'kind':'arc-callback-and-local-store-static-fact-index','date':'2026-11-21','target_sha256':SHA,'facts':facts,'interpretation_limits':['Static dependency presence does not select the active runtime injection.','Callback/request construction does not establish invocation, remote success, durability, runtime activation or visible behavior.','JSON store path resolution, version/migration and backup/error details remain incomplete.','Imported API names support selected call sites; unnamed ObjC stubs remain unnamed.']}
(OUT/'fact-index.json').write_text(json.dumps(result,indent=2)+'\n')
print(json.dumps({'facts':len(facts),'source_bindings':sum(len(x['sources']) for x in facts)}))
