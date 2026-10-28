package jg3;

import com.squareup.wire.AbstractC5583n;
import com.whoop.service.network.model.UserSessionDto;
import hc3.AbstractC17176i;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.concurrent.ConcurrentHashMap;
import ng3.AbstractC26703p;
import ng3.C26706s;
import ng3.EnumC26688a;
import ng3.InterfaceC26697j;
import ng3.InterfaceC26698k;
import ng3.InterfaceC26699l;
import ng3.InterfaceC26700m;
import ng3.InterfaceC26704q;
import og3.AbstractC27929h;
import og3.C27928g;
import org.joda.time.DateTimeConstants;
import org.threeten.p379bp.DateTimeException;
import org.threeten.p379bp.temporal.UnsupportedTemporalTypeException;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: jg3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C21689p extends AbstractC21688o implements InterfaceC26698k, InterfaceC26699l, Comparable {

    /* JADX INFO: renamed from: x */
    public final int f83282x;

    /* JADX INFO: renamed from: y */
    public final transient String f83283y;

    /* JADX INFO: renamed from: z */
    public static final ConcurrentHashMap f83281z = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: E */
    public static final ConcurrentHashMap f83277E = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: F */
    public static final C21689p f83278F = m61076r(0);

    /* JADX INFO: renamed from: G */
    public static final C21689p f83279G = m61076r(-64800);

    /* JADX INFO: renamed from: H */
    public static final C21689p f83280H = m61076r(64800);

    public C21689p(int i13) {
        String string;
        this.f83282x = i13;
        if (i13 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i13);
            StringBuilder sb4 = new StringBuilder();
            int i14 = iAbs / DateTimeConstants.SECONDS_PER_HOUR;
            int i15 = (iAbs / 60) % 60;
            sb4.append(i13 < 0 ? "-" : "+");
            sb4.append(i14 < 10 ? UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE : "");
            sb4.append(i14);
            sb4.append(i15 < 10 ? ":0" : ":");
            sb4.append(i15);
            int i16 = iAbs % 60;
            if (i16 != 0) {
                sb4.append(i16 < 10 ? ":0" : ":");
                sb4.append(i16);
            }
            string = sb4.toString();
        }
        this.f83283y = string;
    }

    /* JADX INFO: renamed from: o */
    public static C21689p m61073o(InterfaceC26698k interfaceC26698k) {
        C21689p c21689p = (C21689p) interfaceC26698k.mo14019g(AbstractC26703p.f106198e);
        if (c21689p != null) {
            return c21689p;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + interfaceC26698k + ", type " + interfaceC26698k.getClass().getName());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX INFO: renamed from: p */
    public static C21689p m61074p(String str) {
        int iM61077s;
        int iM61077s2;
        int iM61077s3;
        char cCharAt;
        AbstractC5583n.m16762V(str, "offsetId");
        C21689p c21689p = (C21689p) f83277E.get(str);
        if (c21689p != null) {
            return c21689p;
        }
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                if (length == 5) {
                    iM61077s = m61077s(1, str, false);
                    iM61077s2 = m61077s(3, str, false);
                } else if (length == 6) {
                    iM61077s = m61077s(1, str, false);
                    iM61077s2 = m61077s(4, str, true);
                } else if (length == 7) {
                    iM61077s = m61077s(1, str, false);
                    iM61077s2 = m61077s(3, str, false);
                    iM61077s3 = m61077s(5, str, false);
                } else {
                    if (length != 9) {
                        throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                    }
                    iM61077s = m61077s(1, str, false);
                    iM61077s2 = m61077s(4, str, true);
                    iM61077s3 = m61077s(7, str, true);
                }
                iM61077s3 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt != '+' || cCharAt == '-') {
                return cCharAt == '-' ? m61075q(-iM61077s, -iM61077s2, -iM61077s3) : m61075q(iM61077s, iM61077s2, iM61077s3);
            }
            throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
        }
        str = str.charAt(0) + UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE + str.charAt(1);
        iM61077s = m61077s(1, str, false);
        iM61077s2 = 0;
        iM61077s3 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt != '+') {
        }
        if (cCharAt == '-') {
        }
    }

    /* JADX INFO: renamed from: q */
    public static C21689p m61075q(int i13, int i14, int i15) {
        if (i13 < -18 || i13 > 18) {
            throw new DateTimeException(AbstractC2875y.m8296i(i13, "Zone offset hours not in valid range: value ", " is not in the range -18 to 18"));
        }
        if (i13 > 0) {
            if (i14 < 0 || i15 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i13 < 0) {
            if (i14 > 0 || i15 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i14 > 0 && i15 < 0) || (i14 < 0 && i15 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i14) > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: abs(value) " + Math.abs(i14) + " is not in the range 0 to 59");
        }
        if (Math.abs(i15) > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: abs(value) " + Math.abs(i15) + " is not in the range 0 to 59");
        }
        if (Math.abs(i13) == 18 && (Math.abs(i14) > 0 || Math.abs(i15) > 0)) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        return m61076r((i14 * 60) + (i13 * DateTimeConstants.SECONDS_PER_HOUR) + i15);
    }

    /* JADX INFO: renamed from: r */
    public static C21689p m61076r(int i13) {
        if (Math.abs(i13) > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i13 % 900 != 0) {
            return new C21689p(i13);
        }
        Integer numValueOf = Integer.valueOf(i13);
        ConcurrentHashMap concurrentHashMap = f83281z;
        C21689p c21689p = (C21689p) concurrentHashMap.get(numValueOf);
        if (c21689p != null) {
            return c21689p;
        }
        concurrentHashMap.putIfAbsent(numValueOf, new C21689p(i13));
        C21689p c21689p2 = (C21689p) concurrentHashMap.get(numValueOf);
        f83277E.putIfAbsent(c21689p2.f83283y, c21689p2);
        return c21689p2;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: renamed from: s */
    public static int m61077s(int i13, String str, boolean z4) {
        if (z4 && str.charAt(i13 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i13);
        char cCharAt2 = str.charAt(i13 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    /* JADX INFO: renamed from: t */
    public static C21689p m61078t(DataInput dataInput) {
        byte b = dataInput.readByte();
        return b == 127 ? m61076r(dataInput.readInt()) : m61076r(b * 900);
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 8);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: a */
    public final boolean mo60986a(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m instanceof EnumC26688a) {
            return interfaceC26700m == EnumC26688a.OFFSET_SECONDS;
        }
        return interfaceC26700m != null && interfaceC26700m.mo79390b(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C21689p) obj).f83282x - this.f83282x;
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: d */
    public final C26706s mo14017d(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m == EnumC26688a.OFFSET_SECONDS) {
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
        return interfaceC26697j.mo60993b(this.f83282x, EnumC26688a.OFFSET_SECONDS);
    }

    @Override // jg3.AbstractC21688o
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21689p) {
            if (this.f83282x == ((C21689p) obj).f83282x) {
                return true;
            }
        }
        return false;
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: f */
    public final int mo14018f(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m == EnumC26688a.OFFSET_SECONDS) {
            return this.f83282x;
        }
        if (interfaceC26700m instanceof EnumC26688a) {
            throw new UnsupportedTemporalTypeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
        return mo14017d(interfaceC26700m).m79420a(mo60987h(interfaceC26700m), interfaceC26700m);
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: g */
    public final Object mo14019g(InterfaceC26704q interfaceC26704q) {
        if (interfaceC26704q == AbstractC26703p.f106198e || interfaceC26704q == AbstractC26703p.f106197d) {
            return this;
        }
        if (interfaceC26704q == AbstractC26703p.f106199f || interfaceC26704q == AbstractC26703p.f106200g || interfaceC26704q == AbstractC26703p.f106196c || interfaceC26704q == AbstractC26703p.f106195b || interfaceC26704q == AbstractC26703p.f106194a) {
            return null;
        }
        return interfaceC26704q.mo43799l(this);
    }

    @Override // jg3.AbstractC21688o
    public final String getId() {
        return this.f83283y;
    }

    @Override // ng3.InterfaceC26698k
    /* JADX INFO: renamed from: h */
    public final long mo60987h(InterfaceC26700m interfaceC26700m) {
        if (interfaceC26700m == EnumC26688a.OFFSET_SECONDS) {
            return this.f83282x;
        }
        if (interfaceC26700m instanceof EnumC26688a) {
            throw new DateTimeException(AbstractC17176i.m48504f("Unsupported field: ", interfaceC26700m));
        }
        return interfaceC26700m.mo79393e(this);
    }

    @Override // jg3.AbstractC21688o
    public final int hashCode() {
        return this.f83282x;
    }

    @Override // jg3.AbstractC21688o
    /* JADX INFO: renamed from: k */
    public final AbstractC27929h mo61071k() {
        return new C27928g(this);
    }

    @Override // jg3.AbstractC21688o
    /* JADX INFO: renamed from: n */
    public final void mo61072n(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        m61079u(objectOutput);
    }

    @Override // jg3.AbstractC21688o
    public final String toString() {
        return this.f83283y;
    }

    /* JADX INFO: renamed from: u */
    public final void m61079u(DataOutput dataOutput) {
        int i13 = this.f83282x;
        int i14 = i13 % 900 == 0 ? i13 / 900 : 127;
        dataOutput.writeByte(i14);
        if (i14 == 127) {
            dataOutput.writeInt(i13);
        }
    }
}
