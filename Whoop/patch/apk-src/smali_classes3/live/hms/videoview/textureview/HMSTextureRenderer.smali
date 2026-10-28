.class public final Llive/hms/videoview/textureview/HMSTextureRenderer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\r\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u000f\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u000f\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010 R\u001a\u0010\"\u001a\u00020!8\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u0018\u0010\'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-\u00a8\u0006/"
    }
    d2 = {
        "Llive/hms/videoview/textureview/HMSTextureRenderer;",
        "",
        "Landroid/graphics/SurfaceTexture;",
        "surfaceTexture",
        "<init>",
        "(Landroid/graphics/SurfaceTexture;)V",
        "Ll83/a0;",
        "init",
        "()V",
        "release",
        "removeTrack",
        "Llive/hms/video/media/tracks/HMSVideoTrack;",
        "getTrack",
        "()Llive/hms/video/media/tracks/HMSVideoTrack;",
        "track",
        "addTrack",
        "(Llive/hms/video/media/tracks/HMSVideoTrack;)V",
        "",
        "enableBlackFrame",
        "(Llive/hms/video/media/tracks/HMSVideoTrack;Z)V",
        "Llive/hms/videoview/VideoViewStateChangeListener;",
        "videoViewStateChangeListener",
        "addVideoViewStateChangeListener",
        "(Llive/hms/videoview/VideoViewStateChangeListener;)V",
        "isDisabled",
        "disableAutoSimulcastLayerSelect",
        "(Z)V",
        "",
        "width",
        "height",
        "displayResolution",
        "(II)V",
        "Landroid/graphics/SurfaceTexture;",
        "",
        "TAG",
        "Ljava/lang/String;",
        "getTAG",
        "()Ljava/lang/String;",
        "Lhms/webrtc/SurfaceEglRenderer;",
        "renderer",
        "Lhms/webrtc/SurfaceEglRenderer;",
        "Llive/hms/videoview/common/VideoTrackManager;",
        "videoTrackManager$delegate",
        "Ll83/h;",
        "getVideoTrackManager",
        "()Llive/hms/videoview/common/VideoTrackManager;",
        "videoTrackManager",
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
.field private final TAG:Ljava/lang/String;

.field private renderer:Lhms/webrtc/SurfaceEglRenderer;

.field private final surfaceTexture:Landroid/graphics/SurfaceTexture;

.field private final videoTrackManager$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    const-string v0, "surfaceTexture"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    const-string p1, "HMSTextureRenderer"

    iput-object p1, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->TAG:Ljava/lang/String;

    new-instance p1, Llive/hms/videoview/textureview/a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Llive/hms/videoview/textureview/a;-><init>(Llive/hms/videoview/textureview/HMSTextureRenderer;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->videoTrackManager$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Llive/hms/videoview/textureview/HMSTextureRenderer;Lhms/webrtc/RendererCommon$RendererEvents;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/videoview/textureview/HMSTextureRenderer;->videoTrackManager_delegate$lambda$4$lambda$1(Llive/hms/videoview/textureview/HMSTextureRenderer;Lhms/webrtc/RendererCommon$RendererEvents;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSurfaceTexture$p(Llive/hms/videoview/textureview/HMSTextureRenderer;)Landroid/graphics/SurfaceTexture;
    .locals 0

    iget-object p0, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    return-object p0
.end method

.method public static final synthetic access$getVideoTrackManager(Llive/hms/videoview/textureview/HMSTextureRenderer;)Llive/hms/videoview/common/VideoTrackManager;
    .locals 0

    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic addTrack$default(Llive/hms/videoview/textureview/HMSTextureRenderer;Llive/hms/video/media/tracks/HMSVideoTrack;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/videoview/textureview/HMSTextureRenderer;->addTrack(Llive/hms/video/media/tracks/HMSVideoTrack;Z)V

    return-void
.end method

.method public static synthetic b(Llive/hms/videoview/textureview/HMSTextureRenderer;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->videoTrackManager_delegate$lambda$4$lambda$3(Llive/hms/videoview/textureview/HMSTextureRenderer;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llive/hms/videoview/textureview/HMSTextureRenderer;)Lhms/webrtc/VideoSink;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->videoTrackManager_delegate$lambda$4$lambda$0(Llive/hms/videoview/textureview/HMSTextureRenderer;)Lhms/webrtc/VideoSink;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llive/hms/videoview/textureview/HMSTextureRenderer;)Llive/hms/videoview/common/VideoTrackManager;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->videoTrackManager_delegate$lambda$4(Llive/hms/videoview/textureview/HMSTextureRenderer;)Llive/hms/videoview/common/VideoTrackManager;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llive/hms/videoview/textureview/HMSTextureRenderer;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->videoTrackManager_delegate$lambda$4$lambda$2(Llive/hms/videoview/textureview/HMSTextureRenderer;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;
    .locals 1

    iget-object v0, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->videoTrackManager$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/videoview/common/VideoTrackManager;

    return-object v0
.end method

.method private final init()V
    .locals 5

    new-instance v0, Lhms/webrtc/SurfaceEglRenderer;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lhms/webrtc/SurfaceEglRenderer;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lhms/webrtc/ThreadUtils;->checkIsOnMainThread()V

    sget-object v1, Llive/hms/video/utils/SharedEglContext;->INSTANCE:Llive/hms/video/utils/SharedEglContext;

    invoke-virtual {v1}, Llive/hms/video/utils/SharedEglContext;->getContext()Lhms/webrtc/EglBase$Context;

    move-result-object v1

    new-instance v2, Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;

    invoke-direct {v2, p0}, Llive/hms/videoview/textureview/HMSTextureRenderer$init$1$1;-><init>(Llive/hms/videoview/textureview/HMSTextureRenderer;)V

    sget-object v3, Lhms/webrtc/EglBase;->CONFIG_PLAIN:[I

    new-instance v4, Lhms/webrtc/GlRectDrawer;

    invoke-direct {v4}, Lhms/webrtc/GlRectDrawer;-><init>()V

    invoke-virtual {v0, v1, v2, v3, v4}, Lhms/webrtc/SurfaceEglRenderer;->init(Lhms/webrtc/EglBase$Context;Lhms/webrtc/RendererCommon$RendererEvents;[ILhms/webrtc/RendererCommon$GlDrawer;)V

    iget-object v1, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->surfaceTexture:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, v1}, Lhms/webrtc/EglRenderer;->createEglSurface(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->renderer:Lhms/webrtc/SurfaceEglRenderer;

    return-void
.end method

.method private final release()V
    .locals 4

    iget-object v0, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->renderer:Lhms/webrtc/SurfaceEglRenderer;

    if-nez v0, :cond_0

    iget-object v0, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->TAG:Ljava/lang/String;

    const-string v1, "HMSTextureRenderer Release called without init "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-static {}, Lhms/webrtc/ThreadUtils;->checkIsOnMainThread()V

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iget-object v1, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->renderer:Lhms/webrtc/SurfaceEglRenderer;

    if-eqz v1, :cond_1

    new-instance v2, Lhms/webrtc/i;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lhms/webrtc/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lhms/webrtc/EglRenderer;->releaseEglSurface(Ljava/lang/Runnable;)V

    :cond_1
    invoke-static {v0}, Lhms/webrtc/ThreadUtils;->awaitUninterruptibly(Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method

.method private static final videoTrackManager_delegate$lambda$4(Llive/hms/videoview/textureview/HMSTextureRenderer;)Llive/hms/videoview/common/VideoTrackManager;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/videoview/common/VideoTrackManager;

    new-instance v2, Llive/hms/videoview/textureview/a;

    const/4 v0, 0x1

    invoke-direct {v2, p0, v0}, Llive/hms/videoview/textureview/a;-><init>(Llive/hms/videoview/textureview/HMSTextureRenderer;I)V

    new-instance v3, Llc0/c;

    const/4 v0, 0x5

    invoke-direct {v3, p0, v0}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    new-instance v4, Llive/hms/videoview/textureview/a;

    const/4 v0, 0x2

    invoke-direct {v4, p0, v0}, Llive/hms/videoview/textureview/a;-><init>(Llive/hms/videoview/textureview/HMSTextureRenderer;I)V

    new-instance v5, Llive/hms/videoview/textureview/a;

    const/4 v0, 0x3

    invoke-direct {v5, p0, v0}, Llive/hms/videoview/textureview/a;-><init>(Llive/hms/videoview/textureview/HMSTextureRenderer;I)V

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Llive/hms/videoview/common/VideoTrackManager;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Z)V

    return-object v1
.end method

.method private static final videoTrackManager_delegate$lambda$4$lambda$0(Llive/hms/videoview/textureview/HMSTextureRenderer;)Lhms/webrtc/VideoSink;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->renderer:Lhms/webrtc/SurfaceEglRenderer;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final videoTrackManager_delegate$lambda$4$lambda$1(Llive/hms/videoview/textureview/HMSTextureRenderer;Lhms/webrtc/RendererCommon$RendererEvents;)Ll83/a0;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->init()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final videoTrackManager_delegate$lambda$4$lambda$2(Llive/hms/videoview/textureview/HMSTextureRenderer;)Ll83/a0;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->release()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final videoTrackManager_delegate$lambda$4$lambda$3(Llive/hms/videoview/textureview/HMSTextureRenderer;)Ll83/a0;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->renderer:Lhms/webrtc/SurfaceEglRenderer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lhms/webrtc/EglRenderer;->clearFrame()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final addTrack(Llive/hms/video/media/tracks/HMSVideoTrack;)V
    .locals 4

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Llive/hms/videoview/common/VideoTrackManager;->addTrack$default(Llive/hms/videoview/common/VideoTrackManager;Llive/hms/video/media/tracks/HMSVideoTrack;ZILjava/lang/Object;)V

    return-void
.end method

.method public final addTrack(Llive/hms/video/media/tracks/HMSVideoTrack;Z)V
    .locals 1

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Llive/hms/videoview/common/VideoTrackManager;->addTrack(Llive/hms/video/media/tracks/HMSVideoTrack;Z)V

    return-void
.end method

.method public final addVideoViewStateChangeListener(Llive/hms/videoview/VideoViewStateChangeListener;)V
    .locals 1

    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/videoview/common/VideoTrackManager;->setVideoViewStateChangeListener$videoview_release(Llive/hms/videoview/VideoViewStateChangeListener;)V

    return-void
.end method

.method public final disableAutoSimulcastLayerSelect(Z)V
    .locals 1

    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/videoview/common/VideoTrackManager;->disableAutoSimulcastLayerSelect$videoview_release(Z)V

    return-void
.end method

.method public final displayResolution(II)V
    .locals 1

    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Llive/hms/videoview/common/VideoTrackManager;->onSizeChanged$videoview_release(II)V

    return-void
.end method

.method public final getTAG()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/videoview/textureview/HMSTextureRenderer;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrack()Llive/hms/video/media/tracks/HMSVideoTrack;
    .locals 1

    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/videoview/common/VideoTrackManager;->getCurrentTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v0

    return-object v0
.end method

.method public final removeTrack()V
    .locals 1

    invoke-direct {p0}, Llive/hms/videoview/textureview/HMSTextureRenderer;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/videoview/common/VideoTrackManager;->removeTrack$videoview_release()V

    return-void
.end method
