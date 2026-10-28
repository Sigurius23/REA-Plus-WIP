.class Lhms/webrtc/TextureBufferImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/TextureBufferImpl$RefCountMonitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/TextureBufferImpl;->applyTransformMatrix(Landroid/graphics/Matrix;IIII)Lhms/webrtc/TextureBufferImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/TextureBufferImpl;


# direct methods
.method public constructor <init>(Lhms/webrtc/TextureBufferImpl;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/TextureBufferImpl$2;->this$0:Lhms/webrtc/TextureBufferImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDestroy(Lhms/webrtc/TextureBufferImpl;)V
    .locals 0

    iget-object p1, p0, Lhms/webrtc/TextureBufferImpl$2;->this$0:Lhms/webrtc/TextureBufferImpl;

    invoke-virtual {p1}, Lhms/webrtc/TextureBufferImpl;->release()V

    return-void
.end method

.method public onRelease(Lhms/webrtc/TextureBufferImpl;)V
    .locals 1

    iget-object p1, p0, Lhms/webrtc/TextureBufferImpl$2;->this$0:Lhms/webrtc/TextureBufferImpl;

    invoke-static {p1}, Lhms/webrtc/TextureBufferImpl;->c(Lhms/webrtc/TextureBufferImpl;)Lhms/webrtc/TextureBufferImpl$RefCountMonitor;

    move-result-object p1

    iget-object v0, p0, Lhms/webrtc/TextureBufferImpl$2;->this$0:Lhms/webrtc/TextureBufferImpl;

    invoke-interface {p1, v0}, Lhms/webrtc/TextureBufferImpl$RefCountMonitor;->onRelease(Lhms/webrtc/TextureBufferImpl;)V

    return-void
.end method

.method public onRetain(Lhms/webrtc/TextureBufferImpl;)V
    .locals 1

    iget-object p1, p0, Lhms/webrtc/TextureBufferImpl$2;->this$0:Lhms/webrtc/TextureBufferImpl;

    invoke-static {p1}, Lhms/webrtc/TextureBufferImpl;->c(Lhms/webrtc/TextureBufferImpl;)Lhms/webrtc/TextureBufferImpl$RefCountMonitor;

    move-result-object p1

    iget-object v0, p0, Lhms/webrtc/TextureBufferImpl$2;->this$0:Lhms/webrtc/TextureBufferImpl;

    invoke-interface {p1, v0}, Lhms/webrtc/TextureBufferImpl$RefCountMonitor;->onRetain(Lhms/webrtc/TextureBufferImpl;)V

    return-void
.end method
