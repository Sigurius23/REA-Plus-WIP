package p397p8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: p8.b */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadFactoryC28964b implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final AtomicInteger f117137w = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ModernAsyncTask #" + this.f117137w.getAndIncrement());
    }
}
