.class Lhms/webrtc/CameraCapturer$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/CameraCapturer;->switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/CameraCapturer;

.field final synthetic val$cameraName:Ljava/lang/String;

.field final synthetic val$switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;


# direct methods
.method public constructor <init>(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/CameraCapturer$8;->this$0:Lhms/webrtc/CameraCapturer;

    iput-object p2, p0, Lhms/webrtc/CameraCapturer$8;->val$switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    iput-object p3, p0, Lhms/webrtc/CameraCapturer$8;->val$cameraName:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$8;->this$0:Lhms/webrtc/CameraCapturer;

    iget-object v1, p0, Lhms/webrtc/CameraCapturer$8;->val$switchEventsHandler:Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$8;->val$cameraName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lhms/webrtc/CameraCapturer;->H(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V

    return-void
.end method
