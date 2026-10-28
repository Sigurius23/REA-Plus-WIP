package ch3;

import bh3.InterfaceC3254a;
import gh3.C15857b;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p098dt.AbstractC12350b;
import p471rx.exceptions.MissingBackpressureException;
import xg3.AbstractC38292s;
import xg3.InterfaceC38275b;

/* JADX INFO: renamed from: ch3.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4692k0 extends AbstractC38292s {

    /* JADX INFO: renamed from: F */
    public final AtomicLong f19218F;

    /* JADX INFO: renamed from: G */
    public final AbstractC38292s f19219G;

    /* JADX INFO: renamed from: I */
    public final C15857b f19221I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC3254a f19222J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC38275b f19223K;

    /* JADX INFO: renamed from: E */
    public final ConcurrentLinkedQueue f19217E = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: H */
    public final AtomicBoolean f19220H = new AtomicBoolean(false);

    public C4692k0(AbstractC38292s abstractC38292s, Long l7, InterfaceC3254a interfaceC3254a, InterfaceC38275b interfaceC38275b) {
        this.f19219G = abstractC38292s;
        this.f19218F = l7 != null ? new AtomicLong(l7.longValue()) : null;
        this.f19222J = interfaceC3254a;
        this.f19221I = new C15857b(this);
        this.f19223K = interfaceC38275b;
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: d */
    public final void mo14748d() {
        m122689e(Long.MAX_VALUE);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (this.f19220H.get()) {
            return;
        }
        C15857b c15857b = this.f19221I;
        c15857b.f59951x = true;
        c15857b.m44772a();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        if (this.f19220H.get()) {
            return;
        }
        this.f19221I.m44773b(th3);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        long j7;
        boolean z4;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f19217E;
        C15857b c15857b = this.f19221I;
        AtomicLong atomicLong = this.f19218F;
        if (atomicLong != null) {
            do {
                j7 = atomicLong.get();
                if (j7 <= 0) {
                    boolean z13 = false;
                    try {
                        if (this.f19223K.mo122633a()) {
                            Object objPoll = concurrentLinkedQueue.poll();
                            if (atomicLong != null && objPoll != null) {
                                atomicLong.incrementAndGet();
                            }
                            z4 = objPoll != null;
                        }
                        z13 = z4;
                    } catch (MissingBackpressureException e5) {
                        if (this.f19220H.compareAndSet(false, true)) {
                            mo14750b();
                            this.f19219G.onError(e5);
                        }
                    }
                    InterfaceC3254a interfaceC3254a = this.f19222J;
                    if (interfaceC3254a != null) {
                        try {
                            interfaceC3254a.call();
                        } catch (Throwable th3) {
                            AbstractC12350b.m34573V(th3);
                            c15857b.m44773b(th3);
                            return;
                        }
                    }
                    if (!z13) {
                        return;
                    }
                }
            } while (!atomicLong.compareAndSet(j7, j7 - 1));
        }
        if (obj == null) {
            obj = AbstractC4677d.f19136b;
        }
        concurrentLinkedQueue.offer(obj);
        c15857b.m44772a();
    }
}
