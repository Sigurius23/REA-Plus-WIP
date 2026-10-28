package io.sentry.android.core.performance;

import android.os.SystemClock;

/* JADX INFO: renamed from: io.sentry.android.core.performance.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C20145h implements Comparable {

    /* JADX INFO: renamed from: w */
    public String f75676w;

    /* JADX INFO: renamed from: x */
    public long f75677x;

    /* JADX INFO: renamed from: y */
    public long f75678y;

    /* JADX INFO: renamed from: z */
    public long f75679z;

    /* JADX INFO: renamed from: a */
    public final long m56046a() {
        long j7 = this.f75679z;
        if (j7 != 0) {
            return j7 - this.f75678y;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m56047b() {
        return this.f75678y != 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m56048c(long j7) {
        this.f75678y = j7;
        this.f75677x = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f75678y);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f75677x, ((C20145h) obj).f75677x);
    }
}
