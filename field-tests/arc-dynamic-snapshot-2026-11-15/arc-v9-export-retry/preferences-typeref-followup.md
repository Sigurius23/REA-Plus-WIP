The captured generic metadata helper resolves a cold-cache request by loading the 64-bit record at X1, passing X1+signext32(lowword) and asr64(highword) as pointer/length to swift_getTypeByMangledNameInContext. This is established by the retained helper instructions at 0x100005158..0x100005170, not an assumed descriptor layout.

The newly captured record at0x103788790 therefore declares a 12-byte typeref at0x103bd6880; adjacent0x103788798 declares a 14-byte typeref at0x103bd688e. These are the narrow next reads for the preference-like dependency client and returned publisher wrapper. No nominal type, backend, actual instance or executed persistence operation is established yet.

[Exact derivation and source hashes](preferences-typeref-followup.json).
