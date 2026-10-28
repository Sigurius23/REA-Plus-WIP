package jg3;

import com.whoop.service.network.model.UserSessionDto;
import hc3.AbstractC17176i;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
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

/* JADX INFO: renamed from: jg3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C21679f extends AbstractC4482w implements InterfaceC26697j, InterfaceC26699l, Comparable, Serializable {

    /* JADX INFO: renamed from: J */
    public static final C21679f f83248J;

    /* JADX INFO: renamed from: K */
    public static final C21679f f83249K;

    /* JADX INFO: renamed from: L */
    public static final C21679f[] f83250L = new C21679f[24];

    /* JADX INFO: renamed from: F */
    public final byte f83251F;

    /* JADX INFO: renamed from: G */
    public final byte f83252G;

    /* JADX INFO: renamed from: H */
    public final byte f83253H;

    /* JADX INFO: renamed from: I */
    public final int f83254I;

    static {
        int i13 = 0;
        while (true) {
            C21679f[] c21679fArr = f83250L;
            if (i13 >= c21679fArr.length) {
                C21679f c21679f = c21679fArr[0];
                C21679f c21679f2 = c21679fArr[12];
                f83248J = c21679f;
                f83249K = new C21679f(23, 59, 59, 999999999);
                return;
            }
            c21679fArr[i13] = new C21679f(i13, 0, 0, 0);
            i13++;
        }
    }

    public C21679f(int i13, int i14, int i15, int i16) {
        this.f83251F = (byte) i13;
        this.f83252G = (byte) i14;
        this.f83253H = (byte) i15;
        this.f83254I = i16;
    }

    /* JADX INFO: renamed from: B0 */
    public static C21679f m61028B0(DataInput dataInput) throws IOException {
        int i13;
        int i14;
        int i15 = dataInput.readByte();
        int i16 = 0;
        if (i15 < 0) {
            i15 = ~i15;
            i14 = 0;
            i13 = 0;
        } else {
            byte b = dataInput.readByte();
            if (b < 0) {
                int i17 = ~b;
                i13 = 0;
                i16 = i17;
                i14 = 0;
            } else {
                byte b6 = dataInput.readByte();
                if (b6 < 0) {
                    i14 = ~b6;
                    i13 = 0;
                    i16 = b;
                } else {
                    i13 = dataInput.readInt();
                    i16 = b;
                    i14 = b6;
                }
            }
        }
        return m61032t0(i15, i16, i14, i13);
    }

    /* JADX INFO: renamed from: p0 */
    public static C21679f m61029p0(int i13, int i14, int i15, int i16) {
        return ((i14 | i15) | i16) == 0 ? f83250L[i13] : new C21679f(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: q0 */
    public static C21679f m61030q0(InterfaceC26698k interfaceC26698k) {
        C21679f c21679f = (C21679f) interfaceC26698k.mo14019g(AbstractC26703p.f106200g);
        if (c21679f != null) {
            return c21679f;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + interfaceC26698k + ", type " + interfaceC26698k.getClass().getName());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: s0 */
    public static C21679f m61031s0(int i13, int i14) {
        EnumC26688a.HOUR_OF_DAY.m79394f(i13);
        if (i14 == 0) {
            return f83250L[i13];
        }
        EnumC26688a.MINUTE_OF_HOUR.m79394f(i14);
        return new C21679f(i13, i14, 0, 0);
    }

    /* JADX INFO: renamed from: t0 */
    public static C21679f m61032t0(int i13, int i14, int i15, int i16) {
        EnumC26688a.HOUR_OF_DAY.m79394f(i13);
        EnumC26688a.MINUTE_OF_HOUR.m79394f(i14);
        EnumC26688a.SECOND_OF_MINUTE.m79394f(i15);
        EnumC26688a.NANO_OF_SECOND.m79394f(i16);
        return m61029p0(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: u0 */
    public static C21679f m61033u0(long j7) {
        EnumC26688a.NANO_OF_DAY.m79394f(j7);
        int i13 = (int) (j7 / 3600000000000L);
        long j13 = j7 - (((long) i13) * 3600000000000L);
        int i14 = (int) (j13 / 60000000000L);
        long j14 = j13 - (((long) i14) * 60000000000L);
        int i15 = (int) (j14 / 1000000000);
        return m61029p0(i13, i14, i15, (int) (j14 - (((long) i15) * 1000000000)));
    }

    /* JADX INFO: renamed from: v0 */
    public static C21679f m61034v0(long j7) {
        EnumC26688a.SECOND_OF_DAY.m79394f(j7);
        int i13 = (int) (j7 / 3600);
        long j13 = j7 - ((long) (i13 * DateTimeConstants.SECONDS_PER_HOUR));
        int i14 = (int) (j13 / 60);
        return m61029p0(i13, i14, (int) (j13 - ((long) (i14 * 60))), 0);
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 5);
    }

    /* JADX INFO: renamed from: A0 */
    public final C21679f m61035A0(long j7) {
        if (j7 != 0) {
            int i13 = (this.f83252G * 60) + (this.f83251F * 3600) + this.f83253H;
            int i14 = ((((int) (j7 % 86400)) + i13) + DateTimeConstants.SECONDS_PER_DAY) % DateTimeConstants.SECONDS_PER_DAY;
            if (i13 != i14) {
                return m61029p0(i14 / DateTimeConstants.SECONDS_PER_HOUR, (i14 / 60) % 60, i14 % 60, this.f83254I);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: C0 */
    public final long m61036C0() {
        return (((long) this.f83253H) * 1000000000) + (((long) this.f83252G) * 60000000000L) + (((long) this.f83251F) * 3600000000000L) + ((long) this.f83254I);
    }

    /* JADX INFO: renamed from: D0 */
    public final int m61037D0() {
        return (this.f83252G * 60) + (this.f83251F * 3600) + this.f83253H;
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final C21679f mo60993b(long j7, InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return (C21679f) interfaceC26700m.mo79391c(this, j7);
        }
        EnumC26688a enumC26688a = (EnumC26688a) interfaceC26700m;
        enumC26688a.m79394f(j7);
        int iOrdinal = enumC26688a.ordinal();
        int i13 = this.f83254I;
        byte b = this.f83253H;
        byte b6 = this.f83252G;
        byte b8 = this.f83251F;
        switch (iOrdinal) {
            case 0:
                return m61039G0((int) j7);
            case 1:
                return m61033u0(j7);
            case 2:
                return m61039G0(((int) j7) * 1000);
            case 3:
                return m61033u0(j7 * 1000);
            case 4:
                return m61039G0(((int) j7) * DurationKt.NANOS_IN_MILLIS);
            case 5:
                return m61033u0(j7 * 1000000);
            case 6:
                int i14 = (int) j7;
                if (b != i14) {
                    EnumC26688a.SECOND_OF_MINUTE.m79394f(i14);
                    return m61029p0(b8, b6, i14, i13);
                }
                return this;
            case 7:
                return m61035A0(j7 - ((long) m61037D0()));
            case 8:
                int i15 = (int) j7;
                if (b6 != i15) {
                    EnumC26688a.MINUTE_OF_HOUR.m79394f(i15);
                    return m61029p0(b8, i15, b, i13);
                }
                return this;
            case 9:
                return m61045y0(j7 - ((long) ((b8 * 60) + b6)));
            case 10:
                return m61044x0(j7 - ((long) (b8 % 12)));
            case 11:
                if (j7 == 12) {
                    j7 = 0;
                }
                return m61044x0(j7 - ((long) (b8 % 12)));
            case 12:
                int i16 = (int) j7;
                if (b8 != i16) {
                    EnumC26688a.HOUR_OF_DAY.m79394f(i16);
                    return m61029p0(i16, b6, b, i13);
                }
                return this;
            case 13:
                if (j7 == 24) {
                    j7 = 0;
                }
                int i17 = (int) j7;
                if (b8 != i17) {
                    EnumC26688a.HOUR_OF_DAY.m79394f(i17);
                    return m61029p0(i17, b6, b, i13);
                }
                return this;
            case 14:
                return m61044x0((j7 - ((long) (b8 / 12))) * 12);
            default:
                throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final C21679f m61039G0(int i13) {
        if (this.f83254I == i13) {
            return this;
        }
        EnumC26688a.NANO_OF_SECOND.m79394f(i13);
        return m61029p0(this.f83251F, this.f83252G, this.f83253H, i13);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m61040H0(DataOutput dataOutput) throws IOException {
        byte b = this.f83253H;
        byte b6 = this.f83251F;
        byte b8 = this.f83252G;
        int i13 = this.f83254I;
        if (i13 != 0) {
            dataOutput.writeByte(b6);
            dataOutput.writeByte(b8);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i13);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b6);
            dataOutput.writeByte(b8);
            dataOutput.writeByte(~b);
        } else if (b8 == 0) {
            dataOutput.writeByte(~b6);
        } else {
            dataOutput.writeByte(b6);
            dataOutput.writeByte(~b8);
        }
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return ((EnumC26688a) interfaceC26700m).m79395g();
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // ng3.InterfaceC26699l
    /* JADX INFO: renamed from: e */
    public final InterfaceC26697j mo13612e(InterfaceC26697j interfaceC26697j) {
        return interfaceC26697j.mo60993b(m61036C0(), EnumC26688a.NANO_OF_DAY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21679f) {
            C21679f c21679f = (C21679f) obj;
            if (this.f83251F == c21679f.f83251F && this.f83252G == c21679f.f83252G && this.f83253H == c21679f.f83253H && this.f83254I == c21679f.f83254I) {
                return true;
            }
        }
        return false;
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        return interfaceC26700m instanceof EnumC26688a ? m61042r0(interfaceC26700m) : super.mo14018f(interfaceC26700m);
    }

    @Override // p048ce.AbstractC4482w, ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106196c) {
            return EnumC26689b.NANOS;
        }
        if (interfaceC26704q == AbstractC26703p.f106200g) {
            return this;
        }
        if (interfaceC26704q == AbstractC26703p.f106195b || interfaceC26704q == AbstractC26703p.f106194a || interfaceC26704q == AbstractC26703p.f106197d || interfaceC26704q == AbstractC26703p.f106198e || interfaceC26704q == AbstractC26703p.f106199f) {
            return null;
        }
        return interfaceC26704q.mo43799l(this);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (!(interfaceC26700m instanceof EnumC26688a)) {
            return interfaceC26700m.mo79393e(this);
        }
        if (interfaceC26700m == EnumC26688a.NANO_OF_DAY) {
            return m61036C0();
        }
        return interfaceC26700m == EnumC26688a.MICRO_OF_DAY ? m61036C0() / 1000 : m61042r0(interfaceC26700m);
    }

    public final int hashCode() {
        long jM61036C0 = m61036C0();
        return (int) (jM61036C0 ^ (jM61036C0 >>> 32));
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: i */
    public final InterfaceC26697j mo60995i(long j7, InterfaceC26705r interfaceC26705r) {
        return j7 == Long.MIN_VALUE ? mo60994c(Long.MAX_VALUE, interfaceC26705r).mo60994c(1L, interfaceC26705r) : mo60994c(-j7, interfaceC26705r);
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: j */
    public final InterfaceC26697j mo60996j(C21677d c21677d) {
        return (C21679f) c21677d.mo13612e(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C21679f c21679f) {
        int i13;
        byte b = c21679f.f83251F;
        byte b6 = this.f83251F;
        if (b6 < b) {
            i13 = -1;
        } else {
            i13 = b6 > b ? 1 : 0;
        }
        if (i13 == 0) {
            byte b8 = c21679f.f83252G;
            byte b14 = this.f83252G;
            if (b14 < b8) {
                i13 = -1;
            } else {
                i13 = b14 > b8 ? 1 : 0;
            }
            if (i13 == 0) {
                byte b15 = c21679f.f83253H;
                byte b16 = this.f83253H;
                if (b16 < b15) {
                    i13 = -1;
                } else {
                    i13 = b16 > b15 ? 1 : 0;
                }
                if (i13 == 0) {
                    int i14 = c21679f.f83254I;
                    int i15 = this.f83254I;
                    if (i15 < i14) {
                        return -1;
                    }
                    return i15 > i14 ? 1 : 0;
                }
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: r0 */
    public final int m61042r0(InterfaceC26700m interfaceC26700m) {
        int iOrdinal = ((EnumC26688a) interfaceC26700m).ordinal();
        byte b = this.f83252G;
        int i13 = this.f83254I;
        byte b6 = this.f83251F;
        switch (iOrdinal) {
            case 0:
                return i13;
            case 1:
                throw new DateTimeException(AbstractC17176i.m48504f("Field too large for an int: ", interfaceC26700m));
            case 2:
                return i13 / 1000;
            case 3:
                throw new DateTimeException(AbstractC17176i.m48504f("Field too large for an int: ", interfaceC26700m));
            case 4:
                return i13 / DurationKt.NANOS_IN_MILLIS;
            case 5:
                return (int) (m61036C0() / 1000000);
            case 6:
                return this.f83253H;
            case 7:
                return m61037D0();
            case 8:
                return b;
            case 9:
                return (b6 * 60) + b;
            case 10:
                return b6 % 12;
            case 11:
                int i14 = b6 % 12;
                if (i14 % 12 == 0) {
                    return 12;
                }
                return i14;
            case 13:
                if (b6 == 0) {
                    return 24;
                }
            case 12:
                return b6;
            case 14:
                return b6 / 12;
            default:
                throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(18);
        byte b = this.f83251F;
        sb4.append(b < 10 ? UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE : "");
        sb4.append((int) b);
        byte b6 = this.f83252G;
        sb4.append(b6 < 10 ? ":0" : ":");
        sb4.append((int) b6);
        byte b8 = this.f83253H;
        int i13 = this.f83254I;
        if (b8 > 0 || i13 > 0) {
            sb4.append(b8 < 10 ? ":0" : ":");
            sb4.append((int) b8);
            if (i13 > 0) {
                sb4.append('.');
                if (i13 % DurationKt.NANOS_IN_MILLIS == 0) {
                    sb4.append(Integer.toString((i13 / DurationKt.NANOS_IN_MILLIS) + 1000).substring(1));
                } else if (i13 % 1000 == 0) {
                    sb4.append(Integer.toString((i13 / 1000) + DurationKt.NANOS_IN_MILLIS).substring(1));
                } else {
                    sb4.append(Integer.toString(i13 + 1000000000).substring(1));
                }
            }
        }
        return sb4.toString();
    }

    @Override // ng3.InterfaceC26697j
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final C21679f mo60994c(long j7, InterfaceC26705r interfaceC26705r) {
        if (!(interfaceC26705r instanceof EnumC26689b)) {
            return (C21679f) interfaceC26705r.mo79396a(this, j7);
        }
        switch ((EnumC26689b) interfaceC26705r) {
            case NANOS:
                return m61046z0(j7);
            case MICROS:
                return m61046z0((j7 % 86400000000L) * 1000);
            case MILLIS:
                return m61046z0((j7 % DurationKt.MILLIS_IN_DAY) * 1000000);
            case SECONDS:
                return m61035A0(j7);
            case MINUTES:
                return m61045y0(j7);
            case HOURS:
                return m61044x0(j7);
            case HALF_DAYS:
                return m61044x0((j7 % 2) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + interfaceC26705r);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final C21679f m61044x0(long j7) {
        if (j7 == 0) {
            return this;
        }
        return m61029p0(((((int) (j7 % 24)) + this.f83251F) + 24) % 24, this.f83252G, this.f83253H, this.f83254I);
    }

    /* JADX INFO: renamed from: y0 */
    public final C21679f m61045y0(long j7) {
        if (j7 != 0) {
            int i13 = (this.f83251F * 60) + this.f83252G;
            int i14 = ((((int) (j7 % 1440)) + i13) + DateTimeConstants.MINUTES_PER_DAY) % DateTimeConstants.MINUTES_PER_DAY;
            if (i13 != i14) {
                return m61029p0(i14 / 60, i14 % 60, this.f83253H, this.f83254I);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: z0 */
    public final C21679f m61046z0(long j7) {
        if (j7 != 0) {
            long jM61036C0 = m61036C0();
            long j13 = (((j7 % 86400000000000L) + jM61036C0) + 86400000000000L) % 86400000000000L;
            if (jM61036C0 != j13) {
                return m61029p0((int) (j13 / 3600000000000L), (int) ((j13 / 60000000000L) % 60), (int) ((j13 / 1000000000) % 60), (int) (j13 % 1000000000));
            }
        }
        return this;
    }
}
