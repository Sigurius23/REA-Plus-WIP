package p516u8;

import java.util.Collections;
import java.util.List;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;

/* JADX INFO: renamed from: u8.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34613q0 {

    /* JADX INFO: renamed from: a */
    public final C34611p0 f145803a;

    /* JADX INFO: renamed from: b */
    public final AbstractC41023g0 f145804b;

    static {
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
    }

    public C34613q0(C34611p0 c34611p0, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c34611p0.f145796a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f145803a = c34611p0;
        this.f145804b = AbstractC41023g0.m133252m(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34613q0.class == obj.getClass()) {
            C34613q0 c34613q0 = (C34613q0) obj;
            if (this.f145803a.equals(c34613q0.f145803a) && this.f145804b.equals(c34613q0.f145804b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f145804b.hashCode() * 31) + this.f145803a.hashCode();
    }
}
