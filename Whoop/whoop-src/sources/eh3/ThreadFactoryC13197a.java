package eh3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: eh3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadFactoryC13197a implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45740w;

    /* JADX INFO: renamed from: x */
    public final Object f45741x;

    public ThreadFactoryC13197a() {
        this.f45740w = 1;
        this.f45741x = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f45740w) {
            case 0:
                Thread threadNewThread = ((ThreadFactory) this.f45741x).newThread(runnable);
                threadNewThread.setName(threadNewThread.getName() + " (Evictor)");
                return threadNewThread;
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f45741x).getAndIncrement());
                return thread;
        }
    }

    public ThreadFactoryC13197a(ThreadFactory threadFactory) {
        this.f45740w = 0;
        this.f45741x = threadFactory;
    }
}
