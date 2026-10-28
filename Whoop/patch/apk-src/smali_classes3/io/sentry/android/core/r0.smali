.class public final synthetic Lio/sentry/android/core/r0;
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
    iput p1, p0, Lio/sentry/android/core/r0;->w:I

    iput-object p2, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Runnable;Lio/sentry/android/replay/util/d;)V
    .locals 1

    .line 2
    const/4 v0, 0x5

    iput v0, p0, Lio/sentry/android/core/r0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, Lio/sentry/android/core/r0;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lr5/e;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lm5/o;

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$response"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lr5/e;->e()Lm5/g;

    move-result-object v0

    invoke-interface {v0, v1}, Lm5/g;->onResult(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Ljk0/d;

    invoke-static {v0, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->R(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lm5/g;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    const-string v2, "$callback"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$exception"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lm5/g;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lp92/c;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/local/room/entity/GpsDto;

    invoke-static {v0, v1}, Lp92/c;->c(Lp92/c;Lcom/whoop/data/local/room/entity/GpsDto;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lm5/g;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Exception;

    new-instance v2, Landroidx/credentials/exceptions/ClearCredentialUnknownException;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Landroidx/credentials/exceptions/ClearCredentialUnknownException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lm5/g;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lno/m;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/SurfaceTexture;

    iget-object v2, v0, Lno/m;->G:Landroid/graphics/SurfaceTexture;

    iget-object v3, v0, Lno/m;->H:Landroid/view/Surface;

    new-instance v4, Landroid/view/Surface;

    invoke-direct {v4, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v1, v0, Lno/m;->G:Landroid/graphics/SurfaceTexture;

    iput-object v4, v0, Lno/m;->H:Landroid/view/Surface;

    iget-object v0, v0, Lno/m;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrm/r;

    iget-object v1, v1, Lrm/r;->w:Lrm/u;

    invoke-virtual {v1, v4}, Lrm/u;->w0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    :cond_2
    return-void

    :pswitch_5
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lb9/g;

    monitor-enter v1

    monitor-exit v1

    iget-object v0, v0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v1, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->S:Lsm/d;

    iget-object v1, v0, Lsm/d;->z:La30/w0;

    iget-object v1, v1, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    invoke-virtual {v0, v1}, Lsm/d;->v(Lsn/v;)Lsm/a;

    move-result-object v1

    new-instance v2, Lsm/b;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lsm/b;-><init>(I)V

    const/16 v3, 0x3fc

    invoke-virtual {v0, v1, v3, v2}, Lsm/d;->z(Lsm/a;ILlo/h;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Ld1/j;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lmo/r;

    iget-object v0, v0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lrm/r;

    sget v2, Llo/y;->a:I

    iget-object v0, v0, Lrm/r;->w:Lrm/u;

    iput-object v1, v0, Lrm/u;->I0:Lmo/r;

    iget-object v0, v0, Lrm/u;->M:Ld9/p;

    new-instance v2, Lrm/p;

    const/4 v3, 0x3

    invoke-direct {v2, v1, v3}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    const/16 v1, 0x19

    invoke-virtual {v0, v1, v2}, Ld9/p;->i(ILlo/h;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Landroid/app/job/JobParameters;

    sget v2, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;->w:I

    invoke-virtual {v0, v1, v3}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    return-void

    :pswitch_8
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/platform/ComposeView;

    const-string v2, "$activity"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$view"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v2, "activity.window.decorView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/view/View;->setX(F)V

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    const/high16 v2, 0x43160000    # 150.0f

    sub-float/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/view/View;->setY(F)V

    return-void

    :pswitch_9
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lmj/g;

    iget-object v3, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v3, Landroid/app/Activity;

    iget-object v4, v0, Lmj/g;->b:Landroidx/compose/ui/platform/ComposeView;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    goto :goto_1

    :cond_3
    move-object v4, v2

    :goto_1
    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, v0, Lmj/g;->b:Landroidx/compose/ui/platform/ComposeView;

    if-nez v4, :cond_5

    new-instance v4, Landroidx/compose/ui/platform/ComposeView;

    const/4 v5, 0x6

    invoke-direct {v4, v3, v2, v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v5, v6, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v5, 0x42c80000    # 100.0f

    invoke-virtual {v4, v5}, Landroid/view/View;->setElevation(F)V

    new-instance v5, Lc4/q;

    const/4 v6, 0x4

    invoke-direct {v5, v6, v0, v4}, Lc4/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Lx1/b;

    const v7, -0x4dddb51b

    invoke-direct {v6, v5, v1, v7}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v4, v6}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lc93/m;)V

    new-instance v1, Lio/sentry/android/core/r0;

    const/16 v5, 0x14

    invoke-direct {v1, v5, v3, v4}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    iput-object v4, v0, Lmj/g;->b:Landroidx/compose/ui/platform/ComposeView;

    :cond_5
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    instance-of v3, v1, Landroid/view/ViewGroup;

    if-eqz v3, :cond_6

    move-object v2, v1

    check-cast v2, Landroid/view/ViewGroup;

    :cond_6
    if-eqz v2, :cond_7

    iget-object v0, v0, Lmj/g;->b:Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_7
    :goto_2
    return-void

    :pswitch_a
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Llo/r;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lko/p;

    iget-object v2, v0, Llo/r;->w:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v0, v0, Llo/r;->x:I

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, v0}, Lko/p;->a(I)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_b
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/videoview/HMSVideoView;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Llive/hms/videoview/HMSVideoView$captureBitmap$2;

    invoke-static {v0, v1}, Llive/hms/videoview/HMSVideoView$captureBitmap$2;->a(Llive/hms/videoview/HMSVideoView;Llive/hms/videoview/HMSVideoView$captureBitmap$2;)V

    return-void

    :pswitch_c
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Llive/hms/video/media/capturers/camera/CameraControl;->d(Llive/hms/video/media/capturers/camera/CameraControl;Ljava/lang/String;)V

    return-void

    :pswitch_d
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/factories/SafeVariable;

    invoke-static {v0, v1}, Llive/hms/video/factories/SafeVariable;->b(Lc93/a;Llive/hms/video/factories/SafeVariable;)V

    return-void

    :pswitch_e
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/audio/manager/HMSAudioManagerApi31;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/sdk/IErrorListener;

    invoke-static {v0, v1}, Llive/hms/video/audio/manager/HMSAudioManagerApi31;->a(Llive/hms/video/audio/manager/HMSAudioManagerApi31;Llive/hms/video/sdk/IErrorListener;)V

    return-void

    :pswitch_f
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/audio/HMSAudioManagerLegacy;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/sdk/IErrorListener;

    invoke-static {v0, v1}, Llive/hms/video/audio/HMSAudioManagerLegacy;->c(Llive/hms/video/audio/HMSAudioManagerLegacy;Llive/hms/video/sdk/IErrorListener;)V

    return-void

    :pswitch_10
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Ll9/s0;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lt9/e0;

    invoke-virtual {v0, v1}, Ll9/s0;->D(Lt9/e0;)V

    return-void

    :pswitch_11
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lx8/d;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lx8/d;->accept(Ljava/lang/Object;)V

    return-void

    :pswitch_12
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lkx0/a;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lkx0/a;->g(Lkx0/a;Ljava/lang/Runnable;)V

    return-void

    :pswitch_13
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Ljc/g;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lqc/j;

    iget-object v2, v0, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    iget-object v0, v0, Ljc/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljc/d;

    invoke-interface {v4, v1, v3}, Ljc/d;->b(Lqc/j;Z)V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_8
    monitor-exit v2

    return-void

    :goto_4
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :pswitch_14
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/seon/androidsdk/service/i1;

    iget-object v0, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/seon/androidsdk/service/k0;

    iget-object v4, v1, Lio/seon/androidsdk/service/i1;->a:Lio/seon/androidsdk/service/f;

    invoke-direct {v2, v4}, Lio/seon/androidsdk/service/k0;-><init>(Lio/seon/androidsdk/service/f;)V

    iget-object v4, v1, Lio/seon/androidsdk/service/i1;->b:Lio/seon/androidsdk/service/k0;

    iget-object v4, v4, Lio/seon/androidsdk/service/k0;->h:Lio/seon/androidsdk/service/p0;

    iget-object v4, v4, Lio/seon/androidsdk/service/p0;->f:Lio/sentry/hints/j;

    if-eqz v4, :cond_9

    iget-object v5, v2, Lio/seon/androidsdk/service/k0;->h:Lio/seon/androidsdk/service/p0;

    invoke-virtual {v5, v4}, Lio/seon/androidsdk/service/p0;->i(Lio/sentry/hints/j;)V

    :cond_9
    iget-object v4, v1, Lio/seon/androidsdk/service/i1;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_3
    iput-object v2, v1, Lio/seon/androidsdk/service/i1;->b:Lio/seon/androidsdk/service/k0;

    iput-boolean v3, v1, Lio/seon/androidsdk/service/i1;->j:Z

    iget-object v2, v1, Lio/seon/androidsdk/service/i1;->i:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Condition;->signalAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    iget-object v1, v1, Lio/seon/androidsdk/service/i1;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void

    :catchall_2
    move-exception v0

    iget-object v1, v1, Lio/seon/androidsdk/service/i1;->h:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :pswitch_15
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lio/seon/androidsdk/service/p0;

    iget-object v0, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    iget-object v2, v7, Lio/seon/androidsdk/service/p0;->h:Landroid/location/LocationManager;

    invoke-virtual {v7, v3}, Lio/seon/androidsdk/service/p0;->h(Ljava/lang/String;)J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    iput-boolean v1, v7, Lio/seon/androidsdk/service/p0;->o:Z

    goto :goto_5

    :cond_a
    return-void

    :pswitch_16
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/protocol/v;

    const-string v2, "replay.json"

    invoke-virtual {v0, v1, v2}, Lio/sentry/cache/f;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_17
    iget-object v0, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/Runnable;

    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lio/sentry/android/replay/util/d;

    :try_start_4
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    iget-object v2, v2, Lio/sentry/android/replay/util/d;->x:Lio/sentry/q6;

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Failed to execute task "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    instance-of v5, v1, Lio/sentry/android/replay/util/e;

    if-eqz v5, :cond_b

    check-cast v1, Lio/sentry/android/replay/util/e;

    iget-object v1, v1, Lio/sentry/android/replay/util/e;->w:Ljava/lang/String;

    goto :goto_6

    :cond_b
    const-string v1, ""

    :goto_6
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_7
    return-void

    :pswitch_18
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/c7;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    :try_start_5
    invoke-virtual {v0}, Lio/sentry/c7;->run()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_8

    :catchall_4
    move-exception v0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to execute task ReplayIntegration.finalize_previous_replay"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_8
    return-void

    :pswitch_19
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/replay/capture/f;

    invoke-static {v0}, Lge3/g;->r(Ljava/io/File;)Z

    const/4 v0, -0x1

    invoke-virtual {v1, v0}, Lio/sentry/android/replay/capture/c;->k(I)V

    return-void

    :pswitch_1a
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/anr/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v1, :cond_c

    goto :goto_9

    :cond_c
    :try_start_6
    invoke-virtual {v1}, Lio/sentry/android/core/anr/d;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_9

    :catch_0
    iget-object v0, v0, Lio/sentry/android/core/anr/AnrProfilingIntegration;->I:Lio/sentry/v0;

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v2, "Failed to close AnrProfileManager"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_9
    return-void

    :pswitch_1b
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/o1;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_d

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {v0}, Lio/sentry/android/core/o1;->show()V

    :cond_d
    return-void

    :pswitch_1c
    iget-object v0, p0, Lio/sentry/android/core/r0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/FeedbackShakeIntegration;

    iget-object v1, p0, Lio/sentry/android/core/r0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    iput-boolean v3, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    iget-object v3, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v3}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object v3

    iput-object v1, v3, Lio/sentry/i5;->h:Ljava/lang/Runnable;

    if-eqz v1, :cond_e

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_e
    iput-object v2, v0, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

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
