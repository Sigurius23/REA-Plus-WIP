.class final Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->setExpectedLayer(Z)V
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
    c = "live.hms.video.media.tracks.HMSRemoteAudioTrack$setExpectedLayer$1"
    f = "HMSRemoteAudioTrack.kt"
    l = {
        0x49
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $isEnabled:Z

.field label:I

.field final synthetic this$0:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;


# direct methods
.method public constructor <init>(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/tracks/HMSRemoteAudioTrack;",
            "Z",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->this$0:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    iput-boolean p2, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->$isEnabled:Z

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

    new-instance p1, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;

    iget-object v0, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->this$0:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    iget-boolean v1, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->$isEnabled:Z

    invoke-direct {p1, v0, v1, p2}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;-><init>(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;ZLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const-string v0, "Successfully subscribed to audio for "

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->label:I

    const-string v3, "HMSRemoteAudioTrack"

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

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
    iget-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->this$0:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->getStream$lib_release()Llive/hms/video/media/streams/HMSRemoteStream;

    move-result-object p1

    iget-object v2, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->this$0:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    invoke-virtual {v2}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v2

    iget-boolean v5, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->$isEnabled:Z

    iput v4, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->label:I

    invoke-virtual {p1, v2, v5, p0}, Llive/hms/video/media/streams/HMSRemoteStream;->setAudio(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->this$0:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "error while subscribing to audio for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;->this$0:Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    invoke-virtual {v1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", error :: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
