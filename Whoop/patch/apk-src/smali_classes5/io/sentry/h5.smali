.class public final Lio/sentry/h5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/h1;


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final b:Lio/sentry/util/a;

.field public final c:Lb3/n;

.field public final d:Lio/sentry/q6;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 11
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Lio/sentry/g5;

    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2}, Lio/sentry/g5;-><init>(I)V

    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lio/sentry/h5;-><init>(Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lio/sentry/q6;)V

    return-void
.end method

.method public constructor <init>(Lio/sentry/q6;)V
    .locals 3

    .line 8
    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v1, Lio/sentry/g5;

    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, v2}, Lio/sentry/g5;-><init>(I)V

    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    invoke-direct {p0, v0, p1}, Lio/sentry/h5;-><init>(Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lio/sentry/q6;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ScheduledThreadPoolExecutor;Lio/sentry/q6;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lio/sentry/util/a;

    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 4
    iput-object v0, p0, Lio/sentry/h5;->b:Lio/sentry/util/a;

    .line 5
    new-instance v0, Lb3/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb3/n;-><init>(I)V

    iput-object v0, p0, Lio/sentry/h5;->c:Lb3/n;

    .line 6
    iput-object p1, p0, Lio/sentry/h5;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 7
    iput-object p2, p0, Lio/sentry/h5;->d:Lio/sentry/q6;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-object v0, p0, Lio/sentry/h5;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iget-object v1, p0, Lio/sentry/h5;->b:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p1, p2, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdownNow()Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :try_start_2
    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_0
    :goto_0
    invoke-virtual {v1}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_3
    invoke-virtual {v1}, Lio/sentry/s;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Lio/sentry/h5;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    :try_start_0
    new-instance v1, Landroidx/lifecycle/z0;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    iget-object v2, p0, Lio/sentry/h5;->d:Lio/sentry/q6;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Prewarm task rejected from "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v0, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;
    .locals 2

    iget-object v0, p0, Lio/sentry/h5;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2, p3, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method

.method public final isClosed()Z
    .locals 2

    iget-object v0, p0, Lio/sentry/h5;->b:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/h5;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method

.method public final submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 5

    iget-object v0, p0, Lio/sentry/h5;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/16 v2, 0x10f

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->purge()V

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    if-ge v1, v2, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v1, p0, Lio/sentry/h5;->d:Lio/sentry/q6;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Task "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " rejected from "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v1, v2, p1, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    new-instance p1, Lio/sentry/f5;

    invoke-direct {p1}, Lio/sentry/f5;-><init>()V

    return-object p1
.end method
