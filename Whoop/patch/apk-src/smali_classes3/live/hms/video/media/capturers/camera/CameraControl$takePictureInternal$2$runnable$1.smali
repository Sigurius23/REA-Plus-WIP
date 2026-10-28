.class final Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/camera/CameraControl;->takePictureInternal(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
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

.field final synthetic $exc:Ljava/util/concurrent/TimeoutException;

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
.method public constructor <init>(Ljava/util/concurrent/TimeoutException;Ljava/util/concurrent/atomic/AtomicBoolean;Lq83/d;Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/TimeoutException;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            ">;",
            "Lkotlin/jvm/internal/g0;",
            "Llive/hms/video/media/capturers/camera/CameraControl;",
            "Ljava/util/concurrent/ArrayBlockingQueue<",
            "Landroid/media/Image;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$exc:Ljava/util/concurrent/TimeoutException;

    iput-object p2, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$resumed:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$cont:Lq83/d;

    iput-object p4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$timeoutRunnable:Lkotlin/jvm/internal/g0;

    iput-object p5, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iput-object p6, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$imageQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$resumed:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$cont:Lq83/d;

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$timeoutRunnable:Lkotlin/jvm/internal/g0;

    iget-object v3, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$imageQueue:Ljava/util/concurrent/ArrayBlockingQueue;

    iget-object v5, p0, Llive/hms/video/media/capturers/camera/CameraControl$takePictureInternal$2$runnable$1;->$exc:Ljava/util/concurrent/TimeoutException;

    invoke-static/range {v0 .. v5}, Llive/hms/video/media/capturers/camera/CameraControl;->access$takePictureInternal$lambda$22$failOnce(Ljava/util/concurrent/atomic/AtomicBoolean;Lq83/d;Lkotlin/jvm/internal/g0;Llive/hms/video/media/capturers/camera/CameraControl;Ljava/util/concurrent/ArrayBlockingQueue;Ljava/lang/Throwable;)V

    return-void
.end method
