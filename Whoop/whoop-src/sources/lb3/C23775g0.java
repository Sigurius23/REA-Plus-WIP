package lb3;

import mb3.C25389f;
import o93.AbstractC27736h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb3.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C23775g0 extends AbstractC23804u0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC23763c0 f94149a;

    public C23775g0(AbstractC27736h kotlinBuiltIns) {
        AbstractC22676k.m65750j(kotlinBuiltIns, "kotlinBuiltIns");
        AbstractC23763c0 abstractC23763c0M83828p = kotlinBuiltIns.m83828p();
        AbstractC22676k.m65749i(abstractC23763c0M83828p, "getNullableAnyType(...)");
        this.f94149a = abstractC23763c0M83828p;
    }

    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: a */
    public final EnumC23776g1 mo69867a() {
        return EnumC23776g1.OUT_VARIANCE;
    }

    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: b */
    public final AbstractC23811y mo69868b() {
        return this.f94149a;
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
