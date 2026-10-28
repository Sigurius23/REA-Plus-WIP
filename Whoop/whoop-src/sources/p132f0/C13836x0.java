package p132f0;

import a20.C0162b;
import android.view.View;
import android.widget.Magnifier;
import androidx.compose.p018ui.node.NodeCoordinator;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import dc3.C11923h;
import e10.C12554k0;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p005a3.C0238p0;
import p005a3.InterfaceC0216j2;
import p005a3.InterfaceC0245r;
import p005a3.InterfaceC0249s;
import p005a3.InterfaceC0263w1;
import p026b2.AbstractC2316v;
import p095dp.AbstractC12240d;
import p181h2.C16617b;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p636y3.C39176h;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import q83.AbstractC30060g;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: f0.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13836x0 extends AbstractC2316v implements InterfaceC0249s, InterfaceC0245r, InterfaceC0216j2, InterfaceC0263w1 {

    /* JADX INFO: renamed from: O */
    public Function1 f49361O;

    /* JADX INFO: renamed from: P */
    public Function1 f49362P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC13791h1 f49363Q;

    /* JADX INFO: renamed from: R */
    public View f49364R;

    /* JADX INFO: renamed from: S */
    public InterfaceC39171c f49365S;

    /* JADX INFO: renamed from: T */
    public C12554k0 f49366T;

    /* JADX INFO: renamed from: V */
    public C28612f0 f49368V;

    /* JADX INFO: renamed from: X */
    public C39180l f49370X;

    /* JADX INFO: renamed from: Y */
    public C11923h f49371Y;

    /* JADX INFO: renamed from: U */
    public final C28633k1 f49367U = new C28633k1(null, C28676v0.f115976y);

    /* JADX INFO: renamed from: W */
    public long f49369W = 9205357640488583168L;

    public C13836x0(Function1 function1, Function1 function2, InterfaceC13791h1 interfaceC13791h1) {
        this.f49361O = function1;
        this.f49362P = function2;
        this.f49363Q = interfaceC13791h1;
    }

    @Override // p005a3.InterfaceC0263w1
    /* JADX INFO: renamed from: C */
    public final void mo796C() {
        AbstractC0201g.m512l(this, new C13834w0(this, 0));
    }

    @Override // p005a3.InterfaceC0249s
    /* JADX INFO: renamed from: I0 */
    public final void mo284I0(NodeCoordinator nodeCoordinator) {
        this.f49367U.setValue(nodeCoordinator);
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        c0238p0.m728a();
        C11923h c11923h = this.f49371Y;
        if (c11923h != null) {
            c11923h.mo32218s(C23454a0.f92919a);
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        mo796C();
        this.f49371Y = AbstractC30060g.m92111d(0, 7, null);
        AbstractC3006f0.m8732z(m7158L0(), null, EnumC2998d0.f12007z, new C0162b(this, null, 17), 1);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        C12554k0 c12554k0 = this.f49366T;
        if (c12554k0 != null) {
            ((Magnifier) c12554k0.f42881x).dismiss();
        }
        this.f49366T = null;
    }

    /* JADX INFO: renamed from: X0 */
    public final long m39193X0() {
        if (this.f49368V == null) {
            this.f49368V = AbstractC28683x.m87264r(new C13834w0(this, 2));
        }
        C28612f0 c28612f0 = this.f49368V;
        if (c28612f0 != null) {
            return ((C16617b) c28612f0.getValue()).f63937a;
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m39194Y0() {
        C12554k0 c12554k0 = this.f49366T;
        if (c12554k0 != null) {
            ((Magnifier) c12554k0.f42881x).dismiss();
        }
        View viewM34057W = this.f49364R;
        if (viewM34057W == null) {
            viewM34057W = AbstractC12240d.m34057W(this);
        }
        this.f49364R = viewM34057W;
        InterfaceC39171c interfaceC39171c = this.f49365S;
        if (interfaceC39171c == null) {
            interfaceC39171c = AbstractC0201g.m516p(this).f776X;
        }
        this.f49365S = interfaceC39171c;
        this.f49366T = this.f49363Q.mo39138a(viewM34057W, interfaceC39171c);
        m39196a1();
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m39195Z0() {
        InterfaceC39171c interfaceC39171c = this.f49365S;
        if (interfaceC39171c == null) {
            interfaceC39171c = AbstractC0201g.m516p(this).f776X;
            this.f49365S = interfaceC39171c;
        }
        long j7 = ((C16617b) this.f49361O.invoke(interfaceC39171c)).f63937a;
        if ((j7 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m39193X0()) == 9205357640488583168L) {
            this.f49369W = 9205357640488583168L;
            C12554k0 c12554k0 = this.f49366T;
            if (c12554k0 != null) {
                ((Magnifier) c12554k0.f42881x).dismiss();
                return;
            }
            return;
        }
        this.f49369W = C16617b.m47192h(m39193X0(), j7);
        if (this.f49366T == null) {
            m39194Y0();
        }
        C12554k0 c12554k1 = this.f49366T;
        if (c12554k1 != null) {
            c12554k1.mo35226O(this.f49369W, 9205357640488583168L);
        }
        m39196a1();
    }

    /* JADX INFO: renamed from: a1 */
    public final void m39196a1() {
        InterfaceC39171c interfaceC39171c;
        C12554k0 c12554k0 = this.f49366T;
        if (c12554k0 == null || (interfaceC39171c = this.f49365S) == null) {
            return;
        }
        long jM35219F = c12554k0.m35219F();
        C39180l c39180l = this.f49370X;
        if (c39180l != null && jM35219F == c39180l.f168422a) {
            return;
        }
        this.f49362P.invoke(new C39176h(interfaceC39171c.mo736i(AbstractC35744b.m113239l(c12554k0.m35219F()))));
        this.f49370X = new C39180l(c12554k0.m35219F());
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        ((C18030l) interfaceC18044z).m51772e(AbstractC13838y0.f49373a, new C13834w0(this, 1));
    }
}
