.class public Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/PeerConnection$Observer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/helpers/HMSPeerConnectionObserver$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0010\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00082\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008!\u0010 J\u0019\u0010$\u001a\u00020\u00082\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010(\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0019\u0010,\u001a\u00020\u00082\u0008\u0010+\u001a\u0004\u0018\u00010*H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u0019\u0010/\u001a\u00020\u00082\u0008\u0010+\u001a\u0004\u0018\u00010.H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00101\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u00081\u00102J%\u00104\u001a\u00020\u00082\u0006\u0010#\u001a\u00020\"2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0019H\u0016\u00a2\u0006\u0004\u00084\u00105J\u0017\u00108\u001a\u00020\u00082\u0006\u00107\u001a\u000206H\u0016\u00a2\u0006\u0004\u00088\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010:\u00a8\u0006<"
    }
    d2 = {
        "Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;",
        "Lhms/webrtc/PeerConnection$Observer;",
        "Llive/hms/video/connection/models/HMSConnectionRole;",
        "role",
        "<init>",
        "(Llive/hms/video/connection/models/HMSConnectionRole;)V",
        "Lhms/webrtc/PeerConnection$SignalingState;",
        "newState",
        "Ll83/a0;",
        "onSignalingChange",
        "(Lhms/webrtc/PeerConnection$SignalingState;)V",
        "Lhms/webrtc/PeerConnection$IceConnectionState;",
        "onIceConnectionChange",
        "(Lhms/webrtc/PeerConnection$IceConnectionState;)V",
        "",
        "receiving",
        "onIceConnectionReceivingChange",
        "(Z)V",
        "Lhms/webrtc/PeerConnection$IceGatheringState;",
        "onIceGatheringChange",
        "(Lhms/webrtc/PeerConnection$IceGatheringState;)V",
        "Lhms/webrtc/IceCandidate;",
        "candidate",
        "onIceCandidate",
        "(Lhms/webrtc/IceCandidate;)V",
        "",
        "candidates",
        "onIceCandidatesRemoved",
        "([Lhms/webrtc/IceCandidate;)V",
        "Lhms/webrtc/MediaStream;",
        "stream",
        "onAddStream",
        "(Lhms/webrtc/MediaStream;)V",
        "onRemoveStream",
        "Lhms/webrtc/RtpReceiver;",
        "receiver",
        "onRemoveTrack",
        "(Lhms/webrtc/RtpReceiver;)V",
        "Lhms/webrtc/DataChannel;",
        "dataChannel",
        "onDataChannel",
        "(Lhms/webrtc/DataChannel;)V",
        "Lhms/webrtc/CandidatePairChangeEvent;",
        "event",
        "onSelectedCandidatePairChanged",
        "(Lhms/webrtc/CandidatePairChangeEvent;)V",
        "Lhms/webrtc/IceCandidateErrorEvent;",
        "onIceCandidateError",
        "(Lhms/webrtc/IceCandidateErrorEvent;)V",
        "onRenegotiationNeeded",
        "()V",
        "mediaStreams",
        "onAddTrack",
        "(Lhms/webrtc/RtpReceiver;[Lhms/webrtc/MediaStream;)V",
        "Lhms/webrtc/RtpTransceiver;",
        "transceiver",
        "onTrack",
        "(Lhms/webrtc/RtpTransceiver;)V",
        "Llive/hms/video/connection/models/HMSConnectionRole;",
        "Companion",
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


# static fields
.field public static final Companion:Llive/hms/video/connection/helpers/HMSPeerConnectionObserver$Companion;

.field private static final TAG:Ljava/lang/String; = "HMSPeerConnectionObserver"


# instance fields
.field private final role:Llive/hms/video/connection/models/HMSConnectionRole;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->Companion:Llive/hms/video/connection/helpers/HMSPeerConnectionObserver$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/connection/models/HMSConnectionRole;)V
    .locals 1

    const-string v0, "role"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    return-void
