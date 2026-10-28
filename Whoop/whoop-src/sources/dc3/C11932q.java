package dc3;

import bc3.InterfaceC3044o2;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22671h0;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: dc3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C11932q extends C11923h {

    /* JADX INFO: renamed from: K */
    public final EnumC11916a f39035K;

    public C11932q(int i13, EnumC11916a enumC11916a) {
        super(i13);
        this.f39035K = enumC11916a;
        if (enumC11916a != EnumC11916a.f38982w) {
            if (i13 < 1) {
                throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11923h.class).getSimpleName() + " instead").toString());
        }
    }

    /* JADX INFO: renamed from: K */
    public final Object m32234K(Object obj, boolean z4) {
        EnumC11916a enumC11916a = this.f39035K;
        EnumC11916a enumC11916a2 = EnumC11916a.f38984y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (enumC11916a == enumC11916a2) {
            Object objMo32218s = super.mo32218s(obj);
            return (!(objMo32218s instanceof C11929n) || (objMo32218s instanceof C11928m)) ? objMo32218s : c23454a0;
        }
        Object obj2 = AbstractC11925j.f39011d;
        C11931p c11931p = (C11931p) C11923h.f38998F.get(this);
        while (true) {
            long andIncrement = C11923h.f39003x.getAndIncrement(this);
            long j7 = 1152921504606846975L & andIncrement;
            boolean zM32220v = m32220v(andIncrement, false);
            int i13 = AbstractC11925j.f39009b;
            long j13 = i13;
            long j14 = j7 / j13;
            int i14 = (int) (j7 % j13);
            if (c11931p.f66007y != j14) {
                C11931p c11931pM32190b = C11923h.m32190b(this, j14, c11931p);
                if (c11931pM32190b != null) {
                    c11931p = c11931pM32190b;
                } else if (zM32220v) {
                    return new C11928m(m32215p());
                }
            }
            int iM32192e = C11923h.m32192e(this, c11931p, i14, obj, j7, obj2, zM32220v);
            if (iM32192e == 0) {
                c11931p.m48492b();
                return c23454a0;
            }
            if (iM32192e != 1) {
                if (iM32192e != 2) {
                    if (iM32192e == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iM32192e == 4) {
                        if (j7 < C11923h.f39004y.get(this)) {
                            c11931p.m48492b();
                        }
                        return new C11928m(m32215p());
                    }
                    if (iM32192e == 5) {
                        c11931p.m48492b();
                    }
                } else {
                    if (zM32220v) {
                        c11931p.m48543i();
                        return new C11928m(m32215p());
                    }
                    InterfaceC3044o2 interfaceC3044o2 = obj2 instanceof InterfaceC3044o2 ? (InterfaceC3044o2) obj2 : null;
                    if (interfaceC3044o2 != null) {
                        interfaceC3044o2.mo8762b(c11931p, i14 + i13);
                    }
                    m32210k((c11931p.f66007y * j13) + ((long) i14));
                }
            }
            return c23454a0;
        }
    }

    @Override // dc3.C11923h, dc3.InterfaceC11939x
    /* JADX INFO: renamed from: s */
    public final Object mo32218s(Object obj) {
        return m32234K(obj, false);
    }

    @Override // dc3.C11923h, dc3.InterfaceC11939x
    /* JADX INFO: renamed from: t */
    public final Object mo32219t(Object obj, InterfaceC30057d interfaceC30057d) throws Throwable {
        if (m32234K(obj, true) instanceof C11928m) {
            throw m32215p();
        }
        return C23454a0.f92919a;
    }

    @Override // dc3.C11923h
    /* JADX INFO: renamed from: y */
    public final boolean mo32223y() {
        return this.f39035K == EnumC11916a.f38983x;
    }
}
