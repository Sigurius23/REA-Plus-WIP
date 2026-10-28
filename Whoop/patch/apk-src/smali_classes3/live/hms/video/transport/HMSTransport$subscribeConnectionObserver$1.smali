.class public final Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/transport/HMSTransport;-><init>(Landroid/content/Context;Llive/hms/video/transport/ITransportObserver;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/utils/HMSAgentOs;Llive/hms/video/transport/IsQaLink;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;Llive/hms/video/network/HMSNetworkManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "live/hms/video/transport/HMSTransport$subscribeConnectionObserver$1",
        "Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;",
        "Lcom/google/gson/JsonObject;",
        "message",
        "Ll83/a0;",
        "onApiChannelMessage",
        "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "onTrackAdd",
        "(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;",
        "onTrackRemove",
        "Lhms/webrtc/PeerConnection$IceConnectionState;",
        "newState",
        "onIceConnectionChange",
        "(Lhms/webrtc/PeerConnection$IceConnectionState;Lq83/d;)Ljava/lang/Object;",
        "Lhms/webrtc/IceCandidate;",
        "candidate",
        "onIceCandidate",
        "(Lhms/webrtc/IceCandidate;Lq83/d;)Ljava/lang/Object;",
        "Lhms/webrtc/CandidatePairChangeEvent;",
        "event",
        "onSelectedCandidatePairChanged",
        "(Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)Ljava/lang/Object;",
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
.field final synthetic this$0:Llive/hms/video/transport/HMSTransport;


# direct methods
.method public constructor <init>(Llive/hms/video/transport/HMSTransport;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApiChannelMessage(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$isTearDownInProgress$p(Llive/hms/video/transport/HMSTransport;)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_2

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-virtual {v0}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    sget-object v2, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-virtual {v0}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    sget-object v2, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Llive/hms/video/transport/ITransportObserver;->onNotification(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Ignoring "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as leave in progress"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSTransport"

    invoke-virtual {p2, v0, p1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public onDataChannel(Lhms/webrtc/DataChannel;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/DataChannel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver$DefaultImpls;->onDataChannel(Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lhms/webrtc/DataChannel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onIceCandidate(Lhms/webrtc/IceCandidate;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/IceCandidate;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p2}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Llive/hms/video/transport/ITransportObserver;->onIceCandidate(Lhms/webrtc/IceCandidate;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onIceConnectionChange(Lhms/webrtc/PeerConnection$IceConnectionState;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/PeerConnection$IceConnectionState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role=SUBSCRIBE] onIceConnectionChange state :: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSTransport"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eq p1, v0, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getCallbacks$p(Llive/hms/video/transport/HMSTransport;)Ljava/util/HashMap;

    move-result-object p1

    const-string p2, "subscribe-renegotiation-callback"

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/transport/models/TransportCallbackTriple;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Llive/hms/video/transport/models/TransportCallbackTriple;->getDeferred()Lbc3/s;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, p2}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :cond_1
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Llive/hms/video/transport/ITransportObserver;->onICEConnected(Z)V

    :goto_0
    return-object v1

    :cond_2
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    sget-object v0, Llive/hms/video/connection/models/HMSConnectionRole;->SUBSCRIBE:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-static {p1, v0, p2}, Llive/hms/video/transport/HMSTransport;->access$handleIceConnectionFailed(Llive/hms/video/transport/HMSTransport;Llive/hms/video/connection/models/HMSConnectionRole;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    return-object v1
.end method

.method public onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/CandidatePairChangeEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p2}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Llive/hms/video/transport/ITransportObserver;->onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onTrackAdd(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ISubscribeConnectionObserver: onTrackAdd trackId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSTransport"

    invoke-virtual {p2, v1, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p2}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object p2

    invoke-interface {p2, p1}, Llive/hms/video/transport/ITransportObserver;->onTrackAdd(Llive/hms/video/media/tracks/HMSTrack;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onTrackRemove(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ISubscribeConnectionObserver: onTrackRemove trackId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSTransport"

    invoke-virtual {p2, v1, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Llive/hms/video/transport/HMSTransport$subscribeConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p2}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object p2

    invoke-interface {p2, p1}, Llive/hms/video/transport/ITransportObserver;->onTrackRemove(Llive/hms/video/media/tracks/HMSTrack;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
