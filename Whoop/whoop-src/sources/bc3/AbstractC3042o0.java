package bc3;

import hc3.AbstractC17167b;
import hc3.C17173f;
import java.util.concurrent.CancellationException;
import kc3.AbstractRunnableC22369i;
import kotlinx.coroutines.DispatchException;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: bc3.o0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3042o0 extends AbstractRunnableC22369i {

    /* JADX INFO: renamed from: y */
    public int f12064y;

    public AbstractC3042o0(int i13) {
        super(0L, false);
        this.f12064y = i13;
    }

    /* JADX INFO: renamed from: a */
    public void mo8761a(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: d */
    public abstract InterfaceC30057d mo8763d();

    /* JADX INFO: renamed from: f */
    public Throwable mo8764f(Object obj) {
        C3067w c3067w = obj instanceof C3067w ? (C3067w) obj : null;
        if (c3067w != null) {
            return c3067w.f12104a;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Object mo8765h(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public final void m8792i(Throwable th3) {
        AbstractC3006f0.m8727u(mo8763d().getContext(), new C3002e0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th3));
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo8766j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC30057d interfaceC30057dMo8763d = mo8763d();
            AbstractC22676k.m65748h(interfaceC30057dMo8763d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C17173f c17173f = (C17173f) interfaceC30057dMo8763d;
            InterfaceC30057d interfaceC30057d = c17173f.f65974E;
            Object obj = c17173f.f65976G;
            InterfaceC30063j context = interfaceC30057d.getContext();
            Object objM48487m = AbstractC17167b.m48487m(context, obj);
            InterfaceC3027k1 interfaceC3027k1 = null;
            C3036m2 c3036m2M8704J = objM48487m != AbstractC17167b.f65959d ? AbstractC3006f0.m8704J(interfaceC30057d, context, objM48487m) : null;
            try {
                InterfaceC30063j context2 = interfaceC30057d.getContext();
                Object objMo8766j = mo8766j();
                Throwable thMo8764f = mo8764f(objMo8766j);
                if (thMo8764f == null) {
                    int i13 = this.f12064y;
                    boolean z4 = true;
                    if (i13 != 1 && i13 != 2) {
                        z4 = false;
                    }
                    if (z4) {
                        interfaceC3027k1 = (InterfaceC3027k1) context2.get(C3023j1.f12041w);
                    }
                }
                if (interfaceC3027k1 != null && !interfaceC3027k1.isActive()) {
                    CancellationException cancellationException = interfaceC3027k1.getCancellationException();
                    mo8761a(cancellationException);
                    interfaceC30057d.resumeWith(AbstractC34132o.m107888l(cancellationException));
                } else if (thMo8764f != null) {
                    interfaceC30057d.resumeWith(AbstractC34132o.m107888l(thMo8764f));
                } else {
                    interfaceC30057d.resumeWith(mo8765h(objMo8766j));
                }
            } finally {
                if (c3036m2M8704J == null || c3036m2M8704J.m8788d0()) {
                    AbstractC17167b.m48480f(context, objM48487m);
                }
            }
        } catch (DispatchException e5) {
            AbstractC3006f0.m8727u(mo8763d().getContext(), e5.f89396w);
        } catch (Throwable th3) {
            m8792i(th3);
        }
    }
}
