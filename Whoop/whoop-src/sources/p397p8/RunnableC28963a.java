package p397p8;

import android.os.Looper;
import io.seon.androidsdk.service.CallableC20673j;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ro.C31619d;

/* JADX INFO: renamed from: p8.a */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC28963a implements Runnable {

    /* JADX INFO: renamed from: H */
    public static final ThreadPoolExecutor f117127H;

    /* JADX INFO: renamed from: I */
    public static HandlerC28967e f117128I;

    /* JADX INFO: renamed from: J */
    public static volatile ThreadPoolExecutor f117129J;

    /* JADX INFO: renamed from: F */
    public final CountDownLatch f117131F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C31619d f117132G;

    /* JADX INFO: renamed from: w */
    public final CallableC20673j f117133w;

    /* JADX INFO: renamed from: x */
    public final C28965c f117134x;

    /* JADX INFO: renamed from: y */
    public volatile int f117135y = 1;

    /* JADX INFO: renamed from: z */
    public final AtomicBoolean f117136z = new AtomicBoolean();

    /* JADX INFO: renamed from: E */
    public final AtomicBoolean f117130E = new AtomicBoolean();

    static {
        ThreadFactoryC28964b threadFactoryC28964b = new ThreadFactoryC28964b();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactoryC28964b);
        f117127H = threadPoolExecutor;
        f117129J = threadPoolExecutor;
    }

    public RunnableC28963a(C31619d c31619d) {
        this.f117132G = c31619d;
        CallableC20673j callableC20673j = new CallableC20673j(this, 2);
        this.f117133w = callableC20673j;
        this.f117134x = new C28965c(this, callableC20673j);
        this.f117131F = new CountDownLatch(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m87967a(Object obj) {
        HandlerC28967e handlerC28967e;
        synchronized (RunnableC28963a.class) {
            try {
                if (f117128I == null) {
                    f117128I = new HandlerC28967e(Looper.getMainLooper());
                }
                handlerC28967e = f117128I;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        handlerC28967e.obtainMessage(1, new C28966d(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f117132G.m97687c();
    }
}
