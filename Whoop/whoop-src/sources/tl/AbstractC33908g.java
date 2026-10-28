package tl;

import android.os.SystemClock;

/* JADX INFO: renamed from: tl.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33908g {

    /* JADX INFO: renamed from: a */
    public static final double f142083a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f142084b = 0;

    /* JADX INFO: renamed from: a */
    public static double m107258a(long j7) {
        return (SystemClock.elapsedRealtimeNanos() - j7) * f142083a;
    }

    /* JADX INFO: renamed from: b */
    public static long m107259b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
