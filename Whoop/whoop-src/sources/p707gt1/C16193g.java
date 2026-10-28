package p707gt1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l72.AbstractC23408o;
import p719m22.AbstractC24955j;
import p727py0.Function0;
import p734sl0.AbstractC32656p1;

/* JADX INFO: renamed from: gt1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16193g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61496w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f61497x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f61498y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f61499z;

    public /* synthetic */ C16193g(InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f61496w = i15;
        this.f61497x = interfaceC4339a;
        this.f61498y = i13;
        this.f61499z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f61496w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return Function0.m45774e(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 1:
                return AbstractC23408o.m67819M(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 2:
                return AbstractC24955j.m73203u(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 3:
                return Function0.m90898X(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 4:
                return Function0.m90891Q(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 5:
                return Function0.m90938s0(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 6:
                return Function0.m90910e0(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 7:
                return Function0.m90924l0(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 8:
                return Function0.m90952z0(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 9:
                return AbstractC32656p1.m102146r(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 10:
                return p736sz0.Function0.m105273o(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            case 11:
                return p741vn1.Function0.m115219e(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
            default:
                return p746ye1.Function0.m126134e(this.f61497x, this.f61498y, this.f61499z, composer, iIntValue);
        }
    }
}
