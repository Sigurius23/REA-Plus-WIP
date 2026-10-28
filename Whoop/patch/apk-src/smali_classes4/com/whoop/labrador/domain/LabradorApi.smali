.class public interface abstract Lcom/whoop/labrador/domain/LabradorApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J \u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u0004J \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/labrador/domain/LabradorApi;",
        "",
        "Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;",
        "getLabradorAboutScreen",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse;",
        "getLabradorRegistrationScreen",
        "Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "updateLabradorReadingSymptoms",
        "(Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;",
        "getLabradorEligibilitySetupScreen",
        "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;",
        "saveEligibility",
        "(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;",
        "updateDetailsSymptomsAndNotes",
        "(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Lq83/d;)Ljava/lang/Object;",
        "labrador_release"
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
.method public abstract getLabradorAboutScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ecg-service/v1/ecg/about"
    .end annotation
.end method

.method public abstract getLabradorEligibilitySetupScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ecg-service/v1/termsofuse"
    .end annotation
.end method

.method public abstract getLabradorRegistrationScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ecg-service/v1/ecg/regulatory"
    .end annotation
.end method

.method public abstract saveEligibility(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "ecg-service/v1/ecg/setup"
    .end annotation
.end method

.method public abstract updateDetailsSymptomsAndNotes(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "ecg-service/v1/ecg/readings/notesAndSymptoms"
    .end annotation
.end method

.method public abstract updateLabradorReadingSymptoms(Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ecg-service/v1/ecg/readings"
    .end annotation
.end method
