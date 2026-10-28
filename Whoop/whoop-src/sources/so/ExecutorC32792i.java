package so;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: so.i */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ExecutorC32792i implements Executor {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ ExecutorC32792i f136479w = new ExecutorC32792i();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
