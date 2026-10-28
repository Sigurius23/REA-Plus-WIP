.class public interface abstract Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;",
        "",
        "",
        "featureEducationType",
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "getFeatureEducation",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "getFeatureEducationOnboarding",
        "Lcom/whoop/educationModels/CompleteFeatureEducationBody;",
        "completeFeatureEducationBody",
        "Lpg3/v0;",
        "Ll83/a0;",
        "completeFeatureEducation",
        "(Lcom/whoop/educationModels/CompleteFeatureEducationBody;Lq83/d;)Ljava/lang/Object;",
        "onboarding-story-domain_release"
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
.method public abstract completeFeatureEducation(Lcom/whoop/educationModels/CompleteFeatureEducationBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/educationModels/CompleteFeatureEducationBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/educationModels/CompleteFeatureEducationBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "onboarding-service/v1/feature-education-state"
    .end annotation
.end method

.method public abstract getFeatureEducation(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "featureEducation"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/educationModels/FeatureEducationDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/features/educations/{featureEducation}"
    .end annotation
.end method

.method public abstract getFeatureEducationOnboarding(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "featureEducation"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/educationModels/FeatureEducationDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/features/educations/onboarding/{featureEducation}"
    .end annotation
.end method
