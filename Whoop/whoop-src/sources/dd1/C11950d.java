package dd1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: dd1.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11950d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f39100w;

    public /* synthetic */ C11950d(int i13) {
        this.f39100w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f39100w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return C11951e.m32399w1(composer, iIntValue);
            case 1:
                return C11951e.m32377n2(composer, iIntValue);
            case 2:
                return C11951e.m32287D1(composer, iIntValue);
            case 3:
                return C11951e.m32382p1(composer, iIntValue);
            case 4:
                return C11951e.m32295H1(composer, iIntValue);
            case 5:
                return C11951e.m32397v1(composer, iIntValue);
            case 6:
                return C11951e.m32383p2(composer, iIntValue);
            case 7:
                return C11951e.m32285C1(composer, iIntValue);
            case 8:
                return C11951e.m32379o1(composer, iIntValue);
            case 9:
                return C11951e.m32317S1(composer, iIntValue);
            case 10:
                return C11952f.m32459e(composer, iIntValue);
            case 11:
                return C11952f.m32460f(composer, iIntValue);
            case 12:
                return C11953g.m32470n(composer, iIntValue);
            case 13:
                return C11953g.m32474r(composer, iIntValue);
            case 14:
                return C11953g.m32471o(composer, iIntValue);
            case 15:
                return C11953g.m32469m(composer, iIntValue);
            case 16:
                return C11953g.m32473q(composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C11953g.m32472p(composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C11956j.m32561b2(composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C11956j.m32526P2(composer, iIntValue);
            case 20:
                return C11956j.m32499G2(composer, iIntValue);
            case 21:
                return C11956j.m32591l2(composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C11956j.m32579h2(composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C11956j.m32484B2(composer, iIntValue);
            case 24:
                return C11956j.m32495F1(composer, iIntValue);
            case 25:
                return C11956j.m32618u2(composer, iIntValue);
            case 26:
                return C11956j.m32558a2(composer, iIntValue);
            case 27:
                return C11956j.m32502H2(composer, iIntValue);
            case 28:
                return C11956j.m32567d2(composer, iIntValue);
            default:
                return C11956j.m32498G1(composer, iIntValue);
        }
    }
}
