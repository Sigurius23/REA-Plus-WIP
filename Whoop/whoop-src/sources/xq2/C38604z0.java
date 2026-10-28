package xq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: xq2.z0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C38604z0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f166088w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38566g1 f166089x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f166090y;

    public /* synthetic */ C38604z0(C38566g1 c38566g1, int i13, int i14) {
        this.f166088w = i14;
        this.f166089x = c38566g1;
        this.f166090y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f166088w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC38554c1.m123549C(this.f166089x, this.f166090y, composer, iIntValue);
            default:
                return AbstractC38554c1.m123554H(this.f166089x, this.f166090y, composer, iIntValue);
        }
    }
}
