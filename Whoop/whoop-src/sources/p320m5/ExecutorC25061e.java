package p320m5;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: m5.e */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ExecutorC25061e implements Executor {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f98195w;

    /* JADX INFO: renamed from: a */
    private final void m73535a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f98195w) {
            case 0:
                runnable.run();
                break;
        }
    }
}
