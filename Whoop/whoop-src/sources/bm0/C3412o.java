package bm0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c41.AbstractC4050j2;
import c93.InterfaceC4351m;
import d62.AbstractC11741g;
import f01.AbstractC13882n0;
import g51.AbstractC15494d;
import hy0.AbstractC17725b0;
import ir2.AbstractC20865d;
import iw0.AbstractC20992x;
import java.util.List;
import kv2.AbstractC22846b;
import mx1.AbstractC26004j;
import mx1.AbstractC26007m;
import o52.AbstractC27550e0;
import p12.AbstractC28734x;
import p709he2.Function1;
import p730qt2.AbstractC30610p;
import p730qt2.AbstractC30614t;
import p748zc1.AbstractC40372j8;
import p748zc1.AbstractC40526y8;
import p90.AbstractC29001i;
import qj2.AbstractC30436a;
import qn0.AbstractC30506a;
import rq2.AbstractC31729i;
import u71.AbstractC34573g;
import vo1.AbstractC36249x;
import vq2.AbstractC36284a;
import wo1.AbstractC37457k0;
import wo1.AbstractC37467p0;
import zm1.AbstractC40894e;

/* JADX INFO: renamed from: bm0.o */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3412o implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13299w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f13300x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f13301y;

    public /* synthetic */ C3412o(List list, int i13, int i14) {
        this.f13299w = i14;
        this.f13300x = list;
        this.f13301y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f13299w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3415r.m9848s(this.f13300x, this.f13301y, composer, iIntValue);
            case 1:
                return AbstractC4050j2.m12385r(this.f13300x, this.f13301y, composer, iIntValue);
            case 2:
                return AbstractC11741g.m31403L(this.f13300x, this.f13301y, composer, iIntValue);
            case 3:
                return AbstractC13882n0.m39442z(this.f13300x, this.f13301y, composer, iIntValue);
            case 4:
                return AbstractC15494d.m43704c(this.f13300x, this.f13301y, composer, iIntValue);
            case 5:
                return Function1.m48733v(this.f13300x, this.f13301y, composer, iIntValue);
            case 6:
                return AbstractC17725b0.m50773j(this.f13300x, this.f13301y, composer, iIntValue);
            case 7:
                return AbstractC20865d.m57632g(this.f13300x, this.f13301y, composer, iIntValue);
            case 8:
                return AbstractC20992x.m58384S0(this.f13300x, this.f13301y, composer, iIntValue);
            case 9:
                return AbstractC22846b.m66248K(this.f13300x, this.f13301y, composer, iIntValue);
            case 10:
                return AbstractC26004j.m77174G(this.f13300x, this.f13301y, composer, iIntValue);
            case 11:
                return AbstractC26007m.m77214F(this.f13300x, this.f13301y, composer, iIntValue);
            case 12:
                return AbstractC27550e0.m83147e(this.f13300x, this.f13301y, composer, iIntValue);
            case 13:
                return p725ot1.Function1.m85835v(this.f13300x, this.f13301y, composer, iIntValue);
            case 14:
                return AbstractC28734x.m87457v0(this.f13300x, this.f13301y, composer, iIntValue);
            case 15:
                return AbstractC29001i.m88083g(this.f13300x, this.f13301y, composer, iIntValue);
            case 16:
                return AbstractC30436a.m93089r(this.f13300x, this.f13301y, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC30436a.m93091t(this.f13300x, this.f13301y, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC30506a.m93425d(this.f13300x, this.f13301y, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC30610p.m93943e(this.f13300x, this.f13301y, composer, iIntValue);
            case 20:
                return AbstractC30614t.m93978c(this.f13300x, this.f13301y, composer, iIntValue);
            case 21:
                return AbstractC31729i.m98466m(this.f13300x, this.f13301y, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC34573g.m109332o(this.f13300x, this.f13301y, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36249x.m115617O(this.f13300x, this.f13301y, composer, iIntValue);
            case 24:
                return AbstractC36284a.m115990g(this.f13300x, this.f13301y, composer, iIntValue);
            case 25:
                return AbstractC37457k0.m120002o(this.f13300x, this.f13301y, composer, iIntValue);
            case 26:
                return AbstractC37467p0.m120085q(this.f13300x, this.f13301y, composer, iIntValue);
            case 27:
                return AbstractC40372j8.m130128g(this.f13300x, this.f13301y, composer, iIntValue);
            case 28:
                return AbstractC40526y8.m131241f(this.f13300x, this.f13301y, composer, iIntValue);
            default:
                return AbstractC40894e.m132537n(this.f13300x, this.f13301y, composer, iIntValue);
        }
    }
}
