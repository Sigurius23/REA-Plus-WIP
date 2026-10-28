package n20;

import a30.C0273a;
import b30.C2664y5;
import b30.C2671z5;
import b30.InterfaceC2481a6;
import h20.AbstractC16700n0;
import h20.C16688l0;
import h20.C16694m0;
import h20.C16769y3;
import h20.InterfaceC16646e0;
import java.util.List;
import l83.InterfaceC23459e;
import p236j.InterfaceC21063b;
import p599wz.C37708d;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q20.AbstractC29840y;

/* JADX INFO: renamed from: n20.g */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C26172g implements InterfaceC21063b, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103765w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26174i f103766x;

    public /* synthetic */ C26172g(C26174i c26174i, int i13) {
        this.f103765w = i13;
        this.f103766x = c26174i;
    }

    @Override // p236j.InterfaceC21063b
    /* JADX INFO: renamed from: a */
    public final void mo364a(Object obj) {
        List listMo47248f;
        C26173h c26173hM77717f;
        C37708d c37708dMo47247b;
        switch (this.f103765w) {
            case 0:
                AbstractC16700n0 abstractC16700n0 = (AbstractC16700n0) obj;
                C26174i c26174i = this.f103766x;
                if (abstractC16700n0 != null && (c37708dMo47247b = abstractC16700n0.mo47247b()) != null) {
                    c26174i.f103781l.m124147a(c37708dMo47247b);
                }
                if (abstractC16700n0 != null && (listMo47248f = abstractC16700n0.mo47248f()) != null) {
                    C26173h c26173hM77735g = c26174i.f103777h.m77735g();
                    C26186u c26186u = c26174i.f103777h;
                    if (c26173hM77735g != null) {
                        C0273a c0273a = c26173hM77735g.f103767w.f1021x;
                        c26173hM77717f = C26173h.m77717f(c26173hM77735g, c0273a != null ? C0273a.m807b(c0273a, listMo47248f, null, 2) : null, null, 5);
                    } else {
                        c26173hM77717f = null;
                    }
                    c26186u.f103861x.m5004e(c26173hM77717f, "state");
                }
                if (abstractC16700n0 instanceof C16694m0) {
                    C26186u c26186u2 = c26174i.f103777h;
                    AbstractC29840y abstractC29840y = ((C16694m0) abstractC16700n0).f64215x;
                    abstractC29840y.f121959w = true;
                    c26186u2.f103856E = abstractC29840y;
                    AbstractC29840y abstractC29840y2 = c26174i.f103777h.f103856E;
                    ((InterfaceC16646e0) c26174i.f103773d.f64275a.getValue()).mo47224a(abstractC29840y2 != null ? c26174i.f103772c.m88710f(abstractC29840y2) : null);
                    return;
                }
                if (abstractC16700n0 != null && !(abstractC16700n0 instanceof C16688l0)) {
                    throw new NoWhenBranchMatchedException();
                }
                C16688l0 c16688l0 = (C16688l0) abstractC16700n0;
                c26174i.f103777h.f103856E = c16688l0 != null ? c16688l0.f64184y : null;
                AbstractC29840y abstractC29840y3 = c26174i.f103777h.f103856E;
                ((InterfaceC16646e0) c26174i.f103773d.f64275a.getValue()).mo47224a(abstractC29840y3 != null ? c26174i.f103772c.m88710f(abstractC29840y3) : null);
                return;
            default:
                InterfaceC2481a6 p13 = (InterfaceC2481a6) obj;
                AbstractC22676k.m65750j(p13, "p0");
                C26174i c26174i2 = this.f103766x;
                if (!p13.equals(C2664y5.f10428w)) {
                    if (!p13.equals(C2671z5.f10463w)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c26174i2.f103774e.mo43511a(new C16769y3(true));
                    return;
                } else {
                    AbstractC29840y abstractC29840y4 = c26174i2.f103777h.f103856E;
                    if (abstractC29840y4 != null) {
                        abstractC29840y4.f121959w = true;
                    }
                    c26174i2.m77721c();
                    return;
                }
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f103765w) {
            case 0:
                if ((obj instanceof InterfaceC21063b) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC21063b) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        switch (this.f103765w) {
            case 0:
                return new C22672i(1, 0, C26174i.class, this.f103766x, "onPaymentOptionResult", "onPaymentOptionResult$paymentsheet_release(Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;)V");
            default:
                return new C22672i(1, 0, C26174i.class, this.f103766x, "onSepaMandateResult", "onSepaMandateResult$paymentsheet_release(Lcom/stripe/android/paymentsheet/ui/SepaMandateResult;)V");
        }
    }

    public final int hashCode() {
        switch (this.f103765w) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
