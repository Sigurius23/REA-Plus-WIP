#!/usr/bin/env python3
"""Read-only device/install preflight. Does not install, uninstall or reset an app."""
import argparse
import hashlib
import json
from pathlib import Path
import shlex
import subprocess

HERE = Path(__file__).resolve().parent


def adb(*arguments):
    return subprocess.check_output(['adb', *arguments], text=True).strip()


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--serial')
    args = parser.parse_args()
    devices = [line.split()[0] for line in adb('devices').splitlines()[1:]
               if len(line.split()) >= 2 and line.split()[1] == 'device']
    if args.serial:
        devices = [device for device in devices if device == args.serial]
    if len(devices) != 1:
        print(json.dumps({'status': 'waiting_for_one_authorized_device', 'authorized_devices': len(devices)}))
        return 2
    serial = devices[0]
    sdk = int(adb('-s', serial, 'shell', 'getprop', 'ro.build.version.sdk'))
    abis = adb('-s', serial, 'shell', 'getprop', 'ro.product.cpu.abilist').split(',')
    installed = 'package:com.whoop.android' in adb(
        '-s', serial, 'shell', 'pm', 'list', 'packages', 'com.whoop.android').splitlines()
    manifest = json.loads((HERE/'install-set/manifest.json').read_text())
    files = [(HERE/'install-set'/manifest['base']['path'], manifest['base']['sha256'])]
    files += [(HERE/'install-set'/split['path'], split['sha256']) for split in manifest['splits']]
    for path, expected in files:
        with path.open('rb') as stream:
            if hashlib.file_digest(stream, 'sha256').hexdigest() != expected:
                raise ValueError(f'Install artifact changed: {path.name}')
    compatible = sdk >= manifest['minimum_sdk'] and manifest['abi'] in abis
    result = {'sdk': sdk, 'abis': abis, 'compatible_with_this_arm32_bundle': compatible,
              'existing_whoop_installation': installed, 'artifact_hashes_verified': True,
              'ready_for_fresh_test_install': compatible and not installed}
    if compatible and not installed:
        result['install_command'] = shlex.join(['adb', '-s', serial, 'install-multiple',
                                               *[str(path.resolve()) for path, _ in files]])
    elif installed:
        result['next_step'] = 'Review existing app data and signing identity before replacing the installation.'
    else:
        result['next_step'] = 'Use an armeabi-v7a capable Android 9+ device or obtain the matching arm64 bundle.'
    print(json.dumps(result, indent=2))
    return 0


if __name__ == '__main__':
    raise SystemExit(main())
