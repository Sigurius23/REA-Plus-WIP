package nb3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import m83.C25235a0;
import m83.C25271y;
import p098dt.AbstractC12350b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.InterfaceC31126h;
import va3.C35850h;
import z93.EnumC40212c;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: nb3.g */
/* JADX INFO: loaded from: classes5.dex */
public class C26550g implements InterfaceC22712o {

    /* JADX INFO: renamed from: b */
    public final String f105514b;

    public C26550g(EnumC26551h enumC26551h, String... formatParams) {
        AbstractC22676k.m65750j(formatParams, "formatParams");
        String str = enumC26551h.f105521w;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f105514b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Set getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return AbstractC12350b.m34570S(new C26546c(C26555l.f105566c));
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set getContributedVariables(C35850h name, EnumC40212c enumC40212c) {
        AbstractC22676k.m65750j(name, "name");
        return C26555l.f105569f;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Set getClassifierNames() {
        return C25235a0.f99113w;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        EnumC26545b[] enumC26545bArr = EnumC26545b.f105507w;
        return new C26544a(C35850h.m113816g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1))));
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        return C25271y.f99162w;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Set getFunctionNames() {
        return C25235a0.f99113w;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Set getVariableNames() {
        return C25235a0.f99113w;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public void recordLookup(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
    }

    public String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("ErrorScope{"), this.f105514b, '}');
    }
}
