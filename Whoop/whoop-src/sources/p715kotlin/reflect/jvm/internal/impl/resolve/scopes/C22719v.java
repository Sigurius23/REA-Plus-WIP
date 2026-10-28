package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import m83.AbstractC25265s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31108b;
import r93.InterfaceC31135k;
import va3.C35850h;
import ya3.AbstractC39375r;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C22719v extends AbstractC22698a {

    /* JADX INFO: renamed from: b */
    public final InterfaceC22712o f89395b;

    public C22719v(InterfaceC22712o interfaceC22712o) {
        this.f89395b = interfaceC22712o;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22698a
    /* JADX INFO: renamed from: b */
    public final InterfaceC22712o mo65787b() {
        return this.f89395b;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22698a, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        Collection contributedDescriptors = super.getContributedDescriptors(kindFilter, function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : contributedDescriptors) {
            if (((InterfaceC31135k) obj) instanceof InterfaceC31108b) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return AbstractC25265s.m74129g1(AbstractC39375r.m125584e(arrayList, C22718u.f89393z), arrayList2);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22698a, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return AbstractC39375r.m125584e(super.getContributedFunctions(name, location), C22718u.f89391x);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22698a, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        return AbstractC39375r.m125584e(super.getContributedVariables(name, interfaceC40210a), C22718u.f89392y);
    }
}
