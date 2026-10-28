package bc3;

import hc3.AbstractC17167b;
import hc3.AbstractC17182o;
import hc3.C17185r;
import kc3.C22365e;

/* JADX INFO: renamed from: bc3.w1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3069w1 extends AbstractC3076z {
    @Override // bc3.AbstractC3076z
    public AbstractC3076z limitedParallelism(int i13, String str) {
        AbstractC17167b.m48475a(i13);
        return str != null ? new C17185r(this, str) : this;
    }

    /* JADX INFO: renamed from: s */
    public abstract AbstractC3069w1 mo8825s();

    @Override // bc3.AbstractC3076z
    public String toString() {
        AbstractC3069w1 abstractC3069w1Mo8825s;
        String str;
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 abstractC3069w1 = AbstractC17182o.f65999a;
        if (this == abstractC3069w1) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC3069w1Mo8825s = abstractC3069w1.mo8825s();
            } catch (UnsupportedOperationException unused) {
                abstractC3069w1Mo8825s = null;
            }
            str = this == abstractC3069w1Mo8825s ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + AbstractC3006f0.m8724r(this);
    }
}
