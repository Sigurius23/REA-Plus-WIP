package bs1;

import com.whoop.navigation.C9598e;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bs1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3586e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14573w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f14574x;

    public /* synthetic */ C3586e(Function1 function1, int i13) {
        this.f14573w = i13;
        this.f14574x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14573w) {
            case 0:
                return AbstractC3587f.m10942m(this.f14574x, ((Integer) obj).intValue());
            case 1:
                return AbstractC3583c0.m10799V0(this.f14574x, (C9598e) obj);
            case 2:
                return AbstractC3583c0.m10859l1(this.f14574x, (InterfaceC39147y) obj);
            case 3:
                return AbstractC3583c0.m10863m1(this.f14574x, (String) obj);
            default:
                return AbstractC3583c0.m10745D0(this.f14574x, ((Boolean) obj).booleanValue());
        }
    }
}
