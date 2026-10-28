package p426qi;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: qi.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C30376c0 extends FutureTask {

    /* JADX INFO: renamed from: w */
    public C30378d0 f124648w;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f124648w.m92857d((C30374b0) get());
            } catch (InterruptedException | ExecutionException e5) {
                this.f124648w.m92857d(new C30374b0(e5));
            }
        } finally {
            this.f124648w = null;
        }
    }
}
