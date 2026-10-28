.class public abstract Ls51/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a7\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "m",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ls51/h;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Ls51/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ls51/g;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ls51/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ls51/g;->l(Landroidx/compose/ui/Modifier;Ls51/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ls51/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ls51/g;->k(Ls51/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ls51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ls51/g;->i(Ls51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ls51/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ls51/g;->j(Lkotlin/jvm/functions/Function1;Ls51/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ls51/g;->n(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Ls51/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ls51/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x4f5ece49

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_5

    and-int/lit8 v7, v4, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    const/16 v15, 0x100

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    move v11, v15

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v6, v11

    :goto_5
    and-int/lit16 v11, v6, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    if-eq v11, v12, :cond_9

    const/4 v11, 0x1

    goto :goto_6

    :cond_9
    move v11, v13

    :goto_6
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_35

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v0, v11

    goto :goto_7

    :cond_a
    move-object v0, v5

    :goto_7
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_b

    new-instance v7, Ls32/d;

    const/16 v9, 0x9

    invoke-direct {v7, v9}, Ls32/d;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v7, v9

    :goto_8
    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    and-int/lit8 v1, v6, 0x70

    if-eq v1, v8, :cond_e

    and-int/lit8 v1, v6, 0x40

    if-eqz v1, :cond_d

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_9

    :cond_d
    move v1, v13

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v1, 0x1

    :goto_a
    and-int/lit16 v6, v6, 0x380

    if-ne v6, v15, :cond_f

    const/4 v8, 0x1

    goto :goto_b

    :cond_f
    move v8, v13

    :goto_b
    or-int/2addr v1, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v1, :cond_10

    if-ne v8, v5, :cond_11

    :cond_10
    new-instance v8, Ls51/f;

    const/4 v1, 0x0

    invoke-direct {v8, v1, v2, v7}, Ls51/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v8, Lc93/a;

    const/4 v1, 0x3

    const/4 v15, 0x0

    invoke-static {v12, v13, v15, v8, v1}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v15, 0x36

    invoke-static {v8, v12, v10, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v3, v10, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v17, v6

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_12

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_14

    :cond_13
    invoke-static {v3, v10, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v10, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v13, v9

    const-wide/16 v20, 0x0

    cmpl-double v1, v13, v20

    const-string v22, "invalid weight; must be greater than zero"

    if-lez v1, :cond_15

    goto :goto_d

    :cond_15
    invoke-static/range {v22 .. v22}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v23, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v13, v9, v23

    if-lez v13, :cond_16

    move/from16 v13, v23

    :goto_e
    const/4 v14, 0x1

    goto :goto_f

    :cond_16
    move v13, v9

    goto :goto_e

    :goto_f
    invoke-direct {v1, v13, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v13, Lb2/e;->z:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v13, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object/from16 v24, v15

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_17

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_10
    move-object/from16 v9, v24

    goto :goto_11

    :cond_17
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_10

    :goto_11
    invoke-static {v10, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_18

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_19

    :cond_18
    invoke-static {v14, v10, v14, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v10, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v13

    const/16 v13, 0x8

    int-to-float v15, v13

    const/16 v13, 0x36

    invoke-static {v1, v15, v12, v10, v13}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v1

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    move-object/from16 v31, v0

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v24, v5

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-eqz v5, :cond_1a

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v10, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_1b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    :cond_1b
    invoke-static {v13, v10, v13, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v10, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ls51/h;->b()Lgz0/m0;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_13

    :cond_1d
    const/4 v0, 0x0

    :goto_13
    const/4 v1, 0x6

    if-nez v0, :cond_1e

    const v0, -0x4577ebb

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v35, v8

    move-object/from16 v34, v9

    move-object v1, v11

    move-object v0, v12

    move/from16 v28, v15

    move/from16 v33, v17

    move-object/from16 v36, v24

    const/4 v2, 0x1

    move-object v15, v6

    move-object/from16 v17, v7

    goto/16 :goto_15

    :cond_1e
    const v5, -0x4577eba

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0, v10, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    const/16 v5, 0x9

    int-to-float v5, v5

    const/4 v13, 0x4

    int-to-float v14, v13

    mul-float/2addr v5, v14

    invoke-static {v5, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v1, Lb2/e;->E:Lb2/m;

    move-object/from16 v26, v0

    const/4 v0, 0x0

    invoke-static {v1, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    move/from16 v27, v14

    move v0, v15

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v10}, Lp1/q;->i0()V

    move/from16 v28, v0

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-eqz v0, :cond_1f

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_1f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v10, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_20

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    :cond_20
    invoke-static {v14, v10, v14, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    invoke-static {v10, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lgy0/a;->Y4:I

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    invoke-static {v5, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v13, 0x1b0

    const/16 v14, 0x78

    move-object v15, v6

    const/4 v6, 0x0

    move-object/from16 v18, v8

    const/4 v8, 0x0

    move-object/from16 v29, v9

    const/4 v9, 0x0

    move-object/from16 v30, v12

    move-object v12, v10

    const/4 v10, 0x0

    move-object/from16 v32, v11

    const/4 v11, 0x0

    move/from16 v33, v17

    move-object/from16 v35, v18

    move-object/from16 v36, v24

    move-object/from16 v34, v29

    move-object/from16 v1, v32

    const/4 v2, 0x1

    move-object/from16 v17, v7

    move-object v7, v5

    move-object v5, v0

    move-object/from16 v0, v30

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    const-wide/high16 v5, 0x4012000000000000L    # 4.5

    double-to-float v5, v5

    mul-float v5, v5, v27

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Ls51/g;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-wide v8, Li2/x;->f:J

    const/16 v11, 0xc30

    const/4 v12, 0x0

    const/4 v6, 0x0

    move-object/from16 v5, v26

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_15
    const-wide/high16 v5, 0x3fd0000000000000L    # 0.25

    double-to-float v5, v5

    mul-float v5, v5, v28

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v5, v6, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_22

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_16
    move-object/from16 v9, v34

    goto :goto_17

    :cond_22
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_16

    :goto_17
    invoke-static {v10, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v35

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_23

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_24

    :cond_23
    invoke-static {v6, v10, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    invoke-static {v10, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    move/from16 v7, v28

    const/16 v13, 0x36

    invoke-static {v6, v7, v0, v10, v13}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v0

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_25

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_25
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_18
    invoke-static {v10, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_26

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    :cond_26
    invoke-static {v6, v10, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v10, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v18, v5

    invoke-virtual/range {p1 .. p1}, Ls51/h;->f()Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v0, v10, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v11

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v13, v6

    cmpl-double v8, v13, v20

    if-lez v8, :cond_28

    :goto_19
    move/from16 v19, v6

    goto :goto_1a

    :cond_28
    invoke-static/range {v22 .. v22}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_19

    :goto_1a
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v8, v19, v23

    if-lez v8, :cond_29

    move/from16 v8, v23

    :goto_1b
    const/4 v13, 0x0

    goto :goto_1c

    :cond_29
    move/from16 v8, v19

    goto :goto_1b

    :goto_1c
    invoke-direct {v6, v8, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v29, 0xc00

    const v30, 0x2dff8

    move-object/from16 v34, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move/from16 v28, v7

    move-wide v7, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v19, v15

    const-wide/16 v14, 0x0

    const/16 v20, 0x100

    const/16 v16, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v35, v18

    move-object/from16 v22, v19

    const-wide/16 v18, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x2

    move/from16 v37, v23

    const/16 v23, 0x0

    move-object/from16 v38, v24

    const/16 v24, 0x0

    move-object/from16 v39, v26

    const/16 v26, 0x0

    move/from16 v40, v28

    const/16 v28, 0x0

    move-object/from16 p0, v3

    move-object/from16 p2, v4

    move-object/from16 v41, v35

    move/from16 v4, v37

    move-object/from16 v2, v38

    move-object/from16 v3, v39

    move-object/from16 v37, v34

    const/16 v34, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p1 .. p1}, Ls51/h;->c()Ls51/e;

    move-result-object v5

    if-nez v5, :cond_2a

    const v4, -0x1a0f708d

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_1d
    const/4 v14, 0x1

    goto/16 :goto_21

    :cond_2a
    const v6, -0x1a0f708c

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ls51/e;->b()Lgz0/m0;

    move-result-object v6

    if-eqz v6, :cond_2b

    invoke-virtual {v6}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    goto :goto_1e

    :cond_2b
    move-object/from16 v15, v34

    :goto_1e
    if-nez v15, :cond_2c

    const v4, -0x129d5b12

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_2c
    const v6, -0x129d5b11

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v6

    const/4 v7, 0x6

    invoke-static {v6, v10, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    move-object v7, v6

    invoke-virtual {v5}, Ls51/e;->a()Ljava/lang/String;

    move-result-object v6

    const/4 v13, 0x4

    int-to-float v8, v13

    mul-float/2addr v8, v8

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move/from16 v8, v33

    if-ne v8, v4, :cond_2d

    const/4 v13, 0x1

    goto :goto_1f

    :cond_2d
    const/4 v13, 0x0

    :goto_1f
    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_2e

    move-object/from16 v4, v36

    if-ne v8, v4, :cond_2f

    :cond_2e
    new-instance v8, Ls51/f;

    const/4 v4, 0x1

    invoke-direct {v8, v2, v5, v4}, Ls51/f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    move-object v15, v8

    check-cast v15, Lc93/a;

    const/16 v16, 0xf

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x6

    invoke-virtual {v0, v10, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    const/4 v11, 0x0

    move-object v5, v7

    move-object v7, v4

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_20
    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_1d

    :goto_21
    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Ls51/h;->e()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_30

    const v0, 0x74b48d4f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_22
    const/4 v14, 0x1

    goto :goto_23

    :cond_30
    const v4, 0x74b48d50

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    const/4 v7, 0x6

    invoke-virtual {v0, v10, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    goto :goto_22

    :goto_23
    invoke-static {v10, v14, v14, v14}, Lm4/a;->y(Lp1/q;ZZZ)V

    int-to-float v0, v14

    mul-float v0, v0, v40

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v1, v0, v4, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v0, Lb2/e;->O:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v4, v0, v10, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-eqz v6, :cond_31

    invoke-virtual {v10, v3}, Lp1/q;->l(Lc93/a;)V

    :goto_24
    move-object/from16 v9, v37

    goto :goto_25

    :cond_31
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_24

    :goto_25
    invoke-static {v10, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v41

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_32

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_33

    :cond_32
    move-object/from16 v0, p2

    goto :goto_27

    :cond_33
    :goto_26
    move-object/from16 v0, p0

    goto :goto_28

    :goto_27
    invoke-static {v4, v10, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_26

    :goto_28
    invoke-static {v10, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Ls51/h;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "%"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_34

    const v0, -0x697bd120

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    sget-object v0, Ly3/m;->w:Ly3/m;

    goto :goto_29

    :cond_34
    const/4 v9, 0x0

    const v0, -0x697af329

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v10, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/m;

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_29
    sget-object v1, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v1, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v1, Lr12/a;

    const/16 v3, 0x12

    move-object/from16 v4, p1

    invoke-direct {v1, v4, v3}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    const v3, 0x5aaff86f

    invoke-static {v3, v10, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v3, 0x38

    invoke-static {v0, v1, v10, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    const/4 v14, 0x1

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object v3, v2

    move-object/from16 v1, v31

    goto :goto_2a

    :cond_35
    move-object v4, v2

    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v9

    :goto_2a
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_36

    new-instance v0, Ls51/b;

    const/4 v6, 0x1

    move/from16 v5, p5

    move-object v2, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_36
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ls51/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ls51/h;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Ls51/e;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ls51/h;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lb2/e;->L:Lb2/l;

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v1, v4

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    const/16 v4, 0x36

    invoke-static {v1, v0, v3, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v3, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v3, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v1, v3, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ls51/h;->h()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v1, v3, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->B()Lb91/a;

    move-result-object v23

    invoke-virtual {v1, v3, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v27, 0xc00

    const v28, 0x2dffa

    move v7, v4

    const/4 v4, 0x0

    move v9, v7

    const-wide/16 v7, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

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

    const/16 v20, 0x2

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v29, v3

    move-object v3, v0

    move/from16 v0, v25

    move-object/from16 v25, v29

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {p0 .. p0}, Ls51/h;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v1, v3, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v5

    const/16 v27, 0x0

    const v28, 0x2fffa

    move-object v3, v4

    const/4 v4, 0x0

    const/16 v20, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Ls51/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ls51/g;->g(Landroidx/compose/ui/Modifier;Ls51/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 11

    const/4 v9, 0x1

    const v10, 0x6ffff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v10}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    new-instance v0, Ls32/d;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ls32/d;-><init>(I)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    invoke-static {}, Lgb1/b0;->T0()Li2/t;

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
