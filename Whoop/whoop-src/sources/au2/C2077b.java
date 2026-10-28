package au2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: au2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2077b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8227w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2079d f8228x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f8229y;

    public /* synthetic */ C2077b(C2079d c2079d, int i13, int i14) {
        this.f8227w = i14;
        this.f8228x = c2079d;
        this.f8229y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f8227w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC2078c.m6571h(this.f8228x, this.f8229y, composer, iIntValue);
            case 1:
                return AbstractC2078c.m6572i(this.f8228x, this.f8229y, composer, iIntValue);
            default:
                return AbstractC2078c.m6575l(this.f8228x, this.f8229y, composer, iIntValue);
        }
    }
}
