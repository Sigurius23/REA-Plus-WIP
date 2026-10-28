.class public final Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/RendererCommon$RendererEvents;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/videoview/textureview/HMSTextureRenderer;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "live/hms/videoview/textureview/HMSTextureRenderer$init$1$1",
        "Lhms/webrtc/RendererCommon$RendererEvents;",
        "Ll83/a0;",
        "onFirstFrameRendered",
        "()V",
        "",
        "width",
        "height",
        "rotation",
        "onFrameResolutionChanged",
        "(III)V",
        "videoview_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Llive/hms/videoview/textureview/HMSTextureRenderer;


# direct methods
.method public constructor <init>(Llive/hms/videoview/textureview/HMSTextureRenderer;)V
    .locals 0

    iput-object p1, p0, Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;->this$0:Llive/hms/videoview/textureview/HMSTextureRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Llive/hms/videoview/textureview/HMSTextureRenderer;III)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;->onFrameResolutionChanged$lambda$1(Llive/hms/videoview/textureview/HMSTextureRenderer;III)V

    return-void
.end method

.method public static synthetic b(Llive/hms/videoview/textureview/HMSTextureRenderer;)V
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;->onFirstFrameRendered$lambda$0(Llive/hms/videoview/textureview/HMSTextureRenderer;)V

    return-void
.end method

.method private static final onFirstFrameRendered$lambda$0(Llive/hms/videoview/textureview/HMSTextureRenderer;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->access$getVideoTrackManager(Llive/hms/videoview/textureview/HMSTextureRenderer;)Llive/hms/videoview/common/VideoTrackManager;

    move-result-object p0

    invoke-virtual {p0}, Llive/hms/videoview/common/VideoTrackManager;->onFirstFrameRendered()V

    return-void
.end method

.method private static final onFrameResolutionChanged$lambda$1(Llive/hms/videoview/textureview/HMSTextureRenderer;III)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->access$getVideoTrackManager(Llive/hms/videoview/textureview/HMSTextureRenderer;)Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Llive/hms/videoview/common/VideoTrackManager;->onFrameResolutionChanged(III)V

    invoke-static {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->access$getSurfaceTexture$p(Llive/hms/videoview/textureview/HMSTextureRenderer;)Landroid/graphics/SurfaceTexture;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    return-void
.end method


# virtual methods
.method public onFirstFrameRendered()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v1, p0, Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;->this$0:Llive/hms/videoview/textureview/HMSTextureRenderer;

    new-instance v2, Lio/sentry/c7;

    const/16 v3, 0x1d

    invoke-direct {v2, v1, v3}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onFrameResolutionChanged(III)V
    .locals 3

    rem-int/lit16 v0, p3, 0xb4

    if-nez v0, :cond_0

    move v1, p1

    goto :goto_0

    :cond_0
    move v1, p2

    :goto_0
    if-nez v0, :cond_1

    move p1, p2

    :cond_1
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v0, p0, Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;->this$0:Llive/hms/videoview/textureview/HMSTextureRenderer;

    new-instance v2, Llive/hms/videoview/textureview/b;

    invoke-direct {v2, v0, v1, p1, p3}, Llive/hms/videoview/textureview/b;-><init>(Llive/hms/videoview/textureview/HMSTextureRenderer;III)V

    invoke-virtual {p2, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
