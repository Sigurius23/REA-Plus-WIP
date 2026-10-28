package dc3;

import bc3.AbstractC3006f0;
import bc3.C3033m;
import bc3.InterfaceC3025k;
import bc3.InterfaceC3044o2;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import d13.AbstractC11478a;
import fc3.C14384o;
import ge3.AbstractC15751g;
import hc3.AbstractC17167b;
import hc3.AbstractC17169c;
import hc3.AbstractC17189v;
import hc3.AbstractC17190w;
import hc3.C17191x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import l83.C23454a0;
import lc3.C23836f;
import lc3.EnumC23840j;
import lc3.InterfaceC23837g;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p581we.C37199o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.time.DurationKt;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: dc3.h */
/* JADX INFO: loaded from: classes5.dex */
public class C11923h implements InterfaceC11927l {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: w */
    public final int f39006w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicLongFieldUpdater f39003x = AtomicLongFieldUpdater.newUpdater(C11923h.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicLongFieldUpdater f39004y = AtomicLongFieldUpdater.newUpdater(C11923h.class, "receivers$volatile");

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicLongFieldUpdater f39005z = AtomicLongFieldUpdater.newUpdater(C11923h.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ AtomicLongFieldUpdater f38997E = AtomicLongFieldUpdater.newUpdater(C11923h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38998F = AtomicReferenceFieldUpdater.newUpdater(C11923h.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38999G = AtomicReferenceFieldUpdater.newUpdater(C11923h.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f39000H = AtomicReferenceFieldUpdater.newUpdater(C11923h.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f39001I = AtomicReferenceFieldUpdater.newUpdater(C11923h.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f39002J = AtomicReferenceFieldUpdater.newUpdater(C11923h.class, Object.class, "closeHandler$volatile");

    public C11923h(int i13) {
        this.f39006w = i13;
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C11931p c11931p = AbstractC11925j.f39008a;
        this.bufferEnd$volatile = i13 != 0 ? i13 != Integer.MAX_VALUE ? i13 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f39005z.get(this);
        C11931p c11931p2 = new C11931p(0L, null, this, 3);
        this.sendSegment$volatile = c11931p2;
        this.receiveSegment$volatile = c11931p2;
        if (m32224z()) {
            c11931p2 = AbstractC11925j.f39008a;
            AbstractC22676k.m65748h(c11931p2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c11931p2;
        this._closeCause$volatile = AbstractC11925j.f39026s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: C */
    public static Object m32189C(C11923h c11923h, AbstractC32269c abstractC32269c) {
        C11921f c11921f;
        C11931p c11931p;
        if (abstractC32269c instanceof C11921f) {
            c11921f = (C11921f) abstractC32269c;
            int i13 = c11921f.f38993y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11921f.f38993y = i13 - Integer.MIN_VALUE;
            } else {
                c11921f = new C11921f(c11923h, abstractC32269c);
            }
        } else {
            c11921f = new C11921f(c11923h, abstractC32269c);
        }
        C11921f c11921f2 = c11921f;
        Object obj = c11921f2.f38991w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11921f2.f38993y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C11930o) obj).f39032a;
        }
        AbstractC34132o.m107864I(obj);
        C11931p c11931p2 = (C11931p) f38999G.get(c11923h);
        while (!c11923h.m32221w()) {
            long andIncrement = f39004y.getAndIncrement(c11923h);
            long j7 = AbstractC11925j.f39009b;
            long j13 = andIncrement / j7;
            int i15 = (int) (andIncrement % j7);
            if (c11931p2.f66007y != j13) {
                C11931p c11931pM32212m = c11923h.m32212m(j13, c11931p2);
                if (c11931pM32212m == null) {
                    continue;
                } else {
                    c11931p = c11931pM32212m;
                }
            } else {
                c11931p = c11931p2;
            }
            C11923h c11923h2 = c11923h;
            Object objM32200H = c11923h2.m32200H(c11931p, i15, andIncrement, null);
            if (objM32200H == AbstractC11925j.f39020m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM32200H != AbstractC11925j.f39022o) {
                if (objM32200H != AbstractC11925j.f39021n) {
                    c11931p.m48492b();
                    return objM32200H;
                }
                c11921f2.f38993y = 1;
                Object objM32196D = c11923h2.m32196D(c11931p, i15, andIncrement, c11921f2);
                return objM32196D == enumC31071a ? enumC31071a : objM32196D;
            }
            if (andIncrement < c11923h2.m32216q()) {
                c11931p.m48492b();
            }
            c11923h = c11923h2;
            c11931p2 = c11931p;
        }
        return new C11928m(c11923h.m32213n());
    }

    /* JADX INFO: renamed from: b */
    public static final C11931p m32190b(C11923h c11923h, long j7, C11931p c11931p) {
        Object objM48476b;
        C11923h c11923h2;
        C11931p c11931p2 = AbstractC11925j.f39008a;
        C11924i c11924i = C11924i.f39007w;
        loop0: while (true) {
            objM48476b = AbstractC17167b.m48476b(c11931p, j7, c11924i);
            if (!AbstractC17167b.m48478d(objM48476b)) {
                AbstractC17189v abstractC17189vM48477c = AbstractC17167b.m48477c(objM48476b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38998F;
                    AbstractC17189v abstractC17189v = (AbstractC17189v) atomicReferenceFieldUpdater.get(c11923h);
                    if (abstractC17189v.f66007y >= abstractC17189vM48477c.f66007y) {
                        break loop0;
                    }
                    if (!abstractC17189vM48477c.m48544j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c11923h, abstractC17189v, abstractC17189vM48477c)) {
                            if (!abstractC17189v.m48542f()) {
                                break loop0;
                            }
                            abstractC17189v.m48495e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c11923h) == abstractC17189v);
                    if (abstractC17189vM48477c.m48542f()) {
                        abstractC17189vM48477c.m48495e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM48478d = AbstractC17167b.m48478d(objM48476b);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39004y;
        if (zM48478d) {
            c11923h.m32222x();
            if (c11931p.f66007y * ((long) AbstractC11925j.f39009b) < atomicLongFieldUpdater.get(c11923h)) {
                c11931p.m48492b();
                return null;
            }
        } else {
            C11931p c11931p3 = (C11931p) AbstractC17167b.m48477c(objM48476b);
            long j13 = c11931p3.f66007y;
            if (j13 <= j7) {
                return c11931p3;
            }
            long j14 = ((long) AbstractC11925j.f39009b) * j13;
            while (true) {
                long j15 = f39003x.get(c11923h);
                long j16 = 1152921504606846975L & j15;
                if (j16 >= j14) {
                    c11923h2 = c11923h;
                    break;
                }
                c11923h2 = c11923h;
                if (f39003x.compareAndSet(c11923h2, j15, (((long) ((int) (j15 >> 60))) << 60) + j16)) {
                    break;
                }
                c11923h = c11923h2;
            }
            if (j13 * ((long) AbstractC11925j.f39009b) < atomicLongFieldUpdater.get(c11923h2)) {
                c11931p3.m48492b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m32191c(C11923h c11923h, Object obj, C3033m c3033m) {
        c3033m.resumeWith(AbstractC34132o.m107888l(c11923h.m32215p()));
    }

    /* JADX INFO: renamed from: e */
    public static final int m32192e(C11923h c11923h, C11931p c11931p, int i13, Object obj, long j7, Object obj2, boolean z4) {
        c11931p.m32232n(i13, obj);
        if (z4) {
            return c11923h.m32201I(c11931p, i13, obj, j7, obj2, z4);
        }
        Object objM32230l = c11931p.m32230l(i13);
        if (objM32230l == null) {
            if (c11923h.m32206g(j7)) {
                if (c11931p.m32229k(i13, null, AbstractC11925j.f39011d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c11931p.m32229k(i13, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM32230l instanceof InterfaceC3044o2) {
            c11931p.m32232n(i13, null);
            if (c11923h.m32198F(objM32230l, obj)) {
                c11931p.m32233o(i13, AbstractC11925j.f39016i);
                return 0;
            }
            C17191x c17191x = AbstractC11925j.f39018k;
            if (c11931p.f39034F.getAndSet((i13 * 2) + 1, c17191x) == c17191x) {
                return 5;
            }
            c11931p.m32231m(i13, true);
            return 5;
        }
        return c11923h.m32201I(c11931p, i13, obj, j7, obj2, z4);
    }

    /* JADX INFO: renamed from: u */
    public static void m32193u(C11923h c11923h) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38997E;
        if ((atomicLongFieldUpdater.addAndGet(c11923h, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c11923h) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m32194A(long j7, C11931p c11931p) {
        C11931p c11931p2;
        C11931p c11931p3;
        while (c11931p.f66007y < j7 && (c11931p3 = (C11931p) c11931p.m48493c()) != null) {
            c11931p = c11931p3;
        }
        while (true) {
            if (!c11931p.mo48494d() || (c11931p2 = (C11931p) c11931p.m48493c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39000H;
                    AbstractC17189v abstractC17189v = (AbstractC17189v) atomicReferenceFieldUpdater.get(this);
                    if (abstractC17189v.f66007y >= c11931p.f66007y) {
                        return;
                    }
                    if (!c11931p.m48544j()) {
                        break;
                    }
                    if (AbstractC11478a.m30874z(atomicReferenceFieldUpdater, this, abstractC17189v, c11931p)) {
                        if (abstractC17189v.m48542f()) {
                            abstractC17189v.m48495e();
                            return;
                        }
                        return;
                    } else if (c11931p.m48542f()) {
                        c11931p.m48495e();
                    }
                }
            } else {
                c11931p = c11931p2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final Object m32195B(Object obj, InterfaceC30057d interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        c3033m.resumeWith(AbstractC34132o.m107888l(m32215p()));
        Object objM8773r = c3033m.m8773r();
        return objM8773r == EnumC31071a.f128113w ? objM8773r : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: D */
    public final Object m32196D(C11931p c11931p, int i13, long j7, AbstractC32269c abstractC32269c) {
        C11922g c11922g;
        C11931p c11931p2;
        if (abstractC32269c instanceof C11922g) {
            c11922g = (C11922g) abstractC32269c;
            int i14 = c11922g.f38996y;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c11922g.f38996y = i14 - Integer.MIN_VALUE;
            } else {
                c11922g = new C11922g(this, abstractC32269c);
            }
        } else {
            c11922g = new C11922g(this, abstractC32269c);
        }
        Object objM8773r = c11922g.f38994w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c11922g.f38996y;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM8773r);
            c11922g.f38996y = 1;
            C3033m c3033mM8726t = AbstractC3006f0.m8726t(AbstractC15751g.m44424D(c11922g));
            try {
                C11937v c11937v = new C11937v(c3033mM8726t);
                Object objM32200H = m32200H(c11931p, i13, j7, c11937v);
                if (objM32200H == AbstractC11925j.f39020m) {
                    c11937v.mo8762b(c11931p, i13);
                } else if (objM32200H == AbstractC11925j.f39022o) {
                    if (j7 < m32216q()) {
                        c11931p.m48492b();
                    }
                    C11931p c11931p3 = (C11931p) f38999G.get(this);
                    while (true) {
                        if (m32221w()) {
                            c3033mM8726t.resumeWith(new C11930o(new C11928m(m32213n())));
                            break;
                        }
                        long andIncrement = f39004y.getAndIncrement(this);
                        long j13 = AbstractC11925j.f39009b;
                        long j14 = andIncrement / j13;
                        int i16 = (int) (andIncrement % j13);
                        if (c11931p3.f66007y != j14) {
                            C11931p c11931pM32212m = m32212m(j14, c11931p3);
                            if (c11931pM32212m != null) {
                                c11931p2 = c11931pM32212m;
                            }
                        } else {
                            c11931p2 = c11931p3;
                        }
                        Object objM32200H2 = m32200H(c11931p2, i16, andIncrement, c11937v);
                        C11931p c11931p4 = c11931p2;
                        if (objM32200H2 == AbstractC11925j.f39020m) {
                            c11937v.mo8762b(c11931p4, i16);
                            break;
                        }
                        if (objM32200H2 != AbstractC11925j.f39022o) {
                            if (objM32200H2 == AbstractC11925j.f39021n) {
                                throw new IllegalStateException("unexpected");
                            }
                            c11931p4.m48492b();
                            c3033mM8726t.mo8745g(new C11930o(objM32200H2), null);
                            break;
                        }
                        if (andIncrement < m32216q()) {
                            c11931p4.m48492b();
                        }
                        c11931p3 = c11931p4;
                    }
                } else {
                    c11931p.m48492b();
                    c3033mM8726t.mo8745g(new C11930o(objM32200H), null);
                }
                objM8773r = c3033mM8726t.m8773r();
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                if (objM8773r == enumC31071a) {
                    return enumC31071a;
                }
            } catch (Throwable th3) {
                c3033mM8726t.m8756A();
                throw th3;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8773r);
        }
        return ((C11930o) objM8773r).f39032a;
    }

    /* JADX INFO: renamed from: E */
    public final void m32197E(InterfaceC3044o2 interfaceC3044o2, boolean z4) {
        if (interfaceC3044o2 instanceof InterfaceC3025k) {
            ((InterfaceC30057d) interfaceC3044o2).resumeWith(AbstractC34132o.m107888l(z4 ? m32214o() : m32215p()));
            return;
        }
        if (interfaceC3044o2 instanceof C11937v) {
            ((C11937v) interfaceC3044o2).f39042w.resumeWith(new C11930o(new C11928m(m32213n())));
            return;
        }
        if (!(interfaceC3044o2 instanceof C11918c)) {
            if (interfaceC3044o2 instanceof InterfaceC23837g) {
                ((C23836f) ((InterfaceC23837g) interfaceC3044o2)).m70042g(this, AbstractC11925j.f39019l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + interfaceC3044o2).toString());
            }
        }
        C11918c c11918c = (C11918c) interfaceC3044o2;
        C3033m c3033m = c11918c.f38987x;
        AbstractC22676k.m65747g(c3033m);
        c11918c.f38987x = null;
        c11918c.f38986w = AbstractC11925j.f39019l;
        Throwable thM32213n = c11918c.f38988y.m32213n();
        if (thM32213n == null) {
            c3033m.resumeWith(Boolean.FALSE);
        } else {
            c3033m.resumeWith(AbstractC34132o.m107888l(thM32213n));
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m32198F(Object obj, Object obj2) {
        if (obj instanceof InterfaceC23837g) {
            return ((C23836f) ((InterfaceC23837g) obj)).m70042g(this, obj2) == 0;
        }
        if (obj instanceof C11937v) {
            return AbstractC11925j.m32225a(((C11937v) obj).f39042w, new C11930o(obj2), null);
        }
        if (!(obj instanceof C11918c)) {
            if (obj instanceof InterfaceC3025k) {
                return AbstractC11925j.m32225a((InterfaceC3025k) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        C11918c c11918c = (C11918c) obj;
        C3033m c3033m = c11918c.f38987x;
        AbstractC22676k.m65747g(c3033m);
        c11918c.f38987x = null;
        c11918c.f38986w = obj2;
        Boolean bool = Boolean.TRUE;
        c11918c.f38988y.getClass();
        return AbstractC11925j.m32225a(c3033m, bool, null);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m32199G(Object obj, C11931p c11931p, int i13) {
        EnumC23840j enumC23840j;
        boolean z4 = obj instanceof InterfaceC3025k;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            return AbstractC11925j.m32225a((InterfaceC3025k) obj, c23454a0, null);
        }
        if (!(obj instanceof InterfaceC23837g)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iM70042g = ((C23836f) obj).m70042g(this, c23454a0);
        if (iM70042g == 0) {
            enumC23840j = EnumC23840j.f94296w;
        } else if (iM70042g == 1) {
            enumC23840j = EnumC23840j.f94297x;
        } else if (iM70042g == 2) {
            enumC23840j = EnumC23840j.f94298y;
        } else {
            if (iM70042g != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iM70042g).toString());
            }
            enumC23840j = EnumC23840j.f94299z;
        }
        if (enumC23840j == EnumC23840j.f94297x) {
            c11931p.m32232n(i13, null);
        }
        return enumC23840j == EnumC23840j.f94296w;
    }

    /* JADX INFO: renamed from: H */
    public final Object m32200H(C11931p c11931p, int i13, long j7, Object obj) {
        Object objM32230l = c11931p.m32230l(i13);
        AtomicReferenceArray atomicReferenceArray = c11931p.f39034F;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39003x;
        if (objM32230l == null) {
            if (j7 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC11925j.f39021n;
                }
                if (c11931p.m32229k(i13, objM32230l, obj)) {
                    m32211l();
                    return AbstractC11925j.f39020m;
                }
            }
        } else if (objM32230l == AbstractC11925j.f39011d && c11931p.m32229k(i13, objM32230l, AbstractC11925j.f39016i)) {
            m32211l();
            Object obj2 = atomicReferenceArray.get(i13 * 2);
            c11931p.m32232n(i13, null);
            return obj2;
        }
        while (true) {
            Object objM32230l2 = c11931p.m32230l(i13);
            if (objM32230l2 == null || objM32230l2 == AbstractC11925j.f39012e) {
                if (j7 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c11931p.m32229k(i13, objM32230l2, AbstractC11925j.f39015h)) {
                        m32211l();
                        return AbstractC11925j.f39022o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC11925j.f39021n;
                    }
                    if (c11931p.m32229k(i13, objM32230l2, obj)) {
                        m32211l();
                        return AbstractC11925j.f39020m;
                    }
                }
            } else {
                if (objM32230l2 != AbstractC11925j.f39011d) {
                    C17191x c17191x = AbstractC11925j.f39017j;
                    if (objM32230l2 != c17191x && objM32230l2 != AbstractC11925j.f39015h) {
                        if (objM32230l2 == AbstractC11925j.f39019l) {
                            m32211l();
                            return AbstractC11925j.f39022o;
                        }
                        if (objM32230l2 != AbstractC11925j.f39014g && c11931p.m32229k(i13, objM32230l2, AbstractC11925j.f39013f)) {
                            boolean z4 = objM32230l2 instanceof C11940y;
                            if (z4) {
                                objM32230l2 = ((C11940y) objM32230l2).f39043a;
                            }
                            if (m32199G(objM32230l2, c11931p, i13)) {
                                c11931p.m32233o(i13, AbstractC11925j.f39016i);
                                m32211l();
                                Object obj3 = atomicReferenceArray.get(i13 * 2);
                                c11931p.m32232n(i13, null);
                                return obj3;
                            }
                            c11931p.m32233o(i13, c17191x);
                            c11931p.m48543i();
                            if (z4) {
                                m32211l();
                            }
                            return AbstractC11925j.f39022o;
                        }
                    }
                    return AbstractC11925j.f39022o;
                }
                if (c11931p.m32229k(i13, objM32230l2, AbstractC11925j.f39016i)) {
                    m32211l();
                    Object obj4 = atomicReferenceArray.get(i13 * 2);
                    c11931p.m32232n(i13, null);
                    return obj4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m32201I(C11931p c11931p, int i13, Object obj, long j7, Object obj2, boolean z4) {
        while (true) {
            Object objM32230l = c11931p.m32230l(i13);
            if (objM32230l == null) {
                if (!m32206g(j7) || z4) {
                    if (z4) {
                        if (c11931p.m32229k(i13, null, AbstractC11925j.f39017j)) {
                            c11931p.m48543i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c11931p.m32229k(i13, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c11931p.m32229k(i13, null, AbstractC11925j.f39011d)) {
                    break;
                }
            } else {
                if (objM32230l != AbstractC11925j.f39012e) {
                    C17191x c17191x = AbstractC11925j.f39018k;
                    if (objM32230l == c17191x) {
                        c11931p.m32232n(i13, null);
                        return 5;
                    }
                    if (objM32230l == AbstractC11925j.f39015h) {
                        c11931p.m32232n(i13, null);
                        return 5;
                    }
                    if (objM32230l == AbstractC11925j.f39019l) {
                        c11931p.m32232n(i13, null);
                        m32222x();
                        return 4;
                    }
                    c11931p.m32232n(i13, null);
                    if (objM32230l instanceof C11940y) {
                        objM32230l = ((C11940y) objM32230l).f39043a;
                    }
                    if (m32198F(objM32230l, obj)) {
                        c11931p.m32233o(i13, AbstractC11925j.f39016i);
                        return 0;
                    }
                    if (c11931p.f39034F.getAndSet((i13 * 2) + 1, c17191x) != c17191x) {
                        c11931p.m32231m(i13, true);
                    }
                    return 5;
                }
                if (c11931p.m32229k(i13, objM32230l, AbstractC11925j.f39011d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: J */
    public final void m32202J(long j7) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C11923h c11923h = this;
        if (c11923h.m32224z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f39005z;
            if (atomicLongFieldUpdater.get(c11923h) > j7) {
                break;
            } else {
                c11923h = this;
            }
        }
        int i13 = AbstractC11925j.f39010c;
        int i14 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f38997E;
            if (i14 < i13) {
                long j13 = atomicLongFieldUpdater.get(c11923h);
                if (j13 == (DurationKt.MAX_MILLIS & atomicLongFieldUpdater2.get(c11923h)) && j13 == atomicLongFieldUpdater.get(c11923h)) {
                    return;
                } else {
                    i14++;
                }
            } else {
                while (true) {
                    long j14 = atomicLongFieldUpdater2.get(c11923h);
                    if (atomicLongFieldUpdater2.compareAndSet(c11923h, j14, (j14 & DurationKt.MAX_MILLIS) + 4611686018427387904L)) {
                        break;
                    } else {
                        c11923h = this;
                    }
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater.get(c11923h);
                    long j16 = atomicLongFieldUpdater2.get(c11923h);
                    long j17 = j16 & DurationKt.MAX_MILLIS;
                    boolean z4 = (j16 & 4611686018427387904L) != 0;
                    if (j15 == j17 && j15 == atomicLongFieldUpdater.get(c11923h)) {
                        break;
                    }
                    if (z4) {
                        c11923h = this;
                    } else {
                        c11923h = this;
                        atomicLongFieldUpdater2.compareAndSet(c11923h, j16, 4611686018427387904L + j17);
                    }
                }
                while (true) {
                    long j18 = atomicLongFieldUpdater2.get(c11923h);
                    if (atomicLongFieldUpdater2.compareAndSet(c11923h, j18, j18 & DurationKt.MAX_MILLIS)) {
                        return;
                    } else {
                        c11923h = this;
                    }
                }
            }
        }
    }

    @Override // dc3.InterfaceC11938w
    /* JADX INFO: renamed from: a */
    public final Object mo32203a(C14384o c14384o) {
        return m32189C(this, c14384o);
    }

    @Override // dc3.InterfaceC11938w
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m32207h(cancellationException, true);
    }

    @Override // dc3.InterfaceC11938w
    /* JADX INFO: renamed from: d */
    public final C37199o mo32204d() {
        AbstractC22681m0.m65774e(3, C11919d.f38989w);
        AbstractC22681m0.m65774e(3, C11920e.f38990w);
        C11919d c11919d = C11919d.f38989w;
        C11920e c11920e = C11920e.f38990w;
        C37199o c37199o = new C37199o();
        c37199o.f159040w = this;
        c37199o.f159041x = null;
        return c37199o;
    }

    @Override // dc3.InterfaceC11938w
    /* JADX INFO: renamed from: f */
    public final Object mo32205f() {
        C11931p c11931p;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39004y;
        long j7 = atomicLongFieldUpdater.get(this);
        long j13 = f39003x.get(this);
        if (m32220v(j13, true)) {
            return new C11928m(m32213n());
        }
        long j14 = j13 & 1152921504606846975L;
        C11929n c11929n = C11930o.f39031b;
        if (j7 >= j14) {
            return c11929n;
        }
        Object obj = AbstractC11925j.f39018k;
        C11931p c11931p2 = (C11931p) f38999G.get(this);
        while (!m32221w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j15 = AbstractC11925j.f39009b;
            long j16 = andIncrement / j15;
            int i13 = (int) (andIncrement % j15);
            if (c11931p2.f66007y != j16) {
                C11931p c11931pM32212m = m32212m(j16, c11931p2);
                if (c11931pM32212m == null) {
                    continue;
                } else {
                    c11931p = c11931pM32212m;
                }
            } else {
                c11931p = c11931p2;
            }
            Object objM32200H = m32200H(c11931p, i13, andIncrement, obj);
            C11931p c11931p3 = c11931p;
            if (objM32200H == AbstractC11925j.f39020m) {
                InterfaceC3044o2 interfaceC3044o2 = obj instanceof InterfaceC3044o2 ? (InterfaceC3044o2) obj : null;
                if (interfaceC3044o2 != null) {
                    interfaceC3044o2.mo8762b(c11931p3, i13);
                }
                m32202J(andIncrement);
                c11931p3.m48543i();
                return c11929n;
            }
            if (objM32200H != AbstractC11925j.f39022o) {
                if (objM32200H == AbstractC11925j.f39021n) {
                    throw new IllegalStateException("unexpected");
                }
                c11931p3.m48492b();
                return objM32200H;
            }
            if (andIncrement < m32216q()) {
                c11931p3.m48492b();
            }
            c11931p2 = c11931p3;
        }
        return new C11928m(m32213n());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m32206g(long j7) {
        return j7 < f39005z.get(this) || j7 < f39004y.get(this) + ((long) this.f39006w);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m32207h(Throwable th3, boolean z4) {
        C11923h c11923h;
        boolean z13;
        long j7;
        long j13;
        long j14;
        Object obj;
        long j15;
        long j16;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39003x;
        if (!z4) {
            c11923h = this;
            break;
        }
        do {
            j16 = atomicLongFieldUpdater.get(this);
            if (((int) (j16 >> 60)) != 0) {
                c11923h = this;
                break;
            }
            C11931p c11931p = AbstractC11925j.f39008a;
            c11923h = this;
        } while (!atomicLongFieldUpdater.compareAndSet(c11923h, j16, (j16 & 1152921504606846975L) + (((long) 1) << 60)));
        C17191x c17191x = AbstractC11925j.f39026s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39001I;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c17191x, th3)) {
                z13 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c17191x) {
                z13 = false;
                break;
            }
        }
        if (z4) {
            do {
                j15 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(c11923h, j15, (((long) 3) << 60) + (j15 & 1152921504606846975L)));
        } else {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                int i13 = (int) (j7 >> 60);
                if (i13 == 0) {
                    j13 = j7 & 1152921504606846975L;
                    j14 = 2;
                } else {
                    if (i13 != 1) {
                        break;
                    }
                    j13 = j7 & 1152921504606846975L;
                    j14 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c11923h, j7, (j14 << 60) + j13));
        }
        m32222x();
        if (z13) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f39002J;
                obj = atomicReferenceFieldUpdater2.get(this);
                C17191x c17191x2 = obj == null ? AbstractC11925j.f39024q : AbstractC11925j.f39025r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c17191x2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                AbstractC22681m0.m65774e(1, obj);
                ((Function1) obj).invoke(m32213n());
                return z13;
            }
        }
        return z13;
    }

    @Override // dc3.InterfaceC11938w
    /* JADX INFO: renamed from: i */
    public final Object mo32208i(InterfaceC30057d interfaceC30057d) throws Throwable {
        C11931p c11931p;
        Throwable th3;
        C11931p c11931p2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38999G;
        C11931p c11931p3 = (C11931p) atomicReferenceFieldUpdater.get(this);
        while (!m32221w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f39004y;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j7 = AbstractC11925j.f39009b;
            long j13 = andIncrement / j7;
            int i13 = (int) (andIncrement % j7);
            if (c11931p3.f66007y != j13) {
                C11931p c11931pM32212m = m32212m(j13, c11931p3);
                if (c11931pM32212m == null) {
                    continue;
                } else {
                    c11931p = c11931pM32212m;
                }
            } else {
                c11931p = c11931p3;
            }
            Object objM32200H = m32200H(c11931p, i13, andIncrement, null);
            C17191x c17191x = AbstractC11925j.f39020m;
            if (objM32200H == c17191x) {
                throw new IllegalStateException("unexpected");
            }
            C17191x c17191x2 = AbstractC11925j.f39022o;
            if (objM32200H == c17191x2) {
                if (andIncrement < m32216q()) {
                    c11931p.m48492b();
                }
                c11931p3 = c11931p;
            } else {
                if (objM32200H != AbstractC11925j.f39021n) {
                    c11931p.m48492b();
                    return objM32200H;
                }
                C3033m c3033mM8726t = AbstractC3006f0.m8726t(AbstractC15751g.m44424D(interfaceC30057d));
                C11923h c11923h = this;
                try {
                    Object objM32200H2 = c11923h.m32200H(c11931p, i13, andIncrement, c3033mM8726t);
                    if (objM32200H2 != c17191x) {
                        if (objM32200H2 == c17191x2) {
                            if (andIncrement < m32216q()) {
                                c11931p.m48492b();
                            }
                            C11931p c11931p4 = (C11931p) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (m32221w()) {
                                    c3033mM8726t.resumeWith(AbstractC34132o.m107888l(m32214o()));
                                    break;
                                }
                                C3033m c3033m = c3033mM8726t;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j14 = AbstractC11925j.f39009b;
                                    long j15 = andIncrement2 / j14;
                                    int i14 = (int) (andIncrement2 % j14);
                                    if (c11931p4.f66007y != j15) {
                                        try {
                                            C11931p c11931pM32212m2 = m32212m(j15, c11931p4);
                                            if (c11931pM32212m2 == null) {
                                                c3033mM8726t = c3033m;
                                            } else {
                                                c11931p2 = c11931pM32212m2;
                                            }
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                            c3033mM8726t = c3033m;
                                            c3033mM8726t.m8756A();
                                            throw th3;
                                        }
                                    } else {
                                        c11931p2 = c11931p4;
                                    }
                                    objM32200H2 = c11923h.m32200H(c11931p2, i14, andIncrement2, c3033m);
                                    C11931p c11931p5 = c11931p2;
                                    c3033mM8726t = c3033m;
                                    if (objM32200H2 == AbstractC11925j.f39020m) {
                                        c3033mM8726t.mo8762b(c11931p5, i14);
                                        break;
                                    }
                                    if (objM32200H2 == AbstractC11925j.f39022o) {
                                        if (andIncrement2 < m32216q()) {
                                            c11931p5.m48492b();
                                        }
                                        c11923h = this;
                                        c11931p4 = c11931p5;
                                    } else {
                                        if (objM32200H2 == AbstractC11925j.f39021n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c11931p5.m48492b();
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    c3033mM8726t = c3033m;
                                    th3 = th;
                                    c3033mM8726t.m8756A();
                                    throw th3;
                                }
                            }
                        } else {
                            c11931p.m48492b();
                        }
                        c3033mM8726t.mo8745g(objM32200H2, null);
                        break;
                    }
                    c3033mM8726t.mo8762b(c11931p, i13);
                    Object objM8773r = c3033mM8726t.m8773r();
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    return objM8773r;
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        Throwable thM32214o = m32214o();
        int i15 = AbstractC17190w.f66008a;
        throw thM32214o;
    }

    @Override // dc3.InterfaceC11938w
    public final C11918c iterator() {
        return new C11918c(this);
    }

    /* JADX INFO: renamed from: j */
    public final C11931p m32209j(long j7) {
        Object objM48479e;
        long j13;
        Object obj = f39000H.get(this);
        C11931p c11931p = (C11931p) f38998F.get(this);
        if (c11931p.f66007y > ((C11931p) obj).f66007y) {
            obj = c11931p;
        }
        C11931p c11931p2 = (C11931p) f38999G.get(this);
        if (c11931p2.f66007y > ((C11931p) obj).f66007y) {
            obj = c11931p2;
        }
        AbstractC17169c abstractC17169c = (AbstractC17169c) obj;
        loop0: while (true) {
            abstractC17169c.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC17169c.f65965w;
            Object obj2 = atomicReferenceFieldUpdater.get(abstractC17169c);
            C17191x c17191x = AbstractC17167b.f65956a;
            objM48479e = null;
            if (obj2 == c17191x) {
                break;
            }
            AbstractC17169c abstractC17169c2 = (AbstractC17169c) obj2;
            if (abstractC17169c2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC17169c, null, c17191x)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC17169c) == null);
            } else {
                abstractC17169c = abstractC17169c2;
            }
        }
        C11931p c11931p3 = (C11931p) abstractC17169c;
        if (mo32223y()) {
            C11931p c11931p4 = c11931p3;
            loop2: while (true) {
                int i13 = AbstractC11925j.f39009b - 1;
                while (true) {
                    if (-1 < i13) {
                        j13 = (c11931p4.f66007y * ((long) AbstractC11925j.f39009b)) + ((long) i13);
                        if (j13 >= f39004y.get(this)) {
                            while (true) {
                                Object objM32230l = c11931p4.m32230l(i13);
                                if (objM32230l != null && objM32230l != AbstractC11925j.f39012e) {
                                    if (objM32230l != AbstractC11925j.f39011d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (c11931p4.m32229k(i13, objM32230l, AbstractC11925j.f39019l)) {
                                    c11931p4.m48543i();
                                    break;
                                }
                            }
                            i13--;
                        }
                    } else {
                        c11931p4 = (C11931p) ((AbstractC17169c) AbstractC17169c.f65966x.get(c11931p4));
                        if (c11931p4 == null) {
                        }
                    }
                    j13 = -1;
                    break;
                }
            }
            if (j13 != -1) {
                m32210k(j13);
            }
        }
        loop5: for (C11931p c11931p5 = c11931p3; c11931p5 != null; c11931p5 = (C11931p) ((AbstractC17169c) AbstractC17169c.f65966x.get(c11931p5))) {
            for (int i14 = AbstractC11925j.f39009b - 1; -1 < i14; i14--) {
                if ((c11931p5.f66007y * ((long) AbstractC11925j.f39009b)) + ((long) i14) < j7) {
                    break loop5;
                }
                while (true) {
                    Object objM32230l2 = c11931p5.m32230l(i14);
                    if (objM32230l2 != null && objM32230l2 != AbstractC11925j.f39012e) {
                        if (!(objM32230l2 instanceof C11940y)) {
                            if (!(objM32230l2 instanceof InterfaceC3044o2)) {
                                break;
                            }
                            if (c11931p5.m32229k(i14, objM32230l2, AbstractC11925j.f39019l)) {
                                objM48479e = AbstractC17167b.m48479e(objM48479e, objM32230l2);
                                c11931p5.m32231m(i14, true);
                                break;
                            }
                        } else {
                            if (c11931p5.m32229k(i14, objM32230l2, AbstractC11925j.f39019l)) {
                                objM48479e = AbstractC17167b.m48479e(objM48479e, ((C11940y) objM32230l2).f39043a);
                                c11931p5.m32231m(i14, true);
                                break;
                            }
                        }
                    } else {
                        if (c11931p5.m32229k(i14, objM32230l2, AbstractC11925j.f39019l)) {
                            c11931p5.m48543i();
                            break;
                        }
                    }
                }
            }
        }
        if (objM48479e != null) {
            if (!(objM48479e instanceof ArrayList)) {
                m32197E((InterfaceC3044o2) objM48479e, true);
                return c11931p3;
            }
            ArrayList arrayList = (ArrayList) objM48479e;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m32197E((InterfaceC3044o2) arrayList.get(size), true);
            }
        }
        return c11931p3;
    }

    /* JADX INFO: renamed from: k */
    public final void m32210k(long j7) {
        C11931p c11931p = (C11931p) f38999G.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f39004y;
            long j13 = atomicLongFieldUpdater.get(this);
            if (j7 < Math.max(((long) this.f39006w) + j13, f39005z.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j13, 1 + j13)) {
                long j14 = AbstractC11925j.f39009b;
                long j15 = j13 / j14;
                int i13 = (int) (j13 % j14);
                if (c11931p.f66007y != j15) {
                    C11931p c11931pM32212m = m32212m(j15, c11931p);
                    if (c11931pM32212m != null) {
                        c11931p = c11931pM32212m;
                    }
                }
                C11931p c11931p2 = c11931p;
                if (m32200H(c11931p2, i13, j13, null) != AbstractC11925j.f39022o || j13 < m32216q()) {
                    c11931p2.m48492b();
                }
                c11931p = c11931p2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m32211l() {
        Object objM48476b;
        if (m32224z()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f39000H;
        C11931p c11931p = (C11931p) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f39005z.getAndIncrement(this);
            long j7 = andIncrement / ((long) AbstractC11925j.f39009b);
            if (m32216q() <= andIncrement) {
                if (c11931p.f66007y < j7 && c11931p.m48493c() != null) {
                    m32194A(j7, c11931p);
                }
                m32193u(this);
                return;
            }
            if (c11931p.f66007y != j7) {
                C11924i c11924i = C11924i.f39007w;
                while (true) {
                    objM48476b = AbstractC17167b.m48476b(c11931p, j7, c11924i);
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
                            if (AbstractC11478a.m30847A(atomicReferenceFieldUpdater, this, abstractC17189v, abstractC17189vM48477c)) {
                                if (!abstractC17189v.m48542f()) {
                                    break;
                                }
                                abstractC17189v.m48495e();
                                break;
                            } else if (abstractC17189vM48477c.m48542f()) {
                                abstractC17189vM48477c.m48495e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C11931p c11931p2 = null;
                if (AbstractC17167b.m48478d(objM48476b)) {
                    m32222x();
                    m32194A(j7, c11931p);
                    m32193u(this);
                } else {
                    C11931p c11931p3 = (C11931p) AbstractC17167b.m48477c(objM48476b);
                    long j13 = c11931p3.f66007y;
                    if (j13 > j7) {
                        long j14 = j13 * ((long) AbstractC11925j.f39009b);
                        if (f39005z.compareAndSet(this, 1 + andIncrement, j14)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f38997E;
                            if ((atomicLongFieldUpdater.addAndGet(this, j14 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            m32193u(this);
                        }
                    } else {
                        c11931p2 = c11931p3;
                    }
                }
                if (c11931p2 == null) {
                    continue;
                } else {
                    c11931p = c11931p2;
                }
            }
            int i13 = (int) (andIncrement % ((long) AbstractC11925j.f39009b));
            Object objM32230l = c11931p.m32230l(i13);
            boolean z4 = objM32230l instanceof InterfaceC3044o2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f39004y;
            if (!z4 || andIncrement < atomicLongFieldUpdater2.get(this) || !c11931p.m32229k(i13, objM32230l, AbstractC11925j.f39014g)) {
                while (true) {
                    Object objM32230l2 = c11931p.m32230l(i13);
                    if (objM32230l2 instanceof InterfaceC3044o2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (c11931p.m32229k(i13, objM32230l2, new C11940y((InterfaceC3044o2) objM32230l2))) {
                                m32193u(this);
                                return;
                            }
                        } else if (c11931p.m32229k(i13, objM32230l2, AbstractC11925j.f39014g)) {
                            if (!m32199G(objM32230l2, c11931p, i13)) {
                                c11931p.m32233o(i13, AbstractC11925j.f39017j);
                                c11931p.m48543i();
                                break;
                            } else {
                                c11931p.m32233o(i13, AbstractC11925j.f39011d);
                                m32193u(this);
                                return;
                            }
                        }
                    } else {
                        if (objM32230l2 == AbstractC11925j.f39017j) {
                            break;
                        }
                        if (objM32230l2 == null) {
                            if (c11931p.m32229k(i13, objM32230l2, AbstractC11925j.f39012e)) {
                                m32193u(this);
                                return;
                            }
                        } else if (objM32230l2 == AbstractC11925j.f39011d || objM32230l2 == AbstractC11925j.f39015h || objM32230l2 == AbstractC11925j.f39016i || objM32230l2 == AbstractC11925j.f39018k || objM32230l2 == AbstractC11925j.f39019l) {
                            m32193u(this);
                            return;
                        } else if (objM32230l2 != AbstractC11925j.f39013f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objM32230l2).toString());
                        }
                    }
                }
                m32193u(this);
            } else if (m32199G(objM32230l, c11931p, i13)) {
                c11931p.m32233o(i13, AbstractC11925j.f39011d);
                m32193u(this);
                return;
            } else {
                c11931p.m32233o(i13, AbstractC11925j.f39017j);
                c11931p.m48543i();
                m32193u(this);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final C11931p m32212m(long j7, C11931p c11931p) {
        Object objM48476b;
        long j13;
        C11931p c11931p2 = AbstractC11925j.f39008a;
        C11924i c11924i = C11924i.f39007w;
        loop0: while (true) {
            objM48476b = AbstractC17167b.m48476b(c11931p, j7, c11924i);
            if (!AbstractC17167b.m48478d(objM48476b)) {
                AbstractC17189v abstractC17189vM48477c = AbstractC17167b.m48477c(objM48476b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38999G;
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
        if (AbstractC17167b.m48478d(objM48476b)) {
            m32222x();
            if (c11931p.f66007y * ((long) AbstractC11925j.f39009b) < m32216q()) {
                c11931p.m48492b();
                return null;
            }
        } else {
            C11931p c11931p3 = (C11931p) AbstractC17167b.m48477c(objM48476b);
            long j14 = c11931p3.f66007y;
            if (!m32224z() && j7 <= f39005z.get(this) / ((long) AbstractC11925j.f39009b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f39000H;
                    AbstractC17189v abstractC17189v2 = (AbstractC17189v) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC17189v2.f66007y >= j14 || !c11931p3.m48544j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, abstractC17189v2, c11931p3)) {
                            if (!abstractC17189v2.m48542f()) {
                                break loop3;
                            }
                            abstractC17189v2.m48495e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == abstractC17189v2);
                    if (c11931p3.m48542f()) {
                        c11931p3.m48495e();
                    }
                }
            }
            if (j14 <= j7) {
                return c11931p3;
            }
            long j15 = j14 * ((long) AbstractC11925j.f39009b);
            do {
                j13 = f39004y.get(this);
                if (j13 >= j15) {
                    break;
                }
            } while (!f39004y.compareAndSet(this, j13, j15));
            if (j14 * ((long) AbstractC11925j.f39009b) < m32216q()) {
                c11931p3.m48492b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final Throwable m32213n() {
        return (Throwable) f39001I.get(this);
    }

    /* JADX INFO: renamed from: o */
    public final Throwable m32214o() {
        Throwable thM32213n = m32213n();
        return thM32213n == null ? new ClosedReceiveChannelException() : thM32213n;
    }

    /* JADX INFO: renamed from: p */
    public final Throwable m32215p() {
        Throwable thM32213n = m32213n();
        return thM32213n == null ? new ClosedSendChannelException("Channel was closed") : thM32213n;
    }

    /* JADX INFO: renamed from: q */
    public final long m32216q() {
        return f39003x.get(this) & 1152921504606846975L;
    }

    @Override // dc3.InterfaceC11939x
    /* JADX INFO: renamed from: r */
    public final boolean mo32217r(Throwable th3) {
        return m32207h(th3, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // dc3.InterfaceC11939x
    /* JADX INFO: renamed from: s */
    public Object mo32218s(Object obj) {
        int iM32192e;
        C23454a0 c23454a0;
        InterfaceC3044o2 interfaceC3044o2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f39003x;
        long j7 = atomicLongFieldUpdater.get(this);
        boolean z4 = false;
        long j13 = 1152921504606846975L;
        boolean z13 = m32220v(j7, false) ? false : !m32206g(j7 & 1152921504606846975L);
        C11929n c11929n = C11930o.f39031b;
        if (z13) {
            return c11929n;
        }
        Object obj2 = AbstractC11925j.f39017j;
        C11931p c11931p = (C11931p) f38998F.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j14 = andIncrement & j13;
            boolean zM32220v = m32220v(andIncrement, z4);
            int i13 = AbstractC11925j.f39009b;
            long j15 = i13;
            long j16 = j14 / j15;
            int i14 = (int) (j14 % j15);
            if (c11931p.f66007y == j16) {
                iM32192e = m32192e(this, c11931p, i14, obj, j14, obj2, zM32220v);
                c23454a0 = C23454a0.f92919a;
                if (iM32192e != 0) {
                    c11931p.m48492b();
                    return c23454a0;
                }
                if (iM32192e != 1) {
                    return c23454a0;
                }
                if (iM32192e != 2) {
                    if (zM32220v) {
                        c11931p.m48543i();
                        return new C11928m(m32215p());
                    }
                    if (obj2 instanceof InterfaceC3044o2) {
                        interfaceC3044o2 = (InterfaceC3044o2) obj2;
                    } else {
                        interfaceC3044o2 = null;
                    }
                    if (interfaceC3044o2 != null) {
                        interfaceC3044o2.mo8762b(c11931p, i14 + i13);
                    }
                    c11931p.m48543i();
                    return c11929n;
                }
                if (iM32192e != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iM32192e != 4) {
                    if (j14 < f39004y.get(this)) {
                        c11931p.m48492b();
                    }
                    return new C11928m(m32215p());
                }
                if (iM32192e == 5) {
                    c11931p.m48492b();
                }
                z4 = false;
            } else {
                C11931p c11931pM32190b = m32190b(this, j16, c11931p);
                if (c11931pM32190b != null) {
                    c11931p = c11931pM32190b;
                    iM32192e = m32192e(this, c11931p, i14, obj, j14, obj2, zM32220v);
                    c23454a0 = C23454a0.f92919a;
                    if (iM32192e != 0) {
                        c11931p.m48492b();
                        return c23454a0;
                    }
                    if (iM32192e != 1) {
                        return c23454a0;
                    }
                    if (iM32192e != 2) {
                        if (zM32220v) {
                            c11931p.m48543i();
                            return new C11928m(m32215p());
                        }
                        if (obj2 instanceof InterfaceC3044o2) {
                            interfaceC3044o2 = (InterfaceC3044o2) obj2;
                        } else {
                            interfaceC3044o2 = null;
                        }
                        if (interfaceC3044o2 != null) {
                            interfaceC3044o2.mo8762b(c11931p, i14 + i13);
                        }
                        c11931p.m48543i();
                        return c11929n;
                    }
                    if (iM32192e != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iM32192e != 4) {
                        if (j14 < f39004y.get(this)) {
                            c11931p.m48492b();
                        }
                        return new C11928m(m32215p());
                    }
                    if (iM32192e == 5) {
                        c11931p.m48492b();
                    }
                    z4 = false;
                } else {
                    if (zM32220v) {
                        return new C11928m(m32215p());
                    }
                    z4 = false;
                }
            }
            j13 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173 A[RETURN] */
    @Override // dc3.InterfaceC11939x
    /* JADX INFO: renamed from: t */
    public Object mo32219t(Object obj, InterfaceC30057d interfaceC30057d) throws Throwable {
        C23454a0 c23454a0;
        Object objM8773r;
        EnumC31071a enumC31071a;
        Object obj2;
        C11923h c11923h;
        C11931p c11931p;
        boolean z4;
        C11923h c11923h2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38998F;
        C11931p c11931p2 = (C11931p) atomicReferenceFieldUpdater.get(c11923h2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f39003x;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c11923h2);
            long j7 = andIncrement & 1152921504606846975L;
            boolean zM32220v = c11923h2.m32220v(andIncrement, false);
            int i13 = AbstractC11925j.f39009b;
            long j13 = i13;
            long j14 = j7 / j13;
            int i14 = (int) (j7 % j13);
            long j15 = c11931p2.f66007y;
            c23454a0 = C23454a0.f92919a;
            if (j15 != j14) {
                C11931p c11931pM32190b = m32190b(c11923h2, j14, c11931p2);
                if (c11931pM32190b != null) {
                    c11931p2 = c11931pM32190b;
                } else if (zM32220v) {
                    Object objM32195B = m32195B(obj, interfaceC30057d);
                    if (objM32195B != EnumC31071a.f128113w) {
                        break;
                    }
                    return objM32195B;
                }
            }
            int iM32192e = m32192e(c11923h2, c11931p2, i14, obj, j7, null, zM32220v);
            if (iM32192e == 0) {
                c11931p2.m48492b();
                return c23454a0;
            }
            if (iM32192e == 1) {
                break;
            }
            if (iM32192e != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f39004y;
                if (iM32192e == 3) {
                    C3033m c3033mM8726t = AbstractC3006f0.m8726t(AbstractC15751g.m44424D(interfaceC30057d));
                    Object obj3 = obj;
                    try {
                        int iM32192e2 = m32192e(c11923h2, c11931p2, i14, obj3, j7, c3033mM8726t, false);
                        try {
                            if (iM32192e2 != 0) {
                                if (iM32192e2 == 1) {
                                    c3033mM8726t.resumeWith(c23454a0);
                                } else if (iM32192e2 != 2) {
                                    if (iM32192e2 != 4) {
                                        String str = "unexpected";
                                        if (iM32192e2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c11931p2.m48492b();
                                        C11931p c11931p3 = (C11931p) atomicReferenceFieldUpdater.get(c11923h2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c11923h2);
                                            long j16 = andIncrement2 & 1152921504606846975L;
                                            boolean zM32220v2 = c11923h2.m32220v(andIncrement2, false);
                                            int i15 = AbstractC11925j.f39009b;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j17 = i15;
                                            str = str;
                                            long j18 = j16 / j17;
                                            int i16 = (int) (j16 % j17);
                                            atomicLongFieldUpdater2 = atomicLongFieldUpdater2;
                                            if (c11931p3.f66007y != j18) {
                                                C11931p c11931pM32190b2 = m32190b(c11923h2, j18, c11931p3);
                                                if (c11931pM32190b2 != null) {
                                                    z4 = zM32220v2;
                                                    c11931p = c11931pM32190b2;
                                                } else if (zM32220v2) {
                                                    m32191c(c11923h2, obj3, c3033mM8726t);
                                                    break;
                                                }
                                            } else {
                                                c11931p = c11931p3;
                                                z4 = zM32220v2;
                                            }
                                            int iM32192e3 = m32192e(c11923h2, c11931p, i16, obj3, j16, c3033mM8726t, z4);
                                            Object obj4 = obj3;
                                            c11923h = c11923h2;
                                            C11931p c11931p4 = c11931p;
                                            obj2 = obj4;
                                            if (iM32192e3 == 0) {
                                                c11931p4.m48492b();
                                            } else if (iM32192e3 != 1) {
                                                if (iM32192e3 == 2) {
                                                    if (!z4) {
                                                        c3033mM8726t.mo8762b(c11931p4, i16 + i15);
                                                        break;
                                                    }
                                                    c11931p4.m48543i();
                                                } else {
                                                    if (iM32192e3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iM32192e3 != 4) {
                                                        if (iM32192e3 == 5) {
                                                            c11931p4.m48492b();
                                                        }
                                                        c11931p3 = c11931p4;
                                                        c11923h2 = c11923h;
                                                        obj3 = obj2;
                                                    } else if (j16 < atomicLongFieldUpdater2.get(c11923h)) {
                                                        c11931p4.m48492b();
                                                    }
                                                }
                                            }
                                        }
                                        c3033mM8726t.m8756A();
                                        throw th;
                                    }
                                    obj2 = obj3;
                                    c11923h = c11923h2;
                                    if (j7 < atomicLongFieldUpdater2.get(c11923h)) {
                                        c11931p2.m48492b();
                                    }
                                    m32191c(c11923h, obj2, c3033mM8726t);
                                    break;
                                } else {
                                    c3033mM8726t.mo8762b(c11931p2, i14 + i13);
                                }
                                objM8773r = c3033mM8726t.m8773r();
                                enumC31071a = EnumC31071a.f128113w;
                                if (objM8773r != enumC31071a) {
                                    objM8773r = c23454a0;
                                }
                                if (objM8773r == enumC31071a) {
                                    return objM8773r;
                                }
                            } else {
                                c11931p2.m48492b();
                            }
                            c3033mM8726t.resumeWith(c23454a0);
                            objM8773r = c3033mM8726t.m8773r();
                            enumC31071a = EnumC31071a.f128113w;
                            if (objM8773r != enumC31071a) {
                                objM8773r = c23454a0;
                            }
                            if (objM8773r == enumC31071a) {
                                return objM8773r;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    if (iM32192e == 4) {
                        if (j7 < atomicLongFieldUpdater2.get(c11923h2)) {
                            c11931p2.m48492b();
                        }
                        Object objM32195B2 = m32195B(obj, interfaceC30057d);
                        if (objM32195B2 != EnumC31071a.f128113w) {
                            break;
                        }
                        return objM32195B2;
                    }
                    if (iM32192e == 5) {
                        c11931p2.m48492b();
                    }
                }
            } else if (zM32220v) {
                c11931p2.m48543i();
                Object objM32195B3 = m32195B(obj, interfaceC30057d);
                if (objM32195B3 == EnumC31071a.f128113w) {
                    return objM32195B3;
                }
            }
            return c23454a0;
        }
        return c23454a0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb4 = new StringBuilder();
        int i13 = (int) (f39003x.get(this) >> 60);
        if (i13 == 2) {
            sb4.append("closed,");
        } else if (i13 == 3) {
            sb4.append("cancelled,");
        }
        sb4.append("capacity=" + this.f39006w + DateTimeRange.lowerUpperDelimiter);
        sb4.append("data=[");
        int i14 = 0;
        boolean z4 = true;
        List listM118959K = AbstractC37056f.m118959K(f38999G.get(this), f38998F.get(this), f39000H.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM118959K) {
            if (((C11931p) obj) != AbstractC11925j.f39008a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j7 = ((C11931p) next).f66007y;
            do {
                Object next2 = it.next();
                long j13 = ((C11931p) next2).f66007y;
                if (j7 > j13) {
                    next = next2;
                    j7 = j13;
                }
            } while (it.hasNext());
        }
        C11931p c11931p = (C11931p) next;
        long j14 = f39004y.get(this);
        long jM32216q = m32216q();
        loop2: while (true) {
            int i15 = AbstractC11925j.f39009b;
            int i16 = i14;
            while (i16 < i15) {
                long j15 = (c11931p.f66007y * ((long) AbstractC11925j.f39009b)) + ((long) i16);
                if (j15 >= jM32216q && j15 >= j14) {
                    break loop2;
                }
                Object objM32230l = c11931p.m32230l(i16);
                boolean z13 = z4;
                Object obj2 = c11931p.f39034F.get(i16 * 2);
                if (objM32230l instanceof InterfaceC3025k) {
                    string = (j15 >= j14 || j15 < jM32216q) ? (j15 >= jM32216q || j15 < j14) ? "cont" : "send" : "receive";
                } else if (objM32230l instanceof InterfaceC23837g) {
                    string = (j15 >= j14 || j15 < jM32216q) ? (j15 >= jM32216q || j15 < j14) ? "select" : "onSend" : "onReceive";
                } else if (objM32230l instanceof C11937v) {
                    string = "receiveCatching";
                } else if (objM32230l instanceof C11940y) {
                    string = "EB(" + objM32230l + ')';
                } else if (AbstractC22676k.m65745e(objM32230l, AbstractC11925j.f39013f) || AbstractC22676k.m65745e(objM32230l, AbstractC11925j.f39014g)) {
                    string = "resuming_sender";
                } else {
                    if (objM32230l != null && !objM32230l.equals(AbstractC11925j.f39012e) && !objM32230l.equals(AbstractC11925j.f39016i) && !objM32230l.equals(AbstractC11925j.f39015h) && !objM32230l.equals(AbstractC11925j.f39018k) && !objM32230l.equals(AbstractC11925j.f39017j) && !objM32230l.equals(AbstractC11925j.f39019l)) {
                        string = objM32230l.toString();
                    }
                    i16++;
                    z4 = z13;
                }
                if (obj2 != null) {
                    sb4.append("(" + string + DateTimeRange.lowerUpperDelimiter + obj2 + "),");
                } else {
                    sb4.append(string + DateTimeRange.lowerUpperDelimiter);
                }
                i16++;
                z4 = z13;
            }
            boolean z14 = z4;
            c11931p = (C11931p) c11931p.m48493c();
            if (c11931p == null) {
                break;
            }
            z4 = z14;
            i14 = 0;
        }
        if (AbstractC39414r.m125891j0(sb4) == ',') {
            AbstractC22676k.m65749i(sb4.deleteCharAt(sb4.length() - 1), "deleteCharAt(...)");
        }
        sb4.append("]");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m32220v(long j7, boolean z4) {
        int i13 = (int) (j7 >> 60);
        if (i13 != 0 && i13 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f39004y;
            if (i13 == 2) {
                m32209j(1152921504606846975L & j7);
                if (z4) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38999G;
                        C11931p c11931pM32212m = (C11931p) atomicReferenceFieldUpdater.get(this);
                        long j13 = atomicLongFieldUpdater.get(this);
                        if (m32216q() <= j13) {
                            break;
                        }
                        long j14 = AbstractC11925j.f39009b;
                        long j15 = j13 / j14;
                        if (c11931pM32212m.f66007y != j15 && (c11931pM32212m = m32212m(j15, c11931pM32212m)) == null) {
                            if (((C11931p) atomicReferenceFieldUpdater.get(this)).f66007y < j15) {
                                break;
                            }
                        } else {
                            c11931pM32212m.m48492b();
                            int i14 = (int) (j13 % j14);
                            while (true) {
                                Object objM32230l = c11931pM32212m.m32230l(i14);
                                if (objM32230l != null && objM32230l != AbstractC11925j.f39012e) {
                                    if (objM32230l != AbstractC11925j.f39011d && (objM32230l == AbstractC11925j.f39017j || objM32230l == AbstractC11925j.f39019l || objM32230l == AbstractC11925j.f39016i || objM32230l == AbstractC11925j.f39015h || (objM32230l != AbstractC11925j.f39014g && (objM32230l == AbstractC11925j.f39013f || j13 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (c11931pM32212m.m32229k(i14, objM32230l, AbstractC11925j.f39015h)) {
                                    m32211l();
                                    break;
                                }
                            }
                            f39004y.compareAndSet(this, j13, j13 + 1);
                        }
                    }
                }
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException(AbstractC2875y.m8295h(i13, "unexpected close status: ").toString());
                }
                C11931p c11931pM32209j = m32209j(1152921504606846975L & j7);
                Object objM48479e = null;
                loop0: do {
                    for (int i15 = AbstractC11925j.f39009b - 1; -1 < i15; i15--) {
                        long j16 = (c11931pM32209j.f66007y * ((long) AbstractC11925j.f39009b)) + ((long) i15);
                        while (true) {
                            Object objM32230l2 = c11931pM32209j.m32230l(i15);
                            if (objM32230l2 == AbstractC11925j.f39016i) {
                                break loop0;
                            }
                            if (objM32230l2 != AbstractC11925j.f39011d) {
                                if (objM32230l2 != AbstractC11925j.f39012e && objM32230l2 != null) {
                                    if (!(objM32230l2 instanceof InterfaceC3044o2) && !(objM32230l2 instanceof C11940y)) {
                                        C17191x c17191x = AbstractC11925j.f39014g;
                                        if (objM32230l2 == c17191x || objM32230l2 == AbstractC11925j.f39013f) {
                                            break loop0;
                                        }
                                        if (objM32230l2 != c17191x) {
                                            break;
                                        }
                                    } else {
                                        if (j16 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        InterfaceC3044o2 interfaceC3044o2 = objM32230l2 instanceof C11940y ? ((C11940y) objM32230l2).f39043a : (InterfaceC3044o2) objM32230l2;
                                        if (c11931pM32209j.m32229k(i15, objM32230l2, AbstractC11925j.f39019l)) {
                                            objM48479e = AbstractC17167b.m48479e(objM48479e, interfaceC3044o2);
                                            c11931pM32209j.m32232n(i15, null);
                                            c11931pM32209j.m48543i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c11931pM32209j.m32229k(i15, objM32230l2, AbstractC11925j.f39019l)) {
                                        c11931pM32209j.m48543i();
                                        break;
                                    }
                                }
                            } else {
                                if (j16 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c11931pM32209j.m32229k(i15, objM32230l2, AbstractC11925j.f39019l)) {
                                    c11931pM32209j.m32232n(i15, null);
                                    c11931pM32209j.m48543i();
                                    break;
                                }
                            }
                        }
                    }
                    c11931pM32209j = (C11931p) ((AbstractC17169c) AbstractC17169c.f65966x.get(c11931pM32209j));
                } while (c11931pM32209j != null);
                if (objM48479e != null) {
                    if (objM48479e instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM48479e;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m32197E((InterfaceC3044o2) arrayList.get(size), false);
                        }
                    } else {
                        m32197E((InterfaceC3044o2) objM48479e, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m32221w() {
        return m32220v(f39003x.get(this), true);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m32222x() {
        return m32220v(f39003x.get(this), false);
    }

    /* JADX INFO: renamed from: y */
    public boolean mo32223y() {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m32224z() {
        long j7 = f39005z.get(this);
        return j7 == 0 || j7 == Long.MAX_VALUE;
    }
}
