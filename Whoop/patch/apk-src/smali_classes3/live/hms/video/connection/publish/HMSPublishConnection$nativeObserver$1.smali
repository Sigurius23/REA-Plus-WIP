.class public final Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;
.super Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/publish/HMSPublishConnection;-><init>(Lhms/webrtc/PeerConnectionFactory;Llive/hms/video/signal/ISignal;Lhms/webrtc/PeerConnection$RTCConfiguration;Llive/hms/video/connection/publish/IPublishConnectionObserver;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "live/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1",
        "Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;",
        "Lhms/webrtc/IceCandidate;",
        "candidate",
        "Ll83/a0;",
        "onIceCandidate",
        "(Lhms/webrtc/IceCandidate;)V",
        "Lhms/webrtc/PeerConnection$IceConnectionState;",
        "newState",
        "onIceConnectionChange",
        "(Lhms/webrtc/PeerConnection$IceConnectionState;)V",
        "Lhms/webrtc/CandidatePairChangeEvent;",
        "event",
        "onSelectedCandidatePairChanged",
        "(Lhms/webrtc/CandidatePairChangeEvent;)V",
        "onRenegotiationNeeded",
        "()V",
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
.field final synthetic $observer:Llive/hms/video/connection/publish/IPublishConnectionObserver;

.field final synthetic $signal:Llive/hms/video/signal/ISignal;

.field final synthetic this$0:Llive/hms/video/connection/publish/HMSPublishConnection;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/signal/ISignal;Llive/hms/video/connection/publish/IPublishConnectionObserver;Llive/hms/video/connection/models/HMSConnectionRole;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/publish/HMSPublishConnection;

    iput-object p2, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->$signal:Llive/hms/video/signal/ISignal;

    iput-object p3, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/publish/IPublishConnectionObserver;

    invoke-direct {p0, p4}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;-><init>(Llive/hms/video/connection/models/HMSConnectionRole;)V

    return-void
.end method


# virtual methods
.method public onIceCandidate(Lhms/webrtc/IceCandidate;)V
    .locals 5

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onIceCandidate(Lhms/webrtc/IceCandidate;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1$onIceCandidate$1;

    iget-object v2, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v3, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/publish/IPublishConnectionObserver;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, p1, v4}, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1$onIceCandidate$1;-><init>(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/connection/publish/IPublishConnectionObserver;Lhms/webrtc/IceCandidate;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v4, v4, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Llive/hms/video/connection/models/HMSTrickle;

    sget-object v1, Llive/hms/video/connection/models/HMSIceCandidate;->Companion:Llive/hms/video/connection/models/HMSIceCandidate$Companion;

    invoke-virtual {v1, p1}, Llive/hms/video/connection/models/HMSIceCandidate$Companion;->from(Lhms/webrtc/IceCandidate;)Llive/hms/video/connection/models/HMSIceCandidate;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/publish/HMSPublishConnection;

    invoke-virtual {v1}, Llive/hms/video/connection/HMSConnection;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/publish/HMSPublishConnection;

    invoke-virtual {v2}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Llive/hms/video/connection/models/HMSTrickle;-><init>(Llive/hms/video/connection/models/HMSIceCandidate;Llive/hms/video/connection/models/HMSConnectionRole;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->$signal:Llive/hms/video/signal/ISignal;

    invoke-interface {p1, v0}, Llive/hms/video/signal/ISignal;->trickle(Llive/hms/video/connection/models/HMSTrickle;)V

    return-void
.end method

.method public onIceConnectionChange(Lhms/webrtc/PeerConnection$IceConnectionState;)V
    .locals 5

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onIceConnectionChange(Lhms/webrtc/PeerConnection$IceConnectionState;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1$onIceConnectionChange$1;

    iget-object v2, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v3, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/publish/IPublishConnectionObserver;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, p1, v4}, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1$onIceConnectionChange$1;-><init>(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/connection/publish/IPublishConnectionObserver;Lhms/webrtc/PeerConnection$IceConnectionState;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onRenegotiationNeeded()V
    .locals 5

    invoke-super {p0}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onRenegotiationNeeded()V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1$onRenegotiationNeeded$1;

    iget-object v2, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v3, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/publish/IPublishConnectionObserver;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1$onRenegotiationNeeded$1;-><init>(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/connection/publish/IPublishConnectionObserver;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v4, v4, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;)V
    .locals 5

    invoke-super {p0, p1}, Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;->onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;)V

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;

    iget-object v2, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->this$0:Llive/hms/video/connection/publish/HMSPublishConnection;

    iget-object v3, p0, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1;->$observer:Llive/hms/video/connection/publish/IPublishConnectionObserver;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, p1, v4}, Llive/hms/video/connection/publish/HMSPublishConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;-><init>(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/connection/publish/IPublishConnectionObserver;Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
