.class public abstract Li51/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li51/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a9\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Li51/i;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Lv41/s;",
        "Ll83/a0;",
        "onDynamicLottieLoadingChanged",
        "d",
        "(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "textOverlay",
        "",
        "j",
        "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Z",
        "lottieLoadingState",
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
.method public static synthetic a(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Li51/f;->i(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lp1/c1;Lv41/s;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Li51/f;->h(Lkotlin/jvm/functions/Function1;Lp1/c1;Lv41/s;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1}, Li51/f;->g(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 57
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li51/i;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v26

    const-string v2, "viewState"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v2, -0x3b210276

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    const/4 v5, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v6, p5, 0x2

    const/16 v17, 0x10

    if-eqz v6, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    move/from16 v8, v17

    :goto_2
    or-int/2addr v2, v8

    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v10, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v1, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v2, v11

    :goto_5
    and-int/lit16 v11, v2, 0x93

    const/16 v13, 0x92

    const/4 v14, 0x1

    if-eq v11, v13, :cond_8

    move v11, v14

    goto :goto_6

    :cond_8
    const/4 v11, 0x0

    :goto_6
    and-int/lit8 v13, v2, 0x1

    invoke-virtual {v12, v13, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_3e

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_9

    move-object v6, v11

    goto :goto_7

    :cond_9
    move-object v6, v7

    :goto_7
    if-eqz v8, :cond_a

    const/4 v10, 0x0

    :cond_a
    invoke-virtual {v4}, Li51/i;->f()Li51/g;

    move-result-object v8

    sget-object v18, Li51/f$a;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v18, v8

    const/4 v13, 0x5

    move/from16 v19, v0

    const/4 v0, 0x3

    if-eq v8, v14, :cond_e

    if-eq v8, v5, :cond_d

    if-eq v8, v0, :cond_d

    if-eq v8, v3, :cond_c

    if-ne v8, v13, :cond_b

    goto :goto_8

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    :goto_8
    const/16 v8, 0xa

    goto :goto_9

    :cond_d
    move v8, v13

    goto :goto_9

    :cond_e
    move v8, v3

    :goto_9
    int-to-float v8, v8

    int-to-float v5, v3

    mul-float/2addr v8, v5

    const v16, 0x3f19999a    # 0.6f

    mul-float v7, v8, v16

    invoke-virtual {v4}, Li51/i;->f()Li51/g;

    move-result-object v13

    const/16 v14, 0xf

    int-to-float v14, v14

    mul-float/2addr v14, v5

    invoke-virtual {v13, v14}, Li51/g;->getMediaSize-0ZcVfYs(F)J

    move-result-wide v13

    invoke-virtual {v4}, Li51/i;->f()Li51/g;

    move-result-object v5

    sget-object v3, Li51/g;->LARGE:Li51/g;

    if-eq v5, v3, :cond_10

    invoke-virtual {v4}, Li51/i;->f()Li51/g;

    move-result-object v3

    sget-object v5, Li51/g;->STREAK_LOTTIE_LARGE:Li51/g;

    if-ne v3, v5, :cond_f

    goto :goto_a

    :cond_f
    const/4 v3, 0x0

    goto :goto_b

    :cond_10
    :goto_a
    const/4 v3, 0x1

    :goto_b
    invoke-virtual {v4}, Li51/i;->c()Li51/h;

    move-result-object v5

    instance-of v5, v5, Li51/h$a;

    invoke-virtual {v12, v5}, Lp1/q;->h(Z)Z

    move-result v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_11

    if-ne v0, v9, :cond_13

    :cond_11
    invoke-virtual {v4}, Li51/i;->c()Li51/h;

    move-result-object v0

    instance-of v0, v0, Li51/h$a;

    if-eqz v0, :cond_12

    sget-object v0, Lv41/s;->LOADING:Lv41/s;

    goto :goto_c

    :cond_12
    sget-object v0, Lv41/s;->READY:Lv41/s;

    :goto_c
    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v0, Lp1/c1;

    invoke-virtual {v4}, Li51/i;->e()Z

    move-result v5

    invoke-virtual {v12, v7}, Lp1/q;->d(F)Z

    move-result v23

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v23, :cond_14

    if-ne v15, v9, :cond_15

    :cond_14
    new-instance v15, Lb01/k;

    const/4 v1, 0x5

    invoke-direct {v15, v7, v1}, Lb01/k;-><init>(FI)V

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v5, v15}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->H:Lb2/m;

    const/4 v7, 0x0

    invoke-static {v5, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move v15, v8

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v23, La3/l;->a:La3/k;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v23, v9

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-eqz v4, :cond_16

    invoke-virtual {v12, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_16
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_d
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v12, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    move-object/from16 v25, v5

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v27, v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_18

    goto :goto_e

    :cond_17
    move-object/from16 v27, v6

    :goto_e
    invoke-static {v7, v12, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Li51/i;->c()Li51/h;

    move-result-object v1

    instance-of v6, v1, Li51/h$d;

    sget-object v7, Ly2/j;->b:Ly2/b1;

    if-eqz v6, :cond_19

    const v2, -0x3b8caa65

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    check-cast v1, Li51/h$d;

    invoke-virtual {v1}, Li51/h$d;->a()Lv41/r0;

    move-result-object v6

    move-object v1, v5

    invoke-static {v13, v14, v11}, Landroidx/compose/foundation/layout/d;->q(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move v2, v15

    const/high16 v15, 0xc00000

    const/16 v22, 0x1

    const/16 v16, 0x17c

    move-wide/from16 v28, v13

    move-object v14, v12

    move-object v12, v7

    const/4 v7, 0x0

    move-object v13, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v30, v10

    const/4 v10, 0x0

    move-object/from16 v31, v11

    const/4 v11, 0x0

    move-object/from16 v32, v13

    const/4 v13, 0x0

    move-object/from16 p3, v0

    move-object/from16 v36, v1

    move/from16 p2, v2

    move/from16 v24, v3

    move-object/from16 p1, v4

    move-object/from16 v33, v23

    move-object/from16 v34, v25

    move-wide/from16 v3, v28

    move-object/from16 v2, v31

    move-object/from16 v35, v32

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object/from16 v31, v27

    invoke-static/range {v5 .. v16}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move/from16 v13, p2

    move-object/from16 v14, p3

    move-object/from16 v15, v30

    goto/16 :goto_11

    :cond_19
    move-object/from16 p3, v0

    move/from16 v24, v3

    move-object/from16 p1, v4

    move-object/from16 v36, v5

    move-object/from16 v35, v8

    move-object/from16 v33, v9

    move-wide v3, v13

    move-object/from16 v34, v25

    move-object/from16 v31, v27

    const/4 v0, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    move v5, v2

    move-object v13, v7

    move-object v2, v11

    move v11, v15

    move-object v15, v10

    instance-of v6, v1, Li51/h$c;

    if-eqz v6, :cond_1a

    const v5, -0x3b88b4b8

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-static {v3, v4, v2}, Landroidx/compose/foundation/layout/d;->q(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    check-cast v1, Li51/h$c;

    invoke-virtual {v1}, Li51/h$c;->a()Lkd1/o;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v12

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object v9, v13

    const/16 v13, 0x6030

    move-object v1, v14

    const/16 v14, 0x68

    const-string v6, ""

    const/4 v8, 0x0

    const/4 v10, 0x0

    move v7, v11

    const/4 v11, 0x0

    move v1, v7

    move-object/from16 v7, v22

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_f
    move-object/from16 v14, p3

    move v13, v1

    goto/16 :goto_11

    :cond_1a
    instance-of v6, v1, Li51/h$b;

    if-eqz v6, :cond_1b

    const v5, -0x3b840378

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-static {v3, v4, v2}, Landroidx/compose/foundation/layout/d;->q(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    check-cast v1, Li51/h$b;

    invoke-virtual {v1}, Li51/h$b;->a()Lkd1/o;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v12

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object v9, v13

    const/16 v13, 0x6030

    move-object v7, v14

    const/16 v14, 0x68

    const-string v6, ""

    const/4 v8, 0x0

    const/4 v10, 0x0

    move v1, v11

    const/4 v11, 0x0

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1b
    move v13, v11

    instance-of v6, v1, Li51/h$a;

    if-eqz v6, :cond_3d

    const v6, 0x696f82eb

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    check-cast v1, Li51/h$a;

    invoke-virtual {v1}, Li51/h$a;->a()Li51/s;

    move-result-object v1

    invoke-static {v3, v4, v2}, Landroidx/compose/foundation/layout/d;->q(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v14, p3

    invoke-virtual {v12, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit16 v5, v5, 0x380

    const/16 v8, 0x100

    if-ne v5, v8, :cond_1c

    const/4 v5, 0x1

    goto :goto_10

    :cond_1c
    move v5, v0

    :goto_10
    or-int/2addr v5, v7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_1d

    move-object/from16 v5, v23

    if-ne v7, v5, :cond_1e

    :cond_1d
    new-instance v7, Lb30/r;

    const/16 v5, 0xe

    invoke-direct {v7, v15, v14, v5}, Lb30/r;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/16 v11, 0x8

    const/4 v8, 0x0

    move-object v5, v1

    move-object v9, v12

    invoke-static/range {v5 .. v11}, Li51/r;->d(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual/range {p0 .. p0}, Li51/i;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    if-eqz v7, :cond_1f

    invoke-static {v7}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-static {v14}, Li51/f;->e(Lp1/c1;)Lv41/s;

    move-result-object v1

    sget-object v5, Lv41/s;->READY:Lv41/s;

    if-ne v1, v5, :cond_1f

    goto :goto_12

    :cond_1f
    const/4 v7, 0x0

    :goto_12
    if-nez v7, :cond_20

    const v1, -0x3b75ca10

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object v1, v15

    const/4 v4, 0x1

    goto/16 :goto_2d

    :cond_20
    const v1, -0x3b75ca0f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Li51/i;->f()Li51/g;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v18, v1

    const/4 v5, 0x6

    const/4 v6, 0x1

    if-eq v1, v6, :cond_26

    const/4 v8, 0x2

    if-eq v1, v8, :cond_24

    const/4 v9, 0x3

    if-eq v1, v9, :cond_24

    const/4 v9, 0x4

    if-eq v1, v9, :cond_22

    const/4 v9, 0x5

    if-ne v1, v9, :cond_21

    goto :goto_13

    :cond_21
    const v1, 0x32c2f8e7

    invoke-static {v1, v12, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_22
    const/4 v9, 0x5

    :goto_13
    const v1, 0x32c325c6

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-static {v7, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v12, v0}, Li51/f;->j(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Z

    move-result v1

    if-eqz v1, :cond_23

    const v1, 0x32c32de4

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->w()Lb91/a;

    move-result-object v10

    invoke-virtual {v1, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->w()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v39

    const/16 v1, 0x3c

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v42

    const/16 v52, 0x0

    const v53, 0xfffffd

    const-wide/16 v40, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const-wide/16 v49, 0x0

    const/16 v51, 0x0

    invoke-static/range {v39 .. v53}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v1

    const/4 v14, 0x0

    invoke-static {v10, v1, v14, v8, v14}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v1

    :goto_14
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_23
    const/4 v14, 0x0

    const v1, 0x32c33983

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->u()Lb91/a;

    move-result-object v1

    goto :goto_14

    :goto_15
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_24
    const/4 v9, 0x5

    const/4 v14, 0x0

    const v1, 0x32c30e42

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-static {v7, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v12, v0}, Li51/f;->j(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Z

    move-result v1

    if-eqz v1, :cond_25

    const v1, 0x32c31603

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->y()Lb91/a;

    move-result-object v1

    :goto_16
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_25
    const v1, 0x32c319c3

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->x()Lb91/a;

    move-result-object v1

    goto :goto_16

    :goto_17
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_26
    const/4 v8, 0x2

    const/4 v9, 0x5

    const/4 v14, 0x0

    const v1, 0x32c30243

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->y()Lb91/a;

    move-result-object v1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual/range {p0 .. p0}, Li51/i;->f()Li51/g;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v18, v10

    const/16 v11, 0x8

    if-eq v10, v6, :cond_2a

    if-eq v10, v8, :cond_29

    const/4 v5, 0x3

    if-eq v10, v5, :cond_29

    const/4 v5, 0x4

    if-eq v10, v5, :cond_28

    if-ne v10, v9, :cond_27

    goto :goto_19

    :cond_27
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_28
    :goto_19
    int-to-float v5, v8

    :goto_1a
    int-to-float v9, v11

    mul-float/2addr v5, v9

    move/from16 v9, v24

    goto :goto_1b

    :cond_29
    int-to-float v5, v6

    goto :goto_1a

    :cond_2a
    const-wide/high16 v9, 0x3fd0000000000000L    # 0.25

    double-to-float v5, v9

    goto :goto_1a

    :goto_1b
    invoke-static {v2, v14, v9, v6}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v11, 0x0

    invoke-static {v10, v11, v13, v6}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Lb2/e;->E:Lb2/m;

    invoke-static {v13, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object/from16 v30, v15

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_2b

    move-object/from16 v6, v33

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_1c
    move-object/from16 v11, p1

    goto :goto_1d

    :cond_2b
    move-object/from16 v6, v33

    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_1c

    :goto_1d
    invoke-static {v12, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v13, v34

    invoke-static {v12, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-nez v15, :cond_2c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2d

    :cond_2c
    move-object/from16 v8, v35

    goto :goto_1f

    :cond_2d
    move-object/from16 v8, v35

    :goto_1e
    move-object/from16 v14, v36

    goto :goto_20

    :goto_1f
    invoke-static {v14, v12, v14, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1e

    :goto_20
    invoke-static {v12, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Li51/i;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    if-eqz v10, :cond_2e

    invoke-static {v10}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v15

    if-eqz v15, :cond_2e

    goto :goto_21

    :cond_2e
    const/4 v10, 0x0

    :goto_21
    if-nez v10, :cond_2f

    const v10, 0x6df95422

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    goto :goto_22

    :cond_2f
    const v15, 0x6df95423

    invoke-virtual {v12, v15}, Lp1/q;->e0(I)V

    invoke-static {v10, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_22
    if-eqz v10, :cond_30

    invoke-static {v7, v10}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_31

    :cond_30
    move-object v15, v7

    :cond_31
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v15

    const/16 v0, 0xc

    move-wide/from16 v28, v3

    const/4 v3, 0x2

    invoke-static {v15, v3, v0}, Le93/b;->n(III)I

    move-result v0

    int-to-float v0, v0

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v0, v3

    cmpg-float v3, v0, v19

    if-gez v3, :cond_32

    move/from16 v40, v19

    goto :goto_23

    :cond_32
    move/from16 v40, v0

    :goto_23
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v0, v2}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v39

    const/16 v48, 0x0

    const v49, 0x7fffe

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-static/range {v39 .. v49}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v3, 0x1e

    invoke-static {v3}, Lt0/j;->b(I)Lt0/i;

    move-result-object v3

    invoke-static {v0, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v39, Li2/t;->b:Li2/s;

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    move/from16 v18, v5

    invoke-virtual {v15}, Ly81/i;->w()J

    move-result-wide v4

    const v15, 0x3f666666    # 0.9f

    invoke-static {v15, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v15, Li2/x;

    invoke-direct {v15, v4, v5}, Li2/x;-><init>(J)V

    const/4 v4, 0x6

    invoke-virtual {v3, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->w()J

    move-result-wide v4

    move-object/from16 p1, v7

    const v7, 0x3f333333    # 0.7f

    invoke-static {v7, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v7, Li2/x;

    invoke-direct {v7, v4, v5}, Li2/x;-><init>(J)V

    const/4 v4, 0x6

    invoke-virtual {v3, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->w()J

    move-result-wide v4

    move/from16 v24, v9

    const/high16 v9, 0x3f000000    # 0.5f

    invoke-static {v9, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v9, Li2/x;

    invoke-direct {v9, v4, v5}, Li2/x;-><init>(J)V

    const/4 v4, 0x6

    invoke-virtual {v3, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->w()J

    move-result-wide v4

    move-object/from16 v23, v10

    const v10, 0x3e99999a    # 0.3f

    invoke-static {v10, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v10, Li2/x;

    invoke-direct {v10, v4, v5}, Li2/x;-><init>(J)V

    sget-wide v4, Li2/x;->m:J

    move-object/from16 v36, v14

    new-instance v14, Li2/x;

    invoke-direct {v14, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array {v15, v7, v9, v10, v14}, [Li2/x;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v40

    const/16 v44, 0xe

    const-wide/16 v41, 0x0

    invoke-static/range {v39 .. v44}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v7, 0x6

    const/4 v14, 0x0

    invoke-static {v0, v4, v14, v5, v7}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v0, v12, v4}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Li51/i;->h()Li51/p;

    move-result-object v0

    sget-object v4, Li51/f$a;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_35

    const/4 v5, 0x2

    if-eq v0, v5, :cond_34

    const/4 v5, 0x3

    if-ne v0, v5, :cond_33

    const v0, 0x7f6be3cd

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->F()J

    move-result-wide v9

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_24
    move-wide/from16 v40, v9

    goto :goto_25

    :cond_33
    const/4 v0, 0x0

    const v1, 0x7f6bc045

    invoke-static {v1, v12, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_34
    const/4 v0, 0x0

    const v5, 0x7f6bd8f2

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->m0()J

    move-result-wide v9

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_24

    :cond_35
    const/4 v0, 0x0

    const v5, 0x7f6bcd31

    invoke-static {v12, v5, v3, v12, v7}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v9

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_24

    :goto_25
    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v0

    iget-object v0, v0, Ll3/v0;->a:Ll3/m0;

    iget-wide v9, v0, Ll3/m0;->b:J

    const-wide v14, 0xff00000000L

    and-long/2addr v14, v9

    const-wide/16 v33, 0x0

    cmp-long v0, v14, v33

    if-nez v0, :cond_36

    invoke-static/range {v17 .. v17}, Lv63/c;->h(I)J

    move-result-wide v9

    :cond_36
    const-wide v14, 0x100000000L

    if-eqz v24, :cond_3b

    const v0, 0x6e1362f3

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v42

    const v0, 0x3f333333    # 0.7f

    invoke-static {v9, v10, v14, v15, v0}, Ld13/a;->d(JJF)J

    move-result-wide v45

    const/16 v55, 0x0

    const v56, 0xfffffd

    const-wide/16 v43, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const-wide/16 v49, 0x0

    const/16 v51, 0x0

    const-wide/16 v52, 0x0

    const/16 v54, 0x0

    invoke-static/range {v42 .. v56}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v0

    const/4 v3, 0x2

    const/4 v14, 0x0

    invoke-static {v1, v0, v14, v3, v14}, Lb91/a;->c(Lb91/a;Ll3/v0;Lb91/b;ILjava/lang/Object;)Lb91/a;

    move-result-object v0

    move/from16 v5, v18

    const/4 v7, 0x0

    invoke-static {v2, v5, v7, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->a:Ll0/e;

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v7, 0x0

    invoke-static {v3, v5, v12, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_37

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_26

    :cond_37
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_26
    invoke-static {v12, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_39

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_38

    goto :goto_28

    :cond_38
    :goto_27
    move-object/from16 v14, v36

    goto :goto_29

    :cond_39
    :goto_28
    invoke-static {v5, v12, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_27

    :goto_29
    invoke-static {v12, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Ly2/d;->a:Ly2/m;

    new-instance v6, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v6, v2}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const v29, 0xc00db0

    move-object/from16 v15, v30

    const v30, 0xc7f8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v7, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v5, v23

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v28, 0x0

    move-object/from16 v25, v1

    move-object/from16 v38, v5

    move-object v1, v7

    move-wide/from16 v7, v40

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    if-nez v38, :cond_3a

    const v0, 0x6ba951f4

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_2a

    :cond_3a
    const v3, 0x6ba951f5

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    new-instance v6, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v6, v2}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const v29, 0xc00db0

    const v30, 0xc7f8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v28, 0x0

    move-object/from16 v25, v0

    move-object/from16 v5, v38

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v27

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_2a
    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_2c

    :cond_3b
    move-object/from16 v0, p1

    move-object/from16 v25, v1

    move/from16 v5, v18

    move-object/from16 v3, v23

    move-object/from16 v1, v30

    move-wide/from16 v7, v40

    const v6, 0x6e29ca8e

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    new-instance v6, Ll3/d;

    invoke-direct {v6}, Ll3/d;-><init>()V

    invoke-virtual {v6, v0}, Ll3/d;->b(Ljava/lang/String;)V

    if-eqz v3, :cond_3c

    new-instance v37, Ll3/m0;

    const-wide v14, 0x200000000L

    const v0, 0x3f333333    # 0.7f

    invoke-static {v0, v14, v15}, Lv63/c;->j(FJ)J

    move-result-wide v40

    const/16 v55, 0x0

    const v56, 0xfffd

    const-wide/16 v38, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const-wide/16 v52, 0x0

    const/16 v54, 0x0

    invoke-direct/range {v37 .. v56}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v0, v37

    invoke-virtual {v6, v0}, Ll3/d;->j(Ll3/m0;)I

    move-result v11

    :try_start_0
    invoke-virtual {v6, v3}, Ll3/d;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v6, v11}, Ll3/d;->f(I)V

    goto :goto_2b

    :catchall_0
    move-exception v0

    invoke-virtual {v6, v11}, Ll3/d;->f(I)V

    throw v0

    :cond_3c
    :goto_2b
    invoke-virtual {v6}, Ll3/d;->k()Ll3/g;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v6, 0x2

    invoke-static {v2, v5, v3, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {v28 .. v29}, Ly3/h;->c(J)F

    move-result v5

    invoke-static {v2, v3, v5, v4}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {v25 .. v25}, Lb91/a;->d()Ll3/v0;

    move-result-object v39

    const/16 v52, 0x0

    const v53, 0xff7ffe

    const-wide/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x3

    const-wide/16 v49, 0x0

    const/16 v51, 0x0

    move-wide/from16 v40, v7

    invoke-static/range {v39 .. v53}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v7

    const/high16 v2, 0x3f000000    # 0.5f

    const-wide v13, 0x100000000L

    invoke-static {v9, v10, v13, v14, v2}, Ld13/a;->d(JJF)J

    move-result-wide v2

    const/4 v5, 0x4

    invoke-static {v5, v2, v3, v9, v10}, Lu0/y0;->a(IJJ)Lu0/e;

    move-result-object v15

    const v17, 0x1b6000

    const/16 v18, 0x388

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object/from16 v27, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v5, v0

    move-object/from16 v16, v27

    invoke-static/range {v5 .. v18}, Lq83/g;->a(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Li2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v16

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_2c
    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_2d
    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    move-object v6, v1

    move-object/from16 v5, v31

    goto :goto_2e

    :cond_3d
    const v1, 0x696f0a3a

    invoke-static {v1, v12, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_3e
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v5, v7

    move-object v6, v10

    :goto_2e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_3f

    new-instance v0, Lhy0/v;

    const/4 v3, 0x5

    move-object/from16 v4, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_3f
    return-void
.end method

.method private static final e(Lp1/c1;)Lv41/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lv41/s;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv41/s;

    return-object p0
.end method

.method private static final f(Lp1/c1;Lv41/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lv41/s;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final g(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 7

    const-string v0, "$this$applyIf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, p0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lp1/c1;Lv41/s;)Ll83/a0;
    .locals 1

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Li51/f;->f(Lp1/c1;Lv41/s;)V

    if-eqz p0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Li51/f;->d(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Z
    .locals 0

    const-string p1, "textOverlay"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/4 p1, 0x5

    if-le p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
