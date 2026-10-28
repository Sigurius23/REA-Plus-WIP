package jg3;

import androidx.health.platform.client.proto.C1533u;
import com.squareup.wire.AbstractC5583n;
import hc3.AbstractC17176i;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kg3.AbstractC22465d;
import kg3.C22466e;
import lg3.C24053o;
import ng3.AbstractC26703p;
import ng3.C26706s;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26699l;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import ng3.InterfaceC26705r;
import org.threeten.p379bp.DateTimeException;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;
import p048ce.AbstractC4482w;
import p497t7.InterfaceC33561b;

/* JADX INFO: renamed from: jg3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C21687n extends AbstractC4482w implements InterfaceC26697j, InterfaceC26699l, Comparable, Serializable {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ int f83273H = 0;

    /* JADX INFO: renamed from: F */
    public final int f83274F;

    /* JADX INFO: renamed from: G */
    public final int f83275G;

    static {
        C24053o c24053o = new C24053o();
        c24053o.m70959h(EnumC26688a.YEAR, 4, 10, 5);
        c24053o.m70954c('-');
        c24053o.m70958g(EnumC26688a.MONTH_OF_YEAR, 2);
        c24053o.m70962k();
    }

    public C21687n(int i13, int i14) {
        this.f83274F = i13;
        this.f83275G = i14;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 68);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return interfaceC26700m == EnumC26688a.YEAR || interfaceC26700m == EnumC26688a.MONTH_OF_YEAR || interfaceC26700m == EnumC26688a.PROLEPTIC_MONTH || interfaceC26700m == EnumC26688a.YEAR_OF_ERA || interfaceC26700m == EnumC26688a.ERA;
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C21687n c21687n = (C21687n) obj;
        int i13 = this.f83274F - c21687n.f83274F;
        return i13 == 0 ? this.f83275G - c21687n.f83275G : i13;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m == EnumC26688a.YEAR_OF_ERA) {
            return C26706s.m79418c(1L, this.f83274F <= 0 ? 1000000000L : 999999999L);
        }
        return super.mo14017d(interfaceC26700m);
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public final InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        if (!AbstractC22465d.m64906a(interfaceC26697j).equals(C22466e.f88015w)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return interfaceC26697j.mo60993b((((long) this.f83274F) * 12) + ((long) (this.f83275G - 1)), EnumC26688a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21687n) {
            C21687n c21687n = (C21687n) obj;
            if (this.f83274F == c21687n.f83274F && this.f83275G == c21687n.f83275G) {
                return true;
            }
        }
        return false;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        return mo14017d(interfaceC26700m).m79420a(mo60987h(interfaceC26700m), interfaceC26700m);
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
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
        return super.mo14019g(interfaceC26704q);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m.mo79393e(this);
        }
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        int i13 = this.f83275G;
        int i14 = this.f83274F;
        switch (iOrdinal) {
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return i13;
            case 24:
                return (((long) i14) * 12) + ((long) (i13 - 1));
            case 25:
                if (i14 < 1) {
                    i14 = 1 - i14;
                }
                return i14;
            case 26:
                return i14;
            case 27:
                return i14 < 1 ? 0 : 1;
            default:
                throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
    }

    public final int hashCode() {
        return (this.f83275G << 27) ^ this.f83274F;
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: i */
    public final InterfaceC26697j mo60995i(long j7, InterfaceC26705r interfaceC26705r) {
        return j7 == Long.MIN_VALUE ? mo60994c(Long.MAX_VALUE, interfaceC26705r).mo60994c(1L, interfaceC26705r) : mo60994c(-j7, interfaceC26705r);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: j */
    public final InterfaceC26697j mo60996j(C21677d c21677d) {
        return (C21687n) c21677d.mo13612e(this);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final C21687n mo60994c(long j7, InterfaceC26705r interfaceC26705r) {
        if (!(interfaceC26705r instanceof EnumC26689b)) {
            return (C21687n) interfaceC26705r.mo79396a(this, j7);
        }
        switch (((EnumC26689b) interfaceC26705r).ordinal()) {
            case 9:
                return m61065p0(j7);
            case 10:
                return m61066q0(j7);
            case 11:
                return m61066q0(AbstractC5583n.m16764X(j7, 10));
            case 12:
                return m61066q0(AbstractC5583n.m16764X(j7, 100));
            case 13:
                return m61066q0(AbstractC5583n.m16764X(j7, 1000));
            case 14:
                EnumC26688a enumC26688a = EnumC26688a.ERA;
                return mo60993b(AbstractC5583n.m16763W(mo60987h(enumC26688a), j7), enumC26688a);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC26705r);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final C21687n m61065p0(long j7) {
        if (j7 == 0) {
            return this;
        }
        long j13 = (((long) this.f83274F) * 12) + ((long) (this.f83275G - 1)) + j7;
        EnumC26688a enumC26688a = EnumC26688a.YEAR;
        return m61067r0(enumC26688a.f106174x.m79420a(AbstractC5583n.m16742A(j13, 12L), enumC26688a), AbstractC5583n.m16743B(12, j13) + 1);
    }

    /* JADX INFO: renamed from: q0 */
    public final C21687n m61066q0(long j7) {
        if (j7 == 0) {
            return this;
        }
        EnumC26688a enumC26688a = EnumC26688a.YEAR;
        return m61067r0(enumC26688a.f106174x.m79420a(((long) this.f83274F) + j7, enumC26688a), this.f83275G);
    }

    /* JADX INFO: renamed from: r0 */
    public final C21687n m61067r0(int i13, int i14) {
        return (this.f83274F == i13 && this.f83275G == i14) ? this : new C21687n(i13, i14);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final C21687n mo60993b(long j7, InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return (C21687n) interfaceC26700m.mo79391c(this, j7);
        }
        EnumC26688a enumC26688a = (EnumC26688a) interfaceC26700m;
        enumC26688a.m79394f(j7);
        int iOrdinal = enumC26688a.ordinal();
        int i13 = this.f83275G;
        int i14 = this.f83274F;
        switch (iOrdinal) {
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int i15 = (int) j7;
                EnumC26688a.MONTH_OF_YEAR.m79394f(i15);
                return m61067r0(i14, i15);
            case 24:
                return m61065p0(j7 - mo60987h(EnumC26688a.PROLEPTIC_MONTH));
            case 25:
                if (i14 < 1) {
                    j7 = 1 - j7;
                }
                int i16 = (int) j7;
                EnumC26688a.YEAR.m79394f(i16);
                return m61067r0(i16, i13);
            case 26:
                int i17 = (int) j7;
                EnumC26688a.YEAR.m79394f(i17);
                return m61067r0(i17, i13);
            case 27:
                if (mo60987h(EnumC26688a.ERA) == j7) {
                    return this;
                }
                int i18 = 1 - i14;
                EnumC26688a.YEAR.m79394f(i18);
                return m61067r0(i18, i13);
            default:
                throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
    }

    public final String toString() {
        int i13 = this.f83274F;
        int iAbs = Math.abs(i13);
        StringBuilder sb4 = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb4.append(i13);
        } else if (i13 < 0) {
            sb4.append(i13 - 10000);
            sb4.deleteCharAt(1);
        } else {
            sb4.append(i13 + InterfaceC33561b.INVALID_OWNERSHIP);
            sb4.deleteCharAt(0);
        }
        int i14 = this.f83275G;
        sb4.append(i14 < 10 ? "-0" : "-");
        sb4.append(i14);
        return sb4.toString();
    }
}
