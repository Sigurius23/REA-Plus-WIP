package p636y3;

import v63.AbstractC35745c;

/* JADX INFO: renamed from: y3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C39183o {

    /* JADX INFO: renamed from: b */
    public static final C39184p[] f168427b = {new C39184p(0), new C39184p(4294967296L), new C39184p(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f168428c = AbstractC35745c.m113248j(Float.NaN, 0);

    /* JADX INFO: renamed from: a */
    public final long f168429a;

    public /* synthetic */ C39183o(long j7) {
        this.f168429a = j7;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m124803a(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: b */
    public static final long m124804b(long j7) {
        return f168427b[(int) ((j7 & 1095216660480L) >>> 32)].f168430a;
    }

    /* JADX INFO: renamed from: c */
    public static final float m124805c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m124806d(long j7) {
        return (j7 & 1095216660480L) == 8589934592L;
    }

    /* JADX INFO: renamed from: e */
    public static String m124807e(long j7) {
        long jM124804b = m124804b(j7);
        if (C39184p.m124808a(jM124804b, 0L)) {
            return "Unspecified";
        }
        if (C39184p.m124808a(jM124804b, 4294967296L)) {
            return m124805c(j7) + ".sp";
        }
        if (!C39184p.m124808a(jM124804b, 8589934592L)) {
            return "Invalid";
        }
        return m124805c(j7) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39183o) {
            return this.f168429a == ((C39183o) obj).f168429a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168429a);
    }

    public final String toString() {
        return m124807e(this.f168429a);
    }
}
