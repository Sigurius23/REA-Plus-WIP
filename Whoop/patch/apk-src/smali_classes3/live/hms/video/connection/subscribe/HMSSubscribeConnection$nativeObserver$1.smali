.class public final Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;
.super Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/subscribe/HMSSubscribeConnection;-><init>(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\t2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\t2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "live/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1",
        "Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;",
        "Lhms/webrtc/RtpReceiver;",
        "receiver",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "getTrack",
        "(Lhms/webrtc/RtpReceiver;)Llive/hms/video/media/tracks/HMSTrack;",
        "Lhms/webrtc/PeerConnection$IceConnectionState;",
        "newState",
        "Ll83/a0;",
        "onIceConnectionChange",
        "(Lhms/webrtc/PeerConnection$IceConnectionState;)V",
        "Lhms/webrtc/DataChannel;",
        "dataChannel",
        "onDataChannel",
        "(Lhms/webrtc/DataChannel;)V",
        "",
        "Lhms/webrtc/MediaStream;",
        "mediaStreams",
        "onAddTrack",
        "(Lhms/webrtc/RtpReceiver;[Lhms/webrtc/MediaStream;)V",
        "onRemoveTrack",
        "(Lhms/webrtc/RtpReceiver;)V",
        "Lhms/webrtc/IceCandidate;",
        "candidate",
        "onIceCandidate",
        "(Lhms/webrtc/IceCandidate;)V",
        "Lhms/webrtc/CandidatePairChangeEvent;",
        "event",
        "onSelectedCandidatePairChanged",
        "(Lhms/webrtc/CandidatePairChangeEvent;)V",
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
.field final synthetic $observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

.field final synthetic $remoteTrackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

.field final synthetic $signal:Llive/hms/video/signal/ISignal;

.field final synthetic this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/signal/ISignal;Llive/hms/video/connection/models/HMSConnectionRole;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iput-object p2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    iput-object p3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$remoteTrackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

    iput-object p4, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$signal:Llive/hms/video/signal/ISignal;

    invoke-direct {p0, p5}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;-><init>(Llive/hms/video/connection/models/HMSConnectionRole;)V

    return-void
.end method

.method public static final synthetic access$getTrack(Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;Lhms/webrtc/RtpReceiver;)Llive/hms/video/media/tracks/HMSTrack;
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->getTrack(Lhms/webrtc/RtpReceiver;)Llive/hms/video/media/tracks/HMSTrack;

    move-result-object p0

    return-object p0
.end method

.method private final getTrack(Lhms/webrtc/RtpReceiver;)Llive/hms/video/media/tracks/HMSTrack;
    .locals 8

    const-string v0, "HMSSubscribeConnection"

    iget-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-static {v1}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->access$getRemoteStreams$p(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "<get-values>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/media/streams/HMSRemoteStream;

    invoke-virtual {v2}, Llive/hms/video/media/streams/HMSMediaStream;->getTracks()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    :try_start_0
    invoke-virtual {v2}, Llive/hms/video/media/streams/HMSMediaStream;->getTracks()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llive/hms/video/media/tracks/HMSTrack;

    invoke-virtual {v6}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v6

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lhms/webrtc/RtpReceiver;->track()Lhms/webrtc/MediaStreamTrack;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lhms/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :catch_0
    move-exception v6

    goto :goto_3

    :cond_1
    move-object v7, v3

    :goto_1
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Track::"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhms/webrtc/RtpReceiver;->track()Lhms/webrtc/MediaStreamTrack;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lhms/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v3

    :goto_2
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " removed from the "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "th position"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Llive/hms/video/media/streams/HMSMediaStream;->getTracks()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llive/hms/video/media/tracks/HMSTrack;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :goto_3
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method


# virtual methods
.method public onAddTrack(Lhms/webrtc/RtpReceiver;[Lhms/webrtc/MediaStream;)V
    .locals 8

    const-string v0, "receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaStreams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onAddTrack(Lhms/webrtc/RtpReceiver;[Lhms/webrtc/MediaStream;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v5, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$remoteTrackFactory:Llive/hms/video/connection/subscribe/RemoteTrackFactory;

    iget-object v6, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    const/4 v7, 0x0

    move-object v4, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onAddTrack$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;[Lhms/webrtc/MediaStream;Lhms/webrtc/RtpReceiver;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onDataChannel(Lhms/webrtc/DataChannel;)V
    .locals 5

    const-string v0, "dataChannel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onDataChannel(Lhms/webrtc/DataChannel;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    const/4 v4, 0x0

    invoke-direct {v1, v2, p1, v3, v4}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Lhms/webrtc/DataChannel;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onIceCandidate(Lhms/webrtc/IceCandidate;)V
    .locals 5

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onIceCandidate(Lhms/webrtc/IceCandidate;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onIceCandidate$1;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, p1, v4}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onIceCandidate$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lhms/webrtc/IceCandidate;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v4, v4, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Llive/hms/video/connection/models/HMSTrickle;

    sget-object v1, Llive/hms/video/connection/models/HMSIceCandidate;->Companion:Llive/hms/video/connection/models/HMSIceCandidate$Companion;

    invoke-virtual {v1, p1}, Llive/hms/video/connection/models/HMSIceCandidate$Companion;->from(Lhms/webrtc/IceCandidate;)Llive/hms/video/connection/models/HMSIceCandidate;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-virtual {v1}, Llive/hms/video/connection/HMSConnection;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-virtual {v2}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Llive/hms/video/connection/models/HMSTrickle;-><init>(Llive/hms/video/connection/models/HMSIceCandidate;Llive/hms/video/connection/models/HMSConnectionRole;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$signal:Llive/hms/video/signal/ISignal;

    invoke-interface {p1, v0}, Llive/hms/video/signal/ISignal;->trickle(Llive/hms/video/connection/models/HMSTrickle;)V

    return-void
.end method

.method public onIceConnectionChange(Lhms/webrtc/PeerConnection$IceConnectionState;)V
    .locals 5

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onIceConnectionChange(Lhms/webrtc/PeerConnection$IceConnectionState;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onIceConnectionChange$1;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, p1, v4}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onIceConnectionChange$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lhms/webrtc/PeerConnection$IceConnectionState;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onRemoveTrack(Lhms/webrtc/RtpReceiver;)V
    .locals 7

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onRemoveTrack(Lhms/webrtc/RtpReceiver;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onRemoveTrack$1;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v5, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onRemoveTrack$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;Lhms/webrtc/RtpReceiver;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lq83/d;)V

    const/4 p1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;)V
    .locals 5

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, p1, v4}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
