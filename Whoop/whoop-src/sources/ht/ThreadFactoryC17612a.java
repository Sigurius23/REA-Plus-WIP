package ht;

import android.os.StrictMode;
import androidx.lifecycle.RunnableC1605m;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ht.a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC17612a implements ThreadFactory {

    /* JADX INFO: renamed from: E */
    public static final ThreadFactory f68308E = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: w */
    public final AtomicLong f68309w = new AtomicLong();

    /* JADX INFO: renamed from: x */
    public final String f68310x;

    /* JADX INFO: renamed from: y */
    public final int f68311y;

    /* JADX INFO: renamed from: z */
    public final StrictMode.ThreadPolicy f68312z;

    public ThreadFactoryC17612a(String str, int i13, StrictMode.ThreadPolicy threadPolicy) {
        this.f68310x = str;
        this.f68311y = i13;
        this.f68312z = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f68308E.newThread(new RunnableC1605m(8, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f68310x + " Thread #" + this.f68309w.getAndIncrement());
        return threadNewThread;
    }
}
