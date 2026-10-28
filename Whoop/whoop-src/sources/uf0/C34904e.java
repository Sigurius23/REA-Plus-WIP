package uf0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import uu2.AbstractC35261l;
import ux2.AbstractC35371a;
import uz1.AbstractC35428f;
import v01.AbstractC35501c;
import v01.AbstractC35510l;
import v20.C35573m;
import v20.C35574n;
import v31.AbstractC35610f;
import v80.AbstractC35794b;
import ve0.AbstractC35927e;
import vo1.AbstractC36232g;
import vo1.AbstractC36243r;
import vo1.AbstractC36245t;
import vo1.AbstractC36249x;
import vs2.AbstractC36479e;
import vv2.AbstractC36539e;

/* JADX INFO: renamed from: uf0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C34904e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f146987w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f146988x;

    public /* synthetic */ C34904e(Function1 function1, int i13) {
        this.f146987w = i13;
        this.f146988x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f146987w) {
            case 0:
                return AbstractC34906g.m110071n(this.f146988x);
            case 1:
                return AbstractC35261l.m111771P(this.f146988x);
            case 2:
                return AbstractC35371a.m112248m(this.f146988x);
            case 3:
                return AbstractC35371a.m112243h(this.f146988x);
            case 4:
                return AbstractC35428f.m112426n(this.f146988x);
            case 5:
                return AbstractC35428f.m112422j(this.f146988x);
            case 6:
                return AbstractC35501c.m112601w(this.f146988x);
            case 7:
                return AbstractC35510l.m112654r(this.f146988x);
            case 8:
                this.f146988x.invoke(C35573m.f151306a);
                return C23454a0.f92919a;
            case 9:
                this.f146988x.invoke(C35574n.f151307a);
                return C23454a0.f92919a;
            case 10:
                return AbstractC35610f.m112817n(this.f146988x);
            case 11:
                return AbstractC35794b.m113476u(this.f146988x);
            case 12:
                return AbstractC35927e.m114112K(this.f146988x);
            case 13:
                return AbstractC35927e.m114125X(this.f146988x);
            case 14:
                return AbstractC35927e.m114126Y(this.f146988x);
            case 15:
                return AbstractC35927e.m114129a0(this.f146988x);
            case 16:
                return AbstractC35927e.m114120S(this.f146988x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC36232g.m115430D(this.f146988x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC36232g.m115469x(this.f146988x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC36232g.m115470y(this.f146988x);
            case 20:
                return AbstractC36243r.m115564x0(this.f146988x);
            case 21:
                return AbstractC36243r.m115534i0(this.f146988x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC36243r.m115566y0(this.f146988x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC36245t.m115597y(this.f146988x);
            case 24:
                return AbstractC36249x.m115603A(this.f146988x);
            case 25:
                return AbstractC36249x.m115607E(this.f146988x);
            case 26:
                return AbstractC36479e.m116878g0(this.f146988x);
            case 27:
                return AbstractC36479e.m116846H(this.f146988x);
            case 28:
                return AbstractC36539e.m117101K(this.f146988x);
            default:
                return AbstractC36539e.m117096F(this.f146988x);
        }
    }
}
