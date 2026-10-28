package hy0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import hz0.AbstractC17813b;
import i01.AbstractC17843f;
import id2.AbstractC18435t;
import ih0.AbstractC18491e0;
import ih2.AbstractC18527b;
import io2.AbstractC20773m0;
import ir2.AbstractC20865d;
import iz0.AbstractC21048g;
import j11.AbstractC21206i;
import j81.AbstractC21422f;
import jd2.AbstractC21613b;
import k11.AbstractC22121d;
import k71.AbstractC22243b0;
import k71.AbstractC22255l;

/* JADX INFO: renamed from: hy0.e0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17737e0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68943w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f68944x;

    public /* synthetic */ C17737e0(int i13, int i14) {
        this.f68943w = i14;
        this.f68944x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f68943w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC17741f0.m50851m(this.f68944x, composer, iIntValue);
            case 1:
                return AbstractC17741f0.m50855q(this.f68944x, composer, iIntValue);
            case 2:
                return AbstractC17741f0.m50853o(this.f68944x, composer, iIntValue);
            case 3:
                return AbstractC17813b.m51226f(this.f68944x, composer, iIntValue);
            case 4:
                return AbstractC17843f.m51293t(this.f68944x, composer, iIntValue);
            case 5:
                return AbstractC17843f.m51295v(this.f68944x, composer, iIntValue);
            case 6:
                return AbstractC18435t.m53089N(this.f68944x, composer, iIntValue);
            case 7:
                return AbstractC18491e0.m53406G1(this.f68944x, composer, iIntValue);
            case 8:
                return AbstractC18527b.m53743x(this.f68944x, composer, iIntValue);
            case 9:
                return AbstractC20773m0.m57228t(this.f68944x, composer, iIntValue);
            case 10:
                return AbstractC20865d.m57636k(this.f68944x, composer, iIntValue);
            case 11:
                return AbstractC21048g.m58842k0(this.f68944x, composer, iIntValue);
            case 12:
                return AbstractC21206i.m59472m(this.f68944x, composer, iIntValue);
            case 13:
                return AbstractC21422f.m60276t(this.f68944x, composer, iIntValue);
            case 14:
                return AbstractC21613b.m60793q(this.f68944x, composer, iIntValue);
            case 15:
                return AbstractC22121d.m63339p(this.f68944x, composer, iIntValue);
            case 16:
                return AbstractC22121d.m63341r(this.f68944x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC22255l.m63862F(this.f68944x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC22255l.m63860D(this.f68944x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC22255l.m63890x(this.f68944x, composer, iIntValue);
            case 20:
                return AbstractC22255l.m63864H(this.f68944x, composer, iIntValue);
            case 21:
                return AbstractC22255l.m63866J(this.f68944x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC22255l.m63858B(this.f68944x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC22255l.m63888v(this.f68944x, composer, iIntValue);
            case 24:
                return AbstractC22255l.m63880n(this.f68944x, composer, iIntValue);
            case 25:
                return AbstractC22255l.m63892z(this.f68944x, composer, iIntValue);
            case 26:
                return AbstractC22255l.m63882p(this.f68944x, composer, iIntValue);
            case 27:
                return AbstractC22255l.m63884r(this.f68944x, composer, iIntValue);
            case 28:
                return AbstractC22243b0.m63779g(this.f68944x, composer, iIntValue);
            default:
                return AbstractC22243b0.m63782j(this.f68944x, composer, iIntValue);
        }
    }
}
