package gh3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: gh3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadFactoryC15864i extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: x */
    public static final ThreadFactoryC15863h f59964x = new ThreadFactoryC15863h(0);

    /* JADX INFO: renamed from: w */
    public final String f59965w;

    public ThreadFactoryC15864i(String str) {
        this.f59965w = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f59965w + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
