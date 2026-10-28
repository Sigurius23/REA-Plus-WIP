package com.whoop.hormonalinsights.api;

import com.mapbox.common.HttpHeaders;
import com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsSaveRequest;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.CalendarTileModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogCalendarResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.LogPeriodRequest;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciCycleResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyDueDateSavedScreenDto;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyOnboardingDto;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseCoachingResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsScreenResponse;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingRequest;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingResponse;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumRequest;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumResponse;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.GenericSymptomsScreenResponse;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.PregnancyInsightsResponse;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsSettingsResponse;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J\u001c\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0006J$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0016\u0010\u0015J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0006J\u001a\u0010\u001a\u001a\u00020\u00132\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H§@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b \u0010\u000fJ$\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0004\b#\u0010\u000fJ \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u00020$H§@¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H§@¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010*\u001a\u00020)H§@¢\u0006\u0004\b*\u0010\u001dJ\u001c\u0010-\u001a\u00020,2\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b-\u0010\u0006J\u0010\u0010/\u001a\u00020.H§@¢\u0006\u0004\b/\u0010\u001dJ \u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u000200H§@¢\u0006\u0004\b1\u00102J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H§@¢\u0006\u0004\b3\u0010\u001dJ \u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u000204H§@¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207H§@¢\u0006\u0004\b8\u0010\u001dJ\u0010\u0010:\u001a\u000209H§@¢\u0006\u0004\b:\u0010\u001dJ \u0010<\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u00020;H§@¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>H§@¢\u0006\u0004\b?\u0010\u001dJ \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u00020@H§@¢\u0006\u0004\bA\u0010BJ \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\bC\u0010\u0006J \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u00020DH§@¢\u0006\u0004\bE\u0010FJ*\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010G\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020HH§@¢\u0006\u0004\bI\u0010JJ \u0010L\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0011\u001a\u00020KH§@¢\u0006\u0004\bL\u0010M¨\u0006NÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "", "", "localDate", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;", "getPregnancyInsights", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "id", "getPregnancyInsightsById", "pregnancyId", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "getPregnancySymptoms", "type", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;", "getPregnancyPostPartum", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;", "body", "Lpg3/v0;", "Ll83/a0;", "savePregnancy", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lq83/d;)Ljava/lang/Object;", "updatePregnancy", "deletePregnancy", "Lcom/whoop/hormonalinsights/api/EnablePregnancyCoachingBody;", "dueDate", "updateDueDate", "(Lcom/whoop/hormonalinsights/api/EnablePregnancyCoachingBody;Lq83/d;)Ljava/lang/Object;", "togglePregnancyCoachingOff", "(Lq83/d;)Ljava/lang/Object;", "selectedDate", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;", "getMciOverviewCalendar", "source", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;", "getLogPeriodCalendar", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;", "logPeriod", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;", "getPhaseCoaching", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "getSymptomsScreen", "feature", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;", "getHormonalOnboarding", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;", "getHormonalSettings", "Lcom/whoop/hormonalinsights/api/HormonalSettingsRequest;", "updateSettings", "(Lcom/whoop/hormonalinsights/api/HormonalSettingsRequest;Lq83/d;)Ljava/lang/Object;", "endContraception", "Lcom/whoop/hormonalinsights/api/ToggleCycleTrendsOverlayRequest;", "toggleCycleTrendsOverlay", "(Lcom/whoop/hormonalinsights/api/ToggleCycleTrendsOverlayRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;", "getMciPregnancyOnboarding", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;", "getMciPregnancyDueDateSavedScreen", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;", "saveMciSurvey", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;", "getCycles", "Lcom/whoop/hormonalinsights/api/HideCycleRequest;", "hideCycle", "(Lcom/whoop/hormonalinsights/api/HideCycleRequest;Lq83/d;)Ljava/lang/Object;", "unhideCycle", "Lcom/whoop/hormonalinsights/api/DismissBody;", "dismissRequest", "(Lcom/whoop/hormonalinsights/api/DismissBody;Lq83/d;)Ljava/lang/Object;", "requestDate", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;", "saveSymptoms", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/hormonalinsights/api/UpdateGoalsRequest;", "updateGoals", "(Lcom/whoop/hormonalinsights/api/UpdateGoalsRequest;Lq83/d;)Ljava/lang/Object;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface HormonalInsightsApi {
    @InterfaceC37271b("health-service/v1/pregnancy/settings/{id}")
    Object deletePregnancy(@InterfaceC37288s("id") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("user-preferences-service/v1/components/dismissals")
    Object dismissRequest(@InterfaceC37270a DismissBody dismissBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("health-service/v1/hormonal-insights/settings/mci")
    Object endContraception(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/menstrual-cycle-insights/cycles")
    Object getCycles(InterfaceC30057d<? super MciCycleResponse> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/hormonal-insights/onboarding")
    Object getHormonalOnboarding(@InterfaceC37289t("feature") String str, InterfaceC30057d<? super MciOnboardingResponse> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/hormonal-insights/settings")
    Object getHormonalSettings(InterfaceC30057d<? super HormonalInsightsSettingsResponse> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/menstrual-cycle-insights/cycles/edit")
    Object getLogPeriodCalendar(@InterfaceC37289t("localDate") String str, @InterfaceC37289t("source") String str2, InterfaceC30057d<? super LogCalendarResponse> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/menstrual-cycle-insights/calendar")
    Object getMciOverviewCalendar(@InterfaceC37289t(HttpHeaders.DATE) String str, @InterfaceC37289t("selectedDate") String str2, InterfaceC30057d<? super CalendarTileModel> interfaceC30057d);

    @InterfaceC37275f("health-service/v1/pregnancy/onboarding/due-date-saved")
    Object getMciPregnancyDueDateSavedScreen(InterfaceC30057d<? super MciPregnancyDueDateSavedScreenDto> interfaceC30057d);

    @InterfaceC37275f("health-service/v1/pregnancy/onboarding/welcome")
    Object getMciPregnancyOnboarding(InterfaceC30057d<? super MciPregnancyOnboardingDto> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/menstrual-cycle-insights/deep-dives")
    Object getPhaseCoaching(InterfaceC30057d<? super PhaseCoachingResponse> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/pregnancy/screen")
    Object getPregnancyInsights(@InterfaceC37289t("localDate") String str, InterfaceC30057d<? super PregnancyInsightsResponse> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/pregnancy/{id}")
    Object getPregnancyInsightsById(@InterfaceC37288s("id") String str, InterfaceC30057d<? super PregnancyInsightsResponse> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/pregnancy/edit")
    Object getPregnancyPostPartum(@InterfaceC37289t("type") String str, @InterfaceC37289t("pregnancyId") String str2, InterfaceC30057d<? super PostPartumResponse> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/pregnancy/symptoms")
    Object getPregnancySymptoms(@InterfaceC37289t("pregnancyId") String str, InterfaceC30057d<? super GenericSymptomsScreenResponse> interfaceC30057d);

    @InterfaceC37275f("womens-health-service/v1/menstrual-cycle-insights/symptoms")
    Object getSymptomsScreen(InterfaceC30057d<? super SymptomsScreenResponse> interfaceC30057d);

    @InterfaceC37284o("health-service/v1/mci/cycles/hidden")
    Object hideCycle(@InterfaceC37270a HideCycleRequest hideCycleRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("womens-health-service/v1/menstrual-cycle-insights/log")
    Object logPeriod(@InterfaceC37270a LogPeriodRequest logPeriodRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("health-service/v1/hormonal-insights/settings/mci/survey")
    Object saveMciSurvey(@InterfaceC37270a MciOnboardingRequest mciOnboardingRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("womens-health-service/v1/pregnancy/{id}")
    Object savePregnancy(@InterfaceC37288s("id") String str, @InterfaceC37270a PostPartumRequest postPartumRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("womens-health-service/v1/symptom-insights/log/symptoms")
    Object saveSymptoms(@InterfaceC37289t("requestDate") String str, @InterfaceC37270a LogSymptomsSaveRequest logSymptomsSaveRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("health-service/v1/hormonal-insights/settings/mci/overlay")
    Object toggleCycleTrendsOverlay(@InterfaceC37270a ToggleCycleTrendsOverlayRequest toggleCycleTrendsOverlayRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("health-service/v1/pregnancy/settings")
    Object togglePregnancyCoachingOff(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("health-service/v1/mci/cycles/hidden/{id}")
    Object unhideCycle(@InterfaceC37288s("id") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("health-service/v1/pregnancy/settings")
    Object updateDueDate(@InterfaceC37270a EnablePregnancyCoachingBody enablePregnancyCoachingBody, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37285p("health-service/v1/hormonal-insights/settings/hormonal-goals")
    Object updateGoals(@InterfaceC37270a UpdateGoalsRequest updateGoalsRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37283n("health-service/v1/pregnancy/settings/{id}/delivery")
    Object updatePregnancy(@InterfaceC37288s("id") String str, @InterfaceC37270a PostPartumRequest postPartumRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("health-service/v1/hormonal-insights/settings/mci")
    Object updateSettings(@InterfaceC37270a HormonalSettingsRequest hormonalSettingsRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
