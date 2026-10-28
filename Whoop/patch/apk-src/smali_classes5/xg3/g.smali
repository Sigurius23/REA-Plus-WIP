.class public Lxg3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final w:Lxg3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxg3/e;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxg3/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxg3/g;->w:Lxg3/e;

    return-void
.end method

.method public static A([Lxg3/g;)Lxg3/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Lxg3/g<",
            "+TT;>;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, Lxg3/g;->r([Ljava/lang/Object;)Lxg3/g;

    move-result-object p0

    invoke-static {p0}, Lxg3/g;->y(Lxg3/g;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static O(Lxg3/s;Lxg3/g;)Lxg3/t;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/s;",
            "Lxg3/g<",
            "TT;>;)",
            "Lxg3/t;"
        }
    .end annotation

    if-eqz p0, :cond_3

    iget-object v0, p1, Lxg3/g;->w:Lxg3/e;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lxg3/s;->d()V

    instance-of v0, p0, Lih3/a;

    if-nez v0, :cond_0

    new-instance v0, Lih3/a;

    invoke-direct {v0, p0}, Lih3/a;-><init>(Lxg3/s;)V

    move-object p0, v0

    :cond_0
    :try_start_0
    iget-object p1, p1, Lxg3/g;->w:Lxg3/e;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->c()Ljh3/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lbh3/b;->b(Ljava/lang/Object;)V

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->c()Ljh3/b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxg3/s;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljh3/a;->b(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-static {p1}, Ljh3/a;->b(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {p0, v0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    sget-object p0, Lmh3/e;->a:Lmh3/d;

    return-object p0

    :catchall_1
    move-exception p0

    invoke-static {p0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    new-instance v0, Lrx/exceptions/OnErrorFailedException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error occurred attempting to subscribe ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] and then again while trying to pass to onError."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lrx/exceptions/OnErrorFailedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, Ljh3/a;->b(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "onSubscribe function can not be null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "subscriber can not be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static V(Lxg3/e;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/e;",
            ")",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lxg3/g;

    sget-object v1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v1}, Ljh3/f;->c()Ljh3/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p0}, Lxg3/g;-><init>(Lxg3/e;)V

    return-object v0
.end method

.method public static e(Ljava/util/List;Lbh3/i;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+",
            "Lxg3/g<",
            "+TT;>;>;",
            "Lbh3/i;",
            ")",
            "Lxg3/g<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lch3/g;

    check-cast p0, Ljava/util/List;

    invoke-direct {v0, p0, p1}, Lch3/g;-><init>(Ljava/util/List;Lbh3/i;)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lxg3/g;Lxg3/g;Lbh3/h;)Lxg3/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "+TT1;>;",
            "Lxg3/g<",
            "+TT2;>;",
            "Lbh3/h;",
            ")",
            "Lxg3/g<",
            "TR;>;"
        }
    .end annotation

    filled-new-array {p0, p1}, [Lxg3/g;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p2}, Ls2/e;->u(Lbh3/h;)Lro/i;

    move-result-object p1

    invoke-static {p0, p1}, Lxg3/g;->e(Ljava/util/List;Lbh3/i;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lxg3/g;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "+",
            "Lxg3/g<",
            "+TT;>;>;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lgh3/n;->w:Lgh3/n;

    invoke-virtual {p0, v0}, Lxg3/g;->i(Lbh3/g;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lxg3/g;Lxg3/g;)Lxg3/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "+TT;>;",
            "Lxg3/g<",
            "+TT;>;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lxg3/g;->v(Ljava/lang/Object;Ljava/lang/Object;)Lxg3/g;

    move-result-object p0

    invoke-static {p0}, Lxg3/g;->g(Lxg3/g;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lxg3/e;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/e;",
            ")",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lxg3/g;

    sget-object v1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v1}, Ljh3/f;->c()Ljh3/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p0}, Lxg3/g;-><init>(Lxg3/e;)V

    return-object v0
.end method

.method public static l()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lch3/a;->w:Lxg3/g;

    return-object v0
.end method

.method public static m(Ljava/lang/Throwable;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lch3/p;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lch3/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/lang/Iterable;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TT;>;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lch3/p;

    invoke-direct {v0, p0}, Lch3/p;-><init>(Ljava/lang/Iterable;)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static r([Ljava/lang/Object;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lxg3/g;->l()Lxg3/g;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Lxg3/g;->u(Ljava/lang/Object;)Lxg3/g;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lch3/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lch3/n;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static s(JJLjava/util/concurrent/TimeUnit;Lxg3/k;)Lxg3/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lxg3/k;",
            ")",
            "Lxg3/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Lch3/u;

    move-wide v1, p0

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lch3/u;-><init>(JJLjava/util/concurrent/TimeUnit;Lxg3/k;)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static t(JLjava/util/concurrent/TimeUnit;)Lxg3/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lxg3/g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkh3/a;->a()Lkh3/a;

    move-result-object v0

    iget-object v6, v0, Lkh3/a;->a:Leh3/i;

    move-wide v3, p0

    move-wide v1, p0

    move-object v5, p2

    invoke-static/range {v1 .. v6}, Lxg3/g;->s(JJLjava/util/concurrent/TimeUnit;Lxg3/k;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static u(Ljava/lang/Object;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lgh3/l;

    invoke-direct {v0, p0}, Lgh3/l;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static v(Ljava/lang/Object;Ljava/lang/Object;)Lxg3/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lxg3/g;->r([Ljava/lang/Object;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static y(Lxg3/g;)Lxg3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "+",
            "Lxg3/g<",
            "+TT;>;>;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lgh3/l;

    if-ne v0, v1, :cond_0

    check-cast p0, Lgh3/l;

    new-instance v0, Lgh3/j;

    const/4 v1, 0x0

    sget-object v2, Lgh3/n;->w:Lgh3/n;

    invoke-direct {v0, p0, v2, v1}, Lgh3/j;-><init>(Ljava/lang/Object;Lbh3/g;I)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lch3/c0;->b:Lch3/h0;

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method

.method public static z(Lxg3/g;Lxg3/g;Lxg3/g;)Lxg3/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "+TT;>;",
            "Lxg3/g<",
            "+TT;>;",
            "Lxg3/g<",
            "+TT;>;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    filled-new-array {p0, p1, p2}, [Lxg3/g;

    move-result-object p0

    invoke-static {p0}, Lxg3/g;->A([Lxg3/g;)Lxg3/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B(Lxg3/k;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxg3/k;",
            ")",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    sget v0, Lgh3/g;->x:I

    invoke-virtual {p0, p1, v0}, Lxg3/g;->C(Lxg3/k;I)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final C(Lxg3/k;I)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxg3/k;",
            "I)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lxg3/g;->D(Lxg3/k;ZI)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lxg3/k;ZI)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxg3/k;",
            "ZI)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lgh3/l;

    if-eqz v0, :cond_0

    move-object p2, p0

    check-cast p2, Lgh3/l;

    invoke-virtual {p2, p1}, Lgh3/l;->X(Lxg3/k;)Lxg3/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lch3/j0;

    invoke-direct {v0, p1, p2, p3}, Lch3/j0;-><init>(Lxg3/k;ZI)V

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final E()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lch3/l0;->a:Lch3/m0;

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public final F(JLbh3/a;Lxg3/b;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lbh3/a;",
            "Lxg3/b;",
            ")",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lch3/m0;

    invoke-direct {v0, p1, p2, p3, p4}, Lch3/m0;-><init>(JLbh3/a;Lxg3/b;)V

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final G()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lch3/d;->d:Lch3/v;

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public final H(Lbh3/g;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/g;",
            ")",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lch3/b0;

    new-instance v1, Lbu/c;

    invoke-direct {v1, p1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x1

    invoke-direct {v0, v1, p1}, Lch3/b0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final I(Ljava/lang/Object;)Lxg3/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lxg3/g;->u(Ljava/lang/Object;)Lxg3/g;

    move-result-object p1

    invoke-static {p1, p0}, Lxg3/g;->h(Lxg3/g;Lxg3/g;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final J()Lxg3/t;
    .locals 3

    new-instance v0, Lgh3/a;

    sget-object v1, Lbh3/e;->a:Lbh3/d;

    sget-object v2, Lgh3/e;->w:Lgh3/d;

    invoke-direct {v0, v1, v2}, Lgh3/a;-><init>(Lbh3/b;Lbh3/b;)V

    invoke-virtual {p0, v0}, Lxg3/g;->N(Lxg3/s;)Lxg3/t;

    move-result-object v0

    return-object v0
.end method

.method public final K(Lbh3/b;)Lxg3/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/b;",
            ")",
            "Lxg3/t;"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Lgh3/a;

    sget-object v1, Lgh3/e;->w:Lgh3/d;

    invoke-direct {v0, p1, v1}, Lgh3/a;-><init>(Lbh3/b;Lbh3/b;)V

    invoke-virtual {p0, v0}, Lxg3/g;->N(Lxg3/s;)Lxg3/t;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "onNext can not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final L(Lbh3/b;Lbh3/b;)Lxg3/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/b;",
            "Lbh3/b;",
            ")",
            "Lxg3/t;"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    new-instance v0, Lgh3/a;

    invoke-direct {v0, p1, p2}, Lgh3/a;-><init>(Lbh3/b;Lbh3/b;)V

    invoke-virtual {p0, v0}, Lxg3/g;->N(Lxg3/s;)Lxg3/t;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "onError can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "onNext can not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final M(Lxg3/h;)Lxg3/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxg3/h;",
            ")",
            "Lxg3/t;"
        }
    .end annotation

    instance-of v0, p1, Lxg3/s;

    if-eqz v0, :cond_0

    check-cast p1, Lxg3/s;

    invoke-virtual {p0, p1}, Lxg3/g;->N(Lxg3/s;)Lxg3/t;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    new-instance v0, Lch3/o0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lch3/o0;-><init>(Lxg3/h;I)V

    invoke-virtual {p0, v0}, Lxg3/g;->N(Lxg3/s;)Lxg3/t;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "observer is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final N(Lxg3/s;)Lxg3/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxg3/s;",
            ")",
            "Lxg3/t;"
        }
    .end annotation

    invoke-static {p1, p0}, Lxg3/g;->O(Lxg3/s;Lxg3/g;)Lxg3/t;

    move-result-object p1

    return-object p1
.end method

.method public final P(Lxg3/k;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxg3/k;",
            ")",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lxg3/g;->Q(Lxg3/k;Z)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final Q(Lxg3/k;Z)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxg3/k;",
            "Z)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lgh3/l;

    if-eqz v0, :cond_0

    move-object p2, p0

    check-cast p2, Lgh3/l;

    invoke-virtual {p2, p1}, Lgh3/l;->X(Lxg3/k;)Lxg3/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lch3/t0;

    invoke-direct {v0, p0, p1, p2}, Lch3/t0;-><init>(Lxg3/g;Lxg3/k;Z)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final R(I)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lch3/v0;

    invoke-direct {v0, p1}, Lch3/v0;-><init>(I)V

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final S(Lxg3/g;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/g<",
            "+TE;>;)",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lch3/d0;

    invoke-direct {v0, p1}, Lch3/d0;-><init>(Lxg3/g;)V

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public T()Lxg3/d;
    .locals 3

    :try_start_0
    new-instance v0, Lxg3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v1}, Ljh3/f;->a()Ljh3/e;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Actually not, but can\'t pass out an exception otherwise..."

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v1

    :catch_0
    move-exception v0

    throw v0
.end method

.method public U()Lxg3/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/p;"
        }
    .end annotation

    new-instance v0, Lxg3/p;

    invoke-static {p0}, Lch3/s;->a(Lxg3/g;)Lch3/s;

    move-result-object v1

    invoke-direct {v0, v1}, Lxg3/p;-><init>(Lxg3/o;)V

    return-object v0
.end method

.method public final W(Lxg3/s;)Lxg3/t;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxg3/s;",
            ")",
            "Lxg3/t;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lxg3/s;->d()V

    iget-object v0, p0, Lxg3/g;->w:Lxg3/e;

    sget-object v1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v1}, Ljh3/f;->c()Ljh3/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p1}, Lbh3/b;->b(Ljava/lang/Object;)V

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->c()Ljh3/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ldt/b;->V(Ljava/lang/Throwable;)V

    :try_start_1
    invoke-static {v0}, Ljh3/a;->b(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {p1, v1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    sget-object p1, Lmh3/e;->a:Lmh3/d;

    return-object p1

    :catchall_1
    move-exception p1

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    new-instance v1, Lrx/exceptions/OnErrorFailedException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error occurred attempting to subscribe ["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] and then again while trying to pass to onError."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lrx/exceptions/OnErrorFailedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1}, Ljh3/a;->b(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v1
.end method

.method public final a()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lch3/d;->c:Lch3/v;

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public final b(JJLjava/util/concurrent/TimeUnit;Lxg3/k;)Lxg3/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/concurrent/TimeUnit;",
            "Lxg3/k;",
            ")",
            "Lxg3/g<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Lch3/a0;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lch3/a0;-><init>(JJLjava/util/concurrent/TimeUnit;Lxg3/k;)V

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final c(JLjava/util/concurrent/TimeUnit;Lxg3/k;)Lxg3/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            "Lxg3/k;",
            ")",
            "Lxg3/g<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    move-wide v3, p1

    move-object v0, p0

    move-wide v1, p1

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Lxg3/g;->b(JJLjava/util/concurrent/TimeUnit;Lxg3/k;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Class;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TR;>;)",
            "Lxg3/g<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lch3/b0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lch3/b0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lbh3/g;)Lxg3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lbh3/g;",
            ")",
            "Lxg3/g<",
            "TR;>;"
        }
    .end annotation

    instance-of v0, p0, Lgh3/l;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lgh3/l;

    new-instance v1, Lgh3/j;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lgh3/j;-><init>(Ljava/lang/Object;Lbh3/g;I)V

    invoke-static {v1}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lch3/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lch3/k;-><init>(Lxg3/g;Lbh3/g;I)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final k()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lch3/c0;->a:Lch3/d0;

    invoke-virtual {p0, v0}, Lxg3/g;->w(Lxg3/f;)Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method public final n(Lbh3/g;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/g;",
            ")",
            "Lxg3/g<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lch3/k;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lch3/k;-><init>(Lxg3/g;Lbh3/g;I)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final o(Lbh3/g;)Lxg3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lbh3/g;",
            ")",
            "Lxg3/g<",
            "TR;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lgh3/l;

    if-ne v0, v1, :cond_0

    move-object v0, p0

    check-cast v0, Lgh3/l;

    new-instance v1, Lgh3/j;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, v2}, Lgh3/j;-><init>(Ljava/lang/Object;Lbh3/g;I)V

    invoke-static {v1}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object p1

    invoke-static {p1}, Lxg3/g;->y(Lxg3/g;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lbh3/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/b;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    return-void
.end method

.method public final w(Lxg3/f;)Lxg3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lxg3/f;",
            ")",
            "Lxg3/g<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lch3/q;

    iget-object v1, p0, Lxg3/g;->w:Lxg3/e;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, p1}, Lch3/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lbh3/g;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lbh3/g;",
            ")",
            "Lxg3/g<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lch3/k;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lch3/k;-><init>(Lxg3/g;Lbh3/g;I)V

    invoke-static {v0}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method
