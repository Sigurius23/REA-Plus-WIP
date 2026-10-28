.class public Lu93/m0;
.super Lu93/x0;
.source "SourceFile"

# interfaces
.implements Lr93/n0;


# instance fields
.field public final G:Z

.field public H:Lkb3/h;

.field public I:Lc93/a;

.field public final J:Lr93/a0;

.field public K:Lr93/r;

.field public L:Ljava/util/Collection;

.field public final M:Lr93/n0;

.field public final N:I

.field public final O:Z

.field public final P:Z

.field public final Q:Z

.field public final R:Z

.field public final S:Z

.field public T:Ljava/util/List;

.field public U:Lr93/q0;

.field public V:Lr93/q0;

.field public W:Ljava/util/ArrayList;

.field public X:Lu93/n0;

.field public Y:Lr93/p0;

.field public Z:Lu93/v;

.field public a0:Lu93/v;


# direct methods
.method public constructor <init>(Lr93/k;Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;ILr93/s0;ZZZZZ)V
    .locals 8

    move/from16 v0, p8

    const/4 v1, 0x0

    if-eqz p1, :cond_7

    if-eqz p3, :cond_6

    if-eqz p4, :cond_5

    if-eqz p5, :cond_4

    if-eqz p7, :cond_3

    if-eqz v0, :cond_2

    if-eqz p9, :cond_1

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p7

    move-object/from16 v7, p9

    invoke-direct/range {v2 .. v7}, Lu93/x0;-><init>(Lr93/k;Ls93/i;Lva3/h;Llb3/y;Lr93/s0;)V

    iput-boolean p6, p0, Lu93/m0;->G:Z

    iput-object v1, p0, Lu93/m0;->L:Ljava/util/Collection;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lu93/m0;->T:Ljava/util/List;

    iput-object p4, p0, Lu93/m0;->J:Lr93/a0;

    iput-object p5, p0, Lu93/m0;->K:Lr93/r;

    if-nez p2, :cond_0

    move-object p2, p0

    :cond_0
    iput-object p2, p0, Lu93/m0;->M:Lr93/n0;

    iput v0, p0, Lu93/m0;->N:I

    move/from16 p1, p10

    iput-boolean p1, p0, Lu93/m0;->O:Z

    move/from16 p1, p11

    iput-boolean p1, p0, Lu93/m0;->P:Z

    move/from16 p1, p12

    iput-boolean p1, p0, Lu93/m0;->Q:Z

    move/from16 p1, p13

    iput-boolean p1, p0, Lu93/m0;->R:Z

    move/from16 p1, p14

    iput-boolean p1, p0, Lu93/m0;->S:Z

    return-void

    :cond_1
    const/4 p1, 0x6

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v1

    :cond_2
    const/4 p1, 0x5

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v1

    :cond_3
    const/4 p1, 0x4

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v1

    :cond_4
    const/4 p1, 0x3

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v1

    :cond_5
    const/4 p1, 0x2

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v1

    :cond_6
    const/4 p1, 0x1

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v1

    :cond_7
    const/4 p1, 0x0

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v1
.end method

.method public static K0(Lr93/k;Lr93/a0;Lr93/r;ZLva3/h;ILr93/s0;)Lu93/m0;
    .locals 16

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    if-eqz p2, :cond_3

    if-eqz p4, :cond_2

    if-eqz p5, :cond_1

    if-eqz p6, :cond_0

    new-instance v1, Lu93/m0;

    const/4 v3, 0x0

    sget-object v4, Ls93/g;->a:Ls93/f;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v2, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move/from16 v9, p5

    move-object/from16 v10, p6

    invoke-direct/range {v1 .. v15}, Lu93/m0;-><init>(Lr93/k;Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;ILr93/s0;ZZZZZ)V

    return-object v1

    :cond_0
    const/16 v1, 0xd

    invoke-static {v1}, Lu93/m0;->r0(I)V

    throw v0

    :cond_1
    const/16 v1, 0xc

    invoke-static {v1}, Lu93/m0;->r0(I)V

    throw v0

    :cond_2
    const/16 v1, 0xb

    invoke-static {v1}, Lu93/m0;->r0(I)V

    throw v0

    :cond_3
    const/16 v1, 0xa

    invoke-static {v1}, Lu93/m0;->r0(I)V

    throw v0

    :cond_4
    const/4 v1, 0x7

    invoke-static {v1}, Lu93/m0;->r0(I)V

    throw v0
.end method

