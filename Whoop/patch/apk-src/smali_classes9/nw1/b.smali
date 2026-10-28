.class public abstract Lnw1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Luw1/c$c;",
        "",
        "c",
        "(Luw1/c$c;)Ljava/lang/Integer;",
        "membership_release"
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
.method public static synthetic a(Ljx1/f0;)Lxb3/i;
    .locals 0

    invoke-static {p0}, Lnw1/b;->d(Ljx1/f0;)Lxb3/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Luw1/c$c;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lnw1/b;->c(Luw1/c$c;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Luw1/c$c;)Ljava/lang/Integer;
    .locals 2

    invoke-virtual {p0}, Luw1/c$c;->b()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p0

    new-instance v0, Lno1/g;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lno1/g;-><init>(I)V

    invoke-static {p0, v0}, Lxb3/k;->t(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object p0

    sget-object v0, Lnw1/b$a;->w:Lnw1/b$a;

    invoke-static {p0, v0}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p0

    invoke-static {p0}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc41/p4;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lc41/p4;->a()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final d(Ljx1/f0;)Lxb3/i;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljx1/f0;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p0

    return-object p0
.end method
