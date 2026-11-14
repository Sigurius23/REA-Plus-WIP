	.build_version macos, 26, 0	sdk_version 26, 5
	.section	__TEXT,__text,regular,pure_instructions
	.globl	_$s16ReaArcProjection6NibbleO21__derived_enum_equalsySbAC_ACtFZ ; -- Begin function $s16ReaArcProjection6NibbleO21__derived_enum_equalsySbAC_ACtFZ
	.p2align	2
_$s16ReaArcProjection6NibbleO21__derived_enum_equalsySbAC_ACtFZ: ; @"$s16ReaArcProjection6NibbleO21__derived_enum_equalsySbAC_ACtFZ"
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #80
	.cfi_def_cfa_offset 80
	str	w1, [sp, #36]                   ; 4-byte Folded Spill
	strb	wzr, [sp, #72]
	strb	wzr, [sp, #64]
	strb	w0, [sp, #72]
	strb	w1, [sp, #64]
	add	w9, w0, #0
                                        ; implicit-def: $x8
	mov	x8, x9
	and	x8, x8, #0xff
	str	x8, [sp, #40]                   ; 8-byte Folded Spill
; %bb.1:
	ldr	x11, [sp, #40]                  ; 8-byte Folded Reload
	adrp	x10, lJTI0_0@PAGE
	add	x10, x10, lJTI0_0@PAGEOFF
Ltmp1:
	adr	x8, Ltmp1
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
; %bb.2:
LBB0_3:
	mov	x8, #0                          ; =0x0
	str	xzr, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_4:
	mov	w8, #1                          ; =0x1
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_5:
	mov	w8, #2                          ; =0x2
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_6:
	mov	w8, #3                          ; =0x3
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_7:
	mov	w8, #4                          ; =0x4
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_8:
	mov	w8, #5                          ; =0x5
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_9:
	mov	w8, #6                          ; =0x6
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_10:
	mov	w8, #7                          ; =0x7
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_11:
	mov	w8, #8                          ; =0x8
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_12:
	mov	w8, #9                          ; =0x9
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_13:
	mov	w8, #10                         ; =0xa
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_14:
	mov	w8, #11                         ; =0xb
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_15:
	mov	w8, #12                         ; =0xc
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_16:
	mov	w8, #13                         ; =0xd
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_17:
	mov	w8, #14                         ; =0xe
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_18:
	mov	w8, #15                         ; =0xf
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #56]
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
	b	LBB0_19
LBB0_19:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	ldr	x9, [sp, #24]                   ; 8-byte Folded Reload
	str	x9, [sp, #8]                    ; 8-byte Folded Spill
	add	w9, w8, #0
                                        ; implicit-def: $x8
	mov	x8, x9
	and	x8, x8, #0xff
	str	x8, [sp, #16]                   ; 8-byte Folded Spill
; %bb.20:
	ldr	x11, [sp, #16]                  ; 8-byte Folded Reload
	adrp	x10, lJTI0_1@PAGE
	add	x10, x10, lJTI0_1@PAGEOFF
Ltmp2:
	adr	x8, Ltmp2
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
; %bb.21:
LBB0_22:
	mov	x8, #0                          ; =0x0
	str	xzr, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_23:
	mov	w8, #1                          ; =0x1
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_24:
	mov	w8, #2                          ; =0x2
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_25:
	mov	w8, #3                          ; =0x3
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_26:
	mov	w8, #4                          ; =0x4
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_27:
	mov	w8, #5                          ; =0x5
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_28:
	mov	w8, #6                          ; =0x6
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_29:
	mov	w8, #7                          ; =0x7
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_30:
	mov	w8, #8                          ; =0x8
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_31:
	mov	w8, #9                          ; =0x9
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_32:
	mov	w8, #10                         ; =0xa
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_33:
	mov	w8, #11                         ; =0xb
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_34:
	mov	w8, #12                         ; =0xc
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_35:
	mov	w8, #13                         ; =0xd
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_36:
	mov	w8, #14                         ; =0xe
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_37:
	mov	w8, #15                         ; =0xf
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #48]
	str	x8, [sp]                        ; 8-byte Folded Spill
	b	LBB0_38
LBB0_38:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldr	x9, [sp]                        ; 8-byte Folded Reload
	subs	x8, x8, x9
	cset	w0, eq
	add	sp, sp, #80
	ret
	.cfi_endproc
	.p2align	2
lJTI0_0:
	.long	LBB0_3-Ltmp1
	.long	LBB0_4-Ltmp1
	.long	LBB0_5-Ltmp1
	.long	LBB0_6-Ltmp1
	.long	LBB0_7-Ltmp1
	.long	LBB0_8-Ltmp1
	.long	LBB0_9-Ltmp1
	.long	LBB0_10-Ltmp1
	.long	LBB0_11-Ltmp1
	.long	LBB0_12-Ltmp1
	.long	LBB0_13-Ltmp1
	.long	LBB0_14-Ltmp1
	.long	LBB0_15-Ltmp1
	.long	LBB0_16-Ltmp1
	.long	LBB0_17-Ltmp1
	.long	LBB0_18-Ltmp1
	.p2align	2
lJTI0_1:
	.long	LBB0_22-Ltmp2
	.long	LBB0_23-Ltmp2
	.long	LBB0_24-Ltmp2
	.long	LBB0_25-Ltmp2
	.long	LBB0_26-Ltmp2
	.long	LBB0_27-Ltmp2
	.long	LBB0_28-Ltmp2
	.long	LBB0_29-Ltmp2
	.long	LBB0_30-Ltmp2
	.long	LBB0_31-Ltmp2
	.long	LBB0_32-Ltmp2
	.long	LBB0_33-Ltmp2
	.long	LBB0_34-Ltmp2
	.long	LBB0_35-Ltmp2
	.long	LBB0_36-Ltmp2
	.long	LBB0_37-Ltmp2
                                        ; -- End function
	.globl	_$s16ReaArcProjection6NibbleO4hash4intoys6HasherVz_tF ; -- Begin function $s16ReaArcProjection6NibbleO4hash4intoys6HasherVz_tF
	.p2align	2
_$s16ReaArcProjection6NibbleO4hash4intoys6HasherVz_tF: ; @"$s16ReaArcProjection6NibbleO4hash4intoys6HasherVz_tF"
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #96
	stp	x20, x19, [sp, #64]             ; 16-byte Folded Spill
	stp	x29, x30, [sp, #80]             ; 16-byte Folded Spill
	add	x29, sp, #80
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	.cfi_offset w19, -24
	.cfi_offset w20, -32
	str	x0, [sp, #16]                   ; 8-byte Folded Spill
	stur	xzr, [x29, #-24]
	sturb	wzr, [x29, #-32]
	stur	x0, [x29, #-24]
	sturb	w1, [x29, #-32]
	add	w9, w1, #0
                                        ; implicit-def: $x8
	mov	x8, x9
	and	x8, x8, #0xff
	str	x8, [sp, #24]                   ; 8-byte Folded Spill
; %bb.1:
	ldr	x11, [sp, #24]                  ; 8-byte Folded Reload
	adrp	x10, lJTI1_0@PAGE
	add	x10, x10, lJTI1_0@PAGEOFF
Ltmp3:
	adr	x8, Ltmp3
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
; %bb.2:
LBB1_3:
	mov	x8, #0                          ; =0x0
	str	xzr, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_4:
	mov	w8, #1                          ; =0x1
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_5:
	mov	w8, #2                          ; =0x2
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_6:
	mov	w8, #3                          ; =0x3
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_7:
	mov	w8, #4                          ; =0x4
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_8:
	mov	w8, #5                          ; =0x5
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_9:
	mov	w8, #6                          ; =0x6
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_10:
	mov	w8, #7                          ; =0x7
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_11:
	mov	w8, #8                          ; =0x8
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_12:
	mov	w8, #9                          ; =0x9
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_13:
	mov	w8, #10                         ; =0xa
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_14:
	mov	w8, #11                         ; =0xb
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_15:
	mov	w8, #12                         ; =0xc
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_16:
	mov	w8, #13                         ; =0xd
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_17:
	mov	w8, #14                         ; =0xe
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_18:
	mov	w8, #15                         ; =0xf
                                        ; kill: def $x8 killed $w8
	str	x8, [sp, #40]
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB1_19
LBB1_19:
	ldr	x20, [sp, #16]                  ; 8-byte Folded Reload
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	add	x0, sp, #32
	str	x8, [sp, #32]
	adrp	x1, _$sSiN@GOTPAGE
	ldr	x1, [x1, _$sSiN@GOTPAGEOFF]
	adrp	x2, _$sSiSHsWP@GOTPAGE
	ldr	x2, [x2, _$sSiSHsWP@GOTPAGEOFF]
	bl	_$ss6HasherV7combineyyxSHRzlF
	ldp	x29, x30, [sp, #80]             ; 16-byte Folded Reload
	ldp	x20, x19, [sp, #64]             ; 16-byte Folded Reload
	add	sp, sp, #96
	ret
	.cfi_endproc
	.p2align	2
lJTI1_0:
	.long	LBB1_3-Ltmp3
	.long	LBB1_4-Ltmp3
	.long	LBB1_5-Ltmp3
	.long	LBB1_6-Ltmp3
	.long	LBB1_7-Ltmp3
	.long	LBB1_8-Ltmp3
	.long	LBB1_9-Ltmp3
	.long	LBB1_10-Ltmp3
	.long	LBB1_11-Ltmp3
	.long	LBB1_12-Ltmp3
	.long	LBB1_13-Ltmp3
	.long	LBB1_14-Ltmp3
	.long	LBB1_15-Ltmp3
	.long	LBB1_16-Ltmp3
	.long	LBB1_17-Ltmp3
	.long	LBB1_18-Ltmp3
                                        ; -- End function
	.globl	_$s16ReaArcProjection6NibbleO9hashValueSivg ; -- Begin function $s16ReaArcProjection6NibbleO9hashValueSivg
	.p2align	2
_$s16ReaArcProjection6NibbleO9hashValueSivg: ; @"$s16ReaArcProjection6NibbleO9hashValueSivg"
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	sturb	wzr, [x29, #-8]
	sturb	w0, [x29, #-8]
	sub	x8, x29, #9
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	sturb	w0, [x29, #-9]
	bl	_$s16ReaArcProjection6NibbleOACSHAAWl
	mov	x2, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	adrp	x8, _$s16ReaArcProjection6NibbleOMf@PAGE
	add	x8, x8, _$s16ReaArcProjection6NibbleOMf@PAGEOFF
	add	x1, x8, #16
	bl	_$ss10_hashValue3forSix_tSHRzlF
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
	.cfi_endproc
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection6NibbleOACSHAAWl ; -- Begin function $s16ReaArcProjection6NibbleOACSHAAWl
	.globl	_$s16ReaArcProjection6NibbleOACSHAAWl
	.weak_definition	_$s16ReaArcProjection6NibbleOACSHAAWl
	.p2align	2
_$s16ReaArcProjection6NibbleOACSHAAWl:  ; @"$s16ReaArcProjection6NibbleOACSHAAWl"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
                                        ; implicit-def: $x8
	adrp	x8, _$s16ReaArcProjection6NibbleOACSHAAWL@PAGE
	ldr	x8, [x8, _$s16ReaArcProjection6NibbleOACSHAAWL@PAGEOFF]
	mov	x0, x8
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	cbnz	x8, LBB3_2
	b	LBB3_1
LBB3_1:
	ldr	x2, [sp]                        ; 8-byte Folded Reload
	adrp	x0, _$s16ReaArcProjection6NibbleOSHAAMc@PAGE
	add	x0, x0, _$s16ReaArcProjection6NibbleOSHAAMc@PAGEOFF
	adrp	x8, _$s16ReaArcProjection6NibbleOMf@PAGE
	add	x8, x8, _$s16ReaArcProjection6NibbleOMf@PAGEOFF
	add	x1, x8, #16
	bl	_swift_getWitnessTable
	adrp	x9, _$s16ReaArcProjection6NibbleOACSHAAWL@PAGE
	add	x9, x9, _$s16ReaArcProjection6NibbleOACSHAAWL@PAGEOFF
	mov	x8, x0
	stlr	x8, [x9]
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB3_2
LBB3_2:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection6NibbleOSQAASQ2eeoiySbx_xtFZTW ; -- Begin function $s16ReaArcProjection6NibbleOSQAASQ2eeoiySbx_xtFZTW
	.globl	_$s16ReaArcProjection6NibbleOSQAASQ2eeoiySbx_xtFZTW
	.weak_definition	_$s16ReaArcProjection6NibbleOSQAASQ2eeoiySbx_xtFZTW
	.p2align	2
_$s16ReaArcProjection6NibbleOSQAASQ2eeoiySbx_xtFZTW: ; @"$s16ReaArcProjection6NibbleOSQAASQ2eeoiySbx_xtFZTW"
	.cfi_startproc
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	ldrb	w0, [x0]
	ldrb	w1, [x1]
	bl	_$s16ReaArcProjection6NibbleO21__derived_enum_equalsySbAC_ACtFZ
	and	w0, w0, #0x1
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
	.cfi_endproc
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection6NibbleOSHAASH9hashValueSivgTW ; -- Begin function $s16ReaArcProjection6NibbleOSHAASH9hashValueSivgTW
	.globl	_$s16ReaArcProjection6NibbleOSHAASH9hashValueSivgTW
	.weak_definition	_$s16ReaArcProjection6NibbleOSHAASH9hashValueSivgTW
	.p2align	2
_$s16ReaArcProjection6NibbleOSHAASH9hashValueSivgTW: ; @"$s16ReaArcProjection6NibbleOSHAASH9hashValueSivgTW"
	.cfi_startproc
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	ldrb	w0, [x20]
	bl	_$s16ReaArcProjection6NibbleO9hashValueSivg
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
	.cfi_endproc
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection6NibbleOSHAASH4hash4intoys6HasherVz_tFTW ; -- Begin function $s16ReaArcProjection6NibbleOSHAASH4hash4intoys6HasherVz_tFTW
	.globl	_$s16ReaArcProjection6NibbleOSHAASH4hash4intoys6HasherVz_tFTW
	.weak_definition	_$s16ReaArcProjection6NibbleOSHAASH4hash4intoys6HasherVz_tFTW
	.p2align	2
_$s16ReaArcProjection6NibbleOSHAASH4hash4intoys6HasherVz_tFTW: ; @"$s16ReaArcProjection6NibbleOSHAASH4hash4intoys6HasherVz_tFTW"
	.cfi_startproc
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	ldrb	w1, [x20]
	bl	_$s16ReaArcProjection6NibbleO4hash4intoys6HasherVz_tF
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
	.cfi_endproc
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection6NibbleOSHAASH13_rawHashValue4seedS2i_tFTW ; -- Begin function $s16ReaArcProjection6NibbleOSHAASH13_rawHashValue4seedS2i_tFTW
	.globl	_$s16ReaArcProjection6NibbleOSHAASH13_rawHashValue4seedS2i_tFTW
	.weak_definition	_$s16ReaArcProjection6NibbleOSHAASH13_rawHashValue4seedS2i_tFTW
	.p2align	2
_$s16ReaArcProjection6NibbleOSHAASH13_rawHashValue4seedS2i_tFTW: ; @"$s16ReaArcProjection6NibbleOSHAASH13_rawHashValue4seedS2i_tFTW"
	.cfi_startproc
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	bl	_$sSHsE13_rawHashValue4seedS2i_tF
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	mov	x1, x20
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM.resume.0@PAGEOFF
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #8]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #8]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #8
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #16]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #16]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #16
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #24]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #24]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #24
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #32]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #32]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #32
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #40]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #40]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #40
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #48]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #48]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #48
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #56]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #56]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #56
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #64]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #64]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #64
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #72]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #72]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #72
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #80]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #80]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #80
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #88]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #88]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #88
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #96]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #96]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #96
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #104]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #104]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #104
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #112]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #112]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #112
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #120]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #120]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #120
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #128]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #128]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #128
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #136]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #136]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #136
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvg: ; @"$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvg"
	.cfi_startproc
; %bb.0:
	ldr	x0, [x20, #144]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvs: ; @"$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvs"
	.cfi_startproc
; %bb.0:
	str	x0, [x20, #144]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM: ; @"$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM.resume.0@PAGEOFF
	add	x1, x20, #144
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM.resume.0
_$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvg: ; @"$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvg"
	.cfi_startproc
; %bb.0:
	ldrb	w0, [x20, #152]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvs: ; @"$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvs"
	.cfi_startproc
; %bb.0:
	strb	w0, [x20, #152]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM: ; @"$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM.resume.0@PAGEOFF
	add	x1, x20, #152
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvg: ; @"$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvg"
	.cfi_startproc
; %bb.0:
	ldrb	w0, [x20, #153]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvs: ; @"$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvs"
	.cfi_startproc
; %bb.0:
	strb	w0, [x20, #153]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM: ; @"$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM.resume.0@PAGEOFF
	add	x1, x20, #153
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvg ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvg: ; @"$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvg"
	.cfi_startproc
; %bb.0:
	ldrb	w0, [x20, #154]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvs ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvs: ; @"$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvs"
	.cfi_startproc
; %bb.0:
	strb	w0, [x20, #154]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM: ; @"$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM.resume.0@PAGEOFF
	add	x1, x20, #154
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM.resume.0
_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvg ; -- Begin function $s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvg
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvg: ; @"$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvg"
	.cfi_startproc
; %bb.0:
	ldrb	w0, [x20, #155]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvs ; -- Begin function $s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvs
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvs: ; @"$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvs"
	.cfi_startproc
; %bb.0:
	strb	w0, [x20, #155]
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM ; -- Begin function $s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM
	.p2align	2
_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM: ; @"$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM"
	.cfi_startproc
; %bb.0:
	adrp	x0, _$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM.resume.0@PAGE
	add	x0, x0, _$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM.resume.0@PAGEOFF
	add	x1, x20, #155
	ret
	.cfi_endproc
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM.resume.0
_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM.resume.0: ; @"$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM.resume.0"
	.cfi_startproc
; %bb.0:
	ret
	.cfi_endproc
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection11WidePayloadV5word05word15word25word35word45word55word65word75word85word96word106word116word126word136word146word156word166word176word185byte05byte15byte26nibbleACs6UInt64V_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_s5UInt8VA2_A2_AA6NibbleOtcfC ; -- Begin function $s16ReaArcProjection11WidePayloadV5word05word15word25word35word45word55word65word75word85word96word106word116word126word136word146word156word166word176word185byte05byte15byte26nibbleACs6UInt64V_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_s5UInt8VA2_A2_AA6NibbleOtcfC
	.globl	_$s16ReaArcProjection11WidePayloadV5word05word15word25word35word45word55word65word75word85word96word106word116word126word136word146word156word166word176word185byte05byte15byte26nibbleACs6UInt64V_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_s5UInt8VA2_A2_AA6NibbleOtcfC
	.p2align	2
_$s16ReaArcProjection11WidePayloadV5word05word15word25word35word45word55word65word75word85word96word106word116word126word136word146word156word166word176word185byte05byte15byte26nibbleACs6UInt64V_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_s5UInt8VA2_A2_AA6NibbleOtcfC: ; @"$s16ReaArcProjection11WidePayloadV5word05word15word25word35word45word55word65word75word85word96word106word116word126word136word146word156word166word176word185byte05byte15byte26nibbleACs6UInt64V_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_A0_s5UInt8VA2_A2_AA6NibbleOtcfC"
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #256
	stp	x26, x25, [sp, #176]            ; 16-byte Folded Spill
	stp	x24, x23, [sp, #192]            ; 16-byte Folded Spill
	stp	x22, x21, [sp, #208]            ; 16-byte Folded Spill
	stp	x20, x19, [sp, #224]            ; 16-byte Folded Spill
	stp	x29, x30, [sp, #240]            ; 16-byte Folded Spill
	add	x29, sp, #240
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	.cfi_offset w19, -24
	.cfi_offset w20, -32
	.cfi_offset w21, -40
	.cfi_offset w22, -48
	.cfi_offset w23, -56
	.cfi_offset w24, -64
	.cfi_offset w25, -72
	.cfi_offset w26, -80
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	mov	x25, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	mov	x24, x1
	mov	x23, x2
	mov	x22, x3
	mov	x21, x4
	mov	x20, x5
	mov	x19, x6
	ldr	x6, [x29, #16]
	ldr	x5, [x29, #24]
	ldr	x4, [x29, #32]
	ldr	x3, [x29, #40]
	ldr	x2, [x29, #48]
	ldr	x17, [x29, #56]
	ldr	x16, [x29, #64]
	ldr	x15, [x29, #72]
	ldr	x14, [x29, #80]
	ldr	x13, [x29, #88]
	ldr	x12, [x29, #96]
	ldrb	w11, [x29, #104]
	ldrb	w10, [x29, #105]
	ldrb	w9, [x29, #106]
	ldrb	w8, [x29, #107]
	add	x1, sp, #16
	str	x25, [sp, #16]
	str	x24, [sp, #24]
	str	x23, [sp, #32]
	str	x22, [sp, #40]
	str	x21, [sp, #48]
	str	x20, [sp, #56]
	str	x19, [sp, #64]
	str	x7, [sp, #72]
	str	x6, [sp, #80]
	str	x5, [sp, #88]
	str	x4, [sp, #96]
	str	x3, [sp, #104]
	str	x2, [sp, #112]
	str	x17, [sp, #120]
	str	x16, [sp, #128]
	str	x15, [sp, #136]
	str	x14, [sp, #144]
	str	x13, [sp, #152]
	str	x12, [sp, #160]
	strb	w11, [sp, #168]
	strb	w10, [sp, #169]
	strb	w9, [sp, #170]
	strb	w8, [sp, #171]
	mov	w8, #156                        ; =0x9c
	mov	x2, x8
	bl	_memcpy
	ldp	x29, x30, [sp, #240]            ; 16-byte Folded Reload
	ldp	x20, x19, [sp, #224]            ; 16-byte Folded Reload
	ldp	x22, x21, [sp, #208]            ; 16-byte Folded Reload
	ldp	x24, x23, [sp, #192]            ; 16-byte Folded Reload
	ldp	x26, x25, [sp, #176]            ; 16-byte Folded Reload
	add	sp, sp, #256
	ret
	.cfi_endproc
                                        ; -- End function
	.globl	_$s16ReaArcProjection23arcSecondArgumentReduceyS2i_AA11FixedActionOtF ; -- Begin function $s16ReaArcProjection23arcSecondArgumentReduceyS2i_AA11FixedActionOtF
	.p2align	2
_$s16ReaArcProjection23arcSecondArgumentReduceyS2i_AA11FixedActionOtF: ; @"$s16ReaArcProjection23arcSecondArgumentReduceyS2i_AA11FixedActionOtF"
	.cfi_startproc
; %bb.0:
	stp	x28, x27, [sp, #-32]!           ; 16-byte Folded Spill
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	sub	sp, sp, #272
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	.cfi_offset w27, -24
	.cfi_offset w28, -32
	stur	x0, [x29, #-248]                ; 8-byte Folded Spill
	stur	x1, [x29, #-240]                ; 8-byte Folded Spill
	stur	xzr, [x29, #-24]
	stur	xzr, [x29, #-32]
	stur	xzr, [x29, #-200]
	mov	x0, #0                          ; =0x0
	bl	_$s16ReaArcProjection11FixedActionOMa
	ldur	x8, [x29, #-248]                ; 8-byte Folded Reload
	mov	x9, x0
	ldur	x0, [x29, #-240]                ; 8-byte Folded Reload
	stur	x9, [x29, #-224]                ; 8-byte Folded Spill
	ldur	x9, [x9, #-8]
	ldr	x9, [x9, #64]
	lsr	x9, x9, #0
	add	x9, x9, #15
	and	x9, x9, #0xfffffffffffffff0
	stur	x9, [x29, #-232]                ; 8-byte Folded Spill
Lloh0:
	adrp	x16, ___chkstk_darwin@GOTPAGE
Lloh1:
	ldr	x16, [x16, ___chkstk_darwin@GOTPAGEOFF]
	blr	x16
	ldur	x10, [x29, #-232]               ; 8-byte Folded Reload
	mov	x9, sp
	subs	x1, x9, x10
	stur	x1, [x29, #-216]                ; 8-byte Folded Spill
	mov	sp, x1
	stur	x8, [x29, #-24]
	mov	x8, x0
	stur	x8, [x29, #-32]
	bl	_$s16ReaArcProjection11FixedActionOWOc
	ldur	x1, [x29, #-224]                ; 8-byte Folded Reload
	ldur	x0, [x29, #-216]                ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	stur	w0, [x29, #-204]                ; 4-byte Folded Spill
	cbz	w0, LBB101_36
	b	LBB101_1
LBB101_1:
	ldur	w8, [x29, #-204]                ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.eq	LBB101_5
	b	LBB101_2
LBB101_2:
	ldur	w8, [x29, #-204]                ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.eq	LBB101_38
	b	LBB101_3
LBB101_3:
	b	LBB101_37
; %bb.4:
LBB101_5:
	ldur	x1, [x29, #-216]                ; 8-byte Folded Reload
	sub	x0, x29, #192
	sub	x8, x29, #8
	stur	x0, [x8, #-256]                 ; 8-byte Folded Spill
	mov	w8, #156                        ; =0x9c
	mov	x2, x8
	bl	_memcpy
	sub	x8, x29, #8
	ldur	x0, [x8, #-256]                 ; 8-byte Folded Reload
	ldur	x8, [x29, #-216]                ; 8-byte Folded Reload
	stur	x8, [x29, #-200]
	bl	_$s16ReaArcProjection10FixedChildOWOg
	add	w8, w0, #0
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	stur	x8, [x29, #-256]                ; 8-byte Folded Spill
; %bb.6:
	ldur	x11, [x29, #-256]               ; 8-byte Folded Reload
	adrp	x10, lJTI101_0@PAGE
	add	x10, x10, lJTI101_0@PAGEOFF
Ltmp4:
	adr	x8, Ltmp4
	ldrsw	x9, [x10, x11, lsl #2]
	add	x8, x8, x9
	br	x8
; %bb.7:
LBB101_8:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_0
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_9:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_1
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_10:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_2
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_11:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_3
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_12:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_4
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_13:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_5
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_14:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_6
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_15:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_7
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_16:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_8
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_17:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_9
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_18:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_10
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_19:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_11
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_20:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_12
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_21:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_13
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_22:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_14
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_23:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_15
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_24:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_16
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_25:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_17
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_26:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_18
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_27:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_19
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_28:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_20
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_29:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_21
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_30:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_22
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_31:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_23
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_32:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_24
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_33:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_25
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_34:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_26
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_35:
	ldur	x0, [x29, #-248]                ; 8-byte Folded Reload
	bl	_rea_case_27
	mov	x8, x0
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_36:
	ldur	x8, [x29, #-248]                ; 8-byte Folded Reload
	adds	x8, x8, #1
	sub	x9, x29, #24
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-216]                ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	sub	x8, x29, #24
	ldur	x8, [x8, #-256]                 ; 8-byte Folded Reload
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_37:
	mov	x8, #-100                       ; =0xffffffffffffff9c
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_38:
	ldur	x8, [x29, #-248]                ; 8-byte Folded Reload
	subs	x8, x8, #1
	sub	x9, x29, #32
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldur	x0, [x29, #-216]                ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	sub	x8, x29, #32
	ldur	x8, [x8, #-256]                 ; 8-byte Folded Reload
	sub	x9, x29, #16
	stur	x8, [x9, #-256]                 ; 8-byte Folded Spill
	b	LBB101_39
LBB101_39:
	sub	x8, x29, #16
	ldur	x0, [x8, #-256]                 ; 8-byte Folded Reload
	sub	sp, x29, #16
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	ldp	x28, x27, [sp], #32             ; 16-byte Folded Reload
	ret
	.loh AdrpLdrGot	Lloh0, Lloh1
	.cfi_endproc
	.p2align	2
lJTI101_0:
	.long	LBB101_8-Ltmp4
	.long	LBB101_9-Ltmp4
	.long	LBB101_10-Ltmp4
	.long	LBB101_11-Ltmp4
	.long	LBB101_12-Ltmp4
	.long	LBB101_13-Ltmp4
	.long	LBB101_14-Ltmp4
	.long	LBB101_15-Ltmp4
	.long	LBB101_16-Ltmp4
	.long	LBB101_17-Ltmp4
	.long	LBB101_18-Ltmp4
	.long	LBB101_19-Ltmp4
	.long	LBB101_20-Ltmp4
	.long	LBB101_21-Ltmp4
	.long	LBB101_22-Ltmp4
	.long	LBB101_23-Ltmp4
	.long	LBB101_24-Ltmp4
	.long	LBB101_25-Ltmp4
	.long	LBB101_26-Ltmp4
	.long	LBB101_27-Ltmp4
	.long	LBB101_28-Ltmp4
	.long	LBB101_29-Ltmp4
	.long	LBB101_30-Ltmp4
	.long	LBB101_31-Ltmp4
	.long	LBB101_32-Ltmp4
	.long	LBB101_33-Ltmp4
	.long	LBB101_34-Ltmp4
	.long	LBB101_35-Ltmp4
                                        ; -- End function
	.globl	_$s16ReaArcProjection11FixedActionOMa ; -- Begin function $s16ReaArcProjection11FixedActionOMa
	.p2align	2
_$s16ReaArcProjection11FixedActionOMa:  ; @"$s16ReaArcProjection11FixedActionOMa"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	adrp	x8, _$s16ReaArcProjection11FixedActionOMl@PAGE
	ldr	x8, [x8, _$s16ReaArcProjection11FixedActionOMl@PAGEOFF]
	mov	x9, #0                          ; =0x0
	mov	x0, x8
	str	x0, [sp, #16]                   ; 8-byte Folded Spill
	stur	x9, [x29, #-8]                  ; 8-byte Folded Spill
	cbnz	x8, LBB102_2
	b	LBB102_1
LBB102_1:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	adrp	x1, _$s16ReaArcProjection11FixedActionOMn@PAGE
	add	x1, x1, _$s16ReaArcProjection11FixedActionOMn@PAGEOFF
	bl	_swift_getSingletonMetadata
	str	x0, [sp, #16]                   ; 8-byte Folded Spill
	stur	x1, [x29, #-8]                  ; 8-byte Folded Spill
	b	LBB102_2
LBB102_2:
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection11FixedActionOWOc ; -- Begin function $s16ReaArcProjection11FixedActionOWOc
	.globl	_$s16ReaArcProjection11FixedActionOWOc
	.weak_definition	_$s16ReaArcProjection11FixedActionOWOc
	.p2align	2
_$s16ReaArcProjection11FixedActionOWOc: ; @"$s16ReaArcProjection11FixedActionOWOc"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	str	x1, [sp]                        ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s16ReaArcProjection11FixedActionOMa
	mov	x1, x0
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	str	x1, [sp, #16]                   ; 8-byte Folded Spill
	bl	_swift_getEnumCaseMultiPayload
	stur	w0, [x29, #-4]                  ; 4-byte Folded Spill
	cbz	w0, LBB103_2
	b	LBB103_1
LBB103_1:
	ldur	w8, [x29, #-4]                  ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.eq	LBB103_3
	b	LBB103_4
LBB103_2:
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
	b	LBB103_5
LBB103_3:
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
	b	LBB103_5
LBB103_4:
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldr	x8, [sp, #16]                   ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB103_5
LBB103_5:
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection10FixedChildOWOg ; -- Begin function $s16ReaArcProjection10FixedChildOWOg
	.globl	_$s16ReaArcProjection10FixedChildOWOg
	.weak_definition	_$s16ReaArcProjection10FixedChildOWOg
	.p2align	2
_$s16ReaArcProjection10FixedChildOWOg:  ; @"$s16ReaArcProjection10FixedChildOWOg"
; %bb.0:
	ldr	x8, [x0]
	ldr	w9, [x0, #152]
	lsr	w9, w9, #28
	and	w9, w9, #0xf
                                        ; kill: def $w8 killed $w8 killed $x8
	add	w8, w8, #11
	subs	w10, w9, #11
	csel	w0, w8, w9, hs
	ret
                                        ; -- End function
	.globl	_$s16ReaArcProjection9otherLastySbAA10OtherChildOF ; -- Begin function $s16ReaArcProjection9otherLastySbAA10OtherChildOF
	.p2align	2
_$s16ReaArcProjection9otherLastySbAA10OtherChildOF: ; @"$s16ReaArcProjection9otherLastySbAA10OtherChildOF"
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #208
	stp	x29, x30, [sp, #192]            ; 16-byte Folded Spill
	add	x29, sp, #192
	.cfi_def_cfa w29, 16
	.cfi_offset w30, -8
	.cfi_offset w29, -16
	mov	x1, x0
	str	xzr, [sp, #24]
	mov	x0, x1
	str	x0, [sp, #24]
	add	x0, sp, #32
	str	x0, [sp, #16]                   ; 8-byte Folded Spill
	mov	w8, #156                        ; =0x9c
	mov	x2, x8
	bl	_memcpy
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	bl	_$s16ReaArcProjection10OtherChildOWOg
	subs	w8, w0, #28
	b.ne	LBB105_2
	b	LBB105_1
LBB105_1:
	mov	w8, #1                          ; =0x1
	str	w8, [sp, #12]                   ; 4-byte Folded Spill
	b	LBB105_3
LBB105_2:
	mov	w8, #0                          ; =0x0
	str	w8, [sp, #12]                   ; 4-byte Folded Spill
	b	LBB105_3
LBB105_3:
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	and	w0, w8, #0x1
	ldp	x29, x30, [sp, #192]            ; 16-byte Folded Reload
	add	sp, sp, #208
	ret
	.cfi_endproc
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection10OtherChildOWOg ; -- Begin function $s16ReaArcProjection10OtherChildOWOg
	.globl	_$s16ReaArcProjection10OtherChildOWOg
	.weak_definition	_$s16ReaArcProjection10OtherChildOWOg
	.p2align	2
_$s16ReaArcProjection10OtherChildOWOg:  ; @"$s16ReaArcProjection10OtherChildOWOg"
; %bb.0:
	ldr	x8, [x0]
	ldr	w9, [x0, #152]
	lsr	w9, w9, #28
	and	w9, w9, #0xf
                                        ; kill: def $w8 killed $w8 killed $x8
	add	w8, w8, #11
	subs	w10, w9, #11
	csel	w0, w8, w9, hs
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection6NibbleOSHAASQWb
_$s16ReaArcProjection6NibbleOSHAASQWb:  ; @"$s16ReaArcProjection6NibbleOSHAASQWb"
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	bl	_$s16ReaArcProjection6NibbleOACSQAAWl
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection6NibbleOACSQAAWl ; -- Begin function $s16ReaArcProjection6NibbleOACSQAAWl
	.globl	_$s16ReaArcProjection6NibbleOACSQAAWl
	.weak_definition	_$s16ReaArcProjection6NibbleOACSQAAWl
	.p2align	2
_$s16ReaArcProjection6NibbleOACSQAAWl:  ; @"$s16ReaArcProjection6NibbleOACSQAAWl"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
                                        ; implicit-def: $x8
	adrp	x8, _$s16ReaArcProjection6NibbleOACSQAAWL@PAGE
	ldr	x8, [x8, _$s16ReaArcProjection6NibbleOACSQAAWL@PAGEOFF]
	mov	x0, x8
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	cbnz	x8, LBB108_2
	b	LBB108_1
LBB108_1:
	ldr	x2, [sp]                        ; 8-byte Folded Reload
	adrp	x0, _$s16ReaArcProjection6NibbleOSQAAMc@PAGE
	add	x0, x0, _$s16ReaArcProjection6NibbleOSQAAMc@PAGEOFF
	adrp	x8, _$s16ReaArcProjection6NibbleOMf@PAGE
	add	x8, x8, _$s16ReaArcProjection6NibbleOMf@PAGEOFF
	add	x1, x8, #16
	bl	_swift_getWitnessTable
	adrp	x9, _$s16ReaArcProjection6NibbleOACSQAAWL@PAGE
	add	x9, x9, _$s16ReaArcProjection6NibbleOACSQAAWL@PAGEOFF
	mov	x8, x0
	stlr	x8, [x9]
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	b	LBB108_2
LBB108_2:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
                                        ; -- End function
	.private_extern	___swift_memcpy1_1      ; -- Begin function __swift_memcpy1_1
	.globl	___swift_memcpy1_1
	.weak_definition	___swift_memcpy1_1
	.p2align	2
___swift_memcpy1_1:                     ; @__swift_memcpy1_1
; %bb.0:
	ldrb	w8, [x1]
	strb	w8, [x0]
	ret
                                        ; -- End function
	.private_extern	___swift_noop_void_return ; -- Begin function __swift_noop_void_return
	.globl	___swift_noop_void_return
	.weak_definition	___swift_noop_void_return
	.p2align	2
___swift_noop_void_return:              ; @__swift_noop_void_return
; %bb.0:
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection6NibbleOwet
_$s16ReaArcProjection6NibbleOwet:       ; @"$s16ReaArcProjection6NibbleOwet"
; %bb.0:
	sub	sp, sp, #48
	str	x0, [sp, #32]                   ; 8-byte Folded Spill
	str	w1, [sp, #44]                   ; 4-byte Folded Spill
	cbz	w1, LBB111_16
	b	LBB111_1
LBB111_1:
	ldr	w8, [sp, #44]                   ; 4-byte Folded Reload
	subs	w8, w8, #240
	b.ls	LBB111_15
	b	LBB111_2
LBB111_2:
	ldr	w8, [sp, #44]                   ; 4-byte Folded Reload
	subs	w8, w8, #240
	add	w8, w8, #255
	lsr	w9, w8, #8
	mov	w8, #1                          ; =0x1
	add	w9, w9, #1
	str	w9, [sp, #24]                   ; 4-byte Folded Spill
	subs	w9, w9, #256
	str	w8, [sp, #28]                   ; 4-byte Folded Spill
	b.lo	LBB111_4
	b	LBB111_3
LBB111_3:
	ldr	w10, [sp, #24]                  ; 4-byte Folded Reload
	mov	w9, #4                          ; =0x4
	mov	w8, #2                          ; =0x2
	subs	w10, w10, #16, lsl #12          ; =65536
	csel	w8, w8, w9, lo
	str	w8, [sp, #28]                   ; 4-byte Folded Spill
	b	LBB111_4
LBB111_4:
	ldr	w8, [sp, #28]                   ; 4-byte Folded Reload
	str	w8, [sp, #20]                   ; 4-byte Folded Spill
	cbnz	w8, LBB111_6
	b	LBB111_5
LBB111_5:
	mov	w8, #0                          ; =0x0
	str	w8, [sp, #16]                   ; 4-byte Folded Spill
	b	LBB111_13
LBB111_6:
	ldr	w8, [sp, #20]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.ne	LBB111_8
	b	LBB111_7
LBB111_7:
	ldr	x8, [sp, #32]                   ; 8-byte Folded Reload
	ldrb	w8, [x8, #1]
	str	w8, [sp, #16]                   ; 4-byte Folded Spill
	b	LBB111_13
LBB111_8:
	ldr	w8, [sp, #20]                   ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.ne	LBB111_10
	b	LBB111_9
LBB111_9:
	ldr	x8, [sp, #32]                   ; 8-byte Folded Reload
	ldurh	w8, [x8, #1]
	str	w8, [sp, #16]                   ; 4-byte Folded Spill
	b	LBB111_13
LBB111_10:
	ldr	w8, [sp, #20]                   ; 4-byte Folded Reload
	subs	w8, w8, #4
	b.ne	LBB111_12
	b	LBB111_11
LBB111_11:
	ldr	x8, [sp, #32]                   ; 8-byte Folded Reload
	ldur	w8, [x8, #1]
	str	w8, [sp, #16]                   ; 4-byte Folded Spill
	b	LBB111_13
LBB111_12:
	brk	#0x1
LBB111_13:
	ldr	w8, [sp, #16]                   ; 4-byte Folded Reload
	str	w8, [sp, #12]                   ; 4-byte Folded Spill
	cbz	w8, LBB111_15
	b	LBB111_14
LBB111_14:
	ldr	x8, [sp, #32]                   ; 8-byte Folded Reload
	ldr	w9, [sp, #12]                   ; 4-byte Folded Reload
	subs	w9, w9, #1
	lsl	w10, w9, #8
	mov	w9, #0                          ; =0x0
	and	w11, w9, #0x1
	ands	w11, w11, #0x1
	csel	w9, w9, w10, ne
	ldrb	w8, [x8]
	orr	w8, w8, w9
	add	w8, w8, #240
	str	w8, [sp, #8]                    ; 4-byte Folded Spill
	b	LBB111_17
LBB111_15:
	ldr	x8, [sp, #32]                   ; 8-byte Folded Reload
	ldrb	w8, [x8]
	subs	w8, w8, #16
	subs	w9, w8, #0
	csinv	w8, w8, wzr, ge
	str	w8, [sp, #8]                    ; 4-byte Folded Spill
	b	LBB111_17
LBB111_16:
	mov	w8, #-1                         ; =0xffffffff
	str	w8, [sp, #8]                    ; 4-byte Folded Spill
	b	LBB111_17
LBB111_17:
	ldr	w8, [sp, #8]                    ; 4-byte Folded Reload
	add	w0, w8, #1
	add	sp, sp, #48
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection6NibbleOwst
_$s16ReaArcProjection6NibbleOwst:       ; @"$s16ReaArcProjection6NibbleOwst"
; %bb.0:
	sub	sp, sp, #64
	str	x0, [sp, #40]                   ; 8-byte Folded Spill
	str	w1, [sp, #52]                   ; 4-byte Folded Spill
	str	w2, [sp, #56]                   ; 4-byte Folded Spill
	mov	w8, #0                          ; =0x0
	subs	w9, w2, #240
	str	w8, [sp, #60]                   ; 4-byte Folded Spill
	b.ls	LBB112_4
	b	LBB112_1
LBB112_1:
	ldr	w8, [sp, #56]                   ; 4-byte Folded Reload
	subs	w8, w8, #240
	add	w8, w8, #255
	lsr	w9, w8, #8
	mov	w8, #1                          ; =0x1
	add	w9, w9, #1
	str	w9, [sp, #32]                   ; 4-byte Folded Spill
	subs	w9, w9, #256
	str	w8, [sp, #36]                   ; 4-byte Folded Spill
	b.lo	LBB112_3
	b	LBB112_2
LBB112_2:
	ldr	w10, [sp, #32]                  ; 4-byte Folded Reload
	mov	w9, #4                          ; =0x4
	mov	w8, #2                          ; =0x2
	subs	w10, w10, #16, lsl #12          ; =65536
	csel	w8, w8, w9, lo
	str	w8, [sp, #36]                   ; 4-byte Folded Spill
	b	LBB112_3
LBB112_3:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	str	w8, [sp, #60]                   ; 4-byte Folded Spill
	b	LBB112_4
LBB112_4:
	ldr	w8, [sp, #52]                   ; 4-byte Folded Reload
	ldr	w9, [sp, #60]                   ; 4-byte Folded Reload
	str	w9, [sp, #28]                   ; 4-byte Folded Spill
	subs	w8, w8, #240
	b.hi	LBB112_16
	b	LBB112_5
LBB112_5:
	ldr	w8, [sp, #28]                   ; 4-byte Folded Reload
	cbnz	w8, LBB112_7
	b	LBB112_6
LBB112_6:
	b	LBB112_14
LBB112_7:
	ldr	w8, [sp, #28]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.ne	LBB112_9
	b	LBB112_8
LBB112_8:
	ldr	x8, [sp, #40]                   ; 8-byte Folded Reload
	strb	wzr, [x8, #1]
	b	LBB112_14
LBB112_9:
	ldr	w8, [sp, #28]                   ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.ne	LBB112_11
	b	LBB112_10
LBB112_10:
	ldr	x8, [sp, #40]                   ; 8-byte Folded Reload
	add	x8, x8, #1
	strh	wzr, [x8]
	b	LBB112_14
LBB112_11:
	ldr	w8, [sp, #28]                   ; 4-byte Folded Reload
	subs	w8, w8, #4
	b.ne	LBB112_13
	b	LBB112_12
LBB112_12:
	ldr	x8, [sp, #40]                   ; 8-byte Folded Reload
	stur	wzr, [x8, #1]
	b	LBB112_14
LBB112_13:
	brk	#0x1
LBB112_14:
	ldr	w8, [sp, #52]                   ; 4-byte Folded Reload
	cbz	w8, LBB112_28
	b	LBB112_15
LBB112_15:
	ldr	x9, [sp, #40]                   ; 8-byte Folded Reload
	ldr	w8, [sp, #52]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	add	w8, w8, #16
	strb	w8, [x9]
	b	LBB112_28
LBB112_16:
	ldr	w8, [sp, #52]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	subs	w9, w8, #240
	str	w9, [sp, #16]                   ; 4-byte Folded Spill
	mov	w10, #1                         ; =0x1
	mov	w8, #0                          ; =0x0
	str	w10, [sp, #20]                  ; 4-byte Folded Spill
	str	w9, [sp, #24]                   ; 4-byte Folded Spill
	tbnz	w8, #0, LBB112_18
	b	LBB112_17
LBB112_17:
	ldr	w10, [sp, #16]                  ; 4-byte Folded Reload
	lsr	w8, w10, #8
	add	w9, w8, #1
	mov	w8, #255                        ; =0xff
	and	w8, w8, w10
	str	w9, [sp, #20]                   ; 4-byte Folded Spill
	str	w8, [sp, #24]                   ; 4-byte Folded Spill
	b	LBB112_18
LBB112_18:
	ldr	w8, [sp, #28]                   ; 4-byte Folded Reload
	ldr	x10, [sp, #40]                  ; 8-byte Folded Reload
	ldr	w11, [sp, #20]                  ; 4-byte Folded Reload
	ldr	w9, [sp, #24]                   ; 4-byte Folded Reload
	str	w11, [sp, #12]                  ; 4-byte Folded Spill
	strb	w9, [x10]
	cbnz	w8, LBB112_20
	b	LBB112_19
LBB112_19:
	b	LBB112_27
LBB112_20:
	ldr	w8, [sp, #28]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.ne	LBB112_22
	b	LBB112_21
LBB112_21:
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	ldr	x9, [sp, #40]                   ; 8-byte Folded Reload
	strb	w8, [x9, #1]
	b	LBB112_27
LBB112_22:
	ldr	w8, [sp, #28]                   ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.ne	LBB112_24
	b	LBB112_23
LBB112_23:
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	ldr	x9, [sp, #40]                   ; 8-byte Folded Reload
	sturh	w8, [x9, #1]
	b	LBB112_27
LBB112_24:
	ldr	w8, [sp, #28]                   ; 4-byte Folded Reload
	subs	w8, w8, #4
	b.ne	LBB112_26
	b	LBB112_25
LBB112_25:
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	ldr	x9, [sp, #40]                   ; 8-byte Folded Reload
	stur	w8, [x9, #1]
	b	LBB112_27
LBB112_26:
	brk	#0x1
LBB112_27:
	b	LBB112_28
LBB112_28:
	add	sp, sp, #64
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection6NibbleOwug
_$s16ReaArcProjection6NibbleOwug:       ; @"$s16ReaArcProjection6NibbleOwug"
; %bb.0:
	ldrb	w0, [x0]
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection6NibbleOwup
_$s16ReaArcProjection6NibbleOwup:       ; @"$s16ReaArcProjection6NibbleOwup"
; %bb.0:
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection6NibbleOwui
_$s16ReaArcProjection6NibbleOwui:       ; @"$s16ReaArcProjection6NibbleOwui"
; %bb.0:
	strb	w1, [x0]
	ret
                                        ; -- End function
	.globl	_$s16ReaArcProjection6NibbleOMa ; -- Begin function $s16ReaArcProjection6NibbleOMa
	.p2align	2
_$s16ReaArcProjection6NibbleOMa:        ; @"$s16ReaArcProjection6NibbleOMa"
; %bb.0:
	adrp	x8, _$s16ReaArcProjection6NibbleOMf@PAGE
	add	x8, x8, _$s16ReaArcProjection6NibbleOMf@PAGEOFF
	add	x0, x8, #16
	mov	x1, #0                          ; =0x0
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadVwCP
_$s16ReaArcProjection11WidePayloadVwCP: ; @"$s16ReaArcProjection11WidePayloadVwCP"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	str	x0, [sp]                        ; 8-byte Folded Spill
	ldr	x0, [x1]
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	bl	_swift_retain
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	str	x8, [x0]
	ldr	x8, [x0]
	add	x0, x8, #16
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
                                        ; -- End function
	.private_extern	___swift_memcpy156_8    ; -- Begin function __swift_memcpy156_8
	.globl	___swift_memcpy156_8
	.weak_definition	___swift_memcpy156_8
	.p2align	2
___swift_memcpy156_8:                   ; @__swift_memcpy156_8
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	mov	w8, #156                        ; =0x9c
	mov	x2, x8
	bl	_memcpy
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadVwet
_$s16ReaArcProjection11WidePayloadVwet: ; @"$s16ReaArcProjection11WidePayloadVwet"
; %bb.0:
	sub	sp, sp, #32
	str	w1, [sp, #20]                   ; 4-byte Folded Spill
	str	x0, [sp, #24]                   ; 8-byte Folded Spill
	cbz	w1, LBB119_14
	b	LBB119_1
LBB119_1:
	ldr	w8, [sp, #20]                   ; 4-byte Folded Reload
	subs	w8, w8, #241
	b.lo	LBB119_13
	b	LBB119_2
LBB119_2:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	add	x8, x8, #156
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	mov	w8, #1                          ; =0x1
	cbnz	w8, LBB119_4
	b	LBB119_3
LBB119_3:
	mov	w8, #0                          ; =0x0
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB119_11
LBB119_4:
	mov	w8, #0                          ; =0x0
	cbnz	w8, LBB119_6
	b	LBB119_5
LBB119_5:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldrb	w8, [x8]
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB119_11
LBB119_6:
	mov	w8, #1                          ; =0x1
	cbnz	w8, LBB119_8
	b	LBB119_7
LBB119_7:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldrh	w8, [x8]
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB119_11
LBB119_8:
	mov	w8, #1                          ; =0x1
	cbnz	w8, LBB119_10
	b	LBB119_9
LBB119_9:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldr	w8, [x8]
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB119_11
LBB119_10:
	brk	#0x1
LBB119_11:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	cbz	w8, LBB119_13
	b	LBB119_12
LBB119_12:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	ldr	w8, [x8]
	add	w8, w8, #240
	str	w8, [sp]                        ; 4-byte Folded Spill
	b	LBB119_15
LBB119_13:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	ldrb	w8, [x8, #155]
	subs	w8, w8, #16
	subs	w9, w8, #0
	csinv	w8, w8, wzr, ge
	str	w8, [sp]                        ; 4-byte Folded Spill
	b	LBB119_15
LBB119_14:
	mov	w8, #-1                         ; =0xffffffff
	str	w8, [sp]                        ; 4-byte Folded Spill
	b	LBB119_15
LBB119_15:
	ldr	w8, [sp]                        ; 4-byte Folded Reload
	add	w0, w8, #1
	add	sp, sp, #32
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11WidePayloadVwst
_$s16ReaArcProjection11WidePayloadVwst: ; @"$s16ReaArcProjection11WidePayloadVwst"
; %bb.0:
	sub	sp, sp, #64
	str	w1, [sp, #36]                   ; 4-byte Folded Spill
	str	x0, [sp, #40]                   ; 8-byte Folded Spill
	add	x8, x0, #156
	str	x8, [sp, #48]                   ; 8-byte Folded Spill
	mov	w8, #0                          ; =0x0
	subs	w9, w2, #241
	str	w8, [sp, #60]                   ; 4-byte Folded Spill
	b.lo	LBB120_2
	b	LBB120_1
LBB120_1:
	mov	w8, #1                          ; =0x1
	str	w8, [sp, #60]                   ; 4-byte Folded Spill
	b	LBB120_2
LBB120_2:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	ldr	w9, [sp, #60]                   ; 4-byte Folded Reload
	str	w9, [sp, #32]                   ; 4-byte Folded Spill
	subs	w8, w8, #240
	b.hi	LBB120_14
	b	LBB120_3
LBB120_3:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	cbnz	w8, LBB120_5
	b	LBB120_4
LBB120_4:
	b	LBB120_12
LBB120_5:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.ne	LBB120_7
	b	LBB120_6
LBB120_6:
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	mov	w8, #0                          ; =0x0
	strb	w8, [x9]
	b	LBB120_12
LBB120_7:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.ne	LBB120_9
	b	LBB120_8
LBB120_8:
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	mov	w8, #0                          ; =0x0
	strh	w8, [x9]
	b	LBB120_12
LBB120_9:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #4
	b.ne	LBB120_11
	b	LBB120_10
LBB120_10:
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	mov	w8, #0                          ; =0x0
	str	w8, [x9]
	b	LBB120_12
LBB120_11:
	brk	#0x1
LBB120_12:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	cbz	w8, LBB120_26
	b	LBB120_13
LBB120_13:
	ldr	x9, [sp, #40]                   ; 8-byte Folded Reload
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	add	w8, w8, #15
	strb	w8, [x9, #155]
	b	LBB120_26
LBB120_14:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	subs	w9, w8, #241
	mov	w8, #1                          ; =0x1
	mov	x10, x8
	str	w10, [sp, #24]                  ; 4-byte Folded Spill
	str	w9, [sp, #28]                   ; 4-byte Folded Spill
	cbnz	w8, LBB120_16
	b	LBB120_15
LBB120_15:
                                        ; implicit-def: $w8
                                        ; implicit-def: $w8
	b	LBB120_16
LBB120_16:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	ldr	x10, [sp, #40]                  ; 8-byte Folded Reload
	ldr	w11, [sp, #24]                  ; 4-byte Folded Reload
	ldr	w9, [sp, #28]                   ; 4-byte Folded Reload
	str	w11, [sp, #12]                  ; 4-byte Folded Spill
	mov	w9, w9
	mov	x11, x9
	mov	x9, #0                          ; =0x0
	str	x9, [sp, #16]                   ; 8-byte Folded Spill
	str	x9, [x10, #120]
	str	x9, [x10, #112]
	str	x9, [x10, #104]
	str	x9, [x10, #96]
	str	x9, [x10, #88]
	str	x9, [x10, #80]
	str	x9, [x10, #72]
	str	x9, [x10, #64]
	str	x9, [x10, #56]
	str	x9, [x10, #48]
	str	x9, [x10, #40]
	str	x9, [x10, #32]
	str	x9, [x10, #24]
	str	x9, [x10, #16]
	str	x9, [x10, #8]
	str	x11, [x10]
	str	x9, [x10, #136]
	str	x9, [x10, #128]
	str	x9, [x10, #144]
	str	w9, [x10, #152]
	cbnz	w8, LBB120_18
	b	LBB120_17
LBB120_17:
	b	LBB120_25
LBB120_18:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.ne	LBB120_20
	b	LBB120_19
LBB120_19:
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	strb	w8, [x9]
	b	LBB120_25
LBB120_20:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.ne	LBB120_22
	b	LBB120_21
LBB120_21:
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	strh	w8, [x9]
	b	LBB120_25
LBB120_22:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #4
	b.ne	LBB120_24
	b	LBB120_23
LBB120_23:
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	str	w8, [x9]
	b	LBB120_25
LBB120_24:
	brk	#0x1
LBB120_25:
	b	LBB120_26
LBB120_26:
	add	sp, sp, #64
	ret
                                        ; -- End function
	.globl	_$s16ReaArcProjection11WidePayloadVMa ; -- Begin function $s16ReaArcProjection11WidePayloadVMa
	.p2align	2
_$s16ReaArcProjection11WidePayloadVMa:  ; @"$s16ReaArcProjection11WidePayloadVMa"
; %bb.0:
	adrp	x8, _$s16ReaArcProjection11WidePayloadVMf@PAGE
	add	x8, x8, _$s16ReaArcProjection11WidePayloadVMf@PAGEOFF
	add	x0, x8, #16
	mov	x1, #0                          ; =0x0
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10FixedChildOwCP
_$s16ReaArcProjection10FixedChildOwCP:  ; @"$s16ReaArcProjection10FixedChildOwCP"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	str	x0, [sp]                        ; 8-byte Folded Spill
	ldr	x0, [x1]
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	bl	_swift_retain
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	str	x8, [x0]
	ldr	x8, [x0]
	add	x0, x8, #16
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10FixedChildOwet
_$s16ReaArcProjection10FixedChildOwet:  ; @"$s16ReaArcProjection10FixedChildOwet"
; %bb.0:
	sub	sp, sp, #32
	str	w1, [sp, #20]                   ; 4-byte Folded Spill
	str	x0, [sp, #24]                   ; 8-byte Folded Spill
	cbz	w1, LBB123_14
	b	LBB123_1
LBB123_1:
	ldr	w8, [sp, #20]                   ; 4-byte Folded Reload
	subs	w8, w8, #5
	b.lo	LBB123_13
	b	LBB123_2
LBB123_2:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	add	x8, x8, #156
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	mov	w8, #1                          ; =0x1
	cbnz	w8, LBB123_4
	b	LBB123_3
LBB123_3:
	mov	w8, #0                          ; =0x0
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB123_11
LBB123_4:
	mov	w8, #0                          ; =0x0
	cbnz	w8, LBB123_6
	b	LBB123_5
LBB123_5:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldrb	w8, [x8]
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB123_11
LBB123_6:
	mov	w8, #1                          ; =0x1
	cbnz	w8, LBB123_8
	b	LBB123_7
LBB123_7:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldrh	w8, [x8]
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB123_11
LBB123_8:
	mov	w8, #1                          ; =0x1
	cbnz	w8, LBB123_10
	b	LBB123_9
LBB123_9:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldr	w8, [x8]
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB123_11
LBB123_10:
	brk	#0x1
LBB123_11:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	cbz	w8, LBB123_13
	b	LBB123_12
LBB123_12:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	ldr	w8, [x8]
	add	w8, w8, #4
	str	w8, [sp]                        ; 4-byte Folded Spill
	b	LBB123_15
LBB123_13:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	ldr	w8, [x8, #152]
	mvn	w8, w8
	lsr	w8, w8, #28
	subs	w9, w8, #4
	csinv	w8, w8, wzr, lo
	str	w8, [sp]                        ; 4-byte Folded Spill
	b	LBB123_15
LBB123_14:
	mov	w8, #-1                         ; =0xffffffff
	str	w8, [sp]                        ; 4-byte Folded Spill
	b	LBB123_15
LBB123_15:
	ldr	w8, [sp]                        ; 4-byte Folded Reload
	add	w0, w8, #1
	add	sp, sp, #32
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10FixedChildOwst
_$s16ReaArcProjection10FixedChildOwst:  ; @"$s16ReaArcProjection10FixedChildOwst"
; %bb.0:
	sub	sp, sp, #64
	str	w1, [sp, #36]                   ; 4-byte Folded Spill
	str	x0, [sp, #40]                   ; 8-byte Folded Spill
	add	x8, x0, #156
	str	x8, [sp, #48]                   ; 8-byte Folded Spill
	mov	w8, #0                          ; =0x0
	subs	w9, w2, #5
	str	w8, [sp, #60]                   ; 4-byte Folded Spill
	b.lo	LBB124_2
	b	LBB124_1
LBB124_1:
	mov	w8, #1                          ; =0x1
	str	w8, [sp, #60]                   ; 4-byte Folded Spill
	b	LBB124_2
LBB124_2:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	ldr	w9, [sp, #60]                   ; 4-byte Folded Reload
	str	w9, [sp, #32]                   ; 4-byte Folded Spill
	subs	w8, w8, #4
	b.hi	LBB124_14
	b	LBB124_3
LBB124_3:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	cbnz	w8, LBB124_5
	b	LBB124_4
LBB124_4:
	b	LBB124_12
LBB124_5:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.ne	LBB124_7
	b	LBB124_6
LBB124_6:
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	mov	w8, #0                          ; =0x0
	strb	w8, [x9]
	b	LBB124_12
LBB124_7:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.ne	LBB124_9
	b	LBB124_8
LBB124_8:
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	mov	w8, #0                          ; =0x0
	strh	w8, [x9]
	b	LBB124_12
LBB124_9:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #4
	b.ne	LBB124_11
	b	LBB124_10
LBB124_10:
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	mov	w8, #0                          ; =0x0
	str	w8, [x9]
	b	LBB124_12
LBB124_11:
	brk	#0x1
LBB124_12:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	cbz	w8, LBB124_26
	b	LBB124_13
LBB124_13:
	ldr	x9, [sp, #40]                   ; 8-byte Folded Reload
	ldr	w10, [sp, #36]                  ; 4-byte Folded Reload
	mov	w8, #0                          ; =0x0
	subs	w8, w8, w10
	lsl	w8, w8, #28
	mov	x10, #0                         ; =0x0
	str	x10, [sp, #24]                  ; 8-byte Folded Spill
	str	x10, [x9]
	str	x10, [x9, #8]
	str	x10, [x9, #16]
	str	x10, [x9, #24]
	str	x10, [x9, #32]
	str	x10, [x9, #40]
	str	x10, [x9, #48]
	str	x10, [x9, #56]
	str	x10, [x9, #64]
	str	x10, [x9, #72]
	str	x10, [x9, #80]
	str	x10, [x9, #88]
	str	x10, [x9, #96]
	str	x10, [x9, #104]
	str	x10, [x9, #112]
	str	x10, [x9, #120]
	str	x10, [x9, #128]
	str	x10, [x9, #136]
	str	x10, [x9, #144]
	str	w8, [x9, #152]
	b	LBB124_26
LBB124_14:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	subs	w9, w8, #5
	mov	w8, #1                          ; =0x1
	mov	x10, x8
	str	w10, [sp, #16]                  ; 4-byte Folded Spill
	str	w9, [sp, #20]                   ; 4-byte Folded Spill
	cbnz	w8, LBB124_16
	b	LBB124_15
LBB124_15:
                                        ; implicit-def: $w8
                                        ; implicit-def: $w8
	b	LBB124_16
LBB124_16:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	ldr	x10, [sp, #40]                  ; 8-byte Folded Reload
	ldr	w11, [sp, #16]                  ; 4-byte Folded Reload
	ldr	w9, [sp, #20]                   ; 4-byte Folded Reload
	str	w11, [sp, #4]                   ; 4-byte Folded Spill
	mov	w9, w9
	mov	x11, x9
	mov	x9, #0                          ; =0x0
	str	x9, [sp, #8]                    ; 8-byte Folded Spill
	str	x9, [x10, #120]
	str	x9, [x10, #112]
	str	x9, [x10, #104]
	str	x9, [x10, #96]
	str	x9, [x10, #88]
	str	x9, [x10, #80]
	str	x9, [x10, #72]
	str	x9, [x10, #64]
	str	x9, [x10, #56]
	str	x9, [x10, #48]
	str	x9, [x10, #40]
	str	x9, [x10, #32]
	str	x9, [x10, #24]
	str	x9, [x10, #16]
	str	x9, [x10, #8]
	str	x11, [x10]
	str	x9, [x10, #136]
	str	x9, [x10, #128]
	str	x9, [x10, #144]
	str	w9, [x10, #152]
	cbnz	w8, LBB124_18
	b	LBB124_17
LBB124_17:
	b	LBB124_25
LBB124_18:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.ne	LBB124_20
	b	LBB124_19
LBB124_19:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	strb	w8, [x9]
	b	LBB124_25
LBB124_20:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.ne	LBB124_22
	b	LBB124_21
LBB124_21:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	strh	w8, [x9]
	b	LBB124_25
LBB124_22:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #4
	b.ne	LBB124_24
	b	LBB124_23
LBB124_23:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	str	w8, [x9]
	b	LBB124_25
LBB124_24:
	brk	#0x1
LBB124_25:
	b	LBB124_26
LBB124_26:
	add	sp, sp, #64
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10FixedChildOwug
_$s16ReaArcProjection10FixedChildOwug:  ; @"$s16ReaArcProjection10FixedChildOwug"
; %bb.0:
	ldr	x8, [x0]
	ldr	w9, [x0, #152]
	lsr	w9, w9, #28
	and	w9, w9, #0xf
                                        ; kill: def $w8 killed $w8 killed $x8
	add	w8, w8, #11
	subs	w10, w9, #11
	csel	w0, w8, w9, hs
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10FixedChildOwup
_$s16ReaArcProjection10FixedChildOwup:  ; @"$s16ReaArcProjection10FixedChildOwup"
; %bb.0:
	stp	x22, x21, [sp, #-32]!           ; 16-byte Folded Spill
	stp	x20, x19, [sp, #16]             ; 16-byte Folded Spill
	ldr	x21, [x0]
	ldr	x20, [x0, #8]
	ldr	x19, [x0, #16]
	ldr	x7, [x0, #24]
	ldr	x6, [x0, #32]
	ldr	x5, [x0, #40]
	ldr	x4, [x0, #48]
	ldr	x3, [x0, #56]
	ldr	x2, [x0, #64]
	ldr	x1, [x0, #72]
	ldr	x17, [x0, #80]
	ldr	x16, [x0, #88]
	ldr	x15, [x0, #96]
	ldr	x14, [x0, #104]
	ldr	x13, [x0, #112]
	ldr	x12, [x0, #120]
	ldr	x11, [x0, #128]
	ldr	x10, [x0, #136]
	ldr	x9, [x0, #144]
	ldr	w8, [x0, #152]
	and	w8, w8, #0xfffffff
	str	x21, [x0]
	str	x20, [x0, #8]
	str	x19, [x0, #16]
	str	x7, [x0, #24]
	str	x6, [x0, #32]
	str	x5, [x0, #40]
	str	x4, [x0, #48]
	str	x3, [x0, #56]
	str	x2, [x0, #64]
	str	x1, [x0, #72]
	str	x17, [x0, #80]
	str	x16, [x0, #88]
	str	x15, [x0, #96]
	str	x14, [x0, #104]
	str	x13, [x0, #112]
	str	x12, [x0, #120]
	str	x11, [x0, #128]
	str	x10, [x0, #136]
	str	x9, [x0, #144]
	str	w8, [x0, #152]
	ldp	x20, x19, [sp, #16]             ; 16-byte Folded Reload
	ldp	x22, x21, [sp], #32             ; 16-byte Folded Reload
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10FixedChildOwui
_$s16ReaArcProjection10FixedChildOwui:  ; @"$s16ReaArcProjection10FixedChildOwui"
; %bb.0:
	sub	sp, sp, #48
	stp	x22, x21, [sp, #16]             ; 16-byte Folded Spill
	stp	x20, x19, [sp, #32]             ; 16-byte Folded Spill
	str	x0, [sp]                        ; 8-byte Folded Spill
	str	w1, [sp, #12]                   ; 4-byte Folded Spill
	subs	w8, w1, #11
	b.lo	LBB127_2
	b	LBB127_1
LBB127_1:
	ldr	x9, [sp]                        ; 8-byte Folded Reload
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	subs	w8, w8, #11
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	str	x8, [x9]
	str	xzr, [x9, #8]
	str	xzr, [x9, #16]
	str	xzr, [x9, #24]
	str	xzr, [x9, #32]
	str	xzr, [x9, #40]
	str	xzr, [x9, #48]
	str	xzr, [x9, #56]
	str	xzr, [x9, #64]
	str	xzr, [x9, #72]
	str	xzr, [x9, #80]
	str	xzr, [x9, #88]
	str	xzr, [x9, #96]
	str	xzr, [x9, #104]
	str	xzr, [x9, #112]
	str	xzr, [x9, #120]
	str	xzr, [x9, #128]
	str	xzr, [x9, #136]
	str	xzr, [x9, #144]
	mov	w8, #-1342177280                ; =0xb0000000
	str	w8, [x9, #152]
	b	LBB127_3
LBB127_2:
	ldr	x9, [sp]                        ; 8-byte Folded Reload
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	and	w8, w8, #0xf
	ldr	x21, [x9]
	ldr	x20, [x9, #8]
	ldr	x19, [x9, #16]
	ldr	x7, [x9, #24]
	ldr	x6, [x9, #32]
	ldr	x5, [x9, #40]
	ldr	x4, [x9, #48]
	ldr	x3, [x9, #56]
	ldr	x2, [x9, #64]
	ldr	x1, [x9, #72]
	ldr	x0, [x9, #80]
	ldr	x17, [x9, #88]
	ldr	x16, [x9, #96]
	ldr	x15, [x9, #104]
	ldr	x14, [x9, #112]
	ldr	x13, [x9, #120]
	ldr	x12, [x9, #128]
	ldr	x11, [x9, #136]
	ldr	x10, [x9, #144]
	ldr	w22, [x9, #152]
	and	w22, w22, #0xfffffff
	lsl	w8, w8, #28
	and	w8, w8, #0xf0000000
	orr	w8, w8, w22
	str	x21, [x9]
	str	x20, [x9, #8]
	str	x19, [x9, #16]
	str	x7, [x9, #24]
	str	x6, [x9, #32]
	str	x5, [x9, #40]
	str	x4, [x9, #48]
	str	x3, [x9, #56]
	str	x2, [x9, #64]
	str	x1, [x9, #72]
	str	x0, [x9, #80]
	str	x17, [x9, #88]
	str	x16, [x9, #96]
	str	x15, [x9, #104]
	str	x14, [x9, #112]
	str	x13, [x9, #120]
	str	x12, [x9, #128]
	str	x11, [x9, #136]
	str	x10, [x9, #144]
	str	w8, [x9, #152]
	b	LBB127_3
LBB127_3:
	ldp	x20, x19, [sp, #32]             ; 16-byte Folded Reload
	ldp	x22, x21, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
                                        ; -- End function
	.globl	_$s16ReaArcProjection10FixedChildOMa ; -- Begin function $s16ReaArcProjection10FixedChildOMa
	.p2align	2
_$s16ReaArcProjection10FixedChildOMa:   ; @"$s16ReaArcProjection10FixedChildOMa"
; %bb.0:
	adrp	x8, _$s16ReaArcProjection10FixedChildOMf@PAGE
	add	x8, x8, _$s16ReaArcProjection10FixedChildOMf@PAGEOFF
	add	x0, x8, #16
	mov	x1, #0                          ; =0x0
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwCP
_$s16ReaArcProjection11FixedActionOwCP: ; @"$s16ReaArcProjection11FixedActionOwCP"
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
	tbz	w8, #17, LBB129_2
	b	LBB129_1
LBB129_1:
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
	b	LBB129_8
LBB129_2:
	ldur	x1, [x29, #-24]                 ; 8-byte Folded Reload
	ldr	x0, [sp, #32]                   ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	str	w0, [sp, #4]                    ; 4-byte Folded Spill
	cbz	w0, LBB129_4
	b	LBB129_3
LBB129_3:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.eq	LBB129_5
	b	LBB129_6
LBB129_4:
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
	b	LBB129_7
LBB129_5:
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
	b	LBB129_7
LBB129_6:
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldur	x8, [x29, #-16]                 ; 8-byte Folded Reload
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB129_7
LBB129_7:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	str	x8, [sp, #16]                   ; 8-byte Folded Spill
	b	LBB129_8
LBB129_8:
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #64]             ; 16-byte Folded Reload
	add	sp, sp, #80
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwxx
_$s16ReaArcProjection11FixedActionOwxx: ; @"$s16ReaArcProjection11FixedActionOwxx"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	str	x0, [sp]                        ; 8-byte Folded Spill
	bl	_swift_getEnumCaseMultiPayload
	stur	w0, [x29, #-4]                  ; 4-byte Folded Spill
	cbz	w0, LBB130_2
	b	LBB130_1
LBB130_1:
	ldur	w8, [x29, #-4]                  ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.eq	LBB130_3
	b	LBB130_4
LBB130_2:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB130_4
LBB130_3:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB130_4
LBB130_4:
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwcp
_$s16ReaArcProjection11FixedActionOwcp: ; @"$s16ReaArcProjection11FixedActionOwcp"
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
	stur	w0, [x29, #-4]                  ; 4-byte Folded Spill
	cbz	w0, LBB131_2
	b	LBB131_1
LBB131_1:
	ldur	w8, [x29, #-4]                  ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.eq	LBB131_3
	b	LBB131_4
LBB131_2:
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
	b	LBB131_5
LBB131_3:
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
	b	LBB131_5
LBB131_4:
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldr	x8, [sp, #16]                   ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB131_5
LBB131_5:
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwca
_$s16ReaArcProjection11FixedActionOwca: ; @"$s16ReaArcProjection11FixedActionOwca"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	str	x1, [sp, #16]                   ; 8-byte Folded Spill
	stur	x2, [x29, #-8]                  ; 8-byte Folded Spill
	subs	x8, x0, x1
	b.eq	LBB132_7
	b	LBB132_1
LBB132_1:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	bl	_$s16ReaArcProjection11FixedActionOWOh
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	str	w0, [sp, #4]                    ; 4-byte Folded Spill
	cbz	w0, LBB132_3
	b	LBB132_2
LBB132_2:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.eq	LBB132_4
	b	LBB132_5
LBB132_3:
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
	b	LBB132_6
LBB132_4:
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
	b	LBB132_6
LBB132_5:
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x29, #-8]                  ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB132_6
LBB132_6:
	b	LBB132_7
LBB132_7:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection11FixedActionOWOh ; -- Begin function $s16ReaArcProjection11FixedActionOWOh
	.globl	_$s16ReaArcProjection11FixedActionOWOh
	.weak_definition	_$s16ReaArcProjection11FixedActionOWOh
	.p2align	2
_$s16ReaArcProjection11FixedActionOWOh: ; @"$s16ReaArcProjection11FixedActionOWOh"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	str	x0, [sp]                        ; 8-byte Folded Spill
	mov	x0, #0                          ; =0x0
	bl	_$s16ReaArcProjection11FixedActionOMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	stur	w0, [x29, #-4]                  ; 4-byte Folded Spill
	cbz	w0, LBB133_2
	b	LBB133_1
LBB133_1:
	ldur	w8, [x29, #-4]                  ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.eq	LBB133_3
	b	LBB133_4
LBB133_2:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB133_4
LBB133_3:
	mov	x0, #0                          ; =0x0
	bl	_$s19ReaResilientPayload0aC0VMa
	mov	x1, x0
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldur	x8, [x1, #-8]
	ldr	x8, [x8, #8]
	blr	x8
	b	LBB133_4
LBB133_4:
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwtk
_$s16ReaArcProjection11FixedActionOwtk: ; @"$s16ReaArcProjection11FixedActionOwtk"
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
	stur	w0, [x29, #-4]                  ; 4-byte Folded Spill
	cbz	w0, LBB134_2
	b	LBB134_1
LBB134_1:
	ldur	w8, [x29, #-4]                  ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.eq	LBB134_3
	b	LBB134_4
LBB134_2:
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
	b	LBB134_5
LBB134_3:
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
	b	LBB134_5
LBB134_4:
	ldr	x1, [sp, #8]                    ; 8-byte Folded Reload
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldr	x8, [sp, #16]                   ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB134_5
LBB134_5:
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwta
_$s16ReaArcProjection11FixedActionOwta: ; @"$s16ReaArcProjection11FixedActionOwta"
; %bb.0:
	sub	sp, sp, #48
	stp	x29, x30, [sp, #32]             ; 16-byte Folded Spill
	add	x29, sp, #32
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	str	x1, [sp, #16]                   ; 8-byte Folded Spill
	stur	x2, [x29, #-8]                  ; 8-byte Folded Spill
	subs	x8, x0, x1
	b.eq	LBB135_7
	b	LBB135_1
LBB135_1:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	bl	_$s16ReaArcProjection11FixedActionOWOh
	ldur	x1, [x29, #-8]                  ; 8-byte Folded Reload
	ldr	x0, [sp, #16]                   ; 8-byte Folded Reload
	bl	_swift_getEnumCaseMultiPayload
	str	w0, [sp, #4]                    ; 4-byte Folded Spill
	cbz	w0, LBB135_3
	b	LBB135_2
LBB135_2:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.eq	LBB135_4
	b	LBB135_5
LBB135_3:
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
	b	LBB135_6
LBB135_4:
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
	b	LBB135_6
LBB135_5:
	ldr	x1, [sp, #16]                   ; 8-byte Folded Reload
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldur	x8, [x29, #-8]                  ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	ldr	x2, [x8, #64]
	bl	_memcpy
	b	LBB135_6
LBB135_6:
	b	LBB135_7
LBB135_7:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #32]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwet
_$s16ReaArcProjection11FixedActionOwet: ; @"$s16ReaArcProjection11FixedActionOwet"
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	ldur	x8, [x2, #-8]
	ldr	x8, [x8, #48]
	blr	x8
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwst
_$s16ReaArcProjection11FixedActionOwst: ; @"$s16ReaArcProjection11FixedActionOwst"
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	ldur	x8, [x3, #-8]
	ldr	x8, [x8, #56]
	blr	x8
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwug
_$s16ReaArcProjection11FixedActionOwug: ; @"$s16ReaArcProjection11FixedActionOwug"
; %bb.0:
	stp	x29, x30, [sp, #-16]!           ; 16-byte Folded Spill
	mov	x29, sp
	bl	_swift_getEnumCaseMultiPayload
	ldp	x29, x30, [sp], #16             ; 16-byte Folded Reload
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwup
_$s16ReaArcProjection11FixedActionOwup: ; @"$s16ReaArcProjection11FixedActionOwup"
; %bb.0:
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOwui
_$s16ReaArcProjection11FixedActionOwui: ; @"$s16ReaArcProjection11FixedActionOwui"
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
	.p2align	2                               ; -- Begin function $s16ReaArcProjection11FixedActionOMr
_$s16ReaArcProjection11FixedActionOMr:  ; @"$s16ReaArcProjection11FixedActionOMr"
; %bb.0:
	sub	sp, sp, #80
	stp	x29, x30, [sp, #64]             ; 16-byte Folded Spill
	add	x29, sp, #64
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	mov	w8, #319                        ; =0x13f
	mov	x0, x8
	bl	_$s19ReaResilientPayload0aC0VMa
	str	x0, [sp, #16]                   ; 8-byte Folded Spill
	mov	w8, #63                         ; =0x3f
                                        ; kill: def $x8 killed $w8
	subs	x9, x1, #63
	str	x0, [sp, #24]                   ; 8-byte Folded Spill
	str	x8, [sp, #32]                   ; 8-byte Folded Spill
	b.hi	LBB141_2
	b	LBB141_1
LBB141_1:
	ldr	x0, [sp, #8]                    ; 8-byte Folded Reload
	ldr	x8, [sp, #16]                   ; 8-byte Folded Reload
	ldur	x8, [x8, #-8]
	mov	x9, x8
	add	x9, x9, #64
	sub	x3, x29, #24
	stur	x9, [x29, #-24]
	adrp	x9, l_type_layout_156_8_4_pod@PAGE
	add	x9, x9, l_type_layout_156_8_4_pod@PAGEOFF
	stur	x9, [x29, #-16]
	add	x8, x8, #64
	stur	x8, [x29, #-8]
	mov	w8, #256                        ; =0x100
	mov	x1, x8
	mov	w8, #3                          ; =0x3
	mov	x2, x8
	bl	_swift_initEnumMetadataMultiPayload
	mov	x8, #0                          ; =0x0
	mov	x9, #0                          ; =0x0
	str	x9, [sp, #24]                   ; 8-byte Folded Spill
	str	x8, [sp, #32]                   ; 8-byte Folded Spill
	b	LBB141_2
LBB141_2:
	ldr	x0, [sp, #24]                   ; 8-byte Folded Reload
	ldr	x1, [sp, #32]                   ; 8-byte Folded Reload
	ldp	x29, x30, [sp, #64]             ; 16-byte Folded Reload
	add	sp, sp, #80
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10OtherChildOwCP
_$s16ReaArcProjection10OtherChildOwCP:  ; @"$s16ReaArcProjection10OtherChildOwCP"
; %bb.0:
	sub	sp, sp, #32
	stp	x29, x30, [sp, #16]             ; 16-byte Folded Spill
	add	x29, sp, #16
	str	x0, [sp]                        ; 8-byte Folded Spill
	ldr	x0, [x1]
	str	x0, [sp, #8]                    ; 8-byte Folded Spill
	bl	_swift_retain
	ldr	x0, [sp]                        ; 8-byte Folded Reload
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	str	x8, [x0]
	ldr	x8, [x0]
	add	x0, x8, #16
	ldp	x29, x30, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #32
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10OtherChildOwet
_$s16ReaArcProjection10OtherChildOwet:  ; @"$s16ReaArcProjection10OtherChildOwet"
; %bb.0:
	sub	sp, sp, #32
	str	w1, [sp, #20]                   ; 4-byte Folded Spill
	str	x0, [sp, #24]                   ; 8-byte Folded Spill
	cbz	w1, LBB143_14
	b	LBB143_1
LBB143_1:
	ldr	w8, [sp, #20]                   ; 4-byte Folded Reload
	subs	w8, w8, #5
	b.lo	LBB143_13
	b	LBB143_2
LBB143_2:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	add	x8, x8, #156
	str	x8, [sp, #8]                    ; 8-byte Folded Spill
	mov	w8, #1                          ; =0x1
	cbnz	w8, LBB143_4
	b	LBB143_3
LBB143_3:
	mov	w8, #0                          ; =0x0
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB143_11
LBB143_4:
	mov	w8, #0                          ; =0x0
	cbnz	w8, LBB143_6
	b	LBB143_5
LBB143_5:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldrb	w8, [x8]
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB143_11
LBB143_6:
	mov	w8, #1                          ; =0x1
	cbnz	w8, LBB143_8
	b	LBB143_7
LBB143_7:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldrh	w8, [x8]
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB143_11
LBB143_8:
	mov	w8, #1                          ; =0x1
	cbnz	w8, LBB143_10
	b	LBB143_9
LBB143_9:
	ldr	x8, [sp, #8]                    ; 8-byte Folded Reload
	ldr	w8, [x8]
	str	w8, [sp, #4]                    ; 4-byte Folded Spill
	b	LBB143_11
LBB143_10:
	brk	#0x1
LBB143_11:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	cbz	w8, LBB143_13
	b	LBB143_12
LBB143_12:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	ldr	w8, [x8]
	add	w8, w8, #4
	str	w8, [sp]                        ; 4-byte Folded Spill
	b	LBB143_15
LBB143_13:
	ldr	x8, [sp, #24]                   ; 8-byte Folded Reload
	ldr	w8, [x8, #152]
	mvn	w8, w8
	lsr	w8, w8, #28
	subs	w9, w8, #4
	csinv	w8, w8, wzr, lo
	str	w8, [sp]                        ; 4-byte Folded Spill
	b	LBB143_15
LBB143_14:
	mov	w8, #-1                         ; =0xffffffff
	str	w8, [sp]                        ; 4-byte Folded Spill
	b	LBB143_15
LBB143_15:
	ldr	w8, [sp]                        ; 4-byte Folded Reload
	add	w0, w8, #1
	add	sp, sp, #32
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10OtherChildOwst
_$s16ReaArcProjection10OtherChildOwst:  ; @"$s16ReaArcProjection10OtherChildOwst"
; %bb.0:
	sub	sp, sp, #64
	str	w1, [sp, #36]                   ; 4-byte Folded Spill
	str	x0, [sp, #40]                   ; 8-byte Folded Spill
	add	x8, x0, #156
	str	x8, [sp, #48]                   ; 8-byte Folded Spill
	mov	w8, #0                          ; =0x0
	subs	w9, w2, #5
	str	w8, [sp, #60]                   ; 4-byte Folded Spill
	b.lo	LBB144_2
	b	LBB144_1
LBB144_1:
	mov	w8, #1                          ; =0x1
	str	w8, [sp, #60]                   ; 4-byte Folded Spill
	b	LBB144_2
LBB144_2:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	ldr	w9, [sp, #60]                   ; 4-byte Folded Reload
	str	w9, [sp, #32]                   ; 4-byte Folded Spill
	subs	w8, w8, #4
	b.hi	LBB144_14
	b	LBB144_3
LBB144_3:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	cbnz	w8, LBB144_5
	b	LBB144_4
LBB144_4:
	b	LBB144_12
LBB144_5:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.ne	LBB144_7
	b	LBB144_6
LBB144_6:
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	mov	w8, #0                          ; =0x0
	strb	w8, [x9]
	b	LBB144_12
LBB144_7:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.ne	LBB144_9
	b	LBB144_8
LBB144_8:
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	mov	w8, #0                          ; =0x0
	strh	w8, [x9]
	b	LBB144_12
LBB144_9:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #4
	b.ne	LBB144_11
	b	LBB144_10
LBB144_10:
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	mov	w8, #0                          ; =0x0
	str	w8, [x9]
	b	LBB144_12
LBB144_11:
	brk	#0x1
LBB144_12:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	cbz	w8, LBB144_26
	b	LBB144_13
LBB144_13:
	ldr	x9, [sp, #40]                   ; 8-byte Folded Reload
	ldr	w10, [sp, #36]                  ; 4-byte Folded Reload
	mov	w8, #0                          ; =0x0
	subs	w8, w8, w10
	lsl	w8, w8, #28
	mov	x10, #0                         ; =0x0
	str	x10, [sp, #24]                  ; 8-byte Folded Spill
	str	x10, [x9]
	str	x10, [x9, #8]
	str	x10, [x9, #16]
	str	x10, [x9, #24]
	str	x10, [x9, #32]
	str	x10, [x9, #40]
	str	x10, [x9, #48]
	str	x10, [x9, #56]
	str	x10, [x9, #64]
	str	x10, [x9, #72]
	str	x10, [x9, #80]
	str	x10, [x9, #88]
	str	x10, [x9, #96]
	str	x10, [x9, #104]
	str	x10, [x9, #112]
	str	x10, [x9, #120]
	str	x10, [x9, #128]
	str	x10, [x9, #136]
	str	x10, [x9, #144]
	str	w8, [x9, #152]
	b	LBB144_26
LBB144_14:
	ldr	w8, [sp, #36]                   ; 4-byte Folded Reload
	subs	w9, w8, #5
	mov	w8, #1                          ; =0x1
	mov	x10, x8
	str	w10, [sp, #16]                  ; 4-byte Folded Spill
	str	w9, [sp, #20]                   ; 4-byte Folded Spill
	cbnz	w8, LBB144_16
	b	LBB144_15
LBB144_15:
                                        ; implicit-def: $w8
                                        ; implicit-def: $w8
	b	LBB144_16
LBB144_16:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	ldr	x10, [sp, #40]                  ; 8-byte Folded Reload
	ldr	w11, [sp, #16]                  ; 4-byte Folded Reload
	ldr	w9, [sp, #20]                   ; 4-byte Folded Reload
	str	w11, [sp, #4]                   ; 4-byte Folded Spill
	mov	w9, w9
	mov	x11, x9
	mov	x9, #0                          ; =0x0
	str	x9, [sp, #8]                    ; 8-byte Folded Spill
	str	x9, [x10, #120]
	str	x9, [x10, #112]
	str	x9, [x10, #104]
	str	x9, [x10, #96]
	str	x9, [x10, #88]
	str	x9, [x10, #80]
	str	x9, [x10, #72]
	str	x9, [x10, #64]
	str	x9, [x10, #56]
	str	x9, [x10, #48]
	str	x9, [x10, #40]
	str	x9, [x10, #32]
	str	x9, [x10, #24]
	str	x9, [x10, #16]
	str	x9, [x10, #8]
	str	x11, [x10]
	str	x9, [x10, #136]
	str	x9, [x10, #128]
	str	x9, [x10, #144]
	str	w9, [x10, #152]
	cbnz	w8, LBB144_18
	b	LBB144_17
LBB144_17:
	b	LBB144_25
LBB144_18:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #1
	b.ne	LBB144_20
	b	LBB144_19
LBB144_19:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	strb	w8, [x9]
	b	LBB144_25
LBB144_20:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #2
	b.ne	LBB144_22
	b	LBB144_21
LBB144_21:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	strh	w8, [x9]
	b	LBB144_25
LBB144_22:
	ldr	w8, [sp, #32]                   ; 4-byte Folded Reload
	subs	w8, w8, #4
	b.ne	LBB144_24
	b	LBB144_23
LBB144_23:
	ldr	w8, [sp, #4]                    ; 4-byte Folded Reload
	ldr	x9, [sp, #48]                   ; 8-byte Folded Reload
	str	w8, [x9]
	b	LBB144_25
LBB144_24:
	brk	#0x1
LBB144_25:
	b	LBB144_26
LBB144_26:
	add	sp, sp, #64
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10OtherChildOwug
_$s16ReaArcProjection10OtherChildOwug:  ; @"$s16ReaArcProjection10OtherChildOwug"
; %bb.0:
	ldr	x8, [x0]
	ldr	w9, [x0, #152]
	lsr	w9, w9, #28
	and	w9, w9, #0xf
                                        ; kill: def $w8 killed $w8 killed $x8
	add	w8, w8, #11
	subs	w10, w9, #11
	csel	w0, w8, w9, hs
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10OtherChildOwup
_$s16ReaArcProjection10OtherChildOwup:  ; @"$s16ReaArcProjection10OtherChildOwup"
; %bb.0:
	stp	x22, x21, [sp, #-32]!           ; 16-byte Folded Spill
	stp	x20, x19, [sp, #16]             ; 16-byte Folded Spill
	ldr	x21, [x0]
	ldr	x20, [x0, #8]
	ldr	x19, [x0, #16]
	ldr	x7, [x0, #24]
	ldr	x6, [x0, #32]
	ldr	x5, [x0, #40]
	ldr	x4, [x0, #48]
	ldr	x3, [x0, #56]
	ldr	x2, [x0, #64]
	ldr	x1, [x0, #72]
	ldr	x17, [x0, #80]
	ldr	x16, [x0, #88]
	ldr	x15, [x0, #96]
	ldr	x14, [x0, #104]
	ldr	x13, [x0, #112]
	ldr	x12, [x0, #120]
	ldr	x11, [x0, #128]
	ldr	x10, [x0, #136]
	ldr	x9, [x0, #144]
	ldr	w8, [x0, #152]
	and	w8, w8, #0xfffffff
	str	x21, [x0]
	str	x20, [x0, #8]
	str	x19, [x0, #16]
	str	x7, [x0, #24]
	str	x6, [x0, #32]
	str	x5, [x0, #40]
	str	x4, [x0, #48]
	str	x3, [x0, #56]
	str	x2, [x0, #64]
	str	x1, [x0, #72]
	str	x17, [x0, #80]
	str	x16, [x0, #88]
	str	x15, [x0, #96]
	str	x14, [x0, #104]
	str	x13, [x0, #112]
	str	x12, [x0, #120]
	str	x11, [x0, #128]
	str	x10, [x0, #136]
	str	x9, [x0, #144]
	str	w8, [x0, #152]
	ldp	x20, x19, [sp, #16]             ; 16-byte Folded Reload
	ldp	x22, x21, [sp], #32             ; 16-byte Folded Reload
	ret
                                        ; -- End function
	.p2align	2                               ; -- Begin function $s16ReaArcProjection10OtherChildOwui
_$s16ReaArcProjection10OtherChildOwui:  ; @"$s16ReaArcProjection10OtherChildOwui"
; %bb.0:
	sub	sp, sp, #48
	stp	x22, x21, [sp, #16]             ; 16-byte Folded Spill
	stp	x20, x19, [sp, #32]             ; 16-byte Folded Spill
	str	x0, [sp]                        ; 8-byte Folded Spill
	str	w1, [sp, #12]                   ; 4-byte Folded Spill
	subs	w8, w1, #11
	b.lo	LBB147_2
	b	LBB147_1
LBB147_1:
	ldr	x9, [sp]                        ; 8-byte Folded Reload
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	subs	w8, w8, #11
	mov	w8, w8
                                        ; kill: def $x8 killed $w8
	str	x8, [x9]
	str	xzr, [x9, #8]
	str	xzr, [x9, #16]
	str	xzr, [x9, #24]
	str	xzr, [x9, #32]
	str	xzr, [x9, #40]
	str	xzr, [x9, #48]
	str	xzr, [x9, #56]
	str	xzr, [x9, #64]
	str	xzr, [x9, #72]
	str	xzr, [x9, #80]
	str	xzr, [x9, #88]
	str	xzr, [x9, #96]
	str	xzr, [x9, #104]
	str	xzr, [x9, #112]
	str	xzr, [x9, #120]
	str	xzr, [x9, #128]
	str	xzr, [x9, #136]
	str	xzr, [x9, #144]
	mov	w8, #-1342177280                ; =0xb0000000
	str	w8, [x9, #152]
	b	LBB147_3
LBB147_2:
	ldr	x9, [sp]                        ; 8-byte Folded Reload
	ldr	w8, [sp, #12]                   ; 4-byte Folded Reload
	and	w8, w8, #0xf
	ldr	x21, [x9]
	ldr	x20, [x9, #8]
	ldr	x19, [x9, #16]
	ldr	x7, [x9, #24]
	ldr	x6, [x9, #32]
	ldr	x5, [x9, #40]
	ldr	x4, [x9, #48]
	ldr	x3, [x9, #56]
	ldr	x2, [x9, #64]
	ldr	x1, [x9, #72]
	ldr	x0, [x9, #80]
	ldr	x17, [x9, #88]
	ldr	x16, [x9, #96]
	ldr	x15, [x9, #104]
	ldr	x14, [x9, #112]
	ldr	x13, [x9, #120]
	ldr	x12, [x9, #128]
	ldr	x11, [x9, #136]
	ldr	x10, [x9, #144]
	ldr	w22, [x9, #152]
	and	w22, w22, #0xfffffff
	lsl	w8, w8, #28
	and	w8, w8, #0xf0000000
	orr	w8, w8, w22
	str	x21, [x9]
	str	x20, [x9, #8]
	str	x19, [x9, #16]
	str	x7, [x9, #24]
	str	x6, [x9, #32]
	str	x5, [x9, #40]
	str	x4, [x9, #48]
	str	x3, [x9, #56]
	str	x2, [x9, #64]
	str	x1, [x9, #72]
	str	x0, [x9, #80]
	str	x17, [x9, #88]
	str	x16, [x9, #96]
	str	x15, [x9, #104]
	str	x14, [x9, #112]
	str	x13, [x9, #120]
	str	x12, [x9, #128]
	str	x11, [x9, #136]
	str	x10, [x9, #144]
	str	w8, [x9, #152]
	b	LBB147_3
LBB147_3:
	ldp	x20, x19, [sp, #32]             ; 16-byte Folded Reload
	ldp	x22, x21, [sp, #16]             ; 16-byte Folded Reload
	add	sp, sp, #48
	ret
                                        ; -- End function
	.globl	_$s16ReaArcProjection10OtherChildOMa ; -- Begin function $s16ReaArcProjection10OtherChildOMa
	.p2align	2
_$s16ReaArcProjection10OtherChildOMa:   ; @"$s16ReaArcProjection10OtherChildOMa"
; %bb.0:
	adrp	x8, _$s16ReaArcProjection10OtherChildOMf@PAGE
	add	x8, x8, _$s16ReaArcProjection10OtherChildOMf@PAGEOFF
	add	x0, x8, #16
	mov	x1, #0                          ; =0x0
	ret
                                        ; -- End function
	.private_extern	_$s16ReaArcProjection6NibbleOACSHAAWL ; @"$s16ReaArcProjection6NibbleOACSHAAWL"
	.section	__DATA,__data
	.globl	_$s16ReaArcProjection6NibbleOACSHAAWL
	.weak_definition	_$s16ReaArcProjection6NibbleOACSHAAWL
	.p2align	3, 0x0
_$s16ReaArcProjection6NibbleOACSHAAWL:
	.quad	0

.zerofill __DATA,__bss,_$s16ReaArcProjection6NibbleOSQAAMcMK,128,4 ; @"$s16ReaArcProjection6NibbleOSQAAMcMK"
	.section	__TEXT,__const
	.globl	_$s16ReaArcProjection6NibbleOSQAAMc ; @"$s16ReaArcProjection6NibbleOSQAAMc"
	.p2align	2, 0x0
_$s16ReaArcProjection6NibbleOSQAAMc:
	.long	l_got.$sSQMp-_$s16ReaArcProjection6NibbleOSQAAMc+1
	.long	_$s16ReaArcProjection6NibbleOMn-_$s16ReaArcProjection6NibbleOSQAAMc-4
	.long	0                               ; 0x0
	.long	196608                          ; 0x30000
	.long	1                               ; 0x1
	.long	l_got.$sSQ2eeoiySbx_xtFZTq-_$s16ReaArcProjection6NibbleOSQAAMc-20+1
	.long	_$s16ReaArcProjection6NibbleOSQAASQ2eeoiySbx_xtFZTW-_$s16ReaArcProjection6NibbleOSQAAMc-24
	.short	0                               ; 0x0
	.short	1                               ; 0x1
	.long	0                               ; 0x0
	.long	_$s16ReaArcProjection6NibbleOSQAAMcMK-_$s16ReaArcProjection6NibbleOSQAAMc-36

	.private_extern	_$s16ReaArcProjection6NibbleOACSQAAWL ; @"$s16ReaArcProjection6NibbleOACSQAAWL"
	.section	__DATA,__data
	.globl	_$s16ReaArcProjection6NibbleOACSQAAWL
	.weak_definition	_$s16ReaArcProjection6NibbleOACSQAAWL
	.p2align	3, 0x0
_$s16ReaArcProjection6NibbleOACSQAAWL:
	.quad	0

	.private_extern	"_associated conformance 16ReaArcProjection6NibbleOSHAASQ" ; @"associated conformance 16ReaArcProjection6NibbleOSHAASQ"
	.section	__TEXT,__swift5_typeref
	.globl	"_associated conformance 16ReaArcProjection6NibbleOSHAASQ"
	.weak_definition	"_associated conformance 16ReaArcProjection6NibbleOSHAASQ"
	.p2align	1, 0x0
"_associated conformance 16ReaArcProjection6NibbleOSHAASQ":
	.byte	255                             ; 0xff
	.byte	7                               ; 0x7
	.long	_$s16ReaArcProjection6NibbleOSHAASQWb-"_associated conformance 16ReaArcProjection6NibbleOSHAASQ"-2
	.byte	0                               ; 0x0

.zerofill __DATA,__bss,_$s16ReaArcProjection6NibbleOSHAAMcMK,128,4 ; @"$s16ReaArcProjection6NibbleOSHAAMcMK"
	.section	__TEXT,__const
	.globl	_$s16ReaArcProjection6NibbleOSHAAMc ; @"$s16ReaArcProjection6NibbleOSHAAMc"
	.p2align	2, 0x0
_$s16ReaArcProjection6NibbleOSHAAMc:
	.long	l_got.$sSHMp-_$s16ReaArcProjection6NibbleOSHAAMc+1
	.long	_$s16ReaArcProjection6NibbleOMn-_$s16ReaArcProjection6NibbleOSHAAMc-4
	.long	0                               ; 0x0
	.long	196608                          ; 0x30000
	.long	4                               ; 0x4
	.long	l_got.$sSHSQTb-_$s16ReaArcProjection6NibbleOSHAAMc-20+1
	.long	"_associated conformance 16ReaArcProjection6NibbleOSHAASQ"-_$s16ReaArcProjection6NibbleOSHAAMc-23
	.long	l_got.$sSH9hashValueSivgTq-_$s16ReaArcProjection6NibbleOSHAAMc-28+1
	.long	_$s16ReaArcProjection6NibbleOSHAASH9hashValueSivgTW-_$s16ReaArcProjection6NibbleOSHAAMc-32
	.long	l_got.$sSH4hash4intoys6HasherVz_tFTq-_$s16ReaArcProjection6NibbleOSHAAMc-36+1
	.long	_$s16ReaArcProjection6NibbleOSHAASH4hash4intoys6HasherVz_tFTW-_$s16ReaArcProjection6NibbleOSHAAMc-40
	.long	l_got.$sSH13_rawHashValue4seedS2i_tFTq-_$s16ReaArcProjection6NibbleOSHAAMc-44+1
	.long	_$s16ReaArcProjection6NibbleOSHAASH13_rawHashValue4seedS2i_tFTW-_$s16ReaArcProjection6NibbleOSHAAMc-48
	.short	0                               ; 0x0
	.short	1                               ; 0x1
	.long	0                               ; 0x0
	.long	_$s16ReaArcProjection6NibbleOSHAAMcMK-_$s16ReaArcProjection6NibbleOSHAAMc-60

	.globl	_$s16ReaArcProjection6NibbleO9hashValueSivpMV ; @"$s16ReaArcProjection6NibbleO9hashValueSivpMV"
	.p2align	2, 0x0
_$s16ReaArcProjection6NibbleO9hashValueSivpMV:
	.space	4

	.section	__DATA,__const
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection6NibbleOWV"
_$s16ReaArcProjection6NibbleOWV:
	.quad	___swift_memcpy1_1
	.quad	___swift_noop_void_return
	.quad	___swift_memcpy1_1
	.quad	___swift_memcpy1_1
	.quad	___swift_memcpy1_1
	.quad	___swift_memcpy1_1
	.quad	_$s16ReaArcProjection6NibbleOwet
	.quad	_$s16ReaArcProjection6NibbleOwst
	.quad	1                               ; 0x1
	.quad	1                               ; 0x1
	.long	2097152                         ; 0x200000
	.long	240                             ; 0xf0
	.quad	_$s16ReaArcProjection6NibbleOwug
	.quad	_$s16ReaArcProjection6NibbleOwup
	.quad	_$s16ReaArcProjection6NibbleOwui

	.section	__TEXT,__const
	.p2align	4, 0x0                          ; @.str.16.ReaArcProjection
l_.str.16.ReaArcProjection:
	.asciz	"ReaArcProjection"

	.private_extern	_$s16ReaArcProjectionMXM ; @"$s16ReaArcProjectionMXM"
	.section	__TEXT,__constg_swiftt
	.globl	_$s16ReaArcProjectionMXM
	.weak_definition	_$s16ReaArcProjectionMXM
	.p2align	2, 0x0
_$s16ReaArcProjectionMXM:
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l_.str.16.ReaArcProjection-_$s16ReaArcProjectionMXM-8

	.section	__TEXT,__const
l_.str.6.Nibble:                        ; @.str.6.Nibble
	.asciz	"Nibble"

	.section	__TEXT,__constg_swiftt
	.globl	_$s16ReaArcProjection6NibbleOMn ; @"$s16ReaArcProjection6NibbleOMn"
	.p2align	2, 0x0
_$s16ReaArcProjection6NibbleOMn:
	.long	82                              ; 0x52
	.long	_$s16ReaArcProjectionMXM-_$s16ReaArcProjection6NibbleOMn-4
	.long	l_.str.6.Nibble-_$s16ReaArcProjection6NibbleOMn-8
	.long	_$s16ReaArcProjection6NibbleOMa-_$s16ReaArcProjection6NibbleOMn-12
	.long	_$s16ReaArcProjection6NibbleOMF-_$s16ReaArcProjection6NibbleOMn-16
	.long	0                               ; 0x0
	.long	16                              ; 0x10

	.section	__DATA,__const
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection6NibbleOMf"
_$s16ReaArcProjection6NibbleOMf:
	.quad	0
	.quad	_$s16ReaArcProjection6NibbleOWV
	.quad	513                             ; 0x201
	.quad	_$s16ReaArcProjection6NibbleOMn

	.private_extern	"_symbolic _____ 16ReaArcProjection6NibbleO" ; @"symbolic _____ 16ReaArcProjection6NibbleO"
	.section	__TEXT,__swift5_typeref
	.globl	"_symbolic _____ 16ReaArcProjection6NibbleO"
	.weak_definition	"_symbolic _____ 16ReaArcProjection6NibbleO"
	.p2align	1, 0x0
"_symbolic _____ 16ReaArcProjection6NibbleO":
	.byte	1                               ; 0x1
	.long	_$s16ReaArcProjection6NibbleOMn-"_symbolic _____ 16ReaArcProjection6NibbleO"-1
	.byte	0                               ; 0x0

	.section	__TEXT,__swift5_reflstr
l___unnamed_1:                          ; @0
	.asciz	"n0"

l___unnamed_2:                          ; @1
	.asciz	"n1"

l___unnamed_3:                          ; @2
	.asciz	"n2"

l___unnamed_4:                          ; @3
	.asciz	"n3"

l___unnamed_5:                          ; @4
	.asciz	"n4"

l___unnamed_6:                          ; @5
	.asciz	"n5"

l___unnamed_7:                          ; @6
	.asciz	"n6"

l___unnamed_8:                          ; @7
	.asciz	"n7"

l___unnamed_9:                          ; @8
	.asciz	"n8"

l___unnamed_10:                         ; @9
	.asciz	"n9"

l___unnamed_11:                         ; @10
	.asciz	"n10"

l___unnamed_12:                         ; @11
	.asciz	"n11"

l___unnamed_13:                         ; @12
	.asciz	"n12"

l___unnamed_14:                         ; @13
	.asciz	"n13"

l___unnamed_15:                         ; @14
	.asciz	"n14"

l___unnamed_16:                         ; @15
	.asciz	"n15"

	.section	__TEXT,__swift5_fieldmd
	.p2align	2, 0x0                          ; @"$s16ReaArcProjection6NibbleOMF"
_$s16ReaArcProjection6NibbleOMF:
	.long	"_symbolic _____ 16ReaArcProjection6NibbleO"-_$s16ReaArcProjection6NibbleOMF
	.long	0                               ; 0x0
	.short	2                               ; 0x2
	.short	12                              ; 0xc
	.long	16                              ; 0x10
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_1-_$s16ReaArcProjection6NibbleOMF-24
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_2-_$s16ReaArcProjection6NibbleOMF-36
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_3-_$s16ReaArcProjection6NibbleOMF-48
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_4-_$s16ReaArcProjection6NibbleOMF-60
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_5-_$s16ReaArcProjection6NibbleOMF-72
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_6-_$s16ReaArcProjection6NibbleOMF-84
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_7-_$s16ReaArcProjection6NibbleOMF-96
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_8-_$s16ReaArcProjection6NibbleOMF-108
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_9-_$s16ReaArcProjection6NibbleOMF-120
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_10-_$s16ReaArcProjection6NibbleOMF-132
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_11-_$s16ReaArcProjection6NibbleOMF-144
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_12-_$s16ReaArcProjection6NibbleOMF-156
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_13-_$s16ReaArcProjection6NibbleOMF-168
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_14-_$s16ReaArcProjection6NibbleOMF-180
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_15-_$s16ReaArcProjection6NibbleOMF-192
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_16-_$s16ReaArcProjection6NibbleOMF-204

	.section	__DATA,__const
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection11WidePayloadVWV"
_$s16ReaArcProjection11WidePayloadVWV:
	.quad	_$s16ReaArcProjection11WidePayloadVwCP
	.quad	___swift_noop_void_return
	.quad	___swift_memcpy156_8
	.quad	___swift_memcpy156_8
	.quad	___swift_memcpy156_8
	.quad	___swift_memcpy156_8
	.quad	_$s16ReaArcProjection11WidePayloadVwet
	.quad	_$s16ReaArcProjection11WidePayloadVwst
	.quad	156                             ; 0x9c
	.quad	160                             ; 0xa0
	.long	131079                          ; 0x20007
	.long	240                             ; 0xf0

	.section	__TEXT,__const
l_.str.11.WidePayload:                  ; @.str.11.WidePayload
	.asciz	"WidePayload"

	.section	__TEXT,__constg_swiftt
	.globl	_$s16ReaArcProjection11WidePayloadVMn ; @"$s16ReaArcProjection11WidePayloadVMn"
	.p2align	2, 0x0
_$s16ReaArcProjection11WidePayloadVMn:
	.long	81                              ; 0x51
	.long	_$s16ReaArcProjectionMXM-_$s16ReaArcProjection11WidePayloadVMn-4
	.long	l_.str.11.WidePayload-_$s16ReaArcProjection11WidePayloadVMn-8
	.long	_$s16ReaArcProjection11WidePayloadVMa-_$s16ReaArcProjection11WidePayloadVMn-12
	.long	_$s16ReaArcProjection11WidePayloadVMF-_$s16ReaArcProjection11WidePayloadVMn-16
	.long	23                              ; 0x17
	.long	2                               ; 0x2

	.section	__DATA,__const
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection11WidePayloadVMf"
_$s16ReaArcProjection11WidePayloadVMf:
	.quad	0
	.quad	_$s16ReaArcProjection11WidePayloadVWV
	.quad	512                             ; 0x200
	.quad	_$s16ReaArcProjection11WidePayloadVMn
	.long	0                               ; 0x0
	.long	8                               ; 0x8
	.long	16                              ; 0x10
	.long	24                              ; 0x18
	.long	32                              ; 0x20
	.long	40                              ; 0x28
	.long	48                              ; 0x30
	.long	56                              ; 0x38
	.long	64                              ; 0x40
	.long	72                              ; 0x48
	.long	80                              ; 0x50
	.long	88                              ; 0x58
	.long	96                              ; 0x60
	.long	104                             ; 0x68
	.long	112                             ; 0x70
	.long	120                             ; 0x78
	.long	128                             ; 0x80
	.long	136                             ; 0x88
	.long	144                             ; 0x90
	.long	152                             ; 0x98
	.long	153                             ; 0x99
	.long	154                             ; 0x9a
	.long	155                             ; 0x9b
	.space	4

	.private_extern	"_symbolic _____ 16ReaArcProjection11WidePayloadV" ; @"symbolic _____ 16ReaArcProjection11WidePayloadV"
	.section	__TEXT,__swift5_typeref
	.globl	"_symbolic _____ 16ReaArcProjection11WidePayloadV"
	.weak_definition	"_symbolic _____ 16ReaArcProjection11WidePayloadV"
	.p2align	1, 0x0
"_symbolic _____ 16ReaArcProjection11WidePayloadV":
	.byte	1                               ; 0x1
	.long	_$s16ReaArcProjection11WidePayloadVMn-"_symbolic _____ 16ReaArcProjection11WidePayloadV"-1
	.byte	0                               ; 0x0

	.private_extern	"_symbolic _____ s6UInt64V" ; @"symbolic _____ s6UInt64V"
	.globl	"_symbolic _____ s6UInt64V"
	.weak_definition	"_symbolic _____ s6UInt64V"
	.p2align	1, 0x0
"_symbolic _____ s6UInt64V":
	.byte	2                               ; 0x2
Ltmp5:
	.long	_$ss6UInt64VMn@GOT-Ltmp5
	.byte	0                               ; 0x0

	.section	__TEXT,__swift5_reflstr
l___unnamed_17:                         ; @16
	.asciz	"word0"

l___unnamed_18:                         ; @17
	.asciz	"word1"

l___unnamed_19:                         ; @18
	.asciz	"word2"

l___unnamed_20:                         ; @19
	.asciz	"word3"

l___unnamed_21:                         ; @20
	.asciz	"word4"

l___unnamed_22:                         ; @21
	.asciz	"word5"

l___unnamed_23:                         ; @22
	.asciz	"word6"

l___unnamed_24:                         ; @23
	.asciz	"word7"

l___unnamed_25:                         ; @24
	.asciz	"word8"

l___unnamed_26:                         ; @25
	.asciz	"word9"

l___unnamed_27:                         ; @26
	.asciz	"word10"

l___unnamed_28:                         ; @27
	.asciz	"word11"

l___unnamed_29:                         ; @28
	.asciz	"word12"

l___unnamed_30:                         ; @29
	.asciz	"word13"

l___unnamed_31:                         ; @30
	.asciz	"word14"

l___unnamed_32:                         ; @31
	.asciz	"word15"

l___unnamed_33:                         ; @32
	.asciz	"word16"

l___unnamed_34:                         ; @33
	.asciz	"word17"

l___unnamed_35:                         ; @34
	.asciz	"word18"

	.private_extern	"_symbolic _____ s5UInt8V" ; @"symbolic _____ s5UInt8V"
	.section	__TEXT,__swift5_typeref
	.globl	"_symbolic _____ s5UInt8V"
	.weak_definition	"_symbolic _____ s5UInt8V"
	.p2align	1, 0x0
"_symbolic _____ s5UInt8V":
	.byte	2                               ; 0x2
Ltmp6:
	.long	_$ss5UInt8VMn@GOT-Ltmp6
	.byte	0                               ; 0x0

	.section	__TEXT,__swift5_reflstr
l___unnamed_36:                         ; @35
	.asciz	"byte0"

l___unnamed_37:                         ; @36
	.asciz	"byte1"

l___unnamed_38:                         ; @37
	.asciz	"byte2"

l___unnamed_39:                         ; @38
	.asciz	"nibble"

	.section	__TEXT,__swift5_fieldmd
	.p2align	2, 0x0                          ; @"$s16ReaArcProjection11WidePayloadVMF"
_$s16ReaArcProjection11WidePayloadVMF:
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection11WidePayloadVMF
	.long	0                               ; 0x0
	.short	0                               ; 0x0
	.short	12                              ; 0xc
	.long	23                              ; 0x17
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-20
	.long	l___unnamed_17-_$s16ReaArcProjection11WidePayloadVMF-24
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-32
	.long	l___unnamed_18-_$s16ReaArcProjection11WidePayloadVMF-36
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-44
	.long	l___unnamed_19-_$s16ReaArcProjection11WidePayloadVMF-48
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-56
	.long	l___unnamed_20-_$s16ReaArcProjection11WidePayloadVMF-60
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-68
	.long	l___unnamed_21-_$s16ReaArcProjection11WidePayloadVMF-72
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-80
	.long	l___unnamed_22-_$s16ReaArcProjection11WidePayloadVMF-84
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-92
	.long	l___unnamed_23-_$s16ReaArcProjection11WidePayloadVMF-96
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-104
	.long	l___unnamed_24-_$s16ReaArcProjection11WidePayloadVMF-108
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-116
	.long	l___unnamed_25-_$s16ReaArcProjection11WidePayloadVMF-120
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-128
	.long	l___unnamed_26-_$s16ReaArcProjection11WidePayloadVMF-132
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-140
	.long	l___unnamed_27-_$s16ReaArcProjection11WidePayloadVMF-144
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-152
	.long	l___unnamed_28-_$s16ReaArcProjection11WidePayloadVMF-156
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-164
	.long	l___unnamed_29-_$s16ReaArcProjection11WidePayloadVMF-168
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-176
	.long	l___unnamed_30-_$s16ReaArcProjection11WidePayloadVMF-180
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-188
	.long	l___unnamed_31-_$s16ReaArcProjection11WidePayloadVMF-192
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-200
	.long	l___unnamed_32-_$s16ReaArcProjection11WidePayloadVMF-204
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-212
	.long	l___unnamed_33-_$s16ReaArcProjection11WidePayloadVMF-216
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-224
	.long	l___unnamed_34-_$s16ReaArcProjection11WidePayloadVMF-228
	.long	2                               ; 0x2
	.long	"_symbolic _____ s6UInt64V"-_$s16ReaArcProjection11WidePayloadVMF-236
	.long	l___unnamed_35-_$s16ReaArcProjection11WidePayloadVMF-240
	.long	2                               ; 0x2
	.long	"_symbolic _____ s5UInt8V"-_$s16ReaArcProjection11WidePayloadVMF-248
	.long	l___unnamed_36-_$s16ReaArcProjection11WidePayloadVMF-252
	.long	2                               ; 0x2
	.long	"_symbolic _____ s5UInt8V"-_$s16ReaArcProjection11WidePayloadVMF-260
	.long	l___unnamed_37-_$s16ReaArcProjection11WidePayloadVMF-264
	.long	2                               ; 0x2
	.long	"_symbolic _____ s5UInt8V"-_$s16ReaArcProjection11WidePayloadVMF-272
	.long	l___unnamed_38-_$s16ReaArcProjection11WidePayloadVMF-276
	.long	2                               ; 0x2
	.long	"_symbolic _____ 16ReaArcProjection6NibbleO"-_$s16ReaArcProjection11WidePayloadVMF-284
	.long	l___unnamed_39-_$s16ReaArcProjection11WidePayloadVMF-288

	.section	__DATA,__const
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection10FixedChildOWV"
_$s16ReaArcProjection10FixedChildOWV:
	.quad	_$s16ReaArcProjection10FixedChildOwCP
	.quad	___swift_noop_void_return
	.quad	___swift_memcpy156_8
	.quad	___swift_memcpy156_8
	.quad	___swift_memcpy156_8
	.quad	___swift_memcpy156_8
	.quad	_$s16ReaArcProjection10FixedChildOwet
	.quad	_$s16ReaArcProjection10FixedChildOwst
	.quad	156                             ; 0x9c
	.quad	160                             ; 0xa0
	.long	2228231                         ; 0x220007
	.long	4                               ; 0x4
	.quad	_$s16ReaArcProjection10FixedChildOwug
	.quad	_$s16ReaArcProjection10FixedChildOwup
	.quad	_$s16ReaArcProjection10FixedChildOwui

	.section	__TEXT,__const
l_.str.10.FixedChild:                   ; @.str.10.FixedChild
	.asciz	"FixedChild"

	.section	__TEXT,__constg_swiftt
	.globl	_$s16ReaArcProjection10FixedChildOMn ; @"$s16ReaArcProjection10FixedChildOMn"
	.p2align	2, 0x0
_$s16ReaArcProjection10FixedChildOMn:
	.long	82                              ; 0x52
	.long	_$s16ReaArcProjectionMXM-_$s16ReaArcProjection10FixedChildOMn-4
	.long	l_.str.10.FixedChild-_$s16ReaArcProjection10FixedChildOMn-8
	.long	_$s16ReaArcProjection10FixedChildOMa-_$s16ReaArcProjection10FixedChildOMn-12
	.long	_$s16ReaArcProjection10FixedChildOMF-_$s16ReaArcProjection10FixedChildOMn-16
	.long	11                              ; 0xb
	.long	17                              ; 0x11

	.section	__DATA,__const
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection10FixedChildOMf"
_$s16ReaArcProjection10FixedChildOMf:
	.quad	0
	.quad	_$s16ReaArcProjection10FixedChildOWV
	.quad	513                             ; 0x201
	.quad	_$s16ReaArcProjection10FixedChildOMn

	.private_extern	"_symbolic _____ 16ReaArcProjection10FixedChildO" ; @"symbolic _____ 16ReaArcProjection10FixedChildO"
	.section	__TEXT,__swift5_typeref
	.globl	"_symbolic _____ 16ReaArcProjection10FixedChildO"
	.weak_definition	"_symbolic _____ 16ReaArcProjection10FixedChildO"
	.p2align	1, 0x0
"_symbolic _____ 16ReaArcProjection10FixedChildO":
	.byte	1                               ; 0x1
	.long	_$s16ReaArcProjection10FixedChildOMn-"_symbolic _____ 16ReaArcProjection10FixedChildO"-1
	.byte	0                               ; 0x0

	.section	__TEXT,__swift5_builtin
	.p2align	2, 0x0                          ; @"$s16ReaArcProjection10FixedChildOMB"
_$s16ReaArcProjection10FixedChildOMB:
	.long	"_symbolic _____ 16ReaArcProjection10FixedChildO"-_$s16ReaArcProjection10FixedChildOMB
	.long	156                             ; 0x9c
	.long	65544                           ; 0x10008
	.long	160                             ; 0xa0
	.long	4                               ; 0x4

	.section	__TEXT,__swift5_mpenum
	.p2align	2, 0x0                          ; @"\01l__swift5_reflection_descriptor"
l__swift5_reflection_descriptor:
	.long	"_symbolic _____ 16ReaArcProjection10FixedChildO"-l__swift5_reflection_descriptor
	.long	196609                          ; 0x30001
	.long	10158081                        ; 0x9b0001
	.long	240                             ; 0xf0

	.section	__TEXT,__swift5_reflstr
l___unnamed_40:                         ; @39
	.asciz	"payload0"

l___unnamed_41:                         ; @40
	.asciz	"payload1"

l___unnamed_42:                         ; @41
	.asciz	"payload2"

l___unnamed_43:                         ; @42
	.asciz	"payload3"

l___unnamed_44:                         ; @43
	.asciz	"payload4"

l___unnamed_45:                         ; @44
	.asciz	"payload5"

l___unnamed_46:                         ; @45
	.asciz	"payload6"

l___unnamed_47:                         ; @46
	.asciz	"payload7"

l___unnamed_48:                         ; @47
	.asciz	"payload8"

l___unnamed_49:                         ; @48
	.asciz	"payload9"

l___unnamed_50:                         ; @49
	.asciz	"payload10"

l___unnamed_51:                         ; @50
	.asciz	"empty0"

l___unnamed_52:                         ; @51
	.asciz	"empty1"

l___unnamed_53:                         ; @52
	.asciz	"empty2"

l___unnamed_54:                         ; @53
	.asciz	"empty3"

l___unnamed_55:                         ; @54
	.asciz	"empty4"

l___unnamed_56:                         ; @55
	.asciz	"empty5"

l___unnamed_57:                         ; @56
	.asciz	"empty6"

l___unnamed_58:                         ; @57
	.asciz	"empty7"

l___unnamed_59:                         ; @58
	.asciz	"empty8"

l___unnamed_60:                         ; @59
	.asciz	"empty9"

l___unnamed_61:                         ; @60
	.asciz	"empty10"

l___unnamed_62:                         ; @61
	.asciz	"empty11"

l___unnamed_63:                         ; @62
	.asciz	"empty12"

l___unnamed_64:                         ; @63
	.asciz	"empty13"

l___unnamed_65:                         ; @64
	.asciz	"empty14"

l___unnamed_66:                         ; @65
	.asciz	"empty15"

l___unnamed_67:                         ; @66
	.asciz	"empty16"

	.section	__TEXT,__swift5_fieldmd
	.p2align	2, 0x0                          ; @"$s16ReaArcProjection10FixedChildOMF"
_$s16ReaArcProjection10FixedChildOMF:
	.long	"_symbolic _____ 16ReaArcProjection10FixedChildO"-_$s16ReaArcProjection10FixedChildOMF
	.long	0                               ; 0x0
	.short	3                               ; 0x3
	.short	12                              ; 0xc
	.long	28                              ; 0x1c
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-20
	.long	l___unnamed_40-_$s16ReaArcProjection10FixedChildOMF-24
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-32
	.long	l___unnamed_41-_$s16ReaArcProjection10FixedChildOMF-36
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-44
	.long	l___unnamed_42-_$s16ReaArcProjection10FixedChildOMF-48
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-56
	.long	l___unnamed_43-_$s16ReaArcProjection10FixedChildOMF-60
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-68
	.long	l___unnamed_44-_$s16ReaArcProjection10FixedChildOMF-72
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-80
	.long	l___unnamed_45-_$s16ReaArcProjection10FixedChildOMF-84
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-92
	.long	l___unnamed_46-_$s16ReaArcProjection10FixedChildOMF-96
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-104
	.long	l___unnamed_47-_$s16ReaArcProjection10FixedChildOMF-108
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-116
	.long	l___unnamed_48-_$s16ReaArcProjection10FixedChildOMF-120
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-128
	.long	l___unnamed_49-_$s16ReaArcProjection10FixedChildOMF-132
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10FixedChildOMF-140
	.long	l___unnamed_50-_$s16ReaArcProjection10FixedChildOMF-144
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_51-_$s16ReaArcProjection10FixedChildOMF-156
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_52-_$s16ReaArcProjection10FixedChildOMF-168
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_53-_$s16ReaArcProjection10FixedChildOMF-180
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_54-_$s16ReaArcProjection10FixedChildOMF-192
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_55-_$s16ReaArcProjection10FixedChildOMF-204
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_56-_$s16ReaArcProjection10FixedChildOMF-216
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_57-_$s16ReaArcProjection10FixedChildOMF-228
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_58-_$s16ReaArcProjection10FixedChildOMF-240
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_59-_$s16ReaArcProjection10FixedChildOMF-252
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_60-_$s16ReaArcProjection10FixedChildOMF-264
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_61-_$s16ReaArcProjection10FixedChildOMF-276
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_62-_$s16ReaArcProjection10FixedChildOMF-288
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_63-_$s16ReaArcProjection10FixedChildOMF-300
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_64-_$s16ReaArcProjection10FixedChildOMF-312
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_65-_$s16ReaArcProjection10FixedChildOMF-324
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_66-_$s16ReaArcProjection10FixedChildOMF-336
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_67-_$s16ReaArcProjection10FixedChildOMF-348

	.section	__DATA,__data
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection11FixedActionOWV"
_$s16ReaArcProjection11FixedActionOWV:
	.quad	_$s16ReaArcProjection11FixedActionOwCP
	.quad	_$s16ReaArcProjection11FixedActionOwxx
	.quad	_$s16ReaArcProjection11FixedActionOwcp
	.quad	_$s16ReaArcProjection11FixedActionOwca
	.quad	_$s16ReaArcProjection11FixedActionOwtk
	.quad	_$s16ReaArcProjection11FixedActionOwta
	.quad	_$s16ReaArcProjection11FixedActionOwet
	.quad	_$s16ReaArcProjection11FixedActionOwst
	.quad	0                               ; 0x0
	.quad	0                               ; 0x0
	.long	6291456                         ; 0x600000
	.long	0                               ; 0x0
	.quad	_$s16ReaArcProjection11FixedActionOwug
	.quad	_$s16ReaArcProjection11FixedActionOwup
	.quad	_$s16ReaArcProjection11FixedActionOwui

	.section	__TEXT,__const
l_.str.11.FixedAction:                  ; @.str.11.FixedAction
	.asciz	"FixedAction"

.zerofill __DATA,__bss,_$s16ReaArcProjection11FixedActionOMl,16,3 ; @"$s16ReaArcProjection11FixedActionOMl"
	.section	__TEXT,__constg_swiftt
	.globl	_$s16ReaArcProjection11FixedActionOMn ; @"$s16ReaArcProjection11FixedActionOMn"
	.p2align	2, 0x0
_$s16ReaArcProjection11FixedActionOMn:
	.long	65618                           ; 0x10052
	.long	_$s16ReaArcProjectionMXM-_$s16ReaArcProjection11FixedActionOMn-4
	.long	l_.str.11.FixedAction-_$s16ReaArcProjection11FixedActionOMn-8
	.long	_$s16ReaArcProjection11FixedActionOMa-_$s16ReaArcProjection11FixedActionOMn-12
	.long	_$s16ReaArcProjection11FixedActionOMF-_$s16ReaArcProjection11FixedActionOMn-16
	.long	33554435                        ; 0x2000003
	.long	1                               ; 0x1
	.long	_$s16ReaArcProjection11FixedActionOMl-_$s16ReaArcProjection11FixedActionOMn-28
	.long	_$s16ReaArcProjection11FixedActionOMf-_$s16ReaArcProjection11FixedActionOMn-16
	.long	_$s16ReaArcProjection11FixedActionOMr-_$s16ReaArcProjection11FixedActionOMn-36

	.section	__TEXT,__const
	.p2align	3, 0x0                          ; @type_layout_156_8_4_pod
l_type_layout_156_8_4_pod:
	.quad	156                             ; 0x9c
	.quad	160                             ; 0xa0
	.long	2228231                         ; 0x220007
	.long	4                               ; 0x4

	.section	__DATA,__data
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection11FixedActionOMf"
_$s16ReaArcProjection11FixedActionOMf:
	.quad	0
	.quad	_$s16ReaArcProjection11FixedActionOWV
	.quad	513                             ; 0x201
	.quad	_$s16ReaArcProjection11FixedActionOMn
	.quad	0                               ; 0x0

	.private_extern	"_symbolic _____ 16ReaArcProjection11FixedActionO" ; @"symbolic _____ 16ReaArcProjection11FixedActionO"
	.section	__TEXT,__swift5_typeref
	.globl	"_symbolic _____ 16ReaArcProjection11FixedActionO"
	.weak_definition	"_symbolic _____ 16ReaArcProjection11FixedActionO"
	.p2align	1, 0x0
"_symbolic _____ 16ReaArcProjection11FixedActionO":
	.byte	1                               ; 0x1
	.long	_$s16ReaArcProjection11FixedActionOMn-"_symbolic _____ 16ReaArcProjection11FixedActionO"-1
	.byte	0                               ; 0x0

	.private_extern	"_symbolic _____ 19ReaResilientPayload0aC0V" ; @"symbolic _____ 19ReaResilientPayload0aC0V"
	.globl	"_symbolic _____ 19ReaResilientPayload0aC0V"
	.weak_definition	"_symbolic _____ 19ReaResilientPayload0aC0V"
	.p2align	1, 0x0
"_symbolic _____ 19ReaResilientPayload0aC0V":
	.byte	2                               ; 0x2
Ltmp7:
	.long	_$s19ReaResilientPayload0aC0VMn@GOT-Ltmp7
	.byte	0                               ; 0x0

	.section	__TEXT,__swift5_reflstr
l___unnamed_68:                         ; @67
	.asciz	"load"

l___unnamed_69:                         ; @68
	.asciz	"child"

l___unnamed_70:                         ; @69
	.asciz	"select"

l___unnamed_71:                         ; @70
	.asciz	"close"

	.section	__TEXT,__swift5_fieldmd
	.p2align	2, 0x0                          ; @"$s16ReaArcProjection11FixedActionOMF"
_$s16ReaArcProjection11FixedActionOMF:
	.long	"_symbolic _____ 16ReaArcProjection11FixedActionO"-_$s16ReaArcProjection11FixedActionOMF
	.long	0                               ; 0x0
	.short	2                               ; 0x2
	.short	12                              ; 0xc
	.long	4                               ; 0x4
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s16ReaArcProjection11FixedActionOMF-20
	.long	l___unnamed_68-_$s16ReaArcProjection11FixedActionOMF-24
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection10FixedChildO"-_$s16ReaArcProjection11FixedActionOMF-32
	.long	l___unnamed_69-_$s16ReaArcProjection11FixedActionOMF-36
	.long	0                               ; 0x0
	.long	"_symbolic _____ 19ReaResilientPayload0aC0V"-_$s16ReaArcProjection11FixedActionOMF-44
	.long	l___unnamed_70-_$s16ReaArcProjection11FixedActionOMF-48
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_71-_$s16ReaArcProjection11FixedActionOMF-60

	.section	__DATA,__const
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection10OtherChildOWV"
_$s16ReaArcProjection10OtherChildOWV:
	.quad	_$s16ReaArcProjection10OtherChildOwCP
	.quad	___swift_noop_void_return
	.quad	___swift_memcpy156_8
	.quad	___swift_memcpy156_8
	.quad	___swift_memcpy156_8
	.quad	___swift_memcpy156_8
	.quad	_$s16ReaArcProjection10OtherChildOwet
	.quad	_$s16ReaArcProjection10OtherChildOwst
	.quad	156                             ; 0x9c
	.quad	160                             ; 0xa0
	.long	2228231                         ; 0x220007
	.long	4                               ; 0x4
	.quad	_$s16ReaArcProjection10OtherChildOwug
	.quad	_$s16ReaArcProjection10OtherChildOwup
	.quad	_$s16ReaArcProjection10OtherChildOwui

	.section	__TEXT,__const
l_.str.10.OtherChild:                   ; @.str.10.OtherChild
	.asciz	"OtherChild"

	.section	__TEXT,__constg_swiftt
	.globl	_$s16ReaArcProjection10OtherChildOMn ; @"$s16ReaArcProjection10OtherChildOMn"
	.p2align	2, 0x0
_$s16ReaArcProjection10OtherChildOMn:
	.long	82                              ; 0x52
	.long	_$s16ReaArcProjectionMXM-_$s16ReaArcProjection10OtherChildOMn-4
	.long	l_.str.10.OtherChild-_$s16ReaArcProjection10OtherChildOMn-8
	.long	_$s16ReaArcProjection10OtherChildOMa-_$s16ReaArcProjection10OtherChildOMn-12
	.long	_$s16ReaArcProjection10OtherChildOMF-_$s16ReaArcProjection10OtherChildOMn-16
	.long	11                              ; 0xb
	.long	18                              ; 0x12

	.section	__DATA,__const
	.p2align	3, 0x0                          ; @"$s16ReaArcProjection10OtherChildOMf"
_$s16ReaArcProjection10OtherChildOMf:
	.quad	0
	.quad	_$s16ReaArcProjection10OtherChildOWV
	.quad	513                             ; 0x201
	.quad	_$s16ReaArcProjection10OtherChildOMn

	.private_extern	"_symbolic _____ 16ReaArcProjection10OtherChildO" ; @"symbolic _____ 16ReaArcProjection10OtherChildO"
	.section	__TEXT,__swift5_typeref
	.globl	"_symbolic _____ 16ReaArcProjection10OtherChildO"
	.weak_definition	"_symbolic _____ 16ReaArcProjection10OtherChildO"
	.p2align	1, 0x0
"_symbolic _____ 16ReaArcProjection10OtherChildO":
	.byte	1                               ; 0x1
	.long	_$s16ReaArcProjection10OtherChildOMn-"_symbolic _____ 16ReaArcProjection10OtherChildO"-1
	.byte	0                               ; 0x0

	.section	__TEXT,__swift5_builtin
	.p2align	2, 0x0                          ; @"$s16ReaArcProjection10OtherChildOMB"
_$s16ReaArcProjection10OtherChildOMB:
	.long	"_symbolic _____ 16ReaArcProjection10OtherChildO"-_$s16ReaArcProjection10OtherChildOMB
	.long	156                             ; 0x9c
	.long	65544                           ; 0x10008
	.long	160                             ; 0xa0
	.long	4                               ; 0x4

	.section	__TEXT,__swift5_mpenum
	.p2align	2, 0x0                          ; @"\01l__swift5_reflection_descriptor.1"
l__swift5_reflection_descriptor.1:
	.long	"_symbolic _____ 16ReaArcProjection10OtherChildO"-l__swift5_reflection_descriptor.1
	.long	196609                          ; 0x30001
	.long	10158081                        ; 0x9b0001
	.long	240                             ; 0xf0

	.section	__TEXT,__swift5_reflstr
l___unnamed_72:                         ; @71
	.asciz	"empty17"

	.section	__TEXT,__swift5_fieldmd
	.p2align	2, 0x0                          ; @"$s16ReaArcProjection10OtherChildOMF"
_$s16ReaArcProjection10OtherChildOMF:
	.long	"_symbolic _____ 16ReaArcProjection10OtherChildO"-_$s16ReaArcProjection10OtherChildOMF
	.long	0                               ; 0x0
	.short	3                               ; 0x3
	.short	12                              ; 0xc
	.long	29                              ; 0x1d
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-20
	.long	l___unnamed_40-_$s16ReaArcProjection10OtherChildOMF-24
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-32
	.long	l___unnamed_41-_$s16ReaArcProjection10OtherChildOMF-36
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-44
	.long	l___unnamed_42-_$s16ReaArcProjection10OtherChildOMF-48
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-56
	.long	l___unnamed_43-_$s16ReaArcProjection10OtherChildOMF-60
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-68
	.long	l___unnamed_44-_$s16ReaArcProjection10OtherChildOMF-72
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-80
	.long	l___unnamed_45-_$s16ReaArcProjection10OtherChildOMF-84
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-92
	.long	l___unnamed_46-_$s16ReaArcProjection10OtherChildOMF-96
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-104
	.long	l___unnamed_47-_$s16ReaArcProjection10OtherChildOMF-108
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-116
	.long	l___unnamed_48-_$s16ReaArcProjection10OtherChildOMF-120
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-128
	.long	l___unnamed_49-_$s16ReaArcProjection10OtherChildOMF-132
	.long	0                               ; 0x0
	.long	"_symbolic _____ 16ReaArcProjection11WidePayloadV"-_$s16ReaArcProjection10OtherChildOMF-140
	.long	l___unnamed_50-_$s16ReaArcProjection10OtherChildOMF-144
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_51-_$s16ReaArcProjection10OtherChildOMF-156
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_52-_$s16ReaArcProjection10OtherChildOMF-168
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_53-_$s16ReaArcProjection10OtherChildOMF-180
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_54-_$s16ReaArcProjection10OtherChildOMF-192
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_55-_$s16ReaArcProjection10OtherChildOMF-204
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_56-_$s16ReaArcProjection10OtherChildOMF-216
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_57-_$s16ReaArcProjection10OtherChildOMF-228
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_58-_$s16ReaArcProjection10OtherChildOMF-240
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_59-_$s16ReaArcProjection10OtherChildOMF-252
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_60-_$s16ReaArcProjection10OtherChildOMF-264
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_61-_$s16ReaArcProjection10OtherChildOMF-276
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_62-_$s16ReaArcProjection10OtherChildOMF-288
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_63-_$s16ReaArcProjection10OtherChildOMF-300
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_64-_$s16ReaArcProjection10OtherChildOMF-312
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_65-_$s16ReaArcProjection10OtherChildOMF-324
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_66-_$s16ReaArcProjection10OtherChildOMF-336
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_67-_$s16ReaArcProjection10OtherChildOMF-348
	.long	0                               ; 0x0
	.long	0                               ; 0x0
	.long	l___unnamed_72-_$s16ReaArcProjection10OtherChildOMF-360

	.section	__TEXT,__swift5_proto
	.p2align	2, 0x0                          ; @"$s16ReaArcProjection6NibbleOSQAAHc"
l_$s16ReaArcProjection6NibbleOSQAAHc:
	.long	_$s16ReaArcProjection6NibbleOSQAAMc-l_$s16ReaArcProjection6NibbleOSQAAHc

	.p2align	2, 0x0                          ; @"$s16ReaArcProjection6NibbleOSHAAHc"
l_$s16ReaArcProjection6NibbleOSHAAHc:
	.long	_$s16ReaArcProjection6NibbleOSHAAMc-l_$s16ReaArcProjection6NibbleOSHAAHc

	.section	__TEXT,__swift5_types
	.p2align	2, 0x0                          ; @"$s16ReaArcProjection6NibbleOHn"
l_$s16ReaArcProjection6NibbleOHn:
	.long	_$s16ReaArcProjection6NibbleOMn-l_$s16ReaArcProjection6NibbleOHn

	.p2align	2, 0x0                          ; @"$s16ReaArcProjection11WidePayloadVHn"
l_$s16ReaArcProjection11WidePayloadVHn:
	.long	_$s16ReaArcProjection11WidePayloadVMn-l_$s16ReaArcProjection11WidePayloadVHn

	.p2align	2, 0x0                          ; @"$s16ReaArcProjection10FixedChildOHn"
l_$s16ReaArcProjection10FixedChildOHn:
	.long	_$s16ReaArcProjection10FixedChildOMn-l_$s16ReaArcProjection10FixedChildOHn

	.p2align	2, 0x0                          ; @"$s16ReaArcProjection11FixedActionOHn"
l_$s16ReaArcProjection11FixedActionOHn:
	.long	_$s16ReaArcProjection11FixedActionOMn-l_$s16ReaArcProjection11FixedActionOHn

	.p2align	2, 0x0                          ; @"$s16ReaArcProjection10OtherChildOHn"
l_$s16ReaArcProjection10OtherChildOHn:
	.long	_$s16ReaArcProjection10OtherChildOMn-l_$s16ReaArcProjection10OtherChildOHn

	.private_extern	___swift_reflection_version ; @__swift_reflection_version
	.section	__TEXT,__const
	.globl	___swift_reflection_version
	.weak_definition	___swift_reflection_version
	.p2align	1, 0x0
___swift_reflection_version:
	.short	3                               ; 0x3

	.no_dead_strip	_$s16ReaArcProjection6NibbleO21__derived_enum_equalsySbAC_ACtFZ
	.no_dead_strip	_$s16ReaArcProjection6NibbleO4hash4intoys6HasherVz_tF
	.no_dead_strip	_$s16ReaArcProjection6NibbleO9hashValueSivg
	.no_dead_strip	_$s16ReaArcProjection6NibbleO9hashValueSivg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word0s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word1s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word2s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word3s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word4s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word5s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word6s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word7s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word8s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word9s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word10s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word11s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word12s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word13s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word14s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word15s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word16s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word17s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word18s6UInt64Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8Vvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvM
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvg
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvs
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvM
	.no_dead_strip	_$s16ReaArcProjection23arcSecondArgumentReduceyS2i_AA11FixedActionOtF
	.no_dead_strip	_$s16ReaArcProjection23arcSecondArgumentReduceyS2i_AA11FixedActionOtF
	.no_dead_strip	_$s16ReaArcProjection9otherLastySbAA10OtherChildOF
	.no_dead_strip	_$s16ReaArcProjection9otherLastySbAA10OtherChildOF
	.no_dead_strip	_$s16ReaArcProjection6NibbleOSQAAMc
	.no_dead_strip	_$s16ReaArcProjection6NibbleOSHAAMc
	.no_dead_strip	_$s16ReaArcProjection6NibbleOSHAAMc
	.no_dead_strip	_$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.no_dead_strip	_$s16ReaArcProjection6NibbleOMn
	.no_dead_strip	_$s16ReaArcProjection6NibbleOMn
	.no_dead_strip	_$s16ReaArcProjection6NibbleOMa
	.no_dead_strip	_$s16ReaArcProjection6NibbleON
	.no_dead_strip	_$s16ReaArcProjection6NibbleOMF
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadVMn
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadVMa
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadVN
	.no_dead_strip	_$s16ReaArcProjection11WidePayloadVMF
	.no_dead_strip	_$s16ReaArcProjection10FixedChildOMn
	.no_dead_strip	_$s16ReaArcProjection10FixedChildOMa
	.no_dead_strip	_$s16ReaArcProjection10FixedChildON
	.no_dead_strip	_$s16ReaArcProjection10FixedChildOMB
	.no_dead_strip	l__swift5_reflection_descriptor
	.no_dead_strip	_$s16ReaArcProjection10FixedChildOMF
	.no_dead_strip	_$s16ReaArcProjection11FixedActionOMn
	.no_dead_strip	_$s16ReaArcProjection11FixedActionOMa
	.no_dead_strip	_$s16ReaArcProjection11FixedActionON
	.no_dead_strip	_$s16ReaArcProjection11FixedActionOMF
	.no_dead_strip	_$s16ReaArcProjection10OtherChildOMn
	.no_dead_strip	_$s16ReaArcProjection10OtherChildOMa
	.no_dead_strip	_$s16ReaArcProjection10OtherChildON
	.no_dead_strip	_$s16ReaArcProjection10OtherChildOMB
	.no_dead_strip	l__swift5_reflection_descriptor.1
	.no_dead_strip	_$s16ReaArcProjection10OtherChildOMF
	.no_dead_strip	l_$s16ReaArcProjection6NibbleOSQAAHc
	.no_dead_strip	l_$s16ReaArcProjection6NibbleOSHAAHc
	.no_dead_strip	l_$s16ReaArcProjection6NibbleOHn
	.no_dead_strip	l_$s16ReaArcProjection11WidePayloadVHn
	.no_dead_strip	l_$s16ReaArcProjection10FixedChildOHn
	.no_dead_strip	l_$s16ReaArcProjection11FixedActionOHn
	.no_dead_strip	l_$s16ReaArcProjection10OtherChildOHn
	.no_dead_strip	___swift_reflection_version
	.section	__DATA,__const
	.p2align	3, 0x0                          ; @"got.$sSQMp"
l_got.$sSQMp:
	.quad	_$sSQMp

	.p2align	3, 0x0                          ; @"got.$sSQ2eeoiySbx_xtFZTq"
l_got.$sSQ2eeoiySbx_xtFZTq:
	.quad	_$sSQ2eeoiySbx_xtFZTq

	.p2align	3, 0x0                          ; @"got.$sSHMp"
l_got.$sSHMp:
	.quad	_$sSHMp

	.p2align	3, 0x0                          ; @"got.$sSHSQTb"
l_got.$sSHSQTb:
	.quad	_$sSHSQTb

	.p2align	3, 0x0                          ; @"got.$sSH9hashValueSivgTq"
l_got.$sSH9hashValueSivgTq:
	.quad	_$sSH9hashValueSivgTq

	.p2align	3, 0x0                          ; @"got.$sSH4hash4intoys6HasherVz_tFTq"
l_got.$sSH4hash4intoys6HasherVz_tFTq:
	.quad	_$sSH4hash4intoys6HasherVz_tFTq

	.p2align	3, 0x0                          ; @"got.$sSH13_rawHashValue4seedS2i_tFTq"
l_got.$sSH13_rawHashValue4seedS2i_tFTq:
	.quad	_$sSH13_rawHashValue4seedS2i_tFTq

	.linker_option "-lswiftCore"
	.linker_option "-lswift_StringProcessing"
	.linker_option "-lswift_Concurrency"
	.linker_option "-lswiftSwiftOnoneSupport"
	.linker_option "-lobjc"
	.section	__DATA,__objc_imageinfo,regular,no_dead_strip
L_OBJC_IMAGE_INFO:
	.long	0
	.long	100861760

	.globl	_$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word0s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word1s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word2s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word3s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word4s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word5s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word6s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word7s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word8s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV5word9s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV6word10s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV6word11s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV6word12s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV6word13s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV6word14s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV6word15s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV6word16s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV6word17s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvpMV
_$s16ReaArcProjection11WidePayloadV6word18s6UInt64VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvpMV
_$s16ReaArcProjection11WidePayloadV5byte0s5UInt8VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvpMV
_$s16ReaArcProjection11WidePayloadV5byte1s5UInt8VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvpMV
_$s16ReaArcProjection11WidePayloadV5byte2s5UInt8VvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvpMV
_$s16ReaArcProjection11WidePayloadV6nibbleAA6NibbleOvpMV = _$s16ReaArcProjection6NibbleO9hashValueSivpMV
	.globl	_$s16ReaArcProjection6NibbleON
	.alt_entry	_$s16ReaArcProjection6NibbleON
_$s16ReaArcProjection6NibbleON = _$s16ReaArcProjection6NibbleOMf+16
	.globl	_$s16ReaArcProjection11WidePayloadVN
	.alt_entry	_$s16ReaArcProjection11WidePayloadVN
_$s16ReaArcProjection11WidePayloadVN = _$s16ReaArcProjection11WidePayloadVMf+16
	.globl	_$s16ReaArcProjection10FixedChildON
	.alt_entry	_$s16ReaArcProjection10FixedChildON
_$s16ReaArcProjection10FixedChildON = _$s16ReaArcProjection10FixedChildOMf+16
	.globl	_$s16ReaArcProjection11FixedActionON
	.alt_entry	_$s16ReaArcProjection11FixedActionON
_$s16ReaArcProjection11FixedActionON = _$s16ReaArcProjection11FixedActionOMf+16
	.globl	_$s16ReaArcProjection10OtherChildON
	.alt_entry	_$s16ReaArcProjection10OtherChildON
_$s16ReaArcProjection10OtherChildON = _$s16ReaArcProjection10OtherChildOMf+16
.subsections_via_symbols
