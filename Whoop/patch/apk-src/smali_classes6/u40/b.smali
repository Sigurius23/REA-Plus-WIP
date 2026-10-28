.class public final synthetic Lu40/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final synthetic w:Lu40/c;

.field public final synthetic x:Lcom/stripe/hcaptcha/config/HCaptchaConfig;


# direct methods
.method public synthetic constructor <init>(Lu40/c;Lcom/stripe/hcaptcha/config/HCaptchaConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu40/b;->w:Lu40/c;

    iput-object p2, p0, Lu40/b;->x:Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lu40/b;->w:Lu40/c;

    iget-boolean p2, p1, Lu40/c;->z:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Lu40/b;->x:Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    invoke-virtual {p2}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getLoading()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p1, p1, Lu40/c;->w:Lq30/w0;

    if-eqz p1, :cond_1

    new-instance p2, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object p3, Lu40/d;->F:Lu40/d;

    invoke-direct {p2, p3}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    invoke-virtual {p1, p2}, Lq30/w0;->M(Lcom/stripe/hcaptcha/HCaptchaException;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
