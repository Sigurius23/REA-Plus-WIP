.class public Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;
.super Landroid/view/TextureView;
.source "SourceFile"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field private w:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;->w:Llh3/e;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;->a()V

    return-void
.end method

.method private a()V
    .locals 0

    invoke-virtual {p0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    return-void
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;->w:Llh3/e;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Llh3/e;->onNext(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;->w:Llh3/e;

    return-object v0
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;->c()V

    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;->c()V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public setTransform(Landroid/graphics/Matrix;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    return-void
.end method
