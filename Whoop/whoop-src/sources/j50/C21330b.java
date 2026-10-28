package j50;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gz0.EnumC16313m0;
import p736sz0.AbstractC33164a1;
import p736sz0.AbstractC33166b0;

/* JADX INFO: renamed from: j50.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C21330b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81548w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EnumC16313m0 f81549x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f81550y;

    public /* synthetic */ C21330b(EnumC16313m0 enumC16313m0, int i13, int i14) {
        this.f81548w = i14;
        this.f81549x = enumC16313m0;
        this.f81550y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f81548w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC21331c.m59874n(this.f81549x, this.f81550y, composer, iIntValue);
            case 1:
                return AbstractC33166b0.m105055f(this.f81549x, this.f81550y, composer, iIntValue);
            default:
                return AbstractC33164a1.m105035i(this.f81549x, this.f81550y, composer, iIntValue);
        }
    }
}
