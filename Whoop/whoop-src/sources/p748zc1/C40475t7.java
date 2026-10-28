package p748zc1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: zc1.t7 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40475t7 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174421w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f174422x;

    public /* synthetic */ C40475t7(int i13, int i14) {
        this.f174421w = i14;
        this.f174422x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f174421w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40485u7.m130986o(this.f174422x, composer, iIntValue);
            case 1:
                return AbstractC40485u7.m130988q(this.f174422x, composer, iIntValue);
            case 2:
                return AbstractC40485u7.m130983l(this.f174422x, composer, iIntValue);
            case 3:
                return AbstractC40485u7.m130981j(this.f174422x, composer, iIntValue);
            case 4:
                return AbstractC40495v7.m131062c(this.f174422x, composer, iIntValue);
            case 5:
                return AbstractC40505w7.m131115c(this.f174422x, composer, iIntValue);
            case 6:
                return AbstractC40515x7.m131200c(this.f174422x, composer, iIntValue);
            case 7:
                return AbstractC40525y7.m131235f(this.f174422x, composer, iIntValue);
            case 8:
                return AbstractC40535z7.m131357v(this.f174422x, composer, iIntValue);
            case 9:
                return AbstractC40273a8.m129329c(this.f174422x, composer, iIntValue);
            case 10:
                return AbstractC40284b8.m129390e(this.f174422x, composer, iIntValue);
            case 11:
                return AbstractC40295c8.m129466c(this.f174422x, composer, iIntValue);
            case 12:
                return AbstractC40306d8.m129592e(this.f174422x, composer, iIntValue);
            case 13:
                return AbstractC40328f8.m129754I(this.f174422x, composer, iIntValue);
            case 14:
                return AbstractC40339g8.m129816c(this.f174422x, composer, iIntValue);
            case 15:
                return AbstractC40350h8.m129902c(this.f174422x, composer, iIntValue);
            case 16:
                return AbstractC40361i8.m130055q(this.f174422x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40372j8.m130130i(this.f174422x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40383k8.m130210e(this.f174422x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40394l8.m130246c(this.f174422x, composer, iIntValue);
            case 20:
                return AbstractC40405m8.m130386g(this.f174422x, composer, iIntValue);
            case 21:
                return AbstractC40416n8.m130465q(this.f174422x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40426o8.m130562c(this.f174422x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40446q8.m130719r(this.f174422x, composer, iIntValue);
            case 24:
                return AbstractC40446q8.m130717p(this.f174422x, composer, iIntValue);
            case 25:
                return AbstractC40456r8.m130794k(this.f174422x, composer, iIntValue);
            case 26:
                return AbstractC40466s8.m130854c(this.f174422x, composer, iIntValue);
            case 27:
                return AbstractC40476t8.m130890c(this.f174422x, composer, iIntValue);
            case 28:
                return AbstractC40486u8.m130992c(this.f174422x, composer, iIntValue);
            default:
                return AbstractC40496v8.m131065c(this.f174422x, composer, iIntValue);
        }
    }
}
