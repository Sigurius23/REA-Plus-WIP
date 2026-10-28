.class Lhms/webrtc/Camera2Session$CameraStateCallback;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/Camera2Session;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "CameraStateCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/Camera2Session;


# direct methods
.method private constructor <init>(Lhms/webrtc/Camera2Session;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lhms/webrtc/Camera2Session;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhms/webrtc/Camera2Session$CameraStateCallback;-><init>(Lhms/webrtc/Camera2Session;)V

    return-void
.end method

.method public static synthetic a(Landroid/util/Size;Landroid/util/Size;)I
    .locals 0

    invoke-static {p0, p1}, Lhms/webrtc/Camera2Session$CameraStateCallback;->lambda$onOpened$0(Landroid/util/Size;Landroid/util/Size;)I

    move-result p0

    return p0
.end method

.method private getErrorDescription(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const-string v0, "Unknown camera error: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Camera service has encountered a fatal error."

    return-object p1

    :cond_1
    const-string p1, "Camera device has encountered a fatal error."

    return-object p1

    :cond_2
    const-string p1, "Camera device could not be opened due to a device policy."

    return-object p1

    :cond_3
    const-string p1, "Camera device could not be opened because there are too many other open camera devices."

    return-object p1

    :cond_4
    const-string p1, "Camera device is in use already."

    return-object p1
.end method

.method private static synthetic lambda$onOpened$0(Landroid/util/Size;Landroid/util/Size;)I
    .locals 4

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    int-to-long v2, p0

    mul-long/2addr v0, v2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p0

    int-to-long v2, p0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p0

    int-to-long p0, p0

    mul-long/2addr v2, p0

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->signum(J)I

    move-result p0

    return p0
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 1

    iget-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {p1}, Lhms/webrtc/Camera2Session;->y(Lhms/webrtc/Camera2Session;)V

    const-string p1, "Camera2Session"

    const-string v0, "Camera device closed."

    invoke-static {p1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {p1}, Lhms/webrtc/Camera2Session;->j(Lhms/webrtc/Camera2Session;)Lhms/webrtc/CameraSession$Events;

    move-result-object p1

    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-interface {p1, v0}, Lhms/webrtc/CameraSession$Events;->onCameraClosed(Lhms/webrtc/CameraSession;)V

    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    iget-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {p1}, Lhms/webrtc/Camera2Session;->y(Lhms/webrtc/Camera2Session;)V

    iget-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {p1}, Lhms/webrtc/Camera2Session;->h(Lhms/webrtc/Camera2Session;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {p1}, Lhms/webrtc/Camera2Session;->o(Lhms/webrtc/Camera2Session;)Lhms/webrtc/Camera2Session$SessionState;

    move-result-object p1

    sget-object v0, Lhms/webrtc/Camera2Session$SessionState;->STOPPED:Lhms/webrtc/Camera2Session$SessionState;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    sget-object v1, Lhms/webrtc/Camera2Session$SessionState;->STOPPED:Lhms/webrtc/Camera2Session$SessionState;

    invoke-static {v0, v1}, Lhms/webrtc/Camera2Session;->w(Lhms/webrtc/Camera2Session;Lhms/webrtc/Camera2Session$SessionState;)V

    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v0}, Lhms/webrtc/Camera2Session;->B(Lhms/webrtc/Camera2Session;)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {p1}, Lhms/webrtc/Camera2Session;->a(Lhms/webrtc/Camera2Session;)Lhms/webrtc/CameraSession$CreateSessionCallback;

    move-result-object p1

    sget-object v0, Lhms/webrtc/CameraSession$FailureType;->DISCONNECTED:Lhms/webrtc/CameraSession$FailureType;

    const-string v1, "Camera disconnected / evicted."

    invoke-interface {p1, v0, v1}, Lhms/webrtc/CameraSession$CreateSessionCallback;->onFailure(Lhms/webrtc/CameraSession$FailureType;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {p1}, Lhms/webrtc/Camera2Session;->j(Lhms/webrtc/Camera2Session;)Lhms/webrtc/CameraSession$Events;

    move-result-object p1

    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-interface {p1, v0}, Lhms/webrtc/CameraSession$Events;->onCameraDisconnected(Lhms/webrtc/CameraSession;)V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 0

    iget-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {p1}, Lhms/webrtc/Camera2Session;->y(Lhms/webrtc/Camera2Session;)V

    iget-object p1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-direct {p0, p2}, Lhms/webrtc/Camera2Session$CameraStateCallback;->getErrorDescription(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lhms/webrtc/Camera2Session;->A(Lhms/webrtc/Camera2Session;Ljava/lang/String;)V

    return-void
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 5

    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v0}, Lhms/webrtc/Camera2Session;->y(Lhms/webrtc/Camera2Session;)V

    const-string v0, "Camera2Session"

    const-string v1, "Camera opened."

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v0, p1}, Lhms/webrtc/Camera2Session;->r(Lhms/webrtc/Camera2Session;Landroid/hardware/camera2/CameraDevice;)V

    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v0}, Lhms/webrtc/Camera2Session;->q(Lhms/webrtc/Camera2Session;)Lhms/webrtc/SurfaceTextureHelper;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v1}, Lhms/webrtc/Camera2Session;->f(Lhms/webrtc/Camera2Session;)Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    move-result-object v1

    iget v1, v1, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget-object v2, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v2}, Lhms/webrtc/Camera2Session;->f(Lhms/webrtc/Camera2Session;)Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    move-result-object v2

    iget v2, v2, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    invoke-virtual {v0, v1, v2}, Lhms/webrtc/SurfaceTextureHelper;->setTextureSize(II)V

    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    new-instance v1, Landroid/view/Surface;

    iget-object v2, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v2}, Lhms/webrtc/Camera2Session;->q(Lhms/webrtc/Camera2Session;)Lhms/webrtc/SurfaceTextureHelper;

    move-result-object v2

    invoke-virtual {v2}, Lhms/webrtc/SurfaceTextureHelper;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-static {v0, v1}, Lhms/webrtc/Camera2Session;->x(Lhms/webrtc/Camera2Session;Landroid/view/Surface;)V

    :try_start_0
    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v0}, Lhms/webrtc/Camera2Session;->b(Lhms/webrtc/Camera2Session;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    const/16 v1, 0x100

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Lhms/webrtc/c;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    iget-object v2, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    const/4 v4, 0x1

    invoke-static {v3, v0, v1, v4}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v0

    invoke-static {v2, v0}, Lhms/webrtc/Camera2Session;->v(Lhms/webrtc/Camera2Session;Landroid/media/ImageReader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lhms/webrtc/Camera2Session;->v(Lhms/webrtc/Camera2Session;Landroid/media/ImageReader;)V

    iget-object v1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to setup image reader. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lhms/webrtc/Camera2Session;->A(Lhms/webrtc/Camera2Session;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v0}, Lhms/webrtc/Camera2Session;->m(Lhms/webrtc/Camera2Session;)Landroid/media/ImageReader;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v0}, Lhms/webrtc/Camera2Session;->p(Lhms/webrtc/Camera2Session;)Landroid/view/Surface;

    move-result-object v0

    filled-new-array {v0}, [Landroid/view/Surface;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v0}, Lhms/webrtc/Camera2Session;->p(Lhms/webrtc/Camera2Session;)Landroid/view/Surface;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v1}, Lhms/webrtc/Camera2Session;->m(Lhms/webrtc/Camera2Session;)Landroid/media/ImageReader;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v1

    filled-new-array {v0, v1}, [Landroid/view/Surface;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_1
    :try_start_1
    new-instance v1, Lhms/webrtc/Camera2Session$CaptureSessionCallback;

    iget-object v2, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lhms/webrtc/Camera2Session$CaptureSessionCallback;-><init>(Lhms/webrtc/Camera2Session;I)V

    iget-object v2, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    invoke-static {v2}, Lhms/webrtc/Camera2Session;->e(Lhms/webrtc/Camera2Session;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    iget-object v0, p0, Lhms/webrtc/Camera2Session$CameraStateCallback;->this$0:Lhms/webrtc/Camera2Session;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to create capture session. "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lhms/webrtc/Camera2Session;->A(Lhms/webrtc/Camera2Session;Ljava/lang/String;)V

    return-void
.end method
