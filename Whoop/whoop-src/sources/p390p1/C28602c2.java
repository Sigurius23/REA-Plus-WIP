package p390p1;

import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import p004a2.C0154c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: p1.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C28602c2 implements InterfaceC2994c0, InterfaceC28691z1 {

    /* JADX INFO: renamed from: z */
    public static final C28611f f115714z = new C28611f();

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f115715w;

    /* JADX INFO: renamed from: x */
    public final C28602c2 f115716x = this;

    /* JADX INFO: renamed from: y */
    public volatile InterfaceC30063j f115717y;

    public C28602c2(InterfaceC30063j interfaceC30063j) {
        this.f115715w = interfaceC30063j;
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: a */
    public final void mo15502a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m86982b() {
        synchronized (this.f115716x) {
            try {
                InterfaceC30063j interfaceC30063j = this.f115717y;
                if (interfaceC30063j == null) {
                    this.f115717y = f115714z;
                } else {
                    AbstractC3006f0.m8715i(interfaceC30063j, new C28632k0());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: c */
    public final void mo15503c() {
        m86982b();
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: d */
    public final void mo15504d() {
        m86982b();
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        InterfaceC30063j interfaceC30063jPlus;
        InterfaceC30063j interfaceC30063j = this.f115717y;
        if (interfaceC30063j == null || interfaceC30063j == f115714z) {
            C0154c c0154c = (C0154c) this.f115715w.get(C0154c.f477x);
            InterfaceC30063j c28598b2 = c0154c != null ? new C28598b2(c0154c, this) : C30064k.f122676w;
            synchronized (this.f115716x) {
                try {
                    InterfaceC30063j interfaceC30063j2 = this.f115717y;
                    if (interfaceC30063j2 == null) {
                        InterfaceC30063j interfaceC30063j3 = this.f115715w;
                        interfaceC30063jPlus = interfaceC30063j3.plus(new C3031l1((InterfaceC3027k1) interfaceC30063j3.get(C3023j1.f12041w))).plus(C30064k.f122676w).plus(c28598b2);
                    } else if (interfaceC30063j2 == f115714z) {
                        InterfaceC30063j interfaceC30063j4 = this.f115715w;
                        C3031l1 c3031l1 = new C3031l1((InterfaceC3027k1) interfaceC30063j4.get(C3023j1.f12041w));
                        c3031l1.mo8819p(new C28632k0());
                        interfaceC30063jPlus = interfaceC30063j4.plus(c3031l1).plus(C30064k.f122676w).plus(c28598b2);
                    } else {
                        interfaceC30063jPlus = interfaceC30063j2;
                    }
                    this.f115717y = interfaceC30063jPlus;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            interfaceC30063j = interfaceC30063jPlus;
        }
        AbstractC22676k.m65747g(interfaceC30063j);
        return interfaceC30063j;
    }
}
