package p027b3;

import android.view.Choreographer;
import bc3.C3033m;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b3.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC2358c1 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C3033m f9314w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f9315x;

    public ChoreographerFrameCallbackC2358c1(C3033m c3033m, C2363d1 c2363d1, Function1 function1) {
        this.f9314w = c3033m;
        this.f9315x = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        Object objM107888l;
        try {
            objM107888l = this.f9315x.invoke(Long.valueOf(j7));
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        this.f9314w.resumeWith(objM107888l);
    }
}
