package ao1;

import ad3.AbstractC0757c;
import al0.C0969d;
import al0.C0972g;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.models.items.DailyTickMarkPlotModel;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.fertility.FertilitySettingsToggleModel;
import com.whoop.hormonalinsights.fertility.api.FertilitySettingsApi;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CalendarTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CurrentCycleTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CycleJournalTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CyclePatternTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.DateSelectedTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.HormonalInsightsLoaderModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogDataButtonModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciHeaderModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciMedicalDisclaimerModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciTileSectionModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseCoachingTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PossibleSymptomsCardModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.TileWithTitleModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.TypicalCycleTileModel;
import com.whoop.hormonalinsights.naturalcycles.domain.models.NaturalCyclesFertilityCardModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyDisclaimer;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsMenuItemModel;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsPrivacy;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsToggle;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsUpsell;
import cp1.C11023j;
import dp1.C12254a;
import eo1.C13380b;
import fi0.InterfaceC14515a;
import fp1.C14678f;
import ge3.AbstractC15751g;
import ho1.C17537a;
import hp1.C17547g;
import in2.InterfaceC18732d;
import io1.C20746g;
import ip1.C20812a;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import js0.AbstractC21909c;
import ko1.C22648a;
import ko1.C22650c;
import kp1.C22753b;
import kp1.C22756e;
import l83.C23454a0;
import l83.C23465k;
import lo1.C24617b;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import mo1.C25746a;
import mo1.C25749d;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import np1.C27031i;
import oo1.C28056b;
import oo1.C28058d;
import oo1.C28061g;
import oo1.C28065k;
import op1.C28097b;
import or2.C28205u0;
import org.koin.core.error.DefinitionParameterException;
import p031b9.AbstractC2875y;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25310s;
import pf.AbstractC29125c;
import pg3.C29222x0;
import po1.C29401c;
import qf3.C30330b;
import qp1.C30534c;
import qp1.C30537f;
import qw2.C30695c;
import rf3.C31362a;
import rf3.C31365d;
import ro1.C31639k;
import so1.C32805b0;
import so1.C32813f0;
import so1.C32830o;
import so1.C32839w;
import sr2.AbstractC32943y;
import tf3.C33768a;
import to1.C34009b;
import to1.C34011d;
import to1.C34012e;
import to1.C34021n;
import tp1.C34074n;
import tr2.InterfaceC34116n;
import u82.AbstractC34645f;
import u82.AbstractC34650k;
import u82.C34648i;
import u92.C34660d;
import ud3.C34826l0;
import uf3.C34911a;
import up1.C35151a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wm0.C37378a;
import wp1.C37499c;
import xf3.C38266c;
import xm0.C38458b;
import xp1.C38531b;
import yn1.C39673b;
import yp1.C39702a;
import zo1.C40927d;
import zp1.C40942c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ao1.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lao1/j;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1875j implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C32813f0 m5533A0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32813f0((C28065k) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28065k.class), null), (C34021n) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34021n.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C31639k m5535B0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 3);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b != null) {
            return new C31639k(interfaceC21159o0, (AbstractC12939a0) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C34911a m5537C0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C35151a m5539D0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35151a((InterfaceC41070a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final AbstractC0757c m5541E0(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "hormonal-insights-feature-models")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C30537f m5543F0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30537f((HormonalInsightsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HormonalInsightsApi.class), null), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public static final C13380b m5545G0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C13380b((FertilitySettingsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FertilitySettingsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C30534c m5547H0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30534c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C34074n m5549I0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34074n((C30537f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30537f.class), null), (C13380b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C13380b.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C30534c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C30534c.class), null), (C35151a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35151a.class), null), null, null, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C34011d m5551J0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34011d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C29401c m5553K0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29401c((HormonalInsightsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HormonalInsightsApi.class), null), null, (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C32839w m5555L0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32839w((C29401c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29401c.class), null), (C34011d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34011d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C40942c m5557M0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40942c((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("hormonal-insights-polymorphic-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N0 */
    public static final C37499c m5559N0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37499c((HormonalInsightsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(HormonalInsightsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C39702a m5561O0(C38266c viewModel, C34911a params) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = params.f147011a;
        Object objM74102I0 = AbstractC25265s.m74102I0(0, arrayList);
        String str = objM74102I0 instanceof String ? (String) objM74102I0 : null;
        Object objM74102I1 = AbstractC25265s.m74102I0(1, arrayList);
        String str2 = objM74102I1 instanceof String ? (String) objM74102I1 : null;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39702a(str, str2, (C37499c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37499c.class), null), (C40942c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40942c.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C1866a m5563P0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C1866a((AbstractC0757c) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("hormonal-insights-polymorphic-json")), new C1872g(single, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C25749d m5565Q0(C38266c c38266c) {
        return (C25749d) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25749d.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C38531b m5567R0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 4);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b != null) {
            return new C38531b(interfaceC21159o0, (AbstractC12939a0) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C34911a m5569S0(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C20746g m5571T0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "hormonal-insights-feature-models");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        return new C20746g((InterfaceC26834e) c38266c.m122602a(new C1870e(map, new C34648i(AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null)), 1), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (HormonalInsightsApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(HormonalInsightsApi.class), null), (InterfaceC41070a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C37378a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (FeatureFlagChecker) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC34116n) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C34911a m5573U0(Map map, C34648i c34648i) {
        return AbstractC15751g.m44431K(map, c34648i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C25749d m5575V0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C1873h c1873h = new C1873h(factory, 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25749d((C28205u0) factory.m122602a(c1873h, c22673i0.getOrCreateKotlinClass(C28205u0.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), null, C25749d.a.CHECKBOX, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C34911a m5577W0(C38266c c38266c) {
        return AbstractC15751g.m44431K(AbstractC29125c.m88532i(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C25746a m5579X0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25746a((C25749d) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25749d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C22650c m5581Y0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractActivityC1340r0.class, new StringBuilder("No value found for type '"), '\''));
        }
        AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C22650c((InterfaceC21159o0) factory.m122602a(new C1871f(abstractActivityC1340r0, 0), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (AbstractC12939a0) objM110111b2, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C34911a m5583Z0(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C22648a m5586a1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22648a((C17537a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17537a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C24617b m5589b1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24617b((C20746g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20746g.class), null), (C25746a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25746a.class), null), (C17537a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C17537a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C17537a m5592c1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17537a((InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (C39673b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39673b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final HormonalInsightsApi m5595d1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "hormonal-insights-feature-models");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), null, null, null, null, 30, null);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757cM20380e));
        return (HormonalInsightsApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), HormonalInsightsApi.class, "create(...)");
    }

    /* JADX INFO: renamed from: e0 */
    private static final C23454a0 m5597e0(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "hormonal-insights-feature-models");
        C0969d c0969d = new C0969d(16);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c0969d, 1)), false);
        C0969d c0969d2 = new C0969d(18);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C1868c.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass2, null, c0969d2, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        final int i13 = 0;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C1867b.class);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass3, null, interfaceC4351m, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b2 = c31365dM73383p2.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b2.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p2, true);
        C35953c c35953c2 = new C35953c("hormonal-insights-polymorphic-json");
        final int i14 = 12;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953c2, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, c35953c2, interfaceC4351m2, 1)), false);
        final int i15 = 22;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C1866a.class);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass5, null, interfaceC4351m3, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b3 = c31365dM73383p3.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b3.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b3.f124472c, c30330b3.f124470a), c31365dM73383p3, true);
        final int i16 = 23;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(HormonalInsightsApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, interfaceC4351m4, 1)), false);
        final int i17 = 24;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(FertilitySettingsApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, interfaceC4351m5, 1)), false);
        final int i18 = 25;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C22756e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, interfaceC4351m6, 2)), false);
        final int i19 = 26;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C28097b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, interfaceC4351m7, 2)), false);
        final int i24 = 27;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C22753b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, interfaceC4351m8, 2)), false);
        C0969d c0969d3 = new C0969d(27);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C27031i.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c0969d3, 2)), false);
        final int i25 = 8;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C14678f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, interfaceC4351m9, 2)), false);
        final int i26 = 19;
        InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C20812a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, interfaceC4351m10, 2)), false);
        final int i27 = 28;
        InterfaceC4351m interfaceC4351m11 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C17547g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, interfaceC4351m11, 2)), false);
        final int i28 = 29;
        InterfaceC4351m interfaceC4351m12 = new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C39673b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, interfaceC4351m12, 2)), false);
        C1874i c1874i = new C1874i(0);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C12254a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c1874i, 2)), false);
        C1874i c1874i2 = new C1874i(1);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C40927d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c1874i2, 2)), false);
        C30330b c30330b4 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C11023j.class), null, new C1874i(2), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b4.f124471b, null, c35953c), new C31362a(c30330b4), false);
        C30330b c30330b5 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34012e.class), null, new C1874i(3), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b5.f124471b, null, c35953c), new C31362a(c30330b5), false);
        C30330b c30330b6 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28058d.class), null, new C0969d(17), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b6.f124471b, null, c35953c), new C31362a(c30330b6), false);
        C30330b c30330b7 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28061g.class), null, new C0969d(19), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b7.f124471b, null, c35953c), new C31362a(c30330b7), false);
        C30330b c30330b8 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C32805b0.class), null, new C0969d(20), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b8.f124471b, null, c35953c), new C31362a(c30330b8), false);
        C30330b c30330b9 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34009b.class), null, new C0969d(21), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b9.f124471b, null, c35953c), new C31362a(c30330b9), false);
        C30330b c30330b10 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28056b.class), null, new C0969d(22), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b10.f124471b, null, c35953c), new C31362a(c30330b10), false);
        C30330b c30330b11 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C32830o.class), null, new C0969d(23), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b11.f124471b, null, c35953c), new C31362a(c30330b11), false);
        C30330b c30330b12 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34021n.class), null, new C0969d(24), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b12.f124471b, null, c35953c), new C31362a(c30330b12), false);
        C30330b c30330b13 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C28065k.class), null, new C0969d(25), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b13.f124471b, null, c35953c), new C31362a(c30330b13), false);
        C30330b c30330b14 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C32813f0.class), null, new C0969d(26), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b14.f124471b, null, c35953c), new C31362a(c30330b14), false);
        C30330b c30330b15 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C31639k.class), null, new C0969d(28), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b15.f124471b, null, c35953c), new C31362a(c30330b15), false);
        C30330b c30330b16 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35151a.class), null, new C0969d(29), 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b16.f124471b, null, c35953c), new C31362a(c30330b16), false);
        final int i29 = 1;
        C30330b c30330b17 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30537f.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b17.f124471b, null, c35953c), new C31362a(c30330b17), false);
        final int i34 = 2;
        C30330b c30330b18 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C13380b.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b18.f124471b, null, c35953c), new C31362a(c30330b18), false);
        final int i35 = 3;
        C30330b c30330b19 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C30534c.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b19.f124471b, null, c35953c), new C31362a(c30330b19), false);
        final int i36 = 4;
        C30330b c30330b20 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34074n.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b20.f124471b, null, c35953c), new C31362a(c30330b20), false);
        final int i37 = 5;
        C30330b c30330b21 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C34011d.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b21.f124471b, null, c35953c), new C31362a(c30330b21), false);
        final int i38 = 6;
        C30330b c30330b22 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C29401c.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b22.f124471b, null, c35953c), new C31362a(c30330b22), false);
        final int i39 = 7;
        C30330b c30330b23 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C32839w.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b23.f124471b, null, c35953c), new C31362a(c30330b23), false);
        final int i44 = 9;
        C30330b c30330b24 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C40942c.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b24.f124471b, null, c35953c), new C31362a(c30330b24), false);
        final int i45 = 10;
        C30330b c30330b25 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C37499c.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b25.f124471b, null, c35953c), new C31362a(c30330b25), false);
        final int i46 = 11;
        C30330b c30330b26 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C39702a.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b26.f124471b, null, c35953c), new C31362a(c30330b26), false);
        final int i47 = 13;
        C30330b c30330b27 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C38531b.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b27.f124471b, null, c35953c), new C31362a(c30330b27), false);
        final int i48 = 14;
        C30330b c30330b28 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C20746g.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b28.f124471b, null, c35953c), new C31362a(c30330b28), false);
        final int i49 = 15;
        C30330b c30330b29 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C25749d.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b29.f124471b, null, c35953c), new C31362a(c30330b29), false);
        final int i54 = 16;
        C30330b c30330b30 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C25746a.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b30.f124471b, null, c35953c), new C31362a(c30330b30), false);
        final int i55 = 17;
        C30330b c30330b31 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C22650c.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b31.f124471b, null, c35953c), new C31362a(c30330b31), false);
        final int i56 = 18;
        C30330b c30330b32 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C22648a.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b32.f124471b, null, c35953c), new C31362a(c30330b32), false);
        final int i57 = 20;
        C30330b c30330b33 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C24617b.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        c33768a.m106774b(AbstractC21598x.m60669Y(c30330b33.f124471b, null, c35953c), new C31362a(c30330b33), false);
        final int i58 = 21;
        C30330b c30330b34 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C17537a.class), null, new InterfaceC4351m() { // from class: ao1.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C1875j.m5628r0(c38266c, c34911a);
                    case 1:
                        return C1875j.m5543F0(c38266c, c34911a);
                    case 2:
                        return C1875j.m5545G0(c38266c, c34911a);
                    case 3:
                        return C1875j.m5547H0(c38266c, c34911a);
                    case 4:
                        return C1875j.m5549I0(c38266c, c34911a);
                    case 5:
                        return C1875j.m5551J0(c38266c, c34911a);
                    case 6:
                        return C1875j.m5553K0(c38266c, c34911a);
                    case 7:
                        return C1875j.m5555L0(c38266c, c34911a);
                    case 8:
                        return C1875j.m5609i0(c38266c, c34911a);
                    case 9:
                        return C1875j.m5557M0(c38266c, c34911a);
                    case 10:
                        return C1875j.m5559N0(c38266c, c34911a);
                    case 11:
                        return C1875j.m5561O0(c38266c, c34911a);
                    case 12:
                        return C1875j.m5541E0(c38266c, c34911a);
                    case 13:
                        return C1875j.m5567R0(c38266c, c34911a);
                    case 14:
                        return C1875j.m5571T0(c38266c, c34911a);
                    case 15:
                        return C1875j.m5575V0(c38266c, c34911a);
                    case 16:
                        return C1875j.m5579X0(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C1875j.m5581Y0(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C1875j.m5586a1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C1875j.m5612j0(c38266c, c34911a);
                    case 20:
                        return C1875j.m5589b1(c38266c, c34911a);
                    case 21:
                        return C1875j.m5592c1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C1875j.m5563P0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C1875j.m5595d1(c38266c, c34911a);
                    case 24:
                        return C1875j.m5598e1(c38266c, c34911a);
                    case 25:
                        return C1875j.m5601f1(c38266c, c34911a);
                    case 26:
                        return C1875j.m5607h1(c38266c, c34911a);
                    case 27:
                        return C1875j.m5610i1(c38266c, c34911a);
                    case 28:
                        return C1875j.m5614k0(c38266c, c34911a);
                    default:
                        return C1875j.m5616l0(c38266c, c34911a);
                }
            }
        }, 2);
        AbstractC25012a.m73393z(c30330b34, c33768a, AbstractC21598x.m60669Y(c30330b34.f124471b, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final FertilitySettingsApi m5598e1(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0M73382o.m88728b(AbstractC34650k.m109497d());
        return (FertilitySettingsApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), FertilitySettingsApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final Map m5600f0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("CALENDAR_TILE", c22673i0.getOrCreateKotlinClass(CalendarTileModel.class)), new C23465k("CURRENT_CYCLE_GRAPH", c22673i0.getOrCreateKotlinClass(CurrentCycleTileModel.class)), new C23465k("CYCLE_JOURNAL_TILE", c22673i0.getOrCreateKotlinClass(CycleJournalTileModel.class)), new C23465k("CYCLE_PATTERN", c22673i0.getOrCreateKotlinClass(CyclePatternTileModel.class)), new C23465k("CYCLE_PHASE_COACHING", c22673i0.getOrCreateKotlinClass(PhaseCoachingTileModel.class)), new C23465k("DAILY_TICK_MARK", c22673i0.getOrCreateKotlinClass(DailyTickMarkPlotModel.class)), new C23465k("DATE_SELECTED_TILE", c22673i0.getOrCreateKotlinClass(DateSelectedTileModel.class)), new C23465k("FERTILITY_SETTINGS_TOGGLE", c22673i0.getOrCreateKotlinClass(FertilitySettingsToggleModel.class)), new C23465k("HEADER_TILE", c22673i0.getOrCreateKotlinClass(MciHeaderModel.class)), new C23465k("HORMONAL_INSIGHTS_LOADER", c22673i0.getOrCreateKotlinClass(HormonalInsightsLoaderModel.class)), new C23465k("LOG_DATA_BUTTON", c22673i0.getOrCreateKotlinClass(LogDataButtonModel.class)), new C23465k("MCI_MEDICAL_DISCLAIMER", c22673i0.getOrCreateKotlinClass(MciMedicalDisclaimerModel.class)), new C23465k("MCI_TILE_SECTION", c22673i0.getOrCreateKotlinClass(MciTileSectionModel.class)), new C23465k("MENU_ITEM", c22673i0.getOrCreateKotlinClass(HormonalInsightsMenuItemModel.class)), new C23465k("NATURAL_CYCLES_FERTILITY_CARD", c22673i0.getOrCreateKotlinClass(NaturalCyclesFertilityCardModel.class)), new C23465k("POSSIBLE_SYMPTOMS_CARD", c22673i0.getOrCreateKotlinClass(PossibleSymptomsCardModel.class)), new C23465k("PREGNANCY_DISCLAIMER", c22673i0.getOrCreateKotlinClass(PregnancyDisclaimer.class)), new C23465k("PRIVACY_TILE", c22673i0.getOrCreateKotlinClass(HormonalInsightsPrivacy.class)), new C23465k("SETTINGS_TOGGLE", c22673i0.getOrCreateKotlinClass(HormonalInsightsToggle.class)), new C23465k("TILE_WITH_TITLE", c22673i0.getOrCreateKotlinClass(TileWithTitleModel.class)), new C23465k("TYPICAL_CYCLE_TILE", c22673i0.getOrCreateKotlinClass(TypicalCycleTileModel.class)), new C23465k("UPSELL_TILE", c22673i0.getOrCreateKotlinClass(HormonalInsightsUpsell.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C22756e m5601f1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "hormonal-insights-feature-models");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        InterfaceC26834e interfaceC26834e = (InterfaceC26834e) c38266c.m122602a(new C1870e(map, new C34648i(AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null)), 0), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null);
        return new C22756e((HormonalInsightsApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(HormonalInsightsApi.class), null), interfaceC26834e, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C1868c m5603g0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C1868c((Map) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("hormonal-insights-feature-models")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C34911a m5604g1(Map map, C34648i c34648i) {
        return AbstractC15751g.m44431K(map, c34648i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C27031i m5606h0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27031i((C22756e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22756e.class), null), (C28097b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28097b.class), null), (C22753b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C22753b.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C28097b m5607h1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28097b((AbstractC0757c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("hormonal-insights-polymorphic-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static final C14678f m5609i0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14678f((HormonalInsightsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(HormonalInsightsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C22753b m5610i1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22753b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C20812a m5612j0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C20812a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C17547g m5614k0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17547g((C20812a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20812a.class), null), (C14678f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14678f.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C39673b m5616l0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39673b((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C12254a m5618m0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C12254a((InterfaceC41070a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C40927d m5620n0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40927d((HormonalInsightsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(HormonalInsightsApi.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C11023j m5622o0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11023j((C40927d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40927d.class), null), (C12254a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12254a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C34012e m5624p0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34012e((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("hormonal-insights-polymorphic-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C28058d m5626q0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28058d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C1867b m5628r0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C1867b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C28061g m5630s0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "hormonal-insights-feature-models");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null);
        C34648i c34648i = new C34648i(abstractC0757cM20380e);
        return new C28061g((C30695c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (HormonalInsightsApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(HormonalInsightsApi.class), null), (InterfaceC26834e) c38266c.m122602a(new C1870e(map, c34648i, 2), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C38458b) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C38458b.class), null), (InterfaceC41070a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), null, null, (AbstractC21909c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (C37378a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), abstractC0757cM20380e, 96, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C34911a m5632t0(Map map, C34648i c34648i) {
        return AbstractC15751g.m44431K(map, c34648i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C32805b0 m5634u0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32805b0((C28061g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28061g.class), null), (C34012e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34012e.class), null), (C28058d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28058d.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C34009b m5636v0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34009b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C28056b m5638w0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28056b((HormonalInsightsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(HormonalInsightsApi.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C32830o m5640x0(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32830o((C28056b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28056b.class), null), (C34009b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34009b.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C34021n m5642y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34021n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public static final C28065k m5644z0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28065k((HormonalInsightsApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(HormonalInsightsApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m5597e0(c33768a);
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
