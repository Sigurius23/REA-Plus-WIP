package p636y3;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: y3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C39178j {

    /* JADX INFO: renamed from: a */
    public final long f168416a;

    public /* synthetic */ C39178j(long j7) {
        this.f168416a = j7;
    }

    /* JADX INFO: renamed from: a */
    public static long m124791a(int i13, int i14, long j7, int i15) {
        if ((i15 & 1) != 0) {
            i13 = (int) (j7 >> 32);
        }
        if ((i15 & 2) != 0) {
            i14 = (int) (j7 & 4294967295L);
        }
        return (((long) i14) & 4294967295L) | (((long) i13) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m124792b(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: c */
    public static final long m124793c(long j7, long j13) {
        return (((long) (((int) (j7 >> 32)) - ((int) (j13 >> 32)))) << 32) | (((long) (((int) (j7 & 4294967295L)) - ((int) (j13 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public static final long m124794d(long j7, long j13) {
        return (((long) (((int) (j7 >> 32)) + ((int) (j13 >> 32)))) << 32) | (((long) (((int) (j7 & 4294967295L)) + ((int) (j13 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static String m124795e(long j7) {
        StringBuilder sb4 = new StringBuilder("(");
        sb4.append((int) (j7 >> 32));
        sb4.append(", ");
        return AbstractC11895b.m31999r(sb4, (int) (j7 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39178j) {
            return this.f168416a == ((C39178j) obj).f168416a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168416a);
    }

    public final String toString() {
        return m124795e(this.f168416a);
    }
}
