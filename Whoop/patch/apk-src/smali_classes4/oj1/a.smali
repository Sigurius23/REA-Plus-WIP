.class public final Loj1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Loj1/a;",
        "",
        "<init>",
        "()V",
        "Lkj1/b;",
        "domainState",
        "Lnj1/c;",
        "a",
        "(Lkj1/b;)Lnj1/c;",
        "health-connect_release"
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
.method public final a(Lkj1/b;)Lnj1/c;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkj1/b$a;

    if-eqz v0, :cond_0

    sget-object p1, Lnj1/c$a;->a:Lnj1/c$a;

    return-object p1

    :cond_0
    instance-of v0, p1, Lkj1/b$d;

    if-eqz v0, :cond_1

    sget-object p1, Lnj1/c$b;->a:Lnj1/c$b;

    return-object p1

    :cond_1
    instance-of p1, p1, Lkj1/b$b;

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
