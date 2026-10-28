.class public final Lcom/stripe/hcaptcha/HCaptchaException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00060\u0001j\u0002`\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/HCaptchaException;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
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


# instance fields
.field public final w:Lu40/d;

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lu40/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->w:Lu40/d;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->x:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lu40/d;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->w:Lu40/d;

    .line 6
    iput-object p2, p0, Lcom/stripe/hcaptcha/HCaptchaException;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/hcaptcha/HCaptchaException;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/hcaptcha/HCaptchaException;

    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->w:Lu40/d;

    iget-object v3, p1, Lcom/stripe/hcaptcha/HCaptchaException;->w:Lu40/d;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->x:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/hcaptcha/HCaptchaException;->x:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->x:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->w:Lu40/d;

    iget-object v0, v0, Lu40/d;->x:Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/hcaptcha/HCaptchaException;->w:Lu40/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->x:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HCaptchaException(hCaptchaError="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->w:Lu40/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hCaptchaMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/stripe/hcaptcha/HCaptchaException;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
