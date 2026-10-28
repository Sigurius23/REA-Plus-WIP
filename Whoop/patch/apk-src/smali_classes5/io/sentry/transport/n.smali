.class public final Lio/sentry/transport/n;
.super Ljava/util/concurrent/ThreadPoolExecutor;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final E:Laj/c;

.field public final w:I

.field public x:Lio/sentry/u4;

.field public final y:Lio/sentry/v0;

.field public final z:Lio/sentry/v4;


# direct methods
.method public constructor <init>(ILio/sentry/g5;Lio/sentry/transport/a;Lio/sentry/v0;Lio/sentry/v4;)V
    .locals 9

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x1

    const-wide/16 v3, 0x0

    move v2, v1

    move-object v0, p0

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    const/4 p2, 0x0

    iput-object p2, v0, Lio/sentry/transport/n;->x:Lio/sentry/u4;

    new-instance p2, Laj/c;

    const/16 p3, 0x11

    const/4 v1, 0x0

    invoke-direct {p2, p3, v1}, Laj/c;-><init>(IB)V

    iput-object p2, v0, Lio/sentry/transport/n;->E:Laj/c;

    iput p1, v0, Lio/sentry/transport/n;->w:I

    iput-object p4, v0, Lio/sentry/transport/n;->y:Lio/sentry/v0;

    iput-object p5, v0, Lio/sentry/transport/n;->z:Lio/sentry/v4;

    return-void
.end method


# virtual methods
.method public final afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/transport/n;->E:Laj/c;

    const/4 v1, 0x1

    :try_start_0
    invoke-super {p0, p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/transport/r;

    sget p2, Lio/sentry/transport/r;->w:I

    invoke-virtual {p1, v1}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Lio/sentry/transport/r;

    sget v0, Lio/sentry/transport/r;->w:I

    invoke-virtual {p2, v1}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    throw p1
.end method

.method public final synthetic close()V
    .locals 5

    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    move-result-object v0

    if-ne p0, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->isTerminated()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    const/4 v1, 0x0

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-virtual {p0, v3, v4, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    if-nez v1, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 5

    iget-object v0, p0, Lio/sentry/transport/n;->E:Laj/c;

    iget-object v1, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/transport/r;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/transport/r;

    invoke-static {v1}, Lio/sentry/transport/r;->a(Lio/sentry/transport/r;)I

    move-result v1

    iget v2, p0, Lio/sentry/transport/n;->w:I

    iget-object v3, p0, Lio/sentry/transport/n;->y:Lio/sentry/v0;

    iget-object v4, p0, Lio/sentry/transport/n;->z:Lio/sentry/v4;

    if-ge v1, v2, :cond_0

    invoke-static {v0}, Lio/sentry/transport/r;->b(Lio/sentry/transport/r;)V

    :try_start_0
    invoke-super {p0, p1}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    invoke-interface {v4}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/transport/n;->x:Lio/sentry/u4;

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v1, "Submit rejected by thread pool executor"

    invoke-interface {v3, v0, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lio/sentry/transport/m;

    invoke-direct {p1}, Lio/sentry/transport/m;-><init>()V

    return-object p1

    :cond_0
    invoke-interface {v4}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/transport/n;->x:Lio/sentry/u4;

    sget-object p1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Submit cancelled"

    invoke-interface {v3, p1, v1, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lio/sentry/transport/m;

    invoke-direct {p1}, Lio/sentry/transport/m;-><init>()V

    return-object p1
.end method
