.class public abstract Lwa2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lua2/a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lra2/a;",
        "Ll83/a0;",
        "onAnalyticsEvent",
        "Lta2/a;",
        "onNavigationEvent",
        "g",
        "(Lua2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "settings_release"
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
.method public static synthetic a(Lua2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwa2/a;->m(Lua2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lra2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwa2/a;->h(Lra2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lua2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwa2/a;->j(Lkotlin/jvm/functions/Function1;Lua2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lta2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwa2/a;->i(Lta2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwa2/a;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lwa2/a;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lua2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 64
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lua2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x67f07587

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

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

    if-eqz v5, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_3

    :cond_5
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v0, v9

    :goto_4
    and-int/lit8 v9, p5, 0x4

    if-eqz v9, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v11, v4, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_5

    :cond_8
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v0, v12

    :goto_6
    and-int/lit16 v12, v0, 0x93

    const/16 v13, 0x92

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v12, v13, :cond_9

    move v12, v14

    goto :goto_7

    :cond_9
    move v12, v15

    :goto_7
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v8, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_21

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_a

    new-instance v5, Lw01/e;

    const/16 v7, 0x19

    invoke-direct {v5, v7}, Lw01/e;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v5, v7

    :goto_8
    if-eqz v9, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v12, :cond_c

    new-instance v7, Lw01/e;

    const/16 v9, 0x1a

    invoke-direct {v7, v9}, Lw01/e;-><init>(I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v11, v7

    :cond_d
    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v7

    invoke-virtual {v8, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v9, "android-affiliates-book-time-item"

    invoke-interface {v7, v9}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v31

    const-wide/high16 v6, 0x3ff4000000000000L    # 1.25

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v6, v7, v8, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 p1, v11

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_e

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_9
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    :cond_f
    invoke-static {v7, v8, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v8, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v6, Lea2/s;->g:I

    invoke-static {v6, v8, v15}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v7, v8, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->d1()J

    move-result-wide v10

    invoke-virtual {v7, v8, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->L()Lb91/a;

    move-result-object v25

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v29, v7, 0x12

    const v30, 0x2fffa

    move-object v7, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object/from16 v27, v8

    move-wide/from16 v62, v10

    move-object v11, v7

    move-wide/from16 v7, v62

    const-wide/16 v9, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    move/from16 v19, v15

    const-wide/16 v14, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    move/from16 v23, v19

    const-wide/16 v18, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v24

    const/16 v24, 0x0

    move-object/from16 v34, v26

    const/16 v26, 0x0

    move/from16 v35, v28

    const/16 v28, 0x0

    move-object/from16 v36, p1

    move/from16 v2, v32

    move-object/from16 v38, v33

    move-object/from16 v3, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v1}, Lua2/a;->a()Lkc2/i;

    move-result-object v5

    if-nez v5, :cond_11

    const v5, 0x70f9a3ec

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move-object/from16 v13, v36

    move-object/from16 v12, v38

    const/16 v11, 0x20

    goto :goto_10

    :cond_11
    const v6, 0x70f9a3ed

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    and-int/lit16 v6, v0, 0x380

    const/16 v9, 0x100

    if-ne v6, v9, :cond_12

    const/4 v14, 0x1

    goto :goto_a

    :cond_12
    move v14, v2

    :goto_a
    and-int/lit8 v6, v0, 0xe

    const/4 v7, 0x4

    if-eq v6, v7, :cond_14

    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_13

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    goto :goto_b

    :cond_13
    move v6, v2

    goto :goto_c

    :cond_14
    :goto_b
    const/4 v6, 0x1

    :goto_c
    or-int/2addr v6, v14

    and-int/lit8 v7, v0, 0x70

    const/16 v11, 0x20

    if-ne v7, v11, :cond_15

    const/4 v14, 0x1

    goto :goto_d

    :cond_15
    move v14, v2

    :goto_d
    or-int/2addr v6, v14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v12, v38

    if-nez v6, :cond_17

    if-ne v7, v12, :cond_16

    goto :goto_e

    :cond_16
    move-object/from16 v13, v36

    goto :goto_f

    :cond_17
    :goto_e
    new-instance v7, Lre1/k;

    const/16 v6, 0x12

    move-object/from16 v13, v36

    invoke-direct {v7, v13, v1, v3, v6}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v7, Lc93/a;

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v7, v8, v6, v2}, Lkc2/b;->d(Lkc2/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_10
    sget-object v36, Ly71/o;->p:Ly71/o$c;

    sget v5, Lea2/s;->d:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v37

    sget v5, Lea2/s;->c:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v40

    new-instance v5, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o;->c()I

    move-result v6

    const/4 v14, 0x0

    const/4 v7, 0x2

    invoke-direct {v5, v6, v14, v7, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v60, 0x7fffd6

    const/16 v61, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v42, v5

    invoke-static/range {v36 .. v61}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v6

    and-int/lit16 v15, v0, 0x380

    const/16 v9, 0x100

    if-ne v15, v9, :cond_18

    const/4 v5, 0x1

    goto :goto_11

    :cond_18
    move v5, v2

    :goto_11
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v11, :cond_19

    const/4 v7, 0x1

    goto :goto_12

    :cond_19
    move v7, v2

    :goto_12
    or-int/2addr v5, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_1a

    if-ne v7, v12, :cond_1b

    :cond_1a
    new-instance v7, Ldc0/c;

    const/16 v5, 0x16

    invoke-direct {v7, v13, v5, v3}, Ldc0/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v7, Lc93/a;

    sget v5, Ly71/o;->q:I

    shl-int/lit8 v9, v5, 0x3

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    if-eqz v31, :cond_20

    const v5, 0x71074b4c

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget v5, Lea2/s;->b:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v37

    sget v5, Lea2/s;->a:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v40

    new-instance v5, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o;->e()I

    move-result v6

    const/4 v7, 0x2

    invoke-direct {v5, v6, v14, v7, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v60, 0x7fffd6

    const/16 v61, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    move-object/from16 v42, v5

    invoke-static/range {v36 .. v61}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v6

    const/16 v5, 0x100

    if-ne v15, v5, :cond_1c

    const/4 v14, 0x1

    goto :goto_13

    :cond_1c
    move v14, v2

    :goto_13
    if-ne v0, v11, :cond_1d

    const/4 v0, 0x1

    goto :goto_14

    :cond_1d
    move v0, v2

    :goto_14
    or-int/2addr v0, v14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_1e

    if-ne v5, v12, :cond_1f

    :cond_1e
    new-instance v5, Ldc0/c;

    const/16 v0, 0x17

    invoke-direct {v5, v13, v0, v3}, Ldc0/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object v7, v5

    check-cast v7, Lc93/a;

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_15
    const/4 v0, 0x1

    goto :goto_16

    :cond_20
    const v0, 0x71109385

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_15

    :goto_16
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move-object v2, v3

    move-object v3, v13

    goto :goto_17

    :cond_21
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v2, v7

    move-object v3, v11

    :goto_17
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Lv31/d;

    const/16 v6, 0x18

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lv31/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final h(Lra2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lta2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lua2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    new-instance v0, Lta2/a$c;

    invoke-virtual {p1}, Lua2/a;->a()Lkc2/i;

    move-result-object p1

    invoke-virtual {p1}, Lkc2/i;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lta2/a$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lra2/a$b;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Lra2/a$b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    sget-object v0, Lta2/a$a;->a:Lta2/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lra2/a$c;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lra2/a$c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    new-instance v0, Lta2/a$b;

    new-instance v1, Lj02/m0$g1;

    const-string v2, "https://calendly.com/d/ckkp-5q8-knd/affiliate-1x1-meeting-with-a-whoop-team-member"

    invoke-direct {v1, v2}, Lj02/m0$g1;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lta2/a$b;-><init>(Lj02/m0;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lra2/a$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lra2/a$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lua2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lwa2/a;->g(Lua2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
