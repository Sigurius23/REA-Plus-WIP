package p097ds;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: ds.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C12317t implements InterfaceFutureC12319v {

    /* JADX INFO: renamed from: x */
    public static final C12318u f41248x = new C12318u(C12317t.class);

    /* JADX INFO: renamed from: w */
    public final Object f41249w;

    public C12317t(Integer num) {
        this.f41249w = num;
    }

    @Override // p097ds.InterfaceFutureC12319v
    /* JADX INFO: renamed from: a */
    public final void mo31061a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e5) {
            f41248x.m34347a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f41249w;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        sb4.append("[status=SUCCESS, result=[");
        return AbstractC2875y.m8303p(sb4, "]]", this.f41249w);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f41249w;
    }
}
