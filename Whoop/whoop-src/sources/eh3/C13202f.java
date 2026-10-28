package eh3;

import bh3.InterfaceC3254a;
import ch3.C4719y;
import gh3.C15868m;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import jh3.C21705f;
import mh3.AbstractC25568e;
import mh3.C25566c;
import p101dx.C12421b;
import xg3.AbstractC38283j;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: eh3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C13202f extends AbstractC38283j {

    /* JADX INFO: renamed from: w */
    public final C15868m f45758w;

    /* JADX INFO: renamed from: x */
    public final C25566c f45759x;

    /* JADX INFO: renamed from: y */
    public final C15868m f45760y;

    /* JADX INFO: renamed from: z */
    public final C13204h f45761z;

    public C13202f(C13204h c13204h) {
        C15868m c15868m = new C15868m();
        this.f45758w = c15868m;
        C25566c c25566c = new C25566c();
        this.f45759x = c25566c;
        C15868m c15868m2 = new C15868m();
        c15868m2.f59974w = new LinkedList(Arrays.asList(c15868m, c25566c));
        this.f45760y = c15868m2;
        this.f45761z = c13204h;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f45760y.f59975x;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        this.f45760y.mo14750b();
    }

    @Override // xg3.AbstractC38283j
    /* JADX INFO: renamed from: c */
    public final InterfaceC38293t mo37106c(InterfaceC3254a interfaceC3254a) {
        if (this.f45760y.f59975x) {
            return AbstractC25568e.f100262a;
        }
        C13204h c13204h = this.f45761z;
        C12421b c12421b = new C12421b(2, this, interfaceC3254a);
        C15868m c15868m = this.f45758w;
        ScheduledExecutorService scheduledExecutorService = c13204h.f45777w;
        C21705f.f83334f.m61160e().getClass();
        RunnableC13212p runnableC13212p = new RunnableC13212p(c12421b, c15868m);
        c15868m.m44779c(runnableC13212p);
        runnableC13212p.m37113c(scheduledExecutorService.submit(runnableC13212p));
        return runnableC13212p;
    }

    @Override // xg3.AbstractC38283j
    /* JADX INFO: renamed from: d */
    public final InterfaceC38293t mo37107d(InterfaceC3254a interfaceC3254a, long j7, TimeUnit timeUnit) {
        if (this.f45760y.f59975x) {
            return AbstractC25568e.f100262a;
        }
        C13204h c13204h = this.f45761z;
        C4719y c4719y = new C4719y(this, interfaceC3254a, 1);
        C25566c c25566c = this.f45759x;
        ScheduledExecutorService scheduledExecutorService = c13204h.f45777w;
        C21705f.f83334f.m61160e().getClass();
        RunnableC13212p runnableC13212p = new RunnableC13212p(c4719y, c25566c);
        c25566c.m75179c(runnableC13212p);
        runnableC13212p.m37113c(j7 <= 0 ? scheduledExecutorService.submit(runnableC13212p) : scheduledExecutorService.schedule(runnableC13212p, j7, timeUnit));
        return runnableC13212p;
    }
}
