package ao1;

import c93.InterfaceC4339a;
import java.util.Map;
import u82.C34648i;

/* JADX INFO: renamed from: ao1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1870e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7388w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Map f7389x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C34648i f7390y;

    public /* synthetic */ C1870e(Map map, C34648i c34648i, int i13) {
        this.f7388w = i13;
        this.f7389x = map;
        this.f7390y = c34648i;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f7388w) {
            case 0:
                return C1875j.m5604g1(this.f7389x, this.f7390y);
            case 1:
                return C1875j.m5573U0(this.f7389x, this.f7390y);
            default:
                return C1875j.m5632t0(this.f7389x, this.f7390y);
        }
    }
}
