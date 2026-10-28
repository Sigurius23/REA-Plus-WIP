.class Lhms/webrtc/CameraCapturer$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/CameraCapturer;->switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/CameraCapturer;

.field final synthetic val$switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;


# direct methods
.method public constructor <init>(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/CameraCapturer$7;->this$0:Lhms/webrtc/CameraCapturer;

    iput-object p2, p0, Lhms/webrtc/CameraCapturer$7;->val$switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$7;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->b(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraEnumerator;

    move-result-object v0

    invoke-interface {v0}, Lhms/webrtc/CameraEnumerator;->getDeviceNames()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$7;->this$0:Lhms/webrtc/CameraCapturer;

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$7;->val$switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    invoke-static {v0, v1}, Lhms/webrtc/CameraCapturer;->G(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V

    return-void

    :cond_0
    iget-object v1, p0, Lhms/webrtc/CameraCapturer$7;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v1}, Lhms/webrtc/CameraCapturer;->c(Lhms/webrtc/CameraCapturer;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    rem-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$7;->this$0:Lhms/webrtc/CameraCapturer;

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$7;->val$switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    invoke-static {v1, v2, v0}, Lhms/webrtc/CameraCapturer;->H(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V

    return-void
.end method
