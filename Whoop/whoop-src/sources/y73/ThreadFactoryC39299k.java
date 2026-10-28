package y73;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import ne3.C26606c;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: y73.k */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadFactoryC39299k extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final String f169083w;

    /* JADX INFO: renamed from: x */
    public final int f169084x;

    /* JADX INFO: renamed from: y */
    public final boolean f169085y;

    public ThreadFactoryC39299k(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f169083w + '-' + incrementAndGet();
        Thread c26606c = this.f169085y ? new C26606c(runnable, str) : new Thread(runnable, str);
        c26606c.setPriority(this.f169084x);
        c26606c.setDaemon(true);
        return c26606c;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return AbstractC25012a.m73376i(this.f169083w, "]", new StringBuilder("RxThreadFactory["));
    }

    public ThreadFactoryC39299k(String str, int i13, boolean z4) {
        this.f169083w = str;
        this.f169084x = i13;
        this.f169085y = z4;
    }
}
