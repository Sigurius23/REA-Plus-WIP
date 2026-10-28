package jg3;

import androidx.health.platform.client.proto.C1533u;
import com.squareup.wire.AbstractC5583n;
import g73.C15553a;
import hc3.AbstractC17176i;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kg3.AbstractC22462a;
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
import ng3.InterfaceC26705r;
import org.threeten.p379bp.DateTimeException;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;
import p031b9.AbstractC2875y;
import p497t7.InterfaceC33561b;

/* JADX INFO: renamed from: jg3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C21677d extends AbstractC22462a implements Serializable {

    /* JADX INFO: renamed from: I */
    public static final C21677d f83237I = m61003t0(-999999999, 1, 1);

    /* JADX INFO: renamed from: J */
    public static final C21677d f83238J = m61003t0(999999999, 12, 31);

    /* JADX INFO: renamed from: K */
    public static final C15553a f83239K = new C15553a(14);

    /* JADX INFO: renamed from: F */
    public final int f83240F;

    /* JADX INFO: renamed from: G */
    public final short f83241G;

    /* JADX INFO: renamed from: H */
    public final short f83242H;

    public C21677d(int i13, int i14, int i15) {
        this.f83240F = i13;
        this.f83241G = (short) i14;
        this.f83242H = (short) i15;
    }

    /* JADX INFO: renamed from: B0 */
    public static C21677d m61000B0(int i13, int i14, int i15) {
        if (i14 == 2) {
            C22466e c22466e = C22466e.f88015w;
            i15 = Math.min(i15, C22466e.isLeapYear((long) i13) ? 29 : 28);
        } else if (i14 == 4 || i14 == 6 || i14 == 9 || i14 == 11) {
            i15 = Math.min(i15, 30);
        }
        return m61003t0(i13, i14, i15);
    }

    /* JADX INFO: renamed from: p0 */
    public static C21677d m61001p0(int i13, EnumC21680g enumC21680g, int i14) {
        if (i14 > 28) {
            C22466e c22466e = C22466e.f88015w;
            if (i14 > enumC21680g.m61050m(C22466e.isLeapYear(i13))) {
                if (i14 == 29) {
                    throw new DateTimeException(AbstractC2875y.m8296i(i13, "Invalid date 'February 29' as '", "' is not a leap year"));
                }
                throw new DateTimeException("Invalid date '" + enumC21680g.name() + " " + i14 + "'");
            }
        }
        return new C21677d(i13, enumC21680g.m61049l(), i14);
    }

    /* JADX INFO: renamed from: q0 */
    public static C21677d m61002q0(InterfaceC26698k interfaceC26698k) {
        C21677d c21677d = (C21677d) interfaceC26698k.mo14019g(AbstractC26703p.f106199f);
        if (c21677d != null) {
            return c21677d;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC26698k + ", type " + interfaceC26698k.getClass().getName());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: t0 */
    public static C21677d m61003t0(int i13, int i14, int i15) {
        EnumC26688a.YEAR.m79394f(i13);
        EnumC26688a.MONTH_OF_YEAR.m79394f(i14);
        EnumC26688a.DAY_OF_MONTH.m79394f(i15);
        return m61001p0(i13, EnumC21680g.m61047o(i14), i15);
    }

    /* JADX INFO: renamed from: u0 */
    public static C21677d m61004u0(long j7) {
        long j13;
        EnumC26688a.EPOCH_DAY.m79394f(j7);
        long j14 = 719468 + j7;
        if (j14 < 0) {
            long j15 = ((j7 + 719469) / 146097) - 1;
            j13 = j15 * 400;
            j14 += (-j15) * 146097;
        } else {
            j13 = 0;
        }
        long j16 = ((j14 * 400) + 591) / 146097;
        long j17 = j14 - ((j16 / 400) + (((j16 / 4) + (j16 * 365)) - (j16 / 100)));
        if (j17 < 0) {
            j16--;
            j17 = j14 - ((j16 / 400) + (((j16 / 4) + (365 * j16)) - (j16 / 100)));
        }
        int i13 = (int) j17;
        int i14 = ((i13 * 5) + 2) / 153;
        int i15 = ((i14 + 2) % 12) + 1;
        int i16 = (i13 - (((i14 * 306) + 5) / 10)) + 1;
        long j18 = j16 + j13 + ((long) (i14 / 10));
        EnumC26688a enumC26688a = EnumC26688a.YEAR;
        return new C21677d(enumC26688a.f106174x.m79420a(j18, enumC26688a), i15, i16);
    }

    /* JADX INFO: renamed from: v0 */
    public static C21677d m61005v0(int i13, int i14) {
        long j7 = i13;
        EnumC26688a.YEAR.m79394f(j7);
        EnumC26688a.DAY_OF_YEAR.m79394f(i14);
        C22466e c22466e = C22466e.f88015w;
        boolean zIsLeapYear = C22466e.isLeapYear(j7);
        if (i14 == 366 && !zIsLeapYear) {
            throw new DateTimeException(AbstractC2875y.m8296i(i13, "Invalid date 'DayOfYear 366' as '", "' is not a leap year"));
        }
        EnumC21680g enumC21680gM61047o = EnumC21680g.m61047o(((i14 - 1) / 31) + 1);
        if (i14 > (enumC21680gM61047o.m61050m(zIsLeapYear) + enumC21680gM61047o.m61048k(zIsLeapYear)) - 1) {
            enumC21680gM61047o = EnumC21680g.f83256x[((((int) 1) + 12) + enumC21680gM61047o.ordinal()) % 12];
        }
        return m61001p0(i13, enumC21680gM61047o, (i14 - enumC21680gM61047o.m61048k(zIsLeapYear)) + 1);
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 3);
    }

    /* JADX INFO: renamed from: A0 */
    public final C21677d m61006A0(long j7) {
        if (j7 == 0) {
            return this;
        }
        EnumC26688a enumC26688a = EnumC26688a.YEAR;
        return m61000B0(enumC26688a.f106174x.m79420a(((long) this.f83240F) + j7, enumC26688a), this.f83241G, this.f83242H);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final C21677d mo60993b(long j7, InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return (C21677d) interfaceC26700m.mo79391c(this, j7);
        }
        EnumC26688a enumC26688a = (EnumC26688a) interfaceC26700m;
        enumC26688a.m79394f(j7);
        int iOrdinal = enumC26688a.ordinal();
        short s13 = this.f83242H;
        short s14 = this.f83241G;
        int i13 = this.f83240F;
        switch (iOrdinal) {
            case 15:
                return m61014x0(j7 - ((long) m61012s0().m60988k()));
            case 16:
                return m61014x0(j7 - mo60987h(EnumC26688a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return m61014x0(j7 - mo60987h(EnumC26688a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int i14 = (int) j7;
                if (s13 != i14) {
                    return m61003t0(i13, s14, i14);
                }
                return this;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int i15 = (int) j7;
                if (getDayOfYear() != i15) {
                    return m61005v0(i13, i15);
                }
                return this;
            case 20:
                return m61004u0(j7);
            case 21:
                return m61016z0(j7 - mo60987h(EnumC26688a.ALIGNED_WEEK_OF_MONTH));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return m61016z0(j7 - mo60987h(EnumC26688a.ALIGNED_WEEK_OF_YEAR));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int i16 = (int) j7;
                if (s14 != i16) {
                    EnumC26688a.MONTH_OF_YEAR.m79394f(i16);
                    return m61000B0(i13, i16, s13);
                }
                return this;
            case 24:
                return m61015y0(j7 - mo60987h(EnumC26688a.PROLEPTIC_MONTH));
            case 25:
                if (i13 < 1) {
                    j7 = 1 - j7;
                }
                return m61009E0((int) j7);
            case 26:
                return m61009E0((int) j7);
            case 27:
                if (mo60987h(EnumC26688a.ERA) != j7) {
                    return m61009E0(1 - i13);
                }
                return this;
            default:
                throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final C21677d mo60996j(InterfaceC26699l interfaceC26699l) {
        return interfaceC26699l instanceof C21677d ? (C21677d) interfaceC26699l : (C21677d) interfaceC26699l.mo13612e(this);
    }

    /* JADX INFO: renamed from: E0 */
    public final C21677d m61009E0(int i13) {
        if (this.f83240F == i13) {
            return this;
        }
        EnumC26688a.YEAR.m79394f(i13);
        return m61000B0(i13, this.f83241G, this.f83242H);
    }

    @Override // kg3.AbstractC22462a, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return ((EnumC26688a) interfaceC26700m).isDateBased();
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC22462a abstractC22462a = (AbstractC22462a) obj;
        if (abstractC22462a instanceof C21677d) {
            return m61010o0((C21677d) abstractC22462a);
        }
        int iM16791q = AbstractC5583n.m16791q(toEpochDay(), abstractC22462a.toEpochDay());
        if (iM16791q != 0) {
            return iM16791q;
        }
        C22466e c22466e = C22466e.f88015w;
        return 0;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        int i13;
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m.mo79389a(this);
        }
        EnumC26688a enumC26688a = (EnumC26688a) interfaceC26700m;
        if (!enumC26688a.isDateBased()) {
            throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
        int iOrdinal = enumC26688a.ordinal();
        short s13 = this.f83241G;
        if (iOrdinal == 18) {
            if (s13 != 2) {
                i13 = (s13 == 4 || s13 == 6 || s13 == 9 || s13 == 11) ? 30 : 31;
            } else {
                i13 = isLeapYear() ? 29 : 28;
            }
            return C26706s.m79418c(1L, i13);
        }
        if (iOrdinal == 19) {
            return C26706s.m79418c(1L, isLeapYear() ? 366 : 365);
        }
        if (iOrdinal == 21) {
            return C26706s.m79418c(1L, (EnumC21680g.m61047o(s13) != EnumC21680g.f83255w || isLeapYear()) ? 5L : 4L);
        }
        if (iOrdinal != 25) {
            return enumC26688a.f106174x;
        }
        return this.f83240F <= 0 ? C26706s.m79418c(1L, 1000000000L) : C26706s.m79418c(1L, 999999999L);
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public final InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        return interfaceC26697j.mo60993b(toEpochDay(), EnumC26688a.EPOCH_DAY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21677d) && m61010o0((C21677d) obj) == 0;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        return interfaceC26700m instanceof EnumC26688a ? m61011r0(interfaceC26700m) : super.mo14018f(interfaceC26700m);
    }

    @Override // kg3.AbstractC22462a, p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        return interfaceC26704q == AbstractC26703p.f106199f ? this : super.mo14019g(interfaceC26704q);
    }

    public final int getDayOfYear() {
        return (EnumC21680g.m61047o(this.f83241G).m61048k(isLeapYear()) + this.f83242H) - 1;
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m.mo79393e(this);
        }
        if (interfaceC26700m == EnumC26688a.EPOCH_DAY) {
            return toEpochDay();
        }
        return interfaceC26700m == EnumC26688a.PROLEPTIC_MONTH ? (((long) this.f83240F) * 12) + ((long) (this.f83241G - 1)) : m61011r0(interfaceC26700m);
    }

    public final int hashCode() {
        int i13 = this.f83240F;
        return (((i13 << 11) + (this.f83241G << 6)) + this.f83242H) ^ (i13 & (-2048));
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: i */
    public final InterfaceC26697j mo60995i(long j7, InterfaceC26705r interfaceC26705r) {
        return j7 == Long.MIN_VALUE ? mo60994c(Long.MAX_VALUE, interfaceC26705r).mo60994c(1L, interfaceC26705r) : mo60994c(-j7, interfaceC26705r);
    }

    public final boolean isLeapYear() {
        C22466e c22466e = C22466e.f88015w;
        return C22466e.isLeapYear(this.f83240F);
    }

    /* JADX INFO: renamed from: o0 */
    public final int m61010o0(C21677d c21677d) {
        int i13 = this.f83240F - c21677d.f83240F;
        if (i13 != 0) {
            return i13;
        }
        int i14 = this.f83241G - c21677d.f83241G;
        return i14 == 0 ? this.f83242H - c21677d.f83242H : i14;
    }

    /* JADX INFO: renamed from: r0 */
    public final int m61011r0(InterfaceC26700m interfaceC26700m) {
        int i13;
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        short s13 = this.f83242H;
        int i14 = this.f83240F;
        switch (iOrdinal) {
            case 15:
                return m61012s0().m60988k();
            case 16:
                i13 = (s13 - 1) % 7;
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((getDayOfYear() - 1) % 7) + 1;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return s13;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return getDayOfYear();
            case 20:
                throw new DateTimeException(AbstractC17176i.m48504f("Field too large for an int: ", interfaceC26700m));
            case 21:
                i13 = (s13 - 1) / 7;
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((getDayOfYear() - 1) / 7) + 1;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return this.f83241G;
            case 24:
                throw new DateTimeException(AbstractC17176i.m48504f("Field too large for an int: ", interfaceC26700m));
            case 25:
                return i14 >= 1 ? i14 : 1 - i14;
            case 26:
                return i14;
            case 27:
                return i14 >= 1 ? 1 : 0;
            default:
                throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
        return i13 + 1;
    }

    /* JADX INFO: renamed from: s0 */
    public final EnumC21674a m61012s0() {
        return EnumC21674a.m60985l(AbstractC5583n.m16743B(7, toEpochDay() + 3) + 1);
    }

    @Override // kg3.AbstractC22462a
    public final long toEpochDay() {
        long j7;
        long j13 = this.f83240F;
        long j14 = this.f83241G;
        long j15 = 365 * j13;
        if (j13 >= 0) {
            j7 = ((j13 + 399) / 400) + (((3 + j13) / 4) - ((99 + j13) / 100)) + j15;
        } else {
            j7 = j15 - ((j13 / (-400)) + ((j13 / (-4)) - (j13 / (-100))));
        }
        long j16 = (((367 * j14) - 362) / 12) + j7 + ((long) (this.f83242H - 1));
        if (j14 > 2) {
            j16 = !isLeapYear() ? j16 - 2 : j16 - 1;
        }
        return j16 - 719528;
    }

    public final String toString() {
        int i13 = this.f83240F;
        int iAbs = Math.abs(i13);
        StringBuilder sb4 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i13 > 9999) {
                sb4.append('+');
            }
            sb4.append(i13);
        } else if (i13 < 0) {
            sb4.append(i13 - 10000);
            sb4.deleteCharAt(1);
        } else {
            sb4.append(i13 + InterfaceC33561b.INVALID_OWNERSHIP);
            sb4.deleteCharAt(0);
        }
        short s13 = this.f83241G;
        sb4.append(s13 < 10 ? "-0" : "-");
        sb4.append((int) s13);
        short s14 = this.f83242H;
        sb4.append(s14 < 10 ? "-0" : "-");
        sb4.append((int) s14);
        return sb4.toString();
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final C21677d mo60994c(long j7, InterfaceC26705r interfaceC26705r) {
        if (!(interfaceC26705r instanceof EnumC26689b)) {
            return (C21677d) interfaceC26705r.mo79396a(this, j7);
        }
        switch (((EnumC26689b) interfaceC26705r).ordinal()) {
            case 7:
                return m61014x0(j7);
            case 8:
                return m61016z0(j7);
            case 9:
                return m61015y0(j7);
            case 10:
                return m61006A0(j7);
            case 11:
                return m61006A0(AbstractC5583n.m16764X(j7, 10));
            case 12:
                return m61006A0(AbstractC5583n.m16764X(j7, 100));
            case 13:
                return m61006A0(AbstractC5583n.m16764X(j7, 1000));
            case 14:
                EnumC26688a enumC26688a = EnumC26688a.ERA;
                return mo60993b(AbstractC5583n.m16763W(mo60987h(enumC26688a), j7), enumC26688a);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC26705r);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final C21677d m61014x0(long j7) {
        return j7 == 0 ? this : m61004u0(AbstractC5583n.m16763W(toEpochDay(), j7));
    }

    /* JADX INFO: renamed from: y0 */
    public final C21677d m61015y0(long j7) {
        if (j7 == 0) {
            return this;
        }
        long j13 = (((long) this.f83240F) * 12) + ((long) (this.f83241G - 1)) + j7;
        EnumC26688a enumC26688a = EnumC26688a.YEAR;
        return m61000B0(enumC26688a.f106174x.m79420a(AbstractC5583n.m16742A(j13, 12L), enumC26688a), AbstractC5583n.m16743B(12, j13) + 1, this.f83242H);
    }

    /* JADX INFO: renamed from: z0 */
    public final C21677d m61016z0(long j7) {
        return m61014x0(AbstractC5583n.m16764X(j7, 7));
    }
}
