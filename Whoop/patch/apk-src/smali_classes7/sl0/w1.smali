.class public abstract Lsl0/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a7\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lnl0/l;",
        "imageUploadState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "removeImage",
        "retryClicked",
        "e",
        "(Lnl0/l;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lnl0/l;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsl0/w1;->i(Lnl0/l;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/w1;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lsl0/w1;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/w1;->h(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lnl0/l;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl0/l;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "imageUploadState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x2158dd9b

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v5, p5, 0x2

    const/16 v6, 0x10

    if-eqz v5, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    move v8, v6

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_5

    :cond_8
    const/16 v11, 0x80

    :goto_5
    or-int/2addr v0, v11

    :goto_6
    and-int/lit16 v11, v0, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eq v11, v12, :cond_9

    move v11, v13

    goto :goto_7

    :cond_9
    move v11, v14

    :goto_7
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1c

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v11, :cond_a

    new-instance v5, Lsl0/a1;

    const/4 v7, 0x4

    invoke-direct {v5, v7}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lc93/a;

    move-object v12, v5

    goto :goto_8

    :cond_b
    move-object v12, v7

    :goto_8
    if-eqz v8, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v11, :cond_c

    new-instance v5, Lsl0/a1;

    const/4 v7, 0x5

    invoke-direct {v5, v7}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lc93/a;

    move-object/from16 v16, v5

    goto :goto_9

    :cond_d
    move-object/from16 v16, v9

    :goto_9
    invoke-virtual {v1}, Lnl0/l;->d()Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v1}, Lnl0/l;->c()Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_a

    :cond_e
    move v5, v14

    goto :goto_b

    :cond_f
    :goto_a
    move v5, v13

    :goto_b
    int-to-float v7, v13

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v6, v6

    int-to-float v2, v2

    mul-float/2addr v6, v2

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Lb2/e;->E:Lb2/m;

    invoke-static {v9, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v3, v10, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_10

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_10
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v10, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    :cond_11
    invoke-static {v3, v10, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v10, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v13, v5

    invoke-virtual {v1}, Lnl0/l;->b()Lkd1/o;

    move-result-object v5

    if-nez v5, :cond_13

    const v3, -0x77c890c2

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move/from16 v24, v0

    move v4, v7

    move-object/from16 v17, v8

    move-object v8, v10

    move-object v3, v11

    move-object v15, v12

    move v0, v14

    goto :goto_e

    :cond_13
    const v3, -0x77c890c1

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    if-eqz v13, :cond_14

    move v3, v2

    goto :goto_d

    :cond_14
    int-to-float v3, v14

    :goto_d
    invoke-static {v3, v8}, Lds/p;->s(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v9, Lkd1/o;->a:I

    move-object v4, v8

    move-object v8, v10

    const/4 v10, 0x3

    const/4 v6, 0x0

    move/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v17, v4

    move/from16 v4, v20

    const/4 v13, 0x1

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    sget v6, Lwk0/b;->W0:I

    invoke-static {v6, v8, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    move v7, v13

    const/4 v13, 0x0

    move v9, v14

    const/16 v14, 0x78

    move-object v10, v8

    const/4 v8, 0x0

    move v15, v9

    const/4 v9, 0x0

    move-object/from16 v19, v12

    move-object v12, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move/from16 v24, v0

    move-object v7, v3

    move v0, v15

    move-object/from16 v15, v19

    move-object/from16 v3, v20

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v1}, Lnl0/l;->d()Z

    move-result v5

    const/4 v13, 0x6

    if-eqz v5, :cond_16

    invoke-virtual {v1}, Lnl0/l;->c()Z

    move-result v5

    if-eqz v5, :cond_15

    goto :goto_f

    :cond_15
    const v3, -0x77b664b2

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move-object/from16 v14, v17

    goto/16 :goto_11

    :cond_16
    :goto_f
    const v5, -0x77c1e574

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    const/16 v5, 0x20

    new-instance v18, Lj0/j;

    invoke-direct/range {v18 .. v18}, Lj0/j;-><init>()V

    and-int/lit8 v6, v24, 0x70

    if-ne v6, v5, :cond_17

    const/4 v5, 0x1

    goto :goto_10

    :cond_17
    move v5, v0

    :goto_10
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_18

    if-ne v6, v3, :cond_19

    :cond_18
    new-instance v6, Lsl0/a;

    const/16 v3, 0xa

    invoke-direct {v6, v15, v3}, Lsl0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object/from16 v22, v6

    check-cast v22, Lc93/a;

    const/16 v23, 0x1c

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v14, v17

    const/16 v21, 0x0

    const/16 v22, 0xb

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v3

    move/from16 v20, v4

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    sget-object v9, Lt0/j;->a:Lt0/i;

    invoke-static {v3, v6, v7, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v6, 0x2

    int-to-float v6, v6

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, Lb2/e;->y:Lb2/m;

    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v9, v3, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    mul-float/2addr v6, v2

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/i0;->k()I

    move-result v3

    invoke-static {v3, v8, v13}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    sget v6, Lgy0/f;->L:I

    invoke-static {v6, v8, v0}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->u()J

    move-result-wide v4

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v10, v8

    move-wide v8, v4

    move-object v5, v3

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v1}, Lnl0/l;->c()Z

    move-result v3

    if-eqz v3, :cond_1a

    const v3, -0x77b5b424

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lsl0/n1;->a:Lsl0/n1;

    invoke-virtual {v3}, Lsl0/n1;->b()Lc93/m;

    move-result-object v3

    shr-int/lit8 v4, v24, 0x6

    and-int/lit8 v4, v4, 0xe

    or-int/lit16 v10, v4, 0x6000

    const/16 v11, 0xe

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, v8

    move-object/from16 v5, v16

    move-object v8, v3

    invoke-static/range {v5 .. v11}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v5

    move-object v8, v9

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1a
    move-object/from16 v3, v16

    const v4, -0x77acfe52

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v1}, Lnl0/l;->d()Z

    move-result v4

    if-eqz v4, :cond_1b

    const v4, -0x77ac6b6f

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x5

    int-to-float v4, v4

    mul-float/2addr v4, v2

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v2, Lgy0/e;->d:I

    invoke-static {v2}, Lv41/r0$d;->b(I)I

    move-result v2

    invoke-static {v2}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v6

    move-object/from16 v19, v15

    const/4 v15, 0x6

    const/16 v16, 0x1fc

    const/4 v7, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v5 .. v16}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v14

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v13, 0x1

    goto :goto_14

    :cond_1b
    move-object/from16 v19, v15

    const v2, -0x77a92dd2

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_14
    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    move-object/from16 v2, v19

    goto :goto_15

    :cond_1c
    move-object v8, v10

    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v2, v7

    move-object v3, v9

    :goto_15
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Ls51/b;

    const/16 v6, 0xb

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lnl0/l;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsl0/w1;->e(Lnl0/l;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
