package p073cq;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: cq.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC11042k implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34647w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11040i f34648x;

    public /* synthetic */ RunnableC11042k(int i13, C11040i c11040i) {
        this.f34647w = i13;
        this.f34648x = c11040i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34647w) {
            case 0:
                this.f34648x.m29688c(new TimeoutException());
                break;
            default:
                if (this.f34648x.m29688c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
                break;
        }
    }
}
