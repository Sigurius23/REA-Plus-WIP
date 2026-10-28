.class public final synthetic La8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La8/c;->w:I

    iput-object p2, p0, La8/c;->x:Ljava/lang/Object;

    iput-object p3, p0, La8/c;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/k2;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 2
    const/4 p1, 0x1

    iput p1, p0, La8/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La8/c;->x:Ljava/lang/Object;

    iput-object p3, p0, La8/c;->y:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 7

    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lhn/f;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/media/MediaCodec;

    iget-object v2, v0, Lhn/f;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-boolean v3, v0, Lhn/f;->l:Z

    if-eqz v3, :cond_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-wide v3, v0, Lhn/f;->k:J

    const-wide/16 v5, 0x1

    sub-long/2addr v3, v5

    iput-wide v3, v0, Lhn/f;->k:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_1

    monitor-exit v2

    return-void

    :cond_1
    if-gez v3, :cond_2

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    iget-object v3, v0, Lhn/f;->a:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object v1, v0, Lhn/f;->m:Ljava/lang/IllegalStateException;

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :cond_2
    invoke-virtual {v0}, Lhn/f;->b()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v1, :cond_3

    :try_start_5
    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_6
    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    iget-object v1, v0, Lhn/f;->a:Ljava/lang/Object;

    monitor-enter v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    iput-object v3, v0, Lhn/f;->m:Ljava/lang/IllegalStateException;

    monitor-exit v1

    goto :goto_0

    :catchall_2
    move-exception v0

    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    throw v0

    :catch_1
    move-exception v1

    iget-object v3, v0, Lhn/f;->a:Ljava/lang/Object;

    monitor-enter v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    iput-object v1, v0, Lhn/f;->m:Ljava/lang/IllegalStateException;

    monitor-exit v3

    goto :goto_0

    :catchall_3
    move-exception v0

    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    throw v0

    :cond_3
    :goto_0
    monitor-exit v2

    return-void

    :goto_1
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 13

    iget v0, p0, La8/c;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lio/sentry/android/core/FeedbackShakeIntegration;

    iget-object v0, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    iget-boolean v5, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    if-nez v5, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iput-boolean v2, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    iget-object v2, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v2}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object v2

    iget-object v2, v2, Lio/sentry/i5;->h:Ljava/lang/Runnable;

    iput-object v2, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

    iget-object v5, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v5}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object v5

    new-instance v6, Lio/sentry/android/core/r0;

    invoke-direct {v6, v3, v4, v2}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v6, v5, Lio/sentry/i5;->h:Ljava/lang/Runnable;

    new-instance v2, Lio/sentry/android/core/o1;

    invoke-direct {v2, v0}, Lio/sentry/android/core/o1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lio/sentry/android/core/o1;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-boolean v3, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    iget-object v2, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v2}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object v2

    iget-object v3, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

    iput-object v3, v2, Lio/sentry/i5;->h:Ljava/lang/Runnable;

    iput-object v1, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

    iget-object v1, v4, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to show feedback dialog on shake."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/AnrIntegration;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v2, v0, Lio/sentry/android/core/AnrIntegration;->y:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_1
    iget-boolean v3, v0, Lio/sentry/android/core/AnrIntegration;->x:Z

    if-nez v3, :cond_2

    invoke-virtual {v0, v1}, Lio/sentry/android/core/AnrIntegration;->b(Lio/sentry/android/core/SentryAndroidOptions;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {v2}, Lio/sentry/s;->close()V

    return-void

    :goto_2
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1

    :pswitch_1
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/h4;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/h1;

    invoke-virtual {v0}, Lio/sentry/h4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getShutdownTimeoutMillis()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Lio/sentry/h1;->a(J)V

    return-void

    :pswitch_2
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->s(Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lc93/a;)V

    return-void

    :pswitch_3
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->a(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;Lio/getstream/chat/android/models/Message;)V

    return-void

    :pswitch_4
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/a;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmj/p;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lmj/p;->a()V

    :cond_3
    return-void

    :pswitch_5
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Callable;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lhm/d;

    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lhm/d;->r(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    invoke-virtual {v1, v0}, Lhm/d;->s(Ljava/lang/Exception;)V

    :goto_4
    return-void

    :pswitch_6
    invoke-direct {p0}, La8/c;->a()V

    return-void

    :pswitch_7
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lew/f;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/e0;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$chunksSent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lew/f;->E:Ldw/f;

    iget v1, v1, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v0, v1}, Ldw/f;->b(I)V

    return-void

    :pswitch_8
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/media3/ui/PlayerView;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Landroidx/media3/ui/PlayerView;->a(Landroidx/media3/ui/PlayerView;Landroid/graphics/Bitmap;)V

    return-void

    :pswitch_9
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lro/i;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Ld9/j;

    iget-object v0, v0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ld9/a0;

    iget-object v0, v0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v2, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    if-eqz v2, :cond_4

    new-instance v3, Ld9/h;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v1, v4}, Ld9/h;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_4
    return-void

    :pswitch_a
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lb9/g;

    monitor-enter v1

    monitor-exit v1

    iget-object v0, v0, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v0, Lb9/c0;

    sget v1, Lx8/t;->a:I

    iget-object v0, v0, Lb9/c0;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->T:Lc9/h;

    iget-object v1, v0, Lc9/h;->z:La30/w0;

    iget-object v1, v1, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    invoke-virtual {v0, v1}, Lc9/h;->h(Ll9/c0;)Lc9/a;

    move-result-object v1

    new-instance v2, Lc9/d;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lc9/d;-><init>(I)V

    const/16 v3, 0x3f5

    invoke-virtual {v0, v1, v3, v2}, Lc9/h;->l(Lc9/a;ILx8/f;)V

    return-void

    :pswitch_b
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Ld2/d;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/util/LongSparseArray;

    invoke-static {v0, v1}, Ld2/b;->e(Ld2/d;Landroid/util/LongSparseArray;)V

    return-void

    :pswitch_c
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lcq0/e;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/remote/commons/ApiSuccessResponse;

    invoke-static {v0, v1}, Lcq0/e;->f(Lcq0/e;Lcom/whoop/data/remote/commons/ApiSuccessResponse;)V

    return-void

    :pswitch_d
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedList;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/maps/renderer/RendererSetupErrorListener;

    invoke-static {v0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->b(Ljava/util/LinkedList;Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V

    return-void

    :pswitch_e
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/maps/renderer/RendererError;

    invoke-static {v0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->a(Ljava/util/HashSet;Lcom/mapbox/maps/renderer/RendererError;)V

    return-void

    :pswitch_f
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/MovementModeObserver;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/common/MovementInfo;

    invoke-static {v0, v1}, Lcom/mapbox/common/movement/AndroidMovementMonitor;->a(Lcom/mapbox/common/MovementModeObserver;Lcom/mapbox/common/MovementInfo;)V

    return-void

    :pswitch_10
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/common/BatteryMonitorObserver;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/bindgen/Expected;

    invoke-static {v0, v1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor;->a(Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V

    return-void

    :pswitch_11
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/common/LifecycleState;

    invoke-static {v0, v1}, Lcom/mapbox/common/LifecycleMonitorAndroid;->b(Ljava/util/Map$Entry;Lcom/mapbox/common/LifecycleState;)V

    return-void

    :pswitch_12
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/k;

    iget-object v4, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    iget-object v5, v5, Lcom/iterable/iterableapi/w;->h:Lcom/iterable/iterableapi/g0;

    iget-object v5, v0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    if-eqz v5, :cond_5

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_a

    :cond_5
    iget-object v5, v0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    if-nez v5, :cond_6

    iget-object v5, v0, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    if-nez v5, :cond_6

    if-nez v4, :cond_6

    goto/16 :goto_a

    :cond_6
    iget-object v5, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->i()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v5

    if-eqz v5, :cond_8

    new-instance v6, Lcom/iterable/iterableapi/x1;

    iget-object v7, v0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    iget-object v8, v0, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    iget-object v9, v0, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    iget-object v5, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    iget-object v5, v5, Lcom/iterable/iterableapi/w;->a:Ljava/lang/String;

    if-eqz v5, :cond_7

    :goto_5
    move-object v10, v5

    goto :goto_6

    :cond_7
    iget-object v5, v0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :goto_6
    const/4 v11, 0x2

    invoke-direct/range {v6 .. v11}, Lcom/iterable/iterableapi/x1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v5, Lcom/iterable/iterableapi/y1;

    invoke-direct {v5}, Landroid/os/AsyncTask;-><init>()V

    filled-new-array {v6}, [Lcom/iterable/iterableapi/x1;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_8
    iget-object v5, v0, Lcom/iterable/iterableapi/k;->l:Lcom/iterable/iterableapi/d1;

    if-eqz v5, :cond_a

    invoke-static {}, Ldt/b;->F()V

    iget-object v6, v5, Lcom/iterable/iterableapi/d1;->y:La3/p;

    invoke-virtual {v6}, La3/p;->z()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/iterable/iterableapi/j1;

    invoke-virtual {v6, v8}, La3/p;->K(Lcom/iterable/iterableapi/j1;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v5}, Lcom/iterable/iterableapi/d1;->e()V

    :cond_a
    iget-object v5, v0, Lcom/iterable/iterableapi/k;->m:Lcom/iterable/iterableapi/c0;

    if-eqz v5, :cond_b

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_b
    iget-object v5, v0, Lcom/iterable/iterableapi/k;->n:Lcom/iterable/iterableapi/s;

    if-eqz v5, :cond_c

    iget-object v6, v5, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    if-eqz v6, :cond_c

    invoke-virtual {v6}, Ljava/util/Timer;->cancel()V

    iput-object v1, v5, Lcom/iterable/iterableapi/s;->y:Ljava/util/Timer;

    iput-boolean v3, v5, Lcom/iterable/iterableapi/s;->E:Z

    :cond_c
    iget-object v5, v0, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v5}, Lcom/google/crypto/tink/internal/l0;->T()Lcom/iterable/iterableapi/l2;

    move-result-object v6

    iget-object v5, v5, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v5, Laj/c;

    invoke-interface {v6}, Lcom/iterable/iterableapi/l2;->a()V

    const-string v6, "IterableApi"

    const-string v7, "Resetting authToken"

    invoke-static {v6, v7}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, v5, Laj/c;->x:Ljava/lang/Object;

    check-cast v5, Lcom/iterable/iterableapi/k;

    iput-object v1, v5, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    iput-object v4, v0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    iput-object v1, v0, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    iget-object v5, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v4, :cond_e

    iget-object v4, v0, Lcom/iterable/iterableapi/k;->k:Lcom/iterable/iterableapi/i;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v0, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;

    const-string v1, "itbl_consent_logged"

    iget-object v4, v0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-nez v4, :cond_d

    goto :goto_8

    :cond_d
    const-string v5, "com.iterable.iterableapi"

    invoke-virtual {v4, v5, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    :cond_e
    :goto_8
    iget-object v1, v0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-nez v1, :cond_f

    goto :goto_9

    :cond_f
    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->g()Lcom/iterable/iterableapi/o1;

    move-result-object v1

    if-eqz v1, :cond_10

    iget-object v4, v0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    const-string v5, "iterable-email"

    invoke-virtual {v1, v5, v4}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    const-string v5, "iterable-user-id"

    invoke-virtual {v1, v5, v4}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;

    const-string v5, "iterable-unknown-user-id"

    invoke-virtual {v1, v5, v4}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, v0, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    const-string v5, "iterable-auth-token"

    invoke-virtual {v1, v5, v4}, Lcom/iterable/iterableapi/o1;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_10
    const-string v1, "IterableApi"

    const-string v4, "Shared preference creation failed. "

    invoke-static {v1, v4}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_9
    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->i()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-virtual {v0, v3}, Lcom/iterable/iterableapi/k;->l(Z)V

    goto :goto_a

    :cond_11
    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->c()Lcom/iterable/iterableapi/s;

    move-result-object v1

    monitor-enter v1

    :try_start_4
    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0, v2}, Lcom/iterable/iterableapi/k;->l(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    monitor-exit v1

    :goto_a
    return-void

    :catchall_3
    move-exception v0

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    throw v0

    :goto_b
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    throw v0

    :catchall_4
    move-exception v0

    goto :goto_b

    :pswitch_13
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lc9/l;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/media/metrics/PlaybackStateEvent;

    invoke-static {v0, v1}, Lc9/l;->e(Lc9/l;Landroid/media/metrics/PlaybackStateEvent;)V

    return-void

    :pswitch_14
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lc9/l;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/media/metrics/PlaybackMetrics;

    invoke-static {v0, v1}, Lc9/l;->b(Lc9/l;Landroid/media/metrics/PlaybackMetrics;)V

    return-void

    :pswitch_15
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lc9/l;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/media/metrics/PlaybackErrorEvent;

    invoke-static {v0, v1}, Lc9/l;->a(Lc9/l;Landroid/media/metrics/PlaybackErrorEvent;)V

    return-void

    :pswitch_16
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lc9/l;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/media/metrics/NetworkEvent;

    invoke-static {v0, v1}, Lc9/l;->c(Lc9/l;Landroid/media/metrics/NetworkEvent;)V

    return-void

    :pswitch_17
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lc9/l;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/media/metrics/TrackChangeEvent;

    invoke-static {v0, v1}, Lc9/l;->d(Lc9/l;Landroid/media/metrics/TrackChangeEvent;)V

    return-void

    :pswitch_18
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Lc8/a;

    iget-object v4, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v4, Lc8/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_9
    iget-object v0, v0, Lc8/a;->f:Landroid/content/Context;

    const-string v5, "PermissionTokenManager.healthdata"

    invoke-virtual {v0, v5, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "token"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_12

    const-string v0, ""

    goto :goto_c

    :catch_1
    move-exception v0

    goto :goto_d

    :cond_12
    :goto_c
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_1

    :try_start_a
    const-string v5, "androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback"

    invoke-virtual {v3, v5}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, v4, Lc8/c;->f:Landroid/os/IBinder;

    invoke-interface {v0, v2, v3, v1, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :try_start_b
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    goto :goto_e

    :catchall_5
    move-exception v0

    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v0
    :try_end_b
    .catch Landroid/os/RemoteException; {:try_start_b .. :try_end_b} :catch_1

    :goto_d
    const-string v1, "a"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "HealthDataSdkService#getPermissionToken failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_e
    return-void

    :pswitch_19
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lb9/f0;

    iget-object v0, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v0, Lab/y;

    iget v1, v4, Lb9/f0;->j0:I

    iget v5, v0, Lab/y;->b:I

    sub-int/2addr v1, v5

    iput v1, v4, Lb9/f0;->j0:I

    iget-boolean v5, v0, Lab/y;->d:Z

    if-eqz v5, :cond_13

    iget v5, v0, Lab/y;->f:I

    iput v5, v4, Lb9/f0;->k0:I

    iput-boolean v2, v4, Lb9/f0;->l0:Z

    :cond_13
    if-nez v1, :cond_1d

    iget-object v1, v0, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, Lb9/c1;

    iget-object v1, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v5, v4, Lb9/f0;->I0:Lb9/c1;

    iget-object v5, v5, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v5}, Lu8/o0;->p()Z

    move-result v5

    if-nez v5, :cond_14

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v5

    if-eqz v5, :cond_14

    const/4 v5, -0x1

    iput v5, v4, Lb9/f0;->J0:I

    const-wide/16 v5, 0x0

    iput-wide v5, v4, Lb9/f0;->K0:J

    :cond_14
    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v5

    if-nez v5, :cond_16

    move-object v5, v1

    check-cast v5, Lb9/h1;

    iget-object v5, v5, Lb9/h1;->h:[Lu8/o0;

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    iget-object v7, v4, Lb9/f0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v6, v7, :cond_15

    move v6, v2

    goto :goto_f

    :cond_15
    move v6, v3

    :goto_f
    invoke-static {v6}, Lva3/g;->i(Z)V

    move v6, v3

    :goto_10
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_16

    iget-object v7, v4, Lb9/f0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb9/e0;

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu8/o0;

    iput-object v8, v7, Lb9/e0;->b:Lu8/o0;

    add-int/lit8 v6, v6, 0x1

    goto :goto_10

    :cond_16
    iget-boolean v5, v4, Lb9/f0;->l0:Z

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v5, :cond_1c

    iget-object v5, v0, Lab/y;->e:Ljava/lang/Object;

    check-cast v5, Lb9/c1;

    iget-object v5, v5, Lb9/c1;->b:Ll9/c0;

    iget-object v8, v4, Lb9/f0;->I0:Lb9/c1;

    iget-object v8, v8, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v5, v8}, Ll9/c0;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    iget-object v5, v0, Lab/y;->e:Ljava/lang/Object;

    check-cast v5, Lb9/c1;

    iget-wide v8, v5, Lb9/c1;->d:J

    iget-object v5, v4, Lb9/f0;->I0:Lb9/c1;

    iget-wide v10, v5, Lb9/c1;->s:J

    cmp-long v5, v8, v10

    if-eqz v5, :cond_17

    goto :goto_11

    :cond_17
    move v2, v3

    :cond_18
    :goto_11
    if-eqz v2, :cond_1b

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v5

    if-nez v5, :cond_1a

    iget-object v5, v0, Lab/y;->e:Ljava/lang/Object;

    check-cast v5, Lb9/c1;

    iget-object v5, v5, Lb9/c1;->b:Ll9/c0;

    invoke-virtual {v5}, Ll9/c0;->b()Z

    move-result v5

    if-eqz v5, :cond_19

    goto :goto_12

    :cond_19
    iget-object v5, v0, Lab/y;->e:Ljava/lang/Object;

    check-cast v5, Lb9/c1;

    iget-object v6, v5, Lb9/c1;->b:Ll9/c0;

    iget-wide v7, v5, Lb9/c1;->d:J

    iget-object v5, v6, Ll9/c0;->a:Ljava/lang/Object;

    iget-object v6, v4, Lb9/f0;->P:Lu8/m0;

    invoke-virtual {v1, v5, v6}, Lu8/o0;->g(Ljava/lang/Object;Lu8/m0;)Lu8/m0;

    iget-wide v5, v6, Lu8/m0;->e:J

    add-long/2addr v7, v5

    move-wide v6, v7

    goto :goto_13

    :cond_1a
    :goto_12
    iget-object v1, v0, Lab/y;->e:Ljava/lang/Object;

    check-cast v1, Lb9/c1;

    iget-wide v5, v1, Lb9/c1;->d:J

    move-wide v6, v5

    :cond_1b
    :goto_13
    move-wide v9, v6

    move v7, v2

    goto :goto_14

    :cond_1c
    move-wide v9, v6

    move v7, v3

    :goto_14
    iput-boolean v3, v4, Lb9/f0;->l0:Z

    iget-object v0, v0, Lab/y;->e:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lb9/c1;

    iget v8, v4, Lb9/f0;->k0:I

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v4 .. v12}, Lb9/f0;->J0(Lb9/c1;IZIJIZ)V

    :cond_1d
    return-void

    :pswitch_1a
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/view/ViewGroup;

    const-string v2, "$container"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/fragment/app/q;->c:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1e
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/r;

    iget-object v2, v2, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-object v3, v2, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    invoke-virtual {v3}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1e

    iget v2, v2, Landroidx/fragment/app/p2;->a:I

    invoke-static {v2, v3, v1}, Lr;->a(ILandroid/view/View;Landroid/view/ViewGroup;)V

    goto :goto_15

    :cond_1f
    return-void

    :pswitch_1b
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Rect;

    invoke-static {v0, v1}, Landroidx/fragment/app/k2;->j(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void

    :pswitch_1c
    iget-object v0, p0, La8/c;->x:Ljava/lang/Object;

    check-cast v0, La8/d;

    iget-object v1, p0, La8/c;->y:Ljava/lang/Object;

    check-cast v1, Lds/w;

    iget-object v2, v0, La8/d;->a:Ljava/util/HashSet;

    monitor-enter v2

    :try_start_c
    iget-object v0, v0, La8/d;->a:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    monitor-exit v2

    return-void

    :catchall_6
    move-exception v0

    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
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
