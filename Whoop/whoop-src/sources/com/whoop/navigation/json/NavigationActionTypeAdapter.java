package com.whoop.navigation.json;

import ad3.AbstractC0757c;
import ad3.C0764g;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.whoop.navigation.AccessReconfirmBaselinesScreenModel;
import com.whoop.navigation.AchievementMilestoneUnlockScreenModel;
import com.whoop.navigation.AchievementsScreenModel;
import com.whoop.navigation.ActivationAccountActivationScreenModel;
import com.whoop.navigation.ActivationAccountCreationScreenModel;
import com.whoop.navigation.ActivationAccountTransitionLegacyAfterActivationScreenModel;
import com.whoop.navigation.ActivationAlAfterActivationScreenModel;
import com.whoop.navigation.ActivationAlPermissionsScreenModel;
import com.whoop.navigation.ActivationAlProfileScreenModel;
import com.whoop.navigation.ActivationDeviceEducationScreenModel;
import com.whoop.navigation.ActivationEnterYourEmailScreenModel;
import com.whoop.navigation.ActivationEnterYourPasswordScreenModel;
import com.whoop.navigation.ActivationHwOnlyAfterActivationScreenModel;
import com.whoop.navigation.ActivationHwOnlyPermissionsScreenModel;
import com.whoop.navigation.ActivationHwOnlyProfileScreenModel;
import com.whoop.navigation.ActivationInAppJoinFlowScreenModel;
import com.whoop.navigation.ActivationMedicareAfterActivationScreenModel;
import com.whoop.navigation.ActivationMedicarePermissionsScreenModel;
import com.whoop.navigation.ActivationMembershipServicesScreenModel;
import com.whoop.navigation.ActivationMfaChallengeScreenModel;
import com.whoop.navigation.ActivationPairingScreenModel;
import com.whoop.navigation.ActivationPostPairingScreenModel;
import com.whoop.navigation.ActivationStartScreenScreenModel;
import com.whoop.navigation.ActivityEditModel;
import com.whoop.navigation.AddActivityModel;
import com.whoop.navigation.AdvancedLabsActionPlanScreenModel;
import com.whoop.navigation.AdvancedLabsEditBiomarkersScreenModel;
import com.whoop.navigation.AdvancedLabsEditTestDetailsScreenModel;
import com.whoop.navigation.AdvancedLabsHormonalContextScreenModel;
import com.whoop.navigation.AdvancedLabsInsightsDeepDiveScreenModel;
import com.whoop.navigation.AdvancedLabsInsightsScreenModel;
import com.whoop.navigation.AdvancedLabsJoinScreenModel;
import com.whoop.navigation.AdvancedLabsManagementScreenModel;
import com.whoop.navigation.AdvancedLabsNativeSchedulingScreenModel;
import com.whoop.navigation.AdvancedLabsPrimerScreenModel;
import com.whoop.navigation.AdvancedLabsPurchaseAddOnsScreenModel;
import com.whoop.navigation.AdvancedLabsSchedulingFormScreenModel;
import com.whoop.navigation.AdvancedLabsSchedulingStepScreenModel;
import com.whoop.navigation.AdvancedLabsScreenModel;
import com.whoop.navigation.AdvancedLabsTestHistoryScreenModel;
import com.whoop.navigation.AdvancedLabsTestResultsScreenModel;
import com.whoop.navigation.AdvancedLabsTypeformWebviewScreenModel;
import com.whoop.navigation.AdvancedLabsUpdateTestsScreenModel;
import com.whoop.navigation.AdvancedLabsUploadTestScreenModel;
import com.whoop.navigation.AfterActivationFinalScreensScreenModel;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.AiInsightsScreenModel;
import com.whoop.navigation.AllBiomarkerRecordingsScreenModel;
import com.whoop.navigation.AnnualUpsellSwitchModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.AuthenticatedWebViewModel;
import com.whoop.navigation.BehaviorDetailsScreenModel;
import com.whoop.navigation.BehaviorImpactsScreenModel;
import com.whoop.navigation.BiomarkerDetailsScreenModel;
import com.whoop.navigation.BiomarkerSummaryScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CardioDetailsScreenModel;
import com.whoop.navigation.ChallengeLandingScreenModel;
import com.whoop.navigation.ChallengesScreenModel;
import com.whoop.navigation.CheckoutScreenModel;
import com.whoop.navigation.CheckoutWithCartScreenModel;
import com.whoop.navigation.ClinicianSchedulingConfirmationScreenModel;
import com.whoop.navigation.ClinicianVideoSchedulingIntakeScreenModel;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.CoachSettingsScreenModel;
import com.whoop.navigation.CommunityFollowersScreenModel;
import com.whoop.navigation.CommunityScreenModel;
import com.whoop.navigation.CommunityTeamScreenModel;
import com.whoop.navigation.CommunityTeamsHubScreenModel;
import com.whoop.navigation.ConnectivityNavigationScreenModel;
import com.whoop.navigation.CustomizeBottomSheetScreenModel;
import com.whoop.navigation.CustomizeJournalScreenModel;
import com.whoop.navigation.CustomizeOverviewModel;
import com.whoop.navigation.CyclePatternHistoryScreenModel;
import com.whoop.navigation.DayZeroPersonalizationScreenModel;
import com.whoop.navigation.DayZeroSplashScreenModel;
import com.whoop.navigation.DeepDiveScreenModel;
import com.whoop.navigation.DownloadedFileExportScreenModel;
import com.whoop.navigation.EditActivitiesDrawerScreenModel;
import com.whoop.navigation.EditCustomExerciseModel;
import com.whoop.navigation.EnterpriseProgramSettingsScreenModel;
import com.whoop.navigation.ExerciseDetailsScreenModel;
import com.whoop.navigation.ExtensionsScreenModel;
import com.whoop.navigation.FamilyPlanHubScreenModel;
import com.whoop.navigation.FamilyPlanInviteScreenModel;
import com.whoop.navigation.FamilyPlanScreenModel;
import com.whoop.navigation.FeatureEducationModel;
import com.whoop.navigation.FeatureSpecificAppScreen;
import com.whoop.navigation.FeedbackSurveyScreenModel;
import com.whoop.navigation.GenericScreenModel;
import com.whoop.navigation.GiftHubScreenModel;
import com.whoop.navigation.GiftedScreenModel;
import com.whoop.navigation.GiftingScreenModel;
import com.whoop.navigation.HealthMonitorScreenModel;
import com.whoop.navigation.HealthReportScreenModel;
import com.whoop.navigation.HealthTabScreenModel;
import com.whoop.navigation.HealthspanScreenModel;
import com.whoop.navigation.HeartScreenerModel;
import com.whoop.navigation.HiddenMetricsModel;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.HormonalInsightsOnboardingModel;
import com.whoop.navigation.HormonalInsightsSettingsScreenModel;
import com.whoop.navigation.HrSettingsScreenModel;
import com.whoop.navigation.InAppBrowserScreenModel;
import com.whoop.navigation.IntegrationsDisclaimerScreenModel;
import com.whoop.navigation.IntegrationsScreenModel;
import com.whoop.navigation.InterdayJournalScreenModel;
import com.whoop.navigation.JournalScreenModel;
import com.whoop.navigation.LabradorAboutScreenModel;
import com.whoop.navigation.LabradorDetailsScreenModel;
import com.whoop.navigation.LabradorDeviceLocationModel;
import com.whoop.navigation.LabradorOnboardingModel;
import com.whoop.navigation.LabradorReadingModel;
import com.whoop.navigation.LabradorRegistrationModel;
import com.whoop.navigation.LabradorResultsModel;
import com.whoop.navigation.LanguageSettingsScreenModel;
import com.whoop.navigation.LegacyProCheckoutScreenModel;
import com.whoop.navigation.LevelsScreenModel;
import com.whoop.navigation.LimitedTimeOfferScreenModel;
import com.whoop.navigation.LinkWorkoutScreenModel;
import com.whoop.navigation.LogSymptomsScreenModel;
import com.whoop.navigation.LoginScreenModel;
import com.whoop.navigation.MarketingConsentScreenModel;
import com.whoop.navigation.MciLogCalendarScreenModel;
import com.whoop.navigation.MciOverviewScreenModel;
import com.whoop.navigation.MciPhaseCoachingScreenModel;
import com.whoop.navigation.MediaFocusModel;
import com.whoop.navigation.MembershipAdjustmentCheckoutScreenModel;
import com.whoop.navigation.MembershipAdjustmentScreenModel;
import com.whoop.navigation.MembershipAndBillingScreenModel;
import com.whoop.navigation.MembershipManagementScreenModel;
import com.whoop.navigation.MenuScreenModel;
import com.whoop.navigation.MfaSetupScreenModel;
import com.whoop.navigation.MultiConsentScreenModel;
import com.whoop.navigation.MyAccountScreenModel;
import com.whoop.navigation.NativePlanSwitchModel;
import com.whoop.navigation.NativeStoreScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.OmronAuthScreenModel;
import com.whoop.navigation.OnboardingStoryScreenModel;
import com.whoop.navigation.OrderConfirmationScreenModel;
import com.whoop.navigation.PairDeviceScreenModel;
import com.whoop.navigation.PasswordResetScreenModel;
import com.whoop.navigation.PaymentMethodManagementScreenModel;
import com.whoop.navigation.PregnancyInsightsScreenModel;
import com.whoop.navigation.PregnancySettingsScreenModel;
import com.whoop.navigation.PreviousPregnancyScreenModel;
import com.whoop.navigation.PrivacyScreenModel;
import com.whoop.navigation.ProductDescriptionPageScreenModel;
import com.whoop.navigation.ProductSizeGuideScreenModel;
import com.whoop.navigation.ProfileScreenModel;
import com.whoop.navigation.ReactivationUpsellScreenModel;
import com.whoop.navigation.RecoveryDetailsScreenModel;
import com.whoop.navigation.ReferAFriendHubScreenModel;
import com.whoop.navigation.ReferAFriendReceiverScreenModel;
import com.whoop.navigation.ReferAFriendScreenModel;
import com.whoop.navigation.ReturnsScreenModel;
import com.whoop.navigation.SageManualEntryScreenModel;
import com.whoop.navigation.SageOnboardingScreenModel;
import com.whoop.navigation.SageScreenModel;
import com.whoop.navigation.SanguineWaitlistBiomarkersScreenModel;
import com.whoop.navigation.SanguineWaitlistScreenModel;
import com.whoop.navigation.SeeAllRecordingsScreenModel;
import com.whoop.navigation.ShepherdAboutModel;
import com.whoop.navigation.ShepherdDetailsModel;
import com.whoop.navigation.ShepherdHistoryModel;
import com.whoop.navigation.ShepherdOnboardingModel;
import com.whoop.navigation.ShepherdRegistrationModel;
import com.whoop.navigation.ShepherdSettingsModel;
import com.whoop.navigation.SleepDetailsScreenModel;
import com.whoop.navigation.SleepPlannerScreenModel;
import com.whoop.navigation.SmsSetupScreenModel;
import com.whoop.navigation.StartActivityScreenModel;
import com.whoop.navigation.StartActivitySportModel;
import com.whoop.navigation.StreakCelebrationScreenModel;
import com.whoop.navigation.StreaksExplainerModel;
import com.whoop.navigation.StrengthTrainerScreenModel;
import com.whoop.navigation.StressInterventionModel;
import com.whoop.navigation.StressMonitorScreenModel;
import com.whoop.navigation.SymptomPatternsScreenModel;
import com.whoop.navigation.TiltModeScreenModel;
import com.whoop.navigation.TrendsScreenModel;
import com.whoop.navigation.URLScreenModel;
import com.whoop.navigation.UniversalBuyNowScreenModel;
import com.whoop.navigation.UniversalCartScreenModel;
import com.whoop.navigation.UniversalCheckoutScreenModel;
import com.whoop.navigation.UniversalCheckoutShippingAddressScreenModel;
import com.whoop.navigation.UniversalCheckoutShippingMethodScreenModel;
import com.whoop.navigation.UpcycleLandingScreenModel;
import com.whoop.navigation.VideoCallScreenModel;
import com.whoop.navigation.WeekInReviewScreenModel;
import com.whoop.navigation.WeeklyPlanEditScreenModel;
import com.whoop.navigation.WeeklyPlanOverviewScreenModel;
import com.whoop.navigation.WeeklyPlanPresetLandingScreenModel;
import com.whoop.navigation.WeeklyPlanSetupScreenModel;
import com.whoop.navigation.WeeklyPlanSummaryScreenModel;
import com.whoop.navigation.WeightliftingDetailsScreenModel;
import com.whoop.navigation.WhatToExpectScreenModel;
import com.whoop.navigation.WhoopLabsHomeScreenModel;
import com.whoop.navigation.WhoopLabsScreenModel;
import com.whoop.navigation.WhoopLiveScreenModel;
import com.whoop.navigation.WhoopShareScreenModel;
import com.whoop.navigation.YearInReviewScreenModel;
import com.whoop.navigation.exception.NavigationDeserializationException;
import iy1.C21033f;
import iy1.InterfaceC21030c;
import j02.C21173v0;
import j93.InterfaceC21461d;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kg2.C22459e;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25272z;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr2.InterfaceC34116n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001aB/\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001f¨\u0006\""}, m65681d2 = {"Lcom/whoop/navigation/json/NavigationActionTypeAdapter;", "Lcom/google/gson/JsonSerializer;", "Lcom/whoop/navigation/e;", "Lcom/google/gson/JsonDeserializer;", "", "Lcom/whoop/navigation/FeatureSpecificAppScreen;", "Lj93/d;", "Lcom/whoop/navigation/NavigationScreenModel;", "screenModelMap", "Liy1/c;", "metricWriter", "<init>", "(Ljava/util/Map;Liy1/c;)V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "context", "Lcom/google/gson/JsonElement;", "e", "(Lcom/whoop/navigation/e;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;", "json", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "c", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/navigation/e;", "a", "Ljava/util/Map;", "b", "Liy1/c;", "Ltr2/n;", "Ltr2/n;", "logger", "d", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NavigationActionTypeAdapter implements JsonSerializer<C9598e>, JsonDeserializer<C9598e> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f28144e = 8;

    /* JADX INFO: renamed from: f */
    private static final AbstractC0757c f28145f = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C22459e(5));

    /* JADX INFO: renamed from: g */
    private static final Map<AppScreen, InterfaceC21461d> f28146g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<FeatureSpecificAppScreen, InterfaceC21461d> screenModelMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.navigation.json.NavigationActionTypeAdapter$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/navigation/json/NavigationActionTypeAdapter$a;", "", "<init>", "()V", "", "Lcom/whoop/navigation/AppScreen;", "Lj93/d;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "commonMap", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "Lad3/c;", "navigationParametersKtxJson", "Lad3/c;", "", "SCREEN_NAME", "Ljava/lang/String;", "PARAMETERS", "TAB", "TAB_ID", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Map<AppScreen, InterfaceC21461d> m23142a() {
            return NavigationActionTypeAdapter.f28146g;
        }

        private Companion() {
        }
    }

    static {
        AppScreen.C9279c c9279c = AppScreen.C9279c.f27511w;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f28146g = AbstractC25247g0.m73990Y(new C23465k(c9279c, c22673i0.getOrCreateKotlinClass(AchievementsScreenModel.class)), new C23465k(AppScreen.C9263a.f27461w, c22673i0.getOrCreateKotlinClass(AccessReconfirmBaselinesScreenModel.class)), new C23465k(AppScreen.C9324h4.f27650w, c22673i0.getOrCreateKotlinClass(OmronAuthScreenModel.class)), new C23465k(AppScreen.C9271b.f27485w, c22673i0.getOrCreateKotlinClass(AchievementMilestoneUnlockScreenModel.class)), new C23465k(AppScreen.C9441w1.f28009w, c22673i0.getOrCreateKotlinClass(DayZeroSplashScreenModel.class)), new C23465k(AppScreen.C9287d.f27536w, c22673i0.getOrCreateKotlinClass(ActivationAccountActivationScreenModel.class)), new C23465k(AppScreen.C9295e.f27561w, c22673i0.getOrCreateKotlinClass(ActivationAccountCreationScreenModel.class)), new C23465k(AppScreen.C9303f.f27586w, c22673i0.getOrCreateKotlinClass(ActivationAccountTransitionLegacyAfterActivationScreenModel.class)), new C23465k(AppScreen.C9311g.f27610w, c22673i0.getOrCreateKotlinClass(AfterActivationFinalScreensScreenModel.class)), new C23465k(AppScreen.C9319h.f27635w, c22673i0.getOrCreateKotlinClass(ActivationAlAfterActivationScreenModel.class)), new C23465k(AppScreen.C9327i.f27659w, c22673i0.getOrCreateKotlinClass(ActivationAlPermissionsScreenModel.class)), new C23465k(AppScreen.C9335j.f27684w, c22673i0.getOrCreateKotlinClass(ActivationAlProfileScreenModel.class)), new C23465k(AppScreen.C9343k.f27708w, c22673i0.getOrCreateKotlinClass(ActivationDeviceEducationScreenModel.class)), new C23465k(AppScreen.C9351l.f27733w, c22673i0.getOrCreateKotlinClass(ActivationEnterYourEmailScreenModel.class)), new C23465k(AppScreen.C9359m.f27760w, c22673i0.getOrCreateKotlinClass(ActivationEnterYourPasswordScreenModel.class)), new C23465k(AppScreen.C9367n.f27786w, c22673i0.getOrCreateKotlinClass(ActivationHwOnlyAfterActivationScreenModel.class)), new C23465k(AppScreen.C9375o.f27812w, c22673i0.getOrCreateKotlinClass(ActivationHwOnlyPermissionsScreenModel.class)), new C23465k(AppScreen.C9383p.f27837w, c22673i0.getOrCreateKotlinClass(ActivationHwOnlyProfileScreenModel.class)), new C23465k(AppScreen.C9391q.f27861w, c22673i0.getOrCreateKotlinClass(ActivationInAppJoinFlowScreenModel.class)), new C23465k(AppScreen.C9399r.f27881w, c22673i0.getOrCreateKotlinClass(ActivationMedicareAfterActivationScreenModel.class)), new C23465k(AppScreen.C9407s.f27905w, c22673i0.getOrCreateKotlinClass(ActivationMedicarePermissionsScreenModel.class)), new C23465k(AppScreen.C9415t.f27929w, c22673i0.getOrCreateKotlinClass(ActivationMembershipServicesScreenModel.class)), new C23465k(AppScreen.C9423u.f27954w, c22673i0.getOrCreateKotlinClass(ActivationMfaChallengeScreenModel.class)), new C23465k(AppScreen.C9431v.f27978w, c22673i0.getOrCreateKotlinClass(ActivationPairingScreenModel.class)), new C23465k(AppScreen.C9439w.f28003w, c22673i0.getOrCreateKotlinClass(ActivationPostPairingScreenModel.class)), new C23465k(AppScreen.C9447x.f28029w, c22673i0.getOrCreateKotlinClass(ActivationStartScreenScreenModel.class)), new C23465k(AppScreen.C9454y.f28052w, c22673i0.getOrCreateKotlinClass(ActivityEditModel.class)), new C23465k(AppScreen.C9461z.f28074w, c22673i0.getOrCreateKotlinClass(AddActivityModel.class)), new C23465k(AppScreen.C9264a0.f27464w, c22673i0.getOrCreateKotlinClass(AdvancedLabsScreenModel.class)), new C23465k(AppScreen.C9272b0.f27488w, c22673i0.getOrCreateKotlinClass(AdvancedLabsActionPlanScreenModel.class)), new C23465k(AppScreen.C9296e0.f27564w, c22673i0.getOrCreateKotlinClass(AdvancedLabsHormonalContextScreenModel.class)), new C23465k(AppScreen.C9304f0.f27589w, c22673i0.getOrCreateKotlinClass(AdvancedLabsInsightsScreenModel.class)), new C23465k(AppScreen.C9312g0.f27613w, c22673i0.getOrCreateKotlinClass(AdvancedLabsInsightsDeepDiveScreenModel.class)), new C23465k(AppScreen.C9320h0.f27638w, c22673i0.getOrCreateKotlinClass(AdvancedLabsJoinScreenModel.class)), new C23465k(AppScreen.C9328i0.f27662w, c22673i0.getOrCreateKotlinClass(AdvancedLabsManagementScreenModel.class)), new C23465k(AppScreen.C9352l0.f27736w, c22673i0.getOrCreateKotlinClass(AdvancedLabsPrimerScreenModel.class)), new C23465k(AppScreen.C9280c0.f27514w, c22673i0.getOrCreateKotlinClass(AdvancedLabsEditBiomarkersScreenModel.class)), new C23465k(AppScreen.C9288d0.f27539w, c22673i0.getOrCreateKotlinClass(AdvancedLabsEditTestDetailsScreenModel.class)), new C23465k(AppScreen.C9368n0.f27789w, c22673i0.getOrCreateKotlinClass(AdvancedLabsSchedulingFormScreenModel.class)), new C23465k(AppScreen.C9376o0.f27815w, c22673i0.getOrCreateKotlinClass(AdvancedLabsSchedulingStepScreenModel.class)), new C23465k(AppScreen.C9344k0.f27711w, c22673i0.getOrCreateKotlinClass(AdvancedLabsNativeSchedulingScreenModel.class)), new C23465k(AppScreen.C9384p0.f27840w, c22673i0.getOrCreateKotlinClass(AdvancedLabsTestHistoryScreenModel.class)), new C23465k(AppScreen.C9392q0.f27864w, c22673i0.getOrCreateKotlinClass(AdvancedLabsTestResultsScreenModel.class)), new C23465k(AppScreen.C9400r0.f27884w, c22673i0.getOrCreateKotlinClass(AdvancedLabsTypeformWebviewScreenModel.class)), new C23465k(AppScreen.C9416t0.f27932w, c22673i0.getOrCreateKotlinClass(AdvancedLabsUploadTestScreenModel.class)), new C23465k(AppScreen.C9424u0.f27957w, c22673i0.getOrCreateKotlinClass(AiCoachChatScreenModel.class)), new C23465k(AppScreen.C9432v0.f27981w, c22673i0.getOrCreateKotlinClass(AiInsightsScreenModel.class)), new C23465k(AppScreen.C9440w0.f28006w, c22673i0.getOrCreateKotlinClass(AllBiomarkerRecordingsScreenModel.class)), new C23465k(AppScreen.C9448x0.f28033w, c22673i0.getOrCreateKotlinClass(AnnualUpsellSwitchModel.class)), new C23465k(AppScreen.C9455y0.f28055w, c22673i0.getOrCreateKotlinClass(AuthenticatedWebViewModel.class)), new C23465k(AppScreen.C9462z0.f28077w, c22673i0.getOrCreateKotlinClass(BehaviorDetailsScreenModel.class)), new C23465k(AppScreen.C9265a1.f27467w, c22673i0.getOrCreateKotlinClass(BehaviorImpactsScreenModel.class)), new C23465k(AppScreen.C9273b1.f27492w, c22673i0.getOrCreateKotlinClass(BiomarkerDetailsScreenModel.class)), new C23465k(AppScreen.C9281c1.f27517w, c22673i0.getOrCreateKotlinClass(BiomarkerSummaryScreenModel.class)), new C23465k(AppScreen.C9336j0.f27687w, c22673i0.getOrCreateKotlinClass(MultiConsentScreenModel.class)), new C23465k(AppScreen.C9289d1.f27542w, c22673i0.getOrCreateKotlinClass(CardioDetailsScreenModel.class)), new C23465k(AppScreen.C9305f1.f27592w, c22673i0.getOrCreateKotlinClass(ChallengesScreenModel.class)), new C23465k(AppScreen.C9297e1.f27567w, c22673i0.getOrCreateKotlinClass(ChallengeLandingScreenModel.class)), new C23465k(AppScreen.C9313g1.f27616w, c22673i0.getOrCreateKotlinClass(CheckoutScreenModel.class)), new C23465k(AppScreen.C9337j1.f27690w, c22673i0.getOrCreateKotlinClass(ClinicianVideoSchedulingIntakeScreenModel.class)), new C23465k(AppScreen.C9329i1.f27665w, c22673i0.getOrCreateKotlinClass(ClinicianSchedulingConfirmationScreenModel.class)), new C23465k(AppScreen.C9345k1.f27714w, c22673i0.getOrCreateKotlinClass(CoachScreenModel.class)), new C23465k(AppScreen.C9353l1.f27740w, c22673i0.getOrCreateKotlinClass(CoachSettingsScreenModel.class)), new C23465k(AppScreen.C9361m1.f27766w, c22673i0.getOrCreateKotlinClass(CommunityScreenModel.class)), new C23465k(AppScreen.C9433v1.f27984w, c22673i0.getOrCreateKotlinClass(DayZeroPersonalizationScreenModel.class)), new C23465k(AppScreen.C9449x1.f28036w, c22673i0.getOrCreateKotlinClass(DeepDiveScreenModel.class)), new C23465k(AppScreen.C9266a2.f27470w, c22673i0.getOrCreateKotlinClass(EditActivitiesDrawerScreenModel.class)), new C23465k(AppScreen.C9274b2.f27496w, c22673i0.getOrCreateKotlinClass(EditCustomExerciseModel.class)), new C23465k(AppScreen.C9290d2.f27545w, c22673i0.getOrCreateKotlinClass(ExerciseDetailsScreenModel.class)), new C23465k(AppScreen.C9456y1.f28058w, c22673i0.getOrCreateKotlinClass(ConnectivityNavigationScreenModel.class)), new C23465k(AppScreen.C9463z1.f28080w, c22673i0.getOrCreateKotlinClass(DownloadedFileExportScreenModel.class)), new C23465k(AppScreen.C9409s1.f27911w, c22673i0.getOrCreateKotlinClass(CustomizeJournalScreenModel.class)), new C23465k(AppScreen.C9417t1.f27936w, c22673i0.getOrCreateKotlinClass(CustomizeOverviewModel.class)), new C23465k(AppScreen.C9425u1.f27960w, c22673i0.getOrCreateKotlinClass(CyclePatternHistoryScreenModel.class)), new C23465k(AppScreen.C9330i2.f27668w, c22673i0.getOrCreateKotlinClass(FeatureEducationModel.class)), new C23465k(AppScreen.C9338j2.f27693w, c22673i0.getOrCreateKotlinClass(FeedbackSurveyScreenModel.class)), new C23465k(AppScreen.C9346k2.f27718w, c22673i0.getOrCreateKotlinClass(GenericScreenModel.class)), new C23465k(AppScreen.C9354l2.f27743w, c22673i0.getOrCreateKotlinClass(GiftHubScreenModel.class)), new C23465k(AppScreen.C9362m2.f27769w, c22673i0.getOrCreateKotlinClass(GiftedScreenModel.class)), new C23465k(AppScreen.C9370n2.f27796w, c22673i0.getOrCreateKotlinClass(GiftingScreenModel.class)), new C23465k(AppScreen.C9378o2.f27821w, c22673i0.getOrCreateKotlinClass(HealthMonitorScreenModel.class)), new C23465k(AppScreen.C9386p2.f27846w, c22673i0.getOrCreateKotlinClass(HealthReportScreenModel.class)), new C23465k(AppScreen.C9402r2.f27890w, c22673i0.getOrCreateKotlinClass(HealthspanScreenModel.class)), new C23465k(AppScreen.C9394q2.f27867w, c22673i0.getOrCreateKotlinClass(HealthTabScreenModel.class)), new C23465k(AppScreen.C9410s2.f27914w, c22673i0.getOrCreateKotlinClass(HeartScreenerModel.class)), new C23465k(AppScreen.C9418t2.f27939w, c22673i0.getOrCreateKotlinClass(HiddenMetricsModel.class)), new C23465k(AppScreen.C9426u2.f27963w, c22673i0.getOrCreateKotlinClass(HomeScreenModel.class)), new C23465k(AppScreen.C9434v2.f27987w, c22673i0.getOrCreateKotlinClass(HormonalInsightsOnboardingModel.class)), new C23465k(AppScreen.C9450x2.f28039w, c22673i0.getOrCreateKotlinClass(HrSettingsScreenModel.class)), new C23465k(AppScreen.C9457y2.f28061w, c22673i0.getOrCreateKotlinClass(InAppBrowserScreenModel.class)), new C23465k(AppScreen.C9464z2.f28083w, c22673i0.getOrCreateKotlinClass(IntegrationsScreenModel.class)), new C23465k(AppScreen.C9267a3.f27473w, c22673i0.getOrCreateKotlinClass(IntegrationsDisclaimerScreenModel.class)), new C23465k(AppScreen.C9401r1.f27887w, c22673i0.getOrCreateKotlinClass(CustomizeBottomSheetScreenModel.class)), new C23465k(AppScreen.C9298e2.f27571w, c22673i0.getOrCreateKotlinClass(ExtensionsScreenModel.class)), new C23465k(AppScreen.C9306f2.f27595w, c22673i0.getOrCreateKotlinClass(FamilyPlanScreenModel.class)), new C23465k(AppScreen.C9314g2.f27619w, c22673i0.getOrCreateKotlinClass(FamilyPlanHubScreenModel.class)), new C23465k(AppScreen.C9322h2.f27644w, c22673i0.getOrCreateKotlinClass(FamilyPlanInviteScreenModel.class)), new C23465k(AppScreen.C9442w2.f28012w, c22673i0.getOrCreateKotlinClass(HormonalInsightsSettingsScreenModel.class)), new C23465k(AppScreen.C9275b3.f27499w, c22673i0.getOrCreateKotlinClass(JournalScreenModel.class)), new C23465k(AppScreen.C9291d3.f27548w, c22673i0.getOrCreateKotlinClass(InterdayJournalScreenModel.class)), new C23465k(AppScreen.C9299e3.f27574w, c22673i0.getOrCreateKotlinClass(LabradorAboutScreenModel.class)), new C23465k(AppScreen.C9307f3.f27598w, c22673i0.getOrCreateKotlinClass(LabradorDetailsScreenModel.class)), new C23465k(AppScreen.C9315g3.f27622w, c22673i0.getOrCreateKotlinClass(LabradorDeviceLocationModel.class)), new C23465k(AppScreen.C9323h3.f27647w, c22673i0.getOrCreateKotlinClass(LabradorOnboardingModel.class)), new C23465k(AppScreen.C9331i3.f27672w, c22673i0.getOrCreateKotlinClass(LabradorReadingModel.class)), new C23465k(AppScreen.C9339j3.f27696w, c22673i0.getOrCreateKotlinClass(LabradorRegistrationModel.class)), new C23465k(AppScreen.C9347k3.f27721w, c22673i0.getOrCreateKotlinClass(LabradorResultsModel.class)), new C23465k(AppScreen.C9355l3.f27747w, c22673i0.getOrCreateKotlinClass(LanguageSettingsScreenModel.class)), new C23465k(AppScreen.C9363m3.f27772w, c22673i0.getOrCreateKotlinClass(LegacyProCheckoutScreenModel.class)), new C23465k(AppScreen.C9371n3.f27799w, c22673i0.getOrCreateKotlinClass(LevelsScreenModel.class)), new C23465k(AppScreen.C9379o3.f27824w, c22673i0.getOrCreateKotlinClass(LimitedTimeOfferScreenModel.class)), new C23465k(AppScreen.C9387p3.f27849w, c22673i0.getOrCreateKotlinClass(LinkWorkoutScreenModel.class)), new C23465k(AppScreen.C9395q3.f27870w, c22673i0.getOrCreateKotlinClass(LogSymptomsScreenModel.class)), new C23465k(AppScreen.C9403r3.f27893w, c22673i0.getOrCreateKotlinClass(LoginScreenModel.class)), new C23465k(AppScreen.C9411s3.f27917w, c22673i0.getOrCreateKotlinClass(MarketingConsentScreenModel.class)), new C23465k(AppScreen.C9419t3.f27942w, c22673i0.getOrCreateKotlinClass(MciLogCalendarScreenModel.class)), new C23465k(AppScreen.C9427u3.f27966w, c22673i0.getOrCreateKotlinClass(MciOverviewScreenModel.class)), new C23465k(AppScreen.C9435v3.f27990w, c22673i0.getOrCreateKotlinClass(MciPhaseCoachingScreenModel.class)), new C23465k(AppScreen.C9443w3.f28015w, c22673i0.getOrCreateKotlinClass(MediaFocusModel.class)), new C23465k(AppScreen.C9451x3.f28042w, c22673i0.getOrCreateKotlinClass(MembershipAdjustmentScreenModel.class)), new C23465k(AppScreen.C9458y3.f28064w, c22673i0.getOrCreateKotlinClass(MembershipAdjustmentCheckoutScreenModel.class)), new C23465k(AppScreen.C9465z3.f28087w, c22673i0.getOrCreateKotlinClass(MembershipAndBillingScreenModel.class)), new C23465k(AppScreen.C9268a4.f27476w, c22673i0.getOrCreateKotlinClass(MembershipManagementScreenModel.class)), new C23465k(AppScreen.C9276b4.f27502w, c22673i0.getOrCreateKotlinClass(MenuScreenModel.class)), new C23465k(AppScreen.C9284c4.f27527w, c22673i0.getOrCreateKotlinClass(MfaSetupScreenModel.class)), new C23465k(AppScreen.C9292d4.f27551w, c22673i0.getOrCreateKotlinClass(MyAccountScreenModel.class)), new C23465k(AppScreen.C9300e4.f27577w, c22673i0.getOrCreateKotlinClass(NativePlanSwitchModel.class)), new C23465k(AppScreen.C9316g4.f27625w, c22673i0.getOrCreateKotlinClass(NativeStoreScreenModel.class)), new C23465k(AppScreen.C9308f4.f27601w, c22673i0.getOrCreateKotlinClass(ProductDescriptionPageScreenModel.class)), new C23465k(AppScreen.C9404r4.f27896w, c22673i0.getOrCreateKotlinClass(ProductSizeGuideScreenModel.class)), new C23465k(AppScreen.C9332i4.f27675w, c22673i0.getOrCreateKotlinClass(OnboardingStoryScreenModel.class)), new C23465k(AppScreen.C9340j4.f27699w, c22673i0.getOrCreateKotlinClass(OrderConfirmationScreenModel.class)), new C23465k(AppScreen.C9348k4.f27724w, c22673i0.getOrCreateKotlinClass(PairDeviceScreenModel.class)), new C23465k(AppScreen.C9356l4.f27750w, c22673i0.getOrCreateKotlinClass(PasswordResetScreenModel.class)), new C23465k(AppScreen.C9364m4.f27775w, c22673i0.getOrCreateKotlinClass(PaymentMethodManagementScreenModel.class)), new C23465k(AppScreen.C9372n4.f27802w, c22673i0.getOrCreateKotlinClass(PregnancyInsightsScreenModel.class)), new C23465k(AppScreen.C9380o4.f27828w, c22673i0.getOrCreateKotlinClass(PregnancySettingsScreenModel.class)), new C23465k(AppScreen.C9388p4.f27852w, c22673i0.getOrCreateKotlinClass(PreviousPregnancyScreenModel.class)), new C23465k(AppScreen.C9396q4.f27873w, c22673i0.getOrCreateKotlinClass(PrivacyScreenModel.class)), new C23465k(AppScreen.C9282c2.f27521w, c22673i0.getOrCreateKotlinClass(EnterpriseProgramSettingsScreenModel.class)), new C23465k(AppScreen.C9428u4.f27969w, c22673i0.getOrCreateKotlinClass(RecoveryDetailsScreenModel.class)), new C23465k(AppScreen.C9436v4.f27993w, c22673i0.getOrCreateKotlinClass(ReferAFriendScreenModel.class)), new C23465k(AppScreen.C9444w4.f28018w, c22673i0.getOrCreateKotlinClass(ReferAFriendHubScreenModel.class)), new C23465k(AppScreen.C9452x4.f28045w, c22673i0.getOrCreateKotlinClass(ReferAFriendReceiverScreenModel.class)), new C23465k(AppScreen.C9466z4.f28090w, c22673i0.getOrCreateKotlinClass(ReturnsScreenModel.class)), new C23465k(AppScreen.C9269a5.f27479w, c22673i0.getOrCreateKotlinClass(SageScreenModel.class)), new C23465k(AppScreen.C9277b5.f27505w, c22673i0.getOrCreateKotlinClass(SageManualEntryScreenModel.class)), new C23465k(AppScreen.C9285c5.f27530w, c22673i0.getOrCreateKotlinClass(SageOnboardingScreenModel.class)), new C23465k(AppScreen.C9293d5.f27554w, c22673i0.getOrCreateKotlinClass(SanguineWaitlistScreenModel.class)), new C23465k(AppScreen.C9301e5.f27580w, c22673i0.getOrCreateKotlinClass(SanguineWaitlistBiomarkersScreenModel.class)), new C23465k(AppScreen.C9309f5.f27604w, c22673i0.getOrCreateKotlinClass(SeeAllRecordingsScreenModel.class)), new C23465k(AppScreen.C9317g5.f27629w, c22673i0.getOrCreateKotlinClass(ShepherdAboutModel.class)), new C23465k(AppScreen.C9325h5.f27653w, c22673i0.getOrCreateKotlinClass(ShepherdDetailsModel.class)), new C23465k(AppScreen.C9333i5.f27678w, c22673i0.getOrCreateKotlinClass(ShepherdHistoryModel.class)), new C23465k(AppScreen.C9341j5.f27702w, c22673i0.getOrCreateKotlinClass(ShepherdOnboardingModel.class)), new C23465k(AppScreen.C9349k5.f27727w, c22673i0.getOrCreateKotlinClass(ShepherdRegistrationModel.class)), new C23465k(AppScreen.C9357l5.f27754w, c22673i0.getOrCreateKotlinClass(ShepherdSettingsModel.class)), new C23465k(AppScreen.C9365m5.f27779w, c22673i0.getOrCreateKotlinClass(SleepDetailsScreenModel.class)), new C23465k(AppScreen.C9373n5.f27805w, c22673i0.getOrCreateKotlinClass(SleepPlannerScreenModel.class)), new C23465k(AppScreen.C9381o5.f27831w, c22673i0.getOrCreateKotlinClass(SmsSetupScreenModel.class)), new C23465k(AppScreen.C9389p5.f27855w, c22673i0.getOrCreateKotlinClass(StartActivityScreenModel.class)), new C23465k(AppScreen.C9421t5.f27948w, c22673i0.getOrCreateKotlinClass(StreakCelebrationScreenModel.class)), new C23465k(AppScreen.C9405r5.f27899w, c22673i0.getOrCreateKotlinClass(StartActivityScreenModel.class)), new C23465k(AppScreen.C9413s5.f27923w, c22673i0.getOrCreateKotlinClass(StartActivitySportModel.class)), new C23465k(AppScreen.C9429u5.f27972w, c22673i0.getOrCreateKotlinClass(StreaksExplainerModel.class)), new C23465k(AppScreen.C9437v5.f27996w, c22673i0.getOrCreateKotlinClass(StrengthTrainerScreenModel.class)), new C23465k(AppScreen.C9445w5.f28022w, c22673i0.getOrCreateKotlinClass(StressInterventionModel.class)), new C23465k(AppScreen.C9453x5.f28049w, c22673i0.getOrCreateKotlinClass(StressMonitorScreenModel.class)), new C23465k(AppScreen.C9460y5.f28071w, c22673i0.getOrCreateKotlinClass(SymptomPatternsScreenModel.class)), new C23465k(AppScreen.C9467z5.f28093w, c22673i0.getOrCreateKotlinClass(TiltModeScreenModel.class)), new C23465k(AppScreen.C9369n1.f27793w, c22673i0.getOrCreateKotlinClass(CommunityFollowersScreenModel.class)), new C23465k(AppScreen.C9377o1.f27818w, c22673i0.getOrCreateKotlinClass(CommunityTeamScreenModel.class)), new C23465k(AppScreen.C9385p1.f27843w, c22673i0.getOrCreateKotlinClass(CommunityTeamsHubScreenModel.class)), new C23465k(AppScreen.C9270a6.f27482w, c22673i0.getOrCreateKotlinClass(TrendsScreenModel.class)), new C23465k(AppScreen.C9294d6.f27557w, c22673i0.getOrCreateKotlinClass(UniversalCheckoutScreenModel.class)), new C23465k(AppScreen.C9321h1.f27641w, c22673i0.getOrCreateKotlinClass(CheckoutWithCartScreenModel.class)), new C23465k(AppScreen.C9302e6.f27583w, c22673i0.getOrCreateKotlinClass(UniversalCheckoutShippingAddressScreenModel.class)), new C23465k(AppScreen.C9310f6.f27607w, c22673i0.getOrCreateKotlinClass(UniversalCheckoutShippingMethodScreenModel.class)), new C23465k(AppScreen.C9286c6.f27533w, c22673i0.getOrCreateKotlinClass(UniversalCartScreenModel.class)), new C23465k(AppScreen.C9278b6.f27508w, c22673i0.getOrCreateKotlinClass(UniversalBuyNowScreenModel.class)), new C23465k(new AppScreen.URLScreen(null, 1, null), c22673i0.getOrCreateKotlinClass(URLScreenModel.class)), new C23465k(AppScreen.C9326h6.f27656w, c22673i0.getOrCreateKotlinClass(UpcycleLandingScreenModel.class)), new C23465k(AppScreen.C9334i6.f27681w, c22673i0.getOrCreateKotlinClass(VideoCallScreenModel.class)), new C23465k(AppScreen.C9412s4.f27920w, c22673i0.getOrCreateKotlinClass(ProfileScreenModel.class)), new C23465k(AppScreen.C9360m0.f27763w, c22673i0.getOrCreateKotlinClass(AdvancedLabsPurchaseAddOnsScreenModel.class)), new C23465k(AppScreen.C9420t4.f27945w, c22673i0.getOrCreateKotlinClass(ReactivationUpsellScreenModel.class)), new C23465k(AppScreen.C9408s0.f27908w, c22673i0.getOrCreateKotlinClass(AdvancedLabsUpdateTestsScreenModel.class)), new C23465k(AppScreen.C9459y4.f28067w, c22673i0.getOrCreateKotlinClass(CheckoutScreenModel.class)), new C23465k(AppScreen.C9342j6.f27705w, c22673i0.getOrCreateKotlinClass(WeekInReviewScreenModel.class)), new C23465k(AppScreen.C9350k6.f27730w, c22673i0.getOrCreateKotlinClass(WeeklyPlanEditScreenModel.class)), new C23465k(AppScreen.C9374n6.f27808w, c22673i0.getOrCreateKotlinClass(WeeklyPlanSetupScreenModel.class)), new C23465k(AppScreen.C9382o6.f27834w, c22673i0.getOrCreateKotlinClass(WeeklyPlanSummaryScreenModel.class)), new C23465k(AppScreen.C9390p6.f27858w, c22673i0.getOrCreateKotlinClass(WeightliftingDetailsScreenModel.class)), new C23465k(AppScreen.C9366m6.f27782w, c22673i0.getOrCreateKotlinClass(WeeklyPlanPresetLandingScreenModel.class)), new C23465k(AppScreen.C9358l6.f27757w, c22673i0.getOrCreateKotlinClass(WeeklyPlanOverviewScreenModel.class)), new C23465k(AppScreen.C9398q6.f27879w, c22673i0.getOrCreateKotlinClass(WhatToExpectScreenModel.class)), new C23465k(AppScreen.C9406r6.f27902w, c22673i0.getOrCreateKotlinClass(WhoopLabsHomeScreenModel.class)), new C23465k(AppScreen.C9414s6.f27926w, c22673i0.getOrCreateKotlinClass(WhoopLabsScreenModel.class)), new C23465k(AppScreen.C9422t6.f27951w, c22673i0.getOrCreateKotlinClass(WhoopLabsScreenModel.class)), new C23465k(AppScreen.C9430u6.f27975w, c22673i0.getOrCreateKotlinClass(WhoopLiveScreenModel.class)), new C23465k(AppScreen.C9438v6.f28000w, c22673i0.getOrCreateKotlinClass(WhoopShareScreenModel.class)), new C23465k(AppScreen.C9446w6.f28025w, c22673i0.getOrCreateKotlinClass(YearInReviewScreenModel.class)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationActionTypeAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m23139d(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2776c = true;
        Json.f2780g = true;
        Json.f2785l = true;
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C9598e deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        String asString;
        JsonObject asJsonObject;
        C21173v0 c21173v0;
        InterfaceC21461d interfaceC21461d;
        NavigationScreenModel advancedLabsSchedulingStepScreenModel;
        String asString2;
        JsonElement jsonElement;
        String asString3;
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(typeOfT, "typeOfT");
        AbstractC22676k.m65750j(context, "context");
        JsonElement jsonElement2 = json.getAsJsonObject().get(HMSTrackSource.SCREEN);
        if (jsonElement2 == null || (asString = jsonElement2.getAsString()) == null) {
            throw new JsonParseException("NavigationAction is missing screen_name");
        }
        JsonElement jsonElement3 = json.getAsJsonObject().get("parameters");
        if (jsonElement3 == null || (asJsonObject = jsonElement3.getAsJsonObject()) == null) {
            throw new JsonParseException("NavigationAction is missing parameters");
        }
        AppScreen.Companion companion = AppScreen.INSTANCE;
        Set<FeatureSpecificAppScreen> setKeySet = this.screenModelMap.keySet();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeatureSpecificAppScreen) it.next()).getName());
        }
        AppScreen appScreenM23031a = companion.m23031a(asString, arrayList);
        JsonElement jsonElement4 = json.getAsJsonObject().get("tab");
        JsonObject jsonObject = jsonElement4 instanceof JsonObject ? (JsonObject) jsonElement4 : null;
        if (jsonObject == null || (jsonElement = jsonObject.get("id")) == null) {
            c21173v0 = null;
        } else {
            if (!jsonElement.isJsonPrimitive()) {
                jsonElement = null;
            }
            if (jsonElement == null || (asString3 = jsonElement.getAsString()) == null) {
                c21173v0 = null;
            } else {
                c21173v0 = new C21173v0(asString3);
            }
        }
        if (AbstractC22676k.m65745e(appScreenM23031a, AppScreen.C9318g6.f27632w)) {
            String string = asJsonObject.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            NavigationDeserializationException.INSTANCE.m23134c(asString, AbstractC0757c.f2762d.m1835f(string), this.logger, this.metricWriter);
            return new C9598e(null, null, null, 7, null);
        }
        if (appScreenM23031a instanceof FeatureSpecificAppScreen) {
            interfaceC21461d = this.screenModelMap.get(appScreenM23031a);
            if (interfaceC21461d == null) {
                return new C9598e(null, null, null, 7, null);
            }
        } else {
            interfaceC21461d = f28146g.get(appScreenM23031a);
            if (interfaceC21461d == null) {
                return new C9598e(null, null, null, 7, null);
            }
        }
        if (AbstractC22676k.m65745e(appScreenM23031a, AppScreen.C9376o0.f27815w)) {
            JsonElement jsonElement5 = asJsonObject.get("step");
            if (jsonElement5 == null || (asString2 = jsonElement5.getAsString()) == null) {
                asString2 = "";
            }
            JsonElement jsonElement6 = asJsonObject.get("test_type");
            advancedLabsSchedulingStepScreenModel = new AdvancedLabsSchedulingStepScreenModel(asString2, jsonElement6 != null ? jsonElement6.getAsString() : null);
        } else {
            NavigationScreenModel navigationScreenModel = (NavigationScreenModel) interfaceC21461d.getObjectInstance();
            if (navigationScreenModel == null) {
                Object objDeserialize = context.deserialize(asJsonObject, AbstractC21598x.m60663S(interfaceC21461d));
                AbstractC22676k.m65749i(objDeserialize, "deserialize(...)");
                advancedLabsSchedulingStepScreenModel = (NavigationScreenModel) objDeserialize;
            } else {
                advancedLabsSchedulingStepScreenModel = navigationScreenModel;
            }
        }
        return new C9598e(appScreenM23031a, advancedLabsSchedulingStepScreenModel, c21173v0);
    }

    @Override // com.google.gson.JsonSerializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public JsonElement serialize(C9598e src, Type typeOfSrc, JsonSerializationContext context) {
        JsonElement jsonElement;
        JsonObject jsonObject;
        AbstractC22676k.m65750j(typeOfSrc, "typeOfSrc");
        AbstractC22676k.m65750j(context, "context");
        if (src == null) {
            JsonNull INSTANCE2 = JsonNull.INSTANCE;
            AbstractC22676k.m65749i(INSTANCE2, "INSTANCE");
            return INSTANCE2;
        }
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add(HMSTrackSource.SCREEN, new JsonPrimitive(src.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName()));
        NavigationScreenModel parameters = src.getParameters();
        if (parameters instanceof AdvancedLabsSchedulingStepScreenModel) {
            jsonObject = new JsonObject();
            AdvancedLabsSchedulingStepScreenModel advancedLabsSchedulingStepScreenModel = (AdvancedLabsSchedulingStepScreenModel) parameters;
            jsonObject.add("step", new JsonPrimitive(advancedLabsSchedulingStepScreenModel.getStepType()));
            String testType = advancedLabsSchedulingStepScreenModel.getTestType();
            if (testType != null) {
                jsonElement = jsonObject;
                jsonObject.add("test_type", new JsonPrimitive(testType));
                jsonElement = jsonObject;
            }
        } else if (parameters instanceof EditCustomExerciseModel) {
            JsonObject asJsonObject = JsonParser.parseString(f28145f.m1832c(EditCustomExerciseModel.INSTANCE.serializer(), parameters).toString()).getAsJsonObject();
            AbstractC22676k.m65749i(asJsonObject, "getAsJsonObject(...)");
            jsonElement = asJsonObject;
        } else {
            JsonElement jsonElementSerialize = context.serialize(parameters);
            AbstractC22676k.m65749i(jsonElementSerialize, "serialize(...)");
            jsonElement = jsonElementSerialize;
        }
        jsonElement = jsonObject;
        jsonObject2.add("parameters", jsonElement);
        C21173v0 tab = src.getTab();
        if (tab != null) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.add("id", new JsonPrimitive(tab.getId()));
            jsonObject2.add("tab", jsonObject3);
        }
        return jsonObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationActionTypeAdapter(Map<FeatureSpecificAppScreen, ? extends InterfaceC21461d> screenModelMap, InterfaceC21030c metricWriter) {
        AbstractC22676k.m65750j(screenModelMap, "screenModelMap");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        this.screenModelMap = screenModelMap;
        this.metricWriter = metricWriter;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("NavigationActionTypeAdapter");
    }

    public /* synthetic */ NavigationActionTypeAdapter(Map map, InterfaceC21030c interfaceC21030c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25272z.f99163w : map, (i13 & 2) != 0 ? C21033f.f79657a : interfaceC21030c);
    }
}
