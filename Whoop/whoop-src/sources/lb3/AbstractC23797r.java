package lb3;

import java.util.List;
import ob3.InterfaceC27796f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import xa3.C38148i;

/* JADX INFO: renamed from: lb3.r */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23797r extends AbstractC23773f1 implements InterfaceC27796f {

    /* JADX INFO: renamed from: x */
    public final AbstractC23763c0 f94187x;

    /* JADX INFO: renamed from: y */
    public final AbstractC23763c0 f94188y;

    public AbstractC23797r(AbstractC23763c0 lowerBound, AbstractC23763c0 upperBound) {
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        this.f94187x = lowerBound;
        this.f94188y = upperBound;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: X */
    public final List mo69842X() {
        return mo64129u0().mo69842X();
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: Y */
    public final C23784k0 mo69843Y() {
        return mo64129u0().mo69843Y();
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC23796q0 mo69844i0() {
        return mo64129u0().mo69844i0();
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: k0 */
    public final boolean mo69814k0() {
        return mo64129u0().mo69814k0();
    }

    public String toString() {
        return C38148i.f163320e.m122188X(this);
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: u */
    public InterfaceC22712o mo64128u() {
        return mo64129u0().mo64128u();
    }

    /* JADX INFO: renamed from: u0 */
    public abstract AbstractC23763c0 mo64129u0();

    /* JADX INFO: renamed from: v0 */
    public abstract String mo64130v0(C38148i c38148i, C38148i c38148i2);
}
