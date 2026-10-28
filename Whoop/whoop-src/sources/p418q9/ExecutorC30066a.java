package p418q9;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import live.hms.video.factories.C24148c;

/* JADX INFO: renamed from: q9.a */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC30066a implements Executor {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Executor f122679w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24148c f122680x;

    public ExecutorC30066a(ExecutorService executorService, C24148c c24148c) {
        this.f122679w = executorService;
        this.f122680x = c24148c;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f122679w.execute(runnable);
    }
}
