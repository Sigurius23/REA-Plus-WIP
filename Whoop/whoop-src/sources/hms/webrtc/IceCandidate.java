package hms.webrtc;

import java.util.Arrays;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes11.dex */
public class IceCandidate {
    public final PeerConnection.AdapterType adapterType;
    public final String sdp;
    public final int sdpMLineIndex;
    public final String sdpMid;
    public final String serverUrl;

    public IceCandidate(String str, int i13, String str2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i13;
        this.sdp = str2;
        this.serverUrl = "";
        this.adapterType = PeerConnection.AdapterType.UNKNOWN;
    }

    private static boolean objectEquals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IceCandidate)) {
            return false;
        }
        IceCandidate iceCandidate = (IceCandidate) obj;
        return objectEquals(this.sdpMid, iceCandidate.sdpMid) && this.sdpMLineIndex == iceCandidate.sdpMLineIndex && objectEquals(this.sdp, iceCandidate.sdp);
    }

    @CalledByNative
    public String getSdp() {
        return this.sdp;
    }

    @CalledByNative
    public String getSdpMid() {
        return this.sdpMid;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.sdpMid, Integer.valueOf(this.sdpMLineIndex), this.sdp});
    }

    public String toString() {
        String str = this.sdpMid;
        int i13 = this.sdpMLineIndex;
        String str2 = this.sdp;
        String str3 = this.serverUrl;
        String string = this.adapterType.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(":");
        sb4.append(i13);
        sb4.append(":");
        sb4.append(str2);
        return AbstractC11266d.m30464r(sb4, ":", str3, ":", string);
    }

    @CalledByNative
    public IceCandidate(String str, int i13, String str2, String str3, PeerConnection.AdapterType adapterType) {
        this.sdpMid = str;
        this.sdpMLineIndex = i13;
        this.sdp = str2;
        this.serverUrl = str3;
        this.adapterType = adapterType;
    }
}
