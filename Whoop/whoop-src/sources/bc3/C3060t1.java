package bc3;

import ad3.C0783z;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import hc3.C17175h;
import hc3.C17178k;
import hc3.C17191x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import lc3.InterfaceC23833c;
import m83.C25264r;
import p000.AbstractC30802r;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: bc3.t1 */
/* JADX INFO: loaded from: classes5.dex */
public class C3060t1 implements InterfaceC3027k1, InterfaceC3052r, InterfaceC2992b2 {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12091w = AtomicReferenceFieldUpdater.newUpdater(C3060t1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12092x = AtomicReferenceFieldUpdater.newUpdater(C3060t1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C3060t1(boolean z4) {
        this._state$volatile = z4 ? AbstractC3006f0.f12024j : AbstractC3006f0.f12023i;
    }

    /* JADX INFO: renamed from: O */
    public static C3049q m8798O(C17178k c17178k) {
        while (c17178k.mo8829g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C17178k.f65988x;
            C17178k c17178kM48526d = c17178k.m48526d();
            if (c17178kM48526d == null) {
                Object obj = atomicReferenceFieldUpdater.get(c17178k);
                while (true) {
                    c17178k = (C17178k) obj;
                    if (!c17178k.mo8829g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c17178k);
                }
            } else {
                c17178k = c17178kM48526d;
            }
        }
        while (true) {
            c17178k = c17178k.m48528f();
            if (!c17178k.mo8829g()) {
                if (c17178k instanceof C3049q) {
                    return (C3049q) c17178k;
                }
                if (c17178k instanceof C3072x1) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public static String m8799V(Object obj) {
        if (!(obj instanceof C3047p1)) {
            if (obj instanceof InterfaceC3011g1) {
                return ((InterfaceC3011g1) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof C3067w ? "Cancelled" : "Completed";
        }
        C3047p1 c3047p1 = (C3047p1) obj;
        if (c3047p1.m8796d()) {
            return "Cancelling";
        }
        return C3047p1.f12070x.get(c3047p1) == 1 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: W */
    public static CancellationException m8800W(C3060t1 c3060t1, Throwable th3) {
        CancellationException cancellationException = th3 instanceof CancellationException ? (CancellationException) th3 : null;
        return cancellationException == null ? new JobCancellationException(c3060t1.mo8677u(), th3, c3060t1) : cancellationException;
    }

    /* JADX INFO: renamed from: A */
    public final Object m8801A() throws Throwable {
        Object obj = f12091w.get(this);
        if (obj instanceof InterfaceC3011g1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C3067w) {
            throw ((C3067w) obj).f12104a;
        }
        return AbstractC3006f0.m8703I(obj);
    }

    /* JADX INFO: renamed from: B */
    public final Throwable m8802B(C3047p1 c3047p1, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c3047p1.m8796d()) {
                return new JobCancellationException(mo8677u(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th3 = (Throwable) next;
        if (th3 != null) {
            return th3;
        }
        Throwable th4 = (Throwable) arrayList.get(0);
        if (th4 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th5 = (Throwable) obj2;
                if (th5 != th4 && (th5 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th6 = (Throwable) obj;
            if (th6 != null) {
                return th6;
            }
        }
        return th4;
    }

    /* JADX INFO: renamed from: C */
    public boolean mo8752C() {
        return true;
    }

    /* JADX INFO: renamed from: D */
    public boolean mo8753D() {
        return this instanceof C3058t;
    }

    /* JADX INFO: renamed from: E */
    public final C3072x1 m8803E(InterfaceC3011g1 interfaceC3011g1) {
        C3072x1 c3072x1Mo8733b = interfaceC3011g1.mo8733b();
        if (c3072x1Mo8733b != null) {
            return c3072x1Mo8733b;
        }
        if (interfaceC3011g1 instanceof C3062u0) {
            return new C3072x1();
        }
        if (interfaceC3011g1 instanceof AbstractC3035m1) {
            m8812T((AbstractC3035m1) interfaceC3011g1);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC3011g1).toString());
    }

    /* JADX INFO: renamed from: F */
    public boolean mo8687F(Throwable th3) {
        return false;
    }

    /* JADX INFO: renamed from: G */
    public void mo8672G(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* JADX INFO: renamed from: H */
    public final void m8804H(InterfaceC3027k1 interfaceC3027k1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12092x;
        C3078z1 c3078z1 = C3078z1.f12113w;
        if (interfaceC3027k1 == null) {
            atomicReferenceFieldUpdater.set(this, c3078z1);
            return;
        }
        interfaceC3027k1.start();
        InterfaceC3045p interfaceC3045pAttachChild = interfaceC3027k1.attachChild(this);
        atomicReferenceFieldUpdater.set(this, interfaceC3045pAttachChild);
        if (isCompleted()) {
            interfaceC3045pAttachChild.dispose();
            atomicReferenceFieldUpdater.set(this, c3078z1);
        }
    }

    /* JADX INFO: renamed from: I */
    public final InterfaceC3056s0 m8805I(boolean z4, AbstractC3035m1 abstractC3035m1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z13;
        boolean zM48525c;
        abstractC3035m1.f12056z = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f12091w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z14 = obj instanceof C3062u0;
            C3078z1 c3078z1 = C3078z1.f12113w;
            z13 = true;
            if (!z14) {
                if (!(obj instanceof InterfaceC3011g1)) {
                    z13 = false;
                    break;
                }
                InterfaceC3011g1 interfaceC3011g1 = (InterfaceC3011g1) obj;
                C3072x1 c3072x1Mo8733b = interfaceC3011g1.mo8733b();
                if (c3072x1Mo8733b == null) {
                    m8812T((AbstractC3035m1) obj);
                } else {
                    if (abstractC3035m1.mo8685i()) {
                        C3047p1 c3047p1 = interfaceC3011g1 instanceof C3047p1 ? (C3047p1) interfaceC3011g1 : null;
                        Throwable thM8795c = c3047p1 != null ? c3047p1.m8795c() : null;
                        if (thM8795c == null) {
                            zM48525c = c3072x1Mo8733b.m48525c(abstractC3035m1, 5);
                        } else if (z4) {
                            abstractC3035m1.mo8686j(thM8795c);
                            return c3078z1;
                        }
                    } else {
                        zM48525c = c3072x1Mo8733b.m48525c(abstractC3035m1, 1);
                    }
                    if (zM48525c) {
                        break;
                    }
                }
            } else {
                C3062u0 c3062u0 = (C3062u0) obj;
                boolean z15 = c3062u0.f12093w;
                if (z15) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC3035m1)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    C3072x1 c3072x1 = new C3072x1();
                    InterfaceC3011g1 c3007f1 = c3072x1;
                    if (!z15) {
                        c3007f1 = new C3007f1(c3072x1);
                    }
                    AbstractC30802r.m94776y(atomicReferenceFieldUpdater, this, c3062u0, c3007f1);
                }
            }
            return c3078z1;
        }
        if (z13) {
            return abstractC3035m1;
        }
        if (z4) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C3067w c3067w = obj2 instanceof C3067w ? (C3067w) obj2 : null;
            abstractC3035m1.mo8686j(c3067w != null ? c3067w.f12104a : null);
        }
        return c3078z1;
    }

    /* JADX INFO: renamed from: K */
    public boolean mo8806K() {
        return this instanceof C3005f;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m8807L(Object obj) {
        Object objM8814X;
        do {
            objM8814X = m8814X(f12091w.get(this), obj);
            if (objM8814X == AbstractC3006f0.f12018d) {
                return false;
            }
            if (objM8814X == AbstractC3006f0.f12019e) {
                return true;
            }
        } while (objM8814X == AbstractC3006f0.f12020f);
        mo8694j(objM8814X);
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final Object m8808M(Object obj) {
        Object objM8814X;
        do {
            objM8814X = m8814X(f12091w.get(this), obj);
            if (objM8814X == AbstractC3006f0.f12018d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C3067w c3067w = obj instanceof C3067w ? (C3067w) obj : null;
                throw new IllegalStateException(str, c3067w != null ? c3067w.f12104a : null);
            }
        } while (objM8814X == AbstractC3006f0.f12020f);
        return objM8814X;
    }

    /* JADX INFO: renamed from: N */
    public String mo8742N() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: P */
    public final void m8809P(C3072x1 c3072x1, Throwable th3) {
        c3072x1.m48525c(new C17175h(4), 4);
        Object obj = C17178k.f65987w.get(c3072x1);
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (C17178k c17178kM48528f = (C17178k) obj; !c17178kM48528f.equals(c3072x1); c17178kM48528f = c17178kM48528f.m48528f()) {
            if ((c17178kM48528f instanceof AbstractC3035m1) && ((AbstractC3035m1) c17178kM48528f).mo8685i()) {
                try {
                    ((AbstractC3035m1) c17178kM48528f).mo8686j(th3);
                } catch (Throwable th4) {
                    if (completionHandlerException != null) {
                        AbstractC29125c.m88530g(completionHandlerException, th4);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c17178kM48528f + " for " + this, th4);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo8672G(completionHandlerException);
        }
        m8820q(th3);
    }

    /* JADX INFO: renamed from: Q */
    public void m8810Q(Throwable th3) {
    }

    /* JADX INFO: renamed from: R */
    public void mo8673R(Object obj) {
    }

    /* JADX INFO: renamed from: S */
    public void mo8811S() {
    }

    /* JADX INFO: renamed from: T */
    public final void m8812T(AbstractC3035m1 abstractC3035m1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3072x1 c3072x1 = new C3072x1();
        abstractC3035m1.getClass();
        C17178k.f65988x.set(c3072x1, abstractC3035m1);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C17178k.f65987w;
        atomicReferenceFieldUpdater2.set(c3072x1, abstractC3035m1);
        loop0: while (atomicReferenceFieldUpdater2.get(abstractC3035m1) == abstractC3035m1) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC3035m1, abstractC3035m1, c3072x1)) {
                    c3072x1.m48527e(abstractC3035m1);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC3035m1) == abstractC3035m1);
        }
        C17178k c17178kM48528f = abstractC3035m1.m48528f();
        do {
            atomicReferenceFieldUpdater = f12091w;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC3035m1, c17178kM48528f)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC3035m1);
    }

    /* JADX INFO: renamed from: U */
    public final int m8813U(Object obj) {
        boolean z4 = obj instanceof C3062u0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12091w;
        if (z4) {
            if (((C3062u0) obj).f12093w) {
                return 0;
            }
            C3062u0 c3062u0 = AbstractC3006f0.f12024j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3062u0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo8811S();
            return 1;
        }
        if (!(obj instanceof C3007f1)) {
            return 0;
        }
        C3072x1 c3072x1 = ((C3007f1) obj).f12025w;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3072x1)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo8811S();
        return 1;
    }

    /* JADX INFO: renamed from: X */
    public final Object m8814X(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC3011g1)) {
            return AbstractC3006f0.f12018d;
        }
        if (((obj instanceof C3062u0) || (obj instanceof AbstractC3035m1)) && !(obj instanceof C3049q) && !(obj2 instanceof C3067w)) {
            InterfaceC3011g1 interfaceC3011g1 = (InterfaceC3011g1) obj;
            if (!AbstractC30802r.m94748A(f12091w, this, interfaceC3011g1, obj2 instanceof InterfaceC3011g1 ? new C3015h1((InterfaceC3011g1) obj2) : obj2)) {
                return AbstractC3006f0.f12020f;
            }
            mo8673R(obj2);
            m8821w(interfaceC3011g1, obj2);
            return obj2;
        }
        InterfaceC3011g1 interfaceC3011g2 = (InterfaceC3011g1) obj;
        C3072x1 c3072x1M8803E = m8803E(interfaceC3011g2);
        if (c3072x1M8803E == null) {
            return AbstractC3006f0.f12020f;
        }
        C3047p1 c3047p1 = interfaceC3011g2 instanceof C3047p1 ? (C3047p1) interfaceC3011g2 : null;
        if (c3047p1 == null) {
            c3047p1 = new C3047p1(c3072x1M8803E, null);
        }
        synchronized (c3047p1) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3047p1.f12070x;
            if (atomicIntegerFieldUpdater.get(c3047p1) == 1) {
                return AbstractC3006f0.f12018d;
            }
            atomicIntegerFieldUpdater.set(c3047p1, 1);
            if (c3047p1 != interfaceC3011g2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12091w;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC3011g2, c3047p1)) {
                    if (atomicReferenceFieldUpdater.get(this) != interfaceC3011g2) {
                        return AbstractC3006f0.f12020f;
                    }
                }
            }
            boolean zM8796d = c3047p1.m8796d();
            C3067w c3067w = obj2 instanceof C3067w ? (C3067w) obj2 : null;
            if (c3067w != null) {
                c3047p1.m8794a(c3067w.f12104a);
            }
            Throwable thM8795c = zM8796d ? null : c3047p1.m8795c();
            if (thM8795c != null) {
                m8809P(c3072x1M8803E, thM8795c);
            }
            C3049q c3049qM8798O = m8798O(c3072x1M8803E);
            if (c3049qM8798O != null && m8815Y(c3047p1, c3049qM8798O, obj2)) {
                return AbstractC3006f0.f12019e;
            }
            c3072x1M8803E.m48525c(new C17175h(2), 2);
            C3049q c3049qM8798O2 = m8798O(c3072x1M8803E);
            return (c3049qM8798O2 == null || !m8815Y(c3047p1, c3049qM8798O2, obj2)) ? m8823z(c3047p1, obj2) : AbstractC3006f0.f12019e;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m8815Y(C3047p1 c3047p1, C3049q c3049q, Object obj) {
        while (AbstractC3006f0.m8728v(c3049q.f12076E, false, new C3043o1(this, c3047p1, c3049q, obj)) == C3078z1.f12113w) {
            c3049q = m8798O(c3049q);
            if (c3049q == null) {
                return false;
            }
        }
        return true;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3045p attachChild(InterfaceC3052r interfaceC3052r) {
        C3049q c3049q = new C3049q(interfaceC3052r);
        c3049q.f12056z = this;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12091w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C3062u0) {
                C3062u0 c3062u0 = (C3062u0) obj;
                boolean z4 = c3062u0.f12093w;
                if (!z4) {
                    C3072x1 c3072x1 = new C3072x1();
                    InterfaceC3011g1 c3007f1 = c3072x1;
                    if (!z4) {
                        c3007f1 = new C3007f1(c3072x1);
                    }
                    AbstractC30802r.m94776y(atomicReferenceFieldUpdater, this, c3062u0, c3007f1);
                } else if (AbstractC30802r.m94777z(atomicReferenceFieldUpdater, this, c3062u0, c3049q)) {
                    break;
                }
            } else {
                boolean z13 = obj instanceof InterfaceC3011g1;
                C3078z1 c3078z1 = C3078z1.f12113w;
                Throwable thM8795c = null;
                if (!z13) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C3067w c3067w = obj2 instanceof C3067w ? (C3067w) obj2 : null;
                    c3049q.mo8686j(c3067w != null ? c3067w.f12104a : null);
                    return c3078z1;
                }
                C3072x1 c3072x1Mo8733b = ((InterfaceC3011g1) obj).mo8733b();
                if (c3072x1Mo8733b != null) {
                    if (c3072x1Mo8733b.m48525c(c3049q, 7)) {
                        break;
                    }
                    boolean zM48525c = c3072x1Mo8733b.m48525c(c3049q, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C3047p1) {
                        thM8795c = ((C3047p1) obj3).m8795c();
                    } else {
                        C3067w c3067w2 = obj3 instanceof C3067w ? (C3067w) obj3 : null;
                        if (c3067w2 != null) {
                            thM8795c = c3067w2.f12104a;
                        }
                    }
                    c3049q.mo8686j(thM8795c);
                    if (zM48525c) {
                        break;
                    }
                    return c3078z1;
                }
                m8812T((AbstractC3035m1) obj);
            }
        }
        return c3049q;
    }

    /* JADX INFO: renamed from: b */
    public Object m8816b() {
        return m8801A();
    }

    @Override // bc3.InterfaceC3027k1
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return AbstractC12889b.m36236B(this, obj, interfaceC4351m);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // bc3.InterfaceC3027k1
    public final CancellationException getCancellationException() {
        Object obj = f12091w.get(this);
        if (!(obj instanceof C3047p1)) {
            if (!(obj instanceof InterfaceC3011g1)) {
                return obj instanceof C3067w ? m8800W(this, ((C3067w) obj).f12104a) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thM8795c = ((C3047p1) obj).m8795c();
        if (thM8795c == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thM8795c instanceof CancellationException ? (CancellationException) thM8795c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo8677u();
        }
        return new JobCancellationException(strConcat, thM8795c, this);
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC38174i getChildren() {
        return new C25264r(new C3054r1(this, (InterfaceC30057d) null, 0));
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return C3023j1.f12041w;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC23833c getOnJoin() {
        C3057s1 c3057s1 = C3057s1.f12088w;
        AbstractC22681m0.m65774e(3, c3057s1);
        return new C0783z(this, c3057s1);
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3027k1 getParent() {
        InterfaceC3045p interfaceC3045p = (InterfaceC3045p) f12092x.get(this);
        if (interfaceC3045p != null) {
            return interfaceC3045p.getParent();
        }
        return null;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(Function1 function1) {
        return m8805I(true, new C3059t0(function1, 1));
    }

    @Override // bc3.InterfaceC3027k1
    public boolean isActive() {
        Object obj = f12091w.get(this);
        return (obj instanceof InterfaceC3011g1) && ((InterfaceC3011g1) obj).isActive();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCancelled() {
        Object obj = f12091w.get(this);
        if (obj instanceof C3067w) {
            return true;
        }
        return (obj instanceof C3047p1) && ((C3047p1) obj).m8796d();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCompleted() {
        return !(f12091w.get(this) instanceof InterfaceC3011g1);
    }

    /* JADX INFO: renamed from: j */
    public void mo8694j(Object obj) {
    }

    @Override // bc3.InterfaceC3027k1
    public final Object join(InterfaceC30057d interfaceC30057d) {
        Object obj;
        C23454a0 c23454a0;
        do {
            obj = f12091w.get(this);
            boolean z4 = obj instanceof InterfaceC3011g1;
            c23454a0 = C23454a0.f92919a;
            if (!z4) {
                AbstractC3006f0.m8721o(interfaceC30057d.getContext());
                return c23454a0;
            }
        } while (m8813U(obj) < 0);
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        int i13 = 1;
        c3033m.m8777v(new C3017i(AbstractC3006f0.m8728v(this, true, new C3041o(c3033m, i13)), i13));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (objM8773r != enumC31071a) {
            objM8773r = c23454a0;
        }
        return objM8773r == enumC31071a ? objM8773r : c23454a0;
    }

    /* JADX INFO: renamed from: l */
    public void mo8791l(Object obj) {
        mo8694j(obj);
    }

    /* JADX INFO: renamed from: m */
    public final Object m8817m(InterfaceC30057d interfaceC30057d) {
        Object obj;
        do {
            obj = f12091w.get(this);
            if (!(obj instanceof InterfaceC3011g1)) {
                if (obj instanceof C3067w) {
                    throw ((C3067w) obj).f12104a;
                }
                return AbstractC3006f0.m8703I(obj);
            }
        } while (m8813U(obj) < 0);
        C3039n1 c3039n1 = new C3039n1(AbstractC15751g.m44424D(interfaceC30057d), this);
        c3039n1.m8774s();
        c3039n1.m8777v(new C3017i(AbstractC3006f0.m8728v(this, true, new C3059t0(c3039n1, 2)), 1));
        Object objM8773r = c3039n1.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:2: B:59:0x00b8->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:40:0x0080, B:38:0x0076, B:39:0x007a), top: B:84:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:40:0x0080, B:38:0x0076, B:39:0x007a), top: B:84:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:40:0x0080, B:38:0x0076, B:39:0x007a), top: B:84:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    /* JADX INFO: renamed from: o */
    public final boolean m8818o(Object obj) {
        Throwable thM8822y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z4;
        Throwable thM8795c;
        C17191x c17191x;
        InterfaceC3011g1 interfaceC3011g1;
        C3072x1 c3072x1M8803E;
        C3047p1 c3047p1;
        Object objM8814X;
        Object objM8814X2 = AbstractC3006f0.f12018d;
        if (mo8753D()) {
            do {
                Object obj3 = f12091w.get(this);
                if (obj3 instanceof InterfaceC3011g1) {
                    if (obj3 instanceof C3047p1) {
                        if (C3047p1.f12070x.get((C3047p1) obj3) == 1) {
                        }
                    }
                    objM8814X2 = m8814X(obj3, new C3067w(m8822y(obj), false));
                }
                objM8814X2 = AbstractC3006f0.f12018d;
                break;
            } while (objM8814X2 == AbstractC3006f0.f12020f);
            if (objM8814X2 != AbstractC3006f0.f12019e) {
                if (objM8814X2 == AbstractC3006f0.f12018d) {
                    thM8822y = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f12091w;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof C3047p1) {
                            synchronized (obj2) {
                                if (C3047p1.f12072z.get((C3047p1) obj2) == AbstractC3006f0.f12022h) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    c17191x = AbstractC3006f0.f12021g;
                                } else {
                                    boolean zM8796d = ((C3047p1) obj2).m8796d();
                                    if (obj == null || !zM8796d) {
                                        if (thM8822y == null) {
                                            thM8822y = m8822y(obj);
                                        }
                                        ((C3047p1) obj2).m8794a(thM8822y);
                                    }
                                    thM8795c = zM8796d ? null : ((C3047p1) obj2).m8795c();
                                    if (thM8795c != null) {
                                        m8809P(((C3047p1) obj2).f12073w, thM8795c);
                                    }
                                    c17191x = AbstractC3006f0.f12018d;
                                }
                            }
                        } else if (obj2 instanceof InterfaceC3011g1) {
                            if (thM8822y == null) {
                                thM8822y = m8822y(obj);
                            }
                            interfaceC3011g1 = (InterfaceC3011g1) obj2;
                            if (interfaceC3011g1.isActive()) {
                                c3072x1M8803E = m8803E(interfaceC3011g1);
                                if (c3072x1M8803E == null) {
                                    continue;
                                } else {
                                    c3047p1 = new C3047p1(c3072x1M8803E, thM8822y);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC3011g1, c3047p1)) {
                                            m8809P(c3072x1M8803E, thM8822y);
                                            c17191x = AbstractC3006f0.f12018d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC3011g1) {
                                        }
                                    }
                                }
                            } else {
                                objM8814X = m8814X(obj2, new C3067w(thM8822y, false));
                                if (objM8814X != AbstractC3006f0.f12018d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objM8814X != AbstractC3006f0.f12020f) {
                                    objM8814X2 = objM8814X;
                                    break;
                                }
                            }
                        } else {
                            c17191x = AbstractC3006f0.f12021g;
                        }
                        objM8814X2 = c17191x;
                        break;
                    }
                }
                if (objM8814X2 != AbstractC3006f0.f12018d && objM8814X2 != AbstractC3006f0.f12019e) {
                    if (objM8814X2 == AbstractC3006f0.f12021g) {
                        return false;
                    }
                    mo8694j(objM8814X2);
                    return true;
                }
            }
        } else {
            if (objM8814X2 == AbstractC3006f0.f12018d) {
                thM8822y = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f12091w;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof C3047p1) {
                        synchronized (obj2) {
                            if (C3047p1.f12072z.get((C3047p1) obj2) == AbstractC3006f0.f12022h) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                c17191x = AbstractC3006f0.f12021g;
                            } else {
                                boolean zM8796d2 = ((C3047p1) obj2).m8796d();
                                if (obj == null) {
                                    if (thM8822y == null) {
                                        thM8822y = m8822y(obj);
                                    }
                                    ((C3047p1) obj2).m8794a(thM8822y);
                                } else {
                                    if (thM8822y == null) {
                                        thM8822y = m8822y(obj);
                                    }
                                    ((C3047p1) obj2).m8794a(thM8822y);
                                }
                                if (zM8796d2) {
                                }
                                if (thM8795c != null) {
                                    m8809P(((C3047p1) obj2).f12073w, thM8795c);
                                }
                                c17191x = AbstractC3006f0.f12018d;
                            }
                        }
                    } else if (obj2 instanceof InterfaceC3011g1) {
                        if (thM8822y == null) {
                            thM8822y = m8822y(obj);
                        }
                        interfaceC3011g1 = (InterfaceC3011g1) obj2;
                        if (interfaceC3011g1.isActive()) {
                            c3072x1M8803E = m8803E(interfaceC3011g1);
                            if (c3072x1M8803E == null) {
                                continue;
                            } else {
                                c3047p1 = new C3047p1(c3072x1M8803E, thM8822y);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC3011g1, c3047p1)) {
                                        m8809P(c3072x1M8803E, thM8822y);
                                        c17191x = AbstractC3006f0.f12018d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC3011g1) {
                                    }
                                }
                            }
                        } else {
                            objM8814X = m8814X(obj2, new C3067w(thM8822y, false));
                            if (objM8814X != AbstractC3006f0.f12018d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objM8814X != AbstractC3006f0.f12020f) {
                                objM8814X2 = objM8814X;
                                break;
                            }
                        }
                    } else {
                        c17191x = AbstractC3006f0.f12021g;
                    }
                    objM8814X2 = c17191x;
                    break;
                }
            }
            if (objM8814X2 != AbstractC3006f0.f12018d) {
                if (objM8814X2 == AbstractC3006f0.f12021g) {
                    return false;
                }
                mo8694j(objM8814X2);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void mo8819p(CancellationException cancellationException) {
        m8818o(cancellationException);
    }

    @Override // bc3.InterfaceC3052r
    public final void parentCancelled(InterfaceC2992b2 interfaceC2992b2) {
        m8818o(interfaceC2992b2);
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3027k1 plus(InterfaceC3027k1 interfaceC3027k1) {
        return interfaceC3027k1;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8820q(Throwable th3) {
        if (mo8806K()) {
            return true;
        }
        boolean z4 = th3 instanceof CancellationException;
        InterfaceC3045p interfaceC3045p = (InterfaceC3045p) f12092x.get(this);
        if (interfaceC3045p == null || interfaceC3045p == C3078z1.f12113w) {
            return z4;
        }
        return interfaceC3045p.mo8793a(th3) || z4;
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean start() {
        int iM8813U;
        do {
            iM8813U = m8813U(f12091w.get(this));
            if (iM8813U == 0) {
                return false;
            }
        } while (iM8813U != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(mo8742N() + '{' + m8799V(f12091w.get(this)) + '}');
        sb4.append('@');
        sb4.append(AbstractC3006f0.m8724r(this));
        return sb4.toString();
    }

    /* JADX INFO: renamed from: u */
    public String mo8677u() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: v */
    public boolean mo8692v(Throwable th3) {
        if (th3 instanceof CancellationException) {
            return true;
        }
        return m8818o(th3) && mo8752C();
    }

    /* JADX INFO: renamed from: w */
    public final void m8821w(InterfaceC3011g1 interfaceC3011g1, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12092x;
        InterfaceC3045p interfaceC3045p = (InterfaceC3045p) atomicReferenceFieldUpdater.get(this);
        if (interfaceC3045p != null) {
            interfaceC3045p.dispose();
            atomicReferenceFieldUpdater.set(this, C3078z1.f12113w);
        }
        CompletionHandlerException completionHandlerException = null;
        C3067w c3067w = obj instanceof C3067w ? (C3067w) obj : null;
        Throwable th3 = c3067w != null ? c3067w.f12104a : null;
        if (interfaceC3011g1 instanceof AbstractC3035m1) {
            try {
                ((AbstractC3035m1) interfaceC3011g1).mo8686j(th3);
                return;
            } catch (Throwable th4) {
                mo8672G(new CompletionHandlerException("Exception in completion handler " + interfaceC3011g1 + " for " + this, th4));
                return;
            }
        }
        C3072x1 c3072x1Mo8733b = interfaceC3011g1.mo8733b();
        if (c3072x1Mo8733b != null) {
            c3072x1Mo8733b.m48525c(new C17175h(1), 1);
            Object obj2 = C17178k.f65987w.get(c3072x1Mo8733b);
            AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C17178k c17178kM48528f = (C17178k) obj2; !c17178kM48528f.equals(c3072x1Mo8733b); c17178kM48528f = c17178kM48528f.m48528f()) {
                if (c17178kM48528f instanceof AbstractC3035m1) {
                    try {
                        ((AbstractC3035m1) c17178kM48528f).mo8686j(th3);
                    } catch (Throwable th5) {
                        if (completionHandlerException != null) {
                            AbstractC29125c.m88530g(completionHandlerException, th5);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c17178kM48528f + " for " + this, th5);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo8672G(completionHandlerException);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final Throwable m8822y(Object obj) {
        Throwable thM8795c;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th3 = (Throwable) obj;
            return th3 == null ? new JobCancellationException(mo8677u(), null, this) : th3;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        C3060t1 c3060t1 = (C3060t1) ((InterfaceC2992b2) obj);
        Object obj2 = f12091w.get(c3060t1);
        if (obj2 instanceof C3047p1) {
            thM8795c = ((C3047p1) obj2).m8795c();
        } else if (obj2 instanceof C3067w) {
            thM8795c = ((C3067w) obj2).f12104a;
        } else {
            if (obj2 instanceof InterfaceC3011g1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thM8795c = null;
        }
        CancellationException cancellationException = thM8795c instanceof CancellationException ? (CancellationException) thM8795c : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(m8799V(obj2)), thM8795c, c3060t1) : cancellationException;
    }

    /* JADX INFO: renamed from: z */
    public final Object m8823z(C3047p1 c3047p1, Object obj) {
        Throwable thM8802B;
        C3067w c3067w = obj instanceof C3067w ? (C3067w) obj : null;
        Throwable th3 = c3067w != null ? c3067w.f12104a : null;
        synchronized (c3047p1) {
            c3047p1.m8796d();
            ArrayList<Throwable> arrayListM8797e = c3047p1.m8797e(th3);
            thM8802B = m8802B(c3047p1, arrayListM8797e);
            if (thM8802B != null && arrayListM8797e.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM8797e.size()));
                for (Throwable th4 : arrayListM8797e) {
                    if (th4 != thM8802B && th4 != thM8802B && !(th4 instanceof CancellationException) && setNewSetFromMap.add(th4)) {
                        AbstractC29125c.m88530g(thM8802B, th4);
                    }
                }
            }
        }
        if (thM8802B != null && thM8802B != th3) {
            obj = new C3067w(thM8802B, false);
        }
        if (thM8802B != null && (m8820q(thM8802B) || mo8687F(thM8802B))) {
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C3067w.f12103b.compareAndSet((C3067w) obj, 0, 1);
        }
        mo8673R(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12091w;
        Object c3015h1 = obj instanceof InterfaceC3011g1 ? new C3015h1((InterfaceC3011g1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c3047p1, c3015h1) && atomicReferenceFieldUpdater.get(this) == c3047p1) {
        }
        m8821w(c3047p1, obj);
        return obj;
    }

    @Override // bc3.InterfaceC3027k1
    public /* synthetic */ boolean cancel(Throwable th3) {
        mo8819p(th3 != null ? m8800W(this, th3) : new JobCancellationException(mo8677u(), null, this));
        return true;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(boolean z4, boolean z13, Function1 function1) {
        AbstractC3035m1 c3059t0;
        if (z4) {
            c3059t0 = new C3019i1(function1);
        } else {
            c3059t0 = new C3059t0(function1, 1);
        }
        return m8805I(z13, c3059t0);
    }

    @Override // bc3.InterfaceC3027k1
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo8677u(), null, this);
        }
        mo8819p(cancellationException);
    }
}
