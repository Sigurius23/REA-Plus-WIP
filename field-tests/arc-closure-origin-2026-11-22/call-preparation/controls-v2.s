// Owned static-analysis controls. Assemble/link only; never execute.
.section __TEXT,__text,regular,pure_instructions
.p2align 2
.globl _adjacent
_adjacent:
mov w0, #49
blr x23
ret
.globl _separated
_separated:
mov w0, #49
mov x20, x21
blr x23
ret
.globl _even
_even:
mov w0, #50
blr x23
ret
.globl _clobbered
_clobbered:
mov w0, #49
mov x0, x1
blr x23
ret
.globl _bypass_call
_bypass_call:
cbz x1, Lcall
mov w0, #49
mov x20, x21
Lcall:
blr x23
ret
.globl _bypass_move
_bypass_move:
cbz x1, Lmove
mov w0, #49
Lmove:
mov x20, x21
blr x23
ret
.globl _movk
_movk:
mov w0, #49
movk w0, #1, lsl #16
blr x23
ret
.globl _lane
_lane:
mov x0, v1.d[0]
blr x23
ret
.globl _negative_x
_negative_x:
mov x0, #-1
blr x23
ret
.globl _negative_w
_negative_w:
mov w0, #-1
blr x23
ret
.globl _direct
_direct:
mov w0, #49
bl _local_return
ret
_local_return:
ret
.globl _other_argument
_other_argument:
mov x3, #0x1234
blr x23
ret

.globl _logical64
_logical64:
mov x0, #0x00ff00ff00ff00ff
blr x23
ret
.globl _rotate64
_rotate64:
mov x0, #0xf00000000000000f
blr x23
ret
.globl _logical32
_logical32:
mov w0, #0x80000001
blr x23
ret
.globl _shift64
_shift64:
mov x0, #0x1234000000000000
blr x23
ret
.globl _shift32
_shift32:
mov w0, #0x120000
blr x23
ret
.globl _negative_shift
_negative_shift:
mov x0, #0xffff0000ffffffff
blr x23
ret
.globl _clobbered_alias
_clobbered_alias:
mov x0, #49
mov w0, w1
blr x23
ret
.globl _entry_at_definition
_entry_at_definition:
cbz x1, Ldefinition
nop
Ldefinition:
mov w0, #49
mov x20, x21
blr x23
ret
