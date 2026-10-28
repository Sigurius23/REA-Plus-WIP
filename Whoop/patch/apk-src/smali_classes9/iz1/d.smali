.class interface abstract Liz1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liz1/d$a;,
        Liz1/d$b;,
        Liz1/d$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008r\u0018\u00002\u00020\u0001:\u0003\u0006\u0004\u0007J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Liz1/d;",
        "",
        "Liz1/b;",
        "state",
        "a",
        "(Liz1/b;)Liz1/b;",
        "b",
        "c",
        "Liz1/d$a;",
        "Liz1/d$b;",
        "Liz1/d$c;",
        "motion-tracking-sandbox_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public a(Liz1/b;)Liz1/b;
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Liz1/d$b;->a:Liz1/d$b;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Liz1/e;->RUNNING:Liz1/e;

    sget-object v1, Lgz1/b$b;->a:Lgz1/b$b;

    invoke-virtual {p1, v0, v1}, Liz1/b;->a(Liz1/e;Lgz1/b;)Liz1/b;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p0, Liz1/d$a;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Liz1/d$a;

    invoke-virtual {v0}, Liz1/d$a;->b()Lgz1/b;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Liz1/b;->b(Liz1/b;Liz1/e;Lgz1/b;ILjava/lang/Object;)Liz1/b;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, Liz1/d$c;->a:Liz1/d$c;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Liz1/e;->IDLE:Liz1/e;

    sget-object v1, Lgz1/b$a;->a:Lgz1/b$a;

    invoke-virtual {p1, v0, v1}, Liz1/b;->a(Liz1/e;Lgz1/b;)Liz1/b;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
