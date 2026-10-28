package ky2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import l72.AbstractC23396c;
import l72.AbstractC23408o;
import l80.AbstractC23437n;
import l83.C23454a0;
import l90.AbstractC23541a;
import lc0.AbstractC23824f;
import le0.AbstractC23873b;
import m80.AbstractC25222d;
import mf0.AbstractC25506e;
import mf2.AbstractC25515f;
import p292l1.C23122k1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ky2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22892a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90386w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f90387x;

    public /* synthetic */ C22892a(Function1 function1, int i13) {
        this.f90386w = i13;
        this.f90387x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f90386w) {
            case 0:
                return AbstractC22893b.m66540g(this.f90387x);
            case 1:
                return AbstractC22893b.m66542i(this.f90387x);
            case 2:
                return AbstractC22893b.m66543j(this.f90387x);
            case 3:
                return AbstractC22894c.m66551g(this.f90387x);
            case 4:
                return AbstractC22894c.m66553i(this.f90387x);
            case 5:
                return AbstractC22894c.m66554j(this.f90387x);
            case 6:
                return AbstractC22896e.m66566k(this.f90387x);
            case 7:
                return AbstractC22896e.m66568m(this.f90387x);
            case 8:
                return AbstractC22896e.m66569n(this.f90387x);
            case 9:
                return AbstractC22896e.m66571p(this.f90387x);
            case 10:
                this.f90387x.invoke(new C23122k1(1));
                return C23454a0.f92919a;
            case 11:
                this.f90387x.invoke(new C23122k1(0));
                return C23454a0.f92919a;
            case 12:
                return AbstractC23396c.m67712E(this.f90387x);
            case 13:
                return AbstractC23408o.m67880x0(this.f90387x);
            case 14:
                return AbstractC23437n.m67950e0(this.f90387x);
            case 15:
                return AbstractC23437n.m67954g0(this.f90387x);
            case 16:
                return AbstractC23541a.m68147h(this.f90387x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23824f.m69961f(this.f90387x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23873b.m70141q(this.f90387x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23873b.m70135k(this.f90387x);
            case 20:
                return AbstractC23873b.m70136l(this.f90387x);
            case 21:
                return AbstractC25222d.m73868A(this.f90387x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC25222d.m73893r(this.f90387x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC25222d.m73894s(this.f90387x);
            case 24:
                return AbstractC25506e.m74932W(this.f90387x);
            case 25:
                return AbstractC25515f.m75030R(this.f90387x);
            case 26:
                return AbstractC25515f.m75020H(this.f90387x);
            case 27:
                return AbstractC25515f.m75021I(this.f90387x);
            case 28:
                return AbstractC25515f.m75022J(this.f90387x);
            default:
                return AbstractC25515f.m75024L(this.f90387x);
        }
    }
}
