.class public abstract Lsl0/g3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001a{\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u001c\u0008\u0002\u0010\n\u001a\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001am\u0010\u000f\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a7\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019\u00b2\u0006\u000e\u0010\r\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "isNewConversationEnabled",
        "isFileUploadEnabled",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNewConversationClicked",
        "onImageUploadClicked",
        "onFileUploadClicked",
        "onCameraClicked",
        "Lkotlin/Function1;",
        "trigger",
        "A",
        "(ZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "expanded",
        "onDismiss",
        "p",
        "(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "isEnabled",
        "",
        "icon",
        "",
        "text",
        "onClick",
        "w",
        "(ZILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final A(ZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move/from16 v10, p8

    const-string v2, "onNewConversationClicked"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onImageUploadClicked"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p7

    check-cast v8, Lp1/q;

    const v2, 0x35dbc118

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v10, 0x6

    move/from16 v5, p0

    if-nez v2, :cond_1

    invoke-virtual {v8, v5}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v10

    goto :goto_1

    :cond_1
    move v2, v10

    :goto_1
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_2

    move/from16 v4, p1

    invoke-virtual {v8, v4}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v2, v6

    :cond_6
    and-int/lit16 v6, v10, 0xc00

    if-nez v6, :cond_8

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_5

    :cond_7
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v2, v6

    :cond_8
    and-int/lit8 v6, p9, 0x10

    if-eqz v6, :cond_a

    or-int/lit16 v2, v2, 0x6000

    :cond_9
    move-object/from16 v7, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v7, v10, 0x6000

    if-nez v7, :cond_9

    move-object/from16 v7, p4

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x4000

    goto :goto_6

    :cond_b
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v2, v9

    :goto_7
    and-int/lit8 v9, p9, 0x20

    const/high16 v11, 0x30000

    if-eqz v9, :cond_d

    or-int/2addr v2, v11

    :cond_c
    move-object/from16 v11, p5

    goto :goto_9

    :cond_d
    and-int/2addr v11, v10

    if-nez v11, :cond_c

    move-object/from16 v11, p5

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v12, 0x10000

    :goto_8
    or-int/2addr v2, v12

    :goto_9
    and-int/lit8 v12, p9, 0x40

    const/high16 v13, 0x180000

    if-eqz v12, :cond_10

    or-int/2addr v2, v13

    :cond_f
    move-object/from16 v13, p6

    goto :goto_b

    :cond_10
    and-int/2addr v13, v10

    if-nez v13, :cond_f

    move-object/from16 v13, p6

    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    const/high16 v14, 0x100000

    goto :goto_a

    :cond_11
    const/high16 v14, 0x80000

    :goto_a
    or-int/2addr v2, v14

    :goto_b
    const v14, 0x92493

    and-int/2addr v14, v2

    const v15, 0x92492

    move/from16 p7, v12

    const/4 v12, 0x0

    if-eq v14, v15, :cond_12

    const/4 v14, 0x1

    goto :goto_c

    :cond_12
    move v14, v12

    :goto_c
    and-int/lit8 v15, v2, 0x1

    invoke-virtual {v8, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_23

    if-eqz v3, :cond_13

    move v3, v6

    move v6, v12

    goto :goto_d

    :cond_13
    move v3, v6

    move v6, v4

    :goto_d
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_14

    new-instance v3, Lsl0/a1;

    const/16 v7, 0x12

    invoke-direct {v3, v7}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v3, Lc93/a;

    move-object/from16 v23, v3

    move v3, v2

    move-object/from16 v2, v23

    goto :goto_e

    :cond_15
    move v3, v2

    move-object v2, v7

    :goto_e
    if-eqz v9, :cond_17

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_16

    new-instance v7, Lsl0/a1;

    const/16 v9, 0x11

    invoke-direct {v7, v9}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v7, Lc93/a;

    move-object/from16 v23, v7

    move v7, v3

    move-object/from16 v3, v23

    goto :goto_f

    :cond_17
    move v7, v3

    move-object v3, v11

    :goto_f
    if-eqz p7, :cond_18

    const/4 v9, 0x0

    goto :goto_10

    :cond_18
    move-object v9, v13

    :goto_10
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v4, :cond_19

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v11, Lp1/c1;

    sget-object v17, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x1

    if-nez v9, :cond_1a

    int-to-float v14, v13

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float v20, v14, v15

    const/16 v21, 0x0

    const/16 v22, 0xb

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    :cond_1a
    move-object/from16 v14, v17

    sget-object v15, Lb2/e;->w:Lb2/m;

    invoke-static {v15, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-eqz v1, :cond_1b

    invoke-virtual {v8, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1b
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_11
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v8, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_1c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :cond_1c
    invoke-static {v12, v8, v12, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x6

    if-nez v9, :cond_20

    const v1, -0x7889716f

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-static {v11}, Lsl0/g3;->D(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_1e

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1}, Lyb0/f;->a(Lx81/d;)I

    move-result v1

    goto :goto_12

    :cond_1e
    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/a;->a()I

    move-result v1

    :goto_12
    invoke-static {v1, v8, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    sget-object v13, Lgz0/h;->DEFAULT:Lgz0/h;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_1f

    new-instance v1, Lsl0/b1;

    const/4 v12, 0x7

    invoke-direct {v1, v12, v11}, Lsl0/b1;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v1, Lc93/a;

    const v18, 0x36d80

    const/16 v19, 0x2

    const/4 v12, 0x0

    const/4 v14, 0x1

    const-string v15, "expandMenu"

    move-object/from16 v16, v1

    move-object/from16 v17, v8

    move-object v1, v11

    const/4 v8, 0x1

    move-object v11, v0

    const/4 v0, 0x0

    invoke-static/range {v11 .. v19}, Lgz0/j;->r(Lo2/e;FLgz0/h;ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v17

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_20
    move-object v1, v11

    const/4 v12, 0x0

    move-object v11, v8

    const/4 v8, 0x1

    const v13, -0x788316c8

    invoke-virtual {v11, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v4, :cond_21

    new-instance v13, Lsl0/b1;

    const/16 v14, 0x8

    invoke-direct {v13, v14, v1}, Lsl0/b1;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v13, Lc93/a;

    shr-int/lit8 v14, v7, 0xf

    and-int/lit8 v14, v14, 0x70

    or-int/2addr v0, v14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v9, v13, v11, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    :goto_13
    invoke-static {v1}, Lsl0/g3;->D(Lp1/c1;)Z

    move-result v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v4, :cond_22

    new-instance v12, Lsl0/b1;

    const/16 v4, 0x9

    invoke-direct {v12, v4, v1}, Lsl0/b1;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v12, Lc93/a;

    shr-int/lit8 v1, v7, 0x6

    and-int/lit8 v4, v1, 0xe

    const/high16 v13, 0xc00000

    or-int/2addr v4, v13

    and-int/lit8 v13, v1, 0x70

    or-int/2addr v4, v13

    and-int/lit16 v13, v1, 0x380

    or-int/2addr v4, v13

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v1, v4

    shl-int/lit8 v4, v7, 0xf

    const/high16 v7, 0x70000

    and-int/2addr v7, v4

    or-int/2addr v1, v7

    const/high16 v7, 0x380000

    and-int/2addr v4, v7

    or-int/2addr v1, v4

    move-object v4, v11

    move v11, v8

    move-object v8, v4

    move v4, v0

    move-object v13, v9

    move-object v7, v12

    move-object/from16 v0, p2

    move v9, v1

    move-object/from16 v1, p3

    invoke-static/range {v0 .. v9}, Lsl0/g3;->p(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    move-object v5, v2

    move v2, v6

    move-object v6, v3

    :goto_14
    move-object v7, v13

    goto :goto_15

    :cond_23
    invoke-virtual {v8}, Lp1/q;->X()V

    move v2, v4

    move-object v5, v7

    move-object v6, v11

    goto :goto_14

    :goto_15
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_24

    new-instance v0, Lb30/w3;

    move/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v9, p9

    move v8, v10

    invoke-direct/range {v0 .. v9}, Lb30/w3;-><init>(ZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final B()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final C()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final D(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final E(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final F(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lsl0/g3;->D(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lsl0/g3;->E(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lsl0/g3;->D(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lsl0/g3;->E(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lsl0/g3;->E(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(ZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lsl0/g3;->A(ZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(ZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lsl0/g3;->I(ZZLc93/a;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/g3;->s(Lc93/a;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/g3;->F(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/g3;->x(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ZLc93/a;Lc93/a;Lc93/a;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsl0/g3;->q(ZLc93/a;Lc93/a;Lc93/a;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/g3;->t(Lc93/a;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lsl0/g3;->y(ZLc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/g3;->C()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/g3;->G(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/g3;->B()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lsl0/g3;->v(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lc93/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/g3;->r(Lc93/a;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/g3;->H(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lc93/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/g3;->u(Lc93/a;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(IZLjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move v0, p1

    move p1, p0

    move p0, v0

    invoke-static/range {p0 .. p6}, Lsl0/g3;->z(ZILjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "ZZZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v5, p4

    move/from16 v9, p9

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v1, -0x22e4d60c

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    move-object/from16 v12, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    move-object/from16 v14, p1

    if-nez v4, :cond_3

    invoke-virtual {v0, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit16 v4, v9, 0x180

    if-nez v4, :cond_5

    move-object/from16 v4, p2

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v1, v7

    goto :goto_4

    :cond_5
    move-object/from16 v4, p2

    :goto_4
    and-int/lit16 v7, v9, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v1, v8

    goto :goto_6

    :cond_7
    move-object/from16 v7, p3

    :goto_6
    and-int/lit16 v8, v9, 0x6000

    if-nez v8, :cond_9

    invoke-virtual {v0, v5}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_7

    :cond_8
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v1, v8

    :cond_9
    const/high16 v8, 0x30000

    and-int/2addr v8, v9

    move/from16 v11, p5

    if-nez v8, :cond_b

    invoke-virtual {v0, v11}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_a

    const/high16 v8, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v8, 0x10000

    :goto_8
    or-int/2addr v1, v8

    :cond_b
    const/high16 v8, 0x180000

    and-int/2addr v8, v9

    move/from16 v15, p6

    if-nez v8, :cond_d

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_c

    const/high16 v8, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v8, 0x80000

    :goto_9
    or-int/2addr v1, v8

    :cond_d
    const/high16 v8, 0xc00000

    and-int/2addr v8, v9

    move-object/from16 v13, p7

    if-nez v8, :cond_f

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    const/high16 v8, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v8, 0x400000

    :goto_a
    or-int/2addr v1, v8

    :cond_f
    const v8, 0x492493

    and-int/2addr v8, v1

    const v10, 0x492492

    const/16 p8, 0x20

    if-eq v8, v10, :cond_10

    const/4 v8, 0x1

    goto :goto_b

    :cond_10
    const/4 v8, 0x0

    :goto_b
    and-int/lit8 v10, v1, 0x1

    invoke-virtual {v0, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_12

    sget-object v8, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    int-to-float v2, v2

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-interface {v8, v2}, Ly3/c;->F(F)I

    move-result v2

    neg-int v2, v2

    const/16 v10, 0xe

    int-to-float v10, v10

    mul-float/2addr v10, v3

    invoke-interface {v8, v10}, Ly3/c;->F(F)I

    move-result v3

    neg-int v3, v3

    int-to-long v6, v2

    shl-long v6, v6, p8

    int-to-long v2, v3

    const-wide v16, 0xffffffffL

    and-long v2, v2, v16

    or-long/2addr v2, v6

    if-eqz v5, :cond_11

    const v6, 0x5c1fa4c2

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lb2/e;->G:Lb2/m;

    new-instance v7, Lc4/j0;

    const/16 v10, 0x9

    const/4 v8, 0x0

    invoke-direct {v7, v8, v10}, Lc4/j0;-><init>(ZI)V

    new-instance v10, Lsl0/d3;

    move-object/from16 v17, p3

    move-object/from16 v16, v4

    invoke-direct/range {v10 .. v17}, Lsl0/d3;-><init>(ZLc93/a;Lc93/a;Lc93/a;ZLc93/a;Lc93/a;)V

    const v4, 0x2fcc2a9c

    invoke-static {v4, v0, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    shr-int/lit8 v1, v1, 0xf

    and-int/lit16 v1, v1, 0x380

    or-int/lit16 v1, v1, 0x6c06

    const/16 v18, 0x0

    move-object/from16 v13, p7

    move-object/from16 v16, v0

    move/from16 v17, v1

    move-wide v11, v2

    move-object v10, v6

    move-object v14, v7

    invoke-static/range {v10 .. v18}, Lc4/r;->b(Lb2/h;JLc93/a;Lc4/j0;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_11
    const/4 v8, 0x0

    const v1, 0x5c4482ce

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_13

    new-instance v0, Lsl0/e3;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v9}, Lsl0/e3;-><init>(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final q(ZLc93/a;Lc93/a;Lc93/a;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 23

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    and-int/lit8 v5, p8, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v5, v6, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v8

    :goto_0
    and-int/lit8 v6, p8, 0x1

    move-object/from16 v13, p7

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v5, 0x6

    int-to-float v15, v5

    const/16 v6, 0xc

    int-to-float v6, v6

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v16

    const-wide/16 v20, 0x0

    const/16 v22, 0x1c

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    invoke-static/range {v14 .. v22}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Li2/t;->b:Li2/s;

    const-wide v11, 0xcc38444fL

    invoke-static {v11, v12}, Li2/w0;->e(J)J

    move-result-wide v11

    new-instance v15, Li2/x;

    invoke-direct {v15, v11, v12}, Li2/x;-><init>(J)V

    const-wide v11, 0xff252d34L

    invoke-static {v11, v12}, Li2/w0;->e(J)J

    move-result-wide v11

    new-instance v7, Li2/x;

    invoke-direct {v7, v11, v12}, Li2/x;-><init>(J)V

    filled-new-array {v15, v7}, [Li2/x;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    invoke-static {v10, v7, v12, v12, v11}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v7

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    const/4 v10, 0x4

    invoke-static {v9, v7, v6, v12, v10}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x3

    int-to-float v7, v7

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v7, v9

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v13, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v13, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v10, v13, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v13, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x6

    invoke-static {v6, v7, v13, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v13, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-nez v6, :cond_5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v7, v13, v7, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v13, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v10, Lwk0/a;->e:I

    sget v5, Lwk0/b;->s0:I

    const/4 v6, 0x0

    invoke-static {v5, v13, v6}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_7

    if-ne v6, v7, :cond_8

    :cond_7
    new-instance v6, Lsl0/f3;

    const/4 v5, 0x0

    invoke-direct {v6, v5, v0, v1}, Lsl0/f3;-><init>(ILc93/a;Lc93/a;)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v12, v6

    check-cast v12, Lc93/a;

    const/4 v14, 0x0

    move/from16 v9, p0

    invoke-static/range {v9 .. v14}, Lsl0/g3;->w(ZILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget v10, Lwk0/a;->g:I

    sget v0, Lwk0/b;->U0:I

    const/4 v6, 0x0

    invoke-static {v0, v13, v6}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_9

    if-ne v5, v7, :cond_a

    :cond_9
    new-instance v5, Lsl0/f3;

    const/4 v0, 0x1

    invoke-direct {v5, v0, v2, v1}, Lsl0/f3;-><init>(ILc93/a;Lc93/a;)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v12, v5

    check-cast v12, Lc93/a;

    const/4 v14, 0x6

    const/4 v9, 0x1

    invoke-static/range {v9 .. v14}, Lsl0/g3;->w(ZILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    if-eqz p4, :cond_f

    const v0, 0x37997b49

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lgz0/m0;->ARTICLE:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v10

    sget v0, Lwk0/b;->T0:I

    const/4 v6, 0x0

    invoke-static {v0, v13, v6}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_b

    if-ne v2, v7, :cond_c

    :cond_b
    new-instance v2, Lsl0/f3;

    const/4 v0, 0x2

    invoke-direct {v2, v0, v3, v1}, Lsl0/f3;-><init>(ILc93/a;Lc93/a;)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v12, v2

    check-cast v12, Lc93/a;

    const/4 v14, 0x6

    const/4 v9, 0x1

    invoke-static/range {v9 .. v14}, Lsl0/g3;->w(ZILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/w;->f()I

    move-result v0

    sget v2, Lwk0/b;->Q0:I

    const/4 v6, 0x0

    invoke-static {v2, v13, v6}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_d

    if-ne v5, v7, :cond_e

    :cond_d
    new-instance v5, Lsl0/f3;

    const/4 v3, 0x3

    invoke-direct {v5, v3, v4, v1}, Lsl0/f3;-><init>(ILc93/a;Lc93/a;)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lc93/a;

    const/4 v1, 0x6

    const/4 v3, 0x1

    move/from16 p1, v0

    move/from16 p5, v1

    move-object/from16 p2, v2

    move/from16 p0, v3

    move-object/from16 p3, v5

    move-object/from16 p4, v13

    invoke-static/range {p0 .. p5}, Lsl0/g3;->w(ZILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v6, 0x0

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    :goto_3
    const/4 v0, 0x1

    goto :goto_4

    :cond_f
    const/4 v6, 0x0

    const v0, 0x37a4c20a

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_10
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lc93/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lc93/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lc93/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lc93/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p9

    invoke-static/range {v1 .. v10}, Lsl0/g3;->p(Lc93/a;Lc93/a;Lc93/a;Lc93/a;ZZZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(ZILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move/from16 v4, p5

    const-string v5, "text"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onClick"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v5, -0x6e1fa959

    invoke-virtual {v11, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x4

    if-nez v5, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v7, v4, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v7, v4, 0xc00

    const/16 v9, 0x800

    if-nez v7, :cond_7

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v9

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v5, v7

    :cond_7
    and-int/lit16 v7, v5, 0x493

    const/16 v10, 0x492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v7, v10, :cond_8

    move v7, v15

    goto :goto_5

    :cond_8
    move v7, v14

    :goto_5
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v11, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    and-int/lit16 v7, v5, 0x380

    if-ne v7, v8, :cond_9

    move v7, v15

    goto :goto_6

    :cond_9
    move v7, v14

    :goto_6
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_a

    if-ne v8, v10, :cond_b

    :cond_a
    new-instance v8, Lsl0/f;

    const/4 v7, 0x4

    invoke-direct {v8, v3, v7}, Lsl0/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v15, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    and-int/lit8 v8, v5, 0xe

    if-ne v8, v6, :cond_c

    move v8, v15

    goto :goto_7

    :cond_c
    move v8, v14

    :goto_7
    and-int/lit16 v12, v5, 0x1c00

    if-ne v12, v9, :cond_d

    move v9, v15

    goto :goto_8

    :cond_d
    move v9, v14

    :goto_8
    or-int/2addr v8, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_e

    if-ne v9, v10, :cond_f

    :cond_e
    new-instance v9, Ldn0/c;

    const/4 v8, 0x5

    invoke-direct {v9, v8, v0, v1}, Ldn0/c;-><init>(ILc93/a;Z)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v20, v9

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->K:Lb2/l;

    int-to-float v10, v15

    const/16 v12, 0x8

    int-to-float v12, v12

    const/16 v13, 0x36

    invoke-static {v10, v12, v9, v11, v13}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v9

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_10

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v11, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_12

    :cond_11
    invoke-static {v10, v11, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v11, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v8, 0x5

    int-to-float v8, v8

    int-to-float v6, v6

    mul-float/2addr v8, v6

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    and-int/lit8 v6, v5, 0x70

    or-int/lit8 v6, v6, 0x6

    invoke-static {v2, v11, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    if-eqz v1, :cond_13

    const v7, 0x1a7f6c32

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-static {v7, v11, v9, v14}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    goto :goto_a

    :cond_13
    const v7, 0x1a7f7012

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v7, v11, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->Y0()J

    move-result-wide v9

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_a
    const/16 v12, 0x1b0

    const/4 v13, 0x0

    const/4 v7, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v11, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->m()Lb91/a;

    move-result-object v8

    sget-object v9, Lb91/b$d;->a:Lb91/b$d;

    const/4 v10, 0x0

    const/4 v12, 0x1

    invoke-static {v8, v10, v9, v12, v10}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v23

    if-eqz v1, :cond_14

    const v8, 0x1a7f8d15

    invoke-static {v11, v8, v6, v11, v7}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v6

    :goto_b
    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_14
    const v8, 0x1a7f9152

    invoke-static {v11, v8, v6, v11, v7}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v6

    goto :goto_b

    :goto_c
    shr-int/lit8 v5, v5, 0x6

    and-int/lit8 v26, v5, 0xe

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v27, v5, 0x12

    const v28, 0x2fffa

    const/4 v4, 0x0

    move-wide v5, v6

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move v14, v12

    const-wide/16 v12, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v0, v29

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_15
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lbs1/x;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lbs1/x;-><init>(ZILjava/lang/String;Lc93/a;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final x(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(ZLc93/a;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(ZILjava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lsl0/g3;->w(ZILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
