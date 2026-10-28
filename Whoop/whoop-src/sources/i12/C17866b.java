package i12;

import ad3.AbstractC0757c;
import android.content.Context;
import ao1.C1873h;
import b83.C2807c;
import bc3.InterfaceC2994c0;
import com.google.gson.Gson;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.onboarding.story.domain.network.C9615a;
import com.whoop.onboarding.story.domain.network.FeatureEducationApi;
import com.whoop.service.network.JournalApi;
import fi0.InterfaceC14515a;
import ho0.C17535d;
import ih0.AbstractC18489d0;
import in2.InterfaceC18732d;
import j12.C21217b;
import j12.C21218c;
import j12.C21219d;
import j93.InterfaceC21461d;
import java.util.List;
import js0.AbstractC21909c;
import l83.C23454a0;
import m83.AbstractC25260n;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import o12.C27416c;
import o12.C27418e;
import o12.C27419f;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p249jc.C21596v;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rm0.C31585c;
import rr2.InterfaceC31766c;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import tw0.C34215a;
import u82.C34642c;
import u82.C34643d;
import u82.C34644e;
import u82.InterfaceC34640a;
import u92.C34660d;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import z82.C40191e;
import z82.InterfaceC40188b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: i12.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Li12/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17866b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f69534c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C31585c(), new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C21218c m51378A(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21218c(null, (C21217b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21217b.class), null), (C21219d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C21219d.class), null), 1, null);
    }

    /* JADX INFO: renamed from: n */
    private static final C23454a0 m51392n(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C17535d c17535d = new C17535d(25);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C27418e.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c17535d, 2)), false);
        C17865a c17865a = new C17865a(0);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C27416c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c17865a, 2)), false);
        C17865a c17865a2 = new C17865a(1);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C27419f.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass3, null, c17865a2, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false, "ONBOARDING_STORY_GSON");
        C17865a c17865a3 = new C17865a(2);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(Gson.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass4, c35953cM73385r, c17865a3, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM73385r, c35953c), false, "ONBOARDING_STORY_JSON");
        C17865a c17865a4 = new C17865a(3);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM53379t2 = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass5, c35953cM53379t, c17865a4, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass5, c35953cM53379t, c35953c), false, "ONBOARDING_STORY_BFF_CACHE_DESERIALIZER");
        C17865a c17865a5 = new C17865a(4);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass6, c35953cM53379t2, c17865a5, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass6, c35953cM53379t2, c35953c), false, "ONBOARDING_STORY_CACHED_API_SOURCE");
        C17865a c17865a6 = new C17865a(5);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, c35953cM73385r2, c17865a6, 2)), false);
        C17865a c17865a7 = new C17865a(6);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C9615a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c17865a7, 2)), false);
        C17535d c17535d2 = new C17535d(26);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(FeatureEducationApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c17535d2, 2)), false);
        C17535d c17535d3 = new C17535d(27);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C21218c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c17535d3, 2)), false);
        C17535d c17535d4 = new C17535d(28);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C21217b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c17535d4, 2)), false);
        C17535d c17535d5 = new C17535d(29);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C21219d.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass12, null, c17535d5, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C27418e m51393o(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27418e((C27416c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27416c.class), null), (C27419f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27419f.class), null), (InterfaceC40188b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40188b.class), null), null, (InterfaceC41070a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C27416c m51394p(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27416c((C9615a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C9615a.class), null), (C40191e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C21217b m51395q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("ONBOARDING_STORY_CACHED_API_SOURCE");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21217b(null, (InterfaceC26834e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), c35953c), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C9615a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C9615a.class), null), (OnboardingStatusDao) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusDao.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C21219d m51396r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21219d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C27419f m51397s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27419f((C34215a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34215a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Gson m51398t(C38266c c38266c, C34911a c34911a) {
        return AbstractC6730d.m20389g(c38266c, AbstractC18489d0.m53366g(c38266c, "$this$single", c34911a, "it"), null, null, 6, null).create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final AbstractC0757c m51399u(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC6728b.m20380e(single, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC34640a m51400v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("ONBOARDING_STORY_JSON");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34642c((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c), (Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("ONBOARDING_STORY_GSON")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), AbstractC12350b.m34570S("kt-serialization-onboarding-story"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC26834e m51401w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return (InterfaceC26834e) factory.m122602a(new C1873h(factory, 14), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C34911a m51402x(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("ONBOARDING_STORY_BFF_CACHE_DESERIALIZER"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C9615a m51403y(C38266c factory, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("OnboardingStoryRepository");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC31766c interfaceC31766c = (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null);
        InterfaceC18732d interfaceC18732d = (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null);
        FeatureEducationApi featureEducationApi = (FeatureEducationApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureEducationApi.class), null);
        JournalApi journalApi = (JournalApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(JournalApi.class), null);
        OnboardingStatusChecker onboardingStatusChecker = (OnboardingStatusChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusChecker.class), null);
        Context context = AbstractC29125c.m88532i(factory);
        AbstractC22676k.m65750j(context, "context");
        return new C9615a(interfaceC34116nM107848a, interfaceC31766c, interfaceC18732d, featureEducationApi, journalApi, onboardingStatusChecker, C21596v.m60637g(context), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final FeatureEducationApi m51404z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34643d c34643dM109481a = ((C34644e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null)).m109481a((Gson) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Gson.class), new C35953c("ONBOARDING_STORY_GSON")), (AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("ONBOARDING_STORY_JSON")), AbstractC12350b.m34570S("kt-serialization-onboarding-story"));
        C29222x0 c29222x0 = new C29222x0();
        return (FeatureEducationApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), FeatureEducationApi.class, "create(...)");
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m51392n(c33768a);
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
