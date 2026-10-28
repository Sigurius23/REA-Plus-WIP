.class public interface abstract Lcom/whoop/pregnancy/api/PregnancyCoachingApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0004J\u001a\u0010\n\u001a\u00020\u00062\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0004\u00a8\u0006\u0012\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/pregnancy/api/PregnancyCoachingApi;",
        "",
        "Lcom/whoop/pregnancy/api/PregnancySettingsDto;",
        "getPregnancySettingsBff",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "togglePregnancyCoachingOff",
        "Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;",
        "dueDate",
        "updateDueDate",
        "(Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;",
        "getPregnancyCoachingOnboarding",
        "Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;",
        "onboardingDueDateSaved",
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "getPregnancyEducation",
        "pregnancy_release"
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
.method public abstract getPregnancyCoachingOnboarding(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/health-service/v1/pregnancy/onboarding/welcome"
    .end annotation
.end method

.method public abstract getPregnancyEducation(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/educationModels/FeatureEducationDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/features/educations/PREGNANCY_IN_APP"
    .end annotation
.end method

.method public abstract getPregnancySettingsBff(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/pregnancy/api/PregnancySettingsDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/health-service/v1/pregnancy/settings/bff"
    .end annotation
.end method

.method public abstract onboardingDueDateSaved(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/health-service/v1/pregnancy/onboarding/due-date-saved"
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
        value = "/health-service/v1/pregnancy/settings"
    .end annotation
.end method

.method public abstract updateDueDate(Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "/health-service/v1/pregnancy/settings"
    .end annotation
.end method
