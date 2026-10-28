.class public abstract Lsy2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001ac\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00082\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a#\u0010\u0016\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lty2/a$a$i;",
        "viewState",
        "Lkotlin/Function1;",
        "Lny2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "onNavEvent",
        "",
        "shouldShowWebView",
        "p",
        "(Lty2/a$a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V",
        "",
        "url",
        "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "surveyProvider",
        "isPageLoaded",
        "onPageLoaded",
        "t",
        "(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "isErrorLoading",
        "G",
        "(Landroidx/compose/ui/Modifier;ZZ)Landroidx/compose/ui/Modifier;",
        "whooplabs_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lny2/a$n;

    invoke-direct {v0, p1}, Lny2/a$n;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/c1;Landroid/webkit/ValueCallback;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lh/i;)Ll83/a0;
    .locals 2

    const-string v0, "*/*"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lh/i;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;Lp1/c1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Landroid/webkit/WebView;)Ll83/a0;
    .locals 9

    const-string v0, "webView"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Landroid/webkit/WebView;->clearHistory()V

    const/4 v0, 0x1

    invoke-virtual {p5, v0}, Landroid/webkit/WebView;->clearCache(Z)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    const-string v0, "JSBridge"

    invoke-virtual {p5, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    new-instance v2, Lyw2/d;

    new-instance v3, Lnw0/e;

    const/16 v8, 0x11

    move-object v5, p0

    move-object v4, p1

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v3 .. v8}, Lnw0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-direct {v2, v3}, Lyw2/d;-><init>(Lc93/a;)V

    invoke-virtual {p5, v2, v0}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p5}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {p5, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-object v1
.end method

.method private static final E(Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    new-instance p0, Lny2/a$b0;

    invoke-direct {p0, p3}, Lny2/a$b0;-><init>(Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p6, p6, 0x1

    invoke-static {p6}, Lp1/x;->L(I)I

    move-result v7

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p7

    invoke-static/range {v0 .. v7}, Lsy2/t;->t(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Landroidx/compose/ui/Modifier;ZZ)Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    int-to-float p1, p1

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {p1}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    :goto_1
    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsy2/t;->y(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lsy2/t;->w(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Landroid/net/Uri;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsy2/t;->u(Lp1/c1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Lh/i;Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 0

    invoke-static/range {p0 .. p9}, Lsy2/t;->v(Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Lh/i;Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lty2/a$a$i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsy2/t;->q(Lkotlin/jvm/functions/Function1;Lty2/a$a$i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Lp1/c1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Landroid/webkit/WebView;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsy2/t;->D(Lp1/c1;Lp1/c1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Landroid/webkit/WebView;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsy2/t;->E(Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lty2/a$a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lsy2/t;->s(Lty2/a$a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;Landroid/webkit/ValueCallback;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsy2/t;->B(Lp1/c1;Landroid/webkit/ValueCallback;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsy2/t;->r(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lsy2/t;->x(Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsy2/t;->F(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lh/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsy2/t;->C(Lh/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/Integer;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsy2/t;->z(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/Integer;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lsy2/t;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lty2/a$a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a$a$i;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p5

    const-string v4, "viewState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onViewEvent"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onNavEvent"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v4, 0x54c5d95d

    invoke-virtual {v12, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_7

    or-int/lit16 v4, v4, 0xc00

    :cond_6
    move/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_6

    move/from16 v7, p3

    invoke-virtual {v12, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_4

    :cond_8
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v4, v8

    :goto_5
    and-int/lit16 v8, v4, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x0

    if-eq v8, v9, :cond_9

    const/4 v8, 0x1

    goto :goto_6

    :cond_9
    move v8, v10

    :goto_6
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v12, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_25

    if-eqz v5, :cond_a

    const/16 v17, 0x1

    goto :goto_7

    :cond_a
    move/from16 v17, v7

    :goto_7
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v5, v7, :cond_b

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lp1/c1;

    invoke-interface {v5}, Lp1/c1;->i()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-interface {v5}, Lp1/c1;->f()Lkotlin/jvm/functions/Function1;

    move-result-object v16

    invoke-virtual {v1}, Lty2/a$a$i;->h()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    and-int/lit8 v9, v4, 0x70

    if-ne v9, v6, :cond_c

    const/4 v11, 0x1

    goto :goto_8

    :cond_c
    move v11, v10

    :goto_8
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_d

    if-ne v13, v7, :cond_e

    :cond_d
    new-instance v13, Lsy2/t$a;

    const/4 v11, 0x0

    invoke-direct {v13, v2, v1, v11}, Lsy2/t$a;-><init>(Lkotlin/jvm/functions/Function1;Lty2/a$a$i;Lq83/d;)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v13, Lc93/m;

    invoke-static {v12, v13, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-eqz v0, :cond_f

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_9
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v12, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v12, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move/from16 v20, v4

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto :goto_a

    :cond_10
    move/from16 v20, v4

    :goto_a
    invoke-static {v13, v12, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lty2/a$a$i;->k()Z

    move-result v4

    if-eqz v4, :cond_18

    if-nez v8, :cond_18

    const v4, 0x4e600c12    # 9.3972186E8f

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lty2/a$a$i;->g()Lty2/e;

    move-result-object v4

    invoke-virtual {v4}, Lty2/e;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lty2/a$a$i;->g()Lty2/e;

    move-result-object v10

    invoke-virtual {v10}, Lty2/e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lty2/a$a$i;->g()Lty2/e;

    move-result-object v13

    invoke-virtual {v13}, Lty2/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move-object/from16 p3, v4

    const/16 v4, 0x20

    if-ne v9, v4, :cond_12

    const/4 v4, 0x1

    goto :goto_b

    :cond_12
    const/4 v4, 0x0

    :goto_b
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    or-int v4, v4, v21

    move/from16 v21, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v21, :cond_14

    if-ne v4, v7, :cond_13

    goto :goto_c

    :cond_13
    move-object/from16 v21, v5

    goto :goto_d

    :cond_14
    :goto_c
    new-instance v4, Lsy2/j;

    move-object/from16 v21, v5

    const/4 v5, 0x4

    invoke-direct {v4, v5, v2, v1}, Lsy2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v4, Lc93/a;

    invoke-virtual {v1}, Lty2/a$a$i;->g()Lty2/e;

    move-result-object v5

    invoke-virtual {v5}, Lty2/e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object/from16 v22, v4

    const/16 v4, 0x20

    if-ne v9, v4, :cond_15

    const/4 v4, 0x1

    goto :goto_e

    :cond_15
    const/4 v4, 0x0

    :goto_e
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_16

    if-ne v9, v7, :cond_17

    :cond_16
    new-instance v9, Lsy2/a;

    const/16 v4, 0x8

    invoke-direct {v9, v2, v4}, Lsy2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v9, Lc93/a;

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v4, 0x3

    or-int/2addr v7, v4

    shl-int/lit8 v19, v4, 0x6

    or-int v7, v7, v19

    shl-int/lit8 v4, v4, 0xc

    or-int/2addr v4, v7

    move-object v7, v14

    const/16 v14, 0x40

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object v1, v6

    move-object/from16 v18, v7

    move-object v6, v10

    move-object v7, v13

    move-object/from16 v2, v19

    move-object/from16 v23, v21

    move v13, v4

    move v4, v8

    move-object v10, v9

    move-object/from16 v8, v22

    move-object v9, v5

    move-object/from16 v5, p3

    move-object/from16 p3, v3

    const/4 v3, 0x0

    invoke-static/range {v5 .. v14}, Lkz2/c;->y(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_18
    move-object/from16 p3, v3

    move-object/from16 v23, v5

    move-object v1, v6

    move v4, v8

    move-object v2, v11

    move-object/from16 v18, v14

    const/4 v3, 0x0

    const v5, 0x4e6773cb    # 9.707814E8f

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual/range {p0 .. p0}, Lty2/a$a$i;->k()Z

    move-result v5

    invoke-static {v15, v5, v4}, Lsy2/t;->G(Landroidx/compose/ui/Modifier;ZZ)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v12, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_19

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_19
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v12, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_1a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1b

    :cond_1a
    move-object/from16 v6, v18

    goto :goto_12

    :cond_1b
    move-object/from16 v6, v18

    :goto_11
    move-object/from16 v7, p3

    goto :goto_13

    :goto_12
    invoke-static {v7, v12, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_11

    :goto_13
    invoke-static {v12, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v5, v20, 0x7e

    move-object/from16 v10, p0

    move-object/from16 v8, p1

    invoke-static {v10, v8, v12, v5}, Lry2/f;->g(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    float-to-double v13, v5

    const-wide/16 v18, 0x0

    cmpl-double v11, v13, v18

    if-lez v11, :cond_1c

    goto :goto_14

    :cond_1c
    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_14
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v13, 0x1

    invoke-direct {v11, v5, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v9, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, Ll0/m;->a:Ll0/e;

    sget-object v11, Lb2/e;->J:Lb2/l;

    invoke-static {v9, v11, v12, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_1d

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v12, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_1e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1f

    :cond_1e
    invoke-static {v11, v12, v11, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v12, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v23

    invoke-static {v5, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_20

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_20
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v12, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_21

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    :cond_21
    invoke-static {v9, v12, v9, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v12, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v17, :cond_23

    const v0, -0x43a956f1

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lty2/a$a$i;->h()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v10}, Lty2/a$a$i;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Lp1/q;->I(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const v1, 0x1ed98463

    invoke-virtual {v12, v1, v0}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-virtual {v10}, Lty2/a$a$i;->j()Ljava/lang/String;

    move-result-object v2

    move/from16 v18, v3

    invoke-virtual {v10}, Lty2/a$a$i;->i()Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-result-object v3

    shl-int/lit8 v0, v20, 0x9

    const v1, 0x7e000

    and-int v9, v0, v1

    move-object/from16 v7, p2

    move-object v6, v8

    move-object v8, v12

    move-object/from16 v5, v16

    move/from16 v0, v18

    invoke-static/range {v2 .. v9}, Lsy2/t;->t(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_23
    move v0, v3

    const v1, -0x43a0f3b5

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_17
    if-nez v4, :cond_24

    const v1, -0x43a03a12

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lb2/e;->E:Lb2/m;

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v2, v15, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v1, Lgy0/e;->d:I

    invoke-static {v1}, Lv41/r0$d;->b(I)I

    move-result v1

    invoke-static {v1}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v6

    const/4 v15, 0x0

    const/16 v16, 0x1fc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v1, 0x1

    invoke-static/range {v5 .. v16}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_24
    const/4 v1, 0x1

    const v2, -0x439c8455

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_18
    invoke-static {v12, v1, v1, v1, v1}, Lb9/y;->B(Lp1/q;ZZZZ)V

    move/from16 v4, v17

    goto :goto_19

    :cond_25
    invoke-virtual {v12}, Lp1/q;->X()V

    move v4, v7

    :goto_19
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_26

    new-instance v0, Lry2/h;

    const/4 v7, 0x3

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lry2/h;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lty2/a$a$i;)Ll83/a0;
    .locals 1

    new-instance v0, Lny2/a$t;

    invoke-virtual {p1}, Lty2/a$a$i;->f()I

    move-result p1

    invoke-direct {v0, p1}, Lny2/a$t;-><init>(I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$e;->a:Lny2/a$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lty2/a$a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lsy2/t;->p(Lty2/a$a$i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v10, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v9, p5

    move/from16 v11, p7

    const-string v0, "url"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "surveyProvider"

    move-object/from16 v8, p1

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPageLoaded"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p6

    check-cast v12, Lp1/q;

    const v0, 0x1e0e84dc

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v1, v11, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v12, v1}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v11, 0x180

    if-nez v1, :cond_5

    invoke-virtual {v12, v10}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v11, 0xc00

    if-nez v1, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    and-int/lit16 v1, v11, 0x6000

    if-nez v1, :cond_9

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x4000

    goto :goto_5

    :cond_8
    const/16 v1, 0x2000

    :goto_5
    or-int/2addr v0, v1

    :cond_9
    const/high16 v1, 0x30000

    and-int/2addr v1, v11

    if-nez v1, :cond_b

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    const/high16 v1, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v1, 0x10000

    :goto_6
    or-int/2addr v0, v1

    :cond_b
    const v1, 0x12493

    and-int/2addr v1, v0

    const v7, 0x12492

    const/16 v16, 0x0

    const/16 v17, 0x1

    if-eq v1, v7, :cond_c

    move/from16 v1, v17

    goto :goto_7

    :cond_c
    move/from16 v1, v16

    :goto_7
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v12, v7, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v1, v7, :cond_d

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v1, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v7, :cond_e

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v14, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v7, :cond_f

    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v13, Lp1/c1;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    const/4 v15, 0x0

    if-ne v3, v7, :cond_10

    invoke-static {v15}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lp1/c1;

    new-instance v15, Landroidx/activity/result/contract/ActivityResultContracts$GetContent;

    invoke-direct {v15}, Landroidx/activity/result/contract/ActivityResultContracts$GetContent;-><init>()V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_11

    new-instance v2, Lsy2/s;

    move-object/from16 v21, v1

    const/4 v1, 0x1

    invoke-direct {v2, v3, v1}, Lsy2/s;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_8

    :cond_11
    move-object/from16 v21, v1

    :goto_8
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/16 v1, 0x30

    invoke-static {v15, v2, v12, v1}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    and-int/lit16 v2, v0, 0x380

    move-object/from16 v22, v3

    const/16 v3, 0x100

    if-ne v2, v3, :cond_12

    move/from16 v2, v17

    goto :goto_9

    :cond_12
    move/from16 v2, v16

    :goto_9
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_13

    if-ne v3, v7, :cond_14

    :cond_13
    new-instance v3, Lsy2/t$b;

    const/4 v2, 0x0

    invoke-direct {v3, v13, v10, v2}, Lsy2/t$b;-><init>(Lp1/c1;ZLq83/d;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v3, Lc93/m;

    invoke-static {v12, v3, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit16 v1, v0, 0x1c00

    const/16 v2, 0x800

    if-ne v1, v2, :cond_15

    move/from16 v2, v17

    goto :goto_a

    :cond_15
    move/from16 v2, v16

    :goto_a
    const v3, 0xe000

    and-int/2addr v3, v0

    move/from16 v19, v0

    const/16 v0, 0x4000

    if-ne v3, v0, :cond_16

    move/from16 v18, v17

    goto :goto_b

    :cond_16
    move/from16 v18, v16

    :goto_b
    or-int v2, v2, v18

    and-int/lit8 v8, v19, 0xe

    const/4 v0, 0x4

    if-ne v8, v0, :cond_17

    move/from16 v0, v17

    goto :goto_c

    :cond_17
    move/from16 v0, v16

    :goto_c
    or-int/2addr v0, v2

    and-int/lit8 v2, v19, 0x70

    move/from16 v20, v0

    const/16 v0, 0x20

    if-ne v2, v0, :cond_18

    move/from16 v0, v17

    goto :goto_d

    :cond_18
    move/from16 v0, v16

    :goto_d
    or-int v0, v20, v0

    move/from16 v20, v0

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v20, :cond_1a

    if-ne v0, v7, :cond_19

    goto :goto_e

    :cond_19
    move v13, v1

    move v11, v2

    move-object/from16 v23, v7

    move v10, v8

    move-object v2, v14

    const/high16 v9, 0x20000

    move v14, v3

    move-object/from16 v3, v21

    goto :goto_f

    :cond_1a
    :goto_e
    new-instance v0, Lsy2/t$c;

    move/from16 v20, v8

    const/4 v8, 0x0

    move-object v9, v13

    move v13, v1

    move-object v1, v9

    move v11, v2

    move-object v2, v4

    move-object/from16 v23, v7

    move-object v4, v14

    move/from16 v10, v20

    const/high16 v9, 0x20000

    move-object/from16 v7, p1

    move v14, v3

    move-object/from16 v3, v21

    invoke-direct/range {v0 .. v8}, Lsy2/t$c;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Lq83/d;)V

    move-object v2, v4

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v0, Lc93/m;

    invoke-static {v12, v0, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz p2, :cond_1b

    goto :goto_10

    :cond_1b
    const/4 v1, 0x0

    :goto_10
    invoke-static {v1, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v1, "TypeFormWebView"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/high16 v0, 0x70000

    and-int v0, v19, v0

    if-ne v0, v9, :cond_1c

    move/from16 v0, v17

    :goto_11
    const/16 v1, 0x800

    goto :goto_12

    :cond_1c
    move/from16 v0, v16

    goto :goto_11

    :goto_12
    if-ne v13, v1, :cond_1d

    move/from16 v1, v17

    goto :goto_13

    :cond_1d
    move/from16 v1, v16

    :goto_13
    or-int/2addr v0, v1

    const/16 v13, 0x4000

    if-ne v14, v13, :cond_1e

    move/from16 v1, v17

    goto :goto_14

    :cond_1e
    move/from16 v1, v16

    :goto_14
    or-int/2addr v0, v1

    const/4 v1, 0x4

    if-ne v10, v1, :cond_1f

    move/from16 v1, v17

    goto :goto_15

    :cond_1f
    move/from16 v1, v16

    :goto_15
    or-int/2addr v0, v1

    const/16 v1, 0x20

    if-ne v11, v1, :cond_20

    move/from16 v1, v17

    goto :goto_16

    :cond_20
    move/from16 v1, v16

    :goto_16
    or-int/2addr v0, v1

    invoke-virtual {v12, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_22

    move-object/from16 v0, v23

    if-ne v1, v0, :cond_21

    move-object/from16 v23, v0

    goto :goto_17

    :cond_21
    move-object v15, v0

    goto :goto_18

    :cond_22
    :goto_17
    new-instance v0, Lid2/s;

    move-object/from16 v8, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object v7, v2

    move-object v9, v15

    move-object/from16 v1, v22

    move-object/from16 v15, v23

    move-object/from16 v2, p5

    invoke-direct/range {v0 .. v9}, Lid2/s;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Lh/i;)V

    move-object v2, v7

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_18
    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    if-ne v14, v13, :cond_23

    move/from16 v0, v17

    :goto_19
    const/16 v1, 0x20

    goto :goto_1a

    :cond_23
    move/from16 v0, v16

    goto :goto_19

    :goto_1a
    if-ne v11, v1, :cond_24

    move/from16 v1, v17

    goto :goto_1b

    :cond_24
    move/from16 v1, v16

    :goto_1b
    or-int/2addr v0, v1

    const/4 v1, 0x4

    if-ne v10, v1, :cond_25

    move/from16 v16, v17

    :cond_25
    or-int v0, v0, v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_26

    if-ne v1, v15, :cond_27

    :cond_26
    new-instance v0, Lsy2/r;

    move-object/from16 v5, p1

    move-object/from16 v4, p4

    move-object v1, v3

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v5}, Lsy2/r;-><init>(Lp1/c1;Lp1/c1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_27
    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    move-object v1, v6

    const/4 v6, 0x0

    move-object v4, v12

    move-object/from16 v2, v18

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1c

    :cond_28
    move-object v4, v12

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1c
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_29

    new-instance v0, Ld30/l0;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Ld30/l0;-><init>(Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final u(Lp1/c1;Landroid/net/Uri;)Ll83/a0;
    .locals 4

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/ValueCallback;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    new-array v2, v2, [Landroid/net/Uri;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-interface {v0, v2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_1
    invoke-interface {p0, v1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Lh/i;Landroid/content/Context;)Landroid/webkit/WebView;
    .locals 12

    move-object/from16 v0, p9

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/webkit/WebView;

    invoke-direct {v1, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    new-instance v0, Lnz2/e;

    new-instance v2, Lsy2/h;

    const/4 v3, 0x5

    invoke-direct {v2, p1, v3}, Lsy2/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance v3, Lsy2/j;

    const/4 v4, 0x5

    invoke-direct {v3, v4, p2, p3}, Lsy2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lsy2/r;

    const/4 v11, 0x2

    move-object v6, p2

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v5 .. v11}, Lsy2/r;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;I)V

    move-object v4, v5

    new-instance v5, Lsy2/r;

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v11}, Lsy2/r;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;I)V

    invoke-direct {v0, v2, v3, v4, v5}, Lnz2/e;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    new-instance v0, Lnz2/c;

    new-instance v2, Lsy2/h;

    const/4 v3, 0x4

    invoke-direct {v2, v7, v3}, Lsy2/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/webkit/ValueCallback;

    new-instance v4, Lsy2/s;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lsy2/s;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Lsy2/c;

    const/4 v6, 0x1

    move-object/from16 v7, p8

    invoke-direct {v5, v7, v6}, Lsy2/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3, v4, v5}, Lnz2/d;->b(Landroid/webkit/ValueCallback;Lkotlin/jvm/functions/Function1;Lc93/a;)Lkotlin/jvm/functions/Function1;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lnz2/c;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-object v1
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/whooplabs/feature/navigation/c$h;

    invoke-direct {v0, p1}, Lcom/whoop/whooplabs/feature/navigation/c$h;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "error"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    new-instance p0, Lny2/a$l;

    const-string v0, " "

    invoke-static {p2, v0, p5}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-direct {p0, p2, p3, p4}, Lny2/a$l;-><init>(Ljava/lang/String;ZLcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/Integer;)Ll83/a0;
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    new-instance p0, Lny2/a$l;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "): "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-direct {p0, p2, p3, p4}, Lny2/a$l;-><init>(Ljava/lang/String;ZLcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
