package u93;

import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31133j0;
import va3.C35847e;

/* JADX INFO: renamed from: u93.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C34688m implements InterfaceC31133j0 {

    /* JADX INFO: renamed from: a */
    public final List f146109a;

    /* JADX INFO: renamed from: b */
    public final String f146110b;

    public C34688m(List list, String debugName) {
        AbstractC22676k.m65750j(debugName, "debugName");
        this.f146109a = list;
        this.f146110b = debugName;
        list.size();
        AbstractC25265s.m74103I1(list).size();
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: a */
    public final void mo52690a(C35847e fqName, ArrayList arrayList) {
        AbstractC22676k.m65750j(fqName, "fqName");
        Iterator it = this.f146109a.iterator();
        while (it.hasNext()) {
            AbstractC21478l0.m60445p((InterfaceC31133j0) it.next(), fqName, arrayList);
        }
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: b */
    public final boolean mo52691b(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        List list = this.f146109a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC21478l0.m60408N((InterfaceC31133j0) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: f */
    public final Collection mo52693f(C35847e fqName, Function1 function1) {
        AbstractC22676k.m65750j(fqName, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.f146109a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC31133j0) it.next()).mo52693f(fqName, function1));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f146110b;
    }
}
