# HeyClicky lifecycle and initial-state follow-up — 2026-10-30

Read-only review of already-saved public REA+ replies. No new target/provider execution or user appdata access. All selected replies identify the unchanged arm64 input and the219-seed analysis profile. Whole-app analysis remains incomplete.

## lifecycle-entry-chain

Saved calls: 007, 008, 009, 014, 015, 016.

- applicationDidFinishLaunching: bridges its notification and calls0x1025926e8.
- applicationWillTerminate: bridges its notification and calls0x102595d20, which loads/retains CompanionAppDelegate._companionManager and delegates to0x101d50474.
- application:openURLs: bridges the supplied NSArray to a Swift URL array and calls0x102596118. The body tests isEmpty and forwards nonempty input to0x101f7c938.

Remaining:
- The launch body has calling-convention/value-flow warnings and a nonsensical decompiled param_1-bit test despite the notification thunk; do not assign that branch a semantic mode name.
- Launch calls and _preSignInIntroWindowManager assignment are visible, but most called predicate/init bodies remain opaque. It does not prove startup initialization or onboarding policies end to end.

## termination-cancellation

Saved calls: 015, 025.

- The termination delegate tests optional task handles and explicitly invokes Swift Task.cancel for transientHideTask, streamedCursorBubbleTask, codexHUDFocusResetTask, codexSessionWarmupTask, codexAgentReadyTask, discoveryChannelSaveTask, currentResponseTask, permissionTransientCardTask and permissionCelebrationTask.
- It explicitly invokes Combine AnyCancellable.cancel for shortcutTransitionCancellable, alwaysOnVoiceModeToggleCancellable, controlDoubleTapCancellable, guidedClickLeftMouseDownCancellable, voiceStateCancellable, audioPowerCancellable, primaryAuthenticationStateCancellable and remoteTasksAccountCancellable.
- It stores zero into codexAgentReadyTask, discoveryChannelSaveTask, currentResponseTask, accessibilityCheckTimer, permissionPromptHandoffTimer, permissionTransientCardTask and permissionCelebrationTask; clears pending permission state and streamed-cursor identifier through helpers.

Remaining:
- Additional calls touch globalPushToTalkShortcutMonitor, buddyDictationManager, overlayWindowManager, permission timers and native runtime owners, but the called helper implementations are not present in these selected captures.
- This is code-level cancellation/ownership evidence, not proof of successful runtime cleanup, flush, process exit or failure recovery.

## url-router

Saved calls: 009, 016, 026.

- 0x101f7c938 loops through the supplied URL sequence, copies each URL and calls0x101f7cc5c.
- It loads the manager's supabaseAuthManager, calls0x102bc3178, conditionally calls0x101ccc510, then conditionally calls0x101f7aa48(URL,0). If the gate is false or the handler returns false it calls0x101b23048(URL).

Remaining:
- The helper names, accepted schemes/hosts, auth-state meanings, validation and side effects are unresolved. A Supabase-related gate exists in the source path, but its predicate semantics cannot be safely named.
- No URL was opened/replayed.

## voice-controller-initial-state

Saved calls: 010, 017.

- Allocator0x102056788 calls initializer0x102163c5c.
- The initializer sets empty conversationHistory and pending user/assistant transcripts, clears active text/voice response flags and task handles, and initializes activeTextTurnAttachedFilePaths to an empty array.
- Named fields responseDoneWatchdogSeconds, idleTeardownSeconds and oneBrainMouthIdleTeardownSeconds receive12,300 and1200 respectively; currentBeginPushToTalkGeneration, realtimeVoiceTurnGeneration and VAD sequence counters start at zero.
- Active-document context/reference/PID, annotation submission and frontmost-app/browser-host fields are initialized here, tying them to this controller's state ownership.

Remaining:
- Initialization proves these state fields and constants; it does not establish when timers are scheduled/enforced, how audio is captured/transcribed, microphone permissions, transport, VAD/barge-in decisions, tool dispatch or completed turn persistence.

## voice-client-initial-state

Saved calls: 011, 018.

- Allocator0x102af7074 calls initializer0x102b16b60, which performs its Objective-C superclass init and callback/observer setup.
- webSocketSession, webSocketTask, microphoneCapture and duplexAudioEngine handles initialize to nil/zero; isSocketOpen and isEchoCancellationActive initialize false.
- Named pendingAudioAppendChunkSoftCap is initialized to600; pending chunks, captured/sent audio counters, response counters, tool continuation and interview replay state initialize empty/zero.
- After superclass init it stores a weak-self callback (DAT_102b3995c) into a referenced callback slot and stores a returned notification helper result into microphoneSelectionChangeObserver.

Remaining:
- These bodies do not establish a live socket endpoint or model, actual microphone/duplex behavior, backpressure enforcement or media format.
- Callback and notification helper semantic bodies remain unresolved.

## auth-initial-state

Saved calls: 012, 019.

- Allocator0x102bc3284 calls initializer0x102bca654.
- It initializes isAuthenticated false, optional user ID/email/display name/avatar/signup date empty, accessToken/refreshToken empty, refresh task/identifier absent and failure state absent.
- Named accessTokenRefreshRetryCooldown receives raw64bit0x403e000000000000 (30.0 if interpreted as IEEE754 double); pending keychain migration/read/sign-out cleanup state is cleared.
- The initializer then calls0x102bcab78 before returning self.

Remaining:
- The called initializer continuation0x102bcab78 is not captured here. Keychain read/write, token format, callback URL validation, sign-in/out and refresh/retry policies remain unresolved.
- No actual account/token/keychain data was read; field labels are source metadata, not user state.

## conversation-history-initial-state

Saved calls: 013, 020.

