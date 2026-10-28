.class Lhms/webrtc/CameraCapturer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/CameraSession$CreateSessionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/CameraCapturer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/CameraCapturer;


# direct methods
.method public constructor <init>(Lhms/webrtc/CameraCapturer;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDone(Lhms/webrtc/CameraSession;)V
    .locals 5

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->E(Lhms/webrtc/CameraCapturer;)V

    const-string v0, "CameraCapturer"

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->t(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraCapturer$SwitchState;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Create session done. Switch state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->u(Lhms/webrtc/CameraCapturer;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->o(Lhms/webrtc/CameraCapturer;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->q(Lhms/webrtc/CameraCapturer;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->f(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CapturerObserver;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lhms/webrtc/CapturerObserver;->onCapturerStarted(Z)V

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->B(Lhms/webrtc/CameraCapturer;)V

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1, p1}, Lhms/webrtc/CameraCapturer;->x(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraSession;)V

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    new-instance v2, Lhms/webrtc/CameraVideoCapturer$CameraStatistics;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->r(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/SurfaceTextureHelper;

    move-result-object v3

    iget-object v4, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v4}, Lhms/webrtc/CameraCapturer;->j(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lhms/webrtc/CameraVideoCapturer$CameraStatistics;-><init>(Lhms/webrtc/SurfaceTextureHelper;Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;)V

    invoke-static {v1, v2}, Lhms/webrtc/CameraCapturer;->w(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraStatistics;)V

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lhms/webrtc/CameraCapturer;->y(Lhms/webrtc/CameraCapturer;Z)V

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->q(Lhms/webrtc/CameraCapturer;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->t(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraCapturer$SwitchState;

    move-result-object v1

    sget-object v2, Lhms/webrtc/CameraCapturer$SwitchState;->IN_PROGRESS:Lhms/webrtc/CameraCapturer$SwitchState;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    sget-object v2, Lhms/webrtc/CameraCapturer$SwitchState;->IDLE:Lhms/webrtc/CameraCapturer$SwitchState;

    invoke-static {v1, v2}, Lhms/webrtc/CameraCapturer;->D(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraCapturer$SwitchState;)V

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->s(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->s(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    move-result-object v1

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v2}, Lhms/webrtc/CameraCapturer;->b(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraEnumerator;

    move-result-object v2

    iget-object v3, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v3}, Lhms/webrtc/CameraCapturer;->c(Lhms/webrtc/CameraCapturer;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lhms/webrtc/CameraEnumerator;->isFrontFacing(Ljava/lang/String;)Z

    move-result v2

    invoke-interface {v1, v2}, Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;->onCameraSwitchDone(Z)V

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->C(Lhms/webrtc/CameraCapturer;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->t(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraCapturer$SwitchState;

    move-result-object v1

    sget-object v2, Lhms/webrtc/CameraCapturer$SwitchState;->PENDING:Lhms/webrtc/CameraCapturer$SwitchState;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->p(Lhms/webrtc/CameraCapturer;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v2}, Lhms/webrtc/CameraCapturer;->A(Lhms/webrtc/CameraCapturer;)V

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    sget-object v3, Lhms/webrtc/CameraCapturer$SwitchState;->IDLE:Lhms/webrtc/CameraCapturer$SwitchState;

    invoke-static {v2, v3}, Lhms/webrtc/CameraCapturer;->D(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraCapturer$SwitchState;)V

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v2}, Lhms/webrtc/CameraCapturer;->s(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lhms/webrtc/CameraCapturer;->H(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->h(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->h(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;

    move-result-object v1

    invoke-interface {v1, p1}, Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;->onSetupDone(Lhms/webrtc/CameraSession;)V

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onFailure(Lhms/webrtc/CameraSession$FailureType;Ljava/lang/String;)V
    .locals 5

    const-string v0, "Opening camera failed, retry: "

    const-string v1, "Opening camera failed, passing: "

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v2}, Lhms/webrtc/CameraCapturer;->E(Lhms/webrtc/CameraCapturer;)V

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v2}, Lhms/webrtc/CameraCapturer;->u(Lhms/webrtc/CameraCapturer;)Landroid/os/Handler;

    move-result-object v2

    iget-object v3, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v3}, Lhms/webrtc/CameraCapturer;->o(Lhms/webrtc/CameraCapturer;)Ljava/lang/Runnable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v2}, Lhms/webrtc/CameraCapturer;->q(Lhms/webrtc/CameraCapturer;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v3}, Lhms/webrtc/CameraCapturer;->f(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CapturerObserver;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Lhms/webrtc/CapturerObserver;->onCapturerStarted(Z)V

    iget-object v3, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v3}, Lhms/webrtc/CameraCapturer;->n(Lhms/webrtc/CameraCapturer;)I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-static {v3, v4}, Lhms/webrtc/CameraCapturer;->z(Lhms/webrtc/CameraCapturer;I)V

    iget-object v3, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v3}, Lhms/webrtc/CameraCapturer;->n(Lhms/webrtc/CameraCapturer;)I

    move-result v3

    if-gtz v3, :cond_3

    const-string v0, "CameraCapturer"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->B(Lhms/webrtc/CameraCapturer;)V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->q(Lhms/webrtc/CameraCapturer;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->t(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraCapturer$SwitchState;

    move-result-object v0

    sget-object v1, Lhms/webrtc/CameraCapturer$SwitchState;->IDLE:Lhms/webrtc/CameraCapturer$SwitchState;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->s(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->s(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    move-result-object v0

    invoke-interface {v0, p2}, Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;->onCameraSwitchError(Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->C(Lhms/webrtc/CameraCapturer;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v0, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0, v1}, Lhms/webrtc/CameraCapturer;->D(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraCapturer$SwitchState;)V

    :cond_1
    sget-object v0, Lhms/webrtc/CameraSession$FailureType;->DISCONNECTED:Lhms/webrtc/CameraSession$FailureType;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {p1}, Lhms/webrtc/CameraCapturer;->j(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;

    move-result-object p1

    invoke-interface {p1}, Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;->onCameraDisconnected()V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {p1}, Lhms/webrtc/CameraCapturer;->j(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;

    move-result-object p1

    invoke-interface {p1, p2}, Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;->onCameraError(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string p1, "CameraCapturer"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lhms/webrtc/CameraCapturer$1;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {p1}, Lhms/webrtc/CameraCapturer;->F(Lhms/webrtc/CameraCapturer;)V

    :goto_1
    monitor-exit v2

    return-void

    :goto_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
