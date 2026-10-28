.class public final Lio/sentry/android/replay/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Lio/sentry/android/replay/g;


# instance fields
.field public final E:Ljava/util/concurrent/ScheduledExecutorService;

.field public final F:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final G:Ljava/util/ArrayList;

.field public final H:Landroid/graphics/Point;

.field public final I:Ljava/util/WeakHashMap;

.field public final J:Lio/sentry/util/a;

.field public final K:Lio/sentry/util/a;

.field public final L:Lio/sentry/util/a;

.field public volatile M:Lio/sentry/android/replay/b0;

.field public volatile N:Landroid/os/HandlerThread;

.field public volatile O:Landroid/os/Handler;

.field public final w:Lio/sentry/q6;

.field public final x:Lio/sentry/android/replay/ReplayIntegration;

.field public final y:Lio/sentry/android/replay/ReplayIntegration;

.field public final z:Laj/c;


# direct methods
.method public constructor <init>(Lio/sentry/q6;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/android/replay/ReplayIntegration;Laj/c;Lio/sentry/android/replay/util/d;)V
    .locals 1

    const-string v0, "mainLooperHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replayExecutor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/e0;->w:Lio/sentry/q6;

    iput-object p2, p0, Lio/sentry/android/replay/e0;->x:Lio/sentry/android/replay/ReplayIntegration;

    iput-object p3, p0, Lio/sentry/android/replay/e0;->y:Lio/sentry/android/replay/ReplayIntegration;

    iput-object p4, p0, Lio/sentry/android/replay/e0;->z:Laj/c;

    iput-object p5, p0, Lio/sentry/android/replay/e0;->E:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/replay/e0;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/e0;->G:Ljava/util/ArrayList;

    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/e0;->H:Landroid/graphics/Point;

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/e0;->I:Ljava/util/WeakHashMap;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/e0;->J:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/e0;->K:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/e0;->L:Lio/sentry/util/a;

    return-void
.end method


