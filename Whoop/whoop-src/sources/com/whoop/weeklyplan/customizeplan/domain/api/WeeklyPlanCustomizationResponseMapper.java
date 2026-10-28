package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.navigation.C9598e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002¨\u0006@"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseMapper;", "", "<init>", "()V", "mapKotlinxToGson", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "responseV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseKotlinx;", "mapScreenKotlinxToGson", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "screenV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModelV2;", "mapToggleContentV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;", "toggleV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContentV2;", "mapBottomButtonV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;", "buttonV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButtonV2;", "mapSliderContentV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;", "sliderV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContentV2;", "mapRangeV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;", "rangeV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeV2;", "mapDisplayRangeV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;", "displayRangeV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeV2;", "mapDisplayRangeLimitsV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimits;", "limitsV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRangeLimitsV2;", "mapProgressionRangeV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRange;", "progressionRangeV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionRangeV2;", "mapRangeWithTipV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTip;", "rangeWithTipV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/RangeWithTipV2;", "mapToolTipV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTip;", "toolTipV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToolTipV2;", "mapProgressionToolTipV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTip;", "progressionToolTipV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;", "mapAverageLineV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;", "averageLineV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLineV2;", "mapSmartAlarmOverrideKotlinxToGson", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;", "smartAlarmOverrideV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverrideV2;", "mapTipContentV2ToV1", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;", "tipContentV2", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContentV2;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WeeklyPlanCustomizationResponseMapper {
    public static final int $stable = 0;
    public static final WeeklyPlanCustomizationResponseMapper INSTANCE = new WeeklyPlanCustomizationResponseMapper();

    private WeeklyPlanCustomizationResponseMapper() {
    }

    private final AverageLine mapAverageLineV2ToV1(AverageLineV2 averageLineV2) {
        return new AverageLine(averageLineV2.getTitle(), averageLineV2.getSubtitle(), averageLineV2.getPositionOnSlider());
    }

    private final BottomButton mapBottomButtonV2ToV1(BottomButtonV2 buttonV2) {
        String icon = buttonV2.getIcon();
        String titleDisplay = buttonV2.getTitleDisplay();
        C9598e action = buttonV2.getAction();
        if (action == null) {
            action = new C9598e(null, null, null, 7, null);
        }
        return new BottomButton(icon, titleDisplay, action);
    }

    private final DisplayRangeLimits mapDisplayRangeLimitsV2ToV1(DisplayRangeLimitsV2 limitsV2) {
        return new DisplayRangeLimits(limitsV2.getMin(), limitsV2.getMax());
    }

    private final DisplayRange mapDisplayRangeV2ToV1(DisplayRangeV2 displayRangeV2) {
        DisplayRangeLimits displayRangeLimitsMapDisplayRangeLimitsV2ToV1 = mapDisplayRangeLimitsV2ToV1(displayRangeV2.getRange());
        Range rangeMapRangeV2ToV1 = mapRangeV2ToV1(displayRangeV2.getPercentRange());
        String labelDisplay = displayRangeV2.getLabelDisplay();
        ProgressionRangeV2 progressionRange = displayRangeV2.getProgressionRange();
        return new DisplayRange(displayRangeLimitsMapDisplayRangeLimitsV2ToV1, rangeMapRangeV2ToV1, labelDisplay, progressionRange != null ? INSTANCE.mapProgressionRangeV2ToV1(progressionRange) : null);
    }

    private final ProgressionRange mapProgressionRangeV2ToV1(ProgressionRangeV2 progressionRangeV2) {
        return new ProgressionRange(progressionRangeV2.getRecommendation(), progressionRangeV2.getBaseline());
    }

    private final ProgressionToolTip mapProgressionToolTipV2ToV1(ProgressionToolTipV2 progressionToolTipV2) {
        return new ProgressionToolTip(progressionToolTipV2.getTitle(), progressionToolTipV2.getDescription(), progressionToolTipV2.getCurrentBarCopy(), progressionToolTipV2.getWeeklyIncreaseCopy(), progressionToolTipV2.getTargetBarCopy(), progressionToolTipV2.isOptimal());
    }

    private final Range mapRangeV2ToV1(RangeV2 rangeV2) {
        return new Range(rangeV2.getMin(), rangeV2.getLowerBoundType(), rangeV2.getMax(), rangeV2.getUpperBoundType());
    }

    private final RangeWithTip mapRangeWithTipV2ToV1(RangeWithTipV2 rangeWithTipV2) {
        Range rangeMapRangeV2ToV1 = mapRangeV2ToV1(rangeWithTipV2.getRange());
        ToolTip toolTipMapToolTipV2ToV1 = mapToolTipV2ToV1(rangeWithTipV2.getTooltip());
        ProgressionToolTipV2 progressionToolTip = rangeWithTipV2.getProgressionToolTip();
        return new RangeWithTip(rangeMapRangeV2ToV1, toolTipMapToolTipV2ToV1, progressionToolTip != null ? INSTANCE.mapProgressionToolTipV2ToV1(progressionToolTip) : null);
    }

    private final SliderContent mapSliderContentV2ToV1(SliderContentV2 sliderV2) {
        Range rangeMapRangeV2ToV1 = mapRangeV2ToV1(sliderV2.getRange());
        double increment = sliderV2.getIncrement();
        Range rangeMapRangeV2ToV2 = mapRangeV2ToV1(sliderV2.getUsableRange());
        double value = sliderV2.getValue();
        String valueLabel = sliderV2.getValueLabel();
        DisplayRangeV2 recommendedRange = sliderV2.getRecommendedRange();
        DisplayRange displayRangeMapDisplayRangeV2ToV1 = recommendedRange != null ? INSTANCE.mapDisplayRangeV2ToV1(recommendedRange) : null;
        List<RangeWithTipV2> rangeContent = sliderV2.getRangeContent();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(rangeContent, 10));
        Iterator<T> it = rangeContent.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.mapRangeWithTipV2ToV1((RangeWithTipV2) it.next()));
        }
        String valueUnits = sliderV2.getValueUnits();
        AverageLineV2 averageLine = sliderV2.getAverageLine();
        return new SliderContent(rangeMapRangeV2ToV1, increment, rangeMapRangeV2ToV2, value, valueLabel, displayRangeMapDisplayRangeV2ToV1, arrayList, valueUnits, averageLine != null ? INSTANCE.mapAverageLineV2ToV1(averageLine) : null, sliderV2.getTopText(), sliderV2.getBottomText());
    }

    private final TipContent mapTipContentV2ToV1(TipContentV2 tipContentV2) {
        return new TipContent(tipContentV2.getTitle(), tipContentV2.getTipsMarkdown());
    }

    private final ToggleContent mapToggleContentV2ToV1(ToggleContentV2 toggleV2) {
        String topHeadingDisplay = toggleV2.getTopHeadingDisplay();
        List<GoalSettingsTileModel> topInitialToggles = toggleV2.getTopInitialToggles();
        if (topInitialToggles.isEmpty()) {
            topInitialToggles = null;
        }
        return new ToggleContent(topHeadingDisplay, topInitialToggles, toggleV2.getHeadingDisplay(), toggleV2.getSubHeadingDisplay(), toggleV2.getInitialToggles(), mapBottomButtonV2ToV1(toggleV2.getBottomButton()), toggleV2.getBottomSheet(), toggleV2.getTopInitialToggleIds());
    }

    private final ToolTip mapToolTipV2ToV1(ToolTipV2 toolTipV2) {
        return new ToolTip(toolTipV2.getTitleDisplay(), toolTipV2.getSubtitleDisplay(), toolTipV2.getData());
    }

    public final WeeklyPlanCustomizationResponse mapKotlinxToGson(WeeklyPlanCustomizationResponseKotlinx responseV2) {
        AbstractC22676k.m65750j(responseV2, "responseV2");
        UUID planId = responseV2.getPlanId();
        List<WeeklyPlanCustomizationScreenModelV2> screens = responseV2.getScreens();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(screens, 10));
        Iterator<T> it = screens.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.mapScreenKotlinxToGson((WeeklyPlanCustomizationScreenModelV2) it.next()));
        }
        return new WeeklyPlanCustomizationResponse(planId, arrayList);
    }

    public final WeeklyPlanCustomizationScreenModel mapScreenKotlinxToGson(WeeklyPlanCustomizationScreenModelV2 screenV2) {
        AbstractC22676k.m65750j(screenV2, "screenV2");
        TargetGoalType goal = screenV2.getGoal();
        GoalScreenContent sliderContent = screenV2.getSliderContent();
        SliderContentV2 sliderContentV2 = sliderContent instanceof SliderContentV2 ? (SliderContentV2) sliderContent : null;
        SliderContent sliderContentMapSliderContentV2ToV1 = sliderContentV2 != null ? INSTANCE.mapSliderContentV2ToV1(sliderContentV2) : null;
        GoalScreenContent toggleContent = screenV2.getToggleContent();
        ToggleContentV2 toggleContentV2 = toggleContent instanceof ToggleContentV2 ? (ToggleContentV2) toggleContent : null;
        ToggleContent toggleContentMapToggleContentV2ToV1 = toggleContentV2 != null ? INSTANCE.mapToggleContentV2ToV1(toggleContentV2) : null;
        String navigationTitleDisplay = screenV2.getNavigationTitleDisplay();
        String navigationSubtitleDisplay = screenV2.getNavigationSubtitleDisplay();
        String title = screenV2.getTitle();
        String description = screenV2.getDescription();
        String buttonDescriptionDisplay = screenV2.getButtonDescriptionDisplay();
        String continueButtonDisplay = screenV2.getContinueButtonDisplay();
        String skipButtonDisplay = screenV2.getSkipButtonDisplay();
        SmartAlarmOverrideV2 smartAlarmOverride = screenV2.getSmartAlarmOverride();
        SmartAlarmOverride smartAlarmOverrideMapSmartAlarmOverrideKotlinxToGson = smartAlarmOverride != null ? INSTANCE.mapSmartAlarmOverrideKotlinxToGson(smartAlarmOverride) : null;
        TipContentV2 tipContent = screenV2.getTipContent();
        return new WeeklyPlanCustomizationScreenModel(goal, sliderContentMapSliderContentV2ToV1, toggleContentMapToggleContentV2ToV1, navigationTitleDisplay, navigationSubtitleDisplay, title, description, buttonDescriptionDisplay, continueButtonDisplay, skipButtonDisplay, smartAlarmOverrideMapSmartAlarmOverrideKotlinxToGson, tipContent != null ? INSTANCE.mapTipContentV2ToV1(tipContent) : null);
    }

    public final SmartAlarmOverride mapSmartAlarmOverrideKotlinxToGson(SmartAlarmOverrideV2 smartAlarmOverrideV2) {
        AbstractC22676k.m65750j(smartAlarmOverrideV2, "smartAlarmOverrideV2");
        return new SmartAlarmOverride(smartAlarmOverrideV2.getTitle(), smartAlarmOverrideV2.getDescription(), smartAlarmOverrideV2.getButtonConfirmTitle(), smartAlarmOverrideV2.getButtonRejectTitle());
    }
}
