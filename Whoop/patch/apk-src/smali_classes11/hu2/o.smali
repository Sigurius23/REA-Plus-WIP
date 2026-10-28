.class public abstract Lhu2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lhu2/m;",
        "Lfu2/b$n;",
        "a",
        "(Lhu2/m;)Lfu2/b$n;",
        "weightlifting_release"
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
.method public static final a(Lhu2/m;)Lfu2/b$n;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lhu2/g;

    if-eqz v0, :cond_0

    new-instance v0, Lfu2/b$o;

    check-cast p0, Lhu2/g;

    invoke-virtual {p0}, Lhu2/g;->b()Ljava/util/UUID;

    move-result-object p0

    invoke-direct {v0, p0}, Lfu2/b$o;-><init>(Ljava/util/UUID;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Lhu2/f;

    if-eqz v0, :cond_1

    new-instance v0, Lfu2/b$d;

    check-cast p0, Lhu2/f;

    invoke-virtual {p0}, Lhu2/f;->f()I

    move-result v1

    invoke-virtual {p0}, Lhu2/f;->b()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lfu2/b$d;-><init>(II)V

    return-object v0

    :cond_1
    instance-of v0, p0, Lhu2/d;

    if-eqz v0, :cond_2

    new-instance v0, Lfu2/b$a;

    check-cast p0, Lhu2/d;

    invoke-virtual {p0}, Lhu2/d;->b()I

    move-result p0

    invoke-direct {v0, p0}, Lfu2/b$a;-><init>(I)V

    return-object v0

    :cond_2
    instance-of v0, p0, Lhu2/i;

    if-eqz v0, :cond_3

    new-instance v0, Lfu2/b$j;

    check-cast p0, Lhu2/i;

    invoke-virtual {p0}, Lhu2/i;->b()I

    move-result v1

    invoke-virtual {p0}, Lhu2/i;->f()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lfu2/b$j;-><init>(II)V

    return-object v0

    :cond_3
    instance-of v0, p0, Lhu2/k;

    if-eqz v0, :cond_4

    new-instance v0, Lfu2/b$p;

    check-cast p0, Lhu2/k;

    invoke-virtual {p0}, Lhu2/k;->f()I

    move-result v1

    invoke-virtual {p0}, Lhu2/k;->b()I

    move-result v2

    invoke-virtual {p0}, Lhu2/k;->i()I

    move-result v3

    invoke-virtual {p0}, Lhu2/k;->h()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lfu2/b$p;-><init>(IIILjava/lang/String;)V

    return-object v0

    :cond_4
    instance-of v0, p0, Lhu2/l;

    if-eqz v0, :cond_5

    new-instance v1, Lfu2/b$q;

    check-cast p0, Lhu2/l;

    invoke-virtual {p0}, Lhu2/l;->f()I

    move-result v2

    invoke-virtual {p0}, Lhu2/l;->b()I

    move-result v3

    invoke-virtual {p0}, Lhu2/l;->i()I

    move-result v4

    invoke-virtual {p0}, Lhu2/l;->h()Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lfu2/b$q;-><init>(IIILjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_5
    instance-of v0, p0, Lhu2/n;

    if-eqz v0, :cond_6

    new-instance v0, Lfu2/b$r;

    check-cast p0, Lhu2/n;

    invoke-virtual {p0}, Lhu2/n;->f()I

    move-result v1

    invoke-virtual {p0}, Lhu2/n;->b()I

    move-result v2

    invoke-virtual {p0}, Lhu2/n;->i()I

    move-result v3

    invoke-virtual {p0}, Lhu2/n;->h()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lfu2/b$r;-><init>(IIILjava/lang/String;)V

    return-object v0

    :cond_6
    instance-of v0, p0, Lhu2/j;

    if-eqz v0, :cond_7

    new-instance v0, Lfu2/b$k;

    check-cast p0, Lhu2/j;

    invoke-virtual {p0}, Lhu2/j;->b()I

    move-result v1

    invoke-virtual {p0}, Lhu2/j;->f()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lfu2/b$k;-><init>(II)V

    return-object v0

    :cond_7
    instance-of p0, p0, Lhu2/e;

    if-eqz p0, :cond_8

    sget-object p0, Lfu2/b$c;->a:Lfu2/b$c;

    return-object p0

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
