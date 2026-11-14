.text
.globl _effects
_effects:
 stlr x8, [x0]
 stnp x8, x8, [x0]
 str x0, [sp, #0x130]
 add x0, sp, #64
 str x0, [sp, #0xe0]
 ldr x0, [sp, #0xe0]
 ldr x17, [sp, #0xe0]!
 nop
 br x21
 add sp, sp, #0xe0
 sub sp, sp, #0xe0
 mov sp, x29
 ret
