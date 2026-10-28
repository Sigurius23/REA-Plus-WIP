package lb3;

import java.util.List;
import mb3.C25389f;
import ob3.InterfaceC27797g;
import p530up.AbstractC35148d;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import s93.InterfaceC32299a;
import s93.InterfaceC32307i;

/* JADX INFO: renamed from: lb3.y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23811y implements InterfaceC32299a, InterfaceC27797g {

    /* JADX INFO: renamed from: w */
    public int f94208w;

    /* JADX INFO: renamed from: X */
    public abstract List mo69842X();

    /* JADX INFO: renamed from: Y */
    public abstract C23784k0 mo69843Y();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC23811y)) {
            return false;
        }
        AbstractC23811y abstractC23811y = (AbstractC23811y) obj;
        return mo69814k0() == abstractC23811y.mo69814k0() && AbstractC35148d.m111167R(mo69863p0(), abstractC23811y.mo69863p0());
    }

    @Override // s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        return AbstractC23777h.m69871a(mo69843Y());
    }

    public final int hashCode() {
        int iHashCode;
        int i13 = this.f94208w;
        if (i13 != 0) {
            return i13;
        }
        if (AbstractC23791o.m69886e(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (mo69814k0() ? 1 : 0) + ((mo69842X().hashCode() + (mo69844i0().hashCode() * 31)) * 31);
        }
        this.f94208w = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i0 */
    public abstract InterfaceC23796q0 mo69844i0();

    /* JADX INFO: renamed from: k0 */
    public abstract boolean mo69814k0();

    /* JADX INFO: renamed from: m0 */
    public abstract AbstractC23811y mo64124m0(C25389f c25389f);

    /* JADX INFO: renamed from: p0 */
    public abstract AbstractC23773f1 mo69863p0();

    /* JADX INFO: renamed from: u */
    public abstract InterfaceC22712o mo64128u();
}
