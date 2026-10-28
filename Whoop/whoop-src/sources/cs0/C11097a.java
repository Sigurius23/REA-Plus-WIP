package cs0;

import ad3.AbstractC0757c;
import al0.C0972g;
import c41.C4139w0;
import com.whoop.communityreactions.api.ReactionsApi;
import com.whoop.communityreactions.domain.model.ReactionCommentModel;
import com.whoop.communityreactions.domain.model.ReactionsArchMiniModel;
import com.whoop.design.json.AbstractC6728b;
import ds0.C12328g;
import ds0.C12329h;
import fs0.C14742b;
import gs0.C16158a;
import hs0.C17602c;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import org.koin.core.error.DefinitionParameterException;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25310s;
import pg3.C29222x0;
import qf3.C30330b;
import qw2.C30695c;
import r80.AbstractC31061c;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: cs0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lcs0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11097a implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f35198c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C17602c m29951A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17602c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C16158a m29952B(C38266c viewModel, C34911a params) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 9);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C16158a((C12329h) viewModel.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(C12329h.class), null), (C17602c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17602c.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m29953C(C34911a c34911a) {
        return c34911a;
    }

    /* JADX INFO: renamed from: o */
    private static final C23454a0 m29968o(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C4139w0 c4139w0 = new C4139w0(11);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C11100d.class);
        C35953c c35953c = C37247a.f159360e;
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass, null, c4139w0, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        C4139w0 c4139w1 = new C4139w0(12);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C11099c.class);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass2, null, c4139w1, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b2 = c31365dM73383p2.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b2.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p2, true);
        C4139w0 c4139w2 = new C4139w0(13);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C11098b.class);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass3, null, c4139w2, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b3 = c31365dM73383p3.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b3.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b3.f124472c, c30330b3.f124470a), c31365dM73383p3, true);
        C35953c c35953c2 = new C35953c("reactions-json");
        C4139w0 c4139w3 = new C4139w0(14);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953c2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, c35953c2, c4139w3, 2)), false);
        C4139w0 c4139w4 = new C4139w0(15);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(ReactionsApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c4139w4, 1)), false);
        C4139w0 c4139w5 = new C4139w0(16);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C12328g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c4139w5, 2)), false);
        C4139w0 c4139w6 = new C4139w0(17);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C14742b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c4139w6, 2)), false);
        C4139w0 c4139w7 = new C4139w0(18);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C12329h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c4139w7, 2)), false);
        C4139w0 c4139w8 = new C4139w0(19);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C17602c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c4139w8, 2)), false);
        C4139w0 c4139w9 = new C4139w0(20);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C16158a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass10, null, c4139w9, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C11100d m29969p(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C11100d(AbstractC25247g0.m73989X(new C23465k("REACTIONS_ARCH_MINI", AbstractC22671h0.f89337a.getOrCreateKotlinClass(ReactionsArchMiniModel.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C11099c m29970q(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C11099c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C11098b m29971r(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C11098b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final AbstractC0757c m29972s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC6728b.m20380e(factory, AbstractC25247g0.m73989X(new C23465k("REACTION_COMMENT", AbstractC22671h0.f89337a.getOrCreateKotlinClass(ReactionCommentModel.class))), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final ReactionsApi m29973t(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return (ReactionsApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q((AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "reactions-json")), c29222x0M73382o, "defaultOkHttpClient")), ReactionsApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C12328g m29974u(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C12328g((String) objM110111b, (ReactionsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ReactionsApi.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C14742b m29975v(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14742b((C30695c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (C12328g) factory.m122602a(new C0972g(params, 10), c22673i0.getOrCreateKotlinClass(C12328g.class), null), (AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("reactions-json")), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C34911a m29976w(C34911a c34911a) {
        return c34911a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C12329h m29977x(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 11);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12329h((C12328g) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(C12328g.class), null), (C14742b) factory.m122602a(new C0972g(params, 12), c22673i0.getOrCreateKotlinClass(C14742b.class), null), (AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("reactions-json")), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C34911a m29978y(C34911a c34911a) {
        return c34911a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C34911a m29979z(C34911a c34911a) {
        return c34911a;
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m29968o(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
