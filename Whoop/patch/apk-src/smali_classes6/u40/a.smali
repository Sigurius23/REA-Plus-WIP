.class public abstract Lu40/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/os/Bundle;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const-string v2, "hCaptchaConfig"

    if-lt v0, v1, :cond_0

    const-class v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    invoke-virtual {p0, v2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p0

    :goto_0
    check-cast p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    return-object p0
.end method

.method public static b(Landroid/os/Bundle;)Lv40/a;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const-string v2, "hCaptchaInternalConfig"

    if-lt v0, v1, :cond_0

    const-class v0, Lv40/a;

    invoke-virtual {p0, v2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p0

    :goto_0
    check-cast p0, Lv40/a;

    return-object p0
.end method

.method public static c(Landroid/os/Bundle;)Lu40/f;
    .locals 2

    const-string v0, "hCaptchaDialogListener"

    const-class v1, Lu40/f;

    invoke-static {p0, v1, v0}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu40/f;

    return-object p0
.end method
