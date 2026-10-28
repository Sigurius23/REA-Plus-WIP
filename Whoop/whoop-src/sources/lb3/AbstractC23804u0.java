package lb3;

import mb3.C25389f;
import ob3.InterfaceC27801k;

/* JADX INFO: renamed from: lb3.u0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23804u0 implements InterfaceC27801k {
    /* JADX INFO: renamed from: a */
    public abstract EnumC23776g1 mo69867a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC23811y mo69868b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo69869c();

    /* JADX INFO: renamed from: d */
    public abstract AbstractC23804u0 mo69870d(C25389f c25389f);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC23804u0)) {
            return false;
        }
        AbstractC23804u0 abstractC23804u0 = (AbstractC23804u0) obj;
        return mo69869c() == abstractC23804u0.mo69869c() && mo69867a() == abstractC23804u0.mo69867a() && mo69868b().equals(abstractC23804u0.mo69868b());
    }

    public final int hashCode() {
        int iHashCode = mo69867a().hashCode();
        if (AbstractC23767d1.m69856l(mo69868b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo69869c() ? 17 : mo69868b().hashCode());
    }

    public final String toString() {
        if (mo69869c()) {
            return "*";
        }
        if (mo69867a() == EnumC23776g1.INVARIANT) {
            return mo69868b().toString();
        }
        return mo69867a() + " " + mo69868b();
    }
}
