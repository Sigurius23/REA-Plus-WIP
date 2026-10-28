.class public abstract Lkf0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La81/t;",
        "Lkd0/a;",
        "a",
        "(La81/t;)Lkd0/a;",
        "advanced-labs_release"
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
.method public static final a(La81/t;)Lkd0/a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, La81/t$a;

    if-eqz v0, :cond_0

    sget-object p0, Lkd0/a$r;->a:Lkd0/a$r;

    return-object p0

    :cond_0
    instance-of v0, p0, La81/t$f;

    if-eqz v0, :cond_1

    new-instance v0, Lkd0/a$j0;

    check-cast p0, La81/t$f;

    invoke-virtual {p0}, La81/t$f;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p0

    invoke-direct {v0, p0}, Lkd0/a$j0;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0

    :cond_1
    instance-of v0, p0, La81/t$e;

    if-eqz v0, :cond_2

    new-instance v0, Lkd0/a$i0;

    check-cast p0, La81/t$e;

    invoke-virtual {p0}, La81/t$e;->a()Lj02/s;

    move-result-object p0

    invoke-direct {v0, p0}, Lkd0/a$i0;-><init>(Lj02/s;)V

    return-object v0

    :cond_2
    instance-of v0, p0, La81/t$d;

    if-eqz v0, :cond_3

    new-instance v0, Lkd0/a$i;

    new-instance v1, Lvw2/c;

    check-cast p0, La81/t$d;

    invoke-virtual {p0}, La81/t$d;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    invoke-direct {v1, p0}, Lvw2/c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-direct {v0, v1}, Lkd0/a$i;-><init>(Lvw2/a;)V

    return-object v0

    :cond_3
    instance-of v0, p0, La81/t$c;

    if-eqz v0, :cond_4

    new-instance v0, Lkd0/a$j;

    check-cast p0, La81/t$c;

    invoke-virtual {p0}, La81/t$c;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-direct {v0, p0}, Lkd0/a$j;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_4
    instance-of v0, p0, La81/t$b;

    if-eqz v0, :cond_5

    new-instance v0, Lkd0/a$x;

    check-cast p0, La81/t$b;

    invoke-virtual {p0}, La81/t$b;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, La81/t$b;->a()Lm91/u;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lkd0/a$x;-><init>(Ljava/lang/Object;Lm91/u;)V

    return-object v0

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
