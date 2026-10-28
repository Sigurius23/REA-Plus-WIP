package ja3;

import fa3.C14328u;
import ia3.C18295a;
import io.sentry.config.AbstractC20301a;
import j93.AbstractC21478l0;
import j93.InterfaceC21493z;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25271y;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import pf.AbstractC29125c;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31129i;
import r93.InterfaceC31168z;
import va3.AbstractC35844b;
import va3.C35850h;
import x93.C38132x;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: ja3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C21505d implements InterfaceC22712o {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC21493z[] f82481f = {AbstractC22671h0.f89337a.property1(new C22693x(C21505d.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: b */
    public final C41113q f82482b;

    /* JADX INFO: renamed from: c */
    public final C21521q f82483c;

    /* JADX INFO: renamed from: d */
    public final C21526v f82484d;

    /* JADX INFO: renamed from: e */
    public final C22340i f82485e;

    public C21505d(C41113q c41113q, C38132x c38132x, C21521q c21521q) {
        this.f82482b = c41113q;
        this.f82483c = c21521q;
        this.f82484d = new C21526v(c41113q, c38132x, c21521q);
        InterfaceC22345n interfaceC22345n = ((C18295a) c41113q.f177224x).f71223a;
        C14328u c14328u = new C14328u(this, 2);
        C22342k c22342k = (C22342k) interfaceC22345n;
        c22342k.getClass();
        this.f82485e = new C22340i(c22342k, c14328u);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC22712o[] m60479a() {
        return (InterfaceC22712o[]) AbstractC29125c.m88494C(this.f82485e, f82481f[0]);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        HashSet hashSetM56354x = AbstractC20301a.m56354x(AbstractC25260n.m74046V(m60479a()));
        if (hashSetM56354x == null) {
            return null;
        }
        hashSetM56354x.addAll(this.f82484d.getClassifierNames());
        return hashSetM56354x;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        recordLookup(name, location);
        C21526v c21526v = this.f82484d;
        c21526v.getClass();
        InterfaceC31126h interfaceC31126h = null;
        InterfaceC31117e interfaceC31117eM60520o = c21526v.m60520o(name, null);
        if (interfaceC31117eM60520o != null) {
            return interfaceC31117eM60520o;
        }
        for (InterfaceC22712o interfaceC22712o : m60479a()) {
            InterfaceC31126h contributedClassifier = interfaceC22712o.getContributedClassifier(name, location);
            if (contributedClassifier != null) {
                if (!(contributedClassifier instanceof InterfaceC31129i) || !((InterfaceC31168z) contributedClassifier).mo60493U()) {
                    return contributedClassifier;
                }
                if (interfaceC31126h == null) {
                    interfaceC31126h = contributedClassifier;
                }
            }
        }
        return interfaceC31126h;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        InterfaceC22712o[] interfaceC22712oArrM60479a = m60479a();
        Collection contributedDescriptors = this.f82484d.getContributedDescriptors(kindFilter, function1);
        for (InterfaceC22712o interfaceC22712o : interfaceC22712oArrM60479a) {
            contributedDescriptors = AbstractC21478l0.m60448s(contributedDescriptors, interfaceC22712o.getContributedDescriptors(kindFilter, function1));
        }
        return contributedDescriptors == null ? C25235a0.f99113w : contributedDescriptors;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        recordLookup(name, location);
        InterfaceC22712o[] interfaceC22712oArrM60479a = m60479a();
        Collection contributedFunctions = this.f82484d.getContributedFunctions(name, location);
        for (InterfaceC22712o interfaceC22712o : interfaceC22712oArrM60479a) {
            contributedFunctions = AbstractC21478l0.m60448s(contributedFunctions, interfaceC22712o.getContributedFunctions(name, location));
        }
        return contributedFunctions == null ? C25235a0.f99113w : contributedFunctions;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        recordLookup(name, interfaceC40210a);
        InterfaceC22712o[] interfaceC22712oArrM60479a = m60479a();
        this.f82484d.getClass();
        Collection collectionM60448s = C25271y.f99162w;
        for (InterfaceC22712o interfaceC22712o : interfaceC22712oArrM60479a) {
            collectionM60448s = AbstractC21478l0.m60448s(collectionM60448s, interfaceC22712o.getContributedVariables(name, interfaceC40210a));
        }
        return collectionM60448s == null ? C25235a0.f99113w : collectionM60448s;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getFunctionNames() {
        InterfaceC22712o[] interfaceC22712oArrM60479a = m60479a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC22712o interfaceC22712o : interfaceC22712oArrM60479a) {
            AbstractC25265s.m74141p0(linkedHashSet, interfaceC22712o.getFunctionNames());
        }
        linkedHashSet.addAll(this.f82484d.getFunctionNames());
        return linkedHashSet;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getVariableNames() {
        InterfaceC22712o[] interfaceC22712oArrM60479a = m60479a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC22712o interfaceC22712o : interfaceC22712oArrM60479a) {
            AbstractC25265s.m74141p0(linkedHashSet, interfaceC22712o.getVariableNames());
        }
        linkedHashSet.addAll(this.f82484d.getVariableNames());
        return linkedHashSet;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final void recordLookup(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        AbstractC35844b.m113769j(((C18295a) this.f82482b.f177224x).f71236n, location, this.f82483c, name);
    }

    public final String toString() {
        return "scope for " + this.f82483c;
    }
}
