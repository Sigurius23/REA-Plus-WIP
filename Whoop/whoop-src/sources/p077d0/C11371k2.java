package p077d0;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.k2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11371k2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11345e0 f36448a;

    /* JADX INFO: renamed from: b */
    public AbstractC11395r f36449b;

    /* JADX INFO: renamed from: c */
    public AbstractC11395r f36450c;

    /* JADX INFO: renamed from: d */
    public AbstractC11395r f36451d;

    /* JADX INFO: renamed from: e */
    public final float f36452e;

    public C11371k2(InterfaceC11345e0 interfaceC11345e0) {
        this.f36448a = interfaceC11345e0;
        this.f36452e = interfaceC11345e0.mo11172k();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC11395r m30601a(AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2) {
        if (this.f36451d == null) {
            this.f36451d = abstractC11395r.mo30609c();
        }
        AbstractC11395r abstractC11395r3 = this.f36451d;
        if (abstractC11395r3 == null) {
            AbstractC22676k.m65757q("targetVector");
            throw null;
        }
        int iMo30608b = abstractC11395r3.mo30608b();
        for (int i13 = 0; i13 < iMo30608b; i13++) {
            AbstractC11395r abstractC11395r4 = this.f36451d;
            if (abstractC11395r4 == null) {
                AbstractC22676k.m65757q("targetVector");
                throw null;
            }
            abstractC11395r4.mo30611e(this.f36448a.mo11176x(abstractC11395r.mo30607a(i13), abstractC11395r2.mo30607a(i13)), i13);
        }
        AbstractC11395r abstractC11395r5 = this.f36451d;
        if (abstractC11395r5 != null) {
            return abstractC11395r5;
        }
        AbstractC22676k.m65757q("targetVector");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC11395r m30602b(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2) {
        if (this.f36450c == null) {
            this.f36450c = abstractC11395r.mo30609c();
        }
        AbstractC11395r abstractC11395r3 = this.f36450c;
        if (abstractC11395r3 == null) {
            AbstractC22676k.m65757q("velocityVector");
            throw null;
        }
        int iMo30608b = abstractC11395r3.mo30608b();
        for (int i13 = 0; i13 < iMo30608b; i13++) {
            AbstractC11395r abstractC11395r4 = this.f36450c;
            if (abstractC11395r4 == null) {
                AbstractC22676k.m65757q("velocityVector");
                throw null;
            }
            abstractC11395r.getClass();
            abstractC11395r4.mo30611e(this.f36448a.mo11166d(abstractC11395r2.mo30607a(i13), j7), i13);
        }
        AbstractC11395r abstractC11395r5 = this.f36450c;
        if (abstractC11395r5 != null) {
            return abstractC11395r5;
        }
        AbstractC22676k.m65757q("velocityVector");
        throw null;
    }
}
