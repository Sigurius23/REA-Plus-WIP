package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.recyclerview.widget.g */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC1682g implements Executor {

    /* JADX INFO: renamed from: w */
    public final Handler f6652w = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6652w.post(runnable);
    }
}
