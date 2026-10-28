package de3;

/* JADX INFO: renamed from: de3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C11991a {

    /* JADX INFO: renamed from: a */
    public final int f39475a;

    /* JADX INFO: renamed from: b */
    public long f39476b;

    /* JADX INFO: renamed from: c */
    public long f39477c;

    public C11991a(int i13) {
        this.f39475a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static void m33037b(C11991a c11991a, long j7, long j13, int i13) {
        if ((i13 & 1) != 0) {
            j7 = 0;
        }
        if ((i13 & 2) != 0) {
            j13 = 0;
        }
        synchronized (c11991a) {
            try {
                if (j7 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j13 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j14 = c11991a.f39476b + j7;
                c11991a.f39476b = j14;
                long j15 = c11991a.f39477c + j13;
                c11991a.f39477c = j15;
                if (j15 > j14) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m33038a() {
        return this.f39476b - this.f39477c;
    }

    public final String toString() {
        return "WindowCounter(streamId=" + this.f39475a + ", total=" + this.f39476b + ", acknowledged=" + this.f39477c + ", unacknowledged=" + m33038a() + ')';
    }
}
