package w23;

import org.webrtc.PeerConnection;

/* JADX INFO: renamed from: w23.u */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC36763u {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f157331a;

    static {
        int[] iArr = new int[PeerConnection.IceConnectionState.values().length];
        try {
            iArr[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeerConnection.IceConnectionState.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PeerConnection.IceConnectionState.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f157331a = iArr;
    }
}
