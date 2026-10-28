package pg3;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: pg3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C29195k extends CompletableFuture {

    /* JADX INFO: renamed from: w */
    public final C29174b0 f118188w;

    public C29195k(C29174b0 c29174b0) {
        this.f118188w = c29174b0;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        if (z4) {
            this.f118188w.cancel();
        }
        return super.cancel(z4);
    }
}
