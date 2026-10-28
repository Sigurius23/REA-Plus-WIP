package io.sentry;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: io.sentry.g5 */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadFactoryC20342g5 implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76359w;

    /* JADX INFO: renamed from: x */
    public int f76360x;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f76359w) {
            case 0:
                StringBuilder sb4 = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i13 = this.f76360x;
                this.f76360x = i13 + 1;
                sb4.append(i13);
                Thread thread = new Thread(runnable, sb4.toString());
                thread.setDaemon(true);
                return thread;
            default:
                StringBuilder sb5 = new StringBuilder("SentryAsyncConnection-");
                int i14 = this.f76360x;
                this.f76360x = i14 + 1;
                sb5.append(i14);
                Thread thread2 = new Thread(runnable, sb5.toString());
                thread2.setDaemon(true);
                return thread2;
        }
    }
}
