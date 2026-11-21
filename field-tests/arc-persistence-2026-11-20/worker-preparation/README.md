# Offline broader-worker preparation — 2026-11-20

This is supplemental analyst preparation for the fixed Arc 1.172.1 ARM64 slice, SHA-256 `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`. No Arc/helper/shipped script, account, network service, provider or Ghidra session was started. Existing captures and overlays are unchanged.

`seed-boundary-receipt.json` binds the original 80,498,448-byte Mach-O, its segment/section bounds and original LC_FUNCTION_STARTS command to the retained public index `ev_9d6d7f4a44f7c8dc98aeaa120df0cca5cbfc4b104467aab722f9cf09e179bf8c`. The complete retained 356,808-byte stream equals the original file region byte-for-byte. The image base comes from the original `__TEXT` segment. Original-source parsing here supplements REA+; it is not a new public-tool result.

`0x100596e80` is exact decoded entry 25,652 (zero-based), with predecessor `0x100596d20` and next entry `0x100596fc8`. Its 328-byte indexed interval is file-backed, executable `__TEXT,__text`. The next LC entry bounds an index interval; it does not establish a provider-owned complete procedure body.

The additive `broader-direct-callee-seeds-2063.tsv` has SHA-256 `08d3709ab4832233db1c2c7db501784e0779c95d8e2d429d57c2a23511afc667`. Its only added row is `0x100596e80<TAB>function`. No prior row was removed or changed. The preserved 2062 overlay already contains `0x1006fa470`; its indexed interval ends at `0x1006fa5bc` (332 bytes). The 2062 preparation's six source intervals and 18 additional immediate B/BL targets were independently rechecked against the SHA-bound original. They remain caller seed hypotheses.

## Retained broader observations

| Entry | Actual retained evidence | Unresolved behavior |
| --- | --- | --- |
| `0x10014fa64` | `BrowserWindow.switchToTab:` bridges nullable sender and calls this worker; origin `ev_9b1ad6027ad3ebdc9c7de8168c16ce9fc220d888bad8cd811e2fcae54542bcc7`. | Tab identity, selection policy and final browser operation. |
| `0x10043a2fc` | `BrowserNavigationButtons.handleSidebarToggle:` bridges sender and calls this worker; origin `ev_da32b1727bd6f75e4af857a8651d02a3e01ef3011a630a9af2605fe8da64791c`. | State decision, dispatch and visible sidebar effect. |
| `0x100305344` | Exact `RestoreSidebarDataFlow` class-vtable metadata word offset 15. | Source method identity and restore behavior. |
| `0x100305b70` | Same class, metadata word offset 18. | Input/result semantics and restore behavior. |
| `0x100305ef0` | Same class, metadata word offset 19. | Operation, dependency and persistence behavior. |
| `0x100306724` | Exact `RestoreSidebarDataFlow:RestoreDataFlow` static witness word 1. | Actual routing and runtime binding. |

The class origin is `ev_062a4701a3a5d47f2155cd7637797477e390c3f59f5d4cbaa09bae5b4c33bdca`; the conformance origin is `ev_4c8b935a1bdf5bb421b1d99a98ef73536133c5f636ef36d80d1944250877cd91`. All six exact `procedure_info` calls returned `invalid_request` / `No procedure exists at the requested address`. The getter `0x1006fa470` and publisher wrapper `0x100596e80` have the same retained admission error. These are partial-Program admissions, not observed feature failures. Their raw errors and hashes are in `broader-worker-ledger.json`. The final phase-7 bundle has 80 canonical records and no body/info records for these eight requested procedure addresses.

Seven class descriptor implementation relative words are zero. Static witness words 2–4 share `0x103640168`; its separately retained public identity is `_swift_deletedMethodError`, classified as a thunk (`ev_d2c1c3d59b1d05e0bc0c6f91e887f925f2c4ea9766cb3676d3c169cc60d74017`). This supplies the identity left unassessed in the historical phase5 prose. It does not provide three restoration operations or instantiate a runtime witness table.

## Bounded public follow-up

`high-value-public12.steps.json` proposes exactly 12 requests for the shared-session owner: instruction/pseudocode pairs for getter, publisher wrapper, tab worker and sidebar worker; pseudocode for the three class workers; instructions for the 24-byte indexed witness. It covers every missing entry before expanding. Tool names and procedure arguments match the previously schema-validated broader plan; the live session owner must use the actual catalog/profile. No requests in this file were executed here.

Run `python3 prepare_2063.py` and `python3 prepare_worker_ledger.py` from this directory to recheck. Both refuse changed overwrites. Durable writes/readback, restore outcome/error handling and final tab/sidebar effects remain unproved.
