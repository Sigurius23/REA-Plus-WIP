package p748zc1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: zc1.g6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40337g6 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174270w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f174271x;

    public /* synthetic */ C40337g6(int i13, int i14) {
        this.f174270w = i14;
        this.f174271x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f174270w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40359i6.m130010q(this.f174271x, composer, iIntValue);
            case 1:
                return AbstractC40370j6.m130114c(this.f174271x, composer, iIntValue);
            case 2:
                return AbstractC40381k6.m130194c(this.f174271x, composer, iIntValue);
            case 3:
                return AbstractC40403m6.m130347a0(this.f174271x, composer, iIntValue);
            case 4:
                return AbstractC40434p6.m130622s(this.f174271x, composer, iIntValue);
            case 5:
                return AbstractC40444q6.m130690k(this.f174271x, composer, iIntValue);
            case 6:
                return AbstractC40454r6.m130759c(this.f174271x, composer, iIntValue);
            case 7:
                return AbstractC40464s6.m130841c(this.f174271x, composer, iIntValue);
            case 8:
                return AbstractC40474t6.m130887i(this.f174271x, composer, iIntValue);
            case 9:
                return AbstractC40484u6.m130971g(this.f174271x, composer, iIntValue);
            case 10:
                return AbstractC40494v6.m131033A(this.f174271x, composer, iIntValue);
            case 11:
                return AbstractC40504w6.m131108r(this.f174271x, composer, iIntValue);
            case 12:
                return AbstractC40514x6.m131197i(this.f174271x, composer, iIntValue);
            case 13:
                return AbstractC40524y6.m131229i(this.f174271x, composer, iIntValue);
            case 14:
                return AbstractC40534z6.m131334o(this.f174271x, composer, iIntValue);
            case 15:
                return AbstractC40272a7.m129326e(this.f174271x, composer, iIntValue);
            case 16:
                return AbstractC40283b7.m129385k(this.f174271x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40305d7.m129587m(this.f174271x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40327f7.m129745g(this.f174271x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40338g7.m129813k(this.f174271x, composer, iIntValue);
            case 20:
                return AbstractC40360i7.m130038s(this.f174271x, composer, iIntValue);
            case 21:
                return AbstractC40371j7.m130121g(this.f174271x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40382k7.m130205k(this.f174271x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40393l7.m130243e(this.f174271x, composer, iIntValue);
            case 24:
                return AbstractC40404m7.m130379c(this.f174271x, composer, iIntValue);
            case 25:
                return AbstractC40415n7.m130448c(this.f174271x, composer, iIntValue);
            case 26:
                return AbstractC40425o7.m130559c(this.f174271x, composer, iIntValue);
            case 27:
                return AbstractC40435p7.m130643u(this.f174271x, composer, iIntValue);
            case 28:
                return AbstractC40445q7.m130701k(this.f174271x, composer, iIntValue);
            default:
                return AbstractC40465s7.m130851c(this.f174271x, composer, iIntValue);
        }
    }
}
