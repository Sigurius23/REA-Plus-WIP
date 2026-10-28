package live.hms.video.diagnostics.models;

import hms.webrtc.IceCandidate;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/diagnostics/models/IceCandidatePair;", "", "<init>", "()V", "value", "Lhms/webrtc/IceCandidate;", "local", "getLocal", "()Lhms/webrtc/IceCandidate;", "setLocal$lib_release", "(Lhms/webrtc/IceCandidate;)V", "remote", "getRemote", "setRemote$lib_release", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class IceCandidatePair {
    private IceCandidate local;
    private IceCandidate remote;

    public final IceCandidate getLocal() {
        return this.local;
    }

    public final IceCandidate getRemote() {
        return this.remote;
    }

    public final void setLocal$lib_release(IceCandidate iceCandidate) {
        this.local = iceCandidate;
    }

    public final void setRemote$lib_release(IceCandidate iceCandidate) {
        this.remote = iceCandidate;
    }

    public String toString() {
        return "IceCandidatePair(local=" + this.local + ", remote=" + this.remote + ')';
    }
}
