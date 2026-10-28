package p309lo;

/* JADX INFO: renamed from: lo.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C24566x {

    /* JADX INFO: renamed from: a */
    public long f95871a;

    /* JADX INFO: renamed from: b */
    public long f95872b;

    /* JADX INFO: renamed from: c */
    public long f95873c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f95874d = new ThreadLocal();

    public C24566x(long j7) {
        m71662d(j7);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m71659a(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f95872b == -9223372036854775807L) {
                long jLongValue = this.f95871a;
                if (jLongValue == 9223372036854775806L) {
                    Long l7 = (Long) this.f95874d.get();
                    l7.getClass();
                    jLongValue = l7.longValue();
                }
                this.f95872b = jLongValue - j7;
                notifyAll();
            }
            this.f95873c = j7;
            return j7 + this.f95872b;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m71660b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j13 = this.f95873c;
            if (j13 != -9223372036854775807L) {
                long j14 = (j13 * 90000) / 1000000;
                long j15 = (4294967296L + j14) / 8589934592L;
                long j16 = ((j15 - 1) * 8589934592L) + j7;
                long j17 = (j15 * 8589934592L) + j7;
                j7 = Math.abs(j16 - j14) < Math.abs(j17 - j14) ? j16 : j17;
            }
            return m71659a((j7 * 1000000) / 90000);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m71661c() {
        long j7;
        j7 = this.f95871a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            j7 = -9223372036854775807L;
        }
        return j7;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m71662d(long j7) {
        this.f95871a = j7;
        this.f95872b = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f95873c = -9223372036854775807L;
    }
}
