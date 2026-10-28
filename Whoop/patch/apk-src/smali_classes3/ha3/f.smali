.class public Lha3/f;
.super Lu93/m0;
.source "SourceFile"

# interfaces
.implements Lha3/a;


# instance fields
.field public final b0:Z

.field public final c0:Ll83/k;


# direct methods
.method public constructor <init>(Lr93/k;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;Lr93/s0;Lr93/n0;IZLl83/k;)V
    .locals 15

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    if-eqz p2, :cond_5

    if-eqz p3, :cond_4

    if-eqz p4, :cond_3

    if-eqz p6, :cond_2

    if-eqz p7, :cond_1

    if-eqz p9, :cond_0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p7

    move-object/from16 v2, p8

    move/from16 v8, p9

    invoke-direct/range {v0 .. v14}, Lu93/m0;-><init>(Lr93/k;Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;ILr93/s0;ZZZZZ)V

    move/from16 v0, p10

    iput-boolean v0, p0, Lha3/f;->b0:Z

    move-object/from16 v0, p11

    iput-object v0, p0, Lha3/f;->c0:Ll83/k;

    return-void

    :cond_0
    const/4 v2, 0x6

    invoke-static {v2}, Lha3/f;->r0(I)V

    throw v0

    :cond_1
    const/4 v2, 0x5

    invoke-static {v2}, Lha3/f;->r0(I)V

    throw v0

    :cond_2
    const/4 v2, 0x4

    invoke-static {v2}, Lha3/f;->r0(I)V

    throw v0

    :cond_3
    const/4 v2, 0x3

    invoke-static {v2}, Lha3/f;->r0(I)V

    throw v0

    :cond_4
    const/4 v2, 0x2

    invoke-static {v2}, Lha3/f;->r0(I)V

    throw v0

    :cond_5
    const/4 v2, 0x1

    invoke-static {v2}, Lha3/f;->r0(I)V

    throw v0

    :cond_6
    const/4 v2, 0x0

    invoke-static {v2}, Lha3/f;->r0(I)V

    throw v0
.end method

.method public static R0(Lr93/k;Lia3/c;Lr93/r;ZLva3/h;Lw93/f;Z)Lha3/f;
    .locals 12

    sget-object v3, Lr93/a0;->x:Lr93/a0;

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-eqz p4, :cond_0

    new-instance v0, Lha3/f;

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move/from16 v10, p6

    invoke-direct/range {v0 .. v11}, Lha3/f;-><init>(Lr93/k;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;Lr93/s0;Lr93/n0;IZLl83/k;)V

    return-object v0

    :cond_0
    const/16 p0, 0xb

    invoke-static {p0}, Lha3/f;->r0(I)V

    throw v0

    :cond_1
    const/4 p0, 0x7

    invoke-static {p0}, Lha3/f;->r0(I)V

    throw v0
.end method

.method public static synthetic r0(I)V
    .locals 7

    const/16 v0, 0x15

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v2, 0x2

    if-eq p0, v0, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor"

    const/4 v5, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v6, "containingDeclaration"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_1
    const-string v6, "inType"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_2
    aput-object v4, v3, v5

    goto :goto_2

    :pswitch_3
    const-string v6, "enhancedReturnType"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_4
    const-string v6, "enhancedValueParameterTypes"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_5
    const-string v6, "newName"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_6
    const-string v6, "newVisibility"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_7
    const-string v6, "newModality"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_8
    const-string v6, "newOwner"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_9
    const-string v6, "kind"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_a
    const-string v6, "source"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_b
    const-string v6, "name"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_c
    const-string v6, "visibility"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_d
    const-string v6, "modality"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_e
    const-string v6, "annotations"

    aput-object v6, v3, v5

    :goto_2
    const-string v5, "enhance"

    const/4 v6, 0x1

    if-eq p0, v0, :cond_2

    aput-object v4, v3, v6

    goto :goto_3

    :cond_2
    aput-object v5, v3, v6

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v4, "<init>"

    aput-object v4, v3, v2

    goto :goto_4

    :pswitch_f
    const-string v4, "setInType"

    aput-object v4, v3, v2

    goto :goto_4

    :pswitch_10
    aput-object v5, v3, v2

    goto :goto_4

    :pswitch_11
    const-string v4, "createSubstitutedCopy"

    aput-object v4, v3, v2

    goto :goto_4

    :pswitch_12
    const-string v4, "create"

    aput-object v4, v3, v2

    :goto_4
    :pswitch_13
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_3

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_9
        :pswitch_5
        :pswitch_a
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_10
        :pswitch_13
        :pswitch_f
    .end packed-switch
.end method


