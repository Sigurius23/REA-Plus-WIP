.class public final synthetic Landroidx/lifecycle/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Landroidx/lifecycle/z0;->w:I

    iput-object p1, p0, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 21

    move-object/from16 v1, p0

    iget v0, v1, Landroidx/lifecycle/z0;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lzt/b0;

    const-string v2, "FirebaseMessaging"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Service took too long to process intent: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v0, Lzt/b0;->a:Landroid/content/Intent;

    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " finishing."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, v0, Lzt/b0;->b:Lcq/i;

    invoke-virtual {v0, v3}, Lcq/i;->d(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/service/b;

    invoke-virtual {v0}, Lcom/whoop/realtime/service/b;->q()V

    return-void

    :pswitch_1
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lqi/d0;

    invoke-virtual {v0}, Lqi/d0;->c()V

    return-void

    :pswitch_2
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lqi/w;

    iget-object v2, v0, Lqi/w;->m0:Ljava/util/concurrent/Semaphore;

    iget-object v3, v0, Lqi/w;->O:Lzi/c;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->acquire()V

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0}, Ldj/e;->a()F

    move-result v0

    invoke-virtual {v3, v0}, Lzi/c;->p(F)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    throw v0

    :goto_0
    return-void

    :pswitch_3
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lmj/g;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lmj/g;->b:Landroidx/compose/ui/platform/ComposeView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v4, v2, Landroid/view/ViewGroup;

    if-eqz v4, :cond_1

    move-object v3, v2

    check-cast v3, Landroid/view/ViewGroup;

    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2
    return-void

    :pswitch_4
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lkj/d;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean v4, v0, Lkj/d;->b:Z

    return-void

    :pswitch_5
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "cpu_model"

    const-string v3, " "

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    const-string v7, "/system/bin/cat"

    const-string v8, "/proc/cpuinfo"

    filled-new-array {v7, v8}, [Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x400

    new-array v8, v8, [B

    :try_start_1
    new-instance v9, Ljava/lang/ProcessBuilder;

    invoke-direct {v9, v7}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v7

    :cond_3
    invoke-virtual {v7, v8}, Ljava/io/InputStream;->read([B)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_7

    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v8}, Ljava/lang/String;-><init>([B)V

    const-string v10, "\n"

    invoke-virtual {v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    array-length v10, v9

    move v11, v5

    :goto_1
    if-ge v11, v10, :cond_3

    aget-object v12, v9, v11

    const-string v13, ":"

    invoke-virtual {v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    array-length v13, v12

    if-le v13, v4, :cond_6

    aget-object v13, v12, v5

    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    const-string v14, "_"

    invoke-virtual {v13, v3, v14}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    const-string v14, "model_name"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    move-object v13, v2

    :cond_4
    aget-object v12, v12, v4

    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const-string v14, "\\s+"

    invoke-virtual {v12, v14, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    :cond_5
    invoke-virtual {v6, v13, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_7
    invoke-virtual {v7}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    iput-object v6, v0, Lio/seon/androidsdk/service/s0;->f:Ljava/util/HashMap;

    return-void

    :pswitch_6
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2
    iget-object v2, v0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    const-string v3, "clipboard"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ClipboardManager;

    iput-object v2, v0, Lio/seon/androidsdk/service/b0;->f:Landroid/content/ClipboardManager;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void

    :pswitch_7
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lio/seon/androidsdk/service/n;

    sget-object v2, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_3
    sget-object v2, Lio/seon/androidsdk/service/n;->m:Lio/seon/androidsdk/service/r0;

    iget-object v3, v2, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, v2, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v5, v7

    iget-wide v7, v2, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v5, v5, v7

    if-gez v5, :cond_8

    iget-wide v5, v2, Lio/seon/androidsdk/service/r0;->b:J

    const-wide/16 v7, -0x1

    cmp-long v5, v5, v7

    if-nez v5, :cond_9

    :cond_8
    invoke-virtual {v0}, Lio/seon/androidsdk/service/n;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v3, v2, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    :cond_9
    :try_start_5
    iget-object v0, v2, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    return-void

    :pswitch_8
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lio/sentry/cache/f;

    :try_start_6
    iget-object v0, v2, Lio/sentry/cache/f;->b:Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/cache/tape/f;

    invoke-virtual {v0}, Lio/sentry/cache/tape/f;->clear()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_2

    :catch_3
    move-exception v0

    iget-object v2, v2, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Failed to clear breadcrumbs from file queue"

    invoke-interface {v2, v3, v4, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void

    :pswitch_9
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/modules/a;

    invoke-virtual {v0}, Lio/sentry/internal/modules/d;->a()Ljava/util/Map;

    return-void

    :pswitch_a
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;->E:J

    return-void

    :pswitch_b
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    iget-object v2, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0, v2}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->h(Lio/sentry/android/core/SentryAndroidOptions;)V

    return-void

    :pswitch_c
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/h5;

    iget-object v2, v0, Lio/sentry/h5;->a:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    :goto_3
    const/16 v3, 0x28

    if-ge v5, v3, :cond_a

    :try_start_7
    iget-object v3, v0, Lio/sentry/h5;->c:Lb3/n;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v7, 0x16d

    invoke-virtual {v2, v3, v7, v8, v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v3

    invoke-interface {v3, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_a
    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->purge()V
    :try_end_7
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_7 .. :try_end_7} :catch_4

    :catch_4
    return-void

    :pswitch_d
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_5

    :cond_b
    array-length v2, v0

    :goto_4
    if-ge v5, v2, :cond_d

    aget-object v3, v0, v5

    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    sget-wide v8, Lio/sentry/o4;->f:J

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v10, 0x5

    invoke-virtual {v4, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v10

    sub-long/2addr v8, v10

    cmp-long v4, v6, v8

    if-gez v4, :cond_c

    invoke-static {v3}, Lge3/g;->r(Ljava/io/File;)Z

    :cond_c
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_d
    :goto_5
    return-void

    :pswitch_e
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_e

    invoke-interface {v0, v3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_e
    return-void

    :pswitch_f
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lh6/s;

    const-string v0, "fetchFonts result is not OK. ("

    iget-object v6, v3, Lh6/s;->d:Ljava/lang/Object;

    monitor-enter v6

    :try_start_8
    iget-object v4, v3, Lh6/s;->h:Lwb3/f;

    if-nez v4, :cond_f

    monitor-exit v6

    goto/16 :goto_c

    :catchall_3
    move-exception v0

    goto/16 :goto_e

    :cond_f
    monitor-exit v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    invoke-virtual {v3}, Lh6/s;->c()Lc5/i;

    move-result-object v4

    iget v6, v4, Lc5/i;->e:I

    if-ne v6, v2, :cond_10

    iget-object v2, v3, Lh6/s;->d:Ljava/lang/Object;

    monitor-enter v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :try_start_a
    monitor-exit v2

    goto :goto_6

    :catchall_4
    move-exception v0

    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :try_start_b
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :catchall_5
    move-exception v0

    goto/16 :goto_a

    :cond_10
    :goto_6
    if-nez v6, :cond_13

    :try_start_c
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    sget v2, Lb5/k;->a:I

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v0, v3, Lh6/s;->c:Lqt/e;

    iget-object v2, v3, Lh6/s;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v4}, [Lc5/i;

    move-result-object v0

    sget-object v6, Lv4/e;->a:Lts/o;

    const-string v6, "TypefaceCompat.createFromFontInfo"

    invoke-static {v6}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    :try_start_d
    sget-object v6, Lv4/e;->a:Lts/o;

    invoke-virtual {v6, v2, v0, v5}, Lts/o;->n(Landroid/content/Context;[Lc5/i;I)Landroid/graphics/Typeface;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    :try_start_e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object v2, v3, Lh6/s;->a:Landroid/content/Context;

    iget-object v4, v4, Lc5/i;->a:Landroid/net/Uri;

    invoke-static {v2, v4}, Lwb3/f;->O(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    move-result-object v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    if-eqz v2, :cond_12

    if-eqz v0, :cond_12

    :try_start_f
    const-string v4, "EmojiCompat.MetadataRepo.create"

    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    new-instance v4, Lzt/q;

    invoke-static {v2}, Ldt/b;->G(Ljava/nio/MappedByteBuffer;)Li6/b;

    move-result-object v2

    invoke-direct {v4, v0, v2}, Lzt/q;-><init>(Landroid/graphics/Typeface;Li6/b;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    :try_start_10
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    :try_start_11
    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object v2, v3, Lh6/s;->d:Ljava/lang/Object;

    monitor-enter v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    :try_start_12
    iget-object v0, v3, Lh6/s;->h:Lwb3/f;

    if-eqz v0, :cond_11

    invoke-virtual {v0, v4}, Lwb3/f;->T(Lzt/q;)V

    goto :goto_7

    :catchall_6
    move-exception v0

    goto :goto_8

    :cond_11
    :goto_7
    monitor-exit v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    :try_start_13
    invoke-virtual {v3}, Lh6/s;->b()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    goto :goto_c

    :goto_8
    :try_start_14
    monitor-exit v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    :try_start_15
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    :catchall_7
    move-exception v0

    :try_start_16
    sget v2, Lb5/k;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_12
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Unable to open file."

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_8
    move-exception v0

    goto :goto_9

    :catchall_9
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    :goto_9
    :try_start_17
    sget v2, Lb5/k;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_13
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    :goto_a
    iget-object v2, v3, Lh6/s;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_18
    iget-object v4, v3, Lh6/s;->h:Lwb3/f;

    if-eqz v4, :cond_14

    invoke-virtual {v4, v0}, Lwb3/f;->S(Ljava/lang/Throwable;)V

    goto :goto_b

    :catchall_a
    move-exception v0

    goto :goto_d

    :cond_14
    :goto_b
    monitor-exit v2
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    invoke-virtual {v3}, Lh6/s;->b()V

    :goto_c
    return-void

    :goto_d
    :try_start_19
    monitor-exit v2
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_a

    throw v0

    :goto_e
    :try_start_1a
    monitor-exit v6
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    throw v0

    :pswitch_10
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Ld2/d;

    invoke-virtual {v0}, Ld2/d;->e()Z

    move-result v3

    iget-object v6, v0, Ld2/d;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    if-nez v3, :cond_15

    goto/16 :goto_13

    :cond_15
    const-string v3, "ContentCapture:changeChecker"

    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1b
    invoke-virtual {v6, v4}, Landroidx/compose/ui/platform/AndroidComposeView;->w(Z)V

    iget-object v3, v0, Ld2/d;->L:La0/g0;

    iget-object v4, v3, La0/s;->b:[I

    iget-object v3, v3, La0/s;->a:[J

    array-length v7, v3

    sub-int/2addr v7, v2

    if-ltz v7, :cond_19

    move v2, v5

    :goto_f
    aget-wide v8, v3, v2

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_18

    sub-int v10, v2, v7

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    move v12, v5

    :goto_10
    if-ge v12, v10, :cond_17

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_16

    shl-int/lit8 v13, v2, 0x3

    add-int/2addr v13, v12

    aget v15, v4, v13

    invoke-virtual {v0}, Ld2/d;->d()La0/s;

    move-result-object v13

    invoke-virtual {v13, v15}, La0/s;->a(I)Z

    move-result v13

    if-nez v13, :cond_16

    iget-object v13, v0, Ld2/d;->z:Ljava/util/ArrayList;

    new-instance v14, Ld2/e;

    move-object/from16 v20, v6

    iget-wide v5, v0, Ld2/d;->K:J

    sget-object v18, Ld2/f;->x:Ld2/f;

    const/16 v19, 0x0

    move-wide/from16 v16, v5

    invoke-direct/range {v14 .. v19}, Ld2/e;-><init>(IJLd2/f;Lbu/c;)V

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v0, Ld2/d;->H:Ldc3/h;

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v5, v6}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_11

    :cond_16
    move-object/from16 v20, v6

    :goto_11
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v6, v20

    const/4 v5, 0x0

    goto :goto_10

    :cond_17
    move-object/from16 v20, v6

    if-ne v10, v11, :cond_1a

    goto :goto_12

    :cond_18
    move-object/from16 v20, v6

    :goto_12
    if-eq v2, v7, :cond_1a

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v6, v20

    const/4 v5, 0x0

    goto :goto_f

    :cond_19
    move-object/from16 v20, v6

    :cond_1a
    const-string v2, "ContentCapture:sendAppearEvents"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_b

    :try_start_1c
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v2

    invoke-virtual {v2}, Li3/r;->a()Li3/p;

    move-result-object v2

    iget-object v3, v0, Ld2/d;->M:Lb3/w2;

    invoke-virtual {v0, v2, v3}, Ld2/d;->g(Li3/p;Lb3/w2;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_c

    :try_start_1d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-virtual {v0}, Ld2/d;->d()La0/s;

    move-result-object v2

    invoke-virtual {v0, v2}, Ld2/d;->b(La0/s;)V

    invoke-virtual {v0}, Ld2/d;->o()V

    const/4 v2, 0x0

    iput-boolean v2, v0, Ld2/d;->N:Z
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_b

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :goto_13
    return-void

    :catchall_b
    move-exception v0

    goto :goto_14

    :catchall_c
    move-exception v0

    :try_start_1e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_b

    :goto_14
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :pswitch_11
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Lb3/h0;

    const-string v2, "measureAndLayout"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1f
    iget-object v2, v0, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2, v4}, Landroidx/compose/ui/platform/AndroidComposeView;->w(Z)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_e

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v2, "checkForSemanticsChanges"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_20
    invoke-virtual {v0}, Lb3/h0;->n()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_d

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const/4 v2, 0x0

    iput-boolean v2, v0, Lb3/h0;->L:Z

    return-void

    :catchall_d
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :catchall_e
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :pswitch_12
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    const/4 v2, 0x0

    iput-boolean v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->a1:Z

    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/16 v4, 0xa

    if-ne v3, v4, :cond_1b

    invoke-virtual {v0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->L(Landroid/view/MotionEvent;)I

    return-void

    :cond_1b
    const-string v0, "The ACTION_HOVER_EXIT event was not cleared."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_13
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/room/e1;

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->hasActiveObservers()Z

    move-result v5

    iget-object v6, v0, Landroidx/room/e1;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v7, 0x0

    invoke-virtual {v6, v7, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v4

    if-eqz v4, :cond_1c

    if-eqz v5, :cond_1c

    iget-object v4, v0, Landroidx/room/e1;->a:Landroidx/room/z0;

    invoke-virtual {v4}, Landroidx/room/z0;->getCoroutineScope()Lbc3/c0;

    move-result-object v4

    iget-object v5, v0, Landroidx/room/e1;->h:Lq83/j;

    new-instance v6, Landroidx/room/o1;

    invoke-direct {v6, v0, v3, v7}, Landroidx/room/o1;-><init>(Landroidx/room/e1;Lq83/d;I)V

    invoke-static {v4, v5, v3, v6, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1c
    return-void

    :pswitch_14
    iget-object v0, v1, Landroidx/lifecycle/z0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v2, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    iget v3, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->x:I

    if-nez v3, :cond_1d

    iput-boolean v4, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->y:Z

    sget-object v3, Landroidx/lifecycle/v;->ON_PAUSE:Landroidx/lifecycle/v;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    :cond_1d
    iget v3, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->w:I

    if-nez v3, :cond_1e

    iget-boolean v3, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->y:Z

    if-eqz v3, :cond_1e

    sget-object v3, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    iput-boolean v4, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->z:Z

    :cond_1e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
