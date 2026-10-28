package eh3;

import d13.AbstractC11478a;
import gh3.ThreadFactoryC15864i;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xg3.AbstractC38283j;
import xg3.AbstractC38284k;

/* JADX INFO: renamed from: eh3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C13201e extends AbstractC38284k implements InterfaceC13213q {

    /* JADX INFO: renamed from: b */
    public static final long f45753b;

    /* JADX INFO: renamed from: c */
    public static final TimeUnit f45754c = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: d */
    public static final C13200d f45755d;

    /* JADX INFO: renamed from: e */
    public static final C13198b f45756e;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f45757a;

    static {
        C13200d c13200d = new C13200d(ThreadFactoryC15864i.f59964x);
        f45755d = c13200d;
        c13200d.mo14750b();
        C13198b c13198b = new C13198b(null, 0L, null);
        f45756e = c13198b;
        c13198b.m37105a();
        f45753b = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    public C13201e(ThreadFactoryC15864i threadFactoryC15864i) {
        C13198b c13198b = f45756e;
        AtomicReference atomicReference = new AtomicReference(c13198b);
        this.f45757a = atomicReference;
        C13198b c13198b2 = new C13198b(threadFactoryC15864i, f45753b, f45754c);
        while (!atomicReference.compareAndSet(c13198b, c13198b2)) {
            if (atomicReference.get() != c13198b) {
                c13198b2.m37105a();
                return;
            }
        }
    }

    @Override // xg3.AbstractC38284k
    /* JADX INFO: renamed from: a */
    public final AbstractC38283j mo37108a() {
        return new C13199c((C13198b) this.f45757a.get());
    }

    @Override // eh3.InterfaceC13213q
    public final void shutdown() {
        AtomicReference atomicReference;
        C13198b c13198b;
        C13198b c13198b2;
        do {
            atomicReference = this.f45757a;
            c13198b = (C13198b) atomicReference.get();
            c13198b2 = f45756e;
            if (c13198b == c13198b2) {
                return;
            }
        } while (!AbstractC11478a.m30869u(atomicReference, c13198b, c13198b2));
        c13198b.m37105a();
    }
}
