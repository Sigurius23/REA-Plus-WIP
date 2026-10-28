package p465rm;

import java.util.Arrays;
import p309lo.AbstractC24543a;

/* JADX INFO: renamed from: rm.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31540i1 extends AbstractC31531f1 {

    /* JADX INFO: renamed from: x */
    public final int f130176x;

    /* JADX INFO: renamed from: y */
    public final float f130177y;

    public C31540i1(int i13) {
        AbstractC24543a.m71570f(i13 > 0, "maxStars must be a positive integer");
        this.f130176x = i13;
        this.f130177y = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C31540i1)) {
            return false;
        }
        C31540i1 c31540i1 = (C31540i1) obj;
        return this.f130176x == c31540i1.f130176x && this.f130177y == c31540i1.f130177y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f130176x), Float.valueOf(this.f130177y)});
    }

    public C31540i1(int i13, float f13) {
        boolean z4 = false;
        AbstractC24543a.m71570f(i13 > 0, "maxStars must be a positive integer");
        if (f13 >= 0.0f && f13 <= i13) {
            z4 = true;
        }
        AbstractC24543a.m71570f(z4, "starRating is out of range [0, maxStars]");
        this.f130176x = i13;
        this.f130177y = f13;
    }
}
