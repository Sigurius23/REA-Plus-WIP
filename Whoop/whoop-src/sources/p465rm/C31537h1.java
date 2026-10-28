package p465rm;

import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: rm.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31537h1 {

    /* JADX INFO: renamed from: c */
    public static final C31537h1 f130167c;

    /* JADX INFO: renamed from: a */
    public final long f130168a;

    /* JADX INFO: renamed from: b */
    public final long f130169b;

    static {
        C31537h1 c31537h1 = new C31537h1(0L, 0L);
        new C31537h1(Long.MAX_VALUE, Long.MAX_VALUE);
        new C31537h1(Long.MAX_VALUE, 0L);
        new C31537h1(0L, Long.MAX_VALUE);
        f130167c = c31537h1;
    }

    public C31537h1(long j7, long j13) {
        AbstractC24543a.m71569e(j7 >= 0);
        AbstractC24543a.m71569e(j13 >= 0);
        this.f130168a = j7;
        this.f130169b = j13;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d A[RETURN] */
    /* JADX INFO: renamed from: a */
    public final long m97143a(long j7, long j13, long j14) {
        long j15 = this.f130168a;
        long j16 = this.f130169b;
        if (j15 == 0 && j16 == 0) {
            return j7;
        }
        int i13 = AbstractC24567y.f95875a;
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
        if (obj != null && C31537h1.class == obj.getClass()) {
            C31537h1 c31537h1 = (C31537h1) obj;
            if (this.f130168a == c31537h1.f130168a && this.f130169b == c31537h1.f130169b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f130168a) * 31) + ((int) this.f130169b);
    }
}
