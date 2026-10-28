package com.whoop.design.json;

import c93.InterfaceC4351m;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.whoop.design.models.ComparisonBarsGraphModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ImpactMagnitudeTileModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressMeterModel;
import com.whoop.design.models.TitleSubTitleModel;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel;
import com.whoop.design.models.calendar.BehaviorsCalendarModel;
import com.whoop.design.models.calendar.archmini.ArchMiniCalendarModel;
import com.whoop.design.models.cards.ActionCardModel;
import com.whoop.design.models.cards.AdvancedLabsSubscriptionCardModel;
import com.whoop.design.models.cards.ButtonCardModel;
import com.whoop.design.models.cards.CardContainerModel;
import com.whoop.design.models.cards.CompactButtonCardModel;
import com.whoop.design.models.cards.ContentBlockCardModel;
import com.whoop.design.models.cards.ContentBlockListCardModel;
import com.whoop.design.models.cards.FertilityCardModel;
import com.whoop.design.models.cards.FertilityStatusItemModel;
import com.whoop.design.models.cards.GraphDescriptionCardModel;
import com.whoop.design.models.cards.HeroImageCardModel;
import com.whoop.design.models.cards.HeroWithFooterCtaModel;
import com.whoop.design.models.cards.ImageAndButtonCardModel;
import com.whoop.design.models.cards.LeftAlignedImageCardModel;
import com.whoop.design.models.cards.MenstrualCycleInsightsCardModel;
import com.whoop.design.models.cards.ProductTestCardModel;
import com.whoop.design.models.cards.TextAndImageCardModel;
import com.whoop.design.models.cards.TextOnlyCardModel;
import com.whoop.design.models.cards.TextWithDesignItemCardModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.cards.VowCardModel;
import com.whoop.design.models.celebration.CelebrationMediaModel;
import com.whoop.design.models.celebration.CelebrationMediaWithCaptionModel;
import com.whoop.design.models.celebration.CelebrationOverlayModel;
import com.whoop.design.models.items.AchievementProgressCardModel;
import com.whoop.design.models.items.ActivityModel;
import com.whoop.design.models.items.ActivityTileSelectionItemModel;
import com.whoop.design.models.items.AiChatEntryModel;
import com.whoop.design.models.items.AiChatTalkTextEmptyStateModel;
import com.whoop.design.models.items.AiChatTalkTextModel;
import com.whoop.design.models.items.AiWeeklyPlanSuggestionModel;
import com.whoop.design.models.items.AlertTileModel;
import com.whoop.design.models.items.AnimatedSequenceModel;
import com.whoop.design.models.items.AnnotatedTextModel;
import com.whoop.design.models.items.AppointmentCardModel;
import com.whoop.design.models.items.ArchMiniBehaviorDetailsModel;
import com.whoop.design.models.items.ArchMiniCommunityFollowerLookupModel;
import com.whoop.design.models.items.ArchMiniCommunityFollowerModel;
import com.whoop.design.models.items.ArchMiniFilteredListModel;
import com.whoop.design.models.items.ArchMiniSearchModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.ArticleTileModel;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.BehaviorCountTileModel;
import com.whoop.design.models.items.BehaviorDetailsTileModel;
import com.whoop.design.models.items.BinaryFeedbackModel;
import com.whoop.design.models.items.BiomarkerCardModel;
import com.whoop.design.models.items.BiomarkerModel;
import com.whoop.design.models.items.BiomarkerPieChartSectionModel;
import com.whoop.design.models.items.ButtonCellModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardIconButtonModel;
import com.whoop.design.models.items.ChallengeProgressGaugeModel;
import com.whoop.design.models.items.CheckboxModel;
import com.whoop.design.models.items.CollapsableHeaderModel;
import com.whoop.design.models.items.ColumnModel;
import com.whoop.design.models.items.CommunityFollowerModel;
import com.whoop.design.models.items.CommunityTeamTileModel;
import com.whoop.design.models.items.CompactTrendModel;
import com.whoop.design.models.items.ComparisonTableModel;
import com.whoop.design.models.items.ContextCardModel;
import com.whoop.design.models.items.ContextHubHeaderModel;
import com.whoop.design.models.items.ContributorTileModel;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CurrentPlanTileModel;
import com.whoop.design.models.items.CustomizeBottomSheetModel;
import com.whoop.design.models.items.DataHighlightModel;
import com.whoop.design.models.items.DatePillModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DesignItemGridModel;
import com.whoop.design.models.items.DetailsMetricTileModel;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.DynamicInformationalImageCardModel;
import com.whoop.design.models.items.EndpointButtonModel;
import com.whoop.design.models.items.EntryPointModel;
import com.whoop.design.models.items.ExerciseBreakdownModel;
import com.whoop.design.models.items.ExerciseRecordHeaderModel;
import com.whoop.design.models.items.ExpandableCardModel;
import com.whoop.design.models.items.ExpandableContentModel;
import com.whoop.design.models.items.ExpandableListModel;
import com.whoop.design.models.items.ExplainerGaugeModel;
import com.whoop.design.models.items.FabMenuModel;
import com.whoop.design.models.items.FaqListModel;
import com.whoop.design.models.items.FeatureListModel;
import com.whoop.design.models.items.FeedbackSurveyModel;
import com.whoop.design.models.items.FileViewerModel;
import com.whoop.design.models.items.FlowRowModel;
import com.whoop.design.models.items.FollowerRequestModel;
import com.whoop.design.models.items.GlassTileModel;
import com.whoop.design.models.items.GoalProgressCardModel;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.models.items.GoalTileModel;
import com.whoop.design.models.items.GroupedItemsPanelModel;
import com.whoop.design.models.items.HeaderItemsCardModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HealthMonitorCardModel;
import com.whoop.design.models.items.HealthMonitorModel;
import com.whoop.design.models.items.HeartRateZone;
import com.whoop.design.models.items.HistoryListItemModel;
import com.whoop.design.models.items.HorizontalDividedListModel;
import com.whoop.design.models.items.HorizontalImpactBarLabeledModel;
import com.whoop.design.models.items.HorizontalMetricTileModel;
import com.whoop.design.models.items.HorizontalScrollContainerModel;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.IconMarkdownCalloutModel;
import com.whoop.design.models.items.ImageAndIconModel;
import com.whoop.design.models.items.ImageCardPickerModel;
import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImpactBarSegmentModel;
import com.whoop.design.models.items.ImpactBarSegmentTypicalMarker;
import com.whoop.design.models.items.ImpactCardModel;
import com.whoop.design.models.items.ImpactHeaderModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactTileModel;
import com.whoop.design.models.items.InfoRowListModel;
import com.whoop.design.models.items.InsightsItemListModel;
import com.whoop.design.models.items.InsightsItemModel;
import com.whoop.design.models.items.InsufficientAnswerCount;
import com.whoop.design.models.items.InsufficientImpactTileModel;
import com.whoop.design.models.items.IntegrationUpsellModel;
import com.whoop.design.models.items.ItemsCardModel;
import com.whoop.design.models.items.JournalEntryWidgetModel;
import com.whoop.design.models.items.JournalEntrypointModel;
import com.whoop.design.models.items.JournalQuestionNumericInputModel;
import com.whoop.design.models.items.JournalQuestionSliderModel;
import com.whoop.design.models.items.JournalQuestionStepperModel;
import com.whoop.design.models.items.JournalQuestionTimeInputModel;
import com.whoop.design.models.items.JournalQuestionTimeSliderModel;
import com.whoop.design.models.items.JournalQuestionYesNoModel;
import com.whoop.design.models.items.KeyMetricCarouselModel;
import com.whoop.design.models.items.KeyMetricTileModel;
import com.whoop.design.models.items.KeyStatisticModel;
import com.whoop.design.models.items.LabeledProgressBarModel;
import com.whoop.design.models.items.ListItemTileModel;
import com.whoop.design.models.items.LockedImpactOnRecoveryModel;
import com.whoop.design.models.items.LogoNavModel;
import com.whoop.design.models.items.MapModel;
import com.whoop.design.models.items.MembershipComparisonTableModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.models.items.MetricEducationModel;
import com.whoop.design.models.items.MetricStatusTileModel;
import com.whoop.design.models.items.MilestoneCardModel;
import com.whoop.design.models.items.MilestonePillWrapperModel;
import com.whoop.design.models.items.MilestoneProgressCardModel;
import com.whoop.design.models.items.MiniCalloutModel;
import com.whoop.design.models.items.MiniMonitorCardModel;
import com.whoop.design.models.items.MultiSelectModel;
import com.whoop.design.models.items.MultiWheelPickerModel;
import com.whoop.design.models.items.MultipleButtonContainerModel;
import com.whoop.design.models.items.NumberedListModel;
import com.whoop.design.models.items.NumericInputSliderModel;
import com.whoop.design.models.items.OptionCommitPanelModel;
import com.whoop.design.models.items.OptionInfoModel;
import com.whoop.design.models.items.OverviewGaugeModel;
import com.whoop.design.models.items.PaceOfAgingMeterModel;
import com.whoop.design.models.items.PaginationControlModel;
import com.whoop.design.models.items.PerksListModel;
import com.whoop.design.models.items.PieChartModel;
import com.whoop.design.models.items.PlanTileModel;
import com.whoop.design.models.items.PricingSelectionCardModel;
import com.whoop.design.models.items.ProfileInfoTileListModel;
import com.whoop.design.models.items.ProfileInfoTileModel;
import com.whoop.design.models.items.ProgressBreakdownModel;
import com.whoop.design.models.items.ProgressMetricRowModel;
import com.whoop.design.models.items.RecoveryGaugeModel;
import com.whoop.design.models.items.RewardItemModel;
import com.whoop.design.models.items.RewardsSectionModel;
import com.whoop.design.models.items.ScoreGaugeModel;
import com.whoop.design.models.items.SearchBarModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SectionModel;
import com.whoop.design.models.items.SegmentedContentModel;
import com.whoop.design.models.items.SelectableCellListModel;
import com.whoop.design.models.items.SelectableCellModel;
import com.whoop.design.models.items.SelectableChipModel;
import com.whoop.design.models.items.SelectionWidgetModel;
import com.whoop.design.models.items.SingleSelectModel;
import com.whoop.design.models.items.SleepPlannerAlarmCardModel;
import com.whoop.design.models.items.SleepPlannerCardModel;
import com.whoop.design.models.items.SpecificationTableModel;
import com.whoop.design.models.items.SplitColumnModel;
import com.whoop.design.models.items.SplitContainerCardModel;
import com.whoop.design.models.items.StartTurnButtonModel;
import com.whoop.design.models.items.StatusTileModel;
import com.whoop.design.models.items.StepperComponentModel;
import com.whoop.design.models.items.StrainGaugeModel;
import com.whoop.design.models.items.SuggestionBubbleModel;
import com.whoop.design.models.items.SupportActionTileModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagSelectorModel;
import com.whoop.design.models.items.TestimonialsModel;
import com.whoop.design.models.items.TextAreaModel;
import com.whoop.design.models.items.TextInputModel;
import com.whoop.design.models.items.TileTagModel;
import com.whoop.design.models.items.TimedContentModel;
import com.whoop.design.models.items.TimerMetaDataModel;
import com.whoop.design.models.items.TitleTileModel;
import com.whoop.design.models.items.ToggleCardButtonModel;
import com.whoop.design.models.items.ToggleDesignModel;
import com.whoop.design.models.items.TrackedBehaviorModel;
import com.whoop.design.models.items.TrendGraphLineModel;
import com.whoop.design.models.items.TrendIconsLegendModel;
import com.whoop.design.models.items.TriLabelSliderModel;
import com.whoop.design.models.items.UnknownDesignModel;
import com.whoop.design.models.items.UnlockTrendsCardModel;
import com.whoop.design.models.items.UnlockedImpactOnRecoveryModel;
import com.whoop.design.models.items.UpsellCardCalloutModel;
import com.whoop.design.models.items.UpsellCardFeaturesModel;
import com.whoop.design.models.items.UpsellCardSmallModel;
import com.whoop.design.models.items.VerticalSpacerModel;
import com.whoop.design.models.items.VowCtaModel;
import com.whoop.design.models.items.VowModel;
import com.whoop.design.models.items.WaitlistBiomarkerListPreviewModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.ZoneBarModel;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel;
import com.whoop.design.models.items.aiactiontile.AiActionTileModel;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.avatarpill.AvatarPillModel;
import com.whoop.design.models.items.behaviordetails.ImpactCalloutModel;
import com.whoop.design.models.items.behaviordetails.ImpactMagnitudeQuestionsModel;
import com.whoop.design.models.items.circularprogressindicator.CircularProgressIndicatorModel;
import com.whoop.design.models.items.clinicalreportcard.ClinicalReportCardModel;
import com.whoop.design.models.items.collapsiblerow.CollapsibleRowModel;
import com.whoop.design.models.items.datepicker.DatePickerModel;
import com.whoop.design.models.items.emoji.EmojiModel;
import com.whoop.design.models.items.expandablestatisticlist.ExpandableStatisticListModel;
import com.whoop.design.models.items.graph.GraphCardCtaModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphingCardModel;
import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.design.models.items.heightpicker.HeightPickerModel;
import com.whoop.design.models.items.heightweight.HeightWeightModel;
import com.whoop.design.models.items.hrzonesrow.HrZonesRowModel;
import com.whoop.design.models.items.keyinfotile.KeyInfoTileModel;
import com.whoop.design.models.items.nestedbff.NestedBFFItemModel;
import com.whoop.design.models.items.ratingpicker.RatingPickerModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileButtonModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileGroupModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileModel;
import com.whoop.design.models.items.recommendationtileheader.RecommendationTileHeaderModel;
import com.whoop.design.models.items.searchable.SearchableListModel;
import com.whoop.design.models.items.searchable.SearchableRowModel;
import com.whoop.design.models.items.searchable.SearchableSectionModel;
import com.whoop.design.models.items.secondaryactionbutton.SecondaryActionButtonModel;
import com.whoop.design.models.items.shopmediacard.ShopMediaCardModel;
import com.whoop.design.models.items.targetrecommendation.TargetRecommendationWidgetModel;
import com.whoop.design.models.items.weightpicker.WeightPickerModel;
import com.whoop.design.models.items.whooprow.WhoopRowModel;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.models.tiles.OfferBannerModel;
import j93.InterfaceC21461d;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BI\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003\u0012(\u0010\f\u001a$\u0012\u0004\u0012\u00020\u0007\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\bj\u0002`\u000b0\u0003¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003¢\u0006\u0004\b\r\u0010\u0010J'\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R6\u0010\f\u001a$\u0012\u0004\u0012\u00020\u0007\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\bj\u0002`\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006\""}, m65681d2 = {"Lcom/whoop/design/json/DesignSystemTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/design/json/e;", "Lj93/d;", "typeToModelMap", "", "Lkotlin/Function2;", "Lcom/google/gson/JsonDeserializationContext;", "Lcom/google/gson/JsonObject;", "Lcom/whoop/design/json/DesignSystemModelFactory;", "typeToModelFactoryMap", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "featureModels", "(Ljava/util/Map;)V", "type", "content", "context", "b", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/DesignSystemModel;", "e", "()Ljava/lang/String;", "d", "()Lcom/google/gson/JsonObject;", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "c", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/DesignSystemModel;", "a", "Ljava/util/Map;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignSystemTypeAdapter implements JsonDeserializer<DesignSystemModel> {

    /* JADX INFO: renamed from: d */
    public static final int f25680d = 8;

    /* JADX INFO: renamed from: e */
    private static final Map<EnumC6731e, InterfaceC21461d> f25681e;

    /* JADX INFO: renamed from: f */
    private static final Map<String, InterfaceC4351m> f25682f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<EnumC6731e, InterfaceC21461d> typeToModelMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, InterfaceC4351m> typeToModelFactoryMap;

    static {
        EnumC6731e enumC6731e = EnumC6731e.ACHIEVEMENT_PROGRESS_CARD;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        int i13 = 0;
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k(enumC6731e, c22673i0.getOrCreateKotlinClass(AchievementProgressCardModel.class)), new C23465k(EnumC6731e.ACHIEVEMENT_PROGRESS_CARD_V2, c22673i0.getOrCreateKotlinClass(AchievementProgressCardModel.class)), new C23465k(EnumC6731e.ACTION_CARD, c22673i0.getOrCreateKotlinClass(ActionCardModel.class)), new C23465k(EnumC6731e.ACTIVITY, c22673i0.getOrCreateKotlinClass(ActivityModel.class)), new C23465k(EnumC6731e.ACTIVITY_TILE_SELECTION, c22673i0.getOrCreateKotlinClass(ActivityTileSelectionItemModel.class)), new C23465k(EnumC6731e.ACTIVITY_RECOMMENDATION_TILE, c22673i0.getOrCreateKotlinClass(ActivityRecommendationTileModel.class)), new C23465k(EnumC6731e.TALK_TEXT_WIDGET, c22673i0.getOrCreateKotlinClass(AiChatTalkTextModel.class)), new C23465k(EnumC6731e.TALK_TEXT_WIDGET_EMPTY_STATE, c22673i0.getOrCreateKotlinClass(AiChatTalkTextEmptyStateModel.class)), new C23465k(EnumC6731e.AI_ACTION_TILE, c22673i0.getOrCreateKotlinClass(AiActionTileModel.class)), new C23465k(EnumC6731e.AI_WEEKLY_PLAN_SUGGESTION, c22673i0.getOrCreateKotlinClass(AiWeeklyPlanSuggestionModel.class)), new C23465k(EnumC6731e.ANCHOR_SELECTOR, c22673i0.getOrCreateKotlinClass(AnchorSelectorModel.class)), new C23465k(EnumC6731e.ANIMATED_SEQUENCE, c22673i0.getOrCreateKotlinClass(AnimatedSequenceModel.class)), new C23465k(EnumC6731e.APPOINTMENT_CARD, c22673i0.getOrCreateKotlinClass(AppointmentCardModel.class)), new C23465k(EnumC6731e.ARCH_MINI_BEHAVIOR_DETAILS, c22673i0.getOrCreateKotlinClass(ArchMiniBehaviorDetailsModel.class)), new C23465k(EnumC6731e.ARCH_MINI_CALENDAR, c22673i0.getOrCreateKotlinClass(ArchMiniCalendarModel.class)), new C23465k(EnumC6731e.ARCH_MINI_FILTERED_LIST, c22673i0.getOrCreateKotlinClass(ArchMiniFilteredListModel.class)), new C23465k(EnumC6731e.PRICING_SELECTION_CARD, c22673i0.getOrCreateKotlinClass(PricingSelectionCardModel.class)), new C23465k(EnumC6731e.ARTICLE_TILE, c22673i0.getOrCreateKotlinClass(ArticleTileModel.class)), new C23465k(EnumC6731e.AVATAR_PILL, c22673i0.getOrCreateKotlinClass(AvatarPillModel.class)), new C23465k(EnumC6731e.ANNOTATED_TEXT, c22673i0.getOrCreateKotlinClass(AnnotatedTextModel.class)), new C23465k(EnumC6731e.BAR_GRAPH_CONTAINER, c22673i0.getOrCreateKotlinClass(BarGraphContainerModel.class)), new C23465k(EnumC6731e.BAR_GRAPH_CARD, c22673i0.getOrCreateKotlinClass(BarGraphContainerModel.class)), new C23465k(EnumC6731e.BEHAVIOR_DETAILS_TILE, c22673i0.getOrCreateKotlinClass(BehaviorDetailsTileModel.class)), new C23465k(EnumC6731e.BEHAVIORS_BOTTOM_SHEET, c22673i0.getOrCreateKotlinClass(CustomizeBottomSheetModel.class)), new C23465k(EnumC6731e.BEHAVIORS_CALENDAR, c22673i0.getOrCreateKotlinClass(BehaviorsCalendarModel.class)), new C23465k(EnumC6731e.BINARY_FEEDBACK, c22673i0.getOrCreateKotlinClass(BinaryFeedbackModel.class)), new C23465k(EnumC6731e.BIOMARKER_CARD, c22673i0.getOrCreateKotlinClass(BiomarkerCardModel.class)), new C23465k(EnumC6731e.BIOMARKER_PIE_CHART_SECTION, c22673i0.getOrCreateKotlinClass(BiomarkerPieChartSectionModel.class)), new C23465k(EnumC6731e.BIOMARKER_LIST, c22673i0.getOrCreateKotlinClass(WaitlistBiomarkerListPreviewModel.class)), new C23465k(EnumC6731e.BIOMARKER, c22673i0.getOrCreateKotlinClass(BiomarkerModel.class)), new C23465k(EnumC6731e.BUTTON_CARD, c22673i0.getOrCreateKotlinClass(ButtonCardModel.class)), new C23465k(EnumC6731e.BUTTON_CELL, c22673i0.getOrCreateKotlinClass(ButtonCellModel.class)), new C23465k(EnumC6731e.CARD_BUTTON, c22673i0.getOrCreateKotlinClass(CardButtonModel.class)), new C23465k(EnumC6731e.CARD_ICON_BUTTON, c22673i0.getOrCreateKotlinClass(CardIconButtonModel.class)), new C23465k(EnumC6731e.CARD_CONTAINER, c22673i0.getOrCreateKotlinClass(CardContainerModel.class)), new C23465k(EnumC6731e.CELEBRATION_OVERLAY, c22673i0.getOrCreateKotlinClass(CelebrationOverlayModel.class)), new C23465k(EnumC6731e.CELEBRATION_MEDIA, c22673i0.getOrCreateKotlinClass(CelebrationMediaModel.class)), new C23465k(EnumC6731e.CELEBRATION_MEDIA_WITH_CAPTION, c22673i0.getOrCreateKotlinClass(CelebrationMediaWithCaptionModel.class)), new C23465k(EnumC6731e.CHALLENGE_PROGRESS_GAUGE, c22673i0.getOrCreateKotlinClass(ChallengeProgressGaugeModel.class)), new C23465k(EnumC6731e.CHAT_ENTRY_POINT, c22673i0.getOrCreateKotlinClass(AiChatEntryModel.class)), new C23465k(EnumC6731e.CHECKBOX, c22673i0.getOrCreateKotlinClass(CheckboxModel.class)), new C23465k(EnumC6731e.CIRCULAR_PROGRESS_INDICATOR, c22673i0.getOrCreateKotlinClass(CircularProgressIndicatorModel.class)), new C23465k(EnumC6731e.CLINICAL_REPORT_CARD, c22673i0.getOrCreateKotlinClass(ClinicalReportCardModel.class)), new C23465k(EnumC6731e.COLUMN, c22673i0.getOrCreateKotlinClass(ColumnModel.class)), new C23465k(EnumC6731e.COMMUNITY_FOLLOWER, c22673i0.getOrCreateKotlinClass(CommunityFollowerModel.class)), new C23465k(EnumC6731e.COMMUNITY_FOLLOWER_CONTAINER, c22673i0.getOrCreateKotlinClass(ArchMiniCommunityFollowerModel.class)), new C23465k(EnumC6731e.COMMUNITY_FOLLOWER_LOOKUP, c22673i0.getOrCreateKotlinClass(ArchMiniCommunityFollowerLookupModel.class)), new C23465k(EnumC6731e.COMMUNITY_TEAM_TILE, c22673i0.getOrCreateKotlinClass(CommunityTeamTileModel.class)), new C23465k(EnumC6731e.COMPACT_TREND, c22673i0.getOrCreateKotlinClass(CompactTrendModel.class)), new C23465k(EnumC6731e.COMPACT_BUTTON_CARD, c22673i0.getOrCreateKotlinClass(CompactButtonCardModel.class)), new C23465k(EnumC6731e.CONTEXT_CARD, c22673i0.getOrCreateKotlinClass(ContextCardModel.class)), new C23465k(EnumC6731e.CONTEXT_HUB_HEADER, c22673i0.getOrCreateKotlinClass(ContextHubHeaderModel.class)), new C23465k(EnumC6731e.COMPARISON_BARS, c22673i0.getOrCreateKotlinClass(ComparisonBarsGraphModel.class)), new C23465k(EnumC6731e.CONTENT_BLOCK_CARD, c22673i0.getOrCreateKotlinClass(ContentBlockCardModel.class)), new C23465k(EnumC6731e.CONTENT_BLOCK_LIST_CARD, c22673i0.getOrCreateKotlinClass(ContentBlockListCardModel.class)), new C23465k(EnumC6731e.CONTRIBUTORS_TILE, c22673i0.getOrCreateKotlinClass(ContributorTileModel.class)), new C23465k(EnumC6731e.COUNT_CARD, c22673i0.getOrCreateKotlinClass(BehaviorCountTileModel.class)), new C23465k(EnumC6731e.COUNTDOWN_TIMER, c22673i0.getOrCreateKotlinClass(TimerMetaDataModel.class)), new C23465k(EnumC6731e.CURRENT_PLAN_TILE, c22673i0.getOrCreateKotlinClass(CurrentPlanTileModel.class)), new C23465k(EnumC6731e.CTA_TILE, c22673i0.getOrCreateKotlinClass(CtaTileModel.class)), new C23465k(EnumC6731e.DATA_HIGHLIGHT, c22673i0.getOrCreateKotlinClass(DataHighlightModel.class)), new C23465k(EnumC6731e.DATE_SELECTOR, c22673i0.getOrCreateKotlinClass(DateSelectorModel.class)), new C23465k(EnumC6731e.DATE_PILL, c22673i0.getOrCreateKotlinClass(DatePillModel.class)), new C23465k(EnumC6731e.DATE_PICKER, c22673i0.getOrCreateKotlinClass(DatePickerModel.class)), new C23465k(EnumC6731e.DESIGN_ITEM_GRID, c22673i0.getOrCreateKotlinClass(DesignItemGridModel.class)), new C23465k(EnumC6731e.DETAILS_METRIC_TILES, c22673i0.getOrCreateKotlinClass(DetailsMetricTileModel.class)), new C23465k(EnumC6731e.DIVIDER, c22673i0.getOrCreateKotlinClass(DividerModel.class)), new C23465k(EnumC6731e.DYNAMIC_INFORMATIONAL_IMAGE_CARD, c22673i0.getOrCreateKotlinClass(DynamicInformationalImageCardModel.class)), new C23465k(EnumC6731e.EMOJI, c22673i0.getOrCreateKotlinClass(EmojiModel.class)), new C23465k(EnumC6731e.EMPTY_TILE, c22673i0.getOrCreateKotlinClass(EmptyTileModel.class)), new C23465k(EnumC6731e.ENDPOINT_BUTTON, c22673i0.getOrCreateKotlinClass(EndpointButtonModel.class)), new C23465k(EnumC6731e.ENTRY_POINT_TILE, c22673i0.getOrCreateKotlinClass(EntryPointModel.class)), new C23465k(EnumC6731e.EXERCISE_BREAKDOWN, c22673i0.getOrCreateKotlinClass(ExerciseBreakdownModel.class)), new C23465k(EnumC6731e.EXERCISE_RECORD_HEADER, c22673i0.getOrCreateKotlinClass(ExerciseRecordHeaderModel.class)), new C23465k(EnumC6731e.EXPANDABLE_CARD, c22673i0.getOrCreateKotlinClass(ExpandableCardModel.class)), new C23465k(EnumC6731e.EXPANDABLE_CONTENT, c22673i0.getOrCreateKotlinClass(ExpandableContentModel.class)), new C23465k(EnumC6731e.EXPANDABLE_LIST, c22673i0.getOrCreateKotlinClass(ExpandableListModel.class)), new C23465k(EnumC6731e.EXPANDABLE_STATISTIC_LIST, c22673i0.getOrCreateKotlinClass(ExpandableStatisticListModel.class)), new C23465k(EnumC6731e.EXPLAINER_GAUGE, c22673i0.getOrCreateKotlinClass(ExplainerGaugeModel.class)), new C23465k(EnumC6731e.EMPTY_STATE_CARD, c22673i0.getOrCreateKotlinClass(IntegrationUpsellModel.class)), new C23465k(EnumC6731e.FAB_MENU, c22673i0.getOrCreateKotlinClass(FabMenuModel.class)), new C23465k(EnumC6731e.FERTILITY_CARD, c22673i0.getOrCreateKotlinClass(FertilityCardModel.class)), new C23465k(EnumC6731e.FERTILITY_STATUS_ITEM, c22673i0.getOrCreateKotlinClass(FertilityStatusItemModel.class)), new C23465k(EnumC6731e.FAQ_WIDGET, c22673i0.getOrCreateKotlinClass(FaqListModel.class)), new C23465k(EnumC6731e.FEATURES_LIST, c22673i0.getOrCreateKotlinClass(FeatureListModel.class)), new C23465k(EnumC6731e.FILE_VIEWER, c22673i0.getOrCreateKotlinClass(FileViewerModel.class)), new C23465k(EnumC6731e.FLOW_ROW, c22673i0.getOrCreateKotlinClass(FlowRowModel.class)), new C23465k(EnumC6731e.FOLLOWER_REQUEST, c22673i0.getOrCreateKotlinClass(FollowerRequestModel.class)), new C23465k(EnumC6731e.GLASS_TILE, c22673i0.getOrCreateKotlinClass(GlassTileModel.class)), new C23465k(EnumC6731e.GOAL_GRAPHING_CARD, c22673i0.getOrCreateKotlinClass(GraphingCardModel.class)), new C23465k(EnumC6731e.GOAL_PROGRESS_CARD, c22673i0.getOrCreateKotlinClass(GoalProgressCardModel.class)), new C23465k(EnumC6731e.GOAL_SETTINGS_TILE, c22673i0.getOrCreateKotlinClass(GoalSettingsTileModel.class)), new C23465k(EnumC6731e.GOAL_TILE, c22673i0.getOrCreateKotlinClass(GoalTileModel.class)), new C23465k(EnumC6731e.GRAPH, c22673i0.getOrCreateKotlinClass(GraphModel.class)), new C23465k(EnumC6731e.GROUPED_ITEMS_PANEL, c22673i0.getOrCreateKotlinClass(GroupedItemsPanelModel.class)), new C23465k(EnumC6731e.GRAPHING_CARD, c22673i0.getOrCreateKotlinClass(GraphingCardModel.class)), new C23465k(EnumC6731e.GRAPHING_CARD_CTA, c22673i0.getOrCreateKotlinClass(GraphCardCtaModel.class)), new C23465k(EnumC6731e.GRAPH_DESCRIPTION_CARD, c22673i0.getOrCreateKotlinClass(GraphDescriptionCardModel.class)), new C23465k(EnumC6731e.FEEDBACK_SURVEY, c22673i0.getOrCreateKotlinClass(FeedbackSurveyModel.class)), new C23465k(EnumC6731e.HEADER, c22673i0.getOrCreateKotlinClass(HeaderModel.class)), new C23465k(EnumC6731e.HEADER_ITEMS_CARD, c22673i0.getOrCreateKotlinClass(HeaderItemsCardModel.class)), new C23465k(EnumC6731e.COLLAPSABLE_HEADER, c22673i0.getOrCreateKotlinClass(CollapsableHeaderModel.class)), new C23465k(EnumC6731e.COLLAPSIBLE_ROW, c22673i0.getOrCreateKotlinClass(CollapsibleRowModel.class)), new C23465k(EnumC6731e.HEALTH_MONITOR, c22673i0.getOrCreateKotlinClass(HealthMonitorModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HEALTH_MONITOR_CARD, AbstractC22671h0.m65688a(HealthMonitorCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HEART_RATE_ZONES, AbstractC22671h0.m65688a(HeartRateZone.class)), AbstractC37056f.m118979e0(EnumC6731e.HEIGHT_PICKER, AbstractC22671h0.m65688a(HeightPickerModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HEIGHT_WEIGHT, AbstractC22671h0.m65688a(HeightWeightModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HERO_IMAGE_CARD, AbstractC22671h0.m65688a(HeroImageCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HERO_WITH_FOOTER_CTA, AbstractC22671h0.m65688a(HeroWithFooterCtaModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HISTORY_LIST_ITEM, AbstractC22671h0.m65688a(HistoryListItemModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HR_ZONES_ROW, AbstractC22671h0.m65688a(HrZonesRowModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HORIZONTAL_DIVIDED_LIST, AbstractC22671h0.m65688a(HorizontalDividedListModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HORIZONTAL_METRIC_TILE, AbstractC22671h0.m65688a(HorizontalMetricTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HORIZONTAL_SCROLL_CONTAINER, AbstractC22671h0.m65688a(HorizontalScrollContainerModel.class)), AbstractC37056f.m118979e0(EnumC6731e.HORIZONTAL_STAT, AbstractC22671h0.m65688a(HorizontalStatModel.class)), AbstractC37056f.m118979e0(EnumC6731e.ICON_MARKDOWN_CALLOUT, AbstractC22671h0.m65688a(IconMarkdownCalloutModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMAGE_AND_BUTTON_CARD, AbstractC22671h0.m65688a(ImageAndButtonCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMAGE_AND_ICON, AbstractC22671h0.m65688a(ImageAndIconModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMAGE_CARD_PICKER, AbstractC22671h0.m65688a(ImageCardPickerModel.class)), AbstractC37056f.m118979e0(EnumC6731e.LABELED_PROGRESS_BAR, AbstractC22671h0.m65688a(LabeledProgressBarModel.class)), AbstractC37056f.m118979e0(EnumC6731e.LOGO_NAV, AbstractC22671h0.m65688a(LogoNavModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMAGE_URL, AbstractC22671h0.m65688a(ImageUrlModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_BAR, AbstractC22671h0.m65688a(ImpactBarSegmentModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_BAR_GRAPH_LABELED, AbstractC22671h0.m65688a(HorizontalImpactBarLabeledModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_BAR_SEGMENT_TYPICAL_MARKER, AbstractC22671h0.m65688a(ImpactBarSegmentTypicalMarker.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_CALLOUT, AbstractC22671h0.m65688a(ImpactCalloutModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_CARD_MODEL, AbstractC22671h0.m65688a(ImpactCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_HEADER_MODEL, AbstractC22671h0.m65688a(ImpactHeaderModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_MAGNITUDE_QUESTIONS, AbstractC22671h0.m65688a(ImpactMagnitudeQuestionsModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_MAGNITUDE_TILE, AbstractC22671h0.m65688a(ImpactMagnitudeTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_MODEL, AbstractC22671h0.m65688a(ImpactModel.class)), AbstractC37056f.m118979e0(EnumC6731e.IMPACT_TILE, AbstractC22671h0.m65688a(ImpactTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.INFO_CALLOUT_TILE, AbstractC22671h0.m65688a(InfoCalloutTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.INFO_ROW_LIST, AbstractC22671h0.m65688a(InfoRowListModel.class)), AbstractC37056f.m118979e0(EnumC6731e.INSIGHTS_ITEM, AbstractC22671h0.m65688a(InsightsItemModel.class)), AbstractC37056f.m118979e0(EnumC6731e.INSIGHTS_ITEM_LIST, AbstractC22671h0.m65688a(InsightsItemListModel.class)), AbstractC37056f.m118979e0(EnumC6731e.INSUFFICIENT_ANSWER_COUNT, AbstractC22671h0.m65688a(InsufficientAnswerCount.class)), AbstractC37056f.m118979e0(EnumC6731e.INSUFFICIENT_IMPACT_TILE, AbstractC22671h0.m65688a(InsufficientImpactTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.INTRADAY_ENTRYPOINT, AbstractC22671h0.m65688a(JournalEntrypointModel.class)), AbstractC37056f.m118979e0(EnumC6731e.ITEMS_CARD, AbstractC22671h0.m65688a(ItemsCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.JOURNAL_ENTRY_WIDGET, AbstractC22671h0.m65688a(JournalEntryWidgetModel.class)), AbstractC37056f.m118979e0(EnumC6731e.JOURNAL_QUESTION_NUMERIC_INPUT, AbstractC22671h0.m65688a(JournalQuestionNumericInputModel.class)), AbstractC37056f.m118979e0(EnumC6731e.JOURNAL_QUESTION_SLIDER, AbstractC22671h0.m65688a(JournalQuestionSliderModel.class)), AbstractC37056f.m118979e0(EnumC6731e.JOURNAL_QUESTION_STEPPER, AbstractC22671h0.m65688a(JournalQuestionStepperModel.class)), AbstractC37056f.m118979e0(EnumC6731e.JOURNAL_QUESTION_TIME_INPUT, AbstractC22671h0.m65688a(JournalQuestionTimeInputModel.class)), AbstractC37056f.m118979e0(EnumC6731e.JOURNAL_QUESTION_TIME_SLIDER, AbstractC22671h0.m65688a(JournalQuestionTimeSliderModel.class)), AbstractC37056f.m118979e0(EnumC6731e.JOURNAL_QUESTION_YES_NO, AbstractC22671h0.m65688a(JournalQuestionYesNoModel.class)), AbstractC37056f.m118979e0(EnumC6731e.KEY_INFO_TILE, AbstractC22671h0.m65688a(KeyInfoTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.KEY_METRIC_CAROUSEL, AbstractC22671h0.m65688a(KeyMetricCarouselModel.class)), AbstractC37056f.m118979e0(EnumC6731e.KEY_METRIC_TILE, AbstractC22671h0.m65688a(KeyMetricTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.KEY_STATISTIC, AbstractC22671h0.m65688a(KeyStatisticModel.class)), AbstractC37056f.m118979e0(EnumC6731e.OPTION_COMMIT_PANEL, AbstractC22671h0.m65688a(OptionCommitPanelModel.class)), AbstractC37056f.m118979e0(EnumC6731e.OPTION_INFO, AbstractC22671h0.m65688a(OptionInfoModel.class)), AbstractC37056f.m118979e0(EnumC6731e.OFFER_BANNER, AbstractC22671h0.m65688a(OfferBannerModel.class)), AbstractC37056f.m118979e0(EnumC6731e.LIST_ITEM_TILE, AbstractC22671h0.m65688a(ListItemTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.LEFT_ALIGNED_IMAGE_CARD, AbstractC22671h0.m65688a(LeftAlignedImageCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.LOCKED_IMPACT_TILE, AbstractC22671h0.m65688a(LockedImpactOnRecoveryModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MAP, AbstractC22671h0.m65688a(MapModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MARKDOWN_TEXT, AbstractC22671h0.m65688a(MarkdownTextModel.class)), AbstractC37056f.m118979e0(EnumC6731e.COMPARISON_TABLE, AbstractC22671h0.m65688a(ComparisonTableModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MEMBERSHIP_COMPARISON_TABLE, AbstractC22671h0.m65688a(MembershipComparisonTableModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MENSTRUAL_CYCLE_INSIGHTS_CARD, AbstractC22671h0.m65688a(MenstrualCycleInsightsCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MENU_ITEM, AbstractC22671h0.m65688a(MenuItemModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MENU_ITEM_LIST, AbstractC22671h0.m65688a(MenuItemModel.class)), AbstractC37056f.m118979e0(EnumC6731e.METRIC_EDUCATION, AbstractC22671h0.m65688a(MetricEducationModel.class)), AbstractC37056f.m118979e0(EnumC6731e.METRIC_STATUS_TILE, AbstractC22671h0.m65688a(MetricStatusTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MILESTONE_CARD, AbstractC22671h0.m65688a(MilestoneCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MILESTONE_PILL_WRAPPER, AbstractC22671h0.m65688a(MilestonePillWrapperModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MILESTONE_PROGRESS_CARD, AbstractC22671h0.m65688a(MilestoneProgressCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MILESTONE_PROGRESS_CARD_V2, AbstractC22671h0.m65688a(MilestoneProgressCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MINI_CALLOUT, AbstractC22671h0.m65688a(MiniCalloutModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MINI_MONITOR, AbstractC22671h0.m65688a(MiniMonitorCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MULTI_BUTTON_CONTAINER, AbstractC22671h0.m65688a(MultipleButtonContainerModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MULTI_SELECT, AbstractC22671h0.m65688a(MultiSelectModel.class)), AbstractC37056f.m118979e0(EnumC6731e.MULTI_WHEEL_PICKER, AbstractC22671h0.m65688a(MultiWheelPickerModel.class)), AbstractC37056f.m118979e0(EnumC6731e.NESTED_BFF, AbstractC22671h0.m65688a(NestedBFFItemModel.class)), AbstractC37056f.m118979e0(EnumC6731e.NUMBERED_LIST, AbstractC22671h0.m65688a(NumberedListModel.class)), AbstractC37056f.m118979e0(EnumC6731e.NUMERIC_INPUT_SLIDER, AbstractC22671h0.m65688a(NumericInputSliderModel.class)), AbstractC37056f.m118979e0(EnumC6731e.OVERVIEW_ALERT, AbstractC22671h0.m65688a(AlertTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.OVERVIEW_GAUGE, AbstractC22671h0.m65688a(OverviewGaugeModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PACE_OF_AGING_METER, AbstractC22671h0.m65688a(PaceOfAgingMeterModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PAGINATION_CONTROL, AbstractC22671h0.m65688a(PaginationControlModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PIE_CHART, AbstractC22671h0.m65688a(PieChartModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PERKS_LIST, AbstractC22671h0.m65688a(PerksListModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PLAN_TILE, AbstractC22671h0.m65688a(PlanTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PROFILE_INFO_TILE, AbstractC22671h0.m65688a(ProfileInfoTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PROFILE_INFO_TILE_LIST, AbstractC22671h0.m65688a(ProfileInfoTileListModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PROGRESS_BAR_BREAKDOWN, AbstractC22671h0.m65688a(ProgressBreakdownModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PROGRESS_BUTTON, AbstractC22671h0.m65688a(ProgressButtonModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PROGRESS_METER, AbstractC22671h0.m65688a(ProgressMeterModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PROGRESS_METRIC_ROW, AbstractC22671h0.m65688a(ProgressMetricRowModel.class)), AbstractC37056f.m118979e0(EnumC6731e.RATING_PICKER, AbstractC22671h0.m65688a(RatingPickerModel.class)), AbstractC37056f.m118979e0(EnumC6731e.RECOMMENDATION_TILE, AbstractC22671h0.m65688a(RecommendationTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.RECOMMENDATION_TILE_BUTTON, AbstractC22671h0.m65688a(RecommendationTileButtonModel.class)), AbstractC37056f.m118979e0(EnumC6731e.RECOMMENDATION_TILE_GROUP, AbstractC22671h0.m65688a(RecommendationTileGroupModel.class)), AbstractC37056f.m118979e0(EnumC6731e.RECOMMENDATION_TILE_HEADER, AbstractC22671h0.m65688a(RecommendationTileHeaderModel.class)), AbstractC37056f.m118979e0(EnumC6731e.RECOVERY_GAUGE, AbstractC22671h0.m65688a(RecoveryGaugeModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SCORE_GAUGE, AbstractC22671h0.m65688a(ScoreGaugeModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SEARCH_ARCH_MINI, AbstractC22671h0.m65688a(ArchMiniSearchModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SEARCH_BAR, AbstractC22671h0.m65688a(SearchBarModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SEARCHABLE_ROW, AbstractC22671h0.m65688a(SearchableRowModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SEARCHABLE_LIST, AbstractC22671h0.m65688a(SearchableListModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SEARCHABLE_SECTION, AbstractC22671h0.m65688a(SearchableSectionModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SECONDARY_ACTION_BUTTON, AbstractC22671h0.m65688a(SecondaryActionButtonModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SECONDARY_BUTTON, AbstractC22671h0.m65688a(SecondaryButtonModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SEGMENTED_CONTENT_TILE, AbstractC22671h0.m65688a(SegmentedContentModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SECTION, AbstractC22671h0.m65688a(SectionModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SELECTABLE_CELL, AbstractC22671h0.m65688a(SelectableCellModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SELECTABLE_CELL_LIST, AbstractC22671h0.m65688a(SelectableCellListModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SELECTABLE_CHIP, AbstractC22671h0.m65688a(SelectableChipModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SELECTION_WIDGET, AbstractC22671h0.m65688a(SelectionWidgetModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SHOP_MEDIA_CARD, AbstractC22671h0.m65688a(ShopMediaCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SINGLE_SELECT, AbstractC22671h0.m65688a(SingleSelectModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SLEEP_PLANNER_ALARM_CARD, AbstractC22671h0.m65688a(SleepPlannerAlarmCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SLEEP_PLANNER_CARD, AbstractC22671h0.m65688a(SleepPlannerCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SPECIFICATION_TABLE, AbstractC22671h0.m65688a(SpecificationTableModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SPLIT_COLUMN, AbstractC22671h0.m65688a(SplitColumnModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SPLIT_CONTAINER, AbstractC22671h0.m65688a(SplitContainerCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.START_TURN_BUTTON, AbstractC22671h0.m65688a(StartTurnButtonModel.class)), AbstractC37056f.m118979e0(EnumC6731e.STATUS_TILE, AbstractC22671h0.m65688a(StatusTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.STEPPER, AbstractC22671h0.m65688a(StepperComponentModel.class)), AbstractC37056f.m118979e0(EnumC6731e.STRAIN_GAUGE, AbstractC22671h0.m65688a(StrainGaugeModel.class)), AbstractC37056f.m118979e0(EnumC6731e.STRESS_GRAPHING_CARD, AbstractC22671h0.m65688a(StressGraphingCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.ADVANCED_LABS_SUBSCRIPTION_CARD, AbstractC22671h0.m65688a(AdvancedLabsSubscriptionCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SUGGESTION_BUBBLE, AbstractC22671h0.m65688a(SuggestionBubbleModel.class)), AbstractC37056f.m118979e0(EnumC6731e.SUPPORT_ACTION_TILE, AbstractC22671h0.m65688a(SupportActionTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TAG, AbstractC22671h0.m65688a(TagModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TAG_SELECTOR, AbstractC22671h0.m65688a(TagSelectorModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TESTIMONIALS, AbstractC22671h0.m65688a(TestimonialsModel.class)), AbstractC37056f.m118979e0(EnumC6731e.PRODUCT_TEST_CARD, AbstractC22671h0.m65688a(ProductTestCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TEXT_AND_IMAGE, AbstractC22671h0.m65688a(TextAndImageCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TEXT_AREA, AbstractC22671h0.m65688a(TextAreaModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TEXT_INPUT, AbstractC22671h0.m65688a(TextInputModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TEXT_ONLY, AbstractC22671h0.m65688a(TextOnlyCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TEXT_WITH_ILLUSTRATION, AbstractC22671h0.m65688a(TextWithIllustrationCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TEXT_WITH_DESIGN_ITEM, AbstractC22671h0.m65688a(TextWithDesignItemCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TILE_CAROUSEL, AbstractC22671h0.m65688a(ArticleTileCarouselModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TILE_TAG, AbstractC22671h0.m65688a(TileTagModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TIMED_CONTENT, AbstractC22671h0.m65688a(TimedContentModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TITLE_WIDGET, AbstractC22671h0.m65688a(TitleTileModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TITLE_SUBTITLE, AbstractC22671h0.m65688a(TitleSubTitleModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TOGGLE, AbstractC22671h0.m65688a(ToggleDesignModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TOGGLE_CARD_BUTTON, AbstractC22671h0.m65688a(ToggleCardButtonModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TRACKED_BEHAVIOR, AbstractC22671h0.m65688a(TrackedBehaviorModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TARGET_RECOMMENDATION_WIDGET, AbstractC22671h0.m65688a(TargetRecommendationWidgetModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TRACKER_RECOMMENDATION_WIDGET, AbstractC22671h0.m65688a(SelectionWidgetModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TREND_GRAPH_LINE, AbstractC22671h0.m65688a(TrendGraphLineModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TREND_ICONS_LEGEND, AbstractC22671h0.m65688a(TrendIconsLegendModel.class)), AbstractC37056f.m118979e0(EnumC6731e.TRI_LABEL_SLIDER, AbstractC22671h0.m65688a(TriLabelSliderModel.class)), AbstractC37056f.m118979e0(EnumC6731e.UNLOCKED_IMPACT_TILE, AbstractC22671h0.m65688a(UnlockedImpactOnRecoveryModel.class)), AbstractC37056f.m118979e0(EnumC6731e.UNLOCK_TRENDS_CARD, AbstractC22671h0.m65688a(UnlockTrendsCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.UPSELL_CARD_CALLOUT, AbstractC22671h0.m65688a(UpsellCardCalloutModel.class)), AbstractC37056f.m118979e0(EnumC6731e.UPSELL_CARD_FEATURES, AbstractC22671h0.m65688a(UpsellCardFeaturesModel.class)), AbstractC37056f.m118979e0(EnumC6731e.UPSELL_CARD_SMALL, AbstractC22671h0.m65688a(UpsellCardSmallModel.class)), AbstractC37056f.m118979e0(EnumC6731e.VERTICAL_SPACER, AbstractC22671h0.m65688a(VerticalSpacerModel.class)), AbstractC37056f.m118979e0(EnumC6731e.VOW, AbstractC22671h0.m65688a(VowModel.class)), AbstractC37056f.m118979e0(EnumC6731e.VOW_CARD, AbstractC22671h0.m65688a(VowCardModel.class)), AbstractC37056f.m118979e0(EnumC6731e.VOW_CTA, AbstractC22671h0.m65688a(VowCtaModel.class)), AbstractC37056f.m118979e0(EnumC6731e.REWARD_ITEM, AbstractC22671h0.m65688a(RewardItemModel.class)), AbstractC37056f.m118979e0(EnumC6731e.REWARDS_SECTION, AbstractC22671h0.m65688a(RewardsSectionModel.class)), AbstractC37056f.m118979e0(EnumC6731e.ROW, AbstractC22671h0.m65688a(WhoopRowModel.class)), AbstractC37056f.m118979e0(EnumC6731e.WEIGHT_PICKER, AbstractC22671h0.m65688a(WeightPickerModel.class)), AbstractC37056f.m118979e0(EnumC6731e.WHOOP_AGE_AMOEBA, AbstractC22671h0.m65688a(WhoopAgeAmoeba.class)), AbstractC37056f.m118979e0(EnumC6731e.WHOOP_COACH_VOW, AbstractC22671h0.m65688a(WhoopCoachVowModel.class)), AbstractC37056f.m118979e0(EnumC6731e.ZONE_BAR, AbstractC22671h0.m65688a(ZoneBarModel.class)));
        f25681e = linkedHashMapM73993b0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapM73993b0.entrySet()) {
            linkedHashMap.put(((EnumC6731e) entry.getKey()).toString(), new C6735i(i13, entry));
        }
        f25682f = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DesignSystemTypeAdapter(Map<EnumC6731e, ? extends InterfaceC21461d> typeToModelMap, Map<String, ? extends InterfaceC4351m> typeToModelFactoryMap) {
        AbstractC22676k.m65750j(typeToModelMap, "typeToModelMap");
        AbstractC22676k.m65750j(typeToModelFactoryMap, "typeToModelFactoryMap");
        this.typeToModelMap = typeToModelMap;
        this.typeToModelFactoryMap = typeToModelFactoryMap;
    }

    /* JADX INFO: renamed from: b */
    private final DesignSystemModel m20363b(String type, JsonObject content, JsonDeserializationContext context) {
        Object next;
        DesignSystemModel designSystemModel;
        Iterator<T> it = this.typeToModelFactoryMap.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC39421y.m125921F((String) next, type, true));
        String str = (String) next;
        if (str == null) {
            return UnknownDesignModel.INSTANCE;
        }
        InterfaceC4351m interfaceC4351m = this.typeToModelFactoryMap.get(str);
        return (interfaceC4351m == null || (designSystemModel = (DesignSystemModel) interfaceC4351m.invoke(context, content)) == null) ? UnknownDesignModel.INSTANCE : designSystemModel;
    }

    /* JADX INFO: renamed from: d */
    private final JsonObject m20364d() {
        throw new JsonParseException("DesignSystemModel is missing content");
    }

    /* JADX INFO: renamed from: e */
    private final String m20365e() {
        throw new JsonParseException("DesignSystemModel is missing type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final DesignSystemModel m20366f(Map.Entry entry, JsonDeserializationContext context, JsonObject content) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(content, "content");
        Object objDeserialize = context.deserialize(content, AbstractC21598x.m60663S((InterfaceC21461d) entry.getValue()));
        AbstractC22676k.m65749i(objDeserialize, "deserialize(...)");
        return (DesignSystemModel) objDeserialize;
    }

    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DesignSystemModel deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        String strM20365e;
        JsonObject jsonObjectM20364d;
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(typeOfT, "typeOfT");
        AbstractC22676k.m65750j(context, "context");
        JsonObject asJsonObject = json.getAsJsonObject();
        JsonElement jsonElement = asJsonObject.get("type");
        if (jsonElement == null || (strM20365e = jsonElement.getAsString()) == null) {
            strM20365e = m20365e();
        }
        JsonElement jsonElement2 = asJsonObject.get("content");
        if (jsonElement2 == null || (jsonObjectM20364d = jsonElement2.getAsJsonObject()) == null) {
            jsonObjectM20364d = m20364d();
        }
        return m20363b(strM20365e, jsonObjectM20364d, context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DesignSystemTypeAdapter(Map<String, ? extends InterfaceC21461d> featureModels) {
        this(f25681e, AbstractC25247g0.m73995d0(f25682f, AbstractC6736j.m20392c(featureModels)));
        AbstractC22676k.m65750j(featureModels, "featureModels");
    }
}
