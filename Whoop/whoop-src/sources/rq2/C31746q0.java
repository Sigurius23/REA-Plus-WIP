package rq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: rq2.q0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31746q0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131467w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31744p0 f131468x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f131469y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f131470z;

    public /* synthetic */ C31746q0(C31744p0 c31744p0, boolean z4, int i13, int i14) {
        this.f131467w = i14;
        this.f131468x = c31744p0;
        this.f131469y = z4;
        this.f131470z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f131467w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31748r0.m98540h(this.f131468x, this.f131469y, this.f131470z, composer, iIntValue);
            default:
                return AbstractC31750s0.m98546c(this.f131468x, this.f131469y, this.f131470z, composer, iIntValue);
        }
    }
}
