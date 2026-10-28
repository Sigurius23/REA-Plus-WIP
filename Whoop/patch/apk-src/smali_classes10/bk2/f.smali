.class public abstract Lbk2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lbk2/d;",
        "Lwj2/a$a;",
        "d",
        "(Lbk2/d;)Lwj2/a$a;",
        "Lbk2/a;",
        "Lxj2/d;",
        "c",
        "(Lbk2/a;)Lxj2/d;",
        "tilt-graph_release"
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
.method public static final synthetic a(Lbk2/a;)Lxj2/d;
    .locals 0

    invoke-static {p0}, Lbk2/f;->c(Lbk2/a;)Lxj2/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lbk2/d;)Lwj2/a$a;
    .locals 0

    invoke-static {p0}, Lbk2/f;->d(Lbk2/d;)Lwj2/a$a;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lbk2/a;)Lxj2/d;
    .locals 1

    instance-of v0, p0, Lbk2/a$a;

    if-eqz v0, :cond_0

    new-instance v0, Lxj2/d$a;

    check-cast p0, Lbk2/a$a;

    invoke-virtual {p0}, Lbk2/a$a;->a()I

    move-result p0

    invoke-direct {v0, p0}, Lxj2/d$a;-><init>(I)V

    return-object v0

    :cond_0
    instance-of v0, p0, Lbk2/a$b;

    if-eqz v0, :cond_1

    new-instance v0, Lxj2/d$c;

    check-cast p0, Lbk2/a$b;

    invoke-virtual {p0}, Lbk2/a$b;->a()Ljava/time/LocalDate;

    move-result-object p0

    invoke-direct {v0, p0}, Lxj2/d$c;-><init>(Ljava/time/LocalDate;)V

    return-object v0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final d(Lbk2/d;)Lwj2/a$a;
    .locals 3

    instance-of v0, p0, Lbk2/d$a;

    if-eqz v0, :cond_0

    new-instance v0, Lwj2/a$a;

    check-cast p0, Lbk2/d$a;

    invoke-virtual {p0}, Lbk2/d$a;->a()Ljava/time/LocalDate;

    move-result-object v1

    invoke-virtual {p0}, Lbk2/d$a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lbk2/d$a;->b()Z

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lwj2/a$a;-><init>(Ljava/time/LocalDate;Ljava/lang/String;Z)V

    return-object v0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
