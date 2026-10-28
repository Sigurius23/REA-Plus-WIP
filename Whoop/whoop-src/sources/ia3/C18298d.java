package ia3;

import ce3.C4515p;
import ja3.C21521q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kb3.C22336e;
import kb3.C22337f;
import kb3.C22338g;
import kb3.C22342k;
import l83.C23460f;
import m83.C25271y;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31133j0;
import va3.C35847e;
import x93.C38132x;

/* JADX INFO: renamed from: ia3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C18298d implements InterfaceC31133j0 {

    /* JADX INFO: renamed from: a */
    public final C41113q f71253a;

    /* JADX INFO: renamed from: b */
    public final C22336e f71254b;

    public C18298d(C18295a c18295a) {
        this.f71253a = new C41113q(c18295a, C18296b.f71248b, new C23460f());
        C22342k c22342k = (C22342k) c18295a.f71223a;
        c22342k.getClass();
        this.f71254b = new C22336e(c22342k, new ConcurrentHashMap(3, 1.0f, 2), new C22337f(), 0);
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: a */
    public final void mo52690a(C35847e fqName, ArrayList arrayList) {
        AbstractC22676k.m65750j(fqName, "fqName");
        arrayList.add(m52692c(fqName));
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: b */
    public final boolean mo52691b(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        ((C18295a) this.f71253a.f177224x).f71224b.getClass();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final C21521q m52692c(C35847e fqName) throws Throwable {
        ((C18295a) this.f71253a.f177224x).f71224b.getClass();
        AbstractC22676k.m65750j(fqName, "fqName");
        C4515p c4515p = new C4515p(this, new C38132x(fqName), false, 3);
        C22336e c22336e = this.f71254b;
        c22336e.getClass();
        Object objInvoke = c22336e.invoke(new C22338g(fqName, c4515p));
        if (objInvoke != null) {
            return (C21521q) objInvoke;
        }
        C22336e.m64219a(3);
        throw null;
    }

    @Override // r93.InterfaceC31133j0
    /* JADX INFO: renamed from: f */
    public final Collection mo52693f(C35847e fqName, Function1 function1) {
        AbstractC22676k.m65750j(fqName, "fqName");
        Collection collection = (List) m52692c(fqName).f82554L.invoke();
        if (collection == null) {
            collection = C25271y.f99162w;
        }
        return collection;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C18295a) this.f71253a.f177224x).f71237o;
    }
}
