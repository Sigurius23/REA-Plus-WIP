package am2;

import com.whoop.navigation.C9598e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1016f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3807w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f3808x;

    public /* synthetic */ C1016f(Function1 function1, int i13) {
        this.f3807w = i13;
        this.f3808x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3807w) {
            case 0:
                return AbstractC1026k.m2745S(this.f3808x, (InterfaceC1038q) obj);
            case 1:
                return AbstractC1026k.m2746T(this.f3808x, (InterfaceC1038q) obj);
            case 2:
                return AbstractC1035o0.m2850U0(this.f3808x, (InterfaceC1038q) obj);
            case 3:
                return AbstractC1035o0.m2920v0(this.f3808x, obj);
            case 4:
                return AbstractC1035o0.m2828J0(this.f3808x, obj);
            default:
                return AbstractC1035o0.m2834M0(this.f3808x, (C9598e) obj);
        }
    }
}
