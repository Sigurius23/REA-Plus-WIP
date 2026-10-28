package lb3;

import ob3.InterfaceC27795e;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31165x0;

/* JADX INFO: renamed from: lb3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C23785l extends AbstractC23787m implements InterfaceC23781j, InterfaceC27795e {

    /* JADX INFO: renamed from: x */
    public final AbstractC23763c0 f94167x;

    /* JADX INFO: renamed from: y */
    public final boolean f94168y;

    public C23785l(AbstractC23763c0 abstractC23763c0, boolean z4) {
        this.f94167x = abstractC23763c0;
        this.f94168y = z4;
    }

    @Override // lb3.InterfaceC23781j
    /* JADX INFO: renamed from: E */
    public final boolean mo69874E() {
        AbstractC23763c0 abstractC23763c0 = this.f94167x;
        abstractC23763c0.mo69844i0();
        return abstractC23763c0.mo69844i0().mo1784d() instanceof InterfaceC31165x0;
    }

    @Override // lb3.AbstractC23787m, lb3.AbstractC23811y
    /* JADX INFO: renamed from: k0 */
    public final boolean mo69814k0() {
        return false;
    }

    @Override // lb3.InterfaceC23781j
    /* JADX INFO: renamed from: l */
    public final AbstractC23773f1 mo69875l(AbstractC23811y replacement) {
        AbstractC22676k.m65750j(replacement, "replacement");
        return AbstractC23791o.m69887f(replacement.mo69863p0(), this.f94168y);
    }

    @Override // lb3.AbstractC23763c0
    public final String toString() {
        return this.f94167x + " & Any";
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64125r0(boolean z4) {
        return z4 ? this.f94167x.mo64125r0(z4) : this;
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return new C23785l(this.f94167x.mo64127t0(newAttributes), this.f94168y);
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: w0 */
    public final AbstractC23763c0 mo69810w0() {
        return this.f94167x;
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: y0 */
    public final AbstractC23787m mo69812y0(AbstractC23763c0 abstractC23763c0) {
        return new C23785l(abstractC23763c0, this.f94168y);
    }
}
