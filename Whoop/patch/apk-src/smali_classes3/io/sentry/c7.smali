.class public final synthetic Lio/sentry/c7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/a;Li7/g;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    iput p2, p0, Lio/sentry/c7;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/c7;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/core/e0;Lio/sentry/android/core/d0;)V
    .locals 0

    .line 2
    const/4 p1, 0x5

    iput p1, p0, Lio/sentry/c7;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/sentry/c7;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p2, p0, Lio/sentry/c7;->w:I

    iput-object p1, p0, Lio/sentry/c7;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lko/c;IJJ)V
    .locals 0

    .line 4
    const/16 p2, 0x17

    iput p2, p0, Lio/sentry/c7;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/c7;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 30

    move-object/from16 v1, p0

    iget v0, v1, Lio/sentry/c7;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/videoview/textureview/HMSTextureRenderer;

    invoke-static {v0}, Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;->b(Llive/hms/videoview/textureview/HMSTextureRenderer;)V

    return-void

    :pswitch_0
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-static {v0}, Llive/hms/video/media/capturers/camera/CameraControl;->b(Llive/hms/video/media/capturers/camera/CameraControl;)V

    return-void

    :pswitch_1
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->a(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    return-void

    :pswitch_2
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    invoke-static {v0}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->d(Llive/hms/video/audio/manager/HMSAudioManagerApi31;)V

    return-void

    :pswitch_3
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/audio/HMSAudioManagerLegacy;

    invoke-static {v0}, Llive/hms/video/audio/HMSAudioManagerLegacy;->a(Llive/hms/video/audio/HMSAudioManagerLegacy;)V

    return-void

    :pswitch_4
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TimePicker;

    invoke-static {v0}, Ll41/d;->a(Landroid/widget/TimePicker;)V

    return-void

    :pswitch_5
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lko/c;

    iget-object v0, v0, Lko/c;->b:Lsm/d;

    iget-object v2, v0, Lsm/d;->z:La30/w0;

    iget-object v3, v2, La30/w0;->y:Ljava/lang/Object;

    check-cast v3, Lzr/g0;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, v2, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Lzr/g0;

    invoke-static {v2}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsn/v;

    :goto_0
    invoke-virtual {v0, v2}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object v2

    new-instance v3, Lsm/c;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Lsm/c;-><init>(I)V

    const/16 v4, 0x3ee

    invoke-virtual {v0, v2, v4, v3}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_6
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lkj/e;

    iget v2, v0, Lkj/e;->b:I

    const/4 v3, 0x4

    if-lt v2, v3, :cond_1

    if-lt v2, v3, :cond_1

    iget-object v3, v0, Lkj/e;->a:Lhj/q;

    if-eqz v3, :cond_1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lhj/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v0}, Lkj/e;->a()V

    return-void

    :pswitch_7
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lkj/d;

    iget-object v0, v0, Lkj/d;->a:Lhj/g;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lhj/g;->invoke()Ljava/lang/Object;

    :cond_2
    return-void

    :pswitch_8
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/videoview/common/VideoTrackManager;

    invoke-static {v0}, Llive/hms/videoview/common/VideoTrackManager;->b(Llive/hms/videoview/common/VideoTrackManager;)V

    return-void

    :pswitch_9
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lk1/e;

    invoke-static {v0}, Lk1/e;->a(Lk1/e;)V

    return-void

    :pswitch_a
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Ljo/s;

    invoke-virtual {v0}, Ljo/s;->n()V

    return-void

    :pswitch_b
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Ljo/e;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljo/e;->d(Z)V

    return-void

    :pswitch_c
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Ljj/b;

    iget-object v0, v0, Ljj/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->h:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmj/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lhj/u;->w:Lhj/u;

    invoke-virtual {v2}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    new-instance v3, Lio/sentry/android/core/r0;

    const/16 v4, 0x13

    invoke-direct {v3, v4, v0, v2}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_1
    return-void

    :pswitch_d
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Ljj/b;

    iget-object v0, v0, Ljj/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->h:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmj/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lhj/u;->w:Lhj/u;

    invoke-virtual {v2}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Landroidx/lifecycle/z0;

    const/16 v4, 0x11

    invoke-direct {v3, v0, v4}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_4
    return-void

    :pswitch_e
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/k0;

    iget-object v2, v0, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    check-cast v2, Lio/sentry/h5;

    iget-object v0, v0, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getShutdownTimeoutMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lio/sentry/h5;->a(J)V

    return-void

    :pswitch_f
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, La30/w0;

    iget-object v2, v0, La30/w0;->E:Ljava/lang/Object;

    check-cast v2, Lio/sentry/h5;

    iget-object v0, v0, La30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getShutdownTimeoutMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lio/sentry/h5;->a(J)V

    return-void

    :pswitch_10
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/screenshot/h;

    iget-object v2, v0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    monitor-enter v2

    :try_start_0
    iget-object v3, v0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, v0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_5
    :goto_2
    monitor-exit v2

    goto :goto_4

    :goto_3
    monitor-exit v2

    throw v0

    :cond_6
    :goto_4
    iget-object v0, v0, Lio/sentry/android/replay/screenshot/h;->j:Lio/sentry/android/replay/util/c;

    invoke-virtual {v0}, Lio/sentry/android/replay/util/c;->close()V

    return-void

    :pswitch_11
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/t;

    iget-object v2, v0, Lio/sentry/android/replay/t;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_5

    :cond_7
    new-instance v2, La0/a1;

    const/16 v3, 0x1d

    invoke-direct {v2, v0, v3}, La0/a1;-><init>(Ljava/lang/Object;I)V

    :try_start_1
    sget-object v0, Lio/sentry/android/replay/a0;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    sget-object v3, Lio/sentry/android/replay/a0;->c:Ljava/lang/Object;

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    if-eqz v3, :cond_8

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type java.util.ArrayList<android.view.View>{ kotlin.collections.TypeAliasesKt.ArrayList<android.view.View> }"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    const-string v2, "WindowManagerSpy"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_8
    :goto_5
    return-void

    :pswitch_12
    const-string v0, ""

    iget-object v2, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/replay/ReplayIntegration;

    const-string v3, "options"

    iget-object v4, v2, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v4, :cond_29

    invoke-virtual {v4}, Lio/sentry/q6;->findPersistingScopeObserver()Lio/sentry/cache/f;

    move-result-object v4

    if-eqz v4, :cond_28

    iget-object v6, v2, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v6, :cond_27

    const-string v7, "replay.json"

    const-class v8, Ljava/lang/String;

    invoke-virtual {v4, v6, v7, v8}, Lio/sentry/cache/f;->d(Lio/sentry/q6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_9

    goto/16 :goto_1c

    :cond_9
    new-instance v12, Lio/sentry/protocol/v;

    invoke-direct {v12, v6}, Lio/sentry/protocol/v;-><init>(Ljava/lang/String;)V

    sget-object v7, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {v12, v7}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v2, v0}, Lio/sentry/android/replay/ReplayIntegration;->T(Ljava/lang/String;)V

    goto/16 :goto_1d

    :cond_a
    iget-object v7, v2, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v7, :cond_26

    invoke-virtual {v7}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_c

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_b

    goto :goto_6

    :cond_b
    new-instance v8, Ljava/io/File;

    invoke-virtual {v7}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v13, "replay_"

    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v8, v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    goto :goto_7

    :cond_c
    :goto_6
    invoke-virtual {v7}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v8

    sget-object v10, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v11, "SentryOptions.cacheDirPath is not set, session replay is no-op"

    new-array v13, v9, [Ljava/lang/Object;

    invoke-interface {v8, v10, v11, v13}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v8, 0x0

    :goto_7
    new-instance v10, Ljava/io/File;

    const-string v11, ".ongoing_segment"

    invoke-direct {v10, v8, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v11

    if-nez v11, :cond_d

    invoke-virtual {v7}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v9, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v10, "No ongoing segment found for replay: %s"

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v7, v9, v10, v11}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v8}, Lge3/g;->r(Ljava/io/File;)Z

    move-object/from16 v19, v3

    const/4 v5, 0x0

    const/16 v17, 0x0

    goto/16 :goto_19

    :cond_d
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v13, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v14, Ljava/io/InputStreamReader;

    new-instance v15, Ljava/io/FileInputStream;

    invoke-direct {v15, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v14, v15, v13}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v10, Ljava/io/BufferedReader;

    const/16 v13, 0x2000

    invoke-direct {v10, v14, v13}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    :try_start_2
    new-instance v13, Lb3/d3;

    const/4 v14, 0x2

    invoke-direct {v13, v10, v14}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    new-instance v14, Lxb3/a;

    invoke-direct {v14, v13}, Lxb3/a;-><init>(Lxb3/i;)V

    invoke-virtual {v14}, Lxb3/a;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_e

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    const-string v16, "="

    const/16 v17, 0x0

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v5

    const/4 v15, 0x2

    invoke-static {v14, v5, v15}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    const/4 v15, 0x1

    invoke-interface {v5, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v11, v14, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v2, v0

    goto/16 :goto_1b

    :cond_e
    const/16 v17, 0x0

    invoke-interface {v10}, Ljava/io/Closeable;->close()V

    const-string v5, "config.height"

    invoke-virtual {v11, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_f

    invoke-static {v5}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_9

    :cond_f
    move-object/from16 v5, v17

    :goto_9
    const-string v10, "config.width"

    invoke-virtual {v11, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_10

    invoke-static {v10}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_a

    :cond_10
    move-object/from16 v10, v17

    :goto_a
    const-string v13, "config.frame-rate"

    invoke-virtual {v11, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    if-eqz v13, :cond_11

    invoke-static {v13}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v13

    goto :goto_b

    :cond_11
    move-object/from16 v13, v17

    :goto_b
    const-string v14, "config.bit-rate"

    invoke-virtual {v11, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    if-eqz v14, :cond_12

    invoke-static {v14}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v14

    goto :goto_c

    :cond_12
    move-object/from16 v14, v17

    :goto_c
    const-string v15, "segment.id"

    invoke-virtual {v11, v15}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    if-eqz v15, :cond_13

    invoke-static {v15}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v15

    goto :goto_d

    :cond_13
    move-object/from16 v15, v17

    :goto_d
    :try_start_3
    const-string v9, "segment.timestamp"

    invoke-virtual {v11, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_14

    move-object v9, v0

    :cond_14
    invoke-static {v9}, Ljc/x;->Q(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_e
    move-object/from16 v19, v3

    goto :goto_f

    :catchall_3
    move-object/from16 v9, v17

    goto :goto_e

    :goto_f
    :try_start_4
    const-string v3, "replay.type"

    invoke-virtual {v11, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_15

    move-object v3, v0

    :cond_15
    invoke-static {v3}, Lio/sentry/r6;->valueOf(Ljava/lang/String;)Lio/sentry/r6;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_10

    :catchall_4
    move-object/from16 v3, v17

    :goto_10
    if-eqz v5, :cond_1f

    if-eqz v10, :cond_1f

    if-eqz v13, :cond_1f

    if-eqz v14, :cond_1f

    if-eqz v15, :cond_1f

    move-object/from16 v20, v5

    const/4 v5, -0x1

    move-object/from16 v21, v8

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-eq v8, v5, :cond_20

    if-eqz v9, :cond_20

    if-nez v3, :cond_16

    goto/16 :goto_18

    :cond_16
    new-instance v22, Lio/sentry/android/replay/w;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v23

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v24

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v27

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v28

    const/high16 v25, 0x3f800000    # 1.0f

    const/high16 v26, 0x3f800000    # 1.0f

    invoke-direct/range {v22 .. v28}, Lio/sentry/android/replay/w;-><init>(IIFFII)V

    new-instance v5, Lio/sentry/android/replay/k;

    invoke-direct {v5, v7, v12}, Lio/sentry/android/replay/k;-><init>(Lio/sentry/q6;Lio/sentry/protocol/v;)V

    iget-object v8, v5, Lio/sentry/android/replay/k;->I:Ljava/util/ArrayList;

    invoke-virtual {v5}, Lio/sentry/android/replay/k;->i()Ljava/io/File;

    move-result-object v10

    if-eqz v10, :cond_17

    new-instance v14, Lio/sentry/android/replay/h;

    invoke-direct {v14, v5}, Lio/sentry/android/replay/h;-><init>(Lio/sentry/android/replay/k;)V

    invoke-virtual {v10, v14}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    :cond_17
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-virtual {v7}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v5, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v7, "No frames found for replay: %s, deleting the replay"

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v3, v5, v7, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static/range {v21 .. v21}, Lge3/g;->r(Ljava/io/File;)Z

    :goto_11
    move-object/from16 v5, v17

    goto/16 :goto_19

    :cond_18
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v14, 0x1

    if-le v10, v14, :cond_19

    new-instance v10, Lb2/d;

    const/16 v14, 0xf

    invoke-direct {v10, v14}, Lb2/d;-><init>(I)V

    invoke-static {v8, v10}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_19
    sget-object v10, Lio/sentry/r6;->SESSION:Lio/sentry/r6;

    if-ne v3, v10, :cond_1a

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v14

    move/from16 v24, v14

    goto :goto_12

    :cond_1a
    const/16 v24, 0x0

    :goto_12
    if-ne v3, v10, :cond_1b

    :goto_13
    move-object/from16 v23, v9

    goto :goto_14

    :cond_1b
    invoke-static {v8}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/sentry/android/replay/l;

    iget-wide v9, v9, Lio/sentry/android/replay/l;->b:J

    invoke-static {v9, v10}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_13

    :goto_14
    invoke-static {v8}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/sentry/android/replay/l;

    iget-wide v8, v8, Lio/sentry/android/replay/l;->b:J

    invoke-virtual/range {v23 .. v23}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    sub-long/2addr v8, v14

    const/16 v10, 0x3e8

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    div-int/2addr v10, v13

    int-to-long v13, v10

    add-long v25, v8, v13

    const-string v8, "replay.recording"

    invoke-virtual {v11, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_1e

    new-instance v9, Ljava/io/StringReader;

    invoke-direct {v9, v8}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v7

    const-class v8, Lio/sentry/x3;

    invoke-interface {v7, v9, v8}, Lio/sentry/j1;->e(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/x3;

    if-eqz v7, :cond_1c

    iget-object v8, v7, Lio/sentry/x3;->x:Ljava/util/List;

    goto :goto_15

    :cond_1c
    move-object/from16 v8, v17

    :goto_15
    if-eqz v8, :cond_1d

    new-instance v8, Ljava/util/LinkedList;

    iget-object v7, v7, Lio/sentry/x3;->x:Ljava/util/List;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v7, Ljava/util/Collection;

    invoke-direct {v8, v7}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    goto :goto_16

    :cond_1d
    move-object/from16 v8, v17

    :goto_16
    if-eqz v8, :cond_1e

    goto :goto_17

    :cond_1e
    sget-object v8, Lm83/y;->w:Lm83/y;

    :goto_17
    new-instance v20, Lio/sentry/android/replay/f;

    const-string v7, "replay.screen-at-start"

    invoke-virtual {v11, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v28, v7

    check-cast v28, Ljava/lang/String;

    check-cast v8, Ljava/lang/Iterable;

    new-instance v7, Lb2/d;

    const/16 v9, 0x10

    invoke-direct {v7, v9}, Lb2/d;-><init>(I)V

    invoke-static {v8, v7}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v29

    move-object/from16 v27, v3

    move-object/from16 v21, v22

    move-object/from16 v22, v5

    invoke-direct/range {v20 .. v29}, Lio/sentry/android/replay/f;-><init>(Lio/sentry/android/replay/w;Lio/sentry/android/replay/k;Ljava/util/Date;IJLio/sentry/r6;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v5, v20

    goto :goto_19

    :cond_1f
    move-object/from16 v21, v8

    :cond_20
    :goto_18
    invoke-virtual {v7}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v5, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v7, "Incorrect segment values found for replay: %s, deleting the replay"

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v3, v5, v7, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static/range {v21 .. v21}, Lge3/g;->r(Ljava/io/File;)Z

    goto/16 :goto_11

    :goto_19
    if-nez v5, :cond_21

    invoke-virtual {v2, v0}, Lio/sentry/android/replay/ReplayIntegration;->T(Ljava/lang/String;)V

    goto/16 :goto_1d

    :cond_21
    iget-object v0, v2, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v0, :cond_25

    const-string v3, "breadcrumbs.json"

    const-class v7, Ljava/util/List;

    invoke-virtual {v4, v0, v3, v7}, Lio/sentry/cache/f;->d(Lio/sentry/q6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/util/List;

    if-eqz v3, :cond_22

    check-cast v0, Ljava/util/List;

    move-object/from16 v21, v0

    goto :goto_1a

    :cond_22
    move-object/from16 v21, v17

    :goto_1a
    iget-object v7, v2, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    iget-object v8, v2, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v8, :cond_24

    iget-wide v9, v5, Lio/sentry/android/replay/f;->e:J

    iget-object v11, v5, Lio/sentry/android/replay/f;->c:Ljava/util/Date;

    iget v13, v5, Lio/sentry/android/replay/f;->d:I

    iget-object v0, v5, Lio/sentry/android/replay/f;->a:Lio/sentry/android/replay/w;

    iget v14, v0, Lio/sentry/android/replay/w;->b:I

    iget v15, v0, Lio/sentry/android/replay/w;->a:I

    iget v3, v0, Lio/sentry/android/replay/w;->e:I

    iget v0, v0, Lio/sentry/android/replay/w;->f:I

    iget-object v4, v5, Lio/sentry/android/replay/f;->b:Lio/sentry/android/replay/k;

    move/from16 v19, v0

    iget-object v0, v5, Lio/sentry/android/replay/f;->f:Lio/sentry/r6;

    move-object/from16 v16, v0

    iget-object v0, v5, Lio/sentry/android/replay/f;->g:Ljava/lang/String;

    move-object/from16 v20, v0

    new-instance v0, Ljava/util/LinkedList;

    iget-object v5, v5, Lio/sentry/android/replay/f;->h:Ljava/util/List;

    check-cast v5, Ljava/util/Collection;

    invoke-direct {v0, v5}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v22, v0

    move/from16 v18, v3

    move-object/from16 v17, v4

    invoke-static/range {v7 .. v22}, Lio/sentry/android/replay/capture/h;->a(Lio/sentry/d1;Lio/sentry/q6;JLjava/util/Date;Lio/sentry/protocol/v;IIILio/sentry/r6;Lio/sentry/android/replay/k;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/k;

    move-result-object v0

    instance-of v3, v0, Lio/sentry/android/replay/capture/i;

    if-eqz v3, :cond_23

    new-instance v3, Lio/sentry/android/replay/n;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v3}, Lhg3/i;->C(Ljava/lang/Object;)Lio/sentry/g0;

    move-result-object v3

    check-cast v0, Lio/sentry/android/replay/capture/i;

    iget-object v4, v2, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    invoke-virtual {v0, v4, v3}, Lio/sentry/android/replay/capture/i;->a(Lio/sentry/d1;Lio/sentry/g0;)V

    :cond_23
    invoke-virtual {v2, v6}, Lio/sentry/android/replay/ReplayIntegration;->T(Ljava/lang/String;)V

    goto :goto_1d

    :cond_24
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v17

    :cond_25
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v17

    :goto_1b
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :catchall_5
    move-exception v0

    invoke-static {v10, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_26
    move-object/from16 v19, v3

    const/16 v17, 0x0

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v17

    :cond_27
    move-object/from16 v19, v3

    const/16 v17, 0x0

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v17

    :cond_28
    :goto_1c
    invoke-virtual {v2, v0}, Lio/sentry/android/replay/ReplayIntegration;->T(Ljava/lang/String;)V

    :goto_1d
    return-void

    :cond_29
    move-object/from16 v19, v3

    const/16 v17, 0x0

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v17

    :pswitch_13
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/ndk/b;

    iget-object v0, v0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/sentry/ndk/NativeScope;->nativeClearAttachments()V

    return-void

    :pswitch_14
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lds/s;

    iget-object v0, v0, Lds/s;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/performance/g;

    invoke-static {v0}, Lio/sentry/android/core/performance/g;->a(Lio/sentry/android/core/performance/g;)V

    return-void

    :pswitch_15
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/util/c;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lio/sentry/android/core/internal/util/c;->a0(Z)V

    sget-object v2, Lio/sentry/android/core/internal/util/c;->N:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_6
    sget-object v3, Lio/sentry/android/core/internal/util/c;->O:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    invoke-virtual {v2}, Lio/sentry/s;->close()V

    sget-object v2, Lio/sentry/android/core/internal/util/c;->L:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_7
    sput-object v3, Lio/sentry/android/core/internal/util/c;->M:Landroid/net/ConnectivityManager;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    invoke-virtual {v2}, Lio/sentry/s;->close()V

    sget-object v2, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    invoke-virtual {v2, v0}, Lio/sentry/android/core/e0;->k(Lio/sentry/android/core/b0;)V

    return-void

    :catchall_6
    move-exception v0

    move-object v3, v0

    :try_start_8
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_1e

    :catchall_7
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1e
    throw v3

    :catchall_8
    move-exception v0

    move-object v3, v0

    :try_start_9
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    goto :goto_1f

    :catchall_9
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1f
    throw v3

    :pswitch_16
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/k1;

    iget-object v0, v0, Lio/sentry/android/core/k1;->g:Lio/sentry/android/core/j1;

    :goto_20
    iget-object v2, v0, Lio/sentry/android/core/j1;->d:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/core/i1;

    if-eqz v2, :cond_2a

    iget-object v3, v2, Lio/sentry/android/core/i1;->c:Lio/sentry/android/core/i1;

    iput-object v3, v0, Lio/sentry/android/core/j1;->d:Ljava/lang/Object;

    iget-object v3, v0, Lio/sentry/android/core/j1;->c:Ljava/lang/Object;

    check-cast v3, Lio/sentry/android/core/k0;

    iget-object v4, v3, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v4, Lio/sentry/android/core/i1;

    iput-object v4, v2, Lio/sentry/android/core/i1;->c:Lio/sentry/android/core/i1;

    iput-object v2, v3, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    goto :goto_20

    :cond_2a
    const/4 v2, 0x0

    iput-object v2, v0, Lio/sentry/android/core/j1;->e:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lio/sentry/android/core/j1;->a:I

    iput v2, v0, Lio/sentry/android/core/j1;->b:I

    return-void

    :pswitch_17
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/d0;

    if-eqz v0, :cond_2b

    sget-object v2, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v2, v2, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    invoke-virtual {v2, v0}, Landroidx/lifecycle/i0;->d(Landroidx/lifecycle/f0;)V

    :cond_2b
    return-void

    :pswitch_18
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/s;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Lio/sentry/android/core/s;->a(Ljava/util/List;Z)Lb9/l1;

    return-void

    :pswitch_19
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/h;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lio/sentry/android/core/h;->h(Z)V

    return-void

    :pswitch_1a
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/d;

    iget-object v0, v0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/app/FrameMetricsAggregator;

    invoke-virtual {v0}, Landroidx/core/app/FrameMetricsAggregator;->stop()[Landroid/util/SparseIntArray;

    return-void

    :pswitch_1b
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/a;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lio/sentry/android/core/a;->H:J

    iget-object v0, v0, Lio/sentry/android/core/a;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_1c
    iget-object v0, v1, Lio/sentry/c7;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/ShutdownHookIntegration;

    iget-object v2, v0, Lio/sentry/ShutdownHookIntegration;->w:Ljava/lang/Runtime;

    iget-object v0, v0, Lio/sentry/ShutdownHookIntegration;->x:Ljava/lang/Thread;

    invoke-virtual {v2, v0}, Ljava/lang/Runtime;->removeShutdownHook(Ljava/lang/Thread;)Z

    return-void

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
