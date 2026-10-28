package rq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: rq2.f0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31724f0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131424w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31722e0 f131425x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f131426y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f131427z;

    public /* synthetic */ C31724f0(C31722e0 c31722e0, boolean z4, int i13, int i14) {
        this.f131424w = i14;
        this.f131425x = c31722e0;
        this.f131426y = z4;
        this.f131427z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f131424w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31726g0.m98453e(this.f131425x, this.f131426y, this.f131427z, composer, iIntValue);
            default:
                return AbstractC31730i0.m98475g(this.f131425x, this.f131426y, this.f131427z, composer, iIntValue);
        }
    }
}
