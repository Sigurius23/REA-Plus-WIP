.class final Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.media.capturers.camera.CameraControl$takePictureInternal$2$3$onCaptureCompleted$1"
    f = "CameraControl.kt"
    l = {}
    m = "invokeSuspend"
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

.field final synthetic $result:Landroid/hardware/camera2/TotalCaptureResult;

.field final synthetic $resultTimestamp:Ljava/lang/Long;

.field final synthetic $resumed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic $timeoutRunnable:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Llive/hms/video/media/capturers/camera/CameraControl;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ArrayBlockingQueue;Ljava/lang/Long;Ljava/util/concurrent/atomic/AtomicBoolean;Llive/hms/video/media/capturers/camera/CameraControl;Lq83/d;Landroid/hardware/camera2/TotalCaptureResult;Lkotlin/jvm/internal/g0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Landroid/media/Image;",
            ">;",
            "Ljava/lang/Long;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            "Llive/hms/video/media/capturers/camera/CameraControl;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            ">;",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            "Lkotlin/jvm/internal/g0;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$imageQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    iput-object p2, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$resultTimestamp:Ljava/lang/Long;

    iput-object p3, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$resumed:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iput-object p5, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$cont:Lq83/d;

    iput-object p6, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$result:Landroid/hardware/camera2/TotalCaptureResult;

    iput-object p7, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$timeoutRunnable:Lkotlin/jvm/internal/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$imageQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$resultTimestamp:Ljava/lang/Long;

    iget-object v3, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$resumed:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v5, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$cont:Lq83/d;

    iget-object v6, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$result:Landroid/hardware/camera2/TotalCaptureResult;

    iget-object v7, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$timeoutRunnable:Lkotlin/jvm/internal/g0;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;-><init>(Ljava/util/concurrent/ArrayBlockingQueue;Ljava/lang/Long;Ljava/util/concurrent/atomic/AtomicBoolean;Llive/hms/video/media/capturers/camera/CameraControl;Lq83/d;Landroid/hardware/camera2/TotalCaptureResult;Lkotlin/jvm/internal/g0;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->label:I

    if-nez v0, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_0
    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$imageQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ArrayBlockingQueue;->take()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/Image;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/media/Image;->getFormat()I

    move-result v0

    const v1, 0x69656963

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/media/Image;->getTimestamp()J

    move-result-wide v0

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$resultTimestamp:Ljava/lang/Long;

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1}, Landroid/media/Image;->close()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$resumed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/media/Image;->close()V

    return-object v3

    :cond_2
    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$timeoutRunnable:Lkotlin/jvm/internal/g0;

    iget-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v5, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$imageQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-static {v0, v4, v5}, Llive/hms/video/media/capturers/camera/CameraControl;->access$takePictureInternal$lambda$22$releaseCaptureResources(Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;)V

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-virtual {v0}, Llive/hms/video/media/capturers/camera/CameraControl;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-virtual {v4}, Llive/hms/video/media/capturers/camera/CameraControl;->getCurrentCameraSession()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v4

    invoke-virtual {v4}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getId(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4}, Llive/hms/video/media/capturers/camera/CameraExtKt;->computeRelativeRotation(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iget-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-virtual {v4}, Llive/hms/video/media/capturers/camera/CameraControl;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v6, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-virtual {v6}, Llive/hms/video/media/capturers/camera/CameraControl;->getCurrentCameraSession()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6}, Landroid/hardware/camera2/CameraCaptureSession;->getDevice()Landroid/hardware/camera2/CameraDevice;

    move-result-object v6

    invoke-virtual {v6}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v6}, Llive/hms/video/media/capturers/camera/CameraExtKt;->getCameraCharacteristics(Landroid/content/Context;Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v4

    sget-object v5, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v4, v5}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez v4, :cond_4

    move v1, v2

    :cond_4
    :goto_2
    invoke-static {v0, v1}, Llive/hms/video/media/capturers/camera/CameraExtKt;->computeExifOrientation(IZ)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$cont:Lq83/d;

    new-instance v2, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->$result:Landroid/hardware/camera2/TotalCaptureResult;

    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v0}, Ljava/lang/Integer;-><init>(I)V

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$3$onCaptureCompleted$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-virtual {v0}, Llive/hms/video/media/capturers/camera/CameraControl;->getImageReader()Landroid/media/ImageReader;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/media/ImageReader;->getImageFormat()I

    move-result v0

    invoke-direct {v2, p1, v4, v5, v0}, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;-><init>(Landroid/media/Image;Landroid/hardware/camera2/CaptureResult;Ljava/lang/Integer;I)V

    invoke-interface {v1, v2}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-object v3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
