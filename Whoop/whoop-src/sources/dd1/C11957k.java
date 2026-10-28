package dd1;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: dd1.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11957k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f39227w;

    public /* synthetic */ C11957k(int i13) {
        this.f39227w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f39227w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return C11958l.m32781y1(composer, iIntValue);
            case 1:
                return C11958l.m32735b1(composer, iIntValue);
            case 2:
                return C11958l.m32728W0(composer, iIntValue);
            case 3:
                return C11958l.m32755l1(composer, iIntValue);
            case 4:
                return C11958l.m32729X0(composer, iIntValue);
            case 5:
                return C11958l.m32718Q0(composer, iIntValue);
            case 6:
                return C11958l.m32773u1(composer, iIntValue);
            case 7:
                return C11958l.m32706K0(composer, iIntValue);
            case 8:
                return C11958l.m32739d1(composer, iIntValue);
            case 9:
                return C11958l.m32727V0(composer, iIntValue);
            case 10:
                return C11958l.m32733a1(composer, iIntValue);
            case 11:
                return C11958l.m32724T0(composer, iIntValue);
            case 12:
                return C11958l.m32763p1(composer, iIntValue);
            case 13:
                return C11958l.m32722S0(composer, iIntValue);
            case 14:
                return C11958l.m32765q1(composer, iIntValue);
            case 15:
                return C11958l.m32712N0(composer, iIntValue);
            case 16:
                return C11958l.m32777w1(composer, iIntValue);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C11958l.m32700H0(composer, iIntValue);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C11958l.m32759n1(composer, iIntValue);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C11958l.m32769s1(composer, iIntValue);
            case 20:
                return C11958l.m32714O0(composer, iIntValue);
            case 21:
                return C11958l.m32716P0(composer, iIntValue);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C11958l.m32767r1(composer, iIntValue);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C11958l.m32710M0(composer, iIntValue);
            case 24:
                return C11958l.m32779x1(composer, iIntValue);
            case 25:
                return C11960n.m32890y0(composer, iIntValue);
            case 26:
                return C11960n.m32892z0(composer, iIntValue);
            case 27:
                return C11960n.m32888x0(composer, iIntValue);
            case 28:
                return C11960n.m32886w0(composer, iIntValue);
            default:
                return C11960n.m32843L0(composer, iIntValue);
        }
    }
}
