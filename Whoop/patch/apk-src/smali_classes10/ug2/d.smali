.class public abstract Lug2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aG\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000c2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lwg2/a;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Lwg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lwg2/e;",
        "viewState",
        "Lkotlin/Function0;",
        "onRetry",
        "m",
        "(Landroidx/compose/ui/Modifier;Lwg2/e;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "start-activity_release"
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

    invoke-static {p0}, Lug2/d;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lld1/c;Lwg2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lug2/d;->k(Lld1/c;Lwg2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lug2/d;->p(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lwg2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lug2/d;->l(Landroidx/compose/ui/Modifier;Lwg2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lug2/d;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lug2/d;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Landroidx/compose/ui/Modifier;Lwg2/e;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lug2/d;->q(Landroidx/compose/ui/Modifier;Lwg2/e;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lwg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lwg2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x24e4a692

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    const/16 v11, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v11

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    const/16 v12, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v12

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit16 v7, v3, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x0

    if-eq v7, v9, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v13

    :goto_5
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_21

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v1

    :goto_6
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_a

    new-instance v5, Lu71/c;

    const/16 v6, 0x16

    invoke-direct {v5, v6}, Lu71/c;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v15, v5

    goto :goto_7

    :cond_b
    move-object v15, v6

    :goto_7
    sget-object v6, Lwg2/e$c;->a:Lwg2/e$c;

    invoke-virtual {v2}, Lwg2/a;->getId()Ljava/lang/String;

    move-result-object v5

    const v7, 0x51c1188b

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v7, v8, v9}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v7

    const-string v9, "safe-design-view-model-injection-android"

    invoke-interface {v7, v9}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v7

    const-class v9, Lwg2/c;

    const/4 v10, 0x0

    if-nez v7, :cond_12

    const v7, -0x2a32dbfc

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    invoke-static {v8}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_c

    const v7, -0x2a322beb

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    move-object v7, v10

    const/4 v14, 0x0

    goto :goto_a

    :cond_c
    const v7, -0x2a322bea

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    const-string v14, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v7

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v8, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v7, v14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v7, :cond_e

    if-ne v14, v1, :cond_d

    goto :goto_8

    :cond_d
    move-object v7, v10

    goto :goto_9

    :cond_e
    :goto_8
    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v7, Lld1/b;

    invoke-direct {v7, v6}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v21, v5

    move-object/from16 v20, v7

    move-object/from16 v19, v10

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v14

    move-object/from16 v7, v19

    invoke-virtual {v8, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v14, Lld1/c;

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_a
    if-nez v14, :cond_11

    const v9, -0x2a2a887e

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_f

    if-ne v7, v1, :cond_10

    :cond_f
    new-instance v7, Lld1/b;

    invoke-direct {v7, v6}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v14, v7

    check-cast v14, Lld1/b;

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    const v5, -0x1a22aa39

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    move-object/from16 v17, v6

    goto :goto_f

    :cond_12
    move-object v7, v10

    const v10, -0x2a28ba09

    invoke-static {v8, v10, v13, v8}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v16

    sget-object v10, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    instance-of v14, v10, Landroid/app/Application;

    if-eqz v14, :cond_13

    check-cast v10, Landroid/app/Application;

    move-object/from16 v18, v10

    goto :goto_c

    :cond_13
    const/16 v18, 0x0

    :goto_c
    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v10, v14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v10, :cond_15

    if-ne v14, v1, :cond_14

    goto :goto_d

    :cond_14
    move-object/from16 v17, v6

    goto :goto_e

    :cond_15
    :goto_d
    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    move-object/from16 v21, v5

    move-object/from16 v17, v6

    move-object/from16 v20, v7

    invoke-static/range {v16 .. v21}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v14

    invoke-virtual {v8, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v14, Lld1/c;

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v14}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v5

    const/16 v9, 0x30

    const/4 v10, 0x2

    const/4 v7, 0x0

    move-object/from16 v6, v17

    const/4 v13, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    invoke-virtual {v2}, Lwg2/a;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit8 v9, v3, 0x70

    if-ne v9, v11, :cond_16

    const/4 v10, 0x1

    goto :goto_10

    :cond_16
    const/4 v10, 0x0

    :goto_10
    or-int/2addr v7, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_17

    if-ne v10, v1, :cond_18

    :cond_17
    new-instance v10, Lug2/d$a;

    invoke-direct {v10, v14, v2, v13}, Lug2/d$a;-><init>(Lld1/c;Lwg2/a;Lq83/d;)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v10, Lc93/m;

    invoke-static {v8, v10, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lwg2/a;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5}, Lug2/d;->j(Lp1/t2;)Lwg2/e;

    move-result-object v7

    instance-of v7, v7, Lwg2/e$a;

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    and-int/lit16 v13, v3, 0x380

    if-ne v13, v12, :cond_19

    const/4 v12, 0x1

    goto :goto_11

    :cond_19
    const/4 v12, 0x0

    :goto_11
    or-int/2addr v10, v12

    if-ne v9, v11, :cond_1a

    const/4 v12, 0x1

    goto :goto_12

    :cond_1a
    const/4 v12, 0x0

    :goto_12
    or-int/2addr v10, v12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_1b

    if-ne v12, v1, :cond_1c

    :cond_1b
    new-instance v12, Lug2/d$b;

    const/4 v13, 0x0

    invoke-direct {v12, v15, v2, v5, v13}, Lug2/d$b;-><init>(Lkotlin/jvm/functions/Function1;Lwg2/a;Lp1/t2;Lq83/d;)V

    invoke-virtual {v8, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v12, Lc93/m;

    invoke-static {v6, v7, v12, v8}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-static {v5}, Lug2/d;->j(Lp1/t2;)Lwg2/e;

    move-result-object v6

    instance-of v6, v6, Lwg2/e$c;

    if-eqz v6, :cond_1d

    invoke-virtual {v2}, Lwg2/a;->b()Z

    move-result v6

    if-nez v6, :cond_1d

    sget-object v5, Lwg2/e$b;->a:Lwg2/e$b;

    :goto_13
    move-object v6, v5

    goto :goto_14

    :cond_1d
    invoke-static {v5}, Lug2/d;->j(Lp1/t2;)Lwg2/e;

    move-result-object v5

    goto :goto_13

    :goto_14
    invoke-virtual {v8, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-ne v9, v11, :cond_1e

    const/4 v13, 0x1

    goto :goto_15

    :cond_1e
    const/4 v13, 0x0

    :goto_15
    or-int/2addr v5, v13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_1f

    if-ne v7, v1, :cond_20

    :cond_1f
    new-instance v7, Ls51/f;

    const/16 v1, 0x1c

    invoke-direct {v7, v1, v14, v2}, Ls51/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v7, Lc93/a;

    and-int/lit8 v1, v3, 0xe

    shl-int/lit8 v3, v3, 0x3

    and-int/lit16 v3, v3, 0x1c00

    or-int v10, v1, v3

    const/4 v11, 0x0

    move-object v5, v0

    move-object v9, v8

    move-object v8, v15

    invoke-static/range {v5 .. v11}, Lug2/d;->m(Landroidx/compose/ui/Modifier;Lwg2/e;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    move-object v8, v9

    move-object v1, v5

    :goto_16
    move-object v3, v6

    goto :goto_17

    :cond_21
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_16

    :goto_17
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Lt01/e;

    const/16 v6, 0x14

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final i(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/t2;)Lwg2/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lwg2/e;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwg2/e;

    return-object p0
.end method

.method private static final k(Lld1/c;Lwg2/a;)Ll83/a0;
    .locals 1

    new-instance v0, Lwg2/b;

    invoke-direct {v0, p1}, Lwg2/b;-><init>(Lwg2/a;)V

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lwg2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lug2/d;->h(Landroidx/compose/ui/Modifier;Lwg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;Lwg2/e;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lwg2/e;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x664b9f18

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v5, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v5

    :goto_1
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v8, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_5

    :cond_a
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v3, v10

    :goto_6
    and-int/lit16 v10, v3, 0x493

    const/16 v11, 0x492

    const/4 v13, 0x0

    if-eq v10, v11, :cond_b

    const/4 v10, 0x1

    goto :goto_7

    :cond_b
    move v10, v13

    :goto_7
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v9, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_16

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_c

    move-object v15, v10

    goto :goto_8

    :cond_c
    move-object v15, v1

    :goto_8
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_d

    new-instance v1, Lu91/a;

    const/16 v4, 0xf

    invoke-direct {v1, v4}, Lu91/a;-><init>(I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v1, Lc93/a;

    goto :goto_9

    :cond_e
    move-object v1, v6

    :goto_9
    if-eqz v7, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_f

    new-instance v4, Lu71/c;

    const/16 v0, 0x17

    invoke-direct {v4, v0}, Lu71/c;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v0, v4

    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_10
    move-object v0, v8

    :goto_a
    instance-of v4, v2, Lwg2/e$b;

    if-eqz v4, :cond_11

    const v3, -0x1e01b3d

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    int-to-float v3, v13

    invoke-static {v10, v3, v9, v13}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    :goto_b
    move-object v7, v1

    goto/16 :goto_e

    :cond_11
    instance-of v4, v2, Lwg2/e$c;

    if-eqz v4, :cond_12

    const v3, -0x1e011dc

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget-object v3, Le31/d;->a:Le31/d;

    invoke-virtual {v3}, Le31/d;->a()Le31/c;

    move-result-object v14

    const/16 v21, 0x3e

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v14 .. v22}, Le31/c;->d(Le31/c;Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILjava/lang/Object;)Le31/c;

    move-result-object v6

    sget v10, Le31/c;->g:I

    const/4 v11, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    instance-of v4, v2, Lwg2/e$d;

    if-eqz v4, :cond_13

    const v4, -0x1dffca7

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    move-object v4, v2

    check-cast v4, Lwg2/e$d;

    invoke-virtual {v4}, Lwg2/e$d;->a()Lm91/o;

    move-result-object v6

    new-instance v8, Law0/a;

    const/16 v4, 0xb

    invoke-direct {v8, v4, v15}, Law0/a;-><init>(ILandroidx/compose/ui/Modifier;)V

    sget v4, Lm91/o;->c:I

    and-int/lit16 v3, v3, 0x1c00

    or-int v11, v4, v3

    const/4 v12, 0x2

    const/4 v7, 0x0

    move-object v10, v9

    move-object v9, v0

    invoke-static/range {v6 .. v12}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    instance-of v4, v2, Lwg2/e$a;

    if-eqz v4, :cond_15

    const v4, -0x1dfe431

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    move-object v4, v2

    check-cast v4, Lwg2/e$a;

    invoke-virtual {v4}, Lwg2/e$a;->a()Z

    move-result v4

    if-eqz v4, :cond_14

    sget-object v4, Le31/d;->a:Le31/d;

    invoke-virtual {v4}, Le31/d;->b()Le31/c;

    move-result-object v14

    const/16 v21, 0x3e

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v14 .. v22}, Le31/c;->d(Le31/c;Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILjava/lang/Object;)Le31/c;

    move-result-object v4

    :goto_c
    move-object v6, v4

    goto :goto_d

    :cond_14
    sget-object v4, Le31/d;->a:Le31/d;

    invoke-virtual {v4}, Le31/d;->c()Le31/c;

    move-result-object v14

    const/16 v21, 0x3e

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v14 .. v22}, Le31/c;->d(Le31/c;Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILjava/lang/Object;)Le31/c;

    move-result-object v4

    goto :goto_c

    :goto_d
    sget v4, Le31/c;->g:I

    shr-int/lit8 v7, v3, 0x3

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v4, v7

    and-int/lit16 v3, v3, 0x380

    or-int v10, v4, v3

    const/4 v11, 0x0

    move-object v8, v1

    move-object v7, v1

    invoke-static/range {v6 .. v11}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_e
    move-object v4, v0

    move-object v3, v7

    move-object v1, v15

    goto :goto_f

    :cond_15
    const v0, -0x1e01f81

    invoke-static {v0, v9, v13}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_16
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v6

    move-object v4, v8

    :goto_f
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lsl0/k2;

    const/16 v7, 0x8

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lsl0/k2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, -0x5c042ac8

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final q(Landroidx/compose/ui/Modifier;Lwg2/e;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lug2/d;->m(Landroidx/compose/ui/Modifier;Lwg2/e;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic r(Lp1/t2;)Lwg2/e;
    .locals 0

    invoke-static {p0}, Lug2/d;->j(Lp1/t2;)Lwg2/e;

    move-result-object p0

    return-object p0
.end method
