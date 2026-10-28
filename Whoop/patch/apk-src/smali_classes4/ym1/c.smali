.class public abstract Lym1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013\u00b2\u0006\u000c\u0010\u0012\u001a\u00020\r8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lht2/f;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Lht2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "any",
        "",
        "isInPlan",
        "n",
        "(Ljava/lang/Object;Z)Ljava/lang/Object;",
        "Lgt2/c;",
        "homeTileViewState",
        "isExpanded",
        "m",
        "(Lgt2/c;Z)Lgt2/c;",
        "weeklyPlanHomeTileViewState",
        "home_release"
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
.method public static synthetic a(Lht2/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lym1/c;->l(Lht2/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lym1/c;->k(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lym1/c;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lym1/c;->i(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lym1/c;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lht2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lht2/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x3d30005e    # -103.99928f

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    const/16 v8, 0x20

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v8

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v10, 0x0

    if-eq v6, v7, :cond_6

    const/4 v6, 0x1

    goto :goto_5

    :cond_6
    move v6, v10

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v5, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_3f

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_7

    new-instance v3, Lvb1/a;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lvb1/a;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v12, v3

    goto :goto_6

    :cond_8
    move-object v12, v4

    :goto_6
    invoke-virtual {v1}, Lht2/f;->c()Lgt2/c;

    move-result-object v3

    if-nez v3, :cond_9

    sget-object v3, Lgt2/c$b;->b:Lgt2/c$b;

    :cond_9
    move-object v14, v3

    sget v3, Lgt2/c;->a:I

    const v4, 0x51c1188b

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v4, v5, v6}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v4

    const-string v7, "safe-design-view-model-injection-android"

    invoke-interface {v4, v7}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v4

    const-class v7, Lft2/a;

    const/16 v13, 0x800

    const/16 v19, 0x0

    const/4 v15, 0x0

    move/from16 p1, v6

    const/4 v6, 0x0

    if-nez v4, :cond_22

    const v4, -0x2a32dbfc

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-static {v5}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v21

    if-nez v21, :cond_a

    const v4, -0x2a322beb

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    move-object v4, v15

    move-object/from16 v9, v19

    goto/16 :goto_c

    :cond_a
    const v4, -0x2a322bea

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v5, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const-string v9, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v4

    check-cast v20, Landroid/app/Application;

    and-int/lit8 v4, v3, 0x70

    xor-int/lit8 v4, v4, 0x30

    if-le v4, v8, :cond_b

    invoke-virtual {v5, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    and-int/lit8 v4, v3, 0x30

    if-ne v4, v8, :cond_d

    :cond_c
    const/4 v4, 0x1

    goto :goto_7

    :cond_d
    move v4, v10

    :goto_7
    and-int/lit8 v9, v3, 0xe

    xor-int/lit8 v9, v9, 0x6

    if-le v9, v2, :cond_e

    invoke-virtual {v5, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    :cond_e
    and-int/lit8 v9, v3, 0x6

    if-ne v9, v2, :cond_10

    :cond_f
    const/4 v9, 0x1

    goto :goto_8

    :cond_10
    move v9, v10

    :goto_8
    or-int/2addr v4, v9

    and-int/lit16 v9, v3, 0x1c00

    xor-int/lit16 v9, v9, 0xc00

    if-le v9, v13, :cond_11

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    :cond_11
    and-int/lit16 v9, v3, 0xc00

    if-ne v9, v13, :cond_13

    :cond_12
    const/4 v9, 0x1

    goto :goto_9

    :cond_13
    move v9, v10

    :goto_9
    or-int/2addr v4, v9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_15

    if-ne v9, v11, :cond_14

    goto :goto_a

    :cond_14
    move-object v4, v15

    goto :goto_b

    :cond_15
    :goto_a
    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v22

    new-instance v4, Lld1/b;

    invoke-direct {v4, v14}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v24, v4

    move-object/from16 v23, v6

    move-object/from16 v25, v15

    invoke-static/range {v20 .. v25}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v9

    move-object/from16 v4, v25

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v9, Lld1/c;

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    :goto_c
    if-nez v9, :cond_21

    const v7, -0x2a2a887e

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v7, v3, 0x70

    xor-int/lit8 v7, v7, 0x30

    if-le v7, v8, :cond_16

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    :cond_16
    and-int/lit8 v4, v3, 0x30

    if-ne v4, v8, :cond_18

    :cond_17
    const/4 v4, 0x1

    goto :goto_d

    :cond_18
    move v4, v10

    :goto_d
    and-int/lit8 v7, v3, 0xe

    xor-int/lit8 v7, v7, 0x6

    if-le v7, v2, :cond_19

    invoke-virtual {v5, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    :cond_19
    and-int/lit8 v7, v3, 0x6

    if-ne v7, v2, :cond_1b

    :cond_1a
    const/4 v2, 0x1

    goto :goto_e

    :cond_1b
    move v2, v10

    :goto_e
    or-int/2addr v2, v4

    and-int/lit16 v4, v3, 0x1c00

    xor-int/lit16 v4, v4, 0xc00

    if-le v4, v13, :cond_1c

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    :cond_1c
    and-int/lit16 v4, v3, 0xc00

    if-ne v4, v13, :cond_1e

    :cond_1d
    const/4 v4, 0x1

    goto :goto_f

    :cond_1e
    move v4, v10

    :goto_f
    or-int/2addr v2, v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1f

    if-ne v4, v11, :cond_20

    :cond_1f
    new-instance v4, Lld1/b;

    invoke-direct {v4, v14}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object v9, v4

    check-cast v9, Lld1/b;

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_21
    const v2, -0x1a22aa39

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    goto/16 :goto_15

    :cond_22
    move-object v4, v15

    const v9, -0x2a28ba09

    invoke-static {v5, v9, v10, v5}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v9

    sget-object v15, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v5, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/content/Context;

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v15

    instance-of v10, v15, Landroid/app/Application;

    if-eqz v10, :cond_23

    check-cast v15, Landroid/app/Application;

    goto :goto_11

    :cond_23
    move-object/from16 v15, v19

    :goto_11
    and-int/lit8 v10, v3, 0x70

    xor-int/lit8 v10, v10, 0x30

    if-le v10, v8, :cond_24

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_25

    :cond_24
    and-int/lit8 v10, v3, 0x30

    if-ne v10, v8, :cond_26

    :cond_25
    const/4 v10, 0x1

    goto :goto_12

    :cond_26
    const/4 v10, 0x0

    :goto_12
    and-int/lit8 v16, v3, 0xe

    xor-int/lit8 v4, v16, 0x6

    if-le v4, v2, :cond_27

    invoke-virtual {v5, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_28

    :cond_27
    and-int/lit8 v4, v3, 0x6

    if-ne v4, v2, :cond_29

    :cond_28
    const/4 v2, 0x1

    goto :goto_13

    :cond_29
    const/4 v2, 0x0

    :goto_13
    or-int/2addr v2, v10

    and-int/lit16 v4, v3, 0x1c00

    xor-int/lit16 v4, v4, 0xc00

    if-le v4, v13, :cond_2a

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2b

    :cond_2a
    and-int/lit16 v4, v3, 0xc00

    if-ne v4, v13, :cond_2c

    :cond_2b
    const/4 v4, 0x1

    goto :goto_14

    :cond_2c
    const/4 v4, 0x0

    :goto_14
    or-int/2addr v2, v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_2d

    if-ne v4, v11, :cond_2e

    :cond_2d
    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v16

    move-object/from16 v17, v6

    move-object v13, v9

    const/16 v18, 0x0

    invoke-static/range {v13 .. v18}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v4

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    move-object v9, v4

    check-cast v9, Lld1/c;

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_15
    instance-of v2, v9, Lft2/a;

    if-eqz v2, :cond_2f

    move-object v2, v9

    check-cast v2, Lft2/a;

    goto :goto_16

    :cond_2f
    move-object/from16 v2, v19

    :goto_16
    if-eqz v2, :cond_30

    invoke-virtual {v2}, Lft2/a;->getViewState()Lec3/f2;

    move-result-object v2

    goto :goto_17

    :cond_30
    move-object/from16 v2, v19

    :goto_17
    if-nez v2, :cond_31

    const v2, -0x74f2ed51

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    const/4 v4, 0x0

    :goto_18
    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_31
    const/4 v4, 0x0

    const v6, 0x4ecedf92    # 1.7353792E9f

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-static {v2, v5, v4}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v19

    goto :goto_18

    :goto_19
    if-nez v19, :cond_32

    const v2, 0x4ecee4b5    # 1.7355475E9f

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v2

    move v4, v3

    sget-object v3, Lgt2/c$b;->b:Lgt2/c$b;

    sget v6, Lgt2/c$b;->c:I

    shl-int/lit8 v6, v6, 0x3

    const/4 v7, 0x2

    move v10, v4

    const/4 v4, 0x0

    move/from16 v13, p1

    invoke-static/range {v2 .. v7}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v19

    const/4 v2, 0x0

    :goto_1a
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_32
    move/from16 v13, p1

    move v10, v3

    const/4 v2, 0x0

    const v3, 0x4eced915

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    goto :goto_1a

    :goto_1b
    invoke-static/range {v19 .. v19}, Lym1/c;->h(Lp1/t2;)Lgt2/c;

    move-result-object v3

    invoke-virtual {v1}, Lht2/f;->e()Z

    move-result v2

    invoke-static {v3, v2}, Lym1/c;->m(Lgt2/c;Z)Lgt2/c;

    move-result-object v2

    instance-of v4, v3, Lgt2/c$c;

    move-object v6, v3

    move-object v3, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_3b

    const v4, 0x1267a5c

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    move-object v4, v6

    check-cast v4, Lgt2/c$c;

    invoke-virtual {v4}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v6

    instance-of v7, v6, Lht2/a;

    if-eqz v7, :cond_36

    const v4, 0x1279979

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v8, :cond_33

    const/4 v0, 0x1

    goto :goto_1c

    :cond_33
    const/4 v0, 0x0

    :goto_1c
    or-int/2addr v0, v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_34

    if-ne v4, v11, :cond_35

    :cond_34
    new-instance v4, Lym1/b;

    const/4 v0, 0x0

    invoke-direct {v4, v9, v12, v0}, Lym1/b;-><init>(Lld1/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_35
    check-cast v4, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v10, 0x3

    or-int/lit8 v6, v0, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lht2/e;->L(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_36
    instance-of v2, v6, Lh01/q;

    if-eqz v2, :cond_3a

    const v2, 0x12e5883

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v2

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v8, :cond_37

    const/4 v9, 0x1

    goto :goto_1d

    :cond_37
    const/4 v9, 0x0

    :goto_1d
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_38

    if-ne v0, v11, :cond_39

    :cond_38
    new-instance v0, Lb11/b;

    const/16 v3, 0x15

    invoke-direct {v0, v12, v3}, Lb11/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_39
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, v5

    move-object v5, v0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v6

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_3a
    const/4 v2, 0x0

    const v0, 0x1309c4f

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_3b
    const v3, 0x130f550

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v8, :cond_3c

    const/4 v0, 0x1

    goto :goto_1f

    :cond_3c
    const/4 v0, 0x0

    :goto_1f
    or-int/2addr v0, v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_3d

    if-ne v3, v11, :cond_3e

    :cond_3d
    new-instance v3, Lym1/b;

    const/4 v0, 0x1

    invoke-direct {v3, v9, v12, v0}, Lym1/b;-><init>(Lld1/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3e
    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v10, 0x3

    or-int/2addr v0, v13

    const/4 v7, 0x0

    move-object v3, v6

    move v6, v0

    invoke-static/range {v2 .. v7}, Lht2/e;->L(Landroidx/compose/ui/Modifier;Lgt2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_20
    move-object v3, v12

    goto :goto_21

    :cond_3f
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v4

    :goto_21
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_40

    new-instance v0, Lbz0/a;

    const/4 v5, 0x6

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lbz0/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_40
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lp1/t2;)Lgt2/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lgt2/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgt2/c;

    return-object p0
.end method

.method private static final i(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lgt2/b$b;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lld1/c;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    invoke-static {p2, p0}, Lym1/c;->n(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lym1/c;->n(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lgt2/b$b;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lld1/c;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lht2/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lym1/c;->f(Lht2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Lgt2/c;Z)Lgt2/c;
    .locals 12

    const-string v0, "homeTileViewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lgt2/c$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lgt2/c$c;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lgt2/c$c;->b()Lm91/u;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    instance-of v3, v2, Lht2/a;

    if-eqz v3, :cond_2

    move-object v1, v2

    check-cast v1, Lht2/a;

    :cond_2
    move-object v2, v1

    if-eqz v2, :cond_3

    const/16 v10, 0x7d

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v4, p1

    invoke-static/range {v2 .. v11}, Lht2/a;->b(Lht2/a;Lht2/h;ZLjava/lang/String;Ljava/lang/String;Lht2/g;Ljava/util/List;Lny0/h;ILjava/lang/Object;)Lht2/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgt2/c$c;->a(Lm91/u;)Lgt2/c$c;

    move-result-object p1

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    return-object p0
.end method

.method public static final n(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 10

    const-string v0, "any"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/navigation/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/whoop/navigation/e;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    :cond_1
    instance-of v0, v1, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;

    if-eqz v0, :cond_2

    move-object v2, p0

    check-cast v2, Lcom/whoop/navigation/e;

    move-object v3, v1

    check-cast v3, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v5, 0x0

    const-string v6, "weekly_plan_tile_on_home"

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;->copy$default(Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;

    move-result-object v4

    const/4 v6, 0x5

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of p1, v1, Lcom/whoop/navigation/ChallengeLandingScreenModel;

    if-eqz p1, :cond_3

    move-object v2, p0

    check-cast v2, Lcom/whoop/navigation/e;

    check-cast v1, Lcom/whoop/navigation/ChallengeLandingScreenModel;

    const-string p0, "weekly_plan_tile_on_home"

    invoke-virtual {v1, p0}, Lcom/whoop/navigation/ChallengeLandingScreenModel;->copy(Ljava/lang/String;)Lcom/whoop/navigation/ChallengeLandingScreenModel;

    move-result-object v4

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p0

    :cond_3
    return-object p0
.end method
