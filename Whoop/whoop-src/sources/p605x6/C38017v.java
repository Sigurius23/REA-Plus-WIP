package p605x6;

import androidx.glance.session.TimeoutCancellationException;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p33.C28820m;
import p537ux.C35331f0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: x6.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C38017v implements InterfaceC38016u, InterfaceC2994c0 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4351m f162842E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AtomicReference f162843F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC2994c0 f162844w;

    /* JADX INFO: renamed from: x */
    public final AtomicReference f162845x = new AtomicReference(null);

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C35331f0 f162846y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC2994c0 f162847z;

    public C38017v(InterfaceC2994c0 interfaceC2994c0, C35331f0 c35331f0, InterfaceC2994c0 interfaceC2994c1, InterfaceC4351m interfaceC4351m, AtomicReference atomicReference) {
        this.f162846y = c35331f0;
        this.f162847z = interfaceC2994c1;
        this.f162842E = interfaceC4351m;
        this.f162843F = atomicReference;
        this.f162844w = interfaceC2994c0;
    }

    /* JADX INFO: renamed from: a */
    public final long m121746a() {
        Long l7 = (Long) this.f162845x.get();
        if (l7 == null) {
            return Duration.INSTANCE.m134354getINFINITEUwyO8pc();
        }
        long jLongValue = l7.longValue();
        this.f162846y.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(jCurrentTimeMillis, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b */
    public final void m121747b(long j7) {
        if (Duration.m134273getInWholeMillisecondsimpl(j7) <= 0) {
            AbstractC3006f0.m8714h(this.f162847z, new TimeoutCancellationException("Timed out immediately", this.f162842E.hashCode()));
            return;
        }
        if (Duration.m134261compareToLRDsOJo(m121746a(), j7) < 0) {
            return;
        }
        this.f162846y.getClass();
        this.f162845x.set(Long.valueOf(Duration.m134273getInWholeMillisecondsimpl(j7) + System.currentTimeMillis()));
        C35331f0 c35331f0 = this.f162846y;
        InterfaceC2994c0 interfaceC2994c0 = this.f162847z;
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f162843F.getAndSet(AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C28820m(this, c35331f0, interfaceC2994c0, this.f162842E, null, 14), 3));
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f162844w.getCoroutineContext();
    }
}
