.class public Llive/hms/video/services/ScreenCapturerAndroidCustom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoCapturer;
.implements Lhms/webrtc/VideoSink;


# static fields
.field private static final DISPLAY_FLAGS:I = 0x3

.field private static final VIRTUAL_DISPLAY_DPI:I = 0x190


# instance fields
.field private capturerObserver:Lhms/webrtc/CapturerObserver;

.field private height:I

.field private isDisposed:Z

.field private mediaProjection:Landroid/media/projection/MediaProjection;

.field private final mediaProjectionCallback:Landroid/media/projection/MediaProjection$Callback;

.field private mediaProjectionManager:Landroid/media/projection/MediaProjectionManager;

.field private final mediaProjectionPermissionResultData:Landroid/content/Intent;

.field private numCapturedFrames:J

.field private surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

.field private virtualDisplay:Landroid/hardware/display/VirtualDisplay;

.field private width:I


# direct methods
.method public constructor <init>(Landroid/content/Intent;Landroid/media/projection/MediaProjection$Callback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjectionPermissionResultData:Landroid/content/Intent;

    iput-object p2, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjectionCallback:Landroid/media/projection/MediaProjection$Callback;

    return-void
.end method

.method public static synthetic a(Llive/hms/video/services/ScreenCapturerAndroidCustom;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->lambda$changeCaptureFormat$0(II)V

    return-void
.end method

.method public static synthetic access$000(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Lhms/webrtc/SurfaceTextureHelper;
    .locals 0

    iget-object p0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    return-object p0
.end method

.method public static synthetic access$100(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Lhms/webrtc/CapturerObserver;
    .locals 0

    iget-object p0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->capturerObserver:Lhms/webrtc/CapturerObserver;

    return-object p0
.end method

.method public static synthetic access$200(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Landroid/hardware/display/VirtualDisplay;
    .locals 0

    iget-object p0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->virtualDisplay:Landroid/hardware/display/VirtualDisplay;

    return-object p0
.end method

.method public static synthetic access$202(Llive/hms/video/services/ScreenCapturerAndroidCustom;Landroid/hardware/display/VirtualDisplay;)Landroid/hardware/display/VirtualDisplay;
    .locals 0

    iput-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->virtualDisplay:Landroid/hardware/display/VirtualDisplay;

    return-object p1
.end method

.method public static synthetic access$300(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Landroid/media/projection/MediaProjection;
    .locals 0

    iget-object p0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjection:Landroid/media/projection/MediaProjection;

    return-object p0
.end method

.method public static synthetic access$302(Llive/hms/video/services/ScreenCapturerAndroidCustom;Landroid/media/projection/MediaProjection;)Landroid/media/projection/MediaProjection;
    .locals 0

    iput-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjection:Landroid/media/projection/MediaProjection;

    return-object p1
.end method

.method public static synthetic access$400(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Landroid/media/projection/MediaProjection$Callback;
    .locals 0

    iget-object p0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjectionCallback:Landroid/media/projection/MediaProjection$Callback;

    return-object p0
.end method

.method private checkNotDisposed()V
    .locals 2

    iget-boolean v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->isDisposed:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "capturer is disposed."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private createVirtualDisplay()V
    .locals 12

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    iget v1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->width:I

    iget v2, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->height:I

    invoke-virtual {v0, v1, v2}, Lhms/webrtc/SurfaceTextureHelper;->setTextureSize(II)V

    iget-object v3, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjection:Landroid/media/projection/MediaProjection;

    iget v5, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->width:I

    iget v6, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->height:I

    new-instance v9, Landroid/view/Surface;

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {v0}, Lhms/webrtc/SurfaceTextureHelper;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-direct {v9, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v4, "WebRTC_ScreenCapture"

    const/16 v7, 0x190

    const/4 v8, 0x3

    invoke-virtual/range {v3 .. v11}, Landroid/media/projection/MediaProjection;->createVirtualDisplay(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->virtualDisplay:Landroid/hardware/display/VirtualDisplay;

    return-void
.end method

.method private synthetic lambda$changeCaptureFormat$0(II)V
    .locals 2

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {v0, p1, p2}, Lhms/webrtc/SurfaceTextureHelper;->setTextureSize(II)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Resizing virtual display to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "XYZ"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->virtualDisplay:Landroid/hardware/display/VirtualDisplay;

    const/16 v1, 0x190

    invoke-virtual {v0, p1, p2, v1}, Landroid/hardware/display/VirtualDisplay;->resize(III)V

    return-void
.end method


# virtual methods
.method public declared-synchronized changeCaptureFormat(III)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->checkNotDisposed()V

    iput p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->width:I

    iput p2, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->height:I

    iget-object p3, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->virtualDisplay:Landroid/hardware/display/VirtualDisplay;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p3, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object p3, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {p3}, Lhms/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object p3

    new-instance v0, Lcom/mapbox/maps/c;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/mapbox/maps/c;-><init>(Ljava/lang/Object;III)V

    invoke-static {p3, v0}, Lhms/webrtc/ThreadUtils;->invokeAtFrontUninterruptibly(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized dispose()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->isDisposed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public getMediaProjection()Landroid/media/projection/MediaProjection;
    .locals 1

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjection:Landroid/media/projection/MediaProjection;

    return-object v0
.end method

.method public getNumCapturedFrames()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->numCapturedFrames:J

    return-wide v0
.end method

.method public declared-synchronized initialize(Lhms/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lhms/webrtc/CapturerObserver;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->checkNotDisposed()V

    if-eqz p3, :cond_1

    iput-object p3, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->capturerObserver:Lhms/webrtc/CapturerObserver;

    if-eqz p1, :cond_0

    iput-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    const-string p1, "media_projection"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/projection/MediaProjectionManager;

    iput-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjectionManager:Landroid/media/projection/MediaProjectionManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "surfaceTextureHelper not set."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "capturerObserver not set."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public isScreencast()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onFrame(Lhms/webrtc/VideoFrame;)V
    .locals 4

    iget-wide v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->numCapturedFrames:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->numCapturedFrames:J

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->capturerObserver:Lhms/webrtc/CapturerObserver;

    invoke-interface {v0, p1}, Lhms/webrtc/CapturerObserver;->onFrameCaptured(Lhms/webrtc/VideoFrame;)V

    return-void
.end method

.method public declared-synchronized startCapture(III)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->checkNotDisposed()V

    iput p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->width:I

    iput p2, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->height:I

    iget-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjectionManager:Landroid/media/projection/MediaProjectionManager;

    iget-object p2, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjectionPermissionResultData:Landroid/content/Intent;

    const/4 p3, -0x1

    invoke-virtual {p1, p3, p2}, Landroid/media/projection/MediaProjectionManager;->getMediaProjection(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjection:Landroid/media/projection/MediaProjection;

    iget-object p2, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->mediaProjectionCallback:Landroid/media/projection/MediaProjection$Callback;

    iget-object p3, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {p3}, Lhms/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroid/media/projection/MediaProjection;->registerCallback(Landroid/media/projection/MediaProjection$Callback;Landroid/os/Handler;)V

    invoke-direct {p0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->createVirtualDisplay()V

    iget-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->capturerObserver:Lhms/webrtc/CapturerObserver;

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lhms/webrtc/CapturerObserver;->onCapturerStarted(Z)V

    iget-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {p1, p0}, Lhms/webrtc/SurfaceTextureHelper;->startListening(Lhms/webrtc/VideoSink;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized stopCapture()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->checkNotDisposed()V

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom;->surfaceTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {v0}, Lhms/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;

    invoke-direct {v1, p0}, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;-><init>(Llive/hms/video/services/ScreenCapturerAndroidCustom;)V

    invoke-static {v0, v1}, Lhms/webrtc/ThreadUtils;->invokeAtFrontUninterruptibly(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
