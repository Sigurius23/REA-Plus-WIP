.class public final Lio/sentry/android/core/ScreenshotEventProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b0;


# instance fields
.field public final E:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final w:Lio/sentry/android/core/SentryAndroidOptions;

.field public final x:Lio/sentry/android/core/k0;

.field public final y:Lio/sentry/android/core/internal/util/g;

.field public final z:Z


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/k0;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v0, "SentryAndroidOptions is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->w:Lio/sentry/android/core/SentryAndroidOptions;

    iput-object p2, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->x:Lio/sentry/android/core/k0;

    new-instance p2, Lio/sentry/android/core/internal/util/g;

    const-wide/16 v0, 0x7d0

    const/4 v2, 0x3

    invoke-direct {p2, v0, v1, v2}, Lio/sentry/android/core/internal/util/g;-><init>(JI)V

    iput-object p2, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->y:Lio/sentry/android/core/internal/util/g;

    iput-boolean p3, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->z:Z

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Screenshot"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Lio/sentry/android/replay/viewhierarchy/g;
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->w:Lio/sentry/android/core/SentryAndroidOptions;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/g1;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lo73/a;->A(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;Li63/j;)Lio/sentry/android/replay/viewhierarchy/g;

    move-result-object v2

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/g1;

    move-result-object v3

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    invoke-static {p1, v2, v3, v4, v1}, La4/a;->G(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;Li63/j;Lio/sentry/v0;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v2

    :goto_1
    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to build view hierarchy"

    invoke-interface {v0, v2, v3, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final h(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;
    .locals 13

    invoke-virtual {p1}, Lio/sentry/e5;->g()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move-object v7, p0

    goto/16 :goto_c

    :cond_1
    iget-object v1, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->w:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_2

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "attachScreenshot is disabled."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p2, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1

    :cond_2
    iget-boolean v0, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->z:Z

    const/4 v3, 0x1

    if-nez v0, :cond_3

    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/g1;

    move-result-object v4

    iget-object v4, v4, Li63/j;->b:Ljava/io/Serializable;

    check-cast v4, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    iget-object p2, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v1, "Screenshot masking requires sentry-android-replay module"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p2, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1

    :cond_3
    sget-object v4, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    iget-object v4, v4, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v4, Ljava/lang/ref/WeakReference;

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Activity;

    move-object v9, v4

    goto :goto_1

    :cond_4
    move-object v9, v5

    :goto_1
    if-eqz v9, :cond_0

    invoke-static {p2}, Lhg3/i;->X(Lio/sentry/g0;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_0

    :cond_5
    iget-object v4, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->y:Lio/sentry/android/core/internal/util/g;

    invoke-virtual {v4}, Lio/sentry/android/core/internal/util/g;->a()Z

    move-result v4

    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->getBeforeScreenshotCaptureCallback()Lio/sentry/android/core/f1;

    if-eqz v4, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {v1}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    iget-object v6, p0, Lio/sentry/android/core/ScreenshotEventProcessor;->x:Lio/sentry/android/core/k0;

    invoke-static {v9, v4, v6}, Lug/m;->o(Landroid/app/Activity;Lio/sentry/v0;Lio/sentry/android/core/k0;)Landroid/graphics/Bitmap;

    move-result-object v4

    if-nez v4, :cond_7

    goto :goto_0

    :cond_7
    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/g1;

    move-result-object v6

    iget-object v6, v6, Li63/j;->b:Ljava/io/Serializable;

    check-cast v6, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_11

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0, v9}, Lio/sentry/android/core/ScreenshotEventProcessor;->a(Landroid/app/Activity;)Lio/sentry/android/replay/viewhierarchy/g;

    move-result-object v0

    move-object v7, p0

    goto :goto_4

    :cond_8
    new-instance v8, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v8, v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v10, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v10, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    :try_start_0
    new-instance v6, Lbv/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v11, 0x3

    move-object v7, p0

    :try_start_1
    invoke-direct/range {v6 .. v11}, Lbv/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v6}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v11, 0x7d0

    invoke-virtual {v10, v11, v12, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v6, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v8, "Timed out waiting for view hierarchy capture on main thread"

    new-array v10, v2, [Ljava/lang/Object;

    invoke-interface {v0, v6, v8, v10}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    move-object v0, v5

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_9
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/replay/viewhierarchy/g;

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v7, p0

    :goto_3
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    sget-object v8, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v10, "Failed to capture view hierarchy"

    invoke-interface {v6, v8, v10, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_4
    if-nez v0, :cond_a

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    return-object p1

    :cond_a
    :try_start_2
    new-instance v6, Lio/sentry/android/replay/util/c;

    invoke-direct {v6}, Lio/sentry/android/replay/util/c;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    :try_start_3
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v8

    if-nez v8, :cond_c

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v4, v8, v3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-nez v8, :cond_b

    :try_start_4
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    invoke-virtual {v6}, Lio/sentry/android/replay/util/c;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_a

    :catchall_2
    move-exception v0

    goto :goto_9

    :catchall_3
    move-exception v0

    move v3, v2

    :goto_5
    move-object v2, v0

    goto :goto_7

    :cond_b
    move v2, v3

    goto :goto_6

    :catchall_4
    move-exception v0

    move v3, v2

    move-object v8, v4

    goto :goto_5

    :cond_c
    move-object v8, v4

    :goto_6
    :try_start_6
    invoke-virtual {v6, v8, v0, v5}, Lio/sentry/android/replay/util/c;->b(Landroid/graphics/Bitmap;Lio/sentry/android/replay/viewhierarchy/g;Landroid/graphics/Matrix;)Ljava/util/List;

    if-eqz v2, :cond_d

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :cond_d
    :try_start_7
    invoke-virtual {v6}, Lio/sentry/android/replay/util/c;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    move-object v5, v8

    goto :goto_a

    :goto_7
    :try_start_8
    invoke-virtual {v6}, Lio/sentry/android/replay/util/c;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_8

    :catchall_5
    move-exception v0

    :try_start_9
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :catchall_6
    move-exception v0

    move v2, v3

    goto :goto_9

    :catchall_7
    move-exception v0

    move-object v8, v4

    :goto_9
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Failed to mask screenshot"

    invoke-interface {v1, v3, v6, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v2, :cond_e

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    :cond_e
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    :cond_f
    :goto_a
    if-nez v5, :cond_10

    goto :goto_c

    :cond_10
    move-object v4, v5

    goto :goto_b

    :cond_11
    move-object v7, p0

    :goto_b
    new-instance v0, Lcom/iterable/iterableapi/n1;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0, v4}, Lcom/iterable/iterableapi/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lio/sentry/a;->a(Lcom/iterable/iterableapi/n1;)Lio/sentry/a;

    move-result-object v0

    iput-object v0, p2, Lio/sentry/g0;->d:Lio/sentry/a;

    const-string v0, "android:activity"

    invoke-virtual {p2, v9, v0}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_c
    return-object p1
.end method

.method public final i(Lio/sentry/protocol/d0;Lio/sentry/g0;)Lio/sentry/protocol/d0;
    .locals 0

    return-object p1
.end method
