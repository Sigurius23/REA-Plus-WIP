.class public Lhms/webrtc/PeerConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/PeerConnection$RTCConfiguration;,
        Lhms/webrtc/PeerConnection$PortAllocatorConfig;,
        Lhms/webrtc/PeerConnection$PortAllocatorFlag;,
        Lhms/webrtc/PeerConnection$SdpSemantics;,
        Lhms/webrtc/PeerConnection$PortPrunePolicy;,
        Lhms/webrtc/PeerConnection$ContinualGatheringPolicy;,
        Lhms/webrtc/PeerConnection$KeyType;,
        Lhms/webrtc/PeerConnection$AdapterType;,
        Lhms/webrtc/PeerConnection$CandidateNetworkPolicy;,
        Lhms/webrtc/PeerConnection$TcpCandidatePolicy;,
        Lhms/webrtc/PeerConnection$RtcpMuxPolicy;,
        Lhms/webrtc/PeerConnection$BundlePolicy;,
        Lhms/webrtc/PeerConnection$IceTransportsType;,
        Lhms/webrtc/PeerConnection$IceServer;,
        Lhms/webrtc/PeerConnection$Observer;,
        Lhms/webrtc/PeerConnection$SignalingState;,
        Lhms/webrtc/PeerConnection$TlsCertPolicy;,
        Lhms/webrtc/PeerConnection$PeerConnectionState;,
        Lhms/webrtc/PeerConnection$IceConnectionState;,
        Lhms/webrtc/PeerConnection$IceGatheringState;
    }
.end annotation


# instance fields
.field private final localStreams:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhms/webrtc/MediaStream;",
            ">;"
        }
    .end annotation
.end field

.field private final nativePeerConnection:J

.field private receivers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhms/webrtc/RtpReceiver;",
            ">;"
        }
    .end annotation
.end field

.field private senders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhms/webrtc/RtpSender;",
            ">;"
        }
    .end annotation
.end field

.field private transceivers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhms/webrtc/RtpTransceiver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhms/webrtc/PeerConnection;->localStreams:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhms/webrtc/PeerConnection;->senders:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhms/webrtc/PeerConnection;->receivers:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lhms/webrtc/PeerConnection;->transceivers:Ljava/util/List;

    .line 7
    iput-wide p1, p0, Lhms/webrtc/PeerConnection;->nativePeerConnection:J

    return-void
.end method

.method public constructor <init>(Lhms/webrtc/NativePeerConnectionFactory;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lhms/webrtc/NativePeerConnectionFactory;->createNativePeerConnection()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lhms/webrtc/PeerConnection;-><init>(J)V

    return-void
.end method

.method public static createNativePeerConnectionObserver(Lhms/webrtc/PeerConnection$Observer;)J
    .locals 2

    invoke-static {p0}, Lhms/webrtc/PeerConnection;->nativeCreatePeerConnectionObserver(Lhms/webrtc/PeerConnection$Observer;)J

    move-result-wide v0

    return-wide v0
.end method

.method private native nativeAddIceCandidate(Ljava/lang/String;ILjava/lang/String;)Z
.end method

.method private native nativeAddIceCandidateWithObserver(Ljava/lang/String;ILjava/lang/String;Lhms/webrtc/AddIceObserver;)V
.end method

.method private native nativeAddLocalStream(J)Z
.end method

.method private native nativeAddTrack(JLjava/util/List;)Lhms/webrtc/RtpSender;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lhms/webrtc/RtpSender;"
        }
    .end annotation
.end method

.method private native nativeAddTransceiverOfType(Lhms/webrtc/MediaStreamTrack$MediaType;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;
.end method

.method private native nativeAddTransceiverWithTrack(JLhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;
.end method

.method private native nativeClose()V
.end method

.method private native nativeConnectionState()Lhms/webrtc/PeerConnection$PeerConnectionState;
.end method

.method private native nativeCreateAnswer(Lhms/webrtc/SdpObserver;Lhms/webrtc/MediaConstraints;)V
.end method

.method private native nativeCreateDataChannel(Ljava/lang/String;Lhms/webrtc/DataChannel$Init;)Lhms/webrtc/DataChannel;
.end method

.method private native nativeCreateOffer(Lhms/webrtc/SdpObserver;Lhms/webrtc/MediaConstraints;)V
.end method

.method private static native nativeCreatePeerConnectionObserver(Lhms/webrtc/PeerConnection$Observer;)J
.end method

.method private native nativeCreateSender(Ljava/lang/String;Ljava/lang/String;)Lhms/webrtc/RtpSender;
.end method

.method private static native nativeFreeOwnedPeerConnection(J)V
.end method

.method private native nativeGetCertificate()Lhms/webrtc/RtcCertificatePem;
.end method

.method private native nativeGetLocalDescription()Lhms/webrtc/SessionDescription;
.end method

.method private native nativeGetNativePeerConnection()J
.end method

.method private native nativeGetReceivers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhms/webrtc/RtpReceiver;",
            ">;"
        }
    .end annotation
.end method

.method private native nativeGetRemoteDescription()Lhms/webrtc/SessionDescription;
.end method

.method private native nativeGetSenders()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhms/webrtc/RtpSender;",
            ">;"
        }
    .end annotation
