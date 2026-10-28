package hms.webrtc;

/* JADX INFO: renamed from: hms.webrtc.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC17480d implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67578w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EglRenderer f67579x;

    public /* synthetic */ RunnableC17480d(EglRenderer eglRenderer, int i13) {
        this.f67578w = i13;
        this.f67579x = eglRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67578w) {
            case 0:
                this.f67579x.renderFrameOnRenderThread();
                break;
            case 1:
                this.f67579x.renderBlackFrame();
                break;
            default:
                this.f67579x.renderFrameFromCache();
                break;
        }
    }
}
