package p077d0;

import e93.AbstractC12889b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C11410w implements InterfaceC11356h {

    /* JADX INFO: renamed from: a */
    public final C11371k2 f36595a;

    /* JADX INFO: renamed from: b */
    public final C11351f2 f36596b;

    /* JADX INFO: renamed from: c */
    public final Object f36597c;

    /* JADX INFO: renamed from: d */
    public final AbstractC11395r f36598d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11395r f36599e;

    /* JADX INFO: renamed from: f */
    public final AbstractC11395r f36600f;

    /* JADX INFO: renamed from: g */
    public final Object f36601g;

    /* JADX INFO: renamed from: h */
    public final long f36602h;

    public C11410w(C11413x c11413x, C11351f2 c11351f2, Object obj, AbstractC11395r abstractC11395r) {
        C11371k2 c11371k2 = new C11371k2(c11413x.f36609a);
        this.f36595a = c11371k2;
        this.f36596b = c11351f2;
        this.f36597c = obj;
        AbstractC11395r abstractC11395r2 = (AbstractC11395r) c11351f2.f36396a.invoke(obj);
        this.f36598d = abstractC11395r2;
        this.f36599e = AbstractC11348f.m30564l(abstractC11395r);
        this.f36601g = c11351f2.f36397b.invoke(c11371k2.m30601a(abstractC11395r2, abstractC11395r));
        if (c11371k2.f36450c == null) {
            c11371k2.f36450c = abstractC11395r2.mo30609c();
        }
        AbstractC11395r abstractC11395r3 = c11371k2.f36450c;
        if (abstractC11395r3 == null) {
            AbstractC22676k.m65757q("velocityVector");
            throw null;
        }
        int iMo30608b = abstractC11395r3.mo30608b();
        long jMax = 0;
        for (int i13 = 0; i13 < iMo30608b; i13++) {
            abstractC11395r2.getClass();
            jMax = Math.max(jMax, c11371k2.f36448a.mo11175w(abstractC11395r.mo30607a(i13)));
        }
        this.f36602h = jMax;
        AbstractC11395r abstractC11395rM30564l = AbstractC11348f.m30564l(this.f36595a.m30602b(jMax, this.f36598d, abstractC11395r));
        this.f36600f = abstractC11395rM30564l;
        int iMo30608b2 = abstractC11395rM30564l.mo30608b();
        for (int i14 = 0; i14 < iMo30608b2; i14++) {
            AbstractC11395r abstractC11395r4 = this.f36600f;
            float fMo30607a = abstractC11395r4.mo30607a(i14);
            float f13 = this.f36595a.f36452e;
            abstractC11395r4.mo30611e(AbstractC12889b.m36283m(fMo30607a, -f13, f13), i14);
        }
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: a */
    public final boolean mo30591a() {
        return false;
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: b */
    public final AbstractC11395r mo30592b(long j7) {
        if (m30593c(j7)) {
            return this.f36600f;
        }
        return this.f36595a.m30602b(j7, this.f36598d, this.f36599e);
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: d */
    public final long mo30594d() {
        return this.f36602h;
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: e */
    public final C11351f2 mo30595e() {
        return this.f36596b;
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: f */
    public final Object mo30596f(long j7) {
        if (m30593c(j7)) {
            return this.f36601g;
        }
        Function1 function1 = this.f36596b.f36397b;
        C11371k2 c11371k2 = this.f36595a;
        AbstractC11395r abstractC11395r = c11371k2.f36449b;
        AbstractC11395r abstractC11395r2 = this.f36598d;
        if (abstractC11395r == null) {
            c11371k2.f36449b = abstractC11395r2.mo30609c();
        }
        AbstractC11395r abstractC11395r3 = c11371k2.f36449b;
        if (abstractC11395r3 == null) {
            AbstractC22676k.m65757q("valueVector");
            throw null;
        }
        int iMo30608b = abstractC11395r3.mo30608b();
        for (int i13 = 0; i13 < iMo30608b; i13++) {
            AbstractC11395r abstractC11395r4 = c11371k2.f36449b;
            if (abstractC11395r4 == null) {
                AbstractC22676k.m65757q("valueVector");
                throw null;
            }
            abstractC11395r4.mo30611e(c11371k2.f36448a.mo11173u(abstractC11395r2.mo30607a(i13), j7, this.f36599e.mo30607a(i13)), i13);
        }
        AbstractC11395r abstractC11395r5 = c11371k2.f36449b;
        if (abstractC11395r5 != null) {
            return function1.invoke(abstractC11395r5);
        }
        AbstractC22676k.m65757q("valueVector");
        throw null;
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: g */
    public final Object mo30597g() {
        return this.f36601g;
    }
}
