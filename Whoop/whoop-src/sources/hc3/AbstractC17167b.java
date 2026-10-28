package hc3;

import bc3.AbstractC2987a1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3012g2;
import bc3.AbstractC3076z;
import bc3.C3023j1;
import bc3.C3036m2;
import bc3.C3067w;
import bc3.InterfaceC3008f2;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import gj2.C15920a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import l83.C23468n;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: hc3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17167b {

    /* JADX INFO: renamed from: a */
    public static final C17191x f65956a;

    /* JADX INFO: renamed from: b */
    public static final C17191x f65957b;

    /* JADX INFO: renamed from: c */
    public static final C17191x f65958c;

    /* JADX INFO: renamed from: d */
    public static final C17191x f65959d;

    /* JADX INFO: renamed from: e */
    public static final C15920a f65960e = new C15920a(6);

    /* JADX INFO: renamed from: f */
    public static final C15920a f65961f = new C15920a(7);

    /* JADX INFO: renamed from: g */
    public static final C15920a f65962g = new C15920a(8);

    static {
        int i13 = 0;
        f65956a = new C17191x("CLOSED", i13);
        f65957b = new C17191x("UNDEFINED", i13);
        f65958c = new C17191x("REUSABLE_CLAIMED", i13);
        f65959d = new C17191x("NO_THREAD_ELEMENTS", i13);
    }

    /* JADX INFO: renamed from: a */
    public static final void m48475a(int i13) {
        if (i13 < 1) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Expected positive parallelism level, but got ").toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m48476b(AbstractC17189v abstractC17189v, long j7, InterfaceC4351m interfaceC4351m) {
        while (true) {
            if (abstractC17189v.f66007y >= j7 && !abstractC17189v.mo48494d()) {
                return abstractC17189v;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC17169c.f65965w;
            Object obj = atomicReferenceFieldUpdater.get(abstractC17189v);
            C17191x c17191x = f65956a;
            if (obj == c17191x) {
                return c17191x;
            }
            AbstractC17189v abstractC17189v2 = (AbstractC17189v) ((AbstractC17169c) obj);
            if (abstractC17189v2 == null) {
                abstractC17189v2 = (AbstractC17189v) interfaceC4351m.invoke(Long.valueOf(abstractC17189v.f66007y + 1), abstractC17189v);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC17189v, null, abstractC17189v2)) {
                        if (abstractC17189v.mo48494d()) {
                            abstractC17189v.m48495e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC17189v) == null);
            }
            abstractC17189v = abstractC17189v2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC17189v m48477c(Object obj) {
        if (obj != f65956a) {
            return (AbstractC17189v) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m48478d(Object obj) {
        return obj == f65956a;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m48479e(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static final void m48480f(InterfaceC30063j interfaceC30063j, Object obj) {
        if (obj == f65959d) {
            return;
        }
        if (!(obj instanceof C17170c0)) {
            Object objFold = interfaceC30063j.fold(null, f65961f);
            AbstractC22676k.m65748h(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((InterfaceC3008f2) objFold).mo8735x(interfaceC30063j, obj);
            return;
        }
        C17170c0 c17170c0 = (C17170c0) obj;
        InterfaceC3008f2[] interfaceC3008f2Arr = c17170c0.f65969c;
        int length = interfaceC3008f2Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i13 = length - 1;
            InterfaceC3008f2 interfaceC3008f2 = interfaceC3008f2Arr[length];
            AbstractC22676k.m65747g(interfaceC3008f2);
            interfaceC3008f2.mo8735x(interfaceC30063j, c17170c0.f65968b[length]);
            if (i13 < 0) {
                return;
            } else {
                length = i13;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m48481g(Object obj, InterfaceC30057d interfaceC30057d) throws DispatchException {
        if (!(interfaceC30057d instanceof C17173f)) {
            interfaceC30057d.resumeWith(obj);
            return;
        }
        C17173f c17173f = (C17173f) interfaceC30057d;
        AbstractC3076z abstractC3076z = c17173f.f65977z;
        InterfaceC30057d interfaceC30057d2 = c17173f.f65974E;
        Throwable thM68037a = C23468n.m68037a(obj);
        Object c3067w = thM68037a == null ? obj : new C3067w(thM68037a, false);
        if (m48483i(abstractC3076z, interfaceC30057d2.getContext())) {
            c17173f.f65975F = c3067w;
            c17173f.f12064y = 1;
            m48482h(abstractC3076z, interfaceC30057d2.getContext(), c17173f);
            return;
        }
        AbstractC2987a1 abstractC2987a1M8738a = AbstractC3012g2.m8738a();
        if (abstractC2987a1M8738a.f11992w >= 4294967296L) {
            c17173f.f65975F = c3067w;
            c17173f.f12064y = 1;
            abstractC2987a1M8738a.m8678T(c17173f);
            return;
        }
        abstractC2987a1M8738a.m8680b0(true);
        try {
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC30057d2.getContext().get(C3023j1.f12041w);
            if (interfaceC3027k1 == null || interfaceC3027k1.isActive()) {
                Object obj2 = c17173f.f65976G;
                InterfaceC30063j context = interfaceC30057d2.getContext();
                Object objM48487m = m48487m(context, obj2);
                C3036m2 c3036m2M8704J = objM48487m != f65959d ? AbstractC3006f0.m8704J(interfaceC30057d2, context, objM48487m) : null;
                try {
                    interfaceC30057d2.resumeWith(obj);
                    if (c3036m2M8704J == null || c3036m2M8704J.m8788d0()) {
                        m48480f(context, objM48487m);
                    }
                } catch (Throwable th3) {
                    if (c3036m2M8704J == null || c3036m2M8704J.m8788d0()) {
                        m48480f(context, objM48487m);
                    }
                    throw th3;
                }
            } else {
                c17173f.resumeWith(AbstractC34132o.m107888l(interfaceC3027k1.getCancellationException()));
            }
            while (abstractC2987a1M8738a.m8682p0()) {
            }
        } catch (Throwable th4) {
            try {
                c17173f.m8792i(th4);
            } finally {
                abstractC2987a1M8738a.m8683s(true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m48482h(AbstractC3076z abstractC3076z, InterfaceC30063j interfaceC30063j, Runnable runnable) throws DispatchException {
        try {
            abstractC3076z.dispatch(interfaceC30063j, runnable);
        } catch (Throwable th3) {
            throw new DispatchException(th3, abstractC3076z, interfaceC30063j);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m48483i(AbstractC3076z abstractC3076z, InterfaceC30063j interfaceC30063j) throws DispatchException {
        try {
            return abstractC3076z.isDispatchNeeded(interfaceC30063j);
        } catch (Throwable th3) {
            throw new DispatchException(th3, abstractC3076z, interfaceC30063j);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final long m48484j(String str, long j7, long j13, long j14) {
        String property;
        int i13 = AbstractC17192y.f66011a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j7;
        }
        Long lM125933R = AbstractC39421y.m125933R(property);
        if (lM125933R == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM125933R.longValue();
        if (j13 <= jLongValue && jLongValue <= j14) {
            return jLongValue;
        }
        StringBuilder sbM32000s = AbstractC11895b.m32000s("System property '", str, j13, "' should be in range ");
        AbstractC2875y.m8285A(sbM32000s, "..", j14, ", but is '");
        sbM32000s.append(jLongValue);
        sbM32000s.append('\'');
        throw new IllegalStateException(sbM32000s.toString().toString());
    }

    /* JADX INFO: renamed from: k */
    public static int m48485k(int i13, int i14, String str) {
        return (int) m48484j(str, i13, 1, (i14 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: l */
    public static final Object m48486l(InterfaceC30063j interfaceC30063j) {
        Object objFold = interfaceC30063j.fold(0, f65960e);
        AbstractC22676k.m65747g(objFold);
        return objFold;
    }

    /* JADX INFO: renamed from: m */
    public static final Object m48487m(InterfaceC30063j interfaceC30063j, Object obj) {
        if (obj == null) {
            obj = m48486l(interfaceC30063j);
        }
        if (obj == 0) {
            return f65959d;
        }
        return obj instanceof Integer ? interfaceC30063j.fold(new C17170c0(((Number) obj).intValue(), interfaceC30063j), f65962g) : ((InterfaceC3008f2) obj).mo8734J(interfaceC30063j);
    }
}
