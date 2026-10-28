.class public interface abstract Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00cc\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ&\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001c\u0010\u001b\u001a\u00020\u001a2\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u0006J\u001a\u0010\u001d\u001a\u00020\u001a2\u0008\u0008\u0001\u0010\u001c\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u001d\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0004\u0008\u001f\u0010\tJ\u001a\u0010!\u001a\u00020 2\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008!\u0010\u0006J\u0010\u0010#\u001a\u00020\"H\u00a7@\u00a2\u0006\u0004\u0008#\u0010\tJ\u001a\u0010%\u001a\u00020$2\u0008\u0008\u0001\u0010\n\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008%\u0010\u0006J\u001a\u0010(\u001a\u00020\'2\u0008\u0008\u0001\u0010&\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008(\u0010\u0006J\u001c\u0010*\u001a\u00020)2\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008*\u0010\u0006J&\u0010-\u001a\u00020,2\u0008\u0008\u0001\u0010+\u001a\u00020\u00022\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008-\u0010\rJ\u001c\u0010/\u001a\u00020.2\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008/\u0010\u0006J\u001c\u00101\u001a\u0002002\n\u0008\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u00081\u0010\u0006J&\u00105\u001a\u0002042\u0008\u0008\u0001\u00102\u001a\u00020\u00022\n\u0008\u0003\u00103\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u00085\u0010\rJ\u0010\u00107\u001a\u000206H\u00a7@\u00a2\u0006\u0004\u00087\u0010\tJ<\u0010;\u001a\u00020\u00162\u0008\u0008\u0001\u00108\u001a\u00020\u00022\u0008\u0008\u0001\u00103\u001a\u00020\u00022\n\u0008\u0003\u00109\u001a\u0004\u0018\u00010\u00022\n\u0008\u0003\u0010:\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008;\u0010<J\u001a\u0010>\u001a\u00020=2\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008>\u0010\u0006J\u001a\u0010?\u001a\u00020=2\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008?\u0010\u0006J\u0010\u0010A\u001a\u00020@H\u00a7@\u00a2\u0006\u0004\u0008A\u0010\tJ$\u0010D\u001a\u00020C2\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0015\u001a\u00020BH\u00a7@\u00a2\u0006\u0004\u0008D\u0010EJ$\u0010F\u001a\u00020C2\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0015\u001a\u00020BH\u00a7@\u00a2\u0006\u0004\u0008F\u0010EJ\u001a\u0010G\u001a\u00020\u00162\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008G\u0010\u0006J\u001a\u0010H\u001a\u00020\u00162\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008H\u0010\u0006J\u001a\u0010J\u001a\u00020I2\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008J\u0010\u0006J$\u0010L\u001a\u00020\u00162\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0015\u001a\u00020KH\u00a7@\u00a2\u0006\u0004\u0008L\u0010MJ\u001a\u0010O\u001a\u00020N2\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008O\u0010\u0006J\u001a\u0010Q\u001a\u00020\u00162\u0008\u0008\u0001\u0010\u0015\u001a\u00020PH\u00a7@\u00a2\u0006\u0004\u0008Q\u0010R\u00a8\u0006S\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "",
        "",
        "biomarkerId",
        "Lcom/whoop/advancedlabs/domain/models/AllRecordingsResponse;",
        "getAllRecordings",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;",
        "getBiomarkerSummary",
        "(Lq83/d;)Ljava/lang/Object;",
        "nextToken",
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
        "getBiomarkerDetails",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;",
        "consentAction",
        "testType",
        "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;",
        "getMultiConsent",
        "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;",
        "request",
        "Ll83/a0;",
        "submitMultiConsent",
        "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lq83/d;)Ljava/lang/Object;",
        "testId",
        "Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;",
        "getClinicalInsights",
        "insightsId",
        "getInsightsDeepDive",
        "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;",
        "getSchedulePrimer",
        "Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;",
        "getTestResult",
        "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;",
        "getTestHistory",
        "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;",
        "getTestHistoryPaginated",
        "testTokenId",
        "Lcom/whoop/advancedlabs/domain/models/ClinicalIntakeStatusResponse;",
        "getClinicalIntakeStatus",
        "Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;",
        "getActionPlan",
        "stepType",
        "Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;",
        "getSchedulingStep",
        "Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;",
        "getSchedulingForm",
        "Lcom/whoop/advancedlabs/mobilescheduling/domain/models/MobileSchedulingFormResponse;",
        "getMobileSchedulingForm",
        "location",
        "date",
        "Lcom/whoop/advancedlabs/domain/models/FormContent;",
        "searchSchedulingLocations",
        "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;",
        "getTestUpload",
        "siteCode",
        "biomarkerTestId",
        "episodeId",
        "saveAppointment",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;",
        "getEditBiomarkers",
        "getConfirmBiomarkers",
        "Lcom/whoop/design/models/items/MenuItemModel;",
        "getAdvancedLabsMoreMenuItem",
        "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;",
        "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersResponse;",
        "updateBiomarkers",
        "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;Lq83/d;)Ljava/lang/Object;",
        "confirmBiomarkers",
        "deleteTest",
        "deleteTestAi",
        "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;",
        "getEditTestDetails",
        "Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;",
        "updateTestDetails",
        "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;",
        "getHormonalContext",
        "Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;",
        "saveHormonalContext",
        "(Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;Lq83/d;)Ljava/lang/Object;",
        "advanced-labs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract confirmBiomarkers(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "testId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "advanced-labs-service/v1/upload/tests/{testId}/biomarkers"
    .end annotation
