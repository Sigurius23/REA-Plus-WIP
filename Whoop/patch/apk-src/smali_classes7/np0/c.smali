.class public abstract Lnp0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lkp0/a;",
        "Lnp0/a;",
        "a",
        "(Lkp0/a;)Lnp0/a;",
        "sleep-coach_release"
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
.method public static final a(Lkp0/a;)Lnp0/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkp0/c;

    if-eqz v0, :cond_0

    sget-object p0, Lnp0/a;->EXACT_TIME:Lnp0/a;

    return-object p0

    :cond_0
    instance-of v0, p0, Lkp0/f;

    if-eqz v0, :cond_1

    sget-object p0, Lnp0/a;->IN_THE_GREEN:Lnp0/a;

    return-object p0

    :cond_1
    instance-of p0, p0, Lkp0/n;

    if-eqz p0, :cond_2

    sget-object p0, Lnp0/a;->SLEEP_GOAL:Lnp0/a;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
