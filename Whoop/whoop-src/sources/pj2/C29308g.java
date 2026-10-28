package pj2;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p740ux0.Function0;
import pp1.AbstractC29436i;
import rm1.AbstractC31594h;
import rx0.AbstractC31902g;
import un1.AbstractC35101g;
import vo1.AbstractC36229d;
import vp1.AbstractC36272h;
import yb0.AbstractC39388k;

/* JADX INFO: renamed from: pj2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29308g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118656w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f118657x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f118658y;

    public /* synthetic */ C29308g(Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f118656w = i13;
        this.f118657x = function1;
        this.f118658y = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f118656w) {
            case 0:
                return AbstractC29310i.m89079y0(this.f118657x, this.f118658y);
            case 1:
                return AbstractC29310i.m89065r0(this.f118657x, this.f118658y);
            case 2:
                return AbstractC29436i.m89737O0(this.f118658y, this.f118657x);
            case 3:
                return AbstractC31594h.m97407J(this.f118657x, this.f118658y);
            case 4:
                return AbstractC31902g.m99177p(this.f118657x, this.f118658y);
            case 5:
                return p733ry2.Function1.m99287i(this.f118657x, this.f118658y);
            case 6:
                return AbstractC35101g.m111052y(this.f118657x, this.f118658y);
            case 7:
                return Function0.m112215h(this.f118657x, this.f118658y);
            case 8:
                return AbstractC36229d.m115390J(this.f118657x, this.f118658y);
            case 9:
                return AbstractC36272h.m115895y1(this.f118657x, this.f118658y);
            case 10:
                return AbstractC39388k.m125766z0(this.f118657x, this.f118658y);
            default:
                return AbstractC39388k.m125647C0(this.f118657x, this.f118658y);
        }
    }

    public /* synthetic */ C29308g(InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        this.f118656w = 2;
        this.f118658y = interfaceC28601c1;
        this.f118657x = function1;
    }
}
