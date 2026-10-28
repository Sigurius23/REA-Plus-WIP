package tf;

import a30.C0332w0;
import ag.InterfaceC0852b;
import bc3.AbstractC3028k2;
import c93.InterfaceC4351m;
import cf.InterfaceC4526a;
import eg.C13166o;
import gg.InterfaceC15820g;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.C25271y;
import p091dg.C12002a;
import p459rf.C31341l;
import p485sf.C32429a;
import p485sf.C32433e;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34881i;
import p522uf.C34874e0;
import p522uf.C34876f0;
import p522uf.C34880h0;
import p522uf.C34882i0;
import p522uf.C34894u;
import p522uf.InterfaceC34878g0;
import p551vf.C35937b;
import p551vf.C35942g;
import p551vf.InterfaceC35936a;
import p647yf.InterfaceC39492e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32269c;
import s93.AbstractC32306h;
import wf.C37236a;

/* JADX INFO: renamed from: tf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C33759d implements InterfaceC0852b {

    /* JADX INFO: renamed from: a */
    public final C13166o f141271a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC15820g f141272b;

    /* JADX INFO: renamed from: c */
    public final C0332w0 f141273c;

    public C33759d(C13166o strategy, InterfaceC15820g policy, C0332w0 c0332w0) {
        AbstractC22676k.m65750j(strategy, "strategy");
        AbstractC22676k.m65750j(policy, "policy");
        this.f141271a = strategy;
        this.f141272b = policy;
        this.f141273c = c0332w0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0149 A[Catch: all -> 0x0109, TryCatch #3 {all -> 0x0109, blocks: (B:62:0x012d, B:64:0x0149, B:66:0x0151, B:70:0x015c, B:71:0x0162, B:67:0x0154, B:68:0x0159, B:69:0x015a, B:49:0x00e3, B:51:0x00f7, B:56:0x010b), top: B:112:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0151 A[Catch: all -> 0x0109, TryCatch #3 {all -> 0x0109, blocks: (B:62:0x012d, B:64:0x0149, B:66:0x0151, B:70:0x015c, B:71:0x0162, B:67:0x0154, B:68:0x0159, B:69:0x015a, B:49:0x00e3, B:51:0x00f7, B:56:0x010b), top: B:112:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0154 A[Catch: all -> 0x0109, TryCatch #3 {all -> 0x0109, blocks: (B:62:0x012d, B:64:0x0149, B:66:0x0151, B:70:0x015c, B:71:0x0162, B:67:0x0154, B:68:0x0159, B:69:0x015a, B:49:0x00e3, B:51:0x00f7, B:56:0x010b), top: B:112:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015a A[Catch: all -> 0x0109, TryCatch #3 {all -> 0x0109, blocks: (B:62:0x012d, B:64:0x0149, B:66:0x0151, B:70:0x015c, B:71:0x0162, B:67:0x0154, B:68:0x0159, B:69:0x015a, B:49:0x00e3, B:51:0x00f7, B:56:0x010b), top: B:112:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cc  */
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
    /* JADX INFO: renamed from: b */
    public static final Object m106726b(C33759d c33759d, C34894u c34894u, InterfaceC39492e interfaceC39492e, int i13, AbstractC32269c abstractC32269c) {
        C33758c c33758c;
        Object objM107888l;
        C31341l c31341l;
        Object objM864v;
        InterfaceC35936a httpRequest;
        Object obj;
        C37236a c37236a;
        Object obj2;
        C32429a c32429a;
        Iterator it;
        Object objM107888l2;
        Object objM107888l3;
        Throwable thM68037a;
        Throwable thM68037a2;
        InterfaceC34878g0 c34874e0;
        Duration duration;
        Object objM107888l4;
        InterfaceC4351m interfaceC4351m;
        C34894u c34894u2 = c34894u;
        int i14 = i13;
        C0332w0 c0332w0 = c33759d.f141273c;
        List list = (List) c0332w0.f1169y;
        if (abstractC32269c instanceof C33758c) {
            c33758c = (C33758c) abstractC32269c;
            int i15 = c33758c.f141266G;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c33758c.f141266G = i15 - Integer.MIN_VALUE;
            } else {
                c33758c = new C33758c(c33759d, abstractC32269c);
            }
        } else {
            c33758c = new C33758c(c33759d, abstractC32269c);
        }
        Object objM107888l5 = c33758c.f141264E;
        Object obj3 = EnumC31071a.f128113w;
        int i16 = c33758c.f141266G;
        Object obj4 = C23454a0.f92919a;
        boolean z4 = false;
        try {
            if (i16 != 0) {
                if (i16 == 1) {
                    int i17 = c33758c.f141270z;
                    C34894u c34894u3 = c33758c.f141267w;
                    try {
                        AbstractC34132o.m107864I(objM107888l5);
                        i14 = i17;
                        c34894u2 = c34894u3;
                    } catch (Throwable th3) {
                        th = th3;
                        i14 = i17;
                        c34894u2 = c34894u3;
                        objM107888l5 = AbstractC34132o.m107888l(th);
                    }
                    objM107888l = objM107888l5;
                } else if (i16 == 2) {
                    int i18 = c33758c.f141270z;
                    duration = (Duration) c33758c.f141269y;
                    InterfaceC34878g0 interfaceC34878g0 = (InterfaceC34878g0) c33758c.f141268x;
                    C34894u c34894u4 = c33758c.f141267w;
                    try {
                        AbstractC34132o.m107864I(objM107888l5);
                        i14 = i18;
                        c34894u2 = c34894u4;
                    } catch (TimeoutCancellationException e5) {
                        e = e5;
                        c34874e0 = interfaceC34878g0;
                        String str = c34874e0.getDescription() + " exceeded configured timeout of " + duration;
                        if (!(c34874e0 instanceof C34874e0)) {
                            interfaceC4351m = C34880h0.f146912w;
                        } else {
                            if (c34874e0.equals(C34876f0.f146906a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            interfaceC4351m = C34882i0.f146923w;
                        }
                        throw ((Throwable) interfaceC4351m.invoke(str, e));
                    } catch (Throwable th4) {
                        th = th4;
                        i14 = i18;
                        c34894u2 = c34894u4;
                        objM107888l5 = AbstractC34132o.m107888l(th);
                    }
                    objM107888l = objM107888l5;
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC35936a interfaceC35936a = (InterfaceC35936a) c33758c.f141269y;
                    c31341l = (C31341l) c33758c.f141268x;
                    AbstractC34132o.m107864I(objM107888l5);
                    objM864v = ((C23468n) objM107888l5).f92940w;
                    httpRequest = interfaceC35936a;
                }
                obj = objM864v;
                c37236a = c31341l != null ? c31341l.f128964x : null;
                AbstractC22676k.m65750j(httpRequest, "httpRequest");
                obj2 = c0332w0.f1164E;
                if (obj2 != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                c0332w0.f1166G = c37236a;
                c32429a = new C32429a(obj2, obj, httpRequest, c37236a, (C12002a) c0332w0.f1168x);
                it = list.iterator();
                objM107888l2 = obj4;
                while (it.hasNext()) {
                    try {
                        ((InterfaceC4526a) it.next()).mo14177k(c32429a);
                        objM107888l3 = obj4;
                    } catch (Throwable th5) {
                        objM107888l3 = AbstractC34132o.m107888l(th5);
                    }
                    thM68037a = C23468n.m68037a(objM107888l3);
                    if (thM68037a == null) {
                    } else {
                        thM68037a2 = C23468n.m68037a(objM107888l2);
                        if (thM68037a2 != null) {
                            AbstractC29125c.m88530g(thM68037a, thM68037a2);
                        }
                        objM107888l2 = AbstractC34132o.m107888l(thM68037a);
                    }
                }
                AbstractC34132o.m107864I(objM107888l2);
                return obj;
            }
            AbstractC34132o.m107864I(objM107888l5);
            C35942g c35942gM100570s = AbstractC32306h.m100570s((C35937b) c34894u2.f146959b);
            c0332w0.f1166G = null;
            Object obj5 = c0332w0.f1164E;
            if (obj5 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C32433e c32433e = new C32433e(obj5, c35942gM100570s, (C12002a) c0332w0.f1168x);
            Iterator it3 = list.iterator();
            objM107888l = obj4;
            while (it3.hasNext()) {
                try {
                    ((InterfaceC4526a) it3.next()).mo14168b(c32433e);
                    objM107888l4 = obj4;
                } catch (Throwable th6) {
                    objM107888l4 = AbstractC34132o.m107888l(th6);
                }
                Throwable thM68037a3 = C23468n.m68037a(objM107888l4);
                if (thM68037a3 == null) {
                } else {
                    Throwable thM68037a4 = C23468n.m68037a(objM107888l);
                    if (thM68037a4 != null) {
                        AbstractC29125c.m88530g(thM68037a3, thM68037a4);
                    }
                    objM107888l = AbstractC34132o.m107888l(thM68037a3);
                }
            }
            if (!(objM107888l instanceof C23467m)) {
                Duration duration2 = (Duration) c34894u2.f146958a.mo33082b(AbstractC34881i.f146913a);
                c34874e0 = new C34874e0(i14);
                if (duration2 == null) {
                    c33758c.f141267w = c34894u2;
                    c33758c.f141268x = null;
                    c33758c.f141269y = null;
                    c33758c.f141270z = i14;
                    c33758c.f141266G = 1;
                    objM107888l5 = interfaceC39492e.mo2061a(c34894u2, c33758c);
                    if (objM107888l5 == obj3) {
                        return obj3;
                    }
                } else {
                    try {
                        long rawValue = duration2.getRawValue();
                        C32139c0 c32139c0 = new C32139c0((InterfaceC30057d) (z4 ? 1 : 0), interfaceC39492e, c34894u2, 11);
                        c33758c.f141267w = c34894u2;
                        c33758c.f141268x = c34874e0;
                        c33758c.f141269y = duration2;
                        c33758c.f141270z = i14;
                        c33758c.f141266G = 2;
                        objM107888l5 = AbstractC3028k2.m8749c(rawValue, c32139c0, c33758c);
                        if (objM107888l5 == obj3) {
                            return obj3;
                        }
                    } catch (TimeoutCancellationException e13) {
                        e = e13;
                        duration = duration2;
                        String str2 = c34874e0.getDescription() + " exceeded configured timeout of " + duration;
                        if (!(c34874e0 instanceof C34874e0)) {
                            interfaceC4351m = C34880h0.f146912w;
                        } else {
                            if (c34874e0.equals(C34876f0.f146906a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            interfaceC4351m = C34882i0.f146923w;
                        }
                        throw ((Throwable) interfaceC4351m.invoke(str2, e));
                    }
                }
                objM107888l = objM107888l5;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        List list2 = (List) c34894u2.f146958a.mo33082b(AbstractC34881i.f146916d);
        if (list2 == null) {
            list2 = C25271y.f99162w;
        }
        c31341l = (C31341l) AbstractC25265s.m74102I0(i14 - 1, list2);
        C35942g c35942gM100570s2 = AbstractC32306h.m100570s((C35937b) c34894u2.f146959b);
        C37236a c37236a2 = c31341l != null ? c31341l.f128964x : null;
        c33758c.f141267w = null;
        c33758c.f141268x = c31341l;
        c33758c.f141269y = c35942gM100570s2;
        c33758c.f141270z = i14;
        c33758c.f141266G = 3;
        objM864v = c0332w0.m864v(objM107888l, c35942gM100570s2, c37236a2, c33758c);
        httpRequest = c35942gM100570s2;
        if (objM864v == obj3) {
            return obj3;
        }
        obj = objM864v;
        if (c31341l != null) {
        }
        AbstractC22676k.m65750j(httpRequest, "httpRequest");
        obj2 = c0332w0.f1164E;
        if (obj2 != null) {
            throw new IllegalStateException("Required value was null.");
        }
        c0332w0.f1166G = c37236a;
        c32429a = new C32429a(obj2, obj, httpRequest, c37236a, (C12002a) c0332w0.f1168x);
        it = list.iterator();
        objM107888l2 = obj4;
        while (it.hasNext()) {
            ((InterfaceC4526a) it.next()).mo14177k(c32429a);
            objM107888l3 = obj4;
            thM68037a = C23468n.m68037a(objM107888l3);
            if (thM68037a == null) {
            } else {
                thM68037a2 = C23468n.m68037a(objM107888l2);
                if (thM68037a2 != null) {
                    AbstractC29125c.m88530g(thM68037a, thM68037a2);
                }
                objM107888l2 = AbstractC34132o.m107888l(thM68037a);
            }
        }
        AbstractC34132o.m107864I(objM107888l2);
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0184 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:15:0x0033, B:72:0x0180, B:74:0x0184, B:76:0x0194, B:75:0x018c), top: B:81:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x018c A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:15:0x0033, B:72:0x0180, B:74:0x0184, B:76:0x0194, B:75:0x018c), top: B:81:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (r1 == r8) goto L67;
     */
    @Override // ag.InterfaceC0852b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2062a(p522uf.C34894u r14, p647yf.InterfaceC39492e r15, q83.InterfaceC30057d r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tf.C33759d.mo2062a(uf.u, yf.e, q83.d):java.lang.Object");
    }
}
