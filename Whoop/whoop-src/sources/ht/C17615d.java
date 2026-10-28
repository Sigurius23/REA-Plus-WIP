package ht;

import hm.C17417d;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ht.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17615d implements InterfaceC17619h {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f68321E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ TimeUnit f68322F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68323w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ScheduledExecutorServiceC17618g f68324x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Runnable f68325y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f68326z;

    public /* synthetic */ C17615d(ScheduledExecutorServiceC17618g scheduledExecutorServiceC17618g, Runnable runnable, long j7, long j13, TimeUnit timeUnit, int i13) {
        this.f68323w = i13;
        this.f68324x = scheduledExecutorServiceC17618g;
        this.f68325y = runnable;
        this.f68326z = j7;
        this.f68321E = j13;
        this.f68322F = timeUnit;
    }

    @Override // ht.InterfaceC17619h
    /* JADX INFO: renamed from: a */
    public final ScheduledFuture mo50174a(C17417d c17417d) {
        switch (this.f68323w) {
            case 0:
                ScheduledExecutorServiceC17618g scheduledExecutorServiceC17618g = this.f68324x;
                return scheduledExecutorServiceC17618g.f68336x.scheduleAtFixedRate(new RunnableC17616e(scheduledExecutorServiceC17618g, this.f68325y, c17417d, 0), this.f68326z, this.f68321E, this.f68322F);
            default:
                ScheduledExecutorServiceC17618g scheduledExecutorServiceC17618g2 = this.f68324x;
                return scheduledExecutorServiceC17618g2.f68336x.scheduleWithFixedDelay(new RunnableC17616e(scheduledExecutorServiceC17618g2, this.f68325y, c17417d, 2), this.f68326z, this.f68321E, this.f68322F);
        }
    }
}
