package ec3;

import fc3.C14394y;
import m83.AbstractC25265s;
import n83.C26460c;
import p007a6.C0446p;
import p319m4.AbstractC25012a;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ec3.e2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13033e2 implements InterfaceC13017a2 {

    /* JADX INFO: renamed from: a */
    public final long f45050a;

    /* JADX INFO: renamed from: b */
    public final long f45051b;

    public C13033e2(long j7, long j13) {
        this.f45050a = j7;
        this.f45051b = j13;
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC31061c.m95636l(j7, "stopTimeout(", " ms) cannot be negative").toString());
        }
        if (j13 < 0) {
            throw new IllegalArgumentException(AbstractC31061c.m95636l(j13, "replayExpiration(", " ms) cannot be negative").toString());
        }
    }

    @Override // ec3.InterfaceC13017a2
    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l mo36557a(C14394y c14394y) {
        return AbstractC13091v.m36610t(new C13015a0(3, new C0446p(2, 1, null), AbstractC13091v.m36590P(c14394y, new C13029d2(this, null))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13033e2)) {
            return false;
        }
        C13033e2 c13033e2 = (C13033e2) obj;
        return this.f45050a == c13033e2.f45050a && this.f45051b == c13033e2.f45051b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f45051b) + (Long.hashCode(this.f45050a) * 31);
    }

    public final String toString() {
        C26460c c26460c = new C26460c(2);
        long j7 = this.f45050a;
        if (j7 > 0) {
            c26460c.add("stopTimeout=" + j7 + "ms");
        }
        long j13 = this.f45051b;
        if (j13 < Long.MAX_VALUE) {
            c26460c.add("replayExpiration=" + j13 + "ms");
        }
        return AbstractC25012a.m73377j(new StringBuilder("SharingStarted.WhileSubscribed("), AbstractC25265s.m74110N0(AbstractC37056f.m118988k(c26460c), null, null, null, null, 63), ')');
    }
}
