package p044c5;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: c5.k */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadFactoryC4219k implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C4218j(runnable);
    }
}
