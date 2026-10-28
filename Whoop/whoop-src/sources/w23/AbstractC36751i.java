package w23;

import org.webrtc.PeerConnection;

/* JADX INFO: renamed from: w23.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC36751i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f157286a;

    static {
        int[] iArr = new int[PeerConnection.PeerConnectionState.values().length];
        try {
            iArr[PeerConnection.PeerConnectionState.CONNECTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PeerConnection.PeerConnectionState.CONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f157286a = iArr;
    }
}
