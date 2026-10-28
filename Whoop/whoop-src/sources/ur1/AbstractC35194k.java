package ur1;

import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker;
import com.whoop.data.remote.domain.response.journal.TrackerInput;
import com.whoop.data.remote.domain.response.journal.WeeklyPlanGoal;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import tr1.C34098b;

/* JADX INFO: renamed from: ur1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ltr1/b;", "b", "(Ltr1/b;)Ltr1/b;", "", "c", "(Ltr1/b;)Z", "Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;", "d", "(Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;)Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35194k {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C34098b m111440b(C34098b c34098b) {
        JournalBehaviorTracker tracker;
        TrackerInput trackerInputCopy$default = TrackerInput.copy$default(c34098b.getValue(), null, 0, null, null, null, null, null, null, null, null, 542, null);
        if (m111441c(c34098b)) {
            JournalBehaviorTracker tracker2 = c34098b.getTracker();
            WeeklyPlanGoal weeklyPlanGoal = c34098b.getTracker().getWeeklyPlanGoal();
            tracker = tracker2.copy((49151 & 1) != 0 ? tracker2.id : 0, (49151 & 2) != 0 ? tracker2.description : null, (49151 & 4) != 0 ? tracker2.questionText : null, (49151 & 8) != 0 ? tracker2.title : null, (49151 & 16) != 0 ? tracker2.status : null, (49151 & 32) != 0 ? tracker2.sticky : false, (49151 & 64) != 0 ? tracker2.magnitude : null, (49151 & 128) != 0 ? tracker2.timeLabel : null, (49151 & 256) != 0 ? tracker2.category : null, (49151 & 512) != 0 ? tracker2.deprecated : null, (49151 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? tracker2.createdAt : 0.0d, (49151 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? tracker2.updatedAt : 0.0d, (49151 & 4096) != 0 ? tracker2.timeContextLabel : null, (49151 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? tracker2.questionType : null, (49151 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? tracker2.weeklyPlanGoal : weeklyPlanGoal != null ? m111442d(weeklyPlanGoal) : null, (49151 & 32768) != 0 ? tracker2.destination : null);
        } else {
            tracker = c34098b.getTracker();
        }
        return C34098b.m107783b(c34098b, tracker, trackerInputCopy$default, false, 4, null);
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m111441c(C34098b c34098b) {
        Boolean answeredYes = c34098b.getValue().getAnsweredYes();
        if (answeredYes == null) {
            return false;
        }
        boolean zBooleanValue = answeredYes.booleanValue();
        WeeklyPlanGoal weeklyPlanGoal = c34098b.getTracker().getWeeklyPlanGoal();
        return (weeklyPlanGoal != null ? weeklyPlanGoal.isAvoided() : false) ^ zBooleanValue;
    }

    /* JADX INFO: renamed from: d */
    private static final WeeklyPlanGoal m111442d(WeeklyPlanGoal weeklyPlanGoal) {
        CircularProgressIndicator circularProgressIndicatorCopy$default;
        CurrentProgressSteps currentProgressStepsCopy$default;
        CircularProgressIndicator circularProgressIndicator = weeklyPlanGoal.getCircularProgressIndicator();
        if (circularProgressIndicator != null) {
            CurrentProgressSteps currentProgressSteps = circularProgressIndicator.getCurrentProgressSteps();
            if (currentProgressSteps != null) {
                int currentStep = currentProgressSteps.getCurrentStep() - 1;
                currentProgressStepsCopy$default = CurrentProgressSteps.copy$default(currentProgressSteps, null, currentStep < 0 ? 0 : currentStep, 0, null, null, 29, null);
            } else {
                currentProgressStepsCopy$default = null;
            }
            circularProgressIndicatorCopy$default = CircularProgressIndicator.copy$default(circularProgressIndicator, null, currentProgressStepsCopy$default, 1, null);
        } else {
            circularProgressIndicatorCopy$default = null;
        }
        return WeeklyPlanGoal.copy$default(weeklyPlanGoal, circularProgressIndicatorCopy$default, false, 2, null);
    }
}
