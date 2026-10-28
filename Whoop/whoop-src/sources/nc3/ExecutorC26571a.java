package nc3;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: nc3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC26571a implements Executor {

    /* JADX INFO: renamed from: w */
    public static final ExecutorC26571a f105676w = new ExecutorC26571a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
