.text
.globl _rea_opaque, _rea_forever, _rea_invalid, _rea_syscall, _rea_tls, _rea_unmodeled
.p2align 2
_rea_opaque:
    ret
_rea_forever:
#if defined(__aarch64__)
    b _rea_forever
_rea_invalid:
    .long 0
_rea_syscall:
    svc #0
    ret
_rea_tls:
    mrs x0, tpidr_el0
    ret
_rea_unmodeled:
    msr tpidr_el0, x0
#else
    jmp _rea_forever
_rea_invalid:
    ud2
_rea_syscall:
    syscall
    ret
_rea_tls:
    movq %fs:0, %rax
    ret
_rea_unmodeled:
    fld1
#endif
    ret
