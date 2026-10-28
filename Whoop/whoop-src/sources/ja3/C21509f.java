package ja3;

import ab3.AbstractC0715g;
import ab3.C0709a;
import ab3.C0716h;
import ab3.C0717i;
import ab3.C0725q;
import ab3.C0728t;
import ab3.C0730v;
import ab3.C0733y;
import bi.AbstractC3269g;
import cb3.AbstractC4393e;
import fa3.AbstractC14331x;
import ha3.InterfaceC17064g;
import ia3.C18295a;
import j93.InterfaceC21493z;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kb3.C22339h;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import lb3.AbstractC23763c0;
import lb3.AbstractC23791o;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.EnumC23761b1;
import lb3.EnumC23776g1;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ma3.InterfaceC25372a;
import ma3.InterfaceC25376e;
import nb3.C26555l;
import nb3.EnumC26554k;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import p005a3.C0237p;
import p547v8.AbstractC35785b;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import r80.AbstractC31061c;
import r93.InterfaceC31108b;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31155s0;
import r93.InterfaceC31165x0;
import u93.AbstractC34711x0;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import w93.C36973f;
import x93.AbstractC38109c;
import x93.C38111d;
import x93.C38112d0;
import x93.C38114f;
import x93.C38115g;
import x93.C38116h;
import x93.C38123o;
import x93.C38124p;
import x93.C38127s;
import x93.C38129u;
import x93.C38133y;
import xa3.C38148i;

