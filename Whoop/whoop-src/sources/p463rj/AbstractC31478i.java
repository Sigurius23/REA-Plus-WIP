package p463rj;

import com.amplitude.android.engagement.types.SurveyRatingType;

/* JADX INFO: renamed from: rj.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31478i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f129709a;

    static {
        int[] iArr = new int[SurveyRatingType.values().length];
        try {
            iArr[SurveyRatingType.EMOJIS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SurveyRatingType.STARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SurveyRatingType.NPS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f129709a = iArr;
    }
}
