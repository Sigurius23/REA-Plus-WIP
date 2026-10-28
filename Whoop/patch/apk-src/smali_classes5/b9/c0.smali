.class public final Lb9/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field public final synthetic w:Lb9/f0;


# direct methods
.method public constructor <init>(Lb9/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/c0;->w:Lb9/f0;

    return-void
.end method


# virtual methods
.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iget-object p1, p0, Lb9/c0;->w:Lb9/f0;

    invoke-virtual {p1, v0}, Lb9/f0;->E0(Ljava/lang/Object;)V

    iput-object v0, p1, Lb9/f0;->s0:Landroid/view/Surface;

    invoke-virtual {p1, p2, p3}, Lb9/f0;->p0(II)V

    return-void
.end method

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    const/4 p1, 0x0

    iget-object v0, p0, Lb9/c0;->w:Lb9/f0;

    invoke-virtual {v0, p1}, Lb9/f0;->E0(Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1, p1}, Lb9/f0;->p0(II)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    iget-object p1, p0, Lb9/c0;->w:Lb9/f0;

    invoke-virtual {p1, p2, p3}, Lb9/f0;->p0(II)V

    return-void
.end method

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public final surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    iget-object p1, p0, Lb9/c0;->w:Lb9/f0;

    invoke-virtual {p1, p3, p4}, Lb9/f0;->p0(II)V

    return-void
.end method

.method public final surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    iget-object v0, p0, Lb9/c0;->w:Lb9/f0;

    iget-boolean v1, v0, Lb9/f0;->v0:Z

    if-eqz v1, :cond_0

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb9/f0;->E0(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object p1, p0, Lb9/c0;->w:Lb9/f0;

    iget-boolean v0, p1, Lb9/f0;->v0:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lb9/f0;->E0(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Lb9/f0;->p0(II)V

    return-void
.end method
