package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import m83.C25271y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31129i;
import r93.InterfaceC31163w0;
import va3.C35850h;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C22707j extends AbstractC22713p {

    /* JADX INFO: renamed from: b */
    public final InterfaceC22712o f89374b;

    public C22707j(InterfaceC22712o workerScope) {
        AbstractC22676k.m65750j(workerScope, "workerScope");
        this.f89374b = workerScope;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        return this.f89374b.getClassifierNames();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        InterfaceC31126h contributedClassifier = this.f89374b.getContributedClassifier(name, location);
        if (contributedClassifier != null) {
            InterfaceC31117e interfaceC31117e = contributedClassifier instanceof InterfaceC31117e ? (InterfaceC31117e) contributedClassifier : null;
            if (interfaceC31117e != null) {
                return interfaceC31117e;
            }
            if (contributedClassifier instanceof InterfaceC31163w0) {
                return (InterfaceC31163w0) contributedClassifier;
            }
        }
        return null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        Collection collection;
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        int i13 = C22704g.f89362l & kindFilter.f89371b;
        C22704g c22704g = i13 == 0 ? null : new C22704g(i13, kindFilter.f89370a);
        if (c22704g == null) {
            collection = C25271y.f99162w;
        } else {
            Collection contributedDescriptors = this.f89374b.getContributedDescriptors(c22704g, function1);
            ArrayList arrayList = new ArrayList();
            for (Object obj : contributedDescriptors) {
                if (obj instanceof InterfaceC31129i) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getFunctionNames() {
        return this.f89374b.getFunctionNames();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getVariableNames() {
        return this.f89374b.getVariableNames();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final void recordLookup(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        this.f89374b.recordLookup(name, location);
    }

    public final String toString() {
        return "Classes from " + this.f89374b;
    }
}
