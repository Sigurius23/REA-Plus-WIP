package tl;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: tl.e */
/* JADX INFO: loaded from: classes6.dex */
public final class ExecutorC33906e implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
