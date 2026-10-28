package xq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: xq2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C38549b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165882w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f165883x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f165884y;

    public /* synthetic */ C38549b(Object obj, int i13, int i14) {
        this.f165882w = i14;
        this.f165884y = obj;
        this.f165883x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f165882w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC38552c.m123536d((C38555d) this.f165884y, this.f165883x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC38583p.m123726c((C38579n) this.f165884y, this.f165883x, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC38597w.m123794c((C38593u) this.f165884y, this.f165883x, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC38576l0.m123691p((C38578m0) this.f165884y, this.f165883x, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC38586q0.m123755t((C38571j) this.f165884y, this.f165883x, (Composer) obj, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC38586q0.m123757v((C38573k) this.f165884y, this.f165883x, (Composer) obj, iIntValue6);
        }
    }
}