# virtual methods
.method public final J(Llb3/y;Ljava/util/ArrayList;Llb3/y;Ll83/k;)Lha3/a;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0}, Lu93/m0;->a()Lr93/n0;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v2, v0, :cond_0

    move-object v12, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lu93/m0;->a()Lr93/n0;

    move-result-object v2

    move-object v12, v2

    :goto_0
    new-instance v14, Lha3/f;

    invoke-virtual {v0}, Lu93/o;->g()Lr93/k;

    move-result-object v5

    invoke-virtual {v0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v6

    invoke-virtual {v0}, Lu93/m0;->k()Lr93/a0;

    move-result-object v7

    invoke-virtual {v0}, Lu93/m0;->getVisibility()Lr93/r;

    move-result-object v8

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v10

    invoke-virtual {v0}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v11

    invoke-virtual {v0}, Lu93/m0;->getKind()I

    move-result v13

    move-object v4, v14

    iget-boolean v14, v0, Lha3/f;->b0:Z

    iget-boolean v9, v0, Lu93/m0;->G:Z

    move-object/from16 v15, p4

    invoke-direct/range {v4 .. v15}, Lha3/f;-><init>(Lr93/k;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;Lr93/s0;Lr93/n0;IZLl83/k;)V

    iget-object v2, v0, Lu93/m0;->X:Lu93/n0;

    if-eqz v2, :cond_2

    new-instance v13, Lu93/n0;

    invoke-virtual {v2}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v15

    invoke-virtual {v2}, Lu93/k0;->k()Lr93/a0;

    move-result-object v16

    invoke-virtual {v2}, Lu93/k0;->getVisibility()Lr93/r;

    move-result-object v17

    iget-boolean v5, v2, Lu93/k0;->F:Z

    iget-boolean v6, v2, Lu93/k0;->G:Z

    iget-boolean v7, v2, Lu93/k0;->J:Z

    invoke-virtual {v0}, Lu93/m0;->getKind()I

    move-result v21

    if-nez v12, :cond_1

    move-object/from16 v22, v3

    goto :goto_1

    :cond_1
    invoke-interface {v12}, Lr93/n0;->getGetter()Lu93/n0;

    move-result-object v8

    move-object/from16 v22, v8

    :goto_1
    invoke-virtual {v2}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v23

    move-object v14, v4

    move/from16 v18, v5

    move/from16 v19, v6

    move/from16 v20, v7

    invoke-direct/range {v13 .. v23}, Lu93/n0;-><init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/o0;Lr93/s0;)V

    iget-object v2, v2, Lu93/k0;->M:Lr93/w;

    iput-object v2, v13, Lu93/k0;->M:Lr93/w;

    move-object/from16 v5, p3

    iput-object v5, v13, Lu93/n0;->N:Llb3/y;

    move-object v2, v13

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    move-object v2, v3

    :goto_2
    iget-object v6, v0, Lu93/m0;->Y:Lr93/p0;

    if-eqz v6, :cond_5

    new-instance v13, Lu93/o0;

    move-object v7, v6

    check-cast v7, Lal/a;

    invoke-virtual {v7}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v15

    move-object v7, v6

    check-cast v7, Lu93/k0;

    invoke-virtual {v7}, Lu93/k0;->k()Lr93/a0;

    move-result-object v16

    invoke-virtual {v7}, Lu93/k0;->getVisibility()Lr93/r;

    move-result-object v17

    iget-boolean v8, v7, Lu93/k0;->F:Z

    iget-boolean v9, v7, Lu93/k0;->G:Z

    iget-boolean v7, v7, Lu93/k0;->J:Z

    invoke-virtual {v0}, Lu93/m0;->getKind()I

    move-result v21

    if-nez v12, :cond_3

    move-object/from16 v22, v3

    goto :goto_3

    :cond_3
    invoke-interface {v12}, Lr93/n0;->getSetter()Lr93/p0;

    move-result-object v10

    move-object/from16 v22, v10

    :goto_3
    move-object v10, v6

    check-cast v10, Lu93/o;

    invoke-virtual {v10}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v23

    move-object v14, v4

    move/from16 v20, v7

    move/from16 v18, v8

    move/from16 v19, v9

    invoke-direct/range {v13 .. v23}, Lu93/o0;-><init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/p0;Lr93/s0;)V

    iget-object v7, v13, Lu93/k0;->M:Lr93/w;

    iput-object v7, v13, Lu93/k0;->M:Lr93/w;

    check-cast v6, Lu93/o0;

    invoke-virtual {v6}, Lu93/o0;->v()Ljava/util/List;

    move-result-object v6

    const/4 v7, 0x0

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr93/a1;

    if-eqz v6, :cond_4

    iput-object v6, v13, Lu93/o0;->N:Lr93/a1;

    goto :goto_4

    :cond_4
    const/4 v1, 0x6

    invoke-static {v1}, Lu93/o0;->r0(I)V

    throw v3

    :cond_5
    move-object v13, v3

    :goto_4
    iget-object v6, v0, Lu93/m0;->Z:Lu93/v;

    iget-object v7, v0, Lu93/m0;->a0:Lu93/v;

    invoke-virtual {v4, v2, v13, v6, v7}, Lu93/m0;->N0(Lu93/n0;Lu93/o0;Lu93/v;Lu93/v;)V

    iget-object v2, v0, Lu93/m0;->I:Lc93/a;

    if-eqz v2, :cond_6

    iget-object v6, v0, Lu93/m0;->H:Lkb3/h;

    invoke-virtual {v4, v6, v2}, Lu93/m0;->O0(Lkb3/h;Lc93/a;)V

    :cond_6
    invoke-virtual {v0}, Lu93/m0;->h()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v4, v2}, Lu93/m0;->g0(Ljava/util/Collection;)V

    if-nez v1, :cond_7

    :goto_5
    move-object v8, v3

    goto :goto_6

    :cond_7
    sget-object v2, Ls93/g;->a:Ls93/f;

    invoke-static {v0, v1, v2}, Lya3/p;->j(Lr93/b;Llb3/y;Ls93/i;)Lu93/p0;

    move-result-object v3

    goto :goto_5

    :goto_6
    invoke-virtual {v0}, Lu93/m0;->getTypeParameters()Ljava/util/List;

    move-result-object v6

    iget-object v7, v0, Lu93/m0;->U:Lr93/q0;

    sget-object v9, Lm83/y;->w:Lm83/y;

    invoke-virtual/range {v4 .. v9}, Lu93/m0;->Q0(Llb3/y;Ljava/util/List;Lr93/q0;Lu93/p0;Ljava/util/List;)V

    return-object v4
