package s10;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bz.C3702a;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import hc3.AbstractC17182o;
import kc3.C22365e;
import p098dt.AbstractC12350b;
import p599wz.C37737m1;
import p599wz.C37755s1;
import s93.AbstractC32309k;
import t10.C33300t;
import v03.InterfaceC35517d;

/* JADX INFO: renamed from: s10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C32061c implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f132963w;

    public /* synthetic */ C32061c(int i13) {
        this.f132963w = i13;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f132963w) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return EventReporter$Mode.Embedded;
            case 2:
                return AbstractC12350b.m34570S("EmbeddedPaymentElement");
            case 3:
                C22365e c22365e = AbstractC3050q0.f12077a;
                AbstractC3069w1 abstractC3069w1 = AbstractC17182o.f65999a;
                AbstractC32309k.m100574c(abstractC3069w1);
                return abstractC3069w1;
            case 4:
                return new C33300t();
            case 5:
                C22365e c22365e2 = AbstractC3050q0.f12077a;
                return AbstractC3006f0.m8708b(AbstractC17182o.f65999a);
            case 6:
                C22365e c22365e3 = AbstractC3050q0.f12077a;
                return AbstractC3006f0.m8708b(AbstractC17182o.f65999a);
            case 7:
                C3702a c3702a = C3702a.f15142b;
                AbstractC32309k.m100574c(c3702a);
                return c3702a;
            case 8:
                return Boolean.FALSE;
            case 9:
                C37737m1 c37737m1 = new C37737m1();
                c37737m1.f161694a = true;
                return c37737m1;
            case 10:
                return new C37755s1();
            case 11:
                return Boolean.FALSE;
            default:
                return Boolean.FALSE;
        }
    }
}
