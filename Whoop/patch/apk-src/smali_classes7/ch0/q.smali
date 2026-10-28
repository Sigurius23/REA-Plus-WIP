.class public abstract Lch0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "event",
        "",
        "turnId",
        "Ljava/time/Clock;",
        "clock",
        "Lzg0/g;",
        "a",
        "(Ljava/lang/Object;Ljava/lang/String;Ljava/time/Clock;)Lzg0/g;",
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
.method public static final a(Ljava/lang/Object;Ljava/lang/String;Ljava/time/Clock;)Lzg0/g;
    .locals 10

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lc41/l5;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_7

    new-instance p2, Lzg0/g$c;

    check-cast p0, Lc41/l5;

    invoke-virtual {p0}, Lc41/l5;->a()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1, p0}, Lzg0/g$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :cond_0
    instance-of p1, p0, Luz0/h$a;

    if-eqz p1, :cond_1

    new-instance v0, Lzg0/g$a;

    check-cast p0, Luz0/h$a;

    invoke-virtual {p0}, Luz0/h$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Luz0/h$a;->b()Z

    move-result v2

    invoke-virtual {p0}, Luz0/h$a;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lzg0/g$a;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    instance-of p1, p0, Lnl0/d$a;

    if-eqz p1, :cond_2

    new-instance p1, Lzg0/g$a;

    check-cast p0, Lnl0/d$a;

    invoke-virtual {p0}, Lnl0/d$a;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lnl0/d$a;->b()Z

    move-result v0

    invoke-virtual {p0}, Lnl0/d$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lnl0/d$a;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p2, v0, v1, p0}, Lzg0/g$a;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_2
    instance-of p1, p0, Lnl0/d$l;

    if-eqz p1, :cond_3

    new-instance v0, Lzg0/g$d;

    check-cast p0, Lnl0/d$l;

    invoke-virtual {p0}, Lnl0/d$l;->e()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lnl0/b;->USER:Lnl0/b;

    invoke-virtual {p2}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    const/16 v8, 0x2c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lzg0/g$d;-><init>(Ljava/lang/String;Lnl0/b;Ljava/util/List;ZJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    instance-of p1, p0, Loz0/c;

    if-eqz p1, :cond_4

    new-instance v0, Lzg0/g$d;

    check-cast p0, Loz0/c;

    invoke-virtual {p0}, Loz0/c;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lnl0/b;->USER:Lnl0/b;

    invoke-virtual {p2}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x1

    invoke-direct/range {v0 .. v9}, Lzg0/g$d;-><init>(Ljava/lang/String;Lnl0/b;Ljava/util/List;ZJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_4
    instance-of p1, p0, Lc91/a$b;

    if-eqz p1, :cond_5

    new-instance v0, Lzg0/g$d;

    check-cast p0, Lc91/a$b;

    invoke-virtual {p0}, Lc91/a$b;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lnl0/b;->USER:Lnl0/b;

    invoke-virtual {p2}, Ljava/time/Clock;->millis()J

    move-result-wide v5

    const/16 v8, 0x2c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lzg0/g$d;-><init>(Ljava/lang/String;Lnl0/b;Ljava/util/List;ZJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_5
    instance-of p1, p0, Lc91/a$a;

    if-eqz p1, :cond_6

    new-instance p1, Lzg0/g$h;

    check-cast p0, Lc91/a$a;

    invoke-virtual {p0}, Lc91/a$a;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lzg0/g$h;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_6
    instance-of p1, p0, Lc91/a$c;

    if-eqz p1, :cond_7

    new-instance p1, Lzg0/g$p;

    check-cast p0, Lc91/a$c;

    invoke-virtual {p0}, Lc91/a$c;->a()Lc91/b;

    move-result-object p0

    invoke-direct {p1, p0}, Lzg0/g$p;-><init>(Lc91/b;)V

    return-object p1

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Ljava/lang/String;Ljava/time/Clock;ILjava/lang/Object;)Lzg0/g;
    .locals 0

    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p2

    const-string p3, "systemDefaultZone(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-static {p0, p1, p2}, Lch0/q;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/time/Clock;)Lzg0/g;

    move-result-object p0

    return-object p0
.end method
