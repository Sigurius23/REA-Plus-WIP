package p748zc1;

import androidx.health.platform.client.proto.C1533u;
import p390p1.InterfaceC28601c1;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import zq2.AbstractC40996i;
import zq2.AbstractC40998k;
import zv2.AbstractC41169e;

/* JADX INFO: renamed from: zc1.e8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40317e8 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174243w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f174244x;

    public /* synthetic */ C40317e8(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f174243w = i13;
        this.f174244x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f174243w) {
            case 0:
                return AbstractC40328f8.m129779y(this.f174244x, ((Boolean) obj).booleanValue());
            case 1:
                return AbstractC40328f8.m129747B(this.f174244x, ((Boolean) obj).booleanValue());
            case 2:
                return AbstractC40328f8.m129774t(this.f174244x, (String) obj);
            case 3:
                return AbstractC40328f8.m129776v(this.f174244x, (String) obj);
            case 4:
                return AbstractC40446q8.m130725x(this.f174244x, ((Boolean) obj).booleanValue());
            case 5:
                return AbstractC40446q8.m130726y(this.f174244x, ((Boolean) obj).booleanValue());
            case 6:
                return AbstractC40446q8.m130721t(this.f174244x, ((Boolean) obj).booleanValue());
            case 7:
                return AbstractC40446q8.m130722u(this.f174244x, ((Boolean) obj).booleanValue());
            case 8:
                return AbstractC40296c9.m129484r(this.f174244x, obj);
            case 9:
                return AbstractC40296c9.m129487u(this.f174244x, obj);
            case 10:
                return AbstractC40296c9.m129476j(this.f174244x, obj);
            case 11:
                return AbstractC40296c9.m129479m(this.f174244x, obj);
            case 12:
                return AbstractC40296c9.m129482p(this.f174244x, obj);
            case 13:
                return AbstractC40996i.m133154t(this.f174244x, (String) obj);
            case 14:
                return AbstractC40996i.m133160z(this.f174244x, (C39180l) obj);
            case 15:
                return AbstractC40996i.m133125B(this.f174244x, (String) obj);
            case 16:
                return AbstractC40996i.m133127D(this.f174244x, (String) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40998k.m133188r(this.f174244x, (String) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40998k.m133194x(this.f174244x, (C39180l) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40998k.m133196z(this.f174244x, (String) obj);
            case 20:
                return AbstractC40998k.m133164B(this.f174244x, (String) obj);
            case 21:
                return AbstractC41169e.m133753t(this.f174244x, (String) obj);
            default:
                return AbstractC41169e.m133754u(this.f174244x, (String) obj);
        }
    }
}
