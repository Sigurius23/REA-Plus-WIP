package hms.webrtc;

/* JADX INFO: renamed from: hms.webrtc.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class RunnableC17483g implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67592w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f67593x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f67594y;

    public /* synthetic */ RunnableC17483g(Object obj, int i13, int i14) {
        this.f67592w = i14;
        this.f67594y = obj;
        this.f67593x = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67592w) {
            case 0:
                ((HardwareVideoEncoder) this.f67594y).lambda$deliverEncodedImage$0(this.f67593x);
                break;
            default:
                ((SurfaceTextureHelper) this.f67594y).lambda$setFrameRotation$4(this.f67593x);
                break;
        }
    }
}
