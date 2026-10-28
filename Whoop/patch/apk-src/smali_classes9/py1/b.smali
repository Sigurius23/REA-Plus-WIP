.class public abstract Lpy1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpy1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0007\"\u0018\u0010\r\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lxy1/c;",
        "",
        "c",
        "(Lxy1/c;)Ljava/lang/String;",
        "toAnalyticsMfaType",
        "Ldj0/u;",
        "b",
        "(Ldj0/u;)Ljava/lang/String;",
        "a",
        "toAnalyticsEventName",
        "Luy1/g;",
        "d",
        "(Luy1/g;)Ljava/lang/String;",
        "toAnalyticsType",
        "mfa_release"
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
.method public static final a(Ldj0/u;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ldj0/u$b;

    if-eqz v0, :cond_0

    const-string p0, "Auth Flow"

    return-object p0

    :cond_0
    instance-of p0, p0, Ldj0/u$a;

    if-eqz p0, :cond_1

    const-string p0, "MFA Setup Flow"

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(Ldj0/u;)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ldj0/u$b;

    const-string v1, "unknown"

    const-string v2, "phone_number"

    const-string v3, "email"

    if-eqz v0, :cond_2

    check-cast p0, Ldj0/u$b;

    invoke-virtual {p0}, Ldj0/u$b;->a()Ljava/lang/String;

    move-result-object p0

    const-string v0, "EMAIL_OTP"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v3

    :cond_0
    const-string v0, "SMS_MFA"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-object v2

    :cond_1
    return-object v1

    :cond_2
    instance-of v0, p0, Ldj0/u$a;

    if-eqz v0, :cond_6

    check-cast p0, Ldj0/u$a;

    invoke-virtual {p0}, Ldj0/u$a;->a()Ldj0/a;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ldj0/a;->b()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    const-string v0, "EMAIL"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return-object v3

    :cond_4
    const-string v0, "SMS"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    return-object v2

    :cond_5
    return-object v1

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final c(Lxy1/c;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpy1/b$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const-string p0, "email"

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "phone_number"

    return-object p0
.end method

.method public static final d(Luy1/g;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpy1/b$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const-string p0, "phone_number"

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "email"

    return-object p0
.end method
