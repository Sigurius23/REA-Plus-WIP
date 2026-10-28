package com.whoop.advancedlabs.domain;

import com.mapbox.common.HttpHeaders;
import com.whoop.advancedlabs.actionplan.domain.models.ActionPlanResponse;
import com.whoop.advancedlabs.domain.models.AdvancedLabsPaginatedTestHistory;
import com.whoop.advancedlabs.domain.models.AllRecordingsResponse;
import com.whoop.advancedlabs.domain.models.BiomarkerDetailsResponse;
import com.whoop.advancedlabs.domain.models.BiomarkerSummaryResponse;
import com.whoop.advancedlabs.domain.models.ClinicalInsightsResponse;
import com.whoop.advancedlabs.domain.models.ClinicalIntakeStatusResponse;
import com.whoop.advancedlabs.domain.models.EditBiomarkersResponse;
import com.whoop.advancedlabs.domain.models.FormContent;
import com.whoop.advancedlabs.domain.models.SchedulePrimerResponse;
import com.whoop.advancedlabs.domain.models.SchedulingFormResponse;
import com.whoop.advancedlabs.domain.models.SchedulingStepScreenModel;
import com.whoop.advancedlabs.domain.models.TestHistoryResponse;
import com.whoop.advancedlabs.domain.models.TestInputScreenResponse;
import com.whoop.advancedlabs.domain.models.TestResultsResponse;
import com.whoop.advancedlabs.domain.models.UpdateBiomarkersRequest;
import com.whoop.advancedlabs.domain.models.UpdateBiomarkersResponse;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextResponse;
import com.whoop.advancedlabs.mobilescheduling.domain.models.MobileSchedulingFormResponse;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.ConsentAction;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentRequest;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentResponse;
import com.whoop.advancedlabs.testupload.domain.models.TestUploadResponse;
import com.whoop.design.models.items.MenuItemModel;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ&\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001b\u001a\u00020\u001a2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0006J\u001a\u0010\u001d\u001a\u00020\u001a2\b\b\u0001\u0010\u001c\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b\u001f\u0010\tJ\u001a\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\u0006J\u0010\u0010#\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010\tJ\u001a\u0010%\u001a\u00020$2\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010\u0006J\u001a\u0010(\u001a\u00020'2\b\b\u0001\u0010&\u001a\u00020\u0002H§@¢\u0006\u0004\b(\u0010\u0006J\u001c\u0010*\u001a\u00020)2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b*\u0010\u0006J&\u0010-\u001a\u00020,2\b\b\u0001\u0010+\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b-\u0010\rJ\u001c\u0010/\u001a\u00020.2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b/\u0010\u0006J\u001c\u00101\u001a\u0002002\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b1\u0010\u0006J&\u00105\u001a\u0002042\b\b\u0001\u00102\u001a\u00020\u00022\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b5\u0010\rJ\u0010\u00107\u001a\u000206H§@¢\u0006\u0004\b7\u0010\tJ<\u0010;\u001a\u00020\u00162\b\b\u0001\u00108\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u00020\u00022\n\b\u0003\u00109\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b;\u0010<J\u001a\u0010>\u001a\u00020=2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\b>\u0010\u0006J\u001a\u0010?\u001a\u00020=2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\b?\u0010\u0006J\u0010\u0010A\u001a\u00020@H§@¢\u0006\u0004\bA\u0010\tJ$\u0010D\u001a\u00020C2\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020BH§@¢\u0006\u0004\bD\u0010EJ$\u0010F\u001a\u00020C2\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020BH§@¢\u0006\u0004\bF\u0010EJ\u001a\u0010G\u001a\u00020\u00162\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\bG\u0010\u0006J\u001a\u0010H\u001a\u00020\u00162\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\bH\u0010\u0006J\u001a\u0010J\u001a\u00020I2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\bJ\u0010\u0006J$\u0010L\u001a\u00020\u00162\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020KH§@¢\u0006\u0004\bL\u0010MJ\u001a\u0010O\u001a\u00020N2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\bO\u0010\u0006J\u001a\u0010Q\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020PH§@¢\u0006\u0004\bQ\u0010R¨\u0006SÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "", "", "biomarkerId", "Lcom/whoop/advancedlabs/domain/models/AllRecordingsResponse;", "getAllRecordings", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;", "getBiomarkerSummary", "(Lq83/d;)Ljava/lang/Object;", "nextToken", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "getBiomarkerDetails", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;", "consentAction", "testType", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;", "getMultiConsent", "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;", "request", "Ll83/a0;", "submitMultiConsent", "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lq83/d;)Ljava/lang/Object;", "testId", "Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;", "getClinicalInsights", "insightsId", "getInsightsDeepDive", "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;", "getSchedulePrimer", "Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;", "getTestResult", "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;", "getTestHistory", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "getTestHistoryPaginated", "testTokenId", "Lcom/whoop/advancedlabs/domain/models/ClinicalIntakeStatusResponse;", "getClinicalIntakeStatus", "Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;", "getActionPlan", "stepType", "Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;", "getSchedulingStep", "Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;", "getSchedulingForm", "Lcom/whoop/advancedlabs/mobilescheduling/domain/models/MobileSchedulingFormResponse;", "getMobileSchedulingForm", "location", HttpHeaders.DATE, "Lcom/whoop/advancedlabs/domain/models/FormContent;", "searchSchedulingLocations", "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;", "getTestUpload", "siteCode", "biomarkerTestId", "episodeId", "saveAppointment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "getEditBiomarkers", "getConfirmBiomarkers", "Lcom/whoop/design/models/items/MenuItemModel;", "getAdvancedLabsMoreMenuItem", "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;", "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersResponse;", "updateBiomarkers", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;Lq83/d;)Ljava/lang/Object;", "confirmBiomarkers", "deleteTest", "deleteTestAi", "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;", "getEditTestDetails", "Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;", "updateTestDetails", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;", "getHormonalContext", "Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;", "saveHormonalContext", "(Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;Lq83/d;)Ljava/lang/Object;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface AdvancedLabsApi {
    @InterfaceC37285p("advanced-labs-service/v1/upload/tests/{testId}/biomarkers")
    Object confirmBiomarkers(@InterfaceC37288s("testId") String str, @InterfaceC37270a UpdateBiomarkersRequest updateBiomarkersRequest, InterfaceC30057d<? super UpdateBiomarkersResponse> interfaceC30057d);

    @InterfaceC37271b("advanced-labs-service/v1/biomarker-tests/{testId}")
    Object deleteTest(@InterfaceC37288s("testId") String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37271b("advanced-labs-service/v1/upload/tests/{testId}")
    Object deleteTestAi(@InterfaceC37288s("testId") String str, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/action-plan")
    Object getActionPlan(@InterfaceC37289t("testId") String str, InterfaceC30057d<? super ActionPlanResponse> interfaceC30057d);

    @InterfaceC37275f("growth-content-service/v1/advanced-labs/more/menu-item")
    Object getAdvancedLabsMoreMenuItem(InterfaceC30057d<? super MenuItemModel> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/all_recordings/{biomarkerId}")
    Object getAllRecordings(@InterfaceC37288s("biomarkerId") String str, InterfaceC30057d<? super AllRecordingsResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/biomarkers/{biomarkerId}")
    Object getBiomarkerDetails(@InterfaceC37288s("biomarkerId") String str, @InterfaceC37289t("next_token") String str2, InterfaceC30057d<? super BiomarkerDetailsResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/biomarkers/summary")
    Object getBiomarkerSummary(InterfaceC30057d<? super BiomarkerSummaryResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/insights")
    Object getClinicalInsights(@InterfaceC37289t("testId") String str, InterfaceC30057d<? super ClinicalInsightsResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/clinical-intake/response/status")
    Object getClinicalIntakeStatus(@InterfaceC37289t("testTokenId") String str, InterfaceC30057d<? super ClinicalIntakeStatusResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/upload/tests/{testId}/biomarkers/confirm")
    Object getConfirmBiomarkers(@InterfaceC37288s("testId") String str, InterfaceC30057d<? super EditBiomarkersResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/tests/{testId}/biomarkers/edit")
    Object getEditBiomarkers(@InterfaceC37288s("testId") String str, InterfaceC30057d<? super EditBiomarkersResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/tests/{testId}/edit")
    Object getEditTestDetails(@InterfaceC37288s("testId") String str, InterfaceC30057d<? super TestInputScreenResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/hormonal-context")
    Object getHormonalContext(@InterfaceC37289t("testId") String str, InterfaceC30057d<? super HormonalContextResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/insights/deep-dives/{insightsId}")
    Object getInsightsDeepDive(@InterfaceC37288s("insightsId") String str, InterfaceC30057d<? super ClinicalInsightsResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v2/advanced-labs/scheduling/form")
    Object getMobileSchedulingForm(@InterfaceC37289t("testType") String str, InterfaceC30057d<? super MobileSchedulingFormResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/consent/{consentAction}")
    Object getMultiConsent(@InterfaceC37288s("consentAction") ConsentAction consentAction, @InterfaceC37289t("testType") String str, InterfaceC30057d<? super MultiConsentResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/primer")
    Object getSchedulePrimer(InterfaceC30057d<? super SchedulePrimerResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/scheduling/form")
    Object getSchedulingForm(@InterfaceC37289t("testType") String str, InterfaceC30057d<? super SchedulingFormResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/scheduling/step/{stepType}")
    Object getSchedulingStep(@InterfaceC37288s("stepType") String str, @InterfaceC37289t("testType") String str2, InterfaceC30057d<? super SchedulingStepScreenModel> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/tests/history")
    Object getTestHistory(InterfaceC30057d<? super TestHistoryResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/tests/history/paginated")
    Object getTestHistoryPaginated(@InterfaceC37289t("nextToken") String str, InterfaceC30057d<? super AdvancedLabsPaginatedTestHistory> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/tests/{testId}")
    Object getTestResult(@InterfaceC37288s("testId") String str, InterfaceC30057d<? super TestResultsResponse> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/upload")
    Object getTestUpload(InterfaceC30057d<? super TestUploadResponse> interfaceC30057d);

    @InterfaceC37284o("advanced-labs-service/v1/advanced-labs/scheduling/form/schedule")
    Object saveAppointment(@InterfaceC37289t("siteCode") String str, @InterfaceC37289t(HttpHeaders.DATE) String str2, @InterfaceC37289t("biomarkerTestId") String str3, @InterfaceC37289t("episodeId") String str4, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37285p("advanced-labs-service/v1/biomarker-test-hormonal-context")
    Object saveHormonalContext(@InterfaceC37270a HormonalContextSaveRequest hormonalContextSaveRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37275f("advanced-labs-service/v1/advanced-labs/scheduling/form/search")
    Object searchSchedulingLocations(@InterfaceC37289t("location") String str, @InterfaceC37289t(HttpHeaders.DATE) String str2, InterfaceC30057d<? super FormContent> interfaceC30057d);

    @InterfaceC37285p("advanced-labs-service/v1/advanced-labs/consent")
    Object submitMultiConsent(@InterfaceC37270a MultiConsentRequest multiConsentRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37285p("advanced-labs-service/v1/advanced-labs/tests/{testId}/biomarkers")
    Object updateBiomarkers(@InterfaceC37288s("testId") String str, @InterfaceC37270a UpdateBiomarkersRequest updateBiomarkersRequest, InterfaceC30057d<? super UpdateBiomarkersResponse> interfaceC30057d);

    @InterfaceC37285p("advanced-labs-service/v1/advanced-labs/tests/{testId}")
    Object updateTestDetails(@InterfaceC37288s("testId") String str, @InterfaceC37270a UpdateTestDetailsRequest updateTestDetailsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
