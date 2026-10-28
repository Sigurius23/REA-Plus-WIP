package p702ch0;

import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ch0.n0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4640n0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18850w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4642o0 f18851x;

    public /* synthetic */ C4640n0(C4642o0 c4642o0, int i13) {
        this.f18850w = i13;
        this.f18851x = c4642o0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18850w) {
            case 0:
                return C4642o0.m14541I(this.f18851x, ((Integer) obj).intValue());
            case 1:
                return C4642o0.m14540G(this.f18851x, ((Integer) obj).intValue());
            default:
                return C4642o0.m14552v(this.f18851x, (InterfaceC39147y) obj);
        }
    }
}
