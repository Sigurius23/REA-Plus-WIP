package p273k6;

/* JADX INFO: renamed from: k6.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C22220e {

    /* JADX INFO: renamed from: a */
    public final long f86585a;

    /* JADX INFO: renamed from: b */
    public final long f86586b;

    public C22220e(long j7, long j13) {
        if (j13 == 0) {
            this.f86585a = 0L;
            this.f86586b = 1L;
        } else {
            this.f86585a = j7;
            this.f86586b = j13;
        }
    }

    /* JADX INFO: renamed from: a */
    public final double m63685a() {
        return this.f86585a / this.f86586b;
    }

    public final String toString() {
        return this.f86585a + "/" + this.f86586b;
    }
}
