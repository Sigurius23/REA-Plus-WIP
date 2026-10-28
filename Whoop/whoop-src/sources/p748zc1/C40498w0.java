package p748zc1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: zc1.w0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40498w0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174427w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f174428x;

    public /* synthetic */ C40498w0(int i13, int i14) {
        this.f174427w = i14;
        this.f174428x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f174427w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40508x0.m131123e(this.f174428x, composer, iIntValue);
            case 1:
                return AbstractC40398m1.m130259E(this.f174428x, composer, iIntValue);
            case 2:
                return AbstractC40409n1.m130429u(this.f174428x, composer, iIntValue);
            case 3:
                return AbstractC40419o1.m130514c(this.f174428x, composer, iIntValue);
            case 4:
                return AbstractC40429p1.m130578c(this.f174428x, composer, iIntValue);
            case 5:
                return AbstractC40439q1.m130658c(this.f174428x, composer, iIntValue);
            case 6:
                return AbstractC40449r1.m130742c(this.f174428x, composer, iIntValue);
            case 7:
                return AbstractC40459s1.m130820c(this.f174428x, composer, iIntValue);
            case 8:
                return AbstractC40469t1.m130862c(this.f174428x, composer, iIntValue);
            case 9:
                return AbstractC40479u1.m130908c(this.f174428x, composer, iIntValue);
            case 10:
                return AbstractC40489v1.m130999c(this.f174428x, composer, iIntValue);
            case 11:
                return AbstractC40509x1.m131150r(this.f174428x, composer, iIntValue);
            case 12:
                return AbstractC40509x1.m131148p(this.f174428x, composer, iIntValue);
            case 13:
                return AbstractC40509x1.m131153u(this.f174428x, composer, iIntValue);
            case 14:
                return AbstractC40509x1.m131156x(this.f174428x, composer, iIntValue);
            case 15:
                return AbstractC40509x1.m131124A(this.f174428x, composer, iIntValue);
            case 16:
                return AbstractC40509x1.m131130G(this.f174428x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40509x1.m131127D(this.f174428x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40529z1.m131276R(this.f174428x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40529z1.m131269K(this.f174428x, composer, iIntValue);
            case 20:
                return AbstractC40278b2.m129358c(this.f174428x, composer, iIntValue);
            case 21:
                return AbstractC40289c2.m129426d(this.f174428x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40300d2.m129502c(this.f174428x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40311e2.m129625c(this.f174428x, composer, iIntValue);
            case 24:
                return AbstractC40322f2.m129710e(this.f174428x, composer, iIntValue);
            case 25:
                return AbstractC40333g2.m129798c(this.f174428x, composer, iIntValue);
            case 26:
                return AbstractC40344h2.m129865o(this.f174428x, composer, iIntValue);
            case 27:
                return AbstractC40355i2.m129926c(this.f174428x, composer, iIntValue);
            case 28:
                return AbstractC40366j2.m130085c(this.f174428x, composer, iIntValue);
            default:
                return AbstractC40377k2.m130167d(this.f174428x, composer, iIntValue);
        }
    }
}
