package gh3;

import java.util.concurrent.ThreadFactory;
import p020ap.RunnableC1880c;

/* JADX INFO: renamed from: gh3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class ThreadFactoryC15863h implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59963w;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f59963w) {
            case 0:
                throw new AssertionError("No threads allowed.");
            default:
                return new Thread(new RunnableC1880c(runnable, 2), "glide-active-resources");
        }
    }
}
