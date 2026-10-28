package bc3;

import hc3.C17188u;
import kotlinx.coroutines.TimeoutCancellationException;
import p031b9.AbstractC2875y;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: bc3.i2 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC3020i2 extends C17188u implements Runnable {

    /* JADX INFO: renamed from: E */
    public final long f12040E;

    public RunnableC3020i2(long j7, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d.getContext(), interfaceC30057d);
        this.f12040E = j7;
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: N */
    public final String mo8742N() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.mo8742N());
        sb4.append("(timeMillis=");
        return AbstractC2875y.m8302o(sb4, this.f12040E, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3034m0.m8784d(this.f11989y);
        m8818o(new TimeoutCancellationException("Timed out waiting for " + this.f12040E + " ms", this));
    }
}
