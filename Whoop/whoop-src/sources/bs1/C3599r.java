package bs1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bs1.r */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3599r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14606w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f14607x;

    public /* synthetic */ C3599r(Function1 function1, int i13) {
        this.f14606w = i13;
        this.f14607x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f14606w) {
            case 0:
                return AbstractC3583c0.m10779O1(this.f14607x);
            case 1:
                return AbstractC3583c0.m10785Q1(this.f14607x);
            case 2:
                return AbstractC3583c0.m10784Q0(this.f14607x);
            case 3:
                return AbstractC3583c0.m10796U0(this.f14607x);
            default:
                return AbstractC3583c0.m10884r2(this.f14607x);
        }
    }
}
