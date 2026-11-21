"""Interpret existing retained records; do not start a REA/provider session."""

import hashlib
import json
from pathlib import Path

OUT = Path(__file__).resolve().parent
ROOT = OUT.parents[2]
OLD = ROOT / 'field-tests/arc-dynamic-snapshot-2026-11-15/arc-v9-export-retry'
EVIDENCE = OLD / 'evidence'
SHA = '6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578'


def sha(data):
    return hashlib.sha256(data).hexdigest()


def source(path):
    raw = path.read_bytes()
    d = json.loads(raw) if path.suffix == '.json' else None
    result = {'path': str(path.relative_to(ROOT)), 'sha256': sha(raw), 'bytes': len(raw)}
    if isinstance(d, dict) and 'evidence_id' in d:
        assert d['subject']['digest']['sha256'] == SHA
        result['evidence_id'] = d['evidence_id']
    return result


def write_once(name, obj):
    data = (json.dumps(obj, indent=2)+'\n').encode()
    path = OUT / name
    if path.exists():
        assert path.read_bytes() == data, f'Refusing changed overwrite: {path}'
    else:
        path.write_bytes(data)


prep = json.loads((OLD/'broader-state-restore-preparation.json').read_text())
direct = json.loads((OLD/'broader-direct-callee-preparation.json').read_text())
rows = []
all_missing = []
observations = [
    'Public ObjC wrapper BrowserWindow.switchToTab: bridges a nullable sender and calls this entry; tab identity, selection policy and final browser effect remain unknown.',
    'Public ObjC wrapper BrowserNavigationButtons.handleSidebarToggle: bridges sender and calls this entry; state decision, drawing and final sidebar effect remain unknown.',
    'Public RestoreSidebarDataFlow class-vtable implementation at metadata word offset 15; no source method name or body behavior is established.',
    'Public RestoreSidebarDataFlow class-vtable implementation at metadata word offset 18; no source method name or body behavior is established.',
    'Public RestoreSidebarDataFlow class-vtable implementation at metadata word offset 19; no source method name or body behavior is established.',
    'Public RestoreSidebarDataFlow:RestoreDataFlow static witness word 1; runtime witness instantiation, routing and implementation behavior remain unknown.'
]
for hypothesis, observation in zip(prep['hypotheses'], observations):
    entry = hypothesis['entry']
    path = EVIDENCE / f'broader-admission-{entry}.reply.json'
    reply = json.loads(path.read_text())
    assert reply['isError'] is True
    error = json.loads(reply['content'][0]['text'])['error']
    assert error['details']['operation'] == 'procedure_info'
    assert error['details']['issues'][0]['message'] == f'No procedure exists at the requested address: {entry}'
    admission = {'request': {'name': 'procedure_info', 'arguments': {'procedure': entry}},
                 'retained_result': error, 'source': source(path)}
    all_missing.append(admission)
    callees = []
    for target in direct['targets']:
        branches = [origin for origin in target['caller_checked_source_branches']
                    if origin['source_interval_entry'] == entry]
        if branches:
            callees.append({'target': target['entry'], 'source_checked_branches': branches,
                            'role': 'Unassigned preparation hypothesis; not a public body or runtime call observation.'})
    rows.append({**hypothesis, 'retained_observation': observation, 'missing_admission': admission,
                 'additionally_prepared_immediate_targets': callees,
                 'public_body_recovered': False, 'final_feature_effect_proved': False})

for entry, label in [('0x1006fa470','reducer-preferences-getter-admission'),
                     ('0x100596e80','reducer-publisher-wrapper-admission')]:
    path = EVIDENCE / (label+'.reply.json')
    reply = json.loads(path.read_text())
    error = json.loads(reply['content'][0]['text'])['error']
    assert reply['isError'] is True and error['details']['operation'] == 'procedure_info'
    assert error['details']['issues'][0]['message'] == f'No procedure exists at the requested address: {entry}'
    all_missing.append({'request': {'name': 'procedure_info', 'arguments': {'procedure': entry}},
                        'retained_result': error, 'source': source(path)})

bundle_path = EVIDENCE/'phase-7-bundle.json'
bundle = json.loads(bundle_path.read_text())
missing_entries = {row['request']['arguments']['procedure'] for row in all_missing}
body_operations = {'procedure_info','read_function_instructions','procedure_pseudo_code','analyze_function'}
contradictions = [r['evidence_id'] for r in bundle['records']
                  if r['operation'] in body_operations and
                  r['parameters'].get('procedure') in missing_entries]
