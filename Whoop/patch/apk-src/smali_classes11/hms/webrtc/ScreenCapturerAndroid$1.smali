.class Lhms/webrtc/ScreenCapturerAndroid$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/ScreenCapturerAndroid;->stopCapture()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/ScreenCapturerAndroid;


# direct methods
.method public constructor <init>(Lhms/webrtc/ScreenCapturerAndroid;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v0}, Lhms/webrtc/ScreenCapturerAndroid;->d(Lhms/webrtc/ScreenCapturerAndroid;)Lhms/webrtc/SurfaceTextureHelper;

    move-result-object v0

    invoke-virtual {v0}, Lhms/webrtc/SurfaceTextureHelper;->stopListening()V

    iget-object v0, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v0}, Lhms/webrtc/ScreenCapturerAndroid;->a(Lhms/webrtc/ScreenCapturerAndroid;)Lhms/webrtc/CapturerObserver;

    move-result-object v0

    invoke-interface {v0}, Lhms/webrtc/CapturerObserver;->onCapturerStopped()V

    iget-object v0, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v0}, Lhms/webrtc/ScreenCapturerAndroid;->e(Lhms/webrtc/ScreenCapturerAndroid;)Landroid/hardware/display/VirtualDisplay;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v0}, Lhms/webrtc/ScreenCapturerAndroid;->e(Lhms/webrtc/ScreenCapturerAndroid;)Landroid/hardware/display/VirtualDisplay;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/display/VirtualDisplay;->release()V

    iget-object v0, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v0}, Lhms/webrtc/ScreenCapturerAndroid;->g(Lhms/webrtc/ScreenCapturerAndroid;)V

    :cond_0
    iget-object v0, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v0}, Lhms/webrtc/ScreenCapturerAndroid;->b(Lhms/webrtc/ScreenCapturerAndroid;)Landroid/media/projection/MediaProjection;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v0}, Lhms/webrtc/ScreenCapturerAndroid;->b(Lhms/webrtc/ScreenCapturerAndroid;)Landroid/media/projection/MediaProjection;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v1}, Lhms/webrtc/ScreenCapturerAndroid;->c(Lhms/webrtc/ScreenCapturerAndroid;)Landroid/media/projection/MediaProjection$Callback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/projection/MediaProjection;->unregisterCallback(Landroid/media/projection/MediaProjection$Callback;)V

    iget-object v0, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v0}, Lhms/webrtc/ScreenCapturerAndroid;->b(Lhms/webrtc/ScreenCapturerAndroid;)Landroid/media/projection/MediaProjection;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/projection/MediaProjection;->stop()V

    iget-object v0, p0, Lhms/webrtc/ScreenCapturerAndroid$1;->this$0:Lhms/webrtc/ScreenCapturerAndroid;

    invoke-static {v0}, Lhms/webrtc/ScreenCapturerAndroid;->f(Lhms/webrtc/ScreenCapturerAndroid;)V

    :cond_1
    return-void
.end method
