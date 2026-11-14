"""Compile owned source and inspect owned objects; never execute target code."""
import hashlib
import json
from pathlib import Path
import re
import subprocess

root = Path(__file__).resolve().parent
commands = []


def run(*args):
    result = subprocess.run(args, cwd=root, text=True, capture_output=True)
    commands.append({"args": list(args), "exit_code": result.returncode,
                     "stdout": result.stdout, "stderr": result.stderr})
    result.check_returncode()
    return result.stdout


compiler = run("/usr/bin/swiftc", "--version")
common = ["-module-cache-path", str(root / "module-cache"), "-parse-as-library"]
run("/usr/bin/swiftc", *common, "-enable-library-evolution", "-module-name",
    "ReaResilientPayload", "-emit-module", "-emit-module-path",
    str(root / "ReaResilientPayload.swiftmodule"), str(root / "ResilientPayload.swift"))
for mode in ["Onone", "O"]:
    run("/usr/bin/swiftc", *common, "-I", str(root), "-" + mode,
        "-module-name", "ReaArcProjection", "-emit-assembly", "-o",
        str(root / f"ArcSecondArgumentProjection.{mode}.s"),
        str(root / "ArcSecondArgumentProjection.swift"))

original = (root / "ArcSecondArgumentProjection.O.s").read_text()
before = "\tadr\tx10, LBB100_7\n\tldrb\tw11, [x9, x8]\n\tadd\tx10, x10, x11, lsl #2\n"
after = ("LReaArcSignedAnchor:\n\tadr\tx10, LReaArcSignedAnchor\n"
         "\tldrsw\tx11, [x9, x8, lsl #2]\n\tadd\tx10, x10, x11\n")
assert original.count(before) == 1
word = original.replace(before, after)
word, count = re.subn(r"\t\.byte\t\((LBB100_\d+)-LBB100_7\)>>2",
                      r"\t.long\t\1-LReaArcSignedAnchor", word)
assert count == 28
word = word.replace("lJTI100_0:\n", "\t.p2align 2\nlJTI100_0:\n")
(root / "ArcSecondArgumentProjection.O.word.s").write_text(word)
for label in ["O", "O.word"]:
    assembly = root / f"ArcSecondArgumentProjection.{label}.s"
    obj = root / f"ArcSecondArgumentProjection.{label}.o"
    run("/usr/bin/xcrun", "clang", "-c", "-arch", "arm64", "-o", str(obj), str(assembly))
    result = run("/usr/bin/xcrun", "llvm-objdump", "--macho", "--disassemble", "--reloc", str(obj))
    (root / f"ArcSecondArgumentProjection.{label}.objdump.txt").write_text(result)

files = []
for path in sorted(root.iterdir()):
    if path.is_file() and path.name != "compile-manifest.json":
        data = path.read_bytes()
        files.append({"name": path.name, "size": len(data),
                      "sha256": hashlib.sha256(data).hexdigest()})
(root / "compile-manifest.json").write_text(json.dumps({
    "compiler": compiler, "target_executed": False, "provider_run": False,
    "word_variant": "Owned assembly transformation: byte table -> signed 32-bit relative table; 28 entries; no Swift source semantic change intended.",
    "commands": commands, "files": files,
}, indent=2) + "\n")
print(json.dumps({"compiled": 2, "target_executed": False, "provider_run": False,
                  "directory": str(root)}))
