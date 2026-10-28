package ch3;

import gh3.C15862g;
import java.util.AbstractQueue;
import p098dt.AbstractC12350b;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ch3.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4680e0 extends AbstractC38292s {

    /* JADX INFO: renamed from: J */
    public static final int f19144J = C15862g.f59961x / 4;

    /* JADX INFO: renamed from: E */
    public final C4684g0 f19145E;

    /* JADX INFO: renamed from: F */
    public final long f19146F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f19147G;

    /* JADX INFO: renamed from: H */
    public volatile C15862g f19148H;

    /* JADX INFO: renamed from: I */
    public int f19149I;

    public C4680e0(C4684g0 c4684g0, long j7) {
        this.f19145E = c4684g0;
        this.f19146F = j7;
    }

    @Override // xg3.AbstractC38292s
    /* JADX INFO: renamed from: d */
    public final void mo14748d() {
        int i13 = C15862g.f59961x;
        this.f19149I = i13;
        m122689e(i13);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        this.f19147G = true;
        this.f19145E.m14757h();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        this.f19145E.m14759j().offer(th3);
        this.f19147G = true;
        this.f19145E.m14757h();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) throws Throwable {
        boolean z4;
        AbstractQueue abstractQueue;
        C4684g0 c4684g0 = this.f19145E;
        long j7 = c4684g0.f19171H.get();
        boolean z13 = true;
        if (j7 != 0) {
            synchronized (c4684g0) {
                try {
                    j7 = c4684g0.f19171H.get();
                    if (c4684g0.f19176M || j7 == 0) {
                        z4 = false;
                    } else {
                        c4684g0.f19176M = true;
                        z4 = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            z4 = false;
        }
        if (!z4) {
            C4684g0.m14755k(this, obj);
            c4684g0.m14757h();
            return;
        }
        C15862g c15862g = this.f19148H;
        if (c15862g != null && (abstractQueue = c15862g.f59962w) != null && !abstractQueue.isEmpty()) {
            C4684g0.m14755k(this, obj);
            c4684g0.m14758i();
            return;
        }
        try {
            try {
                c4684g0.f19168E.onNext(obj);
            } catch (Throwable th4) {
                try {
                    if (!c4684g0.f19169F) {
                        AbstractC12350b.m34573V(th4);
                        mo14750b();
                        onError(th4);
                        return;
                    }
                    c4684g0.m14759j().offer(th4);
                } catch (Throwable th5) {
                    th = th5;
                    z13 = false;
                    if (!z13) {
                        synchronized (c4684g0) {
                            c4684g0.f19176M = false;
                        }
                    }
                    throw th;
                }
            }
            if (j7 != Long.MAX_VALUE) {
                c4684g0.f19171H.addAndGet(-1);
            }
            int i13 = this.f19149I - ((int) 1);
            if (i13 > f19144J) {
                this.f19149I = i13;
            } else {
                int i14 = C15862g.f59961x;
                this.f19149I = i14;
                int i15 = i14 - i13;
                if (i15 > 0) {
                    m122689e(i15);
                }
            }
            synchronized (c4684g0) {
                try {
                    if (c4684g0.f19177N) {
                        c4684g0.f19177N = false;
                        c4684g0.m14758i();
                    } else {
                        c4684g0.f19176M = false;
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (!z13) {
                synchronized (c4684g0) {
                    c4684g0.f19176M = false;
                }
            }
            throw th;
        }
    }
}
