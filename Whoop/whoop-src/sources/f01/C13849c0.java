package f01;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import fe0.AbstractC14415e;
import fg2.AbstractC14472n;
import fo2.AbstractC14665c;
import gz0.AbstractC16306j;
import h00.AbstractC16517n0;
import h00.AbstractC16518o;
import h02.AbstractC16575h0;
import h20.EnumC16701n1;
import h21.AbstractC16779c;
import h41.AbstractC16848b;
import he1.AbstractC17212a;
import hy0.AbstractC17725b0;
import hy0.AbstractC17770n;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p707gt1.AbstractC16188b;
import p707gt1.AbstractC16195i;
import p708hb2.Function0;

/* JADX INFO: renamed from: f01.c0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13849c0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49398w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f49399x;

    public /* synthetic */ C13849c0(byte b, int i13, int i14) {
        this.f49398w = i14;
        this.f49399x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f49398w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i14 = this.f49399x;
        switch (i13) {
            case 0:
                return AbstractC13852d0.m39240k(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC13861g0.m39298h(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC13882n0.m39440x(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC13900t0.m39560l(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 4:
                return AbstractC13908w0.m39612j(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return AbstractC13874k1.m39347l(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 6:
                return AbstractC13886o1.m39480q(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return AbstractC14415e.m41085Z(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC14472n.m41308m(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AbstractC14665c.m41898l(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                return AbstractC16188b.m45752o(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 11:
                return AbstractC16195i.m45777c(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return AbstractC16306j.m46275q(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 13:
                EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
                ((Integer) obj2).getClass();
                AbstractC16518o.m46680d((Composer) obj, AbstractC28683x.m87244L(i14 | 1));
                return c23454a0;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC16518o.m46678b(i14, (Composer) obj, AbstractC28683x.m87244L(1));
                return c23454a0;
            case 15:
                ((Integer) obj2).getClass();
                AbstractC16517n0.m46674c((Composer) obj, AbstractC28683x.m87244L(i14 | 1));
                return c23454a0;
            case 16:
                return AbstractC16575h0.m46983s(i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC16779c.m47317y(i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC16779c.m47289A(i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC16848b.m47462n(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return Function0.m48272k(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return AbstractC17212a.m48625N(i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC17770n.m50979G(i14, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC17770n.m50992T(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return AbstractC17770n.m50998Z(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return AbstractC17770n.m50994V(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return AbstractC17770n.m51002b0(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC17770n.m50996X(i14, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return AbstractC17725b0.m50782s(i14, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC17725b0.m50780q(i14, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C13849c0(int i13) {
        this.f49398w = 13;
        EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
        this.f49399x = i13;
    }

    public /* synthetic */ C13849c0(int i13, int i14) {
        this.f49398w = 14;
        this.f49399x = i13;
    }
}
