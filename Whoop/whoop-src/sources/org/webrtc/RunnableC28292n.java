package org.webrtc;

/* JADX INFO: renamed from: org.webrtc.n */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC28292n implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114086w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ RenderSynchronizer f114087x;

    public /* synthetic */ RunnableC28292n(RenderSynchronizer renderSynchronizer, int i13) {
        this.f114086w = i13;
        this.f114087x = renderSynchronizer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f114086w) {
            case 0:
                this.f114087x.lambda$registerListener$1();
                break;
            default:
                this.f114087x.lambda$new$0();
                break;
        }
    }
}
