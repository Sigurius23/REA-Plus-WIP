package dc3;

import bc3.AbstractC3006f0;
import bc3.C3033m;
import bc3.InterfaceC3044o2;
import ge3.AbstractC15751g;
import hc3.AbstractC17189v;
import hc3.AbstractC17190w;
import hc3.C17191x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: dc3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C11918c implements InterfaceC3044o2 {

    /* JADX INFO: renamed from: w */
    public Object f38986w = AbstractC11925j.f39023p;

    /* JADX INFO: renamed from: x */
    public C3033m f38987x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11923h f38988y;

    public C11918c(C11923h c11923h) {
        this.f38988y = c11923h;
    }

    /* JADX INFO: renamed from: a */
    public final Object m32187a(InterfaceC30057d interfaceC30057d) throws Throwable {
        C11931p c11931pM32212m;
        Object obj = this.f38986w;
        boolean z4 = true;
        if (obj == AbstractC11925j.f39023p || obj == AbstractC11925j.f39019l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11923h.f38999G;
            C11923h c11923h = this.f38988y;
            C11931p c11931p = (C11931p) atomicReferenceFieldUpdater.get(c11923h);
            while (!c11923h.m32221w()) {
                long andIncrement = C11923h.f39004y.getAndIncrement(c11923h);
                long j7 = AbstractC11925j.f39009b;
                long j13 = andIncrement / j7;
                int i13 = (int) (andIncrement % j7);
                if (c11931p.f66007y != j13) {
                    c11931pM32212m = c11923h.m32212m(j13, c11931p);
                    if (c11931pM32212m == null) {
                        continue;
                    }
                } else {
                    c11931pM32212m = c11931p;
                }
                Object objM32200H = c11923h.m32200H(c11931pM32212m, i13, andIncrement, null);
                C17191x c17191x = AbstractC11925j.f39020m;
                if (objM32200H == c17191x) {
                    throw new IllegalStateException("unreachable");
                }
                C17191x c17191x2 = AbstractC11925j.f39022o;
                if (objM32200H == c17191x2) {
                    if (andIncrement < c11923h.m32216q()) {
                        c11931pM32212m.m48492b();
                    }
                    c11931p = c11931pM32212m;
                } else {
                    if (objM32200H == AbstractC11925j.f39021n) {
                        C11923h c11923h2 = this.f38988y;
                        C3033m c3033mM8726t = AbstractC3006f0.m8726t(AbstractC15751g.m44424D(interfaceC30057d));
                        try {
                            this.f38987x = c3033mM8726t;
                            Object objM32200H2 = c11923h2.m32200H(c11931pM32212m, i13, andIncrement, this);
                            if (objM32200H2 != c17191x) {
                                if (objM32200H2 == c17191x2) {
                                    if (andIncrement < c11923h2.m32216q()) {
                                        c11931pM32212m.m48492b();
                                    }
                                    C11931p c11931p2 = (C11931p) C11923h.f38999G.get(c11923h2);
                                    while (true) {
                                        if (c11923h2.m32221w()) {
                                            C3033m c3033m = this.f38987x;
                                            AbstractC22676k.m65747g(c3033m);
                                            this.f38987x = null;
                                            this.f38986w = AbstractC11925j.f39019l;
                                            Throwable thM32213n = c11923h.m32213n();
                                            if (thM32213n != null) {
                                                c3033m.resumeWith(AbstractC34132o.m107888l(thM32213n));
                                                break;
                                            }
                                            c3033m.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = C11923h.f39004y.getAndIncrement(c11923h2);
                                        long j14 = AbstractC11925j.f39009b;
                                        long j15 = andIncrement2 / j14;
                                        int i14 = (int) (andIncrement2 % j14);
                                        if (c11931p2.f66007y != j15) {
                                            C11931p c11931pM32212m2 = c11923h2.m32212m(j15, c11931p2);
                                            if (c11931pM32212m2 != null) {
                                                c11931p2 = c11931pM32212m2;
                                            }
                                        }
                                        Object objM32200H3 = c11923h2.m32200H(c11931p2, i14, andIncrement2, this);
                                        if (objM32200H3 == AbstractC11925j.f39020m) {
                                            mo8762b(c11931p2, i14);
                                            break;
                                        }
                                        if (objM32200H3 == AbstractC11925j.f39022o) {
                                            if (andIncrement2 < c11923h2.m32216q()) {
                                                c11931p2.m48492b();
                                            }
                                        } else {
                                            if (objM32200H3 == AbstractC11925j.f39021n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            c11931p2.m48492b();
                                            this.f38986w = objM32200H3;
                                            this.f38987x = null;
                                        }
                                    }
                                } else {
                                    c11931pM32212m.m48492b();
                                    this.f38986w = objM32200H2;
                                    this.f38987x = null;
                                }
                                c3033mM8726t.mo8745g(Boolean.TRUE, null);
                                break;
                            }
                            mo8762b(c11931pM32212m, i13);
                            Object objM8773r = c3033mM8726t.m8773r();
                            EnumC31071a enumC31071a = EnumC31071a.f128113w;
                            return objM8773r;
                        } catch (Throwable th3) {
                            c3033mM8726t.m8756A();
                            throw th3;
                        }
                    }
                    c11931pM32212m.m48492b();
                    this.f38986w = objM32200H;
                }
            }
            this.f38986w = AbstractC11925j.f39019l;
            Throwable thM32213n2 = c11923h.m32213n();
            if (thM32213n2 != null) {
                int i15 = AbstractC17190w.f66008a;
                throw thM32213n2;
            }
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    @Override // bc3.InterfaceC3044o2
    /* JADX INFO: renamed from: b */
    public final void mo8762b(AbstractC17189v abstractC17189v, int i13) {
        C3033m c3033m = this.f38987x;
        if (c3033m != null) {
            c3033m.mo8762b(abstractC17189v, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m32188c() throws Throwable {
        Object obj = this.f38986w;
        C17191x c17191x = AbstractC11925j.f39023p;
        if (obj == c17191x) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f38986w = c17191x;
        if (obj != AbstractC11925j.f39019l) {
            return obj;
        }
        Throwable thM32214o = this.f38988y.m32214o();
        int i13 = AbstractC17190w.f66008a;
        throw thM32214o;
    }
}