# virtual methods
.method public final J()V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v3, v0, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    if-eqz v3, :cond_2

    iget-object v4, v3, Lio/sentry/android/replay/v;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v4, v3, Lio/sentry/android/replay/v;->x:Ljava/lang/ref/WeakReference;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    invoke-virtual {v3, v4}, Lio/sentry/android/replay/v;->c(Landroid/view/View;)V

    iget-object v4, v3, Lio/sentry/android/replay/v;->x:Ljava/lang/ref/WeakReference;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->clear()V

    :cond_1
    iget-object v3, v3, Lio/sentry/android/replay/v;->E:Lio/sentry/android/replay/screenshot/i;

    invoke-interface {v3}, Lio/sentry/android/replay/screenshot/i;->close()V

    :cond_2
    iput-object v2, v0, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    iget-object v0, v0, Lio/sentry/android/replay/b0;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    :cond_3
    iget-object v0, p0, Lio/sentry/android/replay/e0;->K:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iput-object v2, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lio/sentry/android/replay/e0;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final b(Landroid/view/View;Z)V
    .locals 4

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/sentry/android/replay/e0;->J:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    :try_start_0
    invoke-static {p1}, Lvd/e;->D(Landroid/view/View;)Landroid/view/Window;

    move-result-object p2

    if-nez p2, :cond_0

    iget-object p1, p0, Lio/sentry/android/replay/e0;->w:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "Root view does not have a phone window, skipping."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {p1, p2, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    :try_start_1
    iget-object p2, p0, Lio/sentry/android/replay/e0;->G:Ljava/util/ArrayList;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-eqz p2, :cond_1

    iget-object p2, p2, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    if-eqz p2, :cond_1

    invoke-virtual {p2, p1}, Lio/sentry/android/replay/v;->a(Landroid/view/View;)V

    :cond_1
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/e0;->h(Landroid/view/View;)V

    iget-object p2, p0, Lio/sentry/android/replay/e0;->I:Ljava/util/WeakHashMap;

    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_1

    :cond_2
    new-instance v2, Ldb/k;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Ldb/k;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lio/sentry/android/replay/e0;->I:Ljava/util/WeakHashMap;

    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View$OnLayoutChangeListener;

    if-eqz p2, :cond_4

    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_4
    iget-object p2, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-eqz p2, :cond_5

    iget-object p2, p2, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    if-eqz p2, :cond_5

    invoke-virtual {p2, p1}, Lio/sentry/android/replay/v;->c(Landroid/view/View;)V

    :cond_5
    iget-object p2, p0, Lio/sentry/android/replay/e0;->G:Ljava/util/ArrayList;

    new-instance v2, Lio/sentry/android/replay/d0;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lio/sentry/android/replay/d0;-><init>(Landroid/view/View;I)V

    invoke-static {p2, v2}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p0, Lio/sentry/android/replay/e0;->G:Ljava/util/ArrayList;

    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    goto :goto_0

    :cond_6
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_9

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-eqz p1, :cond_7

    iget-object p1, p1, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    if-eqz p1, :cond_7

    invoke-virtual {p1, p2}, Lio/sentry/android/replay/v;->a(Landroid/view/View;)V

    :cond_7
    invoke-virtual {p0, p2}, Lio/sentry/android/replay/e0;->h(Landroid/view/View;)V

    iget-object p1, p0, Lio/sentry/android/replay/e0;->I:Ljava/util/WeakHashMap;

    invoke-virtual {p1, p2}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_1

    :cond_8
    new-instance v2, Ldb/k;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Ldb/k;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_9
    :goto_1
    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final close()V
    .locals 3

    invoke-virtual {p0}, Lio/sentry/android/replay/e0;->reset()V

    iget-object v0, p0, Lio/sentry/android/replay/e0;->z:Laj/c;

    iget-object v1, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :goto_0
    iget-object v0, p0, Lio/sentry/android/replay/e0;->L:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/e0;->O:Landroid/os/Handler;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v1, p0, Lio/sentry/android/replay/e0;->N:Landroid/os/HandlerThread;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quitSafely()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-static {v0, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lio/sentry/android/replay/e0;->J()V

    return-void

    :goto_2
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final h(Landroid/view/View;)V
    .locals 3

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Lio/sentry/android/replay/e0;->H:Landroid/graphics/Point;

    iget v2, v1, Landroid/graphics/Point;->x:I

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v2, v1, Landroid/graphics/Point;->y:I

    if-eq v0, v2, :cond_3

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Point;->set(II)V

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget-object v1, p0, Lio/sentry/android/replay/e0;->y:Lio/sentry/android/replay/ReplayIntegration;

    invoke-virtual {v1, v0, p1}, Lio/sentry/android/replay/ReplayIntegration;->o0(II)V

    return-void

    :cond_1
    new-instance v0, Lio/sentry/android/replay/c0;

    invoke-direct {v0, p0, p1}, Lio/sentry/android/replay/c0;-><init>(Lio/sentry/android/replay/e0;Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    :goto_0
    return-void
.end method

.method public final i()Landroid/os/Handler;
    .locals 3

    iget-object v0, p0, Lio/sentry/android/replay/e0;->O:Landroid/os/Handler;

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/sentry/android/replay/e0;->L:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/e0;->O:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "SentryReplayBackgroundProcessing"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lio/sentry/android/replay/e0;->N:Landroid/os/HandlerThread;

    iget-object v1, p0, Lio/sentry/android/replay/e0;->N:Landroid/os/HandlerThread;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    new-instance v1, Landroid/os/Handler;

    iget-object v2, p0, Lio/sentry/android/replay/e0;->N:Landroid/os/HandlerThread;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lio/sentry/android/replay/e0;->O:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2

    :cond_2
    :goto_2
    iget-object v0, p0, Lio/sentry/android/replay/e0;->O:Landroid/os/Handler;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final k(Lio/sentry/android/replay/w;)V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/e0;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/sentry/android/replay/e0;->K:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v2, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-nez v2, :cond_1

    new-instance v2, Lio/sentry/android/replay/b0;

    iget-object v3, p0, Lio/sentry/android/replay/e0;->w:Lio/sentry/q6;

    iget-object v4, p0, Lio/sentry/android/replay/e0;->z:Laj/c;

    invoke-direct {v2, v3, v4}, Lio/sentry/android/replay/b0;-><init>(Lio/sentry/q6;Laj/c;)V

    iput-object v2, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    :goto_2
    iget-object v0, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    iput-object p1, v0, Lio/sentry/android/replay/b0;->z:Lio/sentry/android/replay/w;

    :goto_3
    iget-object v0, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    new-instance v2, Lio/sentry/android/replay/v;

    iget-object v3, p0, Lio/sentry/android/replay/e0;->w:Lio/sentry/q6;

    iget-object v4, p0, Lio/sentry/android/replay/e0;->x:Lio/sentry/android/replay/ReplayIntegration;

    invoke-direct {v2, v3, v4, p1, p0}, Lio/sentry/android/replay/v;-><init>(Lio/sentry/q6;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/android/replay/w;Lio/sentry/android/replay/e0;)V

    iput-object v2, v0, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    :goto_4
    iget-object p1, p0, Lio/sentry/android/replay/e0;->G:Ljava/util/ArrayList;

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/view/View;

    :cond_5
    if-eqz v1, :cond_6

    iget-object p1, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-eqz p1, :cond_6

    iget-object p1, p1, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    if-eqz p1, :cond_6

    invoke-virtual {p1, v1}, Lio/sentry/android/replay/v;->a(Landroid/view/View;)V

    :cond_6
    iget-object p1, p0, Lio/sentry/android/replay/e0;->z:Laj/c;

    iget-object v0, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    iget-object p1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    if-nez v0, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :goto_5
    iget-object p1, p0, Lio/sentry/android/replay/e0;->z:Laj/c;

    iget-object v0, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    iget-object p1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    const/4 v1, 0x0

    if-nez v0, :cond_8

    move p1, v1

    goto :goto_6

    :cond_8
    const-wide/16 v2, 0x64

    invoke-virtual {p1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    :goto_6
    if-nez p1, :cond_9

    iget-object p1, p0, Lio/sentry/android/replay/e0;->w:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "Failed to post the capture runnable, main looper is shutting down."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_9
    :goto_7
    return-void
.end method

.method public final m()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-eqz v0, :cond_2

    iget-object v1, v0, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v3, v1, Lio/sentry/android/replay/v;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v3, v1, Lio/sentry/android/replay/v;->x:Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1, v3}, Lio/sentry/android/replay/v;->c(Landroid/view/View;)V

    :cond_1
    iget-object v0, v0, Lio/sentry/android/replay/b0;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    :cond_2
    return-void
.end method

.method public final reset()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/e0;->H:Landroid/graphics/Point;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/Point;->set(II)V

    iget-object v0, p0, Lio/sentry/android/replay/e0;->J:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/e0;->G:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_0

    iget-object v3, p0, Lio/sentry/android/replay/e0;->I:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View$OnLayoutChangeListener;

    if-eqz v3, :cond_1

    invoke-virtual {v2, v3}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_1
    iget-object v3, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-eqz v3, :cond_0

    iget-object v3, v3, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v2}, Lio/sentry/android/replay/v;->c(Landroid/view/View;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lio/sentry/android/replay/e0;->G:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final s()V
    .locals 8

    iget-object v0, p0, Lio/sentry/android/replay/e0;->M:Lio/sentry/android/replay/b0;

    if-eqz v0, :cond_3

    iget-object v1, v0, Lio/sentry/android/replay/b0;->x:Laj/c;

    iget-object v2, v0, Lio/sentry/android/replay/b0;->w:Lio/sentry/q6;

    invoke-virtual {v2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v3

    iget-boolean v3, v3, Lio/sentry/u6;->n:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v5, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v6, "Resuming the capture runnable."

    new-array v7, v4, [Ljava/lang/Object;

    invoke-interface {v3, v5, v6, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v3, v0, Lio/sentry/android/replay/b0;->y:Lio/sentry/android/replay/v;

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    iget-object v6, v3, Lio/sentry/android/replay/v;->x:Ljava/lang/ref/WeakReference;

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    if-eqz v6, :cond_1

    invoke-static {v6, v3}, La4/a;->a(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_1
    iget-object v3, v3, Lio/sentry/android/replay/v;->y:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_2
    iget-object v3, v0, Lio/sentry/android/replay/b0;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    iget-object v3, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v3, Landroid/os/Handler;

    invoke-virtual {v3, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "Failed to post the capture runnable, main looper is not ready."

    new-array v3, v4, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public final x()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/e0;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    return-void
.end method
