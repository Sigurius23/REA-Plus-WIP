.class public final synthetic Lio/sentry/android/core/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lio/sentry/q6;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/d1;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lio/sentry/android/core/c1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/c1;->x:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/core/c1;->z:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/c1;->y:Lio/sentry/q6;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lio/sentry/q6;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lio/sentry/android/core/c1;->w:I

    iput-object p1, p0, Lio/sentry/android/core/c1;->x:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/core/c1;->y:Lio/sentry/q6;

    iput-object p3, p0, Lio/sentry/android/core/c1;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget v0, p0, Lio/sentry/android/core/c1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/c1;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    iget-object v1, p0, Lio/sentry/android/core/c1;->z:Ljava/lang/Object;

    check-cast v1, Lio/sentry/d1;

    iget-object v2, p0, Lio/sentry/android/core/c1;->y:Lio/sentry/q6;

    check-cast v2, Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v3, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->K:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v3

    :try_start_0
    iget-boolean v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->F:Z

    if-nez v4, :cond_4

    iget-boolean v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->G:Z

    if-nez v4, :cond_4

    iget-object v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->x:Lio/sentry/android/core/s1;

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance v4, Lio/sentry/android/core/s1;

    invoke-direct {v4, v0, v1, v2}, Lio/sentry/android/core/s1;-><init>(Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;Lio/sentry/d1;Lio/sentry/android/core/SentryAndroidOptions;)V

    iput-object v4, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->x:Lio/sentry/android/core/s1;

    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->H:Landroid/content/IntentFilter;

    const/4 v4, 0x0

    if-nez v1, :cond_1

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    iput-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->H:Landroid/content/IntentFilter;

    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->E:[Ljava/lang/String;

    array-length v5, v1

    move v6, v4

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v1, v6

    iget-object v8, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->H:Landroid/content/IntentFilter;

    invoke-virtual {v8, v7}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto :goto_3

    :cond_1
    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->I:Landroid/os/HandlerThread;

    if-nez v1, :cond_2

    new-instance v1, Landroid/os/HandlerThread;

    const-string v5, "SystemEventsReceiver"

    const/16 v6, 0xa

    invoke-direct {v1, v5, v6}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->I:Landroid/os/HandlerThread;

    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->I:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    new-instance v9, Landroid/os/Handler;

    iget-object v1, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->I:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v9, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v5, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->w:Landroid/content/Context;

    iget-object v6, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->x:Lio/sentry/android/core/s1;

    iget-object v7, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->H:Landroid/content/IntentFilter;

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    const-string v8, "The ILogger object is required."

    invoke-static {v1, v8}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x21

    if-lt v1, v8, :cond_3

    const/4 v8, 0x0

    const/4 v10, 0x4

    invoke-virtual/range {v5 .. v10}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {v5, v6, v7, v1, v9}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    :goto_1
    iget-object v0, v0, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;->J:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "SystemEventsBreadcrumbsIntegration installed."

    new-array v6, v4, [Ljava/lang/Object;

    invoke-interface {v0, v1, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "SystemEventsBreadcrumbs"

    invoke-static {v0}, Ljc/x;->i(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-virtual {v2, v4}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Failed to initialize SystemEventsBreadcrumbsIntegration."

    invoke-interface {v1, v2, v4, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    :goto_2
    invoke-virtual {v3}, Lio/sentry/s;->close()V

    return-void

    :goto_3
    :try_start_3
    invoke-virtual {v3}, Lio/sentry/s;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/c1;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;

    iget-object v1, p0, Lio/sentry/android/core/c1;->y:Lio/sentry/q6;

    iget-object v2, p0, Lio/sentry/android/core/c1;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->z:Lio/sentry/util/a;

    invoke-virtual {v3}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v3

    :try_start_4
    iget-boolean v4, v0, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->y:Z

    if-nez v4, :cond_5

    invoke-virtual {v0, v1, v2}, Lio/sentry/android/core/EnvelopeFileObserverIntegration;->b(Lio/sentry/q6;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object v1, v0

    goto :goto_6

    :cond_5
    :goto_5
    invoke-virtual {v3}, Lio/sentry/s;->close()V

    return-void

    :goto_6
    :try_start_5
    invoke-virtual {v3}, Lio/sentry/s;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v1

    :pswitch_1
    iget-object v0, p0, Lio/sentry/android/core/c1;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    iget-object v1, p0, Lio/sentry/android/core/c1;->y:Lio/sentry/q6;

    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v2, p0, Lio/sentry/android/core/c1;->z:Ljava/lang/Object;

    check-cast v2, Lio/sentry/d1;

    :try_start_6
    iget-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "SendCachedEnvelopeIntegration, not trying to send after closing."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_9

    :catchall_5
    move-exception v0

    goto :goto_8

    :cond_6
    iget-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {v1}, Lio/sentry/q6;->getConnectionStatusProvider()Lio/sentry/p0;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->z:Lio/sentry/p0;

    invoke-interface {v3, v0}, Lio/sentry/p0;->K0(Lio/sentry/o0;)Z

    iget-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->w:Lio/sentry/l4;

    invoke-interface {v3, v2, v1}, Lio/sentry/l4;->t(Lio/sentry/d1;Lio/sentry/q6;)Lio/sentry/k4;

    move-result-object v3

    iput-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->G:Lio/sentry/k4;

    :cond_7
    iget-object v3, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->z:Lio/sentry/p0;

    if-eqz v3, :cond_8

    invoke-interface {v3}, Lio/sentry/p0;->l()Lio/sentry/n0;

    move-result-object v3

    sget-object v5, Lio/sentry/n0;->DISCONNECTED:Lio/sentry/n0;

    if-ne v3, v5, :cond_8

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "SendCachedEnvelopeIntegration, no connection."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_9

    :cond_8
    invoke-interface {v2}, Lio/sentry/d1;->j()Lio/sentry/transport/q;

    move-result-object v2

    if-eqz v2, :cond_9

    sget-object v3, Lio/sentry/m;->All:Lio/sentry/m;

    invoke-virtual {v2, v3}, Lio/sentry/transport/q;->h(Lio/sentry/m;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "SendCachedEnvelopeIntegration, rate limiting active."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_9

    :cond_9
    iget-object v0, v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;->G:Lio/sentry/k4;

    if-nez v0, :cond_a

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "SendCachedEnvelopeIntegration factory is null."

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_9

    :cond_a
    invoke-virtual {v0}, Lio/sentry/k4;->a()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_9

    :goto_8
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed trying to send cached events."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_9
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
