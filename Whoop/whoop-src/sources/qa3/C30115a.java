package qa3;

import androidx.health.platform.client.proto.C1533u;
import ta3.C33676b;
import ta3.C33678d;
import ta3.C33680f;
import ta3.C33684j;
import ta3.C33685k;
import wa3.AbstractC36986c;
import wa3.C36992f;
import wa3.C36998i;

/* JADX INFO: renamed from: qa3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C30115a extends AbstractC36986c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f122966a;

    public /* synthetic */ C30115a(int i13) {
        this.f122966a = i13;
    }

    @Override // wa3.InterfaceC37021x
    /* JADX INFO: renamed from: a */
    public final Object mo92259a(C36992f c36992f, C36998i c36998i) {
        switch (this.f122966a) {
            case 0:
                return new C30136h(c36992f, c36998i);
            case 1:
                return new C30130f(c36992f, c36998i);
            case 2:
                return new C30127e(c36992f, c36998i);
            case 3:
                return new C30145k(c36992f, c36998i);
            case 4:
                return new C30154o(c36992f, c36998i);
            case 5:
                return new C30158q(c36992f, c36998i);
            case 6:
                return new C30172x(c36992f, c36998i);
            case 7:
                return new C30122c0(c36992f, c36998i);
            case 8:
                return new C30134g0(c36992f, c36998i);
            case 9:
                return new C30140i0(c36992f, c36998i);
            case 10:
                return new C30146k0(c36992f, c36998i);
            case 11:
                return new C30157p0(c36992f, c36998i);
            case 12:
                return new C30155o0(c36992f);
            case 13:
                return new C30161r0(c36992f);
            case 14:
                return new C30171w0(c36992f, c36998i);
            case 15:
                return new C30167u0(c36992f, c36998i);
            case 16:
                return new C30120b1(c36992f, c36998i);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C30123c1(c36992f, c36998i);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C30129e1(c36992f, c36998i);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C30141i1(c36992f);
            case 20:
                return new C30144j1(c36992f, c36998i);
            case 21:
                return new C33676b(c36992f);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C33678d(c36992f);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C33680f(c36992f, c36998i);
            case 24:
                return new C33685k(c36992f, c36998i);
            default:
                return new C33684j(c36992f);
        }
    }
}
