.class final Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/diagnostics/HMSDiagnostics;->startCameraCheck(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/diagnostics/HMSCameraCheckListener;)V
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
    c = "live.hms.video.diagnostics.HMSDiagnostics$startCameraCheck$1"
    f = "HMSDiagnostics.kt"
    l = {
        0xa4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $listener:Llive/hms/video/diagnostics/HMSCameraCheckListener;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/diagnostics/HMSDiagnostics;


# direct methods
.method public constructor <init>(Llive/hms/video/diagnostics/HMSDiagnostics;Llive/hms/video/diagnostics/HMSCameraCheckListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/diagnostics/HMSDiagnostics;",
            "Llive/hms/video/diagnostics/HMSCameraCheckListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    iput-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->$listener:Llive/hms/video/diagnostics/HMSCameraCheckListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    iget-object v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->$listener:Llive/hms/video/diagnostics/HMSCameraCheckListener;

    invoke-direct {p1, v0, v1, p2}, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;-><init>(Llive/hms/video/diagnostics/HMSDiagnostics;Llive/hms/video/diagnostics/HMSCameraCheckListener;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const-string v0, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSLocalVideoTrack"

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->L$0:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/diagnostics/HMSDiagnostics;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getDelegate$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/sdk/SDKDelegate;

    move-result-object v2

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->label:I

    const/4 v4, 0x0

    invoke-static {v2, v4, p0, v3, v4}, Llive/hms/video/sdk/SDKDelegate;->getLocalVideoTrack$default(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    move-object v1, p1

    move-object p1, v2

    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {v1, p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->setVideoTrack(Llive/hms/video/media/tracks/HMSLocalVideoTrack;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-virtual {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->getVideoTrack()Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getCapturer$lib_release()Llive/hms/video/media/capturers/HMSCapturer;

    move-result-object p1

    invoke-interface {p1}, Llive/hms/video/media/capturers/HMSCapturer;->start()V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->$listener:Llive/hms/video/diagnostics/HMSCameraCheckListener;

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-virtual {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->getVideoTrack()Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type live.hms.video.media.tracks.HMSVideoTrack"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Llive/hms/video/diagnostics/HMSCameraCheckListener;->onVideoTrack(Llive/hms/video/media/tracks/HMSVideoTrack;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getDeviceTestReport()Llive/hms/video/diagnostics/models/DeviceTestReport;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/DeviceTestReport;->getVideoInputReport()Llive/hms/video/diagnostics/models/VideoInputDeviceReport;

    move-result-object p1

    invoke-virtual {p1, v3}, Llive/hms/video/diagnostics/models/VideoInputDeviceReport;->setPassed(Z)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->$listener:Llive/hms/video/diagnostics/HMSCameraCheckListener;

    invoke-interface {v0, p1}, Llive/hms/video/diagnostics/HMSCameraCheckListener;->onError(Llive/hms/video/error/HMSException;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getDeviceTestReport()Llive/hms/video/diagnostics/models/DeviceTestReport;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/DeviceTestReport;->getVideoInputReport()Llive/hms/video/diagnostics/models/VideoInputDeviceReport;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Llive/hms/video/diagnostics/models/VideoInputDeviceReport;->setPassed(Z)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
