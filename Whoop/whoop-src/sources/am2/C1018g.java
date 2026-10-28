package am2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ih2.AbstractC18527b;
import p706eo0.AbstractC13376g;
import p706eo0.Function0;
import p719m22.AbstractC24951f;
import p719m22.AbstractC42788s;
import p719m22.AbstractC42789u;
import sg2.AbstractC32471v;

/* JADX INFO: renamed from: am2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1018g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3812w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f3813x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f3814y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f3815z;

    public /* synthetic */ C1018g(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f3812w = i14;
        this.f3813x = interfaceC4339a;
        this.f3814y = interfaceC4339a2;
        this.f3815z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f3812w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC1026k.m2766g0(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 1:
                return Function0.m37669e(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 2:
                return AbstractC13376g.m37728y(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 3:
                return AbstractC18527b.m53714O(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 4:
                return AbstractC18527b.m53741v(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 5:
                return p714k80.Function0.m64023c(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 6:
                return p717lq2.Function0.m72264k(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 7:
                return p719m22.Function0.m73147j(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 8:
                return p719m22.Function0.m73145h(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 9:
                return AbstractC24951f.m73162j(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 10:
                return AbstractC42788s.m73246r(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 11:
                return AbstractC42789u.m73278o(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 12:
                return AbstractC42789u.m73276m(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 13:
                return p726ps0.Function0.m90139c(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 14:
                return p728ql2.Function0.m93266m(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            case 15:
                return p729qs0.Function0.m93732q(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
            default:
                return AbstractC32471v.m101450r(this.f3813x, this.f3814y, this.f3815z, composer, iIntValue);
        }
    }
}
