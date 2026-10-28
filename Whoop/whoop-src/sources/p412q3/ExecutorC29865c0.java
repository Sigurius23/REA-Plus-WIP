package p412q3;

import android.view.Choreographer;
import com.mapbox.maps.renderer.ChoreographerFrameCallbackC5553a;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: q3.c0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC29865c0 implements Executor {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Choreographer f122067w;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f122067w.postFrameCallback(new ChoreographerFrameCallbackC5553a(runnable, 1));
    }
}
