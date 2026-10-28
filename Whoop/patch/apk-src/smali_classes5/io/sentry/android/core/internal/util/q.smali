.class public final Lio/sentry/android/core/internal/util/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static final O:J

.field public static final P:J

.field public static final synthetic Q:I


# instance fields
.field public E:Ljava/lang/ref/WeakReference;

.field public final F:Ljava/util/concurrent/ConcurrentHashMap;

.field public final G:Z

.field public final H:Lio/sentry/android/core/internal/util/d;

.field public final I:Lio/sentry/android/core/internal/util/n;

.field public J:Landroid/view/Choreographer;

.field public final K:Ljava/lang/reflect/Field;

.field public L:J

.field public M:J

.field public final N:Ljava/util/concurrent/ConcurrentSkipListSet;

.field public final w:Lio/sentry/android/core/k0;

.field public final x:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final y:Lio/sentry/v0;

.field public final z:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lio/sentry/android/core/internal/util/q;->O:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2bc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lio/sentry/android/core/internal/util/q;->P:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/t;Lio/sentry/android/core/k0;)V
    .locals 3

    new-instance v0, Lio/sentry/android/core/internal/util/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/internal/util/q;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/internal/util/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lio/sentry/android/core/internal/util/q;->G:Z

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lio/sentry/android/core/internal/util/q;->L:J

    iput-wide v1, p0, Lio/sentry/android/core/internal/util/q;->M:J

    new-instance v1, Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/internal/util/q;->N:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object p1, v1

    :cond_0
    const-string v1, "Logger is required"

    invoke-static {p2, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lio/sentry/android/core/internal/util/q;->y:Lio/sentry/v0;

    const-string v1, "BuildInfoProvider is required"

    invoke-static {p3, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lio/sentry/android/core/internal/util/q;->w:Lio/sentry/android/core/k0;

    iput-object v0, p0, Lio/sentry/android/core/internal/util/q;->H:Lio/sentry/android/core/internal/util/d;

    instance-of v0, p1, Landroid/app/Application;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/sentry/android/core/internal/util/q;->G:Z

    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "io.sentry.android.core.internal.util.SentryFrameMetricsCollector"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    new-instance v2, Lio/sentry/android/core/internal/util/m;

    invoke-direct {v2, p2}, Lio/sentry/android/core/internal/util/m;-><init>(Lio/sentry/v0;)V

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    new-instance v2, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Lio/sentry/android/core/internal/util/q;->z:Landroid/os/Handler;

    check-cast p1, Landroid/app/Application;

    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Landroidx/lifecycle/m;

    const/16 v2, 0xc

    invoke-direct {v1, v2, p0, p2}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    const-class p1, Landroid/view/Choreographer;

    const-string v1, "mLastFrameTimeNanos"

    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/core/internal/util/q;->K:Ljava/lang/reflect/Field;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Unable to get the frame timestamp from the choreographer: "

    invoke-virtual {p2, v0, v1, p1}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance p1, Lio/sentry/android/core/internal/util/n;

    invoke-direct {p1, p0, p3}, Lio/sentry/android/core/internal/util/n;-><init>(Lio/sentry/android/core/internal/util/q;Lio/sentry/android/core/k0;)V

    iput-object p1, p0, Lio/sentry/android/core/internal/util/q;->I:Lio/sentry/android/core/internal/util/n;

    return-void
.end method

.method public static a(Lio/sentry/android/core/internal/util/q;Lio/sentry/android/core/k0;Landroid/view/Window;Landroid/view/FrameMetrics;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    iget-object v2, v0, Lio/sentry/android/core/internal/util/q;->N:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    if-lt v5, v6, :cond_0

    invoke-virtual/range {p2 .. p2}, Landroid/view/Window;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getDisplay()Landroid/view/Display;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Display;->getRefreshRate()F

    move-result v5

    :goto_0
    move/from16 v17, v5

    goto :goto_1

    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v5

    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Display;->getRefreshRate()F

    move-result v5

    goto :goto_0

    :goto_1
    sget-wide v5, Lio/sentry/android/core/internal/util/q;->O:J

    long-to-float v5, v5

    div-float v6, v5, v17

    float-to-long v6, v6

    const/4 v8, 0x0

    invoke-virtual {v1, v8}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v9

    const/4 v11, 0x1

    invoke-virtual {v1, v11}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v12

    add-long/2addr v12, v9

    const/4 v9, 0x2

    invoke-virtual {v1, v9}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v9

    add-long/2addr v9, v12

    const/4 v12, 0x3

    invoke-virtual {v1, v12}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v12

    add-long/2addr v12, v9

    const/4 v9, 0x4

    invoke-virtual {v1, v9}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v9

    add-long/2addr v9, v12

    const/4 v12, 0x5

    invoke-virtual {v1, v12}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v12

    add-long/2addr v12, v9

    sub-long v6, v12, v6

    const-wide/16 v9, 0x0

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iget-object v14, v0, Lio/sentry/android/core/internal/util/q;->w:Lio/sentry/android/core/k0;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v14, 0xa

    invoke-virtual {v1, v14}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v14

    cmp-long v1, v14, v9

    if-gez v1, :cond_1

    sub-long v14, v3, v12

    :cond_1
    iget-wide v3, v0, Lio/sentry/android/core/internal/util/q;->M:J

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    iget-wide v14, v0, Lio/sentry/android/core/internal/util/q;->L:J

    cmp-long v1, v3, v14

    if-nez v1, :cond_2

    goto/16 :goto_5

    :cond_2
    iput-wide v3, v0, Lio/sentry/android/core/internal/util/q;->L:J

    add-long v14, v3, v12

    iput-wide v14, v0, Lio/sentry/android/core/internal/util/q;->M:J

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v1, v17, v1

    div-float/2addr v5, v1

    move-wide/from16 v18, v9

    float-to-long v8, v5

    cmp-long v1, v12, v8

    move-wide v8, v14

    if-lez v1, :cond_3

    move v15, v11

    goto :goto_2

    :cond_3
    const/4 v15, 0x0

    :goto_2
    if-eqz v15, :cond_4

    sget-wide v20, Lio/sentry/android/core/internal/util/q;->P:J

    cmp-long v1, v12, v20

    if-lez v1, :cond_4

    move/from16 v16, v11

    goto :goto_3

    :cond_4
    const/16 v16, 0x0

    :goto_3
    cmp-long v1, v6, v18

    if-lez v1, :cond_5

    const-wide v10, 0x45d964b800L

    sub-long/2addr v8, v10

    new-instance v1, Lio/sentry/android/core/internal/util/o;

    invoke-direct {v1, v8, v9, v8, v9}, Lio/sentry/android/core/internal/util/o;-><init>(JJ)V

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->headSet(Ljava/lang/Object;)Ljava/util/NavigableSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentSkipListSet;->size()I

    move-result v1

    const/16 v5, 0xe10

    if-ge v1, v5, :cond_5

    new-instance v1, Lio/sentry/android/core/internal/util/o;

    iget-wide v8, v0, Lio/sentry/android/core/internal/util/q;->M:J

    invoke-direct {v1, v3, v4, v8, v9}, Lio/sentry/android/core/internal/util/o;-><init>(JJ)V

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v1, v0, Lio/sentry/android/core/internal/util/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/android/core/internal/util/p;

    iget-wide v9, v0, Lio/sentry/android/core/internal/util/q;->M:J

    move-wide v11, v12

    move-wide v13, v6

    move-object v6, v2

    move-wide v7, v3

    invoke-interface/range {v6 .. v17}, Lio/sentry/android/core/internal/util/p;->c(JJJJZZF)V

    move-wide v6, v13

    move-wide v12, v11

    goto :goto_4

    :cond_6
    :goto_5
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 3

    iget-boolean v0, p0, Lio/sentry/android/core/internal/util/q;->G:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/internal/util/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    if-eqz p1, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Lio/sentry/android/core/internal/util/q;->E:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/Window;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lio/sentry/android/core/internal/util/l;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lio/sentry/android/core/internal/util/l;-><init>(Lio/sentry/android/core/internal/util/q;Landroid/view/Window;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/internal/util/q;->E:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Window;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    iget-boolean v1, p0, Lio/sentry/android/core/internal/util/q;->G:Z

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lio/sentry/android/core/internal/util/q;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lio/sentry/android/core/internal/util/q;->z:Landroid/os/Handler;

    if-eqz v1, :cond_3

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lio/sentry/android/core/internal/util/l;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lio/sentry/android/core/internal/util/l;-><init>(Lio/sentry/android/core/internal/util/q;Landroid/view/Window;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    iget-object v0, p0, Lio/sentry/android/core/internal/util/q;->E:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/android/core/internal/util/q;->E:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lio/sentry/android/core/internal/util/q;->c()V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 4

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v2, Lio/sentry/android/core/internal/util/l;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v0, v3}, Lio/sentry/android/core/internal/util/l;-><init>(Lio/sentry/android/core/internal/util/q;Landroid/view/Window;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lio/sentry/android/core/internal/util/q;->E:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/sentry/android/core/internal/util/q;->E:Ljava/lang/ref/WeakReference;

    :cond_0
    return-void
.end method
