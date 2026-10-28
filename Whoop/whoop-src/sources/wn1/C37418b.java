package wn1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: wn1.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C37418b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f160162E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f160163F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160164w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f160165x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f160166y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f160167z;

    public /* synthetic */ C37418b(float f13, boolean z4, int i13, float f14, int i14, int i15) {
        this.f160164w = i15;
        this.f160165x = f13;
        this.f160166y = z4;
        this.f160167z = i13;
        this.f160162E = f14;
        this.f160163F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f160164w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC37419c.m119782e(this.f160165x, this.f160166y, this.f160167z, this.f160162E, this.f160163F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC37420d.m119787e(this.f160165x, this.f160166y, this.f160167z, this.f160162E, this.f160163F, (Composer) obj, iIntValue2);
        }
    }
}
