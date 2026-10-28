.class public abstract Lcm0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "event",
        "Lnl0/d;",
        "a",
        "(Ljava/lang/Object;)Lnl0/d;",
        "bot_release"
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
.method public static final a(Ljava/lang/Object;)Lnl0/d;
    .locals 9

    instance-of v0, p0, Luz0/h$a;

    if-eqz v0, :cond_0

    new-instance v1, Lnl0/d$a;

    check-cast p0, Luz0/h$a;

    invoke-virtual {p0}, Luz0/h$a;->b()Z

    move-result v2

    invoke-virtual {p0}, Luz0/h$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Luz0/h$a;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v8}, Lnl0/d$a;-><init>(ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p0, Lnl0/d;

    if-eqz v0, :cond_1

    check-cast p0, Lnl0/d;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
