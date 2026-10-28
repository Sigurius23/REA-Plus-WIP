package rq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: rq2.t */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31751t implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131477w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31749s f131478x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f131479y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f131480z;

    public /* synthetic */ C31751t(C31749s c31749s, boolean z4, int i13, int i14) {
        this.f131477w = i14;
        this.f131478x = c31749s;
        this.f131479y = z4;
        this.f131480z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f131477w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31753u.m98557e(this.f131478x, this.f131479y, this.f131480z, composer, iIntValue);
            default:
                return AbstractC31754v.m98562e(this.f131478x, this.f131479y, this.f131480z, composer, iIntValue);
        }
    }
}
