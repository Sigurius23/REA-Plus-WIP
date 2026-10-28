package org.webrtc;

/* JADX INFO: renamed from: org.webrtc.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC28285g implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114069w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EglThread f114070x;

    public /* synthetic */ RunnableC28285g(EglThread eglThread, int i13) {
        this.f114069w = i13;
        this.f114070x = eglThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114069w) {
            case 0:
                this.f114070x.lambda$onRenderWindowOpen$2();
                break;
            default:
                this.f114070x.lambda$onRenderWindowClose$3();
                break;
        }
    }
}
