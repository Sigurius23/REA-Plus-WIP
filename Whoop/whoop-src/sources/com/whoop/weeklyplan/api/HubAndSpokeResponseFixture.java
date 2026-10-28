package com.whoop.weeklyplan.api;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BottomSheetInfoModel;
import com.whoop.design.models.items.ConfirmationModalModel;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.models.items.DayOptions;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.models.items.GoalSettingsTileStyle;
import com.whoop.design.models.items.GoalSettingsTileTagModel;
import com.whoop.design.models.items.GroupedTogglesModel;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.TogglesModel;
import com.whoop.design.models.items.Value;
import com.whoop.navigation.C9598e;
import com.whoop.weeklyplan.customizeplan.domain.api.AverageLine;
import com.whoop.weeklyplan.customizeplan.domain.api.BottomButton;
import com.whoop.weeklyplan.customizeplan.domain.api.DisplayRange;
import com.whoop.weeklyplan.customizeplan.domain.api.DisplayRangeLimits;
import com.whoop.weeklyplan.customizeplan.domain.api.ProgressionRange;
import com.whoop.weeklyplan.customizeplan.domain.api.ProgressionToolTip;
import com.whoop.weeklyplan.customizeplan.domain.api.Range;
import com.whoop.weeklyplan.customizeplan.domain.api.RangeWithTip;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverride;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.TipContent;
import com.whoop.weeklyplan.customizeplan.domain.api.ToggleContent;
import com.whoop.weeklyplan.customizeplan.domain.api.ToolTip;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import com.whoop.weeklyplan.hubandspoke.domain.api.ActivitiesSection;
import com.whoop.weeklyplan.hubandspoke.domain.api.Activity;
import com.whoop.weeklyplan.hubandspoke.domain.api.ActivityDetail;
import com.whoop.weeklyplan.hubandspoke.domain.api.AssociatedBehaviorsActivities;
import com.whoop.weeklyplan.hubandspoke.domain.api.Behavior;
import com.whoop.weeklyplan.hubandspoke.domain.api.BehaviorDetail;
import com.whoop.weeklyplan.hubandspoke.domain.api.BehaviorSection;
import com.whoop.weeklyplan.hubandspoke.domain.api.EmptyState;
import com.whoop.weeklyplan.hubandspoke.domain.api.Goal;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse;
import com.whoop.weeklyplan.hubandspoke.domain.api.InitialSelection;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetaData;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricDetail;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricScreen;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricSection;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricCardModel;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricPlanTileModel;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricTrendStyle;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricValue;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÆ\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fJ\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020\u0010H\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0007H\u0002J\u0018\u00104\u001a\u0002052\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0007H\u0002J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u001aH\u0002J\b\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020\u0018H\u0002J\b\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020\u001cH\u0002J\b\u0010A\u001a\u00020\u001cH\u0002J\b\u0010B\u001a\u00020\u001cH\u0002J\b\u0010C\u001a\u00020\u001cH\u0002J\b\u0010D\u001a\u00020\u001cH\u0002J\u0012\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020\u0007H\u0002J\b\u0010H\u001a\u00020\u001cH\u0002J\u0012\u0010I\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020\u0007H\u0002J\u0018\u0010J\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020L2\u0006\u00103\u001a\u00020\u0007H\u0002J\b\u0010M\u001a\u00020\u001fH\u0002J\b\u0010N\u001a\u00020\u001fH\u0002¨\u0006O"}, m65681d2 = {"Lcom/whoop/weeklyplan/api/HubAndSpokeResponseFixture;", "", "<init>", "()V", "create", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "planId", "", "currentPlanTitle", "headerDisplay", "headerImageUrl", "navigationTitle", "subtitle", "initialSelection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "metricSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;", "metricDetails", "", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;", "metricScreen", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "startPlanButtonText", "activitiesSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;", "behaviorSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;", "goalScreens", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "endPlanButtonText", "endPlanDialog", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;", "unsavedChangesDialog", "createGoalScreens", "createInitialSelection", "createGoal", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;", "createActivity", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;", "createBehaviorNotAvoid", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;", "createBehaviorAvoid", "createMetricSection", "createMetricDetails", "createMetricScreen", "createAssociatedBehaviorsActivities", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;", "createMetricPlanTile", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;", "id", "", "title", "createMetricCard", "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;", "createHorizontalStatModel", "Lcom/whoop/design/models/items/HorizontalStatModel;", "createBehaviorSection", "createBehaviorDetail", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;", "createActivitiesSection", "createActivityDetail", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivityDetail;", "createEmptyState", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/EmptyState;", "createSleepGoalScreen", "createStrainGoalScreen", "createWeightGoalScreen", "createSleepHoursGoalsScreen", "createActivitiesScreen", "getActivitiesBottomSheet", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "currentCategory", "createBehaviorsScreen", "getBehaviorsBottomSheet", "createHrZonesScreen", WeeklyPlanApiKt.GOAL, "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "createEndPlanDialog", "createUnsavedChangesDialog", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HubAndSpokeResponseFixture {
    public static final int $stable = 0;
    public static final HubAndSpokeResponseFixture INSTANCE = new HubAndSpokeResponseFixture();

    private HubAndSpokeResponseFixture() {
    }

    private final WeeklyPlanCustomizationScreenModel createActivitiesScreen() {
        TargetGoalType targetGoalType = TargetGoalType.ACTIVITIES;
        GoalSettingsTileStyle goalSettingsTileStyle = GoalSettingsTileStyle.STRAIN_ACTIVITY;
        DayOptions dayOptions = new DayOptions(AbstractC37056f.m118959K(new Value(1, "1 DAY", "AVOID 1 DAY"), new Value(2, "2 DAYS", "AVOID 2 DAYS"), new Value(3, "3 DAYS", "AVOID 3 DAYS"), new Value(4, "4 DAYS", "AVOID 4 DAYS"), new Value(5, "5 DAYS", "AVOID 5 DAYS"), new Value(6, "6 DAYS", "AVOID 6 DAYS"), new Value(7, "7 DAYS", "AVOID 7 DAYS")), "Days per week");
        Boolean bool = Boolean.FALSE;
        return new WeeklyPlanCustomizationScreenModel(targetGoalType, null, new ToggleContent("GENERIC ACTIVITY", AbstractC37056f.m118958J(new GoalSettingsTileModel("Meditation", null, "https://s3-us-west-2.amazonaws.com/icons.whoop.com/mobile/activities/meditation.png", null, null, null, null, bool, "activity_2", goalSettingsTileStyle, dayOptions)), "MOST RECENT ACTIVITIES", null, AbstractC37056f.m118958J(new GoalSettingsTileModel("Running", null, "https://s3-us-west-2.amazonaws.com/icons.whoop.com/mobile/activities/running.png", null, null, 1, null, bool, "activity_1", goalSettingsTileStyle, new DayOptions(AbstractC37056f.m118959K(new Value(1, "1 DAY", "AVOID 1 DAY"), new Value(2, "2 DAYS", "AVOID 2 DAYS"), new Value(3, "3 DAYS", "AVOID 3 DAYS"), new Value(4, "4 DAYS", "AVOID 4 DAYS"), new Value(5, "5 DAYS", "AVOID 5 DAYS"), new Value(6, "6 DAYS", "AVOID 6 DAYS"), new Value(7, "7 DAYS", "AVOID 7 DAYS")), "Days per week"))), new BottomButton("ADD", "ADD ACTIVITY", new C9598e(null, null, null, 7, null)), getActivitiesBottomSheet$default(this, null, 1, null), null, 128, null), "ACTIVITY GOAL", null, "Set your weekly Activity goal", "Add activities to your Plan that will help support your set Metric goals.", null, "SAVE ACTIVITIES", null, null, new TipContent("Tips to set Activity Goals", "> * Back Squat because that builds back muscles\n> * Cry a lot and into the ground so the plants get watered\n> * Eat lot of donuts to support the local economy\n"));
    }

    private final ActivitiesSection createActivitiesSection() {
        return new ActivitiesSection("Activities", createEmptyState(), AbstractC37056f.m118958J(createActivityDetail()));
    }

    private final Activity createActivity() {
        return new Activity("activity_1", 5);
    }

    private final ActivityDetail createActivityDetail() {
        return new ActivityDetail("activity_1", "Singing", "Activity Description", "http://image.url");
    }

    private final AssociatedBehaviorsActivities createAssociatedBehaviorsActivities() {
        return new AssociatedBehaviorsActivities(AbstractC37056f.m118958J(createGoal()), AbstractC37056f.m118958J(createActivity()), AbstractC37056f.m118959K(createBehaviorAvoid(), createBehaviorNotAvoid()));
    }

    private final Behavior createBehaviorAvoid() {
        return new Behavior(102, 7, true);
    }

    private final BehaviorDetail createBehaviorDetail() {
        return new BehaviorDetail(101, "Thinking about life", "Avoid Behavior", "Behavior Description");
    }

    private final Behavior createBehaviorNotAvoid() {
        return new Behavior(101, 7, false);
    }

    private final BehaviorSection createBehaviorSection() {
        return new BehaviorSection("Behaviors", createEmptyState(), AbstractC37056f.m118958J(createBehaviorDetail()));
    }

    private final WeeklyPlanCustomizationScreenModel createBehaviorsScreen() {
        TargetGoalType targetGoalType = TargetGoalType.BEHAVIORS;
        GoalSettingsTileStyle goalSettingsTileStyle = GoalSettingsTileStyle.SLEEP_ACTIVITY;
        return new WeeklyPlanCustomizationScreenModel(targetGoalType, null, new ToggleContent("GENERIC BEHAVIOR", AbstractC37056f.m118958J(new GoalSettingsTileModel("Alcohol", "Consumed alcohol?", null, null, null, null, "AVOID ALCOHOL", Boolean.TRUE, "102", goalSettingsTileStyle, new DayOptions(AbstractC37056f.m118959K(new Value(1, "1 DAY", "AVOID 1 DAY"), new Value(2, "2 DAYS", "AVOID 2 DAYS"), new Value(3, "3 DAYS", "AVOID 3 DAYS"), new Value(4, "4 DAYS", "AVOID 4 DAYS"), new Value(5, "5 DAYS", "AVOID 5 DAYS"), new Value(6, "6 DAYS", "AVOID 6 DAYS"), new Value(7, "7 DAYS", "AVOID 7 DAYS")), "Days per week"))), "MOST RECENT BEHAVIORS", null, AbstractC37056f.m118958J(new GoalSettingsTileModel("Protein", "Consumed protein?", null, null, null, null, "AVOID PROTEIN", Boolean.FALSE, "101", goalSettingsTileStyle, new DayOptions(AbstractC37056f.m118959K(new Value(1, "1 DAY", "1 DAY"), new Value(2, "2 DAYS", "2 DAYS"), new Value(3, "3 DAYS", "3 DAYS"), new Value(4, "4 DAYS", "4 DAYS"), new Value(5, "5 DAYS", "5 DAYS"), new Value(6, "6 DAYS", "6 DAYS"), new Value(7, "7 DAYS", "7 DAYS")), "Days per week"))), new BottomButton("ADD", "ADD BEHAVIORS", new C9598e(null, null, null, 7, null)), getBehaviorsBottomSheet$default(this, null, 1, null), null, 128, null), "BEHAVIOR GOAL", null, "Set your weekly Behavior goal", "Recommended behaviors are based on your chosen Metrics and support hitting your weekly goal.", "New behaviors will also be added to your Journal for daily tracking.", "SAVE BEHAVIORS", null, null, null);
    }

    private final EmptyState createEmptyState() {
        return new EmptyState("Empty State Title", "Button Text");
    }

    private final SmartAlarmOverride createEndPlanDialog() {
        return new SmartAlarmOverride("END PLAN", "Ending your current plan will hide weekly goal tracking. You can join another plan at anytime.", "END PLAN", "CANCEL");
    }

    private final Goal createGoal() {
        return new Goal(1, 100.0d, "step");
    }

    private final List<WeeklyPlanCustomizationScreenModel> createGoalScreens() {
        return AbstractC37056f.m118959K(createSleepGoalScreen(), createActivitiesScreen(), createBehaviorsScreen(), createStrainGoalScreen(), createWeightGoalScreen(), createSleepHoursGoalsScreen(), createHrZonesScreen(TargetGoalType.HR_ZONES_ONE_TO_THREE, "Set your weekly HR Zones 1-3 target for the upcoming week"), createHrZonesScreen(TargetGoalType.HR_ZONES_FOUR_TO_FIVE, "Set your weekly HR Zones 4-5 target for the upcoming week"));
    }

    private final HorizontalStatModel createHorizontalStatModel() {
        return new HorizontalStatModel("50%", "Average", null, null, null, "PENCIL");
    }

    private final WeeklyPlanCustomizationScreenModel createHrZonesScreen(TargetGoalType goal, String title) {
        return new WeeklyPlanCustomizationScreenModel(goal, new SliderContent(new Range(0.0d, null, 100.0d, null), 0.1d, new Range(0.0d, null, 100.0d, null), 0.5d, "YOUR GOAL", new DisplayRange(new DisplayRangeLimits("50", "75"), new Range(0.5d, null, 0.75d, null), "30 DAY AVERAGE", null), AbstractC37056f.m118958J(new RangeWithTip(new Range(0.0d, null, 100.0d, null), new ToolTip("9.05", "Estimated Time in Bed to hit your Sleep Performance goal.", Double.valueOf(3.3115759290036846E7d)), null)), null, new AverageLine("0:5", "min", null), null, null), null, "SET YOUR TARGET", null, title, null, "", "SAVE TARGET", null, null, null);
    }

    private final InitialSelection createInitialSelection() {
        return new InitialSelection(AbstractC37056f.m118958J(createGoal()), AbstractC37056f.m118958J(createActivity()), AbstractC37056f.m118959K(createBehaviorAvoid(), createBehaviorNotAvoid()));
    }

    private final MetricCardModel createMetricCard(int id4, String title) {
        return new MetricCardModel(id4, title, "ACTIVITY", "CROSS", AbstractC37056f.m118959K(MetricTrendStyle.NEGATIVE_TREND_TARGET, MetricTrendStyle.POSITIVE_TREND_TARGET, MetricTrendStyle.NEUTRAL_TREND_TARGET, MetricTrendStyle.NO_TREND_TARGET), createHorizontalStatModel(), createHorizontalStatModel(), "We recommend progressively improving by 5% each week until your 30 Day average is 75% or more.");
    }

    private final List<MetricDetail> createMetricDetails() {
        return AbstractC37056f.m118959K(new MetricDetail(1, TargetGoalType.STRAIN, createMetricCard(1, "Lunch Consistency"), createMetricPlanTile(1, "Lunch Consistency"), createAssociatedBehaviorsActivities()), new MetricDetail(2, TargetGoalType.SLEEP_PERFORMANCE, createMetricCard(2, "Talk to ChatGPT Performance"), createMetricPlanTile(2, "Talk to ChatGPT Performance"), createAssociatedBehaviorsActivities()), new MetricDetail(3, TargetGoalType.STEPS, createMetricCard(3, "Yeehaw Heart Rate"), createMetricPlanTile(3, "Yeehaw Heart Rate"), createAssociatedBehaviorsActivities()), new MetricDetail(4, TargetGoalType.WEIGHT, createMetricCard(4, "Meal Prep Strain"), createMetricPlanTile(4, "Meal Prep Strain"), createAssociatedBehaviorsActivities()), new MetricDetail(5, TargetGoalType.SLEEP_HOURS, createMetricCard(4, "Sleep hours"), createMetricPlanTile(4, "Sleep hours"), createAssociatedBehaviorsActivities()), new MetricDetail(6, TargetGoalType.HR_ZONES_ONE_TO_THREE, createMetricCard(5, "HR Zones One To Three"), createMetricPlanTile(5, "HR Zones One To Three"), createAssociatedBehaviorsActivities()), new MetricDetail(7, TargetGoalType.HR_ZONES_FOUR_TO_FIVE, createMetricCard(6, "HR Zones Four To Five"), createMetricPlanTile(6, "HR Zones Four To Five"), createAssociatedBehaviorsActivities()));
    }

    private final MetricPlanTileModel createMetricPlanTile(int id4, String title) {
        MetricTrendStyle metricTrendStyle = MetricTrendStyle.NEGATIVE_TREND_TARGET;
        return new MetricPlanTileModel(id4, "ACTIVITY", title, "INFORMATION", "Metric Description", AbstractC37056f.m118959K(metricTrendStyle, MetricTrendStyle.POSITIVE_TREND_TARGET, MetricTrendStyle.NEUTRAL_TREND_TARGET, MetricTrendStyle.NO_TREND_TARGET), new MetricValue("50%", metricTrendStyle), "CROSS");
    }

    private final MetricScreen createMetricScreen() {
        return new MetricScreen("SELECT METRICS", "Select Your Metric Goals", "Improve your health and fitness by selecting 1-2 metric goals for the week.", "Selected Metrics", "Metric", AbstractC37056f.m118959K("Poor", "Sufficient", "Optimal"), "No Metrics Selected", "No Metrics", "30 Day avg.", "SAVE METRIC");
    }

    private final MetricSection createMetricSection() {
        return new MetricSection("Metrics", createEmptyState());
    }

    private final WeeklyPlanCustomizationScreenModel createSleepGoalScreen() {
        return new WeeklyPlanCustomizationScreenModel(TargetGoalType.SLEEP_PERFORMANCE, new SliderContent(new Range(0.0d, null, 100.0d, null), 1.0d, new Range(0.0d, null, 100.0d, null), 0.5d, "YOUR GOAL", new DisplayRange(new DisplayRangeLimits("50", "75"), new Range(0.5d, null, 0.75d, null), "30 DAY avg.", new ProgressionRange(0.8d, 0.55d)), AbstractC37056f.m118958J(new RangeWithTip(new Range(0.0d, null, 100.0d, null), new ToolTip("9.05", "Estimated Time in Bed to hit your Sleep Performance goal.", Double.valueOf(3.3115759290036846E7d)), new ProgressionToolTip("Reach Optimal in 5 Weeks", "We recommend progressively increasing your target by 5% each week until your average is optimal at >75%.", "CURRENT", "WEEKLY INCREASE", "TARGET", false))), "%", null, "100", "10"), null, "SET YOUR TARGET", null, "Set your Sleep Consistency target for the week", null, "", "SAVE TARGET", null, new SmartAlarmOverride("override alarm mode?", "dialog description", "Override", "Keep Alarm Mode"), null);
    }

    private final WeeklyPlanCustomizationScreenModel createSleepHoursGoalsScreen() {
        return new WeeklyPlanCustomizationScreenModel(TargetGoalType.SLEEP_HOURS, new SliderContent(new Range(0.0d, null, 100.0d, null), 1.0d, new Range(0.0d, null, 100.0d, null), 0.5d, "YOUR GOAL", new DisplayRange(new DisplayRangeLimits("50", "75"), new Range(0.5d, null, 0.75d, null), "30 DAY avg.", new ProgressionRange(0.8d, 0.55d)), AbstractC37056f.m118958J(new RangeWithTip(new Range(0.0d, null, 100.0d, null), new ToolTip("9.05", "Estimated Time in Bed to hit your Sleep Performance goal.", Double.valueOf(3.3115759290036846E7d)), new ProgressionToolTip("Reach Optimal in 5 Weeks", "We recommend progressively increasing your target by 5% each week until your average is optimal at >75%.", "CURRENT", "WEEKLY INCREASE", "TARGET", false))), "%", null, "100", "10"), null, "SET YOUR TARGET", null, "Set your Sleep Consistency target for the week", null, "", "SAVE TARGET", null, new SmartAlarmOverride("override alarm mode?", "dialog description", "Override", "Keep Alarm Mode"), null);
    }

    private final WeeklyPlanCustomizationScreenModel createStrainGoalScreen() {
        return new WeeklyPlanCustomizationScreenModel(TargetGoalType.STRAIN, new SliderContent(new Range(0.0d, null, 100.0d, null), 1.0d, new Range(0.0d, null, 100.0d, null), 0.5d, "YOUR GOAL", new DisplayRange(new DisplayRangeLimits("50", "75"), new Range(0.5d, null, 0.75d, null), "30 DAY AVERAGE", null), AbstractC37056f.m118958J(new RangeWithTip(new Range(0.0d, null, 100.0d, null), new ToolTip("9.05", "Estimated Time in Bed to hit your Sleep Performance goal.", Double.valueOf(3.3115759290036846E7d)), new ProgressionToolTip("Reach Optimal in 5 Weeks", "We recommend progressively increasing your target by 5% each week until your average is optimal at >75%.", "CURRENT", "WEEKLY INCREASE", "TARGET", false))), null, null, "100", "10"), null, "SET YOUR TARGET", null, "Set your STRAIN target for the week", null, "", "SAVE TARGET", null, new SmartAlarmOverride("override alarm mode?", "dialog description", "Override", "Keep Alarm Mode"), null);
    }

    private final SmartAlarmOverride createUnsavedChangesDialog() {
        return new SmartAlarmOverride("UNSAVED CHANGES", "Exiting now will undo your changes and remove any new selections. Would you like to continue?", "EXIT PLAN DETAILS", "CANCEL");
    }

    private final WeeklyPlanCustomizationScreenModel createWeightGoalScreen() {
        return new WeeklyPlanCustomizationScreenModel(TargetGoalType.WEIGHT, new SliderContent(new Range(0.0d, null, 100.0d, null), 0.1d, new Range(0.0d, null, 100.0d, null), 0.5d, "YOUR GOAL", new DisplayRange(new DisplayRangeLimits("50", "75"), new Range(0.5d, null, 0.75d, null), "30 DAY AVERAGE", null), AbstractC37056f.m118958J(new RangeWithTip(new Range(0.0d, null, 100.0d, null), new ToolTip("9.05", "Estimated Time in Bed to hit your Sleep Performance goal.", Double.valueOf(3.3115759290036846E7d)), new ProgressionToolTip("Reach Optimal in 5 Weeks", "We recommend progressively increasing your target by 5% each week until your average is optimal at >75%.", "CURRENT", "WEEKLY INCREASE", "TARGET", false))), null, new AverageLine("Average", "", null), null, null), null, "SET YOUR TARGET", null, "Set your Sleep Consistency target for the week", null, "", "SAVE TARGET", null, null, null);
    }

    private final CustomizeBottomSheetSelectorModel getActivitiesBottomSheet(String currentCategory) {
        List listM118959K = AbstractC37056f.m118959K("ALL", "OTHER");
        List listM118958J = AbstractC37056f.m118958J("ALL");
        GoalSettingsTileStyle goalSettingsTileStyle = GoalSettingsTileStyle.STRAIN_ACTIVITY;
        DayOptions dayOptions = new DayOptions(AbstractC37056f.m118959K(new Value(1, "1 DAY", "1 DAY"), new Value(2, "2 DAYS", "2 DAYS"), new Value(3, "3 DAYS", "3 DAYS"), new Value(4, "4 DAYS", "4 DAYS"), new Value(5, "5 DAYS", "5 DAYS"), new Value(6, "6 DAYS", "6 DAYS"), new Value(7, "7 DAYS", "7 DAYS")), "Days per week");
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        return new CustomizeBottomSheetSelectorModel("Select Activities", listM118959K, currentCategory, AbstractC37056f.m118958J(new GroupedTogglesModel("NOT SELECTED", 1, AbstractC37056f.m118959K(new TogglesModel("activity_1", "Running", "RUNNING", "", listM118958J, "", (ImpactModel) null, bool, (String) null, (Integer) 2, (Boolean) null, bool2, goalSettingsTileStyle, dayOptions, (Integer) null, bool2, (BottomSheetInfoModel) null, (GoalSettingsTileTagModel) null, (Boolean) null, 393216, (DefaultConstructorMarker) null), new TogglesModel("activity_2", "Meditation", "OTHER", "", AbstractC37056f.m118959K("ALL", "OTHER"), "", (ImpactModel) null, bool, (String) null, (Integer) 2, (Boolean) null, bool2, goalSettingsTileStyle, new DayOptions(AbstractC37056f.m118959K(new Value(1, "1 DAY", "1 DAY"), new Value(2, "2 DAYS", "2 DAYS"), new Value(3, "3 DAYS", "3 DAYS"), new Value(4, "4 DAYS", "4 DAYS"), new Value(5, "5 DAYS", "5 DAYS"), new Value(6, "6 DAYS", "6 DAYS"), new Value(7, "7 DAYS", "7 DAYS")), "Days per week"), (Integer) null, bool2, (BottomSheetInfoModel) null, (GoalSettingsTileTagModel) null, (Boolean) null, 393216, (DefaultConstructorMarker) null)))), "Search for Activities", "Save Activities", C25271y.f99162w, (ConfirmationModalModel) null, (DesignSystemModel) null, (DesignSystemModel) null, 768, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CustomizeBottomSheetSelectorModel getActivitiesBottomSheet$default(HubAndSpokeResponseFixture hubAndSpokeResponseFixture, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "ALL";
        }
        return hubAndSpokeResponseFixture.getActivitiesBottomSheet(str);
    }

    private final CustomizeBottomSheetSelectorModel getBehaviorsBottomSheet(String currentCategory) {
        List listM118959K = AbstractC37056f.m118959K("ALL", "OTHER");
        List listM118958J = AbstractC37056f.m118958J("ALL");
        GoalSettingsTileStyle goalSettingsTileStyle = GoalSettingsTileStyle.SLEEP_ACTIVITY;
        DayOptions dayOptions = new DayOptions(AbstractC37056f.m118959K(new Value(1, "1 DAY", "1 DAY"), new Value(2, "2 DAYS", "2 DAYS"), new Value(3, "3 DAYS", "3 DAYS"), new Value(4, "4 DAYS", "4 DAYS"), new Value(5, "5 DAYS", "5 DAYS"), new Value(6, "6 DAYS", "6 DAYS"), new Value(7, "7 DAYS", "7 DAYS")), "Days per week");
        BottomSheetInfoModel bottomSheetInfoModel = new BottomSheetInfoModel("BEHAVIOR IMPACT", "Impact of Alcohol", "Giving up alcohol can boost Recovery and performance over time. If you choose to drink, try choosing a beverage low in nitrites, like beer or vodka. Try to heal your gut microbiome by regularly consuming fermented foods or a probiotic supplement.\n\nThe day after drinking, hydrate with 20-40 oz of water with electrolytes in the morning to help fight a hangover. Additionally, a cold shower may help clear the alcohol from your bloodstream quicker.", "HELPS WITH", AbstractC37056f.m118959K("RECOVERY", "SLEEP CONSISTENCY", "DAILY STEPS", "HEART RATE ZONE 1-3", "RESPIRATORY RATE"));
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        return new CustomizeBottomSheetSelectorModel("Select Behaviors", listM118959K, currentCategory, AbstractC37056f.m118958J(new GroupedTogglesModel("NOT SELECTED", 1, AbstractC37056f.m118959K(new TogglesModel("101", "Protein", (String) null, "Consumed protein?", listM118958J, "", (ImpactModel) null, bool, (String) null, (Integer) 2, (Boolean) null, bool2, goalSettingsTileStyle, dayOptions, (Integer) null, bool2, bottomSheetInfoModel, (GoalSettingsTileTagModel) null, (Boolean) null, 393216, (DefaultConstructorMarker) null), new TogglesModel("102", "Alcohol", (String) null, "Consumed alcohol?", AbstractC37056f.m118959K("ALL", "OTHER"), "", (ImpactModel) null, bool, (String) null, (Integer) 2, (Boolean) null, bool2, goalSettingsTileStyle, new DayOptions(AbstractC37056f.m118959K(new Value(1, "1 DAY", "AVOID 1 DAY"), new Value(2, "2 DAYS", "AVOID 2 DAYS"), new Value(3, "3 DAYS", "AVOID 3 DAYS"), new Value(4, "4 DAYS", "AVOID 4 DAYS"), new Value(5, "5 DAYS", "AVOID 5 DAYS"), new Value(6, "6 DAYS", "AVOID 6 DAYS"), new Value(7, "7 DAYS", "AVOID 7 DAYS")), "Days per week"), (Integer) null, bool2, new BottomSheetInfoModel("BEHAVIOR IMPACT", "Impact of Alcohol", "Giving up alcohol can boost Recovery and performance over time. If you choose to drink, try choosing a beverage low in nitrites, like beer or vodka. Try to heal your gut microbiome by regularly consuming fermented foods or a probiotic supplement.\n\nThe day after drinking, hydrate with 20-40 oz of water with electrolytes in the morning to help fight a hangover. Additionally, a cold shower may help clear the alcohol from your bloodstream quicker.", "HELPS WITH", AbstractC37056f.m118959K("RECOVERY", "SLEEP CONSISTENCY", "DAILY STEPS", "HEART RATE ZONE 1-3", "RESPIRATORY RATE")), (GoalSettingsTileTagModel) null, (Boolean) null, 393216, (DefaultConstructorMarker) null)))), "Search for Behaviors", "Save Behaviors", C25271y.f99162w, (ConfirmationModalModel) null, (DesignSystemModel) null, (DesignSystemModel) null, 768, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CustomizeBottomSheetSelectorModel getBehaviorsBottomSheet$default(HubAndSpokeResponseFixture hubAndSpokeResponseFixture, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "ALL";
        }
        return hubAndSpokeResponseFixture.getBehaviorsBottomSheet(str);
    }

    public final HubAndSpokeResponse create(String planId, String currentPlanTitle, String headerDisplay, String headerImageUrl, String navigationTitle, String subtitle, InitialSelection initialSelection, MetricSection metricSection, List<MetricDetail> metricDetails, MetricScreen metricScreen, String startPlanButtonText, ActivitiesSection activitiesSection, BehaviorSection behaviorSection, List<WeeklyPlanCustomizationScreenModel> goalScreens, String endPlanButtonText, SmartAlarmOverride endPlanDialog, SmartAlarmOverride unsavedChangesDialog) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(headerDisplay, "headerDisplay");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(initialSelection, "initialSelection");
        AbstractC22676k.m65750j(metricSection, "metricSection");
        AbstractC22676k.m65750j(metricDetails, "metricDetails");
        AbstractC22676k.m65750j(metricScreen, "metricScreen");
        AbstractC22676k.m65750j(startPlanButtonText, "startPlanButtonText");
        AbstractC22676k.m65750j(activitiesSection, "activitiesSection");
        AbstractC22676k.m65750j(behaviorSection, "behaviorSection");
        AbstractC22676k.m65750j(goalScreens, "goalScreens");
        return new HubAndSpokeResponse(planId, currentPlanTitle, navigationTitle, headerDisplay, headerImageUrl, subtitle, startPlanButtonText, initialSelection, metricSection, behaviorSection, activitiesSection, metricDetails, metricScreen, goalScreens, endPlanButtonText, endPlanDialog, unsavedChangesDialog, (MetaData) null, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ, (DefaultConstructorMarker) null);
    }
}
