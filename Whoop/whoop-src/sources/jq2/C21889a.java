package jq2;

import ad3.AbstractC0757c;
import ao1.C1873h;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import com.whoop.user.journey.model.yearinreview.AnimatableTextModel;
import com.whoop.user.journey.model.yearinreview.TimeCapsuleModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewComparisonModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewHighlightsListModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewStreaksStatsCard;
import com.whoop.user.journey.model.yearinreview.YearInReviewSummaryCardModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.GaugeValueModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.InsightValueListModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.NumberValueModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.YearInReviewCardModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.YearInReviewTimelineModel;
import com.whoop.user.journey.sources.data.UserJourneyApi;
import eq2.C13566d;
import fi0.InterfaceC14515a;
import fq2.C14688e;
import fq2.C14689f;
import gq2.C16082a;
import gq2.C16083b;
import hq2.C17570a;
import ih0.AbstractC18489d0;
import iq2.AbstractC20856b;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.List;
import java.util.Map;
import jj1.C21739a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kq2.C22775a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import mr2.C25924a;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p138f6.C14131c;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u82.AbstractC34645f;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;
import zp2.C40944b;
import zp2.C40946d;
import zp2.C40948f;
import zp2.C40952j;

/* JADX INFO: renamed from: jq2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Ljq2/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21889a implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C40946d m62117A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40946d((UserJourneyApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(UserJourneyApi.class), null), InterfaceC34116n.INSTANCE.m107848a("UserJourneyContentInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C40952j m62118B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40952j((UserJourneyApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(UserJourneyApi.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), InterfaceC34116n.INSTANCE.m107848a("UserJourneyProgressInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C40948f m62119C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40948f((C40946d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40946d.class), null), (C40952j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40952j.class), null), (C40944b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40944b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C14689f m62120D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14689f((C14688e) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14688e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C14688e m62121E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14688e((C16082a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C16082a.class), null), (C16083b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C16083b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C22775a m62122F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22775a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C16082a m62123G(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C16082a();
    }

    /* JADX INFO: renamed from: q */
    private static final C23454a0 m62140q(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "USER_JOURNEY_FEATURE_MODELS");
        C21739a c21739a = new C21739a(6);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c21739a, 2)), false);
        C21739a c21739a2 = new C21739a(17);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(UserJourneyApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c21739a2, 2)), false);
        C21739a c21739a3 = new C21739a(18);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C13566d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c21739a3, 2)), false);
        C21739a c21739a4 = new C21739a(19);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C40946d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c21739a4, 2)), false);
        C21739a c21739a5 = new C21739a(20);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C40952j.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c21739a5, 2)), false);
        C21739a c21739a6 = new C21739a(7);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C40948f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c21739a6, 2)), false);
        C21739a c21739a7 = new C21739a(8);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C14689f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c21739a7, 2)), false);
        C21739a c21739a8 = new C21739a(9);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C14688e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c21739a8, 2)), false);
        C21739a c21739a9 = new C21739a(10);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C22775a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c21739a9, 2)), false);
        C21739a c21739a10 = new C21739a(11);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C16082a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass10, null, c21739a10, 1)), false);
        C21739a c21739a11 = new C21739a(12);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C16083b.class);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(new C30330b(c35953c, orCreateKotlinClass11, null, c21739a11, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), false, "timeCapsuleDataStore");
        C21739a c21739a12 = new C21739a(13);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, c35953cM53379t, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass12, c35953cM53379t, c21739a12, 1)), false);
        C21739a c21739a13 = new C21739a(14);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C17570a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c21739a13, 2)), false);
        C21739a c21739a14 = new C21739a(15);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C25924a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c21739a14, 2)), false);
        C21739a c21739a15 = new C21739a(16);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C40944b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass15, null, c21739a15, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Map m62141r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("ANIMATABLE_TEXT", c22673i0.getOrCreateKotlinClass(AnimatableTextModel.class)), new C23465k("INSIGHT_VALUE_LIST", c22673i0.getOrCreateKotlinClass(InsightValueListModel.class)), new C23465k("GAUGE_VALUE", c22673i0.getOrCreateKotlinClass(GaugeValueModel.class)), new C23465k("NUMBER_VALUE", c22673i0.getOrCreateKotlinClass(NumberValueModel.class)), new C23465k("YEAR_IN_REVIEW_CARD", c22673i0.getOrCreateKotlinClass(YearInReviewCardModel.class)), new C23465k("YEAR_IN_REVIEW_COMPARISON", c22673i0.getOrCreateKotlinClass(YearInReviewComparisonModel.class)), new C23465k("YEAR_IN_REVIEW_HIGHLIGHTS_TEXT_LIST", c22673i0.getOrCreateKotlinClass(YearInReviewHighlightsListModel.class)), new C23465k("YEAR_IN_REVIEW_STREAKS_STATS_CARD", c22673i0.getOrCreateKotlinClass(YearInReviewStreaksStatsCard.class)), new C23465k("YEAR_IN_REVIEW_SUMMARY_CARD", c22673i0.getOrCreateKotlinClass(YearInReviewSummaryCardModel.class)), new C23465k("YEAR_IN_REVIEW_TIMELINE", c22673i0.getOrCreateKotlinClass(YearInReviewTimelineModel.class)), new C23465k("TIME_CAPSULE", c22673i0.getOrCreateKotlinClass(TimeCapsuleModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final UserJourneyApi m62142s(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "USER_JOURNEY_FEATURE_MODELS");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757cM57607b = AbstractC20856b.m57607b((Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757cM57607b));
        return (UserJourneyApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), UserJourneyApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C16083b m62143t(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C16083b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC0422g m62144u(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22365e c22365e = AbstractC3050q0.f12077a;
        return C14131c.m40232d(null, AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d())), new C1873h(single, 18), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final File m62145v(C38266c c38266c) {
        return AbstractC21598x.m60684i0(AbstractC29125c.m88531h(c38266c), "time_capsule_prefs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C17570a m62146w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17570a((InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), new C35953c("timeCapsuleDataStore")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C25924a m62147x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25924a((AbstractC18377p0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C40944b m62148y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40944b((UserJourneyApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(UserJourneyApi.class), null), (C17570a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17570a.class), null), (C25924a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25924a.class), null), InterfaceC34116n.INSTANCE.m107848a("TimeCapsuleRepository"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C13566d m62149z(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13566d((C40948f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C40948f.class), null), (C14689f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C14689f.class), null), null, 4, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m62140q(c33768a);
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
