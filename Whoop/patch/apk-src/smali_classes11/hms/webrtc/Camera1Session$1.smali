.class Lhms/webrtc/Camera1Session$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$ErrorCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/Camera1Session;->startCapturing()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/Camera1Session;


# direct methods
.method public constructor <init>(Lhms/webrtc/Camera1Session;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/Camera1Session$1;->this$0:Lhms/webrtc/Camera1Session;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILandroid/hardware/Camera;)V
    .locals 1

    const/16 p2, 0x64

    if-ne p1, p2, :cond_0

    const-string p2, "Camera server died!"

    goto :goto_0

    :cond_0
    const-string p2, "Camera error: "

    invoke-static {p1, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :goto_0
    const-string v0, "Camera1Session"

    invoke-static {v0, p2}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/Camera1Session$1;->this$0:Lhms/webrtc/Camera1Session;

    invoke-static {v0}, Lhms/webrtc/Camera1Session;->l(Lhms/webrtc/Camera1Session;)V

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lhms/webrtc/Camera1Session$1;->this$0:Lhms/webrtc/Camera1Session;

    invoke-static {p1}, Lhms/webrtc/Camera1Session;->f(Lhms/webrtc/Camera1Session;)Lhms/webrtc/CameraSession$Events;

    move-result-object p1

    iget-object p2, p0, Lhms/webrtc/Camera1Session$1;->this$0:Lhms/webrtc/Camera1Session;

    invoke-interface {p1, p2}, Lhms/webrtc/CameraSession$Events;->onCameraDisconnected(Lhms/webrtc/CameraSession;)V

    return-void

    :cond_1
    iget-object p1, p0, Lhms/webrtc/Camera1Session$1;->this$0:Lhms/webrtc/Camera1Session;

    invoke-static {p1}, Lhms/webrtc/Camera1Session;->f(Lhms/webrtc/Camera1Session;)Lhms/webrtc/CameraSession$Events;

    move-result-object p1

    iget-object v0, p0, Lhms/webrtc/Camera1Session$1;->this$0:Lhms/webrtc/Camera1Session;

    invoke-interface {p1, v0, p2}, Lhms/webrtc/CameraSession$Events;->onCameraError(Lhms/webrtc/CameraSession;Ljava/lang/String;)V

    return-void
.end method
