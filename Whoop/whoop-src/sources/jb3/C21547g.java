package jb3;

import a00.C0072g;
import e93.AbstractC12889b;
import fa3.C14328u;
import hb3.C17119i;
import hb3.C17122k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kb3.C22340i;
import kb3.C22342k;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mb3.C25389f;
import mb3.C25395l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import qa3.C30145k;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import sa3.InterfaceC32332f;
import va3.C35845c;
import va3.C35850h;
import z93.EnumC40212c;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: jb3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C21547g extends AbstractC21557q {

    /* JADX INFO: renamed from: g */
    public final C25389f f82625g;

    /* JADX INFO: renamed from: h */
    public final C22340i f82626h;

    /* JADX INFO: renamed from: i */
    public final C22340i f82627i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C21548h f82628j;

    public C21547g(C21548h c21548h, C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f82628j = c21548h;
        C17122k c17122k = c21548h.f82636L;
        C30145k c30145k = c21548h.f82629E;
        List list = c30145k.f123283Q;
        AbstractC22676k.m65749i(list, "getFunctionList(...)");
        List list2 = c30145k.f123284R;
        AbstractC22676k.m65749i(list2, "getPropertyList(...)");
        List list3 = c30145k.f123285S;
        AbstractC22676k.m65749i(list3, "getTypeAliasList(...)");
        List list4 = c30145k.f123277K;
        AbstractC22676k.m65749i(list4, "getNestedClassNameList(...)");
        List list5 = list4;
        InterfaceC32332f interfaceC32332f = c21548h.f82636L.f65761b;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC12889b.m36240F(interfaceC32332f, ((Number) it.next()).intValue()));
        }
        super(c17122k, list, list2, list3, new C14328u(arrayList, 3));
        C17119i c17119i = c17122k.f65760a;
        this.f82625g = kotlinTypeRefiner;
        C22342k c22342k = c17119i.f65735a;
        C21545e c21545e = new C21545e(this, 0);
        c22342k.getClass();
        this.f82626h = new C22340i(c22342k, c21545e);
        C22342k c22342k2 = c17119i.f65735a;
        C21545e c21545e2 = new C21545e(this, 1);
        c22342k2.getClass();
        this.f82627i = new C22340i(c22342k2, c21545e2);
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: a */
    public final void mo60570a(ArrayList arrayList, Function1 function1) {
        C0072g c0072g = this.f82628j.f82640P;
        RandomAccess randomAccessM186d = c0072g != null ? c0072g.m186d() : null;
        if (randomAccessM186d == null) {
            randomAccessM186d = C25271y.f99162w;
        }
        arrayList.addAll(randomAccessM186d);
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: c */
    public final void mo60571c(ArrayList arrayList, C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f82627i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC23811y) it.next()).mo64128u().getContributedFunctions(name, EnumC40212c.f173639y));
        }
        C17122k c17122k = this.f82672b;
        arrayList.addAll(c17122k.f65760a.f65748n.mo92216a(name, this.f82628j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C25395l) c17122k.f65760a.f65751q).f99491d.m125565h(name, arrayList2, arrayList3, this.f82628j, new C21546f(arrayList));
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: d */
    public final void mo60572d(ArrayList arrayList, C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f82627i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC23811y) it.next()).mo64128u().getContributedVariables(name, EnumC40212c.f173639y));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((C25395l) this.f82672b.f65760a.f65751q).f99491d.m125565h(name, arrayList2, arrayList3, this.f82628j, new C21546f(arrayList));
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: e */
    public final C35845c mo60573e(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return this.f82628j.f82632H.m113775d(name);
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: g */
    public final Set mo60574g() {
        List supertypes = this.f82628j.f82638N.getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = supertypes.iterator();
        while (it.hasNext()) {
            Set classifierNames = ((AbstractC23811y) it.next()).mo64128u().getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            AbstractC25265s.m74141p0(linkedHashSet, classifierNames);
        }
        return linkedHashSet;
    }

    @Override // jb3.AbstractC21557q, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        InterfaceC31117e interfaceC31117eM194k;
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        recordLookup(name, location);
        C0072g c0072g = this.f82628j.f82640P;
        return (c0072g == null || (interfaceC31117eM194k = c0072g.m194k(name)) == null) ? super.getContributedClassifier(name, location) : interfaceC31117eM194k;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        return (Collection) this.f82626h.invoke();
    }

    @Override // jb3.AbstractC21557q, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        recordLookup(name, location);
        return super.getContributedFunctions(name, location);
    }

    @Override // jb3.AbstractC21557q, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        recordLookup(name, interfaceC40210a);
        return super.getContributedVariables(name, interfaceC40210a);
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: h */
    public final Set mo60575h() {
        C21548h c21548h = this.f82628j;
        List supertypes = c21548h.f82638N.getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = supertypes.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(linkedHashSet, ((AbstractC23811y) it.next()).mo64128u().getFunctionNames());
        }
        linkedHashSet.addAll(this.f82672b.f65760a.f65748n.mo92219d(c21548h));
        return linkedHashSet;
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: i */
    public final Set mo60576i() {
        List supertypes = this.f82628j.f82638N.getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = supertypes.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(linkedHashSet, ((AbstractC23811y) it.next()).mo64128u().getVariableNames());
        }
        return linkedHashSet;
    }

    @Override // jb3.AbstractC21557q
    /* JADX INFO: renamed from: k */
    public final boolean mo60577k(C21560t c21560t) {
        return this.f82672b.f65760a.f65749o.mo92220e(this.f82628j, c21560t);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final void recordLookup(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        AbstractC22676k.m65750j(this.f82672b.f65760a.f65743i, "<this>");
        C21548h scopeOwner = this.f82628j;
        AbstractC22676k.m65750j(scopeOwner, "scopeOwner");
    }
}
