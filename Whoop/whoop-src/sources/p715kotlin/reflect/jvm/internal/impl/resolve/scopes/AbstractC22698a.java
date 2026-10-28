package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;
import va3.C35850h;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22698a implements InterfaceC22712o {
    /* JADX INFO: renamed from: a */
    public final InterfaceC22712o m65786a() {
        if (!(mo65787b() instanceof AbstractC22698a)) {
            return mo65787b();
        }
        InterfaceC22712o interfaceC22712oMo65787b = mo65787b();
        AbstractC22676k.m65748h(interfaceC22712oMo65787b, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractC22698a) interfaceC22712oMo65787b).m65786a();
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC22712o mo65787b();

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        return mo65787b().getClassifierNames();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return mo65787b().getContributedClassifier(name, location);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        return mo65787b().getContributedDescriptors(kindFilter, function1);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return mo65787b().getContributedFunctions(name, location);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        return mo65787b().getContributedVariables(name, interfaceC40210a);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getFunctionNames() {
        return mo65787b().getFunctionNames();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getVariableNames() {
        return mo65787b().getVariableNames();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final void recordLookup(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        mo65787b().recordLookup(name, location);
    }
}
