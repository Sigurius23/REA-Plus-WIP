package eh3;

import d13.AbstractC11478a;
import gh3.ThreadFactoryC15864i;
import java.util.concurrent.atomic.AtomicReference;
import xg3.AbstractC38283j;
import xg3.AbstractC38284k;

/* JADX INFO: renamed from: eh3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C13205i extends AbstractC38284k implements InterfaceC13213q {

    /* JADX INFO: renamed from: b */
    public static final int f45765b;

    /* JADX INFO: renamed from: c */
    public static final C13204h f45766c;

    /* JADX INFO: renamed from: d */
    public static final C13203g f45767d;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f45768a;

    static {
        int iIntValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iIntValue <= 0 || iIntValue > iAvailableProcessors) {
            iIntValue = iAvailableProcessors;
        }
        f45765b = iIntValue;
        C13204h c13204h = new C13204h(ThreadFactoryC15864i.f59964x);
        f45766c = c13204h;
        c13204h.mo14750b();
        f45767d = new C13203g(null, 0);
    }

    public C13205i(ThreadFactoryC15864i threadFactoryC15864i) {
        C13203g c13203g = f45767d;
        AtomicReference atomicReference = new AtomicReference(c13203g);
        this.f45768a = atomicReference;
        C13203g c13203g2 = new C13203g(threadFactoryC15864i, f45765b);
        while (!atomicReference.compareAndSet(c13203g, c13203g2)) {
            if (atomicReference.get() != c13203g) {
                for (C13204h c13204h : c13203g2.f45763b) {
                    c13204h.mo14750b();
                }
                return;
            }
        }
    }

    @Override // xg3.AbstractC38284k
    /* JADX INFO: renamed from: a */
    public final AbstractC38283j mo37108a() {
        C13204h c13204h;
        C13203g c13203g = (C13203g) this.f45768a.get();
        int i13 = c13203g.f45762a;
        if (i13 == 0) {
            c13204h = f45766c;
        } else {
            C13204h[] c13204hArr = c13203g.f45763b;
            long j7 = c13203g.f45764c;
            c13203g.f45764c = 1 + j7;
            c13204h = c13204hArr[(int) (j7 % ((long) i13))];
        }
        return new C13202f(c13204h);
    }

    @Override // eh3.InterfaceC13213q
    public final void shutdown() {
        AtomicReference atomicReference;
        C13203g c13203g;
        C13203g c13203g2;
        do {
            atomicReference = this.f45768a;
            c13203g = (C13203g) atomicReference.get();
            c13203g2 = f45767d;
            if (c13203g == c13203g2) {
                return;
            }
        } while (!AbstractC11478a.m30870v(atomicReference, c13203g, c13203g2));
        for (C13204h c13204h : c13203g.f45763b) {
            c13204h.mo14750b();
        }
    }
}
