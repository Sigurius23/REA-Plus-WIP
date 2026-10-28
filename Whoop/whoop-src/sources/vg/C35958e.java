package vg;

import ae3.C0803k;
import c93.InterfaceC4339a;
import eg.C13162k;
import eg.C13166o;
import p249jc.C21568b0;
import p715kotlin.jvm.functions.Function1;
import vb1.C35868a;

/* JADX INFO: renamed from: vg.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C35958e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f153122w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21568b0 f153123x;

    public /* synthetic */ C35958e(C21568b0 c21568b0, int i13) {
        this.f153122w = i13;
        this.f153123x = c21568b0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f153122w) {
            case 0:
                C21568b0 c21568b0 = this.f153123x;
                Function1 function1 = (Function1) c21568b0.f82713c;
                Function1 function2 = (Function1) c21568b0.f82714d;
                C13162k c13162k = new C13162k();
                function2.invoke(c13162k);
                return function1.invoke(new C13166o(new C0803k(c13162k)));
            default:
                C21568b0 c21568b1 = this.f153123x;
                return ((Function1) c21568b1.f82713c).invoke(((InterfaceC35960g) c21568b1.f82715e).mo56533g(new C35868a(3)));
        }
    }
}
