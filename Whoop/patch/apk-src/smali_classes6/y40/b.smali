.class public final Ly40/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu40/h;


# instance fields
.field public E:Z

.field public final w:Lu40/f;

.field public final x:Lq30/w0;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r0;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lv40/a;Lu40/f;)V
    .locals 9

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ly40/b;->w:Lu40/f;

    new-instance v8, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    invoke-direct {v8, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    const v0, 0x7f0a0d84

    invoke-virtual {v8, v0}, Landroid/view/View;->setId(I)V

    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Lq30/w0;

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object v6, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v8}, Lq30/w0;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lv40/a;Lu40/h;Lu40/f;Lcom/stripe/hcaptcha/webview/HCaptchaWebView;)V

    iput-object v1, v6, Ly40/b;->x:Lq30/w0;

    return-void
.end method


# virtual methods
.method public final e(Lcom/stripe/hcaptcha/HCaptchaException;)V
    .locals 2

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly40/b;->x:Lq30/w0;

    invoke-virtual {v0, p1}, Lq30/w0;->M(Lcom/stripe/hcaptcha/HCaptchaException;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    const-string v0, "javascript:resetAndExecute();"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Ly40/b;->w:Lu40/f;

    iget-object v0, v0, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Ly40/b;->w:Lu40/f;

    iget-object v0, v0, Lu40/f;->w:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final j(Landroidx/fragment/app/r0;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Ly40/b;->y:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Ly40/b;->x:Lq30/w0;

    iget-object p1, p1, Lq30/w0;->z:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    const-string v0, "javascript:resetAndExecute();"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Ly40/b;->z:Z

    return-void
.end method

.method public final m()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly40/b;->y:Z

    iget-boolean v0, p0, Ly40/b;->E:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Ly40/b;->E:Z

    invoke-virtual {p0}, Ly40/b;->reset()V

    return-void

    :cond_0
    iget-boolean v0, p0, Ly40/b;->z:Z

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Ly40/b;->z:Z

    iget-object v0, p0, Ly40/b;->x:Lq30/w0;

    iget-object v0, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    const-string v1, "javascript:resetAndExecute();"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly40/b;->w:Lu40/f;

    iget-object v0, v0, Lu40/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final reset()V
    .locals 3

    iget-boolean v0, p0, Ly40/b;->y:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly40/b;->x:Lq30/w0;

    iget-object v1, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    const-string v2, "javascript:reset();"

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    iget-object v0, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ly40/b;->E:Z

    return-void
.end method
