package androidx.databinding;

import android.view.Choreographer;

/* JADX INFO: renamed from: androidx.databinding.t */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC1190t implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC1168a0 f5338w;

    public ChoreographerFrameCallbackC1190t(AbstractC1168a0 abstractC1168a0) {
        this.f5338w = abstractC1168a0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f5338w.mRebindRunnable.run();
    }
}
