package mm;

import dm.EnumC12174d;
import java.util.HashMap;
import pm.InterfaceC29353a;

/* JADX INFO: renamed from: mm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C25677a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC29353a f101005a;

    /* JADX INFO: renamed from: b */
    public final HashMap f101006b;

    public C25677a(InterfaceC29353a interfaceC29353a, HashMap map) {
        this.f101005a = interfaceC29353a;
        this.f101006b = map;
    }

    /* JADX INFO: renamed from: a */
    public final long m75616a(EnumC12174d enumC12174d, long j7, int i13) {
        long time = j7 - this.f101005a.getTime();
        C25678b c25678b = (C25678b) this.f101006b.get(enumC12174d);
        long j13 = c25678b.f101007a;
        int i14 = i13 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i14) * j13 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j13 > 1 ? j13 : 2L) * ((long) i14)))), time), c25678b.f101008b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25677a)) {
            return false;
        }
        C25677a c25677a = (C25677a) obj;
        return this.f101005a.equals(c25677a.f101005a) && this.f101006b.equals(c25677a.f101006b);
    }

    public final int hashCode() {
        return ((this.f101005a.hashCode() ^ 1000003) * 1000003) ^ this.f101006b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f101005a + ", values=" + this.f101006b + "}";
    }
}
