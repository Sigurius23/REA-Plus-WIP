# Device test readiness — 25 October 2026

The signed base has been inspected, not installed. No authorized Android device
was connected during this pass.

## Verified offline

- `base-patched-signed.apk` verifies with APK Signature Scheme v3. Its signer is
  `f688a8060ab8f163751be41b43f4f0b190f17b6d2be286dab5b0c6143b489113`.
- REA+ resource decoding of that signed artifact confirms a release-level
  `base-config` trusting **system and user CAs**. A system-CA modification is
  unnecessary for this artifact. Evidence:
  `../rea-test-2026-10-24/19-patched-resources.json`,
  `ev_9b632af6e82c57014cb00cd5bef5cc2c476fbc26f29597072948d31b485baa15`.
- The base declares required ABI/density split types and contains no native
  `.so` libraries. The provided native split contains only **armeabi-v7a**.
  A base-only install is not the complete test package.
- `prepare_install_set.py` aligned and re-signed both original splits with
  the base's local key. Every output signature, alignment, and common signer
  was checked; original split hashes were rechecked. The resulting paths and
  SHA-256 values are in `install-set/manifest.json`.

## Once the phone is connected

```sh
python3 Whoop/patch/check_device.py
# Add --serial SERIAL when several devices are connected.
```

This read-only check confirms SDK, ABI, existing WHOOP installation, and all
three artifact hashes. It prints an `adb install-multiple` command only for a
compatible device with no existing WHOOP installation. An existing stock app
uses a different signing key; review its data and replacement plan first.
The script never uninstalls an app, clears storage, or changes the device proxy.

For a fresh test installation, the complete command consists of:

```sh
adb -s SERIAL install-multiple \
  Whoop/patch/base-patched-signed.apk \
  Whoop/patch/install-set/config.armeabi_v7a.apk \
  Whoop/patch/install-set/config.xhdpi.apk
```

Use an authorized trial/account session and connect the owned band normally.
Record whether the entitlement UI behaves as predicted and whether
`membershipAdjustment` appears. The deferred navigation patch stays deferred
until the real UI demonstrates it is needed. Install success, BLE pairing,
CA installation, entitlement behavior, and the navigation wall remain untested.

## Recreating the split set

Use the existing JDK 21 and build-tools 36.0.0. Set the password through
`WHOOP_PATCH_STORE_PASSWORD`, then run:

```sh
export JAVA_HOME=/opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home
python3 Whoop/patch/prepare_install_set.py --keystore /tmp/whoop-patch.jks \
  --output /absolute/path/to/a/new/install-set
```

The output directory must be new. The script verifies the signing key matches
the already signed base. It never changes original APKs or key material.
