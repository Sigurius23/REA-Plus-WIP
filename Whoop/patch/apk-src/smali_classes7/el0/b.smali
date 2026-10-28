.class public final Lel0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lel0/b;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lnl0/d;",
        "event",
        "Lfl0/a;",
        "a",
        "(Lnl0/d;)Lfl0/a;",
        "Lzr2/a;",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lzr2/a;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lel0/b;->a:Lzr2/a;

    return-void
.end method


# virtual methods
.method public final a(Lnl0/d;)Lfl0/a;
    .locals 13

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lnl0/d$l;

    if-eqz v0, :cond_0

    new-instance v1, Lfl0/a$i;

    check-cast p1, Lnl0/d$l;

    invoke-virtual {p1}, Lnl0/d$l;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnl0/d$l;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnl0/d$l;->b()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Lnl0/d$l;->a()Ljava/util/List;

    move-result-object v5

    iget-object v0, p0, Lel0/b;->a:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->b()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p1}, Lnl0/d$l;->f()Z

    move-result v7

    invoke-virtual {p1}, Lnl0/d$l;->d()Lfl0/l;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Lfl0/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ZLfl0/l;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lnl0/d$m;

    if-eqz v0, :cond_1

    new-instance v0, Lfl0/a$j;

    check-cast p1, Lnl0/d$m;

    invoke-virtual {p1}, Lnl0/d$m;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnl0/d$m;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnl0/d$m;->e()Lfl0/l;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lfl0/a$j;-><init>(Ljava/lang/String;Ljava/lang/String;Lfl0/l;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lnl0/d$h;

    if-eqz v0, :cond_2

    new-instance v1, Lfl0/a$k;

    check-cast p1, Lnl0/d$h;

    invoke-virtual {p1}, Lnl0/d$h;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnl0/d$h;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnl0/d$h;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lnl0/d$h;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lnl0/d$h;->e()Z

    move-result v6

    invoke-virtual {p1}, Lnl0/d$h;->d()Z

    move-result v7

    invoke-virtual {p1}, Lnl0/d$h;->g()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lnl0/d$h;->a()Ljava/util/Map;

    move-result-object v9

    iget-object p1, p0, Lel0/b;->a:Lzr2/a;

    invoke-interface {p1}, Lzr2/a;->b()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-direct/range {v1 .. v10}, Lfl0/a$k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V

    return-object v1

    :cond_2
    instance-of v0, p1, Lnl0/d$n;

    if-eqz v0, :cond_3

    sget-object p1, Lfl0/a$l;->a:Lfl0/a$l;

    return-object p1

    :cond_3
    sget-object v0, Lnl0/d$i;->a:Lnl0/d$i;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v1, Lfl0/a$k;

    iget-object p1, p0, Lel0/b;->a:Lzr2/a;

    invoke-interface {p1}, Lzr2/a;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const/16 v11, 0xff

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v12}, Lfl0/a$k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_4
    instance-of v0, p1, Lnl0/d$s;

    if-eqz v0, :cond_5

    new-instance v0, Lfl0/a$f;

    check-cast p1, Lnl0/d$s;

    invoke-virtual {p1}, Lnl0/d$s;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lfl0/a$f;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    sget-object v0, Lnl0/d$e;->a:Lnl0/d$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lfl0/a$e;->a:Lfl0/a$e;

    return-object p1

    :cond_6
    instance-of v0, p1, Lnl0/d$d;

    if-eqz v0, :cond_7

    new-instance v0, Lfl0/a$d;

    check-cast p1, Lnl0/d$d;

    invoke-virtual {p1}, Lnl0/d$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lfl0/a$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_7
    instance-of v0, p1, Lnl0/d$c;

    if-eqz v0, :cond_8

    new-instance v0, Lfl0/a$c;

    check-cast p1, Lnl0/d$c;

    invoke-virtual {p1}, Lnl0/d$c;->a()Ljava/util/UUID;

    move-result-object p1

    invoke-direct {v0, p1}, Lfl0/a$c;-><init>(Ljava/util/UUID;)V

    return-object v0

    :cond_8
    instance-of v0, p1, Lnl0/d$b;

    if-eqz v0, :cond_9

    sget-object p1, Lfl0/a$b;->a:Lfl0/a$b;

    return-object p1

    :cond_9
    instance-of v0, p1, Lnl0/d$a;

    if-eqz v0, :cond_a

    new-instance v1, Lfl0/a$a;

    check-cast p1, Lnl0/d$a;

    invoke-virtual {p1}, Lnl0/d$a;->b()Z

    move-result v2

    invoke-virtual {p1}, Lnl0/d$a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnl0/d$a;->c()Z

    move-result v4

    invoke-virtual {p1}, Lnl0/d$a;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lnl0/d$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lfl0/a$a;-><init>(ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_a
    instance-of v0, p1, Lnl0/d$r;

    if-eqz v0, :cond_b

    new-instance v0, Lfl0/a$m;

    check-cast p1, Lnl0/d$r;

    invoke-virtual {p1}, Lnl0/d$r;->a()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lfl0/a$m;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_b
    instance-of v0, p1, Lnl0/d$j;

    if-eqz v0, :cond_c

    new-instance v0, Lfl0/a$h;

    check-cast p1, Lnl0/d$j;

    invoke-virtual {p1}, Lnl0/d$j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnl0/d$j;->b()Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lfl0/a$h;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    return-object v0

    :cond_c
    const/4 p1, 0x0

    return-object p1
.end method
