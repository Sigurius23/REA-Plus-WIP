import hashlib, json, struct
from pathlib import Path
from datetime import datetime, timezone

root = Path(__file__).resolve().parent
checks = []
def evidence(folder, label):
    return json.loads((root/folder/(label+".evidence.json")).read_text())
def check(name, condition, records):
    assert condition, name
    checks.append({"finding":name,"passed":True,"source_evidence":[r["evidence_id"] for r in records]})
def asm(record):
    return "\n".join(record["normalized_result"]["assembly"])

init=evidence("initialization","helper-0x1012d2e5c")
project=evidence("store","store-0x1012d3200")
construct=evidence("dispatch","dispatch-0x1008c784c")
send=evidence("send","send-0x1008ca400")
send_body=evidence("send","send-0x1008c7c34")
core=evidence("core","store-send-core")
urls=evidence("core","editor-url-prefixes")
url_builder=evidence("initialization","helper-0x1012d3b04")
mode_sink=evidence("initialization","helper-0x1012d4dc0")
state_sink=evidence("send","send-0x1008c7ce8")
offsets=evidence("core","editor-property-offsets")
base=int(offsets["normalized_result"]["address"],16)
words=bytes.fromhex(offsets["normalized_result"]["bytes_hex"])
for address,expected in [(0x1046282e0,16),(0x1046282e8,24),(0x1046282f0,32),(0x1046282f8,48),(0x104628310,8)]:
    check("stored property offset "+hex(address),struct.unpack_from("<Q",words,address-base)[0]==expected,[offsets])
check("initializer stores view-store constructor result through the same 0x104628310 field used by the prior handler",all(t in asm(init) for t in ["0x1012d2f44: bl 0x1008c7378","0x1012d2f4c: ldr x8, [x8, #0x310]","0x1012d2f50: str x0, [x23, x8#0x0]"]),[init])
check("initializer supplies state projection 0x1012d3200",all(t in asm(init) for t in ["0x1012d2f34: adrp x1, 0x1012d3000","0x1012d2f38: add x1, x1, #0x200"]),[init])
check("projection copies state fields, and is not evidence of action effects","param_1[3] = uVar7" in project["normalized_result"]["pseudocode"],[project])
check("view-store constructor installs send closure at +0x28",all(t in asm(construct) for t in ["0x1008c79f0: add x8, x8, #0x400","0x1008c79f4: stp x8, x0, [x19, #0x28]"]),[construct])
check("view-store send closure captures original store at context +0x18","*(long **)(puVar3 + 0x18) = param_1" in construct["normalized_result"]["pseudocode"],[construct])
check("send closure forwards to concrete store-send core","func_0x00010088d940" in send["normalized_result"]["pseudocode"] and "bl 0x10088d940" in asm(send_body),[send,send_body])
check("generic send loop retains action append and stored witness call",all(t in asm(core) for t in ["0x10088dbd4: bl 0x103639d6c","0x10088de88: blr x9"]),[core])
resolved=evidence("core","stored-reducer-call-targets")
check("stored witness target remains explicitly unresolved",resolved["normalized_result"]["status"]=="unresolved" and resolved["normalized_result"]["targets"]==[],[resolved])
instructions=evidence("core","core-instructions")
check("complete observed send body has 806 instructions / 3224 bytes",len(instructions["normalized_result"]["instructions"])==806 and core["normalized_result"]["procedure"]["body"]["total_bytes"]==3224,[instructions,core])
flow=core["normalized_result"]["native_value_flow"]
check("high-pcode omission remains explicit",flow["truncated"] is True and flow["known_omitted_edges"]>0,[core])
strings=bytes.fromhex(urls["normalized_result"]["bytes_hex"])
check("exact shipped CSS and JavaScript URL prefixes",strings.startswith(b"arc://boost/v2/js/\0") and strings[32:].startswith(b"arc://boost/v2/css/\0"),[urls])
check("URL selection excludes raw state values 2 and 3",all(t in asm(url_builder) for t in ["sub w9, w8, #0x2","cmp w9, #0x2","b.cs 0x1012d3bb8","cmp w8, #0x1"]),[url_builder])
check("weak callback handles raw state 2/3 and clears both caches",all(t in asm(mode_sink) for t in ["and w8, w20, #0xfe","cmp w8, #0x2","0x1012d353c: stp xzr, xzr, [x8]","0x1012d3554: stp xzr, xzr, [x8]"]),[mode_sink])
check("state sink emits observable object notification","Combine25ObservableObjectPublisherC4sendyyF" in state_sink["normalized_result"]["pseudocode"],[state_sink])
sessions=[]
for folder in ["discovery","methods","initialization","store","dispatch","send","core","value-trace"]:
    summary=json.loads((root/folder/"summary.json").read_text())
    assert summary["status"]=="completed", folder
    lineage=summary["verifier_run"]["process_lineage"]
    assert lineage["status"]=="verified" and lineage["descendants"]==[], folder
    invocations=json.loads((root/folder/"invocations.json").read_text())
    errors=[x for x in invocations if x["is_error"] or x["thrown"]]
    if folder=="discovery":
        assert len(errors)==4
        for row in errors:
            reply=json.loads((root/folder/row["reply"]).read_text())
            error=json.loads(reply["content"][0]["text"])["error"]
            assert error["code"]=="invalid_request" and "No procedure exists" in error["details"]["issues"][0]["message"]
    else: assert not errors, (folder,errors)
    for row in invocations:
        if "evidence_id" in row:
            record=json.loads((root/folder/row["reply"]).read_text())["structuredContent"]
            assert record["subject"]["digest"]["sha256"]=="6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578"
            profile=record["analysis_profile"]
            while "upstream_analysis_profile" in profile["parameters"]:
                profile=profile["parameters"]["upstream_analysis_profile"]
            assert profile["parameters"]["analysis_timeout_seconds"]==1
            if record["operation"]!="inspect_native_dispatch_metadata":
                assert any("analysis_complete=false; analysis_timed_out=true" in x for x in record["limitations"])
    sessions.append({"folder":folder,"calls":summary["calls"],"successes":summary["successful"],"errors":summary["errors"],"closed_owned_descendants":[]})
result={"status":"passed","checked_at":datetime.now(timezone.utc).isoformat(),"scope":"Assertions over retained public observations; not runtime behavior or new implementation tests", "findings":checks,"sessions":sessions,"calls":sum(s["calls"] for s in sessions),"successes":sum(s["successes"] for s in sessions),"errors":sum(s["errors"] for s in sessions)}
(root/"findings-verification.json").write_text(json.dumps(result,indent=2)+"\n")
print(json.dumps({k:v for k,v in result.items() if k not in ["findings","sessions"]}|{"finding_checks":len(checks)}))
