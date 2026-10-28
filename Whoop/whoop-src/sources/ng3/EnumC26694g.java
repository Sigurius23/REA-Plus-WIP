package ng3;

import com.squareup.wire.AbstractC5583n;
import java.util.HashMap;
import jg3.C21677d;
import jg3.EnumC21674a;
import kg3.AbstractC22465d;
import kg3.C22466e;
import lg3.EnumC24059u;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ng3.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC26694g implements InterfaceC26700m {

    /* JADX INFO: renamed from: E */
    public static final int[] f106183E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC26694g[] f106184F;

    /* JADX INFO: renamed from: w */
    public static final C26690c f106185w;

    /* JADX INFO: renamed from: x */
    public static final C26691d f106186x;

    /* JADX INFO: renamed from: y */
    public static final C26692e f106187y;

    /* JADX INFO: renamed from: z */
    public static final C26693f f106188z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ng3.c] */
    static {
        ?? r10 = new EnumC26694g() { // from class: ng3.c
            @Override // ng3.EnumC26694g, ng3.InterfaceC26700m
            /* JADX INFO: renamed from: a */
            public final C26706s mo79389a(InterfaceC26698k interfaceC26698k) {
                if (!interfaceC26698k.mo60986a(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long jMo60987h = interfaceC26698k.mo60987h(EnumC26694g.f106186x);
                if (jMo60987h == 1) {
                    long jMo60987h2 = interfaceC26698k.mo60987h(EnumC26688a.YEAR);
                    C22466e c22466e = C22466e.f88015w;
                    return C22466e.isLeapYear(jMo60987h2) ? C26706s.m79418c(1L, 91L) : C26706s.m79418c(1L, 90L);
                }
                if (jMo60987h == 2) {
                    return C26706s.m79418c(1L, 91L);
                }
                return (jMo60987h == 3 || jMo60987h == 4) ? C26706s.m79418c(1L, 92L) : range();
            }

            @Override // ng3.InterfaceC26700m
            /* JADX INFO: renamed from: b */
            public final boolean mo79390b(InterfaceC26698k interfaceC26698k) {
                return interfaceC26698k.mo60986a(EnumC26688a.DAY_OF_YEAR) && interfaceC26698k.mo60986a(EnumC26688a.MONTH_OF_YEAR) && interfaceC26698k.mo60986a(EnumC26688a.YEAR) && AbstractC22465d.m64906a(interfaceC26698k).equals(C22466e.f88015w);
            }

            @Override // ng3.InterfaceC26700m
            /* JADX INFO: renamed from: c */
            public final InterfaceC26697j mo79391c(InterfaceC26697j interfaceC26697j, long j7) {
                long jMo79393e = mo79393e(interfaceC26697j);
                range().m79421b(j7, this);
                EnumC26688a enumC26688a = EnumC26688a.DAY_OF_YEAR;
                return interfaceC26697j.mo60993b((j7 - jMo79393e) + interfaceC26697j.mo60987h(enumC26688a), enumC26688a);
            }

            @Override // ng3.EnumC26694g, ng3.InterfaceC26700m
            /* JADX INFO: renamed from: d */
            public final InterfaceC26698k mo79392d(HashMap map, EnumC24059u enumC24059u) {
                C21677d c21677dM61014x0;
                EnumC26688a enumC26688a = EnumC26688a.YEAR;
                Long l7 = (Long) map.get(enumC26688a);
                InterfaceC26700m interfaceC26700m = EnumC26694g.f106186x;
                Long l12 = (Long) map.get(interfaceC26700m);
                if (l7 == null || l12 == null) {
                    return null;
                }
                int iM79420a = enumC26688a.f106174x.m79420a(l7.longValue(), enumC26688a);
                long jLongValue = ((Long) map.get(EnumC26694g.f106185w)).longValue();
                if (enumC24059u == EnumC24059u.f95080y) {
                    c21677dM61014x0 = C21677d.m61003t0(iM79420a, 1, 1).m61015y0(AbstractC5583n.m16764X(AbstractC5583n.m16768a0(l12.longValue(), 1L), 3)).m61014x0(AbstractC5583n.m16768a0(jLongValue, 1L));
                } else {
                    int iM79420a2 = interfaceC26700m.range().m79420a(l12.longValue(), interfaceC26700m);
                    if (enumC24059u == EnumC24059u.f95078w) {
                        int i13 = 91;
                        if (iM79420a2 == 1) {
                            C22466e c22466e = C22466e.f88015w;
                            if (!C22466e.isLeapYear(iM79420a)) {
                                i13 = 90;
                            }
                        } else if (iM79420a2 != 2) {
                            i13 = 92;
                        }
                        C26706s.m79418c(1L, i13).m79421b(jLongValue, this);
                    } else {
                        range().m79421b(jLongValue, this);
                    }
                    c21677dM61014x0 = C21677d.m61003t0(iM79420a, ((iM79420a2 - 1) * 3) + 1, 1).m61014x0(jLongValue - 1);
                }
                map.remove(this);
                map.remove(enumC26688a);
                map.remove(interfaceC26700m);
                return c21677dM61014x0;
            }

            @Override // ng3.InterfaceC26700m
            /* JADX INFO: renamed from: e */
            public final long mo79393e(InterfaceC26698k interfaceC26698k) {
                if (!interfaceC26698k.mo60986a(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                int iMo14018f = interfaceC26698k.mo14018f(EnumC26688a.DAY_OF_YEAR);
                int iMo14018f2 = interfaceC26698k.mo14018f(EnumC26688a.MONTH_OF_YEAR);
                long jMo60987h = interfaceC26698k.mo60987h(EnumC26688a.YEAR);
                int i13 = (iMo14018f2 - 1) / 3;
                C22466e c22466e = C22466e.f88015w;
                return iMo14018f - EnumC26694g.f106183E[i13 + (C22466e.isLeapYear(jMo60987h) ? 4 : 0)];
            }

            @Override // ng3.InterfaceC26700m
            public final C26706s range() {
                return C26706s.m79419d(90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        f106185w = r10;
        C26691d c26691d = new C26691d();
        f106186x = c26691d;
        C26692e c26692e = new C26692e();
        f106187y = c26692e;
        C26693f c26693f = new C26693f();
        f106188z = c26693f;
        f106184F = new EnumC26694g[]{r10, c26691d, c26692e, c26693f};
        f106183E = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    /* JADX INFO: renamed from: f */
    public static int m79397f(C21677d c21677d) {
        int iOrdinal = c21677d.m61012s0().ordinal();
        int dayOfYear = c21677d.getDayOfYear() - 1;
        int i13 = (3 - iOrdinal) + dayOfYear;
        int i14 = i13 - ((i13 / 7) * 7);
        int i15 = i14 - 3;
        if (i15 < -3) {
            i15 = i14 + 4;
        }
        if (dayOfYear < i15) {
            if (c21677d.getDayOfYear() != 180) {
                c21677d = C21677d.m61005v0(c21677d.f83240F, 180);
            }
            return (int) m79400i(c21677d.m61006A0(-1L)).f106204z;
        }
        int i16 = ((dayOfYear - i15) / 7) + 1;
        if (i16 != 53 || i15 == -3 || (i15 == -2 && c21677d.isLeapYear())) {
            return i16;
        }
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public static int m79398g(C21677d c21677d) {
        int i13 = c21677d.f83240F;
        int dayOfYear = c21677d.getDayOfYear();
        if (dayOfYear <= 3) {
            return dayOfYear - c21677d.m61012s0().ordinal() < -2 ? i13 - 1 : i13;
        }
        if (dayOfYear >= 363) {
            return ((dayOfYear - 363) - (c21677d.isLeapYear() ? 1 : 0)) - c21677d.m61012s0().ordinal() >= 0 ? i13 + 1 : i13;
        }
        return i13;
    }

    /* JADX INFO: renamed from: h */
    public static int m79399h(int i13) {
        C21677d c21677dM61003t0 = C21677d.m61003t0(i13, 1, 1);
        if (c21677dM61003t0.m61012s0() != EnumC21674a.f83228x) {
            return (c21677dM61003t0.m61012s0() == EnumC21674a.f83227w && c21677dM61003t0.isLeapYear()) ? 53 : 52;
        }
        return 53;
    }

    /* JADX INFO: renamed from: i */
    public static C26706s m79400i(C21677d c21677d) {
        return C26706s.m79418c(1L, m79399h(m79398g(c21677d)));
    }

    public static EnumC26694g valueOf(String str) {
        return (EnumC26694g) Enum.valueOf(EnumC26694g.class, str);
    }

    public static EnumC26694g[] values() {
        return (EnumC26694g[]) f106184F.clone();
    }

    /* JADX INFO: renamed from: a */
    public C26706s mo79389a(InterfaceC26698k interfaceC26698k) {
        return range();
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC26698k mo79392d(HashMap map, EnumC24059u enumC24059u) {
        return null;
    }

    @Override // ng3.InterfaceC26700m
    public final boolean isDateBased() {
        return true;
    }
}
