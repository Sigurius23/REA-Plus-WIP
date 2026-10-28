package jp1;

import a81.InterfaceC0569t;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.mapbox.maps.MapboxMap;
import com.whoop.payments.domain.models.Card;
import jr1.AbstractC21896d;
import jr1.AbstractC21897e;
import jr1.AbstractC21898f;
import jt1.AbstractC21938c;
import k51.AbstractC22203b;
import k51.C22202a;
import k71.AbstractC22242b;
import k71.C22240a;
import ke2.AbstractC22423c;
import kf0.AbstractC22433h;
import kk1.AbstractC22546g;
import kl2.AbstractC22576k;
import kw1.AbstractC22853d;
import kw1.AbstractC22859j;
import kw1.AbstractC22869t;
import l72.AbstractC23402i;
import l80.AbstractC23437n;
import l83.C23454a0;
import lw1.C24773i;
import p027b3.C2404l2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jp1.n */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21862n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84439w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f84440x;

    public /* synthetic */ C21862n(Function1 function1, int i13) {
        this.f84439w = i13;
        this.f84440x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f84439w) {
            case 0:
                return AbstractC21863o.m61940m(this.f84440x, obj);
            case 1:
                return AbstractC21863o.m61941n(this.f84440x, obj);
            case 2:
                return AbstractC21896d.m62186N(this.f84440x, obj);
            case 3:
                return AbstractC21896d.m62178F(this.f84440x, obj);
            case 4:
                return AbstractC21897e.m62223A(this.f84440x, obj);
            case 5:
                return AbstractC21898f.m62268m(this.f84440x, obj);
            case 6:
                return AbstractC21898f.m62270o(this.f84440x, obj);
            case 7:
                return AbstractC21898f.m62265j(this.f84440x, obj);
            case 8:
                return AbstractC21938c.m62514r(this.f84440x, ((Boolean) obj).booleanValue());
            case 9:
                return AbstractC21938c.m62515s(this.f84440x, ((Boolean) obj).booleanValue());
            case 10:
                return C22202a.m63662e(this.f84440x, obj);
            case 11:
                return AbstractC22203b.m63671f(this.f84440x, obj);
            case 12:
                return C22240a.m63757d(this.f84440x, obj);
            case 13:
                return AbstractC22242b.m63766g(this.f84440x, obj);
            case 14:
                return AbstractC22423c.m64602z(this.f84440x, ((Boolean) obj).booleanValue());
            case 15:
                return AbstractC22423c.m64573J(this.f84440x, ((Boolean) obj).booleanValue());
            case 16:
                return AbstractC22433h.m64708u(this.f84440x, (InterfaceC0569t) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC22546g.m65204J(this.f84440x, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC22576k.m65363Z(this.f84440x, ((Boolean) obj).booleanValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC22853d.m66292E(this.f84440x, (Card) obj);
            case 20:
                return AbstractC22859j.m66388x(this.f84440x, (C24773i) obj);
            case 21:
                return AbstractC22859j.m66389y(this.f84440x, (C24773i) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22869t.m66433n(this.f84440x, ((Integer) obj).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC22869t.m66434o(this.f84440x, obj);
            case 24:
                C2404l2 c2404l2 = (C2404l2) obj;
                c2404l2.m7401c("absoluteOffset");
                c2404l2.m7400b().m7292c(this.f84440x, MapboxMap.QFE_OFFSET);
                return C23454a0.f92919a;
            case 25:
                return AbstractC23402i.m67762C(this.f84440x, (Double) obj);
            case 26:
                return AbstractC23402i.m67765F(this.f84440x, (Double) obj);
            case 27:
                return AbstractC23437n.m67934T(this.f84440x, (InterfaceC4339a) obj);
            case 28:
                return AbstractC23437n.m67938X(this.f84440x, (InterfaceC4339a) obj);
            default:
                return AbstractC23437n.m67928N(this.f84440x, (InterfaceC4339a) obj);
        }
    }
}
