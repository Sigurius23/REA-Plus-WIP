package c43;

import stream.video.sfu.models.ConnectionQuality;

/* JADX INFO: renamed from: c43.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4192h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f17048a;

    static {
        int[] iArr = new int[ConnectionQuality.values().length];
        try {
            iArr[ConnectionQuality.CONNECTION_QUALITY_UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConnectionQuality.CONNECTION_QUALITY_POOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConnectionQuality.CONNECTION_QUALITY_GOOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ConnectionQuality.CONNECTION_QUALITY_EXCELLENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f17048a = iArr;
    }
}
