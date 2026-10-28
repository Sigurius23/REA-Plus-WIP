package al1;

import c93.InterfaceC4339a;
import zk1.AbstractC40837a;

/* JADX INFO: renamed from: al1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0981b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3598w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0982c f3599x;

    public /* synthetic */ C0981b(C0982c c0982c, int i13) {
        this.f3598w = i13;
        this.f3599x = c0982c;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f3598w) {
            case 0:
                return C0982c.m2673p(this.f3599x);
            default:
                return AbstractC40837a.m132344p(this.f3599x);
        }
    }
}
