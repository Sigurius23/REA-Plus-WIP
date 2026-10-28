package p044c5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c5.l */
/* JADX INFO: loaded from: classes5.dex */
public final class ExecutorC4220l implements Executor {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17104w;

    /* JADX INFO: renamed from: x */
    public final Handler f17105x;

    public /* synthetic */ ExecutorC4220l(Handler handler, int i13) {
        this.f17104w = i13;
        this.f17105x = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r10) {
        switch (this.f17104w) {
            case 0:
                r10.getClass();
                Handler handler = this.f17105x;
                if (handler.post(r10)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                AbstractC22676k.m65750j(r10, "r");
                this.f17105x.post(r10);
                return;
            case 2:
                this.f17105x.post(r10);
                return;
            default:
                this.f17105x.post(r10);
                return;
        }
    }

    public ExecutorC4220l(int i13) {
        this.f17104w = i13;
        switch (i13) {
            case 2:
                this.f17105x = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f17105x = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
