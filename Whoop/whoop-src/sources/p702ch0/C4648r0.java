package p702ch0;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: ch0.r0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4648r0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18936w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4642o0 f18937x;

    public /* synthetic */ C4648r0(C4642o0 c4642o0, int i13) {
        this.f18936w = i13;
        this.f18937x = c4642o0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f18936w) {
            case 0:
                return Integer.valueOf(AbstractC4646q0.i.m14616h(this.f18937x));
            case 1:
                return Float.valueOf(C4642o0.m14542K(this.f18937x));
            default:
                return Integer.valueOf(AbstractC4646q0.m14594i(this.f18937x));
        }
    }
}