.method public static M0(Llb3/a1;Lr93/m0;)Lr93/w;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    check-cast p1, Lu93/k0;

    iget-object p1, p1, Lu93/k0;->M:Lr93/w;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Lr93/w;->d(Llb3/a1;)Lr93/w;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0

    :cond_1
    const/16 p0, 0x1f

    invoke-static {p0}, Lu93/m0;->r0(I)V

    throw v0
.end method

.method public static synthetic r0(I)V
    .locals 11

    const/16 v0, 0x2a

    const/16 v1, 0x29

    const/16 v2, 0x27

    const/16 v3, 0x26

    const/16 v4, 0x1c

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const-string v5, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v5, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v6, 0x2

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_1

    const/4 v7, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v7, v6

    :goto_1
    new-array v7, v7, [Ljava/lang/Object;

    const-string v8, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl"

    const/4 v9, 0x0

    packed-switch p0, :pswitch_data_2

    :pswitch_2
    const-string v10, "containingDeclaration"

    aput-object v10, v7, v9

    goto/16 :goto_2

    :pswitch_3
    const-string v10, "overriddenDescriptors"

    aput-object v10, v7, v9

    goto/16 :goto_2

    :pswitch_4
    const-string v10, "newName"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_5
    const-string v10, "newVisibility"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_6
    const-string v10, "newModality"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_7
    const-string v10, "newOwner"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_8
    const-string v10, "accessorDescriptor"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_9
    const-string v10, "substitutor"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_a
    const-string v10, "copyConfiguration"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_b
    const-string v10, "originalSubstitutor"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_c
    aput-object v8, v7, v9

    goto :goto_2

    :pswitch_d
    const-string v10, "contextReceiverParameters"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_e
    const-string v10, "typeParameters"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_f
    const-string v10, "outType"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_10
    const-string v10, "inType"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_11
    const-string v10, "source"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_12
    const-string v10, "kind"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_13
    const-string v10, "name"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_14
    const-string v10, "visibility"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_15
    const-string v10, "modality"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_16
    const-string v10, "annotations"

    aput-object v10, v7, v9

    :goto_2
    const/4 v9, 0x1

    if-eq p0, v4, :cond_6

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_3

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_17
    const-string v8, "getAccessors"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_18
    const-string v8, "getVisibility"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_19
    const-string v8, "getModality"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_1a
    const-string v8, "getReturnType"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_1b
    const-string v8, "getContextReceiverParameters"

    aput-object v8, v7, v9

    goto :goto_3

    :pswitch_1c
    const-string v8, "getTypeParameters"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_2
    const-string v8, "copy"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_3
    const-string v8, "getOverriddenDescriptors"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_4
    const-string v8, "getKind"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_5
    const-string v8, "getOriginal"

    aput-object v8, v7, v9

    goto :goto_3

    :cond_6
    const-string v8, "getSourceToUseForCopy"

    aput-object v8, v7, v9

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v8, "<init>"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_1d
    const-string v8, "setOverriddenDescriptors"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_1e
    const-string v8, "createSubstitutedCopy"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_1f
    const-string v8, "getSubstitutedInitialSignatureDescriptor"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_20
    const-string v8, "doSubstitute"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_21
    const-string v8, "substitute"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_22
    const-string v8, "setVisibility"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_23
    const-string v8, "setType"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_24
    const-string v8, "setInType"

    aput-object v8, v7, v6

    goto :goto_4

    :pswitch_25
    const-string v8, "create"

    aput-object v8, v7, v6

    :goto_4
    :pswitch_26
    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    if-eq p0, v4, :cond_7

    if-eq p0, v3, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    :pswitch_27
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_2
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_14
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_12
        :pswitch_4
        :pswitch_11
        :pswitch_c
        :pswitch_c
        :pswitch_3
        :pswitch_c
        :pswitch_c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x15
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x7
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_22
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_21
        :pswitch_26
        :pswitch_20
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_26
        :pswitch_26
        :pswitch_1d
        :pswitch_26
        :pswitch_26
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x15
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
    .end packed-switch
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget-boolean v0, p0, Lu93/m0;->G:Z

    return v0
.end method

.method public final B()Lr93/q0;
    .locals 1

    iget-object v0, p0, Lu93/m0;->V:Lr93/q0;

    return-object v0
.end method

.method public final C()Lu93/v;
    .locals 1

    iget-object v0, p0, Lu93/m0;->a0:Lu93/v;

    return-object v0
.end method

.method public final bridge synthetic I0()Lr93/l;
    .locals 1

    invoke-virtual {p0}, Lu93/m0;->a()Lr93/n0;

    move-result-object v0

    return-object v0
.end method

.method public final J0(Lr93/k;Lr93/a0;Lr93/r;)Lu93/m0;
    .locals 1

    new-instance v0, Lu93/l0;

    invoke-direct {v0, p0}, Lu93/l0;-><init>(Lu93/m0;)V

    invoke-virtual {v0, p1}, Lu93/l0;->g(Lr93/k;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lu93/l0;->f(Lr93/n0;)V

    invoke-virtual {v0, p2}, Lu93/l0;->e(Lr93/a0;)V

    invoke-virtual {v0, p3}, Lu93/l0;->i(Lr93/r;)V

    invoke-virtual {v0}, Lu93/l0;->d()V

    invoke-virtual {v0}, Lu93/l0;->c()V

    invoke-virtual {v0}, Lu93/l0;->b()Lu93/m0;

    move-result-object p2

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    const/16 p2, 0x2a

    invoke-static {p2}, Lu93/m0;->r0(I)V

    throw p1
.end method

.method public final L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public L0(Lr93/k;Lr93/a0;Lr93/r;Lr93/n0;ILva3/h;)Lu93/m0;
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    if-eqz p5, :cond_1

    if-eqz p6, :cond_0

    new-instance v2, Lu93/m0;

    invoke-virtual {v0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v5

    invoke-virtual {v0}, Lu93/m0;->isConst()Z

    move-result v13

    invoke-virtual {v0}, Lu93/m0;->isExternal()Z

    move-result v15

    iget-boolean v1, v0, Lu93/m0;->S:Z

    iget-boolean v8, v0, Lu93/m0;->G:Z

    sget-object v11, Lr93/s0;->q:Lr93/v0;

    iget-boolean v12, v0, Lu93/m0;->O:Z

    iget-boolean v14, v0, Lu93/m0;->Q:Z

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v4, p4

    move/from16 v10, p5

    move-object/from16 v9, p6

    move/from16 v16, v1

    invoke-direct/range {v2 .. v16}, Lu93/m0;-><init>(Lr93/k;Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;ILr93/s0;ZZZZZ)V

    return-object v2

    :cond_0
    const/16 v2, 0x24

    invoke-static {v2}, Lu93/m0;->r0(I)V

    throw v1

    :cond_1
    const/16 v2, 0x23

    invoke-static {v2}, Lu93/m0;->r0(I)V

    throw v1

    :cond_2
    const/16 v2, 0x22

    invoke-static {v2}, Lu93/m0;->r0(I)V

    throw v1

    :cond_3
    const/16 v2, 0x21

    invoke-static {v2}, Lu93/m0;->r0(I)V

    throw v1

    :cond_4
    const/16 v2, 0x20

    invoke-static {v2}, Lu93/m0;->r0(I)V

    throw v1
.end method

.method public final N0(Lu93/n0;Lu93/o0;Lu93/v;Lu93/v;)V
    .locals 0

    iput-object p1, p0, Lu93/m0;->X:Lu93/n0;

    iput-object p2, p0, Lu93/m0;->Y:Lr93/p0;

    iput-object p3, p0, Lu93/m0;->Z:Lu93/v;

    iput-object p4, p0, Lu93/m0;->a0:Lu93/v;

    return-void
.end method

.method public final O0(Lkb3/h;Lc93/a;)V
    .locals 3

    if-eqz p2, :cond_1

    iput-object p2, p0, Lu93/m0;->I:Lc93/a;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkb3/h;

    :goto_0
    iput-object p1, p0, Lu93/m0;->H:Lkb3/h;

    return-void

    :cond_1
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "compileTimeInitializerFactory"

    aput-object v2, p1, v0

    const-string v0, "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl"

    aput-object v0, p1, v1

    const-string v0, "setCompileTimeInitializer"

    aput-object v0, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public P0(Llb3/y;)V
    .locals 0

    return-void
.end method

.method public final Q0(Llb3/y;Ljava/util/List;Lr93/q0;Lu93/p0;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p5, :cond_0

    iput-object p1, p0, Lu93/x0;->F:Llb3/y;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lu93/m0;->W:Ljava/util/ArrayList;

    iput-object p4, p0, Lu93/m0;->V:Lr93/q0;

    iput-object p3, p0, Lu93/m0;->U:Lr93/q0;

    iput-object p5, p0, Lu93/m0;->T:Ljava/util/List;

    return-void

    :cond_0
    const/16 p1, 0x13

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v0

    :cond_1
    const/16 p1, 0x12

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v0

    :cond_2
    const/16 p1, 0x11

    invoke-static {p1}, Lu93/m0;->r0(I)V

    throw v0
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitPropertyDescriptor(Lr93/n0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final U()Z
    .locals 1

    iget-boolean v0, p0, Lu93/m0;->Q:Z

    return v0
.end method

.method public final W()Lab3/g;
    .locals 1

    iget-object v0, p0, Lu93/m0;->H:Lkb3/h;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lab3/g;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu93/m0;->a()Lr93/n0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/c;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lu93/m0;->a()Lr93/n0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/k;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lu93/m0;->a()Lr93/n0;

    move-result-object v0

    return-object v0
.end method

.method public final a()Lr93/n0;
    .locals 1

    .line 4
    iget-object v0, p0, Lu93/m0;->M:Lr93/n0;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lr93/n0;->a()Lr93/n0;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/16 v0, 0x26

    invoke-static {v0}, Lu93/m0;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final bridge synthetic a0(Lr93/e;Lr93/a0;Lr93/o;)Lr93/c;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lu93/m0;->J0(Lr93/k;Lr93/a0;Lr93/r;)Lu93/m0;

    move-result-object p1

    return-object p1
.end method

.method public final b0()Lu93/v;
    .locals 1

    iget-object v0, p0, Lu93/m0;->Z:Lu93/v;

    return-object v0
.end method

.method public final c0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu93/m0;->T:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x16

    invoke-static {v0}, Lu93/m0;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final bridge synthetic d(Llb3/a1;)Lr93/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lu93/m0;->d(Llb3/a1;)Lr93/n0;

    move-result-object p1

    return-object p1
.end method

.method public final d(Llb3/a1;)Lr93/n0;
    .locals 1

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p1, Llb3/a1;->a:Llb3/y0;

    .line 3
    invoke-virtual {v0}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 4
    :cond_0
    new-instance v0, Lu93/l0;

    invoke-direct {v0, p0}, Lu93/l0;-><init>(Lu93/m0;)V

    .line 5
    invoke-virtual {p1}, Llb3/a1;->f()Llb3/y0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu93/l0;->h(Llb3/y0;)V

    .line 6
    invoke-virtual {p0}, Lu93/m0;->a()Lr93/n0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu93/l0;->f(Lr93/n0;)V

    .line 7
    invoke-virtual {v0}, Lu93/l0;->b()Lu93/m0;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 p1, 0x1b

    .line 8
    invoke-static {p1}, Lu93/m0;->r0(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final d0()Z
    .locals 1

    iget-boolean v0, p0, Lu93/m0;->O:Z

    return v0
.end method

.method public final g0(Ljava/util/Collection;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lu93/m0;->L:Ljava/util/Collection;

    return-void

    :cond_0
    const/16 p1, 0x28

    invoke-static {p1}, Lu93/m0;->r0(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final getGetter()Lu93/n0;
    .locals 1

    iget-object v0, p0, Lu93/m0;->X:Lu93/n0;

    return-object v0
.end method

.method public final getKind()I
    .locals 1

    iget v0, p0, Lu93/m0;->N:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    const/16 v0, 0x27

    invoke-static {v0}, Lu93/m0;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getReturnType()Llb3/y;
    .locals 1

    invoke-virtual {p0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x17

    invoke-static {v0}, Lu93/m0;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getSetter()Lr93/p0;
    .locals 1

    iget-object v0, p0, Lu93/m0;->Y:Lr93/p0;

    return-object v0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lu93/m0;->W:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "typeParameters == null for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 1

    iget-object v0, p0, Lu93/m0;->K:Lr93/r;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x19

    invoke-static {v0}, Lu93/m0;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final h()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lu93/m0;->L:Ljava/util/Collection;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/16 v0, 0x29

    invoke-static {v0}, Lu93/m0;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public h0(Lr93/a;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isConst()Z
    .locals 1

    iget-boolean v0, p0, Lu93/m0;->P:Z

    return v0
.end method

.method public isExternal()Z
    .locals 1

    iget-boolean v0, p0, Lu93/m0;->R:Z

    return v0
.end method

.method public final k()Lr93/a0;
    .locals 1

    iget-object v0, p0, Lu93/m0;->J:Lr93/a0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x18

    invoke-static {v0}, Lu93/m0;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final m()Ljava/util/ArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lu93/m0;->X:Lu93/n0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lu93/m0;->Y:Lr93/p0;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Lu93/m0;->S:Z

    return v0
.end method

.method public final y()Lr93/q0;
    .locals 1

    iget-object v0, p0, Lu93/m0;->U:Lr93/q0;

    return-object v0
.end method
