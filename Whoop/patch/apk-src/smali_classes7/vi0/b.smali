.class public abstract Lvi0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lri0/b;",
        "La81/t;",
        "a",
        "(Lri0/b;)La81/t;",
        "arch-v2_release"
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
.method public static final a(Lri0/b;)La81/t;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lri0/b$j;

    if-eqz v0, :cond_0

    new-instance v0, La81/t$b;

    check-cast p0, Lri0/b$j;

    invoke-virtual {p0}, Lri0/b$j;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lri0/b$j;->a()Lm91/u;

    move-result-object p0

    invoke-direct {v0, v1, p0}, La81/t$b;-><init>(Ljava/lang/Object;Lm91/u;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Lri0/b$p;

    if-eqz v0, :cond_1

    new-instance v0, La81/t$d;

    check-cast p0, Lri0/b$p;

    invoke-virtual {p0}, Lri0/b$p;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    invoke-direct {v0, p0}, La81/t$d;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_1
    instance-of v0, p0, Lri0/b$q;

    if-eqz v0, :cond_2

    new-instance v0, La81/t$e;

    check-cast p0, Lri0/b$q;

    invoke-virtual {p0}, Lri0/b$q;->a()Lj02/s;

    move-result-object p0

    invoke-direct {v0, p0}, La81/t$e;-><init>(Lj02/s;)V

    return-object v0

    :cond_2
    instance-of v0, p0, Lri0/b$s;

    if-eqz v0, :cond_3

    new-instance v0, La81/t$f;

    check-cast p0, Lri0/b$s;

    invoke-virtual {p0}, Lri0/b$s;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p0

    invoke-direct {v0, p0}, La81/t$f;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0

    :cond_3
    instance-of v0, p0, Lri0/b$f;

    if-eqz v0, :cond_4

    sget-object p0, La81/t$a;->a:La81/t$a;

    return-object p0

    :cond_4
    instance-of v0, p0, Lri0/b$c;

    if-eqz v0, :cond_5

    new-instance v0, La81/t$c;

    check-cast p0, Lri0/b$c;

    invoke-virtual {p0}, Lri0/b$c;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-direct {v0, p0}, La81/t$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_5
    instance-of p0, p0, Lri0/b$h;

    if-eqz p0, :cond_6

    sget-object p0, La81/t$a;->a:La81/t$a;

    return-object p0

    :cond_6
    const/4 p0, 0x0

    return-object p0
.end method
