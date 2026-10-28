package lb3;

import a00.C0072g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jb3.C21561u;
import m83.AbstractC25267u;
import nb3.C26555l;
import nb3.EnumC26554k;
import p108e4.AbstractC12667a;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import pb3.C29061a;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31163w0;
import r93.InterfaceC31165x0;
import s93.InterfaceC32300b;
import s93.InterfaceC32307i;
import se.AbstractC32410a;
import u93.AbstractC34676g;
import u93.AbstractC34690n;
import u93.C34674f;
import ub3.AbstractC34756j;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lb3.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C23782j0 {
    /* JADX INFO: renamed from: a */
    public final void m69876a(InterfaceC32307i interfaceC32307i, InterfaceC32307i interfaceC32307i2) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC32307i.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC32300b) it.next()).mo43953b());
        }
        Iterator it3 = interfaceC32307i2.iterator();
        while (it3.hasNext()) {
            hashSet.contains(((InterfaceC32300b) it3.next()).mo43953b());
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC23763c0 m69877b(C0072g c0072g, C23784k0 attributes) {
        AbstractC22676k.m65750j(attributes, "attributes");
        return m69878c(c0072g, attributes, false, 0, true);
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC23763c0 m69878c(C0072g c0072g, C23784k0 c23784k0, boolean z4, int i13, boolean z13) {
        C23784k0 c23784k0M119197l;
        C23774g c23774gM69865a;
        EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
        InterfaceC31163w0 interfaceC31163w0 = (InterfaceC31163w0) c0072g.f224y;
        AbstractC23804u0 abstractC23804u0M69879d = m69879d(new C23806v0(((C21561u) interfaceC31163w0).m60591L0(), enumC23776g1), c0072g, null, i13);
        AbstractC23811y abstractC23811yMo69868b = abstractC23804u0M69879d.mo69868b();
        AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
        AbstractC23763c0 abstractC23763c0M101050t = AbstractC32410a.m101050t(abstractC23811yMo69868b);
        if (AbstractC23791o.m69886e(abstractC23763c0M101050t)) {
            return abstractC23763c0M101050t;
        }
        abstractC23804u0M69879d.mo69867a();
        m69876a(abstractC23763c0M101050t.getAnnotations(), AbstractC23777h.m69871a(c23784k0));
        if (!AbstractC23791o.m69886e(abstractC23763c0M101050t)) {
            if (AbstractC23791o.m69886e(abstractC23763c0M101050t)) {
                c23784k0M119197l = abstractC23763c0M101050t.mo69843Y();
            } else {
                C23784k0 other = abstractC23763c0M101050t.mo69843Y();
                C37199o c37199o = C23784k0.f94165x;
                AbstractC22676k.m65750j(other, "other");
                if (c23784k0.isEmpty() && other.isEmpty()) {
                    c23784k0M119197l = c23784k0;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) c37199o.f159040w).values();
                    AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C23774g c23774g = (C23774g) c23784k0.f128521w.get(iIntValue);
                        C23774g c23774g2 = (C23774g) other.f128521w.get(iIntValue);
                        if (c23774g == null) {
                            c23774gM69865a = c23774g2 != null ? c23774g2.m69865a(c23774g) : null;
                        } else {
                            c23774gM69865a = c23774g.m69865a(c23774g2);
                        }
                        AbstractC34756j.m109751a(arrayList, c23774gM69865a);
                    }
                    c23784k0M119197l = C37199o.m119197l(arrayList);
                }
            }
            abstractC23763c0M101050t = AbstractC32410a.m101015X(abstractC23763c0M101050t, null, c23784k0M119197l, 1);
        }
        AbstractC23763c0 abstractC23763c0M69853i = AbstractC23767d1.m69853i(abstractC23763c0M101050t, z4);
        if (!z13) {
            return abstractC23763c0M69853i;
        }
        C34674f c34674f = ((AbstractC34676g) interfaceC31163w0).f146066I;
        AbstractC22676k.m65749i(c34674f, "getTypeConstructor(...)");
        return AbstractC23791o.m69896o(abstractC23763c0M69853i, AbstractC23791o.m69892k((List) c0072g.f225z, C22711n.f89378b, c23784k0, c34674f, z4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final AbstractC23804u0 m69879d(AbstractC23804u0 abstractC23804u0, C0072g c0072g, InterfaceC31165x0 interfaceC31165x0, int i13) {
        EnumC23776g1 variance;
        EnumC23776g1 enumC23776g1;
        EnumC23776g1 enumC23776g2;
        InterfaceC31135k interfaceC31135k = (InterfaceC31163w0) c0072g.f224y;
        if (i13 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((AbstractC34690n) interfaceC31135k).getName());
        }
        if (abstractC23804u0.mo69869c()) {
            AbstractC22676k.m65747g(interfaceC31165x0);
            return AbstractC23767d1.m69854j(interfaceC31165x0);
        }
        AbstractC23811y abstractC23811yMo69868b = abstractC23804u0.mo69868b();
        AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
        InterfaceC23796q0 constructor = abstractC23811yMo69868b.mo69844i0();
        AbstractC22676k.m65750j(constructor, "constructor");
        InterfaceC31126h interfaceC31126hMo1784d = constructor.mo1784d();
        AbstractC23804u0 abstractC23804u1 = interfaceC31126hMo1784d instanceof InterfaceC31165x0 ? (AbstractC23804u0) ((Map) c0072g.f221E).get(interfaceC31126hMo1784d) : null;
        if (abstractC23804u1 != null) {
            if (abstractC23804u1.mo69869c()) {
                AbstractC22676k.m65747g(interfaceC31165x0);
                return AbstractC23767d1.m69854j(interfaceC31165x0);
            }
            AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23804u1.mo69868b().mo69863p0();
            EnumC23776g1 enumC23776g1Mo69867a = abstractC23804u1.mo69867a();
            AbstractC22676k.m65749i(enumC23776g1Mo69867a, "getProjectionKind(...)");
            EnumC23776g1 enumC23776g1Mo69867a2 = abstractC23804u0.mo69867a();
            AbstractC22676k.m65749i(enumC23776g1Mo69867a2, "getProjectionKind(...)");
            if (enumC23776g1Mo69867a2 != enumC23776g1Mo69867a && enumC23776g1Mo69867a2 != (enumC23776g2 = EnumC23776g1.INVARIANT) && enumC23776g1Mo69867a == enumC23776g2) {
                enumC23776g1Mo69867a = enumC23776g1Mo69867a2;
            }
            if (interfaceC31165x0 == null || (variance = interfaceC31165x0.getVariance()) == null) {
                variance = EnumC23776g1.INVARIANT;
            }
            if (variance != enumC23776g1Mo69867a && variance != (enumC23776g1 = EnumC23776g1.INVARIANT) && enumC23776g1Mo69867a == enumC23776g1) {
                enumC23776g1Mo69867a = enumC23776g1;
            }
            m69876a(abstractC23811yMo69868b.getAnnotations(), abstractC23773f1Mo69863p0.getAnnotations());
            AbstractC23763c0 abstractC23763c0M69853i = AbstractC23767d1.m69853i(AbstractC32410a.m101050t(abstractC23773f1Mo69863p0), abstractC23811yMo69868b.mo69814k0());
            C23784k0 c23784k0Mo69843Y = abstractC23811yMo69868b.mo69843Y();
            if (!AbstractC23791o.m69886e(abstractC23763c0M69853i)) {
                if (AbstractC23791o.m69886e(abstractC23763c0M69853i)) {
                    c23784k0Mo69843Y = abstractC23763c0M69853i.mo69843Y();
                } else {
                    C23784k0 other = abstractC23763c0M69853i.mo69843Y();
                    c23784k0Mo69843Y.getClass();
                    C37199o c37199o = C23784k0.f94165x;
                    AbstractC22676k.m65750j(other, "other");
                    if (!c23784k0Mo69843Y.isEmpty() || !other.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Collection collectionValues = ((ConcurrentHashMap) c37199o.f159040w).values();
                        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            C23774g c23774g = (C23774g) c23784k0Mo69843Y.f128521w.get(iIntValue);
                            C23774g c23774g2 = (C23774g) other.f128521w.get(iIntValue);
                            AbstractC34756j.m109751a(arrayList, c23774g == null ? c23774g2 != null ? c23774g2.m69865a(c23774g) : null : c23774g.m69865a(c23774g2));
                        }
                        c23784k0Mo69843Y = C37199o.m119197l(arrayList);
                    }
                }
                abstractC23763c0M69853i = AbstractC32410a.m101015X(abstractC23763c0M69853i, null, c23784k0Mo69843Y, 1);
            }
            return new C23806v0(abstractC23763c0M69853i, enumC23776g1Mo69867a);
        }
        AbstractC23763c0 abstractC23763c0M101050t = AbstractC32410a.m101050t(abstractC23804u0.mo69868b().mo69863p0());
        if (!AbstractC23791o.m69886e(abstractC23763c0M101050t) && AbstractC23767d1.m69847c(abstractC23763c0M101050t, C29061a.f117586y, null)) {
            InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23763c0M101050t.mo69844i0();
            InterfaceC31126h interfaceC31126hMo1784d2 = interfaceC23796q0Mo69844i0.mo1784d();
            interfaceC23796q0Mo69844i0.getParameters().size();
            abstractC23763c0M101050t.mo69842X().size();
            if (!(interfaceC31126hMo1784d2 instanceof InterfaceC31165x0)) {
                int i14 = 0;
                if (!(interfaceC31126hMo1784d2 instanceof InterfaceC31163w0)) {
                    AbstractC23763c0 abstractC23763c0M69880e = m69880e(abstractC23763c0M101050t, c0072g, i13);
                    C23758a1.m69818d(abstractC23763c0M69880e);
                    for (Object obj : abstractC23763c0M69880e.mo69842X()) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        AbstractC23804u0 abstractC23804u2 = (AbstractC23804u0) obj;
                        if (!abstractC23804u2.mo69869c()) {
                            AbstractC23811y abstractC23811yMo69868b2 = abstractC23804u2.mo69868b();
                            AbstractC22676k.m65749i(abstractC23811yMo69868b2, "getType(...)");
                            if (!AbstractC23767d1.m69847c(abstractC23811yMo69868b2, C29061a.f117585x, null)) {
                            }
                        }
                        i14 = i15;
                    }
                    return new C23806v0(abstractC23763c0M69880e, abstractC23804u0.mo69867a());
                }
                InterfaceC31163w0 interfaceC31163w0 = (InterfaceC31163w0) interfaceC31126hMo1784d2;
                if (c0072g.m203u(interfaceC31163w0)) {
                    EnumC23776g1 enumC23776g3 = EnumC23776g1.INVARIANT;
                    EnumC26554k enumC26554k = EnumC26554k.RECURSIVE_TYPE_ALIAS;
                    String str = ((AbstractC34690n) interfaceC31163w0).getName().f152620w;
                    AbstractC22676k.m65749i(str, "toString(...)");
                    return new C23806v0(C26555l.m78682c(enumC26554k, str), enumC23776g3);
                }
                List listMo69842X = abstractC23763c0M101050t.mo69842X();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listMo69842X, 10));
                for (Object obj2 : listMo69842X) {
                    int i16 = i14 + 1;
                    if (i14 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    arrayList2.add(m69879d((AbstractC23804u0) obj2, c0072g, (InterfaceC31165x0) interfaceC23796q0Mo69844i0.getParameters().get(i14), i13 + 1));
                    i14 = i16;
                }
                return new C23806v0(AbstractC23791o.m69896o(m69878c(AbstractC12667a.m35466r(c0072g, interfaceC31163w0, arrayList2), abstractC23763c0M101050t.mo69843Y(), abstractC23763c0M101050t.mo69814k0(), i13 + 1, false), m69880e(abstractC23763c0M101050t, c0072g, i13)), abstractC23804u0.mo69867a());
            }
        }
        return abstractC23804u0;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC23763c0 m69880e(AbstractC23763c0 abstractC23763c0, C0072g c0072g, int i13) {
        InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23763c0.mo69844i0();
        List listMo69842X = abstractC23763c0.mo69842X();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listMo69842X, 10));
        int i14 = 0;
        for (Object obj : listMo69842X) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            AbstractC23804u0 abstractC23804u0 = (AbstractC23804u0) obj;
            AbstractC23804u0 abstractC23804u0M69879d = m69879d(abstractC23804u0, c0072g, (InterfaceC31165x0) interfaceC23796q0Mo69844i0.getParameters().get(i14), i13 + 1);
            if (!abstractC23804u0M69879d.mo69869c()) {
                abstractC23804u0M69879d = new C23806v0(AbstractC23767d1.m69852h(abstractC23804u0M69879d.mo69868b(), abstractC23804u0.mo69868b().mo69814k0()), abstractC23804u0M69879d.mo69867a());
            }
            arrayList.add(abstractC23804u0M69879d);
            i14 = i15;
        }
        return AbstractC32410a.m101015X(abstractC23763c0, arrayList, null, 2);
    }
}
