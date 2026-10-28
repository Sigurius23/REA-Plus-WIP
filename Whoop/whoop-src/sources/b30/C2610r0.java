package b30;

import h20.C16621a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b30.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2610r0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10164w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2659y0 f10165x;

    public /* synthetic */ C2610r0(C2659y0 c2659y0, int i13) {
        this.f10164w = i13;
        this.f10165x = c2659y0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10164w) {
            case 0:
                return Boolean.valueOf(((Boolean) obj).booleanValue() != this.f10165x.f10409t);
            case 1:
                this.f10165x.f10411v.m36570j((C16621a) obj);
                break;
            case 2:
                this.f10165x.f10411v.m36570j((C16621a) obj);
                break;
            default:
                this.f10165x.m7526c(new C2537h6(((Boolean) obj).booleanValue()));
                break;
        }
        return C23454a0.f92919a;
    }
}
