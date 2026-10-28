package kf1;

import com.whoop.experiments.api.ExperimentsApi;
import com.whoop.experiments.api.ExperimentsAuthApi;
import hf1.C17236c;
import hf1.InterfaceC17235b;
import if1.C18453a;
import j92.C21436d;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import jf1.C21642a;
import ji0.C21714b;
import jj1.C21739a;
import l83.C23454a0;
import m83.AbstractC25265s;
import mf1.C25509a;
import nd1.InterfaceC26584j;
import p007a6.InterfaceC0422g;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.InterfaceC34816g0;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: kf1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkf1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "experiments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22441b implements InterfaceC26584j {
    /* JADX INFO: renamed from: g */
    private static final C23454a0 m64746g(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C21739a c21739a = new C21739a(27);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C21642a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c21739a, 2)), false);
        C21739a c21739a2 = new C21739a(28);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C17236c.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass2, null, c21739a2, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        C35953c c35953c2 = new C35953c("EXPERIMENTS_INTERCEPTOR");
        C21739a c21739a3 = new C21739a(29);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C25509a.class);
        C30330b c30330b2 = new C30330b(c35953c, orCreateKotlinClass3, c35953c2, c21739a3, 2);
        String strM60669Y = AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953c2, c35953c);
        C31362a c31362a = new C31362a(c30330b2);
        module.m106774b(strM60669Y, c31362a, false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC34816g0.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b3 = c31362a.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b3.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b3.f124472c, c30330b3.f124470a), c31362a, true);
        C22440a c22440a = new C22440a(0);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(ExperimentsApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c22440a, 2)), false);
        C22440a c22440a2 = new C22440a(1);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(ExperimentsAuthApi.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass5, null, c22440a2, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C21642a m64747h(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21642a((InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C17236c m64748i(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17236c((ExperimentsApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ExperimentsApi.class), null), (ExperimentsAuthApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ExperimentsAuthApi.class), null), (C21642a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21642a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C25509a m64749j(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25509a((InterfaceC17235b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC17235b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final ExperimentsApi m64750k(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0M73382o.m88728b(new C18453a());
        c29222x0M73382o.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("unauthenticatedOkHttpClient")));
        return (ExperimentsApi) c29222x0M73382o.m88730d().m88733b(ExperimentsApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final ExperimentsAuthApi m64751l(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "defaultOkHttpClient");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), c35953cM73387t)).m109897a();
        AbstractC25265s.m74132j1(c34824k0M109897a.f146614c, new C21714b(25));
        C34826l0 c34826l0 = new C34826l0(c34824k0M109897a);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(new C18453a());
        c29222x0.f118281a = c34826l0;
        return (ExperimentsAuthApi) c29222x0.m88730d().m88733b(ExperimentsAuthApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final boolean m64752m(InterfaceC34816g0 it) {
        AbstractC22676k.m65750j(it, "it");
        return it instanceof C21436d;
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m64746g(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
