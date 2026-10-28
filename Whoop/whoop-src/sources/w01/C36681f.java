package w01;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import w20.C36730t;
import w20.C36731u;
import w60.AbstractC36857e;
import w80.AbstractC36941b;
import wo1.C37468q;
import wq1.AbstractC37509c;
import xa0.AbstractC38137b;
import xc0.AbstractC38186a;
import xi2.AbstractC38327e;
import xi2.AbstractC38328f;
import xp2.AbstractC38537f;
import y80.AbstractC39325b;
import yb0.AbstractC39388k;
import yf1.AbstractC39518g;

/* JADX INFO: renamed from: w01.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36681f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157098w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f157099x;

    public /* synthetic */ C36681f(Function1 function1, int i13) {
        this.f157098w = i13;
        this.f157099x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f157098w) {
            case 0:
                return AbstractC36682g.m117747s(this.f157099x);
            case 1:
                this.f157099x.invoke(C36730t.f157230a);
                return C23454a0.f92919a;
            case 2:
                this.f157099x.invoke(C36731u.f157231a);
                return C23454a0.f92919a;
            case 3:
                return AbstractC36857e.m118179o(this.f157099x);
            case 4:
                return AbstractC36941b.m118592w(this.f157099x);
            case 5:
                return AbstractC36941b.m118593x(this.f157099x);
            case 6:
                return C37468q.m120096d(this.f157099x);
            case 7:
                return AbstractC37509c.m120248u(this.f157099x);
            case 8:
                return AbstractC37509c.m120250w(this.f157099x);
            case 9:
                return AbstractC37509c.m120251x(this.f157099x);
            case 10:
                return p744wt1.Function1.m120882u(this.f157099x);
            case 11:
                return p744wt1.Function1.m120883v(this.f157099x);
            case 12:
                return p744wt1.Function1.m120854A(this.f157099x);
            case 13:
                return AbstractC38137b.m122151s(this.f157099x);
            case 14:
                return AbstractC38137b.m122145m(this.f157099x);
            case 15:
                return AbstractC38186a.m122312u(this.f157099x);
            case 16:
                return AbstractC38186a.m122305n(this.f157099x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC38327e.m122852m(this.f157099x);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC38327e.m122853n(this.f157099x);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC38328f.m122879q(this.f157099x);
            case 20:
                return AbstractC38328f.m122880r(this.f157099x);
            case 21:
                return AbstractC38328f.m122855A(this.f157099x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC38328f.m122857C(this.f157099x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC38537f.m123467k(this.f157099x);
            case 24:
                return AbstractC39325b.m125297g(this.f157099x);
            case 25:
                return AbstractC39325b.m125298h(this.f157099x);
            case 26:
                return AbstractC39388k.m125679S0(this.f157099x);
            case 27:
                return AbstractC39388k.m125720i1(this.f157099x);
            case 28:
                return AbstractC39388k.m125723j1(this.f157099x);
            default:
                return AbstractC39518g.m126207l(this.f157099x);
        }
    }
}
