"""Build and inspect owned Swift controls. Never loads or executes a fixture."""

import hashlib
import json
from pathlib import Path
import subprocess

OUT = Path(__file__).resolve().parent


def write_once(path, text):
    if path.exists():
        assert path.read_text() == text, f'Refusing changed overwrite: {path}'
    else:
        path.write_text(text)


cases = '\n'.join(f'        case setting{i:03d}' for i in range(297))


def converter(name, owner):
    arms = '\n'.join(f'    case .setting{i:03d}: return "owned.fixture.key.{i:03d}.distinct"'
                     for i in range(297))
    return f'''@inline(never) private func {name}(_ setting: {owner}.Setting297) -> String {{
    switch setting {{
{arms}
    }}
}}
'''


source = '''// Owned static-analysis controls. Compile/disassemble only; never execute.
// Same nested name and case count deliberately do not establish nominal identity.
public enum Primary {
    @frozen public enum Setting297 {
''' + cases + '''
    }
}
public enum Foreign {
    @frozen public enum Setting297 {
''' + cases + '''
    }
}

public final class Receiver {
    public let expectedLength: Int
    public init(expectedLength: Int) { self.expectedLength = expectedLength }
    @inline(never) public func bool(forKey key: String) -> Bool {
        key.utf8.count == expectedLength
    }
}

// Ordinary associated-type data supplies a source-owned Value=Self chain.
public protocol FactoryKey {
    associatedtype Value
    static func make(receiver: Receiver) -> Value
}

@frozen public struct TypedClient {
    public let boolForSetting: (Primary.Setting297) -> Bool
    @inline(never) public init(receiver: Receiver) {
        self.boolForSetting = { setting in typedReader(setting, receiver: receiver) }
    }
}
extension TypedClient: FactoryKey {
    public typealias Value = TypedClient
    @inline(never) public static func make(receiver: Receiver) -> TypedClient {
        TypedClient(receiver: receiver)
    }
}

@frozen public struct WrongInputClient {
    public let boolForSetting: (UInt16) -> Bool
    @inline(never) public init(receiver: Receiver) {
        self.boolForSetting = { raw in rawReader(raw, receiver: receiver) }
    }
}
extension WrongInputClient: FactoryKey {
    public typealias Value = WrongInputClient
    @inline(never) public static func make(receiver: Receiver) -> WrongInputClient {
        WrongInputClient(receiver: receiver)
    }
}

@frozen public struct WrongOwnerClient {
    public let boolForSetting: (Foreign.Setting297) -> Bool
    @inline(never) public init(receiver: Receiver) {
        self.boolForSetting = { setting in foreignReader(setting, receiver: receiver) }
    }
}
extension WrongOwnerClient: FactoryKey {
    public typealias Value = WrongOwnerClient
    @inline(never) public static func make(receiver: Receiver) -> WrongOwnerClient {
        WrongOwnerClient(receiver: receiver)
    }
}

@inline(never) private func typedReader(_ setting: Primary.Setting297,
                                       receiver: Receiver) -> Bool {
    receiver.bool(forKey: stringKey(setting))
}
@inline(never) private func rawReader(_ raw: UInt16, receiver: Receiver) -> Bool {
    // Intentional negative control: UInt16 has 65,536 representations, and
    // this unchecked bit conversion supplies no valid-enum premise.
    receiver.bool(forKey: stringKey(unsafeBitCast(raw, to: Primary.Setting297.self)))
}
@inline(never) private func foreignReader(_ setting: Foreign.Setting297,
                                         receiver: Receiver) -> Bool {
    receiver.bool(forKey: foreignStringKey(setting))
}

''' + converter('stringKey', 'Primary') + '\n' + converter('foreignStringKey', 'Foreign')
write_once(OUT/'TypedClientControls.swift', source)


def remove_declaration(text, marker):
    start = text.index(marker)
    opening = text.index('{', start)
    level = 1
    cursor = opening + 1
    while level:
        level += (text[cursor] == '{') - (text[cursor] == '}')
        cursor += 1
    return text[:start] + text[cursor:]


positive = source
for marker in ['public enum Foreign', '@frozen public struct WrongInputClient',
               'extension WrongInputClient', '@frozen public struct WrongOwnerClient',
               'extension WrongOwnerClient', '@inline(never) private func rawReader',
               '@inline(never) private func foreignReader',
               '@inline(never) private func foreignStringKey']:
    positive = remove_declaration(positive, marker)
write_once(OUT/'PositiveOnly.swift', positive)
boxed = positive.replace('public init(receiver: Receiver)',
                         'public init(receiver: Receiver, salt: UInt8)')
boxed = boxed.replace('typedReader(setting, receiver: receiver)',
                      'boxedReader(setting, receiver: receiver, salt: salt)')
boxed = boxed.replace('TypedClient(receiver: receiver)',
                      'TypedClient(receiver: receiver, salt: UInt8(truncatingIfNeeded: receiver.expectedLength))')
boxed = boxed.replace('private func typedReader(_ setting: Primary.Setting297,\n'
                      '                                       receiver: Receiver) -> Bool {\n'
                      '    receiver.bool(forKey: stringKey(setting))',
                      'private func boxedReader(_ setting: Primary.Setting297,\n'
                      '                                       receiver: Receiver, salt: UInt8) -> Bool {\n'
                      '    receiver.bool(forKey: stringKey(setting)) != (salt == 0)')
