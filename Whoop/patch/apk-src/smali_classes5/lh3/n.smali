.class public final Llh3/n;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public E:Lbh3/b;

.field public volatile w:Ljava/lang/Object;

.field public x:Z

.field public y:Lbh3/d;

.field public z:Lbh3/b;


# virtual methods
.method public final a(Llh3/m;)V
    .locals 11

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh3/l;

    iget-boolean v1, v0, Llh3/l;->a:Z

    if-eqz v1, :cond_1

    goto :goto_3

    :cond_1
    iget-object v1, v0, Llh3/l;->b:[Llh3/m;

    array-length v2, v1

    const/4 v3, 0x1

    sget-object v4, Llh3/l;->e:Llh3/l;

    const/4 v5, 0x0

    if-ne v2, v3, :cond_2

    aget-object v3, v1, v5

    if-ne v3, p1, :cond_2

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v2, -0x1

    new-array v6, v3, [Llh3/m;

    move v7, v5

    move v8, v7

    :goto_0
    if-ge v7, v2, :cond_6

    aget-object v9, v1, v7

    if-eq v9, p1, :cond_5

    if-ne v8, v3, :cond_4

    :goto_1
    move-object v4, v0

    goto :goto_2

    :cond_4
    add-int/lit8 v10, v8, 0x1

    aput-object v9, v6, v8

    move v8, v10

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_6
    if-nez v8, :cond_7

    goto :goto_2

    :cond_7
    if-ge v8, v3, :cond_8

    new-array v1, v8, [Llh3/m;

    invoke-static {v6, v5, v1, v5, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v6, v1

    :cond_8
    new-instance v4, Llh3/l;

    iget-boolean v1, v0, Llh3/l;->a:Z

    invoke-direct {v4, v1, v6}, Llh3/l;-><init>(Z[Llh3/m;)V

    :goto_2
    if-eq v4, v0, :cond_9

    invoke-virtual {p0, v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_9
    :goto_3
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lxg3/s;

    new-instance v0, Llh3/m;

    invoke-direct {v0, p1}, Llh3/m;-><init>(Lxg3/s;)V

    new-instance v1, Ldx/b;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0, v0}, Ldx/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lmh3/b;

    invoke-direct {v2, v1}, Lmh3/b;-><init>(Lbh3/a;)V

    invoke-virtual {p1, v2}, Lxg3/s;->c(Lxg3/t;)V

    iget-object v1, p0, Llh3/n;->y:Lbh3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lxg3/s;->a()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llh3/l;

    iget-boolean v2, v1, Llh3/l;->a:Z

    if-eqz v2, :cond_1

    iget-object p1, p0, Llh3/n;->E:Lbh3/b;

    invoke-interface {p1, v0}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v2, v1, Llh3/l;->b:[Llh3/m;

    array-length v3, v2

    add-int/lit8 v4, v3, 0x1

    new-array v4, v4, [Llh3/m;

    const/4 v5, 0x0

    invoke-static {v2, v5, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object v0, v4, v3

    new-instance v2, Llh3/l;

    iget-boolean v3, v1, Llh3/l;->a:Z

    invoke-direct {v2, v3, v4}, Llh3/l;-><init>(Z[Llh3/m;)V

    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Llh3/n;->z:Lbh3/b;

    invoke-interface {v1, v0}, Lbh3/b;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lxg3/s;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, Llh3/n;->a(Llh3/m;)V

    :cond_2
    return-void
.end method
