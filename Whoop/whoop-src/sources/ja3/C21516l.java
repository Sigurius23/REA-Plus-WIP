package ja3;

import androidx.work.impl.WorkerStoppedException;
import bc3.C3033m;
import bg.C3215j;
import cb3.AbstractC4393e;
import db3.C11889a;
import hb3.C17109d;
import hg3.AbstractC17269i;
import ia3.C18295a;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import l83.C23454a0;
import m83.AbstractC25265s;
import ma3.EnumC25378g;
import n83.C26460c;
import oa3.C27763f;
import p014aj.C0928c;
import p014aj.C0929d;
import p037bu.C3632c;
import p097ds.InterfaceFutureC12319v;
import p218ic.AbstractC18388v;
import p505ts.AbstractC34132o;
import p668z1.AbstractC39963l;
import p668z1.C39949b;
import p668z1.C39961j;
import p692zt.C41113q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pa3.EnumC29038a;
import q83.AbstractC30060g;
import r93.InterfaceC31117e;
import sa3.C32331e;
import u93.C34704u;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34823k;
import va3.AbstractC35846d;
import va3.AbstractC35849g;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import w93.C36969b;
import wb3.AbstractC37056f;
import x93.AbstractC38109c;
import x93.C38122n;
import x93.C38128t;
import yb3.AbstractC39421y;
import zd3.C40571o;

