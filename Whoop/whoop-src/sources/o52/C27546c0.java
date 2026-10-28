package o52;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: o52.c0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27546c0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110883w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27548d0 f110884x;

    public /* synthetic */ C27546c0(C27548d0 c27548d0, int i13) {
        this.f110883w = i13;
        this.f110884x = c27548d0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f110883w) {
            case 0:
                return C27548d0.m83130e0(this.f110884x);
            case 1:
                return C27548d0.m83136k0(this.f110884x);
            default:
                return Double.valueOf(C27548d0.m83135j0(this.f110884x));
        }
    }
}
