package p185h6;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: h6.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC16946a implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f65068w;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f65068w);
        thread.setPriority(10);
        return thread;
    }
}
