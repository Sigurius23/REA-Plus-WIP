package qo0;

import ap0.C1881a;
import bc3.InterfaceC2994c0;
import com.whoop.coacheverywhere.domain.ProactiveApi;
import com.whoop.coacheverywhere.onboarding.domain.network.CoachOnboardingApi;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.onboarding.story.domain.network.C9615a;
import com.whoop.p057ai.chat.api.AiChatApi;
import dp0.InterfaceC12251g;
import fi0.InterfaceC14515a;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.List;
import l83.C23454a0;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import or2.InterfaceC28215x1;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import po0.C29397a;
import qf3.C30330b;
import qi1.C30411a;
import rf3.C31362a;
import rf3.C31365d;
import so0.C32801a;
import sr2.AbstractC32943y;
import tf3.C33768a;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import vo0.C36225c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import xo0.C38490b;
import xo0.C38491c;
import z92.InterfaceC40205a;
import zo0.C40913a;
import zo0.C40914b;
import zo0.C40916d;
import zo0.C40918f;
import zo0.C40920h;
import zo0.C40922j;
import zo0.C40923k;

/* JADX INFO: renamed from: qo0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lqo0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30525a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C40918f m93544A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40918f((C32801a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32801a.class), null), (C40920h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40920h.class), null), (C1881a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C1881a.class), null), (C40916d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40916d.class), null), (C29397a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29397a.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC12251g m93545B(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40914b((C29397a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C29397a.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C40913a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40913a.class), null), (C40922j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40922j.class), null), (C40918f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40918f.class), null), (C40923k) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40923k.class), null), null, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final CoachOnboardingApi m93546C(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        return (CoachOnboardingApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q(AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null), c29222x0M73382o, "defaultOkHttpClient")), CoachOnboardingApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final ProactiveApi m93547D(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        return (ProactiveApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q(AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null), c29222x0M73382o, "defaultOkHttpClient")), ProactiveApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C40920h m93548E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40920h();
    }

    /* JADX INFO: renamed from: p */
    private static final C23454a0 m93564p(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C30411a c30411a = new C30411a(2);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C1881a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c30411a, 2)), false);
        C30411a c30411a2 = new C30411a(13);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C40916d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c30411a2, 2)), false);
        C30411a c30411a3 = new C30411a(14);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C40913a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c30411a3, 2)), false);
        C30411a c30411a4 = new C30411a(15);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C40922j.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c30411a4, 2)), false);
        C30411a c30411a5 = new C30411a(16);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C40923k.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c30411a5, 2)), false);
        C30411a c30411a6 = new C30411a(3);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C40918f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c30411a6, 2)), false);
        C30411a c30411a7 = new C30411a(4);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(InterfaceC12251g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c30411a7, 1)), false);
        C30411a c30411a8 = new C30411a(5);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(CoachOnboardingApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c30411a8, 2)), false);
        C30411a c30411a9 = new C30411a(6);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(ProactiveApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c30411a9, 2)), false);
        C30411a c30411a10 = new C30411a(7);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C40920h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c30411a10, 2)), false);
        C30411a c30411a11 = new C30411a(8);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C32801a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c30411a11, 2)), false);
        C30411a c30411a12 = new C30411a(9);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C38490b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c30411a12, 2)), false);
        C30411a c30411a13 = new C30411a(10);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C36225c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c30411a13, 2)), false);
        C30411a c30411a14 = new C30411a(11);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C38491c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c30411a14, 2)), false);
        C30411a c30411a15 = new C30411a(12);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C29397a.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass15, null, c30411a15, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C1881a m93565q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C1881a((InterfaceC28215x1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28215x1.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C40916d m93566r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C40916d(clockSystemDefaultZone, (InterfaceC2994c0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C32801a m93567s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32801a((ProactiveApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ProactiveApi.class), null), (AiChatApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AiChatApi.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C38490b m93568t(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38490b(null, (C36225c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36225c.class), null), (C38491c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38491c.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C36225c m93569u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36225c(null, (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (CoachOnboardingApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(CoachOnboardingApi.class), null), (OnboardingStatusDao) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusDao.class), null), (C9615a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C9615a.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C29397a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29397a.class), null), (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C38491c m93570v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38491c((C29397a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29397a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C29397a m93571w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29397a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C40913a m93572x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40913a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C40922j m93573y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40922j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C40923k m93574z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40923k();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m93564p(c33768a);
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
