package p465rm;

import java.util.Arrays;

/* JADX INFO: renamed from: rm.k1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31546k1 extends AbstractC31531f1 {

    /* JADX INFO: renamed from: x */
    public final boolean f130209x;

    /* JADX INFO: renamed from: y */
    public final boolean f130210y;

    public C31546k1() {
        this.f130209x = false;
        this.f130210y = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C31546k1)) {
            return false;
        }
        C31546k1 c31546k1 = (C31546k1) obj;
        return this.f130210y == c31546k1.f130210y && this.f130209x == c31546k1.f130209x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f130209x), Boolean.valueOf(this.f130210y)});
    }

    public C31546k1(boolean z4) {
        this.f130209x = true;
        this.f130210y = z4;
    }
}
