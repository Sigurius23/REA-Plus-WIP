package bc3;

import hc3.AbstractC17167b;
import hc3.C17188u;
import l83.C23465k;
import q83.C30058e;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: bc3.m2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3036m2 extends C17188u {

    /* JADX INFO: renamed from: E */
    public final ThreadLocal f12057E;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3036m2(InterfaceC30063j interfaceC30063j, InterfaceC30057d interfaceC30057d) {
        C3040n2 c3040n2 = C3040n2.f12061w;
        super(interfaceC30063j.get(c3040n2) == null ? interfaceC30063j.plus(c3040n2) : interfaceC30063j, interfaceC30057d);
        this.f12057E = new ThreadLocal();
        if (interfaceC30057d.getContext().get(C30058e.f122675w) instanceof AbstractC3076z) {
            return;
        }
        Object objM48487m = AbstractC17167b.m48487m(interfaceC30063j, null);
        AbstractC17167b.m48480f(interfaceC30063j, objM48487m);
        m8790f0(interfaceC30063j, objM48487m);
    }

    @Override // hc3.C17188u
    /* JADX INFO: renamed from: c0 */
    public final void mo8787c0() {
        m8789e0();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m8788d0() {
        boolean z4 = this.threadLocalIsSet && this.f12057E.get() == null;
        this.f12057E.remove();
        return !z4;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m8789e0() {
        if (this.threadLocalIsSet) {
            C23465k c23465k = (C23465k) this.f12057E.get();
            if (c23465k != null) {
                AbstractC17167b.m48480f((InterfaceC30063j) c23465k.f92937w, c23465k.f92938x);
            }
            this.f12057E.remove();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m8790f0(InterfaceC30063j interfaceC30063j, Object obj) {
        this.threadLocalIsSet = true;
        this.f12057E.set(new C23465k(interfaceC30063j, obj));
    }

    @Override // hc3.C17188u, bc3.C3060t1
    /* JADX INFO: renamed from: l */
    public final void mo8791l(Object obj) {
        m8789e0();
        Object objM8697C = AbstractC3006f0.m8697C(obj);
        InterfaceC30057d interfaceC30057d = this.f66005z;
        InterfaceC30063j context = interfaceC30057d.getContext();
        Object objM48487m = AbstractC17167b.m48487m(context, null);
        C3036m2 c3036m2M8704J = objM48487m != AbstractC17167b.f65959d ? AbstractC3006f0.m8704J(interfaceC30057d, context, objM48487m) : null;
        try {
            interfaceC30057d.resumeWith(objM8697C);
        } finally {
            if (c3036m2M8704J == null || c3036m2M8704J.m8788d0()) {
                AbstractC17167b.m48480f(context, objM48487m);
            }
        }
    }
}
