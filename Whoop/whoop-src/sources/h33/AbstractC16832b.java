package h33;

import stream.video.sfu.models.PeerType;

/* JADX INFO: renamed from: h33.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC16832b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64692a;

    static {
        int[] iArr = new int[PeerType.values().length];
        try {
            iArr[PeerType.PEER_TYPE_SUBSCRIBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f64692a = iArr;
    }
}
