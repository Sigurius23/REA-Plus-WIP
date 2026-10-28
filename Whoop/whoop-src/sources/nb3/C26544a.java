package nb3;

import java.util.List;
import kb3.C22333b;
import kb3.C22342k;
import lb3.AbstractC23812y0;
import lb3.C23758a1;
import m83.C25271y;
import mb3.C25389f;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.AbstractC31150q;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31117e;
import r93.InterfaceC31138l;
import r93.InterfaceC31155s0;
import s93.C32305g;
import u93.C34682j;
import u93.C34686l;
import va3.C35850h;

/* JADX INFO: renamed from: nb3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C26544a extends C34686l {
    /* JADX WARN: Illegal instructions before constructor call */
    public C26544a(C35850h c35850h) {
        C26555l c26555l = C26555l.f105564a;
        C26548e c26548e = C26555l.f105565b;
        EnumC31106a0 enumC31106a0 = EnumC31106a0.f128312z;
        EnumC31120f enumC31120f = EnumC31120f.f128328w;
        C22333b c22333b = C22342k.f87183e;
        List list = C25271y.f99162w;
        super(c26548e, c35850h, enumC31106a0, enumC31120f, list, c22333b);
        C34682j c34682j = new C34682j(this, null, C32305g.f133684a, true, 1, InterfaceC31155s0.f128370q);
        c34682j.m109568X0(list, AbstractC31150q.f128353e);
        EnumC26551h enumC26551h = EnumC26551h.SCOPE_FOR_ERROR_CLASS;
        String str = c34682j.getName().f152620w;
        AbstractC22676k.m65749i(str, "toString(...)");
        C26550g c26550gM78681b = C26555l.m78681b(enumC26551h, str, "");
        EnumC26554k enumC26554k = EnumC26554k.ERROR_CLASS;
        c34682j.f146194H = new C26552i(C26555l.m78683d(enumC26554k, new String[0]), c26550gM78681b, enumC26554k, list, false, new String[0]);
        m109576X(c26550gM78681b, AbstractC12350b.m34570S(c34682j), c34682j);
    }

    @Override // u93.AbstractC34666b
    /* JADX INFO: renamed from: G */
    public final InterfaceC31117e mo60593d(C23758a1 substitutor) {
        AbstractC22676k.m65750j(substitutor, "substitutor");
        return this;
    }

    @Override // u93.AbstractC34666b, u93.AbstractC34669c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC22712o mo78653b(AbstractC23812y0 abstractC23812y0, C25389f c25389f) {
        EnumC26551h enumC26551h = EnumC26551h.SCOPE_FOR_ERROR_CLASS;
        String str = getName().f152620w;
        AbstractC22676k.m65749i(str, "toString(...)");
        return C26555l.m78681b(enumC26551h, str, abstractC23812y0.toString());
    }

    @Override // u93.AbstractC34666b, r93.InterfaceC31159u0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31138l mo60593d(C23758a1 substitutor) {
        AbstractC22676k.m65750j(substitutor, "substitutor");
        return this;
    }

    @Override // u93.C34686l
    public final String toString() {
        String strM113817b = getName().m113817b();
        AbstractC22676k.m65749i(strM113817b, "asString(...)");
        return strM113817b;
    }
}
