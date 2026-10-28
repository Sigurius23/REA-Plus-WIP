package jg3;

import com.squareup.wire.AbstractC5583n;
import hc3.AbstractC17176i;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import lg3.C24040b;
import ng3.AbstractC26703p;
import ng3.EnumC26688a;
import ng3.EnumC26689b;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26699l;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import ng3.InterfaceC26705r;
import org.joda.time.DateTimeConstants;
import org.threeten.p379bp.DateTimeException;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;
import p048ce.AbstractC4482w;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: jg3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C21676c extends AbstractC4482w implements InterfaceC26697j, InterfaceC26699l, Comparable, Serializable {

    /* JADX INFO: renamed from: H */
    public static final C21676c f83234H = new C21676c(0, 0);

    /* JADX INFO: renamed from: F */
    public final long f83235F;

    /* JADX INFO: renamed from: G */
    public final int f83236G;

    static {
        m60992q0(-31557014167219200L, 0L);
        m60992q0(31556889864403199L, 999999999L);
    }

    public C21676c(long j7, int i13) {
        this.f83235F = j7;
        this.f83236G = i13;
    }

    /* JADX INFO: renamed from: o0 */
    public static C21676c m60990o0(int i13, long j7) {
        if ((((long) i13) | j7) == 0) {
            return f83234H;
        }
        if (j7 < -31557014167219200L || j7 > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new C21676c(j7, i13);
    }

    /* JADX INFO: renamed from: p0 */
    public static C21676c m60991p0(InterfaceC26698k interfaceC26698k) {
        try {
            return m60992q0(interfaceC26698k.mo60987h(EnumC26688a.INSTANT_SECONDS), interfaceC26698k.mo14018f(EnumC26688a.NANO_OF_SECOND));
        } catch (DateTimeException e5) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + interfaceC26698k + ", type " + interfaceC26698k.getClass().getName(), e5);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static C21676c m60992q0(long j7, long j13) {
        return m60990o0(AbstractC5583n.m16743B(1000000000, j13), AbstractC5583n.m16763W(j7, AbstractC5583n.m16742A(j13, 1000000000L)));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 2);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return interfaceC26700m == EnumC26688a.INSTANT_SECONDS || interfaceC26700m == EnumC26688a.NANO_OF_SECOND || interfaceC26700m == EnumC26688a.MICRO_OF_SECOND || interfaceC26700m == EnumC26688a.MILLI_OF_SECOND;
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: b */
    public final InterfaceC26697j mo60993b(long j7, InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return (C21676c) interfaceC26700m.mo79391c(this, j7);
        }
        EnumC26688a enumC26688a = (EnumC26688a) interfaceC26700m;
        enumC26688a.m79394f(j7);
        int iOrdinal = enumC26688a.ordinal();
        int i13 = this.f83236G;
        long j13 = this.f83235F;
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                int i14 = ((int) j7) * 1000;
                if (i14 != i13) {
                    return m60990o0(i14, j13);
                }
            } else if (iOrdinal == 4) {
                int i15 = ((int) j7) * DurationKt.NANOS_IN_MILLIS;
                if (i15 != i13) {
                    return m60990o0(i15, j13);
                }
            } else {
                if (iOrdinal != 28) {
                    throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
                }
                if (j7 != j13) {
                    return m60990o0(i13, j7);
                }
            }
        } else if (j7 != i13) {
            return m60990o0((int) j7, j13);
        }
        return this;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C21676c c21676c = (C21676c) obj;
        int iM16791q = AbstractC5583n.m16791q(this.f83235F, c21676c.f83235F);
        return iM16791q != 0 ? iM16791q : this.f83236G - c21676c.f83236G;
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public final InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        return interfaceC26697j.mo60993b(this.f83235F, EnumC26688a.INSTANT_SECONDS).mo60993b(this.f83236G, EnumC26688a.NANO_OF_SECOND);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21676c) {
            C21676c c21676c = (C21676c) obj;
            if (this.f83235F == c21676c.f83235F && this.f83236G == c21676c.f83236G) {
                return true;
            }
        }
        return false;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return super.mo14017d(interfaceC26700m).m79420a(interfaceC26700m.mo79393e(this), interfaceC26700m);
        }
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        int i13 = this.f83236G;
        if (iOrdinal == 0) {
            return i13;
        }
        if (iOrdinal == 2) {
            return i13 / 1000;
        }
        if (iOrdinal == 4) {
            return i13 / DurationKt.NANOS_IN_MILLIS;
        }
        throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return EnumC26689b.NANOS;
        }
        if (interfaceC26704q == AbstractC26703p.f106199f || interfaceC26704q == AbstractC26703p.f106200g || interfaceC26704q == AbstractC26703p.f106195b || interfaceC26704q == AbstractC26703p.f106194a || interfaceC26704q == AbstractC26703p.f106197d || interfaceC26704q == AbstractC26703p.f106198e) {
            return null;
        }
        return interfaceC26704q.mo43799l(this);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        int i13;
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m.mo79393e(this);
        }
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        int i14 = this.f83236G;
        if (iOrdinal == 0) {
            return i14;
        }
        if (iOrdinal == 2) {
            i13 = i14 / 1000;
        } else {
            if (iOrdinal != 4) {
                if (iOrdinal == 28) {
                    return this.f83235F;
                }
                throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
            }
            i13 = i14 / DurationKt.NANOS_IN_MILLIS;
        }
        return i13;
    }

    public final int hashCode() {
        long j7 = this.f83235F;
        return (this.f83236G * 51) + ((int) (j7 ^ (j7 >>> 32)));
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: i */
    public final InterfaceC26697j mo60995i(long j7, InterfaceC26705r interfaceC26705r) {
        return j7 == Long.MIN_VALUE ? mo60994c(Long.MAX_VALUE, interfaceC26705r).mo60994c(1L, interfaceC26705r) : mo60994c(-j7, interfaceC26705r);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: j */
    public final InterfaceC26697j mo60996j(C21677d c21677d) {
        return (C21676c) c21677d.mo13612e(this);
    }

    /* JADX INFO: renamed from: r0 */
    public final C21676c m60997r0(long j7, long j13) {
        if ((j7 | j13) == 0) {
            return this;
        }
        return m60992q0(AbstractC5583n.m16763W(AbstractC5583n.m16763W(this.f83235F, j7), j13 / 1000000000), ((long) this.f83236G) + (j13 % 1000000000));
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final C21676c mo60994c(long j7, InterfaceC26705r interfaceC26705r) {
        if (!(interfaceC26705r instanceof EnumC26689b)) {
            return (C21676c) interfaceC26705r.mo79396a(this, j7);
        }
        switch ((EnumC26689b) interfaceC26705r) {
            case NANOS:
                return m60997r0(0L, j7);
            case MICROS:
                return m60997r0(j7 / 1000000, (j7 % 1000000) * 1000);
            case MILLIS:
                return m60997r0(j7 / 1000, (j7 % 1000) * 1000000);
            case SECONDS:
                return m60997r0(j7, 0L);
            case MINUTES:
                return m60997r0(AbstractC5583n.m16764X(j7, 60), 0L);
            case HOURS:
                return m60997r0(AbstractC5583n.m16764X(j7, DateTimeConstants.SECONDS_PER_HOUR), 0L);
            case HALF_DAYS:
                return m60997r0(AbstractC5583n.m16764X(j7, 43200), 0L);
            case DAYS:
                return m60997r0(AbstractC5583n.m16764X(j7, DateTimeConstants.SECONDS_PER_DAY), 0L);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC26705r);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final long m60999t0() {
        long j7 = this.f83235F;
        int i13 = this.f83236G;
        return j7 >= 0 ? AbstractC5583n.m16763W(AbstractC5583n.m16765Y(j7, 1000L), i13 / DurationKt.NANOS_IN_MILLIS) : AbstractC5583n.m16768a0(AbstractC5583n.m16765Y(j7 + 1, 1000L), 1000 - ((long) (i13 / DurationKt.NANOS_IN_MILLIS)));
    }

    public final String toString() {
        return C24040b.f95019i.m70942a(this);
    }
}
