.class public final Llive/hms/video/media/capturers/HMSCameraCapturer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/media/capturers/HMSCapturer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/capturers/HMSCameraCapturer$Companion;,
        Llive/hms/video/media/capturers/HMSCameraCapturer$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0002Z]\u0008\u0000\u0018\u0000 e2\u00020\u0001:\u0001eB\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0006H\u0080@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\"\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ,\u0010\u0013\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\"\u0010!J\u000f\u0010#\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008#\u0010!J\u000f\u0010%\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\u0008%\u0010&J\r\u0010(\u001a\u00020\'\u00a2\u0006\u0004\u0008(\u0010)J\u0019\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*\u00a2\u0006\u0004\u0008-\u0010.J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020,\u00a2\u0006\u0004\u00080\u00101J\u0017\u00104\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\u00084\u00105J\u000f\u00106\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u00086\u0010!J\u000f\u00108\u001a\u000207H\u0002\u00a2\u0006\u0004\u00088\u00109J\u001b\u0010;\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020:0*H\u0002\u00a2\u0006\u0004\u0008;\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010<\u001a\u0004\u0008=\u0010>R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010?\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010DR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010ER\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010J\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\"\u0010N\u001a\u0002078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008N\u0010O\u001a\u0004\u0008N\u00109\"\u0004\u0008P\u0010QR$\u0010R\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010U\"\u0004\u0008V\u0010WR\u0016\u0010X\u001a\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008X\u0010OR\u0016\u0010Y\u001a\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Y\u0010OR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u0016\u0010c\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008c\u0010d\u00a8\u0006f"
    }
    d2 = {
        "Llive/hms/video/media/capturers/HMSCameraCapturer;",
        "Llive/hms/video/media/capturers/HMSCapturer;",
        "Landroid/content/Context;",
        "context",
        "Lhms/webrtc/VideoSource;",
        "source",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "settings",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "<init>",
        "(Landroid/content/Context;Lhms/webrtc/VideoSource;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)V",
        "newSettings",
        "Ll83/a0;",
        "setSettings$lib_release",
        "(Llive/hms/video/media/settings/HMSVideoTrackSettings;Lq83/d;)Ljava/lang/Object;",
        "setSettings",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "onAction",
        "switchCamera",
        "(Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
        "face",
        "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/HmsVideoFrameListener;",
        "videoFrameListener",
        "addVideoFrameCapturer",
        "(Llive/hms/video/sdk/HmsVideoFrameListener;)V",
        "",
        "deviceId",
        "givenFace",
        "(Ljava/lang/String;Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;",
        "start",
        "()V",
        "stop",
        "dispose",
        "Llive/hms/video/media/capturers/camera/CameraControl;",
        "getCameraControl",
        "()Llive/hms/video/media/capturers/camera/CameraControl;",
        "Lhms/webrtc/SurfaceTextureHelper;",
        "getSurfaceTexture",
        "()Lhms/webrtc/SurfaceTextureHelper;",
        "Ll83/k;",
        "Lhms/webrtc/Size;",
        "",
        "getInputResolution",
        "()Ll83/k;",
        "fps",
        "changeInputFps",
        "(I)V",
        "Lhms/webrtc/VideoFrame;",
        "frame",
        "processFrameAndFireCallback",
        "(Lhms/webrtc/VideoFrame;)V",
        "stopCaptureWithTimeout",
        "",
        "restartCapture",
        "()Z",
        "Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;",
        "getClosestSizeAndFps",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Lhms/webrtc/VideoSource;",
        "getSource",
        "()Lhms/webrtc/VideoSource;",
        "setSource",
        "(Lhms/webrtc/VideoSource;)V",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "Llive/hms/video/sdk/HmsVideoFrameListener;",
        "Lhms/webrtc/CameraVideoCapturer;",
        "capturer",
        "Lhms/webrtc/CameraVideoCapturer;",
        "surTexture",
        "Lhms/webrtc/SurfaceTextureHelper;",
        "cameraControls",
        "Llive/hms/video/media/capturers/camera/CameraControl;",
        "isStarted",
        "Z",
        "setStarted",
        "(Z)V",
        "currentCameraFace",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
        "getCurrentCameraFace",
        "()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
        "setCurrentCameraFace",
        "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V",
        "cameraLostWhileActive",
        "stoppingDeliberately",
        "live/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1",
        "appForegroundObserver",
        "Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;",
        "live/hms/video/media/capturers/HMSCameraCapturer$cameraCaptureObserver$1",
        "cameraCaptureObserver",
        "Llive/hms/video/media/capturers/HMSCameraCapturer$cameraCaptureObserver$1;",
        "Llive/hms/video/utils/HmsCamera;",
        "hmsCamera",
        "Llive/hms/video/utils/HmsCamera;",
        "currentCameraDeviceId",
        "Ljava/lang/String;",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/media/capturers/HMSCameraCapturer$Companion;

.field private static final LOCAL_CAMERA_CAPTURER_THREAD:Ljava/lang/String; = "local-camera-capturer-thread"

.field public static final TAG:Ljava/lang/String; = "HMSVideoCapturer"


# instance fields
.field private final analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field private final appForegroundObserver:Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;

.field private final cameraCaptureObserver:Llive/hms/video/media/capturers/HMSCameraCapturer$cameraCaptureObserver$1;

.field private cameraControls:Llive/hms/video/media/capturers/camera/CameraControl;

.field private volatile cameraLostWhileActive:Z

.field private final capturer:Lhms/webrtc/CameraVideoCapturer;

.field private final context:Landroid/content/Context;

.field private currentCameraDeviceId:Ljava/lang/String;

.field private currentCameraFace:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

.field private hmsCamera:Llive/hms/video/utils/HmsCamera;

.field private volatile isStarted:Z

.field private settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

.field private source:Lhms/webrtc/VideoSource;

.field private volatile stoppingDeliberately:Z

.field private final surTexture:Lhms/webrtc/SurfaceTextureHelper;

.field private videoFrameListener:Llive/hms/video/sdk/HmsVideoFrameListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/media/capturers/HMSCameraCapturer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/media/capturers/HMSCameraCapturer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/media/capturers/HMSCameraCapturer;->Companion:Llive/hms/video/media/capturers/HMSCameraCapturer$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lhms/webrtc/VideoSource;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsEventsService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->context:Landroid/content/Context;

    iput-object p2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->source:Lhms/webrtc/VideoSource;

    iput-object p3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    iput-object p4, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    sget-object p2, Llive/hms/video/utils/SharedEglContext;->INSTANCE:Llive/hms/video/utils/SharedEglContext;

    invoke-virtual {p2}, Llive/hms/video/utils/SharedEglContext;->getContext()Lhms/webrtc/EglBase$Context;

    move-result-object p2

    const-string p3, "local-camera-capturer-thread"

    invoke-static {p3, p2}, Lhms/webrtc/SurfaceTextureHelper;->create(Ljava/lang/String;Lhms/webrtc/EglBase$Context;)Lhms/webrtc/SurfaceTextureHelper;

    move-result-object p2

    const-string p3, "create(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->surTexture:Lhms/webrtc/SurfaceTextureHelper;

    new-instance p3, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;

    invoke-direct {p3, p0}, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;)V

    iput-object p3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->appForegroundObserver:Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;

    new-instance p3, Llive/hms/video/media/capturers/HMSCameraCapturer$cameraCaptureObserver$1;

    invoke-direct {p3, p0}, Llive/hms/video/media/capturers/HMSCameraCapturer$cameraCaptureObserver$1;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;)V

    iput-object p3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->cameraCaptureObserver:Llive/hms/video/media/capturers/HMSCameraCapturer$cameraCaptureObserver$1;

    new-instance v0, Llive/hms/video/utils/HmsCamera;

    invoke-direct {v0, p1, p4}, Llive/hms/video/utils/HmsCamera;-><init>(Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;)V

    iput-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->hmsCamera:Llive/hms/video/utils/HmsCamera;

    iget-object p4, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {p4}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getCameraFacing()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    move-result-object p4

    invoke-virtual {v0, p4}, Llive/hms/video/utils/HmsCamera;->getDeviceId(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    iget-object p4, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->hmsCamera:Llive/hms/video/utils/HmsCamera;

    invoke-virtual {p4}, Llive/hms/video/utils/HmsCamera;->getEnumerator()Lhms/webrtc/CameraEnumerator;

    move-result-object p4

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    new-instance v1, Llive/hms/video/media/capturers/HMSCameraCapturer$1;

    invoke-direct {v1, p0}, Llive/hms/video/media/capturers/HMSCameraCapturer$1;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;)V

    new-instance v2, Lhn/p;

    const/16 v3, 0x1b

    invoke-direct {v2, p0, v3}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p4, v0, v1, v2}, Lhms/webrtc/CameraEnumerator;->createCapturer(Ljava/lang/String;Lhms/webrtc/CameraVideoCapturer$CameraEventsHandler;Lhms/webrtc/CameraVideoCapturer$CameraSessionCallback;)Lhms/webrtc/CameraVideoCapturer;

    move-result-object p4

    iput-object p4, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->capturer:Lhms/webrtc/CameraVideoCapturer;

    invoke-interface {p4, p2, p1, p3}, Lhms/webrtc/VideoCapturer;->initialize(Lhms/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lhms/webrtc/CapturerObserver;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Llive/hms/video/media/capturers/a;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Llive/hms/video/media/capturers/a;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;I)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final _init_$lambda$1(Llive/hms/video/media/capturers/HMSCameraCapturer;Lhms/webrtc/CameraSession;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhms/webrtc/Camera2Session;

    if-eqz v0, :cond_0

    check-cast p1, Lhms/webrtc/Camera2Session;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->cameraControls:Llive/hms/video/media/capturers/camera/CameraControl;

    if-nez v0, :cond_1

    new-instance v0, Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->surTexture:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {v1}, Lhms/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->context:Landroid/content/Context;

    iget-object v3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    invoke-direct {v0, v1, v2, v3}, Llive/hms/video/media/capturers/camera/CameraControl;-><init>(Landroid/os/Handler;Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;)V

    iput-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->cameraControls:Llive/hms/video/media/capturers/camera/CameraControl;

    :cond_1
    iget-object p0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->cameraControls:Llive/hms/video/media/capturers/camera/CameraControl;

    if-eqz p0, :cond_2

    invoke-virtual {p0, p1}, Llive/hms/video/media/capturers/camera/CameraControl;->onCameraSessionUpdate$lib_release(Lhms/webrtc/Camera2Session;)V

    :cond_2
    return-void
.end method

.method private static final _init_$lambda$4(Llive/hms/video/media/capturers/HMSCameraCapturer;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v0, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->appForegroundObserver:Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/i0;->a(Landroidx/lifecycle/f0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Could not register foreground observer: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "HMSVideoCapturer"

    invoke-static {v0, p0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Llive/hms/video/media/capturers/HMSCameraCapturer;Lhms/webrtc/CameraSession;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->_init_$lambda$1(Llive/hms/video/media/capturers/HMSCameraCapturer;Lhms/webrtc/CameraSession;)V

    return-void
.end method

.method public static final synthetic access$getCameraLostWhileActive$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Z
    .locals 0

    iget-boolean p0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->cameraLostWhileActive:Z

    return p0
.end method

.method public static final synthetic access$getCurrentCameraDeviceId$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getSettings$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Llive/hms/video/media/settings/HMSVideoTrackSettings;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    return-object p0
.end method

.method public static final synthetic access$getStoppingDeliberately$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Z
    .locals 0

    iget-boolean p0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->stoppingDeliberately:Z

    return p0
.end method

.method public static final synthetic access$getVideoFrameListener$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Llive/hms/video/sdk/HmsVideoFrameListener;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->videoFrameListener:Llive/hms/video/sdk/HmsVideoFrameListener;

    return-object p0
.end method

.method public static final synthetic access$processFrameAndFireCallback(Llive/hms/video/media/capturers/HMSCameraCapturer;Lhms/webrtc/VideoFrame;)V
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->processFrameAndFireCallback(Lhms/webrtc/VideoFrame;)V

    return-void
.end method

.method public static final synthetic access$restartCapture(Llive/hms/video/media/capturers/HMSCameraCapturer;)Z
    .locals 0

    invoke-direct {p0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->restartCapture()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$setCameraLostWhileActive$p(Llive/hms/video/media/capturers/HMSCameraCapturer;Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->cameraLostWhileActive:Z

    return-void
.end method

.method public static final synthetic access$setCurrentCameraDeviceId$p(Llive/hms/video/media/capturers/HMSCameraCapturer;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic b(Llive/hms/video/media/capturers/HMSCameraCapturer;)V
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->_init_$lambda$4(Llive/hms/video/media/capturers/HMSCameraCapturer;)V

    return-void
.end method

.method public static synthetic c(Llive/hms/video/media/capturers/HMSCameraCapturer;)V
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->stopCaptureWithTimeout$lambda$6(Llive/hms/video/media/capturers/HMSCameraCapturer;)V

    return-void
.end method

.method public static synthetic d(Llive/hms/video/media/capturers/HMSCameraCapturer;)V
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->dispose$lambda$11(Llive/hms/video/media/capturers/HMSCameraCapturer;)V

    return-void
.end method

.method private static final dispose$lambda$11(Llive/hms/video/media/capturers/HMSCameraCapturer;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v0, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->appForegroundObserver:Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/i0;->d(Landroidx/lifecycle/f0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    return-void
.end method

.method private final getClosestSizeAndFps()Ll83/k;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/k;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->hmsCamera:Llive/hms/video/utils/HmsCamera;

    invoke-virtual {v2}, Llive/hms/video/utils/HmsCamera;->getEnumerator()Lhms/webrtc/CameraEnumerator;

    move-result-object v2

    iget-object v3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    invoke-interface {v2, v3}, Lhms/webrtc/CameraEnumerator;->getSupportedFormats(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    const-string v3, "getSupportedFormats(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    iget v5, v4, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    iget v6, v4, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    if-le v5, v6, :cond_0

    const/4 v3, 0x1

    :cond_0
    new-instance v7, Lhms/webrtc/Size;

    invoke-direct {v7, v6, v5}, Lhms/webrtc/Size;-><init>(II)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    iget-object v4, v4, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    iget v6, v4, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->min:I

    iget v4, v4, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    invoke-direct {v5, v6, v4}, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;-><init>(II)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "[Device="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "] Supported Sizes: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "HMSVideoCapturer"

    invoke-static {v5, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "] Supported FrameRate Ranges: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoResolution;->getWidth()I

    move-result v2

    iget-object v6, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v6}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v6

    invoke-virtual {v6}, Llive/hms/video/media/settings/HMSVideoResolution;->getHeight()I

    move-result v6

    if-nez v3, :cond_2

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoResolution;->getWidth()I

    move-result v2

    iget-object v3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSVideoResolution;->getHeight()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-object v3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSVideoResolution;->getWidth()I

    move-result v3

    iget-object v6, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v6}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v6

    invoke-virtual {v6}, Llive/hms/video/media/settings/HMSVideoResolution;->getHeight()I

    move-result v6

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    :cond_2
    invoke-static {v0, v2, v6}, Lhms/webrtc/CameraEnumerationAndroid;->getClosestSupportedSize(Ljava/util/List;II)Lhms/webrtc/Size;

    move-result-object v0

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getMaxFrameRate()I

    move-result v2

    invoke-static {v1, v2}, Lhms/webrtc/CameraEnumerationAndroid;->getClosestSupportedFramerateRange(Ljava/util/List;I)Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] Using Size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " FrameRate Range="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    :cond_3
    sget-object v3, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    sget-object v4, Llive/hms/video/error/ErrorFactory$Action;->TRACK:Llive/hms/video/error/ErrorFactory$Action;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "Camera occupied. Sizes was "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " and fpsRanges are "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " both must be non-empty."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v10, 0x38

    const/4 v11, 0x0

    const-string v5, "camera"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Llive/hms/video/error/ErrorFactory$TracksErrors;->CantAccessCaptureDevice$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    sget-object v2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v2, v0}, Llive/hms/video/events/AnalyticsEventFactory;->videoPublishFail(Llive/hms/video/error/HMSException;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    throw v0
.end method

.method private final processFrameAndFireCallback(Lhms/webrtc/VideoFrame;)V
    .locals 4

    sget-object v0, Llive/hms/video/utils/VideoFrameToBitmapConverter;->Companion:Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;->convertToBitmap$default(Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;Lhms/webrtc/VideoFrame;ZILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->videoFrameListener:Llive/hms/video/sdk/HmsVideoFrameListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Llive/hms/video/sdk/HmsVideoFrameListener;->onFrameCaptured(Landroid/graphics/Bitmap;)V

    :cond_0
    iput-object v3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->videoFrameListener:Llive/hms/video/sdk/HmsVideoFrameListener;

    return-void
.end method

.method private final restartCapture()Z
    .locals 5

    iget-boolean v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->stoppingDeliberately:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->stopCaptureWithTimeout()V

    invoke-direct {p0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->getClosestSizeAndFps()Ll83/k;

    move-result-object v0

    iget-object v2, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lhms/webrtc/Size;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    :try_start_0
    iget-object v3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->capturer:Lhms/webrtc/CameraVideoCapturer;

    iget v4, v2, Lhms/webrtc/Size;->width:I

    iget v2, v2, Lhms/webrtc/Size;->height:I

    iget v0, v0, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    invoke-interface {v3, v4, v2, v0}, Lhms/webrtc/VideoCapturer;->startCapture(III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_0
    instance-of v2, v0, Ll83/m;

    xor-int/lit8 v3, v2, 0x1

    if-nez v2, :cond_1

    move-object v2, v0

    check-cast v2, Ll83/a0;

    const/4 v2, 0x1

    iput-boolean v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted:Z

    :cond_1
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted:Z

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "restartCapture: startCapture failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSVideoCapturer"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return v3
.end method

.method private final stopCaptureWithTimeout()V
    .locals 6

    const-string v0, "stopCaptureWithTimeout: stopCapture errored: "

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Llive/hms/video/media/capturers/a;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Llive/hms/video/media/capturers/a;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;I)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v2

    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x3

    invoke-interface {v2, v4, v5, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    sget-object v3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v4, "HMSVideoCapturer"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    goto :goto_1

    :catch_1
    const/4 v0, 0x1

    :try_start_2
    invoke-interface {v2, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    throw v0
.end method

.method private static final stopCaptureWithTimeout$lambda$6(Llive/hms/video/media/capturers/HMSCameraCapturer;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->capturer:Lhms/webrtc/CameraVideoCapturer;

    invoke-interface {p0}, Lhms/webrtc/VideoCapturer;->stopCapture()V

    return-void
.end method


# virtual methods
.method public final addVideoFrameCapturer(Llive/hms/video/sdk/HmsVideoFrameListener;)V
    .locals 1

    const-string v0, "videoFrameListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->videoFrameListener:Llive/hms/video/sdk/HmsVideoFrameListener;

    return-void
.end method

.method public final changeInputFps(I)V
    .locals 3

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->capturer:Lhms/webrtc/CameraVideoCapturer;

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/media/settings/HMSVideoResolution;->getWidth()I

    move-result v1

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoResolution;->getHeight()I

    move-result v2

    invoke-interface {v0, v1, v2, p1}, Lhms/webrtc/VideoCapturer;->changeCaptureFormat(III)V

    return-void
.end method

.method public dispose()V
    .locals 3

    invoke-static {p0}, Llive/hms/video/media/capturers/HMSCapturer$DefaultImpls;->dispose(Llive/hms/video/media/capturers/HMSCapturer;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Llive/hms/video/media/capturers/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Llive/hms/video/media/capturers/a;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->source:Lhms/webrtc/VideoSource;

    invoke-virtual {v0}, Lhms/webrtc/VideoSource;->dispose()V

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->surTexture:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {v0}, Lhms/webrtc/SurfaceTextureHelper;->stopListening()V

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->surTexture:Lhms/webrtc/SurfaceTextureHelper;

    invoke-virtual {v0}, Lhms/webrtc/SurfaceTextureHelper;->dispose()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    return-void
.end method

.method public final getCameraControl()Llive/hms/video/media/capturers/camera/CameraControl;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->cameraControls:Llive/hms/video/media/capturers/camera/CameraControl;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getCurrentCameraFace()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraFace:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    return-object v0
.end method

.method public final getInputResolution()Ll83/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/k;"
        }
    .end annotation

    new-instance v0, Ll83/k;

    new-instance v1, Lhms/webrtc/Size;

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoResolution;->getWidth()I

    move-result v2

    iget-object v3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSVideoResolution;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lhms/webrtc/Size;-><init>(II)V

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v2}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getMaxFrameRate()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getSource()Lhms/webrtc/VideoSource;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->source:Lhms/webrtc/VideoSource;

    return-object v0
.end method

.method public final getSurfaceTexture()Lhms/webrtc/SurfaceTextureHelper;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->surTexture:Lhms/webrtc/SurfaceTextureHelper;

    return-object v0
.end method

.method public final isStarted()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted:Z

    return v0
.end method

.method public final setCurrentCameraFace(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraFace:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    return-void
.end method

.method public final setSettings$lib_release(Llive/hms/video/media/settings/HMSVideoTrackSettings;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/settings/HMSVideoTrackSettings;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v2

    invoke-virtual {v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getResolution()Llive/hms/video/media/settings/HMSVideoResolution;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getMaxFrameRate()I

    move-result v2

    invoke-virtual {v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getMaxFrameRate()I

    move-result v3

    if-eq v2, v3, :cond_2

    :cond_0
    invoke-direct {p0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->getClosestSizeAndFps()Ll83/k;

    move-result-object v2

    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Lhms/webrtc/Size;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    iget-boolean v4, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted:Z

    if-nez v4, :cond_1

    iget-object v4, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->capturer:Lhms/webrtc/CameraVideoCapturer;

    iget v5, v3, Lhms/webrtc/Size;->width:I

    iget v3, v3, Lhms/webrtc/Size;->height:I

    iget v2, v2, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    invoke-interface {v4, v5, v3, v2}, Lhms/webrtc/VideoCapturer;->startCapture(III)V

    const/4 v2, 0x1

    iput-boolean v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted:Z

    goto :goto_0

    :cond_1
    iget-object v4, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->capturer:Lhms/webrtc/CameraVideoCapturer;

    iget v5, v3, Lhms/webrtc/Size;->width:I

    iget v3, v3, Lhms/webrtc/Size;->height:I

    iget v2, v2, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    invoke-interface {v4, v5, v3, v2}, Lhms/webrtc/VideoCapturer;->changeCaptureFormat(III)V

    :cond_2
    :goto_0
    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getCameraFacing()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    move-result-object v2

    invoke-virtual {v1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getCameraFacing()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    move-result-object v1

    if-eq v2, v1, :cond_3

    invoke-virtual {p1}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getCameraFacing()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, p2}, Llive/hms/video/media/capturers/HMSCameraCapturer;->switchCamera(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    return-object v0
.end method

.method public final setSource(Lhms/webrtc/VideoSource;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->source:Lhms/webrtc/VideoSource;

    return-void
.end method

.method public final setStarted(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted:Z

    return-void
.end method

.method public start()V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->stoppingDeliberately:Z

    iput-boolean v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->cameraLostWhileActive:Z

    invoke-direct {p0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->getClosestSizeAndFps()Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Lhms/webrtc/Size;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->capturer:Lhms/webrtc/CameraVideoCapturer;

    iget v3, v1, Lhms/webrtc/Size;->width:I

    iget v1, v1, Lhms/webrtc/Size;->height:I

    iget v0, v0, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    invoke-interface {v2, v3, v1, v0}, Lhms/webrtc/VideoCapturer;->startCapture(III)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted:Z

    return-void
.end method

.method public stop()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->stoppingDeliberately:Z

    invoke-direct {p0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->stopCaptureWithTimeout()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted:Z

    iput-boolean v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->cameraLostWhileActive:Z

    return-void
.end method

.method public final switchCamera(Ljava/lang/String;Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v0, p2

    move-object/from16 v4, p3

    move-object/from16 v2, p4

    instance-of v5, v2, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$4;

    if-eqz v5, :cond_0

    move-object v5, v2

    check-cast v5, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$4;

    iget v6, v5, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$4;->label:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$4;->label:I

    :goto_0
    move-object v6, v5

    goto :goto_1

    :cond_0
    new-instance v5, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$4;

    invoke-direct {v5, v1, v2}, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$4;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v6, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$4;->result:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    .line 11
    iget v5, v6, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$4;->label:I

    const-string v8, "HMSVideoCapturer"

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const/4 v10, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v10, :cond_1

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 12
    iget-object v2, v1, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 13
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "switchCamera: Ignoring request to switch from "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    iget-object v4, v1, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraDeviceId:Ljava/lang/String;

    const-string v5, " -> "

    .line 16
    invoke-static {v2, v4, v5, v3}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-virtual {v0, v8, v2}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v9

    .line 18
    :cond_3
    iput-object v0, v1, Llive/hms/video/media/capturers/HMSCameraCapturer;->currentCameraFace:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    if-nez v0, :cond_4

    .line 19
    iget-object v0, v1, Llive/hms/video/media/capturers/HMSCameraCapturer;->hmsCamera:Llive/hms/video/utils/HmsCamera;

    invoke-virtual {v0, v3}, Llive/hms/video/utils/HmsCamera;->getCameraFaceFromId(Ljava/lang/String;)Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    move-result-object v0

    :cond_4
    move-object v2, v0

    if-nez v2, :cond_5

    .line 20
    sget-object v11, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    .line 21
    sget-object v12, Llive/hms/video/error/ErrorFactory$Action;->TRACK:Llive/hms/video/error/ErrorFactory$Action;

    .line 22
    const-string v0, "It cannot be determined if "

    const-string v2, " is front facing or back facing. Camera was not switched."

    .line 23
    invoke-static {v0, v3, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/16 v17, 0xc

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 24
    invoke-static/range {v11 .. v18}, Llive/hms/video/error/ErrorFactory$TracksErrors;->GenericTrack$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ZILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    if-eqz v4, :cond_7

    .line 25
    invoke-interface {v4, v0}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-object v9

    .line 26
    :cond_5
    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v5

    .line 27
    iget-object v11, v1, Llive/hms/video/media/capturers/HMSCameraCapturer;->capturer:Lhms/webrtc/CameraVideoCapturer;

    new-instance v0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;

    invoke-direct/range {v0 .. v5}, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$5;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;Lbc3/s;)V

    invoke-interface {v11, v0, v3}, Lhms/webrtc/CameraVideoCapturer;->switchCamera(Lhms/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V

    .line 28
    iput v10, v6, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$4;->label:I

    .line 29
    invoke-virtual {v5, v6}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_6

    return-object v7

    .line 30
    :cond_6
    :goto_2
    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_7

    .line 31
    const-string v0, "Implement onAction to be made aware of these. "

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    return-object v9
.end method

.method public final switchCamera(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$2;

    iget v1, v0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$2;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$2;

    invoke-direct {v0, p0, p3}, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$2;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$2;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 6
    iget v2, v0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    .line 7
    :try_start_1
    iget-object p3, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->hmsCamera:Llive/hms/video/utils/HmsCamera;

    invoke-virtual {p3, p1}, Llive/hms/video/utils/HmsCamera;->getDeviceId(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)Ljava/lang/String;

    move-result-object p3

    .line 8
    iput v3, v0, Llive/hms/video/media/capturers/HMSCameraCapturer$switchCamera$2;->label:I

    invoke-virtual {p0, p3, p1, p2, v0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->switchCamera(Ljava/lang/String;Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_3

    return-object v1

    .line 9
    :goto_1
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    .line 10
    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final switchCamera(Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer;->settings:Llive/hms/video/media/settings/HMSVideoTrackSettings;

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getCameraFacing()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    move-result-object v0

    sget-object v1, Llive/hms/video/media/capturers/HMSCameraCapturer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;->FRONT:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 4
    :cond_1
    sget-object v0, Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;->BACK:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    .line 5
    :goto_0
    invoke-virtual {p0, v0, p1, p2}, Llive/hms/video/media/capturers/HMSCameraCapturer;->switchCamera(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
