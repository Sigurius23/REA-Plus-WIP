# Android application artifacts

Use the connected server's advertised Android tools. Repository main and npm
4.1.0 include this family. A skill installation alone cannot add it to an
older server.

Start with `inspect_android_package` on the caller's APK path for package
identity, manifest declarations, coverage, and inline Evidence. The same
operations also admit whole `.xapk` containers (a ZIP with `manifest.json`,
a base APK and split APKs). The manifest's `split_apks` entry with `id: "base"`
selects the base filename, including APKPure's `<package_name>.apk`; legacy
bundles can use one unambiguous package filename or `base.apk`. Conflicting or
missing declarations are rejected. REA+ composes one analysis image from the base
module plus every split's DEX entries, so class coverage spans all modules, but
split resources and signatures are not merged — check the evidence limitations.
Loose directories of regular top-level APKs and `.apks` archives are admitted.
Use exact `apk_members` plus `base_apk` for one archive variant when device
alternatives exist; never combine all alternatives or infer device compatibility.
A directory digest commits to sorted selected names, byte counts and hashes.
AAB inputs require an explicitly configured `REA_BUNDLETOOL_JAR`; their universal
analysis APK covers fused modules only and does not authenticate the source.
For original APK cryptographic verification, configure `REA_APKSIG_JAR` and pass
`verify_signatures: true` to `inspect_android_package`. Report the separate
verifier digest, per-member status and signer consistency. Defaults remain
`not_performed`; generated AAB packaging and composed APKs do not establish
original signatures, publisher trust or installability.
Use
`search_android_classes` to find candidates, `inspect_android_class` for one
class's members, `inspect_android_method` for decompilation, and
`trace_android_references` for incoming static references. Each call takes its
own package path and explicit selectors; do not open a native session first.
Choose an `overload_index` from the class inventory when methods are ambiguous
instead of guessing.

The provider requires a separately supplied headless JADX MCP JAR 0.7.1 and
Java 17 or newer. `REA_JADX_MCP_JAR` selects the absolute JAR path; `JAVA_HOME`
can select Java. REA+ setup does not install or configure that JAR, and doctor
provider scopes cover Hopper/Ghidra rather than JADX. Use existing tools and
report missing prerequisites for the Android task specifically.

Linux and macOS use the POSIX owned-process boundary. Windows x64 requires the
matching bundled native controls and uses an owned Job Object with bidirectional
stdio. A full JDK, including `jdk.compiler`, is required on every host; Windows
`JAVA_HOME` selects `bin\java.exe`. Consult the Android guide for actual host
verification coverage. Calls use one worker and provider deadlines; optional
`REA_JADX_HEAP_MIB` selects the JVM heap. The APK is never launched,
and no emulator is required.

For the bytecode itself, extract a `classesN.dex` member and open it with the
[radare2 provider](https://github.com/morluto/rea/blob/main/docs/radare2-provider.md), or use
`open_binary` with `provider_id: "ghidra"` for full Ghidra DEX decompilation
([Ghidra DEX guide](https://github.com/morluto/rea/blob/main/docs/ghidra-dex.md)). DEX targets use
the `aa` analysis level by default, name methods from their class and
signature, report Dalvik registers rather than stack locals, and expose
addresses that are offsets in that one DEX file. They are not comparable with
Ghidra's DEX addresses or another `classesN.dex` of the same APK. A DEX inside an APK can be selected explicitly as
`/path/app.apk#classesN.dex`; the resulting target preserves container/member
provenance and its own address semantics. Ghidra DEX additionally decompiles to C-like
pseudocode and reports function bodies as address ranges; it imports the
snapshot with Ghidra's `DexLoader` and rejects other binary formats under that
profile.

Manifest entries and decompiled text are static observations, not execution or
policy enforcement. Incoming references are recovered static relationships;
reflection, dynamic loading, and unresolved calls remain unknown. Preserve
artifact digests, locations, diagnostics, and incomplete coverage. For archive
members rather than code analysis, use `open_binary` and `inspect_artifact`.

Use `search_android_strings` for method constants. Default `scan_mode:
"decompiled"` uses Java/smali bodies (`class_limit` default 256, cap 8192;
4096 methods per class). Explicit `scan_mode: "dex"` reads original const-string
and const-string/jumbo instructions without those decompiler caps; its class
limit defaults to 256 and accepts up to 2147483647. DEX matches retain input
member and instruction locations, including a byte offset inside that DEX input;
unknown locations stay null. `analysis_timeout_ms` can extend the 120000 ms total
deadline. Distinguish unreadable `skipped_methods` from
`method_cap_skipped_methods`/`method_cap_skipped_classes`. Either makes coverage
partial. Neither mode covers the entire DEX string pool, annotations or resources.
