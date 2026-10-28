package c41;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c41.k4 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4059k4 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16490w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f16491x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C4108r4 f16492y;

    public /* synthetic */ C4059k4(C4108r4 c4108r4, Function1 function1) {
        this.f16492y = c4108r4;
        this.f16491x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f16490w) {
            case 0:
                return AbstractC4066l4.m12452m(this.f16492y, this.f16491x);
            default:
                return AbstractC4066l4.m12453n(this.f16491x, this.f16492y);
        }
    }

    public /* synthetic */ C4059k4(Function1 function1, C4108r4 c4108r4) {
        this.f16491x = function1;
        this.f16492y = c4108r4;
    }
}
