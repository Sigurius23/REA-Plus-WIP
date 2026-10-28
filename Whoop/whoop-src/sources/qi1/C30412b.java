package qi1;

import ad3.AbstractC0757c;
import bj1.C3330a;
import bj1.C3332c;
import cj1.C4750f;
import cj1.C4752h;
import cj1.C4755k;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.health.domain.HealthApi;
import com.whoop.health.domain.models.DataVisualizationCardBodyModel;
import com.whoop.health.domain.models.DataVisualizationCardModel;
import com.whoop.health.domain.models.EntryPointLockedCardModel;
import com.whoop.health.domain.models.HealthspanHeroMetricModel;
import com.whoop.health.domain.models.HorizontalRecordsTileModel;
import com.whoop.health.domain.models.ImageVisualizationCardBodyModel;
import com.whoop.health.domain.models.MenstrualCycleInsightsCardModel;
import com.whoop.health.domain.models.ProgressBarDescriptionCardModel;
import com.whoop.health.domain.models.ScreenerStatusTileBodyModel;
import dj1.C12088a;
import dj1.C12091d;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import gt0.InterfaceC16183e;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import on2.C28049b;
import on2.C28050c;
import org.koin.core.error.DefinitionParameterException;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import pi1.C29251a;
import qf3.C30330b;
import qg1.C30346a;
import qk1.InterfaceC30444b;
import rf3.C31362a;
import rg1.C31388d;
import ri1.C31461j;
import ri1.C31466o;
import ri1.C31468q;
import sl1.C32705d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u82.AbstractC34645f;
import u82.C34648i;
import u82.InterfaceC34640a;
import u92.C34660d;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import we1.InterfaceC37217a;
import wf3.C37247a;
import xf3.C38266c;
import yg2.C39530e;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: qi1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lqi1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30412b implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f124809c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final InterfaceC34640a m92937A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34648i((AbstractC0757c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("health-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C3332c m92938B(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        return new C3332c((InterfaceC21159o0) factory.m122602a(new C28050c(params, 3), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m92939C(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public static final C31468q m92940D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31468q(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C31461j m92941E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31461j((C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), (InterfaceC26834e) factory.m122602a(new C28049b(factory, 5), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), null, (OnboardingStatusDao) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusDao.class), null), (InterfaceC30444b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC30444b.class), null), (C31468q) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31468q.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC37217a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m92942F(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("health-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C12088a m92943G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12088a((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C4752h m92944H(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4752h((C31461j) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31461j.class), null), (C32705d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C32705d.class), null), (C12088a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12088a.class), null), (C4750f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C4750f.class), null), (C39530e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39530e.class), null), (C31388d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31388d.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C4750f m92945I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4750f();
    }

    /* JADX INFO: renamed from: r */
    private static final C23454a0 m92963r(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "health-model-mapping");
        C30346a c30346a = new C30346a(17);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c30346a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "health-json");
        C30346a c30346a2 = new C30346a(28);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c30346a2, 2)), false);
        C30346a c30346a3 = new C30346a(29);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(HealthApi.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass3, null, c30346a3, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false, "health-bff-cache-deserializer");
        C30411a c30411a = new C30411a(0);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM73385r2, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, c35953cM73385r2, c30411a, 2)), false);
        C30411a c30411a2 = new C30411a(1);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C3332c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c30411a2, 2)), false);
        C30346a c30346a4 = new C30346a(18);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C31468q.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c30346a4, 2)), false);
        C30346a c30346a5 = new C30346a(19);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C31461j.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c30346a5, 2)), false);
        C30346a c30346a6 = new C30346a(20);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C12088a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c30346a6, 2)), false);
        C30346a c30346a7 = new C30346a(21);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C4752h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c30346a7, 2)), false);
        C30346a c30346a8 = new C30346a(22);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C4750f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c30346a8, 2)), false);
        C30346a c30346a9 = new C30346a(23);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C3330a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c30346a9, 2)), false);
        C30346a c30346a10 = new C30346a(24);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C29251a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c30346a10, 2)), false);
        C30346a c30346a11 = new C30346a(25);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C31466o.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c30346a11, 2)), false);
        C30346a c30346a12 = new C30346a(26);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C12091d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c30346a12, 2)), false);
        C30346a c30346a13 = new C30346a(27);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C4755k.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass15, null, c30346a13, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Map m92964s(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("DATA_VISUALIZATION_CARD", c22673i0.getOrCreateKotlinClass(DataVisualizationCardModel.class)), new C23465k("DATA_VISUALIZATION_CARD_BODY", c22673i0.getOrCreateKotlinClass(DataVisualizationCardBodyModel.class)), new C23465k("ENTRY_POINT_LOCKED_CARD", c22673i0.getOrCreateKotlinClass(EntryPointLockedCardModel.class)), new C23465k("HEALTHSPAN_HERO_METRIC", c22673i0.getOrCreateKotlinClass(HealthspanHeroMetricModel.class)), new C23465k("HEALTH_TAB_MENSTRUAL_CYCLE", c22673i0.getOrCreateKotlinClass(MenstrualCycleInsightsCardModel.class)), new C23465k("HORIZONTAL_RECORDS_TILE", c22673i0.getOrCreateKotlinClass(HorizontalRecordsTileModel.class)), new C23465k("IMAGE_VISUALIZATION_CARD_BODY", c22673i0.getOrCreateKotlinClass(ImageVisualizationCardBodyModel.class)), new C23465k("PROGRESS_BAR_DESCRIPTION_CARD", c22673i0.getOrCreateKotlinClass(ProgressBarDescriptionCardModel.class)), new C23465k("SCREENER_STATUS_TILE", c22673i0.getOrCreateKotlinClass(ScreenerStatusTileBodyModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final AbstractC0757c m92965t(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "health-model-mapping")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C3330a m92966u(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C3330a((InterfaceC16183e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16183e.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C29251a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29251a.class), null), InterfaceC34116n.INSTANCE.m107848a("HealthTabActionRouter"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C29251a m92967v(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29251a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C31466o m92968w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31466o((C34660d) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C12091d m92969x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12091d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C4755k m92970y(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4755k((C31466o) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31466o.class), null), (C12091d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12091d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final HealthApi m92971z(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "health-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        return (HealthApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), HealthApi.class, "create(...)");
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m92963r(c33768a);
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
