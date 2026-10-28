package mc3;

import bc3.AbstractC3006f0;
import bc3.C3029l;
import bc3.C3033m;
import bc3.InterfaceC3025k;
import bc3.InterfaceC3044o2;
import ge3.AbstractC15751g;
import hc3.AbstractC17167b;
import hc3.AbstractC17189v;
import hc3.C17191x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import lc3.C23836f;
import lc3.InterfaceC23837g;
import p031b9.AbstractC2875y;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: mc3.h */
/* JADX INFO: loaded from: classes5.dex */
public class C25442h {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: w */
    public final int f99635w;

    /* JADX INFO: renamed from: x */
    public final C3029l f99636x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f99633y = AtomicReferenceFieldUpdater.newUpdater(C25442h.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicLongFieldUpdater f99634z = AtomicLongFieldUpdater.newUpdater(C25442h.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f99630E = AtomicReferenceFieldUpdater.newUpdater(C25442h.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicLongFieldUpdater f99631F = AtomicLongFieldUpdater.newUpdater(C25442h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f99632G = AtomicIntegerFieldUpdater.newUpdater(C25442h.class, "_availablePermits$volatile");

    public C25442h(int i13, int i14) {
        this.f99635w = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i14 < 0 || i14 > i13) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "The number of acquired permits should be in 0..").toString());
        }
        C25445k c25445k = new C25445k(0L, null, 2);
        this.head$volatile = c25445k;
        this.tail$volatile = c25445k;
        this._availablePermits$volatile = i13 - i14;
        this.f99636x = new C3029l(this, 6);
    }

