package p748zc1;

import androidx.health.platform.client.proto.C1533u;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import w81.EnumC36946d;

/* JADX INFO: renamed from: zc1.n5 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40413n5 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174370w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f174371x;

    public /* synthetic */ C40413n5(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f174370w = i13;
        this.f174371x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f174370w) {
            case 0:
                return AbstractC40423o5.m130546p(this.f174371x, ((Integer) obj).intValue());
            case 1:
                return AbstractC40423o5.m130551u(this.f174371x, ((Integer) obj).intValue());
            case 2:
                return AbstractC40423o5.m130553w(this.f174371x, ((Integer) obj).intValue());
            case 3:
                return AbstractC40503w5.m131085h(this.f174371x, ((Integer) obj).intValue());
            case 4:
                return AbstractC40503w5.m131086i(this.f174371x, (EnumC36946d) obj);
            case 5:
                return AbstractC40513x5.m131187f(this.f174371x, ((Integer) obj).intValue());
            case 6:
                return AbstractC40304d6.m129517A(this.f174371x, (Integer) obj);
            case 7:
                return AbstractC40304d6.m129519C(this.f174371x, ((Boolean) obj).booleanValue());
            case 8:
                return AbstractC40304d6.m129524H(this.f174371x, ((Boolean) obj).booleanValue());
            case 9:
                return AbstractC40504w6.m131104n(this.f174371x, ((Boolean) obj).booleanValue());
            case 10:
                return AbstractC40504w6.m131105o(this.f174371x, ((Boolean) obj).booleanValue());
            case 11:
                return AbstractC40504w6.m131106p(this.f174371x, ((Boolean) obj).booleanValue());
            case 12:
                return AbstractC40504w6.m131107q(this.f174371x, ((Boolean) obj).booleanValue());
            case 13:
                return AbstractC40524y6.m131227g(this.f174371x, obj);
            case 14:
                return AbstractC40524y6.m131228h(this.f174371x, ((Boolean) obj).booleanValue());
            case 15:
                return AbstractC40435p7.m130640r(this.f174371x, ((Float) obj).floatValue());
            case 16:
                return AbstractC40435p7.m130637o(this.f174371x, ((Float) obj).floatValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40435p7.m130635m(this.f174371x, ((Float) obj).floatValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40435p7.m130642t(this.f174371x, ((Float) obj).floatValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40435p7.m130639q(this.f174371x, ((Float) obj).floatValue());
            case 20:
                return AbstractC40445q7.m130699i(this.f174371x, (String) obj);
            case 21:
                return AbstractC40445q7.m130700j(this.f174371x, (String) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40535z7.m131351p(this.f174371x, ((Integer) obj).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40535z7.m131352q(this.f174371x, ((Integer) obj).intValue());
            case 24:
                return AbstractC40535z7.m131353r(this.f174371x, ((Integer) obj).intValue());
            case 25:
                return AbstractC40535z7.m131354s(this.f174371x, ((Integer) obj).intValue());
            case 26:
                return AbstractC40535z7.m131355t(this.f174371x, ((Integer) obj).intValue());
            case 27:
                return AbstractC40535z7.m131356u(this.f174371x, ((Integer) obj).intValue());
            case 28:
                return AbstractC40328f8.m129753H(this.f174371x, ((Boolean) obj).booleanValue());
            default:
                return AbstractC40328f8.m129750E(this.f174371x, ((Boolean) obj).booleanValue());
        }
    }
}
