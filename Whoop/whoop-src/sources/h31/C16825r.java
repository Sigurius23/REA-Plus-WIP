package h31;

import c93.InterfaceC4339a;
import i31.AbstractC18053h;
import ld1.AbstractC23864c;
import p713jm0.Function1;
import rm1.AbstractC31595i;
import t21.AbstractC33349g;
import yl0.AbstractC39631n;
import yo0.AbstractC39683e;

/* JADX INFO: renamed from: h31.r */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C16825r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64624w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC23864c f64625x;

    public /* synthetic */ C16825r(AbstractC23864c abstractC23864c, int i13) {
        this.f64624w = i13;
        this.f64625x = abstractC23864c;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f64624w) {
            case 0:
                return AbstractC16826s.m47415k(this.f64625x);
            case 1:
                return AbstractC18053h.m51864m(this.f64625x);
            case 2:
                return Function1.m61620g(this.f64625x);
            case 3:
                return AbstractC31595i.m97471t(this.f64625x);
            case 4:
                return AbstractC33349g.m105742S(this.f64625x);
            case 5:
                return AbstractC39631n.m126677j(this.f64625x);
            default:
                return AbstractC39683e.m126916D(this.f64625x);
        }
    }
}
