#!/usr/bin/env python3
"""Sign the original ABI/density splits with the patched base's local key.

Creates a new directory; never changes the original APKs or installs anything.
Supply the keystore password via --password-env, not a command-line value.
"""
from __future__ import annotations

import argparse
import hashlib
import json
import os
from pathlib import Path
import re
import shutil
import subprocess
import tempfile

HERE = Path(__file__).resolve().parent


def digest(path: Path) -> str:
    with path.open("rb") as stream:
        return hashlib.file_digest(stream, "sha256").hexdigest()


def run(command: list[str]) -> str:
    result = subprocess.run(command, text=True, capture_output=True)
    if result.returncode:
        raise RuntimeError(result.stderr.strip() or result.stdout.strip())
    return result.stdout


def certificate(apksigner: Path, path: Path) -> str:
    text = run([str(apksigner), "verify", "--verbose", "--print-certs", str(path)])
    matches = re.findall(r"Signer #\d+ certificate SHA-256 digest: ([a-f0-9]+)", text)
    if len(matches) != 1:
        raise RuntimeError(f"Expected one signing certificate for {path.name}")
    return matches[0]


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--keystore", type=Path, required=True)
    parser.add_argument("--alias", default="whoopkey")
    parser.add_argument("--password-env", default="WHOOP_PATCH_STORE_PASSWORD")
    parser.add_argument("--build-tools", type=Path, default=Path(
        "/opt/homebrew/share/android-commandlinetools/build-tools/36.0.0"))
    parser.add_argument("--output", type=Path, default=HERE / "install-set")
    args = parser.parse_args()
    if not os.environ.get(args.password_env):
        parser.error(f"Set the keystore password in {args.password_env}")
    signer = args.build_tools / "apksigner"
    aligner = args.build_tools / "zipalign"
    base = HERE / "base-patched-signed.apk"
    expected_signer = certificate(signer, base)
    sources = [HERE.parent / "whoop-apk" / name for name in (
        "config.armeabi_v7a.apk", "config.xhdpi.apk")]
    for source in sources:
        if not source.is_file():
            parser.error(f"Missing original split {source}")
    args.output.mkdir(parents=True, exist_ok=False)
    try:
        records = []
        with tempfile.TemporaryDirectory(prefix="align-", dir=args.output) as temporary:
            for source in sources:
                source_hash = digest(source)
                aligned = Path(temporary) / source.name
                output = args.output / source.name
                run([str(aligner), "-p", "4", str(source), str(aligned)])
                run([str(signer), "sign", "--ks", str(args.keystore.resolve()),
                     "--ks-key-alias", args.alias,
                     "--ks-pass", f"env:{args.password_env}",
                     "--key-pass", f"env:{args.password_env}",
                     "--out", str(output), str(aligned)])
                run([str(aligner), "-c", "-p", "4", str(output)])
                if certificate(signer, output) != expected_signer:
                    raise RuntimeError("Split signing certificate differs from patched base")
                if digest(source) != source_hash:
                    raise RuntimeError("Original split changed during preparation")
                records.append({"path": output.name, "sha256": digest(output),
                                "source_sha256": source_hash, "bytes": output.stat().st_size})
        manifest = {
            "base": {"path": "../base-patched-signed.apk", "sha256": digest(base)},
            "splits": records, "signer_sha256": expected_signer,
            "abi": "armeabi-v7a", "minimum_sdk": 28,
            "installed_on_device": False,
        }
        (args.output / "manifest.json").write_text(json.dumps(manifest, indent=2) + "\n")
        print(json.dumps(manifest, indent=2))
    except BaseException:
        shutil.rmtree(args.output)
        raise


if __name__ == "__main__":
    main()
