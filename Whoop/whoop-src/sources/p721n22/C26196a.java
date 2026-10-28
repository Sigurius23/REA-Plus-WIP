package p721n22;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p748zc1.AbstractC40377k2;
import vt2.AbstractC36497f;

/* JADX INFO: renamed from: n22.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26196a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103905w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f103906x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f103907y;

    public /* synthetic */ C26196a(InterfaceC4351m interfaceC4351m, int i13, int i14) {
        this.f103905w = i14;
        this.f103906x = interfaceC4351m;
        this.f103907y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f103905w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return Function0.m77802g(this.f103906x, this.f103907y, composer, iIntValue);
            case 1:
                return AbstractC36497f.m116987u(this.f103906x, this.f103907y, composer, iIntValue);
            default:
                return AbstractC40377k2.m130169f(this.f103906x, this.f103907y, composer, iIntValue);
        }
    }
}
