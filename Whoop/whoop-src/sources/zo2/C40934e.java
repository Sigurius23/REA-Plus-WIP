package zo2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import zr1.AbstractC41068b;
import zx2.AbstractC41208a;
import zy2.AbstractC41231d;

/* JADX INFO: renamed from: zo2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40934e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176593w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f176594x;

    public /* synthetic */ C40934e(Function1 function1, int i13) {
        this.f176593w = i13;
        this.f176594x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f176593w) {
            case 0:
                return AbstractC40935f.m132818g(this.f176594x);
            case 1:
                return AbstractC41068b.m133324l(this.f176594x);
            case 2:
                return AbstractC41208a.m133882t(this.f176594x);
            case 3:
                return AbstractC41208a.m133883u(this.f176594x);
            case 4:
                return AbstractC41208a.m133884v(this.f176594x);
            case 5:
                return AbstractC41208a.m133875m(this.f176594x);
            case 6:
                return AbstractC41208a.m133887y(this.f176594x);
            case 7:
                return AbstractC41231d.m133940s(this.f176594x);
            case 8:
                return AbstractC41231d.m133941t(this.f176594x);
            default:
                return AbstractC41231d.m133932k(this.f176594x);
        }
    }
}
