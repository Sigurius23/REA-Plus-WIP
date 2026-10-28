package v73;

import a83.AbstractC0573a;
import a83.EnumC0575c;
import bi.AbstractC3269g;
import eg3.InterfaceC13182a;
import eg3.InterfaceC13183b;
import hg3.AbstractC17269i;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import l73.InterfaceC23411b;
import p249jc.C21565a;
import p73.InterfaceC28960a;
import s73.InterfaceC32246d;
import x73.C38044a;
import x73.C38045b;

/* JADX INFO: renamed from: v73.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C35780f extends AbstractC0573a implements InterfaceC23411b {

    /* JADX INFO: renamed from: E */
    public volatile boolean f152163E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f152164F;

    /* JADX INFO: renamed from: G */
    public Throwable f152165G;

    /* JADX INFO: renamed from: H */
    public final AtomicLong f152166H = new AtomicLong();

    /* JADX INFO: renamed from: I */
    public boolean f152167I;

    /* JADX INFO: renamed from: w */
    public final InterfaceC23411b f152168w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC32246d f152169x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC28960a f152170y;

    /* JADX INFO: renamed from: z */
    public Object f152171z;

    public C35780f(InterfaceC23411b interfaceC23411b, int i13, boolean z4, C21565a c21565a) {
        this.f152168w = interfaceC23411b;
        this.f152170y = c21565a;
        this.f152169x = z4 ? new C38045b(i13) : new C38044a(i13);
    }

    @Override // s73.InterfaceC32244b
    /* JADX INFO: renamed from: a */
    public final int mo1488a() {
        this.f152167I = true;
        return 2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eg3.b, java.lang.Object] */
    @Override // eg3.InterfaceC13182a
    /* JADX INFO: renamed from: b */
    public final void mo36113b(InterfaceC13183b interfaceC13183b) {
        if (EnumC0575c.m1491c(this.f152171z, interfaceC13183b)) {
            this.f152171z = interfaceC13183b;
            this.f152168w.mo36113b(this);
            interfaceC13183b.request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m113374c(boolean z4, boolean z13, InterfaceC13182a interfaceC13182a) {
        if (this.f152163E) {
            this.f152169x.clear();
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th3 = this.f152165G;
        if (th3 != null) {
            this.f152169x.clear();
            interfaceC13182a.onError(th3);
            return true;
        }
        if (!z13) {
            return false;
        }
        interfaceC13182a.onComplete();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eg3.b, java.lang.Object] */
    @Override // eg3.InterfaceC13183b
    public final void cancel() {
        if (this.f152163E) {
            return;
        }
        this.f152163E = true;
        this.f152171z.cancel();
        if (this.f152167I || getAndIncrement() != 0) {
            return;
        }
        this.f152169x.clear();
    }

    @Override // s73.InterfaceC32247e
    public final void clear() {
        this.f152169x.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m113375d() {
        if (getAndIncrement() == 0) {
            InterfaceC32246d interfaceC32246d = this.f152169x;
            InterfaceC23411b interfaceC23411b = this.f152168w;
            int iAddAndGet = 1;
            while (!m113374c(this.f152164F, interfaceC32246d.isEmpty(), interfaceC23411b)) {
                long j7 = this.f152166H.get();
                long j13 = 0;
                while (j13 != j7) {
                    boolean z4 = this.f152164F;
                    Object objPoll = interfaceC32246d.poll();
                    boolean z13 = objPoll == null;
                    if (m113374c(z4, z13, interfaceC23411b)) {
                        return;
                    }
                    if (z13) {
                        break;
                    }
                    interfaceC23411b.onNext(objPoll);
                    j13++;
                }
                if (j13 == j7 && m113374c(this.f152164F, interfaceC32246d.isEmpty(), interfaceC23411b)) {
                    return;
                }
                if (j13 != 0 && j7 != Long.MAX_VALUE) {
                    this.f152166H.addAndGet(-j13);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // s73.InterfaceC32247e
    public final boolean isEmpty() {
        return this.f152169x.isEmpty();
    }

    @Override // eg3.InterfaceC13182a
    public final void onComplete() {
        this.f152164F = true;
        if (this.f152167I) {
            this.f152168w.onComplete();
        } else {
            m113375d();
        }
    }

    @Override // eg3.InterfaceC13182a
    public final void onError(Throwable th3) {
        this.f152165G = th3;
        this.f152164F = true;
        if (this.f152167I) {
            this.f152168w.onError(th3);
        } else {
            m113375d();
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [eg3.b, java.lang.Object] */
    @Override // eg3.InterfaceC13182a
    public final void onNext(Object obj) {
        if (this.f152169x.offer(obj)) {
            if (this.f152167I) {
                this.f152168w.onNext(null);
                return;
            } else {
                m113375d();
                return;
            }
        }
        this.f152171z.cancel();
        MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
        try {
            this.f152170y.run();
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            missingBackpressureException.initCause(th3);
        }
        onError(missingBackpressureException);
    }

    @Override // s73.InterfaceC32247e
    public final Object poll() {
        return this.f152169x.poll();
    }

    @Override // eg3.InterfaceC13183b
    public final void request(long j7) {
        if (this.f152167I || !EnumC0575c.m1490b(j7)) {
            return;
        }
        AbstractC17269i.m48908p(this.f152166H, j7);
        m113375d();
    }
}
