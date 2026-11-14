import hashlib,json
from pathlib import Path
from datetime import datetime,timezone

root=Path(__file__).resolve().parent
checks=[]
def load(folder,label):return json.loads((root/folder/(label+".evidence.json")).read_text())
def check(name,condition,evidence):
    assert condition,name
    checks.append({"finding":name,"passed":True,"evidence":evidence})
for query in ["app-name","tab-listener","gdocs-script","arc-internal"]:
    next_offset=0; examined=0; ids=[]; skips=[]
    for offset in range(0,6144,1024):
        ev=load("discovery",f"{query}-{offset}");data=ev["normalized_result"]
        assert offset==next_offset and data["coverage"]["window"]=="complete"
        assert data["canonical_resources"]==5439 and data["alias_resources"]==382
        examined+=data["page"]["examined"];next_offset=data["page"]["next_canonical_offset"]
        skips.extend(data["skipped"]);ids.append(ev["evidence_id"])
    check("complete selected-query canonical windows: "+query,examined==5439 and next_offset is None and not skips,ids)
for entry in json.loads((root/"decoded-origins.json").read_text()):
    file=Path(entry["path"]);check("exact decoded-byte materialization "+str(entry["resource_id"]),hashlib.file_digest(file.open("rb"),"sha256").hexdigest()==entry["decoded_sha256"],[entry["source_evidence"]])
manifest=json.loads((root/"decoded/resource-15548.json").read_text());sc=manifest["content_scripts"][0]
check("Google Docs declared frame/timing/path scope",sc["all_frames"] is True and sc["run_at"]=="document_start" and sc["js"]==["content.js"] and sc["matches"]==["https://docs.google.com/document*","https://docs.sandbox.google.com/document*"],[load("discovery","entry-15548")["evidence_id"]])
source=(root/"decoded/resource-15865.js").read_text()
check("content injector selects extension URL then appends a script","chrome.runtime.getURL('gdocs_script.js')" in source and "document.documentElement.appendChild(s)" in source,[load("discovery","entry-15865")["evidence_id"]])
source=(root/"decoded/resource-15866.js").read_text()
check("page helper retains both runtime-ID routes and Trusted Types eval branch",all(x in source for x in ["!chrome.runtime || !chrome.runtime.id","document.currentScript.src.split('/')[2]","trustedTypes.createPolicy('gdocsPolicy'","eval(sanitized)","chrome.runtime.id","script.innerHTML = scriptContents","_docs_annotate_canvas_by_ext"]),[load("discovery","entry-15866")["evidence_id"]])
manifest=json.loads((root/"decoded/resource-15558.json").read_text())
check("manifest placeholder remains in stored bytes",manifest["name"]=="<APP_NAME> Internal Extension" and manifest["background"]["service_worker"]=="background.js",[load("discovery","entry-15558")["evidence_id"]])
source=(root/"decoded/resource-15901.js").read_text()
check("dispatcher receives manifest first-name word",'chrome.runtime.getManifest().name.split(" ")[0]' in source,[load("discovery","entry-15901")["evidence_id"]])
app=load("discovery","scripts-analysis");stats=app["normalized_result"]["statistics"]
check("real static parse covers 3 JavaScript files and 932 AST nodes",stats["parsed_javascript_files"]==3 and stats["visited_ast_nodes"]==932 and stats["parse_failures"]==0,[app["evidence_id"]])
for label in ["branding-semantic-forward","eval-semantic-backward"]:
    ev=load("semantic-traces",label);data=ev["normalized_result"]
    check("semantic trace remains partial: "+label,data["coverage"]["status"]=="partial" and data["summary"]["traversed_nodes"]==1,[ev["evidence_id"]])
for label in ["gdocs-path-trace","docs-canvas-property-trace","branding-input-trace"]:
    ev=load("discovery",label)
    check("feature-layer no-match is preserved: "+label,ev["normalized_result"]["coverage"]["status"]=="no-match",[ev["evidence_id"]])
core=load("discovery","core-loader-patterns");main=load("discovery","main-loader-patterns")
check("main selected patterns all count zero",all(r["complete"] and r["total_matches"]==0 for r in main["normalized_result"]["results"]),[main["evidence_id"]])
check("ArcCore placeholder has two stored matches",next(r for r in core["normalized_result"]["results"] if r["name"]=="<APP_NAME>")["total_matches"]==2,[core["evidence_id"]])
sessions=[]
for folder in ["discovery","semantic-traces"]:
    data=json.loads((root/folder/"summary.json").read_text());assert data["status"]=="completed" and data["errors"]==0
    lineage=data["verifier_run"]["process_lineage"];assert lineage["status"]=="verified" and lineage["descendants"]==[]
    sessions.append({"folder":folder,"calls":data["calls"],"successes":data["successful"],"errors":data["errors"],"closed_owned_descendants":[]})
result={"status":"passed","checked_at":datetime.now(timezone.utc).isoformat(),"scope":"Assertions over retained offline public output and exact decoded source, not target runtime behavior or new implementation tests","checks":checks,"sessions":sessions,"mcp_calls":sum(s["calls"] for s in sessions),"cli_inspections":1}
(root/"findings-verification.json").write_text(json.dumps(result,indent=2)+"\n")
print(json.dumps({"checks":len(checks),"mcp_calls":result["mcp_calls"],"cli_inspections":1,"status":"passed"}))
