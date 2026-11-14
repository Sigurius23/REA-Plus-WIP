	.build_version macos, 26, 0	sdk_version 26, 5
	.section	__TEXT,__text,regular,pure_instructions
	.globl	_$s22ReaSwiftRelativeSwitch03reacD0ySiAA0A9LiveEventO_SitF ; -- Begin function $s22ReaSwiftRelativeSwitch03reacD0ySiAA0A9LiveEventO_SitF
	.p2align	2
_$s22ReaSwiftRelativeSwitch03reacD0ySiAA0A9LiveEventO_SitF: ; @"$s22ReaSwiftRelativeSwitch03reacD0ySiAA0A9LiveEventO_SitF"
	.cfi_startproc
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	sub	sp, sp, #224
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	stur	x0, [x29, #-56]                 ; 8-byte Folded Spill
	stur	x1, [x29, #-64]                 ; 8-byte Folded Spill
	stur	xzr, [x29, #-8]
	stur	xzr, [x29, #-16]
	mov	x0, #0                          ; =0x0
	bl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMa
	ldur	x8, [x29, #-64]                 ; 8-byte Folded Reload
	mov	x9, x0
	ldur	x0, [x29, #-56]                 ; 8-byte Folded Reload
	stur	x9, [x29, #-40]                 ; 8-byte Folded Spill
	ldur	x9, [x9, #-8]
	ldr	x9, [x9, #64]
	lsr	x9, x9, #0
	add	x9, x9, #15
	and	x9, x9, #0xfffffffffffffff0
	stur	x9, [x29, #-48]                 ; 8-byte Folded Spill
Lloh0:
	adrp	x16, ___chkstk_darwin@GOTPAGE
Lloh1:
	ldr	x16, [x16, ___chkstk_darwin@GOTPAGEOFF]
	blr	x16
	ldur	x10, [x29, #-48]                ; 8-byte Folded Reload
	mov	x9, sp
	subs	x1, x9, x10
	stur	x1, [x29, #-32]                 ; 8-byte Folded Spill
	mov	sp, x1
	mov	x9, x0
	stur	x9, [x29, #-8]
	stur	x8, [x29, #-16]
	bl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOc
	ldur	x1, [x29, #-40]                 ; 8-byte Folded Reload
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	stur	x8, [x29, #-24]                 ; 8-byte Folded Spill
; %bb.1:
	ldur	x11, [x29, #-24]                ; 8-byte Folded Reload
	adrp	x10, lJTI0_0@PAGE
	add	x10, x10, lJTI0_0@PAGEOFF
Ltmp0:
	adr	x8, Ltmp0
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	ldr	xzr, [sp]
	br	x8
; %bb.2:
LBB0_3:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_0
	stur	x0, [x29, #-80]                 ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-80]                 ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_4:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_1
	stur	x0, [x29, #-88]                 ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-88]                 ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_5:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_2
	stur	x0, [x29, #-96]                 ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-96]                 ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_6:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_3
	stur	x0, [x29, #-104]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-104]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_7:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_4
	stur	x0, [x29, #-112]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-112]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_8:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_5
	stur	x0, [x29, #-120]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-120]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_9:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_6
	stur	x0, [x29, #-128]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-128]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_10:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_7
	stur	x0, [x29, #-136]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-136]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_11:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_8
	stur	x0, [x29, #-144]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-144]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_12:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_9
	stur	x0, [x29, #-152]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-152]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_13:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_10
	stur	x0, [x29, #-160]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-160]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_14:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_11
	stur	x0, [x29, #-168]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-168]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_15:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_12
	stur	x0, [x29, #-176]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-176]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_16:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_13
	stur	x0, [x29, #-184]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-184]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_17:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_14
	stur	x0, [x29, #-192]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-192]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_18:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_15
	stur	x0, [x29, #-200]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-200]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_19:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_16
	stur	x0, [x29, #-208]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-208]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_20:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_17
	stur	x0, [x29, #-216]                ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-32]                 ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	ldur	x0, [x29, #-216]                ; 8-byte Folded Reload
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_21:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_18
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_22:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_19
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_23:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_20
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_24:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_21
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_25:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_22
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_26:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_23
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_27:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_24
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_28:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_25
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_29:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_26
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_30:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_27
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_31:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_28
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_32:
	ldur	x0, [x29, #-64]                 ; 8-byte Folded Reload
	bl	_rea_case_29
	stur	x0, [x29, #-72]                 ; 8-byte Folded Spill
	b	LBB0_33
LBB0_33:
	ldur	x0, [x29, #-72]                 ; 8-byte Folded Reload
	mov	sp, x29
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
	.loh AdrpLdrGot	Lloh0, Lloh1
	.cfi_endproc
	.p2align	2
lJTI0_0:
	.long	LBB0_3-Ltmp0
	.long	LBB0_4-Ltmp0
	.long	LBB0_5-Ltmp0
	.long	LBB0_6-Ltmp0
	.long	LBB0_7-Ltmp0
	.long	LBB0_8-Ltmp0
	.long	LBB0_9-Ltmp0
	.long	LBB0_10-Ltmp0
	.long	LBB0_11-Ltmp0
	.long	LBB0_12-Ltmp0
	.long	LBB0_13-Ltmp0
	.long	LBB0_14-Ltmp0
	.long	LBB0_15-Ltmp0
	.long	LBB0_16-Ltmp0
	.long	LBB0_17-Ltmp0
	.long	LBB0_18-Ltmp0
	.long	LBB0_19-Ltmp0
	.long	LBB0_20-Ltmp0
	.long	LBB0_21-Ltmp0
	.long	LBB0_22-Ltmp0
	.long	LBB0_23-Ltmp0
	.long	LBB0_24-Ltmp0
	.long	LBB0_25-Ltmp0
	.long	LBB0_26-Ltmp0
	.long	LBB0_27-Ltmp0
	.long	LBB0_28-Ltmp0
	.long	LBB0_29-Ltmp0
	.long	LBB0_30-Ltmp0
	.long	LBB0_31-Ltmp0
	.long	LBB0_32-Ltmp0
                                        ; -- End function
	.globl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMa ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOMa
	.p2align	2
_$s22ReaSwiftRelativeSwitch0A9LiveEventOMa: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOMa"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	adrp	x8, _$s22ReaSwiftRelativeSwitch0A9LiveEventOMl@PAGE
	ldr	x8, [x8, _$s22ReaSwiftRelativeSwitch0A9LiveEventOMl@PAGEOFF]
	mov	x9, #0                          ; =0x0
	mov	x0, x8
	str	x0, [sp, #16]                   ; 8-byte Folded Spill
	stur	x9, [x29, #-8]                  ; 8-byte Folded Spill
	cbnz	x8, LBB1_2
	b	LBB1_1
LBB1_1:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	adrp	x1, _$s22ReaSwiftRelativeSwitch0A9LiveEventOMn@PAGE
	add	x1, x1, _$s22ReaSwiftRelativeSwitch0A9LiveEventOMn@PAGEOFF
	bl	_swift_getSingletonMetadata
	str	x0, [sp, #16]                   ; 8-byte Folded Spill
	stur	x1, [x29, #-8]                  ; 8-byte Folded Spill
	b	LBB1_2
LBB1_2:
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
                                        ; -- End function
	.private_extern	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOc ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOWOc
	.globl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOc
	.weak_definition	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOc
	.p2align	2
_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOc: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOWOc"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	str	x1, [sp]                        ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMa
	mov	x1, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	str	x1, [sp, #16]                   ; 8-byte Folded Spill
	bl	_swift_getEnumCaseMultiPayload
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	stur	x8, [x29, #-8]                  ; 8-byte Folded Spill
	subs	x8, x8, #17
	b.hi	LBB2_20
; %bb.1:
	ldur	x11, [x29, #-8]                 ; 8-byte Folded Reload
	adrp	x10, lJTI2_0@PAGE
	add	x10, x10, lJTI2_0@PAGEOFF
Ltmp1:
	adr	x8, Ltmp1
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
LBB2_2:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #0                          ; =0x0
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_3:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #1                          ; =0x1
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_4:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #2                          ; =0x2
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_5:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #3                          ; =0x3
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_6:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #4                          ; =0x4
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_7:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #5                          ; =0x5
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_8:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #6                          ; =0x6
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_9:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #7                          ; =0x7
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_10:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #8                          ; =0x8
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_11:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #9                          ; =0x9
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_12:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #10                         ; =0xa
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_13:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #11                         ; =0xb
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_14:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #12                         ; =0xc
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_15:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #13                         ; =0xd
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_16:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #14                         ; =0xe
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_17:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #15                         ; =0xf
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_18:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #16                         ; =0x10
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_19:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #17                         ; =0x11
	bl	_swift_storeEnumTagMultiPayload
	b	LBB2_21
LBB2_20:
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldr	x8, [sp, #16]                   ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB2_21
LBB2_21:
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
	.p2align	2
lJTI2_0:
	.long	LBB2_2-Ltmp1
	.long	LBB2_3-Ltmp1
	.long	LBB2_4-Ltmp1
	.long	LBB2_5-Ltmp1
	.long	LBB2_6-Ltmp1
	.long	LBB2_7-Ltmp1
	.long	LBB2_8-Ltmp1
	.long	LBB2_9-Ltmp1
	.long	LBB2_10-Ltmp1
	.long	LBB2_11-Ltmp1
	.long	LBB2_12-Ltmp1
	.long	LBB2_13-Ltmp1
	.long	LBB2_14-Ltmp1
	.long	LBB2_15-Ltmp1
	.long	LBB2_16-Ltmp1
	.long	LBB2_17-Ltmp1
	.long	LBB2_18-Ltmp1
	.long	LBB2_19-Ltmp1
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwCP
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwCP: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwCP"
; %bb.0:
	sub	sp, sp, #80
	stp	x29, x30, [sp, #64]             ; 16-byte Folded Spill
	add	x29, sp, #64
	str	x0, [sp, #24]                   ; 8-byte Folded Spill
	str	x1, [sp, #32]                   ; 8-byte Folded Spill
	stur	x2, [x29, #-24]                 ; 8-byte Folded Spill
	ldur	x8, [x2, #-8]
	stur	x8, [x29, #-16]                 ; 8-byte Folded Spill
	ldr	w8, [x8, #80]
                                        ; kill: def $x8 killed $w8
	stur	x8, [x29, #-8]                  ; 8-byte Folded Spill
	tbz	w8, #17, LBB3_2
	b	LBB3_1
LBB3_1:
	ldr	x8, [sp, #32]                   ; 8-byte Folded Reload
	ldr	x0, [x8]
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	bl	_swift_retain
	ldr	x10, [sp, #8]                   ; 8-byte Folded Reload
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x9, [x29, #-8]                  ; 8-byte Folded Reload
	str	x10, [x8]
	ldr	x8, [x8]
	and	x10, x9, #0xff
	add	x9, x10, #16
	bic	x9, x9, x10
	add	x8, x8, x9
	str	x8, [sp, #16]                   ; 8-byte Folded Spill
	b	LBB3_24
LBB3_2:
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #32]                   ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	str	x8, [sp]                        ; 8-byte Folded Spill
	subs	x8, x8, #17
	b.hi	LBB3_22
; %bb.3:
	ldr	x11, [sp]                       ; 8-byte Folded Reload
	adrp	x10, lJTI3_0@PAGE
	add	x10, x10, lJTI3_0@PAGEOFF
Ltmp2:
	adr	x8, Ltmp2
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
LBB3_4:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #0                          ; =0x0
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_5:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #1                          ; =0x1
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_6:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #2                          ; =0x2
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_7:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #3                          ; =0x3
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_8:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #4                          ; =0x4
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_9:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #5                          ; =0x5
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_10:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #6                          ; =0x6
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_11:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #7                          ; =0x7
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_12:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #8                          ; =0x8
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_13:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #9                          ; =0x9
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_14:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #10                         ; =0xa
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_15:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #11                         ; =0xb
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_16:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #12                         ; =0xc
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_17:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #13                         ; =0xd
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_18:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #14                         ; =0xe
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_19:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #15                         ; =0xf
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_20:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #16                         ; =0x10
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_21:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	mov	w2, #17                         ; =0x11
	bl	_swift_storeEnumTagMultiPayload
	b	LBB3_23
LBB3_22:
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x29, #-16]                 ; 8-byte Folded Reload
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB3_23
LBB3_23:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	str	x8, [sp, #16]                   ; 8-byte Folded Spill
	b	LBB3_24
LBB3_24:
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #64]             ; 16-byte Folded Reload
	add	sp, sp, #80
	ret
	.p2align	2
lJTI3_0:
	.long	LBB3_4-Ltmp2
	.long	LBB3_5-Ltmp2
	.long	LBB3_6-Ltmp2
	.long	LBB3_7-Ltmp2
	.long	LBB3_8-Ltmp2
	.long	LBB3_9-Ltmp2
	.long	LBB3_10-Ltmp2
	.long	LBB3_11-Ltmp2
	.long	LBB3_12-Ltmp2
	.long	LBB3_13-Ltmp2
	.long	LBB3_14-Ltmp2
	.long	LBB3_15-Ltmp2
	.long	LBB3_16-Ltmp2
	.long	LBB3_17-Ltmp2
	.long	LBB3_18-Ltmp2
	.long	LBB3_19-Ltmp2
	.long	LBB3_20-Ltmp2
	.long	LBB3_21-Ltmp2
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwxx
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwxx: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwxx"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	str	x0, [sp]                        ; 8-byte Folded Spill
	bl	_swift_getEnumCaseMultiPayload
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	subs	x8, x8, #17
	b.hi	LBB4_20
; %bb.1:
	ldr	x11, [sp, #8]                   ; 8-byte Folded Reload
	adrp	x10, lJTI4_0@PAGE
	add	x10, x10, lJTI4_0@PAGEOFF
Ltmp3:
	adr	x8, Ltmp3
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
LBB4_2:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_3:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_4:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_5:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_6:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_7:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_8:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_9:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_10:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_11:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_12:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_13:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_14:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_15:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_16:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_17:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_18:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_19:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB4_20
LBB4_20:
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
	.p2align	2
lJTI4_0:
	.long	LBB4_2-Ltmp3
	.long	LBB4_3-Ltmp3
	.long	LBB4_4-Ltmp3
	.long	LBB4_5-Ltmp3
	.long	LBB4_6-Ltmp3
	.long	LBB4_7-Ltmp3
	.long	LBB4_8-Ltmp3
	.long	LBB4_9-Ltmp3
	.long	LBB4_10-Ltmp3
	.long	LBB4_11-Ltmp3
	.long	LBB4_12-Ltmp3
	.long	LBB4_13-Ltmp3
	.long	LBB4_14-Ltmp3
	.long	LBB4_15-Ltmp3
	.long	LBB4_16-Ltmp3
	.long	LBB4_17-Ltmp3
	.long	LBB4_18-Ltmp3
	.long	LBB4_19-Ltmp3
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwcp
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwcp: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwcp"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp]                        ; 8-byte Folded Spill
	mov	x0, x1
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	mov	x1, x2
	str	x1, [sp, #16]                   ; 8-byte Folded Spill
	bl	_swift_getEnumCaseMultiPayload
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	stur	x8, [x29, #-8]                  ; 8-byte Folded Spill
	subs	x8, x8, #17
	b.hi	LBB5_20
; %bb.1:
	ldur	x11, [x29, #-8]                 ; 8-byte Folded Reload
	adrp	x10, lJTI5_0@PAGE
	add	x10, x10, lJTI5_0@PAGEOFF
Ltmp4:
	adr	x8, Ltmp4
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
LBB5_2:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #0                          ; =0x0
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_3:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #1                          ; =0x1
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_4:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #2                          ; =0x2
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_5:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #3                          ; =0x3
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_6:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #4                          ; =0x4
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_7:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #5                          ; =0x5
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_8:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #6                          ; =0x6
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_9:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #7                          ; =0x7
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_10:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #8                          ; =0x8
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_11:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #9                          ; =0x9
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_12:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #10                         ; =0xa
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_13:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #11                         ; =0xb
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_14:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #12                         ; =0xc
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_15:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #13                         ; =0xd
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_16:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #14                         ; =0xe
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_17:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #15                         ; =0xf
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_18:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #16                         ; =0x10
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_19:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #17                         ; =0x11
	bl	_swift_storeEnumTagMultiPayload
	b	LBB5_21
LBB5_20:
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldr	x8, [sp, #16]                   ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB5_21
LBB5_21:
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
	.p2align	2
lJTI5_0:
	.long	LBB5_2-Ltmp4
	.long	LBB5_3-Ltmp4
	.long	LBB5_4-Ltmp4
	.long	LBB5_5-Ltmp4
	.long	LBB5_6-Ltmp4
	.long	LBB5_7-Ltmp4
	.long	LBB5_8-Ltmp4
	.long	LBB5_9-Ltmp4
	.long	LBB5_10-Ltmp4
	.long	LBB5_11-Ltmp4
	.long	LBB5_12-Ltmp4
	.long	LBB5_13-Ltmp4
	.long	LBB5_14-Ltmp4
	.long	LBB5_15-Ltmp4
	.long	LBB5_16-Ltmp4
	.long	LBB5_17-Ltmp4
	.long	LBB5_18-Ltmp4
	.long	LBB5_19-Ltmp4
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwca
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwca: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwca"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	str	x1, [sp, #16]                   ; 8-byte Folded Spill
	stur	x2, [x29, #-8]                  ; 8-byte Folded Spill
	subs	x8, x0, x1
	b.eq	LBB6_23
	b	LBB6_1
LBB6_1:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	bl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOh
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	str	x8, [sp]                        ; 8-byte Folded Spill
	subs	x8, x8, #17
	b.hi	LBB6_21
; %bb.2:
	ldr	x11, [sp]                       ; 8-byte Folded Reload
	adrp	x10, lJTI6_0@PAGE
	add	x10, x10, lJTI6_0@PAGEOFF
Ltmp5:
	adr	x8, Ltmp5
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
LBB6_3:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #0                          ; =0x0
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_4:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #1                          ; =0x1
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_5:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #2                          ; =0x2
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_6:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #3                          ; =0x3
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_7:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #4                          ; =0x4
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_8:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #5                          ; =0x5
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_9:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #6                          ; =0x6
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_10:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #7                          ; =0x7
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_11:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #8                          ; =0x8
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_12:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #9                          ; =0x9
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_13:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #10                         ; =0xa
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_14:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #11                         ; =0xb
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_15:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #12                         ; =0xc
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_16:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #13                         ; =0xd
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_17:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #14                         ; =0xe
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_18:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #15                         ; =0xf
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_19:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #16                         ; =0x10
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_20:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #16]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #17                         ; =0x11
	bl	_swift_storeEnumTagMultiPayload
	b	LBB6_22
LBB6_21:
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x29, #-8]                  ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB6_22
LBB6_22:
	b	LBB6_23
LBB6_23:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
	.p2align	2
lJTI6_0:
	.long	LBB6_3-Ltmp5
	.long	LBB6_4-Ltmp5
	.long	LBB6_5-Ltmp5
	.long	LBB6_6-Ltmp5
	.long	LBB6_7-Ltmp5
	.long	LBB6_8-Ltmp5
	.long	LBB6_9-Ltmp5
	.long	LBB6_10-Ltmp5
	.long	LBB6_11-Ltmp5
	.long	LBB6_12-Ltmp5
	.long	LBB6_13-Ltmp5
	.long	LBB6_14-Ltmp5
	.long	LBB6_15-Ltmp5
	.long	LBB6_16-Ltmp5
	.long	LBB6_17-Ltmp5
	.long	LBB6_18-Ltmp5
	.long	LBB6_19-Ltmp5
	.long	LBB6_20-Ltmp5
                                        ; -- End function
	.private_extern	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOh ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOWOh
	.globl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOh
	.weak_definition	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOh
	.p2align	2
_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOh: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOWOh"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	str	x0, [sp]                        ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	subs	x8, x8, #17
	b.hi	LBB7_20
; %bb.1:
	ldr	x11, [sp, #8]                   ; 8-byte Folded Reload
	adrp	x10, lJTI7_0@PAGE
	add	x10, x10, lJTI7_0@PAGEOFF
Ltmp6:
	adr	x8, Ltmp6
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
LBB7_2:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_3:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_4:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_5:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_6:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_7:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_8:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_9:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_10:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_11:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_12:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_13:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_14:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_15:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_16:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_17:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_18:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_19:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB7_20
LBB7_20:
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
	.p2align	2
lJTI7_0:
	.long	LBB7_2-Ltmp6
	.long	LBB7_3-Ltmp6
	.long	LBB7_4-Ltmp6
	.long	LBB7_5-Ltmp6
	.long	LBB7_6-Ltmp6
	.long	LBB7_7-Ltmp6
	.long	LBB7_8-Ltmp6
	.long	LBB7_9-Ltmp6
	.long	LBB7_10-Ltmp6
	.long	LBB7_11-Ltmp6
	.long	LBB7_12-Ltmp6
	.long	LBB7_13-Ltmp6
	.long	LBB7_14-Ltmp6
	.long	LBB7_15-Ltmp6
	.long	LBB7_16-Ltmp6
	.long	LBB7_17-Ltmp6
	.long	LBB7_18-Ltmp6
	.long	LBB7_19-Ltmp6
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwtk
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwtk: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwtk"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp]                        ; 8-byte Folded Spill
	mov	x0, x1
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	mov	x1, x2
	str	x1, [sp, #16]                   ; 8-byte Folded Spill
	bl	_swift_getEnumCaseMultiPayload
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	stur	x8, [x29, #-8]                  ; 8-byte Folded Spill
	subs	x8, x8, #17
	b.hi	LBB8_20
; %bb.1:
	ldur	x11, [x29, #-8]                 ; 8-byte Folded Reload
	adrp	x10, lJTI8_0@PAGE
	add	x10, x10, lJTI8_0@PAGEOFF
Ltmp7:
	adr	x8, Ltmp7
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
LBB8_2:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #0                          ; =0x0
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_3:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #1                          ; =0x1
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_4:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #2                          ; =0x2
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_5:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #3                          ; =0x3
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_6:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #4                          ; =0x4
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_7:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #5                          ; =0x5
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_8:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #6                          ; =0x6
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_9:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #7                          ; =0x7
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_10:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #8                          ; =0x8
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_11:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #9                          ; =0x9
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_12:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #10                         ; =0xa
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_13:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #11                         ; =0xb
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_14:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #12                         ; =0xc
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_15:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #13                         ; =0xd
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_16:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #14                         ; =0xe
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_17:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #15                         ; =0xf
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_18:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #16                         ; =0x10
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_19:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	mov	w2, #17                         ; =0x11
	bl	_swift_storeEnumTagMultiPayload
	b	LBB8_21
LBB8_20:
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldr	x8, [sp, #16]                   ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB8_21
LBB8_21:
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
	.p2align	2
lJTI8_0:
	.long	LBB8_2-Ltmp7
	.long	LBB8_3-Ltmp7
	.long	LBB8_4-Ltmp7
	.long	LBB8_5-Ltmp7
	.long	LBB8_6-Ltmp7
	.long	LBB8_7-Ltmp7
	.long	LBB8_8-Ltmp7
	.long	LBB8_9-Ltmp7
	.long	LBB8_10-Ltmp7
	.long	LBB8_11-Ltmp7
	.long	LBB8_12-Ltmp7
	.long	LBB8_13-Ltmp7
	.long	LBB8_14-Ltmp7
	.long	LBB8_15-Ltmp7
	.long	LBB8_16-Ltmp7
	.long	LBB8_17-Ltmp7
	.long	LBB8_18-Ltmp7
	.long	LBB8_19-Ltmp7
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwta
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwta: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwta"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	str	x1, [sp, #16]                   ; 8-byte Folded Spill
	stur	x2, [x29, #-8]                  ; 8-byte Folded Spill
	subs	x8, x0, x1
	b.eq	LBB9_23
	b	LBB9_1
LBB9_1:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	bl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWOh
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	str	x8, [sp]                        ; 8-byte Folded Spill
	subs	x8, x8, #17
	b.hi	LBB9_21
; %bb.2:
	ldr	x11, [sp]                       ; 8-byte Folded Reload
	adrp	x10, lJTI9_0@PAGE
	add	x10, x10, lJTI9_0@PAGEOFF
Ltmp8:
	adr	x8, Ltmp8
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
LBB9_3:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #0                          ; =0x0
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_4:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #1                          ; =0x1
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_5:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #2                          ; =0x2
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_6:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #3                          ; =0x3
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_7:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #4                          ; =0x4
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_8:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #5                          ; =0x5
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_9:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #6                          ; =0x6
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_10:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #7                          ; =0x7
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_11:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #8                          ; =0x8
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_12:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #9                          ; =0x9
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_13:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #10                         ; =0xa
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_14:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #11                         ; =0xb
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_15:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #12                         ; =0xc
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_16:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #13                         ; =0xd
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_17:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #14                         ; =0xe
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_18:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #15                         ; =0xf
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_19:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #16                         ; =0x10
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_20:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #32]
	blr	x8
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	w2, #17                         ; =0x11
	bl	_swift_storeEnumTagMultiPayload
	b	LBB9_22
LBB9_21:
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x29, #-8]                  ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB9_22
LBB9_22:
	b	LBB9_23
LBB9_23:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
	.p2align	2
lJTI9_0:
	.long	LBB9_3-Ltmp8
	.long	LBB9_4-Ltmp8
	.long	LBB9_5-Ltmp8
	.long	LBB9_6-Ltmp8
	.long	LBB9_7-Ltmp8
	.long	LBB9_8-Ltmp8
	.long	LBB9_9-Ltmp8
	.long	LBB9_10-Ltmp8
	.long	LBB9_11-Ltmp8
	.long	LBB9_12-Ltmp8
	.long	LBB9_13-Ltmp8
	.long	LBB9_14-Ltmp8
	.long	LBB9_15-Ltmp8
	.long	LBB9_16-Ltmp8
	.long	LBB9_17-Ltmp8
	.long	LBB9_18-Ltmp8
	.long	LBB9_19-Ltmp8
	.long	LBB9_20-Ltmp8
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwet
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwet: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwet"
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #48]
	blr	x8
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwst
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwst: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwst"
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	ldur	x8, [x3, #-8]
	ldr	x8, [x8, #56]
	blr	x8
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwug
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwug: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwug"
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	bl	_swift_getEnumCaseMultiPayload
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwup
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwup: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwup"
; %bb.0:
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOwui
_$s22ReaSwiftRelativeSwitch0A9LiveEventOwui: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOwui"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	stur	w1, [x29, #-4]                  ; 4-byte Folded Spill
	mov	x1, x2
	ldur	w2, [x29, #-4]                  ; 4-byte Folded Reload
	bl	_swift_storeEnumTagMultiPayload
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s22ReaSwiftRelativeSwitch0A9LiveEventOMr
_$s22ReaSwiftRelativeSwitch0A9LiveEventOMr: ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOMr"
; %bb.0:
	sub	sp, sp, #208
	stp	x29, x30, [sp, #192]            ; 16-byte Folded Spill
	add	x29, sp, #192
	str	x0, [sp, #16]                   ; 8-byte Folded Spill
	mov	w8, #319                        ; =0x13f
	mov	x0, x8
	bl	_$s19ReaResilientPayload0aC0VMa
	str	x0, [sp, #24]                   ; 8-byte Folded Spill
	mov	w8, #63                         ; =0x3f
                                        ; kill: def $x8 killed $w8
	subs	x9, x1, #63
	str	x0, [sp, #32]                   ; 8-byte Folded Spill
	str	x8, [sp, #40]                   ; 8-byte Folded Spill
	b.hi	LBB15_2
	b	LBB15_1
LBB15_1:
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	mov	x9, x8
	add	x9, x9, #64
	add	x3, sp, #48
	str	x9, [sp, #48]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #56]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #64]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #72]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #80]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #88]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #96]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #104]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #112]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #120]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #128]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #136]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #144]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #152]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #160]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #168]
	mov	x9, x8
	add	x9, x9, #64
	str	x9, [sp, #176]
	add	x8, x8, #64
	str	x8, [sp, #184]
	mov	w8, #256                        ; =0x100
	mov	x1, x8
	mov	w8, #18                         ; =0x12
	mov	x2, x8
	bl	_swift_initEnumMetadataMultiPayload
	mov	x8, #0                          ; =0x0
	mov	x9, #0                          ; =0x0
	str	x9, [sp, #32]                   ; 8-byte Folded Spill
	str	x8, [sp, #40]                   ; 8-byte Folded Spill
	b	LBB15_2
LBB15_2:
	ldr	x0, [sp, #32]                   ; 8-byte Folded Reload
	ldr	x1, [sp, #40]                   ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #192]            ; 16-byte Folded Reload
	add	sp, sp, #208
	ret
                                        ; -- End function
	.section	__DATA,__data
	.p2align	3, 0x0                          ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOWV"
_$s22ReaSwiftRelativeSwitch0A9LiveEventOWV:
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwCP
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwxx
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwcp
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwca
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwtk
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwta
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwet
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwst
	.quad	0                               ; 0x0
	.quad	0                               ; 0x0
	.long	6291456                         ; 0x600000
	.long	0                               ; 0x0
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwug
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwup
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOwui

	.section	__TEXT,__const
	.p2align	4, 0x0                          ; @.str.22.ReaSwiftRelativeSwitch
l_.str.22.ReaSwiftRelativeSwitch:
	.asciz	"ReaSwiftRelativeSwitch"

	.private_extern	_$s22ReaSwiftRelativeSwitchMXM ; @"$s22ReaSwiftRelativeSwitchMXM"
	.section	__TEXT,__constg_swiftt
	.globl	_$s22ReaSwiftRelativeSwitchMXM
	.weak_definition	_$s22ReaSwiftRelativeSwitchMXM
	.p2align	2, 0x0
_$s22ReaSwiftRelativeSwitchMXM:
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l_.str.22.ReaSwiftRelativeSwitch-_$s22ReaSwiftRelativeSwitchMXM-8

	.section	__TEXT,__const
l_.str.12.ReaLiveEvent:                 ; @.str.12.ReaLiveEvent
	.asciz	"ReaLiveEvent"

.zerofill __DATA,__bss,_$s22ReaSwiftRelativeSwitch0A9LiveEventOMl,16,3 ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOMl"
	.section	__TEXT,__constg_swiftt
	.globl	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOMn"
	.p2align	2, 0x0
_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn:
	.long	65618                           ; 0x10052
	.long	_$s22ReaSwiftRelativeSwitchMXM-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn-4
	.long	l_.str.12.ReaLiveEvent-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn-8
	.long	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMa-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn-12
	.long	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn-16
	.long	33554450                        ; 0x2000012
	.long	12                              ; 0xc
	.long	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMl-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn-28
	.long	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMf-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn-16
	.long	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMr-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn-36

	.section	__DATA,__data
	.p2align	3, 0x0                          ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOMf"
_$s22ReaSwiftRelativeSwitch0A9LiveEventOMf:
	.quad	0
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOWV
	.quad	513                             ; 0x201
	.quad	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn
	.quad	0                               ; 0x0

	.private_extern	"_symbolic _____ 22ReaSwiftRelativeSwitch0A9LiveEventO" ; @"symbolic _____ 22ReaSwiftRelativeSwitch0A9LiveEventO"
	.section	__TEXT,__swift5_typeref
	.globl	"_symbolic _____ 22ReaSwiftRelativeSwitch0A9LiveEventO"
	.weak_definition	"_symbolic _____ 22ReaSwiftRelativeSwitch0A9LiveEventO"
	.p2align	1, 0x0
"_symbolic _____ 22ReaSwiftRelativeSwitch0A9LiveEventO":
	.byte	1                               ; 0x1
	.long	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn-"_symbolic _____ 22ReaSwiftRelativeSwitch0A9LiveEventO"-1
	.byte	0                               ; 0x0

	.private_extern	"_symbolic _____ 19ReaResilientPayload0aC0V" ; @"symbolic _____ 19ReaResilientPayload0aC0V"
	.globl	"_symbolic _____ 19ReaResilientPayload0aC0V"
	.weak_definition	"_symbolic _____ 19ReaResilientPayload0aC0V"
	.p2align	1, 0x0
"_symbolic _____ 19ReaResilientPayload0aC0V":
	.byte	2                               ; 0x2
Ltmp9:
	.long	_$s19ReaResilientPayload0aC0VMn@GOT-Ltmp9
	.byte	0                               ; 0x0

	.section	__TEXT,__swift5_reflstr
l___unnamed_1:                          ; @0
	.asciz	"payload0"

l___unnamed_2:                          ; @1
	.asciz	"payload1"

l___unnamed_3:                          ; @2
	.asciz	"payload2"

l___unnamed_4:                          ; @3
	.asciz	"payload3"

l___unnamed_5:                          ; @4
	.asciz	"payload4"

l___unnamed_6:                          ; @5
	.asciz	"payload5"

l___unnamed_7:                          ; @6
	.asciz	"payload6"

l___unnamed_8:                          ; @7
	.asciz	"payload7"

l___unnamed_9:                          ; @8
	.asciz	"payload8"

l___unnamed_10:                         ; @9
	.asciz	"payload9"

l___unnamed_11:                         ; @10
	.asciz	"payload10"

l___unnamed_12:                         ; @11
	.asciz	"payload11"

l___unnamed_13:                         ; @12
	.asciz	"payload12"

l___unnamed_14:                         ; @13
	.asciz	"payload13"

l___unnamed_15:                         ; @14
	.asciz	"payload14"

l___unnamed_16:                         ; @15
	.asciz	"payload15"

l___unnamed_17:                         ; @16
	.asciz	"payload16"

l___unnamed_18:                         ; @17
	.asciz	"payload17"

l___unnamed_19:                         ; @18
	.asciz	"empty0"

l___unnamed_20:                         ; @19
	.asciz	"empty1"

l___unnamed_21:                         ; @20
	.asciz	"empty2"

l___unnamed_22:                         ; @21
	.asciz	"empty3"

l___unnamed_23:                         ; @22
	.asciz	"empty4"

l___unnamed_24:                         ; @23
	.asciz	"empty5"

l___unnamed_25:                         ; @24
	.asciz	"empty6"

l___unnamed_26:                         ; @25
	.asciz	"empty7"

l___unnamed_27:                         ; @26
	.asciz	"empty8"

l___unnamed_28:                         ; @27
	.asciz	"empty9"

l___unnamed_29:                         ; @28
	.asciz	"empty10"

l___unnamed_30:                         ; @29
	.asciz	"empty11"

	.section	__TEXT,__swift5_fieldmd
	.p2align	2, 0x0                          ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOMF"
_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF:
	.long	"_symbolic _____ 22ReaSwiftRelativeSwitch0A9LiveEventO"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF
	.long	0                               ; 0x0
	.short	2                               ; 0x2
	.short	12                              ; 0xc
	.long	30                              ; 0x1e
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-20
	.long	l___unnamed_1-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-24
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-32
	.long	l___unnamed_2-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-36
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-44
	.long	l___unnamed_3-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-48
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-56
	.long	l___unnamed_4-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-60
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-68
	.long	l___unnamed_5-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-72
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-80
	.long	l___unnamed_6-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-84
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-92
	.long	l___unnamed_7-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-96
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-104
	.long	l___unnamed_8-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-108
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-116
	.long	l___unnamed_9-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-120
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-128
	.long	l___unnamed_10-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-132
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-140
	.long	l___unnamed_11-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-144
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-152
	.long	l___unnamed_12-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-156
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-164
	.long	l___unnamed_13-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-168
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-176
	.long	l___unnamed_14-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-180
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-188
	.long	l___unnamed_15-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-192
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-200
	.long	l___unnamed_16-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-204
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-212
	.long	l___unnamed_17-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-216
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-224
	.long	l___unnamed_18-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-228
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_19-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-240
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_20-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-252
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_21-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-264
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_22-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-276
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_23-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-288
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_24-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-300
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_25-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-312
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_26-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-324
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_27-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-336
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_28-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-348
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_29-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-360
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_30-_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF-372

	.section	__TEXT,__swift5_types
	.p2align	2, 0x0                          ; @"$s22ReaSwiftRelativeSwitch0A9LiveEventOHn"
l_$s22ReaSwiftRelativeSwitch0A9LiveEventOHn:
	.long	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn-l_$s22ReaSwiftRelativeSwitch0A9LiveEventOHn

	.private_extern	___swift_reflection_version ; @__swift_reflection_version
	.section	__TEXT,__const
	.globl	___swift_reflection_version
	.weak_definition	___swift_reflection_version
	.p2align	1, 0x0
___swift_reflection_version:
	.short	3                               ; 0x3

	.no_dead_strip	_$s22ReaSwiftRelativeSwitch03reacD0ySiAA0A9LiveEventO_SitF
	.no_dead_strip	_$s22ReaSwiftRelativeSwitch03reacD0ySiAA0A9LiveEventO_SitF
	.no_dead_strip	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMn
	.no_dead_strip	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMa
	.no_dead_strip	_$s22ReaSwiftRelativeSwitch0A9LiveEventON
	.no_dead_strip	_$s22ReaSwiftRelativeSwitch0A9LiveEventOMF
	.no_dead_strip	l_$s22ReaSwiftRelativeSwitch0A9LiveEventOHn
	.no_dead_strip	___swift_reflection_version
	.linker_option "-lswiftCore"
	.linker_option "-lswift_StringProcessing"
	.linker_option "-lswift_Concurrency"
	.linker_option "-lswiftSwiftOnoneSupport"
	.linker_option "-lobjc"
	.section	__DATA,__objc_imageinfo,regular,no_dead_strip
L_OBJC_IMAGE_INFO:
	.long	0
	.long	100861760

	.globl	_$s22ReaSwiftRelativeSwitch0A9LiveEventON
	.alt_entry	_$s22ReaSwiftRelativeSwitch0A9LiveEventON
_$s22ReaSwiftRelativeSwitch0A9LiveEventON = _$s22ReaSwiftRelativeSwitch0A9LiveEventOMf+16
.subsections_via_symbols
