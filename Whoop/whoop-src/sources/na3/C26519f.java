package na3;

import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23773f1;
import lb3.AbstractC23787m;
import lb3.AbstractC23791o;
import lb3.AbstractC23797r;
import lb3.AbstractC23811y;
import lb3.C23784k0;
import lb3.InterfaceC23760b0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: na3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C26519f extends AbstractC23787m implements InterfaceC23760b0 {

    /* JADX INFO: renamed from: x */
    public final AbstractC23763c0 f105434x;

    public C26519f(AbstractC23763c0 delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f105434x = delegate;
    }

    @Override // lb3.InterfaceC23781j
    /* JADX INFO: renamed from: E */
    public final boolean mo69874E() {
        return true;
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
        AbstractC23773f1 abstractC23773f1Mo69863p0 = replacement.mo69863p0();
        if (!AbstractC23767d1.m69850f(abstractC23773f1Mo69863p0) && !AbstractC23767d1.m69849e(abstractC23773f1Mo69863p0)) {
            return abstractC23773f1Mo69863p0;
        }
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23763c0) {
            AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) abstractC23773f1Mo69863p0;
            AbstractC23763c0 abstractC23763c0Mo64125r0 = abstractC23763c0.mo64125r0(false);
            return !AbstractC23767d1.m69850f(abstractC23763c0) ? abstractC23763c0Mo64125r0 : new C26519f(abstractC23763c0Mo64125r0);
        }
        if (!(abstractC23773f1Mo69863p0 instanceof AbstractC23797r)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC23797r abstractC23797r = (AbstractC23797r) abstractC23773f1Mo69863p0;
        AbstractC23763c0 abstractC23763c1 = abstractC23797r.f94187x;
        AbstractC23763c0 abstractC23763c0Mo64125r1 = abstractC23763c1.mo64125r0(false);
        if (AbstractC23767d1.m69850f(abstractC23763c1)) {
            abstractC23763c0Mo64125r1 = new C26519f(abstractC23763c0Mo64125r1);
        }
        AbstractC23763c0 abstractC23763c2 = abstractC23797r.f94188y;
        AbstractC23763c0 abstractC23763c0Mo64125r2 = abstractC23763c2.mo64125r0(false);
        if (AbstractC23767d1.m69850f(abstractC23763c2)) {
            abstractC23763c0Mo64125r2 = new C26519f(abstractC23763c0Mo64125r2);
        }
        return AbstractC23791o.m69897p(AbstractC23791o.m69883b(abstractC23763c0Mo64125r1, abstractC23763c0Mo64125r2), AbstractC23791o.m69884c(abstractC23773f1Mo69863p0));
    }

    @Override // lb3.AbstractC23763c0, lb3.AbstractC23773f1
    /* JADX INFO: renamed from: t0 */
    public final AbstractC23773f1 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return new C26519f(this.f105434x.mo64127t0(newAttributes));
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64125r0(boolean z4) {
        return z4 ? this.f105434x.mo64125r0(true) : this;
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return new C26519f(this.f105434x.mo64127t0(newAttributes));
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: w0 */
    public final AbstractC23763c0 mo69810w0() {
        return this.f105434x;
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: y0 */
    public final AbstractC23787m mo69812y0(AbstractC23763c0 abstractC23763c0) {
        return new C26519f(abstractC23763c0);
    }
}
