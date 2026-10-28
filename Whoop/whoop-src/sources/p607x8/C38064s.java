package p607x8;

import java.math.RoundingMode;

/* JADX INFO: renamed from: x8.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C38064s {

    /* JADX INFO: renamed from: a */
    public long f163027a;

    /* JADX INFO: renamed from: b */
    public long f163028b;

    /* JADX INFO: renamed from: c */
    public long f163029c;

    /* JADX INFO: renamed from: d */
    public final ThreadLocal f163030d = new ThreadLocal();

    public C38064s(long j7) {
        m121886e(j7);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m121882a(long j7) {
        long j13;
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f163028b != -9223372036854775807L)) {
                    long jLongValue = this.f163027a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l7 = (Long) this.f163030d.get();
                        l7.getClass();
                        jLongValue = l7.longValue();
                    }
                    this.f163028b = jLongValue - j7;
                    notifyAll();
                }
                this.f163029c = j7;
                j13 = j7 + this.f163028b;
            }
            return j13;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized long m121883b(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j13 = this.f163029c;
            if (j13 != -9223372036854775807L) {
                int i13 = AbstractC38065t.f163031a;
                long jM121903Q = AbstractC38065t.m121903Q(j13, 90000L, 1000000L, RoundingMode.DOWN);
                long j14 = (4294967296L + jM121903Q) / 8589934592L;
                long j15 = ((j14 - 1) * 8589934592L) + j7;
                long j16 = (j14 * 8589934592L) + j7;
                j7 = Math.abs(j15 - jM121903Q) < Math.abs(j16 - jM121903Q) ? j15 : j16;
            }
            long j17 = j7;
            int i14 = AbstractC38065t.f163031a;
            return m121882a(AbstractC38065t.m121903Q(j17, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized long m121884c(long j7) {
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j13 = this.f163029c;
            if (j13 != -9223372036854775807L) {
                int i13 = AbstractC38065t.f163031a;
                long jM121903Q = AbstractC38065t.m121903Q(j13, 90000L, 1000000L, RoundingMode.DOWN);
                long j14 = jM121903Q / 8589934592L;
                long j15 = (j14 * 8589934592L) + j7;
                j7 = j15 >= jM121903Q ? j15 : ((j14 + 1) * 8589934592L) + j7;
            }
            long j16 = j7;
            int i14 = AbstractC38065t.f163031a;
            return m121882a(AbstractC38065t.m121903Q(j16, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized long m121885d() {
        long j7;
        j7 = this.f163027a;
        if (j7 == Long.MAX_VALUE || j7 == 9223372036854775806L) {
            j7 = -9223372036854775807L;
        }
        return j7;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m121886e(long j7) {
        this.f163027a = j7;
        this.f163028b = j7 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f163029c = -9223372036854775807L;
    }
}
