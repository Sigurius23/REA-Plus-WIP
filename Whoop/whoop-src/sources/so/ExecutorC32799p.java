package so;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: so.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC32799p implements Executor {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ ExecutorC32799p f136503w = new ExecutorC32799p();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
