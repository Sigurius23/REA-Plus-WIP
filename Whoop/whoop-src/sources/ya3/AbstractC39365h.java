package ya3;

import cb3.AbstractC4393e;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import mb3.C25396m;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.AbstractC31167y0;
import r93.C31112c0;
import r93.C31164x;
import r93.InterfaceC31110b1;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31147o0;
import u93.AbstractC34685k0;
import va3.AbstractC35846d;
import va3.C35847e;
import va3.C35850h;

/* JADX INFO: renamed from: ya3.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39365h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f169414a = 0;

    static {
        C35847e c35847e = new C35847e("kotlin.jvm.JvmInline");
        c35847e.m113789b();
        C35850h c35850hM113796g = c35847e.f152613a.m113796g();
        C35847e c35847e2 = C35847e.f152612c;
        AbstractC35846d.m113785j(c35850hM113796g).f152613a.m113793c();
        new C35847e("kotlin.jvm.JvmName");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m125537a(InterfaceC31111c interfaceC31111c) {
        AbstractC31167y0 abstractC31167y0Mo60488I;
        AbstractC22676k.m65750j(interfaceC31111c, "<this>");
        if (!(interfaceC31111c instanceof InterfaceC31147o0)) {
            return false;
        }
        InterfaceC31145n0 interfaceC31145n0M109573J0 = ((AbstractC34685k0) ((InterfaceC31147o0) interfaceC31111c)).m109573J0();
        AbstractC22676k.m65749i(interfaceC31145n0M109573J0, "getCorrespondingProperty(...)");
        if (interfaceC31145n0M109573J0.mo78667B() != null) {
            return false;
        }
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31145n0M109573J0.mo60581g();
        InterfaceC31117e interfaceC31117e = interfaceC31135kMo60581g instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31135kMo60581g : null;
        if (interfaceC31117e == null || (abstractC31167y0Mo60488I = interfaceC31117e.mo60488I()) == null) {
            return false;
        }
        C35850h name = interfaceC31145n0M109573J0.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        return abstractC31167y0Mo60488I.mo95860a(name);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m125538b(InterfaceC31135k interfaceC31135k) {
        AbstractC22676k.m65750j(interfaceC31135k, "<this>");
        return (interfaceC31135k instanceof InterfaceC31117e) && (((InterfaceC31117e) interfaceC31135k).mo60488I() instanceof C31164x);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m125539c(InterfaceC31135k interfaceC31135k) {
        AbstractC22676k.m65750j(interfaceC31135k, "<this>");
        return (interfaceC31135k instanceof InterfaceC31117e) && (((InterfaceC31117e) interfaceC31135k).mo60488I() instanceof C31112c0);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m125540d(InterfaceC31110b1 interfaceC31110b1) {
        AbstractC22676k.m65750j(interfaceC31110b1, "<this>");
        if (interfaceC31110b1.mo78667B() != null) {
            return false;
        }
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31110b1.mo60581g();
        C35850h c35850h = null;
        InterfaceC31117e interfaceC31117e = interfaceC31135kMo60581g instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31135kMo60581g : null;
        if (interfaceC31117e != null) {
            int i13 = AbstractC4393e.f17737a;
            AbstractC31167y0 abstractC31167y0Mo60488I = interfaceC31117e.mo60488I();
            C31164x c31164x = abstractC31167y0Mo60488I instanceof C31164x ? (C31164x) abstractC31167y0Mo60488I : null;
            if (c31164x != null) {
                c35850h = c31164x.f128381a;
            }
        }
        return AbstractC22676k.m65745e(c35850h, interfaceC31110b1.getName());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m125541e(InterfaceC31135k interfaceC31135k) {
        AbstractC22676k.m65750j(interfaceC31135k, "<this>");
        return m125538b(interfaceC31135k) || m125539c(interfaceC31135k);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m125542f(AbstractC23811y abstractC23811y) {
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d != null) {
            return m125541e(interfaceC31126hMo1784d);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m125543g(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        return (interfaceC31126hMo1784d == null || !m125539c(interfaceC31126hMo1784d) || C25396m.f99492w.m74574n0(abstractC23811y)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC23763c0 m125544h(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d : null;
        if (interfaceC31117e != null) {
            int i13 = AbstractC4393e.f17737a;
            AbstractC31167y0 abstractC31167y0Mo60488I = interfaceC31117e.mo60488I();
            C31164x c31164x = abstractC31167y0Mo60488I instanceof C31164x ? (C31164x) abstractC31167y0Mo60488I : null;
            if (c31164x != null) {
                return (AbstractC23763c0) c31164x.f128382b;
            }
        }
        return null;
    }
}
