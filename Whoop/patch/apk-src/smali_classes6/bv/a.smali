.class public final synthetic Lbv/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;Lbv/c;Ljava/util/Date;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lbv/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbv/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lbv/a;->y:Ljava/lang/Object;

    iput-object p3, p0, Lbv/a;->z:Ljava/lang/Object;

    iput-object p4, p0, Lbv/a;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Lbv/a;->w:I

    iput-object p1, p0, Lbv/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lbv/a;->z:Ljava/lang/Object;

    iput-object p3, p0, Lbv/a;->y:Ljava/lang/Object;

    iput-object p4, p0, Lbv/a;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget v0, p0, Lbv/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbv/a;->x:Ljava/lang/Object;

    check-cast v0, Lsn/z;

    iget-object v1, p0, Lbv/a;->z:Ljava/lang/Object;

    check-cast v1, Lsn/a0;

    iget-object v2, p0, Lbv/a;->y:Ljava/lang/Object;

    check-cast v2, Lsn/v;

    iget-object v3, p0, Lbv/a;->E:Ljava/lang/Object;

    check-cast v3, Ll9/y;

    iget v0, v0, Lsn/z;->a:I

    invoke-interface {v1, v0, v2, v3}, Lsn/a0;->G(ILsn/v;Ll9/y;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lbv/a;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/ScreenshotEventProcessor;

    iget-object v1, p0, Lbv/a;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lbv/a;->y:Ljava/lang/Object;

    check-cast v2, Landroid/app/Activity;

    iget-object v3, p0, Lbv/a;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-virtual {v0, v2}, Lio/sentry/android/core/ScreenshotEventProcessor;->a(Landroid/app/Activity;)Lio/sentry/android/replay/viewhierarchy/g;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lbv/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/AudioTrack;

    iget-object v1, p0, Lbv/a;->z:Ljava/lang/Object;

    check-cast v1, Lro/i;

    iget-object v2, p0, Lbv/a;->y:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    iget-object v3, p0, Lbv/a;->E:Ljava/lang/Object;

    check-cast v3, Ld9/j;

    const/4 v4, 0x0

    :try_start_1
    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, La8/c;

    const/16 v5, 0x13

    invoke-direct {v0, v5, v1, v3}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    sget-object v5, Ld9/x;->j0:Ljava/lang/Object;

    monitor-enter v5

    :try_start_2
    sget v0, Ld9/x;->l0:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Ld9/x;->l0:I

    if-nez v0, :cond_1

    sget-object v0, Ld9/x;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v4, Ld9/x;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v5

    return-void

    :goto_1
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :catchall_2
    move-exception v0

    if-eqz v1, :cond_2

    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-virtual {v5}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Thread;->isAlive()Z

    move-result v5

    if-eqz v5, :cond_2

    new-instance v5, La8/c;

    const/16 v6, 0x13

    invoke-direct {v5, v6, v1, v3}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    sget-object v1, Ld9/x;->j0:Ljava/lang/Object;

    monitor-enter v1

    :try_start_3
    sget v2, Ld9/x;->l0:I

    add-int/lit8 v2, v2, -0x1

    sput v2, Ld9/x;->l0:I

    if-nez v2, :cond_3

    sget-object v2, Ld9/x;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    sput-object v4, Ld9/x;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_2

    :catchall_3
    move-exception v0

    goto :goto_3

    :cond_3
    :goto_2
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    throw v0

    :goto_3
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v0

    :pswitch_2
    iget-object v0, p0, Lbv/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    iget-object v1, p0, Lbv/a;->y:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-object v1, p0, Lbv/a;->z:Ljava/lang/Object;

    check-cast v1, Lbv/c;

    iget-object v2, p0, Lbv/a;->E:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Ljava/util/Date;

    const-string v2, "$style"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/mapbox/maps/MapboxStyleManager;->getMapLoadingErrorDelegate()Lcom/mapbox/maps/MapLoadingErrorDelegate;

    move-result-object v0

    new-instance v2, Lcom/mapbox/maps/MapLoadingError;

    sget-object v3, Lcom/mapbox/maps/MapLoadingErrorType;->SOURCE:Lcom/mapbox/maps/MapLoadingErrorType;

    iget-object v5, v1, Lav/e;->a:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/mapbox/maps/MapLoadingError;-><init>(Lcom/mapbox/maps/MapLoadingErrorType;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/Date;)V

    invoke-interface {v0, v2}, Lcom/mapbox/maps/MapLoadingErrorDelegate;->sendMapLoadingError(Lcom/mapbox/maps/MapLoadingError;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lbv/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/mapbox/maps/MapboxStyleManager;

    iget-object v0, p0, Lbv/a;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbv/c;

    iget-object v0, p0, Lbv/a;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lbv/a;->E:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/GeoJSONSourceData;

    const-string v4, "$style"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "$dataId"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    :try_start_5
    iget-object v5, v2, Lav/e;->a:Ljava/lang/String;

    invoke-virtual {v1, v5, v3, v0}, Lcom/mapbox/maps/MapboxStyleManager;->setStyleGeoJSONSourceData(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-object v5, v4

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object v5, v0

    move-object v0, v4

    :goto_4
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_4

    goto :goto_5

    :cond_4
    if-eqz v5, :cond_8

    :goto_5
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    const-string v7, "dataId"

    invoke-virtual {v6, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "message"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "setStyleGeoJSONSourceData error: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_5

    goto :goto_6

    :cond_5
    move-object v4, v0

    goto :goto_7

    :cond_6
    :goto_6
    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    :cond_7
    :goto_7
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "JSONObject().apply {\n   \u2026\")\n          }.toString()"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    const-string v4, "GeoJsonSource"

    invoke-static {v4, v0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v2, Lbv/c;->h:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Handler;

    new-instance v5, Lbv/a;

    invoke-direct {v5, v1, v0, v2, v3}, Lbv/a;-><init>(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;Lbv/c;Ljava/util/Date;)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_8
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
