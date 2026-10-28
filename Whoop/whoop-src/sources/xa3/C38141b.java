package xa3;

import java.util.ArrayList;
import m83.C25251i0;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31165x0;
import u93.AbstractC34677g0;
import v63.AbstractC35744b;
import va3.C35848f;
import va3.C35850h;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: xa3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C38141b implements InterfaceC38142c {

    /* JADX INFO: renamed from: b */
    public static final C38141b f163289b = new C38141b(0);

    /* JADX INFO: renamed from: c */
    public static final C38141b f163290c = new C38141b(1);

    /* JADX INFO: renamed from: d */
    public static final C38141b f163291d = new C38141b(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163292a;

    public /* synthetic */ C38141b(int i13) {
        this.f163292a = i13;
    }

    /* JADX INFO: renamed from: b */
    public static String m122159b(InterfaceC31126h interfaceC31126h) {
        String strM113237j;
        C35850h name = interfaceC31126h.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        String strM113235h = AbstractC35744b.m113235h(name);
        if (!(interfaceC31126h instanceof InterfaceC31165x0)) {
            InterfaceC31135k interfaceC31135kMo60581g = interfaceC31126h.mo60581g();
            AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
            if (interfaceC31135kMo60581g instanceof InterfaceC31117e) {
                strM113237j = m122159b((InterfaceC31126h) interfaceC31135kMo60581g);
            } else if (interfaceC31135kMo60581g instanceof InterfaceC31124g0) {
                C35848f c35848f = ((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135kMo60581g)).f146067F.f152613a;
                AbstractC22676k.m65750j(c35848f, "<this>");
                strM113237j = AbstractC35744b.m113237j(C35848f.m113790f(c35848f));
            } else {
                strM113237j = null;
            }
            if (strM113237j != null && !strM113237j.equals("")) {
                return AbstractC11895b.m31992k('.', strM113237j, strM113235h);
            }
        }
        return strM113235h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [r93.h, r93.k] */
    /* JADX WARN: Type inference failed for: r2v8, types: [r93.k] */
    /* JADX WARN: Type inference failed for: r2v9, types: [r93.k] */
    @Override // xa3.InterfaceC38142c
    /* JADX INFO: renamed from: a */
    public final String mo122160a(InterfaceC31126h interfaceC31126h, C38148i c38148i) {
        switch (this.f163292a) {
            case 0:
                if (interfaceC31126h instanceof InterfaceC31165x0) {
                    C35850h name = ((InterfaceC31165x0) interfaceC31126h).getName();
                    AbstractC22676k.m65749i(name, "getName(...)");
                    return c38148i.m122180O(name, false);
                }
                C35848f c35848fM125524f = AbstractC39363f.m125524f(interfaceC31126h);
                AbstractC22676k.m65749i(c35848fM125524f, "getFqName(...)");
                return c38148i.m122213p(AbstractC35744b.m113237j(C35848f.m113790f(c35848fM125524f)));
            case 1:
                if (interfaceC31126h instanceof InterfaceC31165x0) {
                    C35850h name2 = ((InterfaceC31165x0) interfaceC31126h).getName();
                    AbstractC22676k.m65749i(name2, "getName(...)");
                    return c38148i.m122180O(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC31126h.getName());
                    interfaceC31126h = interfaceC31126h.mo60581g();
                } while (interfaceC31126h instanceof InterfaceC31117e);
                return AbstractC35744b.m113237j(new C25251i0(arrayList));
            default:
                return m122159b(interfaceC31126h);
        }
    }
}
