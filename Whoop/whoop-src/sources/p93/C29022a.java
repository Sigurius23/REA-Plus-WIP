package p93;

import ib3.C18344c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kb3.C22342k;
import m83.AbstractC25265s;
import m83.C25235a0;
import p097ds.AbstractC12314q;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import t93.InterfaceC33667c;
import u93.C34665a0;
import u93.C34673e0;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: p93.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C29022a implements InterfaceC33667c {

    /* JADX INFO: renamed from: a */
    public final C22342k f117484a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC31109b0 f117485b;

    public C29022a(C22342k c22342k, C34673e0 module) {
        AbstractC22676k.m65750j(module, "module");
        this.f117484a = c22342k;
        this.f117485b = module;
    }

    @Override // t93.InterfaceC33667c
    /* JADX INFO: renamed from: a */
    public final Collection mo88259a(C35847e packageFqName) {
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
        return C25235a0.f99113w;
    }

    @Override // t93.InterfaceC33667c
    /* JADX INFO: renamed from: b */
    public final boolean mo88260b(C35847e packageFqName, C35850h name) {
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
        AbstractC22676k.m65750j(name, "name");
        String strM113817b = name.m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        if (AbstractC39421y.m125930O(strM113817b, "Function", false) || AbstractC39421y.m125930O(strM113817b, "KFunction", false) || AbstractC39421y.m125930O(strM113817b, "SuspendFunction", false) || AbstractC39421y.m125930O(strM113817b, "KSuspendFunction", false)) {
            C29034m c29034m = C29034m.f117506b;
            if (AbstractC12314q.m34345y().m88266a(strM113817b, packageFqName) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // t93.InterfaceC33667c
    /* JADX INFO: renamed from: c */
    public final InterfaceC31117e mo88261c(C35845c classId) {
        AbstractC22676k.m65750j(classId, "classId");
        if (classId.f152611c || classId.m113778g()) {
            return null;
        }
        String str = classId.f152610b.f152613a.f152616a;
        if (!AbstractC39414r.m125876U(str, "Function", false)) {
            return null;
        }
        C35847e c35847e = classId.f152609a;
        C29034m c29034m = C29034m.f117506b;
        C29033l c29033lM88266a = AbstractC12314q.m34345y().m88266a(str, c35847e);
        if (c29033lM88266a == null) {
            return null;
        }
        AbstractC29032k abstractC29032kM88264a = c29033lM88266a.m88264a();
        int iM88265b = c29033lM88266a.m88265b();
        List list = (List) AbstractC29125c.m88494C(((C34665a0) this.f117485b.mo78658F(c35847e)).f146029F, C34665a0.f146027I[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C18344c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (AbstractC25265s.m74100H0(arrayList2) != null) {
            throw new ClassCastException();
        }
        return new C29024c(this.f117484a, (C18344c) AbstractC25265s.m74096F0(arrayList), abstractC29032kM88264a, iM88265b);
    }
}
