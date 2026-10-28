package i93;

import d93.InterfaceC11820a;
import java.util.Iterator;

/* JADX INFO: renamed from: i93.k */
/* JADX INFO: loaded from: classes3.dex */
public class C18285k implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final long f71141w;

    /* JADX INFO: renamed from: x */
    public final long f71142x;

    /* JADX INFO: renamed from: y */
    public final long f71143y;

    public C18285k(long j7, long j13, long j14) {
        if (j14 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j14 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f71141w = j7;
        if (j14 > 0) {
            if (j7 < j13) {
                long j15 = j13 % j14;
                long j16 = j7 % j14;
                long j17 = ((j15 < 0 ? j15 + j14 : j15) - (j16 < 0 ? j16 + j14 : j16)) % j14;
                j13 -= j17 < 0 ? j17 + j14 : j17;
            }
        } else {
            if (j14 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j7 > j13) {
                long j18 = -j14;
                long j19 = j7 % j18;
                long j24 = j13 % j18;
                long j25 = ((j19 < 0 ? j19 + j18 : j19) - (j24 < 0 ? j24 + j18 : j24)) % j18;
                j13 += j25 < 0 ? j25 + j18 : j25;
            }
        }
        this.f71142x = j13;
        this.f71143y = j14;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18285k)) {
            return false;
        }
        if (isEmpty() && ((C18285k) obj).isEmpty()) {
            return true;
        }
        C18285k c18285k = (C18285k) obj;
        return this.f71141w == c18285k.f71141w && this.f71142x == c18285k.f71142x && this.f71143y == c18285k.f71143y;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j7 = 31;
        long j13 = this.f71141w;
        long j14 = this.f71142x;
        long j15 = (((j13 ^ (j13 >>> 32)) * j7) + (j14 ^ (j14 >>> 32))) * j7;
        long j16 = this.f71143y;
        return (int) (j15 + (j16 ^ (j16 >>> 32)));
    }

    public boolean isEmpty() {
        long j7 = this.f71143y;
        long j13 = this.f71142x;
        long j14 = this.f71141w;
        if (j7 > 0) {
            return j14 > j13;
        }
        return j14 < j13;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C18286l(this.f71141w, this.f71142x, this.f71143y);
    }

    public String toString() {
        StringBuilder sb4;
        long j7 = this.f71143y;
        long j13 = this.f71142x;
        long j14 = this.f71141w;
        if (j7 > 0) {
            sb4 = new StringBuilder();
            sb4.append(j14);
            sb4.append("..");
            sb4.append(j13);
            sb4.append(" step ");
            sb4.append(j7);
        } else {
            sb4 = new StringBuilder();
            sb4.append(j14);
            sb4.append(" downTo ");
            sb4.append(j13);
            sb4.append(" step ");
            sb4.append(-j7);
        }
        return sb4.toString();
    }
}
