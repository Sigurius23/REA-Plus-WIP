package t23;

import org.webrtc.PeerConnection;

/* JADX INFO: renamed from: t23.s */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC33449s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f139609a;

    static {
        int[] iArr = new int[PeerConnection.IceConnectionState.values().length];
        try {
            iArr[PeerConnection.IceConnectionState.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeerConnection.IceConnectionState.DISCONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f139609a = iArr;
    }
}
