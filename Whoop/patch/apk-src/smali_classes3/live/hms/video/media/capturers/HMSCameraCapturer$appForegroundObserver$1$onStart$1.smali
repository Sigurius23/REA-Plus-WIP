.class final Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;->onStart(Landroidx/lifecycle/g0;)V
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
    c = "live.hms.video.media.capturers.HMSCameraCapturer$appForegroundObserver$1$onStart$1"
    f = "HMSCameraCapturer.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;


# direct methods
.method public constructor <init>(Llive/hms/video/media/capturers/HMSCameraCapturer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/capturers/HMSCameraCapturer;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-direct {p1, v0, p2}, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;-><init>(Llive/hms/video/media/capturers/HMSCameraCapturer;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-virtual {p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->isStarted()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$getCameraLostWhileActive$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$getStoppingDeliberately$p(Llive/hms/video/media/capturers/HMSCameraCapturer;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "HMSVideoCapturer"

    const-string v0, "App foregrounded with camera lost while active - restarting capture"

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    invoke-static {p1}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$restartCapture(Llive/hms/video/media/capturers/HMSCameraCapturer;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1$onStart$1;->this$0:Llive/hms/video/media/capturers/HMSCameraCapturer;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Llive/hms/video/media/capturers/HMSCameraCapturer;->access$setCameraLostWhileActive$p(Llive/hms/video/media/capturers/HMSCameraCapturer;Z)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
