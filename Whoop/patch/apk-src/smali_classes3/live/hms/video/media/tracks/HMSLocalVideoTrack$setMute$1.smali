.class final Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setMute(Z)V
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
    c = "live.hms.video.media.tracks.HMSLocalVideoTrack$setMute$1"
    f = "HMSLocalVideoTrack.kt"
    l = {
        0x82
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $value:Z

.field label:I

.field final synthetic this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;


# direct methods
.method public constructor <init>(ZLlive/hms/video/media/tracks/HMSLocalVideoTrack;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Llive/hms/video/media/tracks/HMSLocalVideoTrack;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->$value:Z

    iput-object p2, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

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

    new-instance p1, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;

    iget-boolean v0, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->$value:Z

    iget-object v1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-direct {p1, v0, v1, p2}, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;-><init>(ZLlive/hms/video/media/tracks/HMSLocalVideoTrack;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "setMute :: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->$value:Z

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSLocalVideoTrack"

    invoke-static {v1, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    iget-boolean v1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->$value:Z

    xor-int/2addr v1, v2

    iput v2, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->label:I

    invoke-virtual {p1, v1, p0}, Llive/hms/video/media/tracks/HMSTrack;->setEnabled$lib_release(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getSignal$lib_release()Llive/hms/video/signal/ISignal;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v0, Llive/hms/video/sdk/models/HMSNotifications$Track;->Companion:Llive/hms/video/sdk/models/HMSNotifications$Track$Companion;

    iget-object v1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/HMSNotifications$Track$Companion;->from(Llive/hms/video/media/tracks/HMSTrack;)Llive/hms/video/sdk/models/HMSNotifications$Track;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Llive/hms/video/signal/ISignal;->trackUpdate(Ljava/util/List;)V

    :cond_3
    const-wide/16 v0, 0x64

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    iget-object p1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSVideoTrack;->isDisposed$lib_release()Z

    move-result p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_4

    return-object v0

    :cond_4
    iget-boolean p1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->$value:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getCapturer$lib_release()Llive/hms/video/media/capturers/HMSCapturer;

    move-result-object p1

    invoke-interface {p1}, Llive/hms/video/media/capturers/HMSCapturer;->stop()V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getCapturer$lib_release()Llive/hms/video/media/capturers/HMSCapturer;

    move-result-object p1

    invoke-interface {p1}, Llive/hms/video/media/capturers/HMSCapturer;->start()V

    :goto_1
    iget-object p1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getSendLocalUpdate$lib_release()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v1, p0, Llive/hms/video/media/tracks/HMSLocalVideoTrack$setMute$1;->this$0:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-object v0
.end method
