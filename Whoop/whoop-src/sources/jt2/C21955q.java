package jt2;

import com.whoop.weeklyplan.customizeplan.domain.api.Range;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import com.whoop.weeklyplan.hubandspoke.domain.api.Goal;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetricDetail;
import e93.AbstractC12889b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jt2.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ljt2/q;", "", "<init>", "()V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "", "fill", "", "c", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D", "Ljt2/j;", "combineState", "", "Ljt2/r;", "e", "(Ljt2/j;)Ljava/util/List;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;", "effectiveTargetGoals", "d", "(Ljt2/j;Ljava/util/List;)Ljava/util/List;", "a", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;)D", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21955q {

    /* JADX INFO: renamed from: jt2.q$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84903a;

        static {
            int[] iArr = new int[TargetGoalType.values().length];
            try {
                iArr[TargetGoalType.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetGoalType.STRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetGoalType.SLEEP_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TargetGoalType.HR_ZONES_ONE_TO_THREE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TargetGoalType.HR_ZONES_FOUR_TO_FIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TargetGoalType.STRENGTH_TRAINING_TIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TargetGoalType.STEPS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f84903a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ double m62672b(C21955q c21955q, WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel, Float f13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            f13 = null;
        }
        return c21955q.m62674a(weeklyPlanCustomizationScreenModel, f13);
    }

    /* JADX INFO: renamed from: c */
    private final double m62673c(WeeklyPlanCustomizationScreenModel model, float fill) {
        SliderContent slider;
        SliderContent slider2;
        Range range;
        SliderContent slider3;
        Range range2;
        double increment = 1.0d;
        double max = (model == null || (slider3 = model.getSlider()) == null || (range2 = slider3.getRange()) == null) ? 1.0d : range2.getMax();
        double min = (model == null || (slider2 = model.getSlider()) == null || (range = slider2.getRange()) == null) ? 0.0d : range.getMin();
        double d3 = fill;
        double d14 = max * d3;
        if (model != null && (slider = model.getSlider()) != null) {
            increment = slider.getIncrement();
        }
        double dM36257W = ((double) AbstractC12889b.m36257W(d14 / increment)) * increment;
        TargetGoalType goal = model != null ? model.getGoal() : null;
        switch (goal == null ? -1 : a.f84903a[goal.ordinal()]) {
            case 1:
                return new BigDecimal(String.valueOf(((max - min) * d3) + min)).setScale(1, RoundingMode.HALF_UP).doubleValue();
            case 2:
                return new BigDecimal(String.valueOf(dM36257W)).setScale(1, RoundingMode.HALF_UP).doubleValue();
            case 3:
            case 4:
            case 5:
            case 6:
                return ((double) AbstractC12889b.m36257W((((max - min) * d3) + min) / increment)) * increment;
            case 7:
                return ((double) AbstractC12889b.m36257W((((max - min) * d3) + min) / increment)) * increment;
            default:
                return dM36257W;
        }
    }

    /* JADX WARN: Code duplicated, block: B:3:0x0002 A[PHI: r4
      0x0002: PHI (r4v8 'fill' java.lang.Float) = (r4v0 'fill' java.lang.Float), (r4v2 'fill' java.lang.Float) binds: [B:2:0x0000, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public final double m62674a(WeeklyPlanCustomizationScreenModel model, Float fill) {
        float fFloatValue;
        SliderContent slider;
        if (fill == null) {
            fill = (model == null || (slider = model.getSlider()) == null) ? null : Float.valueOf((float) slider.getValue());
            if (fill != null) {
                fFloatValue = fill.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
        } else {
            fFloatValue = fill.floatValue();
        }
        return m62673c(model, fFloatValue);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x016b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0196 A[PHI: r5
      0x0196: PHI (r5v11 java.lang.Double) = (r5v5 java.lang.Double), (r5v7 java.lang.Double) binds: [B:81:0x0194, B:88:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    public final List<C21956r> m62675d(C21948j combineState, List<Goal> effectiveTargetGoals) {
        C21956r c21956r;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Double dValueOf;
        Object next5;
        SliderContent slider;
        Object next6;
        SliderContent slider2;
        Range range;
        SliderContent slider3;
        SliderContent slider4;
        Range range2;
        AbstractC22676k.m65750j(combineState, "combineState");
        AbstractC22676k.m65750j(effectiveTargetGoals, "effectiveTargetGoals");
        if (!(combineState.getDomainState() instanceof AbstractC21951m.i)) {
            return C25271y.f99162w;
        }
        C21942d accumulatedStateForVS = combineState.getAccumulatedStateForVS();
        AbstractC21951m domainState = combineState.getDomainState();
        List<Integer> listM62553t = accumulatedStateForVS.m62553t();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM62553t.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            AbstractC21951m.i iVar = (AbstractC21951m.i) domainState;
            Iterator<T> it3 = iVar.getResult().getMetricDetails().iterator();
            do {
                c21956r = null;
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((MetricDetail) next).getGoalTypeId() != iIntValue);
            MetricDetail metricDetail = (MetricDetail) next;
            TargetGoalType goalType = metricDetail != null ? metricDetail.getGoalType() : null;
            Iterator<T> it4 = iVar.getResult().getGoalScreens().iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (((WeeklyPlanCustomizationScreenModel) next2).getGoal() != goalType);
            WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) next2;
            Iterator<T> it5 = effectiveTargetGoals.iterator();
            do {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (((Goal) next3).getGoalTypeId() != iIntValue);
            Goal goal = (Goal) next3;
            double dDoubleValue = 0.0d;
            if (goal != null) {
                double target = goal.getTarget();
                if (weeklyPlanCustomizationScreenModel != null && (slider4 = weeklyPlanCustomizationScreenModel.getSlider()) != null && (range2 = slider4.getRange()) != null) {
                    dDoubleValue = AbstractC12889b.m36282l((target - range2.getMin()) / (range2.getMax() - range2.getMin()), 0.0d, 1.0d);
                } else if (weeklyPlanCustomizationScreenModel != null && (slider3 = weeklyPlanCustomizationScreenModel.getSlider()) != null) {
                    dDoubleValue = slider3.getValue();
                }
            } else {
                Iterator<T> it6 = iVar.getResult().getInitialSelection().getTargetGoals().iterator();
                do {
                    if (!it6.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it6.next();
                } while (((Goal) next4).getGoalTypeId() != iIntValue);
                Goal goal2 = (Goal) next4;
                if (goal2 != null) {
                    double target2 = goal2.getTarget();
                    Iterator<T> it7 = iVar.getResult().getGoalScreens().iterator();
                    do {
                        if (!it7.hasNext()) {
                            next6 = null;
                            break;
                        }
                        next6 = it7.next();
                    } while (((WeeklyPlanCustomizationScreenModel) next6).getGoal() != goalType);
                    WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel2 = (WeeklyPlanCustomizationScreenModel) next6;
                    if (weeklyPlanCustomizationScreenModel2 == null || (slider2 = weeklyPlanCustomizationScreenModel2.getSlider()) == null || (range = slider2.getRange()) == null) {
                        dValueOf = null;
                    } else {
                        dValueOf = Double.valueOf((target2 - range.getMin()) / (range.getMax() - range.getMin()));
                    }
                } else {
                    dValueOf = null;
                }
                Iterator<T> it8 = accumulatedStateForVS.m62545l().iterator();
                do {
                    if (!it8.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it8.next();
                } while (((C21956r) next5).getTargetGoalType() != goalType);
                C21956r c21956r2 = (C21956r) next5;
                if (c21956r2 != null) {
                    dDoubleValue = c21956r2.getSliderFillValue();
                } else if (dValueOf == null) {
                    dValueOf = (weeklyPlanCustomizationScreenModel == null || (slider = weeklyPlanCustomizationScreenModel.getSlider()) == null) ? null : Double.valueOf(slider.getValue());
                    if (dValueOf != null) {
                        dDoubleValue = dValueOf.doubleValue();
                    }
                } else {
                    dDoubleValue = dValueOf.doubleValue();
                }
            }
            if (goalType != null) {
                c21956r = new C21956r(goalType, dDoubleValue, goal != null ? goal.getTarget() : m62673c(weeklyPlanCustomizationScreenModel, (float) dDoubleValue));
            }
            if (c21956r != null) {
                arrayList.add(c21956r);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130 A[PHI: r3
      0x0130: PHI (r3v12 java.lang.Double) = (r3v5 java.lang.Double), (r3v7 java.lang.Double) binds: [B:62:0x012e, B:69:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: e */
    public final List<C21956r> m62676e(C21948j combineState) {
        Object next;
        Object next2;
        Object next3;
        Double dValueOf;
        Object next4;
        double dDoubleValue;
        SliderContent slider;
        Object next5;
        SliderContent slider2;
        Range range;
        AbstractC22676k.m65750j(combineState, "combineState");
        if (!(combineState.getDomainState() instanceof AbstractC21951m.i)) {
            return C25271y.f99162w;
        }
        C21942d accumulatedStateForVS = combineState.getAccumulatedStateForVS();
        AbstractC21951m domainState = combineState.getDomainState();
        List<Integer> listM62553t = accumulatedStateForVS.m62553t();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM62553t.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            AbstractC21951m.i iVar = (AbstractC21951m.i) domainState;
            Iterator<T> it3 = iVar.getResult().getMetricDetails().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((MetricDetail) next).getGoalTypeId() != iIntValue);
            MetricDetail metricDetail = (MetricDetail) next;
            TargetGoalType goalType = metricDetail != null ? metricDetail.getGoalType() : null;
            Iterator<T> it4 = iVar.getResult().getGoalScreens().iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (((WeeklyPlanCustomizationScreenModel) next2).getGoal() != goalType);
            WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) next2;
            Iterator<T> it5 = iVar.getResult().getInitialSelection().getTargetGoals().iterator();
            do {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (((Goal) next3).getGoalTypeId() != iIntValue);
            Goal goal = (Goal) next3;
            if (goal != null) {
                double target = goal.getTarget();
                Iterator<T> it6 = iVar.getResult().getGoalScreens().iterator();
                do {
                    if (!it6.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it6.next();
                } while (((WeeklyPlanCustomizationScreenModel) next5).getGoal() != goalType);
                WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel2 = (WeeklyPlanCustomizationScreenModel) next5;
                if (weeklyPlanCustomizationScreenModel2 == null || (slider2 = weeklyPlanCustomizationScreenModel2.getSlider()) == null || (range = slider2.getRange()) == null) {
                    dValueOf = null;
                } else {
                    dValueOf = Double.valueOf((target - range.getMin()) / (range.getMax() - range.getMin()));
                }
            } else {
                dValueOf = null;
            }
            Iterator<T> it7 = accumulatedStateForVS.m62545l().iterator();
            do {
                if (!it7.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it7.next();
            } while (((C21956r) next4).getTargetGoalType() != goalType);
            C21956r c21956r = (C21956r) next4;
            if (c21956r != null) {
                dDoubleValue = c21956r.getSliderFillValue();
            } else if (dValueOf == null) {
                dValueOf = (weeklyPlanCustomizationScreenModel == null || (slider = weeklyPlanCustomizationScreenModel.getSlider()) == null) ? null : Double.valueOf(slider.getValue());
                if (dValueOf != null) {
                    dDoubleValue = dValueOf.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
            } else {
                dDoubleValue = dValueOf.doubleValue();
            }
            double d3 = dDoubleValue;
            C21956r c21956r2 = goalType != null ? new C21956r(goalType, d3, m62673c(weeklyPlanCustomizationScreenModel, (float) d3)) : null;
            if (c21956r2 != null) {
                arrayList.add(c21956r2);
            }
        }
        return arrayList;
    }
}
