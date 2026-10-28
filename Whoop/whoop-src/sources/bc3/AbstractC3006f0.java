package bc3;

import androidx.room.C1832u;
import b52.C2741a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import hc3.AbstractC17167b;
import hc3.C17171d;
import hc3.C17173f;
import hc3.C17188u;
import hc3.C17191x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kc3.C22365e;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DispatchException;
import l83.C23454a0;
import l83.C23468n;
import m83.C25258m;
import m83.C25271y;
import p007a6.C0448q;
import p095dp.AbstractC12240d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.C30058e;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30059f;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32270d;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: bc3.f0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3006f0 {

    /* JADX INFO: renamed from: a */
    public static final C17191x f12015a;

    /* JADX INFO: renamed from: b */
    public static final C17191x f12016b;

    /* JADX INFO: renamed from: c */
    public static final C17191x f12017c;

    /* JADX INFO: renamed from: d */
    public static final C17191x f12018d;

    /* JADX INFO: renamed from: e */
    public static final C17191x f12019e;

    /* JADX INFO: renamed from: f */
    public static final C17191x f12020f;

    /* JADX INFO: renamed from: g */
    public static final C17191x f12021g;

    /* JADX INFO: renamed from: h */
    public static final C17191x f12022h;

    /* JADX INFO: renamed from: i */
    public static final C3062u0 f12023i = new C3062u0(false);

    /* JADX INFO: renamed from: j */
    public static final C3062u0 f12024j = new C3062u0(true);

    static {
        int i13 = 0;
        f12015a = new C17191x("RESUME_TOKEN", i13);
        f12016b = new C17191x("REMOVED_TASK", i13);
        f12017c = new C17191x("CLOSED_EMPTY", i13);
        f12018d = new C17191x("COMPLETING_ALREADY", i13);
        f12019e = new C17191x("COMPLETING_WAITING_CHILDREN", i13);
        f12020f = new C17191x("COMPLETING_RETRY", i13);
        f12021g = new C17191x("TOO_LATE_TO_CANCEL", i13);
        f12022h = new C17191x("SEALED", i13);
    }

    /* JADX INFO: renamed from: A */
    public static final InterfaceC30063j m8695A(InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j) {
        InterfaceC30063j interfaceC30063jM8722p = m8722p(interfaceC2994c0.getCoroutineContext(), interfaceC30063j, true);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return (interfaceC30063jM8722p == c22365e || interfaceC30063jM8722p.get(C30058e.f122675w) != null) ? interfaceC30063jM8722p : interfaceC30063jM8722p.plus(c22365e);
    }

    /* JADX INFO: renamed from: B */
    public static final C17171d m8696B(InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j) {
        return new C17171d(interfaceC2994c0.getCoroutineContext().plus(interfaceC30063j));
    }

    /* JADX INFO: renamed from: C */
    public static final Object m8697C(Object obj) {
        return obj instanceof C3067w ? AbstractC34132o.m107888l(((C3067w) obj).f12104a) : obj;
    }

    /* JADX INFO: renamed from: D */
    public static final void m8698D(C3033m c3033m, InterfaceC30057d interfaceC30057d, boolean z4) {
        Object obj = C3033m.f12052G.get(c3033m);
        Throwable thMo8764f = c3033m.mo8764f(obj);
        Object objM107888l = thMo8764f != null ? AbstractC34132o.m107888l(thMo8764f) : c3033m.mo8765h(obj);
        if (!z4) {
            interfaceC30057d.resumeWith(objM107888l);
            return;
        }
        AbstractC22676k.m65748h(interfaceC30057d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C17173f c17173f = (C17173f) interfaceC30057d;
        InterfaceC30057d interfaceC30057d2 = c17173f.f65974E;
        Object obj2 = c17173f.f65976G;
        InterfaceC30063j context = interfaceC30057d2.getContext();
        Object objM48487m = AbstractC17167b.m48487m(context, obj2);
        C3036m2 c3036m2M8704J = objM48487m != AbstractC17167b.f65959d ? m8704J(interfaceC30057d2, context, objM48487m) : null;
        try {
            interfaceC30057d2.resumeWith(objM107888l);
        } finally {
            if (c3036m2M8704J == null || c3036m2M8704J.m8788d0()) {
                AbstractC17167b.m48480f(context, objM48487m);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static final Object m8699E(InterfaceC30063j interfaceC30063j, InterfaceC4351m interfaceC4351m) throws Throwable {
        AbstractC2987a1 abstractC2987a1M8738a;
        InterfaceC30063j interfaceC30063jM8722p;
        long jMo8681o0;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC30062i interfaceC30062i = C30058e.f122675w;
        InterfaceC30059f interfaceC30059f = (InterfaceC30059f) interfaceC30063j.get(interfaceC30062i);
        C30064k c30064k = C30064k.f122676w;
        if (interfaceC30059f == null) {
            abstractC2987a1M8738a = AbstractC3012g2.m8738a();
            interfaceC30063jM8722p = m8722p(c30064k, interfaceC30063j.plus(abstractC2987a1M8738a), true);
            C22365e c22365e = AbstractC3050q0.f12077a;
            if (interfaceC30063jM8722p != c22365e && interfaceC30063jM8722p.get(interfaceC30062i) == null) {
                interfaceC30063jM8722p = interfaceC30063jM8722p.plus(c22365e);
            }
        } else {
            if (interfaceC30059f instanceof AbstractC2987a1) {
            }
            abstractC2987a1M8738a = (AbstractC2987a1) AbstractC3012g2.f12029a.get();
            interfaceC30063jM8722p = m8722p(c30064k, interfaceC30063j, true);
            C22365e c22365e2 = AbstractC3050q0.f12077a;
            if (interfaceC30063jM8722p != c22365e2 && interfaceC30063jM8722p.get(interfaceC30062i) == null) {
                interfaceC30063jM8722p = interfaceC30063jM8722p.plus(c22365e2);
            }
        }
        C3005f c3005f = new C3005f(interfaceC30063jM8722p, threadCurrentThread, abstractC2987a1M8738a);
        c3005f.m8676b0(EnumC2998d0.f12004w, c3005f, interfaceC4351m);
        AbstractC2987a1 abstractC2987a1 = c3005f.f12013E;
        if (abstractC2987a1 != null) {
            int i13 = AbstractC2987a1.f11991z;
            abstractC2987a1.m8680b0(false);
        }
        while (true) {
            if (abstractC2987a1 != null) {
                try {
                    jMo8681o0 = abstractC2987a1.mo8681o0();
                } catch (Throwable th3) {
                    if (abstractC2987a1 != null) {
                        int i14 = AbstractC2987a1.f11991z;
                        abstractC2987a1.m8683s(false);
                    }
                    throw th3;
                }
            } else {
                jMo8681o0 = Long.MAX_VALUE;
            }
            if (c3005f.isCompleted()) {
                break;
            }
            LockSupport.parkNanos(c3005f, jMo8681o0);
            if (Thread.interrupted()) {
                c3005f.m8818o(new InterruptedException());
            }
        }
        if (abstractC2987a1 != null) {
            int i15 = AbstractC2987a1.f11991z;
            abstractC2987a1.m8683s(false);
        }
        Object objM8703I = m8703I(C3060t1.f12091w.get(c3005f));
        C3067w c3067w = objM8703I instanceof C3067w ? (C3067w) objM8703I : null;
        if (c3067w == null) {
            return objM8703I;
        }
        throw c3067w.f12104a;
    }

    /* JADX INFO: renamed from: G */
    public static Object m8701G(InterfaceC4339a interfaceC4339a, AbstractC32269c abstractC32269c) {
        return m8705K(C30064k.f122676w, new C0448q(interfaceC4339a, null, 4), abstractC32269c);
    }

    /* JADX INFO: renamed from: H */
    public static final String m8702H(InterfaceC30057d interfaceC30057d) {
        Object objM107888l;
        if (interfaceC30057d instanceof C17173f) {
            return ((C17173f) interfaceC30057d).toString();
        }
        try {
            objM107888l = interfaceC30057d + '@' + m8724r(interfaceC30057d);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        if (C23468n.m68037a(objM107888l) != null) {
            objM107888l = interfaceC30057d.getClass().getName() + '@' + m8724r(interfaceC30057d);
        }
        return (String) objM107888l;
    }

    /* JADX INFO: renamed from: I */
    public static final Object m8703I(Object obj) {
        InterfaceC3011g1 interfaceC3011g1;
        C3015h1 c3015h1 = obj instanceof C3015h1 ? (C3015h1) obj : null;
        return (c3015h1 == null || (interfaceC3011g1 = c3015h1.f12032a) == null) ? obj : interfaceC3011g1;
    }

    /* JADX INFO: renamed from: J */
    public static final C3036m2 m8704J(InterfaceC30057d interfaceC30057d, InterfaceC30063j interfaceC30063j, Object obj) {
        C3036m2 c3036m2 = null;
        if ((interfaceC30057d instanceof InterfaceC32270d) && interfaceC30063j.get(C3040n2.f12061w) != null) {
            InterfaceC32270d callerFrame = (InterfaceC32270d) interfaceC30057d;
            while (!(callerFrame instanceof C3038n0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof C3036m2) {
                    c3036m2 = (C3036m2) callerFrame;
                    break;
                }
            }
            if (c3036m2 != null) {
                c3036m2.m8790f0(interfaceC30063j, obj);
            }
        }
        return c3036m2;
    }

    /* JADX INFO: renamed from: K */
    public static final Object m8705K(InterfaceC30063j interfaceC30063j, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) throws Throwable {
        Object objM8703I;
        InterfaceC30063j context = interfaceC30057d.getContext();
        InterfaceC30063j interfaceC30063jPlus = !((Boolean) interfaceC30063j.fold(Boolean.FALSE, new C2741a(3))).booleanValue() ? context.plus(interfaceC30063j) : m8722p(context, interfaceC30063j, false);
        m8721o(interfaceC30063jPlus);
        if (interfaceC30063jPlus == context) {
            C17188u c17188u = new C17188u(interfaceC30063jPlus, interfaceC30057d);
            objM8703I = AbstractC12889b.m36266c0(c17188u, true, c17188u, interfaceC4351m);
        } else {
            C30058e c30058e = C30058e.f122675w;
            if (AbstractC22676k.m65745e(interfaceC30063jPlus.get(c30058e), context.get(c30058e))) {
                C3036m2 c3036m2 = new C3036m2(interfaceC30063jPlus, interfaceC30057d);
                InterfaceC30063j interfaceC30063j2 = c3036m2.f11989y;
                Object objM48487m = AbstractC17167b.m48487m(interfaceC30063j2, null);
                try {
                    Object objM36266c0 = AbstractC12889b.m36266c0(c3036m2, true, c3036m2, interfaceC4351m);
                    AbstractC17167b.m48480f(interfaceC30063j2, objM48487m);
                    objM8703I = objM36266c0;
                } catch (Throwable th3) {
                    AbstractC17167b.m48480f(interfaceC30063j2, objM48487m);
                    throw th3;
                }
            } else {
                C3038n0 c3038n0 = new C3038n0(interfaceC30063jPlus, interfaceC30057d);
                try {
                    AbstractC17167b.m48481g(C23454a0.f92919a, AbstractC15751g.m44424D(AbstractC15751g.m44463p(interfaceC4351m, c3038n0, c3038n0)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3038n0.f12059E;
                    do {
                        int i13 = atomicIntegerFieldUpdater.get(c3038n0);
                        if (i13 != 0) {
                            if (i13 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objM8703I = m8703I(C3060t1.f12091w.get(c3038n0));
                            if (objM8703I instanceof C3067w) {
                                throw ((C3067w) objM8703I).f12104a;
                            }
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(c3038n0, 0, 1));
                    objM8703I = EnumC31071a.f128113w;
                } catch (Throwable th4) {
                    th = th4;
                    if (th instanceof DispatchException) {
                        th = ((DispatchException) th).f89396w;
                    }
                    c3038n0.resumeWith(AbstractC34132o.m107888l(th));
                    throw th;
                }
            }
        }
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8703I;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: L */
    public static final Object m8706L(AbstractC32269c abstractC32269c) {
        Object obj;
        InterfaceC30063j context = abstractC32269c.getContext();
        m8721o(context);
        InterfaceC30057d interfaceC30057dM44424D = AbstractC15751g.m44424D(abstractC32269c);
        C17173f c17173f = interfaceC30057dM44424D instanceof C17173f ? (C17173f) interfaceC30057dM44424D : null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c17173f == null) {
            obj = c23454a0;
        } else {
            AbstractC3076z abstractC3076z = c17173f.f65977z;
            if (AbstractC17167b.m48483i(abstractC3076z, context)) {
                c17173f.f65975F = c23454a0;
                c17173f.f12064y = 1;
                abstractC3076z.dispatchYield(context, c17173f);
            } else {
                C3048p2 c3048p2 = new C3048p2(C3048p2.f12074x);
                InterfaceC30063j interfaceC30063jPlus = context.plus(c3048p2);
                c17173f.f65975F = c23454a0;
                c17173f.f12064y = 1;
                abstractC3076z.dispatchYield(interfaceC30063jPlus, c17173f);
                if (c3048p2.f12075w) {
                    AbstractC2987a1 abstractC2987a1M8738a = AbstractC3012g2.m8738a();
                    C25258m c25258m = abstractC2987a1M8738a.f11994y;
                    if (c25258m != null ? c25258m.isEmpty() : true) {
                        obj = c23454a0;
                    } else {
                        if (abstractC2987a1M8738a.f11992w >= 4294967296L) {
                            c17173f.f65975F = c23454a0;
                            c17173f.f12064y = 1;
                            abstractC2987a1M8738a.m8678T(c17173f);
                            obj = EnumC31071a.f128113w;
                        } else {
                            abstractC2987a1M8738a.m8680b0(true);
                            try {
                                c17173f.run();
                                do {
                                } while (abstractC2987a1M8738a.m8682p0());
                            } catch (Throwable th3) {
                                try {
                                    c17173f.m8792i(th3);
                                } catch (Throwable th4) {
                                    abstractC2987a1M8738a.m8683s(true);
                                    throw th4;
                                }
                            }
                            abstractC2987a1M8738a.m8683s(true);
                            obj = c23454a0;
                        }
                    }
                }
            }
            obj = EnumC31071a.f128113w;
        }
        return obj == EnumC31071a.f128113w ? obj : c23454a0;
    }

    /* JADX INFO: renamed from: a */
    public static C3058t m8707a() {
        return new C3058t(null);
    }

    /* JADX INFO: renamed from: b */
    public static final C17171d m8708b(InterfaceC30063j interfaceC30063j) {
        if (interfaceC30063j.get(C3023j1.f12041w) == null) {
            interfaceC30063j = interfaceC30063j.plus(m8709c());
        }
        return new C17171d(interfaceC30063j);
    }

    /* JADX INFO: renamed from: c */
    public static C3031l1 m8709c() {
        return new C3031l1(null);
    }

    /* JADX INFO: renamed from: d */
    public static C3004e2 m8710d() {
        return new C3004e2(null);
    }

    /* JADX INFO: renamed from: e */
    public static C3022j0 m8711e(InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j, InterfaceC4351m interfaceC4351m, int i13) {
        EnumC2998d0 enumC2998d0 = EnumC2998d0.f12005x;
        if ((i13 & 1) != 0) {
            interfaceC30063j = C30064k.f122676w;
        }
        EnumC2998d0 enumC2998d1 = (i13 & 2) != 0 ? EnumC2998d0.f12004w : enumC2998d0;
        InterfaceC30063j interfaceC30063jM8695A = m8695A(interfaceC2994c0, interfaceC30063j);
        C3022j0 c3063u1 = enumC2998d1 == enumC2998d0 ? new C3063u1(interfaceC30063jM8695A, interfaceC4351m) : new C3022j0(interfaceC30063jM8695A, true, true);
        c3063u1.m8676b0(enumC2998d1, c3063u1, interfaceC4351m);
        return c3063u1;
    }

    /* JADX INFO: renamed from: f */
    public static final Object m8712f(ArrayList arrayList, InterfaceC30057d interfaceC30057d) {
        return arrayList.isEmpty() ? C25271y.f99162w : new C3001e((InterfaceC3018i0[]) arrayList.toArray(new InterfaceC3018i0[0])).m8693a(interfaceC30057d);
    }

    /* JADX INFO: renamed from: g */
    public static final Object m8713g(InterfaceC3018i0[] interfaceC3018i0Arr, AbstractC32275i abstractC32275i) {
        return interfaceC3018i0Arr.length == 0 ? C25271y.f99162w : new C3001e(interfaceC3018i0Arr).m8693a(abstractC32275i);
    }

    /* JADX INFO: renamed from: h */
    public static final void m8714h(InterfaceC2994c0 interfaceC2994c0, CancellationException cancellationException) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC2994c0.getCoroutineContext().get(C3023j1.f12041w);
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC2994c0).toString());
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8715i(InterfaceC30063j interfaceC30063j, CancellationException cancellationException) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w);
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel(cancellationException);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Object m8716j(InterfaceC3027k1 interfaceC3027k1, AbstractC32269c abstractC32269c) {
        interfaceC3027k1.cancel((CancellationException) null);
        Object objJoin = interfaceC3027k1.join(abstractC32269c);
        return objJoin == EnumC31071a.f128113w ? objJoin : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static void m8717k(InterfaceC3027k1 interfaceC3027k1) {
        Iterator it = interfaceC3027k1.getChildren().iterator();
        while (it.hasNext()) {
            ((InterfaceC3027k1) it.next()).cancel((CancellationException) null);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m8718l(InterfaceC30063j interfaceC30063j) {
        InterfaceC38174i children;
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w);
        if (interfaceC3027k1 == null || (children = interfaceC3027k1.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((InterfaceC3027k1) it.next()).cancel((CancellationException) null);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Object m8719m(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        C17188u c17188u = new C17188u(interfaceC30057d.getContext(), interfaceC30057d);
        Object objM36266c0 = AbstractC12889b.m36266c0(c17188u, true, c17188u, interfaceC4351m);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM36266c0;
    }

    /* JADX INFO: renamed from: n */
    public static final void m8720n(InterfaceC2994c0 interfaceC2994c0) {
        m8721o(interfaceC2994c0.getCoroutineContext());
    }

    /* JADX INFO: renamed from: o */
    public static final void m8721o(InterfaceC30063j interfaceC30063j) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w);
        if (interfaceC3027k1 != null && !interfaceC3027k1.isActive()) {
            throw interfaceC3027k1.getCancellationException();
        }
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC30063j m8722p(InterfaceC30063j interfaceC30063j, InterfaceC30063j interfaceC30063j2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC30063j.fold(bool, new C2741a(3))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC30063j2.fold(bool, new C2741a(3))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC30063j.plus(interfaceC30063j2);
        }
        C2741a c2741a = new C2741a(4);
        C30064k c30064k = C30064k.f122676w;
        InterfaceC30063j interfaceC30063j3 = (InterfaceC30063j) interfaceC30063j.fold(c30064k, c2741a);
        Object objFold = interfaceC30063j2;
        if (zBooleanValue2) {
            objFold = interfaceC30063j2.fold(c30064k, new C2741a(5));
        }
        return interfaceC30063j3.plus((InterfaceC30063j) objFold);
    }

    /* JADX INFO: renamed from: q */
    public static final AbstractC3076z m8723q(Executor executor) {
        AbstractC3076z abstractC3076z;
        ExecutorC3046p0 executorC3046p0 = executor instanceof ExecutorC3046p0 ? (ExecutorC3046p0) executor : null;
        return (executorC3046p0 == null || (abstractC3076z = executorC3046p0.f12069w) == null) ? new C2999d1(executor) : abstractC3076z;
    }

    /* JADX INFO: renamed from: r */
    public static final String m8724r(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC3027k1 m8725s(InterfaceC30063j interfaceC30063j) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w);
        if (interfaceC3027k1 != null) {
            return interfaceC3027k1;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC30063j).toString());
    }

    /* JADX INFO: renamed from: t */
    public static final C3033m m8726t(InterfaceC30057d interfaceC30057d) {
        C3033m c3033m;
        C3033m c3033m2;
        if (!(interfaceC30057d instanceof C17173f)) {
            return new C3033m(1, interfaceC30057d);
        }
        C17173f c17173f = (C17173f) interfaceC30057d;
        C17191x c17191x = AbstractC17167b.f65958c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C17173f.f65973H;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c17173f);
            c3033m = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c17173f, c17191x);
                c3033m2 = null;
                break;
            }
            if (obj instanceof C3033m) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c17173f, obj, c17191x)) {
                        c3033m2 = (C3033m) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c17173f) == obj);
            } else if (obj != c17191x && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c3033m2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3033m.f12052G;
            Object obj2 = atomicReferenceFieldUpdater2.get(c3033m2);
            if (!(obj2 instanceof C3064v) || ((C3064v) obj2).f12098d == null) {
                C3033m.f12051F.set(c3033m2, 536870911);
                atomicReferenceFieldUpdater2.set(c3033m2, C2989b.f11995w);
                c3033m = c3033m2;
            } else {
                c3033m2.m8770o();
            }
            if (c3033m != null) {
                return c3033m;
            }
        }
        return new C3033m(2, interfaceC30057d);
    }

    /* JADX INFO: renamed from: u */
    public static final void m8727u(InterfaceC30063j interfaceC30063j, Throwable th3) {
        if (th3 instanceof DispatchException) {
            th3 = ((DispatchException) th3).f89396w;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC30063j.get(C2986a0.f11990w);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(interfaceC30063j, th3);
            } else {
                AbstractC12240d.m34049O(interfaceC30063j, th3);
            }
        } catch (Throwable th4) {
            if (th3 != th4) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th4);
                AbstractC29125c.m88530g(runtimeException, th3);
                th3 = runtimeException;
            }
            AbstractC12240d.m34049O(interfaceC30063j, th3);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC3056s0 m8728v(InterfaceC3027k1 interfaceC3027k1, boolean z4, AbstractC3035m1 abstractC3035m1) {
        if (interfaceC3027k1 instanceof C3060t1) {
            return ((C3060t1) interfaceC3027k1).m8805I(z4, abstractC3035m1);
        }
        return interfaceC3027k1.invokeOnCompletion(abstractC3035m1.mo8685i(), z4, new C1832u(1, abstractC3035m1, AbstractC3035m1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1));
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m8729w(InterfaceC2994c0 interfaceC2994c0) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC2994c0.getCoroutineContext().get(C3023j1.f12041w);
        if (interfaceC3027k1 != null) {
            return interfaceC3027k1.isActive();
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m8730x(InterfaceC30063j interfaceC30063j) {
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w);
        if (interfaceC3027k1 != null) {
            return interfaceC3027k1.isActive();
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static final C2996c2 m8731y(InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j, EnumC2998d0 enumC2998d0, InterfaceC4351m interfaceC4351m) {
        InterfaceC30063j interfaceC30063jM8695A = m8695A(interfaceC2994c0, interfaceC30063j);
        enumC2998d0.getClass();
        C2996c2 c3066v1 = enumC2998d0 == EnumC2998d0.f12005x ? new C3066v1(interfaceC30063jM8695A, interfaceC4351m) : new C2996c2(interfaceC30063jM8695A, true, true);
        c3066v1.m8676b0(enumC2998d0, c3066v1, interfaceC4351m);
        return c3066v1;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ C2996c2 m8732z(InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j, EnumC2998d0 enumC2998d0, InterfaceC4351m interfaceC4351m, int i13) {
        if ((i13 & 1) != 0) {
            interfaceC30063j = C30064k.f122676w;
        }
        if ((i13 & 2) != 0) {
            enumC2998d0 = EnumC2998d0.f12004w;
        }
        return m8731y(interfaceC2994c0, interfaceC30063j, enumC2998d0, interfaceC4351m);
    }
}
