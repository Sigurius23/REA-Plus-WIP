package p085d9;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: d9.u */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ExecutorC11804u implements Executor {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Handler f38327w;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f38327w.post(runnable);
    }
}
