.class final Lio/sentry/android/core/SendCachedEnvelopeIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Lio/sentry/o0;
.implements Ljava/io/Closeable;


# instance fields
.field public E:Lio/sentry/i4;

.field public F:Lio/sentry/android/core/SentryAndroidOptions;

.field public G:Lio/sentry/k4;

.field public final H:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final I:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final J:Lio/sentry/util/a;

.field public final w:Lio/sentry/l4;

.field public final x:Lio/sentry/util/f;

.field public final y:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public z:Lio/sentry/p0;


# direct methods
.method public constructor <init>(Lio/sentry/l4;Lio/sentry/util/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->J:Lio/sentry/util/a;

    iput-object p1, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->w:Lio/sentry/l4;

    iput-object p2, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->x:Lio/sentry/util/f;

    return-void
.end method


# virtual methods
.method public final b(Lio/sentry/n0;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->E:Lio/sentry/i4;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->F:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v1, :cond_0

    sget-object v2, Lio/sentry/n0;->DISCONNECTED:Lio/sentry/n0;

    if-eq p1, v2, :cond_0

    invoke-virtual {p0, v0, v1}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->h(Lio/sentry/i4;Lio/sentry/android/core/SentryAndroidOptions;)V

    :cond_0
    return-void
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->z:Lio/sentry/p0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lio/sentry/p0;->W0(Lio/sentry/o0;)V

    :cond_0
    return-void
.end method

.method public final h(Lio/sentry/i4;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->J:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p2}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    new-instance v2, Lio/sentry/android/core/c1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p2, p1, v3}, Lio/sentry/android/core/c1;-><init>(Ljava/lang/Object;Lio/sentry/q6;Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    iget-object v1, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->x:Lio/sentry/util/f;

    invoke-virtual {v1}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v4, "Startup Crash marker exists, blocking flush."

    new-array v5, v2, [Ljava/lang/Object;

    invoke-interface {v1, v3, v4, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getStartupCrashFlushTimeoutMillis()J

    move-result-wide v3

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v3, v4, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :try_start_3
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Synchronous send timed out, continuing in the background."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {p1, v1, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "SendCachedEnvelopeIntegration installed."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_4
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :goto_1
    :try_start_5
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_6
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_3
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Failed to call the executor. Cached events will not be sent"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :goto_4
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    return-void
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 4

    sget-object v0, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object v0, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->E:Lio/sentry/i4;

    instance-of v1, p1, Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "SentryAndroidOptions is required"

    invoke-static {v1, v2}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->F:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    iget-object v3, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->w:Lio/sentry/l4;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Lio/sentry/l4;->y(Lio/sentry/v0;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No cache dir path is defined in options."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string p1, "SendCachedEnvelope"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->F:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p0, v0, p1}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->h(Lio/sentry/i4;Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void
.end method
