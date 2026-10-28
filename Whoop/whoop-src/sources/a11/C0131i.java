package a11;

import androidx.compose.runtime.Composer;
import bp0.AbstractC3531s;
import c93.InterfaceC4351m;
import ht2.AbstractC17633e;
import p736sz0.AbstractC33199m0;
import p741vn1.AbstractC36209m;
import vy0.AbstractC36578h0;

/* JADX INFO: renamed from: a11.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0131i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f389w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f390x;

    public /* synthetic */ C0131i(int i13, int i14) {
        this.f389w = i14;
        this.f390x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f389w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC0139q.m334v(this.f390x, composer, iIntValue);
            case 1:
                return AbstractC0139q.m306Q(this.f390x, composer, iIntValue);
            case 2:
                return AbstractC3531s.m10433M0(this.f390x, composer, iIntValue);
            case 3:
                return AbstractC17633e.m50197E(this.f390x, composer, iIntValue);
            case 4:
                return AbstractC33199m0.m105247y(this.f390x, composer, iIntValue);
            case 5:
                return AbstractC33199m0.m105209A(this.f390x, composer, iIntValue);
            case 6:
                return AbstractC36209m.m115231h(this.f390x, composer, iIntValue);
            case 7:
                return AbstractC36578h0.m117368z(this.f390x, composer, iIntValue);
            case 8:
                return AbstractC36578h0.m117358p(this.f390x, composer, iIntValue);
            case 9:
                return AbstractC36578h0.m117360r(this.f390x, composer, iIntValue);
            default:
                return AbstractC36578h0.m117366x(this.f390x, composer, iIntValue);
        }
    }
}
