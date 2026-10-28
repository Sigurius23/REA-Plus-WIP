package d41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ep1.AbstractC13409d;
import ep1.AbstractC13427v;
import kd1.AbstractC22403o;
import l01.AbstractC23035g;
import p722ne2.Function1;
import p736sz0.AbstractC33199m0;
import s32.AbstractC32111c;
import u01.AbstractC34382d;
import u51.AbstractC34544c;
import vs2.AbstractC36479e;
import w11.AbstractC36695b;
import xi2.AbstractC38324b;
import yt2.AbstractC39780k;
import z50.AbstractC40088d;

/* JADX INFO: renamed from: d41.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11678d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37753w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC22403o f37754x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f37755y;

    public /* synthetic */ C11678d(AbstractC22403o abstractC22403o, int i13, int i14) {
        this.f37753w = i14;
        this.f37754x = abstractC22403o;
        this.f37755y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f37753w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC11679e.m31095A(this.f37754x, this.f37755y, composer, iIntValue);
            case 1:
                return AbstractC11679e.m31104J(this.f37754x, this.f37755y, composer, iIntValue);
            case 2:
                return AbstractC13409d.m37916m(this.f37754x, this.f37755y, composer, iIntValue);
            case 3:
                return AbstractC13427v.m38103m(this.f37754x, this.f37755y, composer, iIntValue);
            case 4:
                return AbstractC23035g.m66822h(this.f37754x, this.f37755y, composer, iIntValue);
            case 5:
                return Function1.m79141w(this.f37754x, this.f37755y, composer, iIntValue);
            case 6:
                return AbstractC32111c.m99942k(this.f37754x, this.f37755y, composer, iIntValue);
            case 7:
                return AbstractC33199m0.m105244v(this.f37754x, this.f37755y, composer, iIntValue);
            case 8:
                return AbstractC34382d.m108695l(this.f37754x, this.f37755y, composer, iIntValue);
            case 9:
                return AbstractC34544c.m109165i(this.f37754x, this.f37755y, composer, iIntValue);
            case 10:
                return AbstractC34544c.m109166j(this.f37754x, this.f37755y, composer, iIntValue);
            case 11:
                return AbstractC36479e.m116853O(this.f37754x, this.f37755y, composer, iIntValue);
            case 12:
                return AbstractC36695b.m117780q(this.f37754x, this.f37755y, composer, iIntValue);
            case 13:
                return AbstractC38324b.m122826i(this.f37754x, this.f37755y, composer, iIntValue);
            case 14:
                return AbstractC39780k.m127416u(this.f37754x, this.f37755y, composer, iIntValue);
            case 15:
                return AbstractC40088d.m128497p(this.f37754x, this.f37755y, composer, iIntValue);
            default:
                return AbstractC40088d.m128498q(this.f37754x, this.f37755y, composer, iIntValue);
        }
    }
}
