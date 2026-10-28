package mb3;

import ab3.C0723o;
import ab3.EnumC0722n;
import androidx.room.C1836v0;
import c93.InterfaceC4351m;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.C23765d;
import lb3.C23774g;
import lb3.C23784k0;
import lb3.C23809x;
import lb3.InterfaceC23796q0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import nb3.C26555l;
import nb3.EnumC26551h;
import p097ds.AbstractC12313p;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import ub3.AbstractC34756j;

/* JADX INFO: renamed from: mb3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C25403t {

    /* JADX INFO: renamed from: a */
    public static final C25403t f99500a = new C25403t();

    /* JADX INFO: renamed from: a */
    public static ArrayList m74591a(AbstractCollection abstractCollection, InterfaceC4351m interfaceC4351m) {
        ArrayList<AbstractC23763c0> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (it.hasNext()) {
            AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) it.next();
            if (!arrayList.isEmpty()) {
                for (AbstractC23763c0 abstractC23763c1 : arrayList) {
                    if (abstractC23763c1 != abstractC23763c0) {
                        AbstractC22676k.m65747g(abstractC23763c1);
                        AbstractC22676k.m65747g(abstractC23763c0);
                        if (((Boolean) interfaceC4351m.invoke(abstractC23763c1, abstractC23763c0)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [lb3.k0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, lb3.k0, rb3.d] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v18, types: [lb3.c0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, lb3.c0, lb3.y] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX INFO: renamed from: b */
    public final AbstractC23763c0 m74592b(ArrayList arrayList) {
        AbstractC23763c0 abstractC23763c0;
        AbstractC23763c0 abstractC23763c0M69912a;
        arrayList.size();
        ArrayList<AbstractC23763c0> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC23763c0 abstractC23763c1 = (AbstractC23763c0) it.next();
            if (abstractC23763c1.mo69844i0() instanceof C23809x) {
                Collection supertypes = abstractC23763c1.mo69844i0().getSupertypes();
                AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
                Collection<AbstractC23811y> collection = supertypes;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(collection, 10));
                for (AbstractC23811y abstractC23811y : collection) {
                    AbstractC22676k.m65747g(abstractC23811y);
                    AbstractC23763c0 abstractC23763c0M34288g0 = AbstractC12313p.m34288g0(abstractC23811y);
                    if (abstractC23763c1.mo69814k0()) {
                        abstractC23763c0M34288g0 = abstractC23763c0M34288g0.mo64125r0(true);
                    }
                    arrayList3.add(abstractC23763c0M34288g0);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(abstractC23763c1);
            }
        }
        EnumC25402s enumC25402sMo74589a = EnumC25402s.f99496w;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            enumC25402sMo74589a = enumC25402sMo74589a.mo74589a((AbstractC23773f1) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC23763c0 abstractC23763c0Mo64125r0 : arrayList2) {
            if (enumC25402sMo74589a == EnumC25402s.f99499z) {
                if (abstractC23763c0Mo64125r0 instanceof C25391h) {
                    C25391h c25391h = (C25391h) abstractC23763c0Mo64125r0;
                    abstractC23763c0Mo64125r0 = new C25391h(c25391h.f99479x, c25391h.f99480y, c25391h.f99481z, c25391h.f99476E, c25391h.f99477F, true);
                }
                AbstractC22676k.m65750j(abstractC23763c0Mo64125r0, "<this>");
                AbstractC23763c0 abstractC23763c0M69839m = C23765d.m69839m(abstractC23763c0Mo64125r0, false);
                abstractC23763c0Mo64125r0 = (abstractC23763c0M69839m == null && (abstractC23763c0M69839m = AbstractC23791o.m69888g(abstractC23763c0Mo64125r0)) == null) ? abstractC23763c0Mo64125r0.mo64125r0(false) : abstractC23763c0M69839m;
            }
            linkedHashSet.add(abstractC23763c0Mo64125r0);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((AbstractC23763c0) it4.next()).mo69843Y());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (true) {
            abstractC23763c0 = null;
            if (!it5.hasNext()) {
                break;
            }
            C23784k0 other = (C23784k0) it5.next();
            next = (C23784k0) next;
            next.getClass();
            C37199o c37199o = C23784k0.f94165x;
            AbstractC22676k.m65750j(other, "other");
            if (!next.isEmpty() || !other.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) c37199o.f159040w).values();
                AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    C23774g c23774g = (C23774g) next.f128521w.get(iIntValue);
                    C23774g c23774g2 = (C23774g) other.f128521w.get(iIntValue);
                    AbstractC34756j.m109751a(arrayList5, c23774g == null ? c23774g2 != null ? c23774g2.m69866c(c23774g) : null : c23774g.m69866c(c23774g2));
                }
                next = C37199o.m119197l(arrayList5);
            }
        }
        C23784k0 c23784k0 = (C23784k0) next;
        if (linkedHashSet.size() == 1) {
            abstractC23763c0M69912a = (AbstractC23763c0) AbstractC25265s.m74140o1(linkedHashSet);
        } else {
            ArrayList arrayListM74591a = m74591a(linkedHashSet, new C1836v0(2, this, C25403t.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 10));
            arrayListM74591a.isEmpty();
            EnumC0722n[] enumC0722nArr = EnumC0722n.f2701w;
            if (!arrayListM74591a.isEmpty()) {
                Iterator it7 = arrayListM74591a.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next2 = it7.next();
                while (it7.hasNext()) {
                    AbstractC23763c0 abstractC23763c2 = (AbstractC23763c0) it7.next();
                    next2 = (AbstractC23763c0) next2;
                    if (next2 != 0 && abstractC23763c2 != null) {
                        InterfaceC23796q0 interfaceC23796q0Mo69844i0 = next2.mo69844i0();
                        InterfaceC23796q0 interfaceC23796q0Mo69844i1 = abstractC23763c2.mo69844i0();
                        boolean z4 = interfaceC23796q0Mo69844i0 instanceof C0723o;
                        if (z4 && (interfaceC23796q0Mo69844i1 instanceof C0723o)) {
                            Set set = ((C0723o) interfaceC23796q0Mo69844i0).f2702w;
                            Set other2 = ((C0723o) interfaceC23796q0Mo69844i1).f2702w;
                            AbstractC22676k.m65750j(set, "<this>");
                            AbstractC22676k.m65750j(other2, "other");
                            Set setM74101H1 = AbstractC25265s.m74101H1(set);
                            AbstractC25265s.m74141p0(setM74101H1, other2);
                            C0723o c0723o = new C0723o(setM74101H1);
                            C23784k0.f94165x.getClass();
                            C23784k0 attributes = C23784k0.f94166y;
                            AbstractC22676k.m65750j(attributes, "attributes");
                            next2 = AbstractC23791o.m69892k(C25271y.f99162w, C26555l.m78680a(EnumC26551h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), attributes, c0723o, false);
                        } else if (z4) {
                            if (((C0723o) interfaceC23796q0Mo69844i0).f2702w.contains(abstractC23763c2)) {
                                next2 = abstractC23763c2;
                            }
                        } else if (!(interfaceC23796q0Mo69844i1 instanceof C0723o) || !((C0723o) interfaceC23796q0Mo69844i1).f2702w.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                abstractC23763c0 = (AbstractC23763c0) next2;
            }
            if (abstractC23763c0 != null) {
                abstractC23763c0M69912a = abstractC23763c0;
            } else {
                InterfaceC25394k.f99489b.getClass();
                ArrayList arrayListM74591a2 = m74591a(arrayListM74591a, new C1836v0(2, C25393j.f99488b, C25395l.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 11));
                arrayListM74591a2.isEmpty();
                abstractC23763c0M69912a = arrayListM74591a2.size() < 2 ? (AbstractC23763c0) AbstractC25265s.m74140o1(arrayListM74591a2) : new C23809x(linkedHashSet).m69912a();
            }
        }
        return abstractC23763c0M69912a.mo64127t0(c23784k0);
    }
}
