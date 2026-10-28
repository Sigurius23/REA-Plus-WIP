package ja3;

import androidx.lifecycle.C1591h2;
import com.iterable.iterableapi.C5327g1;
import ga3.C15630h;
import ha3.C17062e;
import hg3.AbstractC17269i;
import ia3.C18295a;
import ia3.C18297c;
import ia3.C18299e;
import ia3.InterfaceC18300f;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka3.C22309a;
import kb3.C22334c;
import kb3.C22336e;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import l83.C23465k;
import l83.InterfaceC23462h;
import lb3.AbstractC23773f1;
import lb3.AbstractC23811y;
import lb3.EnumC23761b1;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import m83.C25271y;
import m83.C25272z;
import ma3.InterfaceC25376e;
import p005a3.C0237p;
import p127ev.AbstractC13673n;
import p547v8.AbstractC35785b;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22709l;
import pf.AbstractC29125c;
import r80.AbstractC31061c;
import r93.AbstractC31152r;
import r93.C31161v0;
import r93.EnumC31106a0;
import r93.InterfaceC31109b0;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31165x0;
import s93.C32305g;
import se.AbstractC32417h;
import u93.AbstractC34710x;
import u93.C34695p0;
import u93.C34709w0;
import va3.C35850h;
import x93.C38108b0;
import x93.C38110c0;
import x93.C38116h;
import x93.C38131w;
import ya3.AbstractC39373p;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: ja3.a0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21500a0 extends AbstractC22713p {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ InterfaceC21493z[] f82464m;

    /* JADX INFO: renamed from: b */
    public final C41113q f82465b;

    /* JADX INFO: renamed from: c */
    public final AbstractC21500a0 f82466c;

    /* JADX INFO: renamed from: d */
    public final C22334c f82467d;

    /* JADX INFO: renamed from: e */
    public final C22340i f82468e;

    /* JADX INFO: renamed from: f */
    public final C22336e f82469f;

    /* JADX INFO: renamed from: g */
    public final C1591h2 f82470g;

    /* JADX INFO: renamed from: h */
    public final C22336e f82471h;

    /* JADX INFO: renamed from: i */
    public final C22340i f82472i;

    /* JADX INFO: renamed from: j */
    public final C22340i f82473j;

    /* JADX INFO: renamed from: k */
    public final C22340i f82474k;

    /* JADX INFO: renamed from: l */
    public final C22336e f82475l;

    static {
        C22693x c22693x = new C22693x(AbstractC21500a0.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f82464m = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(AbstractC21500a0.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, c22673i0), AbstractC31061c.m95632h(AbstractC21500a0.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, c22673i0)};
    }

    public AbstractC21500a0(C41113q c3, C21519o c21519o) {
        AbstractC22676k.m65750j(c3, "c");
        this.f82465b = c3;
        this.f82466c = c21519o;
        InterfaceC22345n interfaceC22345n = ((C18295a) c3.f177224x).f71223a;
        C21527w c21527w = new C21527w(this, 0);
        C22342k c22342k = (C22342k) interfaceC22345n;
        c22342k.getClass();
        this.f82467d = new C22334c(c22342k, c21527w);
        C21527w c21527w2 = new C21527w(this, 1);
        C22342k c22342k2 = (C22342k) interfaceC22345n;
        c22342k2.getClass();
        this.f82468e = new C22340i(c22342k2, c21527w2);
        this.f82469f = ((C22342k) interfaceC22345n).m64223b(new C21529y(this, 0));
        this.f82470g = ((C22342k) interfaceC22345n).m64224c(new C21529y(this, 1));
        this.f82471h = ((C22342k) interfaceC22345n).m64223b(new C21529y(this, 2));
        C21527w c21527w3 = new C21527w(this, 2);
        C22342k c22342k3 = (C22342k) interfaceC22345n;
        c22342k3.getClass();
        this.f82472i = new C22340i(c22342k3, c21527w3);
        C21527w c21527w4 = new C21527w(this, 3);
        C22342k c22342k4 = (C22342k) interfaceC22345n;
        c22342k4.getClass();
        this.f82473j = new C22340i(c22342k4, c21527w4);
        C21527w c21527w5 = new C21527w(this, 4);
        C22342k c22342k5 = (C22342k) interfaceC22345n;
        c22342k5.getClass();
        this.f82474k = new C22340i(c22342k5, c21527w5);
        this.f82475l = ((C22342k) interfaceC22345n).m64223b(new C21529y(this, 3));
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC23811y m60465e(C38131w method, C41113q c41113q) {
        AbstractC22676k.m65750j(method, "method");
        return ((C0237p) c41113q.f177222E).m695Z(method.m122127l(), AbstractC35785b.m113400W(EnumC23761b1.f94124x, method.m122118b().f163232a.isAnnotation(), null, 6));
    }

    /* JADX INFO: renamed from: n */
    public static C5327g1 m60466n(C41113q c41113q, AbstractC34710x abstractC34710x, List list) {
        C23465k c23465k;
        C35850h c35850hM122093b;
        C0237p c0237p = (C0237p) c41113q.f177222E;
        C18295a c18295a = (C18295a) c41113q.f177224x;
        InterfaceC31109b0 interfaceC31109b0 = c18295a.f71237o;
        C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(list);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
        Iterator it = c25263qM74105J1.iterator();
        boolean z4 = false;
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                return new C5327g1(AbstractC25265s.m74093D1(arrayList), z4);
            }
            C25239c0 c25239c0 = (C25239c0) c25241d0.next();
            int i13 = c25239c0.f99117a;
            C38110c0 c38110c0 = (C38110c0) c25239c0.f99118b;
            C18297c c18297cM48897j0 = AbstractC17269i.m48897j0(c41113q, c38110c0);
            C22309a c22309aM113400W = AbstractC35785b.m113400W(EnumC23761b1.f94124x, false, null, 7);
            if (c38110c0.m122095d()) {
                InterfaceC25376e interfaceC25376eM122094c = c38110c0.m122094c();
                C38116h c38116h = interfaceC25376eM122094c instanceof C38116h ? (C38116h) interfaceC25376eM122094c : null;
                if (c38116h == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + c38110c0);
                }
                AbstractC23773f1 abstractC23773f1M694Y = c0237p.m694Y(c38116h, c22309aM113400W, true);
                c23465k = new C23465k(abstractC23773f1M694Y, interfaceC31109b0.mo78661c().m83818f(abstractC23773f1M694Y));
            } else {
                c23465k = new C23465k(c0237p.m695Z(c38110c0.m122094c(), c22309aM113400W), null);
            }
            AbstractC23811y abstractC23811y = (AbstractC23811y) c23465k.f92937w;
            AbstractC23811y abstractC23811y2 = (AbstractC23811y) c23465k.f92938x;
            if (AbstractC22676k.m65745e(abstractC34710x.getName().m113817b(), "equals") && list.size() == 1 && interfaceC31109b0.mo78661c().m83828p().equals(abstractC23811y)) {
                c35850hM122093b = C35850h.m113814e("other");
            } else {
                c35850hM122093b = c38110c0.m122093b();
                if (c35850hM122093b == null) {
                    z4 = true;
                }
                if (c35850hM122093b == null) {
                    c35850hM122093b = C35850h.m113814e("p" + i13);
                }
            }
            arrayList.add(new C34709w0(abstractC34710x, null, i13, c18297cM48897j0, c35850hM122093b, abstractC23811y, false, false, false, abstractC23811y2, c18295a.f71232j.m118692c(c38110c0)));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Set mo60467a(C22704g c22704g, Function1 function1);

    /* JADX INFO: renamed from: b */
    public abstract Set mo60468b(C22704g c22704g, C22709l c22709l);

    /* JADX INFO: renamed from: c */
    public void mo60469c(ArrayList arrayList, C35850h name) {
        AbstractC22676k.m65750j(name, "name");
    }

    /* JADX INFO: renamed from: d */
    public abstract InterfaceC21503c mo60470d();

    /* JADX INFO: renamed from: f */
    public abstract void mo60471f(LinkedHashSet linkedHashSet, C35850h c35850h);

    /* JADX INFO: renamed from: g */
    public abstract void mo60472g(ArrayList arrayList, C35850h c35850h);

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        return (Set) AbstractC29125c.m88494C(this.f82474k, f82464m[2]);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        return (Collection) this.f82467d.invoke();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return !getFunctionNames().contains(name) ? C25271y.f99162w : (Collection) this.f82471h.invoke(name);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        return !getVariableNames().contains(name) ? C25271y.f99162w : (Collection) this.f82475l.invoke(name);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getFunctionNames() {
        return (Set) AbstractC29125c.m88494C(this.f82472i, f82464m[0]);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getVariableNames() {
        return (Set) AbstractC29125c.m88494C(this.f82473j, f82464m[1]);
    }

    /* JADX INFO: renamed from: h */
    public abstract Set mo60473h(C22704g c22704g);

    /* JADX INFO: renamed from: i */
    public abstract InterfaceC31151q0 mo60474i();

    /* JADX INFO: renamed from: j */
    public abstract InterfaceC31135k mo60475j();

    /* JADX INFO: renamed from: k */
    public boolean mo60476k(C17062e c17062e) {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public abstract C21530z mo60477l(C38131w c38131w, ArrayList arrayList, AbstractC23811y abstractC23811y, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: m */
    public final C17062e m60478m(C38131w method) {
        EnumC31106a0 enumC31106a0;
        Map mapM73989X;
        AbstractC22676k.m65750j(method, "method");
        C41113q c41113q = this.f82465b;
        C17062e c17062eM48183Y0 = C17062e.m48183Y0(mo60475j(), AbstractC17269i.m48897j0(c41113q, method), method.m122119d(), ((C18295a) c41113q.f177224x).f71232j.m118692c(method), ((InterfaceC21503c) this.f82468e.invoke()).mo60463e(method.m122119d()) != null && ((ArrayList) method.m122128m()).isEmpty());
        AbstractC22676k.m65750j(c41113q, "<this>");
        C41113q c41113q2 = new C41113q((C18295a) c41113q.f177224x, new C18299e(c41113q, c17062eM48183Y0, method, 0), (InterfaceC23462h) c41113q.f177226z);
        ArrayList typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC31165x0 interfaceC31165x0Mo52687a = ((InterfaceC18300f) c41113q2.f177225y).mo52687a((C38108b0) it.next());
            AbstractC22676k.m65747g(interfaceC31165x0Mo52687a);
            arrayList.add(interfaceC31165x0Mo52687a);
        }
        C5327g1 c5327g1M60466n = m60466n(c41113q2, c17062eM48183Y0, method.m122128m());
        C21530z c21530zMo60477l = mo60477l(method, arrayList, m60465e(method, c41113q2), c5327g1M60466n.m16441c());
        AbstractC23811y abstractC23811yM60523c = c21530zMo60477l.m60523c();
        C34695p0 c34695p0M125576j = abstractC23811yM60523c != null ? AbstractC39373p.m125576j(c17062eM48183Y0, abstractC23811yM60523c, C32305g.f133684a) : null;
        InterfaceC31151q0 interfaceC31151q0Mo60474i = mo60474i();
        List listM60525e = c21530zMo60477l.m60525e();
        List listM60526f = c21530zMo60477l.m60526f();
        AbstractC23811y abstractC23811yM60524d = c21530zMo60477l.m60524d();
        C31161v0 c31161v0 = EnumC31106a0.f128309w;
        boolean zM122122g = method.m122122g();
        boolean zM122123h = method.m122123h();
        c31161v0.getClass();
        if (zM122122g) {
            enumC31106a0 = EnumC31106a0.f128307E;
        } else {
            enumC31106a0 = !zM122123h ? EnumC31106a0.f128312z : EnumC31106a0.f128310x;
        }
        EnumC31106a0 enumC31106a1 = enumC31106a0;
        AbstractC31152r abstractC31152rM101190U = AbstractC32417h.m101190U(method.m122121f());
        if (c21530zMo60477l.m60523c() != null) {
            mapM73989X = AbstractC25247g0.m73989X(new C23465k(C17062e.f65587g0, AbstractC25265s.m74096F0(c5327g1M60466n.m16441c())));
        } else {
            mapM73989X = C25272z.f99163w;
        }
        c17062eM48183Y0.mo48185X0(c34695p0M125576j, interfaceC31151q0Mo60474i, C25271y.f99162w, listM60525e, listM60526f, abstractC23811yM60524d, enumC31106a1, abstractC31152rM101190U, mapM73989X);
        c17062eM48183Y0.f65589e0 = AbstractC13673n.m38554a(c21530zMo60477l.m60522b(), c5327g1M60466n.m16442d());
        if (c21530zMo60477l.m60521a().isEmpty()) {
            return c17062eM48183Y0;
        }
        C15630h c15630h = ((C18295a) c41113q2.f177224x).f71227e;
        List listM60521a = c21530zMo60477l.m60521a();
        c15630h.getClass();
        if (listM60521a != null) {
            throw new UnsupportedOperationException("Should not be called");
        }
        C15630h.m43957a(6);
        throw null;
    }

    public String toString() {
        return "Lazy scope for " + mo60475j();
    }
}
