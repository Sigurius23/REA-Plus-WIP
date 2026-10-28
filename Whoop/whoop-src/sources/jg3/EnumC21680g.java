package jg3;

import hc3.AbstractC17176i;
import kg3.AbstractC22465d;
import kg3.C22466e;
import ng3.AbstractC26703p;
import ng3.C26706s;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26699l;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import org.threeten.p379bp.DateTimeException;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;
import p031b9.AbstractC2875y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: jg3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21680g implements InterfaceC26698k, InterfaceC26699l {

    /* JADX INFO: renamed from: w */
    public static final EnumC21680g f83255w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21680g[] f83256x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC21680g[] f83257y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC21680g EF0;

    static {
        EnumC21680g enumC21680g = new EnumC21680g("JANUARY", 0);
        EnumC21680g enumC21680g2 = new EnumC21680g("FEBRUARY", 1);
        f83255w = enumC21680g2;
        f83257y = new EnumC21680g[]{enumC21680g, enumC21680g2, new EnumC21680g("MARCH", 2), new EnumC21680g("APRIL", 3), new EnumC21680g("MAY", 4), new EnumC21680g("JUNE", 5), new EnumC21680g("JULY", 6), new EnumC21680g("AUGUST", 7), new EnumC21680g("SEPTEMBER", 8), new EnumC21680g("OCTOBER", 9), new EnumC21680g("NOVEMBER", 10), new EnumC21680g("DECEMBER", 11)};
        f83256x = values();
    }

    /* JADX INFO: renamed from: o */
    public static EnumC21680g m61047o(int i13) {
        if (i13 < 1 || i13 > 12) {
            throw new DateTimeException(AbstractC2875y.m8295h(i13, "Invalid value for MonthOfYear: "));
        }
        return f83256x[i13 - 1];
    }

    public static EnumC21680g valueOf(String str) {
        return (EnumC21680g) Enum.valueOf(EnumC21680g.class, str);
    }

    public static EnumC21680g[] values() {
        return (EnumC21680g[]) f83257y.clone();
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return interfaceC26700m == EnumC26688a.MONTH_OF_YEAR;
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m == EnumC26688a.MONTH_OF_YEAR) {
            return interfaceC26700m.range();
        }
        if (interfaceC26700m instanceof EnumC26688a) {
            throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
        return interfaceC26700m.mo79389a(this);
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public final InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        if (!AbstractC22465d.m64906a(interfaceC26697j).equals(C22466e.f88015w)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return interfaceC26697j.mo60993b(m61049l(), EnumC26688a.MONTH_OF_YEAR);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        return interfaceC26700m == EnumC26688a.MONTH_OF_YEAR ? m61049l() : mo14017d(interfaceC26700m).m79420a(mo60987h(interfaceC26700m), interfaceC26700m);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106195b) {
            return C22466e.f88015w;
        }
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return EnumC26689b.MONTHS;
        }
        if (interfaceC26704q == AbstractC26703p.f106199f || interfaceC26704q == AbstractC26703p.f106200g || interfaceC26704q == AbstractC26703p.f106197d || interfaceC26704q == AbstractC26703p.f106194a || interfaceC26704q == AbstractC26703p.f106198e) {
            return null;
        }
        return interfaceC26704q.mo43799l(this);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m == EnumC26688a.MONTH_OF_YEAR) {
            return m61049l();
        }
        if (interfaceC26700m instanceof EnumC26688a) {
            throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
        return interfaceC26700m.mo79393e(this);
    }

    /* JADX INFO: renamed from: k */
    public final int m61048k(boolean z4) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return (z4 ? 1 : 0) + 60;
            case 3:
                return (z4 ? 1 : 0) + 91;
            case 4:
                return (z4 ? 1 : 0) + 121;
            case 5:
                return (z4 ? 1 : 0) + 152;
            case 6:
                return (z4 ? 1 : 0) + 182;
            case 7:
                return (z4 ? 1 : 0) + 213;
            case 8:
                return (z4 ? 1 : 0) + 244;
            case 9:
                return (z4 ? 1 : 0) + 274;
            case 10:
                return (z4 ? 1 : 0) + 305;
            default:
                return (z4 ? 1 : 0) + 335;
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m61049l() {
        return ordinal() + 1;
    }

    /* JADX INFO: renamed from: m */
    public final int m61050m(boolean z4) {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            return (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        }
        return z4 ? 29 : 28;
    }

    /* JADX INFO: renamed from: n */
    public final int m61051n() {
        int iOrdinal = ordinal();
        if (iOrdinal != 1) {
            return (iOrdinal == 3 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 10) ? 30 : 31;
        }
        return 29;
    }
}
