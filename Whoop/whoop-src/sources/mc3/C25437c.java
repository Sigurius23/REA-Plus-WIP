package mc3;

import bc3.AbstractC3006f0;
import bc3.C3033m;
import ge3.AbstractC15751g;
import hc3.C17191x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: mc3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C25437c extends C25442h implements InterfaceC25435a {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f99626H = AtomicReferenceFieldUpdater.newUpdater(C25437c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C25437c(boolean z4) {
        super(1, z4 ? 1 : 0);
        this.owner$volatile = z4 ? null : AbstractC25438d.f99627a;
    }

    @Override // mc3.InterfaceC25435a
    /* JADX INFO: renamed from: b */
    public final Object mo68211b(InterfaceC30057d interfaceC30057d) {
        boolean zTryLock = tryLock();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zTryLock) {
            C3033m c3033mM8726t = AbstractC3006f0.m8726t(AbstractC15751g.m44424D(interfaceC30057d));
            try {
                C25436b c25436b = new C25436b(this, c3033mM8726t);
                while (true) {
                    int andDecrement = C25442h.f99632G.getAndDecrement(this);
                    if (andDecrement <= this.f99635w) {
                        if (andDecrement > 0) {
                            c25436b.mo8745g(c23454a0, this.f99636x);
                            break;
                        }
                        if (m74672c(c25436b)) {
                            break;
                        }
                    }
                }
                Object objM8773r = c3033mM8726t.m8773r();
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (objM8773r != enumC31071a) {
                    objM8773r = c23454a0;
                }
                if (objM8773r == enumC31071a) {
                    return objM8773r;
                }
            } catch (Throwable th3) {
                c3033mM8726t.m8756A();
                throw th3;
            }
        }
        return c23454a0;
    }

    @Override // mc3.InterfaceC25435a
    /* JADX INFO: renamed from: h */
    public final boolean mo68213h() {
        return Math.max(C25442h.f99632G.get(this), 0) == 0;
    }

    @Override // mc3.InterfaceC25435a
    /* JADX INFO: renamed from: i */
    public final void mo68214i(Object obj) {
        while (mo68213h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f99626H;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C17191x c17191x = AbstractC25438d.f99627a;
            if (obj2 != c17191x) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c17191x)) {
                        m74673d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC3006f0.m8724r(this) + "[isLocked=" + mo68213h() + ",owner=" + f99626H.get(this) + ']';
    }

    @Override // mc3.InterfaceC25435a
    public final boolean tryLock() {
        int i13;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C25442h.f99632G;
            int i14 = atomicIntegerFieldUpdater.get(this);
            int i15 = this.f99635w;
            if (i14 > i15) {
                do {
                    i13 = atomicIntegerFieldUpdater.get(this);
                    if (i13 <= i15) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, i15));
            } else {
                if (i14 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i14, i14 - 1)) {
                    f99626H.set(this, null);
                    return true;
                }
            }
        }
    }
}
