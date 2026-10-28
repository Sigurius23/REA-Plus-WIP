package z72;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import kd1.AbstractC22403o;
import zd0.AbstractC40545b;

/* JADX INFO: renamed from: z72.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40159e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173290w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC22403o f173291x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f173292y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f173293z;

    public /* synthetic */ C40159e(AbstractC22403o abstractC22403o, float f13, int i13, int i14) {
        this.f173290w = i14;
        this.f173291x = abstractC22403o;
        this.f173292y = f13;
        this.f173293z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f173290w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40161g.m128793G(this.f173291x, this.f173292y, this.f173293z, composer, iIntValue);
            default:
                return AbstractC40545b.m131389n(this.f173291x, this.f173292y, this.f173293z, composer, iIntValue);
        }
    }
}
