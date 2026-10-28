package rq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: rq2.z */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31758z implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131515w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31757y f131516x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f131517y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f131518z;

    public /* synthetic */ C31758z(C31757y c31757y, boolean z4, int i13, int i14) {
        this.f131515w = i14;
        this.f131516x = c31757y;
        this.f131517y = z4;
        this.f131518z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f131515w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31714a0.m98390i(this.f131516x, this.f131517y, this.f131518z, composer, iIntValue);
            default:
                return AbstractC31718c0.m98416w(this.f131516x, this.f131517y, this.f131518z, composer, iIntValue);
        }
    }
}
