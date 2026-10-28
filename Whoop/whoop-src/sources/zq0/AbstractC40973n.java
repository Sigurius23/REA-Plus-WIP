package zq0;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: zq0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\n\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "touchRegionFixEnabled", "", "b", "(Z)F", "Lh2/b;", "", "containerWidth", "isRtl", "leadingFraction", "a", "(JIZF)Z", "community-everyday-stats_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40973n {
    /* JADX INFO: renamed from: a */
    public static final boolean m133026a(long j7, int i13, boolean z4, float f13) {
        if (z4) {
            return Float.intBitsToFloat((int) (j7 >> 32)) > (1.0f - f13) * ((float) i13);
        }
        return Float.intBitsToFloat((int) (j7 >> 32)) <= ((float) i13) * f13;
    }

    /* JADX INFO: renamed from: b */
    public static final float m133027b(boolean z4) {
        return z4 ? 0.3f : 0.5f;
    }
}
