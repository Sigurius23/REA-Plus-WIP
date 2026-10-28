.class public interface abstract Lcom/whoop/sage/domain/SageApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\tJ \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/sage/domain/SageApi;",
        "",
        "",
        "date",
        "Lcom/whoop/sage/domain/models/SageResponse;",
        "getSage",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;",
        "getSageOnboarding",
        "(Lq83/d;)Ljava/lang/Object;",
        "getSageManualInput",
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;",
        "body",
        "Lpg3/v0;",
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;",
        "saveSageOnboarding",
        "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;",
        "saveSageManualMeasurement",
        "(Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;Lq83/d;)Ljava/lang/Object;",
        "sage_release"
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
.method public abstract getSage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "date"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/sage/domain/models/SageResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "sage-service/v1/sage/bff"
    .end annotation
.end method

.method public abstract getSageManualInput(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "sage-service/v1/sage/manual/input"
    .end annotation
.end method

.method public abstract getSageOnboarding(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "sage-service/v1/sage/onboarding/questionnaire"
    .end annotation
.end method

.method public abstract saveSageManualMeasurement(Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "sage-service/v1/sage/manual"
    .end annotation
.end method

.method public abstract saveSageOnboarding(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "sage-service/v1/sage/onboarding"
    .end annotation
.end method
