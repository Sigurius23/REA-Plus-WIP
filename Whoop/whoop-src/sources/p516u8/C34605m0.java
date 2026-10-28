package p516u8;

import java.util.Objects;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u8.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34605m0 {

    /* JADX INFO: renamed from: a */
    public Object f145691a;

    /* JADX INFO: renamed from: b */
    public Object f145692b;

    /* JADX INFO: renamed from: c */
    public int f145693c;

    /* JADX INFO: renamed from: d */
    public long f145694d;

    /* JADX INFO: renamed from: e */
    public long f145695e;

    /* JADX INFO: renamed from: f */
    public boolean f145696f;

    /* JADX INFO: renamed from: g */
    public C34582b f145697g = C34582b.f145636c;

    static {
        AbstractC33745d.m106663v(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: a */
    public final long m109392a(int i13, int i14) {
        C34580a c34580aM109363a = this.f145697g.m109363a(i13);
        if (c34580aM109363a.f145601a != -1) {
            return c34580aM109363a.f145606f[i14];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: b */
    public final int m109393b(long j7) {
        C34580a c34580aM109363a;
        int i13;
        C34582b c34582b = this.f145697g;
        long j13 = this.f145694d;
        int i14 = c34582b.f145638a;
        if (j7 != Long.MIN_VALUE && (j13 == -9223372036854775807L || j7 < j13)) {
            int i15 = 0;
            while (i15 < i14) {
                c34582b.m109363a(i15).getClass();
                c34582b.m109363a(i15).getClass();
                if (0 > j7 && ((i13 = (c34580aM109363a = c34582b.m109363a(i15)).f145601a) == -1 || c34580aM109363a.m109361a(-1) < i13)) {
                    break;
                }
                i15++;
            }
            if (i15 < i14) {
                return i15;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m109394c(long j7) {
        C34582b c34582b = this.f145697g;
        int i13 = c34582b.f145638a;
        int i14 = i13 - 1;
        if (i14 == i13 - 1) {
            c34582b.m109363a(i14).getClass();
        }
        while (i14 >= 0 && j7 != Long.MIN_VALUE) {
            c34582b.m109363a(i14).getClass();
            if (j7 >= 0) {
                break;
            }
            i14--;
        }
        if (i14 >= 0) {
            C34580a c34580aM109363a = c34582b.m109363a(i14);
            int i15 = c34580aM109363a.f145601a;
            if (i15 != -1) {
                for (int i16 = 0; i16 < i15; i16++) {
                    int i17 = c34580aM109363a.f145605e[i16];
                    if (i17 != 0 && i17 != 1) {
                    }
                }
            }
            return i14;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final long m109395d(int i13) {
        this.f145697g.m109363a(i13).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final int m109396e(int i13) {
        return this.f145697g.m109363a(i13).m109361a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C34605m0.class.equals(obj.getClass())) {
            return false;
        }
        C34605m0 c34605m0 = (C34605m0) obj;
        return Objects.equals(this.f145691a, c34605m0.f145691a) && Objects.equals(this.f145692b, c34605m0.f145692b) && this.f145693c == c34605m0.f145693c && this.f145694d == c34605m0.f145694d && this.f145695e == c34605m0.f145695e && this.f145696f == c34605m0.f145696f && Objects.equals(this.f145697g, c34605m0.f145697g);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m109397f(int i13) {
        C34582b c34582b = this.f145697g;
        int i14 = c34582b.f145638a;
        if (i13 != i14 - 1 || i13 != i14 - 1) {
            return false;
        }
        c34582b.m109363a(i13).getClass();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m109398g(int i13) {
        this.f145697g.m109363a(i13).getClass();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m109399h(Object obj, Object obj2, int i13, long j7, long j13, C34582b c34582b, boolean z4) {
        this.f145691a = obj;
        this.f145692b = obj2;
        this.f145693c = i13;
        this.f145694d = j7;
        this.f145695e = j13;
        this.f145697g = c34582b;
        this.f145696f = z4;
    }

    public final int hashCode() {
        Object obj = this.f145691a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f145692b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f145693c) * 31;
        long j7 = this.f145694d;
        int i13 = (iHashCode2 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j13 = this.f145695e;
        return this.f145697g.hashCode() + ((((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f145696f ? 1 : 0)) * 31);
    }
}
