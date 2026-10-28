package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import m83.C25271y;
import p108e4.AbstractC12667a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;
import u93.C34697q0;
import ub3.C34748b;
import va3.C35850h;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.p */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22713p implements InterfaceC22712o {
    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Set<C35850h> getClassifierNames() {
        return null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        return C25271y.f99162w;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return C25271y.f99162w;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        return C25271y.f99162w;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Set<C35850h> getFunctionNames() {
        Collection contributedDescriptors = getContributedDescriptors(C22704g.f89366p, C34748b.f146400w);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : contributedDescriptors) {
            if (obj instanceof C34697q0) {
                C35850h name = ((C34697q0) obj).getName();
                AbstractC22676k.m65749i(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Set<C35850h> getVariableNames() {
        Collection contributedDescriptors = getContributedDescriptors(C22704g.f89367q, C34748b.f146400w);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : contributedDescriptors) {
            if (obj instanceof C34697q0) {
                C35850h name = ((C34697q0) obj).getName();
                AbstractC22676k.m65749i(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public /* bridge */ void recordLookup(C35850h c35850h, InterfaceC40210a interfaceC40210a) {
        AbstractC12667a.m35439K(this, c35850h, interfaceC40210a);
    }
}
