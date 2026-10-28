package bc3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p715kotlin.time.DurationKt;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: bc3.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC3010g0 extends AbstractC3077z0 implements Runnable {

    /* JADX INFO: renamed from: H */
    public static final RunnableC3010g0 f12027H;

    /* JADX INFO: renamed from: I */
    public static final long f12028I;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l7;
        RunnableC3010g0 runnableC3010g0 = new RunnableC3010g0();
        f12027H = runnableC3010g0;
        runnableC3010g0.m8680b0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f12028I = timeUnit.toNanos(l7.longValue());
    }

    @Override // bc3.AbstractC3077z0
    /* JADX INFO: renamed from: F0 */
    public final void mo8736F0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo8736F0(runnable);
    }

    /* JADX INFO: renamed from: X0 */
    public final synchronized void m8737X0() {
        int i13 = debugStatus;
        if (i13 == 2 || i13 == 3) {
            debugStatus = 3;
            AbstractC3077z0.f12110E.set(this, null);
            AbstractC3077z0.f12111F.set(this, null);
            notifyAll();
        }
    }

    @Override // bc3.AbstractC2987a1
    /* JADX INFO: renamed from: a0 */
    public final Thread mo8679a0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f12027H.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // bc3.AbstractC3077z0, bc3.InterfaceC3026k0
    /* JADX INFO: renamed from: i */
    public final InterfaceC3056s0 mo8690i(long j7, Runnable runnable, InterfaceC30063j interfaceC30063j) {
        long j13 = 0;
        if (j7 > 0) {
            j13 = j7 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j7;
        }
        if (j13 >= DurationKt.MAX_MILLIS) {
            return C3078z1.f12113w;
        }
        long jNanoTime = System.nanoTime();
        C3068w0 c3068w0 = new C3068w0(runnable, j13 + jNanoTime);
        m8833T0(jNanoTime, c3068w0);
        return c3068w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3012g2.f12029a.set(this);
        try {
            synchronized (this) {
                int i13 = debugStatus;
                if (i13 == 2 || i13 == 3) {
                    _thread = null;
                    m8737X0();
                    if (m8832S0()) {
                        return;
                    }
                    mo8679a0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j7 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo8681o0 = mo8681o0();
                    if (jMo8681o0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j7 == Long.MAX_VALUE) {
                            j7 = f12028I + jNanoTime;
                        }
                        long j13 = j7 - jNanoTime;
                        if (j13 <= 0) {
                            _thread = null;
                            m8737X0();
                            if (m8832S0()) {
                                return;
                            }
                            mo8679a0();
                            return;
                        }
                        if (jMo8681o0 > j13) {
                            jMo8681o0 = j13;
                        }
                    } else {
                        j7 = Long.MAX_VALUE;
                    }
                    if (jMo8681o0 > 0) {
                        int i14 = debugStatus;
                        if (i14 == 2 || i14 == 3) {
                            _thread = null;
                            m8737X0();
                            if (m8832S0()) {
                                return;
                            }
                            mo8679a0();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo8681o0);
                    }
                }
            }
        } catch (Throwable th3) {
            _thread = null;
            m8737X0();
            if (!m8832S0()) {
                mo8679a0();
            }
            throw th3;
        }
    }

    @Override // bc3.AbstractC3077z0, bc3.AbstractC2987a1
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // bc3.AbstractC3076z
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // bc3.AbstractC2987a1
    /* JADX INFO: renamed from: x0 */
    public final void mo8684x0(long j7, AbstractRunnableC3071x0 abstractRunnableC3071x0) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
