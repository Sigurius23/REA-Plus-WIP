// Owned static qualification fixture. Compiled and inspected, never executed.
.section __TEXT,__text,regular,pure_instructions
.p2align 2
.globl _dispatch_entry, _case_zero, _case_one, _direct_call, _indirect_call, _bypassed_call, _different_call
_dispatch_entry:
  mov x8, x0
  and x8, x8, #0xffff
  adrp x9, dispatch_table@PAGE
  add x9, x9, dispatch_table@PAGEOFF
  adr x10, target_anchor
  ldrh w11, [x9, x8, lsl #1]
  add x10, x10, x11, lsl #2
  br x10
target_anchor:
_case_zero:
  mov w0, #10
  ret
_case_one:
  mov w0, #20
  ret
_direct_call:
  mov w0, #1
  mov x20, x21
direct_instruction:
  bl _dispatch_entry
  ret
_indirect_call:
  mov w0, #1
  mov x20, x21
indirect_instruction:
  blr x23
  ret
_bypassed_call:
  mov w0, #1
bypassed_instruction:
  bl _dispatch_entry
  ret
_different_call:
  mov w0, #1
different_instruction:
  bl _case_zero
  ret
bypass_source:
  b bypassed_instruction
.section __TEXT,__const
.p2align 1
dispatch_table:
  .short (_case_zero - target_anchor) / 4
  .short (_case_one - target_anchor) / 4
