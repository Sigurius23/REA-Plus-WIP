package org.webrtc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: org.webrtc.v */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC28299v implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114101w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f114102x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f114103y;

    public /* synthetic */ RunnableC28299v(int i13, Object obj, Object obj2) {
        this.f114101w = i13;
        this.f114102x = obj;
        this.f114103y = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114101w) {
            case 0:
                ((TextureBufferImpl) this.f114102x).lambda$new$0((TextureBufferImpl.RefCountMonitor) this.f114103y);
                break;
            case 1:
                ((EglRenderer) this.f114102x).lambda$releaseEglSurface$4((Runnable) this.f114103y);
                break;
            case 2:
                ((EglRenderer) this.f114102x).lambda$release$0((CountDownLatch) this.f114103y);
                break;
            case 3:
                ((VideoFileRenderer) this.f114102x).lambda$onFrame$0((VideoFrame) this.f114103y);
                break;
            case 4:
                ((VideoFileRenderer) this.f114102x).lambda$release$2((CountDownLatch) this.f114103y);
                break;
            default:
                ((VideoSource) this.f114102x).lambda$setVideoProcessor$0((VideoFrame) this.f114103y);
                break;
        }
    }
}
