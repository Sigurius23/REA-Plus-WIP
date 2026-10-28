package d33;

import stream.video.sfu.models.PeerType;

/* JADX INFO: renamed from: d33.e0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC11592e0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f37390a;

    static {
        int[] iArr = new int[PeerType.values().length];
        try {
            iArr[PeerType.PEER_TYPE_PUBLISHER_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeerType.PEER_TYPE_SUBSCRIBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f37390a = iArr;
    }
}
