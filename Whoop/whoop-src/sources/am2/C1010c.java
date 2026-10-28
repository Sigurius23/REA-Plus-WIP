package am2;

import p163g1.EnumC15209z3;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1010c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3789w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f3790x;

    public /* synthetic */ C1010c(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f3789w = i13;
        this.f3790x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3789w) {
            case 0:
                return AbstractC1026k.m2742P(this.f3790x, ((Boolean) obj).booleanValue());
            case 1:
                return Boolean.valueOf(AbstractC1046w.m2997I(this.f3790x, (EnumC15209z3) obj));
            case 2:
                return AbstractC1046w.m3005Q(this.f3790x, obj);
            case 3:
                return AbstractC1046w.m3008T(this.f3790x, ((Boolean) obj).booleanValue());
            case 4:
                return Boolean.valueOf(AbstractC1046w.m3026f0(this.f3790x, (EnumC15209z3) obj));
            case 5:
                return Boolean.valueOf(AbstractC1035o0.m2898m0(this.f3790x, (EnumC15209z3) obj));
            case 6:
                return AbstractC1035o0.m2928z0(this.f3790x, obj);
            case 7:
                return AbstractC1035o0.m2830K0(this.f3790x, obj);
            default:
                return AbstractC1035o0.m2832L0(this.f3790x, obj);
        }
    }
}
