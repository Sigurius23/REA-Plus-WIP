package u93;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m83.C25235a0;
import m83.C25271y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22701d;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import pf.AbstractC29125c;
import r93.InterfaceC31109b0;
import ub3.AbstractC34756j;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: u93.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34699r0 extends AbstractC22713p {

    /* JADX INFO: renamed from: b */
    public final InterfaceC31109b0 f146143b;

    /* JADX INFO: renamed from: c */
    public final C35847e f146144c;

    public C34699r0(InterfaceC31109b0 moduleDescriptor, C35847e fqName) {
        AbstractC22676k.m65750j(moduleDescriptor, "moduleDescriptor");
        AbstractC22676k.m65750j(fqName, "fqName");
        this.f146143b = moduleDescriptor;
        this.f146144c = fqName;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        return C25235a0.f99113w;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        if (kindFilter.m65789a(C22704g.f89358h)) {
            C35847e c35847e = this.f146144c;
            if (!c35847e.f152613a.m113793c() || !kindFilter.f89370a.contains(C22701d.f89350a)) {
                InterfaceC31109b0 interfaceC31109b0 = this.f146143b;
                Collection collectionMo78663f = interfaceC31109b0.mo78663f(c35847e, function1);
                ArrayList arrayList = new ArrayList(collectionMo78663f.size());
                Iterator it = collectionMo78663f.iterator();
                while (it.hasNext()) {
                    C35850h c35850hM113796g = ((C35847e) it.next()).f152613a.m113796g();
                    if (((Boolean) function1.invoke(c35850hM113796g)).booleanValue()) {
                        C34665a0 c34665a0 = null;
                        if (!c35850hM113796g.f152621x) {
                            C34665a0 c34665a1 = (C34665a0) interfaceC31109b0.mo78658F(c35847e.m113788a(c35850hM113796g));
                            if (!((Boolean) AbstractC29125c.m88494C(c34665a1.f146030G, C34665a0.f146027I[1])).booleanValue()) {
                                c34665a0 = c34665a1;
                            }
                        }
                        AbstractC34756j.m109751a(arrayList, c34665a0);
                    }
                }
                return arrayList;
            }
        }
        return C25271y.f99162w;
    }

    public final String toString() {
        return "subpackages of " + this.f146144c + " from " + this.f146143b;
    }
}
