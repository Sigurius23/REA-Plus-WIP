package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import fa3.C14328u;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23470p;
import lb3.AbstractC23812y0;
import lb3.C23758a1;
import p108e4.AbstractC12667a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31159u0;
import va3.AbstractC35844b;
import va3.C35850h;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C22717t implements InterfaceC22712o {

    /* JADX INFO: renamed from: b */
    public final InterfaceC22712o f89387b;

    /* JADX INFO: renamed from: c */
    public final C23758a1 f89388c;

    /* JADX INFO: renamed from: d */
    public HashMap f89389d;

    /* JADX INFO: renamed from: e */
    public final C23470p f89390e;

    public C22717t(InterfaceC22712o workerScope, C23758a1 givenSubstitutor) {
        AbstractC22676k.m65750j(workerScope, "workerScope");
        AbstractC22676k.m65750j(givenSubstitutor, "givenSubstitutor");
        this.f89387b = workerScope;
        AbstractC30060g.m92088H(new C14328u(givenSubstitutor, 6));
        AbstractC23812y0 abstractC23812y0M69821f = givenSubstitutor.m69821f();
        AbstractC22676k.m65749i(abstractC23812y0M69821f, "getSubstitution(...)");
        this.f89388c = new C23758a1(AbstractC35844b.m113771l(abstractC23812y0M69821f));
        this.f89390e = AbstractC30060g.m92088H(new C14328u(this, 7));
    }

    /* JADX INFO: renamed from: a */
    public final Collection m65790a(Collection collection) {
        if (this.f89388c.f94122a.mo69908e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(m65791b((InterfaceC31135k) it.next()));
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC31135k m65791b(InterfaceC31135k interfaceC31135k) {
        C23758a1 c23758a1 = this.f89388c;
        if (c23758a1.f94122a.mo69908e()) {
            return interfaceC31135k;
        }
        if (this.f89389d == null) {
            this.f89389d = new HashMap();
        }
        HashMap map = this.f89389d;
        AbstractC22676k.m65747g(map);
        Object objMo60593d = map.get(interfaceC31135k);
        if (objMo60593d == null) {
            if (!(interfaceC31135k instanceof InterfaceC31159u0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC31135k).toString());
            }
            objMo60593d = ((InterfaceC31159u0) interfaceC31135k).mo60593d(c23758a1);
            if (objMo60593d == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC31135k + " substitution fails");
            }
            map.put(interfaceC31135k, objMo60593d);
        }
        return (InterfaceC31135k) objMo60593d;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        return this.f89387b.getClassifierNames();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        InterfaceC31126h contributedClassifier = this.f89387b.getContributedClassifier(name, location);
        if (contributedClassifier != null) {
            return (InterfaceC31126h) m65791b(contributedClassifier);
        }
        return null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        return (Collection) this.f89390e.getValue();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return m65790a(this.f89387b.getContributedFunctions(name, location));
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        return m65790a(this.f89387b.getContributedVariables(name, interfaceC40210a));
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getFunctionNames() {
        return this.f89387b.getFunctionNames();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getVariableNames() {
        return this.f89387b.getVariableNames();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final /* bridge */ void recordLookup(C35850h c35850h, InterfaceC40210a interfaceC40210a) {
        AbstractC12667a.m35439K(this, c35850h, interfaceC40210a);
    }
}
