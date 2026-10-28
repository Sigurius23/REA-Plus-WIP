.class Lhms/webrtc/CameraCapturer$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/CameraCapturer;->createSessionInternal(I)V
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

    iput-object p1, p0, Lhms/webrtc/CameraCapturer$5;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    iget-object v0, p0, Lhms/webrtc/CameraCapturer$5;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v0}, Lhms/webrtc/CameraCapturer;->g(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraSession$CreateSessionCallback;

    move-result-object v1

    iget-object v2, p0, Lhms/webrtc/CameraCapturer$5;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v2}, Lhms/webrtc/CameraCapturer;->d(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/CameraSession$Events;

    move-result-object v2

    iget-object v3, p0, Lhms/webrtc/CameraCapturer$5;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v3}, Lhms/webrtc/CameraCapturer;->a(Lhms/webrtc/CameraCapturer;)Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lhms/webrtc/CameraCapturer$5;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v4}, Lhms/webrtc/CameraCapturer;->r(Lhms/webrtc/CameraCapturer;)Lhms/webrtc/SurfaceTextureHelper;

    move-result-object v4

    iget-object v5, p0, Lhms/webrtc/CameraCapturer$5;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v5}, Lhms/webrtc/CameraCapturer;->c(Lhms/webrtc/CameraCapturer;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lhms/webrtc/CameraCapturer$5;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v6}, Lhms/webrtc/CameraCapturer;->v(Lhms/webrtc/CameraCapturer;)I

    move-result v6

    iget-object v7, p0, Lhms/webrtc/CameraCapturer$5;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v7}, Lhms/webrtc/CameraCapturer;->m(Lhms/webrtc/CameraCapturer;)I

    move-result v7

    iget-object v8, p0, Lhms/webrtc/CameraCapturer$5;->this$0:Lhms/webrtc/CameraCapturer;

    invoke-static {v8}, Lhms/webrtc/CameraCapturer;->l(Lhms/webrtc/CameraCapturer;)I

    move-result v8

    invoke-virtual/range {v0 .. v8}, Lhms/webrtc/CameraCapturer;->createCameraSession(Lhms/webrtc/CameraSession$CreateSessionCallback;Lhms/webrtc/CameraSession$Events;Landroid/content/Context;Lhms/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V

    return-void
.end method
