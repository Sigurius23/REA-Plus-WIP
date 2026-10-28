package org.webrtc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: org.webrtc.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC28283e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114063w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ VideoSink f114064x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f114065y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f114066z;

    public /* synthetic */ RunnableC28283e(VideoSink videoSink, Object obj, Object obj2, int i13) {
        this.f114063w = i13;
        this.f114064x = videoSink;
        this.f114065y = obj;
        this.f114066z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114063w) {
            case 0:
                ((EglRenderer) this.f114064x).lambda$removeFrameListener$2((CountDownLatch) this.f114065y, (EglRenderer.FrameListener) this.f114066z);
                break;
            case 1:
                ((EglRenderer) this.f114064x).lambda$removeRenderListener$3((CountDownLatch) this.f114065y, (EglRenderer.RenderListener) this.f114066z);
                break;
            default:
                ((VideoFileRenderer) this.f114064x).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f114065y, (VideoFrame) this.f114066z);
                break;
        }
    }
}
