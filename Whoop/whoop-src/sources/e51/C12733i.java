package e51;

import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: e51.i */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12733i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43549w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12738n f43550x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f43551y;

    public /* synthetic */ C12733i(C12738n c12738n, Function1 function1) {
        this.f43550x = c12738n;
        this.f43551y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f43549w) {
            case 0:
                return C12734j.m35608d(this.f43551y, this.f43550x, obj);
            default:
                return AbstractC12736l.m35626m(this.f43550x, this.f43551y, (InterfaceC26064q) obj);
        }
    }

    public /* synthetic */ C12733i(Function1 function1, C12738n c12738n) {
        this.f43551y = function1;
        this.f43550x = c12738n;
    }
}
