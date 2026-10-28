package hc3;

import bc3.AbstractC2987a1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3012g2;
import bc3.AbstractC3042o0;
import bc3.AbstractC3076z;
import bc3.C3067w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import l83.C23468n;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.InterfaceC32270d;

/* JADX INFO: renamed from: hc3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C17173f extends AbstractC3042o0 implements InterfaceC32270d, InterfaceC30057d {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65973H = AtomicReferenceFieldUpdater.newUpdater(C17173f.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: E */
    public final InterfaceC30057d f65974E;

    /* JADX INFO: renamed from: F */
    public Object f65975F;

    /* JADX INFO: renamed from: G */
    public final Object f65976G;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: z */
    public final AbstractC3076z f65977z;

    public C17173f(AbstractC3076z abstractC3076z, InterfaceC30057d interfaceC30057d) {
        super(-1);
        this.f65977z = abstractC3076z;
        this.f65974E = interfaceC30057d;
        this.f65975F = AbstractC17167b.f65957b;
        this.f65976G = AbstractC17167b.m48486l(interfaceC30057d.getContext());
    }

    @Override // bc3.AbstractC3042o0
    /* JADX INFO: renamed from: d */
    public final InterfaceC30057d mo8763d() {
        return this;
    }

    @Override // s83.InterfaceC32270d
    public final InterfaceC32270d getCallerFrame() {
        InterfaceC30057d interfaceC30057d = this.f65974E;
        if (interfaceC30057d instanceof InterfaceC32270d) {
            return (InterfaceC32270d) interfaceC30057d;
        }
        return null;
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return this.f65974E.getContext();
    }

    @Override // bc3.AbstractC3042o0
    /* JADX INFO: renamed from: j */
    public final Object mo8766j() {
        Object obj = this.f65975F;
        this.f65975F = AbstractC17167b.f65957b;
        return obj;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thM68037a = C23468n.m68037a(obj);
        Object c3067w = thM68037a == null ? obj : new C3067w(thM68037a, false);
        InterfaceC30057d interfaceC30057d = this.f65974E;
        InterfaceC30063j context = interfaceC30057d.getContext();
        AbstractC3076z abstractC3076z = this.f65977z;
        if (AbstractC17167b.m48483i(abstractC3076z, context)) {
            this.f65975F = c3067w;
            this.f12064y = 0;
            AbstractC17167b.m48482h(abstractC3076z, interfaceC30057d.getContext(), this);
            return;
        }
        AbstractC2987a1 abstractC2987a1M8738a = AbstractC3012g2.m8738a();
        if (abstractC2987a1M8738a.f11992w >= 4294967296L) {
            this.f65975F = c3067w;
            this.f12064y = 0;
            abstractC2987a1M8738a.m8678T(this);
            return;
        }
        abstractC2987a1M8738a.m8680b0(true);
        try {
            InterfaceC30063j context2 = interfaceC30057d.getContext();
            Object objM48487m = AbstractC17167b.m48487m(context2, this.f65976G);
            try {
                interfaceC30057d.resumeWith(obj);
                AbstractC17167b.m48480f(context2, objM48487m);
                while (abstractC2987a1M8738a.m8682p0()) {
                }
            } catch (Throwable th3) {
                AbstractC17167b.m48480f(context2, objM48487m);
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                m8792i(th4);
            } finally {
                abstractC2987a1M8738a.m8683s(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f65977z + ", " + AbstractC3006f0.m8702H(this.f65974E) + ']';
    }
}
