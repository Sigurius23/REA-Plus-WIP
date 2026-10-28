.class public abstract Lq53/b;
.super Landroid/view/TextureView;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoSink;
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public final w:Lorg/webrtc/RendererCommon$VideoLayoutMeasure;

.field public final x:Lorg/webrtc/EglRenderer;

.field public final y:Landroid/os/Handler;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lq53/b;->getResourceName()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lorg/webrtc/RendererCommon$VideoLayoutMeasure;

    invoke-direct {p2}, Lorg/webrtc/RendererCommon$VideoLayoutMeasure;-><init>()V

    iput-object p2, p0, Lq53/b;->w:Lorg/webrtc/RendererCommon$VideoLayoutMeasure;

    new-instance p2, Lorg/webrtc/EglRenderer;

    invoke-direct {p2, p1}, Lorg/webrtc/EglRenderer;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lq53/b;->x:Lorg/webrtc/EglRenderer;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lq53/b;->y:Landroid/os/Handler;

    invoke-virtual {p0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    return-void
.end method

.method private final getResourceName()Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, Lq53/b;->x:Lorg/webrtc/EglRenderer;

    invoke-virtual {v0}, Lorg/webrtc/EglRenderer;->release()V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public final onFrame(Lorg/webrtc/VideoFrame;)V
    .locals 2

    const-string v0, "videoFrame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq53/b;->x:Lorg/webrtc/EglRenderer;

    invoke-virtual {v0, p1}, Lorg/webrtc/EglRenderer;->onFrame(Lorg/webrtc/VideoFrame;)V

    iget-boolean v0, p0, Lq53/b;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq53/b;->z:Z

    :cond_0
    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotatedWidth()I

    move-result v0

    iget v1, p0, Lq53/b;->E:I

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotatedHeight()I

    move-result v0

    iget v1, p0, Lq53/b;->F:I

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotation()I

    move-result v0

    iget v1, p0, Lq53/b;->G:I

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotatedWidth()I

    move-result v0

    iput v0, p0, Lq53/b;->E:I

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotatedHeight()I

    move-result v0

    iput v0, p0, Lq53/b;->F:I

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotation()I

    move-result p1

    iput p1, p0, Lq53/b;->G:I

    new-instance p1, Lq53/a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lq53/a;-><init>(Lq53/b;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    new-instance p1, Lq53/a;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lq53/a;-><init>(Lq53/b;I)V

    iget-object v0, p0, Lq53/b;->y:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    sub-int/2addr p4, p2

    int-to-float p1, p4

    int-to-float p2, p5

    int-to-float p3, p3

    sub-float/2addr p2, p3

    div-float/2addr p1, p2

    iget-object p2, p0, Lq53/b;->x:Lorg/webrtc/EglRenderer;

    invoke-virtual {p2, p1}, Lorg/webrtc/EglRenderer;->setLayoutAspectRatio(F)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    invoke-static {}, Lorg/webrtc/ThreadUtils;->checkIsOnMainThread()V

    iget v0, p0, Lq53/b;->E:I

    iget v1, p0, Lq53/b;->F:I

    iget-object v2, p0, Lq53/b;->w:Lorg/webrtc/RendererCommon$VideoLayoutMeasure;

    invoke-virtual {v2, p1, p2, v0, v1}, Lorg/webrtc/RendererCommon$VideoLayoutMeasure;->measure(IIII)Landroid/graphics/Point;

    move-result-object p1

    const-string p2, "measure(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    const-string p2, "surfaceTexture"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lq53/b;->x:Lorg/webrtc/EglRenderer;

    invoke-virtual {p2, p1}, Lorg/webrtc/EglRenderer;->createEglSurface(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 3

    const-string v0, "surfaceTexture"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance v1, Llr/e;

    const/16 v2, 0x9

    invoke-direct {v1, p1, v2}, Llr/e;-><init>(Ljava/lang/Object;I)V

    iget-object v2, p0, Lq53/b;->x:Lorg/webrtc/EglRenderer;

    invoke-virtual {v2, v1}, Lorg/webrtc/EglRenderer;->releaseEglSurface(Ljava/lang/Runnable;)V

    invoke-static {p1}, Lorg/webrtc/ThreadUtils;->awaitUninterruptibly(Ljava/util/concurrent/CountDownLatch;)V

    return v0
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    const-string p2, "surfaceTexture"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    const-string v0, "surfaceTexture"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setMirror(Z)V
    .locals 1

    iget-object v0, p0, Lq53/b;->x:Lorg/webrtc/EglRenderer;

    invoke-virtual {v0, p1}, Lorg/webrtc/EglRenderer;->setMirror(Z)V

    return-void
.end method

.method public final setScalingType(Lorg/webrtc/RendererCommon$ScalingType;)V
    .locals 1

    invoke-static {}, Lorg/webrtc/ThreadUtils;->checkIsOnMainThread()V

    iget-object v0, p0, Lq53/b;->w:Lorg/webrtc/RendererCommon$VideoLayoutMeasure;

    invoke-virtual {v0, p1}, Lorg/webrtc/RendererCommon$VideoLayoutMeasure;->setScalingType(Lorg/webrtc/RendererCommon$ScalingType;)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
