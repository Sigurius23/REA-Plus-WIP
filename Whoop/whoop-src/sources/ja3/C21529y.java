package ja3;

import cb3.AbstractC4393e;
import db3.C11889a;
import ga3.C15630h;
import ha3.C17062e;
import ha3.C17063f;
import hg3.AbstractC17269i;
import ia3.C18295a;
import ia3.C18297c;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import lb3.AbstractC23767d1;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.EnumC23761b1;
import m83.AbstractC25265s;
import m83.C25271y;
import mb3.C25395l;
import mb3.InterfaceC25387d;
import o93.AbstractC27736h;
import o93.AbstractC27746r;
import p005a3.C0237p;
import p547v8.AbstractC35785b;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import r93.C31161v0;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31110b1;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31151q0;
import se.AbstractC32417h;
import u93.C34689m0;
import u93.C34697q0;
import ub3.AbstractC34756j;
import va3.C35850h;
import x93.C38128t;
import x93.C38131w;
import ya3.AbstractC39363f;
import ya3.AbstractC39375r;

/* JADX INFO: renamed from: ja3.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C21529y implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82571w;

    /* JADX INFO: renamed from: x */
    public final AbstractC21500a0 f82572x;

    public /* synthetic */ C21529y(AbstractC21500a0 abstractC21500a0, int i13) {
        this.f82571w = i13;
        this.f82572x = abstractC21500a0;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01f0  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f82571w;
        AbstractC21500a0 abstractC21500a0 = this.f82572x;
        switch (i13) {
            case 0:
                C35850h name = (C35850h) obj;
                AbstractC22676k.m65750j(name, "name");
                AbstractC21500a0 abstractC21500a1 = abstractC21500a0.f82466c;
                if (abstractC21500a1 != null) {
                    return (Collection) abstractC21500a1.f82469f.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((InterfaceC21503c) abstractC21500a0.f82468e.invoke()).mo60464f(name).iterator();
                while (it.hasNext()) {
                    C17062e c17062eM60478m = abstractC21500a0.m60478m((C38131w) it.next());
                    if (abstractC21500a0.mo60476k(c17062eM60478m)) {
                        ((C18295a) abstractC21500a0.f82465b.f177224x).f71229g.getClass();
                        arrayList.add(c17062eM60478m);
                    }
                }
                abstractC21500a0.mo60469c(arrayList, name);
                return arrayList;
            case 1:
                C35850h name2 = (C35850h) obj;
                AbstractC22676k.m65750j(name2, "name");
                AbstractC21500a0 abstractC21500a2 = abstractC21500a0.f82466c;
                if (abstractC21500a2 != null) {
                    return (InterfaceC31145n0) abstractC21500a2.f82470g.invoke(name2);
                }
                C38128t c38128tMo60462d = ((InterfaceC21503c) abstractC21500a0.f82468e.invoke()).mo60462d(name2);
                if (c38128tMo60462d == null || c38128tMo60462d.m122117l()) {
                    return null;
                }
                C22669g0 c22669g0 = new C22669g0();
                boolean z4 = !c38128tMo60462d.m122123h();
                C41113q c41113q = abstractC21500a0.f82465b;
                C18297c c18297cM48897j0 = AbstractC17269i.m48897j0(c41113q, c38128tMo60462d);
                C18295a c18295a = (C18295a) c41113q.f177224x;
                InterfaceC31135k interfaceC31135kMo60475j = abstractC21500a0.mo60475j();
                C31161v0 c31161v0 = EnumC31106a0.f128309w;
                int i14 = 0;
                C17063f c17063fM48186R0 = C17063f.m48186R0(interfaceC31135kMo60475j, c18297cM48897j0, AbstractC32417h.m101190U(c38128tMo60462d.m122121f()), z4, c38128tMo60462d.m122119d(), c18295a.f71232j.m118692c(c38128tMo60462d), c38128tMo60462d.m122123h() && c38128tMo60462d.m122124i());
                c22669g0.f89336w = c17063fM48186R0;
                c17063fM48186R0.m109590N0(null, null, null, null);
                AbstractC23811y abstractC23811yM695Z = ((C0237p) c41113q.f177222E).m695Z(c38128tMo60462d.m122116k(), AbstractC35785b.m113400W(EnumC23761b1.f94124x, false, null, 7));
                if ((AbstractC27736h.m83805G(abstractC23811yM695Z) || AbstractC27736h.m83806H(abstractC23811yM695Z)) && c38128tMo60462d.m122123h()) {
                    c38128tMo60462d.m122124i();
                }
                C34689m0 c34689m0 = (C34689m0) c22669g0.f89336w;
                InterfaceC31151q0 interfaceC31151q0Mo60474i = abstractC21500a0.mo60474i();
                C25271y c25271y = C25271y.f99162w;
                c34689m0.m109592Q0(abstractC23811yM695Z, c25271y, interfaceC31151q0Mo60474i, null, c25271y);
                InterfaceC31135k interfaceC31135kMo60475j2 = abstractC21500a0.mo60475j();
                InterfaceC31117e interfaceC31117e = interfaceC31135kMo60475j2 instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31135kMo60475j2 : null;
                if (interfaceC31117e != null) {
                    c22669g0.f89336w = ((C11889a) c18295a.f71246x).m31923h(interfaceC31117e, (C34689m0) c22669g0.f89336w, c41113q);
                }
                Object obj2 = c22669g0.f89336w;
                InterfaceC31110b1 interfaceC31110b1 = (InterfaceC31110b1) obj2;
                AbstractC23811y type = ((C34689m0) obj2).getType();
                if (interfaceC31110b1 == null) {
                    AbstractC39363f.m125519a(65);
                    throw null;
                }
                if (type == null) {
                    AbstractC39363f.m125519a(66);
                    throw null;
                }
                int i15 = AbstractC39363f.f169413a;
                if (!interfaceC31110b1.mo78666A() && !AbstractC23791o.m69886e(type)) {
                    if (AbstractC23767d1.m69846b(type)) {
                        ((C34689m0) c22669g0.f89336w).m109591O0(null, new C21528x(abstractC21500a0, c38128tMo60462d, c22669g0, i14));
                    } else {
                        AbstractC27736h abstractC27736hM13807e = AbstractC4393e.m13807e(interfaceC31110b1);
                        if (AbstractC27736h.m83805G(type)) {
                            ((C34689m0) c22669g0.f89336w).m109591O0(null, new C21528x(abstractC21500a0, c38128tMo60462d, c22669g0, i14));
                        } else {
                            C25395l c25395l = InterfaceC25387d.f99472a;
                            if (c25395l.m74524a(abstractC27736hM13807e.m83832v(), type) || c25395l.m74524a(abstractC27736hM13807e.m83823k("Number").mo60594i(), type) || c25395l.m74524a(abstractC27736hM13807e.m83817e(), type) || AbstractC27746r.m83842c(type)) {
                                ((C34689m0) c22669g0.f89336w).m109591O0(null, new C21528x(abstractC21500a0, c38128tMo60462d, c22669g0, i14));
                            }
                        }
                    }
                }
                C15630h c15630h = c18295a.f71229g;
                InterfaceC31145n0 interfaceC31145n0 = (InterfaceC31145n0) c22669g0.f89336w;
                c15630h.getClass();
                if (interfaceC31145n0 != null) {
                    return (InterfaceC31145n0) c22669g0.f89336w;
                }
                Object[] objArr = new Object[3];
                switch (6) {
                    case 1:
                        objArr[0] = "member";
                        break;
                    case 2:
                    case 4:
                    case 6:
                    case 8:
                        objArr[0] = "descriptor";
                        break;
                    case 3:
                        objArr[0] = "element";
                        break;
                    case 5:
                        objArr[0] = "field";
                        break;
                    case 7:
                        objArr[0] = "javaClass";
                        break;
                    default:
                        objArr[0] = "fqName";
                        break;
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                switch (6) {
                    case 1:
                    case 2:
                        objArr[2] = "recordMethod";
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "recordConstructor";
                        break;
                    case 5:
                    case 6:
                        objArr[2] = "recordField";
                        break;
                    case 7:
                    case 8:
                        objArr[2] = "recordClass";
                        break;
                    default:
                        objArr[2] = "getClassResolvedFromSource";
                        break;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            case 2:
                C35850h name3 = (C35850h) obj;
                AbstractC22676k.m65750j(name3, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) abstractC21500a0.f82469f.invoke(name3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : linkedHashSet) {
                    String strM56347o = AbstractC20301a.m56347o((C34697q0) obj3, 2);
                    Object arrayList2 = linkedHashMap.get(strM56347o);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strM56347o, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionM125584e = AbstractC39375r.m125584e(list2, C21517m.f82533y);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionM125584e);
                    }
                }
                abstractC21500a0.mo60471f(linkedHashSet, name3);
                C41113q c41113q2 = abstractC21500a0.f82465b;
                return AbstractC25265s.m74093D1(((C18295a) c41113q2.f177224x).f71240r.m60615n(c41113q2, linkedHashSet));
            default:
                C35850h name4 = (C35850h) obj;
                AbstractC22676k.m65750j(name4, "name");
                ArrayList arrayList3 = new ArrayList();
                AbstractC34756j.m109751a(arrayList3, abstractC21500a0.f82470g.invoke(name4));
                abstractC21500a0.mo60472g(arrayList3, name4);
                InterfaceC31135k interfaceC31135kMo60475j3 = abstractC21500a0.mo60475j();
                int i16 = AbstractC39363f.f169413a;
                if (AbstractC39363f.m125530l(interfaceC31135kMo60475j3, EnumC31120f.f128325E)) {
                    return AbstractC25265s.m74093D1(arrayList3);
                }
                C41113q c41113q3 = abstractC21500a0.f82465b;
                return AbstractC25265s.m74093D1(((C18295a) c41113q3.f177224x).f71240r.m60615n(c41113q3, arrayList3));
        }
    }
}
