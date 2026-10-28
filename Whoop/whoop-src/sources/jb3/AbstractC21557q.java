package jb3;

import c93.InterfaceC4339a;
import fa3.C14328u;
import hb3.C17119i;
import hb3.C17122k;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kb3.C22339h;
import kb3.C22340i;
import kb3.C22342k;
import m83.AbstractC25269w;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import pf.AbstractC29125c;
import r80.AbstractC31061c;
import r93.InterfaceC31126h;
import r93.InterfaceC31163w0;
import ub3.AbstractC34756j;
import va3.C35845c;
import va3.C35850h;
import ya3.C39366i;
import z93.EnumC40212c;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: jb3.q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21557q extends AbstractC22713p {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC21493z[] f82671f;

    /* JADX INFO: renamed from: b */
    public final C17122k f82672b;

    /* JADX INFO: renamed from: c */
    public final C21556p f82673c;

    /* JADX INFO: renamed from: d */
    public final C22340i f82674d;

    /* JADX INFO: renamed from: e */
    public final C22339h f82675e;

    static {
        C22693x c22693x = new C22693x(AbstractC21557q.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f82671f = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(AbstractC21557q.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, c22673i0)};
    }

    public AbstractC21557q(C17122k c3, List functionList, List propertyList, List typeAliasList, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(c3, "c");
        AbstractC22676k.m65750j(functionList, "functionList");
        AbstractC22676k.m65750j(propertyList, "propertyList");
        AbstractC22676k.m65750j(typeAliasList, "typeAliasList");
        this.f82672b = c3;
        C17119i c17119i = c3.f65760a;
        c17119i.f65737c.getClass();
        this.f82673c = new C21556p(this, functionList, propertyList, typeAliasList);
        C22342k c22342k = c17119i.f65735a;
        C21552l c21552l = new C21552l(interfaceC4339a, 0);
        c22342k.getClass();
        this.f82674d = new C22340i(c22342k, c21552l);
        C14328u c14328u = new C14328u(this, 4);
        c22342k.getClass();
        this.f82675e = new C22339h(c22342k, c14328u);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo60570a(ArrayList arrayList, Function1 function1);

    /* JADX INFO: renamed from: b */
    public final Collection m60586b(C22704g kindFilter, Function1 function1) {
        EnumC40212c enumC40212c = EnumC40212c.f173640z;
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (kindFilter.m65789a(C22704g.f89356f)) {
            mo60570a(arrayList, function1);
        }
        C21556p c21556p = this.f82673c;
        c21556p.getClass();
        boolean zM65789a = kindFilter.m65789a(C22704g.f89360j);
        C39366i c39366i = C39366i.f169415w;
        if (zM65789a) {
            Set<C35850h> set = (Set) AbstractC29125c.m88494C(c21556p.f82669h, C21556p.f82661j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (C35850h c35850h : set) {
                if (((Boolean) function1.invoke(c35850h)).booleanValue()) {
                    arrayList2.addAll(c21556p.m60585b(c35850h, enumC40212c));
                }
            }
            AbstractC25269w.m74166l0(arrayList2, c39366i);
            arrayList.addAll(arrayList2);
        }
        if (kindFilter.m65789a(C22704g.f89359i)) {
            Set<C35850h> set2 = (Set) AbstractC29125c.m88494C(c21556p.f82668g, C21556p.f82661j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (C35850h c35850h2 : set2) {
                if (((Boolean) function1.invoke(c35850h2)).booleanValue()) {
                    arrayList3.addAll(c21556p.m60584a(c35850h2, enumC40212c));
                }
            }
            AbstractC25269w.m74166l0(arrayList3, c39366i);
            arrayList.addAll(arrayList3);
        }
        if (kindFilter.m65789a(C22704g.f89362l)) {
            for (C35850h c35850h3 : m60587f()) {
                if (((Boolean) function1.invoke(c35850h3)).booleanValue()) {
                    AbstractC34756j.m109751a(arrayList, this.f82672b.f65760a.m48364b(mo60573e(c35850h3)));
                }
            }
        }
        if (kindFilter.m65789a(C22704g.f89357g)) {
            for (Object name : c21556p.f82664c.keySet()) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    c21556p.getClass();
                    AbstractC22676k.m65750j(name, "name");
                    AbstractC34756j.m109751a(arrayList, (InterfaceC31163w0) c21556p.f82667f.invoke(name));
                }
            }
        }
        return AbstractC34756j.m109752b(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public void mo60571c(ArrayList arrayList, C35850h name) {
        AbstractC22676k.m65750j(name, "name");
    }

    /* JADX INFO: renamed from: d */
    public void mo60572d(ArrayList arrayList, C35850h name) {
        AbstractC22676k.m65750j(name, "name");
    }

    /* JADX INFO: renamed from: e */
    public abstract C35845c mo60573e(C35850h c35850h);

    /* JADX INFO: renamed from: f */
    public final Set m60587f() {
        return (Set) AbstractC29125c.m88494C(this.f82674d, f82671f[0]);
    }

    /* JADX INFO: renamed from: g */
    public abstract Set mo60574g();

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getClassifierNames() {
        InterfaceC21493z p13 = f82671f[1];
        C22339h c22339h = this.f82675e;
        AbstractC22676k.m65750j(c22339h, "<this>");
        AbstractC22676k.m65750j(p13, "p");
        return (Set) c22339h.invoke();
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        if (mo60588j(name)) {
            return this.f82672b.f65760a.m48364b(mo60573e(name));
        }
        C21556p c21556p = this.f82673c;
        if (!c21556p.f82664c.keySet().contains(name)) {
            return null;
        }
        c21556p.getClass();
        return (InterfaceC31163w0) c21556p.f82667f.invoke(name);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return this.f82673c.m60584a(name, location);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        return this.f82673c.m60585b(name, interfaceC40210a);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getFunctionNames() {
        return (Set) AbstractC29125c.m88494C(this.f82673c.f82668g, C21556p.f82661j[0]);
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Set getVariableNames() {
        return (Set) AbstractC29125c.m88494C(this.f82673c.f82669h, C21556p.f82661j[1]);
    }

    /* JADX INFO: renamed from: h */
    public abstract Set mo60575h();

    /* JADX INFO: renamed from: i */
    public abstract Set mo60576i();

    /* JADX INFO: renamed from: j */
    public boolean mo60588j(C35850h name) {
        AbstractC22676k.m65750j(name, "name");
        return m60587f().contains(name);
    }

    /* JADX INFO: renamed from: k */
    public boolean mo60577k(C21560t c21560t) {
        return true;
    }
}
