.class public interface abstract Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J\u001c\u0010\u000b\u001a\u00020\n2\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u0006J$\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\t\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ*\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J*\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J \u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0006J\u001a\u0010\u001a\u001a\u00020\u00132\u0008\u0008\u0001\u0010\u0019\u001a\u00020\u0018H\u00a7@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ&\u0010 \u001a\u00020\u001f2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008 \u0010\u000fJ$\u0010#\u001a\u00020\"2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010!\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008#\u0010\u000fJ \u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0011\u001a\u00020$H\u00a7@\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010(\u001a\u00020\'H\u00a7@\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010*\u001a\u00020)H\u00a7@\u00a2\u0006\u0004\u0008*\u0010\u001dJ\u001c\u0010-\u001a\u00020,2\n\u0008\u0001\u0010+\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008-\u0010\u0006J\u0010\u0010/\u001a\u00020.H\u00a7@\u00a2\u0006\u0004\u0008/\u0010\u001dJ \u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0011\u001a\u000200H\u00a7@\u00a2\u0006\u0004\u00081\u00102J\u0016\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00a7@\u00a2\u0006\u0004\u00083\u0010\u001dJ \u00105\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0011\u001a\u000204H\u00a7@\u00a2\u0006\u0004\u00085\u00106J\u0010\u00108\u001a\u000207H\u00a7@\u00a2\u0006\u0004\u00088\u0010\u001dJ\u0010\u0010:\u001a\u000209H\u00a7@\u00a2\u0006\u0004\u0008:\u0010\u001dJ \u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0011\u001a\u00020;H\u00a7@\u00a2\u0006\u0004\u0008<\u0010=J\u0010\u0010?\u001a\u00020>H\u00a7@\u00a2\u0006\u0004\u0008?\u0010\u001dJ \u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0011\u001a\u00020@H\u00a7@\u00a2\u0006\u0004\u0008A\u0010BJ \u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008C\u0010\u0006J \u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0011\u001a\u00020DH\u00a7@\u00a2\u0006\u0004\u0008E\u0010FJ*\u0010I\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010G\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0011\u001a\u00020HH\u00a7@\u00a2\u0006\u0004\u0008I\u0010JJ \u0010L\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0008\u0008\u0001\u0010\u0011\u001a\u00020KH\u00a7@\u00a2\u0006\u0004\u0008L\u0010M\u00a8\u0006N\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;",
        "",
        "",
        "localDate",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;",
        "getPregnancyInsights",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "id",
        "getPregnancyInsightsById",
        "pregnancyId",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;",
        "getPregnancySymptoms",
        "type",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;",
        "getPregnancyPostPartum",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "savePregnancy",
        "(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lq83/d;)Ljava/lang/Object;",
        "updatePregnancy",
        "deletePregnancy",
        "Lcom/whoop/hormonalinsights/api/EnablePregnancyCoachingBody;",
        "dueDate",
        "updateDueDate",
        "(Lcom/whoop/hormonalinsights/api/EnablePregnancyCoachingBody;Lq83/d;)Ljava/lang/Object;",
        "togglePregnancyCoachingOff",
        "(Lq83/d;)Ljava/lang/Object;",
        "selectedDate",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;",
        "getMciOverviewCalendar",
        "source",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;",
        "getLogPeriodCalendar",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;",
        "logPeriod",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;",
        "getPhaseCoaching",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;",
        "getSymptomsScreen",
        "feature",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;",
        "getHormonalOnboarding",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;",
        "getHormonalSettings",
        "Lcom/whoop/hormonalinsights/api/HormonalSettingsRequest;",
        "updateSettings",
        "(Lcom/whoop/hormonalinsights/api/HormonalSettingsRequest;Lq83/d;)Ljava/lang/Object;",
        "endContraception",
        "Lcom/whoop/hormonalinsights/api/ToggleCycleTrendsOverlayRequest;",
        "toggleCycleTrendsOverlay",
        "(Lcom/whoop/hormonalinsights/api/ToggleCycleTrendsOverlayRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;",
        "getMciPregnancyOnboarding",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;",
        "getMciPregnancyDueDateSavedScreen",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;",
        "saveMciSurvey",
        "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;",
        "getCycles",
        "Lcom/whoop/hormonalinsights/api/HideCycleRequest;",
        "hideCycle",
        "(Lcom/whoop/hormonalinsights/api/HideCycleRequest;Lq83/d;)Ljava/lang/Object;",
        "unhideCycle",
        "Lcom/whoop/hormonalinsights/api/DismissBody;",
        "dismissRequest",
        "(Lcom/whoop/hormonalinsights/api/DismissBody;Lq83/d;)Ljava/lang/Object;",
        "requestDate",
        "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;",
        "saveSymptoms",
        "(Ljava/lang/String;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/hormonalinsights/api/UpdateGoalsRequest;",
        "updateGoals",
        "(Lcom/whoop/hormonalinsights/api/UpdateGoalsRequest;Lq83/d;)Ljava/lang/Object;",
        "hormonal-insights_release"
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
.method public abstract deletePregnancy(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "health-service/v1/pregnancy/settings/{id}"
    .end annotation
.end method

.method public abstract dismissRequest(Lcom/whoop/hormonalinsights/api/DismissBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/hormonalinsights/api/DismissBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/api/DismissBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "user-preferences-service/v1/components/dismissals"
    .end annotation
.end method

.method public abstract endContraception(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "health-service/v1/hormonal-insights/settings/mci"
    .end annotation
.end method

.method public abstract getCycles(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/menstrual-cycle-insights/cycles"
    .end annotation
.end method

.method public abstract getHormonalOnboarding(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "feature"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/hormonal-insights/onboarding"
    .end annotation
.end method

.method public abstract getHormonalSettings(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/hormonal-insights/settings"
    .end annotation
.end method

.method public abstract getLogPeriodCalendar(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "localDate"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "source"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/menstrual-cycle-insights/cycles/edit"
    .end annotation
.end method

.method public abstract getMciOverviewCalendar(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "date"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "selectedDate"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/menstrual-cycle-insights/calendar"
    .end annotation
.end method

.method public abstract getMciPregnancyDueDateSavedScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "health-service/v1/pregnancy/onboarding/due-date-saved"
    .end annotation
.end method

.method public abstract getMciPregnancyOnboarding(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "health-service/v1/pregnancy/onboarding/welcome"
    .end annotation
.end method

.method public abstract getPhaseCoaching(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/menstrual-cycle-insights/deep-dives"
    .end annotation
.end method

.method public abstract getPregnancyInsights(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "localDate"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/pregnancy/screen"
    .end annotation
.end method

.method public abstract getPregnancyInsightsById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/pregnancy/{id}"
    .end annotation
.end method

.method public abstract getPregnancyPostPartum(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "type"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "pregnancyId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/pregnancy/edit"
    .end annotation
.end method

.method public abstract getPregnancySymptoms(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "pregnancyId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/pregnancy/symptoms"
    .end annotation
.end method

.method public abstract getSymptomsScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "womens-health-service/v1/menstrual-cycle-insights/symptoms"
    .end annotation
.end method

.method public abstract hideCycle(Lcom/whoop/hormonalinsights/api/HideCycleRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/hormonalinsights/api/HideCycleRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/api/HideCycleRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "health-service/v1/mci/cycles/hidden"
    .end annotation
.end method

.method public abstract logPeriod(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogPeriodRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "womens-health-service/v1/menstrual-cycle-insights/log"
    .end annotation
.end method

.method public abstract saveMciSurvey(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "health-service/v1/hormonal-insights/settings/mci/survey"
    .end annotation
.end method

.method public abstract savePregnancy(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "womens-health-service/v1/pregnancy/{id}"
    .end annotation
.end method

.method public abstract saveSymptoms(Ljava/lang/String;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "requestDate"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsSaveRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "womens-health-service/v1/symptom-insights/log/symptoms"
    .end annotation
.end method

.method public abstract toggleCycleTrendsOverlay(Lcom/whoop/hormonalinsights/api/ToggleCycleTrendsOverlayRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/hormonalinsights/api/ToggleCycleTrendsOverlayRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/api/ToggleCycleTrendsOverlayRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "health-service/v1/hormonal-insights/settings/mci/overlay"
    .end annotation
.end method

.method public abstract togglePregnancyCoachingOff(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "health-service/v1/pregnancy/settings"
    .end annotation
.end method

.method public abstract unhideCycle(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "health-service/v1/mci/cycles/hidden/{id}"
    .end annotation
.end method

.method public abstract updateDueDate(Lcom/whoop/hormonalinsights/api/EnablePregnancyCoachingBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/hormonalinsights/api/EnablePregnancyCoachingBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/api/EnablePregnancyCoachingBody;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "health-service/v1/pregnancy/settings"
    .end annotation
.end method

.method public abstract updateGoals(Lcom/whoop/hormonalinsights/api/UpdateGoalsRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/hormonalinsights/api/UpdateGoalsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/api/UpdateGoalsRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "health-service/v1/hormonal-insights/settings/hormonal-goals"
    .end annotation
.end method

.method public abstract updatePregnancy(Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/n;
        value = "health-service/v1/pregnancy/settings/{id}/delivery"
    .end annotation
.end method

.method public abstract updateSettings(Lcom/whoop/hormonalinsights/api/HormonalSettingsRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/hormonalinsights/api/HormonalSettingsRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/api/HormonalSettingsRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "health-service/v1/hormonal-insights/settings/mci"
    .end annotation
.end method
