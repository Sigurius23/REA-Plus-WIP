.class Llive/hms/video/services/ScreenCapturerAndroidCustom$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/services/ScreenCapturerAndroidCustom;->stopCapture()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;


# direct methods
.method public constructor <init>(Llive/hms/video/services/ScreenCapturerAndroidCustom;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$000(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Lhms/webrtc/SurfaceTextureHelper;

    move-result-object v0

    invoke-virtual {v0}, Lhms/webrtc/SurfaceTextureHelper;->stopListening()V

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$100(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Lhms/webrtc/CapturerObserver;

    move-result-object v0

    invoke-interface {v0}, Lhms/webrtc/CapturerObserver;->onCapturerStopped()V

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$200(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Landroid/hardware/display/VirtualDisplay;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$200(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Landroid/hardware/display/VirtualDisplay;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/display/VirtualDisplay;->release()V

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v0, v1}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$202(Llive/hms/video/services/ScreenCapturerAndroidCustom;Landroid/hardware/display/VirtualDisplay;)Landroid/hardware/display/VirtualDisplay;

    :cond_0
    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$300(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Landroid/media/projection/MediaProjection;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$300(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Landroid/media/projection/MediaProjection;

    move-result-object v0

    iget-object v2, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v2}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$400(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Landroid/media/projection/MediaProjection$Callback;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/media/projection/MediaProjection;->unregisterCallback(Landroid/media/projection/MediaProjection$Callback;)V

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v0}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$300(Llive/hms/video/services/ScreenCapturerAndroidCustom;)Landroid/media/projection/MediaProjection;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/projection/MediaProjection;->stop()V

    iget-object v0, p0, Llive/hms/video/services/ScreenCapturerAndroidCustom$1;->this$0:Llive/hms/video/services/ScreenCapturerAndroidCustom;

    invoke-static {v0, v1}, Llive/hms/video/services/ScreenCapturerAndroidCustom;->access$302(Llive/hms/video/services/ScreenCapturerAndroidCustom;Landroid/media/projection/MediaProjection;)Landroid/media/projection/MediaProjection;

    :cond_1
    return-void
.end method
