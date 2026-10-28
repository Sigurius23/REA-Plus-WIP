package p748zc1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: zc1.s3 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40461s3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174412w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f174413x;

    public /* synthetic */ C40461s3(int i13, int i14) {
        this.f174412w = i14;
        this.f174413x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f174412w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40471t3.m130871f(this.f174413x, composer, iIntValue);
            case 1:
                return AbstractC40481u3.m130932t(this.f174413x, composer, iIntValue);
            case 2:
                return AbstractC40481u3.m130930r(this.f174413x, composer, iIntValue);
            case 3:
                return AbstractC40491v3.m131026c(this.f174413x, composer, iIntValue);
            case 4:
                return AbstractC40501w3.m131074c(this.f174413x, composer, iIntValue);
            case 5:
                return AbstractC40511x3.m131170i(this.f174413x, composer, iIntValue);
            case 6:
                return AbstractC40521y3.m131214c(this.f174413x, composer, iIntValue);
            case 7:
                return AbstractC40531z3.m131308c(this.f174413x, composer, iIntValue);
            case 8:
                return AbstractC40269a4.m129321c(this.f174413x, composer, iIntValue);
            case 9:
                return AbstractC40280b4.m129364c(this.f174413x, composer, iIntValue);
            case 10:
                return AbstractC40291c4.m129434c(this.f174413x, composer, iIntValue);
            case 11:
                return AbstractC40302d4.m129512c(this.f174413x, composer, iIntValue);
            case 12:
                return AbstractC40313e4.m129652p(this.f174413x, composer, iIntValue);
            case 13:
                return AbstractC40346h4.m129899m(this.f174413x, composer, iIntValue);
            case 14:
                return AbstractC40357i4.m129932c(this.f174413x, composer, iIntValue);
            case 15:
                return AbstractC40379k4.m130178f(this.f174413x, composer, iIntValue);
            case 16:
                return AbstractC40390l4.m130229c(this.f174413x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40412n4.m130445e(this.f174413x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40422o4.m130527i(this.f174413x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40432p4.m130598c(this.f174413x, composer, iIntValue);
            case 20:
                return AbstractC40442q4.m130676g(this.f174413x, composer, iIntValue);
            case 21:
                return AbstractC40452r4.m130751c(this.f174413x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40462s4.m130830c(this.f174413x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40472t4.m130878c(this.f174413x, composer, iIntValue);
            case 24:
                return AbstractC40482u4.m130947o(this.f174413x, composer, iIntValue);
            case 25:
                return AbstractC40492v4.m131029c(this.f174413x, composer, iIntValue);
            case 26:
                return AbstractC40502w4.m131077c(this.f174413x, composer, iIntValue);
            case 27:
                return AbstractC40512x4.m131181k(this.f174413x, composer, iIntValue);
            case 28:
                return AbstractC40522y4.m131217c(this.f174413x, composer, iIntValue);
            default:
                return AbstractC40532z4.m131313e(this.f174413x, composer, iIntValue);
        }
    }
}
