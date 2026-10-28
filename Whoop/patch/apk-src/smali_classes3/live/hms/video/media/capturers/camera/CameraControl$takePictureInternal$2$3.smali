.class public final Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/camera/CameraControl;->takePictureInternal(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\'\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "live/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3",
        "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
        "Landroid/hardware/camera2/CameraCaptureSession;",
        "session",
        "Landroid/hardware/camera2/CaptureRequest;",
        "request",
        "Landroid/hardware/camera2/TotalCaptureResult;",
        "result",
        "Ll83/a0;",
        "onCaptureCompleted",
        "(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V",
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


# instance fields
.field final synthetic $cont:Lq83/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq83/d<",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $imageQueue:Ljava/util/concurrent/ArrayBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Landroid/media/Image;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $resumed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic $timeoutRunnable:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic this$0:Llive/hms/video/media/capturers/camera/CameraControl;


# direct methods
.method public constructor <init>(Lq83/d;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/util/concurrent/atomic/AtomicBoolean;Llive/hms/video/media/capturers/camera/CameraControl;Lkotlin/jvm/internal/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            ">;",
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Landroid/media/Image;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            "Llive/hms/video/media/capturers/camera/CameraControl;",
            "Lkotlin/jvm/internal/g0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->$cont:Lq83/d;

    iput-object p2, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->$imageQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    iput-object p3, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->$resumed:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iput-object p5, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->$timeoutRunnable:Lkotlin/jvm/internal/g0;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 9

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    sget-object p1, Landroid/hardware/camera2/CaptureResult;->SENSOR_TIMESTAMP:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p3, p1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/Long;

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->$cont:Lq83/d;

    invoke-interface {p1}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance v0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->$imageQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    iget-object v3, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->$resumed:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v5, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->$cont:Lq83/d;

    iget-object v7, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->$timeoutRunnable:Lkotlin/jvm/internal/g0;

    const/4 v8, 0x0

    move-object v6, p3

    invoke-direct/range {v0 .. v8}, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;-><init>(Ljava/util/concurrent/ArrayBlockingQueue;Ljava/lang/Long;Ljava/util/concurrent/atomic/AtomicBoolean;Llive/hms/video/media/capturers/camera/CameraControl;Lq83/d;Landroid/hardware/camera2/TotalCaptureResult;Lkotlin/jvm/internal/g0;Lq83/d;)V

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, p3, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
