import json
from pathlib import Path

root=Path(__file__).resolve().parent
macho=json.loads((root/"core-macho.cli.evidence.json").read_text())
layout=macho["normalized_result"]
arm=next(x for x in layout["architectures"]["items"] if x["name"]=="arm64")
segments=[x["fields"] for x in layout["load_commands"]["items"] if x["kind"]=="LC_SEGMENT_64"]
rows=[]
wanted=["<APP_NAME>","arc_internal_extension","reading_mode_gdocs_helper/content.js","reading_mode_gdocs_helper/gdocs_script.js","arc_internal_extension/background.js","../../arc/browser/extensions/arc_extensions_browser_client.cc"]
for label in ["core-placeholder-context","core-loader-file-context"]:
    ev=json.loads((root/"discovery"/(label+".evidence.json")).read_text())
    data=ev["normalized_result"]
    for row in data["strings"]:
        if row["value"] not in wanted: continue
        carrier_offset=data["range"]["offset"]+row["offset"]
        slice_offset=carrier_offset-arm["file_offset"]
        assert 0<=slice_offset<arm["size"]
        segment=next(x for x in segments if x["fileoff"]<=slice_offset<x["fileoff"]+x["filesize"])
        address=segment["vmaddr"]+slice_offset-segment["fileoff"]
        rows.append({"literal":row["value"],"carrier_offset":carrier_offset,"arm64_slice_offset":slice_offset,"preferred_address":hex(address),"segment":segment["segname"],"source_evidence":[ev["evidence_id"],macho["evidence_id"]]})
assert len(rows)==6
result={"authority":"analyst address selectors derived from public Mach-O layout and public original-file string offsets; no code references or runtime slide recovered","carrier_sha256":macho["subject"]["digest"]["sha256"],"arm64":arm,"candidates":rows}
(root/"native-loader-candidates.json").write_text(json.dumps(result,indent=2)+"\n")
print(json.dumps({"native_literal_candidates":len(rows)}))
