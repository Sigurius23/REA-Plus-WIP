package org.webrtc;

/* JADX INFO: renamed from: org.webrtc.t */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC28297t implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114098w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SurfaceTextureHelper f114099x;

    public /* synthetic */ RunnableC28297t(SurfaceTextureHelper surfaceTextureHelper, int i13) {
        this.f114098w = i13;
        this.f114099x = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114098w) {
            case 0:
                this.f114099x.lambda$stopListening$1();
                break;
            case 1:
                this.f114099x.lambda$dispose$6();
                break;
            case 2:
                this.f114099x.lambda$returnTextureFrame$5();
                break;
            default:
                this.f114099x.lambda$forceFrame$3();
                break;
        }
    }
}
