.class final Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/camera/CameraControl;->captureImageAtMaxSupportedResolution(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V
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
    c = "live.hms.video.media.capturers.camera.CameraControl$captureImageAtMaxSupportedResolution$1"
    f = "CameraControl.kt"
    l = {
        0x2d2,
        0x1a6,
        0x1a7
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $savePath:Ljava/io/File;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/media/capturers/camera/CameraControl;


# direct methods
.method public constructor <init>(Llive/hms/video/media/capturers/camera/CameraControl;Lkotlin/jvm/functions/Function1;Ljava/io/File;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/capturers/camera/CameraControl;",
            "Lkotlin/jvm/functions/Function1;",
            "Ljava/io/File;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iput-object p2, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->$callback:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->$savePath:Ljava/io/File;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->$callback:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->$savePath:Ljava/io/File;

    invoke-direct {v0, v1, v2, v3, p2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;-><init>(Llive/hms/video/media/capturers/camera/CameraControl;Lkotlin/jvm/functions/Function1;Ljava/io/File;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->label:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$5:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/io/Closeable;

    iget-object v3, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    iget-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$2:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v7, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$2:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v7, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lmc3/a;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto/16 :goto_5

    :cond_2
    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v7, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$3:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v8, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lmc3/a;

    iget-object v10, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    invoke-static {v1}, Llive/hms/video/media/capturers/camera/CameraControl;->access$getCameraCaptureMutex$p(Llive/hms/video/media/capturers/camera/CameraControl;)Lmc3/a;

    move-result-object v1

    iget-object v7, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->$callback:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->this$0:Llive/hms/video/media/capturers/camera/CameraControl;

    iget-object v9, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->$savePath:Ljava/io/File;

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$2:Ljava/lang/Object;

    iput-object v8, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$3:Ljava/lang/Object;

    iput-object v9, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$4:Ljava/lang/Object;

    iput v5, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->label:I

    invoke-interface {v1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    move-object v11, v9

    move-object v9, v1

    move-object v1, v11

    move-object v11, v8

    move-object v8, v7

    move-object v7, v11

    :goto_0
    :try_start_2
    iput-object v9, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$0:Ljava/lang/Object;

    iput-object v8, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$1:Ljava/lang/Object;

    iput-object v7, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$2:Ljava/lang/Object;

    iput-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$3:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$4:Ljava/lang/Object;

    iput v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->label:I

    invoke-static {v7, p0}, Llive/hms/video/media/capturers/camera/CameraControl;->access$takePictureInternal(Llive/hms/video/media/capturers/camera/CameraControl;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v4, v7

    move-object v7, v8

    move-object v8, v9

    :goto_1
    :try_start_3
    check-cast p1, Ljava/io/Closeable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    move-object v9, p1

    check-cast v9, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;

    invoke-virtual {v4}, Llive/hms/video/media/capturers/camera/CameraControl;->getContext()Landroid/content/Context;

    move-result-object v10

    iput-object v8, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$0:Ljava/lang/Object;

    iput-object v7, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$2:Ljava/lang/Object;

    iput-object v1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$3:Ljava/lang/Object;

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$4:Ljava/lang/Object;

    iput-object v9, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->L$5:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/media/capturers/camera/CameraControl$captureImageAtMaxSupportedResolution$1;->label:I

    invoke-static {v10, v9, v1, p0}, Llive/hms/video/media/capturers/camera/CameraExtKt;->saveResult(Landroid/content/Context;Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;Ljava/io/File;Lq83/d;)Ljava/lang/Object;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v3, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v3, v1

    move-object v0, v9

    move-object v1, p1

    :goto_3
    :try_start_5
    invoke-static {v3}, Lx83/j;->m(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    const-string v9, "jpg"

    invoke-virtual {p1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-static {v3}, Lx83/j;->m(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    const-string v9, "jpeg"

    invoke-virtual {p1, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    :cond_7
    new-instance p1, Landroid/media/ExifInterface;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v3}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    const-string v3, "Orientation"

    invoke-virtual {v0}, Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;->getOrientation()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/media/ExifInterface;->saveAttributes()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_8
    :try_start_6
    invoke-static {v1, v6}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object p1, v2

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    :goto_4
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_8
    invoke-static {v1, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :catchall_4
    move-exception p1

    move-object v4, v7

    move-object v7, v8

    move-object v8, v9

    :goto_5
    :try_start_9
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_6
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_9

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    if-eqz v0, :cond_9

    :try_start_a
    invoke-virtual {v4}, Llive/hms/video/media/capturers/camera/CameraControl;->getAnalyticsEventsService$lib_release()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v0

    sget-object v1, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Llive/hms/video/events/AnalyticsEventFactory;->cameraCapturingException(Ljava/lang/Throwable;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/events/AnalyticsEventsService;->flush()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v0

    :try_start_b
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    goto :goto_7

    :catchall_6
    move-exception p1

    goto :goto_8

    :cond_9
    :goto_7
    instance-of p1, p1, Ll83/m;

    xor-int/2addr p1, v5

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v7, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    invoke-interface {v8, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v2

    :goto_8
    invoke-interface {v8, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
