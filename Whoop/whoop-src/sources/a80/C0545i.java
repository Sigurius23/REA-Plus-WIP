package a80;

import bg0.AbstractC3225g;
import c93.InterfaceC4339a;
import com.whoop.profile.view.components.ReferralsTileKt;
import ev1.AbstractC13688g;
import gp2.AbstractC16070e;
import ih1.AbstractC18524h;
import k21.AbstractC22159c;
import lf0.AbstractC23927i0;
import m01.AbstractC24876d;
import ny0.C27256h;
import p715kotlin.jvm.functions.Function1;
import ph1.AbstractC29245i;
import q21.AbstractC29848g;
import r51.AbstractC30937e;
import uz1.AbstractC35430h;
import yf1.AbstractC39518g;

/* JADX INFO: renamed from: a80.i */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0545i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1876w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f1877x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27256h f1878y;

    public /* synthetic */ C0545i(Function1 function1, C27256h c27256h, int i13) {
        this.f1876w = i13;
        this.f1877x = function1;
        this.f1878y = c27256h;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f1876w) {
            case 0:
                return AbstractC0548l.m1352n(this.f1877x, this.f1878y);
            case 1:
                return AbstractC3225g.m9311w(this.f1877x, this.f1878y);
            case 2:
                return AbstractC13688g.m38639l(this.f1877x, this.f1878y);
            case 3:
                return AbstractC16070e.m45395o(this.f1877x, this.f1878y);
            case 4:
                return AbstractC18524h.m53671l(this.f1877x, this.f1878y);
            case 5:
                return AbstractC22159c.m63430l(this.f1877x, this.f1878y);
            case 6:
                return AbstractC23927i0.m70413q(this.f1877x, this.f1878y);
            case 7:
                return AbstractC24876d.m72918N(this.f1877x, this.f1878y);
            case 8:
                return AbstractC24876d.m72949z(this.f1877x, this.f1878y);
            case 9:
                return AbstractC29245i.m88831x(this.f1877x, this.f1878y);
            case 10:
                return AbstractC29848g.m91392g(this.f1877x, this.f1878y);
            case 11:
                return AbstractC30937e.m95159m(this.f1877x, this.f1878y);
            case 12:
                return AbstractC35430h.m112446n(this.f1878y, this.f1877x);
            case 13:
                return ReferralsTileKt.ReferralsTileButton$lambda$0$0(this.f1878y, this.f1877x);
            default:
                return AbstractC39518g.m126211p(this.f1877x, this.f1878y);
        }
    }

    public /* synthetic */ C0545i(C27256h c27256h, Function1 function1, int i13) {
        this.f1876w = i13;
        this.f1878y = c27256h;
        this.f1877x = function1;
    }
}
