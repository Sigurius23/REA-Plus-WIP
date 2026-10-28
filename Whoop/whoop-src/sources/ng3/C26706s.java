package ng3;

import java.io.Serializable;
import org.threeten.p379bp.DateTimeException;

/* JADX INFO: renamed from: ng3.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C26706s implements Serializable {

    /* JADX INFO: renamed from: w */
    public final long f106201w;

    /* JADX INFO: renamed from: x */
    public final long f106202x;

    /* JADX INFO: renamed from: y */
    public final long f106203y;

    /* JADX INFO: renamed from: z */
    public final long f106204z;

    public C26706s(long j7, long j13, long j14, long j15) {
        this.f106201w = j7;
        this.f106202x = j13;
        this.f106203y = j14;
        this.f106204z = j15;
    }

    /* JADX INFO: renamed from: c */
    public static C26706s m79418c(long j7, long j13) {
        if (j7 <= j13) {
            return new C26706s(j7, j7, j13, j13);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* JADX INFO: renamed from: d */
    public static C26706s m79419d(long j7, long j13) {
        if (j7 > j13) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 <= j13) {
            return new C26706s(1L, 1L, j7, j13);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    /* JADX INFO: renamed from: a */
    public final int m79420a(long j7, InterfaceC26700m interfaceC26700m) {
        long j13 = this.f106201w;
        if (j13 >= -2147483648L) {
            long j14 = this.f106204z;
            if (j14 <= 2147483647L && j7 >= j13 && j7 <= j14) {
                return (int) j7;
            }
        }
        throw new DateTimeException("Invalid int value for " + interfaceC26700m + ": " + j7);
    }

    /* JADX INFO: renamed from: b */
    public final void m79421b(long j7, InterfaceC26700m interfaceC26700m) {
        if (j7 < this.f106201w || j7 > this.f106204z) {
            if (interfaceC26700m == null) {
                throw new DateTimeException("Invalid value (valid values " + this + "): " + j7);
            }
            throw new DateTimeException("Invalid value for " + interfaceC26700m + " (valid values " + this + "): " + j7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26706s) {
            C26706s c26706s = (C26706s) obj;
            if (this.f106201w == c26706s.f106201w && this.f106202x == c26706s.f106202x && this.f106203y == c26706s.f106203y && this.f106204z == c26706s.f106204z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f106201w;
        long j13 = this.f106202x;
        long j14 = (j7 + j13) << ((int) (j13 + 16));
        long j15 = this.f106203y;
        long j16 = (j14 >> ((int) (j15 + 48))) << ((int) (j15 + 32));
        long j17 = this.f106204z;
        long j18 = ((j16 >> ((int) (32 + j17))) << ((int) (j17 + 48))) >> 16;
        return (int) (j18 ^ (j18 >>> 32));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        long j7 = this.f106201w;
        sb4.append(j7);
        long j13 = this.f106202x;
        if (j7 != j13) {
            sb4.append('/');
            sb4.append(j13);
        }
        sb4.append(" - ");
        long j14 = this.f106203y;
        sb4.append(j14);
        long j15 = this.f106204z;
        if (j14 != j15) {
            sb4.append('/');
            sb4.append(j15);
        }
        return sb4.toString();
    }
}
