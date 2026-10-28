package y73;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l73.AbstractC23415f;
import n73.C26442a;
import n73.InterfaceC26443b;
import q73.EnumC30025d;

/* JADX INFO: renamed from: y73.f */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC39294f extends AbstractC23415f implements Runnable {

    /* JADX INFO: renamed from: x */
    public final RunnableC39293e f169067x;

    /* JADX INFO: renamed from: y */
    public final C39295g f169068y;

    /* JADX INFO: renamed from: z */
    public final AtomicBoolean f169069z = new AtomicBoolean();

    /* JADX INFO: renamed from: w */
    public final C26442a f169066w = new C26442a();

    public RunnableC39294f(RunnableC39293e runnableC39293e) {
        C39295g c39295g;
        C39295g c39295g2;
        this.f169067x = runnableC39293e;
        if (runnableC39293e.f169064y.f105041x) {
            c39295g2 = C39296h.f169075f;
        } else {
            do {
                if (runnableC39293e.f169063x.isEmpty()) {
                    c39295g = new C39295g(runnableC39293e.f169061F);
                    runnableC39293e.f169064y.mo78293a(c39295g);
                    break;
                }
                c39295g = (C39295g) runnableC39293e.f169063x.poll();
            } while (c39295g == null);
            c39295g2 = c39295g;
        }
        this.f169068y = c39295g2;
    }

    @Override // l73.AbstractC23415f
    /* JADX INFO: renamed from: a */
    public final InterfaceC26443b mo67906a(Runnable runnable, long j7, TimeUnit timeUnit) {
        return this.f169066w.f105041x ? EnumC30025d.f122538w : this.f169068y.m125268c(runnable, j7, timeUnit, this.f169066w);
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f169069z.compareAndSet(false, true)) {
            this.f169066w.dispose();
            if (C39296h.f169076g) {
                this.f169068y.m125268c(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            RunnableC39293e runnableC39293e = this.f169067x;
            runnableC39293e.getClass();
            long jNanoTime = System.nanoTime() + runnableC39293e.f169062w;
            C39295g c39295g = this.f169068y;
            c39295g.f169070y = jNanoTime;
            runnableC39293e.f169063x.offer(c39295g);
        }
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f169069z.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC39293e runnableC39293e = this.f169067x;
        runnableC39293e.getClass();
        long jNanoTime = System.nanoTime() + runnableC39293e.f169062w;
        C39295g c39295g = this.f169068y;
        c39295g.f169070y = jNanoTime;
        runnableC39293e.f169063x.offer(c39295g);
    }
}