assert not contradictions
stub_path = EVIDENCE/'restore-shared-stub-identity.evidence.json'
stub = json.loads(stub_path.read_text())
assert stub['normalized_result']['name'] == '_swift_deletedMethodError'
assert stub['normalized_result']['entrypoint'] == '0x103640168'
assert stub['normalized_result']['classification']['thunk'] is True

steps = []
for entry in ['0x1006fa470','0x100596e80','0x10014fa64','0x10043a2fc']:
    for name, suffix in [('read_function_instructions','instructions'),('procedure_pseudo_code','pseudocode')]:
        steps.append({'name': name, 'arguments': {'procedure': entry},
                      'label': f'prepared-worker-{entry}-{suffix}', 'expect_success': True})
for entry in ['0x100305344','0x100305b70','0x100305ef0']:
    steps.append({'name': 'procedure_pseudo_code', 'arguments': {'procedure': entry},
                  'label': f'prepared-worker-{entry}-pseudocode', 'expect_success': True})
steps.append({'name': 'read_function_instructions', 'arguments': {'procedure': '0x100306724'},
              'label': 'prepared-worker-0x100306724-instructions', 'expect_success': True})
assert len(steps) == 12
receipt = json.loads((OUT/'seed-boundary-receipt.json').read_text())
queries = {'authority': 'Proposed public requests only; no provider requests executed by this preparation.',
           'target_sha256': SHA, 'seed_file': receipt['seed']['path'],
           'seed_sha256': receipt['seed']['sha256'], 'requires_new_provider_admission': True,
           'selection': 'Four instruction/pseudocode pairs cover the two persistence admissions and tab/sidebar workers; three Restore class pseudocode reads and the 24-byte indexed witness instruction read cover all remaining directly observed workers. Follow actual returned gaps adaptively.',
           'schema_status': 'Names and procedure arguments match the previously schema-validated 12-call broader plan; live catalog/profile admission still belongs to the shared-session owner.',
           'steps': steps}
write_once('high-value-public12.steps.json', queries)
source_names = ['broader-action-0x10014fc14-pseudocode.evidence.json',
                'broader-action-0x10043ef5c-pseudocode.evidence.json',
                'exact-sidebar-restoration-class.evidence.json',
                'exact-sidebar-restoration-conformances.evidence.json',
                'restore-class-method-descriptor-bytes.evidence.json',
                'restore-protocol-static-witness-bytes.evidence.json',
                'restore-shared-stub-bytes.evidence.json',
                'restore-shared-stub-identity.evidence.json']
ledger = {'authority': 'Additive interpretation of immutable retained public observations and separately identified analyst source preparation.',
          'target_sha256': SHA, 'provider_calls_executed': 0,
          'target_or_shipped_script_executed': False,
          'broader_workers': rows, 'all_eight_exact_missing_admissions': all_missing,
          'later_retained_bundle_boundary': {**source(bundle_path), 'canonical_records': len(bundle['records']),
                                             'matching_worker_body_records': contradictions},
          'restore_zero_and_shared_slots': {
              'zero_class_implementation_relative_words': 7,
              'concrete_class_entries': ['0x100305344','0x100305b70','0x100305ef0'],
              'static_witness_word_1': '0x100306724',
              'static_witness_words_2_through_4': '0x103640168',
              'shared_stub_public_identity': '_swift_deletedMethodError',
              'shared_stub_identity_source': source(stub_path),
              'correction_scope': 'The phase5 ledger says identity unassessed; the separately retained phase5 identity record supplies this name and thunk classification. No runtime instantiation or restore behavior follows.'},
          'sources': [source(EVIDENCE/name) for name in source_names]+[
              source(OLD/'feature-findings-phase5.json'), source(OLD/'feature-findings-phase6.json'),
              source(OLD/'broader-state-restore-preparation.json'),
              source(OLD/'broader-direct-callee-preparation.json'),
              source(OLD/'broader-state-restore-reopen.steps.json'), source(Path(__file__).resolve())],
          'proposed_queries': 'high-value-public12.steps.json',
          'limits': ['The six workers have entry origins and LC-bounded preparation, not retained public bodies.',
                     'Indexed interval size is not a provider-owned complete function body.',
                     'The 18 checked-source immediate B/BL targets are seed hypotheses, not recovered semantic roles or observed runtime calls.',
                     'No durable store, storage format/location, restore success/failure handling, tab policy or final sidebar drawing is proved.']}
write_once('broader-worker-ledger.json', ledger)
print(json.dumps({'status': 'passed', 'workers': len(rows), 'exact_missing_admissions': len(all_missing),
                  'queries': len(steps), 'bundle_records': len(bundle['records']),
                  'matching_retained_body_records': len(contradictions), 'provider_calls_executed': 0}))
