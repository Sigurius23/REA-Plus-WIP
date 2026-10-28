.class public final Lu40/c;
.super Landroidx/fragment/app/y;
.source "SourceFile"

# interfaces
.implements Lu40/h;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lu40/c;",
        "Landroidx/fragment/app/y;",
        "Lu40/h;",
        "<init>",
        "()V",
        "hcaptcha_release"
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
.field public w:Lq30/w0;

.field public x:Landroid/widget/LinearLayout;

.field public y:F

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/y;-><init>()V

    const v0, 0x3f19999a    # 0.6f

    iput v0, p0, Lu40/c;->y:F

    return-void
.end method


# virtual methods
.method public final A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Landroid/view/View;
    .locals 2

    const v0, 0x7f0d0657

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    new-instance p2, Lu40/b;

    invoke-direct {p2, p0, p3}, Lu40/b;-><init>(Lu40/c;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-object p1
.end method

.method public final B(Landroid/view/View;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Lcom/stripe/hcaptcha/webview/HCaptchaWebView;
    .locals 1

    const v0, 0x7f0a0d84

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    invoke-virtual {p2}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result p2

    if-nez p2, :cond_0

    new-instance p2, Lkn2/e;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lkn2/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final e(Lcom/stripe/hcaptcha/HCaptchaException;)V
    .locals 3

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu40/c;->w:Lq30/w0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lq30/w0;->M(Lcom/stripe/hcaptcha/HCaptchaException;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    :cond_1
    iget-object v0, p0, Lu40/c;->w:Lq30/w0;

    if-eqz v0, :cond_3

    if-eqz v1, :cond_2

    iget-object p1, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    const-string v0, "javascript:resetAndExecute();"

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lu40/f;

    iget-object v0, v0, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lu40/c;->w:Lq30/w0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getSize()Lcom/stripe/hcaptcha/config/HCaptchaSize;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lu40/c;->z()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lu40/c;->z:Z

    return-void
.end method

.method public final j(Landroidx/fragment/app/r0;)V
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    const-string v0, "getSupportFragmentManager(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-virtual {p1, v0}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    iget-object p1, p0, Lu40/c;->w:Lq30/w0;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lq30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lu40/f;

    iget-object p1, p1, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v1, Lu40/d;->H:Lu40/d;

    invoke-direct {v0, v1}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public final m()V
    .locals 2

    iget-object v0, p0, Lu40/c;->w:Lq30/w0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getSize()Lcom/stripe/hcaptcha/config/HCaptchaSize;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu40/c;->z:Z

    invoke-virtual {p0}, Lu40/c;->z()V

    :cond_1
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    const-string v0, "dialogInterface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/y;->onCancel(Landroid/content/DialogInterface;)V

    new-instance p1, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v0, Lu40/d;->F:Lu40/d;

    invoke-direct {p1, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-virtual {p0, p1}, Lu40/c;->e(Lcom/stripe/hcaptcha/HCaptchaException;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/y;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    const v0, 0x7f1502d9

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/y;->setStyle(II)V

    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-object p3

    :catch_0
    move-object v6, p0

    move-object v7, p3

    goto/16 :goto_1

    :catch_1
    move-object v6, p0

    move-object v7, p3

    goto/16 :goto_2

    :catch_2
    move-object v6, p0

    move-object v7, p3

    goto/16 :goto_3

    :catch_3
    move-object v6, p0

    move-object v7, p3

    goto/16 :goto_4

    :cond_0
    invoke-static {v0}, Lu40/a;->c(Landroid/os/Bundle;)Lu40/f;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v7, :cond_1

    :try_start_1
    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    return-object p3

    :catch_4
    move-object v6, p0

    goto/16 :goto_1

    :catch_5
    move-object v6, p0

    goto/16 :goto_2

    :catch_6
    move-object v6, p0

    goto/16 :goto_3

    :catch_7
    move-object v6, p0

    goto/16 :goto_4

    :cond_1
    iget-object v1, v7, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Lu40/a;->a(Landroid/os/Bundle;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    new-instance p1, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object p2, Lu40/d;->H:Lu40/d;

    invoke-direct {p1, p2}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3

    :cond_2
    invoke-static {v0}, Lu40/a;->b(Landroid/os/Bundle;)Lv40/a;

    move-result-object v5

    if-nez v5, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    new-instance p1, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object p2, Lu40/d;->H:Lu40/d;

    invoke-direct {p1, p2}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3

    :cond_3
    invoke-virtual {p0, p1, p2, v4}, Lu40/c;->A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, v4}, Lu40/c;->B(Landroid/view/View;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    move-result-object v8

    const p2, 0x7f0a084a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result v1

    const/4 v9, 0x0

    if-eqz v1, :cond_4

    move v1, v9

    goto :goto_0

    :cond_4
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lu40/c;->x:Landroid/widget/LinearLayout;

    new-instance v1, Lq30/w0;

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {v2, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v3

    const-string p2, "requireContext(...)"

    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_7
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Landroid/view/InflateException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_4

    move-object v6, p0

    :try_start_2
    invoke-direct/range {v1 .. v8}, Lq30/w0;-><init>(Landroid/os/Handler;Landroid/content/Context;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lv40/a;Lu40/h;Lu40/f;Lcom/stripe/hcaptcha/webview/HCaptchaWebView;)V

    iput-object v1, v6, Lu40/c;->w:Lq30/w0;

    iput-boolean v9, v6, Lu40/c;->z:Z
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_b
    .catch Landroid/os/BadParcelableException; {:try_start_2 .. :try_end_2} :catch_a
    .catch Landroid/view/InflateException; {:try_start_2 .. :try_end_2} :catch_9
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_8

    return-object p1

    :catch_8
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    if-eqz v7, :cond_5

    iget-object p1, v7, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_5

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v0, Lu40/d;->H:Lu40/d;

    invoke-direct {p2, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :catch_9
    :goto_2
    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    if-eqz v7, :cond_5

    iget-object p1, v7, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_5

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v0, Lu40/d;->H:Lu40/d;

    invoke-direct {p2, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :catch_a
    :goto_3
    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    if-eqz v7, :cond_5

    iget-object p1, v7, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_5

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v0, Lu40/d;->H:Lu40/d;

    invoke-direct {p2, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :catch_b
    :goto_4
    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    if-eqz v7, :cond_5

    iget-object p1, v7, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_5

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v0, Lu40/d;->H:Lu40/d;

    invoke-direct {p2, v0}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_5
    return-object p3
.end method

.method public final onDestroy()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroy()V

    iget-object v0, p0, Lu40/c;->w:Lq30/w0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    const-string v1, "JSInterface"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    const-string v1, "JSDI"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    :cond_1
    return-void
.end method

.method public final onStart()V
    .locals 4

    invoke-super {p0}, Landroidx/fragment/app/y;->onStart()V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lu40/c;->w:Lq30/w0;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    iput v0, p0, Lu40/c;->y:F

    iget-object v0, v2, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Landroid/view/Window;->clearFlags(I)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/Window;->setDimAmount(F)V

    :cond_1
    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    :cond_0
    iget-object v0, p0, Lu40/c;->w:Lq30/w0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lu40/f;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lu40/f;->x:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final reset()V
    .locals 2

    iget-object v0, p0, Lu40/c;->w:Lq30/w0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/webview/HCaptchaWebView;

    const-string v1, "javascript:reset();"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    :cond_1
    return-void
.end method

.method public final z()V
    .locals 4

    iget-object v0, p0, Lu40/c;->w:Lq30/w0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lq30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lu40/c;->x:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Lar/d;

    const/16 v3, 0x11

    invoke-direct {v2, v0, v3}, Lar/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    iget v1, p0, Lu40/c;->y:F

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    :cond_1
    return-void
.end method
