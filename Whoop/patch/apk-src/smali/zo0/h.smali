.class public final Lzo0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lzo0/h;",
        "",
        "<init>",
        "()V",
        "Lro0/b;",
        "domainResult",
        "Lep0/e;",
        "a",
        "(Lro0/b;)Lep0/e;",
        "coach-everywhere_release"
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
.method public final a(Lro0/b;)Lep0/e;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lro0/b$c;

    if-eqz v0, :cond_0

    sget-object p1, Lep0/e$c;->a:Lep0/e$c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lro0/b$f;

    if-eqz v0, :cond_1

    new-instance v0, Lep0/e$e;

    check-cast p1, Lro0/b$f;

    invoke-virtual {p1}, Lro0/b$f;->b()Lep0/f;

    move-result-object v1

    invoke-virtual {p1}, Lro0/b$f;->a()Lep0/g;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lep0/e$e;-><init>(Lep0/f;Lep0/g;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lro0/b$a;

    if-eqz v0, :cond_2

    sget-object p1, Lep0/e$d;->a:Lep0/e$d;

    return-object p1

    :cond_2
    instance-of v0, p1, Lro0/b$b;

    if-eqz v0, :cond_3

    sget-object p1, Lep0/e$b;->a:Lep0/e$b;

    return-object p1

    :cond_3
    instance-of v0, p1, Lro0/b$d;

    if-eqz v0, :cond_4

    sget-object p1, Lep0/e$d;->a:Lep0/e$d;

    return-object p1

    :cond_4
    instance-of p1, p1, Lro0/b$e;

    if-eqz p1, :cond_5

    sget-object p1, Lep0/e$d;->a:Lep0/e$d;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
