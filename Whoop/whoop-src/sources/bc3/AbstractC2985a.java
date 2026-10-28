package bc3;

import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import hc3.AbstractC17167b;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;
import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32267a;

/* JADX INFO: renamed from: bc3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2985a extends C3060t1 implements InterfaceC30057d, InterfaceC2994c0 {

    /* JADX INFO: renamed from: y */
    public final InterfaceC30063j f11989y;

    public AbstractC2985a(InterfaceC30063j interfaceC30063j, boolean z4, boolean z13) {
        super(z13);
        if (z4) {
            m8804H((InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w));
        }
        this.f11989y = interfaceC30063j.plus(this);
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: G */
    public final void mo8672G(CompletionHandlerException completionHandlerException) {
        AbstractC3006f0.m8727u(this.f11989y, completionHandlerException);
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: R */
    public final void mo8673R(Object obj) {
        if (!(obj instanceof C3067w)) {
            mo8675a0(obj);
        } else {
            C3067w c3067w = (C3067w) obj;
            mo8674Z(c3067w.f12104a, C3067w.f12103b.get(c3067w) == 1);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void mo8674Z(Throwable th3, boolean z4) {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo8675a0(Object obj) {
    }

    /* JADX INFO: renamed from: b0 */
    public final void m8676b0(EnumC2998d0 enumC2998d0, AbstractC2985a abstractC2985a, InterfaceC4351m interfaceC4351m) {
        Object objInvoke;
        int iOrdinal = enumC2998d0.ordinal();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (iOrdinal == 0) {
            try {
                AbstractC17167b.m48481g(c23454a0, AbstractC15751g.m44424D(AbstractC15751g.m44463p(interfaceC4351m, abstractC2985a, this)));
                return;
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).f89396w;
                }
                resumeWith(AbstractC34132o.m107888l(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                AbstractC22676k.m65750j(interfaceC4351m, "<this>");
                AbstractC15751g.m44424D(AbstractC15751g.m44463p(interfaceC4351m, abstractC2985a, this)).resumeWith(c23454a0);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                InterfaceC30063j interfaceC30063j = this.f11989y;
                Object objM48487m = AbstractC17167b.m48487m(interfaceC30063j, null);
                try {
                    if (interfaceC4351m instanceof AbstractC32267a) {
                        AbstractC22681m0.m65774e(2, interfaceC4351m);
                        objInvoke = interfaceC4351m.invoke(abstractC2985a, this);
                    } else {
                        objInvoke = AbstractC15751g.m44446Z(interfaceC4351m, abstractC2985a, this);
                    }
                    AbstractC17167b.m48480f(interfaceC30063j, objM48487m);
                    if (objInvoke != EnumC31071a.f128113w) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th4) {
                    AbstractC17167b.m48480f(interfaceC30063j, objM48487m);
                    throw th4;
                }
            } catch (Throwable th5) {
                th = th5;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).f89396w;
                }
                resumeWith(AbstractC34132o.m107888l(th));
            }
        }
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return this.f11989y;
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f11989y;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        Throwable thM68037a = C23468n.m68037a(obj);
        if (thM68037a != null) {
            obj = new C3067w(thM68037a, false);
        }
        Object objM8808M = m8808M(obj);
        if (objM8808M == AbstractC3006f0.f12019e) {
            return;
        }
        mo8791l(objM8808M);
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: u */
    public final String mo8677u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
