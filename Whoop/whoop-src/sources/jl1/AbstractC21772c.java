package jl1;

import com.whoop.analytics.MetricEventModel;
import com.whoop.navigation.AchievementMilestoneUnlockScreenModel;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.GenericScreenModel;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.JournalScreenModel;
import com.whoop.navigation.MarketingConsentScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.StreakCelebrationScreenModel;
import com.whoop.navigation.WeeklyPlanSummaryScreenModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jl1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/e;", "action", "", "a", "(Lcom/whoop/navigation/e;)Ljava/lang/String;", "Lcom/whoop/navigation/GenericScreenModel;", "b", "(Lcom/whoop/navigation/GenericScreenModel;)Ljava/lang/String;", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21772c {
    /* JADX INFO: renamed from: a */
    public static final String m61573a(C9598e action) {
        String fingerprint;
        String strValueOf;
        AbstractC22676k.m65750j(action, "action");
        NavigationScreenModel parameters = action.getParameters();
        if (parameters instanceof JournalScreenModel) {
            return String.valueOf(((JournalScreenModel) parameters).getCycleId());
        }
        if (parameters instanceof AchievementMilestoneUnlockScreenModel) {
            String achievementType = ((AchievementMilestoneUnlockScreenModel) parameters).getAchievementType();
            return achievementType == null ? action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName() : achievementType;
        }
        if (parameters instanceof StreakCelebrationScreenModel) {
            String celebrationType = ((StreakCelebrationScreenModel) parameters).getCelebrationType();
            return celebrationType == null ? action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName() : celebrationType;
        }
        if (parameters instanceof WeeklyPlanSummaryScreenModel) {
            String planId = ((WeeklyPlanSummaryScreenModel) parameters).getPlanId();
            return planId.length() == 0 ? action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName() : planId;
        }
        if (parameters instanceof MarketingConsentScreenModel) {
            Integer version = ((MarketingConsentScreenModel) parameters).getVersion();
            return (version == null || (strValueOf = String.valueOf(version.intValue())) == null) ? action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName() : strValueOf;
        }
        if (parameters instanceof AiCoachChatScreenModel) {
            String fingerprint2 = ((AiCoachChatScreenModel) parameters).getFingerprint();
            return fingerprint2.length() == 0 ? action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName() : fingerprint2;
        }
        if (!(parameters instanceof HomeScreenModel)) {
            if (!(parameters instanceof GenericScreenModel)) {
                return action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName();
            }
            String strM61574b = m61574b((GenericScreenModel) parameters);
            return strM61574b.length() == 0 ? action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName() : strM61574b;
        }
        AiAction aiAction = ((HomeScreenModel) parameters).getAiAction();
        if (aiAction != null && (fingerprint = aiAction.getFingerprint()) != null) {
            if (fingerprint.length() <= 0) {
                fingerprint = null;
            }
            if (fingerprint != null) {
                return fingerprint;
            }
        }
        return action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName();
    }

    /* JADX INFO: renamed from: b */
    private static final String m61574b(GenericScreenModel genericScreenModel) {
        String featureName;
        MetricEventModel metricEvents = genericScreenModel.getMetricEvents();
        if (metricEvents != null && (featureName = metricEvents.getFeatureName()) != null) {
            if (featureName.length() <= 0) {
                featureName = null;
            }
            if (featureName != null) {
                return featureName;
            }
        }
        return genericScreenModel.getRequest().getPath();
    }
}
