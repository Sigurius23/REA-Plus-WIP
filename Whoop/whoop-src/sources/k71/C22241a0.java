package k71;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import kd1.AbstractC22413y;
import l31.AbstractC23310d;
import l31.AbstractC23313g;
import l31.AbstractC23314h;
import l31.AbstractC23315i;
import l31.AbstractC23321o;
import lg2.AbstractC24038c;
import p714k80.AbstractC22289r;
import p714k80.AbstractC22290s;
import p719m22.AbstractC24949d;
import p719m22.AbstractC24955j;
import p719m22.AbstractC42785i;
import p719m22.AbstractC42788s;
import p719m22.AbstractC42789u;

/* JADX INFO: renamed from: k71.a0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22241a0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f86719w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f86720x;

    public /* synthetic */ C22241a0(int i13, int i14) {
        this.f86719w = i14;
        this.f86720x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f86719w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC22243b0.m63785m(this.f86720x, composer, iIntValue);
            case 1:
                return AbstractC22289r.m64036c(this.f86720x, composer, iIntValue);
            case 2:
                return AbstractC22290s.m64041e(this.f86720x, composer, iIntValue);
            case 3:
                return AbstractC22413y.m64549j(this.f86720x, composer, iIntValue);
            case 4:
                return AbstractC22413y.m64546g(this.f86720x, composer, iIntValue);
            case 5:
                return AbstractC23310d.m67398c(this.f86720x, composer, iIntValue);
            case 6:
                return AbstractC23313g.m67468x(this.f86720x, composer, iIntValue);
            case 7:
                return AbstractC23313g.m67441J(this.f86720x, composer, iIntValue);
            case 8:
                return AbstractC23313g.m67435D(this.f86720x, composer, iIntValue);
            case 9:
                return AbstractC23313g.m67464t(this.f86720x, composer, iIntValue);
            case 10:
                return AbstractC23313g.m67470z(this.f86720x, composer, iIntValue);
            case 11:
                return AbstractC23313g.m67433B(this.f86720x, composer, iIntValue);
            case 12:
                return AbstractC23313g.m67466v(this.f86720x, composer, iIntValue);
            case 13:
                return AbstractC23313g.m67460p(this.f86720x, composer, iIntValue);
            case 14:
                return AbstractC23313g.m67458n(this.f86720x, composer, iIntValue);
            case 15:
                return AbstractC23313g.m67439H(this.f86720x, composer, iIntValue);
            case 16:
                return AbstractC23313g.m67462r(this.f86720x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC23313g.m67437F(this.f86720x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC23314h.m67473c(this.f86720x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23315i.m67492s(this.f86720x, composer, iIntValue);
            case 20:
                return AbstractC23321o.m67519c(this.f86720x, composer, iIntValue);
            case 21:
                return AbstractC24038c.m70931r(this.f86720x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC24949d.m73124m(this.f86720x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC42785i.m73176i(this.f86720x, composer, iIntValue);
            case 24:
                return AbstractC42785i.m73174g(this.f86720x, composer, iIntValue);
            case 25:
                return AbstractC24955j.m73191i(this.f86720x, composer, iIntValue);
            case 26:
                return AbstractC24955j.m73193k(this.f86720x, composer, iIntValue);
            case 27:
                return AbstractC42788s.m73225A(this.f86720x, composer, iIntValue);
            case 28:
                return AbstractC42789u.m73282s(this.f86720x, composer, iIntValue);
            default:
                return AbstractC42789u.m73280q(this.f86720x, composer, iIntValue);
        }
    }
}
