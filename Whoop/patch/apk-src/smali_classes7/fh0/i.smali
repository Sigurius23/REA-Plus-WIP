.class public abstract Lfh0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lfh0/h;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lfh0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lfh0/e;",
        "miniArchState",
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
.method public static synthetic a(Lcom/whoop/analytics/AnalyticEventModel;Lld1/c;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfh0/i;->e(Lcom/whoop/analytics/AnalyticEventModel;Lld1/c;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lfh0/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lfh0/i;->f(Landroidx/compose/ui/Modifier;Lfh0/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lfh0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lfh0/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move/from16 v1, p4

    const-string v0, "itemState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x7788c181

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v1, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v1

    :goto_1
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit16 v4, v1, 0x180

    const/16 v13, 0x100

    if-nez v4, :cond_6

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v13

    goto :goto_3

    :cond_5
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_6
    and-int/lit16 v4, v3, 0x93

    const/16 v7, 0x92

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v4, v7, :cond_7

    move v4, v15

    goto :goto_4

    :cond_7
    move v4, v14

    :goto_4
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v10, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_1c

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v0, v2

    :goto_5
    new-instance v16, Lfh0/e;

    invoke-virtual {v6}, Lfh0/h;->k()Z

    move-result v17

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lfh0/e;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v16

    const v2, 0x51c1188b

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v2, v10, v4}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v2

    const-string v4, "safe-design-view-model-injection-android"

    invoke-interface {v2, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    const-class v4, Lfh0/g;

    sget-object v9, Lp1/l;->a:Lp1/v0;

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-nez v2, :cond_f

    const v2, -0x2a32dbfc

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-static {v10}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_9

    const v2, -0x2a322beb

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object v2, v11

    move-object v11, v12

    const/4 v7, 0x0

    goto :goto_8

    :cond_9
    const v2, -0x2a322bea

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v7, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v2

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v10, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_b

    if-ne v7, v9, :cond_a

    goto :goto_6

    :cond_a
    move-object v2, v11

    move-object v11, v12

    goto :goto_7

    :cond_b
    :goto_6
    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v2, Lld1/b;

    invoke-direct {v2, v8}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v20, v2

    move-object/from16 v21, v11

    move-object/from16 v19, v12

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v7

    move-object/from16 v11, v19

    move-object/from16 v2, v21

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_7
    check-cast v7, Lld1/c;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_8
    if-nez v7, :cond_e

    const v4, -0x2a2a887e

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_c

    if-ne v4, v9, :cond_d

    :cond_c
    new-instance v4, Lld1/b;

    invoke-direct {v4, v8}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v7, v4

    check-cast v7, Lld1/b;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    const v2, -0x1a22aa39

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object v2, v7

    goto :goto_c

    :cond_f
    move-object v2, v11

    move-object v11, v12

    const v7, -0x2a28ba09

    invoke-static {v10, v7, v14, v10}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v16

    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    instance-of v12, v7, Landroid/app/Application;

    if-eqz v12, :cond_10

    check-cast v7, Landroid/app/Application;

    move-object/from16 v18, v7

    goto :goto_b

    :cond_10
    const/16 v18, 0x0

    :goto_b
    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v7, v12

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v7, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v7, :cond_11

    if-ne v12, v9, :cond_12

    :cond_11
    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    move-object/from16 v21, v2

    move-object/from16 v17, v8

    move-object/from16 v20, v11

    invoke-static/range {v16 .. v21}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v12

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v7, v12

    check-cast v7, Lld1/c;

    goto :goto_a

    :goto_c
    invoke-virtual {v2}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v7

    const/4 v11, 0x0

    const/4 v12, 0x2

    move-object v4, v9

    const/4 v9, 0x0

    move-object v14, v4

    const/4 v4, 0x0

    invoke-static/range {v7 .. v12}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v7

    invoke-virtual {v6}, Lfh0/h;->k()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v9, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_13

    if-ne v11, v14, :cond_14

    :cond_13
    new-instance v11, Lfh0/i$a;

    invoke-direct {v11, v2, v6, v4}, Lfh0/i$a;-><init>(Lld1/c;Lfh0/h;Lq83/d;)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v11, Lc93/m;

    invoke-static {v10, v11, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7}, Lfh0/i;->d(Lp1/t2;)Lfh0/e;

    move-result-object v4

    invoke-virtual {v4}, Lfh0/e;->d()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-virtual {v6}, Lfh0/h;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    :goto_d
    move-object v8, v4

    goto :goto_e

    :cond_15
    invoke-virtual {v6}, Lfh0/h;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_d

    :goto_e
    invoke-static {v7}, Lfh0/i;->d(Lp1/t2;)Lfh0/e;

    move-result-object v4

    invoke-virtual {v4}, Lfh0/e;->d()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-virtual {v6}, Lfh0/h;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    :goto_f
    move-object v9, v4

    goto :goto_10

    :cond_16
    invoke-virtual {v6}, Lfh0/h;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_f

    :goto_10
    invoke-static {v7}, Lfh0/i;->d(Lp1/t2;)Lfh0/e;

    move-result-object v4

    invoke-virtual {v4}, Lfh0/e;->d()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-virtual {v6}, Lfh0/h;->a()Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object v4

    goto :goto_11

    :cond_17
    invoke-virtual {v6}, Lfh0/h;->g()Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object v4

    :goto_11
    invoke-static {v7}, Lfh0/i;->d(Lp1/t2;)Lfh0/e;

    move-result-object v11

    invoke-virtual {v11}, Lfh0/e;->d()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-virtual {v6}, Lfh0/h;->b()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v11

    goto :goto_12

    :cond_18
    invoke-virtual {v6}, Lfh0/h;->h()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v11

    :goto_12
    invoke-static {v7}, Lfh0/i;->d(Lp1/t2;)Lfh0/e;

    move-result-object v12

    invoke-virtual {v12}, Lfh0/e;->d()Z

    move-result v12

    invoke-static {v7}, Lfh0/i;->d(Lp1/t2;)Lfh0/e;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lfh0/e;->e()Z

    move-result v16

    xor-int/lit8 v16, v16, 0x1

    move/from16 v17, v12

    invoke-virtual {v6}, Lfh0/h;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v7}, Lfh0/i;->d(Lp1/t2;)Lfh0/e;

    move-result-object v7

    invoke-virtual {v7}, Lfh0/e;->c()Z

    move-result v7

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    and-int/lit16 v15, v3, 0x380

    if-ne v15, v13, :cond_19

    const/16 v19, 0x1

    goto :goto_13

    :cond_19
    const/16 v19, 0x0

    :goto_13
    or-int v13, v18, v19

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v13, v15

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v13, v15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_1a

    if-ne v15, v14, :cond_1b

    :cond_1a
    new-instance v15, Lam2/d;

    invoke-direct {v15, v11, v2, v4, v5}, Lam2/d;-><init>(Lcom/whoop/analytics/AnalyticEventModel;Lld1/c;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v14, v15

    check-cast v14, Lc93/a;

    and-int/lit8 v2, v3, 0xe

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v3, 0x3

    or-int/2addr v2, v4

    shl-int/lit8 v4, v3, 0x6

    or-int/2addr v2, v4

    shl-int/lit8 v3, v3, 0xf

    or-int/2addr v2, v3

    move-object v15, v10

    move/from16 v10, v17

    const/16 v17, 0x0

    move v13, v7

    move/from16 v11, v16

    move-object v7, v0

    move/from16 v16, v2

    invoke-static/range {v7 .. v17}, Lfh0/d;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v15

    move-object v4, v7

    goto :goto_14

    :cond_1c
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v2

    :goto_14
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Lf02/c;

    const/4 v3, 0x3

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILandroidx/compose/ui/Modifier;Ll83/e;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final d(Lp1/t2;)Lfh0/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lfh0/e;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfh0/e;

    return-object p0
.end method

.method private static final e(Lcom/whoop/analytics/AnalyticEventModel;Lld1/c;Lcom/whoop/whoopaction/domain/models/UpdateAction;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0, p0, p3}, Lev/n;->y(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    new-instance p0, Lfh0/f$b;

    invoke-direct {p0, p2}, Lfh0/f$b;-><init>(Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    invoke-virtual {p1, p0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lfh0/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lfh0/i;->c(Landroidx/compose/ui/Modifier;Lfh0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
