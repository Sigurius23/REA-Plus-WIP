package p292l1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import p294l3.C23285v0;
import p354o1.EnumC27362c0;
import p390p1.C28655q;
import p390p1.C28674u2;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: l1.z4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23215z4 {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f91921a = new C28674u2(new C23091f0(11));

    /* JADX INFO: renamed from: a */
    public static final C23285v0 m67162a(EnumC27362c0 enumC27362c0, Composer composer) {
        C23209y4 c23209y4 = (C23209y4) ((C28655q) composer).m87161k(f91921a);
        switch (enumC27362c0.ordinal()) {
            case 0:
                return c23209y4.f91879j;
            case 1:
                return c23209y4.f91880k;
            case 2:
                return c23209y4.f91881l;
            case 3:
                return c23209y4.f91870a;
            case 4:
                return c23209y4.f91871b;
            case 5:
                return c23209y4.f91872c;
            case 6:
                return c23209y4.f91873d;
            case 7:
                return c23209y4.f91874e;
            case 8:
                return c23209y4.f91875f;
            case 9:
                return c23209y4.f91882m;
            case 10:
                return c23209y4.f91883n;
            case 11:
                return c23209y4.f91884o;
            case 12:
                return c23209y4.f91876g;
            case 13:
                return c23209y4.f91877h;
            case 14:
                return c23209y4.f91878i;
            case 15:
                return c23209y4.f91894y;
            case 16:
                return c23209y4.f91895z;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return c23209y4.f91866A;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return c23209y4.f91885p;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return c23209y4.f91886q;
            case 20:
                return c23209y4.f91887r;
            case 21:
                return c23209y4.f91888s;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return c23209y4.f91889t;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return c23209y4.f91890u;
            case 24:
                return c23209y4.f91867B;
            case 25:
                return c23209y4.f91868C;
            case 26:
                return c23209y4.f91869D;
            case 27:
                return c23209y4.f91891v;
            case 28:
                return c23209y4.f91892w;
            case 29:
                return c23209y4.f91893x;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
