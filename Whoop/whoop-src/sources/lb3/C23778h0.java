package lb3;

import bg.C3215j;
import l83.EnumC23463i;
import mb3.C25389f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31165x0;

/* JADX INFO: renamed from: lb3.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C23778h0 extends AbstractC23804u0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31165x0 f94158a;

    /* JADX INFO: renamed from: b */
    public final Object f94159b;

    public C23778h0(InterfaceC31165x0 typeParameter) {
        AbstractC22676k.m65750j(typeParameter, "typeParameter");
        this.f94158a = typeParameter;
        this.f94159b = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3215j(this, 6));
    }

    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: a */
    public final EnumC23776g1 mo69867a() {
        return EnumC23776g1.OUT_VARIANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: b */
    public final AbstractC23811y mo69868b() {
        return (AbstractC23811y) this.f94159b.getValue();
    }

    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: c */
    public final boolean mo69869c() {
        return true;
    }

    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: d */
    public final AbstractC23804u0 mo69870d(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
