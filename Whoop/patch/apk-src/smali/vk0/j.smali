.class public interface abstract Lvk0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvk0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0008\u0010\u0006R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000cR\u0014\u0010\u0013\u001a\u00020\u00108&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018\u00c0\u0006\u0003"
    }
    d2 = {
        "Lvk0/j;",
        "Lvk0/a;",
        "Lvk0/i;",
        "gattService",
        "Lvk0/e;",
        "x",
        "(Lvk0/i;Lq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "H",
        "Lec3/p1;",
        "Lvk0/k;",
        "o",
        "()Lec3/p1;",
        "serviceFlow",
        "l",
        "iGattService",
        "",
        "F",
        "()Ljava/lang/String;",
        "taskName",
        "Ltr2/n;",
        "h",
        "()Ltr2/n;",
        "logger",
        "connectivity-core_release"
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
.method public static E(Lvk0/j;Lvk0/i;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/j;",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Lvk0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lvk0/j$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvk0/j$a;

    iget v1, v0, Lvk0/j$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvk0/j$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvk0/j$a;

    invoke-direct {v0, p0, p2}, Lvk0/j$a;-><init>(Lvk0/j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lvk0/j$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvk0/j$a;->F:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p0, v0, Lvk0/j$a;->y:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Exception;

    iget-object p1, v0, Lvk0/j$a;->x:Ljava/lang/Object;

    check-cast p1, Lvk0/i;

    iget-object p1, v0, Lvk0/j$a;->w:Ljava/lang/Object;

    check-cast p1, Lvk0/j;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lvk0/j$a;->x:Ljava/lang/Object;

    check-cast p0, Lvk0/i;

    iget-object p0, v0, Lvk0/j$a;->w:Ljava/lang/Object;

    check-cast p0, Lvk0/j;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v11, p1

    move-object p1, p0

    move-object p0, v11

    goto :goto_3

    :cond_3
    iget-object p0, v0, Lvk0/j$a;->x:Ljava/lang/Object;

    check-cast p0, Lvk0/i;

    iget-object p0, v0, Lvk0/j$a;->w:Ljava/lang/Object;

    check-cast p0, Lvk0/j;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p0}, Lvk0/j;->h()Ltr2/n;

    move-result-object p2

    const-string v2, "Received gattService"

    new-array v9, v4, [Lqr2/a$a;

    invoke-interface {p2, v2, v9}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-interface {p0}, Lvk0/j;->l()Lec3/p1;

    move-result-object p2

    :cond_5
    move-object v2, p2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lvk0/i;

    invoke-virtual {v2, v9, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Lvk0/j;->o()Lec3/p1;

    move-result-object p1

    sget-object p2, Lvk0/k$d;->a:Lvk0/k$d;

    iput-object p0, v0, Lvk0/j$a;->w:Ljava/lang/Object;

    iput-object v8, v0, Lvk0/j$a;->x:Ljava/lang/Object;

    iput v7, v0, Lvk0/j$a;->F:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, p2, v0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v3, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    invoke-interface {p0}, Lvk0/j;->o()Lec3/p1;

    move-result-object p1

    invoke-static {p1}, Lvk0/d;->a(Lec3/l;)Lec3/l;

    move-result-object p1

    iput-object p0, v0, Lvk0/j$a;->w:Ljava/lang/Object;

    iput-object v8, v0, Lvk0/j$a;->x:Ljava/lang/Object;

    iput v6, v0, Lvk0/j$a;->F:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast p2, Lvk0/e;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p2

    :goto_3
    invoke-interface {p1}, Lvk0/j;->o()Lec3/p1;

    move-result-object p2

    sget-object v2, Lvk0/k$c;->a:Lvk0/k$c;

    iput-object p1, v0, Lvk0/j$a;->w:Ljava/lang/Object;

    iput-object v8, v0, Lvk0/j$a;->x:Ljava/lang/Object;

    iput-object p0, v0, Lvk0/j$a;->y:Ljava/lang/Object;

    iput v5, v0, Lvk0/j$a;->F:I

    check-cast p2, Lec3/h2;

    invoke-virtual {p2, v2, v0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v3, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    :goto_5
    instance-of p2, p0, Lcom/whoop/taskexecutor/TaskInterruptedException;

    if-nez p2, :cond_a

    instance-of p2, p0, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz p2, :cond_9

    goto :goto_6

    :cond_9
    throw p0

    :cond_a
    :goto_6
    invoke-interface {p1}, Lvk0/j;->h()Ltr2/n;

    move-result-object p1

    const-string p2, "Caught exception "

    invoke-static {p0, p2}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v4, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lvk0/e$a;

    invoke-direct {p1, p0}, Lvk0/e$a;-><init>(Ljava/lang/Exception;)V

    return-object p1
.end method

.method public static synthetic u(Lvk0/j;Lvk0/i;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/j;",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public abstract F()Ljava/lang/String;
.end method

.method public H(Lvk0/i;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lvk0/j;->u(Lvk0/j;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract h()Ltr2/n;
.end method

.method public abstract l()Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/p1;"
        }
    .end annotation
.end method

.method public abstract o()Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/p1;"
        }
    .end annotation
.end method

.method public x(Lvk0/i;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Lvk0/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lvk0/j;->E(Lvk0/j;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
