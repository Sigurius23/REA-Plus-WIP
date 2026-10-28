package sc2;

import bh3.InterfaceC3255b;

/* JADX INFO: renamed from: sc2.r */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32379r implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133994w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32380s f133995x;

    public /* synthetic */ C32379r(C32380s c32380s, int i13) {
        this.f133994w = i13;
        this.f133995x = c32380s;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f133994w) {
            case 0:
                C32380s.m100841N0(this.f133995x, (Throwable) obj);
                break;
            case 1:
                C32380s.m100867b1(this.f133995x, (Throwable) obj);
                break;
            default:
                C32380s.m100833J0(this.f133995x, (Throwable) obj);
                break;
        }
    }
}
