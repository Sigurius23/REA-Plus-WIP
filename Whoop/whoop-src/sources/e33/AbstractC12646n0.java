package e33;

import org.webrtc.PeerConnection;

/* JADX INFO: renamed from: e33.n0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC12646n0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43202a;

    static {
        int[] iArr = new int[PeerConnection.IceConnectionState.values().length];
        try {
            iArr[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeerConnection.IceConnectionState.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PeerConnection.IceConnectionState.DISCONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f43202a = iArr;
    }
}
