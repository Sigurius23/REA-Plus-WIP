.class public abstract Ljm0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aK\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f\u00b2\u0006\u000c\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lcom/whoop/appconfiguration/TabConfiguration;",
        "Ll83/a0;",
        "onTabSelected",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "showCoachBar",
        "showVoiceButton",
        "",
        "coachBarPlaceholder",
        "d",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "Lhm0/d;",
        "viewState",
        "bottom-navigation_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ljm0/b;->f(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lld1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljm0/b;->g(Lld1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ljm0/b;->h(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p6

    const-string v0, "onTabSelected"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, 0x72f2441

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v6, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_5

    move/from16 v5, p2

    invoke-virtual {v10, v5}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_8

    move/from16 v8, p3

    invoke-virtual {v10, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v0, v9

    :goto_7
    and-int/lit8 v9, p7, 0x10

    if-eqz v9, :cond_c

    or-int/lit16 v0, v0, 0x6000

    :cond_b
    move-object/from16 v11, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_b

    move-object/from16 v11, p4

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_8

    :cond_d
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v0, v12

    :goto_9
    and-int/lit16 v12, v0, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    if-eq v12, v13, :cond_e

    const/4 v12, 0x1

    goto :goto_a

    :cond_e
    move v12, v14

    :goto_a
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v10, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_21

    if-eqz v2, :cond_f

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_b

    :cond_f
    move-object v2, v3

    :goto_b
    if-eqz v4, :cond_10

    move v3, v14

    goto :goto_c

    :cond_10
    move v3, v5

    :goto_c
    if-eqz v7, :cond_11

    move v4, v14

    goto :goto_d

    :cond_11
    move v4, v8

    :goto_d
    if-eqz v9, :cond_12

    const-string v5, ""

    goto :goto_e

    :cond_12
    move-object v5, v11

    :goto_e
    new-instance v15, Lhm0/d;

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lhm0/d;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v7, 0x51c1188b

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v7, v10, v8}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v7

    const-string v8, "safe-design-view-model-injection-android"

    invoke-interface {v7, v8}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v7

    const-class v8, Lhm0/c;

    sget-object v9, Lp1/l;->a:Lp1/v0;

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-nez v7, :cond_19

    const v7, -0x2a32dbfc

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-static {v10}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_13

    const v7, -0x2a322beb

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object v7, v11

    move-object v11, v12

    const/4 v13, 0x0

    goto :goto_11

    :cond_13
    const v7, -0x2a322bea

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    const-string v13, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v7

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v7, v13

    invoke-virtual {v10, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v7, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v7, :cond_15

    if-ne v13, v9, :cond_14

    goto :goto_f

    :cond_14
    move-object v7, v11

    move-object v11, v12

    goto :goto_10

    :cond_15
    :goto_f
    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v7, Lld1/b;

    invoke-direct {v7, v15}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v20, v7

    move-object/from16 v21, v11

    move-object/from16 v19, v12

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v13

    move-object/from16 v11, v19

    move-object/from16 v7, v21

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v13, Lld1/c;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_11
    if-nez v13, :cond_18

    const v8, -0x2a2a887e

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_16

    if-ne v8, v9, :cond_17

    :cond_16
    new-instance v8, Lld1/b;

    invoke-direct {v8, v15}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v13, v8

    check-cast v13, Lld1/b;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_18
    const v7, -0x1a22aa39

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_19
    move-object v7, v11

    move-object v11, v12

    const v12, -0x2a28ba09

    invoke-static {v10, v12, v14, v10}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v12

    sget-object v13, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    instance-of v14, v13, Landroid/app/Application;

    if-eqz v14, :cond_1a

    check-cast v13, Landroid/app/Application;

    move-object/from16 v17, v13

    goto :goto_13

    :cond_1a
    const/16 v17, 0x0

    :goto_13
    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_1b

    if-ne v14, v9, :cond_1c

    :cond_1b
    sget-object v13, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v13, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v7

    move-object/from16 v19, v11

    move-object/from16 v16, v15

    move-object v15, v12

    invoke-static/range {v15 .. v20}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v14

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v13, v14

    check-cast v13, Lld1/c;

    const/4 v7, 0x0

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v13}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v7

    new-instance v8, Lhm0/d;

    const/16 v19, 0xf

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v14, v8

    invoke-direct/range {v14 .. v20}, Lhm0/d;-><init>(Ljava/util/List;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x0

    const/4 v12, 0x2

    move-object v14, v9

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v10, v8}, Ldp0/c;->k(Landroidx/compose/runtime/Composer;I)Z

    move-result v9

    invoke-static {v7}, Ljm0/b;->e(Lp1/t2;)Lhm0/d;

    move-result-object v11

    invoke-virtual {v11}, Lhm0/d;->a()Ljava/lang/String;

    move-result-object v11

    invoke-static {v7}, Ljm0/b;->e(Lp1/t2;)Lhm0/d;

    move-result-object v12

    invoke-virtual {v12}, Lhm0/d;->d()Z

    move-result v12

    if-eqz v12, :cond_1d

    goto :goto_15

    :cond_1d
    const/4 v11, 0x0

    :goto_15
    invoke-static {v11, v10, v8}, Ldp0/c;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7}, Ljm0/b;->e(Lp1/t2;)Lhm0/d;

    move-result-object v8

    invoke-virtual {v8}, Lhm0/d;->d()Z

    move-result v8

    if-nez v8, :cond_1e

    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_22

    new-instance v0, Ljm0/a;

    const/4 v8, 0x0

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Ljm0/a;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;III)V

    :goto_16
    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_1e
    invoke-static {v7}, Ljm0/b;->e(Lp1/t2;)Lhm0/d;

    move-result-object v1

    invoke-virtual {v1}, Lhm0/d;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v7}, Ljm0/b;->e(Lp1/t2;)Lhm0/d;

    move-result-object v6

    invoke-virtual {v6}, Lhm0/d;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v7}, Ljm0/b;->e(Lp1/t2;)Lhm0/d;

    move-result-object v7

    invoke-virtual {v7}, Lhm0/d;->b()Z

    move-result v7

    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_1f

    if-ne v11, v14, :cond_20

    :cond_1f
    new-instance v11, Lh31/r;

    const/4 v8, 0x2

    invoke-direct {v11, v13, v8}, Lh31/r;-><init>(Lld1/c;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v11, Lc93/a;

    shl-int/lit8 v8, v0, 0x9

    const v12, 0xfc00

    and-int/2addr v8, v12

    shl-int/lit8 v12, v0, 0xf

    const/high16 v13, 0x1c00000

    and-int/2addr v12, v13

    or-int/2addr v8, v12

    shl-int/lit8 v12, v0, 0x12

    const/high16 v13, 0x70000000

    and-int/2addr v12, v13

    or-int/2addr v12, v8

    shr-int/lit8 v0, v0, 0xc

    and-int/lit8 v13, v0, 0xe

    const/16 v14, 0x20

    move-object v0, v1

    move-object v1, v6

    move-object v6, v11

    move-object v11, v10

    move-object v10, v5

    const/4 v5, 0x0

    move v8, v9

    move v9, v4

    move-object v4, v2

    move v2, v7

    move v7, v3

    move-object/from16 v3, p0

    invoke-static/range {v0 .. v14}, Ljm0/d;->k(Ljava/util/List;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLc93/a;ZZZLjava/lang/String;Landroidx/compose/runtime/Composer;III)V

    move-object v2, v4

    move v3, v7

    move v4, v9

    move-object v5, v10

    move-object v10, v11

    goto :goto_17

    :cond_21
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v3

    move v3, v5

    move v4, v8

    move-object v5, v11

    :goto_17
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_22

    new-instance v0, Ljm0/a;

    const/4 v8, 0x1

    move-object/from16 v1, p0

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Ljm0/a;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;III)V

    goto :goto_16

    :cond_22
    return-void
.end method

.method private static final e(Lp1/t2;)Lhm0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lhm0/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhm0/d;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ljm0/b;->d(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lld1/c;)Ll83/a0;
    .locals 1

    sget-object v0, Lhm0/a$a;->a:Lhm0/a$a;

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ljm0/b;->d(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
