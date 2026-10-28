package cb3;

import java.util.Collection;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import mb3.AbstractC25390g;
import o93.AbstractC27736h;
import p027b3.C2365d3;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import r93.InterfaceC31107a1;
import r93.InterfaceC31109b0;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import r93.InterfaceC31129i;
import r93.InterfaceC31135k;
import r93.InterfaceC31138l;
import r93.InterfaceC31142m0;
import r93.InterfaceC31145n0;
import s93.AbstractC32306h;
import s93.InterfaceC32300b;
import u93.AbstractC34677g0;
import u93.AbstractC34685k0;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;
import wb3.AbstractC37056f;
import xa0.C38136a;
import xb3.AbstractC38176k;
import xb3.C38172g;
import xb3.InterfaceC38174i;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: cb3.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4393e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f17737a = 0;

    static {
        C35850h.m113814e("value");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m13803a(InterfaceC31107a1 interfaceC31107a1) {
        Boolean boolM100569r = AbstractC32306h.m100569r(AbstractC37056f.m118958J(interfaceC31107a1), C4389a.f17729x, C4391c.f17733w);
        AbstractC22676k.m65749i(boolM100569r, "ifAny(...)");
        return boolM100569r.booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC31111c m13804b(InterfaceC31111c interfaceC31111c, Function1 function1) {
        AbstractC22676k.m65750j(interfaceC31111c, "<this>");
        return (InterfaceC31111c) AbstractC32306h.m100561i(AbstractC37056f.m118958J(interfaceC31111c), new C4389a(1), new C4392d(function1, new C22669g0()));
    }

    /* JADX INFO: renamed from: c */
    public static final C35847e m13805c(InterfaceC31138l interfaceC31138l) {
        AbstractC22676k.m65750j(interfaceC31138l, "<this>");
        C35848f c35848fM13810h = m13810h(interfaceC31138l);
        if (!c35848fM13810h.m113794d()) {
            c35848fM13810h = null;
        }
        if (c35848fM13810h != null) {
            return c35848fM13810h.m113798i();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC31117e m13806d(InterfaceC32300b interfaceC32300b) {
        AbstractC22676k.m65750j(interfaceC32300b, "<this>");
        InterfaceC31126h interfaceC31126hMo1784d = interfaceC32300b.getType().mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d instanceof InterfaceC31117e) {
            return (InterfaceC31117e) interfaceC31126hMo1784d;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC27736h m13807e(InterfaceC31135k interfaceC31135k) {
        AbstractC22676k.m65750j(interfaceC31135k, "<this>");
        return m13812j(interfaceC31135k).mo78661c();
    }

    /* JADX INFO: renamed from: f */
    public static final C35845c m13808f(InterfaceC31126h interfaceC31126h) {
        InterfaceC31135k interfaceC31135kMo60581g;
        C35845c c35845cM13808f;
        if (interfaceC31126h == null || (interfaceC31135kMo60581g = interfaceC31126h.mo60581g()) == null) {
            return null;
        }
        if (interfaceC31135kMo60581g instanceof InterfaceC31124g0) {
            C35847e c35847e = ((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135kMo60581g)).f146067F;
            C35850h name = interfaceC31126h.getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            return new C35845c(c35847e, name);
        }
        if (!(interfaceC31135kMo60581g instanceof InterfaceC31129i) || (c35845cM13808f = m13808f((InterfaceC31126h) interfaceC31135kMo60581g)) == null) {
            return null;
        }
        C35850h name2 = interfaceC31126h.getName();
        AbstractC22676k.m65749i(name2, "getName(...)");
        return c35845cM13808f.m113775d(name2);
    }

    /* JADX INFO: renamed from: g */
    public static final C35847e m13809g(InterfaceC31135k interfaceC31135k) {
        AbstractC22676k.m65750j(interfaceC31135k, "<this>");
        C35847e c35847eM125525g = AbstractC39363f.m125525g(interfaceC31135k);
        return c35847eM125525g != null ? c35847eM125525g : AbstractC39363f.m125524f(interfaceC31135k.mo60581g()).m113791a(interfaceC31135k.getName()).m113798i();
    }

    /* JADX INFO: renamed from: h */
    public static final C35848f m13810h(InterfaceC31135k interfaceC31135k) {
        AbstractC22676k.m65750j(interfaceC31135k, "<this>");
        C35848f c35848fM125524f = AbstractC39363f.m125524f(interfaceC31135k);
        AbstractC22676k.m65749i(c35848fM125524f, "getFqName(...)");
        return c35848fM125524f;
    }

    /* JADX INFO: renamed from: i */
    public static final void m13811i(InterfaceC31109b0 interfaceC31109b0) {
        AbstractC22676k.m65750j(interfaceC31109b0, "<this>");
        if (interfaceC31109b0.mo78665r(AbstractC25390g.f99475a) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC31109b0 m13812j(InterfaceC31135k interfaceC31135k) {
        AbstractC22676k.m65750j(interfaceC31135k, "<this>");
        InterfaceC31109b0 interfaceC31109b0M125521c = AbstractC39363f.m125521c(interfaceC31135k);
        AbstractC22676k.m65749i(interfaceC31109b0M125521c, "getContainingModule(...)");
        return interfaceC31109b0M125521c;
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC31111c m13813k(InterfaceC31111c interfaceC31111c) {
        AbstractC22676k.m65750j(interfaceC31111c, "<this>");
        if (!(interfaceC31111c instanceof InterfaceC31142m0)) {
            return interfaceC31111c;
        }
        InterfaceC31145n0 interfaceC31145n0M109573J0 = ((AbstractC34685k0) ((InterfaceC31142m0) interfaceC31111c)).m109573J0();
        AbstractC22676k.m65749i(interfaceC31145n0M109573J0, "getCorrespondingProperty(...)");
        return interfaceC31145n0M109573J0;
    }

    /* JADX INFO: renamed from: l */
    public static final C38172g m13814l(InterfaceC31111c interfaceC31111c) {
        AbstractC22676k.m65750j(interfaceC31111c, "<this>");
        C2365d3 c2365d3 = new C2365d3(interfaceC31111c, 3);
        Collection collectionMo78673h = interfaceC31111c.mo78673h();
        AbstractC22676k.m65749i(collectionMo78673h, "getOverriddenDescriptors(...)");
        return AbstractC38176k.m122286v(AbstractC25260n.m74050X(new InterfaceC38174i[]{c2365d3, AbstractC38176k.m122284t(AbstractC25265s.m74145r0(collectionMo78673h), new C4390b(1))}), new C38136a(3));
    }
}
