"""Recheck declared selected-path facts; no target execution or provider launch."""
from pathlib import Path
import hashlib,json
OUT=Path(__file__).resolve().parent;ROOT=OUT.parents[1];OLD=ROOT/'field-tests/arc-features-used-2026-11-21';CALLBACK=ROOT/'field-tests/arc-callbacks-2026-11-21'
sha=lambda b:hashlib.sha256(b).hexdigest()
def e(p):return json.loads(p.read_text())
def v(p):return e(p)['normalized_result']
def here(label):return OUT/'mcp'/(label+'.evidence.json')
def first(label):return OLD/'mcp'/(label+'.evidence.json')
def text(label):return bytes.fromhex(v(here(label))['bytes_hex']).split(b'\0')[0].decode()
for l,expected in [('backup-copy-selector','copyItemAtURL:toURL:error:'),('temporary-remove-selector','removeItemAtURL:error:'),('backup-date-selector','stringFromDate:'),('backup-attributes-selector','setAttributes:ofItemAtPath:error:'),('backup-set-locale-selector','setLocale:'),('backup-set-timezone-selector','setCalendar:'),('backup-date-format-setter-selector','setDateFormat:'),('backup-date-format-literal','yyyy-MM-dd-HH-mm-ss-SSS'),('fallback-version-name','StorableVersion'),('fallback-version-field-name','version')]:assert text(l)==expected,(l,text(l))
for l,expected in [('features-write-selector','setData:merge:completion:'),('features-value-type-mangle','SaySSG'),('features-patch-element-type-mangle','SS_SaySSGt'),('synchronize-selector','synchronizeAndReturnError:'),('close-file-selector','closeAndReturnError:')]:assert bytes.fromhex(v(first(l))['bytes_hex']).split(b'\0')[0].decode()==expected
assert bytes.fromhex(v(here('fallback-version-field-type'))['bytes_hex']).startswith(b'Si\0')
assert bytes.fromhex(v(here('storable-error-case-names'))['bytes_hex']).startswith(b'versionOutdated\0dataLoadFailed\0')
for label,name in [('font','BoostFont'),('transform','BoostTextTransform'),('zoom','BoostTextZoom'),('color','BoostColorScheme')]:assert text(label+'-type-name')==name
assert v(here('version-policy-0x100003ae8'))['instructions']==['0x100003ae8: mov x0, #0x0','0x100003aec: ret']
assert v(here('version-policy-0x1004fe554'))['instructions']==['0x1004fe554: ldr x0, [x20]','0x1004fe558: ret']
w=bytes.fromhex(v(here('boosts-storable-witness-table'))['bytes_hex']);assert [int.from_bytes(w[i:i+8],'little') for i in [0x20,0x28,0x30]]==[0x100003ae8,0x1004a9e48,0x1004fe554]
inst=[]
for f in sorted((OUT/'mcp').glob('witness-instantiator-byte-*.evidence.json')):inst.append(v(f)['raw_disassembly'])
assert [l for l in inst if l.startswith('str ')]==['str x0,[x19, #0x8]','str x0,[x19, #0x10]','str x0,[x19, #0x18]']
worker=v(first('0x10117d92c-read_function_instructions'))['instructions'];assert '0x10117d9f0: mov w3, #0x1' in worker;assert '0x10117d9f4: bl 0x103661fe0' in worker
for a,anchor in [('0x10117da68','0x10117da88: mov x20, #0x0'),('0x10117da9c','0x10117dac8: ldr x20, [x22, #0xa8]')]:assert anchor in v(first(a+'-read_function_instructions'))['instructions']
# All possible byte values, and the separate saturated parent-tag cases.
assert all(((0 if t<=2 else t-2)==1)==(t==3) for t in range(256))
for q in [0,1,2,0xfffffffe,0xffffffff,0x100000000,0xffffffffffffffff]:assert (((min(q,0xffffffff)+1)&0xffffffff)==1)==(q==0)
claims=[]
def claim(name,kind,paths):
 rows=[]
 for p in paths:
  d=e(p);assert d['subject']['digest']['sha256']=='6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578';rows.append({'path':str(p.relative_to(ROOT)),'sha256':sha(p.read_bytes()),'evidence_id':d['evidence_id']})
 claims.append({'claim':name,'kind':kind,'sources':rows})
claim('features payload/merge/async completion','selected static path',[CALLBACK/'mcp-finish/function-0x10117d64c-read_function_instructions.evidence.json',first('0x101160524-read_function_instructions'),first('0x101171dbc-read_function_instructions'),first('0x10117d92c-read_function_instructions'),first('features-write-selector'),first('0x10117d748-read_function_instructions'),first('0x10117da68-read_function_instructions'),first('0x10117da9c-read_function_instructions')])
# The shared callback lives in the earlier persistence checkpoint; retain its true path.
callback=ROOT/'field-tests/arc-persistence-2026-11-20/mcp-firebase-2026-11-21/implementation-0x10117d13c-read_function_instructions.evidence.json';claim('shared Firebase completion callback','retained static callback',[callback])
claim('selected witness/current version','normal Swift instantiation premise',[CALLBACK/'mcp/conformances-StorableBoostsData.evidence.json',here('boosts-storable-witness-table'),here('version-policy-0x100003ae8'),here('version-policy-0x1004a9e48'),here('version-policy-0x1004fe554'),CALLBACK/'mcp-io/function-0x100dbc4ac-read_function_instructions.evidence.json'])
claim('version-only fallback diagnosis','static instructions/metadata',[first('0x100dc5290-read_function_instructions'),here('fallback-version-descriptor'),here('fallback-version-name'),here('fallback-version-field-type'),here('storable-error-case-names')])
claim('read backup flag and original-error return','conditional physical guards',[CALLBACK/'mcp-leaf/function-0x100dbf0d8-read_function_instructions.evidence.json',first('0x100dbcd60-read_function_instructions')])
claim('local empty-set fallback and save error boundary','selected caller path',[here('0x101182bd0-read_function_instructions'),CALLBACK/'mcp/function-0x101182d1c-read_function_instructions.evidence.json'])
claim('backup naming/copy/attributes','static API requests',[here('0x100dc1490-read_function_instructions'),here('backup-copy-selector'),here('0x100dc4684-read_function_instructions'),here('backup-attributes-selector'),here('backup-date-format-literal'),here('backup-date-format-setter-selector')])
claim('file synchronization and cleanup','static requests, not durability',[CALLBACK/'mcp-io/function-0x100dc4860-read_function_instructions.evidence.json',first('synchronize-selector'),first('close-file-selector'),first('0x100dbe40c-read_function_instructions'),here('temporary-remove-selector')])
claim('empty selected retention schedule','bounded policy loop',[first('0x100dbd538-read_function_instructions'),here('version-policy-0x1004a9e48')])
r={'status':'passed','date':'2026-11-22','target_sha256':'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578','claims':claims,'target_executed':False,'feature_labels':['css','js','font','textTransform','textZoom','zaps','colorScheme'],'expected_version_word':0,'default_backup_format':'yyyy-MM-dd-HH-mm-ss-SSS','limitations':['Selected shipped implementations and normal ABI/storage premises; no active injection, filesystem/service result or durability observed.','Witness pattern holes are not runtime values; the observed instantiator writes only the inherited holes.','Generic error-register uncertainties remain explicit; physical branch facts are used instead of omitted pseudocode branches.','Restore ordering/caller writeback and the full Arc feature set remain incomplete.']}
(OUT/'fact-index.json').write_text(json.dumps(r,indent=2)+'\n');print(json.dumps({'status':'passed','claims':len(claims)}))
