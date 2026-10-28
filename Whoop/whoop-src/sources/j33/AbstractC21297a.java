package j33;

import stream.video.sfu.models.DegradationPreference;

/* JADX INFO: renamed from: j33.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC21297a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f81375a;

    static {
        int[] iArr = new int[DegradationPreference.values().length];
        try {
            iArr[DegradationPreference.DEGRADATION_PREFERENCE_BALANCED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DegradationPreference.DEGRADATION_PREFERENCE_MAINTAIN_FRAMERATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DegradationPreference.DEGRADATION_PREFERENCE_MAINTAIN_RESOLUTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DegradationPreference.DEGRADATION_PREFERENCE_MAINTAIN_FRAMERATE_AND_RESOLUTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DegradationPreference.DEGRADATION_PREFERENCE_UNSPECIFIED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f81375a = iArr;
    }
}
