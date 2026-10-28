package p748zc1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: zc1.p8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40436p8 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f174390E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174391w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f174392x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f174393y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f174394z;

    public /* synthetic */ C40436p8(int i13, int i14, int i15, String str, boolean z4) {
        this.f174391w = i15;
        this.f174392x = str;
        this.f174393y = z4;
        this.f174394z = i13;
        this.f174390E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f174391w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC40446q8.m130723v(this.f174392x, this.f174393y, this.f174394z, this.f174390E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40446q8.m130727z(this.f174392x, this.f174393y, this.f174394z, this.f174390E, (Composer) obj, iIntValue2);
        }
    }
}
