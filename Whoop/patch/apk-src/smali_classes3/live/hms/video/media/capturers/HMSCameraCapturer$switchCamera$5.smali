.class public final Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/HMSCameraCapturer;->switchCamera(Ljava/lang/String;Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "live/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5",
        "Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;",
        "",
        "isFrontCamera",
        "Ll83/a0;",
        "onCameraSwitchDone",
        "(Z)V",
        "",
        "errorDescription",
        "onCameraSwitchError",
        "(Ljava/lang/String;)V",
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
.field final synthetic $deferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field

.field final synthetic $deviceId:Ljava/lang/String;

.field final synthetic $face:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

.field final synthetic $onAction:Llive/hms/video/sdk/HMSActionResultListener;

.field final synthetic this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;


# direct methods
.method public constructor <init>(Llive/hms/video/media/capturers/HMSCameraCapturer;Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;Lbc3/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/capturers/HMSCameraCapturer;",
            "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lbc3/s;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    iput-object p2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$face:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    iput-object p3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$deviceId:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$onAction:Llive/hms/video/sdk/HMSActionResultListener;

    iput-object p5, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$deferred:Lbc3/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCameraSwitchDone(Z)V
    .locals 1

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$getSettings$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$face:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    invoke-virtual {p1, v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->setCameraFacing(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$deviceId:Ljava/lang/String;

    invoke-static {p1, v0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$setCurrentCameraDeviceId$p(Llive/hms/video/media/capturers/HMSCameraCapturer;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$onAction:Llive/hms/video/sdk/HMSActionResultListener;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V

    :cond_0
    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$deferred:Lbc3/s;

    const/4 v0, 0x0

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-void
.end method

.method public onCameraSwitchError(Ljava/lang/String;)V
    .locals 9

    const-string v0, "errorDescription"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    sget-object v2, Llive/hms/video/error/ErrorFactory$Action;->TRACK:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v8}, Llive/hms/video/error/ErrorFactory$TracksErrors;->GenericTrack$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ZILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Llive/hms/video/error/HMSException;->setTerminal(Z)V

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$onAction:Llive/hms/video/sdk/HMSActionResultListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :cond_0
    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;->$deferred:Lbc3/s;

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, v3}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-void
.end method
