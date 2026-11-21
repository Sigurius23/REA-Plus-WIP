// Read-only instruction inspection fixture. Linked and inspected, never executed.
.section __TEXT,__text,regular,pure_instructions
#if defined(__arm64__)
.p2align 2
.globl _rea_unlisted_entry
_rea_unlisted_entry:
    br x0
Lmove:
    mov x0, #42
    ret
Lcall:
    bl Lmove
    ret
Ljump:
    b Lmove
.globl _rea_listed_entry
_rea_listed_entry:
    ret
#else
.p2align 12
.globl _rea_unlisted_entry
_rea_unlisted_entry:
    jmpq *%rax
Lmove:
    movl $42, %eax
    retq
Lcall:
    callq Lmove
    retq
Ljump:
    .byte 0xeb
    .byte Lmove - . - 1
Loverlap:
    .byte 0xb8, 0, 0, 0
.globl _rea_listed_entry
_rea_listed_entry:
    retq
Ltruncated:
    .space 4095 - (. - _rea_unlisted_entry), 0
    .byte 0x0f
#endif
.section __DATA,__data
.globl _rea_data
_rea_data:
    .quad 0xd65f03c0d2800540
.zerofill __DATA,__bss,_rea_uninitialized,16,4
.subsections_via_symbols
