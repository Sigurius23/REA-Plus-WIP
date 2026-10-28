package p465rm;

import p309lo.AbstractC24567y;
import tn.C33955a;
import tn.C33956b;

/* JADX INFO: renamed from: rm.m1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31552m1 implements InterfaceC31529f {

    /* JADX INFO: renamed from: E */
    public long f130281E;

    /* JADX INFO: renamed from: F */
    public boolean f130282F;

    /* JADX INFO: renamed from: G */
    public C33956b f130283G = C33956b.f142378F;

    /* JADX INFO: renamed from: w */
    public Object f130284w;

    /* JADX INFO: renamed from: x */
    public Object f130285x;

    /* JADX INFO: renamed from: y */
    public int f130286y;

    /* JADX INFO: renamed from: z */
    public long f130287z;

    /* JADX INFO: renamed from: a */
    public final long m97150a(int i13, int i14) {
        C33955a c33955aM107404a = this.f130283G.m107404a(i13);
        if (c33955aM107404a.f142375x != -1) {
            return c33955aM107404a.f142371E[i14];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public final int m97151b(long j7) {
        C33955a c33955aM107404a;
        int i13;
        C33956b c33956b = this.f130283G;
        long j13 = this.f130287z;
        int i14 = c33956b.f142382w;
        if (j7 != Long.MIN_VALUE && (j13 == -9223372036854775807L || j7 < j13)) {
            int i15 = c33956b.f142385z;
            while (i15 < i14 && ((c33956b.m107404a(i15).f142374w != Long.MIN_VALUE && c33956b.m107404a(i15).f142374w <= j7) || ((i13 = (c33955aM107404a = c33956b.m107404a(i15)).f142375x) != -1 && c33955aM107404a.m107403a(-1) >= i13))) {
                i15++;
            }
            if (i15 < i14) {
                return i15;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m97152c(long j7) {
        C33956b c33956b = this.f130283G;
        long j13 = this.f130287z;
        int i13 = c33956b.f142382w - 1;
        while (i13 >= 0 && j7 != Long.MIN_VALUE) {
            long j14 = c33956b.m107404a(i13).f142374w;
            if (j14 != Long.MIN_VALUE) {
                if (j7 >= j14) {
                    break;
                }
                i13--;
            } else {
                if (j13 != -9223372036854775807L && j7 >= j13) {
                    break;
                }
                i13--;
            }
        }
        if (i13 >= 0) {
            C33955a c33955aM107404a = c33956b.m107404a(i13);
            int i14 = c33955aM107404a.f142375x;
            if (i14 != -1) {
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = c33955aM107404a.f142377z[i15];
                    if (i16 != 0 && i16 != 1) {
                    }
                }
            }
            return i13;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final long m97153d(int i13) {
        return this.f130283G.m107404a(i13).f142374w;
    }

    /* JADX INFO: renamed from: e */
    public final int m97154e(int i13, int i14) {
        C33955a c33955aM107404a = this.f130283G.m107404a(i13);
        if (c33955aM107404a.f142375x != -1) {
            return c33955aM107404a.f142377z[i14];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C31552m1.class.equals(obj.getClass())) {
            C31552m1 c31552m1 = (C31552m1) obj;
            if (AbstractC24567y.m71670a(this.f130284w, c31552m1.f130284w) && AbstractC24567y.m71670a(this.f130285x, c31552m1.f130285x) && this.f130286y == c31552m1.f130286y && this.f130287z == c31552m1.f130287z && this.f130281E == c31552m1.f130281E && this.f130282F == c31552m1.f130282F && AbstractC24567y.m71670a(this.f130283G, c31552m1.f130283G)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m97155f(int i13) {
        return this.f130283G.m107404a(i13).m107403a(-1);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m97156g(int i13) {
        return this.f130283G.m107404a(i13).f142373G;
    }

    /* JADX INFO: renamed from: h */
    public final void m97157h(Object obj, Object obj2, int i13, long j7, long j13, C33956b c33956b, boolean z4) {
        this.f130284w = obj;
        this.f130285x = obj2;
        this.f130286y = i13;
        this.f130287z = j7;
        this.f130281E = j13;
        this.f130283G = c33956b;
        this.f130282F = z4;
    }

    public final int hashCode() {
        Object obj = this.f130284w;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f130285x;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f130286y) * 31;
        long j7 = this.f130287z;
        int i13 = (iHashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j13 = this.f130281E;
        return this.f130283G.hashCode() + ((((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f130282F ? 1 : 0)) * 31);
    }
}
