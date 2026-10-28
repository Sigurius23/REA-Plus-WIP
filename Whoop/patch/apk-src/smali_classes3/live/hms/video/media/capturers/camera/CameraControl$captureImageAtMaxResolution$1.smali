.class final Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/camera/CameraControl;->captureImageAtMaxResolution(Llive/hms/video/sdk/HmsTypedActionResultListener;)V
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
    c = "live.hms.video.media.capturers.camera.CameraControl$captureImageAtMaxResolution$1"
    f = "CameraControl.kt"
    l = {
        0x2d2,
        0x18a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $onImageCapture:Llive/hms/video/sdk/HmsTypedActionResultListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            ">;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/media/capturers/camera/CameraControl;


# direct methods
.method public constructor <init>(Llive/hms/video/media/capturers/camera/CameraControl;Llive/hms/video/sdk/HmsTypedActionResultListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/capturers/camera/CameraControl;",
            "Llive/hms/video/sdk/HmsTypedActionResultListener<",
            "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;",
            ">;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iput-object p2, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->$onImageCapture:Llive/hms/video/sdk/HmsTypedActionResultListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->$onImageCapture:Llive/hms/video/sdk/HmsTypedActionResultListener;

    invoke-direct {v0, v1, v2, p2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;-><init>(Llive/hms/video/media/capturers/camera/CameraControl;Llive/hms/video/sdk/HmsTypedActionResultListener;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$1:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/HmsTypedActionResultListener;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$3:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v3, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$2:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/sdk/HmsTypedActionResultListener;

    iget-object v5, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    iget-object v6, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-static {v1}, Llive/hms/video/media/capturers/camera/CameraControl;->access$getCameraCaptureMutex$p(Llive/hms/video/media/capturers/camera/CameraControl;)Lmc3/a;

    move-result-object v1

    iget-object v5, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->$onImageCapture:Llive/hms/video/sdk/HmsTypedActionResultListener;

    iget-object v6, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$1:Ljava/lang/Object;

    iput-object v5, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$2:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$3:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->label:I

    invoke-interface {v1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v5

    move-object v5, v1

    move-object v1, v6

    :goto_0
    :try_start_1
    iput-object v5, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$2:Ljava/lang/Object;

    iput-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->L$3:Ljava/lang/Object;

    iput v2, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxResolution$1;->label:I

    invoke-static {v1, p0}, Llive/hms/video/media/capturers/camera/CameraControl;->access$takePictureInternal(Llive/hms/video/media/capturers/camera/CameraControl;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, v3

    move-object v1, v5

    :goto_2
    :try_start_2
    check-cast p1, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v0, v3

    move-object v1, v5

    :goto_3
    :try_start_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_4
    instance-of v2, p1, Ll83/m;

    if-eqz v2, :cond_5

    move-object v2, v4

    goto :goto_5

    :cond_5
    move-object v2, p1

    :goto_5
    check-cast v2, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;

    instance-of v3, p1, Ll83/m;

    if-eqz v3, :cond_6

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_6

    :catchall_2
    move-exception p1

    goto :goto_8

    :cond_6
    :goto_6
    if-nez v2, :cond_8

    :cond_7
    sget-object v2, Llive/hms/video/error/ErrorFactory;->INSTANCE:Llive/hms/video/error/ErrorFactory;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v2, p1}, Llive/hms/video/error/ErrorFactory;->ImageCaptureException(Ljava/lang/Throwable;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_7

    :cond_8
    :try_start_4
    invoke-interface {v0, v2}, Llive/hms/video/sdk/HmsTypedActionResultListener;->onSuccess(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_7
    invoke-interface {v1, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_3
    move-exception p1

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v0

    :try_start_7
    invoke-static {v2, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_8
    invoke-interface {v1, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
