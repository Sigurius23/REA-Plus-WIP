package ng3;

import com.squareup.wire.AbstractC5583n;
import java.util.HashMap;
import jg3.C21677d;
import kg3.AbstractC22465d;
import kg3.C22466e;
import lg3.EnumC24059u;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: renamed from: ng3.e */
/* JADX INFO: loaded from: classes3.dex */
public final enum C26692e extends EnumC26694g {
    public C26692e() {
        super("WEEK_OF_WEEK_BASED_YEAR", 2);
    }

    @Override // ng3.EnumC26694g, ng3.InterfaceC26700m
    /* JADX INFO: renamed from: a */
    public final C26706s mo79389a(InterfaceC26698k interfaceC26698k) {
        if (interfaceC26698k.mo60986a(this)) {
            return EnumC26694g.m79400i(C21677d.m61002q0(interfaceC26698k));
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: b */
    public final boolean mo79390b(InterfaceC26698k interfaceC26698k) {
        return interfaceC26698k.mo60986a(EnumC26688a.EPOCH_DAY) && AbstractC22465d.m64906a(interfaceC26698k).equals(C22466e.f88015w);
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: c */
    public final InterfaceC26697j mo79391c(InterfaceC26697j interfaceC26697j, long j7) {
        range().m79421b(j7, this);
        return interfaceC26697j.mo60994c(AbstractC5583n.m16768a0(j7, mo79393e(interfaceC26697j)), EnumC26689b.WEEKS);
    }

    @Override // ng3.EnumC26694g, ng3.InterfaceC26700m
    /* JADX INFO: renamed from: d */
    public final InterfaceC26698k mo79392d(HashMap map, EnumC24059u enumC24059u) {
        C21677d c21677dMo60993b;
        long j7;
        C26693f c26693f = EnumC26694g.f106188z;
        Long l7 = (Long) map.get(c26693f);
        EnumC26688a enumC26688a = EnumC26688a.DAY_OF_WEEK;
        Long l12 = (Long) map.get(enumC26688a);
        if (l7 == null || l12 == null) {
            return null;
        }
        int iM79420a = EnumC26688a.YEAR.f106174x.m79420a(l7.longValue(), c26693f);
        long jLongValue = ((Long) map.get(EnumC26694g.f106187y)).longValue();
        if (enumC24059u == EnumC24059u.f95080y) {
            long jLongValue2 = l12.longValue();
            if (jLongValue2 > 7) {
                long j13 = jLongValue2 - 1;
                j7 = j13 / 7;
                jLongValue2 = (j13 % 7) + 1;
            } else if (jLongValue2 < 1) {
                j7 = (jLongValue2 / 7) - 1;
                jLongValue2 = (jLongValue2 % 7) + 7;
            } else {
                j7 = 0;
            }
            c21677dMo60993b = C21677d.m61003t0(iM79420a, 1, 4).m61016z0(jLongValue - 1).m61016z0(j7).mo60993b(jLongValue2, enumC26688a);
        } else {
            int iM79420a2 = enumC26688a.f106174x.m79420a(l12.longValue(), enumC26688a);
            if (enumC24059u == EnumC24059u.f95078w) {
                EnumC26694g.m79400i(C21677d.m61003t0(iM79420a, 1, 4)).m79421b(jLongValue, this);
            } else {
                range().m79421b(jLongValue, this);
            }
            c21677dMo60993b = C21677d.m61003t0(iM79420a, 1, 4).m61016z0(jLongValue - 1).mo60993b(iM79420a2, enumC26688a);
        }
        map.remove(this);
        map.remove(c26693f);
        map.remove(enumC26688a);
        return c21677dMo60993b;
    }

    @Override // ng3.InterfaceC26700m
    /* JADX INFO: renamed from: e */
    public final long mo79393e(InterfaceC26698k interfaceC26698k) {
        if (interfaceC26698k.mo60986a(this)) {
            return EnumC26694g.m79397f(C21677d.m61002q0(interfaceC26698k));
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
    }

    @Override // ng3.InterfaceC26700m
    public final C26706s range() {
        return C26706s.m79419d(52L, 53L);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "WeekOfWeekBasedYear";
    }
}
