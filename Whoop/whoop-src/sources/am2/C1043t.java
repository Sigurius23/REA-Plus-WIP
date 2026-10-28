package am2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am2.t */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1043t implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4018w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f4019x;

    public /* synthetic */ C1043t(Function1 function1, int i13) {
        this.f4018w = i13;
        this.f4019x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f4018w) {
            case 0:
                return AbstractC1046w.m2993E(this.f4019x);
            case 1:
                return AbstractC1035o0.m2901n0(this.f4019x);
            case 2:
                return AbstractC1035o0.m2858Y0(this.f4019x);
            case 3:
                return AbstractC1035o0.m2878f1(this.f4019x);
            default:
                return AbstractC1035o0.m2881g1(this.f4019x);
        }
    }
}
