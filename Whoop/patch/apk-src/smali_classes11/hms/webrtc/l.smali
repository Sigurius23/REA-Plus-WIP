.class public final synthetic Lhms/webrtc/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# instance fields
.field public final synthetic w:Lhms/webrtc/SurfaceTextureHelper;


# direct methods
.method public synthetic constructor <init>(Lhms/webrtc/SurfaceTextureHelper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhms/webrtc/l;->w:Lhms/webrtc/SurfaceTextureHelper;

    return-void
.end method


# virtual methods
.method public final onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/l;->w:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {v0, p1}, Lhms/webrtc/SurfaceTextureHelper;->b(Lhms/webrtc/SurfaceTextureHelper;Landroid/graphics/SurfaceTexture;)V

    return-void
.end method
