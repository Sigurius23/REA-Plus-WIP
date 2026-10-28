package am2;

import or2.EnumC28166h0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am2.h0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1021h0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3829w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f3830x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1037p0 f3831y;

    public /* synthetic */ C1021h0(C1037p0 c1037p0, Function1 function1, int i13) {
        this.f3829w = i13;
        this.f3831y = c1037p0;
        this.f3830x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3829w) {
            case 0:
                return AbstractC1035o0.m2814C0(this.f3831y, this.f3830x, obj);
            case 1:
                return AbstractC1035o0.m2816D0(this.f3830x, this.f3831y, obj);
            case 2:
                return AbstractC1035o0.m2907p0(this.f3830x, this.f3831y, (EnumC28166h0) obj);
            case 3:
                return AbstractC1035o0.m2914s0(this.f3831y, this.f3830x, ((Integer) obj).intValue());
            default:
                return AbstractC1035o0.m2916t0(this.f3831y, this.f3830x, obj);
        }
    }

    public /* synthetic */ C1021h0(Function1 function1, C1037p0 c1037p0, int i13) {
        this.f3829w = i13;
        this.f3830x = function1;
        this.f3831y = c1037p0;
    }
}
