# Patched WHOOP app build plan (MG, eBay strap, user story)

Current device-test readiness and complete install commands are in
`DEVICE-TEST.md` (25 October continuation). The matching signed splits now
exist under `install-set/`; no phone has been connected or installation tested.

Goal: sideloadable `WHOOP-patched.apk` (base 5.473.0) that (a) trusts user CAs
for MITM capture, (b) acts as if the user holds the highest tier
(client-gated surfaces), (c) neutralizes the used-strap membership wall.
NOOP stays the analysis hub (Android main phone; iPad Bevel; Mac HPC workbench).

## Inputs on disk
- Base + splits: `Whoop/whoop-apk/{com.whoop.android.apk, config.armeabi_v7a.apk, config.xhdpi.apk}`
- Full jadx source tree for reference: `Whoop/whoop-src/sources/`
- mitm capture tooling (verified): `Whoop/capture/{unlock_token_capture.py, decoders.py}`
- Strap unlock flow doc, session 5/5b: `Whoop/notes-rea-analysis.md`

## Gates found (todo 1, done)
1. Pairing/membership wall: `com.whoop.pairing.membershipAdjustment.*`
   (`MembershipAdjustmentApi`, interactor keyed strapSerial/strapSignature,
   `MembershipAdjustmentNavHostDestination`) — paywall flow on used/lapsed strap.
2. Server-authored onboarding flags: `com.whoop.data.remote.domain.response.onboarding.OnboardingInfo`
   (`requireCreditCard`, `requireTeamCode`, `isUsedStrap`,
   `StrapMembershipStatus{PROVISIONAL,GIFT,ELITE,ELITE_GIFT,UNKNOWN}`).
3. Unlock cert gate (NOT patchable): `firmware-service/v4/strap/unlock-token`
   issues cert vs account — trial pairing session required once; capture with
   unlock_token_capture.py; still-open question = cert TTL.

## Entitlement forge (todo 3, recon'd)
- API: `com.whoop.entitlements.MemberEntitlementsApi.getEntitlements()` →
  `EntitlementsResponse{Map<String,EntitlementResponse> + context}`.
- Storage/read: Room `entitlementDao` (we1/b), `membershipTypeDao` (we1/j),
  repo `we1.C37223g` (memory cache, lifecycle refreshes, membershipTypeChangeListener).
- PATCH the read side of `we1.C37223g` (entitlement predicate `b(Entitlement)`
  and DAO-backed `getEntitlements` call sites) → always top tier. Do NOT seed
  the cache; server refresh would overwrite.
- Honest boundary: client-gated features unlock; payload-server features
  (coach AI etc.) still 403 from their API.

## Patch set (todo 2, decided)
- res/xml/certificates.xml → trust user CAs (release build; no pinning).
- Neutralize membershipAdjustment nav to membershipAdjustment screens.
- Drop requireCreditCard checks in consumers.
- Entitlement read-path → max tier (above).
- Defer nag/banner clean-up until main path works.

## Environment (checked 2026-10-25)
- apktool (Homebrew) present; system java = applet JRE 8 (unusable).
- JDK 21: /opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home — use via JAVA_HOME.
- Android build-tools now found locally at
  `/opt/homebrew/share/android-commandlinetools/build-tools/36.0.0/`
  (also 35.0.0). No download was needed for the continuation. Use JDK 21.

## Build steps (todo 4)
1. apktool d: JAVA_HOME=<jdk21> apktool d -f -o Whoop/patch/apk-src Whoop/whoop-apk/com.whoop.android.apk
2. Patch smali (membershipAdjustment + entitlement repo) + res/xml/certificates.xml.
3. Rebuild: apktool b (watch framework resources; splits: code lives in base armeabi_v7a
   split for ABI, resources in base — but base APK here is the full base, so patch base only).
4. Zipalign (build-tools) + sign: JDK21 keytool → keystore; apksigner v2.
5. Sideload runbook: fresh install → mitmproxy up (Whoop/capture) → trial account →
   pair MG (archive unlock-token + TTL config) → quit WHOOP app → NOOP bond
   takeover (tap-to-blue-LED dance) → Health Connect → NOOP import → Bevel/iPad leg.

## Build progress (2026-10-25)
- apktool decompile: `Whoop/patch/apk-src/` (orig obf names; apktool smali != jadx names:
  `smali_classes4/we1/g.smali` = jadx we1/C37223g repo; `we1/d.smali` = DAO impl C37220d;
  membershipAdjustment = smali_classes9/com/whoop/pairing/membershipAdjustment/).
- PATCH 1 DONE: res/xml/certificates.xml — added <base-config> trust-anchors system+user
  (base decode had debug-overrides only; release relies on Android default system-only).
- PATCH 2 DONE (entitlement gate): smali_classes4/we1/g.smali method
  `b(Lcom/whoop/entitlements/Entitlement;)Z` replaced with const/4 v0,1; return v0.
  Survives server refreshes (read-side). Tier label a()Lwe1/n; left intact — we1/n is
  a cached membership-type holder, not an enum; cosmetic-only, deferred.
- PATCH 3 DEFERRED (membershipAdjustment wall): smali_classes6/b30/u2.smali packed-switch
  (data at 2023-2036, case 4 -> pswitch_8 routes to Lf22/c;->j) is the Compose nav host
  for the paywall flow. With a trial account the strap is PROVISIONAL/ELITE server-side
  so the wall should not fire during pairing/capture. Post-trial does not matter because
  NOOP owns the bond then. Revisit only if pairing under trial hits the wall.
- TODO: install build-tools (dl.google.com build-tools_r34-macos.zip), JDK21 keytool
  keystore, apktool b -o base-patched.apk, zipalign, apksigner v2 -> WHOOP-patched.apk.

## Build result (final)
- Patch applied: `smali_classes4/we1/g.smali` — `b(Lcom/whoop/entitlements/Entitlement;)Z` now returns `true` unconditionally (entitlement gate bypass). The release-level user CA trust change is also present in the actual signed APK, verified by decoding it during the continuation.
- Deferred: `b30/u2` membership-adjustment nav wall (see rationale above) — only matters post-trial when the bond is already owned.
- `apktool b` → base-patched.apk (exit 0); zipalign -p 4 → base-patched-aligned.apk; apksigner → **base-patched-signed.apk** (57 MB). Fresh verification reports v3 true, v1/v2 false; min SDK is 28.
- Keystore: /tmp/whoop-patch.jks (alias whoopkey, store/key pass `whooppass` — note ≥6-char keytool requirement; earlier `whoop` attempts fail). Keep for re-signing future rebuilds.
- Install: use `adb install-multiple` with the signed base plus both matching
  signed splits from `install-set/`. Review existing app data/signing identity
  before replacing a stock installation. See `DEVICE-TEST.md`; base-only
  installation is not a complete package for this XAPK.
