.class public abstract Lej1/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a7\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lej1/y;",
        "wrapperViewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lej1/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcj1/l;",
        "miniArchViewState",
        "k",
        "(Landroidx/compose/ui/Modifier;Lcj1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "health_release"
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

    invoke-static {p0}, Lej1/x;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lej1/x;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lcj1/l;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lej1/x;->m(Landroidx/compose/ui/Modifier;Lcj1/l;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcj1/k;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lej1/x;->i(Lcj1/k;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lej1/y;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lej1/x;->j(Landroidx/compose/ui/Modifier;Lej1/y;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lej1/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lej1/y;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "wrapperViewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x1838c9f6

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

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

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p5, 0x4

    const/16 v12, 0x100

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v8, 0x92

    const/4 v13, 0x0

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v13

    :goto_5
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v9, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1b

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v2

    :goto_6
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_a

    new-instance v4, Lej1/n;

    const/4 v6, 0x6

    invoke-direct {v4, v6}, Lej1/n;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v4, v6

    :goto_7
    sget-object v7, Lcj1/l$a;->a:Lcj1/l$a;

    const v6, 0x51c1188b

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v6, v9, v8}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v6

    const-string v8, "safe-design-view-model-injection-android"

    invoke-interface {v6, v8}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v6

    const-class v8, Lcj1/k;

    const/4 v11, 0x0

    const/4 v15, 0x0

    if-nez v6, :cond_12

    const v6, -0x2a32dbfc

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-static {v9}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v16

    if-nez v16, :cond_c

    const v6, -0x2a322beb

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object v6, v11

    move-object v10, v15

    const/4 v11, 0x0

    goto :goto_a

    :cond_c
    const v6, -0x2a322bea

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    const-string v10, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/app/Application;

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v9, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v10, v10, v17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_e

    if-ne v11, v2, :cond_d

    goto :goto_8

    :cond_d
    move-object v10, v15

    const/4 v6, 0x0

    goto :goto_9

    :cond_e
    :goto_8
    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v17

    new-instance v8, Lld1/b;

    invoke-direct {v8, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v19, v8

    move-object/from16 v18, v15

    const/16 v20, 0x0

    move-object v15, v6

    invoke-static/range {v15 .. v20}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v11

    move-object/from16 v10, v18

    move-object/from16 v6, v20

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v11, Lld1/c;

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_a
    if-nez v11, :cond_11

    const v8, -0x2a2a887e

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_f

    if-ne v8, v2, :cond_10

    :cond_f
    new-instance v8, Lld1/b;

    invoke-direct {v8, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v11, v8

    check-cast v11, Lld1/b;

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    const v6, -0x1a22aa39

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object/from16 v16, v7

    goto :goto_f

    :cond_12
    move-object v6, v11

    move-object v10, v15

    const v11, -0x2a28ba09

    invoke-static {v9, v11, v13, v9}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v15

    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    instance-of v14, v11, Landroid/app/Application;

    if-eqz v14, :cond_13

    check-cast v11, Landroid/app/Application;

    move-object/from16 v17, v11

    goto :goto_c

    :cond_13
    const/16 v17, 0x0

    :goto_c
    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v11, v14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v11, :cond_15

    if-ne v14, v2, :cond_14

    goto :goto_d

    :cond_14
    move-object/from16 v16, v7

    goto :goto_e

    :cond_15
    :goto_d
    sget-object v11, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v11, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v6

    move-object/from16 v16, v7

    move-object/from16 v19, v10

    invoke-static/range {v15 .. v20}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v14

    invoke-virtual {v9, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    move-object v11, v14

    check-cast v11, Lld1/c;

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_f
    const-string v6, "null cannot be cast to non-null type com.whoop.health.presentation.HealthspanHeroMetricMiniArchViewModel"

    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v14, v11

    check-cast v14, Lcj1/k;

    invoke-virtual {v14}, Lcj1/k;->getViewState()Lec3/f2;

    move-result-object v6

    const/16 v10, 0x30

    const/4 v11, 0x2

    const/4 v8, 0x0

    move-object/from16 v7, v16

    const/4 v15, 0x0

    invoke-static/range {v6 .. v11}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v6

    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_16

    if-ne v8, v2, :cond_17

    :cond_16
    new-instance v8, Lej1/x$a;

    invoke-direct {v8, v14, v5, v15}, Lej1/x$a;-><init>(Lcj1/k;Lej1/y;Lq83/d;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v8, Lc93/m;

    invoke-static {v9, v8, v14}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6}, Lej1/x;->h(Lp1/t2;)Lcj1/l;

    move-result-object v7

    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    and-int/lit16 v8, v3, 0x380

    if-ne v8, v12, :cond_18

    const/4 v13, 0x1

    :cond_18
    or-int/2addr v6, v13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_19

    if-ne v8, v2, :cond_1a

    :cond_19
    new-instance v8, Lcom/whoop/profile/view/edit/n;

    const/16 v2, 0x10

    invoke-direct {v8, v2, v14, v4}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v8, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v10, v3, 0xe

    const/4 v11, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v11}, Lej1/x;->k(Landroidx/compose/ui/Modifier;Lcj1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v21, v6

    move-object v6, v4

    move-object/from16 v4, v21

    goto :goto_10

    :cond_1b
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, v2

    :goto_10
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Le11/b;

    const/16 v3, 0x9

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lp1/t2;)Lcj1/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcj1/l;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcj1/l;

    return-object p0
.end method

.method private static final i(Lcj1/k;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcj1/j;

    if-eqz v0, :cond_0

    check-cast p2, Lcj1/j;

    invoke-virtual {p0, p2}, Lcj1/k;->o(Lcj1/j;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lej1/y;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lej1/x;->f(Landroidx/compose/ui/Modifier;Lej1/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Lcj1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcj1/l;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "miniArchViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p3

    check-cast v4, Lp1/q;

    const p3, -0x2cc16e5d

    invoke-virtual {v4, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p5, 0x1

    if-eqz p3, :cond_0

    or-int/lit8 v0, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_2

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_2
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_4

    :cond_5
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_7

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x100

    goto :goto_3

    :cond_6
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_7
    :goto_4
    and-int/lit16 v2, v0, 0x93

    const/16 v3, 0x92

    const/4 v7, 0x0

    if-eq v2, v3, :cond_8

    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    move v2, v7

    :goto_5
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v4, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    if-eqz p3, :cond_9

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_9
    if-eqz v1, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p2, p3, :cond_a

    new-instance p2, Lej1/n;

    const/4 p3, 0x7

    invoke-direct {p2, p3}, Lej1/n;-><init>(I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_b
    move-object v3, p2

    sget-object p2, Lcj1/l$a;->a:Lcj1/l$a;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_c

    const p2, -0x41c6144c

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    move-object v1, p0

    goto :goto_6

    :cond_c
    instance-of p2, p1, Lcj1/l$b;

    if-eqz p2, :cond_d

    const p2, -0x41c4e780

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    move-object p2, p1

    check-cast p2, Lcj1/l$b;

    invoke-virtual {p2}, Lcj1/l$b;->a()Lcj1/m;

    move-result-object v2

    and-int/lit16 v5, v0, 0x38e

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lej1/v;->h(Landroidx/compose/ui/Modifier;Lcj1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    :goto_6
    move-object p0, v1

    move-object v6, v3

    goto :goto_7

    :cond_d
    const p0, -0x21f331c

    invoke-static {p0, v4, v7}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_e
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v6, p2

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_f

    new-instance v0, Le11/b;

    const/16 v3, 0xa

    move-object v4, p0

    move-object v5, p1

    move v1, p4

    move v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final l(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lcj1/l;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lej1/x;->k(Landroidx/compose/ui/Modifier;Lcj1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
