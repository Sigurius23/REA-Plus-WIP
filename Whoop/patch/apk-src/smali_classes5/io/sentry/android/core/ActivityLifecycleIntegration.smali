.class public final Lio/sentry/android/core/ActivityLifecycleIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public E:Z

.field public F:Z

.field public final G:Z

.field public H:Z

.field public I:Lio/sentry/f0;

.field public J:Lio/sentry/l1;

.field public final K:Ljava/util/WeakHashMap;

.field public final L:Ljava/util/WeakHashMap;

.field public final M:Ljava/util/WeakHashMap;

.field public N:Lio/sentry/u4;

.field public O:Ljava/util/concurrent/Future;

.field public final P:Ljava/util/WeakHashMap;

.field public final Q:Lio/sentry/android/core/d;

.field public final R:Lio/sentry/util/a;

.field public final S:Lio/sentry/util/a;

.field public final w:Landroid/app/Application;

.field public final x:Lio/sentry/android/core/k0;

.field public y:Lio/sentry/i4;

.field public z:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lio/sentry/android/core/k0;Lio/sentry/android/core/d;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->E:Z

    iput-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->F:Z

    iput-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->H:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->I:Lio/sentry/f0;

    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->K:Ljava/util/WeakHashMap;

    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->L:Ljava/util/WeakHashMap;

    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->M:Ljava/util/WeakHashMap;

    new-instance v1, Lio/sentry/x5;

    new-instance v2, Ljava/util/Date;

    const-wide/16 v3, 0x0

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-direct {v1, v2, v3, v4}, Lio/sentry/x5;-><init>(Ljava/util/Date;J)V

    iput-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->N:Lio/sentry/u4;

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->O:Ljava/util/concurrent/Future;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->P:Ljava/util/WeakHashMap;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->R:Lio/sentry/util/a;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->S:Lio/sentry/util/a;

    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->w:Landroid/app/Application;

    iput-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->x:Lio/sentry/android/core/k0;

    iput-object p3, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Q:Lio/sentry/android/core/d;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1d

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->G:Z

    :cond_0
    return-void
.end method

.method public static h(Lio/sentry/l1;Lio/sentry/l1;)V
    .locals 3

    if-eqz p0, :cond_4

    invoke-interface {p0}, Lio/sentry/l1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    invoke-interface {p0}, Lio/sentry/l1;->getDescription()Ljava/lang/String;

    move-result-object v0

    const-string v1, " - Deadline Exceeded"

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Lio/sentry/l1;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-interface {p0, v0}, Lio/sentry/l1;->setDescription(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lio/sentry/l1;->u()Lio/sentry/u4;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p0}, Lio/sentry/l1;->x()Lio/sentry/u4;

    move-result-object p1

    :goto_2
    sget-object v0, Lio/sentry/i7;->DEADLINE_EXCEEDED:Lio/sentry/i7;

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/ActivityLifecycleIntegration;->i(Lio/sentry/l1;Lio/sentry/u4;Lio/sentry/i7;)V

    :cond_4
    :goto_3
    return-void
.end method

.method public static i(Lio/sentry/l1;Lio/sentry/u4;Lio/sentry/i7;)V
    .locals 1

    if-eqz p0, :cond_2

    invoke-interface {p0}, Lio/sentry/l1;->e()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lio/sentry/l1;->c()Lio/sentry/i7;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p0}, Lio/sentry/l1;->c()Lio/sentry/i7;

    move-result-object p2

    goto :goto_0

    :cond_1
    sget-object p2, Lio/sentry/i7;->OK:Lio/sentry/i7;

    :goto_0
    invoke-interface {p0, p2, p1}, Lio/sentry/l1;->v(Lio/sentry/i7;Lio/sentry/u4;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 7

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0, v1}, Lio/sentry/android/core/performance/g;->b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;

    move-result-object v0

    iget-wide v1, v0, Lio/sentry/android/core/performance/h;->z:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    new-instance v1, Lio/sentry/u5;

    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-wide v3, v0, Lio/sentry/android/core/performance/h;->x:J

    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->a()J

    move-result-wide v5

    add-long/2addr v3, v5

    :cond_0
    const-wide/32 v5, 0xf4240

    mul-long/2addr v3, v5

    invoke-direct {v1, v3, v4}, Lio/sentry/u5;-><init>(J)V

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    iget-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->E:Z

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->J:Lio/sentry/l1;

    invoke-static {v0, v1, v2}, Lio/sentry/android/core/ActivityLifecycleIntegration;->i(Lio/sentry/l1;Lio/sentry/u4;Lio/sentry/i7;)V

    :cond_2
    return-void
