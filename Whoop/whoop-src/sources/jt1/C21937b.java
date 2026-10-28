package jt1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import kd1.AbstractC22390d;
import kf0.AbstractC22431f;
import kf0.AbstractC22433h;
import l83.C23454a0;
import lf0.AbstractC23917f2;
import lf0.AbstractC23924h1;
import lf0.AbstractC23927i0;
import lf0.AbstractC23938l;
import lf0.AbstractC23940l1;
import lf0.AbstractC23952o1;
import lf0.AbstractC23990z1;
import lh0.C24067a;
import lw1.AbstractC24770f;
import m80.AbstractC25224f;
import mf0.AbstractC25506e;
import no0.AbstractC26958l0;
import p329n0.C26053f;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p717lq2.AbstractC24680l;
import p717lq2.AbstractC24686r;

/* JADX INFO: renamed from: jt1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21937b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84717w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f84718x;

    public /* synthetic */ C21937b(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f84717w = i13;
        this.f84718x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f84717w) {
            case 0:
                return AbstractC21938c.m62516t(this.f84718x);
            case 1:
                return AbstractC22390d.m64398I(this.f84718x);
            case 2:
                return AbstractC22390d.m64432x(this.f84718x);
            case 3:
                return AbstractC22390d.m64427s(this.f84718x);
            case 4:
                return AbstractC22390d.m64397H(this.f84718x);
            case 5:
                return AbstractC22431f.m64627B(this.f84718x);
            case 6:
                return AbstractC22431f.m64628C(this.f84718x);
            case 7:
                return AbstractC22433h.m64703p(this.f84718x);
            case 8:
                InterfaceC28601c1 interfaceC28601c1 = this.f84718x;
                interfaceC28601c1.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c1.getValue()).booleanValue()));
                return C23454a0.f92919a;
            case 9:
                return (InterfaceC39147y) this.f84718x.getValue();
            case 10:
                return AbstractC23938l.m70473u(this.f84718x);
            case 11:
                return AbstractC23927i0.m70411o(this.f84718x);
            case 12:
                return AbstractC23924h1.m70383q(this.f84718x);
            case 13:
                return AbstractC23940l1.m70510v(this.f84718x);
            case 14:
                return AbstractC23952o1.m70564h(this.f84718x);
            case 15:
                return AbstractC23990z1.m70804x(this.f84718x);
            case 16:
                return AbstractC23917f2.m70345y(this.f84718x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23917f2.m70309A(this.f84718x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C24067a.m70983f(this.f84718x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC24680l.m72093D(this.f84718x);
            case 20:
                return AbstractC24686r.m72207b0(this.f84718x);
            case 21:
                return AbstractC24686r.m72209c0(this.f84718x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC24686r.m72194Q(this.f84718x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC24770f.m72568p(this.f84718x);
            case 24:
                return Boolean.valueOf(AbstractC25224f.m73935w(this.f84718x));
            case 25:
                return AbstractC25506e.m74935Z(this.f84718x);
            case 26:
                return AbstractC25506e.m74916G(this.f84718x);
            case 27:
                return new C26053f((Function1) this.f84718x.getValue());
            case 28:
                return AbstractC26958l0.m80621U(this.f84718x);
            default:
                return AbstractC26958l0.m80604L0(this.f84718x);
        }
    }
}
