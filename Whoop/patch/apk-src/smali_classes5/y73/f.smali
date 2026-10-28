.class public final Ly73/f;
.super Ll73/f;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:Ln73/a;

.field public final x:Ly73/e;

.field public final y:Ly73/g;

.field public final z:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ly73/e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ly73/f;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Ly73/f;->x:Ly73/e;

    new-instance v0, Ln73/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ly73/f;->w:Ln73/a;

    iget-object v0, p1, Ly73/e;->y:Ln73/a;

    iget-boolean v0, v0, Ln73/a;->x:Z

    if-eqz v0, :cond_0

    sget-object p1, Ly73/h;->f:Ly73/g;

    goto :goto_1

    :cond_0
    iget-object v0, p1, Ly73/e;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, Ly73/e;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly73/g;

    if-eqz v0, :cond_0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance v0, Ly73/g;

    iget-object v1, p1, Ly73/e;->F:Ljava/util/concurrent/ThreadFactory;

    invoke-direct {v0, v1}, Ly73/g;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    iget-object p1, p1, Ly73/e;->y:Ln73/a;

    invoke-virtual {p1, v0}, Ln73/a;->a(Ln73/b;)Z

    goto :goto_0

    :goto_1
    iput-object p1, p0, Ly73/f;->y:Ly73/g;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ln73/b;
    .locals 6

    iget-object v0, p0, Ly73/f;->w:Ln73/a;

    iget-boolean v0, v0, Ln73/a;->x:Z

    if-eqz v0, :cond_0

    sget-object p1, Lq73/d;->w:Lq73/d;

    return-object p1

    :cond_0
    iget-object v0, p0, Ly73/f;->y:Ly73/g;

    iget-object v5, p0, Ly73/f;->w:Ln73/a;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Ly73/j;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lq73/b;)Ly73/m;

    move-result-object p1

    return-object p1
.end method

.method public final dispose()V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Ly73/f;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ly73/f;->w:Ln73/a;

    invoke-virtual {v0}, Ln73/a;->dispose()V

    sget-boolean v0, Ly73/h;->g:Z

    if-eqz v0, :cond_0

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v6, 0x0

    iget-object v1, p0, Ly73/f;->y:Ly73/g;

    const-wide/16 v3, 0x0

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ly73/j;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lq73/b;)Ly73/m;

    return-void

    :cond_0
    move-object v2, p0

    iget-object v0, v2, Ly73/f;->x:Ly73/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    iget-wide v5, v0, Ly73/e;->w:J

    add-long/2addr v3, v5

    iget-object v1, v2, Ly73/f;->y:Ly73/g;

    iput-wide v3, v1, Ly73/g;->y:J

    iget-object v0, v0, Ly73/e;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    return-void

    :cond_1
    move-object v2, p0

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-object v0, p0, Ly73/f;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final run()V
    .locals 5

    iget-object v0, p0, Ly73/f;->x:Ly73/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-wide v3, v0, Ly73/e;->w:J

    add-long/2addr v1, v3

    iget-object v3, p0, Ly73/f;->y:Ly73/g;

    iput-wide v1, v3, Ly73/g;->y:J

    iget-object v0, v0, Ly73/e;->x:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    return-void
.end method
