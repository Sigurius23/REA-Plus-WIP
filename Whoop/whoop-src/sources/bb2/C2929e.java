package bb2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import iw0.AbstractC20992x;
import lf0.AbstractC23899b0;
import rs2.AbstractC31795a;
import uz1.AbstractC35436n;
import zq0.AbstractC40965f;

/* JADX INFO: renamed from: bb2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C2929e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11801w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f11802x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f11803y;

    public /* synthetic */ C2929e(boolean z4, int i13, int i14) {
        this.f11801w = i14;
        this.f11802x = z4;
        this.f11803y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f11801w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC2930f.m8544g(this.f11802x, this.f11803y, composer, iIntValue);
            case 1:
                return AbstractC20992x.m58363J1(this.f11802x, this.f11803y, composer, iIntValue);
            case 2:
                return AbstractC23899b0.m70212H(this.f11802x, this.f11803y, composer, iIntValue);
            case 3:
                return AbstractC31795a.m98729C(this.f11802x, this.f11803y, composer, iIntValue);
            case 4:
                return AbstractC35436n.m112489r(this.f11802x, this.f11803y, composer, iIntValue);
            case 5:
                return AbstractC40965f.m132981v(this.f11802x, this.f11803y, composer, iIntValue);
            default:
                return AbstractC40965f.m132978s(this.f11802x, this.f11803y, composer, iIntValue);
        }
    }
}