assert 'private func boxedReader' in boxed and 'private func typedReader' not in boxed
write_once(OUT/'BoxedPositive.swift', boxed)
write_once(OUT/'.gitignore', '*.dylib\n*-O.ll\nmodule-cache/\n')

commands = []


def run(command, output=None):
    commands.append(command)
    completed = subprocess.run(command, cwd=OUT, capture_output=True, text=True, check=True)
    if output:
        (OUT/output).write_text(completed.stdout + completed.stderr)
    assert not completed.stderr or output, completed.stderr


run(['xcrun', 'swiftc', '--version'], 'compiler-version.txt')
base = ['xcrun', 'swiftc', '-parse-as-library', '-O', '-whole-module-optimization',
        '-target', 'arm64-apple-macosx14.0', '-module-name', 'TypedClientControls',
        '-module-cache-path', str(OUT/'module-cache')]
run(base + ['-emit-assembly', 'TypedClientControls.swift', '-o', 'TypedClientControls-O.s'])
run(base + ['-emit-library', 'TypedClientControls.swift', '-o', 'libTypedClientControls.dylib'])
run(base + ['-emit-ir', 'TypedClientControls.swift', '-o', 'TypedClientControls-O.ll'])
run(['xcrun', 'nm', '-an', 'libTypedClientControls.dylib'], 'symbols.txt')
run(['xcrun', 'llvm-objdump', '--macho', '--disassemble', 'libTypedClientControls.dylib'],
    'disassembly.txt')
run(['xcrun', 'llvm-objdump', '--macho', '--private-headers', 'libTypedClientControls.dylib'],
    'load-commands.txt')
run(['xcrun', 'llvm-objdump', '--macho', '--chained-fixups', 'libTypedClientControls.dylib'],
    'fixups.txt')
run(['xcrun', 'dyld_info', '-fixups', 'libTypedClientControls.dylib'], 'fixup-bindings.txt')
run(['xcrun', 'strip', '-x', '-o', 'libTypedClientControls-stripped.dylib',
     'libTypedClientControls.dylib'])
run(['xcrun', 'nm', '-an', 'libTypedClientControls-stripped.dylib'], 'stripped-symbols.txt')
run(['xcrun', 'llvm-objdump', '--macho', '--disassemble', 'libTypedClientControls-stripped.dylib'],
    'stripped-disassembly.txt')
positive_base = ['xcrun', 'swiftc', '-parse-as-library', '-O', '-whole-module-optimization',
                 '-target', 'arm64-apple-macosx14.0', '-module-name', 'TypedPositive',
                 '-module-cache-path', str(OUT/'module-cache')]
run(positive_base + ['-emit-assembly', 'PositiveOnly.swift', '-o', 'PositiveOnly-O.s'])
run(positive_base + ['-emit-library', 'PositiveOnly.swift', '-o', 'libTypedPositive.dylib'])
run(['xcrun', 'nm', '-an', 'libTypedPositive.dylib'], 'positive-symbols.txt')
run(['xcrun', 'llvm-objdump', '--macho', '--disassemble', 'libTypedPositive.dylib'],
    'positive-disassembly.txt')
run(['xcrun', 'llvm-objdump', '--macho', '--chained-fixups', 'libTypedPositive.dylib'],
    'positive-fixups.txt')
run(['xcrun', 'dyld_info', '-fixups', 'libTypedPositive.dylib'], 'positive-fixup-bindings.txt')
run(['xcrun', 'strip', '-x', '-o', 'libTypedPositive-stripped.dylib',
     'libTypedPositive.dylib'])
run(['xcrun', 'nm', '-an', 'libTypedPositive-stripped.dylib'], 'positive-stripped-symbols.txt')
boxed_base = ['xcrun', 'swiftc', '-parse-as-library', '-O', '-whole-module-optimization',
              '-target', 'arm64-apple-macosx14.0', '-module-name', 'TypedBoxed',
              '-module-cache-path', str(OUT/'module-cache')]
run(boxed_base + ['-emit-assembly', 'BoxedPositive.swift', '-o', 'BoxedPositive-O.s'])
run(boxed_base + ['-emit-library', 'BoxedPositive.swift', '-o', 'libTypedBoxed.dylib'])
run(['xcrun', 'nm', '-an', 'libTypedBoxed.dylib'], 'boxed-symbols.txt')
run(['xcrun', 'llvm-objdump', '--macho', '--disassemble', 'libTypedBoxed.dylib'],
    'boxed-disassembly.txt')
run(['xcrun', 'dyld_info', '-fixups', 'libTypedBoxed.dylib'], 'boxed-fixup-bindings.txt')

receipt = {'authority': 'Owned compiler and static-tool invocations only.',
           'target_or_fixture_executed': False, 'provider_launched': False,
           'cwd': str(OUT), 'commands': commands,
           'binaries': [{'name': p.name, 'bytes': p.stat().st_size,
                         'sha256': hashlib.sha256(p.read_bytes()).hexdigest()}
                        for p in sorted(OUT.glob('*.dylib'))]}
(OUT/'commands.json').write_text(json.dumps(receipt, indent=2)+'\n')
print(json.dumps({'status': 'compiled-and-inspected-only', **receipt['binaries'][0]}))
