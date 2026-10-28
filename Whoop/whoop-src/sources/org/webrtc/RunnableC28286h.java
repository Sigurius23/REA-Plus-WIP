package org.webrtc;

/* JADX INFO: renamed from: org.webrtc.h */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC28286h implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114071w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f114072x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f114073y;

    public /* synthetic */ RunnableC28286h(Object obj, int i13, int i14) {
        this.f114071w = i14;
        this.f114073y = obj;
        this.f114072x = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114071w) {
            case 0:
                ((HardwareVideoEncoder) this.f114073y).lambda$deliverEncodedImage$0(this.f114072x);
                break;
            default:
                ((SurfaceTextureHelper) this.f114073y).lambda$setFrameRotation$4(this.f114072x);
                break;
        }
    }
}
