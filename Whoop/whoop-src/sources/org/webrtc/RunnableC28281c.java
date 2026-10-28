package org.webrtc;

/* JADX INFO: renamed from: org.webrtc.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC28281c implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114058w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f114059x;

    public /* synthetic */ RunnableC28281c(Object obj, int i13) {
        this.f114058w = i13;
        this.f114059x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114058w) {
            case 0:
                ((EglBase10Impl.EglConnection) this.f114059x).lambda$new$0();
                break;
            case 1:
                ((EglBase14Impl.EglConnection) this.f114059x).lambda$new$0();
                break;
            case 2:
                ((EglRenderer) this.f114059x).renderFrameOnRenderThread();
                break;
            case 3:
                ((EglBase.EglConnection) this.f114059x).release();
                break;
            case 4:
                ((VideoFrame.I420Buffer) this.f114059x).release();
                break;
            case 5:
                ((ScreenCapturerAndroid) this.f114059x).updateVirtualDisplay();
                break;
            default:
                ((VideoFileRenderer) this.f114059x).lambda$release$3();
                break;
        }
    }
}
