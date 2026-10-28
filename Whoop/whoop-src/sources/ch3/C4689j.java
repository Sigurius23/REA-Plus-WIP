package ch3;

import bh3.InterfaceC3260g;
import dh3.C12052a;
import fh3.C14493a;
import gh3.C15867l;
import gh3.EnumC15858c;
import hh3.C17298b;
import java.util.AbstractQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jh3.AbstractC21700a;
import mh3.C25565b;
import p098dt.AbstractC12350b;
import p471rx.exceptions.MissingBackpressureException;
import p471rx.internal.util.unsafe.AbstractC31895j;
import p471rx.internal.util.unsafe.C31889d;
import xg3.AbstractC38292s;
import xg3.C38280g;

/* JADX INFO: renamed from: ch3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C4689j extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final C4700o0 f19202E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC3260g f19203F;

    /* JADX INFO: renamed from: H */
    public final AbstractQueue f19205H;

    /* JADX INFO: renamed from: K */
    public final C25565b f19208K;

    /* JADX INFO: renamed from: L */
    public volatile boolean f19209L;

    /* JADX INFO: renamed from: M */
    public volatile boolean f19210M;

    /* JADX INFO: renamed from: G */
    public final C12052a f19204G = new C12052a();

    /* JADX INFO: renamed from: I */
    public final AtomicInteger f19206I = new AtomicInteger();

    /* JADX INFO: renamed from: J */
    public final AtomicReference f19207J = new AtomicReference();

    public C4689j(C4700o0 c4700o0, InterfaceC3260g interfaceC3260g) {
        this.f19202E = c4700o0;
        this.f19203F = interfaceC3260g;
        this.f19205H = (AbstractC31895j.f132402a == null || AbstractC31895j.f132403b) ? new C17298b(2) : new C31889d(2);
        this.f19208K = new C25565b(1);
        m122689e(2);
    }

    /* JADX INFO: renamed from: g */
    public final void m14768g() throws Throwable {
        if (this.f19206I.getAndIncrement() != 0) {
            return;
        }
        while (!this.f19202E.mo14749a()) {
            if (!this.f19210M) {
                boolean z4 = this.f19209L;
                Object objPoll = this.f19205H.poll();
                boolean z13 = objPoll == null;
                if (z4 && z13) {
                    Throwable thM44776c = EnumC15858c.m44776c(this.f19207J);
                    if (thM44776c == null) {
                        this.f19202E.onCompleted();
                        return;
                    } else {
                        if (EnumC15858c.m44775b(thM44776c)) {
                            return;
                        }
                        this.f19202E.onError(thM44776c);
                        return;
                    }
                }
                if (!z13) {
                    try {
                        C38280g c38280g = (C38280g) this.f19203F.mo1678b(AbstractC4677d.m14746c(objPoll));
                        if (c38280g == null) {
                            m14769h(new NullPointerException("The source returned by the mapper was null"));
                            return;
                        }
                        if (c38280g != C38280g.m122642l()) {
                            if (c38280g instanceof C15867l) {
                                this.f19210M = true;
                                this.f19204G.m33225c(new C4685h(((C15867l) c38280g).f59973x, this));
                            } else {
                                C4687i c4687i = new C4687i(this);
                                ((C14493a) this.f19208K.f100259x).m41405c(c4687i);
                                if (c4687i.mo14749a()) {
                                    return;
                                }
                                this.f19210M = true;
                                c38280g.m122671W(c4687i);
                            }
                            m122689e(1L);
                        } else {
                            m122689e(1L);
                        }
                    } catch (Throwable th3) {
                        AbstractC12350b.m34573V(th3);
                        m14769h(th3);
                        return;
                    }
                }
            }
            if (this.f19206I.decrementAndGet() == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14769h(Throwable th3) throws Throwable {
        mo14750b();
        AtomicReference atomicReference = this.f19207J;
        if (!EnumC15858c.m44774a(atomicReference, th3)) {
            AbstractC21700a.m61126a(th3);
            return;
        }
        Throwable thM44776c = EnumC15858c.m44776c(atomicReference);
        if (EnumC15858c.m44775b(thM44776c)) {
            return;
        }
        this.f19202E.onError(thM44776c);
    }

    /* JADX INFO: renamed from: i */
    public final void m14770i(long j7) {
        if (j7 != 0) {
            this.f19204G.m33224b(j7);
        }
        this.f19210M = false;
        m14768g();
    }

    /* JADX INFO: renamed from: j */
    public final void m14771j(Object obj) {
        this.f19202E.onNext(obj);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() throws Throwable {
        this.f19209L = true;
        m14768g();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) throws Throwable {
        if (!EnumC15858c.m44774a(this.f19207J, th3)) {
            AbstractC21700a.m61126a(th3);
            return;
        }
        this.f19209L = true;
        Throwable thM44776c = EnumC15858c.m44776c(this.f19207J);
        if (!EnumC15858c.m44775b(thM44776c)) {
            this.f19202E.onError(thM44776c);
        }
        this.f19208K.mo14750b();
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) throws Throwable {
        if (obj == null) {
            obj = AbstractC4677d.f19136b;
        }
        if (this.f19205H.offer(obj)) {
            m14768g();
        } else {
            mo14750b();
            onError(new MissingBackpressureException());
        }
    }
}
