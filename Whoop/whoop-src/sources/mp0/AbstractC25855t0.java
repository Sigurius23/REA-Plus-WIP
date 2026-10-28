package mp0;

import com.whoop.sleep.coach.data.network.model.FormattedTimeInBed;
import com.whoop.sleep.coach.data.network.model.OptimalEndpointsFormatted;
import com.whoop.sleep.coach.data.network.model.RecommendedTimeInBedFormatted;
import kp0.AbstractC22748o;
import kp0.C22737d;
import kp0.C22744k;
import kp0.C22745l;
import kp0.C22746m;
import kp0.C22750q;
import kp0.C22751r;
import np0.AbstractC27021n;
import np0.C27017j;
import np0.C27020m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mp0.t0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"", "isFeatureFlagEnabled", "Lnp0/n;", "wizardFlow", "Lnp0/m;", "wizardConductorViewState", "c", "(ZLnp0/n;Lnp0/m;)Z", "Lkp0/o;", "sleepGoalSetting", "Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;", "recommendedTimeInBedFormatted", "", "b", "(Lkp0/o;Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;)Ljava/lang/String;", "a", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25855t0 {
    /* JADX INFO: renamed from: a */
    public static final String m76378a(AbstractC22748o sleepGoalSetting, RecommendedTimeInBedFormatted recommendedTimeInBedFormatted) {
        OptimalEndpointsFormatted optimalEndpointsFormatted;
        OptimalEndpointsFormatted optimalEndpointsFormatted2;
        AbstractC22676k.m65750j(sleepGoalSetting, "sleepGoalSetting");
        AbstractC22676k.m65750j(recommendedTimeInBedFormatted, "recommendedTimeInBedFormatted");
        if (sleepGoalSetting.equals(C22737d.f89416z)) {
            OptimalEndpointsFormatted optimalEndpointsFormatted3 = recommendedTimeInBedFormatted.getGetBy().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted3 != null) {
                return optimalEndpointsFormatted3.getEnd();
            }
            return null;
        }
        if (sleepGoalSetting.equals(C22746m.f89477z)) {
            OptimalEndpointsFormatted optimalEndpointsFormatted4 = recommendedTimeInBedFormatted.getPerform().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted4 != null) {
                return optimalEndpointsFormatted4.getEnd();
            }
            return null;
        }
        if (sleepGoalSetting.equals(C22745l.f89475z)) {
            OptimalEndpointsFormatted optimalEndpointsFormatted5 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted5 != null) {
                return optimalEndpointsFormatted5.getEnd();
            }
            return null;
        }
        if ((sleepGoalSetting instanceof C22744k) || (sleepGoalSetting instanceof C22750q)) {
            FormattedTimeInBed optimizeSleep = recommendedTimeInBedFormatted.getOptimizeSleep();
            if (optimizeSleep == null || (optimalEndpointsFormatted = optimizeSleep.getOptimalEndpointsFormatted()) == null) {
                return null;
            }
            return optimalEndpointsFormatted.getEnd();
        }
        if (!(sleepGoalSetting instanceof C22751r)) {
            throw new NoWhenBranchMatchedException();
        }
        FormattedTimeInBed hoursOfSleep = recommendedTimeInBedFormatted.getHoursOfSleep();
        if (hoursOfSleep == null || (optimalEndpointsFormatted2 = hoursOfSleep.getOptimalEndpointsFormatted()) == null) {
            return null;
        }
        return optimalEndpointsFormatted2.getEnd();
    }

    /* JADX INFO: renamed from: b */
    public static final String m76379b(AbstractC22748o sleepGoalSetting, RecommendedTimeInBedFormatted recommendedTimeInBedFormatted) {
        OptimalEndpointsFormatted optimalEndpointsFormatted;
        OptimalEndpointsFormatted optimalEndpointsFormatted2;
        AbstractC22676k.m65750j(sleepGoalSetting, "sleepGoalSetting");
        AbstractC22676k.m65750j(recommendedTimeInBedFormatted, "recommendedTimeInBedFormatted");
        if (sleepGoalSetting.equals(C22737d.f89416z)) {
            OptimalEndpointsFormatted optimalEndpointsFormatted3 = recommendedTimeInBedFormatted.getGetBy().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted3 != null) {
                return optimalEndpointsFormatted3.getStart();
            }
            return null;
        }
        if (sleepGoalSetting.equals(C22746m.f89477z)) {
            OptimalEndpointsFormatted optimalEndpointsFormatted4 = recommendedTimeInBedFormatted.getPerform().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted4 != null) {
                return optimalEndpointsFormatted4.getStart();
            }
            return null;
        }
        if (sleepGoalSetting.equals(C22745l.f89475z)) {
            OptimalEndpointsFormatted optimalEndpointsFormatted5 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted5 != null) {
                return optimalEndpointsFormatted5.getStart();
            }
            return null;
        }
        if ((sleepGoalSetting instanceof C22744k) || (sleepGoalSetting instanceof C22750q)) {
            FormattedTimeInBed optimizeSleep = recommendedTimeInBedFormatted.getOptimizeSleep();
            if (optimizeSleep == null || (optimalEndpointsFormatted = optimizeSleep.getOptimalEndpointsFormatted()) == null) {
                return null;
            }
            return optimalEndpointsFormatted.getStart();
        }
        if (!(sleepGoalSetting instanceof C22751r)) {
            throw new NoWhenBranchMatchedException();
        }
        FormattedTimeInBed hoursOfSleep = recommendedTimeInBedFormatted.getHoursOfSleep();
        if (hoursOfSleep == null || (optimalEndpointsFormatted2 = hoursOfSleep.getOptimalEndpointsFormatted()) == null) {
            return null;
        }
        return optimalEndpointsFormatted2.getStart();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m76380c(boolean z4, AbstractC27021n wizardFlow, C27020m wizardConductorViewState) {
        AbstractC22676k.m65750j(wizardFlow, "wizardFlow");
        AbstractC22676k.m65750j(wizardConductorViewState, "wizardConductorViewState");
        return wizardFlow.equals(C27017j.f107718b) && z4;
    }
}
