package z23;

import b33.EnumC2688i;
import org.webrtc.PeerConnection;

/* JADX INFO: renamed from: z23.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC40032b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f172737a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f172738b;

    static {
        int[] iArr = new int[PeerConnection.PeerConnectionState.values().length];
        try {
            iArr[PeerConnection.PeerConnectionState.CONNECTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeerConnection.PeerConnectionState.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f172737a = iArr;
        int[] iArr2 = new int[EnumC2688i.values().length];
        try {
            EnumC2688i enumC2688i = EnumC2688i.PUBLISH;
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            EnumC2688i enumC2688i2 = EnumC2688i.PUBLISH;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f172738b = iArr2;
    }
}
