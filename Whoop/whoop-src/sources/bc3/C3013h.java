package bc3;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: bc3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3013h implements InterfaceC3021j {

    /* JADX INFO: renamed from: w */
    public final ScheduledFuture f12030w;

    public C3013h(ScheduledFuture scheduledFuture) {
        this.f12030w = scheduledFuture;
    }

    @Override // bc3.InterfaceC3021j
    /* JADX INFO: renamed from: a */
    public final void mo8688a(Throwable th3) {
        this.f12030w.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f12030w + ']';
    }
}
