package p020ap;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jp.HandlerC21846d;
import p036bq.RunnableC3543b;

/* JADX INFO: renamed from: ap.a */
/* JADX INFO: loaded from: classes6.dex */
public final class ExecutorC1878a implements Executor {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7416w = 0;

    /* JADX INFO: renamed from: x */
    public final Object f7417x;

    public ExecutorC1878a(Looper looper) {
        this.f7417x = new HandlerC21846d(looper, 2);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7416w) {
            case 0:
                ((HandlerC21846d) this.f7417x).post(runnable);
                break;
            default:
                ((Executor) this.f7417x).execute(new RunnableC3543b(runnable, 5));
                break;
        }
    }

    public ExecutorC1878a(ExecutorService executorService) {
        this.f7417x = executorService;
    }
}
