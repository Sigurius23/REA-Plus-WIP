package iy0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import j11.AbstractC21206i;
import jp1.AbstractC21855g;
import jp1.AbstractC21863o;
import jr1.AbstractC21896d;
import kc2.AbstractC22352b;
import kd1.AbstractC22390d;
import kd1.AbstractC22405q;
import kl2.AbstractC22576k;
import kw1.AbstractC22853d;
import ky2.AbstractC22897f;
import ky2.AbstractC22899h;
import kz2.AbstractC22924a;
import kz2.AbstractC22926c;
import l72.AbstractC23409p;
import l83.C23454a0;
import lc0.AbstractC23820b;
import lc0.AbstractC23828j;
import lf0.AbstractC23898b;
import lf0.AbstractC23990z1;
import p714k80.AbstractC22284m;

/* JADX INFO: renamed from: iy0.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C21026a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79603w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f79604x;

    public /* synthetic */ C21026a(InterfaceC4339a interfaceC4339a, int i13) {
        this.f79603w = i13;
        this.f79604x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f79603w) {
            case 0:
                return AbstractC21027b.m58698e(this.f79604x);
            case 1:
                this.f79604x.invoke();
                return C23454a0.f92919a;
            case 2:
                return AbstractC21206i.m59467h(this.f79604x);
            case 3:
                return AbstractC21855g.m61887z(this.f79604x);
            case 4:
                return AbstractC21855g.m61878q(this.f79604x);
            case 5:
                return AbstractC21863o.m61943p(this.f79604x);
            case 6:
                return AbstractC21896d.m62215v(this.f79604x);
            case 7:
                return AbstractC22284m.m64018f(this.f79604x);
            case 8:
                return AbstractC22352b.m64248f(this.f79604x);
            case 9:
                return AbstractC22390d.m64394E(this.f79604x);
            case 10:
                return AbstractC22405q.m64508e(this.f79604x);
            case 11:
                return AbstractC22576k.m65391y(this.f79604x);
            case 12:
                return AbstractC22853d.m66296I(this.f79604x);
            case 13:
                return AbstractC22853d.m66288A(this.f79604x);
            case 14:
                return AbstractC22897f.m66576d(this.f79604x);
            case 15:
                return AbstractC22899h.m66622d(this.f79604x);
            case 16:
                return AbstractC22924a.m66658d(this.f79604x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC22926c.m66676o(this.f79604x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC22926c.m66677p(this.f79604x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC22926c.m66680s(this.f79604x);
            case 20:
                return AbstractC22926c.m66687z(this.f79604x);
            case 21:
                return AbstractC22926c.m66660A(this.f79604x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.f79604x.invoke();
                return Boolean.TRUE;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f79604x.invoke();
                return Boolean.TRUE;
            case 24:
                return AbstractC23409p.m67894j(this.f79604x);
            case 25:
                return AbstractC23820b.m69938m(this.f79604x);
            case 26:
                return AbstractC23828j.m69988I(this.f79604x);
            case 27:
                return AbstractC23898b.m70202g(this.f79604x);
            case 28:
                return AbstractC23990z1.m70793m(this.f79604x);
            default:
                return AbstractC23990z1.m70797q(this.f79604x);
        }
    }
}
