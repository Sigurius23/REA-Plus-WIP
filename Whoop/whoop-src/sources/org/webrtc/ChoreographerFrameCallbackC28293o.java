package org.webrtc;

import android.view.Choreographer;

/* JADX INFO: renamed from: org.webrtc.o */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC28293o implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ RenderSynchronizer f114088w;

    public /* synthetic */ ChoreographerFrameCallbackC28293o(RenderSynchronizer renderSynchronizer) {
        this.f114088w = renderSynchronizer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f114088w.onDisplayRefreshCycleBegin(j7);
    }
}
