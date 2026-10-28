.class public abstract Lio/sentry/android/core/EnvelopeFileObserverIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/android/core/EnvelopeFileObserverIntegration$OutboxEnvelopeFileObserverIntegration;
    }
.end annotation


# instance fields
.field public w:Lio/sentry/android/core/q0;

.field public x:Lio/sentry/v0;

.field public y:Z

.field public final z:Lio/sentry/util/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->y:Z

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->z:Lio/sentry/util/a;

    return-void
.end method


# virtual methods
.method public final b(Lio/sentry/q6;Ljava/lang/String;)V
    .locals 8

    new-instance v0, Lio/sentry/l3;

    invoke-virtual {p1}, Lio/sentry/q6;->getEnvelopeReader()Lio/sentry/s0;

    move-result-object v2

    invoke-virtual {p1}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v3

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    invoke-virtual {p1}, Lio/sentry/q6;->getFlushTimeoutMillis()J

    move-result-wide v5

    invoke-virtual {p1}, Lio/sentry/q6;->getMaxQueueSize()I

    move-result v7

    sget-object v1, Lio/sentry/i4;->a:Lio/sentry/i4;

    invoke-direct/range {v0 .. v7}, Lio/sentry/l3;-><init>(Lio/sentry/d1;Lio/sentry/s0;Lio/sentry/j1;Lio/sentry/v0;JI)V

    new-instance v1, Lio/sentry/android/core/q0;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    invoke-virtual {p1}, Lio/sentry/q6;->getFlushTimeoutMillis()J

    move-result-wide v4

    move-object v2, v0

    move-object v0, v1

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lio/sentry/android/core/q0;-><init>(Ljava/lang/String;Lio/sentry/l3;Lio/sentry/v0;J)V

    iput-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->w:Lio/sentry/android/core/q0;

    :try_start_0
    invoke-virtual {v0}, Landroid/os/FileObserver;->startWatching()V

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "EnvelopeFileObserverIntegration installed."

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p2, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p2, "EnvelopeFileObserver"

    invoke-static {p2}, Ljc/x;->i(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p2, v0

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Failed to initialize EnvelopeFileObserverIntegration."

    invoke-interface {p1, v0, v1, p2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final close()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->z:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    iget-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->w:Lio/sentry/android/core/q0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/FileObserver;->stopWatching()V

    iget-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->x:Lio/sentry/v0;

    if-eqz v0, :cond_0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "EnvelopeFileObserverIntegration removed."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

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

.method public final m(Lio/sentry/q6;)V
    .locals 5

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->x:Lio/sentry/v0;

    invoke-virtual {p1}, Lio/sentry/q6;->getOutboxPath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->x:Lio/sentry/v0;

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v1, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->x:Lio/sentry/v0;

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Registering EnvelopeFileObserverIntegration for path: %s"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p1}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    new-instance v2, Lio/sentry/android/core/c1;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p1, v0, v3}, Lio/sentry/android/core/c1;-><init>(Ljava/lang/Object;Lio/sentry/q6;Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->x:Lio/sentry/v0;

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "Failed to start EnvelopeFileObserverIntegration on executor thread."

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
