"""Index retained observations without turning analyst joins into tool output."""
from pathlib import Path
import hashlib,json
O=Path(__file__).resolve().parent;R=O.parents[1]
sha=lambda b:hashlib.sha256(b).hexdigest()
def record(p):
    b=p.read_bytes();d=json.loads(b)
    return dict(path=str(p.relative_to(R)),bytes=len(b),sha256=sha(b),**({'evidence_id':d['evidence_id']} if isinstance(d,dict) and 'evidence_id' in d else {}))
groups=[
 ('controller-and-flow','The selected controller creates a boxed RestoreSidebarDataFlow and its selected handler conditionally starts a MainActor task.',
  [('mcp',['restore-controller-class','sidebar-flow-class','class-accessor','restore-origin-a','objc-init-bridge','restore-ui-action','restore-task-entry']),('mcp-arc-selected',['task-thunk','ui-action-getter','restore-task-descriptor'])],
  ['No source method name, final UI control installation, actual click or live controller instance established.']),
 ('conditional-preparation','The conditional cast-success lane constructs SyncEngine and requests CloudKit deletion operations before the selected local worker; the other lane calls the worker directly.',
  [('mcp',['restore-origin-b','resume-preparation','restore-after-preparation','preparation-']),('mcp-arc-selected',['post-name-0x10363acd8','post-name-0x10363ad08','objc-selector-0x103642240','objc-selector-0x103662080','objc-selector-0x1036653a0','objc-selector-0x103666360','objc-selector-0x10366f1a0'])],
  ['Actual lane, zone/container/database, network effects and completion results unknown; no services contacted.']),
 ('conditional-restart','A true worker result requests the restart helper, setting a preference and preparing a bash command; reported launch success leads to a terminate request, while errors are handled separately.',
  [('mcp',['reset-start','reset-continuation','resume-reset','restore-after-reset']),('mcp-arc-selected',['relaunch-','command-','objc-stub','objc-slot','objc-selector','main-bundle-class','preferences-class','application-class','running-application-class','user-defaults-class','app-class'])],
  ['Worker true does not prove both writes succeeded. Script contents, actual launch, termination, relaunch and UI update are unobserved.']),
 ('objc-selection','Exact indexed-name identity selection precedes aggregate-budget admission; Arc FIRApp succeeds, while two controller-name index negatives remain scoped.',
  [('mcp-arc-selected',['arc-controller-selected','arc-controller-plain-name','arc-indexed-firapp']),('mcp-owned',['owned-selected','owned-missing','owned-alias','owned-unknown','owned-unfiltered'])],
  ['Selector excludes standalone protocol/category inventories and cannot discover unindexed runtime Swift metadata.'])
]
findings=[]
for ident,claim,selectors,limits in groups:
    files=set()
    for directory,prefixes in selectors:
        for prefix in prefixes:files.update((O/directory).glob(prefix+'*.evidence.json'))
    assert files,ident
    findings.append(dict(id=ident,classification='Analyst composition of retained public static observations under named ABI/valid-receiver premises',claim=claim,sources=[record(p) for p in sorted(files)],limitations=limits))
(O/'finding-index.json').write_text(json.dumps(dict(authority='Analyst ledger; not new normalized REA+ call or runtime facts',findings=findings),indent=2)+'\n')
reused=[
 'field-tests/arc-persistence-2026-11-20/mcp/restore-worker-b-instructions.evidence.json',
 'field-tests/arc-persistence-2026-11-20/mcp/restore-worker-c-instructions.evidence.json',
 'field-tests/arc-restore-consumer-2026-11-24/mcp-complete/windows-layout.evidence.json',
 'field-tests/arc-restore-consumer-2026-11-24/mcp-complete/restore-record-fields.evidence.json',
 'field-tests/arc-restore-consumer-2026-11-24/mcp-complete/sidebar-model-fields.evidence.json',
 'field-tests/arc-restore-consumer-2026-11-24/mcp-complete/sync-state-fields.evidence.json',
 'field-tests/arc-cache-selection-2026-11-24/mcp-complete/final.bundle.json']
(O/'reused-sources.json').write_text(json.dumps([record(R/p) for p in reused],indent=2)+'\n')
old=json.loads((R/reused[-1]).read_text());unknowns=[u for u in old['unknowns'] if u['unknown_id']=='unk_c0e6ba9f746d440571369f088d47997bb6ee28307db89ca5026e9d1fe44c5d04'];u=max(unknowns,key=lambda u:u['revision']);assert u['revision']==3 and u['status']=='open'
(O/'retained-client-unknown.json').write_text(json.dumps(dict(authority='Unchanged retained Evidence-bundle unknown; no revision or closure asserted',source=reused[-1],unknown=u),indent=2)+'\n')
print(json.dumps(dict(findings=len(findings),indexed_source_records=sum(len(f['sources']) for f in findings),reused_sources=len(reused),retained_client_unknown_revision=u['revision'])))
