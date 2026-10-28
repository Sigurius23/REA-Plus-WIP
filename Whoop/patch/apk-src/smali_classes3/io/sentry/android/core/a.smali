.class public final Lio/sentry/android/core/a;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final E:J

.field public final F:J

.field public final G:Lio/sentry/v0;

.field public volatile H:J

.field public final I:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final J:Landroid/content/Context;

.field public final K:Lio/sentry/c7;

.field public final w:Z

.field public final x:Lc9/c;

.field public final y:Lio/sentry/android/core/k0;

.field public final z:Li7/g;


# direct methods
.method public constructor <init>(JZLc9/c;Lio/sentry/v0;Landroid/content/Context;)V
    .locals 4

    new-instance v0, Li7/g;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Li7/g;-><init>(I)V

    new-instance v1, Lio/sentry/android/core/k0;

    invoke-direct {v1}, Lio/sentry/android/core/k0;-><init>()V

    const-string v2, "|ANR-WatchDog|"

    invoke-direct {p0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lio/sentry/android/core/a;->H:J

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v2, p0, Lio/sentry/android/core/a;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object v0, p0, Lio/sentry/android/core/a;->z:Li7/g;

    iput-wide p1, p0, Lio/sentry/android/core/a;->F:J

    const-wide/16 v2, 0x1f4

    iput-wide v2, p0, Lio/sentry/android/core/a;->E:J

    iput-boolean p3, p0, Lio/sentry/android/core/a;->w:Z

    iput-object p4, p0, Lio/sentry/android/core/a;->x:Lc9/c;

    iput-object p5, p0, Lio/sentry/android/core/a;->G:Lio/sentry/v0;

    iput-object v1, p0, Lio/sentry/android/core/a;->y:Lio/sentry/android/core/k0;

    iput-object p6, p0, Lio/sentry/android/core/a;->J:Landroid/content/Context;

    new-instance p3, Lio/sentry/c7;

    invoke-direct {p3, p0, v0}, Lio/sentry/c7;-><init>(Lio/sentry/android/core/a;Li7/g;)V

    iput-object p3, p0, Lio/sentry/android/core/a;->K:Lio/sentry/c7;

    const-wide/16 p3, 0x3e8

    cmp-long p1, p1, p3

    if-ltz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "ANRWatchDog: timeoutIntervalMillis has to be at least %d ms"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lio/sentry/android/core/a;->K:Lio/sentry/c7;

    invoke-virtual {v0}, Lio/sentry/c7;->run()V

    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lio/sentry/android/core/a;->y:Lio/sentry/android/core/k0;

    iget-object v1, p0, Lio/sentry/android/core/a;->K:Lio/sentry/c7;

    iget-object v0, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    iget-wide v0, p0, Lio/sentry/android/core/a;->E:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lio/sentry/android/core/a;->z:Li7/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lio/sentry/android/core/a;->H:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lio/sentry/android/core/a;->F:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lio/sentry/android/core/a;->w:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Debug;->waitingForDebugger()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/a;->G:Lio/sentry/v0;

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v4, "An ANR was detected but ignored because the debugger is connected."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v3, v4, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lio/sentry/android/core/a;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/a;->J:Landroid/content/Context;

    const-string v3, "activity"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    if-eqz v0, :cond_4

    :try_start_1
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getProcessesInErrorState()Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v3, p0, Lio/sentry/android/core/a;->G:Lio/sentry/v0;

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Error getting ActivityManager#getProcessesInErrorState."

    invoke-interface {v3, v4, v5, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager$ProcessErrorStateInfo;

    iget v3, v3, Landroid/app/ActivityManager$ProcessErrorStateInfo;->condition:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_3

    :cond_4
    iget-object v0, p0, Lio/sentry/android/core/a;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Application Not Responding for at least "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, p0, Lio/sentry/android/core/a;->F:J

    const-string v1, " ms."

    invoke-static {v3, v4, v1, v0}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lio/sentry/android/core/ApplicationNotResponding;

    iget-object v4, p0, Lio/sentry/android/core/a;->y:Lio/sentry/android/core/k0;

    iget-object v4, v4, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v4, Landroid/os/Handler;

    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Lio/sentry/android/core/ApplicationNotResponding;-><init>(Ljava/lang/String;Ljava/lang/Thread;)V

    iget-object v0, p0, Lio/sentry/android/core/a;->x:Lc9/c;

    iget-object v4, v0, Lc9/c;->x:Ljava/lang/Object;

    iget-object v0, v0, Lc9/c;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    sget-object v4, Lio/sentry/android/core/AnrIntegration;->E:Lio/sentry/android/core/a;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v7, "ANR triggered with message: %s"

    invoke-interface {v4, v5, v7, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v5, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    iget-object v5, v5, Lio/sentry/android/core/e0;->z:Ljava/lang/Boolean;

    invoke-virtual {v4, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ANR for at least "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v4, :cond_5

    const-string v1, "Background "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_5
    iget-object v1, v3, Lio/sentry/android/core/ApplicationNotResponding;->w:Ljava/lang/Thread;

    if-nez v1, :cond_6

    new-instance v3, Lio/sentry/android/core/ApplicationNotResponding;

    invoke-direct {v3, v0}, Lio/sentry/android/core/ApplicationNotResponding;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    new-instance v3, Lio/sentry/android/core/ApplicationNotResponding;

    invoke-direct {v3, v0, v1}, Lio/sentry/android/core/ApplicationNotResponding;-><init>(Ljava/lang/String;Ljava/lang/Thread;)V

    :goto_2
    new-instance v0, Lio/sentry/protocol/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v5, "ANR"

    iput-object v5, v0, Lio/sentry/protocol/n;->w:Ljava/lang/String;

    new-instance v5, Lio/sentry/exception/ExceptionMechanismException;

    invoke-direct {v5, v0, v3, v1, v2}, Lio/sentry/exception/ExceptionMechanismException;-><init>(Lio/sentry/protocol/n;Ljava/lang/Throwable;Ljava/lang/Thread;Z)V

    new-instance v0, Lio/sentry/e5;

    invoke-direct {v0, v5}, Lio/sentry/e5;-><init>(Ljava/lang/Throwable;)V

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    iput-object v1, v0, Lio/sentry/e5;->U:Lio/sentry/n5;

    new-instance v1, Lio/sentry/android/core/w;

    invoke-direct {v1, v4}, Lio/sentry/android/core/w;-><init>(Z)V

    invoke-static {v1}, Lhg3/i;->C(Ljava/lang/Object;)Lio/sentry/g0;

    move-result-object v1

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Lio/sentry/d1;->v(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/protocol/v;

    goto/16 :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1

    iget-object v1, p0, Lio/sentry/android/core/a;->G:Lio/sentry/v0;

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Interrupted: %s"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catch_1
    iget-object v1, p0, Lio/sentry/android/core/a;->G:Lio/sentry/v0;

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Failed to interrupt due to SecurityException: %s"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    return-void
.end method
