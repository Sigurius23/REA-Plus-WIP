.class public interface abstract Lhms/webrtc/PeerConnection$Observer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Observer"
.end annotation


# virtual methods
.method public abstract onAddStream(Lhms/webrtc/MediaStream;)V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public onAddTrack(Lhms/webrtc/RtpReceiver;[Lhms/webrtc/MediaStream;)V
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation

    return-void
.end method

.method public onConnectionChange(Lhms/webrtc/PeerConnection$PeerConnectionState;)V
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation

    return-void
.end method

.method public abstract onDataChannel(Lhms/webrtc/DataChannel;)V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onIceCandidate(Lhms/webrtc/IceCandidate;)V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public onIceCandidateError(Lhms/webrtc/IceCandidateErrorEvent;)V
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation

    return-void
.end method

.method public abstract onIceCandidatesRemoved([Lhms/webrtc/IceCandidate;)V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onIceConnectionChange(Lhms/webrtc/PeerConnection$IceConnectionState;)V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onIceConnectionReceivingChange(Z)V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onIceGatheringChange(Lhms/webrtc/PeerConnection$IceGatheringState;)V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onRemoveStream(Lhms/webrtc/MediaStream;)V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public onRemoveTrack(Lhms/webrtc/RtpReceiver;)V
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation

    return-void
.end method

.method public abstract onRenegotiationNeeded()V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;)V
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation

    return-void
.end method

.method public abstract onSignalingChange(Lhms/webrtc/PeerConnection$SignalingState;)V
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public onStandardizedIceConnectionChange(Lhms/webrtc/PeerConnection$IceConnectionState;)V
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation

    return-void
.end method

.method public onTrack(Lhms/webrtc/RtpTransceiver;)V
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
        value = "Observer"
    .end annotation

    return-void
.end method
