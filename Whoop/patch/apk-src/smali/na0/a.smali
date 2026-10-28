.class public final Lna0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lna0/a;",
        "",
        "<init>",
        "()V",
        "Lqa0/a$g;",
        "viewEvent",
        "Lna0/b;",
        "b",
        "(Lqa0/a$g;)Lna0/b;",
        "Lqw2/b;",
        "domainState",
        "a",
        "(Lqw2/b;)Lna0/b;",
        "advanced-labs_release"
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
.method public final a(Lqw2/b;)Lna0/b;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqw2/b$f;

    if-eqz v0, :cond_0

    sget-object p1, Lna0/b$d;->a:Lna0/b$d;

    return-object p1

    :cond_0
    instance-of v0, p1, Lqw2/b$i;

    if-eqz v0, :cond_1

    sget-object p1, Lna0/b$c;->a:Lna0/b$c;

    return-object p1

    :cond_1
    instance-of v0, p1, Lqw2/b$a;

    if-eqz v0, :cond_2

    new-instance v0, Lna0/b$a;

    check-cast p1, Lqw2/b$a;

    invoke-virtual {p1}, Lqw2/b$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lna0/b$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Lqa0/a$g;)Lna0/b;
    .locals 1

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqa0/a$d;

    if-eqz v0, :cond_0

    new-instance v0, Lna0/b$b;

    check-cast p1, Lqa0/a$d;

    invoke-virtual {p1}, Lqa0/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lna0/b$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of p1, p1, Lqa0/a$f;

    if-eqz p1, :cond_1

    sget-object p1, Lna0/b$d;->a:Lna0/b$d;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
