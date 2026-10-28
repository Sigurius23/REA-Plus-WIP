.class public final Llive/hms/videoview/HMSVideoView;
.super Lhms/webrtc/SurfaceViewRenderer;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0019\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J7\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\"\u0010#J\r\u0010$\u001a\u00020\u0011\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010(\u001a\u00020\u00112\u0008\u0010\'\u001a\u0004\u0018\u00010&\u00a2\u0006\u0004\u0008(\u0010)J-\u0010/\u001a\u00020\u00112\u0014\u0010,\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u00110*2\u0008\u0008\u0002\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008/\u00100J\u0015\u00102\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u000b\u00a2\u0006\u0004\u00082\u0010#J\u0017\u00105\u001a\u00020\u00112\u0006\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\u00085\u00106J\u000f\u00107\u001a\u00020\u0011H\u0014\u00a2\u0006\u0004\u00087\u0010%R\u0018\u00108\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008A\u0010<\u001a\u0004\u0008B\u0010C\u00a8\u0006E"
    }
    d2 = {
        "Llive/hms/videoview/HMSVideoView;",
        "Lhms/webrtc/SurfaceViewRenderer;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attributeSet",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "",
        "widthSpec",
        "heightSpec",
        "Ll83/a0;",
        "onMeasure",
        "(II)V",
        "Llive/hms/video/media/tracks/HMSVideoTrack;",
        "track",
        "addTrack",
        "(Llive/hms/video/media/tracks/HMSVideoTrack;)V",
        "getTrack",
        "()Llive/hms/video/media/tracks/HMSVideoTrack;",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "(ZIIII)V",
        "isDisabled",
        "disableAutoSimulcastLayerSelect",
        "(Z)V",
        "removeTrack",
        "()V",
        "Llive/hms/videoview/VideoViewStateChangeListener;",
        "videoViewStateChangeListener",
        "addVideoViewStateChangeListener",
        "(Llive/hms/videoview/VideoViewStateChangeListener;)V",
        "Lkotlin/Function1;",
        "Landroid/graphics/Bitmap;",
        "onBitmap",
        "",
        "scale",
        "captureBitmap",
        "(Lkotlin/jvm/functions/Function1;F)V",
        "isEnabled",
        "enableZoomAndPan",
        "Lhms/webrtc/RendererCommon$ScalingType;",
        "scalingType",
        "setScalingType",
        "(Lhms/webrtc/RendererCommon$ScalingType;)V",
        "onDetachedFromWindow",
        "currentScalingType",
        "Lhms/webrtc/RendererCommon$ScalingType;",
        "Llive/hms/videoview/common/VideoTrackManager;",
        "videoTrackManager$delegate",
        "Ll83/h;",
        "getVideoTrackManager",
        "()Llive/hms/videoview/common/VideoTrackManager;",
        "videoTrackManager",
        "Llive/hms/videoview/ZoomPanManager;",
        "zoomPanManager$delegate",
        "getZoomPanManager",
        "()Llive/hms/videoview/ZoomPanManager;",
        "zoomPanManager",
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
.field private currentScalingType:Lhms/webrtc/RendererCommon$ScalingType;

.field private final videoTrackManager$delegate:Ll83/h;

.field private final zoomPanManager$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lhms/webrtc/SurfaceViewRenderer;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p1, Llive/hms/videoview/a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Llive/hms/videoview/a;-><init>(Llive/hms/videoview/HMSVideoView;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/videoview/HMSVideoView;->videoTrackManager$delegate:Ll83/h;

    .line 3
    new-instance p1, Llive/hms/videoview/a;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Llive/hms/videoview/a;-><init>(Llive/hms/videoview/HMSVideoView;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/videoview/HMSVideoView;->zoomPanManager$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributeSet"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2}, Lhms/webrtc/SurfaceViewRenderer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance p1, Llive/hms/videoview/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Llive/hms/videoview/a;-><init>(Llive/hms/videoview/HMSVideoView;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/videoview/HMSVideoView;->videoTrackManager$delegate:Ll83/h;

    .line 6
    new-instance p1, Llive/hms/videoview/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Llive/hms/videoview/a;-><init>(Llive/hms/videoview/HMSVideoView;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/videoview/HMSVideoView;->zoomPanManager$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic b(Llive/hms/videoview/HMSVideoView;Lhms/webrtc/RendererCommon$RendererEvents;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/videoview/HMSVideoView;->videoTrackManager_delegate$lambda$4$lambda$1(Llive/hms/videoview/HMSVideoView;Lhms/webrtc/RendererCommon$RendererEvents;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llive/hms/videoview/HMSVideoView;)Llive/hms/videoview/common/VideoTrackManager;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/HMSVideoView;->videoTrackManager_delegate$lambda$4(Llive/hms/videoview/HMSVideoView;)Llive/hms/videoview/common/VideoTrackManager;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic captureBitmap$default(Llive/hms/videoview/HMSVideoView;Lkotlin/jvm/functions/Function1;FILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/high16 p2, 0x3f800000    # 1.0f

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/videoview/HMSVideoView;->captureBitmap(Lkotlin/jvm/functions/Function1;F)V

    return-void
.end method

.method public static synthetic d(Llive/hms/videoview/HMSVideoView;)Lhms/webrtc/VideoSink;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/HMSVideoView;->videoTrackManager_delegate$lambda$4$lambda$0(Llive/hms/videoview/HMSVideoView;)Lhms/webrtc/VideoSink;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llive/hms/videoview/HMSVideoView;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/HMSVideoView;->videoTrackManager_delegate$lambda$4$lambda$2(Llive/hms/videoview/HMSVideoView;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llive/hms/videoview/HMSVideoView;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/HMSVideoView;->videoTrackManager_delegate$lambda$4$lambda$3(Llive/hms/videoview/HMSVideoView;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llive/hms/videoview/HMSVideoView;)Llive/hms/videoview/ZoomPanManager;
    .locals 0

    invoke-static {p0}, Llive/hms/videoview/HMSVideoView;->zoomPanManager_delegate$lambda$5(Llive/hms/videoview/HMSVideoView;)Llive/hms/videoview/ZoomPanManager;

    move-result-object p0

    return-object p0
.end method

.method private final getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;
    .locals 1

    iget-object v0, p0, Llive/hms/videoview/HMSVideoView;->videoTrackManager$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/videoview/common/VideoTrackManager;

    return-object v0
.end method

.method private final getZoomPanManager()Llive/hms/videoview/ZoomPanManager;
    .locals 1

    iget-object v0, p0, Llive/hms/videoview/HMSVideoView;->zoomPanManager$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/videoview/ZoomPanManager;

    return-object v0
.end method

.method private static final videoTrackManager_delegate$lambda$4(Llive/hms/videoview/HMSVideoView;)Llive/hms/videoview/common/VideoTrackManager;
    .locals 9

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/videoview/common/VideoTrackManager;

    new-instance v2, Llive/hms/videoview/a;

    const/4 v0, 0x2

    invoke-direct {v2, p0, v0}, Llive/hms/videoview/a;-><init>(Llive/hms/videoview/HMSVideoView;I)V

    new-instance v3, Llc0/c;

    const/4 v0, 0x4

    invoke-direct {v3, p0, v0}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    new-instance v4, Llive/hms/videoview/a;

    const/4 v0, 0x3

    invoke-direct {v4, p0, v0}, Llive/hms/videoview/a;-><init>(Llive/hms/videoview/HMSVideoView;I)V

    new-instance v5, Llive/hms/videoview/a;

    const/4 v0, 0x4

    invoke-direct {v5, p0, v0}, Llive/hms/videoview/a;-><init>(Llive/hms/videoview/HMSVideoView;I)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Llive/hms/videoview/common/VideoTrackManager;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final videoTrackManager_delegate$lambda$4$lambda$0(Llive/hms/videoview/HMSVideoView;)Lhms/webrtc/VideoSink;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final videoTrackManager_delegate$lambda$4$lambda$1(Llive/hms/videoview/HMSVideoView;Lhms/webrtc/RendererCommon$RendererEvents;)Ll83/a0;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/SharedEglContext;->INSTANCE:Llive/hms/video/utils/SharedEglContext;

    invoke-virtual {v0}, Llive/hms/video/utils/SharedEglContext;->getContext()Lhms/webrtc/EglBase$Context;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lhms/webrtc/SurfaceViewRenderer;->init(Lhms/webrtc/EglBase$Context;Lhms/webrtc/RendererCommon$RendererEvents;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final videoTrackManager_delegate$lambda$4$lambda$2(Llive/hms/videoview/HMSVideoView;)Ll83/a0;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhms/webrtc/SurfaceViewRenderer;->release()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final videoTrackManager_delegate$lambda$4$lambda$3(Llive/hms/videoview/HMSVideoView;)Ll83/a0;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhms/webrtc/SurfaceViewRenderer;->clearFrame()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final zoomPanManager_delegate$lambda$5(Llive/hms/videoview/HMSVideoView;)Llive/hms/videoview/ZoomPanManager;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/videoview/ZoomPanManager;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Llive/hms/videoview/HMSVideoView$zoomPanManager$2$1;

    invoke-direct {v2, p0}, Llive/hms/videoview/HMSVideoView$zoomPanManager$2$1;-><init>(Llive/hms/videoview/HMSVideoView;)V

    invoke-direct {v0, v1, v2}, Llive/hms/videoview/ZoomPanManager;-><init>(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager$ZoomPanCallBack;)V

    return-object v0
.end method


# virtual methods
.method public final addTrack(Llive/hms/video/media/tracks/HMSVideoTrack;)V
    .locals 4

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TRACK%%TRACK ADDED trackID: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ssrc:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p1

    check-cast v1, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    invoke-virtual {v1}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->getSsrc()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSVIDEOVIEW"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Llive/hms/videoview/common/VideoTrackManager;->addTrack$default(Llive/hms/videoview/common/VideoTrackManager;Llive/hms/video/media/tracks/HMSVideoTrack;ZILjava/lang/Object;)V

    return-void
.end method

.method public final addVideoViewStateChangeListener(Llive/hms/videoview/VideoViewStateChangeListener;)V
    .locals 1

    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/videoview/common/VideoTrackManager;->setVideoViewStateChangeListener$videoview_release(Llive/hms/videoview/VideoViewStateChangeListener;)V

    return-void
.end method

.method public final captureBitmap(Lkotlin/jvm/functions/Function1;F)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "F)V"
        }
    .end annotation

    const-string v0, "onBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/videoview/common/VideoTrackManager;->getCurrentTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v0

    instance-of v1, v0, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v1, :cond_0

    check-cast v0, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    new-instance p2, Llive/hms/videoview/HMSVideoView$captureBitmap$1;

    invoke-direct {p2, p1}, Llive/hms/videoview/HMSVideoView$captureBitmap$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->captureImageAtMaxPublishResolution(Llive/hms/video/sdk/HmsVideoFrameListener;)V

    return-void

    :cond_0
    new-instance v0, Llive/hms/videoview/HMSVideoView$captureBitmap$2;

    invoke-direct {v0, p1, p0}, Llive/hms/videoview/HMSVideoView$captureBitmap$2;-><init>(Lkotlin/jvm/functions/Function1;Llive/hms/videoview/HMSVideoView;)V

    invoke-virtual {p0, v0, p2}, Lhms/webrtc/SurfaceViewRenderer;->addFrameListener(Lhms/webrtc/EglRenderer$FrameListener;F)V

    return-void
.end method

.method public final disableAutoSimulcastLayerSelect(Z)V
    .locals 1

    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/videoview/common/VideoTrackManager;->disableAutoSimulcastLayerSelect$videoview_release(Z)V

    return-void
.end method

.method public final enableZoomAndPan(Z)V
    .locals 1

    const/high16 v0, 0x42700000    # 60.0f

    invoke-virtual {p0, v0}, Lhms/webrtc/SurfaceViewRenderer;->setFpsReduction(F)V

    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getZoomPanManager()Llive/hms/videoview/ZoomPanManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/videoview/ZoomPanManager;->enableZoomAndPan$videoview_release(Z)V

    return-void
.end method

.method public final getTrack()Llive/hms/video/media/tracks/HMSVideoTrack;
    .locals 1

    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/videoview/common/VideoTrackManager;->getCurrentTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v0

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-virtual {p0}, Llive/hms/videoview/HMSVideoView;->removeTrack()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Lhms/webrtc/SurfaceViewRenderer;->onLayout(ZIIII)V

    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object p1

    sub-int/2addr p2, p4

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    sub-int/2addr p3, p5

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Llive/hms/videoview/common/VideoTrackManager;->onSizeChanged$videoview_release(II)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    invoke-super {p0, p1, p2}, Lhms/webrtc/SurfaceViewRenderer;->onMeasure(II)V

    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getZoomPanManager()Llive/hms/videoview/ZoomPanManager;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Llive/hms/videoview/ZoomPanManager;->setContainerSize$videoview_release(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getZoomPanManager()Llive/hms/videoview/ZoomPanManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/videoview/ZoomPanManager;->shouldInterceptGesture$videoview_release(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final removeTrack()V
    .locals 4

    invoke-virtual {p0}, Llive/hms/videoview/HMSVideoView;->getTrack()Llive/hms/video/media/tracks/HMSVideoTrack;

    move-result-object v0

    instance-of v1, v0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TRACK%%TRACK remove trackID: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ssrc:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSRemoteVideoTrack;->getSsrc()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSVIDEOVIEW"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-direct {p0}, Llive/hms/videoview/HMSVideoView;->getVideoTrackManager()Llive/hms/videoview/common/VideoTrackManager;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/videoview/common/VideoTrackManager;->removeTrack$videoview_release()V

    return-void
.end method

.method public setScalingType(Lhms/webrtc/RendererCommon$ScalingType;)V
    .locals 1

    const-string v0, "scalingType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/videoview/HMSVideoView;->currentScalingType:Lhms/webrtc/RendererCommon$ScalingType;

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1}, Lhms/webrtc/SurfaceViewRenderer;->setScalingType(Lhms/webrtc/RendererCommon$ScalingType;)V

    iput-object p1, p0, Llive/hms/videoview/HMSVideoView;->currentScalingType:Lhms/webrtc/RendererCommon$ScalingType;

    :cond_0
    return-void
.end method
