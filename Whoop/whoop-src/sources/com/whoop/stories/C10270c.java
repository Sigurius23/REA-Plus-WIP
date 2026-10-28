package com.whoop.stories;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.journal.model.CurrentCycle;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.GenericCachePolicy;
import com.whoop.navigation.GenericScreenModel;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.stories.C10270c;
import fi0.InterfaceC14515a;
import hi0.AbstractC17307e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.C21173v0;
import j02.InterfaceC21159o0;
import java.net.URLDecoder;
import java.util.List;
import ji0.InterfaceC21718f;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import lh2.C24075f;
import p031b9.AbstractC2875y;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12982q;
import p114eb.C12997x0;
import p292l1.C23121k0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pr1.C29490a;
import v32.C35613a;
import vm2.C36159d;
import yb0.AbstractC39383f;
import yb3.AbstractC39414r;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: com.whoop.stories.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 S2\u00020\u0001:\u0001?Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001f\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020!¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0002¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020!H\u0002¢\u0006\u0004\b+\u0010#J\u000f\u0010,\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010#J\u000f\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b-\u0010#J\u000f\u0010.\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020!H\u0002¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020!H\u0002¢\u0006\u0004\b0\u0010#J\u000f\u00101\u001a\u00020!H\u0002¢\u0006\u0004\b1\u0010#J\u001f\u00105\u001a\u0002042\u0006\u00103\u001a\u0002022\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020!H\u0002¢\u0006\u0004\b7\u0010#J\u000f\u00108\u001a\u00020%H\u0002¢\u0006\u0004\b8\u0010'J\u0017\u00109\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020!H\u0002¢\u0006\u0004\b;\u0010#J\u0017\u0010<\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b<\u0010:J\u000f\u0010=\u001a\u00020!H\u0002¢\u0006\u0004\b=\u0010#J\u000f\u0010>\u001a\u00020!H\u0002¢\u0006\u0004\b>\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006T"}, m65681d2 = {"Lcom/whoop/stories/c;", "", "Landroidx/fragment/app/m0;", "fragment", "Lkotlin/Function0;", "Leb/a0;", "navController", "Lj02/i0;", "navDeepLinkRequestHelper", "Lcom/whoop/stories/b;", "navigateToCustomizeJournal", "Lv32/a;", "pregnancyAnalytics", "Lfi0/a;", "analyticsManager", "Lj02/o0;", "appNavigator", "Lzr2/a;", "dateAndTimeProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lji0/f;", "bffBottomNavConfigSource", "<init>", "(Landroidx/fragment/app/m0;Lc93/a;Lj02/i0;Lcom/whoop/stories/b;Lv32/a;Lfi0/a;Lj02/o0;Lzr2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lji0/f;)V", "Lcom/whoop/data/onboarding/FeatureEducationType;", "type", "", "entryPoint", "", "cycleId", "M", "(Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;J)Lcom/whoop/stories/b;", "Ll83/a0;", "u", "()V", "A", "", "f0", "()Z", "C", "(J)V", "K", "G", "F", "B", "H", "y", "x", "L", "Lpr1/a;", "journalNavInfo", "Leb/k0;", "t", "(Lpr1/a;J)Leb/k0;", "z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "J", "(Ljava/lang/String;)V", "I", "D", "v", "E", "a", "Landroidx/fragment/app/m0;", "b", "Lc93/a;", "c", "Lj02/i0;", "d", "Lcom/whoop/stories/b;", "e", "Lv32/a;", "f", "Lfi0/a;", "g", "Lj02/o0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lzr2/a;", "i", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "j", "Lji0/f;", "k", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10270c {

    /* JADX INFO: renamed from: l */
    public static final int f31045l = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC10269b navigateToCustomizeJournal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C35613a pregnancyAnalytics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC14515a analyticsManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC21159o0 appNavigator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC21718f bffBottomNavConfigSource;

    /* JADX INFO: renamed from: com.whoop.stories.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31056a;

        static {
            int[] iArr = new int[FeatureEducationType.values().length];
            try {
                iArr[FeatureEducationType.CUSTOMIZE_JOURNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeatureEducationType.SAVE_JOURNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FeatureEducationType.ALARM_SCHEDULING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FeatureEducationType.PREGNANCY_STORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FeatureEducationType.PREGNANCY_STORY_V2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FeatureEducationType.WEIGHTLIFTING_MSK_STORY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FeatureEducationType.STRESS_MONITOR_STORY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FeatureEducationType.ARRHYTHMIA_EDUCATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FeatureEducationType.ARRHYTHMIA_FTU_EDUCATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FeatureEducationType.ARRHYTHMIA_FTU_HARVARD_EDUCATION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FeatureEducationType.ECG_EDUCATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FeatureEducationType.HEALTHSPAN_ONBOARDING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FeatureEducationType.SAGE_ONBOARDING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FeatureEducationType.COMMUNITY_ONBOARDING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[FeatureEducationType.WIDGET_ONBOARDING_ANDROID.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[FeatureEducationType.ADVANCED_LABS_EARLY_ACCESS_ONBOARDING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[FeatureEducationType.SYMPTOM_INSIGHTS_ONBOARDING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[FeatureEducationType.CONTEXT_HUB_EDUCATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f31056a = iArr;
        }
    }

    public C10270c(AbstractComponentCallbacksC1320m0 fragment, InterfaceC4339a navController, C21147i0 navDeepLinkRequestHelper, AbstractC10269b navigateToCustomizeJournal, C35613a pregnancyAnalytics, InterfaceC14515a analyticsManager, InterfaceC21159o0 appNavigator, InterfaceC41070a dateAndTimeProvider, FeatureFlagChecker featureFlagChecker, InterfaceC21718f bffBottomNavConfigSource) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        AbstractC22676k.m65750j(navigateToCustomizeJournal, "navigateToCustomizeJournal");
        AbstractC22676k.m65750j(pregnancyAnalytics, "pregnancyAnalytics");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(appNavigator, "appNavigator");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(bffBottomNavConfigSource, "bffBottomNavConfigSource");
        this.fragment = fragment;
        this.navController = navController;
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.navigateToCustomizeJournal = navigateToCustomizeJournal;
        this.pregnancyAnalytics = pregnancyAnalytics;
        this.analyticsManager = analyticsManager;
        this.appNavigator = appNavigator;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.bffBottomNavConfigSource = bffBottomNavConfigSource;
    }

    /* JADX INFO: renamed from: B */
    private final void m26185B() {
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
    }

    /* JADX INFO: renamed from: C */
    private final void m26186C(long cycleId) {
        long j7 = cycleId != -1 ? cycleId : -1L;
        CurrentCycle currentCycle = new CurrentCycle(0L, 0L, 0L, 0L, 15, null);
        String string = this.dateAndTimeProvider.mo133365d().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        C29490a c29490a = new C29490a(j7, -1L, -1L, currentCycle, string);
        C12969k0 c12969k0M26233t = m26233t(c29490a, c29490a.getCycleId());
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
        ((AbstractC12939a0) this.navController.invoke()).m36404s(c12969k0M26233t);
    }

    /* JADX INFO: renamed from: D */
    private final void m26187D(String entryPoint) {
        C12997x0 c12997x0 = new C12997x0(true, false, AbstractC22676k.m65745e(entryPoint, "hearthealthtab") ? AbstractC17307e.f66875z2 : AbstractC17307e.f66562D2, false, false, -1, -1, -1, -1);
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
        ((AbstractC12939a0) this.navController.invoke()).m36405t(this.navDeepLinkRequestHelper.m58994a("android-app://com.whoop/labradorSubmitEligibilityFragment"), c12997x0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private final void m26188E() {
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
        if (!this.featureFlagChecker.isFeatureEnabled("hormonal-insights-arch-v2")) {
            this.appNavigator.mo59393b(new AbstractC21155m0.v2(null, true, null, null, null, 24, null));
            return;
        }
        CachePolicyModel cachePolicyModel = null;
        MetricEventModel metricEventModel = null;
        GenericInteraction genericInteraction = null;
        List list = null;
        List list2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        C21173v0 c21173v0 = null;
        this.appNavigator.mo59392a(new C9598e(AppScreen.C9346k2.f27718w, new GenericScreenModel(new ApiRequest("womens-health-service/v1/hormonal-insights/overview", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), cachePolicyModel, (String) objArr2, (ScreenAnalyticEventModel) objArr3, metricEventModel, (AiAction) objArr, genericInteraction, list, list2, 510, (DefaultConstructorMarker) null), c21173v0, 4, 0 == true ? 1 : 0));
    }

    /* JADX INFO: renamed from: F */
    private final void m26189F() {
        this.pregnancyAnalytics.m112825a();
        Uri uri = Uri.parse("android-app://com.whoop/pregnancyInsights");
        AbstractC22676k.m65750j(uri, "uri");
        C12969k0 c12969k0 = new C12969k0(uri, null, null);
        C12997x0 c12997x0 = new C12997x0(true, false, -1, false, false, -1, -1, -1, -1);
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
        abstractC12939a0.getClass();
        abstractC12939a0.m36409x(c12969k0, c12997x0);
    }

    /* JADX INFO: renamed from: G */
    private final void m26190G() {
        this.pregnancyAnalytics.m112825a();
        Uri uri = Uri.parse("android-app://com.whoop/pregnancySettingsFragment");
        AbstractC22676k.m65750j(uri, "uri");
        C12969k0 c12969k0 = new C12969k0(uri, null, null);
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
        ((AbstractC12939a0) this.navController.invoke()).m36404s(c12969k0);
    }

    /* JADX INFO: renamed from: H */
    private final void m26191H() {
        this.appNavigator.mo59393b(AbstractC21155m0.f4.f80365b);
    }

    /* JADX INFO: renamed from: I */
    private final void m26192I() {
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
    }

    /* JADX INFO: renamed from: J */
    private final void m26193J(String entryPoint) {
        int i13;
        this.analyticsManager.mo41424f("ANF", "Exit", "Afib onboarding", "ANF");
        if (AbstractC22676k.m65745e(entryPoint, "arrhythmiaSettings")) {
            i13 = AbstractC17307e.f66835t4;
        } else {
            i13 = AbstractC22676k.m65745e(entryPoint, "hearthealthtab") ? AbstractC17307e.f66875z2 : AbstractC17307e.f66562D2;
        }
        C12997x0 c12997x0 = new C12997x0(true, false, i13, false, false, -1, -1, -1, -1);
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
        ((AbstractC12939a0) this.navController.invoke()).m36405t(this.navDeepLinkRequestHelper.m58994a("whoop://com.whoop/shepherdSubmitFragment"), c12997x0);
    }

    /* JADX INFO: renamed from: K */
    private final void m26194K() {
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
        ((AbstractC12939a0) this.navController.invoke()).m36401p(AbstractC17307e.f66872z, null, null);
    }

    /* JADX INFO: renamed from: L */
    private final void m26195L() {
        this.analyticsManager.mo41424f("Onboarding", "Complete", "", "Workout Builder");
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ AbstractC10269b m26196N(C10270c c10270c, FeatureEducationType featureEducationType, String str, long j7, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            j7 = -1;
        }
        return c10270c.m26240M(featureEducationType, str, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m26197O(C10270c c10270c, long j7) {
        c10270c.m26186C(j7);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m26198P(C10270c c10270c) {
        c10270c.m26194K();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m26199Q(C10270c c10270c) {
        c10270c.m26191H();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m26200R(C10270c c10270c) {
        c10270c.m26237y();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m26201S(C10270c c10270c) {
        c10270c.m26234v();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m26202T(C10270c c10270c) {
        c10270c.m26236x();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m26203U(C10270c c10270c) {
        c10270c.m26188E();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m26204V(C10270c c10270c) {
        c10270c.m26238z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m26205W(C10270c c10270c) {
        ((AbstractC12939a0) c10270c.navController.invoke()).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m26206X(C10270c c10270c) {
        c10270c.m26190G();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m26207Y(C10270c c10270c) {
        c10270c.m26189F();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m26208Z(C10270c c10270c) {
        c10270c.m26195L();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m26210a0(C10270c c10270c) {
        c10270c.m26235w();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m26212b0(C10270c c10270c, String str) {
        c10270c.m26193J(str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m26214c0(C10270c c10270c) {
        c10270c.m26192I();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m26216d0(C10270c c10270c, String str) {
        c10270c.m26187D(str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m26218e0(C10270c c10270c) {
        c10270c.m26185B();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final AbstractC12939a0 m26232s(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        return AbstractC5583n.m16799z(abstractComponentCallbacksC1320m0);
    }

    /* JADX INFO: renamed from: t */
    private final C12969k0 m26233t(C29490a journalNavInfo, long cycleId) {
        if (cycleId == -1) {
            cycleId = -1;
        }
        long jM90102d = journalNavInfo.getPreviousDayCycleStartTime() > 0 ? journalNavInfo.getPreviousDayCycleStartTime() : -1L;
        long jM90101c = journalNavInfo.getPreviousDayCycleEndTime() > 0 ? journalNavInfo.getPreviousDayCycleEndTime() : -1L;
        long todayCycleStartTime = journalNavInfo.getCurrentCycle().getTodayCycleStartTime();
        long todayCycleEndTime = journalNavInfo.getCurrentCycle().getTodayCycleEndTime();
        String strM90103e = journalNavInfo.getRequestDate();
        StringBuilder sbM125596b = AbstractC39383f.m125596b(cycleId, "android-app://com.whoop.journal.view.fragment/", "/");
        sbM125596b.append(jM90102d);
        AbstractC2875y.m8285A(sbM125596b, "/", jM90101c, "?todayCycleStartTime=");
        sbM125596b.append(todayCycleStartTime);
        AbstractC2875y.m8285A(sbM125596b, "&todayCycleEndTime=", todayCycleEndTime, "&fromSettings=false&source=Onboarding&newHome=false&fromFab=false&showCustomize=false&requestDate=");
        sbM125596b.append(strM90103e);
        return this.navDeepLinkRequestHelper.m58994a(sbM125596b.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    private final void m26234v() {
        this.appNavigator.mo59393b(new AbstractC21155m0.z1(null, 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: renamed from: w */
    private final boolean m26235w() {
        return ((AbstractC12939a0) this.navController.invoke()).m36410z();
    }

    /* JADX INFO: renamed from: x */
    private final void m26236x() {
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    private final void m26237y() {
        this.appNavigator.mo59393b(new AbstractC21155m0.o0(null, 1, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private final void m26238z() {
        boolean zM26241f0 = m26241f0();
        ((AbstractC12939a0) this.navController.invoke()).m36410z();
        if (zM26241f0) {
            return;
        }
        GenericCachePolicy genericCachePolicy = null;
        MetricEventModel metricEventModel = null;
        GenericInteraction genericInteraction = null;
        C12997x0 c12997x0 = null;
        List list = null;
        List list2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        this.appNavigator.mo59393b(new AbstractC21155m0.m1(new ApiRequest("/context-hub-bff/v1/context-hub", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), genericCachePolicy, objArr2, objArr3, metricEventModel, objArr, genericInteraction, c12997x0, list, list2, 1022, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final void m26239A() {
        TabConfiguration tabConfigurationMo61186b = this.bffBottomNavConfigSource.mo61186b();
        InterfaceC21159o0 interfaceC21159o0 = this.appNavigator;
        if (!(interfaceC21159o0 instanceof C36159d) || tabConfigurationMo61186b == null) {
            interfaceC21159o0.mo59392a(new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel((String) (0 == true ? 1 : 0), (AiAction) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)), tabConfigurationMo61186b != null ? new C21173v0(tabConfigurationMo61186b.getId()) : null));
        } else {
            ((C36159d) interfaceC21159o0).m115096L0(tabConfigurationMo61186b);
        }
    }

    /* JADX INFO: renamed from: M */
    public final AbstractC10269b m26240M(FeatureEducationType type, final String entryPoint, long cycleId) {
        AbstractC22676k.m65750j(entryPoint, "entryPoint");
        switch (type == null ? -1 : b.f31056a[type.ordinal()]) {
            case 1:
                return this.navigateToCustomizeJournal;
            case 2:
                return new AbstractC10269b.c(new C23121k0(this, cycleId, 2));
            case 3:
                final int i13 = 13;
                return new AbstractC10269b.b(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 4:
                final int i14 = 0;
                return new AbstractC10269b.k(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 5:
                final int i15 = 1;
                return new AbstractC10269b.j(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 6:
                final int i16 = 2;
                return new AbstractC10269b.q(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 7:
                final int i17 = 3;
                return new AbstractC10269b.o(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 8:
                final int i18 = 0;
                return new AbstractC10269b.n(new InterfaceC4339a(this) { // from class: lh2.h

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95123x;

                    {
                        this.f95123x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return C10270c.m26212b0(this.f95123x, entryPoint);
                            default:
                                return C10270c.m26216d0(this.f95123x, entryPoint);
                        }
                    }
                });
            case 9:
            case 10:
                final int i19 = 4;
                return new AbstractC10269b.m(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 11:
                final int i24 = 1;
                return new AbstractC10269b.h(new InterfaceC4339a(this) { // from class: lh2.h

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95123x;

                    {
                        this.f95123x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                return C10270c.m26212b0(this.f95123x, entryPoint);
                            default:
                                return C10270c.m26216d0(this.f95123x, entryPoint);
                        }
                    }
                });
            case 12:
                final int i25 = 5;
                return new AbstractC10269b.g(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i25) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 13:
                final int i26 = 6;
                return new AbstractC10269b.l(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i26) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 14:
                final int i27 = 7;
                return new AbstractC10269b.d(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i27) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 15:
                final int i28 = 8;
                return new AbstractC10269b.r(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i28) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case 16:
                final int i29 = 9;
                return new AbstractC10269b.a(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i29) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                final int i34 = 10;
                return new AbstractC10269b.p(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i34) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                final int i35 = 11;
                return new AbstractC10269b.e(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i35) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
            default:
                final int i36 = 12;
                return new AbstractC10269b.i(new InterfaceC4339a(this) { // from class: lh2.g

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C10270c f95121x;

                    {
                        this.f95121x = this;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i36) {
                            case 0:
                                return C10270c.m26206X(this.f95121x);
                            case 1:
                                return C10270c.m26207Y(this.f95121x);
                            case 2:
                                return C10270c.m26208Z(this.f95121x);
                            case 3:
                                return C10270c.m26210a0(this.f95121x);
                            case 4:
                                return C10270c.m26214c0(this.f95121x);
                            case 5:
                                return C10270c.m26218e0(this.f95121x);
                            case 6:
                                return C10270c.m26199Q(this.f95121x);
                            case 7:
                                return C10270c.m26200R(this.f95121x);
                            case 8:
                                return C10270c.m26201S(this.f95121x);
                            case 9:
                                return C10270c.m26202T(this.f95121x);
                            case 10:
                                return C10270c.m26203U(this.f95121x);
                            case 11:
                                return C10270c.m26204V(this.f95121x);
                            case 12:
                                return C10270c.m26205W(this.f95121x);
                            default:
                                return C10270c.m26198P(this.f95121x);
                        }
                    }
                });
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m26241f0() {
        Bundle bundleM36479a;
        String string;
        String strDecode;
        C12982q c12982qM36398m = ((AbstractC12939a0) this.navController.invoke()).m36398m();
        return (c12982qM36398m == null || (bundleM36479a = c12982qM36398m.m36479a()) == null || (string = bundleM36479a.getString("request")) == null || (strDecode = URLDecoder.decode(string, "UTF-8")) == null || !AbstractC39414r.m125876U(strDecode, "/context-hub-bff/v1/context-hub", false)) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public final void m26242u() {
        AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.navController.invoke();
        abstractC12939a0.m36410z();
        if (AbstractC9597d.m23119k(abstractC12939a0)) {
            m26239A();
        } else {
            abstractC12939a0.m36410z();
        }
    }

    public /* synthetic */ C10270c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC4339a interfaceC4339a, C21147i0 c21147i0, AbstractC10269b abstractC10269b, C35613a c35613a, InterfaceC14515a interfaceC14515a, InterfaceC21159o0 interfaceC21159o0, InterfaceC41070a interfaceC41070a, FeatureFlagChecker featureFlagChecker, InterfaceC21718f interfaceC21718f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractComponentCallbacksC1320m0, (i13 & 2) != 0 ? new C24075f(abstractComponentCallbacksC1320m0, 0) : interfaceC4339a, (i13 & 4) != 0 ? new C21147i0() : c21147i0, abstractC10269b, c35613a, interfaceC14515a, interfaceC21159o0, interfaceC41070a, featureFlagChecker, interfaceC21718f);
    }
}
