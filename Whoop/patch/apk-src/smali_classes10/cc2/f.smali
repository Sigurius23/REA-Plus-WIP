.class public abstract Lcc2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcc2/c;",
        "itemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lcc2/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcc2/a;",
        "viewState",
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
.method public static synthetic a(Lcc2/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcc2/f;->j(Lcc2/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcc2/c;Lld1/c;Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 0

    invoke-static {p0, p1, p2}, Lcc2/f;->h(Lcc2/c;Lld1/c;Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcc2/c;Landroid/webkit/WebView;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcc2/f;->i(Lcc2/c;Landroid/webkit/WebView;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcc2/f;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcc2/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcc2/c;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v1, p4

    const-string v0, "itemState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x3441dfec

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v8, v9, :cond_8

    move v8, v14

    goto :goto_6

    :cond_8
    move v8, v15

    :goto_6
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1f

    if-eqz v3, :cond_9

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_9
    move-object v3, v4

    :goto_7
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_a

    new-instance v5, Lc62/a;

    const/4 v7, 0x3

    invoke-direct {v5, v7}, Lc62/a;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v5, v7

    :goto_8
    new-instance v7, Lcc2/a;

    const/4 v8, 0x0

    invoke-direct {v7, v15, v14, v8}, Lcc2/a;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v9, 0x51c1188b

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v9, v10, v11}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v9

    const-string v11, "safe-design-view-model-injection-android"

    invoke-interface {v9, v11}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v9

    const-class v11, Lcc2/e;

    const/4 v12, 0x0

    const/4 v2, 0x0

    if-nez v9, :cond_12

    const v9, -0x2a32dbfc

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    invoke-static {v10}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_c

    const v9, -0x2a322beb

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    move-object v9, v2

    move-object v13, v8

    move-object v2, v12

    goto :goto_b

    :cond_c
    const v9, -0x2a322bea

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    sget-object v9, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    const-string v13, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v9

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v10, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v9, v13

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v9, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_e

    if-ne v13, v4, :cond_d

    goto :goto_9

    :cond_d
    move-object v9, v2

    move-object v2, v12

    goto :goto_a

    :cond_e
    :goto_9
    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v9, Lld1/b;

    invoke-direct {v9, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v19, v2

    move-object/from16 v20, v9

    move-object/from16 v21, v12

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v13

    move-object/from16 v9, v19

    move-object/from16 v2, v21

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v13, Lld1/c;

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    :goto_b
    if-nez v13, :cond_11

    const v11, -0x2a2a887e

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v2, v11

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v2, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_f

    if-ne v9, v4, :cond_10

    :cond_f
    new-instance v9, Lld1/b;

    invoke-direct {v9, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v13, v9

    check-cast v13, Lld1/b;

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_11
    const v2, -0x1a22aa39

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_12
    move-object v9, v2

    move-object v2, v12

    const v12, -0x2a28ba09

    invoke-static {v10, v12, v15, v10}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v16

    sget-object v12, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    instance-of v13, v12, Landroid/app/Application;

    if-eqz v13, :cond_13

    check-cast v12, Landroid/app/Application;

    move-object/from16 v18, v12

    goto :goto_e

    :cond_13
    move-object/from16 v18, v8

    :goto_e
    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_14

    if-ne v13, v4, :cond_15

    :cond_14
    sget-object v12, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v12, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    move-object/from16 v21, v2

    move-object/from16 v17, v7

    move-object/from16 v20, v9

    invoke-static/range {v16 .. v21}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v13

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v13, Lld1/c;

    goto :goto_d

    :goto_f
    invoke-virtual {v13}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v7

    new-instance v2, Lcc2/a;

    invoke-direct {v2, v15, v14, v8}, Lcc2/a;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v9, 0x0

    move-object/from16 v22, v8

    move-object v8, v2

    move-object/from16 v2, v22

    invoke-static/range {v7 .. v12}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v7

    invoke-static {v7}, Lcc2/f;->g(Lp1/t2;)Lcc2/a;

    move-result-object v8

    invoke-virtual {v8}, Lcc2/a;->a()Z

    move-result v8

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit16 v11, v0, 0x380

    const/16 v12, 0x100

    if-ne v11, v12, :cond_16

    move v11, v14

    goto :goto_10

    :cond_16
    move v11, v15

    :goto_10
    or-int/2addr v9, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_17

    if-ne v11, v4, :cond_18

    :cond_17
    new-instance v11, Lcc2/f$a;

    invoke-direct {v11, v5, v7, v2}, Lcc2/f$a;-><init>(Lkotlin/jvm/functions/Function1;Lp1/t2;Lq83/d;)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v11, Lc93/m;

    invoke-static {v10, v11, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    and-int/lit8 v0, v0, 0xe

    const/4 v2, 0x4

    if-ne v0, v2, :cond_19

    move v2, v14

    goto :goto_11

    :cond_19
    move v2, v15

    :goto_11
    invoke-virtual {v10, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_1a

    if-ne v7, v4, :cond_1b

    :cond_1a
    new-instance v7, Lbe1/c;

    const/16 v2, 0xb

    invoke-direct {v7, v2, v6, v13}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x4

    if-ne v0, v2, :cond_1c

    goto :goto_12

    :cond_1c
    move v14, v15

    :goto_12
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_1d

    if-ne v0, v4, :cond_1e

    :cond_1d
    new-instance v0, La1/b;

    const/16 v2, 0x1c

    invoke-direct {v0, v6, v2}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v3

    goto :goto_13

    :cond_1f
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v5, v7

    :goto_13
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_20

    new-instance v0, Lc41/d1;

    const/16 v3, 0x9

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(IIILandroidx/compose/ui/Modifier;Ll83/e;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lp1/t2;)Lcc2/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcc2/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcc2/a;

    return-object p0
.end method

.method private static final h(Lcc2/c;Lld1/c;Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 2

    const-string v0, "webViewContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p2}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {p2, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p2}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Lcc2/c;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p0

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    :cond_0
    new-instance p0, Lcc2/f$b;

    invoke-direct {p0, p1}, Lcc2/f$b;-><init>(Lld1/c;)V

    invoke-virtual {v0, p0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-object v0
.end method

.method private static final i(Lcc2/c;Landroid/webkit/WebView;)Ll83/a0;
    .locals 1

    const-string v0, "webView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcc2/c;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcc2/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcc2/f;->e(Lcc2/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic k(Lp1/t2;)Lcc2/a;
    .locals 0

    invoke-static {p0}, Lcc2/f;->g(Lp1/t2;)Lcc2/a;

    move-result-object p0

    return-object p0
.end method
