.class public final Lt23/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt23/x1;

.field public final b:Lorg/webrtc/EglBase$Context;

.field public c:Lorg/webrtc/SurfaceTextureHelper;

.field public d:Ljava/util/List;

.field public e:Z

.field public f:Lorg/webrtc/Camera2Capturer;

.field public g:Lorg/webrtc/Camera2Enumerator;

.field public h:Landroid/hardware/camera2/CameraManager;

.field public final i:Ll83/p;

.field public final j:Lec3/h2;

.field public final k:Lec3/h2;

.field public final l:Ln53/e;

.field public final m:Lec3/h2;

.field public final n:Lec3/h2;

.field public final o:Lec3/h2;

.field public final p:Lec3/h2;

.field public final q:Lec3/h2;

.field public final r:Lec3/h2;

.field public final s:Lec3/h2;

.field public t:Lbc3/c2;

.field public u:Z


# direct methods
.method public constructor <init>(Lt23/x1;Lorg/webrtc/EglBase$Context;Lng3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/e1;->a:Lt23/x1;

    iput-object p2, p0, Lt23/e1;->b:Lorg/webrtc/EglBase$Context;

    const-string p1, "Media:CameraManager"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt23/e1;->i:Ll83/p;

    sget-object p1, Lt23/p1;->a:Lt23/p1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/e1;->j:Lec3/h2;

    iput-object p1, p0, Lt23/e1;->k:Lec3/h2;

    sget-object p2, Lt23/b1;->w:Lt23/b1;

    invoke-static {p1, p2}, Lx30/s0;->x(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lt23/e1;->l:Ln53/e;

    sget-object p1, Lt23/x0;->a:Lt23/x0;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/e1;->m:Lec3/h2;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lt23/e1;->n:Lec3/h2;

    iput-object p2, p0, Lt23/e1;->o:Lec3/h2;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/e1;->p:Lec3/h2;

    iput-object p1, p0, Lt23/e1;->q:Lec3/h2;

    sget-object p1, Lm83/y;->w:Lm83/y;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt23/e1;->r:Lec3/h2;

    iput-object p1, p0, Lt23/e1;->s:Lec3/h2;

    return-void
.end method

.method public static final a(Lt23/e1;Lt23/z0;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    iget-object p0, p0, Lt23/e1;->f:Lorg/webrtc/Camera2Capturer;

    if-eqz p0, :cond_0

    new-instance p1, Lt23/a1;

    invoke-direct {p1, v0}, Lt23/a1;-><init>(Lbc3/m;)V

    invoke-virtual {p0, p1}, Lorg/webrtc/Camera2Capturer;->switchCamera(Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    sget-object p0, Lt23/l0;->N:Lt23/l0;

    invoke-virtual {v0, p0}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0

    :cond_0
    const-string p0, "videoCapturer"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic d(Lt23/e1;)V
    .locals 0

    invoke-virtual {p0}, Lt23/e1;->c()V

    return-void
.end method

.method public static f(Ljava/util/List;Lt23/y0;)Ljava/util/List;
    .locals 3

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/v0;

    iget-object v2, v2, Lt23/v0;->e:Lt23/y0;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lt23/v0;

    iget-object v2, v2, Lt23/v0;->e:Lt23/y0;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Landroid/hardware/camera2/CameraManager;Lorg/webrtc/Camera2Enumerator;)Lt23/v0;
    .locals 7

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p2

    move-object v3, p2

    goto :goto_0

    :cond_0
    move-object v3, v0

    :goto_0
    if-eqz v3, :cond_1

    sget-object p2, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v3, p2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    move-object p2, v0

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_2

    :cond_2
    const/4 p2, -0x1

    :goto_2
    if-eqz p2, :cond_4

    const/4 v1, 0x1

    sget-object v2, Lt23/w0;->a:Lt23/w0;

    if-eq p2, v1, :cond_3

    const/4 v1, 0x2

    if-eq p2, v1, :cond_3

    move-object v6, v0

    goto :goto_4

    :cond_3
    :goto_3
    move-object v6, v2

    goto :goto_4

    :cond_4
    sget-object v2, Lt23/x0;->a:Lt23/x0;

    goto :goto_3

    :goto_4
    invoke-virtual {p3, p1}, Lorg/webrtc/Camera2Enumerator;->getSupportedFormats(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    const/4 p2, 0x0

    if-eqz v4, :cond_8

    move-object p3, v4

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_5

    move-object v1, v0

    goto :goto_6

    :cond_5
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget v2, v1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget v1, v1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    mul-int/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_6
    :goto_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget v5, v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget v2, v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    mul-int/2addr v5, v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_6

    move-object v1, v2

    goto :goto_5

    :cond_7
    :goto_6
    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    move v5, p3

    goto :goto_7

    :cond_8
    move v5, p2

    :goto_7
    if-eqz v3, :cond_9

    sget-object p3, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v3, p3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    if-nez v1, :cond_a

    :cond_9
    :goto_8
    move-object v2, p1

    goto :goto_b

    :cond_a
    invoke-static {v1, p2}, Lm83/n;->Z([II)Z

    move-result p2

    if-nez p2, :cond_b

    goto :goto_8

    :cond_b
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt p2, v1, :cond_12

    invoke-virtual {v3, p3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    const/16 v1, 0xc

    if-nez p2, :cond_c

    goto :goto_9

    :cond_c
    invoke-static {p2, v1}, Lm83/n;->Z([II)Z

    move-result p2

    if-nez p2, :cond_d

    goto :goto_9

    :cond_d
    sget-object p2, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_COLOR_FILTER_ARRANGEMENT:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v3, p2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    if-nez p2, :cond_e

    goto :goto_9

    :cond_e
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v2, 0x5

    :goto_9
    invoke-virtual {v3, p3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    if-nez p2, :cond_f

    goto :goto_a

    :cond_f
    invoke-static {p2, v1}, Lm83/n;->Z([II)Z

    move-result p2

    if-nez p2, :cond_10

    goto :goto_a

    :cond_10
    sget-object p2, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_COLOR_FILTER_ARRANGEMENT:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v3, p2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    if-nez p2, :cond_11

    goto :goto_a

    :cond_11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 p3, 0x6

    if-ne p2, p3, :cond_12

    goto :goto_8

    :cond_12
    :goto_a
    new-instance v1, Lt23/v0;

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lt23/v0;-><init>(Ljava/lang/String;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;ILt23/y0;)V

    return-object v1

    :goto_b
    invoke-virtual {p0}, Lt23/e1;->g()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object p3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v1, p3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_13

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "Camera device "

    const-string v3, " is not usable"

    invoke-static {p2, v2, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p3, p2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_13
    return-object v0
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lt23/e1;->j:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    sget-object v2, Lt23/n1;->a:Lt23/n1;

    invoke-virtual {v0, v1, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lt23/e1;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt23/e1;->a:Lt23/x1;

    sget-object v2, Lt23/l0;->L:Lt23/l0;

    invoke-virtual {v0, v2}, Lt23/x1;->e(Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lt23/e1;->f:Lorg/webrtc/Camera2Capturer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/webrtc/Camera2Capturer;->stopCapture()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt23/e1;->e:Z

    return-void

    :cond_0
    const-string v0, "videoCapturer"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    return-void
.end method

.method public final e(Z)V
    .locals 6

    iget-object v0, p0, Lt23/e1;->a:Lt23/x1;

    iget-object v1, p0, Lt23/e1;->p:Lec3/h2;

    const/4 v2, 0x0

    :try_start_0
    iget-boolean v3, p0, Lt23/e1;->u:Z

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lt23/e1;->h()V

    iget-object v3, p0, Lt23/e1;->d:Ljava/util/List;

    if-eqz v3, :cond_4

    iget-object v4, p0, Lt23/e1;->m:Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt23/y0;

    invoke-static {v3, v4}, Lt23/e1;->f(Ljava/util/List;Lt23/y0;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt23/v0;

    if-eqz v3, :cond_5

    iget-object v4, v3, Lt23/v0;->c:Ljava/util/List;

    iget-object v5, p0, Lt23/e1;->n:Lec3/h2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v3, v0, Lt23/x1;->b:Lt23/c0;

    iget-object v3, v3, Lt23/c0;->p:Lt23/s0;

    iget-object v3, v3, Lt23/s0;->J:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/android/video/generated/models/CallSettingsResponse;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getVideo()Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    move-result-object v3

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    move-object v3, v2

    :goto_0
    invoke-virtual {p0, v4, v3}, Lt23/e1;->i(Ljava/util/List;Lio/getstream/android/video/generated/models/VideoSettingsResponse;)Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    move-result-object v3

    invoke-virtual {v1, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, v0, Lt23/x1;->c:Lbc3/c0;

    new-instance v3, Lt23/c1;

    invoke-direct {v3, p0, v2}, Lt23/c1;-><init>(Lt23/e1;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {v1, v2, v2, v3, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    iget-object v1, p0, Lt23/e1;->r:Lec3/h2;

    if-eqz v4, :cond_3

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    goto :goto_1

    :cond_3
    sget-object v3, Lm83/y;->w:Lm83/y;

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string v1, "CaptureThread"

    iget-object v3, p0, Lt23/e1;->b:Lorg/webrtc/EglBase$Context;

    invoke-static {v1, v3}, Lorg/webrtc/SurfaceTextureHelper;->create(Ljava/lang/String;Lorg/webrtc/EglBase$Context;)Lorg/webrtc/SurfaceTextureHelper;

    move-result-object v1

    const-string v3, "create(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lt23/e1;->c:Lorg/webrtc/SurfaceTextureHelper;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lt23/e1;->u:Z

    goto :goto_3

    :cond_4
    const-string v1, "devices"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_5
    :goto_3
    if-eqz p1, :cond_6

    iget-object p1, p0, Lt23/e1;->j:Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lt23/o1;->a:Lt23/o1;

    invoke-virtual {p1, v2, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_6
    sget-object p1, Lt23/l0;->M:Lt23/l0;

    invoke-virtual {v0, p1}, Lt23/x1;->e(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0}, Lt23/e1;->j()V

    return-void
.end method

.method public final g()Lb23/k;
    .locals 1

    iget-object v0, p0, Lt23/e1;->i:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final h()V
    .locals 12

    iget-object v0, p0, Lt23/e1;->a:Lt23/x1;

    iget-object v0, v0, Lt23/x1;->a:Landroid/content/Context;

    const-class v1, Landroid/hardware/camera2/CameraManager;

    invoke-static {v0, v1}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/camera2/CameraManager;

    iput-object v1, p0, Lt23/e1;->h:Landroid/hardware/camera2/CameraManager;

    new-instance v1, Lorg/webrtc/Camera2Enumerator;

    invoke-direct {v1, v0}, Lorg/webrtc/Camera2Enumerator;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lt23/e1;->g:Lorg/webrtc/Camera2Enumerator;

    iget-object v0, p0, Lt23/e1;->h:Landroid/hardware/camera2/CameraManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    new-array v0, v2, [Ljava/lang/String;

    :cond_1
    iget-object v3, p0, Lt23/e1;->h:Landroid/hardware/camera2/CameraManager;

    iget-object v4, p0, Lt23/e1;->g:Lorg/webrtc/Camera2Enumerator;

    if-eqz v4, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v5, v0

    :goto_1
    if-ge v2, v5, :cond_3

    aget-object v6, v0, v2

    :try_start_0
    invoke-virtual {p0, v6, v3, v4}, Lt23/e1;->b(Ljava/lang/String;Landroid/hardware/camera2/CameraManager;Lorg/webrtc/Camera2Enumerator;)Lt23/v0;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v7

    invoke-virtual {p0}, Lt23/e1;->g()Lb23/k;

    move-result-object v8

    iget-object v9, v8, Lb23/k;->c:Lb23/e;

    iget-object v10, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v11, Lb23/g;->F:Lb23/g;

    invoke-interface {v9, v11, v10}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    const-string v9, "Could not create camera device for camera with id: "

    invoke-static {v9, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v8, v11, v10, v6, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    new-instance v0, Lqx/d0;

    const/4 v2, 0x4

    invoke-direct {v0, v2}, Lqx/d0;-><init>(I)V

    invoke-static {v1, v0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lt23/e1;->d:Ljava/util/List;

    return-void

    :cond_4
    const-string v0, "enumerator"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final i(Ljava/util/List;Lio/getstream/android/video/generated/models/VideoSettingsResponse;)Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;
    .locals 5

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->getTargetResolution()Lio/getstream/android/video/generated/models/TargetResolution;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/android/video/generated/models/TargetResolution;->getWidth()I

    move-result v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x500

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/getstream/android/video/generated/models/VideoSettingsResponse;->getTargetResolution()Lio/getstream/android/video/generated/models/TargetResolution;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/getstream/android/video/generated/models/TargetResolution;->getHeight()I

    move-result p2

    goto :goto_1

    :cond_1
    const/16 p2, 0x2d0

    :goto_1
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Lt23/d1;

    invoke-direct {v2, p2, v0}, Lt23/d1;-><init>(II)V

    invoke-static {p1, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v1

    :goto_2
    if-eqz p1, :cond_3

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    goto :goto_3

    :cond_3
    move-object p1, v1

    :goto_3
    invoke-virtual {p0}, Lt23/e1;->g()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v2, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->z:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "selectDesiredResolution: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v3, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-object p1
.end method

.method public final j()V
    .locals 7

    const-string v0, "Exception occurred: "

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lt23/e1;->e:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lt23/e1;->k()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lt23/e1;->n:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/v0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-object v2, p0, Lt23/e1;->q:Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    new-instance v3, Lorg/webrtc/Camera2Capturer;

    iget-object v4, p0, Lt23/e1;->a:Lt23/x1;

    iget-object v4, v4, Lt23/x1;->a:Landroid/content/Context;

    iget-object v1, v1, Lt23/v0;->a:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v1, v5}, Lorg/webrtc/Camera2Capturer;-><init>(Landroid/content/Context;Ljava/lang/String;Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;)V

    iput-object v3, p0, Lt23/e1;->f:Lorg/webrtc/Camera2Capturer;

    iget-object v1, p0, Lt23/e1;->c:Lorg/webrtc/SurfaceTextureHelper;

    if-eqz v1, :cond_4

    iget-object v4, p0, Lt23/e1;->a:Lt23/x1;

    iget-object v6, v4, Lt23/x1;->a:Landroid/content/Context;

    invoke-virtual {v4}, Lt23/x1;->c()Lorg/webrtc/VideoSource;

    move-result-object v4

    invoke-virtual {v4}, Lorg/webrtc/VideoSource;->getCapturerObserver()Lorg/webrtc/CapturerObserver;

    move-result-object v4

    invoke-virtual {v3, v1, v6, v4}, Lorg/webrtc/Camera2Capturer;->initialize(Lorg/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lorg/webrtc/CapturerObserver;)V

    iget-object v1, p0, Lt23/e1;->f:Lorg/webrtc/Camera2Capturer;

    if-eqz v1, :cond_3

    iget v3, v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget v4, v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    iget-object v2, v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    iget v2, v2, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    invoke-virtual {v1, v3, v4, v2}, Lorg/webrtc/Camera2Capturer;->startCapture(III)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lt23/e1;->e:Z

    goto :goto_2

    :cond_3
    const-string v1, "videoCapturer"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_4
    const-string v1, "surfaceTextureHelper"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    :try_start_3
    const-string v2, "SafeCall"

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_5
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    monitor-exit p0

    throw v0
.end method

.method public final k()V
    .locals 7

    const-string v0, "Exception occurred: "

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lt23/e1;->e:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lt23/e1;->f:Lorg/webrtc/Camera2Capturer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/webrtc/Camera2Capturer;->stopCapture()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lt23/e1;->e:Z

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    const-string v1, "videoCapturer"

    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    :try_start_1
    const-string v2, "SafeCall"

    sget-object v3, Lb23/i;->a:Lb23/i;

    sget-object v3, Lb23/i;->d:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Lb23/i;->c:Lb23/j;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method
