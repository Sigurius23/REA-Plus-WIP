package live.hms.video.media.capturers;

/* JADX INFO: renamed from: live.hms.video.media.capturers.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC24170a implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95233w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HMSCameraCapturer f95234x;

    public /* synthetic */ RunnableC24170a(HMSCameraCapturer hMSCameraCapturer, int i13) {
        this.f95233w = i13;
        this.f95234x = hMSCameraCapturer;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f95233w) {
            case 0:
                HMSCameraCapturer._init_$lambda$4(this.f95234x);
                break;
            case 1:
                HMSCameraCapturer.dispose$lambda$11(this.f95234x);
                break;
            default:
                HMSCameraCapturer.stopCaptureWithTimeout$lambda$6(this.f95234x);
                break;
        }
    }
}
