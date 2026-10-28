package p027b3;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: b3.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC2348a1 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C2353b1 f9286w;

    public ChoreographerFrameCallbackC2348a1(C2353b1 c2353b1) {
        this.f9286w = c2353b1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f9286w.f9303x.removeCallbacks(this);
        C2353b1.m7272s(this.f9286w);
        C2353b1 c2353b1 = this.f9286w;
        synchronized (c2353b1.f9304y) {
            if (c2353b1.f9299H) {
                c2353b1.f9299H = false;
                ArrayList arrayList = c2353b1.f9296E;
                c2353b1.f9296E = c2353b1.f9297F;
                c2353b1.f9297F = arrayList;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((Choreographer.FrameCallback) arrayList.get(i13)).doFrame(j7);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2353b1.m7272s(this.f9286w);
        C2353b1 c2353b1 = this.f9286w;
        synchronized (c2353b1.f9304y) {
            if (c2353b1.f9296E.isEmpty()) {
                c2353b1.f9302w.removeFrameCallback(this);
                c2353b1.f9299H = false;
            }
        }
    }
}
