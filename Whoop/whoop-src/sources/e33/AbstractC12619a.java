package e33;

import org.webrtc.PeerConnection;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: e33.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC12619a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43117a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f43118b;

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
        f43117a = iArr;
        int[] iArr2 = new int[TrackType.values().length];
        try {
            iArr2[TrackType.TRACK_TYPE_AUDIO.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TrackType.TRACK_TYPE_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TrackType.TRACK_TYPE_SCREEN_SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f43118b = iArr2;
    }
}
