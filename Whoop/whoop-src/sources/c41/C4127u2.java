package c41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: c41.u2 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4127u2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16776w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4141w2 f16777x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f16778y;

    public /* synthetic */ C4127u2(C4141w2 c4141w2, int i13, int i14) {
        this.f16776w = i14;
        this.f16777x = c4141w2;
        this.f16778y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f16776w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC4134v2.m12809j(this.f16777x, this.f16778y, composer, iIntValue);
            case 1:
                return AbstractC4134v2.m12818s(this.f16777x, this.f16778y, composer, iIntValue);
            case 2:
                return AbstractC4134v2.m12811l(this.f16777x, this.f16778y, composer, iIntValue);
            default:
                return AbstractC4134v2.m12820u(this.f16777x, this.f16778y, composer, iIntValue);
        }
    }
}
