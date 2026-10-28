package am2;

import c93.InterfaceC4339a;
import gb1.AbstractC15689q;
import p329n0.C26068u;
import p698au1.AbstractC2072q;
import yd2.AbstractC39462d;

/* JADX INFO: renamed from: am2.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1020h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3825w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26068u f3826x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f3827y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f3828z;

    public /* synthetic */ C1020h(C26068u c26068u, String str, int i13, int i14) {
        this.f3825w = i14;
        this.f3826x = c26068u;
        this.f3827y = str;
        this.f3828z = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        boolean zM2760d0;
        switch (this.f3825w) {
            case 0:
                zM2760d0 = AbstractC1026k.m2760d0(this.f3826x, this.f3827y, this.f3828z);
                break;
            case 1:
                zM2760d0 = AbstractC1046w.m2989A(this.f3826x, this.f3827y, this.f3828z);
                break;
            case 2:
                zM2760d0 = AbstractC2072q.m6529O(this.f3826x, this.f3827y, this.f3828z);
                break;
            case 3:
                zM2760d0 = AbstractC15689q.m44143k(this.f3826x, this.f3827y, this.f3828z);
                break;
            default:
                zM2760d0 = AbstractC39462d.m126027o(this.f3826x, this.f3827y, this.f3828z);
                break;
        }
        return Boolean.valueOf(zM2760d0);
    }
}
