package p748zc1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: zc1.l2 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40388l2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174337w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f174338x;

    public /* synthetic */ C40388l2(int i13, int i14) {
        this.f174337w = i14;
        this.f174338x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f174337w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40399m2.m130288c(this.f174338x, composer, iIntValue);
            case 1:
                return AbstractC40430p2.m130584f(this.f174338x, composer, iIntValue);
            case 2:
                return AbstractC40440q2.m130665e(this.f174338x, composer, iIntValue);
            case 3:
                return AbstractC40450r2.m130745c(this.f174338x, composer, iIntValue);
            case 4:
                return AbstractC40460s2.m130827g(this.f174338x, composer, iIntValue);
            case 5:
                return AbstractC40470t2.m130865c(this.f174338x, composer, iIntValue);
            case 6:
                return AbstractC40480u2.m130912c(this.f174338x, composer, iIntValue);
            case 7:
                return AbstractC40490v2.m131016n(this.f174338x, composer, iIntValue);
            case 8:
                return AbstractC40500w2.m131071c(this.f174338x, composer, iIntValue);
            case 9:
                return AbstractC40510x2.m131161c(this.f174338x, composer, iIntValue);
            case 10:
                return AbstractC40520y2.m131211c(this.f174338x, composer, iIntValue);
            case 11:
                return AbstractC40530z2.m131305c(this.f174338x, composer, iIntValue);
            case 12:
                return AbstractC40268a3.m129318c(this.f174338x, composer, iIntValue);
            case 13:
                return AbstractC40279b3.m129361c(this.f174338x, composer, iIntValue);
            case 14:
                return AbstractC40290c3.m129431c(this.f174338x, composer, iIntValue);
            case 15:
                return AbstractC40301d3.m129509g(this.f174338x, composer, iIntValue);
            case 16:
                return AbstractC40312e3.m129636k(this.f174338x, composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40323f3.m129716c(this.f174338x, composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40334g3.m129801c(this.f174338x, composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40345h3.m129868c(this.f174338x, composer, iIntValue);
            case 20:
                return AbstractC40356i3.m129929c(this.f174338x, composer, iIntValue);
            case 21:
                return AbstractC40367j3.m130090e(this.f174338x, composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40378k3.m130172c(this.f174338x, composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40389l3.m130226c(this.f174338x, composer, iIntValue);
            case 24:
                return AbstractC40400m3.m130292c(this.f174338x, composer, iIntValue);
            case 25:
                return AbstractC40411n3.m130437c(this.f174338x, composer, iIntValue);
            case 26:
                return AbstractC40421o3.m130518d(this.f174338x, composer, iIntValue);
            case 27:
                return AbstractC40431p3.m130593i(this.f174338x, composer, iIntValue);
            case 28:
                return AbstractC40441q3.m130669c(this.f174338x, composer, iIntValue);
            default:
                return AbstractC40451r3.m130748c(this.f174338x, composer, iIntValue);
        }
    }
}
