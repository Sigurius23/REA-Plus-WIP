.class public final Llive/hms/video/media/capturers/camera/CameraControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/capturers/camera/CameraControl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008a\u0001B#\u0008\u0000\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0013\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u0015\u00a2\u0006\u0004\u0008 \u0010\u001aJ\r\u0010!\u001a\u00020\u000c\u00a2\u0006\u0004\u0008!\u0010\"J7\u0010*\u001a\u00020\u000c2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%2\u0008\u0008\u0002\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008*\u0010+J\u001b\u0010/\u001a\u00020\u000c2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0,\u00a2\u0006\u0004\u0008/\u00100J)\u00105\u001a\u00020\u000c2\u0006\u00102\u001a\u0002012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000c03\u00a2\u0006\u0004\u00085\u00106J\r\u00107\u001a\u00020\u0010\u00a2\u0006\u0004\u00087\u0010\u0012J\r\u00108\u001a\u00020\u0010\u00a2\u0006\u0004\u00088\u0010\u0012J\u0015\u0010:\u001a\u00020\u000c2\u0006\u00109\u001a\u00020\u0010\u00a2\u0006\u0004\u0008:\u0010;J\u000f\u0010<\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008<\u0010\u0012J!\u0010?\u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u00152\u0008\u0010>\u001a\u0004\u0018\u00010=H\u0002\u00a2\u0006\u0004\u0008?\u0010@J\u0017\u0010C\u001a\u00020\u000c2\u0006\u0010B\u001a\u00020AH\u0002\u00a2\u0006\u0004\u0008C\u0010DJ\u0019\u0010G\u001a\u00020\u00152\u0008\u0010F\u001a\u0004\u0018\u00010EH\u0002\u00a2\u0006\u0004\u0008G\u0010HJ\u001f\u0010L\u001a\u00020J2\u0006\u0010I\u001a\u00020\u00152\u0006\u0010K\u001a\u00020JH\u0002\u00a2\u0006\u0004\u0008L\u0010MJ\u0010\u0010N\u001a\u00020-H\u0082@\u00a2\u0006\u0004\u0008N\u0010OR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010P\u001a\u0004\u0008Q\u0010RR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010S\u001a\u0004\u0008T\u0010UR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010V\u001a\u0004\u0008W\u0010XR$\u0010Z\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]\"\u0004\u0008^\u0010_R$\u0010a\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR$\u0010h\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008h\u0010i\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u0014\u0010q\u001a\u00020%8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u001b\u0010x\u001a\u00020s8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008t\u0010u\u001a\u0004\u0008v\u0010wR\u001b\u0010{\u001a\u00020\u00028BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008y\u0010u\u001a\u0004\u0008z\u0010RR\u0014\u0010}\u001a\u00020|8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R+\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\"\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00158\u0002X\u0082D\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0087\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u0087\u0001\u00a8\u0006\u008b\u0001"
    }
    d2 = {
        "Llive/hms/video/media/capturers/camera/CameraControl;",
        "",
        "Landroid/os/Handler;",
        "cameraHandler",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "<init>",
        "(Landroid/os/Handler;Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;)V",
        "Lhms/webrtc/Camera2Session;",
        "session",
        "Ll83/a0;",
        "onCameraSessionUpdate$lib_release",
        "(Lhms/webrtc/Camera2Session;)V",
        "onCameraSessionUpdate",
        "",
        "isZoomSupported",
        "()Z",
        "isManualFocusSupported",
        "Landroid/util/Range;",
        "",
        "getManualFocusRange",
        "()Landroid/util/Range;",
        "range",
        "setManualFocus",
        "(F)V",
        "isTapToFocusSupported",
        "getMaxZoom",
        "()F",
        "getMinZoom",
        "zoomValue",
        "setZoom",
        "resetZoom",
        "()V",
        "viewX",
        "viewY",
        "",
        "viewWidth",
        "viewHeight",
        "Lhms/webrtc/RendererCommon$ScalingType;",
        "scalingType",
        "setTapToFocusAt",
        "(FFIILhms/webrtc/RendererCommon$ScalingType;)V",
        "Llive/hms/video/sdk/HmsTypedActionResultListener;",
        "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
        "onImageCapture",
        "captureImageAtMaxResolution",
        "(Llive/hms/video/sdk/HmsTypedActionResultListener;)V",
        "Ljava/io/File;",
        "savePath",
        "Lkotlin/Function1;",
        "callback",
        "captureImageAtMaxSupportedResolution",
        "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V",
        "isFlashSupported",
        "isFlashEnabled",
        "enable",
        "setFlash",
        "(Z)V",
        "isValidSession",
        "",
        "currentCameraIndex",
        "setZoomInternal",
        "(FLjava/lang/String;)V",
        "Landroid/hardware/camera2/CaptureResult;",
        "result",
        "autoFocusCallbackResult",
        "(Landroid/hardware/camera2/CaptureResult;)V",
        "Landroid/hardware/camera2/CameraCharacteristics;",
        "cameraCharacteristics",
        "getMaxZoomInternal",
        "(Landroid/hardware/camera2/CameraCharacteristics;)F",
        "ratio",
        "Landroid/graphics/Rect;",
        "zoomSensorRect",
        "cropRegionForZoom",
        "(FLandroid/graphics/Rect;)Landroid/graphics/Rect;",
        "takePictureInternal",
        "(Lq83/d;)Ljava/lang/Object;",
        "Landroid/os/Handler;",
        "getCameraHandler",
        "()Landroid/os/Handler;",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "getAnalyticsEventsService$lib_release",
        "()Llive/hms/video/events/AnalyticsEventsService;",
        "Landroid/hardware/camera2/CameraCaptureSession;",
        "currentCameraSession",
        "Landroid/hardware/camera2/CameraCaptureSession;",
        "getCurrentCameraSession",
        "()Landroid/hardware/camera2/CameraCaptureSession;",
        "setCurrentCameraSession",
        "(Landroid/hardware/camera2/CameraCaptureSession;)V",
        "Landroid/hardware/camera2/CaptureRequest$Builder;",
        "captureRequestBuilder",
        "Landroid/hardware/camera2/CaptureRequest$Builder;",
        "getCaptureRequestBuilder",
        "()Landroid/hardware/camera2/CaptureRequest$Builder;",
        "setCaptureRequestBuilder",
        "(Landroid/hardware/camera2/CaptureRequest$Builder;)V",
        "Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;",
        "captureFormat",
        "Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;",
        "getCaptureFormat",
        "()Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;",
        "setCaptureFormat",
        "(Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;)V",
        "Lmc3/a;",
        "cameraCaptureMutex",
        "Lmc3/a;",
        "IMAGE_BUFFER_SIZE",
        "I",
        "Landroid/os/HandlerThread;",
        "imageReaderThread$delegate",
        "Ll83/h;",
        "getImageReaderThread",
        "()Landroid/os/HandlerThread;",
        "imageReaderThread",
        "imageReaderHandler$delegate",
        "getImageReaderHandler",
        "imageReaderHandler",
        "",
        "IMAGE_CAPTURE_TIMEOUT_MILLIS",
        "J",
        "Landroid/media/ImageReader;",
        "imageReader",
        "Landroid/media/ImageReader;",
        "getImageReader",
        "()Landroid/media/ImageReader;",
        "setImageReader",
        "(Landroid/media/ImageReader;)V",
        "ZOOM_DEFAULT_VALUE",
        "F",
        "lastZoom",
        "lastLensDistance",
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
.field private static final Companion:Llive/hms/video/media/capturers/camera/CameraControl$Companion;

.field private static final TAG:Ljava/lang/String; = "CameraControl"


# instance fields
.field private final IMAGE_BUFFER_SIZE:I

.field private final IMAGE_CAPTURE_TIMEOUT_MILLIS:J

.field private final ZOOM_DEFAULT_VALUE:F

.field private final analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field private final cameraCaptureMutex:Lmc3/a;

.field private final cameraHandler:Landroid/os/Handler;

.field private captureFormat:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

.field private captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

.field private final context:Landroid/content/Context;

.field private currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

.field private imageReader:Landroid/media/ImageReader;

.field private final imageReaderHandler$delegate:Ll83/h;

.field private final imageReaderThread$delegate:Ll83/h;

.field private lastLensDistance:F

.field private lastZoom:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/media/capturers/camera/CameraControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/media/capturers/camera/CameraControl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/media/capturers/camera/CameraControl;->Companion:Llive/hms/video/media/capturers/camera/CameraControl$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsEventsService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    iput-object p2, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    iput-object p3, p0, Llive/hms/video/media/capturers/camera/CameraControl;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    new-instance p1, Lmc3/c;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lmc3/c;-><init>(Z)V

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraCaptureMutex:Lmc3/a;

    const/4 p1, 0x1

    iput p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->IMAGE_BUFFER_SIZE:I

    new-instance p1, Llh1/a;

    const/4 p2, 0x5

    invoke-direct {p1, p2}, Llh1/a;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReaderThread$delegate:Ll83/h;

    new-instance p1, Llive/hms/video/connection/degredation/a;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReaderHandler$delegate:Ll83/h;

    const-wide/16 p1, 0x1388

    iput-wide p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->IMAGE_CAPTURE_TIMEOUT_MILLIS:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->ZOOM_DEFAULT_VALUE:F

    return-void
.end method

.method public static synthetic a(Llive/hms/video/media/capturers/camera/CameraControl;)Landroid/os/Handler;
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->imageReaderHandler_delegate$lambda$2(Llive/hms/video/media/capturers/camera/CameraControl;)Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$autoFocusCallbackResult(Llive/hms/video/media/capturers/camera/CameraControl;Landroid/hardware/camera2/CaptureResult;)V
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/media/capturers/camera/CameraControl;->autoFocusCallbackResult(Landroid/hardware/camera2/CaptureResult;)V

    return-void
.end method

.method public static final synthetic access$getCameraCaptureMutex$p(Llive/hms/video/media/capturers/camera/CameraControl;)Lmc3/a;
    .locals 0

    iget-object p0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraCaptureMutex:Lmc3/a;

    return-object p0
.end method

.method public static final synthetic access$takePictureInternal(Llive/hms/video/media/capturers/camera/CameraControl;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/media/capturers/camera/CameraControl;->takePictureInternal(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$takePictureInternal$lambda$22$failOnce(Ljava/util/concurrent/atomic/AtomicBoolean;Lq83/d;Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Llive/hms/video/media/capturers/camera/CameraControl;->takePictureInternal$lambda$22$failOnce(Ljava/util/concurrent/atomic/AtomicBoolean;Lq83/d;Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic access$takePictureInternal$lambda$22$releaseCaptureResources(Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;)V
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl;->takePictureInternal$lambda$22$releaseCaptureResources(Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;)V

    return-void
.end method

.method private final autoFocusCallbackResult(Landroid/hardware/camera2/CaptureResult;)V
    .locals 3

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x4

    if-eq v0, p1, :cond_0

    const/4 v0, 0x5

    if-ne v0, p1, :cond_3

    :cond_0
    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz p1, :cond_1

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_1
    :try_start_0
    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz p1, :cond_3

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    new-instance v1, Llive/hms/video/media/capturers/camera/CameraControl$autoFocusCallbackResult$2$1;

    invoke-direct {v1}, Llive/hms/video/media/capturers/camera/CameraControl$autoFocusCallbackResult$2$1;-><init>()V

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0, v1, v2}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_3
    :goto_0
    return-void
.end method

.method public static synthetic b(Llive/hms/video/media/capturers/camera/CameraControl;)V
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->setTapToFocusAt$lambda$10(Llive/hms/video/media/capturers/camera/CameraControl;)V

    return-void
.end method

.method public static synthetic c(Llive/hms/video/media/capturers/camera/CameraControl;FLjava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl;->setZoom$lambda$5(Llive/hms/video/media/capturers/camera/CameraControl;FLjava/lang/String;)V

    return-void
.end method

.method private final cropRegionForZoom(FLandroid/graphics/Rect;)Landroid/graphics/Rect;
    .locals 5

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v2, v3

    div-float/2addr v2, p1

    float-to-int v2, v2

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr p2, v3

    div-float/2addr p2, p1

    float-to-int p1, p2

    new-instance p2, Landroid/graphics/Rect;

    sub-int v3, v0, v2

    sub-int v4, v1, p1

    add-int/2addr v0, v2

    add-int/2addr v1, p1

    invoke-direct {p2, v3, v4, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p2
.end method

.method public static synthetic d(Llive/hms/video/media/capturers/camera/CameraControl;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraControl;->resetZoom$lambda$6(Llive/hms/video/media/capturers/camera/CameraControl;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e()Landroid/os/HandlerThread;
    .locals 1

    invoke-static {}, Llive/hms/video/media/capturers/camera/CameraControl;->imageReaderThread_delegate$lambda$1()Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Llive/hms/video/media/capturers/camera/CameraControl;I)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/media/capturers/camera/CameraControl;->setFlash$lambda$13(Llive/hms/video/media/capturers/camera/CameraControl;I)V

    return-void
.end method

.method private final getImageReaderHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReaderHandler$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0
.end method

.method private final getImageReaderThread()Landroid/os/HandlerThread;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReaderThread$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/HandlerThread;

    return-object v0
.end method

.method private final getMaxZoomInternal(Landroid/hardware/camera2/CameraCharacteristics;)F
    .locals 1

    if-nez p1, :cond_0

    iget p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->ZOOM_DEFAULT_VALUE:F

    return p1

    :cond_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_MAX_DIGITAL_ZOOM:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    return p1

    :cond_1
    iget p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->ZOOM_DEFAULT_VALUE:F

    return p1
.end method

.method private static final imageReaderHandler_delegate$lambda$2(Llive/hms/video/media/capturers/camera/CameraControl;)Landroid/os/Handler;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->getImageReaderThread()Landroid/os/HandlerThread;

    move-result-object p0

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method

.method private static final imageReaderThread_delegate$lambda$1()Landroid/os/HandlerThread;
    .locals 2

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "imageReaderThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-object v0
.end method

.method private final isValidSession()Z
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureFormat:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static final resetZoom$lambda$6(Llive/hms/video/media/capturers/camera/CameraControl;Ljava/lang/String;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$currentCameraIndex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->getMinZoom()F

    move-result v0

    invoke-direct {p0, v0, p1}, Llive/hms/video/media/capturers/camera/CameraControl;->setZoomInternal(FLjava/lang/String;)V

    return-void
.end method

.method private static final setFlash$lambda$13(Llive/hms/video/media/capturers/camera/CameraControl;I)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_0

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz p1, :cond_1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    new-instance v1, Llive/hms/video/media/capturers/camera/CameraControl$setFlash$1$1$1;

    invoke-direct {v1}, Llive/hms/video/media/capturers/camera/CameraControl$setFlash$1$1$1;-><init>()V

    iget-object p0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0, v1, p0}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    return-void
.end method

.method public static synthetic setTapToFocusAt$default(Llive/hms/video/media/capturers/camera/CameraControl;FFIILhms/webrtc/RendererCommon$ScalingType;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    sget-object p5, Lhms/webrtc/RendererCommon$ScalingType;->SCALE_ASPECT_FILL:Lhms/webrtc/RendererCommon$ScalingType;

    :cond_0
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Llive/hms/video/media/capturers/camera/CameraControl;->setTapToFocusAt(FFIILhms/webrtc/RendererCommon$ScalingType;)V

    return-void
.end method

.method private static final setTapToFocusAt$lambda$10(Llive/hms/video/media/capturers/camera/CameraControl;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v1

    new-instance v2, Llive/hms/video/media/capturers/camera/CameraControl$setTapToFocusAt$2$1$1;

    invoke-direct {v2, p0}, Llive/hms/video/media/capturers/camera/CameraControl$setTapToFocusAt$2$1$1;-><init>(Llive/hms/video/media/capturers/camera/CameraControl;)V

    iget-object p0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, p0}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_0
    return-void
.end method

.method private static final setZoom$lambda$5(Llive/hms/video/media/capturers/camera/CameraControl;FLjava/lang/String;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$currentCameraIndex"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl;->setZoomInternal(FLjava/lang/String;)V

    return-void
.end method

.method private final setZoomInternal(FLjava/lang/String;)V
    .locals 3

    if-eqz p2, :cond_8

    invoke-static {p2}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    invoke-static {p2, v0}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(ILandroid/content/Context;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object p2

    if-nez p2, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p2, v0}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-direct {p0, p2}, Llive/hms/video/media/capturers/camera/CameraControl;->getMaxZoomInternal(Landroid/hardware/camera2/CameraCharacteristics;)F

    move-result p2

    iget v1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->ZOOM_DEFAULT_VALUE:F

    sub-float v1, p2, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x3a83126f    # 0.001f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_2

    goto :goto_2

    :cond_2
    iget v1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->ZOOM_DEFAULT_VALUE:F

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_4

    cmpg-float p2, p1, p2

    if-gtz p2, :cond_4

    iget p2, p0, Llive/hms/video/media/capturers/camera/CameraControl;->lastZoom:F

    cmpg-float p2, p1, p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    const/4 p2, 0x1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p2, 0x0

    :goto_1
    iput p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->lastZoom:F

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    invoke-direct {p0, p1, v0}, Llive/hms/video/media/capturers/camera/CameraControl;->cropRegionForZoom(FLandroid/graphics/Rect;)Landroid/graphics/Rect;

    move-result-object p2

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_6

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0, v1, p2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_6
    iput p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->lastZoom:F

    :try_start_0
    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz p1, :cond_8

    iget-object p2, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p2}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p2

    new-instance v0, Llive/hms/video/media/capturers/camera/CameraControl$setZoomInternal$1$1;

    invoke-direct {v0}, Llive/hms/video/media/capturers/camera/CameraControl$setZoomInternal$1$1;-><init>()V

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    invoke-virtual {p1, p2, v0, v1}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_8
    :goto_2
    return-void
.end method

.method private final takePictureInternal(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v1, Lq83/l;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p1

    invoke-direct {v1, p1}, Lq83/l;-><init>(Lq83/d;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReader:Landroid/media/ImageReader;

    if-eqz p1, :cond_6

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_0
    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReader:Landroid/media/ImageReader;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/media/ImageReader;->acquireLatestImage()Landroid/media/Image;

    move-result-object p1

    if-nez p1, :cond_5

    new-instance v4, Ljava/util/concurrent/ArrayBlockingQueue;

    iget p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->IMAGE_BUFFER_SIZE:I

    invoke-direct {v4, p1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x0

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReader:Landroid/media/ImageReader;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v2, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$1;

    invoke-direct {v2, v0, v4}, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$1;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/ArrayBlockingQueue;)V

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->getImageReaderHandler()Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v3, 0x2

    invoke-virtual {p1, v3}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v3, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReader:Landroid/media/ImageReader;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_2

    new-instance v5, Ljava/lang/NullPointerException;

    const-string p1, "current camera session not found"

    invoke-direct {v5, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    move-object v3, p0

    invoke-static/range {v0 .. v5}, Llive/hms/video/media/capturers/camera/CameraControl;->takePictureInternal$lambda$22$failOnce(Ljava/util/concurrent/atomic/AtomicBoolean;Lq83/d;Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/lang/Throwable;)V

    goto/16 :goto_3

    :cond_2
    move-object v3, p0

    iget-object v5, v3, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v5, :cond_3

    sget-object v6, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v5, v6}, Landroid/hardware/camera2/CaptureRequest$Builder;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    if-eqz v5, :cond_3

    invoke-virtual {p1, v6, v5}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_3
    move-object v3, v1

    new-instance v1, Ljava/util/concurrent/TimeoutException;

    const-string v5, "Image dequeuing took too long"

    invoke-direct {v1, v5}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    move-object v5, v2

    move-object v2, v0

    new-instance v0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;

    move-object v6, v4

    move-object v4, v5

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;-><init>(Ljava/util/concurrent/TimeoutException;Ljava/util/concurrent/atomic/AtomicBoolean;Lq83/d;Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;)V

    move-object v1, v3

    move-object v3, v5

    move-object v5, v0

    move-object v0, v2

    move-object v2, v4

    move-object v4, v6

    iput-object v5, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->getImageReaderHandler()Landroid/os/Handler;

    move-result-object v6

    iget-wide v7, v3, Llive/hms/video/media/capturers/camera/CameraControl;->IMAGE_CAPTURE_TIMEOUT_MILLIS:J

    invoke-virtual {v6, v5, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v6, v3, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v6, :cond_4

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p1

    move-object v3, v0

    new-instance v0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;

    move-object v5, v2

    move-object v2, v4

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;-><init>(Lq83/d;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/util/concurrent/atomic/AtomicBoolean;Llive/hms/video/media/capturers/camera/CameraControl;Lkotlin/jvm/internal/g0;)V

    move-object v3, v4

    iget-object v2, v3, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    invoke-virtual {v6, p1, v0, v2}, Landroid/hardware/camera2/CameraCaptureSession;->capture(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I

    move-result p1

    invoke-static {p1}, Lhg3/i;->v(I)Ljava/lang/Integer;

    goto :goto_3

    :cond_4
    new-instance v5, Ljava/lang/IllegalStateException;

    const-string p1, "Camera session is null, capture cannot be performed"

    invoke-direct {v5, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static/range {v0 .. v5}, Llive/hms/video/media/capturers/camera/CameraControl;->takePictureInternal$lambda$22$failOnce(Ljava/util/concurrent/atomic/AtomicBoolean;Lq83/d;Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Landroid/media/Image;->close()V

    goto/16 :goto_0

    :cond_6
    :goto_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "imageReader null, should be initlaised"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v1, p1}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    :goto_3
    invoke-virtual {v1}, Lq83/l;->a()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method private static final takePictureInternal$lambda$22$failOnce(Ljava/util/concurrent/atomic/AtomicBoolean;Lq83/d;Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/lang/Throwable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            ">;",
            "Lkotlin/jvm/internal/g0;",
            "Llive/hms/video/media/capturers/camera/CameraControl;",
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Landroid/media/Image;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p2, p3, p4}, Llive/hms/video/media/capturers/camera/CameraControl;->takePictureInternal$lambda$22$releaseCaptureResources(Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;)V

    invoke-static {p5}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    invoke-interface {p1, p0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final takePictureInternal$lambda$22$releaseCaptureResources(Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Llive/hms/video/media/capturers/camera/CameraControl;",
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Landroid/media/Image;",
            ">;)V"
        }
    .end annotation

    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Runnable;

    if-eqz p0, :cond_0

    invoke-direct {p1}, Llive/hms/video/media/capturers/camera/CameraControl;->getImageReaderHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-object p0, p1, Llive/hms/video/media/capturers/camera/CameraControl;->imageReader:Landroid/media/ImageReader;

    if-eqz p0, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_2

    :try_start_0
    invoke-virtual {p2}, Ljava/util/concurrent/ArrayBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/media/Image;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/media/Image;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final captureImageAtMaxResolution(Llive/hms/video/sdk/HmsTypedActionResultListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onImageCapture"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;-><init>(Llive/hms/video/media/capturers/camera/CameraControl;Llive/hms/video/sdk/HmsTypedActionResultListener;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final captureImageAtMaxSupportedResolution(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "savePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;-><init>(Llive/hms/video/media/capturers/camera/CameraControl;Lkotlin/jvm/functions/Function1;Ljava/io/File;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final getAnalyticsEventsService$lib_release()Llive/hms/video/events/AnalyticsEventsService;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    return-object v0
.end method

.method public final getCameraHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public final getCaptureFormat()Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureFormat:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    return-object v0
.end method

.method public final getCaptureRequestBuilder()Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getCurrentCameraSession()Landroid/hardware/camera2/CameraCaptureSession;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    return-object v0
.end method

.method public final getImageReader()Landroid/media/ImageReader;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReader:Landroid/media/ImageReader;

    return-object v0
.end method

.method public final getManualFocusRange()Landroid/util/Range;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/util/Range;

    invoke-direct {v1, v0, v0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    return-object v1

    :cond_0
    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    invoke-static {v0, v1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getLensDistanceRange(Landroid/content/Context;Ljava/lang/String;)Landroid/util/Range;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_0
    new-instance v1, Landroid/util/Range;

    invoke-direct {v1, v0, v0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    return-object v1
.end method

.method public final getMaxZoom()F
    .locals 2

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->ZOOM_DEFAULT_VALUE:F

    return v0

    :cond_0
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    invoke-static {v0, v1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(ILandroid/content/Context;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Llive/hms/video/media/capturers/camera/CameraControl;->getMaxZoomInternal(Landroid/hardware/camera2/CameraCharacteristics;)F

    move-result v0

    return v0

    :cond_3
    :goto_1
    iget v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->ZOOM_DEFAULT_VALUE:F

    return v0
.end method

.method public final getMinZoom()F
    .locals 1

    iget v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->ZOOM_DEFAULT_VALUE:F

    return v0
.end method

.method public final isFlashEnabled()Z
    .locals 3

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    return v1
.end method

.method public final isFlashSupported()Z
    .locals 2

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    invoke-static {v1, v0}, Llive/hms/video/media/capturers/camera/CameraExtKt;->isFlashAvailable(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isManualFocusSupported()Z
    .locals 4

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    invoke-static {v2, v0}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getLensDistanceRange(Landroid/content/Context;Ljava/lang/String;)Landroid/util/Range;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_2

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final isTapToFocusSupported()Z
    .locals 4

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    invoke-static {v2, v3}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(ILandroid/content/Context;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v2, v3}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    if-nez v2, :cond_3

    return v1

    :cond_3
    array-length v2, v2

    const/4 v3, 0x1

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_0

    :cond_4
    move v2, v1

    :goto_0
    if-nez v2, :cond_5

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    invoke-static {v2, v0}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getFocusMaxMeteringRegionsSupported(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_5

    return v3

    :cond_5
    :goto_1
    return v1
.end method

.method public final isZoomSupported()Z
    .locals 3

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    invoke-static {v0, v2}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(ILandroid/content/Context;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Llive/hms/video/media/capturers/camera/CameraControl;->getMaxZoomInternal(Landroid/hardware/camera2/CameraCharacteristics;)F

    move-result v0

    iget v2, p0, Llive/hms/video/media/capturers/camera/CameraControl;->ZOOM_DEFAULT_VALUE:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final onCameraSessionUpdate$lib_release(Lhms/webrtc/Camera2Session;)V
    .locals 1

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lhms/webrtc/Camera2Session;->getCaptureRequestBuilder()Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {p1}, Lhms/webrtc/Camera2Session;->getCamera2CaptureSession()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    invoke-virtual {p1}, Lhms/webrtc/Camera2Session;->getCameraCaptureFormat()Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureFormat:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    invoke-virtual {p1}, Lhms/webrtc/Camera2Session;->getImageReader()Landroid/media/ImageReader;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReader:Landroid/media/ImageReader;

    return-void
.end method

.method public final resetZoom()V
    .locals 4

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    if-eqz v1, :cond_2

    new-instance v2, Lio/sentry/android/core/r0;

    const/16 v3, 0x10

    invoke-direct {v2, v3, p0, v0}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final setCaptureFormat(Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureFormat:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    return-void
.end method

.method public final setCaptureRequestBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    return-void
.end method

.method public final setCurrentCameraSession(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    return-void
.end method

.method public final setFlash(Z)V
    .locals 3

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    if-eqz v0, :cond_2

    new-instance v1, Lb9/g0;

    const/4 v2, 0x3

    invoke-direct {v1, p0, p1, v2}, Lb9/g0;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public final setImageReader(Landroid/media/ImageReader;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->imageReader:Landroid/media/ImageReader;

    return-void
.end method

.method public final setManualFocus(F)V
    .locals 3

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->getManualFocusRange()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v1

    const-string v2, "getLower(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    const-string v2, "getUpper(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {p1, v1, v0}, Le93/b;->m(FFF)F

    move-result p1

    iput p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->lastLensDistance:F

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v0, :cond_2

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->LENS_FOCUS_DISTANCE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_2
    :try_start_0
    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz p1, :cond_4

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    new-instance v1, Llive/hms/video/media/capturers/camera/CameraControl$setManualFocus$1$1;

    invoke-direct {v1}, Llive/hms/video/media/capturers/camera/CameraControl$setManualFocus$1$1;-><init>()V

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0, v1, v2}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_4
    :goto_0
    return-void
.end method

.method public final setTapToFocusAt(FFIILhms/webrtc/RendererCommon$ScalingType;)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "scalingType"

    move-object/from16 v14, p5

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_7

    :cond_0
    const/4 v5, 0x0

    cmpg-float v6, v1, v5

    if-ltz v6, :cond_10

    move/from16 v8, p3

    int-to-float v6, v8

    cmpl-float v6, v1, v6

    if-gtz v6, :cond_10

    cmpg-float v6, v2, v5

    if-ltz v6, :cond_10

    move/from16 v9, p4

    int-to-float v6, v9

    cmpl-float v6, v2, v6

    if-lez v6, :cond_1

    goto/16 :goto_7

    :cond_1
    iget-object v6, v0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v6, :cond_10

    sget-object v7, Landroid/hardware/camera2/CaptureRequest;->SCALER_CROP_REGION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v6, v7}, Landroid/hardware/camera2/CaptureRequest$Builder;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Rect;

    if-nez v6, :cond_2

    goto/16 :goto_7

    :cond_2
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v15

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v16

    iget-object v6, v0, Llive/hms/video/media/capturers/camera/CameraControl;->context:Landroid/content/Context;

    iget-object v7, v0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    const-string v10, "1"

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    :cond_3
    move-object v7, v10

    :cond_4
    invoke-static {v6, v7}, Llive/hms/video/media/capturers/camera/CameraExtKt;->computeRelativeRotation(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    iget-object v7, v0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    const/16 v17, 0x0

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_5
    move-object/from16 v7, v17

    :goto_0
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    goto :goto_1

    :cond_6
    const/4 v3, -0x1

    :goto_1
    mul-int v13, v3, v6

    sget-object v6, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    new-instance v7, Landroid/graphics/RectF;

    invoke-direct {v7, v1, v2, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iget-object v1, v0, Llive/hms/video/media/capturers/camera/CameraControl;->captureFormat:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    if-eqz v1, :cond_7

    iget v1, v1, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v10, v1

    goto :goto_2

    :cond_7
    move-object/from16 v10, v17

    :goto_2
    iget-object v1, v0, Llive/hms/video/media/capturers/camera/CameraControl;->captureFormat:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    if-eqz v1, :cond_8

    iget v1, v1, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v11, v1

    goto :goto_3

    :cond_8
    move-object/from16 v11, v17

    :goto_3
    invoke-virtual/range {v6 .. v14}, Llive/hms/video/utils/HMSUtils;->viewToNormalized$lib_release(Landroid/graphics/RectF;IILjava/lang/Integer;Ljava/lang/Integer;ZILhms/webrtc/RendererCommon$ScalingType;)Landroid/graphics/RectF;

    move-result-object v1

    if-nez v1, :cond_9

    goto/16 :goto_7

    :cond_9
    iget v2, v1, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/RectF;->top:F

    new-instance v8, Landroid/graphics/RectF;

    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    const v3, 0x3d4ccccd    # 0.05f

    sub-float v7, v2, v3

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v7, v5, v9}, Lrj/j;->q(FFF)F

    move-result v7

    iput v7, v8, Landroid/graphics/RectF;->left:F

    add-float/2addr v2, v3

    invoke-static {v2, v5, v9}, Lrj/j;->q(FFF)F

    move-result v2

    iput v2, v8, Landroid/graphics/RectF;->right:F

    sub-float v2, v1, v3

    invoke-static {v2, v5, v9}, Lrj/j;->q(FFF)F

    move-result v2

    iput v2, v8, Landroid/graphics/RectF;->top:F

    add-float/2addr v1, v3

    invoke-static {v1, v5, v9}, Lrj/j;->q(FFF)F

    move-result v1

    iput v1, v8, Landroid/graphics/RectF;->bottom:F

    iget-object v1, v0, Llive/hms/video/media/capturers/camera/CameraControl;->captureFormat:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    if-eqz v1, :cond_a

    iget v1, v1, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v9, v1

    goto :goto_4

    :cond_a
    move-object/from16 v9, v17

    :goto_4
    iget-object v1, v0, Llive/hms/video/media/capturers/camera/CameraControl;->captureFormat:Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;

    if-eqz v1, :cond_b

    iget v1, v1, Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    :cond_b
    move-object/from16 v10, v17

    const/4 v13, 0x1

    move-object v7, v6

    move v11, v15

    move/from16 v12, v16

    invoke-virtual/range {v7 .. v13}, Llive/hms/video/utils/HMSUtils;->normalizedToCameraSensor$lib_release(Landroid/graphics/RectF;Ljava/lang/Integer;Ljava/lang/Integer;IIZ)Landroid/graphics/RectF;

    move-result-object v1

    if-nez v1, :cond_c

    goto :goto_7

    :cond_c
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v3

    cmpg-float v3, v3, v5

    if-nez v3, :cond_d

    goto :goto_5

    :cond_d
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v3

    cmpg-float v3, v3, v5

    if-nez v3, :cond_e

    :goto_5
    new-instance v2, Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-direct {v2, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_6

    :cond_e
    invoke-virtual {v1, v2}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    :goto_6
    iget-object v1, v0, Llive/hms/video/media/capturers/camera/CameraControl;->captureRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    if-eqz v1, :cond_f

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    new-instance v5, Landroid/hardware/camera2/params/MeteringRectangle;

    const/16 v6, 0x3e8

    invoke-direct {v5, v2, v6}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    filled-new-array {v5}, [Landroid/hardware/camera2/params/MeteringRectangle;

    move-result-object v5

    invoke-virtual {v1, v3, v5}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_REGIONS:Landroid/hardware/camera2/CaptureRequest$Key;

    new-instance v5, Landroid/hardware/camera2/params/MeteringRectangle;

    invoke-direct {v5, v2, v6}, Landroid/hardware/camera2/params/MeteringRectangle;-><init>(Landroid/graphics/Rect;I)V

    filled-new-array {v5}, [Landroid/hardware/camera2/params/MeteringRectangle;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v1, v2, v4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_f
    iget-object v1, v0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    if-eqz v1, :cond_10

    new-instance v2, Lio/sentry/c7;

    const/16 v3, 0x1c

    invoke-direct {v2, v0, v3}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_10
    :goto_7
    return-void
.end method

.method public final setZoom(F)V
    .locals 3

    invoke-direct {p0}, Llive/hms/video/media/capturers/camera/CameraControl;->isValidSession()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl;->currentCameraSession:Landroid/hardware/camera2/CameraCaptureSession;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl;->cameraHandler:Landroid/os/Handler;

    if-eqz v1, :cond_2

    new-instance v2, Llive/hms/video/media/capturers/camera/a;

    invoke-direct {v2, p0, p1, v0}, Llive/hms/video/media/capturers/camera/a;-><init>(Llive/hms/video/media/capturers/camera/CameraControl;FLjava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    return-void
.end method
