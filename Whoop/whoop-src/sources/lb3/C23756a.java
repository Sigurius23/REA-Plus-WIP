package lb3;

import mb3.C25389f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C23756a extends AbstractC23787m {

    /* JADX INFO: renamed from: x */
    public final AbstractC23763c0 f94118x;

    /* JADX INFO: renamed from: y */
    public final AbstractC23763c0 f94119y;

    public C23756a(AbstractC23763c0 delegate, AbstractC23763c0 abbreviation) {
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(abbreviation, "abbreviation");
        this.f94118x = delegate;
        this.f94119y = abbreviation;
    }

    /* JADX INFO: renamed from: A0 */
    public final AbstractC23763c0 m69805A0() {
        return this.f94118x;
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public final C23756a mo64125r0(boolean z4) {
        return new C23756a(this.f94118x.mo64125r0(z4), this.f94119y.mo64125r0(z4));
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C23756a mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23763c0 type = this.f94118x;
        AbstractC22676k.m65750j(type, "type");
        AbstractC23763c0 type2 = this.f94119y;
        AbstractC22676k.m65750j(type2, "type");
        return new C23756a(type, type2);
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return new C23756a(this.f94118x.mo64127t0(newAttributes), this.f94119y);
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: w0 */
    public final AbstractC23763c0 mo69810w0() {
        return this.f94118x;
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: y0 */
    public final AbstractC23787m mo69812y0(AbstractC23763c0 abstractC23763c0) {
        return new C23756a(abstractC23763c0, this.f94119y);
    }

    /* JADX INFO: renamed from: z0 */
    public final AbstractC23763c0 m69813z0() {
        return this.f94119y;
    }
}
