package kotlin;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: at2.n0 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2019n0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8014w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f8015x;

    public /* synthetic */ C2019n0(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f8014w = i13;
        this.f8015x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8014w) {
            case 0:
                return AbstractC2021o0.m6313w(this.f8015x);
            case 1:
                return AbstractC2029s0.m6340w(this.f8015x);
            default:
                return AbstractC1997d1.m6148w(this.f8015x);
        }
    }
}
