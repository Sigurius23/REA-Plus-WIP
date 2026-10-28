package s93;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lb3.C23807w;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;

/* JADX INFO: renamed from: s93.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C32312n implements InterfaceC32307i {

    /* JADX INFO: renamed from: w */
    public final InterfaceC32307i f133692w;

    /* JADX INFO: renamed from: x */
    public final C23807w f133693x;

    public C32312n(InterfaceC32307i interfaceC32307i, C23807w c23807w) {
        this.f133692w = interfaceC32307i;
        this.f133693x = c23807w;
    }

    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: J */
    public final boolean mo52688J(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        if (((Boolean) this.f133693x.invoke(fqName)).booleanValue()) {
            return this.f133692w.mo52688J(fqName);
        }
        return false;
    }

    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: T */
    public final InterfaceC32300b mo52689T(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        if (((Boolean) this.f133693x.invoke(fqName)).booleanValue()) {
            return this.f133692w.mo52689T(fqName);
        }
        return null;
    }

    @Override // s93.InterfaceC32307i
    public final boolean isEmpty() {
        InterfaceC32307i interfaceC32307i = this.f133692w;
        if ((interfaceC32307i instanceof Collection) && ((Collection) interfaceC32307i).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC32307i.iterator();
        while (it.hasNext()) {
            C35847e c35847eMo43953b = ((InterfaceC32300b) it.next()).mo43953b();
            if (c35847eMo43953b != null && ((Boolean) this.f133693x.invoke(c35847eMo43953b)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f133692w) {
            C35847e c35847eMo43953b = ((InterfaceC32300b) obj).mo43953b();
            if (c35847eMo43953b != null && ((Boolean) this.f133693x.invoke(c35847eMo43953b)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
