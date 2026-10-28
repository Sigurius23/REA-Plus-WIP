package org.webrtc;

/* JADX INFO: renamed from: org.webrtc.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC28280b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114055w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Camera1Session.C282332 f114056x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ byte[] f114057y;

    public /* synthetic */ RunnableC28280b(Camera1Session.C282332 c282332, byte[] bArr, int i13) {
        this.f114055w = i13;
        this.f114056x = c282332;
        this.f114057y = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114055w) {
            case 0:
                this.f114056x.lambda$onPreviewFrame$1(this.f114057y);
                break;
            default:
                this.f114056x.lambda$onPreviewFrame$0(this.f114057y);
                break;
        }
    }
}
