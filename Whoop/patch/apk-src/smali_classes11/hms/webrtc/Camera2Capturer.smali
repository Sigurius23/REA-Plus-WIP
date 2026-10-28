.class public Lhms/webrtc/Camera2Capturer;
.super Lhms/webrtc/CameraCapturer;
.source "SourceFile"


# instance fields
.field private final cameraManager:Landroid/hardware/camera2/CameraManager;

.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;)V
    .locals 1

    new-instance v0, Lhms/webrtc/Camera2Enumerator;

    invoke-direct {v0, p1}, Lhms/webrtc/Camera2Enumerator;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p2, p3, v0, p4}, Lhms/webrtc/CameraCapturer;-><init>(Ljava/lang/String;Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;Lhms/webrtc/CameraEnumerator;Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;)V

    iput-object p1, p0, Lhms/webrtc/Camera2Capturer;->context:Landroid/content/Context;

    const-string p2, "camera"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CameraManager;

    iput-object p1, p0, Lhms/webrtc/Camera2Capturer;->cameraManager:Landroid/hardware/camera2/CameraManager;

    return-void
.end method


# virtual methods
.method public bridge synthetic changeCaptureFormat(III)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lhms/webrtc/CameraCapturer;->changeCaptureFormat(III)V

    return-void
.end method

.method public createCameraSession(Lhms/webrtc/CameraSession$CreateSessionCallback;Lhms/webrtc/CameraSession$Events;Landroid/content/Context;Lhms/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V
    .locals 9

    iget-object v3, p0, Lhms/webrtc/Camera2Capturer;->cameraManager:Landroid/hardware/camera2/CameraManager;

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-static/range {v0 .. v8}, Lhms/webrtc/Camera2Session;->create(Lhms/webrtc/CameraSession$CreateSessionCallback;Lhms/webrtc/CameraSession$Events;Landroid/content/Context;Landroid/hardware/camera2/CameraManager;Lhms/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V

    return-void
.end method

.method public bridge synthetic dispose()V
    .locals 0

    invoke-super {p0}, Lhms/webrtc/CameraCapturer;->dispose()V

    return-void
.end method

.method public bridge synthetic initialize(Lhms/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lhms/webrtc/CapturerObserver;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lhms/webrtc/CameraCapturer;->initialize(Lhms/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lhms/webrtc/CapturerObserver;)V

    return-void
.end method

.method public bridge synthetic isScreencast()Z
    .locals 1

    invoke-super {p0}, Lhms/webrtc/CameraCapturer;->isScreencast()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic printStackTrace()V
    .locals 0

    invoke-super {p0}, Lhms/webrtc/CameraCapturer;->printStackTrace()V

    return-void
.end method

.method public bridge synthetic startCapture(III)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lhms/webrtc/CameraCapturer;->startCapture(III)V

    return-void
.end method

.method public bridge synthetic stopCapture()V
    .locals 0

    invoke-super {p0}, Lhms/webrtc/CameraCapturer;->stopCapture()V

    return-void
.end method

.method public bridge synthetic switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lhms/webrtc/CameraCapturer;->switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    return-void
.end method

.method public bridge synthetic switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lhms/webrtc/CameraCapturer;->switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V

    return-void
.end method
