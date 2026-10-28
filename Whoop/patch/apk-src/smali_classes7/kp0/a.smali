.class public abstract Lkp0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000c8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkp0/a;",
        "",
        "<init>",
        "()V",
        "",
        "enabled",
        "Lnp0/b;",
        "c",
        "(Z)Lnp0/b;",
        "Lkp0/o;",
        "a",
        "()Lkp0/o;",
        "Lorg/joda/time/LocalTime;",
        "b",
        "()Lorg/joda/time/LocalTime;",
        "latestWakeTime",
        "Lkp0/c;",
        "Lkp0/f;",
        "Lkp0/n;",
        "sleep-coach_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkp0/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lkp0/o;
    .locals 1

    instance-of v0, p0, Lkp0/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkp0/c;

    invoke-virtual {v0}, Lkp0/c;->d()Lkp0/o;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v0, p0, Lkp0/f;

    if-eqz v0, :cond_1

    sget-object v0, Lkp0/l;->z:Lkp0/l;

    return-object v0

    :cond_1
    instance-of v0, p0, Lkp0/n;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lkp0/n;

    invoke-virtual {v0}, Lkp0/n;->d()Lkp0/o;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public abstract b()Lorg/joda/time/LocalTime;
.end method

.method public final c(Z)Lnp0/b;
    .locals 4

    new-instance v0, Lnp0/b;

    invoke-static {p0}, Lnp0/c;->a(Lkp0/a;)Lnp0/a;

    move-result-object v1

    instance-of v2, p0, Lkp0/c;

    if-eqz v2, :cond_0

    move-object v2, p0

    check-cast v2, Lkp0/c;

    invoke-virtual {v2}, Lkp0/c;->d()Lkp0/o;

    move-result-object v2

    goto :goto_1

    :cond_0
    instance-of v2, p0, Lkp0/f;

    if-eqz v2, :cond_1

    sget-object v2, Lkp0/l;->z:Lkp0/l;

    goto :goto_1

    :cond_1
    instance-of v2, p0, Lkp0/n;

    if-eqz v2, :cond_4

    move-object v2, p0

    check-cast v2, Lkp0/n;

    invoke-virtual {v2}, Lkp0/n;->d()Lkp0/o;

    move-result-object v3

    instance-of v3, v3, Lkp0/q;

    if-nez v3, :cond_3

    invoke-virtual {v2}, Lkp0/n;->d()Lkp0/o;

    move-result-object v3

    instance-of v3, v3, Lkp0/r;

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lkp0/n;->d()Lkp0/o;

    move-result-object v2

    goto :goto_1

    :cond_3
    :goto_0
    sget-object v2, Lkp0/l;->z:Lkp0/l;

    :goto_1
    invoke-virtual {p0}, Lkp0/a;->b()Lorg/joda/time/LocalTime;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3, p1}, Lnp0/b;-><init>(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)V

    return-object v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
