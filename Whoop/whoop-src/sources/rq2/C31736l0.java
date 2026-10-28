package rq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: rq2.l0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31736l0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131441w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31734k0 f131442x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f131443y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f131444z;

    public /* synthetic */ C31736l0(C31734k0 c31734k0, boolean z4, int i13, int i14) {
        this.f131441w = i14;
        this.f131442x = c31734k0;
        this.f131443y = z4;
        this.f131444z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f131441w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31738m0.m98498e(this.f131442x, this.f131443y, this.f131444z, composer, iIntValue);
            default:
                return AbstractC31740n0.m98509e(this.f131442x, this.f131443y, this.f131444z, composer, iIntValue);
        }
    }
}
