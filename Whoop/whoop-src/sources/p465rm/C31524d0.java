package p465rm;

import java.util.Arrays;

/* JADX INFO: renamed from: rm.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31524d0 extends AbstractC31531f1 {

    /* JADX INFO: renamed from: x */
    public final boolean f130114x;

    /* JADX INFO: renamed from: y */
    public final boolean f130115y;

    public C31524d0() {
        this.f130114x = false;
        this.f130115y = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C31524d0)) {
            return false;
        }
        C31524d0 c31524d0 = (C31524d0) obj;
        return this.f130115y == c31524d0.f130115y && this.f130114x == c31524d0.f130114x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f130114x), Boolean.valueOf(this.f130115y)});
    }

    public C31524d0(boolean z4) {
        this.f130114x = true;
        this.f130115y = z4;
    }
}
