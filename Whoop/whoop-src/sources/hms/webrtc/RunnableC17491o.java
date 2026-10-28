package hms.webrtc;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: hms.webrtc.o */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC17491o implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67605w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f67606x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f67607y;

    public /* synthetic */ RunnableC17491o(int i13, Object obj, Object obj2) {
        this.f67605w = i13;
        this.f67606x = obj;
        this.f67607y = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67605w) {
            case 0:
                ((TextureBufferImpl) this.f67606x).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.f67607y);
                break;
            case 1:
                ((EglRenderer) this.f67606x).lambda$releaseEglSurface$5((Runnable) this.f67607y);
                break;
            case 2:
                ((EglRenderer) this.f67606x).lambda$release$1((CountDownLatch) this.f67607y);
                break;
            case 3:
                ((EglRenderer) this.f67606x).lambda$release$2((Looper) this.f67607y);
                break;
            case 4:
                ((VideoFileRenderer) this.f67606x).lambda$onFrame$0((VideoFrame) this.f67607y);
                break;
            case 5:
                ((VideoFileRenderer) this.f67606x).lambda$release$2((CountDownLatch) this.f67607y);
                break;
            default:
                ((VideoSource) this.f67606x).lambda$setVideoProcessor$0((VideoFrame) this.f67607y);
                break;
        }
    }
}
