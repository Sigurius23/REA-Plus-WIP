package ab3;

import hg3.AbstractC17269i;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import nb3.C26555l;
import nb3.EnumC26554k;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.EnumC31120f;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import va3.C35845c;
import va3.C35850h;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: ab3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C0717i extends AbstractC0715g {

    /* JADX INFO: renamed from: b */
    public final C35845c f2697b;

    /* JADX INFO: renamed from: c */
    public final C35850h f2698c;

    public C0717i(C35845c c35845c, C35850h c35850h) {
        super(new C23465k(c35845c, c35850h));
        this.f2697b = c35845c;
        this.f2698c = c35850h;
    }

    @Override // ab3.AbstractC0715g
    /* JADX INFO: renamed from: a */
    public final AbstractC23811y mo1776a(InterfaceC31109b0 module) {
        AbstractC23763c0 abstractC23763c0Mo60594i;
        AbstractC22676k.m65750j(module, "module");
        C35845c c35845c = this.f2697b;
        InterfaceC31117e interfaceC31117eM48865L = AbstractC17269i.m48865L(module, c35845c);
        if (interfaceC31117eM48865L != null) {
            int i13 = AbstractC39363f.f169413a;
            if (!AbstractC39363f.m125530l(interfaceC31117eM48865L, EnumC31120f.f128330y)) {
                interfaceC31117eM48865L = null;
            }
            if (interfaceC31117eM48865L != null && (abstractC23763c0Mo60594i = interfaceC31117eM48865L.mo60594i()) != null) {
                return abstractC23763c0Mo60594i;
            }
        }
        EnumC26554k enumC26554k = EnumC26554k.ERROR_ENUM_TYPE;
        String string = c35845c.toString();
        String str = this.f2698c.f152620w;
        AbstractC22676k.m65749i(str, "toString(...)");
        return C26555l.m78682c(enumC26554k, string, str);
    }

    /* JADX INFO: renamed from: c */
    public final C35850h m1781c() {
        return this.f2698c;
    }

    @Override // ab3.AbstractC0715g
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f2697b.m113777f());
        sb4.append('.');
        sb4.append(this.f2698c);
        return sb4.toString();
    }
}
