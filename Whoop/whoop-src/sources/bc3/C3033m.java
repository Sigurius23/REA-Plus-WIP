package bc3;

import hc3.AbstractC17167b;
import hc3.AbstractC17189v;
import hc3.C17173f;
import hc3.C17191x;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;
import l83.C23454a0;
import l83.C23468n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.InterfaceC32270d;

/* JADX INFO: renamed from: bc3.m */
/* JADX INFO: loaded from: classes5.dex */
public class C3033m extends AbstractC3042o0 implements InterfaceC3025k, InterfaceC32270d, InterfaceC3044o2 {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12051F = AtomicIntegerFieldUpdater.newUpdater(C3033m.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12052G = AtomicReferenceFieldUpdater.newUpdater(C3033m.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12053H = AtomicReferenceFieldUpdater.newUpdater(C3033m.class, Object.class, "_parentHandle$volatile");

    /* JADX INFO: renamed from: E */
    public final InterfaceC30063j f12054E;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: z */
    public final InterfaceC30057d f12055z;

    public C3033m(int i13, InterfaceC30057d interfaceC30057d) {
        super(i13);
        this.f12055z = interfaceC30057d;
        this.f12054E = interfaceC30057d.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C2989b.f11995w;
    }

    /* JADX INFO: renamed from: D */
    public static Object m8754D(InterfaceC2988a2 interfaceC2988a2, Object obj, int i13, Function3 function3) {
        if (obj instanceof C3067w) {
            return obj;
        }
        if (i13 != 1 && i13 != 2) {
            return obj;
        }
        if (function3 != null || (interfaceC2988a2 instanceof InterfaceC3021j)) {
            return new C3064v(obj, interfaceC2988a2 instanceof InterfaceC3021j ? (InterfaceC3021j) interfaceC2988a2 : null, function3, (Throwable) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: y */
    public static void m8755y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: renamed from: A */
    public final void m8756A() {
        InterfaceC30057d interfaceC30057d = this.f12055z;
        Throwable th3 = null;
        C17173f c17173f = interfaceC30057d instanceof C17173f ? (C17173f) interfaceC30057d : null;
        if (c17173f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C17173f.f65973H;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c17173f);
                C17191x c17191x = AbstractC17167b.f65958c;
                if (obj != c17191x) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c17173f, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c17173f) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th3 = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c17173f, c17191x, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c17173f) == c17191x);
            }
            if (th3 == null) {
                return;
            }
            m8770o();
            cancel(th3);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8757B(Object obj, int i13, Function3 function3) throws DispatchException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12052G;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC2988a2)) {
                if (obj2 instanceof C3037n) {
                    C3037n c3037n = (C3037n) obj2;
                    if (C3037n.f12058c.compareAndSet(c3037n, 0, 1)) {
                        if (function3 != null) {
                            m8768l(function3, c3037n.f12104a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objM8754D = m8754D((InterfaceC2988a2) obj2, obj, i13, function3);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM8754D)) {
                    if (!m8779x()) {
                        m8770o();
                    }
                    m8771p(i13);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m8758C(AbstractC3076z abstractC3076z) {
        InterfaceC30057d interfaceC30057d = this.f12055z;
        C17173f c17173f = interfaceC30057d instanceof C17173f ? (C17173f) interfaceC30057d : null;
        m8757B(C23454a0.f92919a, (c17173f != null ? c17173f.f65977z : null) == abstractC3076z ? 4 : this.f12064y, null);
    }

    /* JADX INFO: renamed from: E */
    public final C17191x m8759E(Object obj, Function3 function3) {
        C17191x c17191x = AbstractC3006f0.f12015a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12052G;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC2988a2)) {
                return null;
            }
            Object objM8754D = m8754D((InterfaceC2988a2) obj2, obj, this.f12064y, function3);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM8754D)) {
                    if (!m8779x()) {
                        m8770o();
                    }
                    return c17191x;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: F */
    public final C17191x m8760F(Throwable th3) {
        return m8759E(new C3067w(th3, false), null);
    }

    @Override // bc3.AbstractC3042o0
    /* JADX INFO: renamed from: a */
    public final void mo8761a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12052G;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC2988a2) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C3067w) {
                return;
            }
            if (!(obj instanceof C3064v)) {
                cancellationException2 = cancellationException;
                C3064v c3064v = new C3064v(obj, (InterfaceC3021j) null, (Function3) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3064v)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C3064v c3064v2 = (C3064v) obj;
            if (c3064v2.f12099e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C3064v c3064vM8824a = C3064v.m8824a(c3064v2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c3064vM8824a)) {
                    InterfaceC3021j interfaceC3021j = c3064v2.f12096b;
                    if (interfaceC3021j != null) {
                        m8767k(interfaceC3021j, cancellationException);
                    }
                    Function3 function3 = c3064v2.f12097c;
                    if (function3 != null) {
                        m8768l(function3, cancellationException, c3064v2.f12095a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // bc3.InterfaceC3044o2
    /* JADX INFO: renamed from: b */
    public final void mo8762b(AbstractC17189v abstractC17189v, int i13) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i14;
        do {
            atomicIntegerFieldUpdater = f12051F;
            i14 = atomicIntegerFieldUpdater.get(this);
            if ((i14 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, ((i14 >> 29) << 29) + i13));
        m8777v(abstractC17189v);
    }

    @Override // bc3.InterfaceC3025k
    /* JADX INFO: renamed from: c */
    public final C17191x mo8743c(Object obj, Function3 function3) {
        return m8759E(obj, function3);
    }

    @Override // bc3.InterfaceC3025k
    public final boolean cancel(Throwable th3) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12052G;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC2988a2)) {
                return false;
            }
            boolean z4 = (obj instanceof InterfaceC3021j) || (obj instanceof AbstractC17189v);
            if (th3 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th3;
            }
            C3037n c3037n = new C3037n(cancellationException, z4);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c3037n)) {
                    InterfaceC2988a2 interfaceC2988a2 = (InterfaceC2988a2) obj;
                    if (interfaceC2988a2 instanceof InterfaceC3021j) {
                        m8767k((InterfaceC3021j) obj, th3);
                    } else if (interfaceC2988a2 instanceof AbstractC17189v) {
                        m8769m((AbstractC17189v) obj, th3);
                    }
                    if (!m8779x()) {
                        m8770o();
                    }
                    m8771p(this.f12064y);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // bc3.AbstractC3042o0
    /* JADX INFO: renamed from: d */
    public final InterfaceC30057d mo8763d() {
        return this.f12055z;
    }

    @Override // bc3.InterfaceC3025k
    /* JADX INFO: renamed from: e */
    public final void mo8744e(Object obj, Function1 function1) throws DispatchException {
        m8757B(obj, this.f12064y, function1 != null ? new C3029l(function1, 0) : null);
    }

    @Override // bc3.AbstractC3042o0
    /* JADX INFO: renamed from: f */
    public final Throwable mo8764f(Object obj) {
        Throwable thMo8764f = super.mo8764f(obj);
        if (thMo8764f != null) {
            return thMo8764f;
        }
        return null;
    }

    @Override // bc3.InterfaceC3025k
    /* JADX INFO: renamed from: g */
    public final void mo8745g(Object obj, Function3 function3) throws DispatchException {
        m8757B(obj, this.f12064y, function3);
    }

    @Override // s83.InterfaceC32270d
    public final InterfaceC32270d getCallerFrame() {
        InterfaceC30057d interfaceC30057d = this.f12055z;
        if (interfaceC30057d instanceof InterfaceC32270d) {
            return (InterfaceC32270d) interfaceC30057d;
        }
        return null;
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return this.f12054E;
    }

    @Override // bc3.AbstractC3042o0
    /* JADX INFO: renamed from: h */
    public final Object mo8765h(Object obj) {
        return obj instanceof C3064v ? ((C3064v) obj).f12095a : obj;
    }

    @Override // bc3.InterfaceC3025k
    public final boolean isActive() {
        return f12052G.get(this) instanceof InterfaceC2988a2;
    }

    @Override // bc3.AbstractC3042o0
    /* JADX INFO: renamed from: j */
    public final Object mo8766j() {
        return f12052G.get(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m8767k(InterfaceC3021j interfaceC3021j, Throwable th3) {
        try {
            interfaceC3021j.mo8688a(th3);
        } catch (Throwable th4) {
            AbstractC3006f0.m8727u(this.f12054E, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th4));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8768l(Function3 function3, Throwable th3, Object obj) {
        InterfaceC30063j interfaceC30063j = this.f12054E;
        try {
            function3.invoke(th3, obj, interfaceC30063j);
        } catch (Throwable th4) {
            AbstractC3006f0.m8727u(interfaceC30063j, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th4));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m8769m(AbstractC17189v abstractC17189v, Throwable th3) {
        InterfaceC30063j interfaceC30063j = this.f12054E;
        int i13 = f12051F.get(this) & 536870911;
        if (i13 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC17189v.mo32228h(i13, interfaceC30063j);
        } catch (Throwable th4) {
            AbstractC3006f0.m8727u(interfaceC30063j, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th4));
        }
    }

    @Override // bc3.InterfaceC3025k
    /* JADX INFO: renamed from: n */
    public final void mo8746n(Object obj) throws DispatchException {
        m8771p(this.f12064y);
    }

    /* JADX INFO: renamed from: o */
    public final void m8770o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12053H;
        InterfaceC3056s0 interfaceC3056s0 = (InterfaceC3056s0) atomicReferenceFieldUpdater.get(this);
        if (interfaceC3056s0 == null) {
            return;
        }
        interfaceC3056s0.dispose();
        atomicReferenceFieldUpdater.set(this, C3078z1.f12113w);
    }

    /* JADX INFO: renamed from: p */
    public final void m8771p(int i13) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i14;
        do {
            atomicIntegerFieldUpdater = f12051F;
            i14 = atomicIntegerFieldUpdater.get(this);
            int i15 = i14 >> 29;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z4 = i13 == 4;
                InterfaceC30057d interfaceC30057d = this.f12055z;
                if (!z4 && (interfaceC30057d instanceof C17173f)) {
                    boolean z13 = i13 == 1 || i13 == 2;
                    int i16 = this.f12064y;
                    if (z13 == (i16 == 1 || i16 == 2)) {
                        C17173f c17173f = (C17173f) interfaceC30057d;
                        AbstractC3076z abstractC3076z = c17173f.f65977z;
                        InterfaceC30063j context = c17173f.f65974E.getContext();
                        if (AbstractC17167b.m48483i(abstractC3076z, context)) {
                            AbstractC17167b.m48482h(abstractC3076z, context, this);
                            return;
                        }
                        AbstractC2987a1 abstractC2987a1M8738a = AbstractC3012g2.m8738a();
                        if (abstractC2987a1M8738a.f11992w >= 4294967296L) {
                            abstractC2987a1M8738a.m8678T(this);
                            return;
                        }
                        abstractC2987a1M8738a.m8680b0(true);
                        try {
                            AbstractC3006f0.m8698D(this, interfaceC30057d, true);
                            do {
                            } while (abstractC2987a1M8738a.m8682p0());
                        } catch (Throwable th3) {
                            try {
                                m8792i(th3);
                            } finally {
                                abstractC2987a1M8738a.m8683s(true);
                            }
                        }
                        return;
                    }
                }
                AbstractC3006f0.m8698D(this, interfaceC30057d, z4);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, 1073741824 + (536870911 & i14)));
    }

    /* JADX INFO: renamed from: q */
    public Throwable mo8772q(C3060t1 c3060t1) {
        return c3060t1.getCancellationException();
    }

    /* JADX INFO: renamed from: r */
    public final Object m8773r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i13;
        InterfaceC3027k1 interfaceC3027k1;
        boolean zM8779x = m8779x();
        do {
            atomicIntegerFieldUpdater = f12051F;
            i13 = atomicIntegerFieldUpdater.get(this);
            int i14 = i13 >> 29;
            if (i14 != 0) {
                if (i14 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM8779x) {
                    m8756A();
                }
                Object obj = f12052G.get(this);
                if (obj instanceof C3067w) {
                    throw ((C3067w) obj).f12104a;
                }
                int i15 = this.f12064y;
                if ((i15 != 1 && i15 != 2) || (interfaceC3027k1 = (InterfaceC3027k1) this.f12054E.get(C3023j1.f12041w)) == null || interfaceC3027k1.isActive()) {
                    return mo8765h(obj);
                }
                CancellationException cancellationException = interfaceC3027k1.getCancellationException();
                mo8761a(cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i13, 536870912 + (536870911 & i13)));
        if (((InterfaceC3056s0) f12053H.get(this)) == null) {
            m8775t();
        }
        if (zM8779x) {
            m8756A();
        }
        return EnumC31071a.f128113w;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        Throwable thM68037a = C23468n.m68037a(obj);
        if (thM68037a != null) {
            obj = new C3067w(thM68037a, false);
        }
        m8757B(obj, this.f12064y, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m8774s() {
        InterfaceC3056s0 interfaceC3056s0M8775t = m8775t();
        if (interfaceC3056s0M8775t != null && m8778w()) {
            interfaceC3056s0M8775t.dispose();
            f12053H.set(this, C3078z1.f12113w);
        }
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC3056s0 m8775t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f12054E.get(C3023j1.f12041w);
        if (interfaceC3027k1 == null) {
            return null;
        }
        InterfaceC3056s0 interfaceC3056s0M8728v = AbstractC3006f0.m8728v(interfaceC3027k1, true, new C3041o(this, 0));
        do {
            atomicReferenceFieldUpdater = f12053H;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC3056s0M8728v)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC3056s0M8728v;
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(mo8780z());
        sb4.append('(');
        sb4.append(AbstractC3006f0.m8702H(this.f12055z));
        sb4.append("){");
        Object obj = f12052G.get(this);
        if (obj instanceof InterfaceC2988a2) {
            str = "Active";
        } else {
            str = obj instanceof C3037n ? "Cancelled" : "Completed";
        }
        sb4.append(str);
        sb4.append("}@");
        sb4.append(AbstractC3006f0.m8724r(this));
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m8776u(Function1 function1) {
        m8777v(new C3017i(function1, 0));
    }

    /* JADX INFO: renamed from: v */
    public final void m8777v(InterfaceC2988a2 interfaceC2988a2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12052G;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C2989b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, interfaceC2988a2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof InterfaceC3021j) || (obj instanceof AbstractC17189v)) {
                m8755y(interfaceC2988a2, obj);
                throw null;
            }
            if (obj instanceof C3067w) {
                C3067w c3067w = (C3067w) obj;
                if (!C3067w.f12103b.compareAndSet(c3067w, 0, 1)) {
                    m8755y(interfaceC2988a2, obj);
                    throw null;
                }
                if (obj instanceof C3037n) {
                    Throwable th3 = c3067w.f12104a;
                    if (interfaceC2988a2 instanceof InterfaceC3021j) {
                        m8767k((InterfaceC3021j) interfaceC2988a2, th3);
                        return;
                    } else {
                        AbstractC22676k.m65748h(interfaceC2988a2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m8769m((AbstractC17189v) interfaceC2988a2, th3);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C3064v)) {
                if (interfaceC2988a2 instanceof AbstractC17189v) {
                    return;
                }
                AbstractC22676k.m65748h(interfaceC2988a2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C3064v c3064v = new C3064v(obj, (InterfaceC3021j) interfaceC2988a2, (Function3) null, (Throwable) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3064v)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C3064v c3064v2 = (C3064v) obj;
            if (c3064v2.f12096b != null) {
                m8755y(interfaceC2988a2, obj);
                throw null;
            }
            if (interfaceC2988a2 instanceof AbstractC17189v) {
                return;
            }
            AbstractC22676k.m65748h(interfaceC2988a2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            InterfaceC3021j interfaceC3021j = (InterfaceC3021j) interfaceC2988a2;
            Throwable th4 = c3064v2.f12099e;
            if (th4 != null) {
                m8767k(interfaceC3021j, th4);
                return;
            }
            C3064v c3064vM8824a = C3064v.m8824a(c3064v2, interfaceC3021j, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3064vM8824a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m8778w() {
        return !(f12052G.get(this) instanceof InterfaceC2988a2);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m8779x() {
        if (this.f12064y != 2) {
            return false;
        }
        InterfaceC30057d interfaceC30057d = this.f12055z;
        AbstractC22676k.m65748h(interfaceC30057d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C17173f.f65973H.get((C17173f) interfaceC30057d) != null;
    }

    /* JADX INFO: renamed from: z */
    public String mo8780z() {
        return "CancellableContinuation";
    }
}
