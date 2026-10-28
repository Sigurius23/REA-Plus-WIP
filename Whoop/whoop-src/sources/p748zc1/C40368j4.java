package p748zc1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import j71.C21395c;

/* JADX INFO: renamed from: zc1.j4 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40368j4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174319w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21395c f174320x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f174321y;

    public /* synthetic */ C40368j4(C21395c c21395c, int i13, int i14) {
        this.f174319w = i14;
        this.f174320x = c21395c;
        this.f174321y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f174319w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40379k4.m130176d(this.f174320x, this.f174321y, composer, iIntValue);
            default:
                return AbstractC40536z8.m131365d(this.f174320x, this.f174321y, composer, iIntValue);
        }
    }
}
