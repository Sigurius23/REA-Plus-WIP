.class public final Lio/sentry/android/core/performance/g;
.super Lio/sentry/android/core/performance/a;
.source "SourceFile"


# static fields
.field public static P:J

.field public static volatile Q:Lio/sentry/android/core/performance/g;

.field public static final R:Lio/sentry/util/a;


# instance fields
.field public final E:Lio/sentry/android/core/performance/h;

.field public final F:Lio/sentry/android/core/performance/h;

.field public final G:Ljava/util/HashMap;

.field public final H:Ljava/util/ArrayList;

.field public I:Lio/sentry/android/core/u;

.field public J:Lio/sentry/android/core/h;

.field public K:Laa3/i1;

.field public L:Z

.field public M:Z

.field public final N:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final O:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public w:Lio/sentry/android/core/performance/f;

.field public final x:Lio/sentry/util/f;

.field public volatile y:J

.field public final z:Lio/sentry/android/core/performance/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Lio/sentry/android/core/performance/g;->P:J

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lio/sentry/android/core/performance/g;->R:Lio/sentry/util/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lio/sentry/android/core/performance/f;->UNKNOWN:Lio/sentry/android/core/performance/f;

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    new-instance v0, Lio/sentry/util/f;

    new-instance v1, Lqt/e;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Lqt/e;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->x:Lio/sentry/util/f;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lio/sentry/android/core/performance/g;->y:J

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->I:Lio/sentry/android/core/u;

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->J:Lio/sentry/android/core/h;

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->K:Laa3/i1;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/performance/g;->L:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/sentry/android/core/performance/g;->M:Z

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/performance/g;->N:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/android/core/performance/g;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lio/sentry/android/core/performance/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->z:Lio/sentry/android/core/performance/h;

    new-instance v0, Lio/sentry/android/core/performance/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->E:Lio/sentry/android/core/performance/h;

    new-instance v0, Lio/sentry/android/core/performance/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->F:Lio/sentry/android/core/performance/h;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->G:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/performance/g;->H:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Lio/sentry/android/core/performance/g;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/performance/g;->N:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/performance/g;->x:Lio/sentry/util/f;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lio/sentry/util/f;->c(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/sentry/android/core/performance/g;->I:Lio/sentry/android/core/u;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/android/core/u;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/performance/g;->I:Lio/sentry/android/core/u;

    invoke-virtual {v0}, Lio/sentry/android/core/u;->close()V

    iput-object v1, p0, Lio/sentry/android/core/performance/g;->I:Lio/sentry/android/core/u;

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->J:Lio/sentry/android/core/h;

    if-eqz v0, :cond_1

    iget-boolean v2, v0, Lio/sentry/android/core/h;->I:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lio/sentry/android/core/h;->a(Z)V

    iput-object v1, p0, Lio/sentry/android/core/performance/g;->J:Lio/sentry/android/core/h;

    :cond_1
    return-void
.end method

.method public static c()Lio/sentry/android/core/performance/g;
    .locals 2

    sget-object v0, Lio/sentry/android/core/performance/g;->Q:Lio/sentry/android/core/performance/g;

    if-nez v0, :cond_1

    sget-object v0, Lio/sentry/android/core/performance/g;->R:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/android/core/performance/g;->Q:Lio/sentry/android/core/performance/g;

    if-nez v1, :cond_0

    new-instance v1, Lio/sentry/android/core/performance/g;

    invoke-direct {v1}, Lio/sentry/android/core/performance/g;-><init>()V

    sput-object v1, Lio/sentry/android/core/performance/g;->Q:Lio/sentry/android/core/performance/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    goto :goto_3

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    :cond_1
    :goto_3
    sget-object v0, Lio/sentry/android/core/performance/g;->Q:Lio/sentry/android/core/performance/g;

    return-object v0
.end method


# virtual methods
.method public final b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;
    .locals 6

    iget-object v0, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    sget-object v1, Lio/sentry/android/core/performance/f;->UNKNOWN:Lio/sentry/android/core/performance/f;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/performance/g;->x:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result p1

    const-wide/16 v0, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->z:Lio/sentry/android/core/performance/h;

    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->a()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->E:Lio/sentry/android/core/performance/h;

    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->a()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-gtz v0, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Lio/sentry/android/core/performance/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method

.method public final declared-synchronized d()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v0

    iget-object v1, v0, Lio/sentry/android/core/performance/g;->E:Lio/sentry/android/core/performance/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lio/sentry/android/core/performance/h;->z:J

    iget-object v0, v0, Lio/sentry/android/core/performance/g;->z:Lio/sentry/android/core/performance/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lio/sentry/android/core/performance/h;->z:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final e(Landroid/app/Application;)V
    .locals 3

    iget-boolean v0, p0, Lio/sentry/android/core/performance/g;->L:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/sentry/android/core/performance/g;->L:Z

    iget-object v1, p0, Lio/sentry/android/core/performance/g;->x:Lio/sentry/util/f;

    invoke-virtual {v1}, Lio/sentry/util/f;->b()V

    sget-object v1, Lio/sentry/android/core/performance/g;->Q:Lio/sentry/android/core/performance/g;

    invoke-virtual {p1, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x23

    if-lt v1, v2, :cond_2

    const-string v1, "activity"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v0}, Landroid/app/ActivityManager;->getHistoricalProcessStartReasons(I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ApplicationStartInfo;

    invoke-virtual {p1}, Landroid/app/ApplicationStartInfo;->getStartupState()I

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/app/ApplicationStartInfo;->getStartType()I

    move-result p1

    if-ne p1, v0, :cond_1

    sget-object p1, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    iput-object p1, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    goto :goto_0

    :cond_1
    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    iput-object p1, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    :cond_2
    :goto_0
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    sget-object v0, Lio/sentry/android/core/performance/f;->UNKNOWN:Lio/sentry/android/core/performance/f;

    if-ne p1, v0, :cond_3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->getQueue()Landroid/os/MessageQueue;

    move-result-object p1

    new-instance v0, Lio/sentry/android/core/performance/e;

    invoke-direct {v0, p0}, Lio/sentry/android/core/performance/e;-><init>(Lio/sentry/android/core/performance/g;)V

    invoke-virtual {p1, v0}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    return-void

    :cond_3
    if-ne p1, v0, :cond_4

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lds/s;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Lds/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 7

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sget-object v2, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    invoke-virtual {v2, p1}, Lio/sentry/android/core/k0;->b(Landroid/app/Activity;)V

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->N:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_4

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->z:Lio/sentry/android/core/performance/h;

    iget-wide v5, p1, Lio/sentry/android/core/performance/h;->y:J

    sub-long/2addr v3, v5

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->x:Lio/sentry/util/f;

    invoke-virtual {p1}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1

    invoke-virtual {p1, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    sget-object v2, Lio/sentry/android/core/performance/f;->UNKNOWN:Lio/sentry/android/core/performance/f;

    if-ne p1, v2, :cond_4

    if-eqz p2, :cond_1

    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    iput-object p1, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    goto :goto_1

    :cond_1
    iget-wide p1, p0, Lio/sentry/android/core/performance/g;->y:J

    const-wide/16 v2, -0x1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_2

    iget-wide p1, p0, Lio/sentry/android/core/performance/g;->y:J

    cmp-long p1, v0, p1

    if-lez p1, :cond_2

    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    iput-object p1, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    goto :goto_1

    :cond_2
    sget-object p1, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    iput-object p1, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    goto :goto_1

    :cond_3
    :goto_0
    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    iput-object p1, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    iput-boolean v2, p0, Lio/sentry/android/core/performance/g;->M:Z

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->z:Lio/sentry/android/core/performance/h;

    const/4 p2, 0x0

    iput-object p2, p1, Lio/sentry/android/core/performance/h;->w:Ljava/lang/String;

    const-wide/16 v2, 0x0

    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->y:J

    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->z:J

    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->x:J

    invoke-virtual {p1, v0, v1}, Lio/sentry/android/core/performance/h;->c(J)V

    sput-wide v0, Lio/sentry/android/core/performance/g;->P:J

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->G:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->F:Lio/sentry/android/core/performance/h;

    iput-object p2, p1, Lio/sentry/android/core/performance/h;->w:Ljava/lang/String;

    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->y:J

    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->z:J

    iput-wide v2, p1, Lio/sentry/android/core/performance/h;->x:J

    :cond_4
    :goto_1
    iget-object p1, p0, Lio/sentry/android/core/performance/g;->x:Lio/sentry/util/f;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lio/sentry/util/f;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    sget-object v0, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    iget-object v1, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/performance/g;->N:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lio/sentry/android/core/performance/f;->WARM:Lio/sentry/android/core/performance/f;

    iput-object p1, p0, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->x:Lio/sentry/util/f;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lio/sentry/util/f;->c(Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/sentry/android/core/performance/g;->M:Z

    iget-object p1, p0, Lio/sentry/android/core/performance/g;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_1
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    sget-object v0, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    iget-object v1, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    sget-object v0, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    invoke-virtual {v0, p1}, Lio/sentry/android/core/k0;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    invoke-virtual {v0, p1}, Lio/sentry/android/core/k0;->b(Landroid/app/Activity;)V

    iget-object v0, p0, Lio/sentry/android/core/performance/g;->O:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Lio/sentry/android/core/performance/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/sentry/android/core/performance/d;-><init>(Lio/sentry/android/core/performance/g;I)V

    new-instance v1, Lio/sentry/android/core/k0;

    sget-object v2, Lio/sentry/t2;->w:Lio/sentry/t2;

    invoke-direct {v1, v2}, Lio/sentry/android/core/k0;-><init>(Lio/sentry/v0;)V

    invoke-static {p1, v0, v1}, Lio/sentry/android/core/internal/util/i;->a(Landroid/app/Activity;Ljava/lang/Runnable;Lio/sentry/android/core/k0;)V

    return-void

    :cond_1
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lio/sentry/android/core/performance/d;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/sentry/android/core/performance/d;-><init>(Lio/sentry/android/core/performance/g;I)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    sget-object v0, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    iget-object v1, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    return-void
.end method
