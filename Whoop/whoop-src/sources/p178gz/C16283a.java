package p178gz;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import cz.C11206j;
import cz.C11212m;
import cz.C11226t;
import gz2.AbstractC16341h;
import h02.AbstractC16570f;
import h02.AbstractC16578j;
import h60.AbstractC16977f;
import h60.AbstractC16978g;
import h90.AbstractC17024b;
import he1.AbstractC17212a;
import i21.AbstractC18009s;
import i21.AbstractC18010t;
import i90.AbstractC18246b;
import ib0.AbstractC18333d;
import ib2.AbstractC18337b;
import id0.AbstractC18409c;
import if0.AbstractC18452c;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gz.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16283a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f62455w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f62456x;

    public /* synthetic */ C16283a(Function1 function1, int i13) {
        this.f62455w = i13;
        this.f62456x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f62455w) {
            case 0:
                this.f62456x.invoke(C11206j.f35937a);
                return C23454a0.f92919a;
            case 1:
                this.f62456x.invoke(C11226t.f36029a);
                return C23454a0.f92919a;
            case 2:
                this.f62456x.invoke(C11212m.f35952a);
                return C23454a0.f92919a;
            case 3:
                return AbstractC16341h.m46557d(this.f62456x);
            case 4:
                return AbstractC16570f.m46954j(this.f62456x);
            case 5:
                return AbstractC16578j.m47015n(this.f62456x);
            case 6:
                return AbstractC16977f.m47757g(this.f62456x);
            case 7:
                return AbstractC16977f.m47759i(this.f62456x);
            case 8:
                return AbstractC16977f.m47760j(this.f62456x);
            case 9:
                return AbstractC16978g.m47784w(this.f62456x);
            case 10:
                return AbstractC17024b.m48041y(this.f62456x);
            case 11:
                return AbstractC17024b.m48009A(this.f62456x);
            case 12:
                return AbstractC17212a.m48620I(this.f62456x);
            case 13:
                return AbstractC17212a.m48649x(this.f62456x);
            case 14:
                return AbstractC17212a.m48650y(this.f62456x);
            case 15:
                return AbstractC17212a.m48621J(this.f62456x);
            case 16:
                return AbstractC17212a.m48622K(this.f62456x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return p709he2.Function1.m48706T(this.f62456x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return p709he2.Function1.m48709W(this.f62456x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC18009s.m51702k(this.f62456x);
            case 20:
                return AbstractC18010t.m51713i(this.f62456x);
            case 21:
                return AbstractC18246b.m52560e(this.f62456x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC18246b.m52561f(this.f62456x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC18333d.m52786y(this.f62456x);
            case 24:
                return AbstractC18333d.m52757O(this.f62456x);
            case 25:
                return AbstractC18337b.m52831y(this.f62456x);
            case 26:
                return AbstractC18337b.m52832z(this.f62456x);
            case 27:
                return AbstractC18409c.m52980s(this.f62456x);
            case 28:
                return AbstractC18452c.m53194z(this.f62456x);
            default:
                return AbstractC18452c.m53167A(this.f62456x);
        }
    }
}
