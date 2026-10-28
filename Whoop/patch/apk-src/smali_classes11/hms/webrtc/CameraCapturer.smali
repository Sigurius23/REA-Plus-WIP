.class abstract Lhms/webrtc/CameraCapturer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/CameraVideoCapturer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/CameraCapturer$SwitchState;
    }
.end annotation


# static fields
.field private static final MAX_OPEN_CAMERA_ATTEMPTS:I = 0x3

.field private static final OPEN_CAMERA_DELAY_MS:I = 0x1f4

.field private static final OPEN_CAMERA_TIMEOUT:I = 0x2710

.field private static final TAG:Ljava/lang/String; = "CameraCapturer"


# instance fields
.field private applicationContext:Landroid/content/Context;

.field private final cameraEnumerator:Lhms/webrtc/CameraEnumerator;

.field private cameraName:Ljava/lang/String;

.field private final cameraSessionEventsHandler:Lhms/webrtc/CameraSession$Events;

.field private cameraStatistics:Lhms/webrtc/CameraVideoCapturer$CameraStatistics;

.field private cameraThreadHandler:Landroid/os/Handler;

.field private capturerObserver:Lhms/webrtc/CapturerObserver;

.field private final createSessionCallback:Lhms/webrtc/CameraSession$CreateSessionCallback;

.field private final currentCameraSession:Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;

.field private currentSession:Lhms/webrtc/CameraSession;

.field private final eventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;

.field private firstFrameObserved:Z

.field private framerate:I

.field private height:I

.field private openAttemptsRemaining:I

.field private final openCameraTimeoutRunnable:Ljava/lang/Runnable;

.field private pendingCameraName:Ljava/lang/String;

.field private sessionOpening:Z

.field private final stateLock:Ljava/lang/Object;

.field private surfaceHelper:Lhms/webrtc/SurfaceTextureHelper;

.field private switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

.field private switchState:Lhms/webrtc/CameraCapturer$SwitchState;

.field private final uiThreadHandler:Landroid/os/Handler;

