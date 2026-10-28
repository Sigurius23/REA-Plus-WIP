package p62;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p80.AbstractC28968a;
import pj2.AbstractC29310i;
import pj2.AbstractC29319r;
import pj2.AbstractC29321t;
import pp1.AbstractC29436i;
import q62.AbstractC30004d;
import q90.AbstractC30068a;
import qb0.AbstractC30180b;
import qd2.AbstractC30295a;
import qe0.AbstractC30302c;
import qg0.AbstractC30343d;
import qn0.AbstractC30516k;

/* JADX INFO: renamed from: p62.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28947h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117086w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f117087x;

    public /* synthetic */ C28947h(Function1 function1, int i13) {
        this.f117086w = i13;
        this.f117087x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f117086w) {
            case 0:
                return AbstractC28948i.m87903g(this.f117087x);
            case 1:
                return AbstractC28968a.m87972e(this.f117087x);
            case 2:
                return AbstractC28968a.m87973f(this.f117087x);
            case 3:
                return AbstractC29310i.m89016Y(this.f117087x);
            case 4:
                return AbstractC29310i.m89018Z(this.f117087x);
            case 5:
                return AbstractC29310i.m89021a0(this.f117087x);
            case 6:
                return AbstractC29310i.m89024b0(this.f117087x);
            case 7:
                return AbstractC29310i.m88987J0(this.f117087x);
            case 8:
                return AbstractC29310i.m88989K0(this.f117087x);
            case 9:
                return AbstractC29310i.m89003R0(this.f117087x);
            case 10:
                return AbstractC29319r.m89187e(this.f117087x);
            case 11:
                return AbstractC29321t.m89201L(this.f117087x);
            case 12:
                return AbstractC29321t.m89208S(this.f117087x);
            case 13:
                return AbstractC29321t.m89199J(this.f117087x);
            case 14:
                return AbstractC29436i.m89794s0(this.f117087x);
            case 15:
                this.f117087x.invoke(Boolean.TRUE);
                return C23454a0.f92919a;
            case 16:
                this.f117087x.invoke(Boolean.FALSE);
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC30004d.m91817k(this.f117087x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC30004d.m91819m(this.f117087x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC30068a.m92149e(this.f117087x);
            case 20:
                return AbstractC30068a.m92150f(this.f117087x);
            case 21:
                return AbstractC30180b.m92386m(this.f117087x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC30180b.m92388o(this.f117087x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC30295a.m92582l(this.f117087x);
            case 24:
                return AbstractC30295a.m92588r(this.f117087x);
            case 25:
                return AbstractC30295a.m92589s(this.f117087x);
            case 26:
                return AbstractC30302c.m92617K(this.f117087x);
            case 27:
                return AbstractC30302c.m92642w(this.f117087x);
            case 28:
                return AbstractC30343d.m92719j(this.f117087x);
            default:
                return AbstractC30516k.m93474k(this.f117087x);
        }
    }
}
