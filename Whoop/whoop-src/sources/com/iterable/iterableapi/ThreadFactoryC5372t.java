package com.iterable.iterableapi;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.iterable.iterableapi.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC5372t implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "IterableBackgroundInit");
        thread.setDaemon(true);
        thread.setPriority(5);
        return thread;
    }
}
