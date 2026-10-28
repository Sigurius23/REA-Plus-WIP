package p636y3;

/* JADX INFO: renamed from: y3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C39184p {

    /* JADX INFO: renamed from: a */
    public final long f168430a;

    /* JADX INFO: renamed from: a */
    public static final boolean m124808a(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: b */
    public static String m124809b(long j7) {
        if (m124808a(j7, 0L)) {
            return "Unspecified";
        }
        if (m124808a(j7, 4294967296L)) {
            return "Sp";
        }
        return m124808a(j7, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39184p) {
            return this.f168430a == ((C39184p) obj).f168430a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168430a);
    }

    public final String toString() {
        return m124809b(this.f168430a);
    }
}