.end method

.method private native nativeGetTransceivers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhms/webrtc/RtpTransceiver;",
            ">;"
        }
    .end annotation
.end method

.method private native nativeIceConnectionState()Lhms/webrtc/PeerConnection$IceConnectionState;
.end method

.method private native nativeIceGatheringState()Lhms/webrtc/PeerConnection$IceGatheringState;
.end method

.method private native nativeNewGetStats(Lhms/webrtc/RTCStatsCollectorCallback;)V
.end method

.method private native nativeNewGetStatsReceiver(JLhms/webrtc/RTCStatsCollectorCallback;)V
.end method

.method private native nativeNewGetStatsSender(JLhms/webrtc/RTCStatsCollectorCallback;)V
.end method

.method private native nativeOldGetStats(Lhms/webrtc/StatsObserver;J)Z
.end method

.method private native nativeRemoveIceCandidates([Lhms/webrtc/IceCandidate;)Z
.end method

.method private native nativeRemoveLocalStream(J)V
.end method

.method private native nativeRemoveTrack(J)Z
.end method

.method private native nativeRestartIce()V
.end method

.method private native nativeSetAudioPlayout(Z)V
.end method

.method private native nativeSetAudioRecording(Z)V
.end method

.method private native nativeSetBitrate(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Z
.end method

.method private native nativeSetConfiguration(Lhms/webrtc/PeerConnection$RTCConfiguration;)Z
.end method

.method private native nativeSetLocalDescription(Lhms/webrtc/SdpObserver;Lhms/webrtc/SessionDescription;)V
.end method

.method private native nativeSetLocalDescriptionAutomatically(Lhms/webrtc/SdpObserver;)V
.end method

.method private native nativeSetRemoteDescription(Lhms/webrtc/SdpObserver;Lhms/webrtc/SessionDescription;)V
.end method

.method private native nativeSignalingState()Lhms/webrtc/PeerConnection$SignalingState;
.end method

.method private native nativeStartRtcEventLog(II)Z
.end method

.method private native nativeStopRtcEventLog()V
.end method


# virtual methods
.method public addIceCandidate(Lhms/webrtc/IceCandidate;Lhms/webrtc/AddIceObserver;)V
    .locals 2

    .line 2
    iget-object v0, p1, Lhms/webrtc/IceCandidate;->sdpMid:Ljava/lang/String;

    iget v1, p1, Lhms/webrtc/IceCandidate;->sdpMLineIndex:I

    iget-object p1, p1, Lhms/webrtc/IceCandidate;->sdp:Ljava/lang/String;

    invoke-direct {p0, v0, v1, p1, p2}, Lhms/webrtc/PeerConnection;->nativeAddIceCandidateWithObserver(Ljava/lang/String;ILjava/lang/String;Lhms/webrtc/AddIceObserver;)V

    return-void
.end method

.method public addIceCandidate(Lhms/webrtc/IceCandidate;)Z
    .locals 2

    .line 1
    iget-object v0, p1, Lhms/webrtc/IceCandidate;->sdpMid:Ljava/lang/String;

    iget v1, p1, Lhms/webrtc/IceCandidate;->sdpMLineIndex:I

    iget-object p1, p1, Lhms/webrtc/IceCandidate;->sdp:Ljava/lang/String;

    invoke-direct {p0, v0, v1, p1}, Lhms/webrtc/PeerConnection;->nativeAddIceCandidate(Ljava/lang/String;ILjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public addStream(Lhms/webrtc/MediaStream;)Z
    .locals 2

    invoke-virtual {p1}, Lhms/webrtc/MediaStream;->getNativeMediaStream()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lhms/webrtc/PeerConnection;->nativeAddLocalStream(J)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lhms/webrtc/PeerConnection;->localStreams:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public addTrack(Lhms/webrtc/MediaStreamTrack;)Lhms/webrtc/RtpSender;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p0, p1, v0}, Lhms/webrtc/PeerConnection;->addTrack(Lhms/webrtc/MediaStreamTrack;Ljava/util/List;)Lhms/webrtc/RtpSender;

    move-result-object p1

    return-object p1
.end method

.method public addTrack(Lhms/webrtc/MediaStreamTrack;Ljava/util/List;)Lhms/webrtc/RtpSender;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/MediaStreamTrack;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lhms/webrtc/RtpSender;"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 2
    invoke-virtual {p1}, Lhms/webrtc/MediaStreamTrack;->getNativeMediaStreamTrack()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, Lhms/webrtc/PeerConnection;->nativeAddTrack(JLjava/util/List;)Lhms/webrtc/RtpSender;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p2, p0, Lhms/webrtc/PeerConnection;->senders:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "C++ addTrack failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "No MediaStreamTrack specified in addTrack."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addTransceiver(Lhms/webrtc/MediaStreamTrack$MediaType;)Lhms/webrtc/RtpTransceiver;
    .locals 1

    .line 7
    new-instance v0, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;

    invoke-direct {v0}, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;-><init>()V

    invoke-virtual {p0, p1, v0}, Lhms/webrtc/PeerConnection;->addTransceiver(Lhms/webrtc/MediaStreamTrack$MediaType;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;

    move-result-object p1

    return-object p1
.end method

.method public addTransceiver(Lhms/webrtc/MediaStreamTrack$MediaType;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;
    .locals 0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    .line 8
    new-instance p2, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;

    invoke-direct {p2}, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;-><init>()V

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2}, Lhms/webrtc/PeerConnection;->nativeAddTransceiverOfType(Lhms/webrtc/MediaStreamTrack$MediaType;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 10
    iget-object p2, p0, Lhms/webrtc/PeerConnection;->transceivers:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1

    .line 11
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "C++ addTransceiver failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "No MediaType specified for addTransceiver."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addTransceiver(Lhms/webrtc/MediaStreamTrack;)Lhms/webrtc/RtpTransceiver;
    .locals 1

    .line 1
    new-instance v0, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;

    invoke-direct {v0}, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;-><init>()V

    invoke-virtual {p0, p1, v0}, Lhms/webrtc/PeerConnection;->addTransceiver(Lhms/webrtc/MediaStreamTrack;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;

    move-result-object p1

    return-object p1
.end method

.method public addTransceiver(Lhms/webrtc/MediaStreamTrack;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;
    .locals 2

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    .line 2
    new-instance p2, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;

    invoke-direct {p2}, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;-><init>()V

    .line 3
    :cond_0
    invoke-virtual {p1}, Lhms/webrtc/MediaStreamTrack;->getNativeMediaStreamTrack()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, Lhms/webrtc/PeerConnection;->nativeAddTransceiverWithTrack(JLhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p2, p0, Lhms/webrtc/PeerConnection;->transceivers:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "C++ addTransceiver failed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 6
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "No MediaStreamTrack specified for addTransceiver."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 0

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeClose()V

    return-void
.end method

.method public connectionState()Lhms/webrtc/PeerConnection$PeerConnectionState;
    .locals 1

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeConnectionState()Lhms/webrtc/PeerConnection$PeerConnectionState;

    move-result-object v0

    return-object v0
.end method

.method public createAnswer(Lhms/webrtc/SdpObserver;Lhms/webrtc/MediaConstraints;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhms/webrtc/PeerConnection;->nativeCreateAnswer(Lhms/webrtc/SdpObserver;Lhms/webrtc/MediaConstraints;)V

    return-void
.end method

.method public createDataChannel(Ljava/lang/String;Lhms/webrtc/DataChannel$Init;)Lhms/webrtc/DataChannel;
    .locals 0

    invoke-direct {p0, p1, p2}, Lhms/webrtc/PeerConnection;->nativeCreateDataChannel(Ljava/lang/String;Lhms/webrtc/DataChannel$Init;)Lhms/webrtc/DataChannel;

    move-result-object p1

    return-object p1
.end method

.method public createOffer(Lhms/webrtc/SdpObserver;Lhms/webrtc/MediaConstraints;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhms/webrtc/PeerConnection;->nativeCreateOffer(Lhms/webrtc/SdpObserver;Lhms/webrtc/MediaConstraints;)V

    return-void
.end method

.method public createSender(Ljava/lang/String;Ljava/lang/String;)Lhms/webrtc/RtpSender;
    .locals 0

    invoke-direct {p0, p1, p2}, Lhms/webrtc/PeerConnection;->nativeCreateSender(Ljava/lang/String;Ljava/lang/String;)Lhms/webrtc/RtpSender;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lhms/webrtc/PeerConnection;->senders:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p1
.end method

.method public dispose()V
    .locals 4

    invoke-virtual {p0}, Lhms/webrtc/PeerConnection;->close()V

    iget-object v0, p0, Lhms/webrtc/PeerConnection;->localStreams:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/MediaStream;

    invoke-virtual {v1}, Lhms/webrtc/MediaStream;->getNativeMediaStream()J

    move-result-wide v2

    invoke-direct {p0, v2, v3}, Lhms/webrtc/PeerConnection;->nativeRemoveLocalStream(J)V

    invoke-virtual {v1}, Lhms/webrtc/MediaStream;->dispose()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhms/webrtc/PeerConnection;->localStreams:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lhms/webrtc/PeerConnection;->senders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RtpSender;

    invoke-virtual {v1}, Lhms/webrtc/RtpSender;->dispose()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lhms/webrtc/PeerConnection;->senders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lhms/webrtc/PeerConnection;->receivers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RtpReceiver;

    invoke-virtual {v1}, Lhms/webrtc/RtpReceiver;->dispose()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lhms/webrtc/PeerConnection;->transceivers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RtpTransceiver;

    invoke-virtual {v1}, Lhms/webrtc/RtpTransceiver;->dispose()V

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lhms/webrtc/PeerConnection;->transceivers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lhms/webrtc/PeerConnection;->receivers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-wide v0, p0, Lhms/webrtc/PeerConnection;->nativePeerConnection:J

    invoke-static {v0, v1}, Lhms/webrtc/PeerConnection;->nativeFreeOwnedPeerConnection(J)V

    return-void
.end method

.method public getCertificate()Lhms/webrtc/RtcCertificatePem;
    .locals 1

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeGetCertificate()Lhms/webrtc/RtcCertificatePem;

    move-result-object v0

    return-object v0
.end method

.method public getLocalDescription()Lhms/webrtc/SessionDescription;
    .locals 1

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeGetLocalDescription()Lhms/webrtc/SessionDescription;

    move-result-object v0

    return-object v0
.end method

.method public getNativeOwnedPeerConnection()J
    .locals 2
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    iget-wide v0, p0, Lhms/webrtc/PeerConnection;->nativePeerConnection:J

    return-wide v0
.end method

.method public getNativePeerConnection()J
    .locals 2

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeGetNativePeerConnection()J

    move-result-wide v0

    return-wide v0
.end method

.method public getReceivers()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhms/webrtc/RtpReceiver;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhms/webrtc/PeerConnection;->receivers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RtpReceiver;

    invoke-virtual {v1}, Lhms/webrtc/RtpReceiver;->dispose()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeGetReceivers()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lhms/webrtc/PeerConnection;->receivers:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getRemoteDescription()Lhms/webrtc/SessionDescription;
    .locals 1

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeGetRemoteDescription()Lhms/webrtc/SessionDescription;

    move-result-object v0

    return-object v0
.end method

.method public getSenders()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhms/webrtc/RtpSender;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhms/webrtc/PeerConnection;->senders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RtpSender;

    invoke-virtual {v1}, Lhms/webrtc/RtpSender;->dispose()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeGetSenders()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lhms/webrtc/PeerConnection;->senders:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getStats(Lhms/webrtc/RTCStatsCollectorCallback;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lhms/webrtc/PeerConnection;->nativeNewGetStats(Lhms/webrtc/RTCStatsCollectorCallback;)V

    return-void
.end method

.method public getStats(Lhms/webrtc/RtpReceiver;Lhms/webrtc/RTCStatsCollectorCallback;)V
    .locals 2

    .line 4
    invoke-virtual {p1}, Lhms/webrtc/RtpReceiver;->getNativeRtpReceiver()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, Lhms/webrtc/PeerConnection;->nativeNewGetStatsReceiver(JLhms/webrtc/RTCStatsCollectorCallback;)V

    return-void
.end method

.method public getStats(Lhms/webrtc/RtpSender;Lhms/webrtc/RTCStatsCollectorCallback;)V
    .locals 2

    .line 3
    invoke-virtual {p1}, Lhms/webrtc/RtpSender;->getNativeRtpSender()J

    move-result-wide v0

    invoke-direct {p0, v0, v1, p2}, Lhms/webrtc/PeerConnection;->nativeNewGetStatsSender(JLhms/webrtc/RTCStatsCollectorCallback;)V

    return-void
.end method

.method public getStats(Lhms/webrtc/StatsObserver;Lhms/webrtc/MediaStreamTrack;)Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p2, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p2}, Lhms/webrtc/MediaStreamTrack;->getNativeMediaStreamTrack()J

    move-result-wide v0

    :goto_0
    invoke-direct {p0, p1, v0, v1}, Lhms/webrtc/PeerConnection;->nativeOldGetStats(Lhms/webrtc/StatsObserver;J)Z

    move-result p1

    return p1
.end method

.method public getTransceivers()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lhms/webrtc/RtpTransceiver;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhms/webrtc/PeerConnection;->transceivers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RtpTransceiver;

    invoke-virtual {v1}, Lhms/webrtc/RtpTransceiver;->dispose()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeGetTransceivers()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lhms/webrtc/PeerConnection;->transceivers:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public iceConnectionState()Lhms/webrtc/PeerConnection$IceConnectionState;
    .locals 1

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeIceConnectionState()Lhms/webrtc/PeerConnection$IceConnectionState;

    move-result-object v0

    return-object v0
.end method

.method public iceGatheringState()Lhms/webrtc/PeerConnection$IceGatheringState;
    .locals 1

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeIceGatheringState()Lhms/webrtc/PeerConnection$IceGatheringState;

    move-result-object v0

    return-object v0
.end method

.method public removeIceCandidates([Lhms/webrtc/IceCandidate;)Z
    .locals 0

    invoke-direct {p0, p1}, Lhms/webrtc/PeerConnection;->nativeRemoveIceCandidates([Lhms/webrtc/IceCandidate;)Z

    move-result p1

    return p1
.end method

.method public removeStream(Lhms/webrtc/MediaStream;)V
    .locals 2

    invoke-virtual {p1}, Lhms/webrtc/MediaStream;->getNativeMediaStream()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lhms/webrtc/PeerConnection;->nativeRemoveLocalStream(J)V

    iget-object v0, p0, Lhms/webrtc/PeerConnection;->localStreams:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeTrack(Lhms/webrtc/RtpSender;)Z
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhms/webrtc/RtpSender;->getNativeRtpSender()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lhms/webrtc/PeerConnection;->nativeRemoveTrack(J)Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "No RtpSender specified for removeTrack."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public restartIce()V
    .locals 0

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeRestartIce()V

    return-void
.end method

.method public setAudioPlayout(Z)V
    .locals 0

    invoke-direct {p0, p1}, Lhms/webrtc/PeerConnection;->nativeSetAudioPlayout(Z)V

    return-void
.end method

.method public setAudioRecording(Z)V
    .locals 0

    invoke-direct {p0, p1}, Lhms/webrtc/PeerConnection;->nativeSetAudioRecording(Z)V

    return-void
.end method

.method public setBitrate(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lhms/webrtc/PeerConnection;->nativeSetBitrate(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public setConfiguration(Lhms/webrtc/PeerConnection$RTCConfiguration;)Z
    .locals 0

    invoke-direct {p0, p1}, Lhms/webrtc/PeerConnection;->nativeSetConfiguration(Lhms/webrtc/PeerConnection$RTCConfiguration;)Z

    move-result p1

    return p1
.end method

.method public setLocalDescription(Lhms/webrtc/SdpObserver;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhms/webrtc/PeerConnection;->nativeSetLocalDescriptionAutomatically(Lhms/webrtc/SdpObserver;)V

    return-void
.end method

.method public setLocalDescription(Lhms/webrtc/SdpObserver;Lhms/webrtc/SessionDescription;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lhms/webrtc/PeerConnection;->nativeSetLocalDescription(Lhms/webrtc/SdpObserver;Lhms/webrtc/SessionDescription;)V

    return-void
.end method

.method public setRemoteDescription(Lhms/webrtc/SdpObserver;Lhms/webrtc/SessionDescription;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhms/webrtc/PeerConnection;->nativeSetRemoteDescription(Lhms/webrtc/SdpObserver;Lhms/webrtc/SessionDescription;)V

    return-void
.end method

.method public signalingState()Lhms/webrtc/PeerConnection$SignalingState;
    .locals 1

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeSignalingState()Lhms/webrtc/PeerConnection$SignalingState;

    move-result-object v0

    return-object v0
.end method

.method public startRtcEventLog(II)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lhms/webrtc/PeerConnection;->nativeStartRtcEventLog(II)Z

    move-result p1

    return p1
.end method

.method public stopRtcEventLog()V
    .locals 0

    invoke-direct {p0}, Lhms/webrtc/PeerConnection;->nativeStopRtcEventLog()V

    return-void
.end method
