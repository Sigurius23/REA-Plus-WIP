package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import j93.InterfaceC21493z;
import java.util.Collection;
import java.util.List;
import jb3.C21548h;
import kb3.C22340i;
import kb3.C22342k;
import m83.AbstractC25265s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import r80.AbstractC31061c;
import r93.EnumC31120f;
import r93.InterfaceC31126h;
import r93.InterfaceC31145n0;
import u93.C34697q0;
import ub3.C34752f;
import va3.C35850h;
import z93.InterfaceC40210a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C22716s extends AbstractC22713p {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC21493z[] f89382f;

    /* JADX INFO: renamed from: b */
    public final C21548h f89383b;

    /* JADX INFO: renamed from: c */
    public final boolean f89384c;

    /* JADX INFO: renamed from: d */
    public final C22340i f89385d;

    /* JADX INFO: renamed from: e */
    public final C22340i f89386e;

    static {
        C22693x c22693x = new C22693x(C22716s.class, "functions", "getFunctions()Ljava/util/List;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f89382f = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(C22716s.class, "properties", "getProperties()Ljava/util/List;", 0, c22673i0)};
    }

    public C22716s(C22342k storageManager, C21548h c21548h, boolean z4) {
        AbstractC22676k.m65750j(storageManager, "storageManager");
        this.f89383b = c21548h;
        this.f89384c = z4;
        EnumC31120f enumC31120f = EnumC31120f.f128328w;
        this.f89385d = new C22340i(storageManager, new C22715r(this, 0));
        this.f89386e = new C22340i(storageManager, new C22715r(this, 1));
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final InterfaceC31126h getContributedClassifier(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        return null;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedDescriptors(C22704g kindFilter, Function1 function1) {
        AbstractC22676k.m65750j(kindFilter, "kindFilter");
        InterfaceC21493z[] interfaceC21493zArr = f89382f;
        return AbstractC25265s.m74129g1((List) AbstractC29125c.m88494C(this.f89385d, interfaceC21493zArr[0]), (List) AbstractC29125c.m88494C(this.f89386e, interfaceC21493zArr[1]));
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22714q
    public final Collection getContributedFunctions(C35850h name, InterfaceC40210a location) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(location, "location");
        List list = (List) AbstractC29125c.m88494C(this.f89385d, f89382f[0]);
        C34752f c34752f = new C34752f();
        for (Object obj : list) {
            if (AbstractC22676k.m65745e(((C34697q0) obj).getName(), name)) {
                c34752f.add(obj);
            }
        }
        return c34752f;
    }

    @Override // p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22713p, p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o
    public final Collection getContributedVariables(C35850h name, InterfaceC40210a interfaceC40210a) {
        AbstractC22676k.m65750j(name, "name");
        List list = (List) AbstractC29125c.m88494C(this.f89386e, f89382f[1]);
        C34752f c34752f = new C34752f();
        for (Object obj : list) {
            if (AbstractC22676k.m65745e(((InterfaceC31145n0) obj).getName(), name)) {
                c34752f.add(obj);
            }
        }
        return c34752f;
    }
}
