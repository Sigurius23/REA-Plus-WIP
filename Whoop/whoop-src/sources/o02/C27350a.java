package o02;

import ad3.AbstractC0757c;
import ad3.C0764g;
import com.whoop.navigation.AccessReconfirmBaselinesScreenModel;
import com.whoop.navigation.AchievementMilestoneUnlockScreenModel;
import com.whoop.navigation.AchievementsScreenModel;
import com.whoop.navigation.ActivationNavigationModel;
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
import com.whoop.navigation.AuthenticatedWebViewModel;
import com.whoop.navigation.BehaviorDetailsScreenModel;
import com.whoop.navigation.BehaviorImpactsScreenModel;
import com.whoop.navigation.BiomarkerDetailsScreenModel;
import com.whoop.navigation.BiomarkerSummaryScreenModel;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.CardioDetailsScreenModel;
import com.whoop.navigation.ChallengeLandingScreenModel;
import com.whoop.navigation.ChallengesScreenModel;
import com.whoop.navigation.CheckoutScreenModel;
import com.whoop.navigation.CheckoutWithCartPayload;
import com.whoop.navigation.CheckoutWithCartScreenModel;
import com.whoop.navigation.ClinicianSchedulingConfirmationScreenModel;
import com.whoop.navigation.ClinicianVideoSchedulingIntakeScreenModel;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.CoachSettingsScreenModel;
import com.whoop.navigation.CommonNavigationScreenModel;
import com.whoop.navigation.CommunityFollowersScreenModel;
import com.whoop.navigation.CommunityScreenModel;
import com.whoop.navigation.CommunityTeamScreenModel;
import com.whoop.navigation.CommunityTeamsHubScreenModel;
import com.whoop.navigation.CommunityUnavailableScreenModel;
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
import com.whoop.navigation.FeedbackSurveyScreenModel;
import com.whoop.navigation.GenericCachePolicy;
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
import com.whoop.navigation.InitialSelectionModel;
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
import com.whoop.navigation.MemberLevelInfo;
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
import com.whoop.navigation.ProgressionLevel;
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
import com.whoop.navigation.UniversalCheckoutPayload;
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
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.ChatHeaderMetadata;
import com.whoop.navigation.models.GenericHttpMethod;
import j02.AbstractC21155m0;
import j02.AbstractC21168t;
import j02.C21148j;
import j02.EnumC21171u0;
import j93.InterfaceC21461d;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import nm1.C26842g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: o02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lo02/a;", "Lo02/d;", "<init>", "()V", "Lcom/whoop/navigation/NavigationScreenModel;", "navigationScreenModel", "Lj02/m0;", "e", "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;", "Lad3/c;", "a", "Lad3/c;", "json", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27350a implements InterfaceC27353d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AbstractC0757c json = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C26842g(6));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m82524d(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2776c = true;
        Json.f2780g = true;
        Json.f2785l = true;
        return C23454a0.f92919a;
    }

    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: b */
    public /* bridge */ InterfaceC27353d mo67682b(List<? extends InterfaceC27353d> list, Map<InterfaceC21461d, ? extends Function1> map) {
        return super.mo67682b(list, map);
    }

    /* JADX WARN: Code duplicated, block: B:441:0x0747  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eb.x0, j02.u0, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // o02.InterfaceC27353d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC21155m0 mo67681a(NavigationScreenModel navigationScreenModel) {
        AbstractC22676k.m65750j(navigationScreenModel, "navigationScreenModel");
        if (!(navigationScreenModel instanceof CommonNavigationScreenModel)) {
            return AbstractC21155m0.j3.f80414b;
        }
        CommonNavigationScreenModel commonNavigationScreenModel = (CommonNavigationScreenModel) navigationScreenModel;
        if (commonNavigationScreenModel instanceof AchievementsScreenModel) {
            AchievementsScreenModel achievementsScreenModel = (AchievementsScreenModel) navigationScreenModel;
            return new AbstractC21155m0.c(achievementsScreenModel.getSource(), achievementsScreenModel.getMilestoneType());
        }
        if (commonNavigationScreenModel instanceof AccessReconfirmBaselinesScreenModel) {
            AccessReconfirmBaselinesScreenModel accessReconfirmBaselinesScreenModel = (AccessReconfirmBaselinesScreenModel) navigationScreenModel;
            return new AbstractC21155m0.a(accessReconfirmBaselinesScreenModel.getSource(), accessReconfirmBaselinesScreenModel.getNextScreen());
        }
        if (commonNavigationScreenModel instanceof OmronAuthScreenModel) {
            return new AbstractC21155m0.k3(((OmronAuthScreenModel) navigationScreenModel).getSource());
        }
        if (commonNavigationScreenModel instanceof AchievementMilestoneUnlockScreenModel) {
            return new AbstractC21155m0.b(((AchievementMilestoneUnlockScreenModel) navigationScreenModel).getAchievementType());
        }
        if (commonNavigationScreenModel instanceof StreakCelebrationScreenModel) {
            StreakCelebrationScreenModel streakCelebrationScreenModel = (StreakCelebrationScreenModel) navigationScreenModel;
            return new AbstractC21155m0.w4(streakCelebrationScreenModel.getSource(), streakCelebrationScreenModel.getCelebrationType());
        }
        if (commonNavigationScreenModel instanceof DayZeroSplashScreenModel) {
            return new AbstractC21155m0.x0(((DayZeroSplashScreenModel) navigationScreenModel).getSource());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsActionPlanScreenModel) {
            return new AbstractC21155m0.g(((AdvancedLabsActionPlanScreenModel) navigationScreenModel).getTestId());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsHormonalContextScreenModel) {
            return new AbstractC21155m0.j(((AdvancedLabsHormonalContextScreenModel) navigationScreenModel).getTestId());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsInsightsDeepDiveScreenModel) {
            AdvancedLabsInsightsDeepDiveScreenModel advancedLabsInsightsDeepDiveScreenModel = (AdvancedLabsInsightsDeepDiveScreenModel) navigationScreenModel;
            return new AbstractC21155m0.k(advancedLabsInsightsDeepDiveScreenModel.getInsightId(), advancedLabsInsightsDeepDiveScreenModel.getSource());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsInsightsScreenModel) {
            AdvancedLabsInsightsScreenModel advancedLabsInsightsScreenModel = (AdvancedLabsInsightsScreenModel) navigationScreenModel;
            return new AbstractC21155m0.l(advancedLabsInsightsScreenModel.getTestId(), advancedLabsInsightsScreenModel.getSource(), advancedLabsInsightsScreenModel.getAiAction());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsJoinScreenModel) {
            AdvancedLabsJoinScreenModel advancedLabsJoinScreenModel = (AdvancedLabsJoinScreenModel) navigationScreenModel;
            return new AbstractC21155m0.m(advancedLabsJoinScreenModel.getSource(), advancedLabsJoinScreenModel.getTestCount(), advancedLabsJoinScreenModel.getInitiallySelectedSegmentId());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsManagementScreenModel) {
            AdvancedLabsManagementScreenModel advancedLabsManagementScreenModel = (AdvancedLabsManagementScreenModel) navigationScreenModel;
            return new AbstractC21155m0.n(advancedLabsManagementScreenModel.getSource(), advancedLabsManagementScreenModel.getNavigationStyle());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsPrimerScreenModel) {
            return new AbstractC21155m0.q(((AdvancedLabsPrimerScreenModel) navigationScreenModel).getSource());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsEditBiomarkersScreenModel) {
            AdvancedLabsEditBiomarkersScreenModel advancedLabsEditBiomarkersScreenModel = (AdvancedLabsEditBiomarkersScreenModel) navigationScreenModel;
            return new AbstractC21155m0.h(advancedLabsEditBiomarkersScreenModel.getTestId(), advancedLabsEditBiomarkersScreenModel.isAiConfirmation());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsEditTestDetailsScreenModel) {
            return new AbstractC21155m0.i(((AdvancedLabsEditTestDetailsScreenModel) navigationScreenModel).getTestId());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsSchedulingFormScreenModel) {
            AdvancedLabsSchedulingFormScreenModel advancedLabsSchedulingFormScreenModel = (AdvancedLabsSchedulingFormScreenModel) navigationScreenModel;
            return new AbstractC21155m0.s(advancedLabsSchedulingFormScreenModel.getEpisodeId(), advancedLabsSchedulingFormScreenModel.getBiomarkerTestId(), advancedLabsSchedulingFormScreenModel.getTestType());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsSchedulingStepScreenModel) {
            AdvancedLabsSchedulingStepScreenModel advancedLabsSchedulingStepScreenModel = (AdvancedLabsSchedulingStepScreenModel) navigationScreenModel;
            return new AbstractC21155m0.t(advancedLabsSchedulingStepScreenModel.getStepType(), advancedLabsSchedulingStepScreenModel.getTestType());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsNativeSchedulingScreenModel) {
            return AbstractC21155m0.o.f80480b;
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsScreenModel) {
            AdvancedLabsScreenModel advancedLabsScreenModel = (AdvancedLabsScreenModel) navigationScreenModel;
            return new AbstractC21155m0.p(advancedLabsScreenModel.getSource(), advancedLabsScreenModel.getAiAction());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsTestResultsScreenModel) {
            return new AbstractC21155m0.v(((AdvancedLabsTestResultsScreenModel) navigationScreenModel).getBiomarkerTestId());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsTestHistoryScreenModel) {
            return AbstractC21155m0.u.f80561b;
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsTypeformWebviewScreenModel) {
            AdvancedLabsTypeformWebviewScreenModel advancedLabsTypeformWebviewScreenModel = (AdvancedLabsTypeformWebviewScreenModel) navigationScreenModel;
            return new AbstractC21155m0.w(advancedLabsTypeformWebviewScreenModel.getUrl(), advancedLabsTypeformWebviewScreenModel.getTestTokenId(), advancedLabsTypeformWebviewScreenModel.getTestType());
        }
        if (commonNavigationScreenModel instanceof AdvancedLabsUploadTestScreenModel) {
            return AbstractC21155m0.y.f80636b;
        }
        if (!(commonNavigationScreenModel instanceof AiCoachChatScreenModel) && !(commonNavigationScreenModel instanceof AiInsightsScreenModel) && !(commonNavigationScreenModel instanceof ActivityEditModel) && !(commonNavigationScreenModel instanceof AddActivityModel)) {
            if (commonNavigationScreenModel instanceof AnnualUpsellSwitchModel) {
                return new AbstractC21155m0.c0(((AnnualUpsellSwitchModel) navigationScreenModel).getSubscriptionType());
            }
            ?? M1833d = 0;
            C21148j c21148j = null;
            String strM1833d = null;
            String strM1833d2 = null;
            String strM1833d3 = null;
            if (commonNavigationScreenModel instanceof AuthenticatedWebViewModel) {
                AuthenticatedWebViewModel authenticatedWebViewModel = (AuthenticatedWebViewModel) navigationScreenModel;
                Map<String, String> confirmDismissContent = authenticatedWebViewModel.getConfirmDismissContent();
                String url = authenticatedWebViewModel.getUrl();
                if (confirmDismissContent != null) {
                    String str = confirmDismissContent.get("title");
                    if (str == null) {
                        str = "";
                    }
                    String str2 = confirmDismissContent.get("message");
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = confirmDismissContent.get("cancel_title");
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = confirmDismissContent.get("confirm_title");
                    c21148j = new C21148j(str, str2, str3, str4 != null ? str4 : "");
                }
                return new AbstractC21155m0.d0(null, url, c21148j, authenticatedWebViewModel.getOnDismissDestination(), 1, null);
            }
            if (commonNavigationScreenModel instanceof AllBiomarkerRecordingsScreenModel) {
                return new AbstractC21155m0.b0(((AllBiomarkerRecordingsScreenModel) navigationScreenModel).getBiomarkerName());
            }
            if (commonNavigationScreenModel instanceof BehaviorDetailsScreenModel) {
                return new AbstractC21155m0.f0(((BehaviorDetailsScreenModel) navigationScreenModel).getSource());
            }
            if (commonNavigationScreenModel instanceof BehaviorImpactsScreenModel) {
                BehaviorImpactsScreenModel behaviorImpactsScreenModel = (BehaviorImpactsScreenModel) navigationScreenModel;
                return new AbstractC21155m0.e0(behaviorImpactsScreenModel.getDetailId(), behaviorImpactsScreenModel.getSource());
            }
            if (commonNavigationScreenModel instanceof BiomarkerDetailsScreenModel) {
                BiomarkerDetailsScreenModel biomarkerDetailsScreenModel = (BiomarkerDetailsScreenModel) navigationScreenModel;
                return new AbstractC21155m0.g0(biomarkerDetailsScreenModel.getBiomarkerId(), biomarkerDetailsScreenModel.getSource());
            }
            if (commonNavigationScreenModel instanceof BiomarkerSummaryScreenModel) {
                BiomarkerSummaryScreenModel biomarkerSummaryScreenModel = (BiomarkerSummaryScreenModel) navigationScreenModel;
                return new AbstractC21155m0.h0(biomarkerSummaryScreenModel.getStatusType(), biomarkerSummaryScreenModel.getAiAction());
            }
            if (commonNavigationScreenModel instanceof LimitedTimeOfferScreenModel) {
                LimitedTimeOfferScreenModel limitedTimeOfferScreenModel = (LimitedTimeOfferScreenModel) navigationScreenModel;
                return new AbstractC21155m0.p2(limitedTimeOfferScreenModel.getSource(), limitedTimeOfferScreenModel.getOfferId());
            }
            if (commonNavigationScreenModel instanceof LinkWorkoutScreenModel) {
                LinkWorkoutScreenModel linkWorkoutScreenModel = (LinkWorkoutScreenModel) navigationScreenModel;
                return new AbstractC21155m0.q2(linkWorkoutScreenModel.getActivityId(), linkWorkoutScreenModel.getEntryPoint(), linkWorkoutScreenModel.getActivityName());
            }
            if (commonNavigationScreenModel instanceof LogSymptomsScreenModel) {
                LogSymptomsScreenModel logSymptomsScreenModel = (LogSymptomsScreenModel) navigationScreenModel;
                return new AbstractC21155m0.r2(logSymptomsScreenModel.getSource(), logSymptomsScreenModel.getRequestDate());
            }
            if (commonNavigationScreenModel instanceof MultiConsentScreenModel) {
                MultiConsentScreenModel multiConsentScreenModel = (MultiConsentScreenModel) navigationScreenModel;
                return new AbstractC21155m0.d3(multiConsentScreenModel.getConsentAction(), multiConsentScreenModel.getTestType());
            }
            if (commonNavigationScreenModel instanceof CardioDetailsScreenModel) {
                CardioDetailsScreenModel cardioDetailsScreenModel = (CardioDetailsScreenModel) navigationScreenModel;
                return new AbstractC21155m0.e(cardioDetailsScreenModel.getActivityId(), "CARDIO", null, null, false, cardioDetailsScreenModel.getEntryPoint(), cardioDetailsScreenModel.getAiAction(), 28, null);
            }
            if (commonNavigationScreenModel instanceof ChallengeLandingScreenModel) {
                return new AbstractC21155m0.i0(((ChallengeLandingScreenModel) navigationScreenModel).getSource());
            }
            if (commonNavigationScreenModel instanceof ChallengesScreenModel) {
                return new AbstractC21155m0.j0(((ChallengesScreenModel) navigationScreenModel).getName());
            }
            if (commonNavigationScreenModel instanceof CoachScreenModel) {
                return AbstractC21155m0.j3.f80414b;
            }
            if (commonNavigationScreenModel instanceof CoachSettingsScreenModel) {
                return AbstractC21155m0.n0.f80473b;
            }
            if (commonNavigationScreenModel instanceof CheckoutScreenModel) {
                CheckoutScreenModel checkoutScreenModel = (CheckoutScreenModel) navigationScreenModel;
                return new AbstractC21155m0.k0(checkoutScreenModel.getPath(), checkoutScreenModel.getPayload(), checkoutScreenModel.getPaymentMethodId(), checkoutScreenModel.getSkipConfirmation(), checkoutScreenModel.getCategory());
            }
            if (commonNavigationScreenModel instanceof CommunityScreenModel) {
                return new AbstractC21155m0.o0(((CommunityScreenModel) navigationScreenModel).getShareCode());
            }
            if (commonNavigationScreenModel.equals(ConnectivityNavigationScreenModel.INSTANCE)) {
                return new AbstractC21155m0.r0("DEFAULT");
            }
            if (commonNavigationScreenModel instanceof DownloadedFileExportScreenModel) {
                return new AbstractC21155m0.z0(((DownloadedFileExportScreenModel) navigationScreenModel).getId());
            }
            if (commonNavigationScreenModel.equals(CustomizeJournalScreenModel.INSTANCE)) {
                return AbstractC21155m0.t0.f80551b;
            }
            if (commonNavigationScreenModel.equals(CustomizeOverviewModel.INSTANCE)) {
                return AbstractC21155m0.u0.f80562b;
            }
            if (commonNavigationScreenModel.equals(CyclePatternHistoryScreenModel.INSTANCE)) {
                return AbstractC21155m0.v0.f80587b;
            }
            boolean z4 = true;
            boolean z13 = true;
            boolean z14 = true;
            boolean z15 = true;
            if (commonNavigationScreenModel instanceof DayZeroPersonalizationScreenModel) {
                DayZeroPersonalizationScreenModel dayZeroPersonalizationScreenModel = (DayZeroPersonalizationScreenModel) navigationScreenModel;
                String fingerprint = dayZeroPersonalizationScreenModel.getFingerprint();
                String sourceId = dayZeroPersonalizationScreenModel.getSourceId();
                String str5 = sourceId == null ? "" : sourceId;
                String sourceType = dayZeroPersonalizationScreenModel.getSourceType();
                String str6 = sourceType == null ? "" : sourceType;
                String source = dayZeroPersonalizationScreenModel.getSource();
                String conversationSeedId = dayZeroPersonalizationScreenModel.getConversationSeedId();
                Boolean dismissible = dayZeroPersonalizationScreenModel.getDismissible();
                boolean zBooleanValue = dismissible != null ? dismissible.booleanValue() : true;
                ChatHeaderMetadata headerMetaData = dayZeroPersonalizationScreenModel.getHeaderMetaData();
                if (headerMetaData != null) {
                    AbstractC0757c abstractC0757c = this.json;
                    abstractC0757c.getClass();
                    strM1833d = abstractC0757c.m1833d(ChatHeaderMetadata.INSTANCE.serializer(), headerMetaData);
                }
                return new AbstractC21155m0.w0(fingerprint, str5, str6, source, conversationSeedId, zBooleanValue, strM1833d);
            }
            if (commonNavigationScreenModel instanceof DeepDiveScreenModel) {
                DeepDiveScreenModel deepDiveScreenModel = (DeepDiveScreenModel) navigationScreenModel;
                return new AbstractC21155m0.y0(deepDiveScreenModel.getPillar(), deepDiveScreenModel.getDate(), deepDiveScreenModel.getSource(), deepDiveScreenModel.getAiAction());
            }
            if (commonNavigationScreenModel instanceof EditActivitiesDrawerScreenModel) {
                EditActivitiesDrawerScreenModel editActivitiesDrawerScreenModel = (EditActivitiesDrawerScreenModel) navigationScreenModel;
                return new AbstractC21155m0.b1(editActivitiesDrawerScreenModel.getDate(), editActivitiesDrawerScreenModel.getTitle());
            }
            if (commonNavigationScreenModel instanceof ExtensionsScreenModel) {
                ExtensionsScreenModel extensionsScreenModel = (ExtensionsScreenModel) navigationScreenModel;
                return new AbstractC21155m0.f1(extensionsScreenModel.getPromoCode(), extensionsScreenModel.isOnTrial());
            }
            if (commonNavigationScreenModel instanceof PairDeviceScreenModel) {
                return new AbstractC21155m0.n3(((PairDeviceScreenModel) navigationScreenModel).getCompletionDestination());
            }
            if (commonNavigationScreenModel instanceof MarketingConsentScreenModel) {
                return new AbstractC21155m0.t2(((MarketingConsentScreenModel) navigationScreenModel).getSource());
            }
            if (commonNavigationScreenModel instanceof PasswordResetScreenModel) {
                PasswordResetScreenModel passwordResetScreenModel = (PasswordResetScreenModel) navigationScreenModel;
                return new AbstractC21155m0.o3(passwordResetScreenModel.getToken(), passwordResetScreenModel.getExpires(), passwordResetScreenModel.getEmail());
            }
            if (commonNavigationScreenModel instanceof PaymentMethodManagementScreenModel) {
                return new AbstractC21155m0.p3(((PaymentMethodManagementScreenModel) navigationScreenModel).getSource());
            }
            if (commonNavigationScreenModel.equals(FamilyPlanScreenModel.INSTANCE)) {
                return AbstractC21155m0.j1.f80412b;
            }
            if (commonNavigationScreenModel instanceof FamilyPlanHubScreenModel) {
                return new AbstractC21155m0.h1(((FamilyPlanHubScreenModel) navigationScreenModel).getSource());
            }
            if (commonNavigationScreenModel instanceof FamilyPlanInviteScreenModel) {
                FamilyPlanInviteScreenModel familyPlanInviteScreenModel = (FamilyPlanInviteScreenModel) navigationScreenModel;
                return new AbstractC21155m0.i1(familyPlanInviteScreenModel.isNewMember(), familyPlanInviteScreenModel.getSource());
            }
            if (commonNavigationScreenModel instanceof FeedbackSurveyScreenModel) {
                return new AbstractC21155m0.k1(((FeedbackSurveyScreenModel) navigationScreenModel).getSource());
            }
            if (commonNavigationScreenModel.equals(LabradorAboutScreenModel.INSTANCE)) {
                return AbstractC21155m0.f2.f80359b;
            }
            if (commonNavigationScreenModel instanceof LabradorDetailsScreenModel) {
                return new AbstractC21155m0.g2(((LabradorDetailsScreenModel) navigationScreenModel).getEcgReadingId(), false, false, 6, null);
            }
            if (commonNavigationScreenModel.equals(LabradorDeviceLocationModel.INSTANCE)) {
                return AbstractC21155m0.h2.f80388b;
            }
            if (commonNavigationScreenModel.equals(LabradorOnboardingModel.INSTANCE)) {
                return new AbstractC21155m0.i2("");
            }
            if (commonNavigationScreenModel instanceof LabradorReadingModel) {
                return new AbstractC21155m0.j2(((LabradorReadingModel) navigationScreenModel).getSelectedWrist());
            }
            if (commonNavigationScreenModel.equals(LabradorRegistrationModel.INSTANCE)) {
                return AbstractC21155m0.k2.f80428b;
            }
            if (commonNavigationScreenModel instanceof AdvancedLabsPurchaseAddOnsScreenModel) {
                AdvancedLabsPurchaseAddOnsScreenModel advancedLabsPurchaseAddOnsScreenModel = (AdvancedLabsPurchaseAddOnsScreenModel) navigationScreenModel;
                return new AbstractC21155m0.r(advancedLabsPurchaseAddOnsScreenModel.getSource(), advancedLabsPurchaseAddOnsScreenModel.getTestCount(), advancedLabsPurchaseAddOnsScreenModel.getNavigationStyle());
            }
            if (commonNavigationScreenModel.equals(LabradorResultsModel.INSTANCE)) {
                return AbstractC21155m0.l2.f80442b;
            }
            if (commonNavigationScreenModel instanceof FeatureEducationModel) {
                FeatureEducationModel featureEducationModel = (FeatureEducationModel) navigationScreenModel;
                String featureEducationName = featureEducationModel.getFeatureEducationName();
                String source2 = featureEducationModel.getSource();
                String str7 = source2 == null ? "" : source2;
                String screenName = featureEducationModel.getScreenName();
                return new AbstractC21155m0.f3(featureEducationName, "", str7, null, screenName == null ? "" : screenName, 8, null);
            }
            if (commonNavigationScreenModel instanceof AdvancedLabsUpdateTestsScreenModel) {
                AdvancedLabsUpdateTestsScreenModel advancedLabsUpdateTestsScreenModel = (AdvancedLabsUpdateTestsScreenModel) navigationScreenModel;
                return new AbstractC21155m0.x(advancedLabsUpdateTestsScreenModel.getSource(), advancedLabsUpdateTestsScreenModel.getTestCount());
            }
            if (commonNavigationScreenModel instanceof GiftedScreenModel) {
                GiftedScreenModel giftedScreenModel = (GiftedScreenModel) navigationScreenModel;
                return new AbstractC21155m0.o1(giftedScreenModel.getSource(), giftedScreenModel.getGiftCode());
            }
            if (commonNavigationScreenModel instanceof GiftingScreenModel) {
                GiftingScreenModel giftingScreenModel = (GiftingScreenModel) navigationScreenModel;
                return new AbstractC21155m0.p1(giftingScreenModel.getSource(), giftingScreenModel.getGiftType(), giftingScreenModel.getTestCount(), giftingScreenModel.getSelectedTier());
            }
            if (commonNavigationScreenModel instanceof GiftHubScreenModel) {
                return new AbstractC21155m0.n1(((GiftHubScreenModel) navigationScreenModel).getSource());
            }
            if (commonNavigationScreenModel instanceof GenericScreenModel) {
                GenericScreenModel genericScreenModel = (GenericScreenModel) navigationScreenModel;
                ApiRequest request = genericScreenModel.getRequest();
                CachePolicyModel cachePolicy = genericScreenModel.getCachePolicy();
                return new AbstractC21155m0.m1(request, cachePolicy != null ? new GenericCachePolicy(cachePolicy.getEnabled(), cachePolicy.getCacheKey(), cachePolicy.getScopes()) : null, genericScreenModel.getNavigationStyle(), genericScreenModel.getAnalyticEvents(), genericScreenModel.getMetricEvents(), genericScreenModel.getAiAction(), genericScreenModel.getOnStartInteraction(), null, genericScreenModel.getLoadingTopItems(), genericScreenModel.getErrorTopItems(), 128, null);
            }
            if (commonNavigationScreenModel instanceof CommunityFollowersScreenModel) {
                return new AbstractC21155m0.o0(M1833d, z15 ? 1 : 0, M1833d);
            }
            if (commonNavigationScreenModel instanceof CommunityUnavailableScreenModel) {
                CommunityUnavailableScreenModel communityUnavailableScreenModel = (CommunityUnavailableScreenModel) navigationScreenModel;
                return new AbstractC21155m0.e5(communityUnavailableScreenModel.getSelectedTab(), new ApiRequest(communityUnavailableScreenModel.getPath(), GenericHttpMethod.GET, (JsonElement) null, 4, (DefaultConstructorMarker) null), null, null, false ? 1 : 0, null, false ? 1 : 0, null, null, 508, null);
            }
            if (commonNavigationScreenModel instanceof CommunityTeamScreenModel) {
                return new AbstractC21155m0.p0(((CommunityTeamScreenModel) navigationScreenModel).getId());
            }
            if (commonNavigationScreenModel instanceof CommunityTeamsHubScreenModel) {
                return AbstractC21155m0.q0.f80511b;
            }
            if (commonNavigationScreenModel instanceof ClinicianVideoSchedulingIntakeScreenModel) {
                ClinicianVideoSchedulingIntakeScreenModel clinicianVideoSchedulingIntakeScreenModel = (ClinicianVideoSchedulingIntakeScreenModel) navigationScreenModel;
                return new AbstractC21155m0.m0(clinicianVideoSchedulingIntakeScreenModel.getAppointmentType(), clinicianVideoSchedulingIntakeScreenModel.getAppointmentId(), clinicianVideoSchedulingIntakeScreenModel.getIntakeType());
            }
            if (commonNavigationScreenModel instanceof ClinicianSchedulingConfirmationScreenModel) {
                return new AbstractC21155m0.l0(((ClinicianSchedulingConfirmationScreenModel) navigationScreenModel).getAppointmentId());
            }
            if (commonNavigationScreenModel instanceof HealthMonitorScreenModel) {
                return new AbstractC21155m0.q1(null, null, null, null, ((HealthMonitorScreenModel) navigationScreenModel).getAiAction(), 15, null);
            }
            if (commonNavigationScreenModel instanceof HealthReportScreenModel) {
                return AbstractC21155m0.r1.f80529b;
            }
            if (commonNavigationScreenModel instanceof HealthspanScreenModel) {
                HealthspanScreenModel healthspanScreenModel = (HealthspanScreenModel) navigationScreenModel;
                return new AbstractC21155m0.t1(healthspanScreenModel.getDate(), healthspanScreenModel.getSource(), healthspanScreenModel.getAiAction());
            }
            if (commonNavigationScreenModel instanceof HealthTabScreenModel) {
                return new AbstractC21155m0.s1(((HealthTabScreenModel) navigationScreenModel).getSource());
            }
            if (commonNavigationScreenModel instanceof HeartScreenerModel) {
                return new AbstractC21155m0.u1(((HeartScreenerModel) navigationScreenModel).getSource());
            }
            if (commonNavigationScreenModel instanceof HiddenMetricsModel) {
                return AbstractC21155m0.u4.f80569b;
            }
            if (commonNavigationScreenModel instanceof HomeScreenModel) {
                HomeScreenModel homeScreenModel = (HomeScreenModel) navigationScreenModel;
                String homePillar = homeScreenModel.getHomePillar();
                return homePillar != null ? new AbstractC21155m0.y1(homePillar) : new AbstractC21155m0.z1(homeScreenModel.getAiAction());
            }
            if (commonNavigationScreenModel instanceof HormonalInsightsOnboardingModel) {
                String feature = ((HormonalInsightsOnboardingModel) navigationScreenModel).getFeature();
                return feature != null ? new AbstractC21155m0.a2(feature) : new AbstractC21155m0.a2(M1833d, z14 ? 1 : 0, M1833d);
            }
            if (commonNavigationScreenModel instanceof HormonalInsightsSettingsScreenModel) {
                return AbstractC21155m0.b2.f80267b;
            }
            if (commonNavigationScreenModel instanceof HrSettingsScreenModel) {
                return AbstractC21155m0.c2.f80287b;
            }
            if (commonNavigationScreenModel instanceof UniversalCheckoutScreenModel) {
                UniversalCheckoutScreenModel universalCheckoutScreenModel = (UniversalCheckoutScreenModel) navigationScreenModel;
                String path = universalCheckoutScreenModel.getPath();
                UniversalCheckoutPayload payload = universalCheckoutScreenModel.getPayload();
                if (payload != null) {
                    AbstractC0757c abstractC0757c2 = this.json;
                    abstractC0757c2.getClass();
                    strM1833d2 = abstractC0757c2.m1833d(UniversalCheckoutPayload.INSTANCE.serializer(), payload);
                }
                return new AbstractC21155m0.k5(path, strM1833d2, universalCheckoutScreenModel.getSource(), universalCheckoutScreenModel.getMethod(), null, 16, null);
            }
            if (commonNavigationScreenModel instanceof CheckoutWithCartScreenModel) {
                CheckoutWithCartScreenModel checkoutWithCartScreenModel = (CheckoutWithCartScreenModel) navigationScreenModel;
                String method = checkoutWithCartScreenModel.getMethod();
                if (method == null) {
                    method = "GET";
                } else {
                    if (AbstractC39414r.m125890i0(method)) {
                        method = null;
                    }
                    if (method == null) {
                        method = "GET";
                    }
                }
                String str8 = method;
                String path2 = checkoutWithCartScreenModel.getPath();
                CheckoutWithCartPayload payload2 = checkoutWithCartScreenModel.getPayload();
                if (payload2 != null) {
                    AbstractC0757c abstractC0757c3 = this.json;
                    abstractC0757c3.getClass();
                    strM1833d3 = abstractC0757c3.m1833d(CheckoutWithCartPayload.INSTANCE.serializer(), payload2);
                }
                return new AbstractC21155m0.k5(path2, strM1833d3, checkoutWithCartScreenModel.getSource(), str8, null, 16, null);
            }
            if (commonNavigationScreenModel instanceof UniversalCheckoutShippingMethodScreenModel) {
                UniversalCheckoutShippingMethodScreenModel universalCheckoutShippingMethodScreenModel = (UniversalCheckoutShippingMethodScreenModel) navigationScreenModel;
                return new AbstractC21155m0.n5(universalCheckoutShippingMethodScreenModel.getCartId(), universalCheckoutShippingMethodScreenModel.getSource());
            }
            if (commonNavigationScreenModel instanceof UniversalCheckoutShippingAddressScreenModel) {
                UniversalCheckoutShippingAddressScreenModel universalCheckoutShippingAddressScreenModel = (UniversalCheckoutShippingAddressScreenModel) navigationScreenModel;
                return new AbstractC21155m0.m5(universalCheckoutShippingAddressScreenModel.getCartId(), universalCheckoutShippingAddressScreenModel.getSource());
            }
            if (commonNavigationScreenModel instanceof UniversalCartScreenModel) {
                UniversalCartScreenModel universalCartScreenModel = (UniversalCartScreenModel) navigationScreenModel;
                return new AbstractC21155m0.j5(universalCartScreenModel.getCartId(), universalCartScreenModel.getSku(), universalCartScreenModel.getSource(), null, 8, null);
            }
            if (commonNavigationScreenModel instanceof UniversalBuyNowScreenModel) {
                UniversalBuyNowScreenModel universalBuyNowScreenModel = (UniversalBuyNowScreenModel) navigationScreenModel;
                return new AbstractC21155m0.i5(universalBuyNowScreenModel.getSku(), universalBuyNowScreenModel.getPackSku(), universalBuyNowScreenModel.getChildItemSkus(), universalBuyNowScreenModel.getWywSku(), universalBuyNowScreenModel.getBandSku(), universalBuyNowScreenModel.getClaspSku(), universalBuyNowScreenModel.getHookSku(), universalBuyNowScreenModel.getFastLinkSku(), universalBuyNowScreenModel.getStoreDomain());
            }
            if (commonNavigationScreenModel instanceof URLScreenModel) {
                return new AbstractC21155m0.h5(((URLScreenModel) navigationScreenModel).getUrl());
            }
            if (commonNavigationScreenModel instanceof VideoCallScreenModel) {
                return new AbstractC21155m0.p5(((VideoCallScreenModel) navigationScreenModel).getCallId());
            }
            if (commonNavigationScreenModel instanceof InAppBrowserScreenModel) {
                return new AbstractC21155m0.g1(((InAppBrowserScreenModel) navigationScreenModel).getUrl());
            }
            if (commonNavigationScreenModel instanceof ProfileScreenModel) {
                ProfileScreenModel profileScreenModel = (ProfileScreenModel) navigationScreenModel;
                return new AbstractC21155m0.w3(profileScreenModel.getTargetUserId(), profileScreenModel.getCommunityId(), profileScreenModel.getSource(), profileScreenModel.getEducationType());
            }
            if (commonNavigationScreenModel instanceof IntegrationsScreenModel) {
                IntegrationsScreenModel integrationsScreenModel = (IntegrationsScreenModel) navigationScreenModel;
                return new AbstractC21155m0.d2(integrationsScreenModel.getIntegrationId(), integrationsScreenModel.getSource(), integrationsScreenModel.getAiAction());
            }
            if (!(commonNavigationScreenModel instanceof IntegrationsDisclaimerScreenModel) && !(commonNavigationScreenModel instanceof CustomizeBottomSheetScreenModel) && !(commonNavigationScreenModel instanceof InterdayJournalScreenModel) && !(commonNavigationScreenModel instanceof JournalScreenModel)) {
                if (commonNavigationScreenModel.equals(LanguageSettingsScreenModel.INSTANCE)) {
                    return AbstractC21155m0.m2.f80465b;
                }
                if (commonNavigationScreenModel.equals(LegacyProCheckoutScreenModel.INSTANCE)) {
                    return AbstractC21155m0.n2.f80475b;
                }
                if (commonNavigationScreenModel instanceof LevelsScreenModel) {
                    MemberLevelInfo memberLevelInfo = ((LevelsScreenModel) navigationScreenModel).getMemberLevelInfo();
                    ProgressionLevel progressionLevel = memberLevelInfo.getProgressionLevel();
                    return new AbstractC21155m0.o2(memberLevelInfo.getId(), memberLevelInfo.getLevel(), memberLevelInfo.getExperience(), memberLevelInfo.getUserId(), progressionLevel.getTier(), progressionLevel.getBadge(), progressionLevel.getMiniBadge(), progressionLevel.getMinimumExperience(), progressionLevel.getMaximumExperience());
                }
                if (commonNavigationScreenModel instanceof LoginScreenModel) {
                    return new AbstractC21155m0.s2(((LoginScreenModel) navigationScreenModel).getShowCreateAccount());
                }
                if (commonNavigationScreenModel instanceof MciLogCalendarScreenModel) {
                    MciLogCalendarScreenModel mciLogCalendarScreenModel = (MciLogCalendarScreenModel) navigationScreenModel;
                    return new AbstractC21155m0.u2(mciLogCalendarScreenModel.getDate(), mciLogCalendarScreenModel.getSource());
                }
                if (commonNavigationScreenModel instanceof MciOverviewScreenModel) {
                    MciOverviewScreenModel mciOverviewScreenModel = (MciOverviewScreenModel) navigationScreenModel;
                    return new AbstractC21155m0.v2(mciOverviewScreenModel.getDate(), false, mciOverviewScreenModel.getPreSelectedLogValue(), mciOverviewScreenModel.getAnalyticsSource(), mciOverviewScreenModel.getAiAction());
                }
                if (commonNavigationScreenModel instanceof MciPhaseCoachingScreenModel) {
                    MciPhaseCoachingScreenModel mciPhaseCoachingScreenModel = (MciPhaseCoachingScreenModel) navigationScreenModel;
                    return new AbstractC21155m0.w2(mciPhaseCoachingScreenModel.getPhase(), mciPhaseCoachingScreenModel.getAiAction());
                }
                if (commonNavigationScreenModel instanceof MediaFocusModel) {
                    return new AbstractC21155m0.g3(((MediaFocusModel) navigationScreenModel).getVideoUrl());
                }
                if (commonNavigationScreenModel instanceof MembershipAdjustmentScreenModel) {
                    MembershipAdjustmentScreenModel membershipAdjustmentScreenModel = (MembershipAdjustmentScreenModel) navigationScreenModel;
                    return new AbstractC21155m0.y2(membershipAdjustmentScreenModel.getStrapSerial(), membershipAdjustmentScreenModel.getStrapSignature(), membershipAdjustmentScreenModel.getSource());
                }
                if (commonNavigationScreenModel instanceof MembershipAdjustmentCheckoutScreenModel) {
                    MembershipAdjustmentCheckoutScreenModel membershipAdjustmentCheckoutScreenModel = (MembershipAdjustmentCheckoutScreenModel) navigationScreenModel;
                    Map<String, String> payload3 = membershipAdjustmentCheckoutScreenModel.getPayload();
                    String trackingTier = membershipAdjustmentCheckoutScreenModel.getTrackingTier();
                    String trackingSource = membershipAdjustmentCheckoutScreenModel.getTrackingSource();
                    return new AbstractC21155m0.x2(payload3, trackingTier, trackingSource != null ? trackingSource : "");
                }
                if (commonNavigationScreenModel.equals(MembershipAndBillingScreenModel.INSTANCE)) {
                    return AbstractC21155m0.z2.f80674b;
                }
                if (commonNavigationScreenModel.equals(MembershipManagementScreenModel.INSTANCE)) {
                    return AbstractC21155m0.a3.f80255b;
                }
                if (commonNavigationScreenModel.equals(MenuScreenModel.INSTANCE)) {
                    return new AbstractC21155m0.b3(M1833d, z13 ? 1 : 0, M1833d);
                }
                int i13 = 2;
                if (commonNavigationScreenModel instanceof MfaSetupScreenModel) {
                    return new AbstractC21155m0.c3(((MfaSetupScreenModel) navigationScreenModel).getSource(), M1833d, i13, M1833d);
                }
                if (commonNavigationScreenModel.equals(MyAccountScreenModel.INSTANCE)) {
                    return AbstractC21155m0.e3.f80338b;
                }
                if (commonNavigationScreenModel instanceof NativePlanSwitchModel) {
                    return new AbstractC21155m0.h3(((NativePlanSwitchModel) navigationScreenModel).getSubscriptionType());
                }
                if (commonNavigationScreenModel instanceof NativeStoreScreenModel) {
                    return new AbstractC21155m0.i3(((NativeStoreScreenModel) navigationScreenModel).getSource(), M1833d, i13, M1833d);
                }
                if (commonNavigationScreenModel instanceof ProductDescriptionPageScreenModel) {
                    ProductDescriptionPageScreenModel productDescriptionPageScreenModel = (ProductDescriptionPageScreenModel) navigationScreenModel;
                    C23465k c23465kM82527b = AbstractC27351b.m82527b(productDescriptionPageScreenModel.getSlug(), productDescriptionPageScreenModel.getSku());
                    return new AbstractC21155m0.u3((String) c23465kM82527b.f92937w, (String) c23465kM82527b.f92938x, productDescriptionPageScreenModel.getSource());
                }
                if (commonNavigationScreenModel instanceof ProductSizeGuideScreenModel) {
                    return new AbstractC21155m0.v3(((ProductSizeGuideScreenModel) navigationScreenModel).getKey());
                }
                if (commonNavigationScreenModel instanceof OnboardingStoryScreenModel) {
                    OnboardingStoryScreenModel onboardingStoryScreenModel = (OnboardingStoryScreenModel) navigationScreenModel;
                    return new AbstractC21155m0.l3(onboardingStoryScreenModel.getOnboardingStoryName(), "", onboardingStoryScreenModel.getCycleId());
                }
                if (commonNavigationScreenModel instanceof PregnancyInsightsScreenModel) {
                    PregnancyInsightsScreenModel pregnancyInsightsScreenModel = (PregnancyInsightsScreenModel) navigationScreenModel;
                    return new AbstractC21155m0.q3(pregnancyInsightsScreenModel.getDate(), pregnancyInsightsScreenModel.getSource(), pregnancyInsightsScreenModel.getAiAction());
                }
                if (commonNavigationScreenModel instanceof PregnancySettingsScreenModel) {
                    PregnancySettingsScreenModel pregnancySettingsScreenModel = (PregnancySettingsScreenModel) navigationScreenModel;
                    return new AbstractC21155m0.r3(pregnancySettingsScreenModel.getPregnancyScreen(), pregnancySettingsScreenModel.getSource());
                }
                if (commonNavigationScreenModel instanceof PreviousPregnancyScreenModel) {
                    return new AbstractC21155m0.s3(((PreviousPregnancyScreenModel) navigationScreenModel).getId());
                }
                if (commonNavigationScreenModel instanceof PrivacyScreenModel) {
                    return new AbstractC21155m0.t3(M1833d, z4 ? 1 : 0, M1833d);
                }
                if (commonNavigationScreenModel instanceof EnterpriseProgramSettingsScreenModel) {
                    return new AbstractC21155m0.t3(EnumC21171u0.ENTERPRISE_ONLY);
                }
                if (commonNavigationScreenModel instanceof RecoveryDetailsScreenModel) {
                    RecoveryDetailsScreenModel recoveryDetailsScreenModel = (RecoveryDetailsScreenModel) navigationScreenModel;
                    return new AbstractC21155m0.e(recoveryDetailsScreenModel.getActivityId(), "RECOVERY", null, null, false, recoveryDetailsScreenModel.getEntryPoint(), recoveryDetailsScreenModel.getAiAction(), 28, null);
                }
                if (!(commonNavigationScreenModel instanceof ReferAFriendScreenModel) && !(commonNavigationScreenModel instanceof ReferAFriendHubScreenModel)) {
                    if (commonNavigationScreenModel instanceof ReferAFriendReceiverScreenModel) {
                        return new AbstractC21155m0.x3(((ReferAFriendReceiverScreenModel) navigationScreenModel).getCode());
                    }
                    if (commonNavigationScreenModel instanceof ReturnsScreenModel) {
                        return AbstractC21155m0.c4.f80290b;
                    }
                    if (commonNavigationScreenModel instanceof SageScreenModel) {
                        SageScreenModel sageScreenModel = (SageScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.e4(sageScreenModel.getDate(), sageScreenModel.getSource());
                    }
                    if (commonNavigationScreenModel instanceof SageManualEntryScreenModel) {
                        return new AbstractC21155m0.d4(((SageManualEntryScreenModel) navigationScreenModel).getSource());
                    }
                    if (commonNavigationScreenModel instanceof SageOnboardingScreenModel) {
                        return AbstractC21155m0.f4.f80365b;
                    }
                    if (commonNavigationScreenModel instanceof SanguineWaitlistScreenModel) {
                        SanguineWaitlistScreenModel sanguineWaitlistScreenModel = (SanguineWaitlistScreenModel) navigationScreenModel;
                        String source3 = sanguineWaitlistScreenModel.getSource();
                        Boolean signUpOnEntry = sanguineWaitlistScreenModel.getSignUpOnEntry();
                        return new AbstractC21155m0.h4(source3, signUpOnEntry != null ? signUpOnEntry.booleanValue() : false);
                    }
                    if (commonNavigationScreenModel instanceof SanguineWaitlistBiomarkersScreenModel) {
                        return AbstractC21155m0.g4.f80381b;
                    }
                    if (commonNavigationScreenModel instanceof SeeAllRecordingsScreenModel) {
                        return new AbstractC21155m0.i4(((SeeAllRecordingsScreenModel) navigationScreenModel).getMeasurementId());
                    }
                    if (commonNavigationScreenModel.equals(ShepherdAboutModel.INSTANCE)) {
                        return AbstractC21155m0.l4.f80446b;
                    }
                    if (commonNavigationScreenModel instanceof ShepherdDetailsModel) {
                        ShepherdDetailsModel shepherdDetailsModel = (ShepherdDetailsModel) navigationScreenModel;
                        return new AbstractC21155m0.m4(shepherdDetailsModel.getDate(), shepherdDetailsModel.getEducationName());
                    }
                    if (commonNavigationScreenModel.equals(ShepherdHistoryModel.INSTANCE)) {
                        return AbstractC21155m0.n4.f80477b;
                    }
                    if (commonNavigationScreenModel.equals(ShepherdOnboardingModel.INSTANCE)) {
                        return new AbstractC21155m0.o4("");
                    }
                    if (commonNavigationScreenModel.equals(ShepherdRegistrationModel.INSTANCE)) {
                        return AbstractC21155m0.p4.f80508b;
                    }
                    if (commonNavigationScreenModel.equals(ShepherdSettingsModel.INSTANCE)) {
                        return AbstractC21155m0.q4.f80523b;
                    }
                    if (commonNavigationScreenModel instanceof SleepDetailsScreenModel) {
                        SleepDetailsScreenModel sleepDetailsScreenModel = (SleepDetailsScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.e(sleepDetailsScreenModel.getActivityId(), "SLEEP", null, null, false, sleepDetailsScreenModel.getEntryPoint(), sleepDetailsScreenModel.getAiAction(), 28, null);
                    }
                    if (commonNavigationScreenModel instanceof StartActivitySportModel) {
                        StartActivitySportModel startActivitySportModel = (StartActivitySportModel) navigationScreenModel;
                        return new AbstractC21155m0.t4(startActivitySportModel.getSportId(), startActivitySportModel.getAutoStartActivity(), null, 4, null);
                    }
                    if (commonNavigationScreenModel.equals(StartActivityScreenModel.INSTANCE)) {
                        return new AbstractC21155m0.t4(null, null, null, 7, null);
                    }
                    if (commonNavigationScreenModel instanceof StreaksExplainerModel) {
                        return AbstractC21155m0.x4.f80632b;
                    }
                    if (commonNavigationScreenModel instanceof StrengthTrainerScreenModel) {
                        StrengthTrainerScreenModel strengthTrainerScreenModel = (StrengthTrainerScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.y4(strengthTrainerScreenModel.getStartingId(), strengthTrainerScreenModel.getLinkActivityId(), strengthTrainerScreenModel.isFromWhoopCoach(), strengthTrainerScreenModel.getEntryPoint(), strengthTrainerScreenModel.getOpenTab(), strengthTrainerScreenModel.getAiAction());
                    }
                    if (commonNavigationScreenModel instanceof EditCustomExerciseModel) {
                        EditCustomExerciseModel editCustomExerciseModel = (EditCustomExerciseModel) navigationScreenModel;
                        return new AbstractC21155m0.d1(editCustomExerciseModel.getExerciseId(), editCustomExerciseModel.getEntryPoint());
                    }
                    if (commonNavigationScreenModel instanceof ExerciseDetailsScreenModel) {
                        ExerciseDetailsScreenModel exerciseDetailsScreenModel = (ExerciseDetailsScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.e1(exerciseDetailsScreenModel.getExerciseId(), exerciseDetailsScreenModel.getShowCTA(), exerciseDetailsScreenModel.getEntryPoint(), exerciseDetailsScreenModel.getEntryPointType(), false, 16, null);
                    }
                    if (commonNavigationScreenModel instanceof SleepPlannerScreenModel) {
                        return new AbstractC21155m0.r4("Overview Pillar - Entry Point");
                    }
                    if (commonNavigationScreenModel instanceof SmsSetupScreenModel) {
                        return new AbstractC21155m0.s4(((SmsSetupScreenModel) navigationScreenModel).getSource());
                    }
                    if (commonNavigationScreenModel instanceof StressInterventionModel) {
                        return new AbstractC21155m0.z4(((StressInterventionModel) navigationScreenModel).getInterventionType());
                    }
                    if (commonNavigationScreenModel instanceof StressMonitorScreenModel) {
                        StressMonitorScreenModel stressMonitorScreenModel = (StressMonitorScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.a5(stressMonitorScreenModel.getDate(), null, stressMonitorScreenModel.getAiAction(), 2, null);
                    }
                    if (commonNavigationScreenModel instanceof SymptomPatternsScreenModel) {
                        return new AbstractC21155m0.b5(((SymptomPatternsScreenModel) navigationScreenModel).getFeatureType(), M1833d, i13, M1833d);
                    }
                    if (commonNavigationScreenModel instanceof TiltModeScreenModel) {
                        TiltModeScreenModel tiltModeScreenModel = (TiltModeScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.c5(tiltModeScreenModel.getDate(), tiltModeScreenModel.getSource());
                    }
                    if (commonNavigationScreenModel instanceof TrendsScreenModel) {
                        return AbstractC21155m0.j3.f80414b;
                    }
                    if (commonNavigationScreenModel instanceof UpcycleLandingScreenModel) {
                        return AbstractC21155m0.o5.f80497b;
                    }
                    if (commonNavigationScreenModel instanceof ReactivationUpsellScreenModel) {
                        return AbstractC21155m0.z3.f80675b;
                    }
                    if (commonNavigationScreenModel instanceof WeightliftingDetailsScreenModel) {
                        WeightliftingDetailsScreenModel weightliftingDetailsScreenModel = (WeightliftingDetailsScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.e(weightliftingDetailsScreenModel.getActivityId(), "WEIGHTLIFTING_MSK", null, null, false, weightliftingDetailsScreenModel.getEntryPoint(), null, 92, null);
                    }
                    if (commonNavigationScreenModel instanceof WeekInReviewScreenModel) {
                        return AbstractC21155m0.q5.f80524b;
                    }
                    if (commonNavigationScreenModel instanceof WeeklyPlanEditScreenModel) {
                        return AbstractC21155m0.j3.f80414b;
                    }
                    if (commonNavigationScreenModel instanceof WeeklyPlanOverviewScreenModel) {
                        WeeklyPlanOverviewScreenModel weeklyPlanOverviewScreenModel = (WeeklyPlanOverviewScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.s5(false, weeklyPlanOverviewScreenModel.getScrollId(), weeklyPlanOverviewScreenModel.getSource(), weeklyPlanOverviewScreenModel.getAiAction());
                    }
                    if (commonNavigationScreenModel instanceof WeeklyPlanPresetLandingScreenModel) {
                        return new AbstractC21155m0.s5(true, null, null, null, 14, null);
                    }
                    if (commonNavigationScreenModel instanceof WeeklyPlanSummaryScreenModel) {
                        WeeklyPlanSummaryScreenModel weeklyPlanSummaryScreenModel = (WeeklyPlanSummaryScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.v5(weeklyPlanSummaryScreenModel.getPlanId(), weeklyPlanSummaryScreenModel.getAiAction());
                    }
                    if (commonNavigationScreenModel instanceof WeeklyPlanSetupScreenModel) {
                        WeeklyPlanSetupScreenModel weeklyPlanSetupScreenModel = (WeeklyPlanSetupScreenModel) navigationScreenModel;
                        InitialSelectionModel initialSelection = weeklyPlanSetupScreenModel.getInitialSelection();
                        if (initialSelection != null) {
                            AbstractC0757c abstractC0757c4 = this.json;
                            abstractC0757c4.getClass();
                            M1833d = abstractC0757c4.m1833d(InitialSelectionModel.INSTANCE.serializer(), initialSelection);
                        }
                        return new AbstractC21155m0.u5(weeklyPlanSetupScreenModel.getPlanName(), weeklyPlanSetupScreenModel.getAnalyticsSource(), weeklyPlanSetupScreenModel.getLocked(), weeklyPlanSetupScreenModel.getNoPlanShowMetricSelection(), M1833d, weeklyPlanSetupScreenModel.getDate(), weeklyPlanSetupScreenModel.getSource(), weeklyPlanSetupScreenModel.getPresetPlanCategory(), weeklyPlanSetupScreenModel.getPlanTitle(), weeklyPlanSetupScreenModel.getDescription(), weeklyPlanSetupScreenModel.getExplanationTitle(), weeklyPlanSetupScreenModel.getExplanation(), weeklyPlanSetupScreenModel.getTemplateId(), weeklyPlanSetupScreenModel.getCategory(), weeklyPlanSetupScreenModel.getCarouselPlacement(), AbstractC21168t.m59412a(weeklyPlanSetupScreenModel.getDismissalType()));
                    }
                    if (commonNavigationScreenModel instanceof WhoopLabsHomeScreenModel) {
                        WhoopLabsHomeScreenModel whoopLabsHomeScreenModel = (WhoopLabsHomeScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.x5(whoopLabsHomeScreenModel.getCampaignId(), whoopLabsHomeScreenModel.getSessionId(), whoopLabsHomeScreenModel.getCampaignFilter());
                    }
                    if (commonNavigationScreenModel instanceof WhoopLabsScreenModel) {
                        WhoopLabsScreenModel whoopLabsScreenModel = (WhoopLabsScreenModel) navigationScreenModel;
                        return new AbstractC21155m0.x5(whoopLabsScreenModel.getCampaignId(), whoopLabsScreenModel.getSessionId(), whoopLabsScreenModel.getCampaignFilter());
                    }
                    if (!(commonNavigationScreenModel instanceof WhoopLiveScreenModel)) {
                        if (AbstractC22676k.m65745e(commonNavigationScreenModel, WhatToExpectScreenModel.INSTANCE)) {
                            return AbstractC21155m0.w5.f80623b;
                        }
                        if (commonNavigationScreenModel instanceof WhoopShareScreenModel) {
                            WhoopShareScreenModel whoopShareScreenModel = (WhoopShareScreenModel) navigationScreenModel;
                            String path3 = whoopShareScreenModel.getPath();
                            return new AbstractC21155m0.z5(path3 != null ? path3 : "", whoopShareScreenModel.getSource());
                        }
                        if (commonNavigationScreenModel instanceof YearInReviewScreenModel) {
                            return new AbstractC21155m0.a6(((YearInReviewScreenModel) navigationScreenModel).getYear());
                        }
                        if (commonNavigationScreenModel instanceof OrderConfirmationScreenModel) {
                            return new AbstractC21155m0.m3(((OrderConfirmationScreenModel) navigationScreenModel).getSource());
                        }
                        if (commonNavigationScreenModel instanceof AfterActivationFinalScreensScreenModel) {
                            AfterActivationFinalScreensScreenModel afterActivationFinalScreensScreenModel = (AfterActivationFinalScreensScreenModel) navigationScreenModel;
                            return new AbstractC21155m0.d(null, afterActivationFinalScreensScreenModel.getStartScreen(), afterActivationFinalScreensScreenModel.getSource(), 1, null);
                        }
                        if (commonNavigationScreenModel instanceof ActivationNavigationModel) {
                            return new AbstractC21155m0.d(null, ((ActivationNavigationModel) navigationScreenModel).getStartScreen(), null, 5, null);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    WhoopLiveScreenModel whoopLiveScreenModel = (WhoopLiveScreenModel) navigationScreenModel;
                    Long cycleId = whoopLiveScreenModel.getCycleId();
                    long jLongValue = cycleId != null ? cycleId.longValue() : 0L;
                    String lowerBound = whoopLiveScreenModel.getLowerBound();
                    String str9 = lowerBound == null ? "" : lowerBound;
                    String upperBound = whoopLiveScreenModel.getUpperBound();
                    String str10 = upperBound == null ? "" : upperBound;
                    Double dayStrain = whoopLiveScreenModel.getDayStrain();
                    double dDoubleValue = dayStrain != null ? dayStrain.doubleValue() : 0.0d;
                    Integer recoveryScore = whoopLiveScreenModel.getRecoveryScore();
                    int iIntValue = recoveryScore != null ? recoveryScore.intValue() : 0;
                    Long sleepMilliseconds = whoopLiveScreenModel.getSleepMilliseconds();
                    long jLongValue2 = sleepMilliseconds != null ? sleepMilliseconds.longValue() : 0L;
                    Integer calories = whoopLiveScreenModel.getCalories();
                    int iIntValue2 = calories != null ? calories.intValue() : 0;
                    Boolean boolIsComplete = whoopLiveScreenModel.isComplete();
                    return new AbstractC21155m0.y5(jLongValue, str9, str10, dDoubleValue, iIntValue, jLongValue2, iIntValue2, boolIsComplete != null ? boolIsComplete.booleanValue() : false);
                }
                return AbstractC21155m0.j3.f80414b;
            }
            return AbstractC21155m0.j3.f80414b;
        }
        return AbstractC21155m0.j3.f80414b;
    }
}
