package bc3;

import hc3.AbstractC17182o;
import hc3.AbstractC17192y;
import hc3.C17183p;
import kc3.C22365e;

/* JADX INFO: renamed from: bc3.h0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3014h0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3026k0 f12031a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property;
        InterfaceC3026k0 interfaceC3026k0;
        int i13 = AbstractC17192y.f66011a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            AbstractC3069w1 abstractC3069w1 = AbstractC17182o.f65999a;
            interfaceC3026k0 = ((abstractC3069w1.mo8825s() instanceof C17183p) || !(abstractC3069w1 instanceof InterfaceC3026k0)) ? RunnableC3010g0.f12027H : (InterfaceC3026k0) abstractC3069w1;
        } else {
            interfaceC3026k0 = RunnableC3010g0.f12027H;
        }
        f12031a = interfaceC3026k0;
    }
}
