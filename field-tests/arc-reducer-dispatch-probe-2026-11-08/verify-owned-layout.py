import json,struct,hashlib
from pathlib import Path

root=Path(__file__).resolve().parent
record=json.loads((root/"variants.json").read_text())["records"][0]
image=Path(record["binary"]["path"]).read_bytes()
assert hashlib.sha256(image).hexdigest()==record["binary"]["sha256"]
segments=[];sections=[];symbols=[];symtab=None;indirect=None;at=32
for _ in range(struct.unpack_from("<I",image,16)[0]):
    command,size=struct.unpack_from("<II",image,at)
    if command==0x19:
        segments.append(struct.unpack_from("<QQQQ",image,at+24))
        for index in range(struct.unpack_from("<I",image,at+64)[0]):
            p=at+72+index*80
            sections.append({"name":image[p:p+16].split(bytes([0]))[0].decode(),"address":struct.unpack_from("<Q",image,p+32)[0],"size":struct.unpack_from("<Q",image,p+40)[0],"offset":struct.unpack_from("<I",image,p+48)[0],"indirect_start":struct.unpack_from("<I",image,p+68)[0],"stub_size":struct.unpack_from("<I",image,p+72)[0]})
    if command==2:symtab=struct.unpack_from("<IIII",image,at+8)
    if command==0xb:indirect=struct.unpack_from("<I",image,at+56)[0]
    at+=size
assert symtab and indirect
def string(offset):return image[offset:image.index(0,offset)].decode()
for index in range(symtab[1]):
    p=symtab[0]+index*16;symbols.append({"name":string(symtab[2]+struct.unpack_from("<I",image,p)[0]),"address":struct.unpack_from("<Q",image,p+8)[0]})
def offset(address,length=4):
    for vmaddr,vmsize,fileoff,filesize in segments:
        if vmaddr<=address and address+length<=vmaddr+filesize:return fileoff+address-vmaddr
    raise AssertionError(hex(address))
def word(address):return struct.unpack_from("<I",image,offset(address))[0]
def signed(value,bits):return value-(1<<bits) if value&(1<<(bits-1)) else value
def symbol(suffix):
    matches=[x for x in symbols if x["name"].endswith(suffix)];assert len(matches)==1,suffix;return matches[0]["address"]
def stub(address):
    section=next(s for s in sections if s["name"]=="__stubs" and s["address"]<=address<s["address"]+s["size"])
    i=section["indirect_start"]+(address-section["address"])//section["stub_size"]
    return symbols[struct.unpack_from("<I",image,indirect+i*4)[0]]["name"]
entry=symbol("11probeReduceySiAA0A6ActionO_SitF");descriptor=symbol("0A5ChildOMn");accessor=symbol("0A5ChildOMa")
assert word(descriptor)&31==18
payloads=word(descriptor+20)&0xffffff;empty=word(descriptor+24);assert (payloads,empty)==(18,12)
assert descriptor+12+struct.unpack_from("<i",image,offset(descriptor+12))[0]==accessor
branches=[a for a in range(entry,accessor,4) if word(a)==0xd61f0100 and word(a-4)==0x8b090108 and word(a-8)==0xb8ab7949]
assert branches==[0xae4]
dispatch=branches[0];page_at=dispatch-20;w=word(page_at);page=(page_at&~4095)+signed((((w>>5)&0x7ffff)<<2)|((w>>29)&3),21)*4096
add=word(page_at+4);table=page+((add>>10)&0xfff);adr_at=dispatch-12;w=word(adr_at);anchor=adr_at+signed((((w>>5)&0x7ffff)<<2)|((w>>29)&3),21)
assert table==0x11c0 and anchor==0xad8
rows=[]
for i in range(payloads+empty):
    target=anchor+struct.unpack_from("<i",image,offset(table+4*i))[0];w=word(target+4);assert w>>26==0x25
    called=target+4+signed(w&0x3ffffff,26)*4;name=stub(called);assert name==f"_probe_case_{i}",(i,name)
    rows.append({"case":i,"entry":hex(target),"callee":name})
result={"status":"passed","authority":"independent source-built Mach-O/ABI layout oracle, not REA+ output or target execution", "binary":record["binary"],"entry":hex(entry),"descriptor":hex(descriptor),"accessor":hex(accessor),"payloads":payloads,"empty":empty,"dispatch":hex(dispatch),"table":hex(table),"anchor":hex(anchor),"entry_width":4,"entries_signed":True,"cases":rows}
(root/"owned-layout-oracle.json").write_text(json.dumps(result,indent=2)+"\n");print(json.dumps({k:result[k] for k in ["status","entry","dispatch","table","payloads","empty"]}))
