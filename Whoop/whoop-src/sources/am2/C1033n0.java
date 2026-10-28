package am2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import y71.C39278k;
import y71.C39282o;

/* JADX INFO: renamed from: am2.n0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1033n0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3924w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f3925x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C39282o f3926y;

    public /* synthetic */ C1033n0(Function1 function1, C39282o c39282o, int i13) {
        this.f3924w = i13;
        this.f3925x = function1;
        this.f3926y = c39282o;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f3924w) {
            case 0:
                return AbstractC1035o0.m2838O0(this.f3926y, this.f3925x);
            case 1:
                return C39278k.m125156f(this.f3925x, this.f3926y);
            case 2:
                return C39278k.m125157g(this.f3926y, this.f3925x);
            default:
                return C39278k.m125158h(this.f3925x, this.f3926y);
        }
    }

    public /* synthetic */ C1033n0(C39282o c39282o, Function1 function1, int i13) {
        this.f3924w = i13;
        this.f3926y = c39282o;
        this.f3925x = function1;
    }
}
