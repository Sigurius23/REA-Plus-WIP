"""Two concrete branch derivations, not general jump-table recovery/emulation."""
from derive_bindings import OUT,SHA,region,evidence
import json
import struct
m='mcp-implementations-2026-11-21'
_,table,table_id=region(m,'setting-raw-key-switch-table')
selected=[]
for tag,label,word,tail,literal,method in [
    (49,'boosts-interstitial',947,0x1005ab7c8,0x1039d11b0,'hasDismissedBoostsInterstitial'),
    (50,'js-warning',134,0x1005ab800,0x1039d1190,'hasDismissedJSWarningBanner')]:
    assert struct.unpack_from('<H',table,tag*2)[0]==word
    target=0x1005aa61c+word*4
    address,code,code_id=region(m,f'setting-raw-key-{tag}-target-bytes')
    assert address==target
    adrp,add,branch=struct.unpack_from('<III',code)
    assert adrp&0x9f00001f==0x90000008 and add&0xffc003ff==0x91000108
    imm=((adrp>>5)&0x7ffff)<<2|((adrp>>29)&3)
    if imm&0x100000:imm-=0x200000
    pointer=(target&~4095)+(imm<<12)+((add>>10)&4095)
    assert pointer==literal
    assert branch&0xfc000000==0x14000000
    rel=branch&0x3ffffff
    if rel&0x2000000:rel-=0x4000000
    assert target+8+rel*4==tail
    _,ret,return_id=region(m,label+'-key-return')
    words=struct.unpack_from('<6I',ret)
    assert words[:4]==(0xd1008108,0xb2410101,0xd2800388,0xf2fa0008)
    assert words[5]==0xd65f03c0
    # Exact straight-line forms: String UTF8 pointer-32, static object flag,
    # count word0xd00000000000001c, then OR2 / SUB1 and RET.
    assert words[4]==(0xb27f0100 if tag==49 else 0xd1000500)
    count=30 if tag==49 else 27
    _,text,text_id=region(m,label+'-preference-key')
    key=text.split(b'\0',1)[0].decode()
    assert key==method and len(key)==count
    selected.append({'tag':hex(tag),'table_entry_address':hex(0x1036db410+tag*2),'halfword':word,'anchor':'0x1005aa61c','target':hex(target),'literal_utf8_address':hex(literal),'return_tail':hex(tail),'key':key,'utf8_length':count,'derived_string_registers':{'x0':hex(0xd000000000000000|count),'x1':hex((literal-32)|0x8000000000000000)},'evidence_ids':[table_id,code_id,return_id,text_id]})
selectors={}
for label,expected in [('defaults-suite-init-stub-selector-slot-name','initWithSuiteName:'),('defaults-standard-stub-selector-slot-name','standardUserDefaults'),('defaults-get-bool-stub-selector-slot-name','boolForKey:'),('defaults-set-bool-selector-name','setBool:forKey:')]:
    address,data,eid=region(m,label);actual=data.split(b'\0',1)[0].decode();assert actual==expected;selectors[expected]={'address':hex(address),'evidence_id':eid}
result={'target_sha256':SHA,'selected_branches':selected,'objc_selectors':selectors,'interpretation':'The selected UserDefaultsClient default reader/writer path converts Setting tags0x31/0x32 to these exact keys. The writer callback reaches NSUserDefaults.setBool:forKey:; the reader reaches boolForKey:.','limits':['Only two concrete input branches were derived. The public analyzer still reports zero recovered tables and56body bytes for this anonymous converter.','No generic bound was inferred from the 0xffff mask or neighboring bytes.','Default implementation selection, publisher callback invocation, filesystem flush and installed-profile state remain unobserved.','This is static instruction arithmetic and literal inspection, not target execution or CPU emulation.']}
(OUT/'selected-preference-path.json').write_text(json.dumps(result,indent=2)+'\n')
print(json.dumps({'status':'passed','keys':[x['key'] for x in selected],'selectors':list(selectors)}))
