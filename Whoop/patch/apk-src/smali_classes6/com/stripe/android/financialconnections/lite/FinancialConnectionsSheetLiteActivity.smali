.class public final Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;
.super Lg/l;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;",
        "Lg/l;",
        "<init>",
        "()V",
        "financial-connections-lite_release"
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
.field public static final synthetic z:I


# instance fields
.field public w:Landroid/webkit/WebView;

.field public x:Landroid/widget/ProgressBar;

.field public final y:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lg/l;-><init>(I)V

    new-instance v0, Llt2/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Llt2/a;-><init>(I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Llz/i;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llz/l;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Llz/l;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;I)V

    new-instance v4, Llz/l;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Llz/l;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->y:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Lg/l;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_9

    const-string v0, "FinancialConnectionsSheetActivityArgs"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_9

    const p1, 0x7f0d0639

    invoke-virtual {p0, p1}, Lg/l;->setContentView(I)V

    const p1, 0x7f0a0d84

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->w:Landroid/webkit/WebView;

    const p1, 0x7f0a0a1f

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->x:Landroid/widget/ProgressBar;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-lt p1, v2, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1, v4}, Lpf/c;->V(Landroid/view/Window;Z)V

    const p1, 0x1020002

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v2, Llive/hms/video/factories/c;

    invoke-direct {v2, v3}, Llive/hms/video/factories/c;-><init>(I)V

    sget-object v5, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1, v2}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "getIntent(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lkz/d;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p1}, Ltx/f;->N(Lkz/d;)Lkz/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    const/4 v2, -0x1

    if-nez p1, :cond_2

    move p1, v2

    goto :goto_1

    :cond_2
    sget-object v5, Llz/j;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v5, p1

    :goto_1
    const/4 v5, 0x3

    if-eq p1, v2, :cond_4

    if-eq p1, v1, :cond_4

    if-eq p1, v3, :cond_4

    if-ne p1, v5, :cond_3

    const p1, 0x7f0604e4

    goto :goto_2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    const p1, 0x7f0604e2

    :goto_2
    invoke-static {p0, p1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    iget-object v2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->x:Landroid/widget/ProgressBar;

    const-string v3, "progressBar"

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    iget-object v2, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->x:Landroid/widget/ProgressBar;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/widget/ProgressBar;->getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->x:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_6

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->w:Landroid/webkit/WebView;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    new-instance v2, Lcom/iterable/iterableapi/g2;

    invoke-direct {v2, p0}, Lcom/iterable/iterableapi/g2;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V

    invoke-virtual {p1, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    new-instance v2, Lcom/iterable/iterableapi/i2;

    invoke-direct {v2, p0}, Lcom/iterable/iterableapi/i2;-><init>(Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;)V

    invoke-virtual {p1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object p1

    new-instance v2, Lg/a0;

    invoke-direct {v2, p0, v1}, Lg/a0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p0, v2}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v1, Lkd/f;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v0, v2}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v0, v0, v1, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_5
    const-string p1, "webView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
