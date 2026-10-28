package q81;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import p729qs0.Function0;
import p730qt2.AbstractC30604j;
import p734sl0.AbstractC32656p1;
import p735ss0.Function1;
import p736sz0.AbstractC33166b0;
import p736sz0.AbstractC33181g0;
import p736sz0.AbstractC33191j1;
import p736sz0.AbstractC33195l;
import p736sz0.AbstractC33219t;
import p738tv0.AbstractC34204d;
import r61.AbstractC30984g;
import s01.AbstractC32050f;
import s11.AbstractC32066b;
import s32.AbstractC32111c;
import s50.AbstractC32201c;
import st1.AbstractC32991l;
import sx0.AbstractC33059a;
import t11.AbstractC33305e;
import tj1.AbstractC33868c;
import u11.AbstractC34443i;
import v01.AbstractC35510l;
import v21.AbstractC35584b;

/* JADX INFO: renamed from: q81.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C30048f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122646w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f122647x;

    public /* synthetic */ C30048f(int i13, int i14) {
        this.f122646w = i14;
        this.f122647x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f122646w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC30049g.m92055x(this.f122647x, composer, iIntValue);
            case 1:
                return Function0.m93724i(this.f122647x, composer, iIntValue);
            case 2:
                return AbstractC30604j.m93898g(this.f122647x, composer, iIntValue);
            case 3:
                return AbstractC30604j.m93905n(this.f122647x, composer, iIntValue);
            case 4:
                return AbstractC30604j.m93901j(this.f122647x, composer, iIntValue);
            case 5:
                return AbstractC30604j.m93903l(this.f122647x, composer, iIntValue);
            case 6:
                return AbstractC30984g.m95375f(this.f122647x, composer, iIntValue);
            case 7:
                return AbstractC32050f.m99614r(this.f122647x, composer, iIntValue);
            case 8:
                return AbstractC32066b.m99644k(this.f122647x, composer, iIntValue);
            case 9:
                return AbstractC32066b.m99648o(this.f122647x, composer, iIntValue);
            case 10:
                return AbstractC32066b.m99646m(this.f122647x, composer, iIntValue);
            case 11:
                return AbstractC32111c.m99947p(this.f122647x, composer, iIntValue);
            case 12:
                return AbstractC32201c.m100156k(this.f122647x, composer, iIntValue);
            case 13:
                return AbstractC32656p1.m102128G(this.f122647x, composer, iIntValue);
            case 14:
                return Function1.m104020f(this.f122647x, composer, iIntValue);
            case 15:
                return AbstractC32991l.m104149A(this.f122647x, composer, iIntValue);
            case 16:
                return AbstractC33059a.m104688p(this.f122647x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC33195l.m105199j(this.f122647x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC33219t.m105386f(this.f122647x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC33166b0.m105057h(this.f122647x, composer, iIntValue);
            case 20:
                return AbstractC33181g0.m105143w(this.f122647x, composer, iIntValue);
            case 21:
                return AbstractC33181g0.m105141u(this.f122647x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC33191j1.m105175h(this.f122647x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC33305e.m105657z(this.f122647x, composer, iIntValue);
            case 24:
                return AbstractC33868c.m107097c(this.f122647x, composer, iIntValue);
            case 25:
                return AbstractC34204d.m108118c(this.f122647x, composer, iIntValue);
            case 26:
                return AbstractC34443i.m108824I(this.f122647x, composer, iIntValue);
            case 27:
                return AbstractC34443i.m108875q0(this.f122647x, composer, iIntValue);
            case 28:
                return AbstractC35510l.m112633I(this.f122647x, composer, iIntValue);
            default:
                return AbstractC35584b.m112787n(this.f122647x, composer, iIntValue);
        }
    }
}
