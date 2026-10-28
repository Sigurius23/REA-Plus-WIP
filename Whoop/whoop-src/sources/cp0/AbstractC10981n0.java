package cp0;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: cp0.n0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"", "configHeightPx", "measuredHeightPx", "rawImeHeightPx", "", "a", "(FFF)Z", "bottomEdgePx", "rootHeightPx", "fadePx", "Lcp0/h1;", "b", "(FFF)Lcp0/h1;", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10981n0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m29291a(float f13, float f14, float f15) {
        if (f15 > 0.0f && f14 > 0.0f) {
            float f16 = 0.5f * f15;
            float f17 = f15 * 1.5f;
            float f18 = f13 - f14;
            if (f16 <= f18 && f18 <= f17) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final C10964h1 m29292b(float f13, float f14, float f15) {
        if (f14 <= f13) {
            return null;
        }
        float f16 = f13 - f15;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        float f17 = f14 - f16;
        return new C10964h1(f16, f17, (f13 - f16) / f17);
    }
}