.end method

.method public abstract deleteTest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "testId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "advanced-labs-service/v1/biomarker-tests/{testId}"
    .end annotation
.end method

.method public abstract deleteTestAi(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "testId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "advanced-labs-service/v1/upload/tests/{testId}"
    .end annotation
.end method

.method public abstract getActionPlan(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "testId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/actionplan/domain/models/ActionPlanResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/action-plan"
    .end annotation
.end method

.method public abstract getAdvancedLabsMoreMenuItem(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/design/models/items/MenuItemModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "growth-content-service/v1/advanced-labs/more/menu-item"
    .end annotation
.end method

.method public abstract getAllRecordings(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "biomarkerId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/AllRecordingsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/all_recordings/{biomarkerId}"
    .end annotation
.end method

.method public abstract getBiomarkerDetails(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "biomarkerId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "next_token"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/biomarkers/{biomarkerId}"
    .end annotation
.end method

.method public abstract getBiomarkerSummary(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/BiomarkerSummaryResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/biomarkers/summary"
    .end annotation
.end method

.method public abstract getClinicalInsights(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "testId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/insights"
    .end annotation
.end method

.method public abstract getClinicalIntakeStatus(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "testTokenId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/ClinicalIntakeStatusResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/clinical-intake/response/status"
    .end annotation
.end method

.method public abstract getConfirmBiomarkers(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "testId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/upload/tests/{testId}/biomarkers/confirm"
    .end annotation
.end method

.method public abstract getEditBiomarkers(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "testId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/tests/{testId}/biomarkers/edit"
    .end annotation
.end method

.method public abstract getEditTestDetails(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "testId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/tests/{testId}/edit"
    .end annotation
.end method

.method public abstract getHormonalContext(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "testId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/hormonal-context"
    .end annotation
.end method

.method public abstract getInsightsDeepDive(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "insightsId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/insights/deep-dives/{insightsId}"
    .end annotation
.end method

.method public abstract getMobileSchedulingForm(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "testType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/mobilescheduling/domain/models/MobileSchedulingFormResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v2/advanced-labs/scheduling/form"
    .end annotation
.end method

.method public abstract getMultiConsent(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;
        .annotation runtime Lwg3/s;
            value = "consentAction"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "testType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/consent/{consentAction}"
    .end annotation
.end method

.method public abstract getSchedulePrimer(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/primer"
    .end annotation
.end method

.method public abstract getSchedulingForm(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "testType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/scheduling/form"
    .end annotation
.end method

.method public abstract getSchedulingStep(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "stepType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "testType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/scheduling/step/{stepType}"
    .end annotation
.end method

.method public abstract getTestHistory(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/tests/history"
    .end annotation
.end method

.method public abstract getTestHistoryPaginated(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "nextToken"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/tests/history/paginated"
    .end annotation
.end method

.method public abstract getTestResult(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "testId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/tests/{testId}"
    .end annotation
.end method

.method public abstract getTestUpload(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/upload"
    .end annotation
.end method

.method public abstract saveAppointment(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "siteCode"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "date"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "biomarkerTestId"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "episodeId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "advanced-labs-service/v1/advanced-labs/scheduling/form/schedule"
    .end annotation
.end method

.method public abstract saveHormonalContext(Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/domain/HormonalContextSaveRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "advanced-labs-service/v1/biomarker-test-hormonal-context"
    .end annotation
.end method

.method public abstract searchSchedulingLocations(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "location"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "date"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/FormContent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "advanced-labs-service/v1/advanced-labs/scheduling/form/search"
    .end annotation
.end method

.method public abstract submitMultiConsent(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "advanced-labs-service/v1/advanced-labs/consent"
    .end annotation
.end method

.method public abstract updateBiomarkers(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "testId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/advancedlabs/domain/models/UpdateBiomarkersResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "advanced-labs-service/v1/advanced-labs/tests/{testId}/biomarkers"
    .end annotation
.end method

.method public abstract updateTestDetails(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "testId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/UpdateTestDetailsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "advanced-labs-service/v1/advanced-labs/tests/{testId}"
    .end annotation
.end method
