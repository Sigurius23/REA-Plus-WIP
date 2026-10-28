package bm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: bm2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3441g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13483w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3445h0 f13484x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f13485y;

    public /* synthetic */ C3441g(C3445h0 c3445h0, int i13, int i14) {
        this.f13483w = i14;
        this.f13484x = c3445h0;
        this.f13485y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f13483w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3447i.m10071f(this.f13484x, this.f13485y, composer, iIntValue);
            case 1:
                return AbstractC3447i.m10075j(this.f13484x, this.f13485y, composer, iIntValue);
            default:
                return AbstractC3447i.m10073h(this.f13484x, this.f13485y, composer, iIntValue);
        }
    }
}
