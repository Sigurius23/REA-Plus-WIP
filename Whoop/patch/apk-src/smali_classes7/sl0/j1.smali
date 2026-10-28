.class public abstract Lsl0/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "suggestionText",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onClick",
        "f",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/j1;->j(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/j1;->g(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lq2/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsl0/j1;->h(Lq2/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsl0/j1;->k(Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0}, Lsl0/j1;->i(Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "suggestionText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v1, -0x337312ee    # -7.388584E7f

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    const/16 v5, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v5

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v1, v8

    :goto_3
    and-int/lit8 v8, v1, 0x13

    const/16 v9, 0x12

    const/4 v11, 0x1

    if-eq v8, v9, :cond_5

    move v8, v11

    goto :goto_4

    :cond_5
    const/4 v8, 0x0

    :goto_4
    and-int/lit8 v12, v1, 0x1

    invoke-virtual {v7, v12, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_15

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_6

    new-instance v4, Lsc2/n;

    const/16 v6, 0x14

    invoke-direct {v4, v6}, Lsc2/n;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v4, v6

    :goto_5
    sget-object v6, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {v7, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lq2/a;

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit8 v13, v1, 0x70

    if-ne v13, v5, :cond_8

    move v5, v11

    goto :goto_6

    :cond_8
    const/4 v5, 0x0

    :goto_6
    or-int/2addr v5, v12

    const/16 v12, 0xe

    and-int/2addr v1, v12

    if-ne v1, v3, :cond_9

    move v13, v11

    goto :goto_7

    :cond_9
    const/4 v13, 0x0

    :goto_7
    or-int/2addr v5, v13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v5, :cond_a

    if-ne v13, v8, :cond_b

    :cond_a
    new-instance v13, Lsl0/y;

    const/4 v5, 0x3

    invoke-direct {v13, v6, v4, v0, v5}, Lsl0/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v18, v13

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v2, v2

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v2, v6

    int-to-float v6, v11

    int-to-float v3, v3

    mul-float/2addr v6, v3

    invoke-static {v5, v2, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v6, v5, v7, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move/from16 p2, v9

    iget-wide v9, v7, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_c

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_8
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v7, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v6, v7, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v7, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v3

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v5, "hal-suggestions-markdown"

    invoke-interface {v3, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    const-string v6, "invalid weight; must be greater than zero"

    const-wide/16 v9, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    if-eqz v3, :cond_11

    const v3, 0x5747bebc

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    move-object v3, v6

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    float-to-double v5, v15

    cmpl-double v5, v5, v9

    if-lez v5, :cond_f

    :goto_9
    move/from16 v28, v1

    goto :goto_a

    :cond_f
    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_9

    :goto_a
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v15, p1

    if-lez v3, :cond_10

    move/from16 v5, p1

    goto :goto_b

    :cond_10
    move v5, v15

    :goto_b
    invoke-direct {v1, v5, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move v3, v2

    sget-object v2, Liz0/l;->a:Liz0/l;

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    move v9, v3

    invoke-static {v5, v7, v6}, Lih0/d0;->r(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v3

    invoke-virtual {v5, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v15

    invoke-virtual {v5, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v10, Liz0/l;->b:I

    shl-int/lit8 v26, v10, 0xf

    const/16 v27, 0x7fdc

    move-object v10, v4

    move-wide v4, v5

    move-object/from16 v22, v7

    const-wide/16 v6, 0x0

    move-object/from16 v18, v8

    move/from16 v17, v9

    const-wide/16 v8, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    const/16 v20, 0x0

    const/4 v13, 0x0

    move/from16 v21, v11

    move-object/from16 v23, v14

    move-wide/from16 v39, v15

    move/from16 v16, v12

    move-wide/from16 v11, v39

    const-wide/16 v14, 0x0

    move/from16 v24, v16

    const/16 v16, 0x0

    move/from16 v25, v17

    move-object/from16 v29, v18

    const-wide/16 v17, 0x0

    move-object/from16 v30, v19

    const/16 v19, 0x0

    move/from16 v31, v20

    const/16 v20, 0x0

    move/from16 v32, v21

    const/16 v21, 0x0

    move/from16 v33, v24

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move-object/from16 v37, v29

    move-object/from16 v38, v34

    move/from16 v36, v35

    invoke-virtual/range {v2 .. v27}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v3

    move-object/from16 v22, v24

    sget v2, Liz0/m;->p:I

    shl-int/lit8 v2, v2, 0x9

    or-int v10, v28, v2

    const/16 v11, 0x1f4

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, v22

    invoke-static/range {v0 .. v11}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v7, v9

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_c
    move/from16 v3, v36

    move-object/from16 v14, v38

    goto/16 :goto_10

    :cond_11
    move/from16 v28, v1

    move/from16 v36, v2

    move-object/from16 v30, v4

    move-object v3, v6

    move-object/from16 v37, v8

    move-object/from16 v38, v14

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v0, 0x0

    const v1, 0x574dd05e

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    float-to-double v1, v15

    cmpl-double v1, v1, v9

    if-lez v1, :cond_12

    goto :goto_d

    :cond_12
    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v15, p1

    if-lez v2, :cond_13

    move/from16 v5, p1

    :goto_e
    const/4 v2, 0x1

    goto :goto_f

    :cond_13
    move v5, v15

    goto :goto_e

    :goto_f
    invoke-direct {v1, v5, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v7, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->b()Lb91/a;

    move-result-object v20

    invoke-virtual {v3, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v24, v5, 0x12

    const v25, 0x2fff8

    move/from16 v32, v2

    move-wide v2, v3

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v22, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v0, p0

    move/from16 v23, v28

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v22

    const/4 v13, 0x0

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_10
    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v8, 0x6

    const/16 v9, 0xe

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    const/16 v0, 0xe

    int-to-float v0, v0

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v24, 0x0

    const v25, 0x7fffb

    const/16 v16, 0x0

    const/16 v17, 0x0

    const v18, 0x3f7d70a4    # 0.99f

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v15 .. v25}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v37

    if-ne v1, v2, :cond_14

    new-instance v1, Lsc2/n;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Lsc2/n;-><init>(I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/w;->d()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v7, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    const/16 v8, 0x30

    const/16 v9, 0x8

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object/from16 v2, v30

    goto :goto_11

    :cond_15
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v2, v6

    :goto_11
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Ljs1/j;

    const/4 v5, 0x2

    move-object/from16 v1, p0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ljs1/j;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final g(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lq2/a;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const/16 v0, 0x9

    invoke-interface {p0, v0}, Lq2/a;->a(I)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lf2/d;)Lf2/g;
    .locals 2

    const-string v0, "$this$drawWithCache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsc2/n;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lsc2/n;-><init>(I)V

    invoke-virtual {p0, v0}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v2

    const/16 v9, 0x9

    const/16 v10, 0x3e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lsl0/j1;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
