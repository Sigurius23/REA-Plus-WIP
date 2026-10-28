package p031b9;

import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2846k1 {

    /* JADX INFO: renamed from: c */
    public static final C2846k1 f11247c;

    /* JADX INFO: renamed from: a */
    public final long f11248a;

    /* JADX INFO: renamed from: b */
    public final long f11249b;

    static {
        C2846k1 c2846k1 = new C2846k1(0L, 0L);
        new C2846k1(Long.MAX_VALUE, Long.MAX_VALUE);
        new C2846k1(Long.MAX_VALUE, 0L);
        new C2846k1(0L, Long.MAX_VALUE);
        f11247c = c2846k1;
    }

    public C2846k1(long j7, long j13) {
        AbstractC35849g.m113802d(j7 >= 0);
        AbstractC35849g.m113802d(j13 >= 0);
        this.f11248a = j7;
        this.f11249b = j13;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d A[RETURN] */
    /* JADX INFO: renamed from: a */
    public final long m8161a(long j7, long j13, long j14) {
        long j15 = this.f11248a;
        long j16 = this.f11249b;
        if (j15 == 0 && j16 == 0) {
            return j7;
        }
        int i13 = AbstractC38065t.f163031a;
        long j17 = j7 - j15;
        if (((j15 ^ j7) & (j7 ^ j17)) < 0) {
            j17 = Long.MIN_VALUE;
        }
        long j18 = j7 + j16;
        if (((j16 ^ j18) & (j7 ^ j18)) < 0) {
            j18 = Long.MAX_VALUE;
        }
        boolean z4 = false;
        boolean z13 = j17 <= j13 && j13 <= j18;
        if (j17 <= j14 && j14 <= j18) {
            z4 = true;
        }
        if (z13 && z4) {
            if (Math.abs(j13 - j7) <= Math.abs(j14 - j7)) {
                return j13;
            }
            return j14;
        }
        if (!z13) {
            if (z4) {
                return j14;
            }
            return j17;
        }
        return j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2846k1.class == obj.getClass()) {
            C2846k1 c2846k1 = (C2846k1) obj;
            if (this.f11248a == c2846k1.f11248a && this.f11249b == c2846k1.f11249b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f11248a) * 31) + ((int) this.f11249b);
    }
}
