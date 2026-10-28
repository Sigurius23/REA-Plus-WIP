package ab3;

import hg3.AbstractC17269i;
import io.sentry.config.AbstractC20301a;
import lb3.AbstractC23763c0;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.C23784k0;
import lb3.C23806v0;
import lb3.EnumC23776g1;
import nb3.C26555l;
import nb3.EnumC26554k;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import va3.C35845c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ab3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C0728t extends AbstractC0715g {
    public C0728t(C35845c c35845c, int i13) {
        super(new C0726r(new C0714f(c35845c, i13)));
    }

    @Override // ab3.AbstractC0715g
    /* JADX INFO: renamed from: a */
    public final AbstractC23811y mo1776a(InterfaceC31109b0 module) {
        AbstractC23811y abstractC23811yM78682c;
        AbstractC22676k.m65750j(module, "module");
        C23784k0.f94165x.getClass();
        C23784k0 c23784k0 = C23784k0.f94166y;
        AbstractC27736h abstractC27736hMo78661c = module.mo78661c();
        abstractC27736hMo78661c.getClass();
        InterfaceC31117e interfaceC31117eM83822j = abstractC27736hMo78661c.m83822j(AbstractC27741m.f111833Q.m113798i());
        Object obj = this.f2696a;
        AbstractC0727s abstractC0727s = (AbstractC0727s) obj;
        if (abstractC0727s instanceof C0725q) {
            abstractC23811yM78682c = ((C0725q) obj).f2704a;
        } else {
            if (!(abstractC0727s instanceof C0726r)) {
                throw new NoWhenBranchMatchedException();
            }
            C0714f c0714f = ((C0726r) obj).f2705a;
            C35845c c35845c = c0714f.f2694a;
            int i13 = c0714f.f2695b;
            InterfaceC31117e interfaceC31117eM48865L = AbstractC17269i.m48865L(module, c35845c);
            if (interfaceC31117eM48865L == null) {
                abstractC23811yM78682c = C26555l.m78682c(EnumC26554k.UNRESOLVED_KCLASS_CONSTANT_VALUE, c35845c.toString(), String.valueOf(i13));
            } else {
                AbstractC23763c0 abstractC23763c0Mo60594i = interfaceC31117eM48865L.mo60594i();
                AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
                AbstractC23811y abstractC23811yM56322U = AbstractC20301a.m56322U(abstractC23763c0Mo60594i);
                for (int i14 = 0; i14 < i13; i14++) {
                    AbstractC27736h abstractC27736hMo78661c2 = module.mo78661c();
                    EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
                    abstractC23811yM56322U = abstractC27736hMo78661c2.m83820h(abstractC23811yM56322U);
                }
                abstractC23811yM78682c = abstractC23811yM56322U;
            }
        }
        return AbstractC23791o.m69889h(c23784k0, interfaceC31117eM83822j, AbstractC37056f.m118958J(new C23806v0(abstractC23811yM78682c)));
    }
}
