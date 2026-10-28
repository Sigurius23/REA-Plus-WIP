package p93;

import hg3.AbstractC17269i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lb3.AbstractC23759b;
import lb3.AbstractC23791o;
import lb3.C23784k0;
import lb3.C23806v0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import o93.AbstractC27742n;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.C31161v0;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import u93.AbstractC34677g0;
import va3.C35845c;
import vb3.AbstractC35872a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: p93.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C29023b extends AbstractC23759b {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29024c f117486y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29023b(C29024c c29024c) {
        super(c29024c.f117489E);
        this.f117486y = c29024c;
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: a */
    public final Collection mo60484a() {
        List listM118959K;
        C29024c c29024c = this.f117486y;
        int i13 = c29024c.f117492H;
        AbstractC29032k abstractC29032k = c29024c.f117491G;
        C29028g c29028g = C29028g.f117498c;
        if (AbstractC22676k.m65745e(abstractC29032k, c29028g)) {
            listM118959K = AbstractC37056f.m118958J(C29024c.f117487L);
        } else if (AbstractC22676k.m65745e(abstractC29032k, C29029h.f117499c)) {
            listM118959K = AbstractC37056f.m118959K(C29024c.f117488M, new C35845c(AbstractC27742n.f111886k, c29028g.m88263a(i13)));
        } else {
            C29031j c29031j = C29031j.f117501c;
            if (AbstractC22676k.m65745e(abstractC29032k, c29031j)) {
                listM118959K = AbstractC37056f.m118958J(C29024c.f117487L);
            } else {
                if (!AbstractC22676k.m65745e(abstractC29032k, C29030i.f117500c)) {
                    int i14 = AbstractC35872a.f152712a;
                    throw new IllegalStateException("should not be called");
                }
                listM118959K = AbstractC37056f.m118959K(C29024c.f117488M, new C35845c(AbstractC27742n.f111881f, c29031j.m88263a(i13)));
            }
        }
        InterfaceC31109b0 interfaceC31109b0Mo60581g = ((AbstractC34677g0) c29024c.f117490F).mo60581g();
        List<C35845c> list = listM118959K;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C35845c c35845c : list) {
            InterfaceC31117e interfaceC31117eM48865L = AbstractC17269i.m48865L(interfaceC31109b0Mo60581g, c35845c);
            if (interfaceC31117eM48865L == null) {
                throw new IllegalStateException(("Built-in class " + c35845c + " not found").toString());
            }
            List listM74158x1 = AbstractC25265s.m74158x1(interfaceC31117eM48865L.mo60496e().getParameters().size(), c29024c.f117495K);
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74158x1, 10));
            Iterator it = listM74158x1.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C23806v0(((InterfaceC31165x0) it.next()).mo60594i()));
            }
            C23784k0.f94165x.getClass();
            arrayList.add(AbstractC23791o.m69889h(C23784k0.f94166y, interfaceC31117eM48865L, arrayList2));
        }
        return AbstractC25265s.m74093D1(arrayList);
    }

    @Override // lb3.AbstractC23759b, lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31126h mo1784d() {
        return this.f117486y;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: f */
    public final boolean mo1785f() {
        return true;
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: g */
    public final C31161v0 mo60485g() {
        return C31161v0.f128379x;
    }

    @Override // lb3.InterfaceC23796q0
    public final List getParameters() {
        return this.f117486y.f117495K;
    }

    @Override // lb3.AbstractC23759b
    /* JADX INFO: renamed from: l */
    public final InterfaceC31117e mo1784d() {
        return this.f117486y;
    }

    public final String toString() {
        return this.f117486y.toString();
    }
}
