package lb3;

import io.sentry.config.AbstractC20301a;
import mb3.C25389f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31165x0;
import xa3.C38148i;

/* JADX INFO: renamed from: lb3.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C23799s extends AbstractC23797r implements InterfaceC23781j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23799s(AbstractC23763c0 lowerBound, AbstractC23763c0 upperBound) {
        super(lowerBound, upperBound);
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
    }

    @Override // lb3.InterfaceC23781j
    /* JADX INFO: renamed from: E */
    public final boolean mo69874E() {
        AbstractC23763c0 abstractC23763c0 = this.f94187x;
        return (abstractC23763c0.mo69844i0().mo1784d() instanceof InterfaceC31165x0) && AbstractC22676k.m65745e(abstractC23763c0.mo69844i0(), this.f94188y.mo69844i0());
    }

    @Override // lb3.InterfaceC23781j
    /* JADX INFO: renamed from: l */
    public final AbstractC23773f1 mo69875l(AbstractC23811y replacement) {
        AbstractC23773f1 abstractC23773f1M69883b;
        AbstractC22676k.m65750j(replacement, "replacement");
        AbstractC23773f1 abstractC23773f1Mo69863p0 = replacement.mo69863p0();
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) {
            abstractC23773f1M69883b = abstractC23773f1Mo69863p0;
        } else {
            if (!(abstractC23773f1Mo69863p0 instanceof AbstractC23763c0)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) abstractC23773f1Mo69863p0;
            abstractC23773f1M69883b = AbstractC23791o.m69883b(abstractC23763c0, abstractC23763c0.mo64125r0(true));
        }
        return AbstractC23791o.m69885d(abstractC23773f1M69883b, abstractC23773f1Mo69863p0);
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: m0 */
    public final AbstractC23811y mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23763c0 type = this.f94187x;
        AbstractC22676k.m65750j(type, "type");
        AbstractC23763c0 type2 = this.f94188y;
        AbstractC22676k.m65750j(type2, "type");
        return new C23799s(type, type2);
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: r0 */
    public final AbstractC23773f1 mo64125r0(boolean z4) {
        return AbstractC23791o.m69883b(this.f94187x.mo64125r0(z4), this.f94188y.mo64125r0(z4));
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: s0 */
    public final AbstractC23773f1 mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23763c0 type = this.f94187x;
        AbstractC22676k.m65750j(type, "type");
        AbstractC23763c0 type2 = this.f94188y;
        AbstractC22676k.m65750j(type2, "type");
        return new C23799s(type, type2);
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: t0 */
    public final AbstractC23773f1 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return AbstractC23791o.m69883b(this.f94187x.mo64127t0(newAttributes), this.f94188y.mo64127t0(newAttributes));
    }

    @Override // lb3.AbstractC23797r
    public final String toString() {
        return "(" + this.f94187x + ".." + this.f94188y + ')';
    }

    @Override // lb3.AbstractC23797r
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64129u0() {
        return this.f94187x;
    }

    @Override // lb3.AbstractC23797r
    /* JADX INFO: renamed from: v0 */
    public final String mo64130v0(C38148i c38148i, C38148i c38148i2) {
        boolean zM122222o = c38148i2.f163321a.m122222o();
        AbstractC23763c0 abstractC23763c0 = this.f94188y;
        AbstractC23763c0 abstractC23763c1 = this.f94187x;
        if (!zM122222o) {
            return c38148i.m122171F(c38148i.m122188X(abstractC23763c1), c38148i.m122188X(abstractC23763c0), AbstractC20301a.m56356z(this));
        }
        return "(" + c38148i.m122188X(abstractC23763c1) + ".." + c38148i.m122188X(abstractC23763c0) + ')';
    }
}
