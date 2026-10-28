package ht;

import hm.C17417d;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p080d4.AbstractC11649h;
import p080d4.C11642a;

/* JADX INFO: renamed from: ht.i */
/* JADX INFO: loaded from: classes6.dex */
public final class ScheduledFutureC17620i extends AbstractC11649h implements ScheduledFuture {

    /* JADX INFO: renamed from: H */
    public final ScheduledFuture f68337H;

    public ScheduledFutureC17620i(InterfaceC17619h interfaceC17619h) {
        this.f68337H = interfaceC17619h.mo50174a(new C17417d(this, 2));
    }

    @Override // p080d4.AbstractC11649h
    /* JADX INFO: renamed from: c */
    public final void mo31063c() {
        ScheduledFuture scheduledFuture = this.f68337H;
        Object obj = this.f37625w;
        scheduledFuture.cancel((obj instanceof C11642a) && ((C11642a) obj).f37605a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f68337H.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f68337H.getDelay(timeUnit);
    }
}