- Allocator0x1010a15cc calls initializer0x1010b2598.
- The initializer constructs messages as empty, initializes hasEarlierMessages/isLoadingNewest/isLoadingEarlier/hasLoadFailed false, lastAnswerEndedAt and lastRefreshStartedAt absent, accountID/liveReplyID empty, and refreshTask/earlierTask nil.

Remaining:
- The initializer establishes empty ownership/loading state only. Fetch/load ordering, paging, cancellation, server-versus-local storage, path/schema/migration and recovery are not established by this body.

## Exact evidence references

- 007 `0x102595c40` — `ev_28f4d6be1f828e37373d345f5cf291465857521a05d37c9b61d9194a62d9cca4`; reply `169bfd98b9a6b37d4168a204bc8745be9d76041c12bd816cd948d1a30a268a2e` (14296B).
- 008 `0x102595d78` — `ev_e3863b348a151f0dd55942cb961b2e060fbf1311ae613a17722a2929ade79b27`; reply `e5b0c25e1f0b15d5a32154ea787fb11315ef57fe013b289afeef7603e63149c2` (14276B).
- 009 `0x1025962b8` — `ev_8691af206e78b8d30707fba42ba370f4096df21be3254765dad3a625d89d1738`; reply `c8ff4c80be1479c969f86695eda3c534c828fbc3f8d052264699af362ec03afb` (13032B).
- 010 `0x102056788` — `ev_7b747ea83033b47029ea7271c1cb365dbbc0fbf0184bbd776a27c2ec29386880`; reply `5a49d099d4616ec72ec03d68bb38c903930f0634a4935a90a0bb9fb33b3baf9b` (10002B).
- 011 `0x102af7074` — `ev_4b2c2c7810052be09ad0480d8bb074974acebff7577d21c77a0d168379eff354`; reply `3c1c59338181573d2a73ec66c921f319c967f8cb2fa6c5d79968554c6bc2f11c` (10090B).
- 012 `0x102bc3284` — `ev_b1af7bb02d23f6dfdd7f54ad0d5090fe4d0a0148d5b8e99508edb18b0304b86e`; reply `6af122a4988306599855ad5920922028da76b312dbbc2f64374e1eca823b9929` (10002B).
- 013 `0x1010a15cc` — `ev_fd941121d5fbfdb644a57c37056a697a8d4ea9db4f62c6f204dcbd5e56f59012`; reply `0693e5bc6a318fb8d2235bc6ba36e24469859ccbd4af03df836026d3d78272a3` (10002B).
- 014 `0x1025926e8` — `ev_3301a66e6d8b234cf82223289563739af894a1aa187e9e48e0c37af3847dbdc9`; reply `a83cf631a1ace8f66a63ef8ed7b7f7cc086c92379f199a66eb0b5bb01922ffff` (63056B).
- 015 `0x102595d20` — `ev_e8ee02aeaa991ad313432752a9db87439a92d23fa5428a5a7d39c2d36a087898`; reply `4a1b919e76149e6db4cead1bccd75e97815d9d180c1109ab06abd29ecc4940bd` (10884B).
- 016 `0x102596118` — `ev_0adf51755c4305928fe2b05e9cf6f1beeef4f1b09bfcfbad935c4972cbfd6ab7`; reply `6cc4206f1f8e3208faf42d68ef00907ebd5e9ac936a95934301008a85b256a12` (14250B).
- 017 `0x102163c5c` — `ev_58bb8789e0ce2a66c987022cd0b84170d0103487ae87b5821c2c2004ef8b2d07`; reply `9d3b4c2f964e044b4ce82fd0dc127eb7bf8c2600dabc2fabc1a69c939c19d3fe` (45568B).
- 018 `0x102b16b60` — `ev_93dfbfc483e007ff33f5460eeb65390110503143263c2a14f8488ad5f5dc947e`; reply `bc4d17b0e1c0bbeb4456e538c338a3a45962e63d779370e5be2f6586c2f3ac52` (76312B).
- 019 `0x102bca654` — `ev_3e3a1534fd3833ea6f59bbbf4f6f605f46cb2a47c00926773c45390a442665ec`; reply `693daa9e06ca4892bdab89386713b7573fe90ad18a6b213d1f3a5c7073625f5a` (30094B).
- 020 `0x1010b2598` — `ev_5e38ce113c1521e8867f2d4f43fdbe4c4282cf06ffd10926a63be5769f0023ed`; reply `afcfdc1d993e47a5b0963f756dc9916a64f6a304b71945a5dcab776fadd5b529` (23686B).
- 025 `0x101d50474` — `ev_33c629f37172fe56b9f516e1a303de71b4b6605240911876ea034bd238dafff6`; reply `0ea27b8e977aeadd953a17db97f963ae8af3c51ce6b65bf48617a67b5a467aca` (88274B).
- 026 `0x101f7c938` — `ev_9d9656db8345baed801a17bf036812995d2d7d6786ceca7d67cacbc7a2463d98`; reply `1bc4cede3b879400e566a44698a6737bc2d43f16ae708d7340d1f3d407e82edc` (20366B).

The [machine-readable receipt](heyclicky-lifecycle-followup-2026-10-30.json) records source identities, raw paths, normalized-body hashes, exact facts and uncertainty. Do not treat initializer fields as proof of behavior.

## Coverage and cleanup limits

- Original closure autoanalysis was incomplete/timed out at explicit60seconds.
- Original closure has46saved replies44success2errors but no saved final close/session outcome or token-verified cleanup receipt. This later read-only review cannot repair that historical absence.
- Pseudocode has Swift calling-convention/global/value-flow warnings; imported call identities and named writes are firmer than reconstructed arguments.
- No feature row can close end to end from this subset alone.
