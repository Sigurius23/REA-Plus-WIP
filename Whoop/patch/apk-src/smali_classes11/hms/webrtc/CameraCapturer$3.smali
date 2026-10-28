.class Lhms/webrtc/CameraCapturer$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lhms/webrtc/CameraCapturer$3;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$3;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->j(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;

    move-result-object v0

    const-string v1, "Camera failed to start within timeout."

    invoke-interface {v0, v1}, Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;->onCameraError(Ljava/lang/String;)V

    return-void
.end method
