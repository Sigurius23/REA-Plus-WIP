"""Run the installed REA+ CLI and retain complete evidence and timings.

Usage: python3 run_cli.py LABEL COMMAND [ARG ...]
"""
import datetime
import json
import os
from pathlib import Path
import subprocess
import sys
import time

OUT = Path(__file__).resolve().parent
ROOT = OUT.parent.parent / "rea-local"
NODE = Path("/Users/sigur/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/bin/node")
label, *args = sys.argv[1:]
env = os.environ.copy()
env["JAVA_HOME"] = "/opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk/Contents/Home"
env["REA_JADX_MCP_JAR"] = str(ROOT / "_reference/apk-integration/jadx-headless-mcp-0.7.1-all.jar")
env["REA_JADX_HEAP_MIB"] = "4096"
env["CLANG_MODULE_CACHE_PATH"] = str(OUT / "compiler-cache")
env["SWIFT_MODULECACHE_PATH"] = str(OUT / "compiler-cache")
env["PATH"] = str(NODE.parent) + ":" + env["JAVA_HOME"] + "/bin:" + env["PATH"]
cmd = [str(NODE), str(ROOT / "scripts/rea.mjs"), *args, "--format", "json"]
started = datetime.datetime.now(datetime.timezone.utc).isoformat()
t = time.monotonic()
with (OUT / (label + ".json")).open("wb") as stdout, (OUT / (label + ".stderr.log")).open("wb") as stderr:
    p = subprocess.run(cmd, cwd=ROOT, env=env, stdout=stdout, stderr=stderr)
record = {"label": label, "started_utc": started, "seconds": round(time.monotonic() - t, 3), "exit_code": p.returncode, "command": cmd, "selected_environment": {k: env[k] for k in ("JAVA_HOME", "REA_JADX_MCP_JAR", "REA_JADX_HEAP_MIB", "CLANG_MODULE_CACHE_PATH", "SWIFT_MODULECACHE_PATH")}}
try:
    result = json.loads((OUT / (label + ".json")).read_text())
    record["output_keys"] = list(result) if isinstance(result, dict) else None
except Exception as exc:
    record["json_error"] = str(exc)
with (OUT / "runs.jsonl").open("a") as f:
    f.write(json.dumps(record) + "\n")
print(json.dumps(record))
