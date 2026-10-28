.class final Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->onAddTrack(Lhms/webrtc/RtpReceiver;[Lhms/webrtc/MediaStream;)V
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
    c = "live.hms.video.connection.subscribe.HMSSubscribeConnection$nativeObserver$1$onAddTrack$1"
    f = "HMSSubscribeConnection.kt"
    l = {
        0x91
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $mediaStreams:[Lhms/webrtc/MediaStream;

.field final synthetic $observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

.field final synthetic $receiver:Lhms/webrtc/RtpReceiver;

.field final synthetic $remoteTrackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

.field label:I

.field final synthetic this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;[Lhms/webrtc/MediaStream;Lhms/webrtc/RtpReceiver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;",
            "[",
            "Lhms/webrtc/MediaStream;",
            "Lhms/webrtc/RtpReceiver;",
            "Llive/hms/video/connection/subscribe/RemoteTrackFactory;",
            "Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iput-object p2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$mediaStreams:[Lhms/webrtc/MediaStream;

    iput-object p3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$receiver:Lhms/webrtc/RtpReceiver;

    iput-object p4, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$remoteTrackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

    iput-object p5, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;

    iget-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$mediaStreams:[Lhms/webrtc/MediaStream;

    iget-object v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$receiver:Lhms/webrtc/RtpReceiver;

    iget-object v4, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$remoteTrackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

    iget-object v5, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;[Lhms/webrtc/MediaStream;Lhms/webrtc/RtpReceiver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const-string v0, "Added to the "

    const-string v1, "Adding "

    const-string v2, "Adding to remoteStreams :: "

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->label:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x1

    const-string v7, "HMSSubscribeConnection"

    if-eqz v4, :cond_1

    if-ne v4, v6, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-virtual {p1}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->isClose()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "Ignoring onAddTrack as connection is closed"

    invoke-static {v7, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v5

    :cond_2
    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$mediaStreams:[Lhms/webrtc/MediaStream;

    const/4 v4, 0x0

    aget-object p1, p1, v4

    iget-object v8, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-static {v8}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->access$getRemoteStreams$p(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)Ljava/util/HashMap;

    move-result-object v8

    invoke-virtual {p1}, Lhms/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    new-instance v8, Llive/hms/video/media/streams/HMSRemoteStream;

    iget-object v9, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-direct {v8, p1, v9}, Llive/hms/video/media/streams/HMSRemoteStream;-><init>(Lhms/webrtc/MediaStream;Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Llive/hms/video/media/streams/HMSMediaStream;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-static {v2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->access$getRemoteStreams$p(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v8}, Llive/hms/video/media/streams/HMSMediaStream;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v2, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-static {v2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->access$getRemoteStreams$p(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {p1}, Lhms/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Llive/hms/video/media/streams/HMSRemoteStream;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$receiver:Lhms/webrtc/RtpReceiver;

    invoke-virtual {v2}, Lhms/webrtc/RtpReceiver;->track()Lhms/webrtc/MediaStreamTrack;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v8, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$receiver:Lhms/webrtc/RtpReceiver;

    invoke-virtual {v8}, Lhms/webrtc/RtpReceiver;->getParameters()Lhms/webrtc/RtpParameters;

    move-result-object v8

    iget-object v8, v8, Lhms/webrtc/RtpParameters;->encodings:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-nez v8, :cond_4

    const-string p1, "RtpParameters are not ready."

    invoke-static {v7, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v5

    :cond_4
    iget-object v8, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$remoteTrackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

    iget-object v9, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$receiver:Lhms/webrtc/RtpReceiver;

    invoke-virtual {v9}, Lhms/webrtc/RtpReceiver;->getParameters()Lhms/webrtc/RtpParameters;

    move-result-object v9

    iget-object v9, v9, Lhms/webrtc/RtpParameters;->encodings:Ljava/util/List;

    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lhms/webrtc/RtpParameters$Encoding;

    iget-object v9, v9, Lhms/webrtc/RtpParameters$Encoding;->ssrc:Ljava/lang/Long;

    const-string v10, "ssrc"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    invoke-virtual {v8, v2, p1, v9, v10}, Llive/hms/video/connection/subscribe/RemoteTrackFactory;->createRemoteTrack(Lhms/webrtc/MediaStreamTrack;Llive/hms/video/media/streams/HMSRemoteStream;J)Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " track :: trackId = "

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lhms/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ssrc = "

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$receiver:Lhms/webrtc/RtpReceiver;

    invoke-virtual {v1}, Lhms/webrtc/RtpReceiver;->getParameters()Lhms/webrtc/RtpParameters;

    move-result-object v1

    iget-object v1, v1, Lhms/webrtc/RtpParameters;->encodings:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RtpParameters$Encoding;

    iget-object v1, v1, Lhms/webrtc/RtpParameters$Encoding;->ssrc:Ljava/lang/Long;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/streams/HMSMediaStream;->getTracks()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/streams/HMSMediaStream;->getTracks()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v6

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "th position"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v7, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    iput v6, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;->label:I

    invoke-interface {p1, v8, p0}, Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;->onTrackAdd(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v3, :cond_5

    return-object v3

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ignoring onAddTrack as MediaStream is already disposed "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v7, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-object v5
.end method
