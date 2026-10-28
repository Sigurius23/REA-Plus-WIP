package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import bg.C3215j;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22343l;
import kb3.InterfaceC22345n;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import m83.C25271y;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31162w;
import u93.AbstractC34666b;
import u93.AbstractC34690n;
import u93.C34697q0;
import ub3.AbstractC34756j;
import ub3.C34752f;
import va3.C35850h;
import ya3.C39371n;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22706i extends AbstractC22713p {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties = {AbstractC22671h0.f89337a.property1(new C22693x(AbstractC22706i.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};
    private final InterfaceC22343l allDescriptors$delegate;
    private final InterfaceC31117e containingClass;

    public AbstractC22706i(InterfaceC22345n storageManager, AbstractC34666b containingClass) {
        AbstractC22676k.m65750j(storageManager, "storageManager");
        AbstractC22676k.m65750j(containingClass, "containingClass");
        this.containingClass = containingClass;
        this.allDescriptors$delegate = new C22340i((C22342k) storageManager, new C3215j(this, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r6v6, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    public static List accessor$GivenFunctionsMemberScope$lambda0(AbstractC22706i abstractC22706i) {
        ?? arrayList;
        List listComputeDeclaredFunctions = abstractC22706i.computeDeclaredFunctions();
        List list = listComputeDeclaredFunctions;
        ArrayList arrayList2 = new ArrayList(3);
        Collection supertypes = abstractC22706i.containingClass.mo60496e().getSupertypes();
        AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
        ArrayList arrayList3 = new ArrayList();
        Iterator it = supertypes.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList3, AbstractC12350b.m34599t(((AbstractC23811y) it.next()).mo64128u(), null, 3));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (obj instanceof InterfaceC31111c) {
                arrayList4.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            C35850h name = ((InterfaceC31111c) obj2).getName();
            Object arrayList5 = linkedHashMap.get(name);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(name, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            AbstractC22676k.m65749i(key, "component1(...)");
            C35850h c35850h = (C35850h) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC31111c) obj3) instanceof InterfaceC31162w);
                Object arrayList6 = linkedHashMap2.get(boolValueOf);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList6);
                }
                ((List) arrayList6).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                C39371n c39371n = C39371n.f169420c;
                List list4 = list3;
                if (zBooleanValue) {
                    arrayList = new ArrayList();
                    for (Object obj4 : listComputeDeclaredFunctions) {
                        if (AbstractC22676k.m65745e(((AbstractC34690n) ((InterfaceC31162w) obj4)).getName(), c35850h)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = C25271y.f99162w;
                }
                c39371n.m125565h(c35850h, list4, (Collection) arrayList, abstractC22706i.containingClass, new C22705h(arrayList2, abstractC22706i));
            }
        }
        return AbstractC25265s.m74129g1(list, AbstractC34756j.m109752b(arrayList2));
    }

    public abstract List computeDeclaredFunctions();

    public final InterfaceC31117e getContainingClass() {
        return this.containingClass;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection<InterfaceC31135k> getContributedDescriptors(C22704g kindFilter, Function1 nameFilter) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        AbstractC22676k.m65750j(nameFilter, "nameFilter");
        return !kindFilter.m65789a(C22704g.f89364n.f89371b) ? C25271y.f99162w : (List) AbstractC29125c.m88494C(this.allDescriptors$delegate, $$delegatedProperties[0]);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection<C34697q0> getContributedFunctions(C35850h name, InterfaceC40210a location) {
        Collection<C34697q0> collection;
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        List list = (List) AbstractC29125c.m88494C(this.allDescriptors$delegate, $$delegatedProperties[0]);
        if (list.isEmpty()) {
            collection = C25271y.f99162w;
        } else {
            C34752f c34752f = new C34752f();
            for (Object obj : list) {
                if ((obj instanceof C34697q0) && AbstractC22676k.m65745e(((C34697q0) obj).getName(), name)) {
                    c34752f.add(obj);
                }
            }
            collection = c34752f;
        }
        return collection;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Collection<InterfaceC31145n0> getContributedVariables(C35850h name, InterfaceC40210a location) {
        Collection<InterfaceC31145n0> collection;
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        List list = (List) AbstractC29125c.m88494C(this.allDescriptors$delegate, $$delegatedProperties[0]);
        if (list.isEmpty()) {
            collection = C25271y.f99162w;
        } else {
            C34752f c34752f = new C34752f();
            for (Object obj : list) {
                if ((obj instanceof InterfaceC31145n0) && AbstractC22676k.m65745e(((InterfaceC31145n0) obj).getName(), name)) {
                    c34752f.add(obj);
                }
            }
            collection = c34752f;
        }
        return collection;
    }
}
