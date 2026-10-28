package w23;

import org.webrtc.PeerConnection;

/* JADX INFO: renamed from: w23.v */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC36764v {
    /* JADX INFO: renamed from: a */
    public static final EnumC36762t m117873a(PeerConnection.IceConnectionState iceConnectionState) {
        int i13 = iceConnectionState == null ? -1 : AbstractC36763u.f157331a[iceConnectionState.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return EnumC36762t.CONNECTED;
        }
        return i13 != 3 ? EnumC36762t.NOT_CONNECTED : EnumC36762t.FAILED;
    }
}
