package ln1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import mn1.AbstractC25712c;
import p711j31.C21280k;

/* JADX INFO: renamed from: ln1.h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24530h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95698w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21280k f95699x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f95700y;

    public /* synthetic */ C24530h(C21280k c21280k, int i13, int i14) {
        this.f95698w = i14;
        this.f95699x = c21280k;
        this.f95700y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f95698w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC24533k.m71458l(this.f95699x, this.f95700y, composer, iIntValue);
            default:
                return AbstractC25712c.m75741z(this.f95699x, this.f95700y, composer, iIntValue);
        }
    }
}
