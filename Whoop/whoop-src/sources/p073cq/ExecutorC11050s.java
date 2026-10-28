package p073cq;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import jp.HandlerC21846d;
import sc.C32352b;

/* JADX INFO: renamed from: cq.s */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC11050s implements Executor {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34664w;

    /* JADX INFO: renamed from: x */
    public final Object f34665x;

    public ExecutorC11050s(int i13) {
        this.f34664w = i13;
        switch (i13) {
            case 1:
                this.f34665x = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f34665x = new HandlerC21846d(Looper.getMainLooper(), 3);
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f34664w) {
            case 0:
                ((HandlerC21846d) this.f34665x).post(runnable);
                break;
            case 1:
                ((Handler) this.f34665x).post(runnable);
                break;
            default:
                ((C32352b) this.f34665x).f133917c.post(runnable);
                break;
        }
    }

    public ExecutorC11050s(C32352b c32352b) {
        this.f34664w = 2;
        this.f34665x = c32352b;
    }
}
