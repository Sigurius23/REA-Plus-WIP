package m73;

import android.os.Handler;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: m73.d */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC25216d implements Runnable, InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final Handler f99028w;

    /* JADX INFO: renamed from: x */
    public final Runnable f99029x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f99030y;

    public RunnableC25216d(Handler handler, Runnable runnable) {
        this.f99028w = handler;
        this.f99029x = runnable;
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        this.f99028w.removeCallbacks(this);
        this.f99030y = true;
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f99030y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f99029x.run();
        } catch (Throwable th3) {
            AbstractC21598x.m60677d0(th3);
        }
    }
}
