package io.sentry.android.core;

/* JADX INFO: renamed from: io.sentry.android.core.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20137p1 implements Comparable {

    /* JADX INFO: renamed from: E */
    public final boolean f75641E;

    /* JADX INFO: renamed from: F */
    public final boolean f75642F;

    /* JADX INFO: renamed from: G */
    public final long f75643G;

    /* JADX INFO: renamed from: w */
    public final long f75644w;

    /* JADX INFO: renamed from: x */
    public final long f75645x;

    /* JADX INFO: renamed from: y */
    public final long f75646y;

    /* JADX INFO: renamed from: z */
    public final long f75647z;

    public C20137p1(long j7) {
        this(j7, j7, 0L, 0L, false, false, 0L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f75645x, ((C20137p1) obj).f75645x);
    }

    public C20137p1(long j7, long j13, long j14, long j15, boolean z4, boolean z13, long j16) {
        this.f75644w = j7;
        this.f75645x = j13;
        this.f75646y = j14;
        this.f75647z = j15;
        this.f75641E = z4;
        this.f75642F = z13;
        this.f75643G = j16;
    }
}
