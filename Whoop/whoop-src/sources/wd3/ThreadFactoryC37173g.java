package wd3;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: wd3.g */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ThreadFactoryC37173g implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f158960w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f158961x;

    public /* synthetic */ ThreadFactoryC37173g(String str, boolean z4) {
        this.f158960w = str;
        this.f158961x = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f158960w);
        thread.setDaemon(this.f158961x);
        return thread;
    }
}
