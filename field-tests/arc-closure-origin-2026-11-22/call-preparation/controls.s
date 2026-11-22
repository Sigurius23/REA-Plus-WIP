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
