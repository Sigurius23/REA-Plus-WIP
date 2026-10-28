package p390p1;

import androidx.lifecycle.C1591h2;
import bc3.C3033m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import p002a0.C0047q0;
import p505ts.AbstractC34132o;
import p602x1.C37815a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: p1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C28607e implements InterfaceC28680w0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC4339a f115727w;

    /* JADX INFO: renamed from: y */
    public Throwable f115729y;

    /* JADX INFO: renamed from: x */
    public final Object f115728x = new Object();

    /* JADX INFO: renamed from: z */
    public final C37815a f115730z = new C37815a(0);

    /* JADX INFO: renamed from: E */
    public C0047q0 f115725E = new C0047q0();

    /* JADX INFO: renamed from: F */
    public C0047q0 f115726F = new C0047q0();

    public C28607e(InterfaceC4339a interfaceC4339a) {
        this.f115727w = interfaceC4339a;
    }

    /* JADX INFO: renamed from: a */
    public final void m86984a(long j7) {
        int i13;
        C3033m c3033m;
        Object objM107888l;
        synchronized (this.f115728x) {
            try {
                C0047q0 c0047q0 = this.f115725E;
                this.f115725E = this.f115726F;
                this.f115726F = c0047q0;
                C37815a c37815a = this.f115730z;
                do {
                    i13 = c37815a.get();
                } while (!c37815a.compareAndSet(i13, ((((i13 >>> 27) & 15) + 1) & 15) << 27));
                int i14 = c0047q0.f137b;
                for (int i15 = 0; i15 < i14; i15++) {
                    C28603d c28603d = (C28603d) c0047q0.m102e(i15);
                    Function1 function1 = c28603d.f115718a;
                    if (function1 != null && (c3033m = c28603d.f115719b) != null) {
                        try {
                            objM107888l = function1.invoke(Long.valueOf(j7));
                        } catch (Throwable th3) {
                            objM107888l = AbstractC34132o.m107888l(th3);
                        }
                        c3033m.resumeWith(objM107888l);
                    }
                }
                c0047q0.m100c();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // p390p1.InterfaceC28680w0
    /* JADX INFO: renamed from: k */
    public final Object mo7286k(Function1 function1, InterfaceC30057d interfaceC30057d) {
        int i13;
        int i14;
        int i15;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        C28603d c28603d = new C28603d();
        c28603d.f115718a = function1;
        c28603d.f115719b = c3033m;
        C22665e0 c22665e0 = new C22665e0();
        c22665e0.f89334w = -1;
        synchronized (this.f115728x) {
            Throwable th3 = this.f115729y;
            if (th3 != null) {
                c3033m.resumeWith(AbstractC34132o.m107888l(th3));
            } else {
                C37815a c37815a = this.f115730z;
                do {
                    i13 = c37815a.get();
                    i14 = i13 + 1;
                } while (!c37815a.compareAndSet(i13, i14));
                boolean z4 = (134217727 & i14) == 1;
                c22665e0.f89334w = (i14 >>> 27) & 15;
                this.f115725E.m98a(c28603d);
                c3033m.m8776u(new C1591h2(c28603d, this, c22665e0, 2));
                if (z4) {
                    try {
                        this.f115727w.invoke();
                    } catch (Throwable th4) {
                        synchronized (this.f115728x) {
                            try {
                                if (this.f115729y == null) {
                                    this.f115729y = th4;
                                    C0047q0 c0047q0 = this.f115725E;
                                    Object[] objArr = c0047q0.f136a;
                                    int i16 = c0047q0.f137b;
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        C3033m c3033m2 = ((C28603d) objArr[i17]).f115719b;
                                        if (c3033m2 != null) {
                                            c3033m2.resumeWith(AbstractC34132o.m107888l(th4));
                                        }
                                    }
                                    this.f115725E.m100c();
                                    C37815a c37815a2 = this.f115730z;
                                    do {
                                        i15 = c37815a2.get();
                                    } while (!c37815a2.compareAndSet(i15, ((((i15 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    }
                }
            }
        }
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }
}
