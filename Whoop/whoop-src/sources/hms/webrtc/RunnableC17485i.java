package hms.webrtc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: hms.webrtc.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC17485i implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67597w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f67598x;

    public /* synthetic */ RunnableC17485i(Object obj, int i13) {
        this.f67597w = i13;
        this.f67598x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67597w) {
            case 0:
                ((VideoFrame.I420Buffer) this.f67598x).release();
                break;
            case 1:
                ((CountDownLatch) this.f67598x).countDown();
                break;
            default:
                ((VideoFileRenderer) this.f67598x).lambda$release$3();
                break;
        }
    }
}
