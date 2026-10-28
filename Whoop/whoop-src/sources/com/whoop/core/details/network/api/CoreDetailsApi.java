package com.whoop.core.details.network.api;

import com.whoop.core.details.network.model.ActivityScoreTypeResponse;
import com.whoop.core.details.network.model.CoreDetailsModel;
import com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel;
import com.whoop.core.details.network.model.sleep.SleepDetailsModel;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0006J \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u0006J\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0006J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0006J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0006J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0006¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/core/details/network/api/CoreDetailsApi;", "", "", "activityId", "Lcom/whoop/core/details/network/model/CoreDetailsModel;", "fetchCardioDetailsComponents", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "Ll83/a0;", "deleteCardioActivity", "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "fetchRecoveryDetailsComponents", "deleteRecoveryActivity", "Lcom/whoop/core/details/network/model/ActivityScoreTypeResponse;", "getActivityScore", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;", "fetchSleepDetails", "deleteSleep", "napToSleep", "upsertLinkWorkoutNotificationDismissalRecord", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface CoreDetailsApi {
    @InterfaceC37271b("core-details-bff/v1/cardio-details")
    Object deleteCardioActivity(@InterfaceC37289t("activityId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("core-details-bff/v1/recovery-details")
    Object deleteRecoveryActivity(@InterfaceC37289t("recoveryActivityId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("core-details-bff/v2/sleep-details/{activityId}")
    Object deleteSleep(@InterfaceC37288s("activityId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("core-details-bff/v1/cardio-details")
    Object fetchCardioDetailsComponents(@InterfaceC37289t("activityId") String str, InterfaceC30057d<? super CoreDetailsModel> interfaceC30057d);

    @InterfaceC37275f("core-details-bff/v2/recovery-details")
    Object fetchRecoveryDetailsComponents(@InterfaceC37289t("activityId") String str, InterfaceC30057d<? super RecoveryDetailsModel> interfaceC30057d);

    @InterfaceC37275f("core-details-bff/v2/sleep-details/{activityId}")
    Object fetchSleepDetails(@InterfaceC37288s("activityId") String str, InterfaceC30057d<? super SleepDetailsModel> interfaceC30057d);

    @InterfaceC37275f("core-details-bff/v1/activity-score-type")
    Object getActivityScore(@InterfaceC37289t("activityId") String str, InterfaceC30057d<? super ActivityScoreTypeResponse> interfaceC30057d);

    @InterfaceC37285p("core-details-bff/v2/sleep-details/nap-to-sleep/{activityId}")
    Object napToSleep(@InterfaceC37288s("activityId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("weightlifting-service/v1/link-workout-notification-dismissal/{activityId}")
    Object upsertLinkWorkoutNotificationDismissalRecord(@InterfaceC37288s("activityId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
