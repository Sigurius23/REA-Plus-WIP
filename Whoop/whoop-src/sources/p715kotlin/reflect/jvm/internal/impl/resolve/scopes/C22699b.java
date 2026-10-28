package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import io.sentry.config.AbstractC20301a;
import j93.AbstractC21478l0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25271y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;
import r93.InterfaceC31129i;
import r93.InterfaceC31168z;
import va3.C35850h;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C22699b implements InterfaceC22712o {

    /* JADX INFO: renamed from: b */
    public final String f89346b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC22712o[] f89347c;

    public C22699b(String str, InterfaceC22712o[] interfaceC22712oArr) {
        this.f89346b = str;
        this.f89347c = interfaceC22712oArr;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        return AbstractC20301a.m56354x(AbstractC25260n.m74046V(this.f89347c));
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        InterfaceC31126h interfaceC31126h = null;
        for (InterfaceC22712o interfaceC22712o : this.f89347c) {
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
        InterfaceC22712o[] interfaceC22712oArr = this.f89347c;
        int length = interfaceC22712oArr.length;
        if (length == 0) {
            return C25271y.f99162w;
        }
        if (length == 1) {
            return interfaceC22712oArr[0].getContributedDescriptors(kindFilter, function1);
        }
        Collection collectionM60448s = null;
        for (InterfaceC22712o interfaceC22712o : interfaceC22712oArr) {
            collectionM60448s = AbstractC21478l0.m60448s(collectionM60448s, interfaceC22712o.getContributedDescriptors(kindFilter, function1));
        }
        return collectionM60448s == null ? C25235a0.f99113w : collectionM60448s;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        InterfaceC22712o[] interfaceC22712oArr = this.f89347c;
        int length = interfaceC22712oArr.length;
        if (length == 0) {
            return C25271y.f99162w;
        }
        if (length == 1) {
            return interfaceC22712oArr[0].getContributedFunctions(name, location);
        }
        Collection collectionM60448s = null;
        for (InterfaceC22712o interfaceC22712o : interfaceC22712oArr) {
            collectionM60448s = AbstractC21478l0.m60448s(collectionM60448s, interfaceC22712o.getContributedFunctions(name, location));
        }
        return collectionM60448s == null ? C25235a0.f99113w : collectionM60448s;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        InterfaceC22712o[] interfaceC22712oArr = this.f89347c;
        int length = interfaceC22712oArr.length;
        if (length == 0) {
            return C25271y.f99162w;
        }
        if (length == 1) {
            return interfaceC22712oArr[0].getContributedVariables(name, interfaceC40210a);
        }
        Collection collectionM60448s = null;
        for (InterfaceC22712o interfaceC22712o : interfaceC22712oArr) {
            collectionM60448s = AbstractC21478l0.m60448s(collectionM60448s, interfaceC22712o.getContributedVariables(name, interfaceC40210a));
        }
        return collectionM60448s == null ? C25235a0.f99113w : collectionM60448s;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getFunctionNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC22712o interfaceC22712o : this.f89347c) {
            AbstractC25265s.m74141p0(linkedHashSet, interfaceC22712o.getFunctionNames());
        }
        return linkedHashSet;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getVariableNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC22712o interfaceC22712o : this.f89347c) {
            AbstractC25265s.m74141p0(linkedHashSet, interfaceC22712o.getVariableNames());
        }
        return linkedHashSet;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final void recordLookup(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        for (InterfaceC22712o interfaceC22712o : this.f89347c) {
            interfaceC22712o.recordLookup(name, location);
        }
    }

    public final String toString() {
        return this.f89346b;
    }
}
