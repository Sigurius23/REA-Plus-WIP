# Selected Client metadata and VWT source anchor

This is a conditional static analyst derivation from the qualified public
metadata and Ghidra records, not an implemented automatic invocation carrier.
Artifact SHA256 is `6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578`.

The new reader independently binds metadata `0x1042c8ac0` to indexed Client
descriptor `0x103d648c4`, through kind `0x200` and its exact backpointer. The
descriptor's field-vector word offset is 2. Vector base `0x1042c8ad0` contains
**32-bit** byte offsets `0,16,...,352` for the 23 reflected fields. Its first
entry belongs to the already parsed `boolForSetting` declaration. The VWT
pointer is read at metadata minus 8: table `0x1042c8a58`, size/stride `0x170`,
copy role at table plus 16 -> `0x100d97b04`. Neither 23 times a closure size
nor equality of a witness helper address supplies nominal identity.

Wrapper `0x100cce81c` has 15 retained instructions. It saves incoming X1 in
X19; incoming X0 becomes the source X1. At `0x100cce830..834`, X2 is the exact
metadata address above. At `0x100cce838..83c`, X8 is loaded through metadata
minus 8 and table plus 16. It restores the destination from X19 to X0 and
calls X8 at `0x100cce844`. Under the **normal Swift value-witness ABI, stable
metadata binding and a valid source at this exact operation** premises, the
source is therefore a typed Client snapshot. This is an operation-specific
source type, not a proof of every return of an anonymous getter or constructor.

The selected caller `0x100d929a0` sets X0 to SP+`0x170` and X1 to SP before
calling the wrapper at `0x100d929f8`. Its selected stack allocation is `0x2e0`.
The two size-`0x170` ranges are distinct within that frame. The preceding
calls use global `0x104702f28` as source with a count of `0x170`. These physical
anchors identify the candidate local snapshot and copy route; they do not
prove an active injected implementation, arbitrary global stability, unknown
call purity or constructor declaration ownership.

The 118-instruction VWT target saves destination X0 into X19. It loads Q0/Q1
from source X1 at `0x100d97b2c` and stores them into destination at
`0x100d97b34`, covering the first code/context pair. It continues explicit
loads/stores through offset `0x160`, ending at `0x100d97c00`, before its first
call at `0x100d97c04`. There are then 23 calls to `0x1036404f8` with the saved
context-word values, followed by returning the destination. This supports a
pre-call memory projection under the stated valid VWT premises. It does not
prove purity, nonescape or preservation after those calls, and does not say
what code/context values were present in the global or source snapshot.

Consequently, the exact metadata owner, physical field offset and conditional
VWT source anchor are concrete. The relevant code/context origin and closed
memory windows remain incomplete. So does the selected argument ABI: the
compiler controls show that reflected function shape and current size alone
do not select direct versus indirect passing. A future context producer must
retain these premises and missing facts, then prove unchanged forwarding and
table arithmetic for the particular invocation. It must not install a global
297-case CFG/JumpTable override on shared helper `0x1005aa5e4`.