    /* JADX INFO: renamed from: a */
    public final Object m74671a(AbstractC32269c abstractC32269c) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i13;
        do {
            atomicIntegerFieldUpdater = f99632G;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i13 = this.f99635w;
        } while (andDecrement > i13);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (andDecrement <= 0) {
            C3033m c3033mM8726t = AbstractC3006f0.m8726t(AbstractC15751g.m44424D(abstractC32269c));
            try {
                if (!m74672c(c3033mM8726t)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i13) {
                            if (andDecrement2 > 0) {
                                c3033mM8726t.mo8745g(c23454a0, this.f99636x);
                                break;
                            }
                            if (m74672c(c3033mM8726t)) {
                                break;
                            }
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

    /* JADX INFO: renamed from: c */
    public final boolean m74672c(InterfaceC3044o2 interfaceC3044o2) {
        Object objM48476b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f99630E;
        C25445k c25445k = (C25445k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f99631F.getAndIncrement(this);
        C25440f c25440f = C25440f.f99628w;
        long j7 = andIncrement / ((long) AbstractC25444j.f99642f);
        loop0: while (true) {
            objM48476b = AbstractC17167b.m48476b(c25445k, j7, c25440f);
            if (!AbstractC17167b.m48478d(objM48476b)) {
                AbstractC17189v abstractC17189vM48477c = AbstractC17167b.m48477c(objM48476b);
                while (true) {
                    AbstractC17189v abstractC17189v = (AbstractC17189v) atomicReferenceFieldUpdater.get(this);
                    if (abstractC17189v.f66007y >= abstractC17189vM48477c.f66007y) {
                        break loop0;
                    }
                    if (!abstractC17189vM48477c.m48544j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC17189v, abstractC17189vM48477c)) {
                            if (!abstractC17189v.m48542f()) {
                                break loop0;
                            }
                            abstractC17189v.m48495e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC17189v);
                    if (abstractC17189vM48477c.m48542f()) {
                        abstractC17189vM48477c.m48495e();
                    }
                }
            } else {
                break;
            }
        }
        C25445k c25445k2 = (C25445k) AbstractC17167b.m48477c(objM48476b);
        AtomicReferenceArray atomicReferenceArray = c25445k2.f99643E;
        int i13 = (int) (andIncrement % ((long) AbstractC25444j.f99642f));
        while (!atomicReferenceArray.compareAndSet(i13, null, interfaceC3044o2)) {
            if (atomicReferenceArray.get(i13) != null) {
                C17191x c17191x = AbstractC25444j.f99638b;
                C17191x c17191x2 = AbstractC25444j.f99639c;
                while (!atomicReferenceArray.compareAndSet(i13, c17191x, c17191x2)) {
                    if (atomicReferenceArray.get(i13) != c17191x) {
                        return false;
                    }
                }
                ((InterfaceC3025k) interfaceC3044o2).mo8745g(C23454a0.f92919a, this.f99636x);
                return true;
            }
        }
        interfaceC3044o2.mo8762b(c25445k2, i13);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m74673d() {
        int i13;
        Object objM48476b;
        boolean z4;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f99632G;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i14 = this.f99635w;
            if (andIncrement >= i14) {
                do {
                    i13 = atomicIntegerFieldUpdater.get(this);
                    if (i13 <= i14) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, i14));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i14).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f99633y;
            C25445k c25445k = (C25445k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f99634z.getAndIncrement(this);
            long j7 = andIncrement2 / ((long) AbstractC25444j.f99642f);
            C25441g c25441g = C25441g.f99629w;
            while (true) {
                objM48476b = AbstractC17167b.m48476b(c25445k, j7, c25441g);
                if (!AbstractC17167b.m48478d(objM48476b)) {
                    AbstractC17189v abstractC17189vM48477c = AbstractC17167b.m48477c(objM48476b);
                    while (true) {
                        AbstractC17189v abstractC17189v = (AbstractC17189v) atomicReferenceFieldUpdater.get(this);
                        if (abstractC17189v.f66007y >= abstractC17189vM48477c.f66007y) {
                            break;
                        }
                        if (!abstractC17189vM48477c.m48544j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC17189v, abstractC17189vM48477c)) {
                                if (!abstractC17189v.m48542f()) {
                                    break;
                                }
                                abstractC17189v.m48495e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == abstractC17189v);
                        if (abstractC17189vM48477c.m48542f()) {
                            abstractC17189vM48477c.m48495e();
                        }
                    }
                } else {
                    break;
                }
            }
            C25445k c25445k2 = (C25445k) AbstractC17167b.m48477c(objM48476b);
            AtomicReferenceArray atomicReferenceArray = c25445k2.f99643E;
            c25445k2.m48492b();
            z4 = false;
            if (c25445k2.f66007y <= j7) {
                int i15 = (int) (andIncrement2 % ((long) AbstractC25444j.f99642f));
                Object andSet = atomicReferenceArray.getAndSet(i15, AbstractC25444j.f99638b);
                if (andSet == null) {
                    int i16 = AbstractC25444j.f99637a;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            C17191x c17191x = AbstractC25444j.f99638b;
                            C17191x c17191x2 = AbstractC25444j.f99640d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i15, c17191x, c17191x2)) {
                                    z4 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i15) == c17191x);
                            z4 = !z4;
                            break;
                        }
                        if (atomicReferenceArray.get(i15) == AbstractC25444j.f99639c) {
                            z4 = true;
                            break;
                        }
                        i17++;
                    }
                } else if (andSet != AbstractC25444j.f99641e) {
                    boolean z13 = andSet instanceof InterfaceC3025k;
                    C23454a0 c23454a0 = C23454a0.f92919a;
                    if (z13) {
                        InterfaceC3025k interfaceC3025k = (InterfaceC3025k) andSet;
                        C17191x c17191xMo8743c = interfaceC3025k.mo8743c(c23454a0, this.f99636x);
                        if (c17191xMo8743c != null) {
                            interfaceC3025k.mo8746n(c17191xMo8743c);
                            z4 = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof InterfaceC23837g)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((C23836f) ((InterfaceC23837g) andSet)).m70042g(this, c23454a0) == 0) {
                            z4 = true;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (!z4);
    }
}
