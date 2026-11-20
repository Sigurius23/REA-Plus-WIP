"""Supplemental fixed-Arc format count; does not invoke or execute Arc."""

import hashlib
import json
import mmap
import struct
import sys
import zipfile
from pathlib import Path


with Path(sys.argv[1]).open("rb") as source, mmap.mmap(
    source.fileno(), 0, access=mmap.ACCESS_READ
) as data:
    digest = hashlib.sha256(data).hexdigest()
    assert digest == "6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578"
    assert struct.unpack_from("<I", data)[0] == 0xFEEDFACF
    segments, libraries, classic = [], [], []
    fixups = None
    at = 32
    for _ in range(struct.unpack_from("<I", data, 16)[0]):
        kind, size = struct.unpack_from("<II", data, at)
        if kind == 0x19:
            segments.append(struct.unpack_from("<QQQQ", data, at + 24))
        if kind == 0x80000034:
            fixups = struct.unpack_from("<II", data, at + 8)
        if kind in (0xC, 0x80000018, 0x8000001F, 0x80000023):
            start = at + struct.unpack_from("<I", data, at + 8)[0]
            end = data.find(b"\0", start, at + size)
            assert end >= start
            libraries.append(data[start:end].decode())
        if kind in (0x22, 0x80000022):
            classic.append(struct.unpack_from("<10I", data, at + 8))
        at += size
    assert fixups
    base = next(vm for vm, _, offset, length in segments if offset == 0 and length)
    version, starts, imports, symbols, count, form, symbol_form = struct.unpack_from(
        "<7I", data, fixups[0]
    )
    assert version == 0 and symbol_form == 0 and form in (1, 2, 3)
    matches = []
    for index in range(count):
        offset = fixups[0] + imports + index * {1: 4, 2: 8, 3: 16}[form]
        word = struct.unpack_from("<Q" if form == 3 else "<I", data, offset)[0]
        ordinal = word & (0xFFFF if form == 3 else 0xFF)
        name_offset = word >> (32 if form == 3 else 9)
        start = fixups[0] + symbols + name_offset
        end = data.find(b"\0", start, fixups[0] + fixups[1])
        assert end >= start
        if data[start:end] == b"___chkstk_darwin":
            assert 0 < ordinal <= len(libraries)
            matches.append(
                {"index": index, "ordinal": ordinal, "library": libraries[ordinal - 1]}
            )

    starts += fixups[0]
    pointers = binds = 0
    for segment in range(struct.unpack_from("<I", data, starts)[0]):
        offset = struct.unpack_from("<I", data, starts + 4 + 4 * segment)[0]
        if not offset:
            continue
        header = starts + offset
        _, page_size, pointer_form, segment_offset, _, pages = struct.unpack_from(
            "<IHHQIH", data, header
        )
        assert pointer_form == 6
        for page in range(pages):
            first = struct.unpack_from("<H", data, header + 22 + 2 * page)[0]
            if first == 0xFFFF:
                continue
            assert first & 0x8000 == 0
            cursor = base + segment_offset + page * page_size + first
            seen = set()
            while True:
                assert cursor not in seen
                seen.add(cursor)
                vm, _, offset, _ = next(
                    s for s in segments if s[0] <= cursor < s[0] + s[3]
                )
                word = struct.unpack_from("<Q", data, offset + cursor - vm)[0]
                pointers += 1
                binds += word >> 63
                following = (word >> 51) & 0xFFF
                if not following:
                    break
                cursor += 4 * following

ghidra_source = Path(
    "/opt/homebrew/Cellar/ghidra/12.1.4/libexec/Ghidra/Features/Base/lib/Base-src.zip"
)
source_name = "ghidra/app/util/bin/format/macho/commands/chained/DyldChainedFixups.java"
with zipfile.ZipFile(ghidra_source) as archive:
    source_bytes = archive.read(source_name)
assert b".add(fixupAddr, status, RELOCATION_TYPE" in source_bytes
print(
    json.dumps(
        {
            "authority": "Supplemental original-format count and installed-source inference; not a live Ghidra relocation-table measurement",
            "target_sha256": digest,
            "original_chained_pointers": pointers,
            "bind_pointers": binds,
            "rebase_pointers": pointers - binds,
            "imports_count": count,
            "imports_format": form,
            "symbols_format": symbol_form,
            "same_name_probe_imports": matches,
            "classic_dyld_info_commands": classic,
            "ghidra_source": {
                "archive": str(ghidra_source),
                "member": source_name,
                "sha256": hashlib.sha256(source_bytes).hexdigest(),
                "inference": "fixupChainedPointers adds a relocation record for each processed fixup; a complete Arc index therefore exceeds the former 100000-record lookup budget",
            },
            "target_executed": False,
        },
        indent=2,
    )
)
