package lc3;

import bc3.C3033m;
import bc3.InterfaceC3021j;
import bc3.InterfaceC3025k;
import bc3.InterfaceC3044o2;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import hc3.AbstractC17189v;
import hc3.C17191x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import l83.C23454a0;
import m83.AbstractC25265s;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lc3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C23836f implements InterfaceC3021j, InterfaceC23837g, InterfaceC3044o2 {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f94283F = AtomicReferenceFieldUpdater.newUpdater(C23836f.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f94285w;

    /* JADX INFO: renamed from: y */
    public Object f94287y;
    private volatile /* synthetic */ Object state$volatile = AbstractC23839i.f94290a;

    /* JADX INFO: renamed from: x */
    public ArrayList f94286x = new ArrayList(2);

    /* JADX INFO: renamed from: z */
    public int f94288z = -1;

    /* JADX INFO: renamed from: E */
    public Object f94284E = AbstractC23839i.f94293d;

    public C23836f(InterfaceC30063j interfaceC30063j) {
        this.f94285w = interfaceC30063j;
    }

    @Override // bc3.InterfaceC3021j
    /* JADX INFO: renamed from: a */
    public final void mo8688a(Throwable th3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94283F;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == AbstractC23839i.f94291b) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, AbstractC23839i.f94292c)) {
                    ArrayList arrayList = this.f94286x;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C23834d) it.next()).m70037a();
                    }
                    this.f94284E = AbstractC23839i.f94293d;
                    this.f94286x = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // bc3.InterfaceC3044o2
    /* JADX INFO: renamed from: b */
    public final void mo8762b(AbstractC17189v abstractC17189v, int i13) {
        this.f94287y = abstractC17189v;
        this.f94288z = i13;
    }

    /* JADX INFO: renamed from: c */
    public final Object m70038c(AbstractC32269c abstractC32269c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94283F;
        Object obj = atomicReferenceFieldUpdater.get(this);
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C23834d c23834d = (C23834d) obj;
        Object obj2 = this.f94284E;
        ArrayList<C23834d> arrayList = this.f94286x;
        if (arrayList != null) {
            for (C23834d c23834d2 : arrayList) {
                if (c23834d2 != c23834d) {
                    c23834d2.m70037a();
                }
            }
            atomicReferenceFieldUpdater.set(this, AbstractC23839i.f94291b);
            this.f94284E = AbstractC23839i.f94293d;
            this.f94286x = null;
        }
        Object objInvoke = c23834d.f94272c.invoke(c23834d.f94270a, c23834d.f94273d, obj2);
        InterfaceC30057d interfaceC30057d = c23834d.f94274e;
        return c23834d.f94273d == AbstractC23839i.f94294e ? ((Function1) interfaceC30057d).invoke(abstractC32269c) : ((InterfaceC4351m) interfaceC30057d).invoke(objInvoke, abstractC32269c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m70039d(AbstractC32269c abstractC32269c) throws DispatchException {
        C23835e c23835e;
        Object obj;
        C23836f c23836f;
        if (abstractC32269c instanceof C23835e) {
            c23835e = (C23835e) abstractC32269c;
            int i13 = c23835e.f94282z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23835e.f94282z = i13 - Integer.MIN_VALUE;
            } else {
                c23835e = new C23835e(this, abstractC32269c);
            }
        } else {
            c23835e = new C23835e(this, abstractC32269c);
        }
        Object obj2 = c23835e.f94280x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c23835e.f94282z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            c23835e.f94279w = this;
            c23835e.f94282z = 1;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c23835e));
            c3033m.m8774s();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94283F;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                obj = C23454a0.f92919a;
                C17191x c17191x = AbstractC23839i.f94290a;
                if (obj3 == c17191x) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c3033m)) {
                            c3033m.m8777v(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    if (!(obj3 instanceof List)) {
                        if (!(obj3 instanceof C23834d)) {
                            throw new IllegalStateException(("unexpected state: " + obj3).toString());
                        }
                        C23834d c23834d = (C23834d) obj3;
                        Object obj4 = this.f94284E;
                        Function3 function3 = c23834d.f94275f;
                        c3033m.mo8745g(obj, function3 != null ? (Function3) function3.invoke(this, c23834d.f94273d, obj4) : null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c17191x)) {
                            Iterator it = ((Iterable) obj3).iterator();
                            while (it.hasNext()) {
                                C23834d c23834dM70040e = m70040e(it.next());
                                AbstractC22676k.m65747g(c23834dM70040e);
                                c23834dM70040e.f94276g = null;
                                c23834dM70040e.f94277h = -1;
                                m70041f(c23834dM70040e, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                }
            }
            Object objM8773r = c3033m.m8773r();
            if (objM8773r == EnumC31071a.f128113w) {
                obj = objM8773r;
            }
            if (obj != enumC31071a) {
                c23836f = this;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj2);
            return obj2;
        }
        c23836f = c23835e.f94279w;
        AbstractC34132o.m107864I(obj2);
        c23835e.f94279w = null;
        c23835e.f94282z = 2;
        Object objM70038c = c23836f.m70038c(c23835e);
        return objM70038c == enumC31071a ? enumC31071a : objM70038c;
    }

    /* JADX INFO: renamed from: e */
    public final C23834d m70040e(Object obj) {
        ArrayList arrayList = this.f94286x;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((C23834d) obj3).f94270a == obj) {
                obj2 = obj3;
                break;
            }
        }
        C23834d c23834d = (C23834d) obj2;
        if (c23834d != null) {
            return c23834d;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: renamed from: f */
    public final void m70041f(C23834d c23834d, boolean z4) {
        Object obj = c23834d.f94270a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94283F;
        if (atomicReferenceFieldUpdater.get(this) instanceof C23834d) {
            return;
        }
        if (!z4) {
            ArrayList arrayList = this.f94286x;
            AbstractC22676k.m65747g(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C23834d) it.next()).f94270a == obj) {
                        throw new IllegalStateException(AbstractC25012a.m73375h(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        c23834d.f94271b.invoke(obj, this, c23834d.f94273d);
        if (this.f94284E != AbstractC23839i.f94293d) {
            atomicReferenceFieldUpdater.set(this, c23834d);
            return;
        }
        if (!z4) {
            ArrayList arrayList2 = this.f94286x;
            AbstractC22676k.m65747g(arrayList2);
            arrayList2.add(c23834d);
        }
        c23834d.f94276g = this.f94287y;
        c23834d.f94277h = this.f94288z;
        this.f94287y = null;
        this.f94288z = -1;
    }

    /* JADX INFO: renamed from: g */
    public final int m70042g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94283F;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC3025k)) {
                if (AbstractC22676k.m65745e(obj3, AbstractC23839i.f94291b) || (obj3 instanceof C23834d)) {
                    return 3;
                }
                if (AbstractC22676k.m65745e(obj3, AbstractC23839i.f94292c)) {
                    return 2;
                }
                if (AbstractC22676k.m65745e(obj3, AbstractC23839i.f94290a)) {
                    List listM118958J = AbstractC37056f.m118958J(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listM118958J)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListM74128f1)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            C23834d c23834dM70040e = m70040e(obj);
            if (c23834dM70040e != null) {
                Function3 function3 = c23834dM70040e.f94275f;
                Function3 function4 = function3 != null ? (Function3) function3.invoke(this, c23834dM70040e.f94273d, obj2) : null;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, c23834dM70040e)) {
                        InterfaceC3025k interfaceC3025k = (InterfaceC3025k) obj3;
                        this.f94284E = obj2;
                        C17191x c17191xMo8743c = interfaceC3025k.mo8743c(C23454a0.f92919a, function4);
                        if (c17191xMo8743c == null) {
                            this.f94284E = AbstractC23839i.f94293d;
                            return 2;
                        }
                        interfaceC3025k.mo8746n(c17191xMo8743c);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else {
                continue;
            }
        }
    }
}
