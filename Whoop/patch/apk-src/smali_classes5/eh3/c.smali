.class public final Leh3/c;
.super Lxg3/j;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public final w:Lmh3/c;

.field public final x:Leh3/b;

.field public final y:Leh3/d;

.field public final z:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Leh3/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmh3/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Leh3/c;->w:Lmh3/c;

    iput-object p1, p0, Leh3/c;->x:Leh3/b;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Leh3/c;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v0, p1, Leh3/b;->d:Lmh3/c;

    iget-boolean v0, v0, Lmh3/c;->x:Z

    if-eqz v0, :cond_0

    sget-object p1, Leh3/e;->d:Leh3/d;

    goto :goto_1

    :cond_0
    iget-object v0, p1, Leh3/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Leh3/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leh3/d;

    if-eqz v0, :cond_0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance v0, Leh3/d;

    iget-object v1, p1, Leh3/b;->a:Ljava/util/concurrent/ThreadFactory;

    invoke-direct {v0, v1}, Leh3/d;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    iget-object p1, p1, Leh3/b;->d:Lmh3/c;

    invoke-virtual {p1, v0}, Lmh3/c;->c(Lxg3/t;)V

    goto :goto_0

    :goto_1
    iput-object p1, p0, Leh3/c;->y:Leh3/d;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Leh3/c;->w:Lmh3/c;

    iget-boolean v0, v0, Lmh3/c;->x:Z

    return v0
.end method

.method public final b()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Leh3/c;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leh3/c;->y:Leh3/d;

    invoke-virtual {v0, p0}, Leh3/k;->c(Lbh3/a;)Lxg3/t;

    :cond_0
    iget-object v0, p0, Leh3/c;->w:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->b()V

    return-void
.end method

.method public final c(Lbh3/a;)Lxg3/t;
    .locals 3

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Leh3/c;->d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;

    move-result-object p1

    return-object p1
.end method

.method public final call()V
    .locals 5

    iget-object v0, p0, Leh3/c;->x:Leh3/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-wide v3, v0, Leh3/b;->b:J

    add-long/2addr v1, v3

    iget-object v3, p0, Leh3/c;->y:Leh3/d;

    iput-wide v1, v3, Leh3/d;->I:J

    iget-object v0, v0, Leh3/b;->c:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;
    .locals 3

    iget-object v0, p0, Leh3/c;->w:Lmh3/c;

    iget-boolean v0, v0, Lmh3/c;->x:Z

    if-eqz v0, :cond_0

    sget-object p1, Lmh3/e;->a:Lmh3/d;

    return-object p1

    :cond_0
    iget-object v0, p0, Leh3/c;->y:Leh3/d;

    new-instance v1, Ldx/b;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, p1}, Ldx/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, p2, p3, p4}, Leh3/k;->f(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Leh3/p;

    move-result-object p1

    iget-object p2, p0, Leh3/c;->w:Lmh3/c;

    invoke-virtual {p2, p1}, Lmh3/c;->c(Lxg3/t;)V

    iget-object p2, p0, Leh3/c;->w:Lmh3/c;

    iget-object p3, p1, Leh3/p;->w:Lgh3/m;

    new-instance p4, Leh3/o;

    const/4 v0, 0x1

    invoke-direct {p4, p1, p2, v0}, Leh3/o;-><init>(Leh3/p;Lxg3/t;I)V

    invoke-virtual {p3, p4}, Lgh3/m;->c(Lxg3/t;)V

    return-object p1
.end method
