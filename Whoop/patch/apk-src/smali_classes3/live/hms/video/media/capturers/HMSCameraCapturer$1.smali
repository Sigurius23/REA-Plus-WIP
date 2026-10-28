.class public final Llive/hms/video/media/capturers/HMSCameraCapturer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/HMSCameraCapturer;-><init>(Landroid/content/Context;Lhms/webrtc/VideoSource;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\t\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J\u000f\u0010\u000c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0008J\u000f\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "live/hms/video/media/capturers/HMSCameraCapturer$1",
        "Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;",
        "",
        "errorDescription",
        "Ll83/a0;",
        "onCameraError",
        "(Ljava/lang/String;)V",
        "onCameraDisconnected",
        "()V",
        "onCameraFreezed",
        "cameraName",
        "onCameraOpening",
        "onFirstFrameAvailable",
        "onCameraClosed",
        "logPrefix",
        "Ljava/lang/String;",
        "getLogPrefix",
        "()Ljava/lang/String;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final logPrefix:Ljava/lang/String;

.field final synthetic this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;


# direct methods
.method public constructor <init>(Llive/hms/video/media/capturers/HMSCameraCapturer;)V
    .locals 2

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DeviceName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$getCurrentCameraDeviceId$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " CameraVideoCapturer.CameraEventsHandler."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->logPrefix:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getLogPrefix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->logPrefix:Ljava/lang/String;

    return-object v0
.end method

.method public onCameraClosed()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->logPrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "onCameraClosed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSVideoCapturer"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onCameraDisconnected()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->logPrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "onCameraDisconnected"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSVideoCapturer"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-virtual {v0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {v0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$getStoppingDeliberately$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$setCameraLostWhileActive$p(Llive/hms/video/media/capturers/HMSCameraCapturer;Z)V

    :cond_0
    return-void
.end method

.method public onCameraError(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->logPrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "onCameraError: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSVideoCapturer"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-virtual {p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$getStoppingDeliberately$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$setCameraLostWhileActive$p(Llive/hms/video/media/capturers/HMSCameraCapturer;Z)V

    :cond_0
    return-void
.end method

.method public onCameraFreezed(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->logPrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "onCameraFreezed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSVideoCapturer"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onCameraOpening(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->logPrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "onCameraOpening: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSVideoCapturer"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onFirstFrameAvailable()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$1;->logPrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "onFirstFrameAvailable"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSVideoCapturer"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
