package jg3;

import hc3.AbstractC17176i;
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
/* JADX INFO: renamed from: jg3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21674a implements InterfaceC26698k, InterfaceC26699l {

    /* JADX INFO: renamed from: w */
    public static final EnumC21674a f83227w;

    /* JADX INFO: renamed from: x */
    public static final EnumC21674a f83228x;

    /* JADX INFO: renamed from: y */
    public static final EnumC21674a[] f83229y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC21674a[] f83230z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC21674a EF0;

    static {
        EnumC21674a enumC21674a = new EnumC21674a("MONDAY", 0);
        EnumC21674a enumC21674a2 = new EnumC21674a("TUESDAY", 1);
        EnumC21674a enumC21674a3 = new EnumC21674a("WEDNESDAY", 2);
        f83227w = enumC21674a3;
        EnumC21674a enumC21674a4 = new EnumC21674a("THURSDAY", 3);
        f83228x = enumC21674a4;
        f83230z = new EnumC21674a[]{enumC21674a, enumC21674a2, enumC21674a3, enumC21674a4, new EnumC21674a("FRIDAY", 4), new EnumC21674a("SATURDAY", 5), new EnumC21674a("SUNDAY", 6)};
        f83229y = values();
    }

    /* JADX INFO: renamed from: l */
    public static EnumC21674a m60985l(int i13) {
        if (i13 < 1 || i13 > 7) {
            throw new DateTimeException(AbstractC2875y.m8295h(i13, "Invalid value for DayOfWeek: "));
        }
        return f83229y[i13 - 1];
    }

    public static EnumC21674a valueOf(String str) {
        return (EnumC21674a) Enum.valueOf(EnumC21674a.class, str);
    }

    public static EnumC21674a[] values() {
        return (EnumC21674a[]) f83230z.clone();
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return interfaceC26700m == EnumC26688a.DAY_OF_WEEK;
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m == EnumC26688a.DAY_OF_WEEK) {
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
        return interfaceC26697j.mo60993b(m60988k(), EnumC26688a.DAY_OF_WEEK);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        return interfaceC26700m == EnumC26688a.DAY_OF_WEEK ? m60988k() : mo14017d(interfaceC26700m).m79420a(mo60987h(interfaceC26700m), interfaceC26700m);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return EnumC26689b.DAYS;
        }
        if (interfaceC26704q == AbstractC26703p.f106199f || interfaceC26704q == AbstractC26703p.f106200g || interfaceC26704q == AbstractC26703p.f106195b || interfaceC26704q == AbstractC26703p.f106197d || interfaceC26704q == AbstractC26703p.f106194a || interfaceC26704q == AbstractC26703p.f106198e) {
            return null;
        }
        return interfaceC26704q.mo43799l(this);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m == EnumC26688a.DAY_OF_WEEK) {
            return m60988k();
        }
        if (interfaceC26700m instanceof EnumC26688a) {
            throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
        return interfaceC26700m.mo79393e(this);
    }

    /* JADX INFO: renamed from: k */
    public final int m60988k() {
        return ordinal() + 1;
    }
}
