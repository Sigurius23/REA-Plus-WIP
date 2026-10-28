package l73;

import n73.InterfaceC26443b;
import u73.RunnableC34579a;
import y73.C39298j;

/* JADX INFO: renamed from: l73.e */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC23414e implements InterfaceC26443b, Runnable {

    /* JADX INFO: renamed from: w */
    public final RunnableC34579a f92768w;

    /* JADX INFO: renamed from: x */
    public final AbstractC23415f f92769x;

    /* JADX INFO: renamed from: y */
    public Thread f92770y;

    public RunnableC23414e(RunnableC34579a runnableC34579a, AbstractC23415f abstractC23415f) {
        this.f92768w = runnableC34579a;
        this.f92769x = abstractC23415f;
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f92770y == Thread.currentThread()) {
            AbstractC23415f abstractC23415f = this.f92769x;
            if (abstractC23415f instanceof C39298j) {
                C39298j c39298j = (C39298j) abstractC23415f;
                if (c39298j.f169082x) {
                    return;
                }
                c39298j.f169082x = true;
                c39298j.f169081w.shutdown();
                return;
            }
        }
        this.f92769x.dispose();
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f92769x.isDisposed();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92770y = Thread.currentThread();
        try {
            this.f92768w.run();
        } finally {
            dispose();
            this.f92770y = null;
        }
    }
}
