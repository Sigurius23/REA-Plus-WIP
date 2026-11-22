"""Supplemental query planning from exact original function starts and public targets."""
from pathlib import Path
import hashlib,json,struct,bisect
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1];INPUT=ROOT/'rea-local/.cache/arc-fixed-inputs-2026-11-13/Arc-arm64'
SHA='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';b=INPUT.read_bytes();digest=lambda x:hashlib.sha256(x).hexdigest();assert digest(b)==SHA
segments=[];p=32;carrier=None;section=None
for _ in range(struct.unpack_from('<I',b,16)[0]):
 cmd,size=struct.unpack_from('<II',b,p)
 if cmd==0x19:
  name=b[p+8:p+24].rstrip(b'\0');vm,vs,fo,fs=struct.unpack_from('<QQQQ',b,p+24);segments.append((vm,fo,fs))
  if name==b'__TEXT':base=vm
  for i in range(struct.unpack_from('<I',b,p+64)[0]):
   q=p+72+i*80
   if b[q:q+16].rstrip(b'\0')==b'__text' and b[q+16:q+32].rstrip(b'\0')==b'__TEXT':section=struct.unpack_from('<QQI',b,q+32)
 if cmd==0x26:carrier=struct.unpack_from('<II',b,p+8)
 p+=size
assert carrier and section
starts=[];p,end=carrier[0],sum(carrier);a=base
while p<end:
 value=shift=0
 while True:
  c=b[p];p+=1;value|=(c&127)<<shift;shift+=7;assert shift<=64
  if c<128:break
 if not value:break
 a+=value;starts.append(a)
assert starts==sorted(set(starts))
startset=set(starts)
def original(a,n):
 hit=[fo+a-vm for vm,fo,fs in segments if vm<=a and a+n<=vm+fs];assert len(hit)==1;return b[hit[0]:hit[0]+n]
def boundary(a):
 assert a in startset,hex(a);i=bisect.bisect_left(starts,a);e=starts[i+1];sv,sz,so=section;assert sv<=a<e<=sv+sz;raw=original(a,e-a)
 return {'entry':hex(a),'next_indexed_entry':hex(e),'file_offset':so+a-sv,'bytes':len(raw),'sha256':digest(raw)}
def signed(x,bits):return x-(1<<bits) if x&(1<<(bits-1)) else x
def references(a):
 bound=boundary(a);raw=original(a,bound['bytes']);refs=[];words=list(struct.unpack('<'+'I'*(len(raw)//4),raw))
 for i,w in enumerate(words):
  pc=a+4*i;target=None;kind=None
  if w&0x7c000000==0x14000000:target=pc+(signed(w&0x3ffffff,26)<<2);kind='original-BL' if w&0x80000000 else 'original-B'
  elif w&0x9f000000==0x10000000:target=pc+signed(((w>>5)&0x7ffff)<<2|((w>>29)&3),21);kind='original-ADR-code-candidate'
  elif w&0x9f000000==0x90000000 and i+1<len(words):
   v=words[i+1];reg=w&31
   if v&0xff800000==0x91000000 and (v>>5)&31==reg and v&31==reg:
    target=(pc&~4095)+(signed(((w>>5)&0x7ffff)<<2|((w>>29)&3),21)<<12)+(((v>>10)&4095)<<(12 if v&(1<<22) else 0));kind='original-adjacent-ADRP-ADD-code-candidate'
  if target in startset:refs.append({'at':hex(pc),'target':hex(target),'kind':kind})
 return bound,refs



prior=ROOT/'field-tests/arc-storage-features-2026-11-22/storage-policy-seeds-2491.tsv';data=prior.read_bytes();lines=data.decode().splitlines();known={int(x.split('\t')[0],16) for x in lines}
roots={0x100dc4378:'field-tests/arc-storage-features-2026-11-22/mcp/0x100dbb45c-read_function_instructions.evidence.json',0x100dc1ff8:'field-tests/arc-storage-features-2026-11-22/mcp/0x100dbe848-read_function_instructions.evidence.json',0x100dc2270:'field-tests/arc-storage-features-2026-11-22/mcp/0x100dbe848-read_function_instructions.evidence.json',0x100dc1658:'field-tests/arc-storage-features-2026-11-22/mcp/0x100dbe848-read_function_instructions.evidence.json',0x1012aad50:'field-tests/arc-callbacks-2026-11-21/mcp/function-0x1012bb1f8-read_function_instructions.evidence.json',0x1012ab17c:'field-tests/arc-callbacks-2026-11-21/mcp-storage/function-0x1012bb248-read_function_instructions.evidence.json',0x1012bb254:'field-tests/arc-callbacks-2026-11-21/mcp-storage/function-0x1012aaf6c-read_function_instructions.evidence.json'}
origins=[]
for a,source in roots.items():
 p=ROOT/source;e=json.loads(p.read_text());assert e['subject']['digest']['sha256']==SHA;body=e['normalized_result'];entry=int(body['procedure']['address'],16);pcs={int(l.split(':',1)[0],16) for l in body['instructions']};_,source_refs=references(entry);matches=[ref for ref in source_refs if int(ref['target'],16)==a and int(ref['at'],16) in pcs];assert matches,(hex(a),source);origins.append({'entry':hex(a),'boundary':boundary(a),'source':source,'original_reference_candidates':matches,'sha256':digest(p.read_bytes()),'evidence_id':e['evidence_id'],'authority':'Public direct call/code-address candidate; original indexed interval is not a provider-owned body proof.'})
front=set(roots);known|=front;scanned=[];levels=[]
for depth in [1,2]:
 found=set()
 for a in sorted(front):
  bound,refs=references(a);scanned.append({'depth':depth,'interval':bound,'references':refs});found|={int(x['target'],16) for x in refs}-known
 known|=found;front=found;levels.append({'depth':depth,'added':list(map(hex,sorted(found)))})
assert len(known)-len(lines)<128
result=('\n'.join(sorted(set(lines)|{hex(a)+'\tfunction' for a in known},key=lambda x:int(x.split('\t')[0],16)))+'\n').encode();seed=OUT/f'restore-preview-seeds-{len(known)}.tsv';seed.write_bytes(result);receipt={'status':'passed','target_sha256':SHA,'prior_seed_sha256':digest(data),'seed':{'path':str(seed.relative_to(ROOT)),'sha256':digest(result),'entries':len(known)},'origins':origins,'levels':levels,'scanned':scanned,'target_executed':False,'limits':['Supplemental query planning from exact original function starts and two bounded direct/code-address reference levels.','Seeded entries are caller assertions, not provider discovery or active dispatch proof.','Old captures/source/runtime unchanged; no neighborhood or unresolved indirect target admission.']};(OUT/'overlay-receipt.json').write_text(json.dumps(receipt,indent=2)+'\n');print(json.dumps({'status':'passed','entries':len(known),'added':len(known)-len(lines),'seed':str(seed)}))
