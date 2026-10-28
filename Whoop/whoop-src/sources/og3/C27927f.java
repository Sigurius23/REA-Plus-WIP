package og3;

import com.squareup.wire.AbstractC5583n;
import java.io.DataInput;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import jg3.C21679f;
import jg3.C21689p;
import jg3.EnumC21674a;
import jg3.EnumC21680g;
import org.joda.time.DateTimeConstants;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: og3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C27927f implements Serializable {

    /* JADX INFO: renamed from: E */
    public final int f112637E;

    /* JADX INFO: renamed from: F */
    public final int f112638F;

    /* JADX INFO: renamed from: G */
    public final C21689p f112639G;

    /* JADX INFO: renamed from: H */
    public final C21689p f112640H;

    /* JADX INFO: renamed from: I */
    public final C21689p f112641I;

    /* JADX INFO: renamed from: w */
    public final EnumC21680g f112642w;

    /* JADX INFO: renamed from: x */
    public final byte f112643x;

    /* JADX INFO: renamed from: y */
    public final EnumC21674a f112644y;

    /* JADX INFO: renamed from: z */
    public final C21679f f112645z;

    public C27927f(EnumC21680g enumC21680g, int i13, EnumC21674a enumC21674a, C21679f c21679f, int i14, int i15, C21689p c21689p, C21689p c21689p2, C21689p c21689p3) {
        this.f112642w = enumC21680g;
        this.f112643x = (byte) i13;
        this.f112644y = enumC21674a;
        this.f112645z = c21679f;
        this.f112637E = i14;
        this.f112638F = i15;
        this.f112639G = c21689p;
        this.f112640H = c21689p2;
        this.f112641I = c21689p3;
    }

    /* JADX INFO: renamed from: a */
    public static C27927f m84275a(DataInput dataInput) throws IOException {
        int i13 = dataInput.readInt();
        EnumC21680g enumC21680gM61047o = EnumC21680g.m61047o(i13 >>> 28);
        int i14 = ((264241152 & i13) >>> 22) - 32;
        int i15 = (3670016 & i13) >>> 19;
        EnumC21674a enumC21674aM60985l = i15 == 0 ? null : EnumC21674a.m60985l(i15);
        int i16 = (507904 & i13) >>> 14;
        int i17 = AbstractC12682p.m35486f(3)[(i13 & 12288) >>> 12];
        int i18 = (i13 & 4080) >>> 4;
        int i19 = (i13 & 12) >>> 2;
        int i24 = i13 & 3;
        int i25 = i16 == 31 ? dataInput.readInt() : i16 * DateTimeConstants.SECONDS_PER_HOUR;
        C21689p c21689pM61076r = C21689p.m61076r(i18 == 255 ? dataInput.readInt() : (i18 - 128) * 900);
        int i26 = c21689pM61076r.f83282x;
        C21689p c21689pM61076r2 = C21689p.m61076r(i19 == 3 ? dataInput.readInt() : (i19 * 1800) + i26);
        C21689p c21689pM61076r3 = i24 == 3 ? C21689p.m61076r(dataInput.readInt()) : C21689p.m61076r((i24 * 1800) + i26);
        if (i14 < -28 || i14 > 31 || i14 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new C27927f(enumC21680gM61047o, i14, enumC21674aM60985l, C21679f.m61034v0(((i25 % DateTimeConstants.SECONDS_PER_DAY) + DateTimeConstants.SECONDS_PER_DAY) % DateTimeConstants.SECONDS_PER_DAY), i25 >= 0 ? i25 / DateTimeConstants.SECONDS_PER_DAY : ((i25 + 1) / DateTimeConstants.SECONDS_PER_DAY) - 1, i17, c21689pM61076r, c21689pM61076r2, c21689pM61076r3);
    }

    private Object writeReplace() {
        return new C27922a((byte) 3, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C27927f)) {
            return false;
        }
        C27927f c27927f = (C27927f) obj;
        return this.f112642w == c27927f.f112642w && this.f112643x == c27927f.f112643x && this.f112644y == c27927f.f112644y && this.f112638F == c27927f.f112638F && this.f112637E == c27927f.f112637E && this.f112645z.equals(c27927f.f112645z) && this.f112639G.equals(c27927f.f112639G) && this.f112640H.equals(c27927f.f112640H) && this.f112641I.equals(c27927f.f112641I);
    }

    public final int hashCode() {
        int iM61037D0 = ((this.f112645z.m61037D0() + this.f112637E) << 15) + (this.f112642w.ordinal() << 11) + ((this.f112643x + 32) << 5);
        EnumC21674a enumC21674a = this.f112644y;
        return ((this.f112639G.f83282x ^ (AbstractC12682p.m35485e(this.f112638F) + (iM61037D0 + ((enumC21674a == null ? 7 : enumC21674a.ordinal()) << 2)))) ^ this.f112640H.f83282x) ^ this.f112641I.f83282x;
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("TransitionRule[");
        C21689p c21689p = this.f112641I;
        int i13 = c21689p.f83282x;
        C21689p c21689p2 = this.f112640H;
        sb4.append(i13 - c21689p2.f83282x > 0 ? "Gap " : "Overlap ");
        sb4.append(c21689p2);
        sb4.append(" to ");
        sb4.append(c21689p);
        sb4.append(", ");
        EnumC21680g enumC21680g = this.f112642w;
        byte b = this.f112643x;
        EnumC21674a enumC21674a = this.f112644y;
        if (enumC21674a == null) {
            sb4.append(enumC21680g.name());
            sb4.append(' ');
            sb4.append((int) b);
        } else if (b == -1) {
            sb4.append(enumC21674a.name());
            sb4.append(" on or before last day of ");
            sb4.append(enumC21680g.name());
        } else if (b < 0) {
            sb4.append(enumC21674a.name());
            sb4.append(" on or before last day minus ");
            sb4.append((-b) - 1);
            sb4.append(" of ");
            sb4.append(enumC21680g.name());
        } else {
            sb4.append(enumC21674a.name());
            sb4.append(" on or after ");
            sb4.append(enumC21680g.name());
            sb4.append(' ');
            sb4.append((int) b);
        }
        sb4.append(" at ");
        C21679f c21679f = this.f112645z;
        int i14 = this.f112637E;
        if (i14 == 0) {
            sb4.append(c21679f);
        } else {
            long jM61037D0 = (i14 * DateTimeConstants.MINUTES_PER_DAY) + (c21679f.m61037D0() / 60);
            long jM16742A = AbstractC5583n.m16742A(jM61037D0, 60L);
            if (jM16742A < 10) {
                sb4.append(0);
            }
            sb4.append(jM16742A);
            sb4.append(':');
            long jM16743B = AbstractC5583n.m16743B(60, jM61037D0);
            if (jM16743B < 10) {
                sb4.append(0);
            }
            sb4.append(jM16743B);
        }
        sb4.append(" ");
        int i15 = this.f112638F;
        if (i15 == 1) {
            str = "UTC";
        } else if (i15 != 2) {
            str = i15 != 3 ? "null" : "STANDARD";
        } else {
            str = "WALL";
        }
        sb4.append(str);
        sb4.append(", standard offset ");
        sb4.append(this.f112639G);
        sb4.append(']');
        return sb4.toString();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        byte b;
        C21679f c21679f = this.f112645z;
        int iM61037D0 = (this.f112637E * DateTimeConstants.SECONDS_PER_DAY) + c21679f.m61037D0();
        int i13 = this.f112639G.f83282x;
        int i14 = this.f112640H.f83282x;
        int i15 = i14 - i13;
        int i16 = this.f112641I.f83282x;
        int i17 = i16 - i13;
        if (iM61037D0 % DateTimeConstants.SECONDS_PER_HOUR != 0 || iM61037D0 > 86400) {
            b = 31;
        } else {
            b = iM61037D0 == 86400 ? (byte) 24 : c21679f.f83251F;
        }
        int i18 = i13 % 900 == 0 ? (i13 / 900) + 128 : 255;
        int i19 = (i15 == 0 || i15 == 1800 || i15 == 3600) ? i15 / 1800 : 3;
        int i24 = (i17 == 0 || i17 == 1800 || i17 == 3600) ? i17 / 1800 : 3;
        EnumC21674a enumC21674a = this.f112644y;
        objectOutput.writeInt((this.f112642w.m61049l() << 28) + ((this.f112643x + 32) << 22) + ((enumC21674a == null ? 0 : enumC21674a.m60988k()) << 19) + (b << 14) + (AbstractC12682p.m35485e(this.f112638F) << 12) + (i18 << 4) + (i19 << 2) + i24);
        if (b == 31) {
            objectOutput.writeInt(iM61037D0);
        }
        if (i18 == 255) {
            objectOutput.writeInt(i13);
        }
        if (i19 == 3) {
            objectOutput.writeInt(i14);
        }
        if (i24 == 3) {
            objectOutput.writeInt(i16);
        }
    }
}
