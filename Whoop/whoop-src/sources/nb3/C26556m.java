package nb3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import r93.InterfaceC31126h;
import va3.C35850h;
import z93.EnumC40212c;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: nb3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C26556m extends C26550g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26556m(EnumC26551h enumC26551h, String... formatParams) {
        super(enumC26551h, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        AbstractC22676k.m65750j(formatParams, "formatParams");
    }

    @Override // nb3.C26550g
    /* JADX INFO: renamed from: a */
    public final Set getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        throw new IllegalStateException(this.f105514b + ", required name: " + name);
    }

    @Override // nb3.C26550g
    /* JADX INFO: renamed from: b */
    public final Set getContributedVariables(C35850h name, EnumC40212c enumC40212c) {
        AbstractC22676k.m65750j(name, "name");
        throw new IllegalStateException(this.f105514b + ", required name: " + name);
    }

    @Override // nb3.C26550g, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        throw new IllegalStateException();
    }

    @Override // nb3.C26550g, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        throw new IllegalStateException(this.f105514b + ", required name: " + name);
    }

    @Override // nb3.C26550g, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        throw new IllegalStateException(this.f105514b);
    }

    @Override // nb3.C26550g, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final /* bridge */ /* synthetic */ Collection getContributedFunctions(C35850h c35850h, InterfaceC40210a interfaceC40210a) {
        getContributedFunctions(c35850h, interfaceC40210a);
        throw null;
    }

    @Override // nb3.C26550g, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final /* bridge */ /* synthetic */ Collection getContributedVariables(C35850h c35850h, InterfaceC40210a interfaceC40210a) {
        getContributedVariables(c35850h, (EnumC40212c) interfaceC40210a);
        throw null;
    }

    @Override // nb3.C26550g, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getFunctionNames() {
        throw new IllegalStateException();
    }

    @Override // nb3.C26550g, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getVariableNames() {
        throw new IllegalStateException();
    }

    @Override // nb3.C26550g, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final void recordLookup(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        throw new IllegalStateException();
    }

    @Override // nb3.C26550g
    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("ThrowingScope{"), this.f105514b, '}');
    }
}
