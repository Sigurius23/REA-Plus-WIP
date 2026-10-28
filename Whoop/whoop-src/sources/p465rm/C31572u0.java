package p465rm;

import java.util.Arrays;
import p309lo.AbstractC24543a;

/* JADX INFO: renamed from: rm.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31572u0 extends AbstractC31531f1 {

    /* JADX INFO: renamed from: x */
    public final float f130438x;

    public C31572u0() {
        this.f130438x = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C31572u0) {
            return this.f130438x == ((C31572u0) obj).f130438x;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f130438x)});
    }

    public C31572u0(float f13) {
        AbstractC24543a.m71570f(f13 >= 0.0f && f13 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f130438x = f13;
    }
}
