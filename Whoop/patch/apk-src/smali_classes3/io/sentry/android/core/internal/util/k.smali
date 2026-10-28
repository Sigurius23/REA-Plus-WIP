.class public final synthetic Lio/sentry/android/core/internal/util/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/sentry/android/core/internal/util/k;->a:I

    iput-object p2, p0, Lio/sentry/android/core/internal/util/k;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/internal/util/k;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 21

    move-object/from16 v1, p0

    iget v0, v1, Lio/sentry/android/core/internal/util/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lio/sentry/android/core/internal/util/k;->b:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lio/sentry/android/replay/screenshot/h;

    iget-object v0, v1, Lio/sentry/android/core/internal/util/k;->c:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    iget-object v0, v3, Lio/sentry/android/replay/screenshot/h;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, v3, Lio/sentry/android/replay/screenshot/h;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v14, v3, Lio/sentry/android/replay/screenshot/h;->b:Lio/sentry/q6;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v15, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v14}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "PixelCopyStrategy is closed, ignoring capture result"

    new-array v4, v15, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {v14}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v3, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Failed to capture replay recording: %d"

    invoke-interface {v0, v3, v5, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto/16 :goto_b

    :cond_1
    iget-object v0, v3, Lio/sentry/android/replay/screenshot/h;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v14}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v3, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "Failed to determine view hierarchy, not capturing"

    new-array v5, v15, [Ljava/lang/Object;

    invoke-interface {v0, v3, v4, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v2, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto/16 :goto_b

    :cond_2
    invoke-virtual {v14}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    const-string v2, "getSessionReplay(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-static {v4, v5, v0}, Lo73/a;->A(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;Li63/j;)Lio/sentry/android/replay/viewhierarchy/g;

    move-result-object v6

    invoke-virtual {v14}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/u6;->p:Z

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_3
    move-object v0, v5

    :goto_0
    invoke-virtual {v14}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    const-string v8, "getLogger(...)"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v6, v7, v2, v0}, La4/a;->G(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;Li63/j;Lio/sentry/v0;Ljava/util/List;)V

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    move-object v10, v4

    goto/16 :goto_a

    :cond_5
    iget-object v2, v3, Lio/sentry/android/replay/screenshot/h;->d:Lav/b;

    invoke-virtual {v2}, Lav/b;->invoke()Ljava/lang/Object;

    iget-object v2, v3, Lio/sentry/android/replay/screenshot/h;->r:[I

    iget-object v7, v3, Lio/sentry/android/replay/screenshot/h;->q:[I

    invoke-virtual {v4, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v12, v7, v15

    const/16 v16, 0x1

    aget v8, v7, v16

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    new-array v7, v7, [Lcom/google/android/material/datepicker/n;

    new-instance v9, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    move-object v11, v6

    move v6, v15

    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    add-int/lit8 v18, v6, 0x1

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/replay/viewhierarchy/e;

    iget-object v0, v0, Lio/sentry/android/replay/viewhierarchy/e;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v10

    if-eqz v10, :cond_6

    invoke-interface {v10}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v10

    goto :goto_2

    :cond_6
    move-object v10, v5

    :goto_2
    if-eqz v0, :cond_7

    if-eqz v10, :cond_7

    invoke-virtual {v10}, Landroid/view/Surface;->isValid()Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    move-object/from16 v20, v2

    move-object/from16 v19, v5

    move-object v5, v7

    move-object v2, v9

    move-object v6, v11

    move v7, v12

    goto/16 :goto_8

    :cond_8
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v10

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    :try_start_1
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v10, v13, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    :try_start_2
    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    move-object v10, v4

    move-object v4, v5

    move-object v5, v7

    :try_start_3
    aget v7, v2, v15
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    move v13, v8

    :try_start_4
    aget v8, v2, v16
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    move-object/from16 v19, v2

    :try_start_5
    new-instance v2, Lio/sentry/android/replay/screenshot/d;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-object/from16 v20, v19

    const/16 v19, 0x0

    :try_start_6
    invoke-direct/range {v2 .. v13}, Lio/sentry/android/replay/screenshot/d;-><init>(Lio/sentry/android/replay/screenshot/h;Landroid/graphics/Bitmap;[Lcom/google/android/material/datepicker/n;IIILjava/util/concurrent/atomic/AtomicInteger;Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;II)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object v6, v9

    move-object v9, v2

    move-object v2, v6

    move-object v6, v11

    move v7, v12

    move v8, v13

    :try_start_7
    iget-object v11, v3, Lio/sentry/android/replay/screenshot/h;->f:Laj/c;

    iget-object v11, v11, Laj/c;->x:Ljava/lang/Object;

    check-cast v11, Landroid/os/Handler;

    invoke-static {v0, v4, v9, v11}, Landroid/view/PixelCopy;->request(Landroid/view/SurfaceView;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :catchall_1
    move-exception v0

    move-object v2, v9

    move-object v6, v11

    move v7, v12

    move v8, v13

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v2, v9

    move-object v6, v11

    move v7, v12

    move v8, v13

    move-object/from16 v20, v19

    :goto_3
    const/16 v19, 0x0

    goto :goto_6

    :catchall_3
    move-exception v0

    move-object/from16 v20, v2

    move-object v2, v9

    move-object v6, v11

    move v7, v12

    move v8, v13

    goto :goto_3

    :catchall_4
    move-exception v0

    move-object/from16 v20, v2

    :goto_4
    move-object v2, v9

    move-object v6, v11

    move v7, v12

    goto :goto_3

    :catchall_5
    move-exception v0

    move-object/from16 v20, v2

    move-object v10, v4

    move-object v4, v5

    move-object v5, v7

    goto :goto_4

    :catchall_6
    move-exception v0

    move-object/from16 v20, v2

    move-object v10, v4

    move-object v5, v7

    move-object v2, v9

    move-object v6, v11

    move v7, v12

    const/16 v19, 0x0

    :goto_5
    move-object/from16 v4, v19

    goto :goto_6

    :catchall_7
    move-exception v0

    move-object/from16 v20, v2

    move-object v10, v4

    move-object/from16 v19, v5

    move-object v5, v7

    move-object v2, v9

    move-object v6, v11

    move v7, v12

    goto :goto_5

    :goto_6
    invoke-virtual {v14}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v9

    sget-object v11, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v12, "Failed to capture SurfaceView"

    invoke-interface {v9, v11, v12, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    :cond_9
    move-object v4, v10

    invoke-static/range {v2 .. v8}, Lio/sentry/android/replay/screenshot/h;->e(Ljava/util/concurrent/atomic/AtomicInteger;Lio/sentry/android/replay/screenshot/h;Landroid/view/View;[Lcom/google/android/material/datepicker/n;Lio/sentry/android/replay/viewhierarchy/g;II)V

    :goto_7
    move-object v10, v4

    goto :goto_9

    :goto_8
    invoke-static/range {v2 .. v8}, Lio/sentry/android/replay/screenshot/h;->e(Ljava/util/concurrent/atomic/AtomicInteger;Lio/sentry/android/replay/screenshot/h;Landroid/view/View;[Lcom/google/android/material/datepicker/n;Lio/sentry/android/replay/viewhierarchy/g;II)V

    goto :goto_7

    :goto_9
    move-object v9, v2

    move-object v11, v6

    move v12, v7

    move-object v4, v10

    move/from16 v6, v18

    move-object/from16 v2, v20

    move-object v7, v5

    move-object/from16 v5, v19

    goto/16 :goto_1

    :goto_a
    iget-object v0, v3, Lio/sentry/android/replay/screenshot/h;->e:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lio/sentry/android/replay/util/e;

    new-instance v4, Landroidx/fragment/app/d;

    const/16 v5, 0xd

    invoke-direct {v4, v3, v10, v6, v5}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v3, "screenshot_recorder.mask"

    invoke-direct {v2, v4, v3}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_a
    :goto_b
    return-void

    :pswitch_0
    iget-object v0, v1, Lio/sentry/android/core/internal/util/k;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, v1, Lio/sentry/android/core/internal/util/k;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    if-nez p1, :cond_b

    const/4 v3, 0x1

    goto :goto_c

    :cond_b
    const/4 v3, 0x0

    :goto_c
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
