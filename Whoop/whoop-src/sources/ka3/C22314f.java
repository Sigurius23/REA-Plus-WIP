package ka3;

import com.google.crypto.tink.internal.C5101l0;
import java.util.ArrayList;
import java.util.List;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23791o;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.AbstractC23812y0;
import lb3.C23784k0;
import lb3.C23806v0;
import lb3.EnumC23761b1;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m83.AbstractC25267u;
import nb3.C26555l;
import nb3.EnumC26554k;
import o93.AbstractC27736h;
import p097ds.AbstractC12313p;
import p249jc.C21567b;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ka3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C22314f extends AbstractC23812y0 {

    /* JADX INFO: renamed from: c */
    public static final C22309a f87083c;

    /* JADX INFO: renamed from: d */
    public static final C22309a f87084d;

    /* JADX INFO: renamed from: b */
    public final C5101l0 f87085b = new C5101l0(new C21567b(6));

    static {
        EnumC23761b1 enumC23761b1 = EnumC23761b1.f94124x;
        f87083c = C22309a.m64108a(AbstractC35785b.m113400W(enumC23761b1, false, null, 5), EnumC22310b.f87073y, false, null, null, 61);
        f87084d = C22309a.m64108a(AbstractC35785b.m113400W(enumC23761b1, false, null, 5), EnumC22310b.f87072x, false, null, null, 61);
    }

    @Override // lb3.AbstractC23812y0
    /* JADX INFO: renamed from: d */
    public final AbstractC23804u0 mo64119d(AbstractC23811y abstractC23811y) {
        return new C23806v0(m64121h(abstractC23811y, new C22309a(EnumC23761b1.f94124x, false, false, null, 62)));
    }

    /* JADX INFO: renamed from: g */
    public final C23465k m64120g(AbstractC23763c0 abstractC23763c0, InterfaceC31117e interfaceC31117e, C22309a c22309a) {
        if (abstractC23763c0.mo69844i0().getParameters().isEmpty()) {
            return new C23465k(abstractC23763c0, Boolean.FALSE);
        }
        if (AbstractC27736h.m83814z(abstractC23763c0)) {
            AbstractC23804u0 abstractC23804u0 = (AbstractC23804u0) abstractC23763c0.mo69842X().get(0);
            EnumC23776g1 enumC23776g1Mo69867a = abstractC23804u0.mo69867a();
            AbstractC23811y abstractC23811yMo69868b = abstractC23804u0.mo69868b();
            AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
            return new C23465k(AbstractC23791o.m69890i(AbstractC37056f.m118958J(new C23806v0(m64121h(abstractC23811yMo69868b, c22309a), enumC23776g1Mo69867a)), abstractC23763c0.mo69843Y(), abstractC23763c0.mo69844i0(), abstractC23763c0.mo69814k0()), Boolean.FALSE);
        }
        if (AbstractC23791o.m69886e(abstractC23763c0)) {
            return new C23465k(C26555l.m78682c(EnumC26554k.ERROR_RAW_TYPE, abstractC23763c0.mo69844i0().toString()), Boolean.FALSE);
        }
        InterfaceC22712o interfaceC22712oMo95863n = interfaceC31117e.mo95863n(this);
        AbstractC22676k.m65749i(interfaceC22712oMo95863n, "getMemberScope(...)");
        C23784k0 c23784k0Mo69843Y = abstractC23763c0.mo69843Y();
        InterfaceC23796q0 interfaceC23796q0Mo60496e = interfaceC31117e.mo60496e();
        AbstractC22676k.m65749i(interfaceC23796q0Mo60496e, "getTypeConstructor(...)");
        List parameters = interfaceC31117e.mo60496e().getParameters();
        AbstractC22676k.m65749i(parameters, "getParameters(...)");
        List<InterfaceC31165x0> list = parameters;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (InterfaceC31165x0 interfaceC31165x0 : list) {
            AbstractC22676k.m65747g(interfaceC31165x0);
            C5101l0 c5101l0 = this.f87085b;
            arrayList.add(C21567b.m60605k(interfaceC31165x0, c22309a, c5101l0, c5101l0.m16037P(interfaceC31165x0, c22309a)));
        }
        return new C23465k(AbstractC23791o.m69893l(c23784k0Mo69843Y, interfaceC23796q0Mo60496e, arrayList, abstractC23763c0.mo69814k0(), interfaceC22712oMo95863n, new C22313e(interfaceC31117e, this, abstractC23763c0, c22309a)), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC23811y m64121h(AbstractC23811y abstractC23811y, C22309a c22309a) {
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d instanceof InterfaceC31165x0) {
            return m64121h(this.f87085b.m16037P((InterfaceC31165x0) interfaceC31126hMo1784d, c22309a.m64115h(true)), c22309a);
        }
        if (!(interfaceC31126hMo1784d instanceof InterfaceC31117e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC31126hMo1784d).toString());
        }
        InterfaceC31126h interfaceC31126hMo1784d2 = AbstractC12313p.m34288g0(abstractC23811y).mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d2 instanceof InterfaceC31117e) {
            C23465k c23465kM64120g = m64120g(AbstractC12313p.m34261M(abstractC23811y), (InterfaceC31117e) interfaceC31126hMo1784d, f87083c);
            AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) c23465kM64120g.f92937w;
            boolean zBooleanValue = ((Boolean) c23465kM64120g.f92938x).booleanValue();
            C23465k c23465kM64120g2 = m64120g(AbstractC12313p.m34288g0(abstractC23811y), (InterfaceC31117e) interfaceC31126hMo1784d2, f87084d);
            AbstractC23763c0 abstractC23763c1 = (AbstractC23763c0) c23465kM64120g2.f92937w;
            return (zBooleanValue || ((Boolean) c23465kM64120g2.f92938x).booleanValue()) ? new C22316h(abstractC23763c0, abstractC23763c1) : AbstractC23791o.m69883b(abstractC23763c0, abstractC23763c1);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC31126hMo1784d2 + "\" while for lower it's \"" + interfaceC31126hMo1784d + '\"').toString());
    }
}