.end method


# virtual methods
.method public onAddStream(Lhms/webrtc/MediaStream;)V
    .locals 3

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] onAddStream: streamId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhms/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSPeerConnectionObserver"

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onAddTrack(Lhms/webrtc/RtpReceiver;[Lhms/webrtc/MediaStream;)V
    .locals 5

    const-string v0, "receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mediaStreams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] onAddTrack: receiverId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhms/webrtc/RtpReceiver;->id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " trackId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhms/webrtc/RtpReceiver;->track()Lhms/webrtc/MediaStreamTrack;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhms/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "streams="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Ljava/util/ArrayList;

    array-length v2, p2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, p2, v3

    invoke-virtual {v4}, Lhms/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "HMSPeerConnectionObserver"

    invoke-virtual {v0, p2, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onDataChannel(Lhms/webrtc/DataChannel;)V
    .locals 3

    const-string v0, "dataChannel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] onDataChannel: id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhms/webrtc/DataChannel;->id()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " label="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhms/webrtc/DataChannel;->label()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSPeerConnectionObserver"

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onIceCandidate(Lhms/webrtc/IceCandidate;)V
    .locals 2

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] onIceCandidate: candidate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSPeerConnectionObserver"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onIceCandidateError(Lhms/webrtc/IceCandidateErrorEvent;)V
    .locals 4

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] onIceCandidateError: error="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-object v3, p1, Lhms/webrtc/IceCandidateErrorEvent;->errorText:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " for "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_1

    iget-object v2, p1, Lhms/webrtc/IceCandidateErrorEvent;->url:Ljava/lang/String;

    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x7d

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSPeerConnectionObserver"

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onIceCandidatesRemoved([Lhms/webrtc/IceCandidate;)V
    .locals 2

    const-string v0, "candidates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] onIceCandidatesRemoved: candidates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSPeerConnectionObserver"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onIceConnectionChange(Lhms/webrtc/PeerConnection$IceConnectionState;)V
    .locals 2

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] onIceConnectionChange: newState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSPeerConnectionObserver"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onIceConnectionReceivingChange(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] onIceConnectionReceivingChange: receiving="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSPeerConnectionObserver"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onIceGatheringChange(Lhms/webrtc/PeerConnection$IceGatheringState;)V
    .locals 2

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] onIceGatheringChange: newState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSPeerConnectionObserver"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRemoveStream(Lhms/webrtc/MediaStream;)V
    .locals 3

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] onRemoveStream: streamId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhms/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSPeerConnectionObserver"

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRemoveTrack(Lhms/webrtc/RtpReceiver;)V
    .locals 3

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] onRemoveTrack: trackId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhms/webrtc/RtpReceiver;->track()Lhms/webrtc/MediaStreamTrack;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lhms/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSPeerConnectionObserver"

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onRenegotiationNeeded()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] onRenegotiationNeeded"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSPeerConnectionObserver"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;)V
    .locals 4

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] onSelectedCandidatePairChanged: remote="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-object v3, p1, Lhms/webrtc/CandidatePairChangeEvent;->remote:Lhms/webrtc/IceCandidate;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " local="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_1

    iget-object v2, p1, Lhms/webrtc/CandidatePairChangeEvent;->local:Lhms/webrtc/IceCandidate;

    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x7d

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSPeerConnectionObserver"

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onSignalingChange(Lhms/webrtc/PeerConnection$SignalingState;)V
    .locals 2

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] onSignalingChange: newState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSPeerConnectionObserver"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onTrack(Lhms/webrtc/RtpTransceiver;)V
    .locals 3

    const-string v0, "transceiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lhms/webrtc/PeerConnection$Observer;->onTrack(Lhms/webrtc/RtpTransceiver;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "[role="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "] onTrack: transceiverId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhms/webrtc/RtpTransceiver;->getMid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSPeerConnectionObserver"

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
