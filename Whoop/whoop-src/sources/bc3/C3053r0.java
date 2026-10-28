package bc3;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: bc3.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3053r0 implements InterfaceC3056s0 {

    /* JADX INFO: renamed from: w */
    public final ScheduledFuture f12081w;

    public C3053r0(ScheduledFuture scheduledFuture) {
        this.f12081w = scheduledFuture;
    }

    @Override // bc3.InterfaceC3056s0
    public final void dispose() {
        this.f12081w.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f12081w + ']';
    }
}
