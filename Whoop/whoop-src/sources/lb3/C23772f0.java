package lb3;

import mb3.C25389f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb3.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C23772f0 extends AbstractC23787m implements InterfaceC23770e1 {

    /* JADX INFO: renamed from: x */
    public final AbstractC23763c0 f94146x;

    /* JADX INFO: renamed from: y */
    public final AbstractC23811y f94147y;

    public C23772f0(AbstractC23763c0 delegate, AbstractC23811y enhancement) {
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(enhancement, "enhancement");
        this.f94146x = delegate;
        this.f94147y = enhancement;
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public final C23772f0 mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23763c0 type = this.f94146x;
        AbstractC22676k.m65750j(type, "type");
        AbstractC23811y type2 = this.f94147y;
        AbstractC22676k.m65750j(type2, "type");
        return new C23772f0(type, type2);
    }

    @Override // lb3.InterfaceC23770e1
    /* JADX INFO: renamed from: G */
    public final AbstractC23773f1 mo69857G() {
        return this.f94146x;
    }

    @Override // lb3.InterfaceC23770e1
    /* JADX INFO: renamed from: b */
    public final AbstractC23811y mo69858b() {
        return this.f94147y;
    }

    @Override // lb3.AbstractC23763c0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f94147y + ")] " + this.f94146x;
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64125r0(boolean z4) {
        AbstractC23773f1 abstractC23773f1M69897p = AbstractC23791o.m69897p(this.f94146x.mo64125r0(z4), this.f94147y.mo69863p0().mo64125r0(z4));
        AbstractC22676k.m65748h(abstractC23773f1M69897p, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC23763c0) abstractC23773f1M69897p;
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        AbstractC23773f1 abstractC23773f1M69897p = AbstractC23791o.m69897p(this.f94146x.mo64127t0(newAttributes), this.f94147y);
        AbstractC22676k.m65748h(abstractC23773f1M69897p, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC23763c0) abstractC23773f1M69897p;
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: w0 */
    public final AbstractC23763c0 mo69810w0() {
        return this.f94146x;
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: y0 */
    public final AbstractC23787m mo69812y0(AbstractC23763c0 abstractC23763c0) {
        return new C23772f0(abstractC23763c0, this.f94147y);
    }

    /* JADX INFO: renamed from: z0 */
    public final AbstractC23763c0 m69862z0() {
        return this.f94146x;
    }
}
