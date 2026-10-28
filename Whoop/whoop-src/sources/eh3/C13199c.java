package eh3;

import bh3.InterfaceC3254a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mh3.AbstractC25568e;
import mh3.C25566c;
import p101dx.C12421b;
import xg3.AbstractC38283j;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: eh3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C13199c extends AbstractC38283j implements InterfaceC3254a {

    /* JADX INFO: renamed from: x */
    public final C13198b f45749x;

    /* JADX INFO: renamed from: y */
    public final C13200d f45750y;

    /* JADX INFO: renamed from: w */
    public final C25566c f45748w = new C25566c();

    /* JADX INFO: renamed from: z */
    public final AtomicBoolean f45751z = new AtomicBoolean();

    public C13199c(C13198b c13198b) {
        C13200d c13200d;
        C13200d c13200d2;
        this.f45749x = c13198b;
        if (c13198b.f45745d.f100261x) {
            c13200d2 = C13201e.f45755d;
        } else {
            do {
                if (c13198b.f45744c.isEmpty()) {
                    c13200d = new C13200d(c13198b.f45742a);
                    c13198b.f45745d.m75179c(c13200d);
                    break;
                }
                c13200d = (C13200d) c13198b.f45744c.poll();
            } while (c13200d == null);
            c13200d2 = c13200d;
        }
        this.f45750y = c13200d2;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f45748w.f100261x;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        if (this.f45751z.compareAndSet(false, true)) {
            this.f45750y.mo37106c(this);
        }
        this.f45748w.mo14750b();
    }

    @Override // xg3.AbstractC38283j
    /* JADX INFO: renamed from: c */
    public final InterfaceC38293t mo37106c(InterfaceC3254a interfaceC3254a) {
        return mo37107d(interfaceC3254a, 0L, null);
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        C13198b c13198b = this.f45749x;
        c13198b.getClass();
        long jNanoTime = System.nanoTime() + c13198b.f45743b;
        C13200d c13200d = this.f45750y;
        c13200d.f45752I = jNanoTime;
        c13198b.f45744c.offer(c13200d);
    }

    @Override // xg3.AbstractC38283j
    /* JADX INFO: renamed from: d */
    public final InterfaceC38293t mo37107d(InterfaceC3254a interfaceC3254a, long j7, TimeUnit timeUnit) {
        if (this.f45748w.f100261x) {
            return AbstractC25568e.f100262a;
        }
        RunnableC13212p runnableC13212pM37111f = this.f45750y.m37111f(new C12421b(1, this, interfaceC3254a), j7, timeUnit);
        this.f45748w.m75179c(runnableC13212pM37111f);
        runnableC13212pM37111f.f45792w.m44779c(new C13211o(runnableC13212pM37111f, this.f45748w, 1));
        return runnableC13212pM37111f;
    }
}
