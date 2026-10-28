package a41;

import c93.InterfaceC4339a;
import p409q0.AbstractC29701y;

/* JADX INFO: renamed from: a41.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0375k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1279w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC29701y f1280x;

    public /* synthetic */ C0375k(AbstractC29701y abstractC29701y, int i13) {
        this.f1279w = i13;
        this.f1280x = abstractC29701y;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iM1035h;
        switch (this.f1279w) {
            case 0:
                iM1035h = AbstractC0376l.a.m1035h(this.f1280x);
                break;
            default:
                iM1035h = AbstractC0376l.c.a.m1038h(this.f1280x);
                break;
        }
        return Integer.valueOf(iM1035h);
    }
}
