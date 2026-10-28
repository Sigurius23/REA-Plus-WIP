.class Lhms/webrtc/SurfaceTextureHelper$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/TextureBufferImpl$RefCountMonitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/SurfaceTextureHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/SurfaceTextureHelper;


# direct methods
.method public constructor <init>(Lhms/webrtc/SurfaceTextureHelper;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/SurfaceTextureHelper$2;->this$0:Lhms/webrtc/SurfaceTextureHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Lhms/webrtc/TextureBufferImpl;)V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/SurfaceTextureHelper$2;->this$0:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->n(Lhms/webrtc/SurfaceTextureHelper;)V

    iget-object v0, p0, Lhms/webrtc/SurfaceTextureHelper$2;->this$0:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->h(Lhms/webrtc/SurfaceTextureHelper;)Lhms/webrtc/SurfaceTextureHelper$FrameRefMonitor;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhms/webrtc/SurfaceTextureHelper$2;->this$0:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->h(Lhms/webrtc/SurfaceTextureHelper;)Lhms/webrtc/SurfaceTextureHelper$FrameRefMonitor;

    move-result-object v0

    invoke-interface {v0, p1}, Lhms/webrtc/SurfaceTextureHelper$FrameRefMonitor;->onDestroyBuffer(Lhms/webrtc/VideoFrame$TextureBuffer;)V

    :cond_0
    return-void
.end method

.method public onRelease(Lhms/webrtc/TextureBufferImpl;)V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/SurfaceTextureHelper$2;->this$0:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->h(Lhms/webrtc/SurfaceTextureHelper;)Lhms/webrtc/SurfaceTextureHelper$FrameRefMonitor;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhms/webrtc/SurfaceTextureHelper$2;->this$0:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->h(Lhms/webrtc/SurfaceTextureHelper;)Lhms/webrtc/SurfaceTextureHelper$FrameRefMonitor;

    move-result-object v0

    invoke-interface {v0, p1}, Lhms/webrtc/SurfaceTextureHelper$FrameRefMonitor;->onReleaseBuffer(Lhms/webrtc/VideoFrame$TextureBuffer;)V

    :cond_0
    return-void
.end method

.method public onRetain(Lhms/webrtc/TextureBufferImpl;)V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/SurfaceTextureHelper$2;->this$0:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->h(Lhms/webrtc/SurfaceTextureHelper;)Lhms/webrtc/SurfaceTextureHelper$FrameRefMonitor;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhms/webrtc/SurfaceTextureHelper$2;->this$0:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0}, Lhms/webrtc/SurfaceTextureHelper;->h(Lhms/webrtc/SurfaceTextureHelper;)Lhms/webrtc/SurfaceTextureHelper$FrameRefMonitor;

    move-result-object v0

    invoke-interface {v0, p1}, Lhms/webrtc/SurfaceTextureHelper$FrameRefMonitor;->onRetainBuffer(Lhms/webrtc/VideoFrame$TextureBuffer;)V

    :cond_0
    return-void
.end method
