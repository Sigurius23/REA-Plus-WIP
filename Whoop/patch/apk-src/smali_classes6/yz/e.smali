.class public final Lyz/e;
.super Ldz/i;
.source "SourceFile"


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "link.2fa.resend_code"

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lyz/e;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x14139

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "TwoFAResendCode(verificationType=SMS)"

    return-object v0
.end method
