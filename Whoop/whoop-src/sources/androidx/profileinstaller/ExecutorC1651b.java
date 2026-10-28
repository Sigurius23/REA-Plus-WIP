package androidx.profileinstaller;

import java.util.concurrent.Executor;
import p489t.C33242a;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1651b implements Executor {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6520w;

    public /* synthetic */ ExecutorC1651b(int i13) {
        this.f6520w = i13;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6520w) {
            case 0:
                runnable.run();
                break;
            case 1:
                C33242a.m105474V().m105475W(runnable);
                break;
            default:
                C33242a.m105474V().f138639a.f138641b.execute(runnable);
                break;
        }
    }
}