.field private width:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;Lhms/webrtc/CameraEnumerator;Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhms/webrtc/CameraCapturer$1;

    invoke-direct {v0, p0}, Lhms/webrtc/CameraCapturer$1;-><init>(Lhms/webrtc/CameraCapturer;)V

    iput-object v0, p0, Lhms/webrtc/CameraCapturer;->createSessionCallback:Lhms/webrtc/CameraSession$CreateSessionCallback;

    new-instance v0, Lhms/webrtc/CameraCapturer$2;

    invoke-direct {v0, p0}, Lhms/webrtc/CameraCapturer$2;-><init>(Lhms/webrtc/CameraCapturer;)V

    iput-object v0, p0, Lhms/webrtc/CameraCapturer;->cameraSessionEventsHandler:Lhms/webrtc/CameraSession$Events;

    new-instance v0, Lhms/webrtc/CameraCapturer$3;

    invoke-direct {v0, p0}, Lhms/webrtc/CameraCapturer$3;-><init>(Lhms/webrtc/CameraCapturer;)V

    iput-object v0, p0, Lhms/webrtc/CameraCapturer;->openCameraTimeoutRunnable:Ljava/lang/Runnable;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lhms/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    sget-object v0, Lhms/webrtc/CameraCapturer$SwitchState;->IDLE:Lhms/webrtc/CameraCapturer$SwitchState;

    iput-object v0, p0, Lhms/webrtc/CameraCapturer;->switchState:Lhms/webrtc/CameraCapturer$SwitchState;

    if-nez p2, :cond_0

    new-instance p2, Lhms/webrtc/CameraCapturer$4;

    invoke-direct {p2, p0}, Lhms/webrtc/CameraCapturer$4;-><init>(Lhms/webrtc/CameraCapturer;)V

    :cond_0
    iput-object p2, p0, Lhms/webrtc/CameraCapturer;->eventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;

    iput-object p3, p0, Lhms/webrtc/CameraCapturer;->cameraEnumerator:Lhms/webrtc/CameraEnumerator;

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    iput-object p4, p0, Lhms/webrtc/CameraCapturer;->currentCameraSession:Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;

    invoke-interface {p3}, Lhms/webrtc/CameraEnumerator;->getDeviceNames()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lhms/webrtc/CameraCapturer;->uiThreadHandler:Landroid/os/Handler;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lhms/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    iget-object p2, p0, Lhms/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    const-string p3, "Camera name "

    const-string p4, " does not match any known camera device."

    invoke-static {p3, p2, p4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "No cameras attached."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic A(Lhms/webrtc/CameraCapturer;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lhms/webrtc/CameraCapturer;->pendingCameraName:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic B(Lhms/webrtc/CameraCapturer;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhms/webrtc/CameraCapturer;->sessionOpening:Z

    return-void
.end method

.method public static bridge synthetic C(Lhms/webrtc/CameraCapturer;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lhms/webrtc/CameraCapturer;->switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    return-void
.end method

.method public static bridge synthetic D(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraCapturer$SwitchState;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->switchState:Lhms/webrtc/CameraCapturer$SwitchState;

    return-void
.end method

.method public static bridge synthetic E(Lhms/webrtc/CameraCapturer;)V
    .locals 0

    invoke-direct {p0}, Lhms/webrtc/CameraCapturer;->checkIsOnCameraThread()V

    return-void
.end method

.method public static bridge synthetic F(Lhms/webrtc/CameraCapturer;)V
    .locals 1

    const/16 v0, 0x1f4

    invoke-direct {p0, v0}, Lhms/webrtc/CameraCapturer;->createSessionInternal(I)V

    return-void
.end method

.method public static bridge synthetic G(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
    .locals 1

    const-string v0, "No camera to switch to."

    invoke-direct {p0, v0, p1}, Lhms/webrtc/CameraCapturer;->reportCameraSwitchError(Ljava/lang/String;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    return-void
.end method

.method public static bridge synthetic H(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhms/webrtc/CameraCapturer;->switchCameraInternal(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic a(Lhms/webrtc/CameraCapturer;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->applicationContext:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic b(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraEnumerator;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->cameraEnumerator:Lhms/webrtc/CameraEnumerator;

    return-object p0
.end method

.method public static bridge synthetic c(Lhms/webrtc/CameraCapturer;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    return-object p0
.end method

.method private checkIsOnCameraThread()V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "CameraCapturer"

    const-string v1, "Check is on camera thread failed."

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Not on camera thread."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private createSessionInternal(I)V
    .locals 4

    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->uiThreadHandler:Landroid/os/Handler;

    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->openCameraTimeoutRunnable:Ljava/lang/Runnable;

    add-int/lit16 v2, p1, 0x2710

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    new-instance v1, Lhms/webrtc/CameraCapturer$5;

    invoke-direct {v1, p0}, Lhms/webrtc/CameraCapturer$5;-><init>(Lhms/webrtc/CameraCapturer;)V

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static bridge synthetic d(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraSession$Events;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->cameraSessionEventsHandler:Lhms/webrtc/CameraSession$Events;

    return-object p0
.end method

.method public static bridge synthetic e(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraStatistics;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->cameraStatistics:Lhms/webrtc/CameraVideoCapturer$CameraStatistics;

    return-object p0
.end method

.method public static bridge synthetic f(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CapturerObserver;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->capturerObserver:Lhms/webrtc/CapturerObserver;

    return-object p0
.end method

.method public static bridge synthetic g(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraSession$CreateSessionCallback;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->createSessionCallback:Lhms/webrtc/CameraSession$CreateSessionCallback;

    return-object p0
.end method

.method public static bridge synthetic h(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->currentCameraSession:Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;

    return-object p0
.end method

.method public static bridge synthetic i(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraSession;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->currentSession:Lhms/webrtc/CameraSession;

    return-object p0
.end method

.method public static bridge synthetic j(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->eventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;

    return-object p0
.end method

.method public static bridge synthetic k(Lhms/webrtc/CameraCapturer;)Z
    .locals 0

    iget-boolean p0, p0, Lhms/webrtc/CameraCapturer;->firstFrameObserved:Z

    return p0
.end method

.method public static bridge synthetic l(Lhms/webrtc/CameraCapturer;)I
    .locals 0

    iget p0, p0, Lhms/webrtc/CameraCapturer;->framerate:I

    return p0
.end method

.method public static bridge synthetic m(Lhms/webrtc/CameraCapturer;)I
    .locals 0

    iget p0, p0, Lhms/webrtc/CameraCapturer;->height:I

    return p0
.end method

.method public static bridge synthetic n(Lhms/webrtc/CameraCapturer;)I
    .locals 0

    iget p0, p0, Lhms/webrtc/CameraCapturer;->openAttemptsRemaining:I

    return p0
.end method

.method public static bridge synthetic o(Lhms/webrtc/CameraCapturer;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->openCameraTimeoutRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static bridge synthetic p(Lhms/webrtc/CameraCapturer;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->pendingCameraName:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic q(Lhms/webrtc/CameraCapturer;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic r(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/SurfaceTextureHelper;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->surfaceHelper:Lhms/webrtc/SurfaceTextureHelper;

    return-object p0
.end method

.method private reportCameraSwitchError(Ljava/lang/String;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
    .locals 1

    const-string v0, "CameraCapturer"

    invoke-static {v0, p1}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;->onCameraSwitchError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic s(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    return-object p0
.end method

.method private switchCameraInternal(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V
    .locals 4

    const-string v0, "CameraCapturer"

    const-string v1, "switchCamera internal"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->cameraEnumerator:Lhms/webrtc/CameraEnumerator;

    invoke-interface {v0}, Lhms/webrtc/CameraEnumerator;->getDeviceNames()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Attempted to switch to unknown camera device "

    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lhms/webrtc/CameraCapturer;->reportCameraSwitchError(Ljava/lang/String;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    return-void

    :cond_0
    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->switchState:Lhms/webrtc/CameraCapturer$SwitchState;

    sget-object v2, Lhms/webrtc/CameraCapturer$SwitchState;->IDLE:Lhms/webrtc/CameraCapturer$SwitchState;

    if-eq v1, v2, :cond_1

    const-string p2, "Camera switch already in progress."

    invoke-direct {p0, p2, p1}, Lhms/webrtc/CameraCapturer;->reportCameraSwitchError(Ljava/lang/String;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, Lhms/webrtc/CameraCapturer;->sessionOpening:Z

    if-nez v1, :cond_2

    iget-object v2, p0, Lhms/webrtc/CameraCapturer;->currentSession:Lhms/webrtc/CameraSession;

    if-nez v2, :cond_2

    const-string p2, "switchCamera: camera is not running."

    invoke-direct {p0, p2, p1}, Lhms/webrtc/CameraCapturer;->reportCameraSwitchError(Ljava/lang/String;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    monitor-exit v0

    return-void

    :cond_2
    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    if-eqz v1, :cond_3

    sget-object p1, Lhms/webrtc/CameraCapturer$SwitchState;->PENDING:Lhms/webrtc/CameraCapturer$SwitchState;

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->switchState:Lhms/webrtc/CameraCapturer$SwitchState;

    iput-object p2, p0, Lhms/webrtc/CameraCapturer;->pendingCameraName:Ljava/lang/String;

    monitor-exit v0

    return-void

    :cond_3
    sget-object p1, Lhms/webrtc/CameraCapturer$SwitchState;->IN_PROGRESS:Lhms/webrtc/CameraCapturer$SwitchState;

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->switchState:Lhms/webrtc/CameraCapturer$SwitchState;

    const-string p1, "CameraCapturer"

    const-string v1, "switchCamera: Stopping session"

    invoke-static {p1, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lhms/webrtc/CameraCapturer;->cameraStatistics:Lhms/webrtc/CameraVideoCapturer$CameraStatistics;

    invoke-virtual {p1}, Lhms/webrtc/CameraVideoCapturer$CameraStatistics;->release()V

    const/4 p1, 0x0

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->cameraStatistics:Lhms/webrtc/CameraVideoCapturer$CameraStatistics;

    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->currentSession:Lhms/webrtc/CameraSession;

    iget-object v2, p0, Lhms/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    new-instance v3, Lhms/webrtc/CameraCapturer$9;

    invoke-direct {v3, p0, v1}, Lhms/webrtc/CameraCapturer$9;-><init>(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraSession;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->currentSession:Lhms/webrtc/CameraSession;

    iput-object p2, p0, Lhms/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhms/webrtc/CameraCapturer;->sessionOpening:Z

    iput p1, p0, Lhms/webrtc/CameraCapturer;->openAttemptsRemaining:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lhms/webrtc/CameraCapturer;->createSessionInternal(I)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string p1, "CameraCapturer"

    const-string p2, "switchCamera done"

    invoke-static {p1, p2}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static bridge synthetic t(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraCapturer$SwitchState;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->switchState:Lhms/webrtc/CameraCapturer$SwitchState;

    return-object p0
.end method

.method public static bridge synthetic u(Lhms/webrtc/CameraCapturer;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/CameraCapturer;->uiThreadHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic v(Lhms/webrtc/CameraCapturer;)I
    .locals 0

    iget p0, p0, Lhms/webrtc/CameraCapturer;->width:I

    return p0
.end method

.method public static bridge synthetic w(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraStatistics;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->cameraStatistics:Lhms/webrtc/CameraVideoCapturer$CameraStatistics;

    return-void
.end method

.method public static bridge synthetic x(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraSession;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->currentSession:Lhms/webrtc/CameraSession;

    return-void
.end method

.method public static bridge synthetic y(Lhms/webrtc/CameraCapturer;Z)V
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/CameraCapturer;->firstFrameObserved:Z

    return-void
.end method

.method public static bridge synthetic z(Lhms/webrtc/CameraCapturer;I)V
    .locals 0

    iput p1, p0, Lhms/webrtc/CameraCapturer;->openAttemptsRemaining:I

    return-void
.end method


# virtual methods
.method public changeCaptureFormat(III)V
    .locals 4

    const-string v0, "CameraCapturer"

    const-string v1, "changeCaptureFormat: "

    const-string v2, "x"

    const-string v3, "@"

    invoke-static {p1, p2, v1, v2, v3}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lhms/webrtc/CameraCapturer;->stopCapture()V

    invoke-virtual {p0, p1, p2, p3}, Lhms/webrtc/CameraCapturer;->startCapture(III)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public abstract createCameraSession(Lhms/webrtc/CameraSession$CreateSessionCallback;Lhms/webrtc/CameraSession$Events;Landroid/content/Context;Lhms/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V
.end method

.method public dispose()V
    .locals 2

    const-string v0, "CameraCapturer"

    const-string v1, "dispose"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhms/webrtc/CameraCapturer;->stopCapture()V

    return-void
.end method

.method public getCameraName()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->cameraName:Ljava/lang/String;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public initialize(Lhms/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lhms/webrtc/CapturerObserver;)V
    .locals 0

    iput-object p2, p0, Lhms/webrtc/CameraCapturer;->applicationContext:Landroid/content/Context;

    iput-object p3, p0, Lhms/webrtc/CameraCapturer;->capturerObserver:Lhms/webrtc/CapturerObserver;

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->surfaceHelper:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {p1}, Lhms/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lhms/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    return-void
.end method

.method public isScreencast()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public printStackTrace()V
    .locals 5

    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    array-length v1, v0

    if-lez v1, :cond_1

    const-string v1, "CameraCapturer stack trace:"

    const-string v2, "CameraCapturer"

    invoke-static {v2, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public startCapture(III)V
    .locals 4

    const-string v0, "CameraCapturer"

    const-string v1, "startCapture: "

    const-string v2, "x"

    const-string v3, "@"

    invoke-static {p1, p2, v1, v2, v3}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->applicationContext:Landroid/content/Context;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lhms/webrtc/CameraCapturer;->sessionOpening:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->currentSession:Lhms/webrtc/CameraSession;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lhms/webrtc/CameraCapturer;->width:I

    iput p2, p0, Lhms/webrtc/CameraCapturer;->height:I

    iput p3, p0, Lhms/webrtc/CameraCapturer;->framerate:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhms/webrtc/CameraCapturer;->sessionOpening:Z

    const/4 p1, 0x3

    iput p1, p0, Lhms/webrtc/CameraCapturer;->openAttemptsRemaining:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lhms/webrtc/CameraCapturer;->createSessionInternal(I)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "CameraCapturer"

    const-string p2, "Session already open"

    invoke-static {p1, p2}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "CameraCapturer must be initialized before calling startCapture."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public stopCapture()V
    .locals 5

    const-string v0, "CameraCapturer"

    const-string v1, "Stop capture"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lhms/webrtc/CameraCapturer;->sessionOpening:Z

    if-eqz v1, :cond_0

    const-string v1, "CameraCapturer"

    const-string v2, "Stop capture: Waiting for session to open"

    invoke-static {v1, v2}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->stateLock:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    :try_start_2
    const-string v1, "CameraCapturer"

    const-string v2, "Stop capture interrupted while waiting for the session to open."

    invoke-static {v1, v2}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->currentSession:Lhms/webrtc/CameraSession;

    if-eqz v1, :cond_1

    const-string v1, "CameraCapturer"

    const-string v2, "Stop capture: Nulling session"

    invoke-static {v1, v2}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->cameraStatistics:Lhms/webrtc/CameraVideoCapturer$CameraStatistics;

    invoke-virtual {v1}, Lhms/webrtc/CameraVideoCapturer$CameraStatistics;->release()V

    const/4 v1, 0x0

    iput-object v1, p0, Lhms/webrtc/CameraCapturer;->cameraStatistics:Lhms/webrtc/CameraVideoCapturer$CameraStatistics;

    iget-object v2, p0, Lhms/webrtc/CameraCapturer;->currentSession:Lhms/webrtc/CameraSession;

    iget-object v3, p0, Lhms/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    new-instance v4, Lhms/webrtc/CameraCapturer$6;

    invoke-direct {v4, p0, v2}, Lhms/webrtc/CameraCapturer$6;-><init>(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraSession;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iput-object v1, p0, Lhms/webrtc/CameraCapturer;->currentSession:Lhms/webrtc/CameraSession;

    iget-object v1, p0, Lhms/webrtc/CameraCapturer;->capturerObserver:Lhms/webrtc/CapturerObserver;

    invoke-interface {v1}, Lhms/webrtc/CapturerObserver;->onCapturerStopped()V

    goto :goto_1

    :cond_1
    const-string v1, "CameraCapturer"

    const-string v2, "Stop capture: No session open"

    invoke-static {v1, v2}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v0, "CameraCapturer"

    const-string v1, "Stop capture done"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
    .locals 2

    .line 1
    const-string v0, "CameraCapturer"

    const-string v1, "switchCamera"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    new-instance v1, Lhms/webrtc/CameraCapturer$7;

    invoke-direct {v1, p0, p1}, Lhms/webrtc/CameraCapturer$7;-><init>(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V
    .locals 2

    .line 3
    const-string v0, "CameraCapturer"

    const-string v1, "switchCamera"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lhms/webrtc/CameraCapturer;->cameraThreadHandler:Landroid/os/Handler;

    new-instance v1, Lhms/webrtc/CameraCapturer$8;

    invoke-direct {v1, p0, p1, p2}, Lhms/webrtc/CameraCapturer$8;-><init>(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
