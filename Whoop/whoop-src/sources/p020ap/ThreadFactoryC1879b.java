package p020ap;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: ap.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1879b implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final String f7418w;

    /* JADX INFO: renamed from: x */
    public final ThreadFactory f7419x = Executors.defaultThreadFactory();

    public ThreadFactoryC1879b(String str) {
        this.f7418w = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f7419x.newThread(new RunnableC1880c(runnable, 0));
        threadNewThread.setName(this.f7418w);
        return threadNewThread;
    }
}
