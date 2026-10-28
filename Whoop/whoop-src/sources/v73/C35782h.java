package v73;

import a83.EnumC0575c;
import eg3.InterfaceC13183b;
import hg3.AbstractC17269i;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23411b;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: v73.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C35782h extends AtomicInteger implements InterfaceC23411b, InterfaceC13183b {

    /* JADX INFO: renamed from: E */
    public volatile boolean f152175E;

    /* JADX INFO: renamed from: F */
    public final AtomicLong f152176F = new AtomicLong();

    /* JADX INFO: renamed from: G */
    public final AtomicReference f152177G = new AtomicReference();

    /* JADX INFO: renamed from: w */
    public final InterfaceC23411b f152178w;

    /* JADX INFO: renamed from: x */
    public Object f152179x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f152180y;

    /* JADX INFO: renamed from: z */
    public Throwable f152181z;

    public C35782h(InterfaceC23411b interfaceC23411b) {
        this.f152178w = interfaceC23411b;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m113376a(boolean z4, boolean z13, InterfaceC23411b interfaceC23411b, AtomicReference atomicReference) {
        if (this.f152175E) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th3 = this.f152181z;
        if (th3 != null) {
            atomicReference.lazySet(null);
            interfaceC23411b.onError(th3);
            return true;
        }
        if (!z13) {
            return false;
        }
        interfaceC23411b.onComplete();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg3.b, java.lang.Object] */
    @Override // eg3.InterfaceC13182a
    /* JADX INFO: renamed from: b */
    public final void mo36113b(InterfaceC13183b interfaceC13183b) {
        if (EnumC0575c.m1491c(this.f152179x, interfaceC13183b)) {
            this.f152179x = interfaceC13183b;
            this.f152178w.mo36113b(this);
            interfaceC13183b.request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m113377c() {
        long j7;
        long j13;
        if (getAndIncrement() != 0) {
            return;
        }
        InterfaceC23411b interfaceC23411b = this.f152178w;
        AtomicLong atomicLong = this.f152176F;
        AtomicReference atomicReference = this.f152177G;
        int iAddAndGet = 1;
        do {
            long j14 = 0;
            while (true) {
                if (j14 == atomicLong.get()) {
                    break;
                }
                boolean z4 = this.f152180y;
                Object andSet = atomicReference.getAndSet(null);
                boolean z13 = andSet == null;
                if (m113376a(z4, z13, interfaceC23411b, atomicReference)) {
                    return;
                }
                if (z13) {
                    break;
                }
                interfaceC23411b.onNext(andSet);
                j14++;
            }
            if (j14 == atomicLong.get()) {
                if (m113376a(this.f152180y, atomicReference.get() == null, interfaceC23411b, atomicReference)) {
                    return;
                }
            }
            if (j14 != 0) {
                do {
                    j7 = atomicLong.get();
                    if (j7 == Long.MAX_VALUE) {
                        break;
                    }
                    j13 = j7 - j14;
                    if (j13 < 0) {
                        AbstractC21598x.m60677d0(new IllegalStateException(AbstractC11895b.m31994m(j13, "More produced than requested: ")));
                        j13 = 0;
                    }
                } while (!atomicLong.compareAndSet(j7, j13));
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eg3.b, java.lang.Object] */
    @Override // eg3.InterfaceC13183b
    public final void cancel() {
        if (this.f152175E) {
            return;
        }
        this.f152175E = true;
        this.f152179x.cancel();
        if (getAndIncrement() == 0) {
            this.f152177G.lazySet(null);
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onComplete() {
        this.f152180y = true;
        m113377c();
    }

    @Override // eg3.InterfaceC13182a
    public final void onError(Throwable th3) {
        this.f152181z = th3;
        this.f152180y = true;
        m113377c();
    }

    @Override // eg3.InterfaceC13182a
    public final void onNext(Object obj) {
        this.f152177G.lazySet(obj);
        m113377c();
    }

    @Override // eg3.InterfaceC13183b
    public final void request(long j7) {
        if (EnumC0575c.m1490b(j7)) {
            AbstractC17269i.m48908p(this.f152176F, j7);
            m113377c();
        }
    }
}