/* JADX INFO: renamed from: ja3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C21516l implements Function1, InterfaceC34823k {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82527w;

    /* JADX INFO: renamed from: x */
    public final Object f82528x;

    /* JADX INFO: renamed from: y */
    public final Object f82529y;

    public /* synthetic */ C21516l(int i13, Object obj, Object obj2) {
        this.f82527w = i13;
        this.f82529y = obj;
        this.f82528x = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3632c c3632cM2348h;
        String str;
        Class clsM113786k;
        C36969b c36969bM113810l;
        long j7;
        switch (this.f82527w) {
            case 0:
                C21519o c21519o = (C21519o) this.f82529y;
                C41113q c41113q = (C41113q) this.f82528x;
                C35850h name = (C35850h) obj;
                AbstractC22676k.m65750j(name, "name");
                C22340i c22340i = c21519o.f82543r;
                InterfaceC31117e interfaceC31117e = c21519o.f82539n;
                if (((Set) c22340i.invoke()).contains(name)) {
                    C0928c c0928c = ((C18295a) c41113q.f177224x).f71224b;
                    C35845c c35845cM13808f = AbstractC4393e.m13808f(interfaceC31117e);
                    AbstractC22676k.m65747g(c35845cM13808f);
                    C35845c c35845cM113775d = c35845cM13808f.m113775d(name);
                    c0928c.getClass();
                    C35847e c35847e = c35845cM113775d.f152609a;
                    String strM125927L = AbstractC39421y.m125927L(c35845cM113775d.f152610b.f152613a.f152616a, '.', '$');
                    if (!c35847e.f152613a.m113793c()) {
                        strM125927L = c35847e.f152613a.f152616a + '.' + strM125927L;
                    }
                    Class clsM113786k2 = AbstractC35846d.m113786k((ClassLoader) c0928c.f3421x, strM125927L);
                    C38122n c38122n = clsM113786k2 != null ? new C38122n(clsM113786k2) : null;
                    if (c38122n == null) {
                        return null;
                    }
                    C21513i c21513i = new C21513i(c41113q, interfaceC31117e, c38122n, null);
                    ((C18295a) c41113q.f177224x).f71241s.getClass();
                    return c21513i;
                }
                if (!((Set) c21519o.f82544s.invoke()).contains(name)) {
                    C38128t c38128t = (C38128t) ((Map) c21519o.f82545t.invoke()).get(name);
                    if (c38128t == null) {
                        return null;
                    }
                    C18295a c18295a = (C18295a) c41113q.f177224x;
                    InterfaceC22345n interfaceC22345n = c18295a.f71223a;
                    C3215j c3215j = new C3215j(c21519o, 3);
                    C22342k c22342k = (C22342k) interfaceC22345n;
                    c22342k.getClass();
                    return C34704u.m109616X(c18295a.f71223a, c21519o.f82539n, name, new C22340i(c22342k, c3215j), AbstractC17269i.m48897j0(c41113q, c38128t), c18295a.f71232j.m118692c(c38128t));
                }
                C26460c c26460cM119000x = AbstractC37056f.m119000x();
                ((C11889a) ((C18295a) c41113q.f177224x).f71246x).m31918c(interfaceC31117e, name, c26460cM119000x, c41113q);
                C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                int iMo74007a = c26460cM118988k.mo74007a();
                if (iMo74007a == 0) {
                    return null;
                }
                if (iMo74007a == 1) {
                    return (InterfaceC31117e) AbstractC25265s.m74142p1(c26460cM118988k);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + c26460cM118988k).toString());
            case 1:
                C21526v c21526v = (C21526v) this.f82529y;
                C41113q c41113q2 = c21526v.f82465b;
                C41113q c41113q3 = (C41113q) this.f82528x;
                C18295a c18295a2 = (C18295a) c41113q3.f177224x;
                C21522r request = (C21522r) obj;
                AbstractC22676k.m65750j(request, "request");
                C21521q c21521q = c21526v.f82562o;
                C35845c c35845c = new C35845c(c21521q.f146067F, request.f82556a);
                C38122n c38122n2 = request.f82557b;
                if (c38122n2 != null) {
                    C0929d c0929d = c18295a2.f71225c;
                    ((C18295a) c41113q2.f177224x).f71226d.m83862c().f65737c.getClass();
                    C32331e metadataVersion = C32331e.f133827g;
                    c0929d.getClass();
                    AbstractC22676k.m65750j(metadataVersion, "metadataVersion");
                    C35847e c35847eM122102c = c38122n2.m122102c();
                    c3632cM2348h = (c35847eM122102c == null || (str = c35847eM122102c.f152613a.f152616a) == null || (clsM113786k = AbstractC35846d.m113786k((ClassLoader) c0929d.f3422w, str)) == null || (c36969bM113810l = AbstractC35849g.m113810l(clsM113786k)) == null) ? null : new C3632c(c36969bM113810l);
                } else {
                    C0929d c0929d2 = c18295a2.f71225c;
                    ((C18295a) c41113q2.f177224x).f71226d.m83862c().f65737c.getClass();
                    c3632cM2348h = c0929d2.m2348h(c35845c, C32331e.f133827g);
                }
                C36969b c36969b = c3632cM2348h != null ? (C36969b) c3632cM2348h.f14788w : null;
                C35845c c35845cM122089a = c36969b != null ? AbstractC38109c.m122089a(c36969b.f158227a) : null;
                if (c35845cM122089a != null && (c35845cM122089a.m113778g() || c35845cM122089a.f152611c)) {
                    return null;
                }
                AbstractC30060g c21523s = C21524t.f82559a;
                if (c36969b != null) {
                    if (((EnumC29038a) c36969b.f158228b.f117525d) == EnumC29038a.CLASS) {
                        C27763f c27763f = ((C18295a) c41113q2.f177224x).f71226d;
                        c27763f.getClass();
                        C17109d c17109dM83866g = c27763f.m83866g(c36969b);
                        InterfaceC31117e interfaceC31117eM48354a = c17109dM83866g == null ? null : c27763f.m83862c().f65754t.m48354a(AbstractC38109c.m122089a(c36969b.f158227a), c17109dM83866g);
                        if (interfaceC31117eM48354a != null) {
                            c21523s = new C21523s(interfaceC31117eM48354a);
                        }
                    } else {
                        c21523s = C21525u.f82560a;
                    }
                }
                if (c21523s instanceof C21523s) {
                    return ((C21523s) c21523s).f82558a;
                }
                if (c21523s instanceof C21525u) {
                    return null;
                }
                if (!(c21523s instanceof C21524t)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (c38122n2 == null) {
                    C0928c c0928c2 = c18295a2.f71224b;
                    c0928c2.getClass();
                    C35847e c35847e2 = c35845c.f152609a;
                    String strM125927L2 = AbstractC39421y.m125927L(c35845c.f152610b.f152613a.f152616a, '.', '$');
                    if (!c35847e2.f152613a.m113793c()) {
                        strM125927L2 = c35847e2.f152613a.f152616a + '.' + strM125927L2;
                    }
                    Class clsM113786k3 = AbstractC35846d.m113786k((ClassLoader) c0928c2.f3421x, strM125927L2);
                    c38122n2 = clsM113786k3 != null ? new C38122n(clsM113786k3) : null;
                }
                EnumC25378g[] enumC25378gArr = EnumC25378g.f99454w;
                C35847e c35847eM122102c2 = c38122n2 != null ? c38122n2.m122102c() : null;
                if (c35847eM122102c2 == null || c35847eM122102c2.f152613a.m113793c() || !c35847eM122102c2.m113789b().equals(c21521q.f146067F)) {
                    return null;
                }
                C21513i c21513i2 = new C21513i(c41113q3, c21521q, c38122n2, null);
                c18295a2.f71241s.getClass();
                return c21513i2;
            case 2:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof WorkerStoppedException) {
                    ((AbstractC18388v) this.f82529y).stop(((WorkerStoppedException) th3).f7351w);
                }
                ((InterfaceFutureC12319v) this.f82528x).cancel(false);
                return C23454a0.f92919a;
            case 3:
                try {
                    ((C40571o) this.f82529y).cancel();
                    break;
                } catch (Throwable unused) {
                }
                return C23454a0.f92919a;
            default:
                C39961j c39961j = (C39961j) obj;
                synchronized (AbstractC39963l.f172462c) {
                    j7 = AbstractC39963l.f172464e;
                    AbstractC39963l.f172464e = ((long) 1) + j7;
                }
                return new C39949b(j7, c39961j, (Function1) this.f82529y, (Function1) this.f82528x);
        }
    }

    @Override // ud3.InterfaceC34823k
    public void onFailure(InterfaceC34821j interfaceC34821j, IOException iOException) {
        if (((C40571o) interfaceC34821j).f174718R) {
            return;
        }
        ((C3033m) this.f82528x).resumeWith(AbstractC34132o.m107888l(iOException));
    }

    @Override // ud3.InterfaceC34823k
    public void onResponse(InterfaceC34821j interfaceC34821j, C34850x0 c34850x0) {
        ((C3033m) this.f82528x).resumeWith(c34850x0);
    }
}
