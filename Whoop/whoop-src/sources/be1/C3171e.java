package be1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import zd1.InterfaceC40549d;

/* JADX INFO: renamed from: be1.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3171e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12404w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f12405x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC40549d f12406y;

    public /* synthetic */ C3171e(Function1 function1, InterfaceC40549d interfaceC40549d) {
        this.f12405x = function1;
        this.f12406y = interfaceC40549d;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f12404w) {
            case 0:
                return AbstractC3173g.m9111i0(this.f12406y, this.f12405x);
            default:
                return AbstractC3173g.m9113j0(this.f12405x, this.f12406y);
        }
    }

    public /* synthetic */ C3171e(InterfaceC40549d interfaceC40549d, Function1 function1) {
        this.f12406y = interfaceC40549d;
        this.f12405x = function1;
    }
}
