package com.whoop.weeklyplan.api;

import com.mapbox.common.HttpHeaders;
import com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.SavePresetPlan;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationResponse;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationResponseKotlinx;
import com.whoop.weeklyplan.hometile.domain.api.WeeklyPlanHometileResponse;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponseKotlinx;
import com.whoop.weeklyplan.hubandspoke.domain.api.SaveHubAndSpokeBody;
import com.whoop.weeklyplan.weeklyplan.domain.models.SummaryV2Model;
import java.util.List;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\t\u001a\u00020\b2\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0004\b\u001c\u0010\u001bJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0004\b\u001d\u0010\u001bJ4\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0004\b#\u0010\u001bJ\u001a\u0010&\u001a\u00020%2\b\b\u0001\u0010$\u001a\u00020\u0003H§@¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010(\u001a\u00020'2\b\b\u0001\u0010$\u001a\u00020\u0003H§@¢\u0006\u0004\b(\u0010\u001bJ4\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010*\u001a\u00020)2\b\b\u0001\u0010 \u001a\u00020\u001fH§@¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\b\u0001\u0010-\u001a\u00020\u0003H§@¢\u0006\u0004\b/\u0010\u001bJ\u001a\u00101\u001a\u0002002\b\b\u0001\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0004\b1\u0010\u001b¨\u00062À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/weeklyplan/api/WeeklyPlanApi;", "", "", "", HMSTrackSource.SCREEN, "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;", "customizeWeeklyPlanV2", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseKotlinx;", "customizeWeeklyPlanKotlinx", "planId", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;", "updateTargetsBody", "Lpg3/v0;", "Ll83/a0;", "confirmTargetStrainOrSleepV2", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;", "confirmTargetBehaviorsV2", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;", "confirmTargetActivitiesV2", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;Lq83/d;)Ljava/lang/Object;", "targetGoalType", "deleteStrainOrSleepGoalV2", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deleteActivityGoalV2", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deleteBehaviorGoalV2", "dismissSummary", "Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;", "", "migrateSmartAlarm", "savePresetPlan", "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;ZLq83/d;)Ljava/lang/Object;", "cancelPlan", "planName", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "getHubAndSpoke", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;", "getHubAndSpokeKotlinx", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;", "body", "saveHubAndSpoke", "(Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;ZLq83/d;)Ljava/lang/Object;", HttpHeaders.DATE, "Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;", "getHomeTileData", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;", "getSummary", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface WeeklyPlanApi {
    @InterfaceC37271b("progression-service/v1/weekly-plan/{planId}")
    Object cancelPlan(@InterfaceC37288s("planId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("progression-service/v2/weekly-plan/{planId}/goal/activity")
    Object confirmTargetActivitiesV2(@InterfaceC37288s("planId") String str, @InterfaceC37270a ConfirmTarget.ConfirmActivityTarget confirmActivityTarget, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("progression-service/v2/weekly-plan/{planId}/goal/behavior")
    Object confirmTargetBehaviorsV2(@InterfaceC37288s("planId") String str, @InterfaceC37270a ConfirmTarget.ConfirmBehaviorTarget confirmBehaviorTarget, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("progression-service/v2/weekly-plan/{planId}/goal/target")
    Object confirmTargetStrainOrSleepV2(@InterfaceC37288s("planId") String str, @InterfaceC37270a ConfirmTarget.ConfirmMetricTarget confirmMetricTarget, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("progression-service/v2/weekly-plan/setup")
    Object customizeWeeklyPlanKotlinx(@InterfaceC37289t("screens") List<String> list, InterfaceC30057d<? super WeeklyPlanCustomizationResponseKotlinx> interfaceC30057d);

    @InterfaceC37275f("progression-service/v2/weekly-plan/setup")
    Object customizeWeeklyPlanV2(@InterfaceC37289t("screens") List<String> list, InterfaceC30057d<? super WeeklyPlanCustomizationResponse> interfaceC30057d);

    @InterfaceC37271b("progression-service/v2/weekly-plan/{planId}/goal/activity")
    Object deleteActivityGoalV2(@InterfaceC37288s("planId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("progression-service/v2/weekly-plan/{planId}/goal/behavior")
    Object deleteBehaviorGoalV2(@InterfaceC37288s("planId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("progression-service/v2/weekly-plan/{planId}/goal/target/{targetGoalType}")
    Object deleteStrainOrSleepGoalV2(@InterfaceC37288s("planId") String str, @InterfaceC37288s("targetGoalType") String str2, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("progression-service/v1/weekly-plan/{planId}/summary")
    Object dismissSummary(@InterfaceC37288s("planId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("progression-service/v2/weekly-plan/home-tile/{date}")
    Object getHomeTileData(@InterfaceC37288s(HttpHeaders.DATE) String str, InterfaceC30057d<? super WeeklyPlanHometileResponse> interfaceC30057d);

    @InterfaceC37275f("progression-service/v2/weekly-plan/setup/overview/{planName}")
    Object getHubAndSpoke(@InterfaceC37288s("planName") String str, InterfaceC30057d<? super HubAndSpokeResponse> interfaceC30057d);

    @InterfaceC37275f("progression-service/v2/weekly-plan/setup/overview/{planName}")
    Object getHubAndSpokeKotlinx(@InterfaceC37288s("planName") String str, InterfaceC30057d<? super HubAndSpokeResponseKotlinx> interfaceC30057d);

    @InterfaceC37275f("progression-service/v2/weekly-plan/{planId}/summary")
    Object getSummary(@InterfaceC37288s("planId") String str, InterfaceC30057d<? super SummaryV2Model> interfaceC30057d);

    @InterfaceC37285p("progression-service/v2/weekly-plan/{planId}")
    Object saveHubAndSpoke(@InterfaceC37288s("planId") String str, @InterfaceC37270a SaveHubAndSpokeBody saveHubAndSpokeBody, @InterfaceC37289t("migrate_smart_alarm") boolean z4, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("progression-service/v1/weekly-plan/{planId}")
    Object savePresetPlan(@InterfaceC37288s("planId") String str, @InterfaceC37270a SavePresetPlan savePresetPlan, @InterfaceC37289t("migrate_smart_alarm") boolean z4, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
