package p361o9;

/* JADX INFO: renamed from: o9.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C27661a {

    /* JADX INFO: renamed from: a */
    public final long f111314a;

    /* JADX INFO: renamed from: b */
    public final long f111315b;

    public C27661a(long j7, long j13) {
        this.f111314a = j7;
        this.f111315b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27661a)) {
            return false;
        }
        C27661a c27661a = (C27661a) obj;
        return this.f111314a == c27661a.f111314a && this.f111315b == c27661a.f111315b;
    }

    public final int hashCode() {
        return (((int) this.f111314a) * 31) + ((int) this.f111315b);
    }
}
