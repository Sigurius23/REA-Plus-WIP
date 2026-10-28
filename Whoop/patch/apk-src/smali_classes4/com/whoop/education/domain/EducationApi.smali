.class public interface abstract Lcom/whoop/education/domain/EducationApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\u0006J$\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\t\u001a\u00020\u00022\u0008\u0008\u0003\u0010\n\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/education/domain/EducationApi;",
        "",
        "",
        "featureEducationPath",
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "getEducation",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "featureEducationType",
        "getEducationUnauthed",
        "zoneId",
        "cta",
        "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
        "getCommunityEducationCarousel",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/educationModels/CompleteFeatureEducationBody;",
        "completeFeatureEducationBody",
        "Lpg3/v0;",
        "Ll83/a0;",
        "completeFeatureEducation",
        "(Lcom/whoop/educationModels/CompleteFeatureEducationBody;Lq83/d;)Ljava/lang/Object;",
        "education_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/whoop/education/domain/EducationApi;Ljava/lang/String;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p2, "MORE"

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/whoop/education/domain/EducationApi;->getCommunityEducationCarousel(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getCommunityEducationCarousel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


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

.method public abstract getCommunityEducationCarousel(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "zoneId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "cta"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/learn-more-carousel/bff/community"
    .end annotation
.end method

.method public abstract getEducation(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "featureEducationPath"
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
        value = "onboarding-service/v1/features/educations/{featureEducationPath}"
    .end annotation
.end method

.method public abstract getEducationUnauthed(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
