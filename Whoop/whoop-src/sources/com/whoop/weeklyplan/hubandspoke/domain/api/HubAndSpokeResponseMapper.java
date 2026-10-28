package com.whoop.weeklyplan.hubandspoke.domain.api;

import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverride;
import com.whoop.weeklyplan.customizeplan.domain.api.SmartAlarmOverrideV2;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationResponseMapper;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModelV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u0010)\u001a\u000200H\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010)\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002¨\u0006<"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseMapper;", "", "<init>", "()V", "mapKotlinxToGson", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "responseKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;", "mapMetaData", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaData;", "metaDataKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetaDataKotlinx;", "mapInitialSelection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "selectionKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelectionKotlinx;", "mapGoal", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;", "goalKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/GoalKotlinx;", "mapActivity", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Activity;", "activityKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivityKotlinx;", "mapBehavior", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Behavior;", "behaviorKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorKotlinx;", "mapMetricSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSection;", "sectionKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricSectionKotlinx;", "mapEmptyState", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/EmptyState;", "emptyStateKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/EmptyStateKotlinx;", "mapBehaviorSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSection;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorSectionKotlinx;", "mapBehaviorDetail", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetail;", "detailKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetailKotlinx;", "mapActivitiesSection", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSection;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivitiesSectionKotlinx;", "mapActivityDetail", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivityDetail;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivityDetailKotlinx;", "mapMetricDetail", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;", "mapAssociatedBehaviorsActivities", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivities;", "activitiesKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;", "mapMetricScreen", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;", "screenKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreenKotlinx;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HubAndSpokeResponseMapper {
    public static final int $stable = 0;
    public static final HubAndSpokeResponseMapper INSTANCE = new HubAndSpokeResponseMapper();

    private HubAndSpokeResponseMapper() {
    }

    private final ActivitiesSection mapActivitiesSection(ActivitiesSectionKotlinx sectionKotlinx) {
        List arrayList;
        String title = sectionKotlinx.getTitle();
        EmptyState emptyStateMapEmptyState = mapEmptyState(sectionKotlinx.getEmptyState());
        List<ActivityDetailKotlinx> activities = sectionKotlinx.getActivities();
        if (activities != null) {
            List<ActivityDetailKotlinx> list = activities;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(INSTANCE.mapActivityDetail((ActivityDetailKotlinx) it.next()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return new ActivitiesSection(title, emptyStateMapEmptyState, arrayList);
    }

    private final Activity mapActivity(ActivityKotlinx activityKotlinx) {
        return new Activity(activityKotlinx.getActivityType(), activityKotlinx.getDays());
    }

    private final ActivityDetail mapActivityDetail(ActivityDetailKotlinx detailKotlinx) {
        return new ActivityDetail(detailKotlinx.getActivityId(), detailKotlinx.getTitle(), detailKotlinx.getDescription(), detailKotlinx.getImageUrl());
    }

    private final AssociatedBehaviorsActivities mapAssociatedBehaviorsActivities(AssociatedBehaviorsActivitiesKotlinx activitiesKotlinx) {
        List arrayList;
        List arrayList2;
        List<GoalKotlinx> goalIds = activitiesKotlinx.getGoalIds();
        List arrayList3 = C25271y.f99162w;
        if (goalIds != null) {
            List<GoalKotlinx> list = goalIds;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(INSTANCE.mapGoal((GoalKotlinx) it.next()));
            }
        } else {
            arrayList = arrayList3;
        }
        List<ActivityKotlinx> activityIds = activitiesKotlinx.getActivityIds();
        if (activityIds != null) {
            List<ActivityKotlinx> list2 = activityIds;
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(INSTANCE.mapActivity((ActivityKotlinx) it3.next()));
            }
        } else {
            arrayList2 = arrayList3;
        }
        List<BehaviorKotlinx> behaviorIds = activitiesKotlinx.getBehaviorIds();
        if (behaviorIds != null) {
            List<BehaviorKotlinx> list3 = behaviorIds;
            arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            Iterator<T> it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(INSTANCE.mapBehavior((BehaviorKotlinx) it4.next()));
            }
        }
        return new AssociatedBehaviorsActivities(arrayList, arrayList2, arrayList3);
    }

    private final Behavior mapBehavior(BehaviorKotlinx behaviorKotlinx) {
        return new Behavior(behaviorKotlinx.getBehaviorTrackerId(), behaviorKotlinx.getDays(), behaviorKotlinx.getAvoid());
    }

    private final BehaviorDetail mapBehaviorDetail(BehaviorDetailKotlinx detailKotlinx) {
        return new BehaviorDetail(detailKotlinx.getBehaviorTrackerId(), detailKotlinx.getTitle(), detailKotlinx.getTitleAvoid(), detailKotlinx.getDescription());
    }

    private final BehaviorSection mapBehaviorSection(BehaviorSectionKotlinx sectionKotlinx) {
        List arrayList;
        String title = sectionKotlinx.getTitle();
        EmptyState emptyStateMapEmptyState = mapEmptyState(sectionKotlinx.getEmptyState());
        List<BehaviorDetailKotlinx> behaviors = sectionKotlinx.getBehaviors();
        if (behaviors != null) {
            List<BehaviorDetailKotlinx> list = behaviors;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(INSTANCE.mapBehaviorDetail((BehaviorDetailKotlinx) it.next()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return new BehaviorSection(title, emptyStateMapEmptyState, arrayList);
    }

    private final EmptyState mapEmptyState(EmptyStateKotlinx emptyStateKotlinx) {
        return new EmptyState(emptyStateKotlinx.getTitle(), emptyStateKotlinx.getButtonText());
    }

    private final Goal mapGoal(GoalKotlinx goalKotlinx) {
        return new Goal(goalKotlinx.getGoalTypeId(), goalKotlinx.getTarget(), goalKotlinx.getType());
    }

    private final InitialSelection mapInitialSelection(InitialSelectionKotlinx selectionKotlinx) {
        List<GoalKotlinx> targetGoals = selectionKotlinx.getTargetGoals();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(targetGoals, 10));
        Iterator<T> it = targetGoals.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.mapGoal((GoalKotlinx) it.next()));
        }
        List<ActivityKotlinx> activityGoals = selectionKotlinx.getActivityGoals();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(activityGoals, 10));
        Iterator<T> it3 = activityGoals.iterator();
        while (it3.hasNext()) {
            arrayList2.add(INSTANCE.mapActivity((ActivityKotlinx) it3.next()));
        }
        List<BehaviorKotlinx> behaviorGoals = selectionKotlinx.getBehaviorGoals();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(behaviorGoals, 10));
        Iterator<T> it4 = behaviorGoals.iterator();
        while (it4.hasNext()) {
            arrayList3.add(INSTANCE.mapBehavior((BehaviorKotlinx) it4.next()));
        }
        return new InitialSelection(arrayList, arrayList2, arrayList3);
    }

    private final MetaData mapMetaData(MetaDataKotlinx metaDataKotlinx) {
        return new MetaData(metaDataKotlinx.getAiContextMetadata());
    }

    private final MetricDetail mapMetricDetail(MetricDetailKotlinx detailKotlinx) {
        return new MetricDetail(detailKotlinx.getGoalTypeId(), detailKotlinx.getGoalType(), detailKotlinx.getMetricCard(), detailKotlinx.getMetricPlanTile(), mapAssociatedBehaviorsActivities(detailKotlinx.getAssociatedBehaviorsActivities()));
    }

    private final MetricScreen mapMetricScreen(MetricScreenKotlinx screenKotlinx) {
        return new MetricScreen(screenKotlinx.getNavigationTitleDisplay(), screenKotlinx.getHeaderDisplay(), screenKotlinx.getSubtitle(), screenKotlinx.getSelectedHeader(), screenKotlinx.getUnselectedHeader(), screenKotlinx.getLegend(), screenKotlinx.getSelectedEmptyState(), screenKotlinx.getUnselectedEmptyState(), screenKotlinx.getTimeRange(), screenKotlinx.getButtonText());
    }

    private final MetricSection mapMetricSection(MetricSectionKotlinx sectionKotlinx) {
        return new MetricSection(sectionKotlinx.getTitle(), mapEmptyState(sectionKotlinx.getEmptyState()));
    }

    public final HubAndSpokeResponse mapKotlinxToGson(HubAndSpokeResponseKotlinx responseKotlinx) {
        AbstractC22676k.m65750j(responseKotlinx, "responseKotlinx");
        String planId = responseKotlinx.getPlanId();
        String currentPlanTitle = responseKotlinx.getCurrentPlanTitle();
        String navigationTitle = responseKotlinx.getNavigationTitle();
        String headerDisplay = responseKotlinx.getHeaderDisplay();
        String headerImageUrl = responseKotlinx.getHeaderImageUrl();
        String subtitle = responseKotlinx.getSubtitle();
        String startPlanButtonText = responseKotlinx.getStartPlanButtonText();
        InitialSelection initialSelectionMapInitialSelection = mapInitialSelection(responseKotlinx.getInitialSelection());
        MetricSection metricSectionMapMetricSection = mapMetricSection(responseKotlinx.getMetricSection());
        BehaviorSection behaviorSectionMapBehaviorSection = mapBehaviorSection(responseKotlinx.getBehaviorSection());
        ActivitiesSection activitiesSectionMapActivitiesSection = mapActivitiesSection(responseKotlinx.getActivitiesSection());
        List<MetricDetailKotlinx> metricDetails = responseKotlinx.getMetricDetails();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(metricDetails, 10));
        Iterator<T> it = metricDetails.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.mapMetricDetail((MetricDetailKotlinx) it.next()));
        }
        MetricScreen metricScreenMapMetricScreen = mapMetricScreen(responseKotlinx.getMetricScreen());
        List<WeeklyPlanCustomizationScreenModelV2> goalScreens = responseKotlinx.getGoalScreens();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(goalScreens, 10));
        for (Iterator it3 = goalScreens.iterator(); it3.hasNext(); it3 = it3) {
            arrayList2.add(WeeklyPlanCustomizationResponseMapper.INSTANCE.mapScreenKotlinxToGson((WeeklyPlanCustomizationScreenModelV2) it3.next()));
        }
        String endPlanButtonText = responseKotlinx.getEndPlanButtonText();
        SmartAlarmOverrideV2 endPlanDialog = responseKotlinx.getEndPlanDialog();
        SmartAlarmOverride smartAlarmOverrideMapSmartAlarmOverrideKotlinxToGson = endPlanDialog != null ? WeeklyPlanCustomizationResponseMapper.INSTANCE.mapSmartAlarmOverrideKotlinxToGson(endPlanDialog) : null;
        SmartAlarmOverrideV2 unsavedChangesDialog = responseKotlinx.getUnsavedChangesDialog();
        SmartAlarmOverride smartAlarmOverrideMapSmartAlarmOverrideKotlinxToGson2 = unsavedChangesDialog != null ? WeeklyPlanCustomizationResponseMapper.INSTANCE.mapSmartAlarmOverrideKotlinxToGson(unsavedChangesDialog) : null;
        MetaDataKotlinx metadata = responseKotlinx.getMetadata();
        return new HubAndSpokeResponse(planId, currentPlanTitle, navigationTitle, headerDisplay, headerImageUrl, subtitle, startPlanButtonText, initialSelectionMapInitialSelection, metricSectionMapMetricSection, behaviorSectionMapBehaviorSection, activitiesSectionMapActivitiesSection, arrayList, metricScreenMapMetricScreen, arrayList2, endPlanButtonText, smartAlarmOverrideMapSmartAlarmOverrideKotlinxToGson, smartAlarmOverrideMapSmartAlarmOverrideKotlinxToGson2, metadata != null ? INSTANCE.mapMetaData(metadata) : null);
    }
}
