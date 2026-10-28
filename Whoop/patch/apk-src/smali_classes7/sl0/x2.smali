.class public final Lsl0/x2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lsl0/x2;",
        "",
        "<init>",
        "()V",
        "Lfl0/k;",
        "retryAction",
        "Lnl0/d;",
        "a",
        "(Lfl0/k;)Lnl0/d;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lfl0/k;)Lnl0/d;
    .locals 12

    const-string v0, "retryAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lfl0/k$b;

    if-eqz v0, :cond_0

    new-instance v1, Lnl0/d$h;

    check-cast p1, Lfl0/k$b;

    invoke-virtual {p1}, Lfl0/k$b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lfl0/k$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lfl0/k$b;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lfl0/k$b;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lfl0/k$b;->c()Z

    move-result v6

    invoke-virtual {p1}, Lfl0/k$b;->b()Z

    move-result v7

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lnl0/d$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lfl0/k$e;

    if-eqz v0, :cond_2

    check-cast p1, Lfl0/k$e;

    invoke-virtual {p1}, Lfl0/k$e;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lfl0/k$e;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lfl0/k$e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lfl0/k$e;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lfl0/k$e;->a()Lfl0/l;

    move-result-object v7

    new-instance v1, Lnl0/d$m;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v9}, Lnl0/d$m;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lfl0/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    new-instance v2, Lnl0/d$l;

    invoke-virtual {p1}, Lfl0/k$e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lfl0/k$e;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lfl0/k$e;->a()Lfl0/l;

    move-result-object v9

    const/16 v10, 0x3a

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v11}, Lnl0/d$l;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZLfl0/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
