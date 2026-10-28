package lb3;

import mb3.C25389f;
import p715kotlin.jvm.internal.AbstractC22676k;
import xa3.C38148i;
import xa3.C38151l;

/* JADX INFO: renamed from: lb3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C23801t extends AbstractC23797r implements InterfaceC23770e1 {

    /* JADX INFO: renamed from: E */
    public final AbstractC23811y f94191E;

    /* JADX INFO: renamed from: z */
    public final AbstractC23797r f94192z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23801t(AbstractC23797r origin, AbstractC23811y enhancement) {
        super(origin.f94187x, origin.f94188y);
        AbstractC22676k.m65750j(origin, "origin");
        AbstractC22676k.m65750j(enhancement, "enhancement");
        this.f94192z = origin;
        this.f94191E = enhancement;
    }

    @Override // lb3.InterfaceC23770e1
    /* JADX INFO: renamed from: G */
    public final AbstractC23773f1 mo69857G() {
        return this.f94192z;
    }

    @Override // lb3.InterfaceC23770e1
    /* JADX INFO: renamed from: b */
    public final AbstractC23811y mo69858b() {
        return this.f94191E;
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: m0 */
    public final AbstractC23811y mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23797r type = this.f94192z;
        AbstractC22676k.m65750j(type, "type");
        AbstractC23811y type2 = this.f94191E;
        AbstractC22676k.m65750j(type2, "type");
        return new C23801t(type, type2);
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: r0 */
    public final AbstractC23773f1 mo64125r0(boolean z4) {
        return AbstractC23791o.m69897p(this.f94192z.mo64125r0(z4), this.f94191E.mo69863p0().mo64125r0(z4));
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: s0 */
    public final AbstractC23773f1 mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23797r type = this.f94192z;
        AbstractC22676k.m65750j(type, "type");
        AbstractC23811y type2 = this.f94191E;
        AbstractC22676k.m65750j(type2, "type");
        return new C23801t(type, type2);
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: t0 */
    public final AbstractC23773f1 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return AbstractC23791o.m69897p(this.f94192z.mo64127t0(newAttributes), this.f94191E);
    }

    @Override // lb3.AbstractC23797r
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f94191E + ")] " + this.f94192z;
    }

    @Override // lb3.AbstractC23797r
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64129u0() {
        return this.f94192z.mo64129u0();
    }

    @Override // lb3.AbstractC23797r
    /* JADX INFO: renamed from: v0 */
    public final String mo64130v0(C38148i c38148i, C38148i c38148i2) {
        C38151l c38151l = c38148i2.f163321a;
        return ((Boolean) c38151l.f163378m.getValue(c38151l, C38151l.f163341Y[11])).booleanValue() ? c38148i.m122188X(this.f94191E) : this.f94192z.mo64130v0(c38148i, c38148i2);
    }
}
