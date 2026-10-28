package p748zc1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: zc1.a5 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40270a5 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174172w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f174173x;

    public /* synthetic */ C40270a5(int i13, int i14) {
        this.f174172w = i14;
        this.f174173x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f174172w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40281b5.m129374c(this.f174173x, composer, iIntValue);
            case 1:
                return AbstractC40292c5.m129437C(this.f174173x, composer, iIntValue);
            case 2:
                return AbstractC40303d5.m129516c(this.f174173x, composer, iIntValue);
            case 3:
                return AbstractC40314e5.m129662g(this.f174173x, composer, iIntValue);
            case 4:
                return AbstractC40314e5.m129660e(this.f174173x, composer, iIntValue);
            case 5:
                return AbstractC40314e5.m129664i(this.f174173x, composer, iIntValue);
            case 6:
                return AbstractC40325f5.m129735e(this.f174173x, composer, iIntValue);
            case 7:
                return AbstractC40358i5.m129960V(this.f174173x, composer, iIntValue);
            case 8:
                return AbstractC40358i5.m129958T(this.f174173x, composer, iIntValue);
            case 9:
                return AbstractC40358i5.m129939A(this.f174173x, composer, iIntValue);
            case 10:
                return AbstractC40369j5.m130111u(this.f174173x, composer, iIntValue);
            case 11:
                return AbstractC40380k5.m130191m(this.f174173x, composer, iIntValue);
            case 12:
                return AbstractC40391l5.m130238c(this.f174173x, composer, iIntValue);
            case 13:
                return AbstractC40402m5.m130318z(this.f174173x, composer, iIntValue);
            case 14:
                return AbstractC40402m5.m130308p(this.f174173x, composer, iIntValue);
            case 15:
                return AbstractC40423o5.m130530B(this.f174173x, composer, iIntValue);
            case 16:
                return AbstractC40423o5.m130545o(this.f174173x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40433p5.m130603e(this.f174173x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40443q5.m130679c(this.f174173x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40453r5.m130756e(this.f174173x, composer, iIntValue);
            case 20:
                return AbstractC40463s5.m130838g(this.f174173x, composer, iIntValue);
            case 21:
                return AbstractC40483u5.m130964q(this.f174173x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40493v5.m131032c(this.f174173x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40503w5.m131090m(this.f174173x, composer, iIntValue);
            case 24:
                return AbstractC40513x5.m131188g(this.f174173x, composer, iIntValue);
            case 25:
                return AbstractC40533z5.m131318e(this.f174173x, composer, iIntValue);
            case 26:
                return AbstractC40304d6.m129534R(this.f174173x, composer, iIntValue);
            case 27:
                return AbstractC40304d6.m129532P(this.f174173x, composer, iIntValue);
            case 28:
                return AbstractC40315e6.m129667c(this.f174173x, composer, iIntValue);
            default:
                return AbstractC40326f6.m129738c(this.f174173x, composer, iIntValue);
        }
    }
}
