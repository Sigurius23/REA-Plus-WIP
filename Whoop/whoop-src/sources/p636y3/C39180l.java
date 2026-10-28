package p636y3;

/* JADX INFO: renamed from: y3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C39180l {

    /* JADX INFO: renamed from: a */
    public final long f168422a;

    /* JADX INFO: renamed from: a */
    public static final boolean m124799a(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: b */
    public static String m124800b(long j7) {
        return ((int) (j7 >> 32)) + " x " + ((int) (j7 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39180l) {
            return this.f168422a == ((C39180l) obj).f168422a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168422a);
    }

    public final String toString() {
        return m124800b(this.f168422a);
    }
}
