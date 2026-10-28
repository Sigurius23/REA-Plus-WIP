package d42;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import do0.AbstractC12228b;
import do0.AbstractC12230d;
import dw1.AbstractC12416d;
import dw1.AbstractC12418f;
import ek2.AbstractC13304a;
import ek2.AbstractC13305b;
import ek2.AbstractC13306c;
import ep1.AbstractC13422q;
import ep1.AbstractC13426u;
import f01.AbstractC13886o1;
import f01.AbstractC13907w;
import fg2.AbstractC14466h;
import fg2.AbstractC14472n;
import l83.C23454a0;
import p704dk2.AbstractC12124k;
import p704dk2.Function0;
import p705ea2.AbstractC12911i0;

/* JADX INFO: renamed from: d42.o */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11699o implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37836w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f37837x;

    public /* synthetic */ C11699o(InterfaceC4339a interfaceC4339a, int i13) {
        this.f37836w = i13;
        this.f37837x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f37836w) {
            case 0:
                return AbstractC11700p.m31240O(this.f37837x);
            case 1:
                return AbstractC11700p.m31241P(this.f37837x);
            case 2:
                return AbstractC11700p.m31234I(this.f37837x);
            case 3:
                return AbstractC11700p.m31235J(this.f37837x);
            case 4:
                return AbstractC11700p.m31236K(this.f37837x);
            case 5:
                return AbstractC11700p.m31237L(this.f37837x);
            case 6:
                return Function0.m33508k(this.f37837x);
            case 7:
                return AbstractC12124k.m33572f(this.f37837x);
            case 8:
                return AbstractC12228b.m33983p(this.f37837x);
            case 9:
                return AbstractC12230d.m34012s(this.f37837x);
            case 10:
                return AbstractC12416d.m34945r(this.f37837x);
            case 11:
                return AbstractC12418f.m34967s(this.f37837x);
            case 12:
                return AbstractC12911i0.m36316h(this.f37837x);
            case 13:
                return AbstractC13304a.m37373l(this.f37837x);
            case 14:
                return AbstractC13305b.m37389j(this.f37837x);
            case 15:
                return AbstractC13306c.m37404l(this.f37837x);
            case 16:
                return p706eo0.Function0.m37668d(this.f37837x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13422q.m38030R(this.f37837x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13422q.m38056y(this.f37837x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC13426u.m38089w(this.f37837x);
            case 20:
                return AbstractC13907w.m39600i(this.f37837x);
            case 21:
                return AbstractC13886o1.m39482s(this.f37837x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC13886o1.m39483t(this.f37837x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC14466h.m41259q(this.f37837x);
            case 24:
                return AbstractC14472n.m41312q(this.f37837x);
            case 25:
                this.f37837x.invoke();
                return C23454a0.f92919a;
            case 26:
                this.f37837x.invoke();
                return Boolean.TRUE;
            case 27:
                this.f37837x.invoke();
                return Boolean.TRUE;
            case 28:
                this.f37837x.invoke();
                return C23454a0.f92919a;
            default:
                this.f37837x.invoke();
                return C23454a0.f92919a;
        }
    }
}
