package y73;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l73.AbstractC23415f;
import n73.C26442a;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.EnumC30025d;

/* JADX INFO: renamed from: y73.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C39303o extends AbstractC23415f {

    /* JADX INFO: renamed from: w */
    public final ScheduledExecutorService f169099w;

    /* JADX INFO: renamed from: x */
    public final C26442a f169100x = new C26442a();

    /* JADX INFO: renamed from: y */
    public volatile boolean f169101y;

    public C39303o(ScheduledExecutorService scheduledExecutorService) {
        this.f169099w = scheduledExecutorService;
    }

    @Override // l73.AbstractC23415f
    /* JADX INFO: renamed from: a */
    public final InterfaceC26443b mo67906a(Runnable runnable, long j7, TimeUnit timeUnit) {
        EnumC30025d enumC30025d = EnumC30025d.f122538w;
        if (this.f169101y) {
            return enumC30025d;
        }
        RunnableC39301m runnableC39301m = new RunnableC39301m(runnable, this.f169100x);
        this.f169100x.mo78293a(runnableC39301m);
        try {
            runnableC39301m.m125270a(j7 <= 0 ? this.f169099w.submit((Callable) runnableC39301m) : this.f169099w.schedule((Callable) runnableC39301m, j7, timeUnit));
            return runnableC39301m;
        } catch (RejectedExecutionException e5) {
            dispose();
            AbstractC21598x.m60677d0(e5);
            return enumC30025d;
        }
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        if (this.f169101y) {
            return;
        }
        this.f169101y = true;
        this.f169100x.dispose();
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f169101y;
    }
}
