package androidx.lifecycle;

import a20.C0167g;
import a30.C0332w0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.C3023j1;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import hc3.AbstractC17182o;
import kc3.C22365e;
import l83.C23464j;
import p003a1.C0111j;
import p249jc.C21565a;
import p337n8.C26444a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import q83.C30064k;
import q83.InterfaceC30063j;
import t30.C33502d;

/* JADX INFO: renamed from: androidx.lifecycle.x1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1640x1 {

    /* JADX INFO: renamed from: a */
    public static final C21565a f6331a = new C21565a(10);

    /* JADX INFO: renamed from: a */
    public static final C1627t0 m5042a(C1627t0 c1627t0) {
        C1627t0 c1627t1;
        C22659b0 c22659b0 = new C22659b0();
        c22659b0.f89329w = true;
        if (c1627t0.isInitialized()) {
            c22659b0.f89329w = false;
            c1627t1 = new C1627t0(c1627t0.getValue());
        } else {
            c1627t1 = new C1627t0();
        }
        c1627t1.m5035b(c1627t0, new C33502d(new C0167g(9, c1627t1, c22659b0), 2));
        return c1627t1;
    }

    /* JADX INFO: renamed from: b */
    public static final C26444a m5043b(AbstractC1637w1 abstractC1637w1) {
        C26444a c26444a;
        AbstractC22676k.m65750j(abstractC1637w1, "<this>");
        synchronized (f6331a) {
            c26444a = (C26444a) abstractC1637w1.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c26444a == null) {
                InterfaceC30063j interfaceC30063jMo8825s = C30064k.f122676w;
                try {
                    C22365e c22365e = AbstractC3050q0.f12077a;
                    interfaceC30063jMo8825s = AbstractC17182o.f65999a.mo8825s();
                } catch (IllegalStateException | C23464j unused) {
                }
                C26444a c26444a2 = new C26444a(interfaceC30063jMo8825s.plus(AbstractC3006f0.m8710d()));
                abstractC1637w1.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c26444a2);
                c26444a = c26444a2;
            }
        }
        return c26444a;
    }

    /* JADX INFO: renamed from: c */
    public static final C1596j m5044c(InterfaceC30063j interfaceC30063j, InterfaceC4351m interfaceC4351m) {
        C1596j c1596j = new C1596j();
        C3004e2 c3004e2 = new C3004e2((InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w));
        C22365e c22365e = AbstractC3050q0.f12077a;
        c1596j.f6261b = new C0332w0(c1596j, interfaceC4351m, AbstractC3006f0.m8708b(AbstractC17182o.f65999a.mo8825s().plus(interfaceC30063j).plus(c3004e2)), new C0111j(c1596j, 5));
        return c1596j;
    }
}
