package d33;

import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: d33.t */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC11628t {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f37549a;

    static {
        int[] iArr = new int[TrackType.values().length];
        try {
            iArr[TrackType.TRACK_TYPE_VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TrackType.TRACK_TYPE_AUDIO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TrackType.TRACK_TYPE_SCREEN_SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TrackType.TRACK_TYPE_SCREEN_SHARE_AUDIO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TrackType.TRACK_TYPE_UNSPECIFIED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f37549a = iArr;
    }
}
