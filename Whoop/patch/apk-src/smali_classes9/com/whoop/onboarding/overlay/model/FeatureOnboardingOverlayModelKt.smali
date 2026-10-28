.class public final Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a&\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0008*\u00020\u00038@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n*$\u0008\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a8\u0006\u000b"
    }
    d2 = {
        "FeatureOnboardingResponse",
        "",
        "",
        "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;",
        "modelForKey",
        "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingResponse;",
        "educationKey",
        "featureEducationType",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "getFeatureEducationType",
        "(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)Lcom/whoop/data/onboarding/FeatureEducationType;",
        "onboarding-story_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getFeatureEducationType(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)Lcom/whoop/data/onboarding/FeatureEducationType;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;->getFeatureEducationName()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lcom/whoop/data/onboarding/FeatureEducationType;->values()[Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final modelForKey(Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "educationKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    return-object p0
.end method
