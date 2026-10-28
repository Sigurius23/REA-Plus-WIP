package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public final class CandidatePairChangeEvent {
    public final int estimatedDisconnectedTimeMs;
    public final int lastDataReceivedMs;
    public final IceCandidate local;
    public final String reason;
    public final IceCandidate remote;

    @CalledByNative
    public CandidatePairChangeEvent(IceCandidate iceCandidate, IceCandidate iceCandidate2, int i13, String str, int i14) {
        this.local = iceCandidate;
        this.remote = iceCandidate2;
        this.lastDataReceivedMs = i13;
        this.reason = str;
        this.estimatedDisconnectedTimeMs = i14;
    }
}
