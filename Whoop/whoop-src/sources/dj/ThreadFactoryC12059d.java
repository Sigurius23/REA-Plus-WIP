package dj;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: dj.d */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC12059d implements ThreadFactory {

    /* JADX INFO: renamed from: z */
    public static final AtomicInteger f39983z = new AtomicInteger(1);

    /* JADX INFO: renamed from: w */
    public final ThreadGroup f39984w;

    /* JADX INFO: renamed from: x */
    public final AtomicInteger f39985x = new AtomicInteger(1);

    /* JADX INFO: renamed from: y */
    public final String f39986y;

    public ThreadFactoryC12059d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f39984w = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f39986y = "lottie-" + f39983z.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f39984w, runnable, this.f39986y + this.f39985x.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
