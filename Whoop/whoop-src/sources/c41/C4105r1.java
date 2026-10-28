package c41;

import c93.InterfaceC4339a;
import hy0.AbstractC17746g1;
import is0.AbstractC20889j0;
import vt2.AbstractC36497f;
import zv2.AbstractC41169e;

/* JADX INFO: renamed from: c41.r1 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4105r1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16660w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f16661x;

    public /* synthetic */ C4105r1(boolean z4, int i13) {
        this.f16660w = i13;
        this.f16661x = z4;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f16660w) {
            case 0:
                return Integer.valueOf(AbstractC4133v1.m12792t(this.f16661x));
            case 1:
                return AbstractC17746g1.m50875k(this.f16661x);
            case 2:
                return AbstractC20889j0.m57734D(this.f16661x);
            case 3:
                return AbstractC36497f.m116990x(this.f16661x);
            default:
                return AbstractC41169e.m133727D(this.f16661x);
        }
    }
}
