.class public abstract Lui0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La81/t;",
        "Lri0/b;",
        "a",
        "(La81/t;)Lri0/b;",
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
.method public static final a(La81/t;)Lri0/b;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, La81/t$a;

    if-eqz v0, :cond_0

    sget-object p0, Lri0/b$f;->a:Lri0/b$f;

    return-object p0

    :cond_0
    instance-of v0, p0, La81/t$f;

    if-eqz v0, :cond_1

    new-instance v0, Lri0/b$s;

    check-cast p0, La81/t$f;

    invoke-virtual {p0}, La81/t$f;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p0

    invoke-direct {v0, p0}, Lri0/b$s;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0

    :cond_1
    instance-of v0, p0, La81/t$d;

    if-eqz v0, :cond_2

    new-instance v0, Lri0/b$p;

    check-cast p0, La81/t$d;

    invoke-virtual {p0}, La81/t$d;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    invoke-direct {v0, p0}, Lri0/b$p;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_2
    instance-of v0, p0, La81/t$c;

    if-eqz v0, :cond_3

    new-instance v0, Lri0/b$c;

    check-cast p0, La81/t$c;

    invoke-virtual {p0}, La81/t$c;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lri0/b$c;-><init>(Lcom/whoop/navigation/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    instance-of v0, p0, La81/t$b;

    if-eqz v0, :cond_4

    new-instance v0, Lri0/b$j;

    check-cast p0, La81/t$b;

    invoke-virtual {p0}, La81/t$b;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, La81/t$b;->a()Lm91/u;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lri0/b$j;-><init>(Ljava/lang/Object;Lm91/u;)V

    return-object v0

    :cond_4
    instance-of v0, p0, La81/t$e;

    if-eqz v0, :cond_5

    new-instance v0, Lri0/b$q;

    check-cast p0, La81/t$e;

    invoke-virtual {p0}, La81/t$e;->a()Lj02/s;

    move-result-object p0

    invoke-direct {v0, p0}, Lri0/b$q;-><init>(Lj02/s;)V

    return-object v0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