.end method

.method public final close()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->w:Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ActivityLifecycleIntegration removed."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Q:Lio/sentry/android/core/d;

    iget-object v1, v0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    check-cast v1, Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/android/core/d;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lio/sentry/c7;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    const-string v3, "FrameMetricsAggregator.stop"

    invoke-virtual {v0, v2, v3}, Lio/sentry/android/core/d;->d(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object v2, v0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    check-cast v2, Lio/sentry/util/f;

    invoke-virtual {v2}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/core/app/FrameMetricsAggregator;

    invoke-virtual {v2}, Landroidx/core/app/FrameMetricsAggregator;->reset()[Landroid/util/SparseIntArray;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, v0, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
.end method

.method public final k(Lio/sentry/n1;Lio/sentry/l1;Lio/sentry/l1;)V
    .locals 2

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lio/sentry/l1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/sentry/i7;->DEADLINE_EXCEEDED:Lio/sentry/i7;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lio/sentry/l1;->e()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p2, v0}, Lio/sentry/l1;->l(Lio/sentry/i7;)V

    :cond_1
    invoke-static {p3, p2}, Lio/sentry/android/core/ActivityLifecycleIntegration;->h(Lio/sentry/l1;Lio/sentry/l1;)V

    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->O:Ljava/util/concurrent/Future;

    if-eqz p2, :cond_2

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 p2, 0x0

    iput-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->O:Ljava/util/concurrent/Future;

    :cond_2
    invoke-interface {p1}, Lio/sentry/l1;->c()Lio/sentry/i7;

    move-result-object p2

    if-nez p2, :cond_3

    sget-object p2, Lio/sentry/i7;->OK:Lio/sentry/i7;

    :cond_3
    invoke-interface {p1, p2}, Lio/sentry/l1;->l(Lio/sentry/i7;)V

    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    if-eqz p2, :cond_4

    new-instance p3, Lhn/p;

    invoke-direct {p3, p0, p1}, Lhn/p;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/n1;)V

    invoke-virtual {p2, p3}, Lio/sentry/i4;->s(Lio/sentry/e4;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 3

    instance-of v0, p1, Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "SentryAndroidOptions is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    sget-object v0, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    invoke-virtual {p1}, Lio/sentry/q6;->isTracingEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoActivityLifecycleTracing()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->E:Z

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getFullyDisplayedReporter()Lio/sentry/f0;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->I:Lio/sentry/f0;

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->isEnableTimeToFullDisplayTracing()Z

    move-result p1

    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->F:Z

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->w:Landroid/app/Application;

    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "ActivityLifecycleIntegration installed."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "ActivityLifecycle"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 4

    iget-boolean v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->G:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->R:Lio/sentry/util/a;

    invoke-virtual {p2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object p2

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/sentry/q6;->isEnableScreenTracking()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lts/o;->v(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    new-instance v2, Lio/sentry/g7;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lio/sentry/g7;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Lio/sentry/i4;->s(Lio/sentry/e4;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->x(Landroid/app/Activity;)V

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->K:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/l1;

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->L:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/l1;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->H:Z

    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->E:Z

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->I:Lio/sentry/f0;

    if-eqz p1, :cond_2

    new-instance v0, Li5/c;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Li5/c;-><init>(I)V

    iget-object p1, p1, Lio/sentry/f0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {p2}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {p2}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 11

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->L:Ljava/util/WeakHashMap;

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->K:Ljava/util/WeakHashMap;

    iget-object v2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->M:Ljava/util/WeakHashMap;

    iget-object v3, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->R:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v3

    :try_start_0
    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/core/performance/b;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    iget-object v6, v4, Lio/sentry/android/core/performance/b;->d:Lio/sentry/l1;

    if-eqz v6, :cond_0

    invoke-interface {v6}, Lio/sentry/l1;->e()Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v6, v4, Lio/sentry/android/core/performance/b;->d:Lio/sentry/l1;

    sget-object v7, Lio/sentry/i7;->CANCELLED:Lio/sentry/i7;

    invoke-interface {v6, v7}, Lio/sentry/l1;->l(Lio/sentry/i7;)V

    :cond_0
    iput-object v5, v4, Lio/sentry/android/core/performance/b;->d:Lio/sentry/l1;

    iget-object v6, v4, Lio/sentry/android/core/performance/b;->e:Lio/sentry/l1;

    if-eqz v6, :cond_1

    invoke-interface {v6}, Lio/sentry/l1;->e()Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, v4, Lio/sentry/android/core/performance/b;->e:Lio/sentry/l1;

    sget-object v7, Lio/sentry/i7;->CANCELLED:Lio/sentry/i7;

    invoke-interface {v6, v7}, Lio/sentry/l1;->l(Lio/sentry/i7;)V

    :cond_1
    iput-object v5, v4, Lio/sentry/android/core/performance/b;->e:Lio/sentry/l1;

    :cond_2
    iget-boolean v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->E:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    iget-object v7, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->P:Ljava/util/WeakHashMap;

    if-eqz v4, :cond_7

    :try_start_1
    iget-object v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->J:Lio/sentry/l1;

    sget-object v8, Lio/sentry/i7;->CANCELLED:Lio/sentry/i7;

    if-eqz v4, :cond_3

    invoke-interface {v4}, Lio/sentry/l1;->e()Z

    move-result v9

    if-nez v9, :cond_3

    invoke-interface {v4, v8}, Lio/sentry/l1;->l(Lio/sentry/i7;)V

    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/l1;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/sentry/l1;

    sget-object v9, Lio/sentry/i7;->DEADLINE_EXCEEDED:Lio/sentry/i7;

    if-eqz v4, :cond_4

    invoke-interface {v4}, Lio/sentry/l1;->e()Z

    move-result v10

    if-nez v10, :cond_4

    invoke-interface {v4, v9}, Lio/sentry/l1;->l(Lio/sentry/i7;)V

    :cond_4
    invoke-static {v8, v4}, Lio/sentry/android/core/ActivityLifecycleIntegration;->h(Lio/sentry/l1;Lio/sentry/l1;)V

    iget-object v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->O:Ljava/util/concurrent/Future;

    if-eqz v4, :cond_5

    invoke-interface {v4, v6}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v5, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->O:Ljava/util/concurrent/Future;

    :cond_5
    iget-boolean v4, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->E:Z

    if-eqz v4, :cond_6

    invoke-virtual {v7, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/n1;

    invoke-virtual {p0, v4, v5, v5}, Lio/sentry/android/core/ActivityLifecycleIntegration;->k(Lio/sentry/n1;Lio/sentry/l1;Lio/sentry/l1;)V

    :cond_6
    iput-object v5, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->J:Lio/sentry/l1;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_7
    :goto_0
    invoke-virtual {v7, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-nez p1, :cond_8

    iput-boolean v6, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->H:Z

    new-instance p1, Lio/sentry/x5;

    new-instance v0, Ljava/util/Date;

    const-wide/16 v4, 0x0

    invoke-direct {v0, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-direct {p1, v0, v4, v5}, Lio/sentry/x5;-><init>(Ljava/util/Date;J)V

    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->N:Lio/sentry/u4;

    invoke-virtual {v2}, Ljava/util/WeakHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_8
    invoke-virtual {v3}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_2
    invoke-virtual {v3}, Lio/sentry/s;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->R:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->G:Z

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPrePaused(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    iget-object p2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->M:Ljava/util/WeakHashMap;

    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/sentry/android/core/performance/b;

    if-eqz p2, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->J:Lio/sentry/l1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->P:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lio/sentry/l1;

    :goto_0
    iget-object p1, p2, Lio/sentry/android/core/performance/b;->b:Lio/sentry/u4;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    iget-object p1, p2, Lio/sentry/android/core/performance/b;->a:Ljava/lang/String;

    const-string v1, ".onCreate"

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p2, Lio/sentry/android/core/performance/b;->b:Lio/sentry/u4;

    invoke-static {v0, p1, v1}, Lio/sentry/android/core/performance/b;->a(Lio/sentry/l1;Ljava/lang/String;Lio/sentry/u4;)Lio/sentry/l1;

    move-result-object p1

    iput-object p1, p2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/l1;

    invoke-interface {p1}, Lio/sentry/l1;->g()V

    :cond_1
    return-void
.end method

.method public final onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityPostStarted(Landroid/app/Activity;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->M:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/android/core/performance/b;

    if-eqz v2, :cond_4

    iget-object v3, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->J:Lio/sentry/l1;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->P:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/sentry/l1;

    :goto_0
    iget-object v1, v2, Lio/sentry/android/core/performance/b;->c:Lio/sentry/u4;

    if-eqz v1, :cond_1

    if-eqz v3, :cond_1

    iget-object v1, v2, Lio/sentry/android/core/performance/b;->a:Ljava/lang/String;

    const-string v4, ".onStart"

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v4, v2, Lio/sentry/android/core/performance/b;->c:Lio/sentry/u4;

    invoke-static {v3, v1, v4}, Lio/sentry/android/core/performance/b;->a(Lio/sentry/l1;Ljava/lang/String;Lio/sentry/u4;)Lio/sentry/l1;

    move-result-object v1

    iput-object v1, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/l1;

    invoke-interface {v1}, Lio/sentry/l1;->g()V

    :cond_1
    iget-object v1, v2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/l1;

    if-eqz v1, :cond_4

    iget-object v3, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/l1;

    if-nez v3, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-interface {v1}, Lio/sentry/l1;->u()Lio/sentry/u4;

    move-result-object v1

    iget-object v3, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/l1;

    invoke-interface {v3}, Lio/sentry/l1;->u()Lio/sentry/u4;

    move-result-object v3

    if-eqz v1, :cond_4

    if-nez v3, :cond_3

    goto/16 :goto_1

    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    sget-object v6, Lio/sentry/android/core/j;->a:Lio/sentry/android/core/e1;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lio/sentry/x5;

    invoke-direct {v6}, Lio/sentry/x5;-><init>()V

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v8, v2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/l1;

    invoke-interface {v8}, Lio/sentry/l1;->x()Lio/sentry/u4;

    move-result-object v8

    invoke-virtual {v6, v8}, Lio/sentry/x5;->b(Lio/sentry/u4;)J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    invoke-virtual {v6, v1}, Lio/sentry/x5;->b(Lio/sentry/u4;)J

    move-result-wide v10

    invoke-virtual {v7, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v10

    iget-object v1, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/l1;

    invoke-interface {v1}, Lio/sentry/l1;->x()Lio/sentry/u4;

    move-result-object v1

    invoke-virtual {v6, v1}, Lio/sentry/x5;->b(Lio/sentry/u4;)J

    move-result-wide v12

    invoke-virtual {v7, v12, v13}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v12

    invoke-virtual {v6, v3}, Lio/sentry/x5;->b(Lio/sentry/u4;)J

    move-result-wide v14

    invoke-virtual {v7, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v14

    new-instance v1, Lio/sentry/android/core/performance/c;

    invoke-direct {v1}, Lio/sentry/android/core/performance/c;-><init>()V

    iget-object v3, v2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/l1;

    invoke-interface {v3}, Lio/sentry/l1;->getDescription()Ljava/lang/String;

    move-result-object v3

    iget-object v6, v2, Lio/sentry/android/core/performance/b;->d:Lio/sentry/l1;

    invoke-interface {v6}, Lio/sentry/l1;->x()Lio/sentry/u4;

    move-result-object v6

    move-wide/from16 v16, v4

    invoke-virtual {v6}, Lio/sentry/u4;->d()J

    move-result-wide v4

    invoke-virtual {v7, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sub-long v8, v16, v8

    sub-long v10, v16, v10

    iget-object v6, v1, Lio/sentry/android/core/performance/c;->w:Lio/sentry/android/core/performance/h;

    iput-object v3, v6, Lio/sentry/android/core/performance/h;->w:Ljava/lang/String;

    iput-wide v4, v6, Lio/sentry/android/core/performance/h;->x:J

    iput-wide v8, v6, Lio/sentry/android/core/performance/h;->y:J

    iput-wide v10, v6, Lio/sentry/android/core/performance/h;->z:J

    iget-object v3, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/l1;

    invoke-interface {v3}, Lio/sentry/l1;->getDescription()Ljava/lang/String;

    move-result-object v3

    iget-object v2, v2, Lio/sentry/android/core/performance/b;->e:Lio/sentry/l1;

    invoke-interface {v2}, Lio/sentry/l1;->x()Lio/sentry/u4;

    move-result-object v2

    invoke-virtual {v2}, Lio/sentry/u4;->d()J

    move-result-wide v4

    invoke-virtual {v7, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sub-long v6, v16, v12

    sub-long v8, v16, v14

    iget-object v2, v1, Lio/sentry/android/core/performance/c;->x:Lio/sentry/android/core/performance/h;

    iput-object v3, v2, Lio/sentry/android/core/performance/h;->w:Ljava/lang/String;

    iput-wide v4, v2, Lio/sentry/android/core/performance/h;->x:J

    iput-wide v6, v2, Lio/sentry/android/core/performance/h;->y:J

    iput-wide v8, v2, Lio/sentry/android/core/performance/h;->z:J

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/android/core/performance/g;->H:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public final onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    new-instance p2, Lio/sentry/android/core/performance/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lio/sentry/android/core/performance/b;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->M:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->H:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/sentry/i4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Lio/sentry/android/core/j;->a:Lio/sentry/android/core/e1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lio/sentry/x5;

    invoke-direct {p1}, Lio/sentry/x5;-><init>()V

    :goto_0
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->N:Lio/sentry/u4;

    iput-object p1, p2, Lio/sentry/android/core/performance/b;->b:Lio/sentry/u4;

    return-void
.end method

.method public final onActivityPrePaused(Landroid/app/Activity;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->H:Z

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/sentry/i4;->l()Lio/sentry/q6;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/android/core/j;->a:Lio/sentry/android/core/e1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lio/sentry/x5;

    invoke-direct {p1}, Lio/sentry/x5;-><init>()V

    :goto_0
    iput-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->N:Lio/sentry/u4;

    return-void
.end method

.method public final onActivityPreStarted(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->M:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/android/core/performance/b;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lio/sentry/android/core/j;->a:Lio/sentry/android/core/e1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lio/sentry/x5;

    invoke-direct {v0}, Lio/sentry/x5;-><init>()V

    :goto_0
    iput-object v0, p1, Lio/sentry/android/core/performance/b;->c:Lio/sentry/u4;

    :cond_1
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->R:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->G:Z

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPostStarted(Landroid/app/Activity;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->E:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->K:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/l1;

    iget-object v2, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->L:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/l1;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v3, Lio/sentry/android/core/e;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v2, v1, v4}, Lio/sentry/android/core/e;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/l1;Lio/sentry/l1;I)V

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->x:Lio/sentry/android/core/k0;

    invoke-static {p1, v3, v1}, Lio/sentry/android/core/internal/util/i;->a(Landroid/app/Activity;Ljava/lang/Runnable;Lio/sentry/android/core/k0;)V

    goto :goto_1

    :cond_1
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Lio/sentry/android/core/e;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v2, v1, v4}, Lio/sentry/android/core/e;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/l1;Lio/sentry/l1;I)V

    invoke-virtual {p1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_2
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->R:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->G:Z

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    invoke-virtual {p0, p1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->onActivityPreStarted(Landroid/app/Activity;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-boolean v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->E:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->Q:Lio/sentry/android/core/d;

    invoke-virtual {v1, p1}, Lio/sentry/android/core/d;->a(Landroid/app/Activity;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final s(Lio/sentry/l1;Lio/sentry/l1;)V
    .locals 6

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object p1

    iget-object v0, p1, Lio/sentry/android/core/performance/g;->z:Lio/sentry/android/core/performance/h;

    iget-object p1, p1, Lio/sentry/android/core/performance/g;->E:Lio/sentry/android/core/performance/h;

    invoke-virtual {v0}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    iget-wide v4, v0, Lio/sentry/android/core/performance/h;->z:J

    cmp-long v1, v4, v2

    if-nez v1, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iput-wide v4, v0, Lio/sentry/android/core/performance/h;->z:J

    :cond_0
    invoke-virtual {p1}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lio/sentry/android/core/performance/h;->z:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lio/sentry/android/core/performance/h;->z:J

    :cond_1
    invoke-virtual {p0}, Lio/sentry/android/core/ActivityLifecycleIntegration;->b()V

    iget-object p1, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->S:Lio/sentry/util/a;

    invoke-virtual {p1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object p1

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_2

    if-eqz p2, :cond_2

    invoke-virtual {v0}, Lio/sentry/q6;->getDateProvider()Lio/sentry/v4;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/v4;->now()Lio/sentry/u4;

    move-result-object v0

    invoke-interface {p2}, Lio/sentry/l1;->x()Lio/sentry/u4;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/u4;->b(Lio/sentry/u4;)J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    const-string v3, "time_to_initial_display"

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    sget-object v2, Lio/sentry/k2;->MILLISECOND:Lio/sentry/k2;

    invoke-interface {p2, v3, v1, v2}, Lio/sentry/l1;->s(Ljava/lang/String;Ljava/lang/Long;Lio/sentry/l2;)V

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->i(Lio/sentry/l1;Lio/sentry/u4;Lio/sentry/i7;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    invoke-interface {p2}, Lio/sentry/l1;->e()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lio/sentry/l1;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_0
    invoke-virtual {p1}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
.end method

.method public final x(Landroid/app/Activity;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v3, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    if-eqz v3, :cond_d

    iget-object v3, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->P:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    iget-boolean v4, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->E:Z

    if-nez v4, :cond_0

    sget-object v0, Lio/sentry/g3;->a:Lio/sentry/g3;

    invoke-virtual {v3, v2, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    new-instance v2, Li7/g;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Li7/g;-><init>(I)V

    invoke-virtual {v0, v2}, Lio/sentry/i4;->s(Lio/sentry/e4;)V

    return-void

    :cond_0
    invoke-virtual {v3}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    iget-object v6, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->L:Ljava/util/WeakHashMap;

    iget-object v7, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->K:Ljava/util/WeakHashMap;

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/sentry/n1;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/l1;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/l1;

    invoke-virtual {v1, v8, v7, v5}, Lio/sentry/android/core/ActivityLifecycleIntegration;->k(Lio/sentry/n1;Lio/sentry/l1;Lio/sentry/l1;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v5

    iget-object v8, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v5, v8}, Lio/sentry/android/core/performance/g;->b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;

    move-result-object v5

    invoke-static {}, Lio/sentry/android/core/j0;->g()Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v8, :cond_4

    invoke-virtual {v5}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v5}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v8

    if-eqz v8, :cond_2

    new-instance v8, Lio/sentry/u5;

    iget-wide v12, v5, Lio/sentry/android/core/performance/h;->x:J

    const-wide/32 v14, 0xf4240

    mul-long/2addr v12, v14

    invoke-direct {v8, v12, v13}, Lio/sentry/u5;-><init>(J)V

    goto :goto_1

    :cond_2
    move-object v8, v11

    :goto_1
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v5

    iget-object v5, v5, Lio/sentry/android/core/performance/g;->w:Lio/sentry/android/core/performance/f;

    sget-object v12, Lio/sentry/android/core/performance/f;->COLD:Lio/sentry/android/core/performance/f;

    if-ne v5, v12, :cond_3

    move v5, v10

    goto :goto_2

    :cond_3
    move v5, v9

    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    move-object v15, v8

    goto :goto_3

    :cond_4
    move-object v5, v11

    move-object v15, v5

    :goto_3
    new-instance v8, Lio/sentry/n7;

    invoke-direct {v8}, Lio/sentry/n7;-><init>()V

    iget-object v12, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v12}, Lio/sentry/q6;->getDeadlineTimeout()J

    move-result-wide v12

    const-wide/16 v16, 0x0

    cmp-long v14, v12, v16

    if-gtz v14, :cond_5

    move-object v12, v11

    goto :goto_4

    :cond_5
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    :goto_4
    iput-object v12, v8, Lio/sentry/n7;->h:Ljava/lang/Long;

    iget-object v12, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v12}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleTracingAutoFinish()Z

    move-result v12

    if-eqz v12, :cond_6

    iget-object v12, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v12}, Lio/sentry/q6;->getIdleTimeout()Ljava/lang/Long;

    move-result-object v12

    iput-object v12, v8, Lio/sentry/n7;->g:Ljava/lang/Long;

    iput-boolean v10, v8, Leh/a;->a:Z

    :cond_6
    iput-boolean v10, v8, Lio/sentry/n7;->f:Z

    new-instance v12, Lio/sentry/android/core/f;

    invoke-direct {v12, v1, v0, v4}, Lio/sentry/android/core/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v12, v8, Lio/sentry/n7;->i:Lio/sentry/android/core/f;

    iget-boolean v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->H:Z

    if-nez v0, :cond_7

    if-eqz v15, :cond_7

    if-eqz v5, :cond_7

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/android/core/performance/g;->K:Laa3/i1;

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v12

    iput-object v11, v12, Lio/sentry/android/core/performance/g;->K:Laa3/i1;

    move-object v11, v0

    move-object v0, v15

    goto :goto_5

    :cond_7
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->N:Lio/sentry/u4;

    :goto_5
    iput-object v0, v8, Leh/a;->b:Ljava/lang/Object;

    if-eqz v11, :cond_8

    move v9, v10

    :cond_8
    iput-boolean v9, v8, Lio/sentry/n7;->e:Z

    const-string v9, "auto.ui.activity"

    iput-object v9, v8, Leh/a;->d:Ljava/lang/Object;

    iget-object v10, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    new-instance v12, Lio/sentry/m7;

    sget-object v13, Lio/sentry/protocol/g0;->COMPONENT:Lio/sentry/protocol/g0;

    const-string v14, "ui.load"

    invoke-direct {v12, v4, v13, v14, v11}, Lio/sentry/m7;-><init>(Ljava/lang/String;Lio/sentry/protocol/g0;Ljava/lang/String;Laa3/i1;)V

    invoke-virtual {v10, v12, v8}, Lio/sentry/i4;->x(Lio/sentry/m7;Lio/sentry/n7;)Lio/sentry/n1;

    move-result-object v16

    new-instance v8, Leh/a;

    const/4 v10, 0x1

    invoke-direct {v8, v10}, Leh/a;-><init>(I)V

    iput-object v9, v8, Leh/a;->d:Ljava/lang/Object;

    iget-boolean v9, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->H:Z

    if-nez v9, :cond_b

    if-eqz v15, :cond_b

    if-eqz v5, :cond_b

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_9

    const-string v9, "app.start.cold"

    :goto_6
    move-object v13, v9

    goto :goto_7

    :cond_9
    const-string v9, "app.start.warm"

    goto :goto_6

    :goto_7
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_a

    const-string v5, "Cold Start"

    :goto_8
    move-object v14, v5

    move-object/from16 v12, v16

    goto :goto_9

    :cond_a
    const-string v5, "Warm Start"

    goto :goto_8

    :goto_9
    sget-object v16, Lio/sentry/s1;->SENTRY:Lio/sentry/s1;

    move-object/from16 v17, v8

    invoke-interface/range {v12 .. v17}, Lio/sentry/l1;->q(Ljava/lang/String;Ljava/lang/String;Lio/sentry/u4;Lio/sentry/s1;Leh/a;)Lio/sentry/l1;

    move-result-object v5

    move-object/from16 v16, v12

    move-object/from16 v21, v17

    iput-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->J:Lio/sentry/l1;

    invoke-virtual {v1}, Lio/sentry/android/core/ActivityLifecycleIntegration;->b()V

    goto :goto_a

    :cond_b
    move-object/from16 v21, v8

    :goto_a
    const-string v5, " initial display"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    sget-object v20, Lio/sentry/s1;->SENTRY:Lio/sentry/s1;

    const-string v17, "ui.load.initial_display"

    move-object/from16 v19, v0

    invoke-interface/range {v16 .. v21}, Lio/sentry/l1;->q(Ljava/lang/String;Ljava/lang/String;Lio/sentry/u4;Lio/sentry/s1;Leh/a;)Lio/sentry/l1;

    move-result-object v0

    invoke-virtual {v7, v2, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->F:Z

    if-eqz v5, :cond_c

    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->I:Lio/sentry/f0;

    if-eqz v5, :cond_c

    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v5, :cond_c

    const-string v5, " full display"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v17, "ui.load.full_display"

    invoke-interface/range {v16 .. v21}, Lio/sentry/l1;->q(Ljava/lang/String;Ljava/lang/String;Lio/sentry/u4;Lio/sentry/s1;Leh/a;)Lio/sentry/l1;

    move-result-object v4

    move-object/from16 v12, v16

    :try_start_0
    invoke-virtual {v6, v2, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v5}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v5

    new-instance v6, Landroidx/lifecycle/m;

    invoke-direct {v6, v1, v4, v0}, Landroidx/lifecycle/m;-><init>(Lio/sentry/android/core/ActivityLifecycleIntegration;Lio/sentry/l1;Lio/sentry/l1;)V

    const-wide/16 v7, 0x61a8

    invoke-interface {v5, v6, v7, v8}, Lio/sentry/h1;->c(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->O:Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    iget-object v4, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?"

    invoke-interface {v4, v5, v6, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_b

    :cond_c
    move-object/from16 v12, v16

    :goto_b
    iget-object v0, v1, Lio/sentry/android/core/ActivityLifecycleIntegration;->y:Lio/sentry/i4;

    new-instance v4, Lbu/d;

    const/4 v5, 0x3

    invoke-direct {v4, v5, v1, v12}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lio/sentry/i4;->s(Lio/sentry/e4;)V

    invoke-virtual {v3, v2, v12}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    return-void
.end method