/* JADX INFO: renamed from: ja3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C21509f implements InterfaceC17064g {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC21493z[] f82491h;

    /* JADX INFO: renamed from: a */
    public final C41113q f82492a;

    /* JADX INFO: renamed from: b */
    public final C38111d f82493b;

    /* JADX INFO: renamed from: c */
    public final C22339h f82494c;

    /* JADX INFO: renamed from: d */
    public final C22340i f82495d;

    /* JADX INFO: renamed from: e */
    public final C36973f f82496e;

    /* JADX INFO: renamed from: f */
    public final C22340i f82497f;

    /* JADX INFO: renamed from: g */
    public final boolean f82498g;

    static {
        C22693x c22693x = new C22693x(C21509f.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f82491h = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(C21509f.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, c22673i0), AbstractC31061c.m95632h(C21509f.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, c22673i0)};
    }

    public C21509f(C38111d javaAnnotation, C41113q c3, boolean z4) {
        AbstractC22676k.m65750j(c3, "c");
        AbstractC22676k.m65750j(javaAnnotation, "javaAnnotation");
        this.f82492a = c3;
        this.f82493b = javaAnnotation;
        C18295a c18295a = (C18295a) c3.f177224x;
        InterfaceC22345n interfaceC22345n = c18295a.f71223a;
        C21507e c21507e = new C21507e(this, 0);
        C22342k c22342k = (C22342k) interfaceC22345n;
        c22342k.getClass();
        this.f82494c = new C22339h(c22342k, c21507e);
        C21507e c21507e2 = new C21507e(this, 1);
        C22342k c22342k2 = (C22342k) interfaceC22345n;
        c22342k2.getClass();
        this.f82495d = new C22340i(c22342k2, c21507e2);
        this.f82496e = c18295a.f71232j.m118692c(javaAnnotation);
        C21507e c21507e3 = new C21507e(this, 2);
        C22342k c22342k3 = (C22342k) interfaceC22345n;
        c22342k3.getClass();
        this.f82497f = new C22340i(c22342k3, c21507e3);
        this.f82498g = z4;
    }

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: a */
    public final Map mo43952a() {
        return (Map) AbstractC29125c.m88494C(this.f82497f, f82491h[2]);
    }

    @Override // s93.InterfaceC32300b
    /* JADX INFO: renamed from: b */
    public final C35847e mo43953b() {
        InterfaceC21493z p13 = f82491h[0];
        C22339h c22339h = this.f82494c;
        AbstractC22676k.m65750j(c22339h, "<this>");
        AbstractC22676k.m65750j(p13, "p");
        return (C35847e) c22339h.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final AbstractC0715g m60481c(InterfaceC25372a interfaceC25372a) {
        InterfaceC25376e c38116h;
        AbstractC23811y abstractC23811yM83820h;
        if (interfaceC25372a instanceof C38129u) {
            return C0716h.m1780c(((C38129u) interfaceC25372a).f163239b, null);
        }
        if (interfaceC25372a instanceof C38127s) {
            Enum r10 = ((C38127s) interfaceC25372a).f163237b;
            Class<?> enclosingClass = r10.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            AbstractC22676k.m65747g(enclosingClass);
            return new C0717i(AbstractC38109c.m122089a(enclosingClass), C35850h.m113814e(r10.name()));
        }
        boolean z4 = interfaceC25372a instanceof C38115g;
        C41113q c41113q = this.f82492a;
        if (z4) {
            C38115g c38115g = (C38115g) interfaceC25372a;
            C35850h c35850h = c38115g.f163221a;
            if (c35850h == null) {
                c35850h = AbstractC14331x.f52307b;
            }
            AbstractC22676k.m65747g(c35850h);
            ArrayList arrayListM122099a = c38115g.m122099a();
            if (!AbstractC23791o.m69886e((AbstractC23763c0) AbstractC29125c.m88494C(this.f82495d, f82491h[1]))) {
                InterfaceC31117e interfaceC31117eM13806d = AbstractC4393e.m13806d(this);
                AbstractC22676k.m65747g(interfaceC31117eM13806d);
                InterfaceC31108b interfaceC31108bM9475C = AbstractC3269g.m9475C(c35850h, interfaceC31117eM13806d);
                if (interfaceC31108bM9475C == null || (abstractC23811yM83820h = ((AbstractC34711x0) interfaceC31108bM9475C).getType()) == null) {
                    AbstractC27736h abstractC27736hMo78661c = ((C18295a) c41113q.f177224x).f71237o.mo78661c();
                    EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
                    abstractC23811yM83820h = abstractC27736hMo78661c.m83820h(C26555l.m78682c(EnumC26554k.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM122099a, 10));
                Iterator it = arrayListM122099a.iterator();
                while (it.hasNext()) {
                    AbstractC0715g abstractC0715gM60481c = m60481c((InterfaceC25372a) it.next());
                    if (abstractC0715gM60481c == null) {
                        abstractC0715gM60481c = new C0730v(null);
                    }
                    arrayList.add(abstractC0715gM60481c);
                }
                return new C0733y(arrayList, abstractC23811yM83820h);
            }
        } else {
            if (interfaceC25372a instanceof C38114f) {
                return new C0709a((Object) new C21509f(new C38111d(((C38114f) interfaceC25372a).f163222b), c41113q, false));
            }
            if (interfaceC25372a instanceof C38123o) {
                Class cls = ((C38123o) interfaceC25372a).f163233b;
                if (cls.isPrimitive()) {
                    c38116h = new C38133y(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    c38116h = new C38116h(cls);
                } else {
                    c38116h = cls instanceof WildcardType ? new C38112d0((WildcardType) cls) : new C38124p(cls);
                }
                AbstractC23811y abstractC23811yM695Z = ((C0237p) c41113q.f177222E).m695Z(c38116h, AbstractC35785b.m113400W(EnumC23761b1.f94124x, false, null, 7));
                if (!AbstractC23791o.m69886e(abstractC23811yM695Z)) {
                    AbstractC23811y abstractC23811yMo69868b = abstractC23811yM695Z;
                    int i13 = 0;
                    while (AbstractC27736h.m83814z(abstractC23811yMo69868b)) {
                        abstractC23811yMo69868b = ((AbstractC23804u0) AbstractC25265s.m74142p1(abstractC23811yMo69868b.mo69842X())).mo69868b();
                        AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                        i13++;
                    }
                    InterfaceC31126h interfaceC31126hMo1784d = abstractC23811yMo69868b.mo69844i0().mo1784d();
                    if (interfaceC31126hMo1784d instanceof InterfaceC31117e) {
                        C35845c c35845cM13808f = AbstractC4393e.m13808f(interfaceC31126hMo1784d);
                        return c35845cM13808f == null ? new C0728t(new C0725q(abstractC23811yM695Z)) : new C0728t(c35845cM13808f, i13);
                    }
                    if (interfaceC31126hMo1784d instanceof InterfaceC31165x0) {
                        C35847e c35847eM113798i = AbstractC27741m.f111843a.m113798i();
                        return new C0728t(new C35845c(c35847eM113798i.m113789b(), c35847eM113798i.f152613a.m113796g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // s93.InterfaceC32300b
    public final InterfaceC31155s0 getSource() {
        return this.f82496e;
    }

    @Override // s93.InterfaceC32300b
    public final AbstractC23811y getType() {
        return (AbstractC23763c0) AbstractC29125c.m88494C(this.f82495d, f82491h[1]);
    }

    public final String toString() {
        return C38148i.f163318c.m122220x(this, null);
    }
}
