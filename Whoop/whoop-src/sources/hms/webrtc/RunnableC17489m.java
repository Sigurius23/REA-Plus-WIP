package hms.webrtc;

/* JADX INFO: renamed from: hms.webrtc.m */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC17489m implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67602w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SurfaceTextureHelper f67603x;

    public /* synthetic */ RunnableC17489m(SurfaceTextureHelper surfaceTextureHelper, int i13) {
        this.f67602w = i13;
        this.f67603x = surfaceTextureHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67602w) {
            case 0:
                this.f67603x.lambda$dispose$6();
                break;
            case 1:
                this.f67603x.lambda$forceFrame$3();
                break;
            case 2:
                this.f67603x.lambda$stopListening$1();
                break;
            default:
                this.f67603x.lambda$returnTextureFrame$5();
                break;
        }
    }
}
