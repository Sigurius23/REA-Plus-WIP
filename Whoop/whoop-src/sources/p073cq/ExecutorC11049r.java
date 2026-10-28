package p073cq;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: cq.r */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC11049r implements Executor {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34663w;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f34663w) {
            case 0:
                runnable.run();
                break;
            default:
                new Thread(runnable).start();
                break;
        }
    }
}
