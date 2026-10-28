.class public final Lbc3/d1;
.super Lbc3/c1;
.source "SourceFile"

# interfaces
.implements Lbc3/k0;


# instance fields
.field public final w:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Lbc3/z;-><init>()V

    iput-object p1, p0, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    sget-object v0, Lhc3/a;->a:Ljava/lang/reflect/Method;

    :try_start_0
    instance-of v0, p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lhc3/a;->a:Ljava/lang/reflect/Method;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_1
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    instance-of v1, v0, Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    :cond_1
    return-void
.end method

.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "The task was rejected"

    invoke-static {v1, v0}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    invoke-static {p1, v0}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-virtual {v0, p1, p2}, Lkc3/d;->dispatch(Lq83/j;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lbc3/d1;

    if-eqz v0, :cond_0

    check-cast p1, Lbc3/d1;

    iget-object p1, p1, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    iget-object v0, p0, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;
    .locals 3

    iget-object v0, p0, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p3, p1, p2, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "The task was rejected"

    invoke-static {v1, v0}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    invoke-static {p4, v0}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V

    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    new-instance p1, Lbc3/r0;

    invoke-direct {p1, v2}, Lbc3/r0;-><init>(Ljava/util/concurrent/ScheduledFuture;)V

    return-object p1

    :cond_2
    sget-object v0, Lbc3/g0;->H:Lbc3/g0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lbc3/g0;->i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final m(JLbc3/m;)V
    .locals 5

    iget-object v0, p0, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    instance-of v1, v0, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lds/s;

    const/4 v3, 0x2

    invoke-direct {v1, v3, p0, p3}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v3, p3, Lbc3/m;->E:Lq83/j;

    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "The task was rejected"

    invoke-static {v1, v0}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    invoke-static {v3, v0}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V

    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    new-instance p1, Lbc3/h;

    invoke-direct {p1, v2}, Lbc3/h;-><init>(Ljava/util/concurrent/ScheduledFuture;)V

    invoke-virtual {p3, p1}, Lbc3/m;->v(Lbc3/a2;)V

    return-void

    :cond_2
    sget-object v0, Lbc3/g0;->H:Lbc3/g0;

    invoke-virtual {v0, p1, p2, p3}, Lbc3/z0;->m(JLbc3/m;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbc3/d1;->w:Ljava/util/concurrent/Executor;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
