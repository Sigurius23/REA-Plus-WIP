package p097ds;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ds.x */
/* JADX INFO: loaded from: classes6.dex */
public final class ThreadFactoryC12321x implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ThreadFactory f41253w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AtomicLong f41254x;

    public ThreadFactoryC12321x(ThreadFactory threadFactory, AtomicLong atomicLong) {
        this.f41253w = threadFactory;
        this.f41254x = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f41253w.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        AtomicLong atomicLong = this.f41254x;
        Objects.requireNonNull(atomicLong);
        long andIncrement = atomicLong.getAndIncrement();
        Locale locale = Locale.ROOT;
        threadNewThread.setName("HealthData-HealthDataSdkService-" + andIncrement);
        return threadNewThread;
    }
}
