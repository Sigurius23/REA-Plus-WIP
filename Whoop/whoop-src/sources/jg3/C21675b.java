package jg3;

import com.squareup.wire.AbstractC5583n;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: jg3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C21675b implements Comparable, Serializable {

    /* JADX INFO: renamed from: y */
    public static final C21675b f83231y = new C21675b(0, 0);

    /* JADX INFO: renamed from: w */
    public final long f83232w;

    /* JADX INFO: renamed from: x */
    public final int f83233x;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public C21675b(long j7, int i13) {
        this.f83232w = j7;
        this.f83233x = i13;
    }

    /* JADX INFO: renamed from: a */
    public static C21675b m60989a(int i13, long j7) {
        return (((long) i13) | j7) == 0 ? f83231y : new C21675b(j7, i13);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C21685l(this, (byte) 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C21675b c21675b = (C21675b) obj;
        int iM16791q = AbstractC5583n.m16791q(this.f83232w, c21675b.f83232w);
        return iM16791q != 0 ? iM16791q : this.f83233x - c21675b.f83233x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21675b) {
            C21675b c21675b = (C21675b) obj;
            if (this.f83232w == c21675b.f83232w && this.f83233x == c21675b.f83233x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f83232w;
        return (this.f83233x * 51) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        if (this == f83231y) {
            return "PT0S";
        }
        long j7 = this.f83232w;
        long j13 = j7 / 3600;
        int i13 = (int) ((j7 % 3600) / 60);
        int i14 = (int) (j7 % 60);
        StringBuilder sb4 = new StringBuilder(24);
        sb4.append("PT");
        if (j13 != 0) {
            sb4.append(j13);
            sb4.append('H');
        }
        if (i13 != 0) {
            sb4.append(i13);
            sb4.append('M');
        }
        int i15 = this.f83233x;
        if (i14 == 0 && i15 == 0 && sb4.length() > 2) {
            return sb4.toString();
        }
        if (i14 >= 0 || i15 <= 0) {
            sb4.append(i14);
        } else if (i14 == -1) {
            sb4.append("-0");
        } else {
            sb4.append(i14 + 1);
        }
        if (i15 > 0) {
            int length = sb4.length();
            if (i14 < 0) {
                sb4.append(2000000000 - i15);
            } else {
                sb4.append(i15 + 1000000000);
            }
            while (sb4.charAt(sb4.length() - 1) == '0') {
                sb4.setLength(sb4.length() - 1);
            }
            sb4.setCharAt(length, '.');
        }
        sb4.append('S');
        return sb4.toString();
    }
}
