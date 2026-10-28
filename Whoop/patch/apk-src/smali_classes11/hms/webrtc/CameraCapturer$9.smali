.class Lhms/webrtc/CameraCapturer$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/CameraCapturer;->switchCameraInternal(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/CameraCapturer;

.field final synthetic val$oldSession:Lhms/webrtc/CameraSession;


# direct methods
.method public constructor <init>(Lhms/webrtc/CameraCapturer;Lhms/webrtc/CameraSession;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/CameraCapturer$9;->this$0:Lhms/webrtc/CameraCapturer;

    iput-object p2, p0, Lhms/webrtc/CameraCapturer$9;->val$oldSession:Lhms/webrtc/CameraSession;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$9;->val$oldSession:Lhms/webrtc/CameraSession;

    invoke-interface {v0}, Lhms/webrtc/CameraSession;->stop()V

    return-void
.end method
