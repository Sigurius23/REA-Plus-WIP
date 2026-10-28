.class public final Lcom/stripe/android/view/PaymentAuthWebViewActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentAuthWebViewActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic E:I


# instance fields
.field public final w:Ll83/p;

.field public final x:Ll83/p;

.field public final y:Ll83/p;

.field public final z:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Ls40/p0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls40/p0;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->w:Ll83/p;

    new-instance v0, Ls40/p0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ls40/p0;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->x:Ll83/p;

    new-instance v0, Ls40/p0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ls40/p0;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->y:Ll83/p;

    new-instance v0, Ls40/p0;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Ls40/p0;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Ls40/t0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ls40/q0;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Ls40/q0;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;I)V

    new-instance v4, Ls40/q0;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Ls40/q0;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->z:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final o()V
    .locals 11

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    new-instance v2, Lv10/b;

    invoke-virtual {v0}, Ls40/t0;->g()Lv10/b;

    move-result-object v3

    iget-object v3, v3, Lv10/b;->w:Ljava/lang/String;

    iget-object v4, v0, Ls40/t0;->w:Lyx/b;

    iget-boolean v5, v4, Lyx/b;->J:Z

    if-eqz v5, :cond_0

    const/4 v5, 0x3

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v0}, Ls40/t0;->g()Lv10/b;

    move-result-object v6

    iget-object v6, v6, Lv10/b;->y:Lcom/stripe/android/core/exception/StripeException;

    iget-boolean v4, v4, Lyx/b;->I:Z

    invoke-virtual {v0}, Ls40/t0;->g()Lv10/b;

    move-result-object v7

    iget-object v7, v7, Lv10/b;->E:Ljava/lang/String;

    invoke-virtual {v0}, Ls40/t0;->g()Lv10/b;

    invoke-virtual {v0}, Ls40/t0;->g()Lv10/b;

    move-result-object v0

    iget-object v9, v0, Lv10/b;->G:Ljava/lang/String;

    const/4 v8, 0x0

    move-object v10, v6

    move v6, v4

    move v4, v5

    move-object v5, v10

    invoke-direct/range {v2 .. v9}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ly00/m6;Ljava/lang/String;)V

    invoke-virtual {v2}, Lv10/b;->b()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "putExtras(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 20

    move-object/from16 v2, p0

    invoke-super/range {p0 .. p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lpf/c;->V(Landroid/view/Window;Z)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v0

    iget-object v0, v0, Liz/d;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    new-instance v3, Lqa/b;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Lqa/b;-><init>(I)V

    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, v3}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    iget-object v0, v2, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->x:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lyx/b;

    const/4 v0, 0x1

    const-string v3, "additionalNonPiiParams"

    const/4 v4, 0x6

    sget-object v5, Lm83/z;->w:Lm83/z;

    const/4 v6, 0x0

    sget-object v7, Lqy/e;->b:Lqy/d;

    sget-object v9, Lm83/a0;->w:Lm83/a0;

    const-string v10, "getApplicationContext(...)"

    if-nez v8, :cond_1

    invoke-virtual {v2, v1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lyy/j;

    sget-object v10, Lbc3/q0;->a:Lkc3/e;

    sget-object v10, Lkc3/d;->w:Lkc3/d;

    invoke-static {v10}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-direct {v8, v7, v10}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v7, Lb10/b;

    new-instance v10, Lal0/f;

    invoke-direct {v10, v1, v0}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v7, v1, v9, v10}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object v0, Lb20/c;->y:Lb20/c;

    and-int/lit8 v1, v4, 0x4

    if-eqz v1, :cond_0

    move-object v6, v5

    :cond_0
    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v6}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object v0

    invoke-virtual {v8, v0}, Lyy/j;->a(Lyy/b;)V

    return-void

    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v1

    const-string v11, "PaymentAuthWebViewActivity#onCreate()"

    invoke-virtual {v1, v11}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v1

    iget-object v1, v1, Liz/d;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {v2, v1}, Lm/m;->setContentView(Landroid/view/View;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v1

    iget-object v1, v1, Liz/d;->c:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v2, v1}, Lm/m;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v1

    const-string v11, "PaymentAuthWebViewActivity#customizeToolbar()"

    invoke-virtual {v1, v11}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v1

    iget-object v1, v1, Ls40/t0;->F:Ls40/s0;

    if-eqz v1, :cond_2

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v11

    const-string v12, "PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title"

    invoke-virtual {v11, v12}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v11

    iget-object v11, v11, Liz/d;->c:Landroidx/appcompat/widget/Toolbar;

    iget-object v12, v1, Ls40/s0;->a:Ljava/lang/String;

    iget-object v1, v1, Ls40/s0;->b:Lm30/g;

    invoke-static {v2, v12, v1}, Ls30/b;->c(Lm/m;Ljava/lang/String;Lm30/c;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v11, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v1

    iget-object v1, v1, Ls40/t0;->G:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v11

    const-string v12, "PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color"

    invoke-virtual {v11, v12}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v11

    iget-object v11, v11, Liz/d;->c:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v11, v1}, Landroid/view/View;->setBackgroundColor(I)V

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x22

    if-gt v11, v12, :cond_3

    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v11

    invoke-virtual {v11, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_3
    invoke-virtual {v2}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v1

    new-instance v11, Lrq0/x;

    const/16 v12, 0x9

    invoke-direct {v11, v2, v12}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    const/4 v12, 0x3

    invoke-static {v1, v6, v11, v12}, Lo73/a;->n(Lg/z;Lc4/d0;Lkotlin/jvm/functions/Function1;I)V

    iget-object v11, v8, Lyx/b;->y:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v1

    invoke-virtual {v1}, Ls40/t0;->g()Lv10/b;

    move-result-object v1

    new-instance v13, Landroid/content/Intent;

    invoke-direct {v13}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v1}, Lv10/b;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v13, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v1

    const-string v13, "putExtras(...)"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, -0x1

    invoke-virtual {v2, v13, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v1

    const-string v8, "PaymentAuthWebViewActivity#onCreate() - clientSecret is blank"

    invoke-virtual {v1, v8}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lyy/j;

    sget-object v10, Lbc3/q0;->a:Lkc3/e;

    sget-object v10, Lkc3/d;->w:Lkc3/d;

    invoke-static {v10}, Ls93/k;->c(Ljava/lang/Object;)V

    invoke-direct {v8, v7, v10}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v7, Lb10/b;

    new-instance v10, Lal0/f;

    invoke-direct {v10, v1, v0}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-direct {v7, v1, v9, v10}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object v0, Lb20/e;->x:Lb20/e;

    and-int/lit8 v1, v4, 0x4

    if-eqz v1, :cond_4

    move-object v6, v5

    :cond_4
    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v6}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object v0

    invoke-virtual {v8, v0}, Lyy/j;->a(Lyy/b;)V

    return-void

    :cond_5
    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v1

    const-string v3, "PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl"

    invoke-virtual {v1, v3}, Lqy/d;->a(Ljava/lang/String;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v15

    invoke-static {v2}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    new-instance v3, Ls40/c0;

    invoke-direct {v3, v15, v2, v6, v0}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v6, v6, v3, v12}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v13, Ls40/u0;

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v14

    iget-object v9, v8, Lyx/b;->E:Ljava/lang/String;

    new-instance v0, Lq00/h0;

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v1, 0x1

    const-class v3, Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    const-string v4, "startActivity"

    const-string v5, "startActivity(Landroid/content/Intent;)V"

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v18, v0

    new-instance v0, Lq00/h0;

    const/4 v7, 0x7

    const-class v3, Lcom/stripe/android/view/PaymentAuthWebViewActivity;

    const-string v4, "onAuthComplete"

    const-string v5, "onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V"

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v7}, Lq00/h0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v19, v0

    move-object/from16 v17, v9

    move-object/from16 v16, v11

    invoke-direct/range {v13 .. v19}, Ls40/u0;-><init>(Lqy/d;Lec3/h2;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v0

    iget-object v0, v0, Liz/d;->d:Lcom/stripe/android/view/PaymentAuthWebView;

    new-instance v1, Lq80/h;

    const/16 v3, 0x1b

    invoke-direct {v1, v13, v3}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/PaymentAuthWebView;->setOnLoadBlank$payments_core_release(Lc93/a;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v0

    iget-object v0, v0, Liz/d;->d:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {v0, v13}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v0

    iget-object v0, v0, Liz/d;->d:Lcom/stripe/android/view/PaymentAuthWebView;

    new-instance v1, Ls40/o0;

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ls40/o0;-><init>(Lcom/stripe/android/view/PaymentAuthWebViewActivity;Lqy/d;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v0

    iget-object v9, v0, Ls40/t0;->y:Lb10/b;

    sget-object v10, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->U:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v14, 0x0

    const/16 v15, 0x3e

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v1

    iget-object v3, v0, Ls40/t0;->x:Lyy/j;

    invoke-virtual {v3, v1}, Lyy/j;->a(Lyy/b;)V

    iget-object v9, v0, Ls40/t0;->y:Lb10/b;

    sget-object v10, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->X:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    invoke-static/range {v9 .. v15}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v0

    invoke-virtual {v3, v0}, Lyy/j;->a(Lyy/b;)V

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v0

    iget-object v0, v0, Liz/d;->d:Lcom/stripe/android/view/PaymentAuthWebView;

    iget-object v1, v8, Lyx/b;->z:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v3

    iget-object v3, v3, Ls40/t0;->z:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v0, v1, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#onCreateOptionsMenu()"

    invoke-virtual {v0, v1}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lm/m;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f0002

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->s()Ls40/t0;

    move-result-object v0

    iget-object v0, v0, Ls40/t0;->E:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v1

    const-string v2, "PaymentAuthWebViewActivity#customizeToolbar() - updating close button text"

    invoke-virtual {v1, v2}, Lqy/d;->a(Ljava/lang/String;)V

    const v1, 0x7f0a004f

    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final onDestroy()V
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v0

    iget-object v0, v0, Liz/d;->e:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->r()Liz/d;

    move-result-object v0

    iget-object v0, v0, Liz/d;->d:Lcom/stripe/android/view/PaymentAuthWebView;

    invoke-virtual {v0}, Lcom/stripe/android/view/PaymentAuthWebView;->destroy()V

    invoke-super {p0}, Lm/m;->onDestroy()V

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->p()Lqy/d;

    move-result-object v0

    const-string v1, "PaymentAuthWebViewActivity#onOptionsItemSelected()"

    invoke-virtual {v0, v1}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a004f

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->o()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final p()Lqy/d;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->y:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqy/d;

    return-object v0
.end method

.method public final r()Liz/d;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->w:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liz/d;

    return-object v0
.end method

.method public final s()Ls40/t0;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentAuthWebViewActivity;->z:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls40/t0;

    return-object v0
.end method
