package am2;

import c93.InterfaceC4339a;
import k21.AbstractC22159c;
import k21.C22157a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am2.m0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1031m0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3918w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f3919x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22157a f3920y;

    public /* synthetic */ C1031m0(Function1 function1, C22157a c22157a, int i13) {
        this.f3918w = i13;
        this.f3919x = function1;
        this.f3920y = c22157a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f3918w) {
            case 0:
                return AbstractC1035o0.m2865b0(this.f3919x, this.f3920y);
            case 1:
                return AbstractC22159c.m63428j(this.f3919x, this.f3920y);
            default:
                return AbstractC22159c.m63429k(this.f3919x, this.f3920y);
        }
    }
}