.end method

.method public final L0(Lr93/k;Lr93/a0;Lr93/r;Lr93/n0;ILva3/h;)Lu93/m0;
    .locals 13

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    if-eqz p5, :cond_1

    if-eqz p6, :cond_0

    new-instance v1, Lha3/f;

    invoke-virtual {p0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v3

    iget-boolean v11, p0, Lha3/f;->b0:Z

    iget-object v12, p0, Lha3/f;->c0:Ll83/k;

    iget-boolean v6, p0, Lu93/m0;->G:Z

    sget-object v8, Lr93/s0;->q:Lr93/v0;

    move-object v2, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v9, p4

    move/from16 v10, p5

    move-object/from16 v7, p6

    invoke-direct/range {v1 .. v12}, Lha3/f;-><init>(Lr93/k;Ls93/i;Lr93/a0;Lr93/r;ZLva3/h;Lr93/s0;Lr93/n0;IZLl83/k;)V

    return-object v1

    :cond_0
    const/16 p1, 0x11

    invoke-static {p1}, Lha3/f;->r0(I)V

    throw v0

    :cond_1
    const/16 p1, 0x10

    invoke-static {p1}, Lha3/f;->r0(I)V

    throw v0

    :cond_2
    const/16 p1, 0xf

    invoke-static {p1}, Lha3/f;->r0(I)V

    throw v0

    :cond_3
    const/16 p1, 0xe

    invoke-static {p1}, Lha3/f;->r0(I)V

    throw v0

    :cond_4
    const/16 p1, 0xd

    invoke-static {p1}, Lha3/f;->r0(I)V

    throw v0
.end method

.method public final P0(Llb3/y;)V
    .locals 0

    return-void
.end method

.method public final S()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final h0(Lr93/a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lha3/f;->c0:Ll83/k;

    if-eqz v0, :cond_0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lr93/a;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, v0, Ll83/k;->x:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final isConst()Z
    .locals 3

    invoke-virtual {p0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v0

    iget-boolean v1, p0, Lha3/f;->b0:Z

    if-eqz v1, :cond_4

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lo93/h;->G(Llb3/y;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lo93/r;->c(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-static {v0}, Llb3/d1;->e(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    invoke-static {v0}, Lo93/h;->H(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_2
    sget-object v1, Lna3/s;->a:Ls93/j;

    sget-object v1, Lfa3/x;->p:Lva3/e;

    const-string v2, "ENHANCED_NULLABILITY_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lmb3/g;->v(Lob3/g;Lva3/e;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Lo93/h;->H(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    return v0

    :cond_4
    const/4 v0, 0x0

    return v0
.end method
